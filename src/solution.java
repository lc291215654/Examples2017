import java.util.*;

/**
 * Created by LICHENG on 2017/8/22.
 */
public class solution {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> suger = new ArrayList<Integer>(m);
        for(int i=0;i<m;i++){
            suger.add(sc.nextInt());
        }

        Collections.sort(suger);

        int[][] LittleBear = new int[n][2];
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            result[i] = a;
            int b = sc.nextInt();
            map.put(a,b);
        }

        Map<Integer, Integer> resultmap = new TreeMap<Integer, Integer> ();


        for(Integer key : map.keySet()){
            int huger = map.get(key);
            for(int j = suger.size()-1;j>=0;j--){
                if(huger >=  suger.get(j)){
                    huger -= suger.get(j);
                    suger.remove(j);
                }
            }
            resultmap.put(key,huger);
        }
        for(int i=0;i<n;i++) {
            System.out.println(resultmap.get(result[i]));
        }
    }
}
