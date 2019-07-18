package main.java.view;

import br.com.ap220191.ec04_controle_projetos.model.AlteracaoSituacao;
import br.com.ap220191.ec04_controle_projetos.model.Colaborador;
import br.com.ap220191.ec04_controle_projetos.model.Projeto;
import br.com.ap220191.ec04_controle_projetos.model.Situacao;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FrameAlteracaoSituacao extends javax.swing.JFrame {
	MainFrame mainFrame;
	Projeto projetoSelecionado;
	int indiceDoProjeto;

	public FrameAlteracaoSituacao(MainFrame frame) {
		initComponents();
		
		mainFrame = frame;
		
		comboProjeto.removeAllItems();
		comboProjeto.addItem("SELECIONE O PROJETO");
		for (Projeto projeto : mainFrame.getProjetos()) { 
			comboProjeto.addItem(projeto.getNome());
		}
		comboAgenteAlterante.removeAllItems();
		comboAgenteAlterante.addItem("SELECIONE O AGENTE ALTERANTE");
		for (Colaborador colaborador : mainFrame.getColaboradores()) { 
			comboAgenteAlterante.addItem(colaborador.getNome());
		}
		
		comboSituacaoAtual.removeAllItems();
		comboSituacaoAtual.addItem("SELECIONE");
		comboSituacaoNova.removeAllItems();
		comboSituacaoNova.addItem("SELECIONE");
		for (Situacao situacao : Situacao.values()) { 
			comboSituacaoAtual.addItem(situacao.toString());
			comboSituacaoNova.addItem(situacao.toString());
		}
		
		comboProjeto.setEnabled(false);
		inputMotivoAlteracao.setEditable(false);
                inputDiaAlteracao.setEditable(false);
                inputMesAlteracao.setEditable(false);
                inputAnoAlteracao.setEditable(false);
		
		comboAgenteAlterante.setEnabled(false);
                comboSituacaoAtual.setEnabled(false);
                comboSituacaoNova.setEnabled(false);

                botaoSalvar.setEnabled(false);
	}
	
	public FrameAlteracaoSituacao() {
		initComponents();

		comboProjeto.removeAllItems();
		comboProjeto.addItem("SELECIONE O PROJETO");

		comboAgenteAlterante.removeAllItems();
		comboAgenteAlterante.addItem("SELECIONE O AGENTE ALTERANTE");

		comboSituacaoAtual.removeAllItems();
		comboSituacaoAtual.addItem("SELECIONE");
		comboSituacaoNova.removeAllItems();
		comboSituacaoNova.addItem("SELECIONE");
		for (Situacao situacao : Situacao.values()) { 
			comboSituacaoAtual.addItem(situacao.toString());
			comboSituacaoNova.addItem(situacao.toString());
		}

		comboProjeto.setEnabled(false);
		inputMotivoAlteracao.setEditable(false);
                inputDiaAlteracao.setEditable(false);
                inputMesAlteracao.setEditable(false);
                inputAnoAlteracao.setEditable(false);

		comboAgenteAlterante.setEnabled(false);
                comboSituacaoAtual.setEnabled(false);
                comboSituacaoNova.setEnabled(false);

                botaoSalvar.setEnabled(false);
	}

	public void setIndiceDoProjeto(int i) {
		this.indiceDoProjeto = i;
	}
	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputMotivoAlteracao = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                inputAnoAlteracao = new javax.swing.JTextField();
                barra2 = new javax.swing.JLabel();
                inputMesAlteracao = new javax.swing.JTextField();
                barra3 = new javax.swing.JLabel();
                inputDiaAlteracao = new javax.swing.JTextField();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                jLabel1 = new javax.swing.JLabel();
                comboSituacaoAtual = new javax.swing.JComboBox<>();
                comboSituacaoNova = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                comboAgenteAlterante = new javax.swing.JComboBox<>();
                comboProjeto = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                inputMotivoAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputMotivoAlteracao.setText("Motivo da alteração");
                inputMotivoAlteracao.setToolTipText("Insira o motivo da alteração");

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

                inputAnoAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputAnoAlteracao.setText("Ano");
                inputAnoAlteracao.setToolTipText("Insira o ano da alteração");

                barra2.setText("/");

                inputMesAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputMesAlteracao.setText("Mês");
                inputMesAlteracao.setToolTipText("Insira o mês da alteração");

                barra3.setText("/");

                inputDiaAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputDiaAlteracao.setText("Dia");
                inputDiaAlteracao.setToolTipText("Insira o dia da alteração");

                jLabel1.setText("Data da alteração");

                comboSituacaoAtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboSituacaoAtual.setToolTipText("Situação atual");

                comboSituacaoNova.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboSituacaoNova.setToolTipText("Selecione a nova situação");

                jLabel2.setText("Situação atual");

                jLabel3.setText("Situação nova");

                comboAgenteAlterante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboAgenteAlterante.setToolTipText("Selecione o agente alterante");

                comboProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboProjeto.setToolTipText("Selecione o projeto");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboProjeto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(inputMotivoAlteracao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(inputDiaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(barra3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputMesAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(barra2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputAnoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 39, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(comboSituacaoNova, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(comboSituacaoAtual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(comboAgenteAlterante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMotivoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputDiaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputMesAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAnoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barra3)
                                        .addComponent(barra2)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAgenteAlterante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboSituacaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboSituacaoNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoEditar)
                                        .addComponent(botaoSalvar))
                                .addGap(23, 23, 23))
                );

                setSize(new java.awt.Dimension(418, 324));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
                comboProjeto.setEnabled(true);

                botaoSalvar.setEnabled(true);
		botaoSalvar.setText("Buscar");
                comboProjeto.requestFocus();

        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
		if(projetoSelecionado == null) {
			for(int i = 0; i < mainFrame.getProjetos().size(); i++) {
			if(comboProjeto.getSelectedItem().equals(mainFrame.getProjetos().get(i).getNome())) {
				projetoSelecionado = mainFrame.getProjetos().get(i);
					
					setIndiceDoProjeto(i);

					comboSituacaoAtual.removeAllItems();
					comboSituacaoAtual.addItem(projetoSelecionado.getSituacao().toString());

					inputMotivoAlteracao.setEditable(true);
					inputDiaAlteracao.setEditable(true);
					inputMesAlteracao.setEditable(true);
					inputAnoAlteracao.setEditable(true);
		
					comboAgenteAlterante.setEnabled(true);
					comboSituacaoAtual.setEnabled(true);
					comboSituacaoNova.setEnabled(true);

					botaoSalvar.setText("Salvar");
				}
			}
			
		} else {
			LocalDate dataLocal = LocalDate.of(Integer.parseInt(inputAnoAlteracao.getText()), Integer.parseInt(inputMesAlteracao.getText()), Integer.parseInt(inputDiaAlteracao.getText()));
			Date dataAlteracao = Date.from(dataLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());

			AlteracaoSituacao situacaoAlterada = new AlteracaoSituacao();

			situacaoAlterada.setMotivo(inputMotivoAlteracao.getText());
			situacaoAlterada.setData(dataAlteracao);
		
			for (Colaborador agenteAlterante : mainFrame.getColaboradores()) {
				if(comboAgenteAlterante.getSelectedItem().equals(agenteAlterante.getNome())) {
					situacaoAlterada.setAgente(agenteAlterante);
				}
			}

			situacaoAlterada.setAnterior(projetoSelecionado.getSituacao());
		
			for (Situacao situacao : Situacao.values()) {
				if(comboSituacaoNova.getSelectedItem().equals(situacao.toString())) {
					situacaoAlterada.setNovo(situacao);
					
					if(comboSituacaoNova.getSelectedItem().equals("CONCLUIDO")) {
						projetoSelecionado.setConclusao(dataAlteracao);
					}
				projetoSelecionado.mudarSituacao(situacao, situacaoAlterada);
				}
			}

			mainFrame.alteraSituacao(indiceDoProjeto, projetoSelecionado, situacaoAlterada);
			this.dispose();
		}
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
			java.util.logging.Logger.getLogger(FrameAlteracaoSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameAlteracaoSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameAlteracaoSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameAlteracaoSituacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameAlteracaoSituacao().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel barra2;
        private javax.swing.JLabel barra3;
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JComboBox<String> comboAgenteAlterante;
        private javax.swing.JComboBox<String> comboProjeto;
        private javax.swing.JComboBox<String> comboSituacaoAtual;
        private javax.swing.JComboBox<String> comboSituacaoNova;
        private javax.swing.JTextField inputAnoAlteracao;
        private javax.swing.JTextField inputDiaAlteracao;
        private javax.swing.JTextField inputMesAlteracao;
        private javax.swing.JTextField inputMotivoAlteracao;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        // End of variables declaration//GEN-END:variables
}
