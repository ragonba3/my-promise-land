/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hinheritance;

/**
 *
 * @author ragonba3
 */
public class Manager extends Employee {
    public void hire(){
        Manager manager = new Manager();
    }
    public void fire(){
    }
    public void givePerformanceReview(){
    }
    @Override
    public void createYearlyObjective(){
    
    super.createYearlyObjective();
    }
    Employee employee = new Employee {}
    
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}


