public class Deck {

    public static int[] cards = new int[]{1, 3};
    public static int a = 1;

    Deck() {
        cards = new int[]{1, 3, 4, 10};
        a = a + 1;
        System.out.println(a);
    }

    public static void main(String[] args){
        Deck dingie = new Deck();
        int[] a = Deck.cards;
        dingie.cards[3] = 3;
        int[] c = dingie.cards;
        a = Deck.cards;

        Deck pilates = new Deck();
        int[] b = Deck.cards;
        pilates.cards[1] = 2;

        int[] newArrWhoDis = {2, 2, 4, 1, 3};
        dingie.cards = pilates.cards;
        pilates.cards = newArrWhoDis;
        newArrWhoDis = null;
    }
}