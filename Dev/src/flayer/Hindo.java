package flayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import param.Card;

public class Hindo extends HashMap<Card, Integer> {
    private static final long serialVersionUID = 1L;
    public Hindo(){
        super();
    }
    @Override
    public String toString() {
        List<Map.Entry<Card,Integer>> list = new ArrayList<Map.Entry<Card,Integer>>(entrySet());
        Collections.sort(list, new HindoComparator());
        return list.toString();
    }
    class HindoComparator implements Comparator<Map.Entry<Card,Integer>>{
        @Override
        public int compare(Entry<Card, Integer> arg0, Entry<Card, Integer> arg1) {
            return arg0.getValue()-arg1.getValue();
        }
    }}
