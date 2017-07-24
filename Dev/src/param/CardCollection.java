package param;

import java.io.StringWriter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CardCollection {
    private Map<Card,Integer> map = new TreeMap<Card,Integer>();
    public CardCollection(){
    }
    public void add(Card card){
        if(map.containsKey(card)){
            map.put(card, map.get(card)+1);
        }else{
            map.put(card, 1);
        }
    }
    public boolean contains(Card card){
        return map.containsKey(card);
    }
    @Override
    public String toString() {
        if(map.isEmpty()) return "nothing.";
        StringWriter sw = new StringWriter();
        int counter=0;
        for(Map.Entry<Card, Integer> e : map.entrySet()){
            if(counter++>0){
                if(counter<map.size()){
                    sw.write(", ");
                }else{
                    sw.write(" and ");
                }
            }
            sw.write(e.getValue()+" "+e.getKey()+"(s)");
        }
        return sw.toString();
    }
    public boolean completes(Set<Integer> watch) {
        int num =0;
        for(Card card : map.keySet()){
            if(watch.contains(card.id())){
                num++;
            }
        }
        return num==watch.size();
    }
}
