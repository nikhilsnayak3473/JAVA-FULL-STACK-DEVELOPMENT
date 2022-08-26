package inheritance;

public class BasketBall extends Ball {

    public BasketBall(float radius) {
        super(radius);
    }

    public void displayBasketBallRadius() {
        System.out.println("Radius: " + super.getRadius());
    }

}
