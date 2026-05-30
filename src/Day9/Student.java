package Day9;

public class Student extends Human{

    private String subject;

    public Student(String name) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот студент с именем %s\n", this.getName());
    }
}
