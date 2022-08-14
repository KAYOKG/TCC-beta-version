package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaCadastroComprador extends javax.swing.JInternalFrame {

    Gerenciadora g;

    public TelaCadastroComprador(Gerenciadora g) {
        initComponents();
        this.g = g;
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
        botaoEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtIdComprador = new javax.swing.JFormattedTextField();
        botaoCpfComprador = new javax.swing.JRadioButton();
        botaoCnpjComprador = new javax.swing.JRadioButton();
        botaoCadastrar = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        painel1 = new javax.swing.JPanel();
        painelDadosPessoal1 = new javax.swing.JPanel();
        caixatxt1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeVendedor1 = new javax.swing.JTextField();
        txtCpfVendedor1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        painelEstadual3 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        txtEstadual3 = new javax.swing.JFormattedTextField();
        painelEstadual6 = new javax.swing.JLayeredPane();
        txtEstadual6 = new javax.swing.JFormattedTextField();
        painelEstadual7 = new javax.swing.JLayeredPane();
        txtEstadual7 = new javax.swing.JFormattedTextField();
        painelEstadual8 = new javax.swing.JLayeredPane();
        txtEstadual8 = new javax.swing.JFormattedTextField();
        painelEstadual9 = new javax.swing.JLayeredPane();
        txtEstadual9 = new javax.swing.JFormattedTextField();
        botaoAdd1 = new javax.swing.JButton();
        botaoAdd3 = new javax.swing.JButton();
        txtCnpjVendedor1 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        painelEndereco2 = new javax.swing.JLayeredPane();
        txtCidade2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        botaoEndereco2 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtEndereco2 = new javax.swing.JTextField();
        botaoEstado2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        painelEndereco5 = new javax.swing.JLayeredPane();
        txtCidade5 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        botaoEndereco5 = new javax.swing.JComboBox<>();
        txtEndereco5 = new javax.swing.JTextField();
        botaoEstado5 = new javax.swing.JComboBox<>();
        painelEndereco6 = new javax.swing.JLayeredPane();
        txtCidade6 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        botaoEndereco6 = new javax.swing.JComboBox<>();
        txtEndereco6 = new javax.swing.JTextField();
        botaoEstado6 = new javax.swing.JComboBox<>();
        painelEndereco8 = new javax.swing.JLayeredPane();
        txtCidade8 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        botaoEndereco8 = new javax.swing.JComboBox<>();
        txtEndereco8 = new javax.swing.JTextField();
        botaoEstado8 = new javax.swing.JComboBox<>();
        painelEndereco9 = new javax.swing.JLayeredPane();
        txtCidade9 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        botaoEndereco9 = new javax.swing.JComboBox<>();
        txtEndereco9 = new javax.swing.JTextField();
        botaoEstado9 = new javax.swing.JComboBox<>();
        botaoSalvar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro do Comprador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        botaoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

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
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(caixatxt)
                            .addGap(189, 189, 189))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoalLayout.createSequentialGroup()
                            .addComponent(txtNomeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtEstadualComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdComprador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoalLayout.createSequentialGroup()
                                .addComponent(botaoCpfComprador)
                                .addGap(7, 7, 7)
                                .addComponent(botaoCnpjComprador)))
                        .addContainerGap())))
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
                                    .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEstadualComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoEstado))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDadosPessoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
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
                        .addComponent(botaoCadastrar))
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
                .addComponent(botaoCadastrar)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setTitle("Cadastro do Comprador");
        jInternalFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelDadosPessoal1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        caixatxt1.setText("NOME");

        try {
            txtCpfVendedor1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("C.P.F.");

        jLabel10.setText("INSCRIÇÃO ESTADUAL");

        try {
            txtEstadual3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEstadual3.setText("");

        painelEstadual6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            txtEstadual6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        painelEstadual6.setLayer(txtEstadual6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEstadual6Layout = new javax.swing.GroupLayout(painelEstadual6);
        painelEstadual6.setLayout(painelEstadual6Layout);
        painelEstadual6Layout.setHorizontalGroup(
            painelEstadual6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEstadual6Layout.setVerticalGroup(
            painelEstadual6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual6)
        );

        painelEstadual7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            txtEstadual7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        painelEstadual7.setLayer(txtEstadual7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEstadual7Layout = new javax.swing.GroupLayout(painelEstadual7);
        painelEstadual7.setLayout(painelEstadual7Layout);
        painelEstadual7Layout.setHorizontalGroup(
            painelEstadual7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEstadual7Layout.setVerticalGroup(
            painelEstadual7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual7)
        );

        painelEstadual8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            txtEstadual8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        painelEstadual8.setLayer(txtEstadual8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEstadual8Layout = new javax.swing.GroupLayout(painelEstadual8);
        painelEstadual8.setLayout(painelEstadual8Layout);
        painelEstadual8Layout.setHorizontalGroup(
            painelEstadual8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEstadual8Layout.setVerticalGroup(
            painelEstadual8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual8)
        );

        painelEstadual9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        try {
            txtEstadual9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        painelEstadual9.setLayer(txtEstadual9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEstadual9Layout = new javax.swing.GroupLayout(painelEstadual9);
        painelEstadual9.setLayout(painelEstadual9Layout);
        painelEstadual9Layout.setHorizontalGroup(
            painelEstadual9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelEstadual9Layout.setVerticalGroup(
            painelEstadual9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEstadual9)
        );

        botaoAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/add.png"))); // NOI18N

        botaoAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons 1/delete.png"))); // NOI18N

        painelEstadual3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(txtEstadual3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(painelEstadual6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(painelEstadual7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(painelEstadual8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(painelEstadual9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(botaoAdd1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEstadual3.setLayer(botaoAdd3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEstadual3Layout = new javax.swing.GroupLayout(painelEstadual3);
        painelEstadual3.setLayout(painelEstadual3Layout);
        painelEstadual3Layout.setHorizontalGroup(
            painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstadual3Layout.createSequentialGroup()
                .addGroup(painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelEstadual8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEstadual9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEstadual7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEstadual6))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelEstadual3Layout.createSequentialGroup()
                .addGroup(painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEstadual3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(painelEstadual3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEstadual3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(0, 0, 0)
                .addGroup(painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdd1)
                    .addComponent(botaoAdd3))
                .addGap(94, 94, 94))
        );
        painelEstadual3Layout.setVerticalGroup(
            painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEstadual3Layout.createSequentialGroup()
                .addGroup(painelEstadual3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEstadual3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtEstadual3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEstadual6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEstadual7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEstadual8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEstadual9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEstadual3Layout.createSequentialGroup()
                        .addComponent(botaoAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botaoAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        try {
            txtCnpjVendedor1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("C.N.P.J.");

        jLabel19.setText("CIDADE");

        botaoEndereco2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Avenida" }));

        jLabel24.setText("ENDEREÇO");

        botaoEstado2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel25.setText("ESTADO");

        painelEndereco2.setLayer(txtCidade2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(botaoEndereco2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(txtEndereco2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(botaoEstado2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco2.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEndereco2Layout = new javax.swing.GroupLayout(painelEndereco2);
        painelEndereco2.setLayout(painelEndereco2Layout);
        painelEndereco2Layout.setHorizontalGroup(
            painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco2Layout.createSequentialGroup()
                .addComponent(txtCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelEndereco2Layout.createSequentialGroup()
                .addGroup(painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEndereco2Layout.createSequentialGroup()
                        .addComponent(botaoEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEndereco2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(painelEndereco2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel25)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEndereco2Layout.setVerticalGroup(
            painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco2Layout.createSequentialGroup()
                .addGroup(painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade2)
                    .addComponent(botaoEstado2))
                .addGap(0, 0, 0)
                .addComponent(jLabel24)
                .addGap(0, 0, 0)
                .addGroup(painelEndereco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelEndereco5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel26.setText("CIDADE");

        jLabel27.setText("ENDEREÇO");

        jLabel28.setText("ESTADO");

        botaoEndereco5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Avenida" }));

        botaoEstado5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        painelEndereco5.setLayer(txtCidade5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(botaoEndereco5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(txtEndereco5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco5.setLayer(botaoEstado5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEndereco5Layout = new javax.swing.GroupLayout(painelEndereco5);
        painelEndereco5.setLayout(painelEndereco5Layout);
        painelEndereco5Layout.setHorizontalGroup(
            painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelEndereco5Layout.createSequentialGroup()
                        .addComponent(txtCidade5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEndereco5Layout.createSequentialGroup()
                        .addComponent(botaoEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco5))
                    .addGroup(painelEndereco5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEndereco5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel28))
                            .addComponent(jLabel27)))))
        );
        painelEndereco5Layout.setVerticalGroup(
            painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade5)
                    .addComponent(botaoEstado5))
                .addGap(0, 0, 0)
                .addComponent(jLabel27)
                .addGap(0, 0, 0)
                .addGroup(painelEndereco5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelEndereco6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel29.setText("CIDADE");

        jLabel32.setText("ENDEREÇO");

        jLabel33.setText("ESTADO");

        botaoEndereco6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Avenida" }));

        botaoEstado6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        painelEndereco6.setLayer(txtCidade6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(botaoEndereco6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(txtEndereco6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco6.setLayer(botaoEstado6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEndereco6Layout = new javax.swing.GroupLayout(painelEndereco6);
        painelEndereco6.setLayout(painelEndereco6Layout);
        painelEndereco6Layout.setHorizontalGroup(
            painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelEndereco6Layout.createSequentialGroup()
                        .addComponent(txtCidade6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEstado6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEndereco6Layout.createSequentialGroup()
                        .addComponent(botaoEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco6))
                    .addGroup(painelEndereco6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEndereco6Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel33))
                            .addComponent(jLabel32)))))
        );
        painelEndereco6Layout.setVerticalGroup(
            painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade6)
                    .addComponent(botaoEstado6))
                .addGap(0, 0, 0)
                .addComponent(jLabel32)
                .addGap(0, 0, 0)
                .addGroup(painelEndereco6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelEndereco8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel34.setText("CIDADE");

        jLabel35.setText("ENDEREÇO");

        jLabel36.setText("ESTADO");

        botaoEndereco8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Avenida" }));

        botaoEstado8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        painelEndereco8.setLayer(txtCidade8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(botaoEndereco8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(txtEndereco8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco8.setLayer(botaoEstado8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEndereco8Layout = new javax.swing.GroupLayout(painelEndereco8);
        painelEndereco8.setLayout(painelEndereco8Layout);
        painelEndereco8Layout.setHorizontalGroup(
            painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelEndereco8Layout.createSequentialGroup()
                        .addComponent(txtCidade8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEstado8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEndereco8Layout.createSequentialGroup()
                        .addComponent(botaoEndereco8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco8))
                    .addGroup(painelEndereco8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEndereco8Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel36))
                            .addComponent(jLabel35)))))
        );
        painelEndereco8Layout.setVerticalGroup(
            painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade8)
                    .addComponent(botaoEstado8))
                .addGap(0, 0, 0)
                .addComponent(jLabel35)
                .addGap(0, 0, 0)
                .addGroup(painelEndereco8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEndereco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelEndereco9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel37.setText("CIDADE");

        jLabel38.setText("ENDEREÇO");

        jLabel39.setText("ESTADO");

        botaoEndereco9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Avenida" }));

        botaoEstado9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        painelEndereco9.setLayer(txtCidade9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(botaoEndereco9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(txtEndereco9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelEndereco9.setLayer(botaoEstado9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelEndereco9Layout = new javax.swing.GroupLayout(painelEndereco9);
        painelEndereco9.setLayout(painelEndereco9Layout);
        painelEndereco9Layout.setHorizontalGroup(
            painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelEndereco9Layout.createSequentialGroup()
                        .addComponent(txtCidade9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEstado9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEndereco9Layout.createSequentialGroup()
                        .addComponent(botaoEndereco9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco9))
                    .addGroup(painelEndereco9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEndereco9Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel39))
                            .addComponent(jLabel38)))))
        );
        painelEndereco9Layout.setVerticalGroup(
            painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEndereco9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade9)
                    .addComponent(botaoEstado9))
                .addGap(0, 0, 0)
                .addComponent(jLabel38)
                .addGap(0, 0, 0)
                .addGroup(painelEndereco9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEndereco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout painelDadosPessoal1Layout = new javax.swing.GroupLayout(painelDadosPessoal1);
        painelDadosPessoal1.setLayout(painelDadosPessoal1Layout);
        painelDadosPessoal1Layout.setHorizontalGroup(
            painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(caixatxt1)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel9)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel13))
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addComponent(painelEstadual3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                                .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelEndereco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(painelEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelEndereco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addComponent(txtNomeVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCnpjVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        painelDadosPessoal1Layout.setVerticalGroup(
            painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel8))
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel13))
                            .addComponent(caixatxt1))
                        .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnpjVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosPessoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                                .addComponent(painelEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(painelEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelEstadual3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosPessoal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEndereco8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(painelEndereco9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoSalvar1.setText("Salvar");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosPessoal1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(painelDadosPessoal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botaoSalvar1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 216, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 216, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 94, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 94, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificaId(String busca) {

        ArrayList<Comprador> c1;

        c1 = g.getCompradores();

        for (Comprador c : c1) {
            if (busca.equals(c.getId())) {
                throw new CpfInvalidException();
            }
        }
    }

    public void camposObrigatoriosC(String nome, String cidade, String id, String endereco, String insc) {
        if (nome.equals("") || cidade.equals("") || id.equals("   .   .   -  ") || id.equals("  .   .   /    -  ")
                || endereco.equals("") || insc.equals("         .  -  ")) {
            throw new CampoInvalidException();
        }
    }

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            verificaId(txtIdComprador.getText());
            camposObrigatoriosC(txtNomeComprador.getText(), txtCidade.getText(), txtIdComprador.getText(), txtEndereco.getText(), txtEstadualComprador.getText());

            Comprador c = new Comprador();

            c.setNome(txtNomeComprador.getText());
            c.setCidade(txtCidade.getText());
            c.setId(txtIdComprador.getText());
            c.setEndereco(txtEndereco.getText());
            c.setInscEstadual(txtEstadualComprador.getText());
            c.setEstado(botaoEstado.getSelectedItem().toString());

            g.salvarComprador(c);

            JOptionPane.showMessageDialog(null, "Comprador cadastrado com sucesso");

            txtNomeComprador.setText("");
            txtCidade.setText("");
            txtIdComprador.setText("");
            txtEndereco.setText("");
            txtEstadualComprador.setText("");

        } catch (CpfInvalidException | CampoInvalidException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd1;
    private javax.swing.JButton botaoAdd3;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JRadioButton botaoCnpjComprador;
    private javax.swing.JRadioButton botaoCpfComprador;
    private javax.swing.JComboBox<String> botaoEndereco2;
    private javax.swing.JComboBox<String> botaoEndereco5;
    private javax.swing.JComboBox<String> botaoEndereco6;
    private javax.swing.JComboBox<String> botaoEndereco8;
    private javax.swing.JComboBox<String> botaoEndereco9;
    private javax.swing.JComboBox<String> botaoEstado;
    private javax.swing.JComboBox<String> botaoEstado2;
    private javax.swing.JComboBox<String> botaoEstado5;
    private javax.swing.JComboBox<String> botaoEstado6;
    private javax.swing.JComboBox<String> botaoEstado8;
    private javax.swing.JComboBox<String> botaoEstado9;
    private javax.swing.JButton botaoSalvar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caixatxt;
    private javax.swing.JLabel caixatxt1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painelDadosPessoal;
    private javax.swing.JPanel painelDadosPessoal1;
    private javax.swing.JLayeredPane painelEndereco2;
    private javax.swing.JLayeredPane painelEndereco5;
    private javax.swing.JLayeredPane painelEndereco6;
    private javax.swing.JLayeredPane painelEndereco8;
    private javax.swing.JLayeredPane painelEndereco9;
    private javax.swing.JLayeredPane painelEstadual3;
    private javax.swing.JLayeredPane painelEstadual6;
    private javax.swing.JLayeredPane painelEstadual7;
    private javax.swing.JLayeredPane painelEstadual8;
    private javax.swing.JLayeredPane painelEstadual9;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidade2;
    private javax.swing.JTextField txtCidade5;
    private javax.swing.JTextField txtCidade6;
    private javax.swing.JTextField txtCidade8;
    private javax.swing.JTextField txtCidade9;
    private javax.swing.JFormattedTextField txtCnpjVendedor1;
    private javax.swing.JFormattedTextField txtCpfVendedor1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco2;
    private javax.swing.JTextField txtEndereco5;
    private javax.swing.JTextField txtEndereco6;
    private javax.swing.JTextField txtEndereco8;
    private javax.swing.JTextField txtEndereco9;
    private javax.swing.JFormattedTextField txtEstadual3;
    private javax.swing.JFormattedTextField txtEstadual6;
    private javax.swing.JFormattedTextField txtEstadual7;
    private javax.swing.JFormattedTextField txtEstadual8;
    private javax.swing.JFormattedTextField txtEstadual9;
    private javax.swing.JFormattedTextField txtEstadualComprador;
    private javax.swing.JFormattedTextField txtIdComprador;
    private javax.swing.JTextField txtNomeComprador;
    private javax.swing.JTextField txtNomeVendedor1;
    // End of variables declaration//GEN-END:variables
}
