package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import driver.Statistics;
import flayer.Deck1;
import param.Player;

public class GachaActionListener implements ActionListener {

    private JTextArea textArea;
    private ActionListener actionListener;

    public GachaActionListener() {
    }

    public GachaActionListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    public GachaActionListener(JTextArea textArea, ActionListener actionListener) {
        this.textArea = textArea;
        this.actionListener = actionListener;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.actionListener != null) {
            this.actionListener.actionPerformed(e);
        }
        int[] watchlist = {0,1,2};
        Statistics s = new Statistics(watchlist, new Player(), new Deck1());
        textArea.setText(s.calc());

    }

}
