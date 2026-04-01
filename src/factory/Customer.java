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
