package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisaVendedor extends javax.swing.JInternalFrame {

    Gerenciadora g;
    Vendedor v;

    public TelaPesquisaVendedor(Gerenciadora g) {
        initComponents();
        this.g = g;
        
        ArrayList<Vendedor> vendedores = g.getVendedores();
        
        for(Vendedor v1 : vendedores){
            
            DefaultTableModel tabelaDoVendedor = (DefaultTableModel) tabelaVendedor.getModel();
            
            Object[] dados = {v1.getNome(), v1.getId(), v1.getInscEstadual(), v1.getEstado(), v1.getCidade(),v1.getEndereco(), v1.getConta(),
                v1.getAgencia(), v1.getBanco(), v1.getEstadoBanco(), v1.getCidadeBanco()};
            
            tabelaDoVendedor.addRow(dados);
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVendedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoCpfVendedorP = new javax.swing.JRadioButton();
        botaoCnpjVendedorP = new javax.swing.JRadioButton();
        txtConsultaVendedor = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa de Vendedor");
        setNormalBounds(new java.awt.Rectangle(30, 60, 104, 40));

        tabelaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "C.P.F. | C.N.P.J.", "INSCRIÇÃO ESTADUAL", "ESTADO", "CIDADE", "ENDEREÇO", "CONTA", "AGÊNCIA", "BANCO", "ESTADO", "CIDADE"
            }
        ));
        tabelaVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaVendedor);

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

        buttonGroup1.add(botaoCpfVendedorP);
        botaoCpfVendedorP.setText("C.P.F.");
        botaoCpfVendedorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCpfVendedorPActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoCnpjVendedorP);
        botaoCnpjVendedorP.setText("C.N.P.J");
        botaoCnpjVendedorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCnpjVendedorPActionPerformed(evt);
            }
        });

        try {
            txtConsultaVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCpfVendedorP)
                        .addGap(7, 7, 7)
                        .addComponent(botaoCnpjVendedorP))
                    .addComponent(txtConsultaVendedor))
                .addGap(0, 0, 0)
                .addComponent(botaoPesquisar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(botaoEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoExcluir)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(botaoCpfVendedorP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCnpjVendedorP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoEditar)
                    .addComponent(botaoPesquisar)
                    .addComponent(botaoExcluir)
                    .addComponent(txtConsultaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
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


    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:

        String busca = txtConsultaVendedor.getText();

        v = g.consultaVendedor(busca);
        if (v == null) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {

            TelaAlterarVendedor obj = new TelaAlterarVendedor(g, v);
            jPanel2.add(obj, 0);
            obj.setVisible(true);

        }

    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        String busca = txtConsultaVendedor.getText();
        boolean verifica;
        verifica = g.removerVendedor(busca);
        if (verifica == false) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {
            JOptionPane.showMessageDialog(null, "REMOVIDO COM SUCESSO");
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed

        String busca = txtConsultaVendedor.getText();
     
        v = g.buscaCpf(busca);
        if (v == null) {
            JOptionPane.showMessageDialog(null, "CPF/CNPJ INEXISTENTE");
        } else {          
            JOptionPane.showMessageDialog(null, "CPF/CNPJ achado");
          
        }


    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoCpfVendedorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCpfVendedorPActionPerformed
        try {
            txtConsultaVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCpfVendedorPActionPerformed

    private void botaoCnpjVendedorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCnpjVendedorPActionPerformed
        try {
            txtConsultaVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCnpjVendedorPActionPerformed

    private void tabelaVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendedorMouseClicked
        // TODO add your handling code here:
         tabelaVendedor.setEnabled(false);
    }//GEN-LAST:event_tabelaVendedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoCnpjVendedorP;
    private javax.swing.JRadioButton botaoCpfVendedorP;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaVendedor;
    private javax.swing.JFormattedTextField txtConsultaVendedor;
    // End of variables declaration//GEN-END:variables
}
