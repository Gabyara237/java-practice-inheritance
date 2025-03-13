public class PhysicalSport extends Sport{
    boolean aerobic = false;

    public PhysicalSport(boolean a){
        super();
        aerobic = a;
    }

    public boolean getAerobic() {
        return aerobic;
    }

    public void setAerobic(boolean aerobic) {
        this.aerobic = aerobic;
    }

    @Override
    public String toString() {
        return "PhysicalSport: " + super.getName();
    }
}
