import java.util.List;
import java.util.ArrayList;

public class Game {
  private Player mPlayer1;
  private Player mPlayer2;
  private Player mActivePlayer;

 public Game () {
   mPlayer1 = new Player ("");
   mPlayer2 = new Player("");
   mActivePlayer = mPlayer1;
 }
}
