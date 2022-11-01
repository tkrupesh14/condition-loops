package com.krupesh;

public class Conditions {
    public static void main(String[] args) {
        int salary = 2000;
        if(salary>1000){
            salary = salary + 1000;
        }else {
            salary = salary + 500;
        }
        System.out.println("Salary: "+salary);

        int apple = 10;
        if(apple > 10){
            System.out.println("Apple: " + apple+10);
        } else if (apple <= 10) {
            System.out.println("Apple: "  + apple+5);
        }else {
            System.out.println("Apple: "+ apple);
        }
    }

}
