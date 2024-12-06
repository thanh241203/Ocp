package com.example.demo.chap3.gener;


import java.util.*;

public class Gener {

    public static <T> void ship(T t) {
        System.out.println("Preparing" + t);
    }

    public static <T> T ship7(T t) {
        System.out.println("Preparing" + t);
        return t;
    }

    public static void printList(List<?> list) {
        for (Object o : list) System.out.println(o);
    }

    public static int printSub(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list) {
            sum += number.intValue();
            System.out.println(number);
        }
        return sum;
    }

    public static void printSub1(List<? extends Animals> list) {

    }


    public static void printOb(List<? super Object> list) {
        list.add("s");
    }

    public static void main(String[] args) {
//        ArrayList<? extends Number> list3 = new ArrayList<Integer>();
//        List<String> list = new ArrayList<>();
//        list.add("java");
//        printList(list);
//        List<Dog> dog = new ArrayList<>();
//        printSub1(dog);

//        List<Integer> listInter = new ArrayList<>();
//        listInter.add(12);
//        printList(listInter);
//        printSub(listInter);
//
//        List<Long> longs = new ArrayList<>(10);
//        longs.add(1l);
//        printList(longs);
//        printSub(longs);
//
//        List<String> list = new ArrayList<>();
//        list.add(("as")); // true
//        list.add(("assd"));
//        System.out.println(list.remove("as")); // true
//        System.out.println(list.isEmpty()); //false
//        System.out.println(list.size()); //1
//        list.clear();
//        System.out.println(list.isEmpty()); // true
//
        Set<Integer> set = new HashSet<>();
//
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        boolean b41 = set.add(null);
        boolean b42 = set.add(null);
        for (Integer integer : set) System.out.print(integer + ","); // 66,8,10
//
//        Queue<Integer> queue=new ArrayDeque<>();
//        queue.offer(12);
//        queue.offer(13);
//        queue.offer(14);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue);
//
//        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
//        arrayDeque.push(12);
//        arrayDeque.push(13);
//        System.out.println(arrayDeque); //13,12
//        arrayDeque.poll();
//        System.out.println(arrayDeque); //12
//        arrayDeque.push(14);
//        System.out.println(arrayDeque.peek());//14

//        Map<String,String> map=new TreeMap<>();
//        map.put("koala", "bamboo");
//        map.put("lion", "meat");
//        map.put("giraffe", "leaf");
//        for (String key: map.keySet())
//            System.out.print(key + ","); // giraffe,koala,lion,

//        Comparable<Duck> duckComparable = new Comparable<Duck>() {
//            @Override
//            public int compareTo(Duck o) {
//                return o.getId();
//            }
//        };
        Comparator<Duck> duckComparator = (d1, d2) -> {
            int name = d1.getId() - d2.getId();
            if (name == 0) {
                return 0;
            } else {
                System.out.println("get name");
                return name;
            }
        };

        List<Duck> list = new ArrayList<>();
        Duck duck1 = (new Duck("Quack", 7));
        Duck duck2 = new Duck("Puddles", 6);
        list.add(duck1);
        list.add(duck2);
        Collections.sort(list, duckComparator);
        System.out.println(list);

        Dog dog = new Dog();
//
//        List<String> strings = new ArrayList<>();
//        strings.add("th");
//        strings.add("aw");
//        Comparator<String> c = Comparator.reverseOrder();
//        int index = Collections.binarySearch(strings, "th", c);
//        System.out.println(index);
//
//        Set<Rabit> rabits = new TreeSet<>(Comparator.comparingInt(r -> r.getId()));
//        rabits.add(new Rabit());


    }
}
