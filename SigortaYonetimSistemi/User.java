package SigortaYonetimSistemi;

import java.util.Date;
import java.util.List;

// User class
class User {
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String occupation;
  private int age;
  private List<Address> addresses;
  private Date lastLogin;

  public User(String firstName, String lastName, String email, String password,
      String occupation, int age, List<Address> addresses, Date lastLogin) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.occupation = occupation;
    this.age = age;
    this.addresses = addresses;
    this.lastLogin = lastLogin;
  }

  public void showUserInfo() {
    System.out.println("User Info:");
    System.out.println("Name: " + firstName + " " + lastName);
    System.out.println("Email: " + email);
    System.out.println("Occupation: " + occupation);
    System.out.println("Age: " + age);
    System.out.println("Last Login: " + lastLogin);
    System.out.println("Addresses:");
    for (Address address : addresses) {
      System.out.println(address.getAddressInfo());
    }
  }
}