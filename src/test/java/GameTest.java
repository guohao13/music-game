import org.junit.*;
import static org.junit.Assert.*;

public class GameTest{
  private Game newGame;

  @Before
  public void createNewGame() {
     Band band1 = new Band("XX");
     Band band2 = new Band ("SS");
     Hero hero1 = new Hero ("Hero1");
     Hero hero2 = new Hero ("Hero2");
     newGame = new Game (band1, band2, hero1, hero2 );
  }

  @After
  public void tearDown() {
    Hero.clearHero();
    Band.clearBand();
  }


  @Test
  public void createdNewGame_true (){
   assertEquals(true, newGame instanceof Game);
  }

  @Test
  public void getBandOneName_XX(){
    assertEquals("XX", newGame.getBandOne().getBandName());
  }



}
