import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Reptil {
    private String alimento;
    private String locomocao;
    private boolean extincao;
    private boolean temcasco;
    private boolean daMedo;
    private String tamanho;
    private boolean temVeneno;

    public Reptil(String alimento, String locomocao, boolean extincao, boolean temcasco, boolean daMedo, String tamanho,
            boolean temVeneno) {
        this.alimento = alimento;
        this.locomocao = locomocao;
        this.extincao = extincao;
        this.temcasco = temcasco;
        this.daMedo = daMedo;
        this.tamanho = tamanho;
        this.temVeneno = temVeneno;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public boolean isExtincao() {
        return extincao;
    }

    public void setExtincao(boolean extincao) {
        this.extincao = extincao;
    }

    public boolean isTemcasco() {
        return temcasco;
    }

    public void setTemcasco(boolean temcasco) {
        this.temcasco = temcasco;
    }

    public boolean isDaMedo() {
        return daMedo;
    }

    public void setDaMedo(boolean daMedo) {
        this.daMedo = daMedo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isTemVeneno() {
        return temVeneno;
    }

    public void setTemVeneno(boolean temVeneno) {
        this.temVeneno = temVeneno;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

}
