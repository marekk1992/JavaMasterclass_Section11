package learning._final;

public class Main {

    public static void main(String[] args) {
//
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523666);
//        password.letMeIn(0);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        StaticInitializationBlockTest test = new StaticInitializationBlockTest();
        test.someMethod();
        System.out.println("Owner is " + StaticInitializationBlockTest.owner);
    }
}
