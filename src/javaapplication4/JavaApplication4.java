/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ahmed
 */
public class JavaApplication4 {

    public static void main(String[] args) {
       Employee emp1=new Employee("Ahmed",1,0,10000);
       Employee emp2=new Employee("Haseef",1,0,20000);
       Employee emp3=new Employee("as",1,0,20000);
      
       emp1.printDetail();
       System.out.println(Employee.getEmp());     
       
    }
    
    
}
