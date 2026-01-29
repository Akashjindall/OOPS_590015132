public class Classuper1 {
    int n;

    Classuper1(int price) {
        this.n = price;
    }

    class BMW extends Classuper1 {
        BMW(int price) {
            super(price);
            System.out.println("The price of BMW is: " + n);
        }
    }

    public static void main(String[] args) {
        Classuper1 outer = new Classuper1(0);
        Classuper1.BMW obj = outer.new BMW(5000000);
    }
}