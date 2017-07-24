package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import saka.SakaFrame;

public class ReturnWindowListener implements ActionListener {

    private SakaFrame pFrame;
    private SakaFrame cFrame;

    public ReturnWindowListener(SakaFrame pFrame, SakaFrame cFrame) {
        this.pFrame = pFrame;
        this.cFrame = cFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pFrame.setVisible(true);
        cFrame.dispose();
    }

}
