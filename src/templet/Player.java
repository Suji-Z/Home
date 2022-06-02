package templet;

public class Player {

	private PlayerLevel level; //Player가 가지는 level 변수 선언
	
	//디폴트 생성자. 처음 생성되면 beginnerlevel로 시작하며 메세지 출력
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
							//매개변수 자료형은 모든 레벨로 변환 가능한 P.L
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
//	레벨 변경 메소드. 
	}
	public void play(int count) {
		level.go(count);
	}
}
