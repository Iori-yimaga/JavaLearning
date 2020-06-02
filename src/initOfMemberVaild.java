class A {
    private int i =2;
    public A (){
        this.display();
    }
    public void display(){
        System.out.println("A:" + i);
    }
}

class B extends A {
    private int i = 22;
    public B (){
        i = 222;
    }
    public void display() {
        System.out.println("B:" + i);
    }
}

public class initOfMemberVaild {
    public static void main(String[] args) {
        new B();
    }
}
