import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Hero {
  private String mHeroName;
  private int mHitPoints;
  private int mAttackPower;
  private int mChanceToHit;
  private int mDefenseRating;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mHeroId;
  private boolean mHeroDefeated;

  public Hero(String heroName) {
    Random randomAttribute = new Random();
    mHeroName = heroName;
    mHitPoints = randomAttribute.nextInt(36) + 65;
    mAttackPower = randomAttribute.nextInt(16) + 15;
    mChanceToHit = 101;
    mDefenseRating = randomAttribute.nextInt(16) + 10;
    instances.add(this);
    mHeroId = instances.size();
    mHeroDefeated = false;
  }

  public String getHeroName() {
    return mHeroName;
  }

  public int getHitPoints() {
    return mHitPoints;
  }

  public int getAttackPower() {
    return mAttackPower;
  }

  public int getChanceToHit() {
    return mChanceToHit;
  }

  public int getDefenseRating() {
    return mDefenseRating;
  }

  public static List<Hero> getHeroList() {
    return instances;
  }

  public static void clearHero() {
    instances.clear();
  }

  public int getHeroId() {
    return mHeroId;
  }

  public static Hero findHero(int heroId) {
    return instances.get(heroId - 1);
  }

  public boolean getDefeatStatus() {
    return mHeroDefeated;
  }


}
