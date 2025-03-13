public class Sport extends Game{
    private boolean olympic = false;
    private double riskLevel = 0.0;

    public Sport(boolean o, double rl){
        olympic = o;
        riskLevel = rl;
    }

    public boolean isOlympic() {
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
