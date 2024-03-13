import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {
  private UserRepository userRepository;
  @BeforeEach
  public void setUp() {
    this.userRepository = new UserRepository();
  }

  @Test
  public void userSuccessAddTest() {
    User user = new User("login", "pass");
    assertTrue(userRepository.addUser(user, "login", "pass"));
    assertEquals(1, userRepository.countUsers());
  }

  @Test
  public void userErrorAddTest() {
    User user = new User("login", "pass");
    assertFalse(userRepository.addUser(user, "login", "password"));
    assertEquals(0, userRepository.countUsers());
  }

  @Test
  public void addUsers() {
    this.fillUsersAndAdmin();
    assertEquals(3, userRepository.countUsers());
  }

  @Test
  public void logoutOnlyUsers() {
    this.fillUsersAndAdmin();
    this.userRepository.logoutAllUsersExceptAdmins();
    assertEquals(1, userRepository.countUsers());
  }

  private void fillUsersAndAdmin() {
    User user1 = new User("login1", "pass1");
    User user2 = new User("login2", "pass2");
    User user3 = new User("login3", "pass3", Role.Admin);
    this.userRepository.addUser(user1, "login1", "pass1");
    this.userRepository.addUser(user2, "login2", "pass2");
    this.userRepository.addUser(user3, "login3", "pass3");
  }
}
