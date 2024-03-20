public class Artropode {
    private String alimentacao;
    private int quantpatas;
    private boolean nojo;
    private boolean podeveneno;

    public Artropode(String alimentacao, int quantpatas, boolean nojo, boolean podeveneno) {
        this.alimentacao = alimentacao;
        this.quantpatas = quantpatas;
        this.nojo = nojo;
        this.podeveneno = podeveneno;
    }

    public boolean getNojo() {
        return nojo;
    }

    public void setNojo(boolean nojo) {
        this.nojo = nojo;
    }

    public boolean getPodeveneno() {
        return podeveneno;
    }

    public void setPodeveneno(boolean podeveneno) {
        this.podeveneno = podeveneno;
    }

    public int getQuantpatas() {
        return quantpatas;
    }

    public void setQuantpatas(int quantpatas) {
        this.quantpatas = quantpatas;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

}
