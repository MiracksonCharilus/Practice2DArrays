import java.util.Scanner;

public class Practice2DArrays {
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        String[] countries = {"Canada", "China", "Germany", "South Korea", "Japan", "Russia", "US"};
        int[][] olympicMedals = create2DArrays(countries);
        print2DArrays(olympicMedals, countries);
    }

    public static int[][] create2DArrays(String countries[]) {


        final int COLS = 3;
        String medalType = "";
        int[][] medals = new int[countries.length][COLS];
        for (int row = 0; row < medals.length; row++) {
            for (int col = 0; col < COLS /* col < medals[row].length */; col++) {
               /* if (col == 0) {
                    System.out.println("How many gold medals did " + countries[row] + " win?");
                    medals[row][col] = keyboard.nextInt();
                }
                else if (col == 1) {
                    System.out.println("How many silver medals did " + countries[row] + " win?");
                    medals[row][col] = keyboard.nextInt();
                }
                else if (col == 2) {
                    System.out.println("How many bronze medals did " + countries[row] + " win?");
                    medals[row][col] = keyboard.nextInt();
                }

                */
                if (col == 0) {
                    medalType = "Gold";
                } else if (col == 1) {
                    medalType = "Silver";
                } else if (col == 2) {
                    medalType = "Bronze";
                }
                System.out.println("How many " + medalType + " medals did " + countries[row] + " win?");
                medals[row][col] = keyboard.nextInt();

            }
        }
        //test
return medals;
    }

    public static void print2DArrays(int[][] olympicMedals, String[] countries){
        System.out.println("Countries\t\tGold\tSilver\tBronze");
        int space; //= countries.length;
        int cha; //= 11 - space;
        String clue = " ";

        for (int row = 0; row < countries.length; row++){
            space = countries[row].length();
            cha = 11 - space;
            for (int i = 0; i < cha; i++){
                clue = clue + " ";
            }
            System.out.print(countries[row] + clue +  "\t");
            clue = " ";
            for (int col = 0; col < olympicMedals[row].length; col++){
                System.out.print(olympicMedals[row][col] + "\t\t"); //+ olympicMedals[row][col] )
            }
            System.out.println("");
        }


}
}
