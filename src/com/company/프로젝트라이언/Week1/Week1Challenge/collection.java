package HwWeek1CHALLENGE;
import java.util.*;


public class collection {
    public static void main(String[] args) {
        System.out.println("[JSB 1기 이진]");
        System.out.print("n을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0 ){
            System.out.println("No Elements");
            System.exit(0);
        }


        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i + "   Item " + (i+1));
        }
        System.out.println("=========== ArrayList ===============");
        System.out.println("idx item");
        for(int i = 0 ; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("=========== LinkedList ===============");
        System.out.println("idx item");
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + "   Item " + (i+1));
        }
        for(int i = 0 ; i < linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("=========== Vector ===============");
        System.out.println("idx item");
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < n; i++) {
            vector.add(i + "   Item " + (i+1));
        }
        for(int i = 0 ; i < vector.size() ; i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("=========== HashSet ===============");
        System.out.println("idx item");
        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(i + "   Item " + (i+1));
        }

        Iterator it =  set.iterator();
        for(int i = 0 ; i < set.size() ; i++) {
            System.out.println(it.next());
        }




    }
}
