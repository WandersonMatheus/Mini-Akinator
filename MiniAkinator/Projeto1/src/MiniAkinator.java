import java.util.ArrayList;
import java.util.Scanner;

public class MiniAkinator {
    private ArrayList<Animal> animais;
    private Scanner bot;
    private ArvoreDecisao arvoreDecisao;

    

    public MiniAkinator(ArrayList<Animal> animais, Scanner bot, ArvoreDecisao arvoreDecisao) {
        this.animais = animais;
        this.bot = bot;
        this.arvoreDecisao = arvoreDecisao;
    }

    public void iniciarJogo() {
        System.out.println("Bem vido ao Mini Akinator");
        System.out.println("eu com toda minha genialidade irei adivinhar o que esta na sua mente");
        System.out.println("escolha um dos animais da lista e responda as questões somente com sim ou não");
        arvoreDecisao.Caminhar();
    }
}
