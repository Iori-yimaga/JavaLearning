class X {
    Y b = new Y();
    X() {
        System.out.print("X");
    }
}
class Y {
    Y() {
        System.out.print("Y");
    }
}
class Z extends X {
    Y y = new Y();
    Z() {
        System.out.print("Z");
    }
}
public class inheritTest{
    public static void main(String args[]) {
        new Z();
    }
}