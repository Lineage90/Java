class Animal {
    String name;

    public void cry() {
        System.out.println(name + "is crying");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + "is swimming");
    }
}


public class Inheritance {
    public static void main(String[] args){
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

//      상속받은 Dog class의 속성은 사용 안됌
        Animal dog2 = new Dog("미미");
        dog2.cry();

    }
}
