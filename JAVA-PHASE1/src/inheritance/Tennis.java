package inheritance;

public class Tennis extends Ball {

    public Tennis(float radius) {
        super(radius);
    }

    public void displayTennisBallRadius() {
        System.out.println("Radius: " + super.getRadius());
    }
}
