/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ahmed
 */
public class Employee {
    String employeeName;
    int empid;
    int workex;
    double salary;
    static int noOfEmp;

    public Employee(String employeeName, int empid, int workex, double salary) {
        this.employeeName = employeeName;
        this.empid = empid;
        this.workex = workex;
        this.salary = salary;
        noOfEmp++;
    }
    
    public double calcGrossSalary(){
        double allowance=0;
        if(workex>=1){
            allowance=salary*20/100;
        }else if(workex>=3){
            allowance=salary*20/100;
        }else if(workex>=5){
            allowance=salary*20/100;
        }
        double grossSal=salary+allowance;
        return grossSal;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setWorkex(int workex) {
        this.workex = workex;
    }
    
            
    void printDetail(){
        System.out.println("Name is "+employeeName);
        System.out.println("ID is "+empid);
        System.out.println("Experience is "+workex);
        System.out.println("Salary is "+salary+"\n");
    }   
    static int getEmp(){
        return  noOfEmp;
    }
    
    void method(){
    System.out.println("Salary is "+salary+"\n");
    }
    
}
