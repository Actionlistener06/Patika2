package SigortaYonetimSistemi;

// Enterprise class
class Enterprise extends Account {
  public Enterprise(User user) {
    super(user);
  }

  @Override
  public void addInsurance(Insurance insurance) {
    insurances.add(insurance);
  }
}