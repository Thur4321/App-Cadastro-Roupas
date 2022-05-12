package classes;

import javax.swing.table.AbstractTableModel;

public class TabelaModelo extends AbstractTableModel {

    private String colunas[];
    private String dados[][];

     public TabelaModelo(String dados[][], String titColunas[])  {
      colunas=titColunas;
      this.dados=dados;
      fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return dados.length;    }

    @Override
    public int getColumnCount() {
        return colunas.length; //retorna a qtde de elementos do array colunas
    }

     
    @Override
    public String getColumnName( int pos){
        return colunas[pos];
    }
    
  
  //Metodo que exclui a linha da tabela
   public void excluiLinha(int linha){
   
      fireTableRowsDeleted(linha,linha);//exclui a linha da tabela
   }
   
  
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }
    

}
