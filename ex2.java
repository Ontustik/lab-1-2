import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scanner_name = new Scanner(System.in);
        int x = Scanner_name.nextInt();
        System.out.println(+ x);

        int arr[][];
        arr = new int[x][x];

        int max = 100, min = -100;
        int range = max-min+1;

        for(int j = 0; j < x; j++){
            for (int i = 0; i < x; i++){
                arr[j][i] = (int)(Math.random()*range)+min;
                System.out.print(arr[j][i] + "\t");
        }
        System.out.println();
    }
        
        
    }
}
