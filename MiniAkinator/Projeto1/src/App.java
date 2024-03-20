import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dados dados = new Dados();
        Mamifero leaomMamifero = new Mamifero("Carnívoro", "Grande porte", "Quadrupede");
        Animal leao = new Animal("leao", "Terrestre", leaomMamifero, true, false, false);
        dados.adicionarAnimal(leao);
        Mamifero cachorrMamifero = new Mamifero("Carnívoro", "Pequeno", "quadrupede");
        Animal cachorro = new Animal("Cachorro", "Doméstico", cachorrMamifero, true, false, false);
        dados.adicionarAnimal(cachorro);
        Peixe tubaraoPeixe = new Peixe("Carnívoro", true, "aquatico", "grande", true);
        Animal tubarao = new Animal("Tubarão", "Aquatico", tubaraoPeixe, true, false, false);
        dados.adicionarAnimal(tubarao);
        Peixe bagrePeixe = new Peixe("Carnívoro", false, "aquatico", "pequeno a medio porte", false);
        Animal bagre = new Animal("bagre", "aquatico", bagrePeixe, true, false, false);
        dados.adicionarAnimal(bagre);
        Reptil tartarugaReptil = new Reptil("Herbivora", "aquatico", false, true, false, "pequeno a medio", false);
        Animal tartaruga = new Animal("Tartaruga", "Aquatico", tartarugaReptil, false, false, true);
        dados.adicionarAnimal(tartaruga);
        Reptil dinoReptil = new Reptil("onivoro", "Terrestre", true, false, true, "grande", false);
        Animal dino = new Animal("dinossauro", "Terrestre", dinoReptil, false, true, false);
        dados.adicionarAnimal(dino);
        Reptil cobrarReptil = new Reptil("carnivora", "rasteijando", false, true, false, "pequeno a medio", true);
        Animal cobra = new Animal("Cobra", "Terrestre", cobrarReptil, true, false, false);
        dados.adicionarAnimal(cobra);
        Reptil crocrReptil = new Reptil("carnivoro", "Terrestre", false, false, true, "grande", false);
        Animal croc = new Animal("Crocodilo", "Terrestre e aquatico", crocrReptil, true, false, false);
        dados.adicionarAnimal(croc);
        Artropode baratArtropode = new Artropode("onivoro", 6, true, false);
        Animal barata = new Animal("Barata", "Esgoto", baratArtropode, false, true, false);
        dados.adicionarAnimal(barata);
        Artropode aranArtropode = new Artropode("carnivoro", 8, false, true);
        Animal aranha = new Animal("Aranha", "Terrestre", aranArtropode, true, false, false);
        dados.adicionarAnimal(aranha);

        dados.getAnimais();
    }
}
