import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  // @After
  // public void tearDown() {
  //   Hero.clear();
  // }

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

}
