public class instace_of_operator { 
    static class A{
        int i,j;
    }
    static class B {
        int i,j;
    }
    static class C extends A{
        int k;
    }
    static class D extends A{
        int k;
    }
public static void main(String[] args) {
   A a = new A();
   B b = new B();
   C c = new C();
   D d = new D();
   if (a instanceof A)
   System.out.println("a is a instance of A");
   if (a instanceof C)
   System.out.println("a can be  cast to C");


}
}
