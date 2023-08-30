package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.List;

// Account abstract class
abstract class Account implements Comparable<Account> {
  private AuthenticationStatus authenticationStatus;
  private User user;
  private List<Insurance> insurances;

  public Account(User user) {
    this.authenticationStatus = AuthenticationStatus.FAIL;
    this.user = user;
    this.insurances = new ArrayList<>();
  }

  public abstract void addInsurance(Insurance insurance);

  public void login(String email, String password) throws InvalidAuthenticationException {
    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
      authenticationStatus = AuthenticationStatus.SUCCESS;
    } else {
      throw new InvalidAuthenticationException("Invalid credentials");
    }
  }

  public boolean isLoggedIn() {
    return authenticationStatus == AuthenticationStatus.SUCCESS;
  }

  @Override
  public int compareTo(Account other) {
    return user.getEmail().compareTo(other.user.getEmail());
  }
}