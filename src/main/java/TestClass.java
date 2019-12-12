public class TestClass {
    private int age;
    private int number;
    private String FirstName = "Sasha";
    private String LastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//    public String getFirstName() {
//        return FirstName;
//    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    private void printData(){
        System.out.println(number + " " + FirstName);
    }

}
