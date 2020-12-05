public class Dice {

    private int noOfDice=1;
    private int maxValue=0;
    Dice(int noOfDice)
    {
        this.noOfDice = noOfDice;
        this.maxValue = noOfDice * 6;
    }
    public int getRandom()
    {
        return (int) (1+ Math.random()*maxValue);
    }
}
