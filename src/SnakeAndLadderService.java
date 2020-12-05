import java.util.ArrayList;
import java.util.HashMap;

public class SnakeAndLadderService {

    private final ArrayList<User> users;
    HashMap<Integer,Integer > snakePosition;
    HashMap<Integer,Integer > ladderPosition;
    Dice dice = new Dice(1);
    SnakeAndLadderService(ArrayList<User> users,Snake snake , Ladder ladder)
    {
        this.users=users;
        this.ladderPosition = ladder.getLadderPosition();
        this.snakePosition = snake.getSnakePosition();
    }

    public void start()
    {
        int size= users.size();
        int count=0;
        boolean flag = true;
        while (flag)
        {
            User user = users.get(count % size);
            int diceNumber = dice.getRandom();
            int current = user.getPosition();
            int next=current+diceNumber;
            if(next == 100)
            {
                user.setPosition(next);
                flag = false;
            }
            else if(ladderPosition.containsKey(next))
            {
                user.setPosition(ladderPosition.get(next));
            }
            else if(snakePosition.containsKey(next))
            {
                user.setPosition(snakePosition.get(next));
            }
            else if(next < 100)
            {
                user.setPosition(next);
            }
            System.out.println(user.getName() + " rolled " + diceNumber + " moved from " + current + " to " + user.getPosition());
            if(!flag)
                System.out.println(user.getName() + " wins ");
            count++;
        }
    }
}
