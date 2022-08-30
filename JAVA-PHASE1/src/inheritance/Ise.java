package inheritance;

public class Ise extends Department {
    double fees;

    public Ise(String deptName, String deptNo, double fees) {
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
        Ise ise = (Ise) o;
        return (super.deptName.equals(ise.deptName)) && (super.deptNo.equals(ise.deptNo)) && (this.fees == ise.fees);
    }
}
