package param;

public interface Card extends Comparable<Card> , Cloneable{
    public int rate();
    public int id() ;
    public String name();
    public Card clone();
    public void init(int num, String name);
}
