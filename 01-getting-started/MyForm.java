public class MyForm extends ActionForm {
    private String firstName;
    private string lastName;
    
    public MyForm() {
        firstName = "";
        lastName = "";
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String s) {
        this.firstName = s;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String s) {
        this.lastName = s;
    }
}
