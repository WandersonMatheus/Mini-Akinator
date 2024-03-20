import java.util.ArrayList;

public class Dados {
    private ArrayList<Animal> animais;

    public Dados() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animais.remove(animal);
    }

    public ArrayList<Animal> getAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
        }
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

}
