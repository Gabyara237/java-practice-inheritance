public class CardGame extends TableTopGame{
    private int numCards = 52;

    public CardGame(String n){
        super(n);
    }

    public CardGame(String n,Rule[] rs){
        super(n,rs);
    }
    public CardGame(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public CardGame(){
        super();
    }

    public CardGame(int nc){
        numCards = nc;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    @Override
    public String toString() {
        return "CardGame: " + super.getName();
    }
}
