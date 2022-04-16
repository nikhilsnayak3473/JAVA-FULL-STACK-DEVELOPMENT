package encapsulation;

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
