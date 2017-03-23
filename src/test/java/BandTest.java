import org.junit.*;
import static org.junit.Assert.*;

public class BandTest {
  private Band newBand;

  @Before
  public void createNewBand() {
    newBand = new Band("Best Band");
  }

  @After
  public void tearDown() {
    Band.clearBand();
  }

  @Test
  public void createsNewSquad_True() {
    assertEquals(true, newBand instanceof Band);
  }

  @Test
  public void getsBandName_BestBand() {
    assertEquals("Best Band", newBand.getBandName());
  }

  @Test
  public void bandDefeat_False() {
    assertEquals(false, newBand.getBandDefeatStatus());
  }

  @Test
  public void bandAddsToBandInstances_1() {
    assertEquals(1, newBand.getBandInstances().size());
  }

  @Test
  public void bandSize_2() {
    assertEquals(0, newBand.getBandMembers().size());
  }
}
