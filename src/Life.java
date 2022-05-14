public class Life {
    public static void main(String[] args) {
        Life yourLife = new Life();

        double mementoMori;
        double degreeOfStupidity;
        double gameOverPossibility;

        do{
            yourLife.careForYourSelfe();
            yourLife.learn();
            mementoMori = Math.random();
            degreeOfStupidity = Math.random();
            gameOverPossibility = Math.pow(mementoMori, 1/degreeOfStupidity);
            System.out.println("Game Over Possibility: " + gameOverPossibility);
        }while( gameOverPossibility < 0.9);

        System.out.println("The End!");
    }

    private void learn(){
        rethink(0.0);
    }

    private void gainKnowledge(double wisdom) {
        float listen = 0.33f;
        float read = 0.33f;
        float act = 0.33f;
        wisdom += read+act+listen * Math.random();
        rethink(wisdom);
    }

    private void rethink(double wisdom) {
        System.out.println("Current Wisdom: " + wisdom);
        if (wisdom < 1){
            System.out.println("... Drink Coffee and work harder!");
            gainKnowledge(wisdom);
        }
    }

    private void careForYourSelfe(){
        System.out.println("Eat, Sleep, Care for your soul");
        System.out.println("Oh, Beer ... more Beer!");
    }
}
