package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evalueate(Student student){
        int max = 5;
        int min = 2;

        Random random = new Random();
        int grade = random.nextInt((max - min) + 1 ) + min;

        String gradeToString = "";

        switch (grade){
            case 5 -> gradeToString = "отлично";
            case 4 -> gradeToString = "хорошо";
            case 3 -> gradeToString = "удовлетворительно";
            case 2 -> gradeToString = "неудовлетворительно";
        }

        System.out.printf(
                "Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s \n",
                this.getName(),
                student.getName(),
                this.getSubject(),
                gradeToString
                );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
