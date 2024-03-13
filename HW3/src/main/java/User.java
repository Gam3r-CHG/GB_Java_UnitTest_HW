public class User {

  private String name;
  private String password;

  private Role role;

  public User(String name, String password)   {
    this(name, password, Role.User);
  }

  public User(String name, String password, Role role) {
    this.name = name;
    this.password = password;
    this.role = role;
  }

  public boolean authorize(String name, String password) {
    return this.name.equals(name) && this.password.equals(password);
  }

  public Role getRole() {
    return this.role;
  }
}
