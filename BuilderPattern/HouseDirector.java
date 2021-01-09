package BuilderPattern;

// Director, do the procedure and return the product
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	// Constructor houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	// set the houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	// deal with the product procedure. In another word: DO IT!
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
	
	
}
