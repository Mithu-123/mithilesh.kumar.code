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
public class CheckType {

    public static void main(String args[]) {
        double num = (double)3.0;

        int x = (int) num;
        
        if (x == num) {
            System.out.println("Integer:=>"+x);
        } else {
            System.out.println("Float;=>"+num);
        }
    }
}




