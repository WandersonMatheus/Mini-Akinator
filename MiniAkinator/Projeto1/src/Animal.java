public class Animal {
    private String nome;
    private String habitat;
    private Mamifero mamifero;
    private boolean carnivoro;
    private boolean onivoro;
    private boolean herbivoro;
    private Artropode artropode;
    private Peixe peixe;
    private Reptil reptil;

    public Animal(String nome, String habitat, Reptil reptil, boolean carnivoro, boolean onivoro, boolean herbivoro) {
        this.nome = nome;
        this.habitat = habitat;
        this.reptil = reptil;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        this.onivoro = onivoro;
    }

    public Animal(String nome, String habitat, Peixe peixe, boolean carnivoro, boolean onivoro, boolean herbivoro) {
        this.nome = nome;
        this.habitat = habitat;
        this.peixe = peixe;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        this.onivoro = onivoro;
    }

    public Animal(String nome, String habitat, Artropode artropode, boolean carnivoro, boolean onivoro,
            boolean herbivoro) {
        this.nome = nome;
        this.habitat = habitat;
        this.artropode = artropode;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        this.onivoro = onivoro;
    }

    public Animal(String nome, String habitat, Mamifero mamifero, boolean carnivoro, boolean onivoro,
            boolean herbivoro) {
        this.nome = nome;
        this.habitat = habitat;
        this.mamifero = mamifero;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        this.onivoro = onivoro;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public boolean isOnivoro() {
        return onivoro;
    }

    public void setOnivoro(boolean onivoro) {
        this.onivoro = onivoro;
    }

    public boolean isHerbivoro() {
        return herbivoro;
    }

    public void setHerbivoro(boolean herbivoro) {
        herbivoro = herbivoro;
    }

    public Mamifero getMamifero() {
        return mamifero;
    }

    public void setMamifero(Mamifero mamifero) {
        this.mamifero = mamifero;
    }

    public Artropode getArtropode() {
        return artropode;
    }

    public void setArtropode(Artropode artropode) {
        this.artropode = artropode;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Peixe getPeixe() {
        return peixe;
    }

    public void setPeixe(Peixe peixe) {
        this.peixe = peixe;
    }

    public Reptil getReptil() {
        return reptil;
    }

    public void setReptil(Reptil reptil) {
        this.reptil = reptil;
    }

}