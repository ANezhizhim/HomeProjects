package Lesson3.Task3;

public class Student {
    private String firstName, lastName, group;
    protected double averageMark;

    public Student(String stFirstName, String stLastName, String stGroup, double stAverageMark) {
        averageMark = stAverageMark;
        group = stGroup;
        firstName = stFirstName;
        lastName = stLastName;
    }

    public double getScholarship() {
        double summ;
        if (averageMark == 5.0D) {
            summ = 100.0D;
        } else {
            summ = 80.0D;
        }

        return summ;
    }


}
