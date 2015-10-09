/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dados.Funcionario;
import javax.swing.JOptionPane;
import repositorio.RepositorioFuncionario;

/**
 *
 * @author fabio
 */
public class TelaFuncionario extends javax.swing.JFrame {

    //Criando Objeto Do Repositório
    RepositorioFuncionario repositorioFuncionario;

    //Criando Objeto Da Tela
    TelaEditarFuncionario chamaTelaEditF;

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
        repositorioFuncionario = new RepositorioFuncionario();
        jTable1.setModel(repositorioFuncionario);
        //Inicializa Funcionários Para Teste
        repositorioFuncionario.inicializaFuncionarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTPesquisaF = new javax.swing.JTextField();
        jBPesquisaF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTNomeF = new javax.swing.JTextField();
        jTCpfF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTEmailF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTTelF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFuncF = new javax.swing.JTextField();
        jBAddF = new javax.swing.JButton();
        jBRemoveF = new javax.swing.JButton();
        jBEditaF = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Funcionário");
        setResizable(false);

        jLabel1.setText("Nome: ");

        jBPesquisaF.setText("Pesquisar!");
        jBPesquisaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaFActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("Nome:");

        jLabel3.setText("Cpf: ");

        jLabel4.setText("Email: ");

        jLabel5.setText("Telefone: ");

        jLabel6.setText("Função:");

        jBAddF.setText("Adicionar !");
        jBAddF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddFActionPerformed(evt);
            }
        });

        jBRemoveF.setText("Remover !");
        jBRemoveF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveFActionPerformed(evt);
            }
        });

        jBEditaF.setText("Editar!");
        jBEditaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditaFActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCpfF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEmailF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTTelF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 148, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFuncF, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jBAddF)
                                .addGap(18, 18, 18)
                                .addComponent(jBRemoveF)
                                .addGap(18, 18, 18)
                                .addComponent(jBEditaF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisaF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCpfF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmailF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTelF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFuncF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAddF)
                    .addComponent(jBRemoveF)
                    .addComponent(jBEditaF)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botão Para Sair

        int opcao = JOptionPane.showConfirmDialog(this, "Você Quer Voltar Para Tela Principal ?", null, JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();

            //Limpando Os Campos Após Sair
            jTPesquisaF.setText("");
            jTNomeF.setText("");
            jTCpfF.setText("");
            jTEmailF.setText("");
            jTTelF.setText("");
            jTFuncF.setText("");

            //Desselecionando Qualquer Linha
            jTable1.clearSelection();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBAddFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddFActionPerformed
        // Botão Para Adicionar
        if (jTNomeF.getText().length() > 0 && jTCpfF.getText().length() > 0 && jTEmailF.getText().length() > 0 && jTTelF.getText().length() > 0 && jTFuncF.getText().length() > 0) {
            //Pegando Campos
            String nome = jTNomeF.getText();
            String cpf = jTCpfF.getText();
            String email = jTEmailF.getText();
            String tel = jTTelF.getText();
            String funcao = jTFuncF.getText();

            //Adicionando Para O ArrayList
            Funcionario func = new Funcionario(nome, cpf, email, tel, funcao);
            repositorioFuncionario.addFuncionario(func);

            //Limpando Os Campos
            jTNomeF.setText("");
            jTCpfF.setText("");
            jTEmailF.setText("");
            jTTelF.setText("");
            jTFuncF.setText("");

            JOptionPane.showMessageDialog(this, "Funcionário Adicionado Com Sucesso" + "\n" + func);

        } else {
            JOptionPane.showMessageDialog(this, "Campo(s) Em Branco");
        }
    }//GEN-LAST:event_jBAddFActionPerformed

    private void jBRemoveFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveFActionPerformed
        // Botão Para Remover
        if (jTable1.getRowCount() != 0) {

            //Verifica Se Tem Linha Selecionada
            if (jTable1.getSelectedRow() != -1) {

                Funcionario funcSelect = repositorioFuncionario.getFuncionario(jTable1.getSelectedRow());

                int opcao = JOptionPane.showConfirmDialog(this, funcSelect, "Quer Remover O Funcionário ? ", JOptionPane.YES_NO_OPTION);

                if (opcao == JOptionPane.YES_OPTION) {
                    repositorioFuncionario.removeFuncionario(jTable1.getSelectedRow());
                    JOptionPane.showMessageDialog(this, "Funcionário Removido Com Sucesso");

                } else {
                    JOptionPane.showMessageDialog(this, "Remoção Abortada");
                    jTable1.clearSelection();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum Funcionário Selecionado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não Tem Funcionários Cadastrados No Sistema");
        }

    }//GEN-LAST:event_jBRemoveFActionPerformed

    private void jBEditaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditaFActionPerformed
        // Botão Para Editar
        if (jTable1.getRowCount() != 0) {

            //Verifica Se Tem Linha Selecionada
            if (jTable1.getSelectedRow() != -1) {
                Funcionario funcSelect = repositorioFuncionario.getFuncionario(jTable1.getSelectedRow());

                int opcao = JOptionPane.showConfirmDialog(this, funcSelect, "Quer Remover O Funcionário ? ", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {

                    if (chamaTelaEditF == null) {
                        chamaTelaEditF = new TelaEditarFuncionario(funcSelect);
                    }

                    chamaTelaEditF.setVisible(true);
                    repositorioFuncionario.AtualizaTablef();

                } else {
                    JOptionPane.showMessageDialog(this, "Edição Abortada");
                    jTable1.clearSelection();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum Funcionário Selecionado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não Tem Funcionário Cadastrado");
        }

    }//GEN-LAST:event_jBEditaFActionPerformed

    private void jBPesquisaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaFActionPerformed
        // Botão Pesquisar
        if (jTPesquisaF.getText().length() > 0) {
            Funcionario f = repositorioFuncionario.pesquisaFuncionario(jTPesquisaF.getText());

            if (f != null) {
                //Mostra Caso Encontre
                JOptionPane.showMessageDialog(this, "Funcionário Encontrado");
                JOptionPane.showMessageDialog(this, f);
                //Limpando Campo
                jTPesquisaF.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Não Possui Funcionário Com Esse Nome Cadastrado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campo Em Branco");
        }
    }//GEN-LAST:event_jBPesquisaFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddF;
    private javax.swing.JButton jBEditaF;
    private javax.swing.JButton jBPesquisaF;
    private javax.swing.JButton jBRemoveF;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCpfF;
    private javax.swing.JTextField jTEmailF;
    private javax.swing.JTextField jTFuncF;
    private javax.swing.JTextField jTNomeF;
    private javax.swing.JTextField jTPesquisaF;
    private javax.swing.JTextField jTTelF;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
