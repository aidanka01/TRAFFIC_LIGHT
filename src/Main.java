import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int colorRandom = random.nextInt(1, 4);
        System.out.println(colorRandom);

        switch (colorRandom){
            case 1 -> Color.GREEN.info();
            case 2 -> Color.YELLOW.info();
            case 3 -> Color.RED.info();
        }



       /* try {
            Scanner scanner = new Scanner(System.in);
            Color color = Color.valueOf(scanner.next());


            switch (color) {
                case GREEN -> Color.GREEN.info();
                case YELLOW -> Color.YELLOW.info();
                case RED -> Color.RED.info();
            }
        }catch (IllegalArgumentException e){
                System.out.println("Oops, error");
            }*/




    }

}