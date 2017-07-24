package flayer;

import java.util.Map;
import java.util.TreeMap;

import constant.Constant;
import param.Card;

public abstract class AbstractBunpu implements Bunpu {
    protected final Deck deck;
    public AbstractBunpu(Deck deck) {
        this.deck = deck;
    }
    protected TreeMap<Double,Card> map;
    @Override
    public void initMap() {
        map =  deck.calcMap();
        if(Constant.debug)System.out.println(map);
    }
    @Override
    public Card randomDraw() {
        double rand = Math.random();
        if(Constant.debug)System.out.println(rand);
        Map.Entry<Double, Card> e = map.floorEntry(rand);
        if(Constant.debug)System.out.println(e);
        return e.getValue();
    }
    @Override
    public String toString() {
        return this.getClass().getName()+" [" + map + "]";
    }
}