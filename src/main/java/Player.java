import java.util.List;
import java.util.ArrayList;

public class Player {
  private String mPlayerName;
  private boolean mPlayerDefeated;
  private static List<Player> playerInstances = new ArrayList<Player>();
  private Band mPlayerBand;
  private int mPlayerId;

  public Player(String playerName) {
    mPlayerName = playerName;
    mPlayerDefeated = false;
    playerInstances.add(this);
    mPlayerId = playerInstances.size();
    mPlayerBand = new Band ("test");
  }

  public String getPlayerName() {
    return mPlayerName;
  }

  public boolean getPlayerDefeatStatus() {
    return mPlayerDefeated;
  }

  public int getPlayerId() {
    return mPlayerId;
  }

  public static List<Player> getPlayerInstances() {
    return playerInstances;
  }

  public Band getPlayerBand() {
    return mPlayerBand;
  }

  public static void clearPlayer() {
    playerInstances.clear();
  }

}
