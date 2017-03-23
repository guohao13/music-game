import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  private Hero newHero;

  @Before
  public void createHero() {
    newHero = new Hero("Frank");
  }

  @After
  public void tearDown() {
    Hero.clearHero();
  }

  @Test
  public void createsNewHero_True() {
    assertEquals(true, newHero instanceof Hero);
  }

  @Test
  public void getHeroName_Frank() {
    assertEquals("Frank", newHero.getHeroName());
  }

  @Test
  public void heroHitPointsCreated_int_True() {
    assertEquals(true, newHero.getHitPoints()>64);
    assertEquals(true, newHero.getAttackPower()>14);
    assertEquals(true, newHero.getChanceToHit()>59);
  }

  @Test
  public void heroList_CreatesArray_1() {
    assertEquals(1, newHero.getHeroList().size());
  }

  @Test
  public void heroList_GetsID_1() {
    assertEquals(1, newHero.getHeroId());
  }

  @Test
  public void heroList_FindsHero_newHero2() {
    Hero newHero2 = new Hero("John");
    assertEquals(newHero2, Hero.findHero(newHero2.getHeroId()));
  }

  @Test
  public void heroDefeat_False() {
    assertEquals(false, newHero.getHeroDefeatStatus());
  }

}
