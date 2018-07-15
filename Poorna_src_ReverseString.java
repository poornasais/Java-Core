public class ReverseString {


    public void Reverse(String name) {
        String varable = new StringBuffer(name).reverse().toString();
        varable = varable.replaceAll("\\s", "");
        varable = varable.replaceAll("l", "t");

        int count[] = new int[256];

        int len = varable.length();


        for (int i = 0; i < len; i++)
            count[varable.charAt(i)]++;


        char ch[] = new char[varable.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = varable.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (varable.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        varable.charAt(i) + " is:" + count[varable.charAt(i)]);
        }
    }

}




