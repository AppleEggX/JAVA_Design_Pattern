package BuilderPattern;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" buildBasic ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" buildWalls ");
	}

	@Override
	public void roofed() {
		System.out.println(" roofed ");
	}

}
