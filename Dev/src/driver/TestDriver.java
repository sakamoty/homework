package driver;

import player.GachaFrame;

/** 実行用テストドライバ*/
public class TestDriver {

    public static void main(String[] args) {
        GachaFrame frame = new GachaFrame(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
