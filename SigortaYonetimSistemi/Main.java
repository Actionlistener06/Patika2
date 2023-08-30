
package SigortaYonetimSistemi;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Address> userAddresses = new ArrayList<>();
    userAddresses.add(new HomeAddress("123 Main St."));
    userAddresses.add(new BusinessAddress("456 Business Ave."));

    User user = new User("John", "Doe", "john@example.com", "password",
        "Software Engineer", 30, userAddresses, new Date());

    Account individualAccount = new Individual(user);
    Account enterpriseAccount = new Enterprise(user);

    AccountManager accountManager = new AccountManager();
    accountManager.addAccount(individualAccount);
    accountManager.addAccount(enterpriseAccount);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    try {
      Account loggedInAccount = accountManager.login(email, password);
      System.out.println("Login successful!");
      if (loggedInAccount.isLoggedIn()) {
        System.out.println("User Info:");
        loggedInAccount.getUser().showUserInfo();
      }
    } catch (InvalidAuthenticationException e) {
      System.out.println("Invalid credentials.");
    }
  }
}
