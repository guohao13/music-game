import org.junit.*;
import static org.junit.Assert.*;

public class GameTest{
  private Game newGame;

  @Before
  public void createNewGame() {
     newGame = new Game ("XX","SS");
  }
  @Test
  public void createdNewGame_true (){
   assertEquals(true, newGame instanceof Game);
  }

  @Test
  public void getPlayerOneName_XX(){
    assertEquals("XX", newGame.getPlayerOne().getPlayerName());
  }

  @Test
  public void getActivePlayer_player1(){
    assertEquals(newGame.getPlayerOne(), newGame.getActivePlayer());
  }

  @Test
  public void getBand_Name(){
    assertEquals("XX's Band", newGame.getPlayerOne().getPlayerBand().getBandName());
  }


}
