import java.util.*;

class SimpleSearch {
    static int positionOfK(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i] + " " +k);
            if(arr[i] == k)
                return i;
        }
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(positionOfK(arr,k));
    }
}
