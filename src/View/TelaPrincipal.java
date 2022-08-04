
package View;

public class TelaPrincipal extends javax.swing.JFrame {
      Gerenciadora g = new Gerenciadora();
    public TelaPrincipal() {
        initComponents();
      
    }

    public Gerenciadora getG() {
        return g;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenuItem();
        menuContatos = new javax.swing.JMenuItem();
        menuComprador = new javax.swing.JMenu();
        menuCadastrarComprador = new javax.swing.JMenuItem();
        menuConsultarComprador = new javax.swing.JMenuItem();
        menuVendedor = new javax.swing.JMenu();
        menuCadastrarVendedor = new javax.swing.JMenuItem();
        menuConsultarVendedor = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("primeiraTela"); // NOI18N

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        menuBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/paste_plain.png"))); // NOI18N
        menuArquivo.setText("GERAL");

        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/disk.png"))); // NOI18N
        menuRelatorio.setText("GERAR CONTRATO");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        menuArquivo.add(menuRelatorio);

        menuContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/group.png"))); // NOI18N
        menuContatos.setText("CADASTROS");
        menuContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContatosActionPerformed(evt);
            }
        });
        menuArquivo.add(menuContatos);

        menuBarra.add(menuArquivo);

        menuComprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/money.png"))); // NOI18N
        menuComprador.setText("COMPRADOR");

        menuCadastrarComprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/money_add.png"))); // NOI18N
        menuCadastrarComprador.setText("CADASTRAR");
        menuCadastrarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCompradorActionPerformed(evt);
            }
        });
        menuComprador.add(menuCadastrarComprador);

        menuConsultarComprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/zoom.png"))); // NOI18N
        menuConsultarComprador.setText("CONSULTAR/EDITAR");
        menuConsultarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarCompradorActionPerformed(evt);
            }
        });
        menuComprador.add(menuConsultarComprador);

        menuBarra.add(menuComprador);

        menuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/user.png"))); // NOI18N
        menuVendedor.setText("VENDEDOR");

        menuCadastrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/user_add.png"))); // NOI18N
        menuCadastrarVendedor.setText("CADASTRAR");
        menuCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarVendedorActionPerformed(evt);
            }
        });
        menuVendedor.add(menuCadastrarVendedor);

        menuConsultarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/zoom.png"))); // NOI18N
        menuConsultarVendedor.setText("CONSULTAR/EDITAR");
        menuConsultarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarVendedorActionPerformed(evt);
            }
        });
        menuVendedor.add(menuConsultarVendedor);

        menuBarra.add(menuVendedor);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/help.png"))); // NOI18N
        menuSobre.setText("SOBRE");
        menuBarra.add(menuSobre);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarVendedorActionPerformed
        TelaCadastroVendedor telaCadastroVendedor = new TelaCadastroVendedor(g);
        painelPrincipal.add(telaCadastroVendedor);
        telaCadastroVendedor.setVisible(true);
    }//GEN-LAST:event_menuCadastrarVendedorActionPerformed

    private void menuCadastrarContratoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }
    private void menuCadastrarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCompradorActionPerformed
        TelaCadastroComprador telaCadastroComprador = new TelaCadastroComprador(g);
        painelPrincipal.add(telaCadastroComprador);
        telaCadastroComprador.setVisible(true);
    }//GEN-LAST:event_menuCadastrarCompradorActionPerformed

    private void menuConsultarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarVendedorActionPerformed
        TelaPesquisaVendedor telaPesquisaVendedor = new TelaPesquisaVendedor(g);
        painelPrincipal.add(telaPesquisaVendedor);
        telaPesquisaVendedor.setVisible(true);
    }//GEN-LAST:event_menuConsultarVendedorActionPerformed

    private void menuConsultarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarCompradorActionPerformed
        TelaPesquisaComprador telaPesquisaComprador = new TelaPesquisaComprador(g);
        painelPrincipal.add(telaPesquisaComprador);
        telaPesquisaComprador.setVisible(true);
    }//GEN-LAST:event_menuConsultarCompradorActionPerformed

    private void menuContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuContatosActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        // TODO add your handling code here:
        TelaContrato contratos = new TelaContrato(g);
        painelPrincipal.add(contratos);
        contratos.setVisible(true);
    }//GEN-LAST:event_menuRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuCadastrarComprador;
    private javax.swing.JMenuItem menuCadastrarVendedor;
    private javax.swing.JMenu menuComprador;
    private javax.swing.JMenuItem menuConsultarComprador;
    private javax.swing.JMenuItem menuConsultarVendedor;
    private javax.swing.JMenuItem menuContatos;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVendedor;
    private javax.swing.JDesktopPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
