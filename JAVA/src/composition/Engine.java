package composition;

public class Engine {
    private  int  cc;
    private int modelNo;

    public Engine(int cc, int modelNo) {
        this.cc = cc;
        this.modelNo = modelNo;
    }

    public void printDetails(){
        System.out.println("Engine cc: "+this.cc);
        System.out.println("Engine model number: "+this.modelNo);
    }
}
