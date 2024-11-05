import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai siswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                while (true) {
                    System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                    int inputNilai = sc.nextInt();

                   
                    if (inputNilai >= 0 && inputNilai <= 100) {
                        nilai[i][j] = inputNilai;
                        totalPerSiswa += nilai[i][j];
                        break; 
                    } else {
                        System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                    }
                }
            }

            System.out.println("Nilai rata-rata siswa ke-" + (i + 1) + ": " + (totalPerSiswa / jumlahMataKuliah));
            System.out.println("==================");
        }

      
        System.out.println("\nRata-rata nilai setiap mata kuliah:");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul / jumlahSiswa));
        }

        
        System.out.println("\nRata-rata keseluruhan nilai per siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Siswa ke-" + (i + 1) + ": " + (totalPerSiswa / jumlahMataKuliah));
        }

        sc.close();
    }
}
