public class Task2ArrayCode {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] ten = {10, 20, 20, 40, 50, 60, 70, 80, 90, 100};

        // Compute the sum of the elements
        int sum = 0;
        for (int num : ten) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Sort the array in descending order
        java.util.Arrays.sort(ten);
        for (int i = 0; i < ten.length / 2; i++) {
            int temp = ten[i];
            ten[i] = ten[ten.length - 1 - i];
            ten[ten.length - 1 - i] = temp;
        }

        // Replace 100 with 1000
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 100) {
                ten[i] = 1000;
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : ten) {
            System.out.println(num);
        }
    }
}
