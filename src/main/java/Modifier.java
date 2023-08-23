import pkg.ModifierTest;

class child extends ModifierTest {
    void callParentProtected() {
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

public class Modifier {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
//        modifierTest.messageInside();
//        modifierTest.messageProtected();

        child child = new child();
        child.callParentProtected();
    }
}
