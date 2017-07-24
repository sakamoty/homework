package param;

public abstract class AbstractCard implements Card {
    private int id;
    private String name;
    protected AbstractCard(){
    }
    @Override
    public Card clone(){
        try{
            return (Card) super.clone();
        }catch(CloneNotSupportedException e){
            throw new InternalError();
        }
    }
    public final void init(int id, String name){
        this.id=id;
        this.name = name;
    }
    @Override
    public final int compareTo(Card arg0) {
        return id()-arg0.id();
    }
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (! (obj instanceof Card))
            return false;
        Card other = (Card) obj;
        return this.id()==other.id();
    }
    @Override
    public final String name() {
        return name;
    }
    @Override
    public final int id() {
        return id;
    }
    @Override
    public final String toString() {
        return name;
    }
}

