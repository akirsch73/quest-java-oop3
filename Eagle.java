public class Eagle extends Bird implements Fly
{

    private boolean flying;
    private int altitude;

    public Eagle(String name)
    {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude()
    {
        return altitude;
    }

    public void setAltitude(int altitude)
    {
        this.altitude=altitude;
    }
    public boolean isFlying()
    {
        return flying;
    }

    @Override
    public String sing()
    {
        return "Screech!";
    }
    public void takeOff()
    {
      System.out.printf("\nFor " + this.getName() + " a quick takeoff ist very important.\n");
    }
    public int ascend(int meters)
    {
      this.setAltitude(meters);
      if(meters>1)
      {
        System.out.println("\n" + this.getName() + " has gained height of " + this.getAltitude() + " meters.");
      }
      else
      {
        System.out.println("\n" + this.getName() + " has missed to gain height. \n");
      }
      return meters=this.altitude;
    }
    public int descend(int meters)
    {
      this.setAltitude(meters);
      if(meters>1)
      {
        System.out.println("\n" + this.getName() + " has lost height of " + this.getAltitude() + " meters.");
      }
      else
      {
        System.out.println("\n" + this.getName() + " has missed to loose height. \n");
      }
      return meters=this.altitude;
    }
    public void land()
    {
      System.out.printf("\nFor " + this.getName() + " landing is no big business.\n");
    }
    public void glide()  // Default eintragen
    {
      System.out.println("\n" + this.getName() + " glides back and forth.");
    }


}
