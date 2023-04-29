public class Products {
    private String name;
    private int price;

    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void compareProducts(Products secondProduct) {
        if(this.price > secondProduct.price) {
            System.out.println(this.name + " is more expensive than " + secondProduct.name);
        } else {
            System.out.println(secondProduct.name + " is more expensive than " + this.name);
        }
    }
}
