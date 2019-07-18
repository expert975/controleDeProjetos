package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.Departamento;
import br.com.ap220191.ec04_controle_projetos.model.Projeto;
import br.com.ap220191.ec04_controle_projetos.model.Situacao;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FrameProjeto extends javax.swing.JFrame {
	private MainFrame mainFrame;
	
	FrameProjeto(MainFrame frame) {
		initComponents();
		this.mainFrame = frame;

                inputNomeProjeto.setEditable(false);
                inputDescricao.setEditable(false);
		inputOrcamento.setEditable(false);

		comboDepartamento.removeAllItems();
		comboDepartamento.addItem("SELECIONE O DEPARTAMENTO RESPONSÁVEL");
		for (Departamento departamento : mainFrame.getDepartamentos()) { 
			comboDepartamento.addItem(departamento.getNome());
		}
		comboDepartamento.setEnabled(false);
		inputDiaInicio.setEditable(false);
		inputMesInicio.setEditable(false);
		inputAnoInicio.setEditable(false);

                botaoSalvar.setEnabled(false);

	}
	
	public FrameProjeto() {
		initComponents();

                inputNomeProjeto.setEditable(false);
                inputDescricao.setEditable(false);
		inputOrcamento.setEditable(false);

		comboDepartamento.removeAllItems();
		comboDepartamento.addItem("SELECIONE O DEPARTAMENTO RESPONSÁVEL");

		comboDepartamento.setEnabled(false);
		inputDiaInicio.setEditable(false);
		inputMesInicio.setEditable(false);
		inputAnoInicio.setEditable(false);

                botaoSalvar.setEnabled(false);
	}

	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputNomeProjeto = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                inputDescricao = new javax.swing.JTextField();
                inputOrcamento = new javax.swing.JTextField();
                jSeparator1 = new javax.swing.JSeparator();
                barra1 = new javax.swing.JLabel();
                inputMesInicio = new javax.swing.JTextField();
                barra2 = new javax.swing.JLabel();
                inputAnoInicio = new javax.swing.JTextField();
                inputDiaInicio = new javax.swing.JTextField();
                etiquetaDataInicio = new javax.swing.JLabel();
                comboDepartamento = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                inputNomeProjeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputNomeProjeto.setText("Nome do projeto");
                inputNomeProjeto.setToolTipText("Insira o nome do projeto");

                botaoEditar.setText("Editar");
                botaoEditar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoEditarActionPerformed(evt);
                        }
                });

                botaoSalvar.setText("Salvar");
                botaoSalvar.setEnabled(false);
                botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                botaoSalvarActionPerformed(evt);
                        }
                });

                inputDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputDescricao.setText("Descrição");
                inputDescricao.setToolTipText("Insira a descrição");

                inputOrcamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputOrcamento.setText("Orçamento");
                inputOrcamento.setToolTipText("Insira o orçamento");

                barra1.setText("/");

                inputMesInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputMesInicio.setText("Mês");
                inputMesInicio.setToolTipText("Insira o mês de início");

                barra2.setText("/");

                inputAnoInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputAnoInicio.setText("Ano");
                inputAnoInicio.setToolTipText("Insira o ano de  de início");

                inputDiaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputDiaInicio.setText("Dia");
                inputDiaInicio.setToolTipText("Insira o dia de início");

                etiquetaDataInicio.setText("Data de início");

                comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboDepartamento.setToolTipText("Selecione o departamento responsável");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator1)
                                        .addComponent(inputNomeProjeto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputOrcamento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 136, Short.MAX_VALUE)
                                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(comboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaDataInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(barra2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(inputNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barra1)
                                        .addComponent(barra2)
                                        .addComponent(etiquetaDataInicio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoEditar)
                                        .addComponent(botaoSalvar))
                                .addGap(23, 23, 23))
                );

                setSize(new java.awt.Dimension(418, 293));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
                inputNomeProjeto.setEditable(true);
                inputDescricao.setEditable(true);
		inputOrcamento.setEditable(true);

		
		comboDepartamento.setEnabled(true);
		inputDiaInicio.setEditable(true);
		inputMesInicio.setEditable(true);
		inputAnoInicio.setEditable(true);

                botaoSalvar.setEnabled(true);
                inputNomeProjeto.requestFocus();
        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
		LocalDate dataLocal = LocalDate.of(Integer.parseInt(inputAnoInicio.getText()), Integer.parseInt(inputMesInicio.getText()), Integer.parseInt(inputDiaInicio.getText()));
		Date dataInicio = Date.from(dataLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Projeto projeto = new Projeto();
		
		projeto.setNome(inputNomeProjeto.getText());
		projeto.setDescricao(inputDescricao.getText());
		projeto.setOrcamento(Long.parseLong(inputOrcamento.getText()));

		for (Departamento departamento : mainFrame.getDepartamentos()) {
			if(comboDepartamento.getSelectedItem().equals(departamento.getNome())) {
				projeto.setDepartamentoResponsavel(departamento);
			}
		}
		projeto.setInicio(dataInicio);

		mainFrame.addProjeto(projeto);
		this.dispose();
        }//GEN-LAST:event_botaoSalvarActionPerformed

	/**
	 * Código gerado automaticamente, é responsável pela aparência do
	 * JFrame. Selecione opcionalmente o template Look and feel.
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
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FrameProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameProjeto().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel barra1;
        private javax.swing.JLabel barra2;
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JComboBox<String> comboDepartamento;
        private javax.swing.JLabel etiquetaDataInicio;
        private javax.swing.JTextField inputAnoInicio;
        private javax.swing.JTextField inputDescricao;
        private javax.swing.JTextField inputDiaInicio;
        private javax.swing.JTextField inputMesInicio;
        private javax.swing.JTextField inputNomeProjeto;
        private javax.swing.JTextField inputOrcamento;
        private javax.swing.JSeparator jSeparator1;
        // End of variables declaration//GEN-END:variables
}
