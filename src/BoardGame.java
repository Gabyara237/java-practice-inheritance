public class BoardGame extends TableTopGame{
    private double boardWidth = 0.0;
    private double boardLength = 0.0;

    public BoardGame(double bw, double bl){
        boardWidth = bw;
        boardLength = bl;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardLength() {
        return boardLength;
    }

    public void setBoardWidth(double boardWidth) {
        this.boardWidth = boardWidth;
    }

    public void setBoardLength(double boardLength) {
        this.boardLength = boardLength;
    }

    @Override
    public String toString() {
        return "BoardGame: " + super.getName();
    }
}
