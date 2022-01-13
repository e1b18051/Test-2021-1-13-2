import java.util.Scanner;

public class Player {
  public static int decidesPlayerHand() {
    int playerHand;
    Scanner scanner = new Scanner(System.in);
    while(true) {
      try {
        playerHand = Integer.parseInt(scanner.next());
        if (playerHand < 1 || playerHand > 3) {
          System.out.println("1~3の数値を入力して下さい。");
          continue;
        }
        break;
      } catch(Exception e) {
        System.out.println("1~3の数値を入力して下さい。");
      }
    }
    scanner.close();
    return playerHand;
  }
}