public class PhysicalSport extends Sport{
    boolean aerobic = false;

    public PhysicalSport(String n){
        super(n);
    }

    public PhysicalSport(String n,Rule[] rs){
        super(n,rs);
    }
    public PhysicalSport(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public PhysicalSport(){
        super();
    }

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
