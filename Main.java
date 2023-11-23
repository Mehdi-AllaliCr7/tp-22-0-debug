public class Main {
    public static void main(String[] args) {
        // Problème 1
        /*int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }*/

        // Problème 2
        double result = calculateValue(5, 1);
        System.out.println("Result: " + result);

        // Problème 3
        int count = 10;
        while (count < 20) {
            System.out.println("Count: " + count);
            count += 2;
        }

        // Problème 4
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        char character = message.charAt(3);
        System.out.println("Caractère à l'indice 3 : " + character);

        // Problème 5
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + (str1 == str2));

        // Problème 6
        Main mainObj = null;
        mainObj.method();
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) {
        return a / b;

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de classe
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
