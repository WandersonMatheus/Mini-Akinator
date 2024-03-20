public class Peixe {
    private String alimentação;
    private boolean cartilagem;
    private String hambiente;
    private String tamanho;
    private boolean medo;

    public Peixe(String alimentação, boolean cartilagem, String hambiente, String tamanho, boolean medo) {
        this.alimentação = alimentação;
        this.cartilagem = cartilagem;
        this.hambiente = hambiente;
        this.tamanho = tamanho;
        this.medo = medo;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public boolean isCartilagem() {
        return cartilagem;
    }

    public void setCartilagem(boolean cartilagem) {
        this.cartilagem = cartilagem;
    }

    public String getHambiente() {
        return hambiente;
    }

    public void setHambiente(String hambiente) {
        this.hambiente = hambiente;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isMedo() {
        return medo;
    }

    public void setMedo(boolean medo) {
        this.medo = medo;
    }

}
