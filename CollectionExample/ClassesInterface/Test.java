package CollectionExample.ClassesInterface;

/*class X {
    String a = "a";
    int b = 200;
}
public class Test {
    public static void main(String[] args) {
        X objx = new X();
        X objx1 = new X();
        System.out.println(objx == objx1); //
        System.out.println(objx.equals(objx1));//

        String a = "vineeth";
        String b = "VINEETH";
        String c = "VINEETH";
        System.out.println(a == b);//
        System.out.println(a.equals(b));//
        System.out.println(b == c);
        System.out.println(b.equals(c));

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);//
        System.out.println(s1.equals(s2));
    }
}*/

public class Test{
    static int count =0;

    public static void main(String[] args) {
        if(count<3){
            count++;
            System.out.println(count);
        main(null);
        }
        else{
            return;
        }
        System.out.println("hi");
    }
}

