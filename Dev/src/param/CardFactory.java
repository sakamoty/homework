package param;

import java.util.List;

import param.AbstractCardFactory;

public class CardFactory extends AbstractCardFactory<Card> {
    public CardFactory(int num, String[] names, Card card) {
        super(num,names,card);
    }
    @Override
    public List<Card> getList() {
        return super.getList();
    }
}