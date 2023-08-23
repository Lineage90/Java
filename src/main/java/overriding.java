class computer {
    String name;
    String color;

    public computer(String name) {
        this.name = name;
    }

    public void off() {
        System.out.println(name + "is Off");
    }
}

class Notebook extends computer {
    public Notebook(String name) {
         super(name);
    }

    public void off(){
        System.out.println(name + "is turn off");
    }
}

public class overriding {
    public static void main (String[] args) {
        computer notebook = new Notebook("삼성 노트북");
        notebook.off();
    }
}
