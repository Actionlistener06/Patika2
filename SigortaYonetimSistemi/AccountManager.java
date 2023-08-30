package SigortaYonetimSistemi;

import java.util.TreeSet;

// AccountManager class
class AccountManager {
  private TreeSet<Account> accounts;

  public AccountManager() {
    accounts = new TreeSet<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public Account login(String email, String password) throws InvalidAuthenticationException {
    for (Account account : accounts) {
      if (account.getUser().getEmail().equals(email)) {
        account.login(email, password);
        return account;
      }
    }
    throw new InvalidAuthenticationException("Invalid credentials");
  }
}