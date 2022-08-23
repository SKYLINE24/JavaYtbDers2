public class CokBoyutluArray {
    public static void cokluBoyutluArray(){
        int[][] arr = {{10,20,30},{40,50,60}};
        //çok boyutlu arrayi görüntüleme işlemi
        int[][] arr2 = new int[2][3];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3;j++){
                System.out.println("elemena : " + arr2[i][j]);
            }
        }


    }
}
