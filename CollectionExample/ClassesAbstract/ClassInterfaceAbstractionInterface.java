package CollectionExample.ClassesAbstract;

public class ClassInterfaceAbstractionInterface {

    public static void main(String[] args) {
       InterfaceExtendedClassImpl il = new InterfaceExtendedClassImpl();
    }
}
interface InterfaceExample{
    public void interfaceMethod();
    final int finalTen  = 10;
}

class InterfaceExtendedClassImpl implements InterfaceExample{
    public InterfaceExtendedClassImpl(){
        System.out.println("constructor InterfaceExtendedClassImpl called and calling interfaceMethod() ");
        this.interfaceMethod();
    }
    public void interfaceMethod(){
        System.out.println("Interface method implemented");
        System.out.println("interface declared final value  before = "+finalTen);
    }
}