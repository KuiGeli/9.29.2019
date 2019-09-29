package pack1;


public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Clss cls1 = new Clss();
        pack2.Clss cls2 = new pack2.Clss(15);


        System.out.println(cls1.getA());
        System.out.println(cls1.b);
        System.out.println(cls1.c);
        System.out.println(cls1.d);

        System.out.println(cls2.getA1());
        System.out.println(cls2.b1);
        System.out.println(cls2.getC1());
        System.out.println(cls2.getD1());


    }


}
