import org.junit.*;
import static org.junit.Assert.*;

public class GameTest{
  private Game newGame;
  
  @Before
  public void createNewGame() {
     newGame = new Game ();
  }
  @Test
  public void createdNewGame_true (){
   assertEquals(true, newGame instanceof Game);
  }


}
