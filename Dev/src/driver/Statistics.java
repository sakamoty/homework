package driver;

import java.util.HashSet;
import java.util.Set;

import flayer.Deck;
import flayer.Hindo;
import param.Card;
import param.Player;

public class Statistics {
    private Player player;
    private Deck deck;
    private Set<Integer> watch;
    public Statistics(int[] watchList, Player player, Deck deck){
        this.player = player;
        this.deck = deck;
        watch = generateWatchSet(watchList);
    }
    public String calc(){
        StringBuilder outParam = new StringBuilder();
        int round =0;
        Hindo hindo = new Hindo();
        while(!player.collection.completes(watch)){
            round++;
            Card card = player.singleDraw(deck);
            outParam.append(card+",");
            if(!hindo.containsKey(card)){
                hindo.put(card, round);
            }
        }
        return outParam.substring(0, outParam.lastIndexOf(","));
    }
    private Set<Integer> generateWatchSet(int[] watchList) {
        Set<Integer> watch = new HashSet<Integer>();
        for(int i : watchList){
            watch.add(i);
        }
        return watch;
    }
}
