import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        StoneGame stoneGame = new StoneGame(); // StoneGameクラスのインスタンスを作成

        System.out.println("石取りゲームを始めます。");
        System.out.println("--------------------------------------------------");

        System.out.println("用意する石の数を入力してください。");

        Scanner scanner = new Scanner(System.in);
        int stoneAmounts = Integer.parseInt(scanner.nextLine());

        while (stoneAmounts < 1) {
            System.out.println("1以上の数を入力してください。");
            stoneAmounts = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("石の数は" + stoneAmounts + "です。");
        System.out.println("それでは始めます。");

        System.out.println("あなたが先攻です。");

        int game_count = 0;

        while (stoneAmounts > 0) {
            game_count += 1;
            if (game_count % 2 == 1) {
                stoneAmounts = stoneGame.getStoneAmounts(stoneAmounts, scanner); // StoneGameクラスのメソッドを呼び出し
            } else {
                stoneAmounts = stoneGame.getStoneAmounts_enemy(stoneAmounts, scanner); // StoneGameクラスのメソッドを呼び出し
            }
        }
        if (game_count % 2 == 0) {
            System.out.println("あなたの勝ちです。");
        } else {
            System.out.println("私の勝ちです。");
        }
        System.out.println("--------------------------------------------------");
    }
}
