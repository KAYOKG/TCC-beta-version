package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaContrato extends javax.swing.JInternalFrame {

    Gerenciadora g;
    ArrayList<Comprador> compradores;
    ArrayList<Vendedor> vendedores;

    public TelaContrato(Gerenciadora g) {
        initComponents();
        this.g = g;
        compradores = g.getCompradores();
        vendedores = g.getVendedores();
        for (Comprador c : compradores) {
            botaoComprador.addItem(c.getNome());
        }

        for (Vendedor v : vendedores) {
            botaovendedor.addItem(v.getNome());
        }
    }

    @SuppressWarnings("unchecked")

    public void verificaContrato(String busca) {

        ArrayList<Corretora> c1;

        c1 = g.getContratos();

        for (Corretora v : c1) {
            if (busca.equals(v.getIdContrato())) {
                throw new NumeroContratoInvalidException();
            }
        }
    }

    public void camposObrigatorios(String contrato, String produto, String qnt, String preco) {
        if (contrato.equals("") || produto.equals("") || preco.equals("")) {
            throw new CampoInvalidException();
        }
    }
    
      public void camposObrigatorios(String Idcontrato) {
        if (Idcontrato.equals("")) {
            throw new CampoIdInvalidException();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JSpinner();
        txtNumeroContrato = new javax.swing.JTextField();
        botaoAlterarContrato = new javax.swing.JButton();
        botaoExcluirContrato = new javax.swing.JButton();
        botaoConsultaContrato = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botaoComprador = new javax.swing.JComboBox<>();
        txtEnderecoComprador = new javax.swing.JTextField();
        txtIdComprador = new javax.swing.JTextField();
        txtCidadeComprador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtInscricaoComprador = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCidadeVendedor = new javax.swing.JTextField();
        txtInscricaoVendedor = new javax.swing.JFormattedTextField();
        botaovendedor = new javax.swing.JComboBox<>();
        txtEnderecoVendedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdVendedor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtBanco = new javax.swing.JTextField();
        txtContaBanco = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JFormattedTextField();
        txtCidadeBanco = new javax.swing.JTextField();
        txtEstadoBanco = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        txtPreco = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextPane();
        botaoGerarContrato = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Geração de Contrato");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Corretora", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("N° do contrato:");

        jLabel3.setText("Data:");

        txtData.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1659583560000L), null, java.util.Calendar.DAY_OF_MONTH));

        botaoAlterarContrato.setText("ALTERAR");
        botaoAlterarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarContratoActionPerformed(evt);
            }
        });

        botaoExcluirContrato.setText("EXCLUIR");
        botaoExcluirContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirContratoActionPerformed(evt);
            }
        });

        botaoConsultaContrato.setText("CONSULTAR");
        botaoConsultaContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroContrato))
                .addGap(182, 182, 182)
                .addComponent(botaoConsultaContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAlterarContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluirContrato)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultaContrato)
                    .addComponent(botaoAlterarContrato)
                    .addComponent(botaoExcluirContrato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPRADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        botaoComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCompradorActionPerformed(evt);
            }
        });

        txtEnderecoComprador.setEditable(false);
        txtEnderecoComprador.setText("ENDEREÇO");

        txtIdComprador.setEditable(false);
        txtIdComprador.setText("CPF | CNPJ");

        txtCidadeComprador.setEditable(false);
        txtCidadeComprador.setText("CIDADE");

        jLabel1.setText("INSCRIÇÃO ESTADUAL:");

        txtInscricaoComprador.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnderecoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInscricaoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInscricaoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENDEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtCidadeVendedor.setEditable(false);
        txtCidadeVendedor.setText("CIDADE");

        txtInscricaoVendedor.setEditable(false);
        try {
            txtInscricaoVendedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaovendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaovendedorActionPerformed(evt);
            }
        });

        txtEnderecoVendedor.setEditable(false);
        txtEnderecoVendedor.setText("ENDEREÇO");

        jLabel4.setText("INSCRIÇÃO ESTADUAL:");

        txtIdVendedor.setEditable(false);
        txtIdVendedor.setText("CPF | CNPJ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnderecoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInscricaoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInscricaoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BANCO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtBanco.setEditable(false);
        txtBanco.setText("Nome do Banco");

        txtContaBanco.setEditable(false);
        txtContaBanco.setText("Tipo de Conta");

        txtAgencia.setEditable(false);
        txtAgencia.setText("Agencia");

        txtCidadeBanco.setEditable(false);
        txtCidadeBanco.setText("CIDADE");

        txtEstadoBanco.setEditable(false);
        txtEstadoBanco.setText("AC");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidadeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstadoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCidadeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtEstadoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIÇÃO DA VENDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel5.setText("PRODUTO");

        jLabel6.setText("PREÇO");

        jLabel7.setText("DESCRIÇÃO");

        jLabel8.setText("TOTAL");

        jScrollPane1.setViewportView(txtDescricao);

        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoKeyReleased(evt);
            }
        });

        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jLabel10.setText("QNT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel9.setText("OBSERVAÇÃO");

        jScrollPane2.setViewportView(txtObservacao);

        botaoGerarContrato.setText("GERAR CONTRATO");
        botaoGerarContrato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoGerarContrato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoGerarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoGerarContrato)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botaoGerarContrato)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarContratoActionPerformed
        try {
            camposObrigatorios(txtNumeroContrato.getText(), txtProduto.getText(),
                    txtQuantidade.getText(), txtPreco.getText());

            verificaContrato(txtNumeroContrato.getText());

            int iC = botaoComprador.getSelectedIndex();
            Comprador c = compradores.get(iC);

            int iV = botaovendedor.getSelectedIndex();
            Vendedor v = vendedores.get(iV);

            Corretora contrato = new Corretora(txtNumeroContrato.getText(), txtData.getValue().toString(),
                    txtDescricao.getText(), txtObservacao.getText(), txtProduto.getText() ,Float.parseFloat(txtPreco.getText()),
                    Float.parseFloat(txtTotal.getText()), Integer.parseInt(txtQuantidade.getText()), c, v);

            g.salvarContrato(contrato);

            JOptionPane.showMessageDialog(null, "Contrato finalizado com SUCESSO!");

            txtNumeroContrato.setText("");
            txtProduto.setText("");
            txtQuantidade.setText("");
            txtPreco.setText("");
            txtDescricao.setText("");
            txtTotal.setText("");
            txtObservacao.setText("");
            

        } catch (NumeroContratoInvalidException | CampoInvalidException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_botaoGerarContratoActionPerformed

    private void botaoCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCompradorActionPerformed

        int i = botaoComprador.getSelectedIndex();
        Comprador c = compradores.get(i);
        txtIdComprador.setText(c.getId());
        txtInscricaoComprador.setText(c.getInscEstadual());
        txtCidadeComprador.setText(c.getCidade());
        txtEnderecoComprador.setText(c.getEndereco());

    }//GEN-LAST:event_botaoCompradorActionPerformed

    private void botaovendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaovendedorActionPerformed

        int i = botaovendedor.getSelectedIndex();
        Vendedor v = vendedores.get(i);

        txtIdVendedor.setText(v.getId());
        txtInscricaoVendedor.setText(v.getInscEstadual());
        txtCidadeVendedor.setText(v.getCidade());
        txtEnderecoVendedor.setText(v.getEndereco());

        txtAgencia.setText(v.getAgencia());
        txtBanco.setText(v.getBanco());
        txtCidadeBanco.setText(v.getCidadeBanco());
        txtContaBanco.setText(v.getTipoConta());
        txtEstadoBanco.setText(v.getEstadoBanco());

    }//GEN-LAST:event_botaovendedorActionPerformed

    private void txtPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyReleased

        float total = Float.parseFloat(txtPreco.getText()) * Float.parseFloat(txtQuantidade.getText());
        txtTotal.setText("" + total);
    }//GEN-LAST:event_txtPrecoKeyReleased

    private void botaoConsultaContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaContratoActionPerformed
        // TODO add your handling code here:
        try{
            
            String id = txtNumeroContrato.getText();
            camposObrigatorios(id);
  
           Corretora c = g.buscaContrato(id);
           if(c == null){
                JOptionPane.showMessageDialog(null, "Id de contrato Inexistente!!!");

           }else{
               JOptionPane.showMessageDialog(null, "Id Encontrado!!!");
               
               txtData.setToolTipText(c.getData()); 
               txtDescricao.setText(c.getDescricao());
               txtProduto.setText(c.getProduto());
               txtQuantidade.setText("" + c.getQuantidade());
               txtPreco.setText("" + c.getPreco());
               txtObservacao.setText(c.getObservacao());
               txtTotal.setText("" + c.getTotal());
               
               Comprador c1 = c.getC();
               Vendedor v1 = c.getV();
               
               String buscaNomeC = c1.getNome();
               String buscaNomeV = v1.getNome();
               
               for(int i = 0; i < botaoComprador.getItemCount(); i++){
                   if(botaoComprador.getItemAt(i).equals(buscaNomeC)){
                       
                        botaoComprador.setSelectedIndex(i);  
                   }
               } 

               for(int i = 0; i < botaovendedor.getItemCount(); i++){
                   if(botaovendedor.getItemAt(i).equals(buscaNomeV)){
                       
                        botaovendedor.setSelectedIndex(i);  
                   }
               }   
                         
           }
                                 
        }catch(CampoIdInvalidException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_botaoConsultaContratoActionPerformed

    private void botaoExcluirContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirContratoActionPerformed
        // TODO add your handling code here:
        
         try{
            
            String id = txtNumeroContrato.getText();
            camposObrigatorios(id);
            
            boolean verifica = g.removerContrato(id);
            if(verifica == true){
                 JOptionPane.showMessageDialog(null, "Contrato Removido com Sucesso!!");
            }else{
                 JOptionPane.showMessageDialog(null, "ID de contrato inexistente!!!");
            }
            
                  
        }catch(CampoIdInvalidException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_botaoExcluirContratoActionPerformed

    private void botaoAlterarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarContratoActionPerformed
        // TODO add your handling code here:
         try{          
             camposObrigatorios(txtNumeroContrato.getText(), txtProduto.getText(),
                    txtQuantidade.getText(), txtPreco.getText());                  

            
            int iC = botaoComprador.getSelectedIndex();
            Comprador c = compradores.get(iC);

            int iV = botaovendedor.getSelectedIndex();
            Vendedor v = vendedores.get(iV);

            Corretora contrato = new Corretora(txtNumeroContrato.getText(), txtData.getValue().toString(),
                    txtDescricao.getText(), txtObservacao.getText(), txtProduto.getText() ,Float.parseFloat(txtPreco.getText()),
                    Float.parseFloat(txtTotal.getText()), Integer.parseInt(txtQuantidade.getText()), c, v);

            boolean alterado = g.alterarContrato(contrato);
            if(alterado == true){
                JOptionPane.showMessageDialog(null, "Contrato ALTERADO com SUCESSO!");

                txtNumeroContrato.setText("");
                txtProduto.setText("");
                txtQuantidade.setText("");
                txtPreco.setText("");
                txtDescricao.setText("");
                txtTotal.setText("");
                txtObservacao.setText("");
        
            }else{
                 JOptionPane.showMessageDialog(null, "Erro");
            }
        
         }catch(CampoInvalidException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }

       
        
    }//GEN-LAST:event_botaoAlterarContratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarContrato;
    private javax.swing.JComboBox<String> botaoComprador;
    private javax.swing.JButton botaoConsultaContrato;
    private javax.swing.JButton botaoExcluirContrato;
    private javax.swing.JButton botaoGerarContrato;
    private javax.swing.JComboBox<String> botaovendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCidadeBanco;
    private javax.swing.JTextField txtCidadeComprador;
    private javax.swing.JTextField txtCidadeVendedor;
    private javax.swing.JTextField txtContaBanco;
    private javax.swing.JSpinner txtData;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtEnderecoComprador;
    private javax.swing.JTextField txtEnderecoVendedor;
    private javax.swing.JTextField txtEstadoBanco;
    private javax.swing.JTextField txtIdComprador;
    private javax.swing.JTextField txtIdVendedor;
    private javax.swing.JTextField txtInscricaoComprador;
    private javax.swing.JFormattedTextField txtInscricaoVendedor;
    private javax.swing.JTextField txtNumeroContrato;
    private javax.swing.JTextPane txtObservacao;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
