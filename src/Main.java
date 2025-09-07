//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int age = 20;
        String name = "Nassera";

        if (age >= 18) {
            System.out.println(name + " est majeure.");
        } else {
            System.out.println(name + " est mineure.");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Tour de boucle : " + i);
        }

        System.out.println("Carré de 5 = " + carre(5));

        Personne p = new Personne("Nassera", 20);
        p.sePresenter();
    }

    public static int carre(int x) {
        return x * x;
    }
}


