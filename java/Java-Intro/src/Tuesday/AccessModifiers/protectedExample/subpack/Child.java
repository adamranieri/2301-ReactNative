package Tuesday.AccessModifiers.protectedExample.subpack;

import Tuesday.AccessModifiers.protectedExample.Parent;

public class Child extends Parent {

    public Child() {
        // can access parent fields/methods if protected:
        System.out.println(super.protectedInt);
        super.protectedMethod();
        // cannot access default outside of package:
//        System.out.println(super.defaultInt);
//        super.defaultMethod();
    }


    public static void main(String[] args) {
        Child child = new Child();

    }

}
