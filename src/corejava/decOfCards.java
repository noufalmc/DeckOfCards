/*
* Author : NOUFAL MC
* Date   : 11/01/2022
* Dec of cards game
*
*
*
* */
package corejava;
import java.util.*;
import java.lang.Math;
public class decOfCards {
    public static final String suit[]={"Clubs","Diamonds","Hearts","Spades"};
    public static final String rank[]={"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace"};
    static Random  ra=new Random();
    static   String [] Deck=new String[52];
    static ArrayList<Integer> listArray=new ArrayList();
    public static void main(String[] args)
    {
        System.out.println("Welcome To Decofcards Game");
        getCombination();
    }
    public static void getCombination()
    {

        int c=0,z=0,index;

       for (int i=0;i<suit.length;i++)
       {
           c=0;
           for (int j=0;c<rank.length;j++)
           {

               index=ra.nextInt(52);
//               System.out.println("Index= "+index);
               index=index%13;
                boolean flag=arrayPresentOrNot(suit[i]+rank[Math.abs(index)],z);
              if(flag)
              {
                System.out.println(""+suit[i]+" "+rank[Math.abs(index)]);
                z++;
                c++;
                }

           }

       }
    for (int i=0;i<Deck.length;i++)
    {
        System.out.println("item = "+Deck[i]);
    }
    }
    public static boolean arrayPresentOrNot(String i,int c) {

        boolean found = true;
        if ( c == 0) {
            Deck[c] = i;
            found = true;
        } else {
            for (int j = 0; j<c; j++) {
                if (Deck[j].equals(i)) {
                    found = false;
                    break;
                }
            }

        }
        if(found)
        {
            Deck[c]=i;
        }
        return found;
    }
}
