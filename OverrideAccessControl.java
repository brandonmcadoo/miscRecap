/**
 * 
 * Testbed to experiment with overriding access controls in a dervied class.
 * 
 * @author Jim Teresco
 * @author Ira Goldstein 
 * @version Spring 2023
 */

public class OverrideAccessControl {

    public static void main(String[] args) {

    }
}


// we have one method declared of each access control level in class A
class A {

    public int m1() {

        return 1;
    }

    protected int m2() {

        return 2;
    }

    int m3() {

        return 3;
    }

    private int m4() {

        return 4;
    }
}

// class B overrides all - which access control levels are legal?
class B extends A {

    // we can give each overridden method the same access control
    // or something less restrictive
    //
    // change below to see which ones work
    @Override
    public int m1() {

        return 11;
    }

    @Override
    public int m2() {

        return 12;
    }

    @Override
    public int m3() {

        return 13;
    }

    /* An actual "override" not allowed at all since m4 is private */
    // @Override
    public int m4() {

        return 14;
    }

}


