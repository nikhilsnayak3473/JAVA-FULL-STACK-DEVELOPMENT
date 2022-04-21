package inheritance;

public class Cse extends Department{
    double fees;

    public Cse(String deptName, String deptNo, double fees) {
        super(deptName, deptNo);
        this.fees = fees;
    }

    public String toString()
    {
        return "Department Name: "+super.deptName+"\nDepartment No: "+super.deptNo+"\nFees: "+this.fees;
    }

    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Cse cse = (Cse) o;
        return (super.deptName.equals(cse.deptName))&&(super.deptNo.equals(cse.deptNo))&&(this.fees==cse.fees);
    }
}
