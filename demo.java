// 5 Declare the variable above the main method and access it inside main by creating an object of the class


class demo {

    int number = 10;

    public static void main(String[] args) {

        demo obj = new demo();

        System.out.println("Value of number: " + obj.number);
    }
}

