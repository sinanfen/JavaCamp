package GameCreator;

public class GameManager {
	
	private GameCreator gameCreator;
	
	public GameManager(GameCreator gameCreator) {
		this.gameCreator = gameCreator;
	}
	
	
	public void Add(Game game) {
		this.gameCreator.Manage(game.getGameName());
	}
	
	public void Delete(Game game) {
		this.gameCreator.Manage(game.getGameName());
	}
	
	
	public void addMultiple(Game[] games) {
		for(Game game: games) {
			Add(game);
		}
	}
	
}