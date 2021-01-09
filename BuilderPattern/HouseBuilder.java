package BuilderPattern;


// Builder (abstract/ interface)
public abstract class HouseBuilder {

	protected House house = new House();
	
	// the procedure of creating the product
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	// return the product.
	public House buildHouse() {
		return house;
	}
	
}
