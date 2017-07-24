package flayer;

import java.util.List;
import java.util.TreeMap;

import param.Card;
public abstract class AbstractDeck implements Deck {
    protected List<Card> cards;
    protected Bunpu bunpu;
    public AbstractDeck(List<Card> list){
        super();
        this.cards = list;
    }
    public final double total() {
        double total = 0;
        for(Card card : cards){
            double rate = getCardRate(card);
            if(rate!=0.0){
                total += rate;
            }
        }
        return total;
    }
    @Override
    public final Card draw(){
        return bunpu.draw();
    }
    public final double getCardRate(Card card){
        return 1.0/card.rate();
    }
    @Override
    public final TreeMap<Double,Card> calcMap(){
        TreeMap<Double,Card>map = new TreeMap<Double,Card>();
        double total = total();
        double rate = 0;
        for(Card card : cards){
            double nextRate = getCardRate(card);
            if(nextRate!=0.0){
                map.put(rate, card);
                rate += nextRate/total;
            }
        }
        return map;
    }
    @Override
    public final String toString() {
        return  cards.toString();
    }
}

