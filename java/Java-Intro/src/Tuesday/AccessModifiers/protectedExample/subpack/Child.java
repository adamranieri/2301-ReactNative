package Tuesday.AccessModifiers.protectedExample.subpack;

import Tuesday.AccessModifiers.protectedExample.Parent;

public class Child extends Parent {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.parentMethod();
        // TODO Fix this example
//        System.out.println(parent.protectedInt);

    }

}
