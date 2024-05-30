public class Main {
    public static void main(String[] args) {
        
        Integer[] ten = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        
        int sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum += ten[i];
        }
        System.out.println("Sum of elements: " + sum);

        
        Arrays.sort(ten, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(ten));

        
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 100) {
                ten[i] = 1000;
                break;
            }
        }
        System.out.println("Array after replacing 100 with 1000: " + Arrays.toString(ten));
    }
}


