package com.codewiththanh.datastructure.hashtable;

public class Main {

//    public static void main(String[] args) {
//        // a green apple
////        String string = "a green apple";
////        List<Character> characterList = new ArrayList<>();
////        for(char c : string.toCharArray()) {
////             if(c != ' ') characterList.add(c);
////        }
////
////        Map<Integer, List<Character>> map = new HashMap<>();
////        Map<Integer, Character> map2 = new HashMap<>();
////        int i = 1;
////        for(char c : characterList) {
////
////            map2.put(i, c);
////            ++i;
////        }
////        int j = 1;
////        for(char c : characterList) {
////
////            List<Character> list = new ArrayList<>();
////            for(var item  : map2.entrySet()) {
////                if(item.getValue().equals(c)) list.add(c);
////            }
////            map.put(j, list);
////            ++j;
////        }
////
////        for(var item : map.entrySet()) {
////            if(item.getValue().size() == 1) {
////                System.out.println(item.getValue());
////                break;
////            }
////        }
//
//        ///////////////////////////////////////
////        CharFinder finder = new CharFinder();
////        var ch = finder.findFirstNonRepeatingChar("a green apple");
////        System.out.println(ch);
//
//        //////////////////////////////////////////
////        CharFinder finder = new CharFinder();
////        var ch = finder.findFirstRepeatedChar("green apple");
////        System.out.println(ch);
////        int hash = 0;
////        hash = hash + 't';
////        System.out.println(hash);
//
//    }

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");
        table.remove(6);
        System.out.println(table.get(8));
    }
}
