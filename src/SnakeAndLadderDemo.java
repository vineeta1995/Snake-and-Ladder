import java.util.ArrayList;
import java.util.HashMap;

public class SnakeAndLadderDemo {

    public static void main(String[] args)
    {
        Snake snake = new Snake();
        HashMap<Integer,Integer> snakePosition = new HashMap<>();
        snakePosition.put(63,18);
        snakePosition.put(95,56);
        snakePosition.put(88,24);
        snakePosition.put(97,78);
        snakePosition.put(36,6);
        snakePosition.put(32,10);
        snake.setSnakePosition(snakePosition);

        Ladder ladder = new Ladder();
        HashMap<Integer,Integer> ladderPosition = new HashMap<>();
        ladderPosition.put(1,38);
        ladderPosition.put(4,14);
        ladderPosition.put(8,30);
        ladderPosition.put(50,67);
        ladderPosition.put(28,76);
        ladderPosition.put(88,99);
        ladderPosition.put(21,42);
        ladderPosition.put(71,92);
        ladder.setLadderPosition(ladderPosition);

        User user1 = new User("Vineeta",0);
        User user2 = new User("Monia" , 0);


        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService(users,snake,ladder);
        snakeAndLadderService.start();
    }
}
