public class Piece {

    public int longitude;
    public int latitude;

    public Piece(int x, int y) {
        longitude = x;
        latitude = y;
    }

    /** takes in a 1D Piece array and converts it into a 2D Piece array
     *  where Pieces share a row if they have the same latitude.*/
    public static Piece[][] groupByLat(Piece[] p) {
        int width = (int) Math.sqrt(p.length);
        Piece[][] latSort = new Piece[width][width];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < latSort.length; j++) {
                if (latSort[j][0] == null) {
                    latSort[j][0] = p[i];
                    break;
                } else if (latSort[j][0].latitude == p[i].latitude) {
                    int counter;
                    for (counter = 0; counter < width; counter++) {
                        if (latSort[j][counter] == null) {
                            break;
                        }
                    }
                    latSort[j][counter] = p[i];
                    break;
                }
            }
        }
        return latSort;
    }

    /**Takes in a 2d array of Pieces and returns it
     * sorted in the correct order such that the row that contains
     * the smallest latitudes is at the 0th index.*/
    public Piece[][] sortByLat(Piece[][] p){
        return null;
    }

    /** Takes in a 1D array of Pieces and half sorts them all by longitude*/
    public Piece[] sortHalf(Piece[] p){
        return null;
    }

    public Piece[][] solvePuzzle(Piece[] scattered) {
        Piece[][] grouped = groupByLat(scattered);
        int upper = (int) Math.ceil((double) grouped.length / 2);
        int lower = (int) Math.floor((double) grouped.length / 2);
        for (Piece[] row : grouped) {
            Piece[] halfsort = sortHalf(row);
            Piece[] tmp = new Piece[row.length];
            System.arraycopy(halfsort, 0, tmp, lower, upper);
            System.arraycopy(halfsort, upper, tmp, 0, lower);
            row = tmp;
        }
        Piece[][] sorted = sortByLat(grouped);
        return sorted;
    }

    public static void print2D(Piece[][] pieces) {
        System.out.println("Array:");
        for (Piece[] ps : pieces) {
            print(ps);
        }
    }

    public static void print(Piece[] ps) {
        for (Piece p : ps) {
            System.out.print("(" + p.longitude + ", " + p.latitude + ")  ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Piece[] pieces = new Piece[]{
                new Piece(0, 20),
                new Piece(10, 0),
                new Piece(20, 0),
                new Piece(10, 20),
                new Piece(10, 10),
                new Piece(0, 10),
                new Piece(0, 0),
                new Piece(20, 20),
                new Piece(20, 10),
        };
        print(pieces);
//        Piece[][] lat = solvePuzzle(pieces);
        print2D(groupByLat(pieces));
    }

}
