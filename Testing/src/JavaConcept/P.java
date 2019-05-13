package JavaConcept;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mithilesh.kumar
 */
public class P {

    public void display1() {
        System.out.println("I am P>>runtime binding");
    }
    public void display2() {
        System.out.println("compile time binding ");
    }

}

class C extends P {

    public void display1() {
        System.out.println("I am C>>rutime binding ");
    }
}

class Driver {

    public static void main(String args[]) {
        C c = new C();
        P p = new P();
        p = c;
        p.display2();
        p.display1();
    }
}
