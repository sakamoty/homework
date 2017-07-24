package flayer;

import java.util.TreeMap;

import param.Card;;
public interface Deck {
    public Card draw();
    public TreeMap<Double, Card> calcMap();
}
