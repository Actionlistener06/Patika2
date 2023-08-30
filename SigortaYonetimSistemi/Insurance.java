package SigortaYonetimSistemi;

import java.util.Date;

// Insurance abstract class
abstract class Insurance {
  private String name;
  private double price;
  private Date startDate;
  private Date endDate;

  public Insurance(String name, double price, Date startDate, Date endDate) {
    this.name = name;
    this.price = price;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public abstract double calculate();

  public String getInsuranceInfo() {
    return "Insurance: " + name + ", Price: " + price +
        ", Start Date: " + startDate + ", End Date: " + endDate;
  }
}