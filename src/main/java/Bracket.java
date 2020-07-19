public class Bracket {
    String firstName;
    String lastName;
    int countOpen=0;

    public Bracket(String arg1, String arg2){
        firstName = arg1;
        lastName = arg2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCountOpen() {
        return countOpen;
    }

    public void setCountOpenPlusOne() {
        this.countOpen += 1;
    }
    public void setCountOpenMinusOne() {
        this.countOpen -= 1;
    }

}
