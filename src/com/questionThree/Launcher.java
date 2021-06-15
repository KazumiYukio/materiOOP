public class Launcher {
    public static void main (String args[]) {
         
        Person person = new Student();
        person.setFirstName("boni");
        person.setLastName("octavianus");
         
        person.displayFullName();
         
        Person student = new Student();
        student.setFirstName("ned");
        student.setLastName("stark");
         
        student.displayFullName();

        Person worker = new worker();
        worker.setFirstName("bred");
        worker.setLastName("ripper");
         
        worker.displayFullName();
    }
}