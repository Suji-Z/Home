package templet;

public class Player {

	private PlayerLevel level; //Player�� ������ level ���� ����
	
	//����Ʈ ������. ó�� �����Ǹ� beginnerlevel�� �����ϸ� �޼��� ���
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
							//�Ű����� �ڷ����� ��� ������ ��ȯ ������ P.L
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
//	���� ���� �޼ҵ�. 
	}
	public void play(int count) {
		level.go(count);
	}
}
