/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjson;

import demo.Mainthread.Student;

/**
 *
 * @author Admin
 */
public class MyJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student student = new Student();
       student.setRollNumber("D001");
       student.setName("dinh thai");
       student.setEmail("votantronggio@gmail.com");
       student.setStatus(1);
        System.out.println("");
       
    }
    
}
