public class worker extends Person{
    @Override
    public void displayFullName() {
        System.out.println("Worker Name : " + getFirstName() + " " + getLastName());
    }
}
