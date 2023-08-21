class Car {
    String color;
    String model;
    int price;
}

public class Class{
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Black";
        car.model = "Avante";
        car.price = 10000000;

        System.out.println("나는 이번에 " + car.color + " " + car.model + " 를 " + car.price + "원에 구매 했다");
    }
}