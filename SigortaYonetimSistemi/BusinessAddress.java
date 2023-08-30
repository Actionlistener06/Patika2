package SigortaYonetimSistemi;

// BusinessAddress class
class BusinessAddress implements Address {
  private String address;

  public BusinessAddress(String address) {
    this.address = address;
  }

  @Override
  public String getAddressInfo() {
    return "Business Address: " + address;
  }
}