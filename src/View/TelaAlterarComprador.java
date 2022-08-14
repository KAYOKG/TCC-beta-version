package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaAlterarComprador extends javax.swing.JInternalFrame {

    Gerenciadora g;
    Comprador c;

    public TelaAlterarComprador(Gerenciadora g, Comprador c) {
        initComponents();
        this.g = g;
        this.c = c;

        txtNomeComprador.setText(c.getNome());
        txtIdComprador.setText(c.getId());
        txtCidade.setText(c.getCidade());
        txtEndereco.setText(c.getEndereco());
        txtEstadualComprador.setText(c.getInscEstadual());
        txtEstado.setText(c.getEstado());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painel = new javax.swing.JPanel();
        painelDadosPessoal = new javax.swing.JPanel();
        caixatxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeComprador = new javax.swing.JTextField();
        txtEstadualComprador = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtIdComprador = new javax.swing.JFormattedTextField();
        botaoCpfComprador = new javax.swing.JRadioButton();
        botaoCnpjComprador = new javax.swing.JRadioButton();
        txtEstado = new javax.swing.JTextField();
        botaoAlterarComprador = new javax.swing.JButton();

        setResizable(true);
        setTitle("Alterar Comprador");

        painelDadosPessoal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        caixatxt.setText("NOME");

        try {
            txtEstadualComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEstadualComprador.setText("");

        jLabel4.setText("INSCRIÇÃO ESTADUAL");

        jLabel5.setText("CIDADE");

        jLabel2.setText("ENDEREÇO");

        jLabel6.setText("ESTADO");

        try {
            txtIdComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCompradorActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoCpfComprador);
        botaoCpfComprador.setText("C.P.F.");
        botaoCpfComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCpfCompradorActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoCnpjComprador);
        botaoCnpjComprador.setText("C.N.P.J");
        botaoCnpjComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCnpjCompradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosPessoalLayout = new javax.swing.GroupLayout(painelDadosPessoal);
        painelDadosPessoal.setLayout(painelDadosPessoalLayout);
        painelDadosPessoalLayout.setHorizontalGroup(
            painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(caixatxt)
                            .addGap(230, 230, 230))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoalLayout.createSequentialGroup()
                            .addComponent(txtNomeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)))
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtEstadualComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdComprador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addComponent(botaoCpfComprador)
                                .addGap(7, 7, 7)
                                .addComponent(botaoCnpjComprador)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelDadosPessoalLayout.setVerticalGroup(
            painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7))
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addComponent(caixatxt)
                                .addGap(0, 0, 0)
                                .addComponent(txtNomeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botaoCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoCnpjComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtIdComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEstadualComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botaoAlterarComprador.setText("ALTERAR");
        botaoAlterarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarCompradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoAlterarComprador))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(painelDadosPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addComponent(painelDadosPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botaoAlterarComprador)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCompradorActionPerformed

    private void botaoCpfCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCpfCompradorActionPerformed
        try {
            txtIdComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCpfCompradorActionPerformed

    private void botaoCnpjCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCnpjCompradorActionPerformed
        try {
            txtIdComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCnpjCompradorActionPerformed

    public void verificaId(String idNovo, String idAntigo) {

        ArrayList<Comprador> c1;

        c1 = g.getCompradores();
        if (idNovo.equals(idAntigo)) {

        } else {
            for (Comprador c : c1) {
                if (idNovo.equals(c.getId())) {
                    throw new CpfInvalidException();
                }
            }

        }

    }

    private void botaoAlterarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarCompradorActionPerformed
        try {

            ArrayList<Comprador> compradores = g.getCompradores();

            int i = compradores.indexOf(c);
            String idNovo = txtIdComprador.getText();
            String idAntigo = c.getId();

            verificaId(idNovo, idAntigo);

            c.setNome(txtNomeComprador.getText());
            c.setId(txtIdComprador.getText());
            c.setCidade(txtCidade.getText());
            c.setEndereco(txtEndereco.getText());
            c.setInscEstadual(txtEstadualComprador.getText());
            c.setEstado(txtEstado.getText());

            compradores.set(i, c);
            JOptionPane.showMessageDialog(null, "Comprador Alterado com Sucesso");

            TelaAlterarComprador.this.dispose();

        } catch (CpfInvalidException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_botaoAlterarCompradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarComprador;
    private javax.swing.JRadioButton botaoCnpjComprador;
    private javax.swing.JRadioButton botaoCpfComprador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caixatxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painelDadosPessoal;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtEstadualComprador;
    private javax.swing.JFormattedTextField txtIdComprador;
    private javax.swing.JTextField txtNomeComprador;
    // End of variables declaration//GEN-END:variables
}
