package v2;

/**
 * @author : Thulitha
 * date    : 24 - Oct - 2019
 * time    : 5:54 AM
 */
public class Cricket extends Game
{
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}
