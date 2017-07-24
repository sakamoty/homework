package player;

import javax.swing.JButton;
import javax.swing.JTextArea;

import listener.GachaActionListener;
import saka.SakaFrame;
import saka.SakaParam;

public class GachaFrame extends SakaFrame {

    private static final String FRAME_NAME = "ガチャ";

    {
        // テキストエリア
        JTextArea textArea = new JTextArea();
        textArea.setBounds(5, 5, 375, 200);
        super.add(textArea);

        // ガチャ実行ボタン
        JButton button = new JButton("ガチャを回す");
        button.setBounds(100, 210, 200, 30);
        button.addActionListener(new GachaActionListener(textArea));
        super.add(button);

    }

    public GachaFrame(int width, int height) {
        super(FRAME_NAME);
        setSize(width, height);
    }

    public GachaFrame(int width, int height, SakaFrame pFrame) {
        super(FRAME_NAME, pFrame);
        setSize(width, height);
        createReturnButton(60, 20);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void setParam(SakaParam param) {

    }

}
