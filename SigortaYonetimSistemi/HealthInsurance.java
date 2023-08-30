package SigortaYonetimSistemi;

import java.util.Date;

// HealthInsurance class
class HealthInsurance extends Insurance {
  public HealthInsurance(String name, double price, Date startDate, Date endDate) {
    super(name, price, startDate, endDate);
  }

  @Override
  public double calculate() {
    // Health insurance calculation logic
    return getPrice() * 0.1;
  }
}