class  Pen
{
	String brand;
	String colour;
	int price;

	public  static void main(String[] args)
	{
		Pen p1 = new Pen();
		p1.brand = "Flare";
		p1.colour = "blue";
		p1.price = 20;

		Pen p2 = new Pen();
		p2.brand = "Cello";
		p2.colour = "black";
		p2.price = 20;

		Pen p3 = new Pen();
                p3.brand = "Rorito";
                p3.colour = "red";
                p3.price = 5;


		System.out.println("Pen 1 brand: "+p1.brand);
		System.out.println("Pen 1 colour: "+p1.colour);
		System.out.println("Pen 1 price: "+p1.price);

		System.out.println("Pen 2 brand: "+p2.brand);
                System.out.println("Pen 2 colour: "+p2.colour);
                System.out.println("Pen 2 price: "+p2.price);

		System.out.println("Pen 3 brand: "+p3.brand);
                System.out.println("Pen 3 colour: "+p3.colour);
                System.out.println("Pen 3 price: "+p3.price);
	}
}

