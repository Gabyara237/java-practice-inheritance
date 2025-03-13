public class Sport extends Game{
    private boolean olympic = false;
    private double riskLevel = 0.0;

    public Sport(String n){
        super(n);
    }

    public Sport(String n,Rule[] rs){
        super(n,rs);
    }
    public Sport(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public Sport(){
        super();
    }

    public Sport(boolean o, double rl){
        olympic = o;
        riskLevel = rl;
    }

    public boolean getOlympic() {
        return olympic;
    }

    public double getRiskLevel() {
        return riskLevel;
    }

    public void setOlympic(boolean olympic) {
        this.olympic = olympic;
    }

    public void setRiskLevel(double riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return "Sport: " + super.getName();
    }
}
