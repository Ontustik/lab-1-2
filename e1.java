public class Main {

    public static void main(String[] args) {

        int x = 20;
        int arr[][];
        arr = new int[x][x];

        int max = 1, min = -1;
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
