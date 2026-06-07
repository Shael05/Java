import java.util.ArrayList;
import java.util.Collections;
class Arraylist{
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList <> ();
        list.add(7);
        list.add(11);
        list.add(10);
        // System.out.println(list);
        int ele = list.get(0);
        System.out.println(ele);
        list.add(1,8);
        System.out.println(list);
        list.set(1,5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        for(int i =0; i<size; i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.print(list);
    }

}