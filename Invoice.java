//Zaimplementuj klasę `Invoice` reprezentującą fakturę dla sklepu.
// Klasa przechowuje następujące informacje:
//     `product_number (typ String)`, `prodcut_description` (typ String),
//     `quantity`(typ int) i` `pricePerItem`(typ double).

//Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów.
// Zaimplementuj metody set i get dla każdej zmiennej.

//Dodaj metodę:
//     - `Amount`, które zwraca iloczyn quantity i pricePerItem.
//     Jeżeli pricePerItem nie jest dodatnia, `Amount` powinien zwrócić 0.
//     Jeżeli quantity nie jest dodatnie, `Amount` powinna zwrócić 0.

//Przetestuj zaimplementowany program.

// Adam

// Klasa przechowuje następujące informacje:
//     `product_number (typ String)`, `prodcut_description` (typ String),
//     `quantity`(typ int) i` `pricePerItem`(typ double).
public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    // Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów.
    public Invoice(
            String product_number,
            String product_description,
            int quantity,
            double pricePerItem
    ) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Zaimplementuj metody set i get dla każdej zmiennej.
    public String getProduct_number() {
        return this.product_number;
    }

    public String getProduct_description() {
        return this.product_description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


    public double Amount() {
        // Jeżeli pricePerItem nie jest dodatnia, `Amount` powinien zwrócić 0.
        // Jeżeli quantity nie jest dodatnie, `Amount` powinna zwrócić 0.
        if (this.quantity <= 0 || this.pricePerItem <= 0) {
            return 0;
        }
        // `Amount`, które zwraca iloczyn quantity i pricePerItem.
        return this.quantity * this.pricePerItem;
    }

    public static void main(String[] args) {
        Invoice fak1 = new Invoice("1", "kubecek", 2, 50.99);
        Invoice fak2 = new Invoice("2", "Głośnik", -5, 1499.99);

        System.out.println("Faktura 1: " + fak1.Amount() + " PLN");
        System.out.println("Faktura 2 (ujemna ilosc): " + fak2.Amount() + " PLN");


    }
}


