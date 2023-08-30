package SigortaYonetimSistemi;

import java.util.Date;

// CarInsurance class
class CarInsurance extends Insurance {
  public CarInsurance(String name, double price, Date startDate, Date endDate) {
    super(name, price, startDate, endDate);
  }

  @Override
  public double calculate() {
    // Car insurance calculation logic
    return getPrice() * 0.18;
  }
}