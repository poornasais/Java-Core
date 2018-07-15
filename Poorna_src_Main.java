import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//3.    uncomment below to get 3 answer
//    int[] number = {4,3,6,7,9,17,20, 1, -1, 0};
//    MaxNumber mn = new MaxNumber();
//    mn.findDif(number);


//4
//        ReverseString rs = new ReverseString();
//        rs.Reverse("Hello World");

// 5
        Book b = new BuilderPatter().setBookName("Head First JAva").setAuthor("Kathy Sierra").setISBN(12897)
                .setbookstore(new String[] { "London", "Glasgow", "George Square" }).getBook();

        Book a = new BuilderPatter().setBookName("Head First PHP").setAuthor("Edward Johnson").setISBN(89772)
                .setbookstore(new String[] { "Dallas", "New York", "Los Angeles" }).getBook();
        System.out.println(b);
        System.out.println(a);

//7
//        HashMap<BookDetails, Integer> mp = new HashMap<BookDetails, Integer>();
//        mp.put(new BookDetails("Head First Java", "Robert David"), 30);
//        mp.put(new BookDetails("Data Structures", "Murali Krishna"), 22);
//        mp.put(new BookDetails("Algorithms Java", "Naresh Murthi"), 19);
//        mp.put(new BookDetails("Head First PHP", "Kathy Sirron"), 29);
//        mp.put(new BookDetails("Head First PHP", "Kathy Sirron"), 29);
//        printMap(mp);


//8
Randoms ss = new Randoms();
ss.randoms();

//9
//        Duplicate dup = new Duplicate();
//        char[] array1 = { 'j', 'n', 'i', 't'};
//        char[] array2= {'t','e','c','h','n','o','l','o','g','y'};
//
//        String s1= new String(array1);
//        String s2= new String(array2);
//        String str= s1+s2;
//        System.out.println("Input : "+ str);
//        System.out.println("Final output :"+dup.removeDups(str));

        //10
//        NonRepeating nr = new NonRepeating();
//        nr.value("teether");


    }

    public static void printMap(Map<BookDetails, Integer> mp) {
        Map<BookDetails, Integer> sortedMap =
                mp.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map: " + Arrays.toString(sortedMap.entrySet().toArray()));


    }


}
