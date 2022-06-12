/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DAOCategoria;
import dao.DAOProduto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;

/**
 *
 * @author Enderson
 */
public final class CadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
        carregarProdutosTable();
    }
    
    public void carregarProdutosTable(){
        DAOProduto d = new DAOProduto();
        DAOCategoria cat = new DAOCategoria();
        DefaultTableModel table = (DefaultTableModel) tableProdutos.getModel();
        table.getDataVector().removeAllElements();
        ArrayList<Produto> produtos = d.consultarAll();
        ArrayList<Categoria> categorias = cat.consultarAll();
        if(!produtos.isEmpty()){
            for(Produto p : produtos){
                Object[] dados = {p.getCod_produto(), p.getNome_produto(), p.getPreco(),p.getCod_barras(), p.getCod_categoria()};
                System.out.println(dados);
                table.addRow(dados);
            }
        }else{
            table.getDataVector().removeAllElements();
        }
        produtos.clear();
        
        if(!categorias.isEmpty()){
            for(Categoria c : categorias){
                comboCategoria.addItem(c.getNome_categoria());
                System.out.println(c);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        insertProduct = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecoUn = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JFormattedTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produto");

        jPanel1.setOpaque(false);

        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jPanel1.add(jToolBar1);

        insertProduct.setBackground(new java.awt.Color(242, 242, 242));
        insertProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        insertProduct.setText("Cadastrar");
        insertProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insertProduct.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo-foco.png"))); // NOI18N
        insertProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        insertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertProductActionPerformed(evt);
            }
        });
        jPanel1.add(insertProduct);

        btnAtualizar.setBackground(new java.awt.Color(242, 242, 242));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar-foco.png"))); // NOI18N
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar);

        btnExcluir.setBackground(new java.awt.Color(242, 242, 242));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir-foco.png"))); // NOI18N
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);

        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nome:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jLabel1, gridBagConstraints);

        txtNome.setColumns(23);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome, new java.awt.GridBagConstraints());

        jLabel2.setText("Cod. de Barras:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel2, gridBagConstraints);

        txtEstoque.setColumns(7);
        txtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        jPanel2.add(txtEstoque, gridBagConstraints);

        jLabel3.setText("Categoria:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel5.setText("Preço Unitário:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jLabel5, gridBagConstraints);

        txtPrecoUn.setColumns(10);
        txtPrecoUn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoUnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(txtPrecoUn, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cod. Estoque:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jLabel4, gridBagConstraints);

        txtCod.setColumns(7);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(txtCod, gridBagConstraints);

        comboCategoria.setMaximumRowCount(10);
        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                changedItem(evt);
            }
        });
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(comboCategoria, gridBagConstraints);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Preço Unit.", "Cod. de Barras", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        tableProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProdutosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableProdutos);
        if (tableProdutos.getColumnModel().getColumnCount() > 0) {
            tableProdutos.getColumnModel().getColumn(0).setResizable(false);
            tableProdutos.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 223, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 223, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 223, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 223, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 223, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 223, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 223, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 223, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 199, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 199, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 200, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 201, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 200, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 201, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 200, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 201, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueActionPerformed

    private void txtPrecoUnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoUnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoUnActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        DefaultTableModel table = (DefaultTableModel) tableProdutos.getModel();
        if(tableProdutos.getSelectedRow() != -1){
            Produto p = new Produto();
            //
            String nome = txtNome.getText();
            double preco = Double.valueOf(txtPrecoUn.getText());
            int cod = (int) tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0);
            //
            p.setCod_produto(cod);
            p.setNome_produto(nome);
            p.setPreco(preco);
            DAOProduto d = new DAOProduto();
            if(d.atualizar(p)){
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
                carregarProdutosTable();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar o item.");
            }    
        }   
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void insertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertProductActionPerformed
        String nome = txtNome.getText();
        double preco = Double.parseDouble(txtPrecoUn.getText());
        int cod_barras = Integer.parseInt(txtCod.getText());
        int estoque = Integer.parseInt(txtEstoque.getText());
        int categoria = (int) comboCategoria.getSelectedIndex() + 1;
        
        Produto produto = new Produto(nome, cod_barras, preco, estoque, categoria);
        DAOProduto dao = new DAOProduto();
        System.out.println("asjdbasds");
        if(dao.inserir(produto)){
            System.out.println("Inserido com sucesso!!");
            ArrayList<Produto> produtos = dao.consultarAll();
            carregarProdutosTable();
            
        }
        
    }//GEN-LAST:event_insertProductActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       DefaultTableModel table = (DefaultTableModel) tableProdutos.getModel();
        if(tableProdutos.getSelectedRow() != -1){
            Produto p = new Produto();
            int cod = (int) tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0);
            p.setCod_produto(cod);
            DAOProduto d = new DAOProduto();
            if(d.excluir(p)){
                JOptionPane.showMessageDialog(null, "Excluído com sucesso.");
                table.removeRow(tableProdutos.getSelectedRow());
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir o item.");
            }    
        }   
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void changedItem(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_changedItem
        System.out.println("mudou");
    }//GEN-LAST:event_changedItem

    private void tableProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutosKeyReleased
       if(tableProdutos.getSelectedRow() != -1){
            txtNome.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 1).toString());
            txtPrecoUn.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 2).toString());
            txtCod.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString());      
            int categoria = (int) tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 4) - 1; 
            comboCategoria.setSelectedIndex(categoria);
            //comboCategoria.setSelectedIndex(Integer.parseInt(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString())));
            //comboCategoria.getItemAt(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString());
            
        }
    }//GEN-LAST:event_tableProdutosKeyReleased

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
      if(tableProdutos.getSelectedRow() != -1){
            txtNome.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 1).toString());
            txtPrecoUn.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 2).toString());
            txtCod.setText(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 3).toString());          
            int categoria = (int) tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 4) - 1;
            comboCategoria.setSelectedIndex(categoria);
            
        }
    }//GEN-LAST:event_tableProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton insertProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JFormattedTextField txtCod;
    private javax.swing.JFormattedTextField txtEstoque;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtPrecoUn;
    // End of variables declaration//GEN-END:variables
}
