/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suporte
 */
public class Customer {
// Fields
    private String gradeRequest;
    private boolean isApproved;
// Constructor
    public Customer(String gradeRequest, boolean isApproved) {
        this.gradeRequest = gradeRequest;
        this.isApproved = isApproved;
    }
// Getters and setters
    public boolean isApproved() {
        return isApproved;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }

}
