package param;

import java.util.ArrayList;
import java.util.List;

public class AbstractCardFactory<E extends Card> {
    private int num;
    private String[] names;
    private E card;
    public AbstractCardFactory(int num, String[] names, E card) {
        this.num=num;
        this.names=names;
        this.card=card;
    }
    protected List<E> getList() {
        List<E> list  = new ArrayList<E>();
        int i = num;
        for(String name : names){
            @SuppressWarnings("unchecked")
            E newcard = (E) card.clone();
            newcard.init(i++,name);
            list.add(newcard);
        }
        return list;
    }
}