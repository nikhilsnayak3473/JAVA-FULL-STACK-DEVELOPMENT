package composition;

public class Engine {
    private final int  cc;
    private final int modelNo;

    public Engine(int cc, int modelNo) {
        this.cc = cc;
        this.modelNo = modelNo;
    }

    public void printDetails(){
        System.out.println("Engine cc: "+this.cc);
        System.out.println("Engine model number: "+this.modelNo);
    }
}
