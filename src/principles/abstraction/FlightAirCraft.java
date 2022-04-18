package principles.abstraction;

/**
*
* @author carlo
*/
public class FlightAirCraft {
   
   private float  altitude, speed, rollAngle, pitchAngle;

  
   
   public FlightAirCraft(float altitude, float speed, float rollAngle, float pitchAngle) {
       this.altitude = altitude;
       this.speed = speed;
       this.rollAngle = rollAngle;
       this.pitchAngle = pitchAngle;
   }
   
    public float getAltitude() {
       return altitude;
   }

   public void setAltitude(float altitude) {
       this.altitude = altitude;
   }

   public float getSpeed() {
       return speed;
   }

   public void setSpeed(float speed) {
       this.speed = speed;
   }

   public float getRollAngle() {
       return rollAngle;
   }

   public void setrollAngle(float rollAngle) {
       this.rollAngle = rollAngle;
   }

   public float getPitchAngle() {
       return pitchAngle;
   }

   public void setPitchAngle(float pitchAngle) {
       this.pitchAngle = pitchAngle;
   }

   
   
   
}

