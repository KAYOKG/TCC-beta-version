package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaAlterarVendedor extends javax.swing.JInternalFrame {

    Gerenciadora g;
    Vendedor v;

    public TelaAlterarVendedor(Gerenciadora g, Vendedor v) {
        initComponents();
        this.g = g;
        this.v = v;

        txtNomeVendedor.setText(v.getNome());
        txtIdVendedor.setText(v.getId());
        txtCidade.setText(v.getCidade());
        txtEndereco.setText(v.getEndereco());
        txtEstadualVendedor.setText(v.getInscEstadual());
        txtEstadoVendedor.setText(v.getEstado());

        txtAgencia.setText(v.getAgencia());
        txtBanco.setText(v.getBanco());
        txtBancoCidade.setText(v.getCidadeBanco());
        txtContaBanco.setText(v.getConta());
        txtBancoEstado.setText(v.getEstadoBanco());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        painel = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        painelPessoal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JTextField();
        txtIdVendedor = new javax.swing.JFormattedTextField();
        botaoCpfVendedor = new javax.swing.JRadioButton();
        botaoCnpjVendedor = new javax.swing.JRadioButton();
        txtEstadualVendedor = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtEstadoVendedor = new javax.swing.JTextField();
        painelBancario = new javax.swing.JPanel();
        painelBanco = new javax.swing.JLayeredPane();
        txtBanco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBancoCidade = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContaBanco = new javax.swing.JTextField();
        txtBancoEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setResizable(true);
        setTitle("Alterar Vendedor");

        botaoCadastrar.setText("ALTERAR");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        painelPessoal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("NOME");

        try {
            txtIdVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVendedorActionPerformed(evt);
            }
        });

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
            txtEstadualVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEstadualVendedor.setText("");
        txtEstadualVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadualVendedorActionPerformed(evt);
            }
        });

        jLabel4.setText("INSCRIÇÃO ESTADUAL");

        jLabel5.setText("CIDADE");

        jLabel6.setText("ESTADO");

        jLabel2.setText("ENDEREÇO");

        javax.swing.GroupLayout painelPessoalLayout = new javax.swing.GroupLayout(painelPessoal);
        painelPessoal.setLayout(painelPessoalLayout);
        painelPessoalLayout.setHorizontalGroup(
            painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPessoalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPessoalLayout.createSequentialGroup()
                                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPessoalLayout.createSequentialGroup()
                                        .addComponent(botaoCpfVendedor)
                                        .addGap(7, 7, 7)
                                        .addComponent(botaoCnpjVendedor)))
                                .addGap(280, 280, 280))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadualVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(274, 274, 274))
        );
        painelPessoalLayout.setVerticalGroup(
            painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botaoCpfVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCnpjVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade)
                    .addComponent(txtEstadualVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        painelBancario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Bancários", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel8.setText("NOME DO BANCO");

        jLabel14.setText("CIDADE");

        try {
            txtAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("ESTADO");

        jLabel10.setText("AGÊNCIA");

        txtContaBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContaBancoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContaBancoKeyTyped(evt);
            }
        });

        jLabel3.setText("CONTA");

        painelBanco.setLayer(txtBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtBancoCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtAgencia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtContaBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtBancoEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelBancoLayout = new javax.swing.GroupLayout(painelBanco);
        painelBanco.setLayout(painelBancoLayout);
        painelBancoLayout.setHorizontalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelBancoLayout.createSequentialGroup()
                            .addComponent(txtBancoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBancoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelBancoLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel14)
                            .addGap(168, 168, 168)
                            .addComponent(jLabel13)))
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        painelBancoLayout.setVerticalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBancoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBancoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout painelBancarioLayout = new javax.swing.GroupLayout(painelBancario);
        painelBancario.setLayout(painelBancarioLayout);
        painelBancarioLayout.setHorizontalGroup(
            painelBancarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelBancarioLayout.setVerticalGroup(
            painelBancarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancarioLayout.createSequentialGroup()
                .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addComponent(painelPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(botaoCadastrar))
                    .addComponent(painelBancario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(painelBancario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar))
                    .addComponent(painelPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
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

    public void verificaId(String idNovo, String idAntigo) {

        ArrayList<Vendedor> v1;

        v1 = g.getVendedores();
        if (idNovo.equals(idAntigo)) {

        } else {
            for (Vendedor vend : v1) {
                if (idNovo.equals(vend.getId())) {
                    throw new CpfInvalidException();
                }
            }

        }

    }
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        try {

            ArrayList<Vendedor> vendedores = g.getVendedores();

            int i = vendedores.indexOf(v);
            String idNovo = txtIdVendedor.getText();
            String idAntigo = v.getId();

            verificaId(idNovo, idAntigo);

            v.setNome(txtNomeVendedor.getText());
            v.setId(txtIdVendedor.getText());
            v.setCidade(txtCidade.getText());
            v.setEndereco(txtEndereco.getText());
            v.setInscEstadual(txtEstadualVendedor.getText());
            v.setEstado(txtEstadoVendedor.getText());

            v.setAgencia(txtAgencia.getText());
            v.setBanco(txtBanco.getText());
            v.setCidadeBanco(txtBancoCidade.getText());
            v.setConta(txtContaBanco.getText());
            v.setEstadoBanco(txtBancoEstado.getText());

            vendedores.set(i, v);
            JOptionPane.showMessageDialog(null, "Vendedor Alterado com Sucesso");

            TelaAlterarVendedor.this.dispose();

        } catch (CpfInvalidException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void txtIdVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVendedorActionPerformed

    private void botaoCpfVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCpfVendedorActionPerformed
        try {
            txtIdVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCpfVendedorActionPerformed

    private void botaoCnpjVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCnpjVendedorActionPerformed
        try {
            txtIdVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botaoCnpjVendedorActionPerformed

    private void txtEstadualVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadualVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadualVendedorActionPerformed

    private void txtContaBancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContaBancoKeyPressed
        if (txtContaBanco.getText().length() > 13) {
            txtContaBanco.setText(txtContaBanco.getText().substring(0, 13));
        }
    }//GEN-LAST:event_txtContaBancoKeyPressed

    private void txtContaBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContaBancoKeyTyped
        String caracteres = "0987654321.-";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContaBancoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JRadioButton botaoCnpjVendedor;
    private javax.swing.JRadioButton botaoCpfVendedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painelBancario;
    private javax.swing.JLayeredPane painelBanco;
    private javax.swing.JPanel painelPessoal;
    private javax.swing.JFormattedTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtBancoCidade;
    private javax.swing.JTextField txtBancoEstado;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtContaBanco;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstadoVendedor;
    private javax.swing.JFormattedTextField txtEstadualVendedor;
    private javax.swing.JFormattedTextField txtIdVendedor;
    private javax.swing.JTextField txtNomeVendedor;
    // End of variables declaration//GEN-END:variables
}
