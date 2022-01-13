public class VictoryOrDefeat {
  public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
    System.out.println("プレイヤー : " + Hand.getHandName(playerHand));
    System.out.println("コンピュータ : " + Hand.getHandName(computerHand));
    if (playerHand == computerHand) {
      System.out.println("あいこ");
    } else if ((playerHand == 1 && computerHand == 2) || (playerHand == 2 && computerHand == 3) || (playerHand == 3 && computerHand == 1)) {
      System.out.println("勝ち");
    } else {
      System.out.println("負け");
    }
  }
}