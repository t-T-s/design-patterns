/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 2:33 PM
 */
public class OctalObserver extends Observer
{
	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
	}
}
