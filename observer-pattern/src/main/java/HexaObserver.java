/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 2:33 PM
 */
public class HexaObserver extends Observer
{
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
	}
}
