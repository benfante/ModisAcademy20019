import java.io.PrintStream;

class Bottles {
    public static void main(String[] args) {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers = 99; beers > -1; beers--) {
            if (beers == 0) {
                out.print(beers + " " + container(beers) + " of beer on the wall,");
                out.println(beers + " " + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beersLeft(beers) + " " + container(beersLeft(beers)) + " of beer on the wall.\r\n");
            } else if (beers == 1) {
                out.print(beers + " " + container(beers) + " of beer on the wall,");
                out.println(beers + " " + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beersLeft(beers) + " " + container(beersLeft(beers)) + " of beer on the wall.\r\n");
            } else if (beers == 2) {
                out.print(beers + " " + container(beers) + " of beer on the wall,");
                out.println(beers + " " + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beersLeft(beers) + " " + container(beersLeft(beers)) + " of beer on the wall.\r\n");
            } else {
                out.print(beers + " " + container(beers) + " of beer on the wall,");
                out.println(beers + " " + container(beers) + " of beer,");
                out.print(actionAfterTakeBeer(beers));
                out.println(beersLeft(beers) + " " + container(beersLeft(beers)) + " of beer on the wall.\r\n");
            }
        }
    }

    private static String actionAfterTakeBeer(int beers) {
        return beers == 0 ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    private static String container(int beers) {
        return beers == 1 ? "bottle" : "bottles";
    }

    private static int beersLeft(int beers) {
        return beers > 0 ? beers - 1 : 99;
    }
}