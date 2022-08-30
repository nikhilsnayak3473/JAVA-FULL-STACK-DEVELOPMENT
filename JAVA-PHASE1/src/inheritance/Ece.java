package inheritance;

public class Ece extends Department {
    double fees;

    public Ece(String deptName, String deptNo, double fees) {
        super(deptName, deptNo);
        this.fees = fees;
    }

    public String toString() {
        return "Department Name: " + super.deptName + "\nDepartment No: " + super.deptNo + "\nFees: " + this.fees;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ece ece = (Ece) o;
        return (super.deptName.equals(ece.deptName)) && (super.deptNo.equals(ece.deptNo)) && (this.fees == ece.fees);
    }
}
