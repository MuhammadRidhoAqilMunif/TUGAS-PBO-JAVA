import java.util.Scanner;
//Muhammad Ridho Aqil Munif
//2100018475
//J
//TUGAS PBO

public class Main {

    public static void main(String[] args)
    {
        int baju;

        Scanner input=new Scanner(System.in);


        int k=0;
        do {
            System.out.print("*");
            k++;
        }
        while(k<=42);
        System.out.println("\n*          Tugas Toko Baju         *");
        System.out.println("*******************************");
        System.out.print("Masukan banyak Merk Baju : ");
        baju=input.nextInt();

        String data[][]=new String[baju][4];
        System.out.println("Masukan Variasi Baju:");
        for (int i=0;i<baju;i++)
        {
            System.out.println("");
            System.out.println("Data ke-"+(i+1));
            for (int j=0;j<4;j++)
            {
                if (j==0)
                {
                    System.out.print("Merk Baju : ");
                }
                else if(j==1)
                {
                    System.out.print("Ukuran Baju : ");
                }
                else if(j==2)
                {
                    System.out.print("Warna Baju : ");
                }
                else
                {
                    System.out.print("Jumlah Baju : ");
                }
                data[i][j]=input.next();
            }
        }
//        batas
        System.out.println("----------------------");
        System.out.println("\ndata mahasiswa kelas ");
        System.out.println("----------------------");
        System.out.println("Merk Baju \t\t Ukuran Baju \t\t Warna Baju \t\t JUMLAH BAJU \t");
        for(int i=0;i<baju;i++)
        {
            for (int j=0; j<4;j++)
            {
                System.out.print(data[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
