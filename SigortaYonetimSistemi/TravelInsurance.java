package SigortaYonetimSistemi;

import java.util.Date;

// TravelInsurance class
class TravelInsurance extends Insurance {
  public TravelInsurance(String name, double price, Date startDate, Date endDate) {
    super(name, price, startDate, endDate);
  }

  @Override
  public double calculate() {
    // Travel insurance calculation logic
    return getPrice() * 0.12;
  }
}