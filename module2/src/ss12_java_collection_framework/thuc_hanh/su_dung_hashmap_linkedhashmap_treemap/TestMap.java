package ss12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Trọng", 24);
        hashMap.put("Đoàn", 22);
        hashMap.put("Phòng", 30);
        System.out.println("Hiển thị tên và tuổi");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị giảm dần");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Trọng", 24);
        linkedHashMap.put("Đoàn", 22);
        linkedHashMap.put("Phòng", 30);
        System.out.println("\nTuổi của Phòng là: "+ linkedHashMap.get("Phòng"));
    }

}
