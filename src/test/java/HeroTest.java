import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  @After
  public void tearDown() {
    Hero.clearHero();
  }

  @Test
  public void createsNewHero_True() {
    Hero newHero = new Hero("Frank");
    assertEquals(true, newHero instanceof Hero);
  }

  @Test
  public void getHeroName_Frank() {
    Hero newHero = new Hero("Frank");
    assertEquals("Frank", newHero.getHeroName());
  }

  @Test
  public void heroHitPointsCreated_int_True() {
    Hero newHero = new Hero("Frank");
    assertEquals(true, newHero.getHitPoints()>64);
    assertEquals(true, newHero.getAttackPower()>14);
    assertEquals(101, newHero.getChanceToHit());
    assertEquals(true, newHero.getDefenseRating()>9);
  }

  @Test
  public void heroList_CreatesArray_1() {
    Hero newHero = new Hero("Frank");
    assertEquals(1, newHero.getHeroList().size());
  }

  @Test
  public void heroList_GetsID_1() {
    Hero newHero = new Hero("Frank");
    assertEquals(1, newHero.getHeroId());
  }

  @Test
  public void heroList_FindsHero_newHero2() {
    Hero newHero = new Hero("Frank");
    Hero newHero2 = new Hero("John");
    assertEquals(newHero2, Hero.findHero(newHero2.getHeroId()));
  }

  @Test
  public void heroDefeat_False() {
    Hero newHero = new Hero("Frank");
    assertEquals(false, newHero.getDefeatStatus());
  }

}
