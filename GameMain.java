public class GameMain {
  public static void main(String[] args) {
    System.out.println("1:グー 2:チョキ 3:パー");
    System.out.println("じゃんけん...");
    int playerHand = Player.decidesPlayerHand();
    System.out.println("プレイヤー : " + Hand.getHandName(playerHand));
  }
}