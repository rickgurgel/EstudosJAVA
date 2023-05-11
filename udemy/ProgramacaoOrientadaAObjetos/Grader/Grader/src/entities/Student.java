package entities;

public class Student {

    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public boolean checkGrade() {
        if ((firstTrimester + secondTrimester + thirdTrimester) > 60) {
            return true;
        } else {
            return false;
        }
    }

    public String resultMessage() {
        if (checkGrade()) {
            return "PASS";
        } else {
            return "FAILED! "
                    + "MISSING "
                    + missingScore()
                    + " POINTS";
        }
    }

    public double sumOfGrades() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public double missingScore() {
        return 100.00 - sumOfGrades();
    }
}