package Individu.ProjekMatematika;

public class BingoSong {
    public BingoSong() {
        printBingoSong();
    }

    private void printBingoSong() {
        String[] claps = {"B", "I", "N", "G", "O"};
        for (int i = 0; i <= claps.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            
            // Print the clapping sequence
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("(clap)-");
                }
                for (int l = i; l < claps.length; l++) {
                    System.out.print(claps[l] + "-");
                }
                System.out.println();
            }

            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        new BingoSong();
    }
}
