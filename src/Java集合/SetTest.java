package Java集合;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        Map<Integer, String> m = new HashMap<Integer, String>(5);
        m.put(0, "aaa");
        m.put(1, "bbb");
        m.put(2, "ccc");
        m.put(3, "ddd");
        m.put(4, "eee");
        m.put(5, "fff");
        m.put(6, "ggg");
        m.remove(4, "eee");
        m.put(5, "hhh");
        m.remove(5);
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(4, "iii");
        m1.put(5, "jjj");
        m1.put(6, "kkk");
        m1.put(7, "lll");
        m1.put(8, "mmm");
        m.putAll(m1);
        System.out.println(m.get(1));
        System.out.println(m.size());
        //m.clear();
        System.out.println(m);
        System.out.println("--------------exquisite segment line-------------");

        for (Integer i : m.keySet()) {

            System.out.println("key: " + i + "\t\tvalue: " + m.get(i));

        }

        for (String str : m.values()) {

            System.out.println("value: " + str);

        }

        //m.merge(10);
        m.putIfAbsent(10, "aha");
        m.putIfAbsent(11, "heihei");

        //m.replaceAll((key, value) -> value + "heihei");
        //m.replaceAll((key, value) -> key + "000");
        System.out.println(m);
        for (Map.Entry<Integer, String> e : m.entrySet()) {

            //System.out.println(e.getKey()+"\t\t"+e.getValue());
            System.out.println(e);

        }

        for (Map.Entry<Integer, String> ee : m.entrySet()) {

            System.out.println(ee.getKey() + "　　" + ee.getValue());

        }

        m.merge(22, "hehe", (key, value) -> value + value);
        m.merge(0, "aaa", (key, value) -> value + value);
        System.out.println(m);
        m.compute(2, (key, value) -> key + "0");
        m.replace(0, "aaaaaa", "heihei");

        m.computeIfAbsent(12, key -> "hahaha");
        m.computeIfPresent(12,(key,value)->"heihei");
        m.merge(10,"",(key,value)->value+"666");
        m.putIfAbsent(13,"mmm");
        System.out.println(m.containsKey(22));
        System.out.println(m.containsValue("heihei"));
        System.out.println(m.getOrDefault(33,"null"));

        m.forEach((key,value)->{

            value = value+"999";
            System.out.print(m.get(key)+"\t\t");

        });
        m.replaceAll((key,value)->value+"999");
        m.replace(0,"hehe");
        m.remove(22);
        m.put(33,null);
        //System.out.println()
        System.out.println(m);
        LinkedHashSet l = new LinkedHashSet<>();



    }

}
