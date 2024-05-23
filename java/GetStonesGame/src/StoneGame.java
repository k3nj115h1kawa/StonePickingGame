import java.util.Scanner;

public class StoneGame {
    public int getStoneAmounts(int stoneAmounts, Scanner scanner) {
        System.out.println("取る石の数を入力してください。");

        int selectAmounts = 0;
        while (selectAmounts < 1 || selectAmounts > 3) {
            selectAmounts = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("あなたは" + selectAmounts + "個取りました。");

        stoneAmounts -= selectAmounts;

        if (stoneAmounts < 0) {
            stoneAmounts = 0;
        }

        System.out.println("残りの数は" + stoneAmounts + "です。");

        return stoneAmounts;
    }

    public int getStoneAmounts_enemy(int stoneAmounts, Scanner scanner) {
        int selectAmounts = 0;
        if (stoneAmounts % 2 == 0) {
            if (stoneAmounts - 3 < 0) {
                selectAmounts = 1;
            } else {
                selectAmounts = 3;
            }
        } else {
            if (stoneAmounts == 1) {
                selectAmounts = 1;
            } else {
                selectAmounts = 2;
            }
        }
        System.out.println("私は" + selectAmounts + "個取ります。");

        stoneAmounts -= selectAmounts;

        if (stoneAmounts < 0) {
            stoneAmounts = 0;
        }

        System.out.println("残りの数は" + stoneAmounts + "です。");

        return stoneAmounts;
    }
}
