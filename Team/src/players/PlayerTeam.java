package players;

public interface PlayerTeam {
	package players;
	import java.util.Set;


			public interface PlayerTeamDao {
			    boolean addPlayerToTeam(Player player, String teamFileName, String playerFileName);

			    Set<PlayerTeam> getAllPlayerTeams(String fileName);

			    Set<PlayerTeam> getPlayerSetByTeamTitle(String teamTitle, String fileName);
			}
			
}
