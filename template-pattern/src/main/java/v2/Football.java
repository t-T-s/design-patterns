package v2;

/**
 * @author : Thulitha
 * date    : 24 - Oct - 2019
 * time    : 5:54 AM
 */
public class Football extends Game
{
	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}
