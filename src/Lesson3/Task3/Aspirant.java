package Lesson3.Task3;

public class Aspirant extends Student {
    protected String dissertationTopic;

    public Aspirant(String aspFirstName, String aspLastName, String aspGroup, double aspAverageMark, String aspDissertationTopic) {
        super(aspFirstName, aspLastName, aspGroup, aspAverageMark);
        dissertationTopic = aspDissertationTopic;

    }

    @Override
    public double getScholarship() {
        double summ;
        if (this.averageMark == 5.0D) {
            summ = 200.0D;
        } else summ = 180.0D;

        return summ;

    }
}
