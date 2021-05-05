//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;




public class CardRunner
{
	public static void main( String args[] )
	{
		Card one = new Card("SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		out.println(two.cool());
		two.setFace(3);
		out.println(two.cool());

		Card three = new Card("CLUBS", 4);
		out.println(three.cool());

		Card four = new Card("SPADES", 12);
		out.println(four.cool());

		Card five = new Card("HEARTS", 12);
		out.println(five.cool());
	}
}