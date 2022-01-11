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
    static Random  ra=new Random(52);
    int [] Deck=new int[52];
    static ArrayList<Integer> listArray=new ArrayList();
    public static void main(String[] args)
    {
        System.out.println("Welcome To Decofcards Game");
        getCombination();
    }
    public static void getCombination()
    {

        int c=0;

       for (int i=0;i< suit.length;i++)
       {
           for (int j=0;j<rank.length;j++)
           {
                int index=ra.nextInt();
                index=index%13;
                if(arrayPresentOrNot(i,Math.abs(index)))
                {
                    System.out.println(""+suit[i]+" "+rank[Math.abs(index)]);
                }
           }
       }
    }
    public static boolean arrayPresentOrNot(int i,int value)
    {
            if(listArray.contains(i+value))
            {
            return false;
            }
            else
            {
                listArray.add(i+value);
                return true;
            }
    }
}
