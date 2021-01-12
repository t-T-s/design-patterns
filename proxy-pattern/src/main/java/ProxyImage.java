/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:06 AM
 */
public class ProxyImage implements Image
{

	private RealImage realImage;
	private String fileName;

	public ProxyImage( String fileName )
	{
		this.fileName = fileName;
	}

	public void display()
	{
		if ( realImage == null )
		{
			realImage = new RealImage( fileName );
		}
		realImage.display();
	}
}
