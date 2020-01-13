package SongOfTheBottle;

public class Song {
        public static void main (String[] args) {
            int beerNum=99;
            String word;
            {
                while (beerNum > 0){
                    word = " бутылка ";

                    System.out.println(beerNum+""+word+" пива на стене");
                    System.out.println(beerNum+""+word+" пива.");
                    System.out.println("Возьми одну.");
                    System.out.println("Пусти по кругу.");
                    System.out.println("                                       ");
                    beerNum=beerNum-1;
                }
                if (beerNum == 0){
                    System.out.println(" нет бутылок пива на стене");

                }
            }
        }
}
