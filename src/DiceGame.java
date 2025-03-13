public class DiceGame extends TableTopGame{
    private int numDice = 0;
    private int numDieSides = 6;

    public DiceGame(String n){
        super(n);
    }

    public DiceGame(String n,Rule[] rs){
        super(n,rs);
    }
    public DiceGame(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public DiceGame(){
        super();
    }

    public DiceGame(int nd, int nds){
        numDice= nd;
        numDieSides = nds;
    }

    public int getNumDice() {
        return numDice;
    }

    public int getNumDieSides() {
        return numDieSides;
    }

    public void setNumDice(int numDice) {
        this.numDice = numDice;
    }

    public void setNumDieSides(int numDieSides) {
        this.numDieSides = numDieSides;
    }

    @Override
    public String toString() {
        return "DiceGame: " + super.getName();
    }
}
