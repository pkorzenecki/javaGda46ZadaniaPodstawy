package basic.java.day3.ex2;

public class Poem {
    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
