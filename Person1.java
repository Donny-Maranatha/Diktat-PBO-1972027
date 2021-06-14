/**
 * @author Donny (1972027)
 */

public class Person1 {
    private String firstName;
    private String lastName;

    public Person1(){
    }

    public Person1(String lastName) {
        this.lastName = lastName;
    }

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
