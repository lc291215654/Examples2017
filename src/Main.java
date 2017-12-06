import java.util.*;

/**
 * Created by LICHENG on 2017/9/2.
 */
public class Main {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Mynode root = new Mynode();
        int m = sc.nextInt();
        Map<Integer,Mynode> tmap = new HashMap<Integer,Mynode>();



        for (int i=0;i<m;i++){
            Mynode node = new Mynode();
            node.name = sc.next();
            node.parentID = sc.nextInt();
            node.nodeID = i+1;
            node.lever = i;
            tmap.put(node.nodeID,node);
            if(tmap.containsKey(node.parentID)){
                Mynode tnode = tmap.get(node.parentID);
                tnode.chil.add(node);
            }
        }

        tmap.get(1).printself();



    }
}


class Mynode{
    public int nodeID;
    public int parentID;
    public int lever = 0;
    public String name;
    public boolean islast = false;
    public List<Mynode> chil = new ArrayList<Mynode>();
    public void mysort(){
        Collections.sort(chil,new SortByName());
    }

    public void printself(){
        for(int i = lever-1;i>=0;i--){
            if(islast && i==1){
                System.out.print("`");
            }
            else {
                System.out.print("|");
            }
            if(i==0){
                System.out.print("- -");
            }
            else {
                System.out.print("  ");
            }

        }
        System.out.println(name);
        for(Mynode node : chil){
            node.printself();
        }
    }
}

class SortByName implements Comparator {
    public int compare(Object o1, Object o2) {
        Mynode s1 = (Mynode) o1;
        Mynode s2 = (Mynode) o2;
        return s1.name.compareTo(s2.name);
    }
}