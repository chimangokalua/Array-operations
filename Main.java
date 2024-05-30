public class Main{
    
	public static void main(String[] args) {
	    
    String[] copyFrom = {
            "Affogato", "Americano", "Cappucciono", "Cortado", "Espresso", "Frapuchino", "Freddo", "Macchiato", "Lungo", "Marocchino", "Ristretto"
        };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
