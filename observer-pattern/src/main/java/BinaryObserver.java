/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 2:32 PM
 */
public class BinaryObserver extends Observer
{
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
	}
}
