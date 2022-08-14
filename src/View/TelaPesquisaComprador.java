package View;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisaComprador extends javax.swing.JInternalFrame {

    Gerenciadora g;
    Comprador c;

    public TelaPesquisaComprador(Gerenciadora g) {
        initComponents();
        this.g = g;
        ArrayList<Comprador> compradores = g.getCompradores();
        
        for(Comprador c1: compradores){
            
         DefaultTableModel tabelaDoVendedor = (DefaultTableModel) tabelaComprador.getModel();
            Object[] dados = {c1.getNome(), c1.getId(), c1.getInscEstadual(), c1.getEstado(), c1.getCidade(), c1.getEndereco()};
            tabelaDoVendedor.addRow(dados);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaComprador = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoCpfVendedor = new javax.swing.JRadioButton();
        botaoCnpjVendedor = new javax.swing.JRadioButton();
        txtConsultaComprador = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa de Comprador");

        tabelaComprador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "C.P.F. | C.N.P.J.", "INSCRIÇÃO ESTADUAL", "ESTADO", "CIDADE", "ENDEREÇO"
            }
        ));
        tabelaComprador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCompradorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaComprador);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa e Edição de Cadastros"));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/accept.png"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/user_edit.png"))); // NOI18N
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/user_delete.png"))); // NOI18N
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("EDITAR");

        jLabel3.setText("EXCLUIR");

        buttonGroup1.add(botaoCpfVendedor);
        botaoCpfVendedor.setText("C.P.F.");
        botaoCpfVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCpfVendedorActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoCnpjVendedor);
        botaoCnpjVendedor.setText("C.N.P.J");
        botaoCnpjVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCnpjVendedorActionPerformed(evt);
            }
        });

        try {
            txtConsultaComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtConsultaComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaCompradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCpfVendedor)
                        .addGap(7, 7, 7)
                        .addComponent(botaoCnpjVendedor))
                    .addComponent(txtConsultaComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(botaoPesquisar)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoEditar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(botaoExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCpfVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCnpjVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtConsultaComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEditar)
                            .addComponent(botaoPesquisar)
                            .addComponent(botaoExcluir))))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
        String busca = txtConsultaComprador.getText();

        c = g.consultaComprador(busca);
        if (c == null) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ achado");
        
        }

    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        String busca = txtConsultaComprador.getText();

        c = g.consultaComprador(busca);
        if (c == null) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {

            TelaAlterarComprador obj = new TelaAlterarComprador(g, c);
            jPanel2.add(obj, 0);
            obj.setVisible(true);

        }

    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        String busca = txtConsultaComprador.getText();
        boolean verifica;
        verifica = g.removerComprador(busca);
        if (verifica == false) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {
            JOptionPane.showMessageDialog(null, "REMOVIDO COM SUCESSO");
        }

    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCpfVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCpfVendedorActionPerformed
        try {
            txtConsultaComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCpfVendedorActionPerformed

    private void botaoCnpjVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCnpjVendedorActionPerformed
        try {
            txtConsultaComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCnpjVendedorActionPerformed

    private void txtConsultaCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaCompradorActionPerformed

    private void tabelaCompradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCompradorMouseClicked
        // TODO add your handling code here:
     
     
        tabelaComprador.setEnabled(false);
    }//GEN-LAST:event_tabelaCompradorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoCnpjVendedor;
    private javax.swing.JRadioButton botaoCpfVendedor;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaComprador;
    private javax.swing.JFormattedTextField txtConsultaComprador;
    // End of variables declaration//GEN-END:variables
}
