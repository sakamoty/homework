package flayer;

import java.util.List;

import param.Card;
import param.CardFactory;
import param.Zako;
public class Deck1 extends AbstractDeck {
    public Deck1(){
        super(getList());
        bunpu = new Bunpu1(this);
    }
    public static List<Card> getList(){
        List<Card> list=(new CardFactory(0,new String[]{"Aka", "Ao", "Kuro"},new Zako())).getList();
        return list;
    }
}
