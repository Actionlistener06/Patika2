package PatikaStore;
  import java.util.*;

class Brand {
    int id;
    String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Product {
    int id;
    double unitPrice;
    double discountRate;
    int stockAmount;
    String name;
    Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
    }
}

class CellPhone extends Product {
    String memory;
    String screenSize;
    int batteryPower;
    int ram;
    String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand,
                     String memory, String screenSize, int batteryPower, int ram, String color) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
}

class Notebook extends Product {
    int ram;
    String storage;
    String screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand,
                    int ram, String storage, String screenSize) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}

class Store {
    List<Brand> brands = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    
    public void addBrand(Brand brand) {
        brands.add(brand);
        Collections.sort(brands, Comparator.comparing(b -> b.name));
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void listProducts() {
        System.out.println("ID\tName\t\tBrand\t\tPrice\tStock");
        for (Product product : products) {
            System.out.format("%d\t%s\t%s\t%.2f\t%d%n",
                              product.id, product.name, product.brand.name,
                              product.unitPrice, product.stockAmount);
        }
    }

    // Implement other methods for managing products
}
