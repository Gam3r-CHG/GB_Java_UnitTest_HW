import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

  @Test
  public void userAuthorizeTest() {
    var user = new User("login", "pass");
    assertTrue(user.authorize("login", "pass"));
  }

  @Test
  public void userNoAuthorizeTest() {
    var user = new User("login", "pass");
    assertFalse(user.authorize("login", "password"));
  }

  @Test
  public void createAdminUser() {
    var user = new User("admin", "pass", Role.Admin);
    assertEquals(Role.Admin, user.getRole());
  }

  @Test
  public void createUser() {
    var user = new User("admin", "pass");
    assertEquals(Role.User, user.getRole());
  }
}
