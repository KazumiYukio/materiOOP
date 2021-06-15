public class Launcher {
    public static void main (String args[]) {
         
        Person person = new Student();
        person.setFirstName("boni");
        person.setLastName("octavianus");
         
        person.displayFullName();
         
        Student student = new Student();
        student.setFirstName("ned");
        student.setLastName("stark");
         
        student.displayFullName();
    }
}