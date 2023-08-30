package PatikaStore;

public class PatikaStoreApp {
    public static void main(String[] args) {
        Store store = new Store();

        // Adding brands
        store.addBrand(new Brand(1, "Samsung"));
        store.addBrand(new Brand(2, "Lenovo"));
        // Add other brands

        // Adding products
        store.addProduct(new CellPhone(1, 1000.0, 0.1, 50, "Galaxy S21", store.brands.get(0),
                                       "128 GB", "6.1 inch", 4000, 6, "Black"));
        store.addProduct(new Notebook(2, 1500.0, 0.15, 30, "ThinkPad X1 Carbon", store.brands.get(1),
                                      8, "512 GB SSD", "14 inch"));

        // List all products
        store.listProducts();

        // Implement user interactions for adding, deleting, and filtering products
    }
}
