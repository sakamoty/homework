package saka;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.ReturnWindowListener;

/**
 * Swingで画面を作る時用の汎用JFrameクラス
 * @author user
 *
 */
public abstract class SakaFrame extends JFrame {

    /** 親画面 */
    private SakaFrame superWindow;
    /** パネル */
    private JPanel panel;

    /**
     * デフォルトコンストラクタ
     */
    public SakaFrame() {
        super("タイトルなし");
        this.panel = new JPanel();
        this.panel.setLayout(null);
        this.getContentPane().add(this.panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * コンストラクタ(タイトル指定)
     * @param title
     */
    public SakaFrame(String title) {
        this();
        setTitle(title);
    }

    /**
     * コンストラクタ(タイトル指定、親画面あり)
     * @param title
     * @param pFrame
     */
    public SakaFrame(String title, SakaFrame pFrame) {
        this(title);
        this.superWindow = pFrame;
    }

    /** 初期化の抽象メソッド*/
    abstract public void initialize();
    /** 画面への値渡し用抽象メソッド*/
    abstract public void setParam(SakaParam param);

    /**
     * 親画面に戻るボタン生成
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void createReturnButton(int width, int height) {
        JButton button = new JButton("戻る");
        // イベントリスナー
        button.addActionListener(new ReturnWindowListener(this.superWindow,this));
        // 右下に配置
        button.setBounds(getWidth()-width*4/3, getHeight()-height*12/5, width, height);
        this.panel.add(button);
    }

    @Override
    public Component add(Component comp) {
        return this.panel.add(comp);
    }
}
