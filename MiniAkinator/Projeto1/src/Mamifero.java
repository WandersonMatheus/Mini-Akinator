public class Mamifero {
    private String alimentação;
    private String tipoPorte;
    private String modoAndar;

    public Mamifero(String alimentação, String tipoPorte, String modoAndar) {
        this.alimentação = alimentação;
        this.tipoPorte = tipoPorte;
        this.modoAndar = modoAndar;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public String getTipoPorte() {
        return tipoPorte;
    }

    public void setTipoPorte(String tipoPorte) {
        this.tipoPorte = tipoPorte;
    }

    public String getModoAndar() {
        return modoAndar;
    }

    public void setModoAndar(String modoAndar) {
        this.modoAndar = modoAndar;
    }

}
