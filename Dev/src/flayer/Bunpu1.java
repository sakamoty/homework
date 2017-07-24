package flayer;

import param.Card;

public class Bunpu1 extends AbstractBunpu {
    public Bunpu1(Deck deck){
        super(deck);
        initMap();
    }
    @Override
    public Card draw(){
        return randomDraw();
    }

}
