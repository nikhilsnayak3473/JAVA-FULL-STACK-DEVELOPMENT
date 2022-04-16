package encapsulation;

public class GetterSetter
{
    public static void main(String[] args) {
        Test t1 = new Test("Nikhil");
        System.out.println(t1.getPhNo());
        t1.setPhNo("9945681657");
        System.out.println(t1.getPhNo());
    }
}


