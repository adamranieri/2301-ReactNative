package Tuesday.AccessModifiers.finalExample;

// we cannot inherit from a class that is declared with final:
public class SubClass extends FinalClass{

    // Cannot override a final method:
//    @Override
//    public void print() {
//        System.out.println("Can't override a final method");
//    }
}
