import java.util.List;
import java.util.ArrayList;

public class Band {
  private String mBandName;
  private boolean mBandDefeated;
  private static List<Band> bandInstances = new ArrayList<Band>();
  private List<Hero> mBandMembers;
  private int mBandId;

  public Band(String bandName) {
    mBandName = bandName;
    mBandDefeated = false;
    bandInstances.add(this);
    mBandId = bandInstances.size();
    mBandMembers = new ArrayList<Hero>();
  }

  public String getBandName() {
    return mBandName;
  }

  public boolean getBandDefeatStatus() {
    return mBandDefeated;
  }

  public int getBandId() {
    return mBandId;
  }

  public static List<Band> getBandInstances() {
    return bandInstances;
  }

  public List<Hero> getBandMembers() {
    return mBandMembers;
  }

  public static void clearBand() {
    bandInstances.clear();
  }

}
