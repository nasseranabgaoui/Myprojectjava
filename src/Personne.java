
class Personne {
    String name;
    int age;

    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sePresenter() {
        System.out.println("Je m'appelle " + name + " et j'ai " + age + " ans.");
    }
}

