import java.util.List;
import java.util.ArrayList;

public class Game {
  private Player mPlayer1;
  private Player mPlayer2;
  private Player mActivePlayer;

 public Game (String player1, String player2) {
   mPlayer1 = new Player ("XX");
   mPlayer2 = new Player("SS");
   mActivePlayer = mPlayer1;
 }

 public Player getActivePlayer(){
   return mActivePlayer;
 }

 public Player getPlayerOne(){
   return mPlayer1;
 }

 public Player getPlayerTwo(){
   return mPlayer2;
 }

}
