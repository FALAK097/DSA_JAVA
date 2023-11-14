package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(1000);
        l1.setRam(9);

        System.out.println(l1.getPrice());
        System.out.println(l1.getRam());
    }
}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        // is user admin?
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("You cannot set the price");
        } else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
