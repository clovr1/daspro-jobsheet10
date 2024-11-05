import java.util.Scanner;

public class Bioskop05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
        
        
        System.out.printf("%s \t %s \t", penonton[0][0], penonton[0][1]);
        System.out.println();
        System.out.printf("%s \t %s \t", penonton[1][0], penonton[1][1]);
        System.out.println();
        System.out.printf("%s \t %s \t", penonton[2][0], penonton[2][1]);
        System.out.println();
        System.out.printf("%s \t %s \t", penonton[3][0], penonton[3][1]);
        System.out.println();

        
        System.out.println("Jumlah baris: " + penonton.length);
        for(String[] barisPenonton : penonton ) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
            
        System.out.println("Jumlah kolom pada baris ke-0: " + penonton[0].length);
        System.out.println("Jumlah kolom pada baris ke-1: " + penonton[1].length);
        System.out.println("Jumlah kolom pada baris ke-2: " + penonton[2].length);
        System.out.println("Jumlah kolom pada baris ke-3: " + penonton[3].length);

        for (String i : penonton[2]){
            System.out.println();

        }
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]) );
        }


       

        input.close();
    }
}
