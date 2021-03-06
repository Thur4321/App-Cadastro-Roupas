/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Loja;
import classes.Roupa;
import classes.TabelaModelo;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author lucca
 */
public class Cadastra_roupas extends javax.swing.JDialog {

    private static final int CRIACAO = 0;
    private static final int INICIALIZACAO = 1;
    private static final int FINALIZAÇAO = 2;
    private static final int ALTERAÇAO = 3;
    private int estado;
    Loja loja = new Loja();
    private TabelaModelo tabelaModelo;

    public Cadastra_roupas(java.awt.Frame parent, boolean modal, Loja loja) {
        super(parent, modal);
        initComponents();
        this.loja = loja;
        setTitle("Roupas Armazenados");
        setLocationRelativeTo(parent);
        exibePesquisa();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jTFCor = new javax.swing.JTextField();
        jCBTamanho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jBSair = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jScrollRoupa = new javax.swing.JScrollPane();
        jTableRoupa = new javax.swing.JTable();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastra Roupas");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Roupa:"));

        jLabel1.setText("Descrição:");

        jLabel2.setText("Tamanho:");

        jLabel3.setText("Cor:");

        jCBTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "XGG", "G2", "G3" }));

        jLabel4.setText("Código:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDescricao)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Save16.gif"))); // NOI18N
        jBSalvar.setToolTipText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jTableRoupa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRoupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRoupaMouseClicked(evt);
            }
        });
        jScrollRoupa.setViewportView(jTableRoupa);

        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Delete16.gif"))); // NOI18N
        jBExcluir.setToolTipText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gtk-edit.png"))); // NOI18N
        jBAlterar.setToolTipText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/New16.gif"))); // NOI18N
        jBNovo.setToolTipText("Novo");
        jBNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBNovo.setName(""); // NOI18N
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBVoltar)
                        .addGap(29, 29, 29)
                        .addComponent(jBSair)
                        .addGap(16, 16, 16))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollRoupa)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSair)
                            .addComponent(jBVoltar)
                            .addComponent(jBSalvar)
                            .addComponent(jBExcluir)
                            .addComponent(jBAlterar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollRoupa, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void exibePesquisa() {
        String[] colunas = new String[]{"Código", "Descrição", "Cor", "Tamanho"};
        tabelaModelo = new TabelaModelo(loja.estoqueToString(), colunas);
        jTableRoupa.setModel(tabelaModelo);
//        jTableRoupa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
//        jScroll.setHorizontalScrollBar(new JScrollBar(0));
        jTableRoupa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

    }

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (jTFCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O código é obrigatório!!", "Aviso", 0);
            jTFCodigo.requestFocusInWindow();
            return;
        }
        if (jTFDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "A descrição da roupa é obrigatória!!", "Aviso", 0);
            jTFDescricao.requestFocusInWindow();
            return;
        }
        if (jTFCor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "A cor da roupa é obrigatória!!", "Aviso", 0);
            jTFCor.requestFocusInWindow();
            return;
        }

        String simNao[] = {"Sim", "Não"};
        int grava = JOptionPane.showOptionDialog(this, "Confima os dados?", "Gravando...", JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
        if (grava == 0) {
            Roupa roupa = new Roupa();
            roupa.setCodigo(jTFCodigo.getText());
            roupa.setDescricao(jTFDescricao.getText());
            roupa.setCor(jTFCor.getText());
            roupa.setTamanho(jCBTamanho.getSelectedItem().toString());
            loja.existe(roupa);

            switch (loja.adiciona(roupa)) {
                case -1:
                    JOptionPane.showMessageDialog(this, "Valor máximo atingido", "Aviso", 0);
                    return;
                case 1:
                    JOptionPane.showMessageDialog(this, "Código já utilizado", "Aviso", 0);
                    return;
                case 0:
                    exibePesquisa();
                    break;
            }

        }

        setEstado(2);


    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

        String codigo = (String) tabelaModelo.getValueAt(jTableRoupa.getSelectedRow(), 0);
        if (loja.exclui(codigo)) {
        }
        exibePesquisa();


    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        if (estado == 2) {
            setEstado(3);
            jTFCodigo.setText(null);
            jTFDescricao.setText(null);
            jTFCor.setText(null);
        } else if (estado == 3) {

            if (jTFDescricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "A descrição da roupa é obrigatória!!", "Aviso", 0);
                jTFDescricao.requestFocusInWindow();
                return;
            }
            if (jTFCor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "A cor da roupa é obrigatória!!", "Aviso", 0);
                jTFCor.requestFocusInWindow();
                return;
            }
            String simNao[] = {"Sim", "Não"};
            int grava = JOptionPane.showOptionDialog(this, "Confima os dados?", "Gravando...", JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
            if (grava == 0) {
                Roupa roupa = new Roupa();

                roupa.setDescricao(jTFDescricao.getText());
                roupa.setCor(jTFCor.getText());
                roupa.setTamanho(jCBTamanho.getSelectedItem().toString());
                loja.alterar(roupa, jTableRoupa.getSelectedRow());

                exibePesquisa();

            }

            setEstado(2);
        }


    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        javax.swing.JTextField campo = (javax.swing.JTextField) evt.getSource();
        campo.setBackground(new Color(184, 207, 229));
        campo.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        javax.swing.JTextField campo = (javax.swing.JTextField) evt.getSource();
        campo.setBackground(Color.white);
    }//GEN-LAST:event_formFocusLost

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        jTFCodigo.setText(null);
        jTFDescricao.setText(null);
        jTFCor.setText(null);
        setEstado(1);

    }//GEN-LAST:event_jBNovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setEstado(0);
    }//GEN-LAST:event_formWindowOpened

    private void jTableRoupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoupaMouseClicked
        if (jTableRoupa.getSelectedRow() != -1) {
            jBExcluir.setEnabled(true);
            jBAlterar.setEnabled(true);
        } else if (jTableRoupa.getSelectedRow() == -1) {
            jBExcluir.setEnabled(true);
            jBAlterar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableRoupaMouseClicked

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        switch (estado) {
            case CRIACAO:
                jBNovo.setEnabled(true);
                jBSalvar.setEnabled(false);
                jBExcluir.setEnabled(false);
                jBAlterar.setEnabled(false);
                jTFCodigo.setEnabled(false);
                jTFDescricao.setEnabled(false);
                jTFCor.setEnabled(false);
                jCBTamanho.setEnabled(false);
                break;
            case INICIALIZACAO:
                jBNovo.setEnabled(true);
                jBSalvar.setEnabled(true);
                jBExcluir.setEnabled(false);
                jBAlterar.setEnabled(false);
                jTFCodigo.setEnabled(true);
                jTFDescricao.setEnabled(true);
                jTFCor.setEnabled(true);
                jCBTamanho.setEnabled(true);
                break;
            case FINALIZAÇAO:
                jBNovo.setEnabled(true);
                jBSalvar.setEnabled(true);
                jBExcluir.setEnabled(false);
                jBAlterar.setEnabled(false);
                jTFCodigo.setEnabled(false);
                jTFDescricao.setEnabled(false);
                jTFCor.setEnabled(false);
                jCBTamanho.setEnabled(false);
                break;
            case ALTERAÇAO:
                jBNovo.setEnabled(false);
                jBSalvar.setEnabled(false);
                jBExcluir.setEnabled(false);
                jBAlterar.setEnabled(true);
                jTFCodigo.setEnabled(false);
                jTFDescricao.setEnabled(true);
                jTFCor.setEnabled(true);
                jCBTamanho.setEnabled(true);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCBTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollRoupa;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTable jTableRoupa;
    // End of variables declaration//GEN-END:variables
}
