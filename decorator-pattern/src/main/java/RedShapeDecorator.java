/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 7:19 PM
 */
public class RedShapeDecorator extends ShapeDecorator
{
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
}
