import java.util.List;
import java.util.ArrayList;

public class Game {
  private Band mBand1;
  private Band mBand2;
  private Hero mActiveFighter;
  private Hero mBand1Fighter;
  private Hero mBand2Fighter;

 public Game (Band band1, Band band2, Hero band1Hero, Hero band2Hero) {
   mBand1 = band1;
   mBand2 = band2;
    mBand1Fighter = band1Hero;
    mBand2Fighter = band2Hero;
   mActiveFighter = mBand1Fighter;
 }

 public Hero getActiveFighter(){
   return mActiveFighter;
 }

 public Band getBandOne(){
   return mBand1;
 }

 public Band getBandTwo(){
   return mBand2;
 }

 public Hero getBand1Fighter (){
   return mBand1Fighter;
 }

 public Hero getBand2Fighter(){
   return mBand2Fighter;
 }

}
