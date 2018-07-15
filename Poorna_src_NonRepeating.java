public class NonRepeating {


    static final int CHAR_COUNT = 256;
    static char strArray[] = new char[CHAR_COUNT];


    public int find(String str) {
        for (int i = 0; i < str.length(); i++)
            strArray[str.charAt(i)]++;
        int ind = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (strArray[str.charAt(i)] == 1) {
                ind = i;
                break;
            }

        }

        return ind;
    }

    public void value(String str){
        int index =  find(str);
        if(index==-1) {
            System.out.println("String has no non repeating characters");
        }
        else{
            System.out.println("First non-repeating character is " + str.charAt(index));
        }
    }

}

