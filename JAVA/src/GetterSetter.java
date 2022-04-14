public class GetterSetter
{
    public static void main(String[] args) {
        Test t1 = new Test("Nikhil");
        System.out.println(t1.getPhNo());
        t1.setPhNo("9945681657");
        System.out.println(t1.getPhNo());
    }
}

 class  Test{
    private String phNo = "6364470015";
    String name;

    public Test(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo){
        this.phNo = phNo;
    }


}

