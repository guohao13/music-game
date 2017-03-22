import java.util.Random;

public class Hero {
  private String mHeroName;
  private int mHitPoints;
  private int mAttackPower;
  private int mChanceToHit;
  private int mDefenseRating;

  public Hero(String heroName) {
    Random randomAttribute = new Random();
    mHeroName = heroName;
    mHitPoints = randomAttribute.nextInt(36) + 65;
    mAttackPower = randomAttribute.nextInt(16) + 15;
    mChanceToHit = 101;
    mDefenseRating = randomAttribute.nextInt(16) + 10;
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

}
