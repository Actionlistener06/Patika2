package SigortaYonetimSistemi;

import java.util.Date;

// ResidenceInsurance class
class ResidenceInsurance extends Insurance {
  public ResidenceInsurance(String name, double price, Date startDate, Date endDate) {
    super(name, price, startDate, endDate);
  }

  @Override
  public double calculate() {
    // Residence insurance calculation logic
    return getPrice() * 0.15;
  }
}