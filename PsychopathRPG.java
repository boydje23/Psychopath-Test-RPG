import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PsychopathRPG {

    static Psychopath player;

    // Initialize the game
    public static void initGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text-based RPG!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        player = new Psychopath(playerName);
        System.out.println("Hello, " + player.name + "! Let's begin.");
    }
    public static void honest() throws InterruptedException {
        System.out.println("You tell the truth that you were plotting your escape");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("You get your sentence extended!");

    }
    public static void lie() throws InterruptedException {
        player.PCLR += 2;
        System.out.println("You lie and say that someone else in the group planned this meeting ");
        System.out.println("You get away with the lie, but now people don't trust you!");

    }
    // Method to explore different rooms
    public static void plot() throws InterruptedException {
        player.PCLR += 1;
        System.out.println("You secretly gather a bunch of criminals to plot");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Your PCL-R score has increased to " + player.PCLR);
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Unfortunately you get caught! ");

        System.out.println(" ");

        System.out.println("What do you do");
        System.out.println("1. Lie to not get caught");
        System.out.println("2. Be honest and admit to being the leader");
        System.out.println("3. Quit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lie();
                break;
            case 2:
                 honest();
                break;
            case 3:
                System.out.println("Exiting game...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

    }

    public static void beNice() throws InterruptedException {
        System.out.println("You continue to hold your ground in prison and swore to be as respectful as possible");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("ALERT: You get your sentence reduced");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Your PCL-R score did not increase ");
        System.out.println("PCL- R: " + player.PCLR);
    }

    public static void main(String[] args) throws InterruptedException {
        initGame(); // Initialize the game

        System.out.println("\n" + player.name + " is born into a modest household in a quiet suburb.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("He grows up surrounded by the love of his parents and his two older sisters. Everything seemed picture perfect until...");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("One fateful night, when he was just 6 years old, masked burglars broke into their home.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Helpless and trembling, he watched in horror as the burglars ruthlessly murdered his parents and sisters before his eyes.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Traumatized by the gruesome event, he withdrew into a shell of silence, refusing to speak of the nightmare that haunted his every moment.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Thrown into the foster care system, he found himself bouncing from one abusive household to another.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Each new family seemed to bring only more pain and despair, leaving him with a deep-seated hatred for the world.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Alone and broken, he endured years of torment, counting down the days until he could escape his tormentors.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Finally, on his 18th birthday, consumed by rage and desperation, he snapped.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("With trembling hands, he took the life of his foster father, the embodiment of all his suffering and anguish.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Sentenced to two decades behind bars, he found himself trapped in a different kind of hell.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("In prison, he faced a daily battle for survival, subjected to the same cruelty and abuse he had endured as a child.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("But deep within him, a flicker of defiance burned bright.");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("Determined to reclaim his dignity and his life, he vowed to rise from the ashes of his past, no matter the cost.");
        TimeUnit.MILLISECONDS.sleep(2000);
        // Game loop
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Plot your escape");
            System.out.println("2. Be a nice normal prisoner");
            System.out.println("3. Quit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    plot();
                    break;
                case 2:
                    beNice();
                    break;
                case 3:
                    System.out.println("Exiting game...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

