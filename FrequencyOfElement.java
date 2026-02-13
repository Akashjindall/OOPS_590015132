// 7 WAP to tell frequency of a particular element in an array

class FrequencyOfElement {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 2, 7, 2, 4};
        int element = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        System.out.println("Frequency of " + element + " is: " + count);
    }
}