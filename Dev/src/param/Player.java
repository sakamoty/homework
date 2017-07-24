package param;

import java.io.IOException;

import constant.Constant;
import flayer.Deck;

public class Player {
    public CardCollection collection;
    public Player(){
        collection = new CardCollection();
    }
    public void play(Deck deck) throws IOException {
        message();
        int c;
        while((c=System.in.read())!=-1){
            if(c=='\n'){
                Card card = singleDraw(deck);
                System.out.println("I got "+card+".");
                System.out.println("I have "+collection+".");
                if(Constant.debug)System.out.println(deck);
                message();
            }
        }
        System.out.println("Game over");
    }
    public Card singleDraw(Deck deck){
        Card card = deck.draw();
        collection.add(card);
        return card;
    }
    private void message() {
        System.out.println("Push Enter Key");
    }
}
