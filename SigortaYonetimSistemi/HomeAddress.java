package SigortaYonetimSistemi;

// HomeAddress class
class HomeAddress implements Address {
  private String address;

  public HomeAddress(String address) {
    this.address = address;
  }

  @Override
  public String getAddressInfo() {
    return "Home Address: " + address;
  }
}