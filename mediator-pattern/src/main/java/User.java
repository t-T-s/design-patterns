/**
 * @author : Thulitha
 * date    : 22 - Oct - 2019
 * time    : 2:42 PM
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name){
		this.name  = name;
	}

	public void sendMessage(String message){
		ChatRoom.showMessage(this,message);
	}
}
