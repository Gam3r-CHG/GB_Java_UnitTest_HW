import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  List<User> users = new ArrayList<>();

  public boolean addUser(User user, String login, String password) {
    if (user.authorize(login, password)) {
      users.add(user);
      return true;
    } else {
      return false;
    }
  }

  public int countUsers() {
    return users.size();
  }

  public void logoutAllUsersExceptAdmins() {
    users.removeIf((user) -> user.getRole() == Role.User);
  }
}
