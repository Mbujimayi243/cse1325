import java.util.*;
public class Deck {
    Stack<Card> deck;
    
    class DeckEmpty extends Exception {
        
    }
    public Deck()
    {
        deck=new Stack<>();
        for(int i=0;i<=Rank.MAX;i++)
        {
            for (Suit s : Suit.values()) {
                  Rank r=new Rank(i);
                  Card c=new Card(r, s);
                  deck.push(c);
            }
        }
        shuffle();
    }
    public void shuffle(){
        Collections.shuffle(this.deck);
    } 
    public Card deal()
    {
        try{
        if(this.deck.empty())
        {
            throw new DeckEmpty();
        }
        else{
            return this.deck.pop();
        }
        }catch(Exception e){
            System.out.println(e);
        }
            return null;
        
    }
    public boolean isEmpty()
    {
        if(this.deck.empty())
        {
            return true;
        }
        else{
            return false;
        }
    }
}
