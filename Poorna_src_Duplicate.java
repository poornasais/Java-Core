import java.util.Arrays;

public class Duplicate {


    public String remove(String str) {
        int index1 = 1, index2 = 1;


        char arr[] = str.toCharArray();


        while (index2 != arr.length) {
            if (arr[index2] != arr[index2 - 1]) {
                arr[index1] = arr[index2];
                index1++;
            }
            index2++;

        }

        str = new String(arr);
        return str.substring(0, index1);
    }


    public String removeDups(String str) {

        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);


        return remove(str);
    }


}

