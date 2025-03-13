public class Demonstrator {
    public static void main(String[] args) {

        Rule[] badmintonRules = {
                new Rule("BADMINTON COURT: The badminton court must be 13.40 m long and 5.18 m wide for singles play; and the same length but 6.10 m wide for doubles matches. The lines must be white or yellow, easy to distinguish and about 4 cm wide. In addition, they should be drawn inwards, as should the center line. The singles court is marked by inner and back sidelines, while the doubles court is marked by back and outer sidelines. Finally, the court must have an area around it that is free of objects: about 0.50 m on the sides and 1 m at the back."),
                new Rule("MATCH: Best of three games. You have to reach 21 points to win, unless otherwise stated. You win a point if your opponent commits a fault or the shuttle touches the opposite surface. In the event of a draw at 20 points, the winner will be the player who reaches 2 points ahead first and serves first in the next game. In the event of a draw at 29, the winner will be the player who reaches 30 first."),
                new Rule("THE RACKET: is a structure with a flat, uniform stringing area for hitting the shuttlecock (28 cm long (maximum) and 22 cm wide) that is located in the head. It also has a throat, the shaft, which connects the head to the handle; and the handle, which is used to hold the racket. In terms of size, this structure should not exceed 68 cm in length and 23 cm in width. In the game, you must ensure that the racket does not have any objects or protrusions attached to it, as well as devices that could change its shape."),
                new Rule("CHANGE SIDES: This will be done at the end of the first and second games and, in the third, when one team reaches 11 points."),
                new Rule("SERVE OR RECEIVE: When serving, you must hit the shuttlecock below the waist, so that it reaches the opposite service area. If you are serving, you must not commit any faults, such as unduly delaying the serve, stepping on the boundary lines, hitting the feathers before the cork, lifting one foot before hitting the shuttlecock, or attempting to feint a hit.")
        };

        Rule[] monopolyRules = {
                new Rule("This is the number one rule of Monopoly Board Game."),
                new Rule("This is the number two rule of Monopoly Board Game."),
        };

        Rule[] solitaireCardGameRules = {
                new Rule("This is the number one rule of Solitaire Card Game."),
                new Rule("This is the number two rule of Solitaire Card Game."),
        };

        Rule[] judoRules = {
                new Rule("This is the number one rule of Judo Sport."),
                new Rule("This is the number two rule of Judo Sport."),
        };

        Rule[] motocrossRule = {
            new Rule("This is the number one rule of motocross Sport."),
            new Rule("This is the number two rule of motocross Sport."),
        };

        Sport badminton = new Sport("Badminton",badmintonRules); // This is the carefully-considered instance!
        BoardGame monopoly = new BoardGame("Monopoly", monopolyRules);
        CardGame solitaire = new CardGame("Solitaire", solitaireCardGameRules);
        PhysicalSport judo = new PhysicalSport("Judo", judoRules);
        MotorizedSport motocross = new MotorizedSport("Motocross", monopolyRules);

        System.out.println(badminton);
        System.out.println(monopoly);
        System.out.println(solitaire);
        System.out.println(judo);
        System.out.println(motocross);
    }
}