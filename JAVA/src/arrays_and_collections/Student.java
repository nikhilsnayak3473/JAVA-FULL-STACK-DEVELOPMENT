package arrays_and_collections;

public class Student {
    private final String studentId;
    String studentName;
    int studentAge;
    private long studentPhoneNumber;

    public Student(String studentId, String studentName, int studentAge, long studentPhoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }


    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(long studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentPhoneNumber=" + studentPhoneNumber +
                '}';
    }
}
