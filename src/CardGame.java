public class CardGame extends TableTopGame{
    private int numCards = 52;

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
