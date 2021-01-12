/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 7:18 PM
 */
public class ShapeDecorator implements Shape
{
	protected Shape decoratedShape;

	public ShapeDecorator( Shape decoratedShape )
	{
		this.decoratedShape = decoratedShape;
	}

	public void draw()
	{
		decoratedShape.draw();
	}
}
