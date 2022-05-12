package classes;

public class Loja {

    private Roupa estoque[];
    private int contRoupa = 0;
//    private String nomeLoja;

    public Loja() {
        estoque = new Roupa[50];
        contRoupa = 0;
    }

    public int qtdeRoupasCadastradas() {
        return contRoupa;
    }

    public Roupa[] getRespostaCadstro() {
        return estoque;
    }

    public boolean existe(Roupa novoRoupa) {
        for (int i = 0; i < contRoupa; i++) {
            if (estoque[i].compareTo(novoRoupa) == 0) {
                return true;
            }
        }

        return false;
    }

    public int adiciona(Roupa novoRoupa) {
        if (contRoupa < estoque.length) {
            if (!existe(novoRoupa)) {
                estoque[contRoupa] = novoRoupa;
                contRoupa++;
                return 0;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public boolean exclui(String codigoExcluir) {
        for (int i = 0; i < contRoupa; i++) {
            if (estoque[i].getCodigo().equals(codigoExcluir)) {
                for (int j = i; j < contRoupa - 1; j++) {
                    estoque[j] = estoque[j + 1];
                }
                contRoupa--;
                return true;
            }

        }
        return false;
    }

    public void alterar(Roupa roupa, int linha) {
        String codigo = "";
        codigo = estoque[linha].getCodigo();
        estoque[linha] = roupa;
        estoque[linha].setCodigo(codigo);

    }

    public String[][] estoqueToString() {
        String[][] roupas = new String[contRoupa][4];
        for (int i = 0; i < contRoupa; i++) {
            roupas[i][0] = estoque[i].getCodigo();
            roupas[i][1] = estoque[i].getDescricao();
            roupas[i][2] = estoque[i].getCor();
            roupas[i][3] = estoque[i].getTamanho();
        }
        return roupas;
    }

}
