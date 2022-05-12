package classes;

public class Roupa implements Comparable <Roupa>{

    private String descricao;
    private String cor;
    private String tamanho;
    private String codigo;

    public Roupa(String descricao, String cor, String tamanho, String codigo) {
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
        this.codigo = codigo;
    }

    public Roupa() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String dadosRoupa() {
        return getCodigo() + "\t" + getDescricao() + "\t"
                + getCor() + "\t" + getTamanho();
    }

    @Override
    public int compareTo(Roupa outraRoupa) {
        if (this.codigo.compareTo(outraRoupa.getCodigo()) < 0) {
            return -1;
        } else if (this.getCodigo().compareTo(outraRoupa.getCodigo()) > 0) {
            return 1;
        } else {
            return 0;
        }
    } 

    @Override
    public int hashCode() {
        return getCodigo().hashCode();
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (outro == null) {
            return false;
        }
        if (this.getClass() != outro.getClass()) {
            return false;
        }
        Roupa outraRoupa = (Roupa) outro;
        return outraRoupa.getCodigo().equalsIgnoreCase(this.getCodigo());

    }

}
