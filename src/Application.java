import java.util.*;

public class Application {
    public static void main(String[] args) {
        String array = new String();
        array = "nguyen thai son lop 12n4 truong pho thong dan lap tri duc thanh pho cao bang tinh cao bang" +
                "dai hoc bach khoa ha noi " +
                "dang lam viec tai cong ty phan mem duong me tri nam tu liem ha noi " +
                "trinh nguyet minh lop 12n3 truong pho thon dan lap tri duc thanh pho cao bang tinh cao bang " +
                "dang lam viec tai cong ty giao duc duong phuong mai dong da ha noi ";
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array.split(" ")));
        Map<String,Integer> hashMap = new HashMap<>();
        convert(hashMap, arrayList);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

    }
    public static void convert(Map<String,Integer> hashMap,ArrayList<String> arrayList){
        int count = 1;
        for(int i = 0; i< arrayList.size();i++){
            if(hashMap.containsKey(arrayList.get(i).toUpperCase())){
                int countTemp = hashMap.get(arrayList.get(i).toUpperCase())+1;
                hashMap.remove(arrayList.get(i).toUpperCase(),countTemp);
                hashMap.put(arrayList.get(i).toUpperCase(),countTemp);
            }else{
                hashMap.put(arrayList.get(i).toUpperCase(),count);
            }
        }
    }
}
