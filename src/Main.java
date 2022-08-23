import java.util.Scanner;

public class Main {

    public static void mean(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("Ortalama: " + (double)total / arr.length);
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int [5];

        //kullanıcıdan array oluşturmasını istiyoruz
        System.out.println("Array2'nin değerlerini girin...");
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        /*
        //array elemanlarını yazdırmak istersek
        for(int i = 0; i < arr2.length; i++){
            System.out.println("eleman : " + arr2[i]);
        }
        */
        //mean methodunun içerisinne arr2 arrayimizi göndermiş ve sonrasında da ortalamasını almış olduk
        mean(arr2);

        /*
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println("Array 2'nin birinci elemeanı: " + arr2[0]);
        System.out.println("Array 1'in ikinci elemeanı: " + arr1[1]);
        */



    }

}
