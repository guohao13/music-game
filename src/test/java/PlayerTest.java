// import org.junit.*;
// import static org.junit.Assert.*;
//
// public class PlayerTest {
//   private Player newPlayer;
//
//   @Before
//   public void createNewPlayer() {
//     newPlayer = new Player("Best Player");
//   }
//
//   @After
//   public void tearDown() {
//     Player.clearPlayer();
//   }
//
//   @Test
//   public void createsNewPlayer_True() {
//     assertEquals(true, newPlayer instanceof Player);
//   }
// 
//   @Test
//   public void getsPlayerName_BestPlayer() {
//     assertEquals("Best Player", newPlayer.getPlayerName());
//   }
//
//   @Test
//   public void playerDefeat_False() {
//     assertEquals(false, newPlayer.getPlayerDefeatStatus());
//   }
//
//   @Test
//   public void playerAddsToPlayerInstances_1() {
//     assertEquals(1, newPlayer.getPlayerInstances().size());
//   }
//
//   @Test
//   public void playerReturnBand_true() {
//     assertEquals(true, newPlayer.getPlayerBand() instanceof Band);
//   }
// }
