package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaCadastroVendedor extends javax.swing.JInternalFrame {

    Gerenciadora g;

    public TelaCadastroVendedor(Gerenciadora g) {
        initComponents();
        botaoBancoAdicionar.setVisible(false);
        painelBanco1.setVisible(false);
        jLabel3.setVisible(false);
        this.g = g;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        painelPessoal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JTextField();
        txtIdVendedor = new javax.swing.JFormattedTextField();
        botaoCpfVendedor = new javax.swing.JRadioButton();
        botaoCnpjVendedor = new javax.swing.JRadioButton();
        txtEstadualVendedor = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        botaoEstado1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        painelBancario = new javax.swing.JPanel();
        painelBanco = new javax.swing.JLayeredPane();
        txtBanco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBancoCidade = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JFormattedTextField();
        botaoBancoEstado = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botaoConta = new javax.swing.JComboBox<>();
        txtConta = new javax.swing.JTextField();
        botaoBancoAdicionar = new javax.swing.JButton();
        painelBanco1 = new javax.swing.JLayeredPane();
        jLabel20 = new javax.swing.JLabel();
        txtBanco1 = new javax.swing.JTextField();
        txtAgencia1 = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        txtConta1 = new javax.swing.JTextField();
        botaoConta1 = new javax.swing.JComboBox<>();
        botaoBancoDelete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtBancoCidade1 = new javax.swing.JTextField();
        botaoBancoEstado1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro do Vendedor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

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

        buttonGroup.add(botaoCpfVendedor);
        botaoCpfVendedor.setText("C.P.F.");
        botaoCpfVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCpfVendedorActionPerformed(evt);
            }
        });

        buttonGroup.add(botaoCnpjVendedor);
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

        botaoEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel6.setText("ESTADO");

        jLabel2.setText("ENDEREÇO");

        jLabel3.setText("Obs: PARA FUTURAS IMPLEMENTAÇÕES->");

        javax.swing.GroupLayout painelPessoalLayout = new javax.swing.GroupLayout(painelPessoal);
        painelPessoal.setLayout(painelPessoalLayout);
        painelPessoalLayout.setHorizontalGroup(
            painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPessoalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel6))
                    .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelPessoalLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addComponent(botaoCpfVendedor)
                        .addGap(7, 7, 7)
                        .addComponent(botaoCnpjVendedor))
                    .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)))
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstadualVendedor)
                .addGap(268, 268, 268))
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGroup(painelPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addGroup(painelPessoalLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(botaoEstado1)
                    .addComponent(txtEstadualVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(painelPessoalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel7)
                .addGap(18, 18, Short.MAX_VALUE))
        );

        botaoEstado1.getAccessibleContext().setAccessibleName("");

        painelBancario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Bancários", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel8.setText("NOME DO BANCO");

        jLabel14.setText("CIDADE");

        try {
            txtAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoBancoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel13.setText("ESTADO");

        jLabel10.setText("AGÊNCIA");

        botaoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTA", "CORRENTE", "POUPANÇA" }));
        botaoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContaActionPerformed(evt);
            }
        });

        txtConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContaKeyTyped(evt);
            }
        });

        botaoBancoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/add.png"))); // NOI18N
        botaoBancoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBancoAdicionarActionPerformed(evt);
            }
        });

        painelBanco.setLayer(txtBanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtBancoCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtAgencia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(botaoBancoEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(botaoConta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(txtConta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco.setLayer(botaoBancoAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelBancoLayout = new javax.swing.GroupLayout(painelBanco);
        painelBanco.setLayout(painelBancoLayout);
        painelBancoLayout.setHorizontalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10)))
                .addGap(7, 7, 7)
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConta)
                    .addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel13))
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addComponent(txtBancoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBancoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoBancoAdicionar))
        );
        painelBancoLayout.setVerticalGroup(
            painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancoLayout.createSequentialGroup()
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBancoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoBancoEstado)))
                    .addGroup(painelBancoLayout.createSequentialGroup()
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGroup(painelBancoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoBancoAdicionar))))))
        );

        painelBanco1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel20.setText("NOME DO BANCO");

        try {
            txtAgencia1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel21.setText("AGÊNCIA");

        botaoConta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTA", "CORRENTE", "POUPANÇA" }));

        botaoBancoDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/delete.png"))); // NOI18N

        jLabel22.setText("CIDADE");

        botaoBancoEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel15.setText("ESTADO");

        painelBanco1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(txtBanco1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(txtAgencia1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(txtConta1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(botaoConta1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(botaoBancoDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(txtBancoCidade1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(botaoBancoEstado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelBanco1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelBanco1Layout = new javax.swing.GroupLayout(painelBanco1);
        painelBanco1.setLayout(painelBanco1Layout);
        painelBanco1Layout.setHorizontalGroup(
            painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBanco1Layout.createSequentialGroup()
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addComponent(txtBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBancoCidade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelBanco1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel21)))))
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(botaoBancoEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBancoDelete))
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoConta1, 0, 100, Short.MAX_VALUE)
                            .addComponent(txtConta1)))
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        painelBanco1Layout.setVerticalGroup(
            painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBanco1Layout.createSequentialGroup()
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(painelBanco1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22))
                .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBanco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoBancoEstado1)
                        .addComponent(txtBancoCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoBancoDelete)))
        );

        javax.swing.GroupLayout painelBancarioLayout = new javax.swing.GroupLayout(painelBancario);
        painelBancario.setLayout(painelBancarioLayout);
        painelBancarioLayout.setHorizontalGroup(
            painelBancarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(painelBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelBancarioLayout.setVerticalGroup(
            painelBancarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBancarioLayout.createSequentialGroup()
                .addComponent(painelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(painelBanco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelBancario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelBancario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPessoal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(botaoCadastrar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContaKeyTyped
        String caracteres = "0987654321.-";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContaKeyTyped

    private void txtContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContaKeyPressed
        if (txtConta.getText().length() > 13) {
            txtConta.setText(txtConta.getText().substring(0, 13));
        }
    }//GEN-LAST:event_txtContaKeyPressed

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

    private void botaoBancoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBancoAdicionarActionPerformed
        if (botaoBancoAdicionar.isSelected()) {
            painelBanco1.setVisible(true);
        }
    }//GEN-LAST:event_botaoBancoAdicionarActionPerformed

    public void verificaCpf(String busca) {

        ArrayList<Vendedor> v1;

        v1 = g.getVendedores();

        for (Vendedor v : v1) {
            if (busca.equals(v.getId())) {
                throw new CpfInvalidException();
            }
        }
    }

    public void camposObrigatoriosV(String nome, String cidade, String id, String endereco, String insc) {
        if (nome.equals("") || cidade.equals("") || id.equals("   .   .   -  ") || id.equals("  .   .   /    -  ")
                || endereco.equals("") || insc.equals("         .  -  ")) {
            throw new CampoInvalidException();
        }
    }


    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            camposObrigatoriosV(txtNomeVendedor.getText(), txtCidade.getText(), txtIdVendedor.getText(),
                    txtEndereco.getText(), txtEstadualVendedor.getText());

            verificaCpf(txtIdVendedor.getText());

            Vendedor v = new Vendedor();

            v.setNome(txtNomeVendedor.getText());
            v.setCidade(txtCidade.getText());
            v.setId(txtIdVendedor.getText());
            v.setEndereco(txtEndereco.getText());
            v.setInscEstadual(txtEstadualVendedor.getText());
            v.setCidade(txtCidade.getText());
            v.setEstado(botaoEstado1.getSelectedItem().toString());
            v.setTipoConta(botaoConta.getSelectedItem().toString());
            v.setEstadoBanco(botaoBancoEstado.getSelectedItem().toString());
            v.setAgencia(txtAgencia.getText());
            v.setBanco(txtBanco.getText());
            v.setCidadeBanco(txtBancoCidade.getText());
            v.setConta(txtConta.getText());

            g.salvarVendedor(v);

            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso");

            txtNomeVendedor.setText("");
            txtAgencia.setText("");
            txtBanco.setText("");
            txtCidade.setText("");
            txtIdVendedor.setText("");
            txtBancoCidade.setText("");
            txtConta.setText("");
            txtEndereco.setText("");
            txtEstadualVendedor.setText("");
            txtCidade.setText("");

        } catch (CpfInvalidException | CampoInvalidException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void txtEstadualVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadualVendedorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEstadualVendedorActionPerformed

    private void botaoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContaActionPerformed

    private void txtIdVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBancoAdicionar;
    private javax.swing.JButton botaoBancoDelete;
    private javax.swing.JComboBox<String> botaoBancoEstado;
    private javax.swing.JComboBox<String> botaoBancoEstado1;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JRadioButton botaoCnpjVendedor;
    private javax.swing.JComboBox<String> botaoConta;
    private javax.swing.JComboBox<String> botaoConta1;
    private javax.swing.JRadioButton botaoCpfVendedor;
    private javax.swing.JComboBox<String> botaoEstado1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painelBancario;
    private javax.swing.JLayeredPane painelBanco;
    private javax.swing.JLayeredPane painelBanco1;
    private javax.swing.JPanel painelPessoal;
    private javax.swing.JFormattedTextField txtAgencia;
    private javax.swing.JFormattedTextField txtAgencia1;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtBanco1;
    private javax.swing.JTextField txtBancoCidade;
    private javax.swing.JTextField txtBancoCidade1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtConta1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtEstadualVendedor;
    private javax.swing.JFormattedTextField txtIdVendedor;
    private javax.swing.JTextField txtNomeVendedor;
    // End of variables declaration//GEN-END:variables
}
