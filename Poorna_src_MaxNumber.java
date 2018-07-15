public class MaxNumber {
    public int max;
    public int index;


    public void maxNum(int[] arr) {
        max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                index = i;
                max = arr[i];
            }

        }

    }

    public void findDif(int[] arr){
        int[] samp = arr;
        maxNum(samp);
        int temp =0;
        int diff;
        for(int i =0; i<index; i++){
            diff = max-arr[i];
            if (temp<diff){

                temp = diff;
            }

        }
        System.out.println("The Max Difference is: " +temp);

    }




}
