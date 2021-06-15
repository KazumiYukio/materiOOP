public class Student extends Person{
    @Override
    public void displayFullName() {
        System.out.println("Student Name : " + getFirstName() + " " + getLastName());
    }
}
