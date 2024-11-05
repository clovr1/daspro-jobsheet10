import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menuOption, baris, kolom;
        String nama;

        while (true) {
            // Tampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menuOption = sc.nextInt();
            sc.nextLine(); 

            switch (menuOption) {
                case 1:
                    
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        
                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            if (baris >= 1 && baris <= 4) {
                                break;
                            } else {
                                System.out.println("Baris tidak valid. Masukkan angka antara 1 dan 4.");
                            }
                        }

                      
                        while (true) {
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            if (kolom >= 1 && kolom <= 2) {
                                break;
                            } else {
                                System.out.println("Kolom tidak valid. Masukkan angka antara 1 dan 2.");
                            }
                        }
                        sc.nextLine(); 

                       
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi ini sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain.");
                        } else {
                            
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan.");
                            break;
                        }
                    }
                    break;

                case 2:
                    
                    System.out.println("\nSusunan Kursi Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("%s\t", penonton[i][j]);
                            } else {
                                System.out.print("***\t"); 
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                   
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}
