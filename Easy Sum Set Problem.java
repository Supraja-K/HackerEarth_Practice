import java.util.*;

class EasySumSetProblem {
    static void printB(int[] a,List<Integer> c){
        int low = c.get(0) - a[0], high = c.get(c.size()-1) - a[a.length-1];
        for(int ele=low;ele<=high;ele++){
            boolean notInC = false;
            for(int i=0;i<a.length;i++){
                int element = ele + a[i];
                //System.out.println(ele + " " +element + " "+c.contains(element));
                if(!c.contains(element))
                    notInC = true;
            }
            if(!notInC)
                b.add(ele);
        }
        for(int i : b)
            System.out.print(i + " ");
    }
    static Set<Integer> b = new TreeSet<>();
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> c = new ArrayList<>(m);
        for(int i=0;i<m;i++)
            c.add(sc.nextInt());
        Arrays.sort(a);
        Collections.sort(c);
        printB(a,c);
    }
}
