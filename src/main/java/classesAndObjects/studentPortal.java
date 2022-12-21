package classesAndObjects;

public class studentPortal {

    String username;
    String password;
    String fullName;
    byte yearOfStudy;
    short yearOfGraduation;
    int phoneNumber;
    long idNumber;
    double gpa;
    float cgpa;
    char lastNameInitial;
    boolean isOnScholarship;

    public static void login(String username, String password) {
    }

    public String getFullName() {
        String fullName = "Mario Badescu";
        return fullName;
    }

    public byte getYearOfStudy() {
        byte yearOfStudy = 2;
        return yearOfStudy;
    }

    public short getYearOfGraduation() {
        short yearOfGraduation = 2023;
        return yearOfGraduation;
    }

    public int getPhoneNumber() {
        int phoneNumber = 900500212;
        return phoneNumber;
    }

    public long getIdNumber() {
        long idNumber = 200200400;
        return idNumber;
    }

    public double getGpa() {
        double gpa = 3.7;
        return gpa;
    }

    public float getCgpa() {
        float cgpa = 3.85f;
        return cgpa;
    }

    public char getLastNameInitial() {
        char lastNameInitial = 'B';
        return lastNameInitial;
    }

    public boolean isOnScholarship() {
        boolean isOnScholarship = true;
        return isOnScholarship;
    }
}

