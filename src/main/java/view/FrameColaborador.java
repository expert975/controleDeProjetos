package main.java.view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import br.com.ap220191.ec04_controle_projetos.model.Colaborador;
import br.com.ap220191.ec04_controle_projetos.model.CorreiosException;
import br.com.ap220191.ec04_controle_projetos.model.Departamento;
import br.com.ap220191.ec04_controle_projetos.model.Endereco;
import br.com.ap220191.ec04_controle_projetos.model.Gerente;
import br.com.ap220191.ec04_controle_projetos.model.Sexo;
import br.com.ap220191.ec04_controle_projetos.model.Mobilidade;
import br.com.ap220191.ec04_controle_projetos.model.Telefone;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FrameColaborador extends javax.swing.JFrame {
	
	private MainFrame mainFrame;
	private FrameEndereco frameEndereco;
	private boolean colaboradorGerente;
	private int indiceDoDepartamento;
	
	public FrameColaborador(MainFrame frame) {
		initComponents();
		
		this.mainFrame = frame;
		
		comboGenero.removeAllItems();
		comboGenero.addItem("GÊNERO");
		for (Sexo genero : Sexo.values()) { 
			comboGenero.addItem(genero.toString());
		}
		
		comboDepartamento.removeAllItems();
		comboDepartamento.addItem("SELECIONE O DEPARTAMENTO");
		for (Departamento departamento : mainFrame.getDepartamentos()) { 
			comboDepartamento.addItem(departamento.getNome());
		}

		comboTipoColaborador.removeAllItems();
		comboTipoColaborador.addItem("SELECIONE O TIPO DE COLABORADOR");
		comboTipoColaborador.addItem("COLABORADOR");
		comboTipoColaborador.addItem("GERENTE");

		comboTelefone.removeAllItems();
		comboTelefone.addItem("SELECIONE");
		for (Mobilidade mobilidade : Mobilidade.values()) { 
			comboTelefone.addItem(mobilidade.toString());
		}
		
		inputNome.setEditable(false);
		inputNome.setEditable(false);
		inputDiaNasc.setEditable(false);
		inputMesNasc.setEditable(false);
		inputAnoNasc.setEditable(false);
		comboGenero.setEnabled(false);
		
		inputCpf.setEditable(false);
		inputRemuneracao.setEditable(false);
		comboDepartamento.setEnabled(false);
		
		inputTelefone.setEditable(false);
		inputOperadora.setEditable(false);
		comboTelefone.setEnabled(false);
		
		inputEmail.setEditable(false);
		inputCep.setEditable(false);

		botaoSalvar.setEnabled(false);
		botaoEditar.requestFocus();

	}
	
	public FrameColaborador() {
		initComponents();
	}

	public void setIndiceDoDepartamento(int i) {
		this.indiceDoDepartamento = i;
	}

	public void setTipoColaborador(boolean tipoColaborador){
		this.colaboradorGerente = tipoColaborador;
	}
		
	public boolean isGerente(){
		return this.colaboradorGerente;
	}

	public void setColaborador(Endereco enderecoRecuperado) {
		LocalDate dataLocal = LocalDate.of(Integer.parseInt(inputAnoNasc.getText()), Integer.parseInt(inputMesNasc.getText()), Integer.parseInt(inputDiaNasc.getText()));
		Date dataNascimento = Date.from(dataLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		Telefone telefone = new Telefone();
		ArrayList<Telefone> telefones = new ArrayList();
		telefone.setNumero(inputTelefone.getText());
		telefone.setOperadora(inputOperadora.getText());
		
		for (Mobilidade mobilidade : Mobilidade.values()) {
			if(comboTelefone.getSelectedItem().equals(mobilidade.toString())) {
				telefone.setTipo(mobilidade);
			}		
		}
		telefones.add(telefone);
		
		Colaborador colaborador = new Colaborador();
		colaborador.setNome(inputNome.getText());
		
		for (Sexo sexo : Sexo.values()) {
			if(comboGenero.getSelectedItem().equals(sexo.toString())) {
				colaborador.setSexo(sexo);
			}		
		}
		
		colaborador.setNascimento(dataNascimento);	
		colaborador.setCpf(inputCpf.getText());
		colaborador.setRemuneracao(Long.parseLong(inputRemuneracao.getText()));

		for (Departamento departamento : mainFrame.getDepartamentos()) {
			if(comboDepartamento.getSelectedItem().equals(departamento.getNome())) {
				ArrayList<Departamento> novoDepartamento = new ArrayList();
				novoDepartamento.add(departamento);
				colaborador.setDepartamentos(novoDepartamento);
			}
		}
		
		colaborador.setEndereco(enderecoRecuperado);
		colaborador.setTelefones(telefones);
		colaborador.setEmail(inputEmail.getText());
		
		mainFrame.addColaborador(colaborador);
		this.dispose();
	}

	public void setGerente(Endereco enderecoRecuperado) {
		LocalDate dataLocal = LocalDate.of(Integer.parseInt(inputAnoNasc.getText()), Integer.parseInt(inputMesNasc.getText()), Integer.parseInt(inputDiaNasc.getText()));
		Date dataNascimento = Date.from(dataLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		Telefone telefone = new Telefone();
		ArrayList<Telefone> telefones = new ArrayList();
		telefone.setNumero(inputTelefone.getText());
		telefone.setOperadora(inputOperadora.getText());
		
		for (Mobilidade mobilidade : Mobilidade.values()) {
			if(comboTelefone.getSelectedItem().equals(mobilidade.toString())) {
				telefone.setTipo(mobilidade);
			}		
		}
		telefones.add(telefone);

		/*for (Departamento departamento : mainFrame.getDepartamentos()) {
			if(comboDepartamento.getSelectedItem().equals(departamento.getNome())) {*/

		for(int i = 0; i < mainFrame.getDepartamentos().size(); i++) {
			if(comboDepartamento.getSelectedItem().equals(mainFrame.getDepartamentos().get(i).getNome())) {

				setIndiceDoDepartamento(i);
				
				ArrayList<Departamento> novoDepartamento = new ArrayList();
				novoDepartamento.add(mainFrame.getDepartamentos().get(i));
				
				Gerente colaborador = new Gerente(inputNome.getText(), inputCpf.getText(), (comboGenero.getSelectedItem().equals("FEMININO") ? Sexo.FEMININO : Sexo.MASCULINO),
					dataNascimento, (Long.parseLong(inputRemuneracao.getText())), inputEmail.getText(), enderecoRecuperado, telefones, novoDepartamento);

					mainFrame.addGerente(colaborador);
					System.out.println(colaborador);
			}
		}

		this.dispose();
	}
	/**
	 * Este método, gerado automaticamente, é chamado no construtor e
	 * inicializa o formulário. Não modifique o código.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                inputNome = new javax.swing.JTextField();
                inputOperadora = new javax.swing.JTextField();
                inputEmail = new javax.swing.JTextField();
                inputCep = new javax.swing.JTextField();
                botaoEditar = new javax.swing.JButton();
                botaoSalvar = new javax.swing.JButton();
                inputAnoNasc = new javax.swing.JTextField();
                barra2 = new javax.swing.JLabel();
                inputMesNasc = new javax.swing.JTextField();
                barra3 = new javax.swing.JLabel();
                inputDiaNasc = new javax.swing.JTextField();
                inputCpf = new javax.swing.JTextField();
                inputRemuneracao = new javax.swing.JTextField();
                inputTelefone = new javax.swing.JTextField();
                comboGenero = new javax.swing.JComboBox<>();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                comboTelefone = new javax.swing.JComboBox<>();
                comboDepartamento = new javax.swing.JComboBox<>();
                comboTipoColaborador = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                inputNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputNome.setText("Nome Completo");
                inputNome.setToolTipText("Insira o nome completo");

                inputOperadora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputOperadora.setText("Operadora");
                inputOperadora.setToolTipText("Insira a operadora do telefone");

                inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputEmail.setText("E-mail");
                inputEmail.setToolTipText("Insira o endereço de e-mail");

                inputCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputCep.setText("CEP");
                inputCep.setToolTipText("Insira o código de endereçamento postal (cep)");

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

                inputAnoNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputAnoNasc.setText("Ano");
                inputAnoNasc.setToolTipText("Insira o ano de nascimento");

                barra2.setText("/");

                inputMesNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputMesNasc.setText("Mês");
                inputMesNasc.setToolTipText("Insira o mês de nascimento");

                barra3.setText("/");

                inputDiaNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputDiaNasc.setText("Dia");
                inputDiaNasc.setToolTipText("Insira o dia de nascimento");

                inputCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputCpf.setText("CPF");
                inputCpf.setToolTipText("Insira o cpf");

                inputRemuneracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputRemuneracao.setText("Remuneração");
                inputRemuneracao.setToolTipText("Insira o valor da remuneração");

                inputTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                inputTelefone.setText("Telefone");
                inputTelefone.setToolTipText("Insira o telefone");

                comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboGenero.setToolTipText("Selecione o gênero");

                comboTelefone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                comboTelefone.setToolTipText("Selecione a mobilidade do telefone");

                comboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                comboTipoColaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboTipoColaborador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(inputNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputCep, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(inputDiaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(barra3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputMesNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(barra2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(inputAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(inputCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputRemuneracao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputDiaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputMesNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(barra3)
                                        .addComponent(barra2)
                                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(inputRemuneracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipoColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoEditar)
                                        .addComponent(botaoSalvar))
                                .addGap(23, 23, 23))
                );

                setSize(new java.awt.Dimension(418, 457));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
		inputNome.setEditable(true);
		inputNome.setEditable(true);
		inputDiaNasc.setEditable(true);
		inputMesNasc.setEditable(true);
		inputAnoNasc.setEditable(true);
		comboGenero.setEnabled(true);
		
		inputCpf.setEditable(true);
		inputRemuneracao.setEditable(true);
		comboDepartamento.setEnabled(true);
		
		inputTelefone.setEditable(true);
		inputOperadora.setEditable(true);
		comboTelefone.setEnabled(true);
		
		inputEmail.setEditable(true);
		inputCep.setEditable(true);

		botaoSalvar.setEnabled(true);
		inputNome.requestFocus();
        }//GEN-LAST:event_botaoEditarActionPerformed

        private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
		if(comboTipoColaborador.getSelectedItem().equals("COLABORADOR")) {
			setTipoColaborador(false);
		} else {
			setTipoColaborador(true);
		}

		this.setVisible(false);

		try {
			this.frameEndereco = new FrameEndereco(this, inputCep.getText());
		} catch (CorreiosException ex) {
			Logger.getLogger(FrameColaborador.class.getName()).log(Level.SEVERE, null, ex);
		}
		this.frameEndereco.setVisible(true);
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
			java.util.logging.Logger.getLogger(FrameColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FrameColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FrameColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FrameColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FrameColaborador().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel barra2;
        private javax.swing.JLabel barra3;
        private javax.swing.JButton botaoEditar;
        private javax.swing.JButton botaoSalvar;
        private javax.swing.JComboBox<String> comboDepartamento;
        private javax.swing.JComboBox<String> comboGenero;
        private javax.swing.JComboBox<String> comboTelefone;
        private javax.swing.JComboBox<String> comboTipoColaborador;
        private javax.swing.JTextField inputAnoNasc;
        private javax.swing.JTextField inputCep;
        private javax.swing.JTextField inputCpf;
        private javax.swing.JTextField inputDiaNasc;
        private javax.swing.JTextField inputEmail;
        private javax.swing.JTextField inputMesNasc;
        private javax.swing.JTextField inputNome;
        private javax.swing.JTextField inputOperadora;
        private javax.swing.JTextField inputRemuneracao;
        private javax.swing.JTextField inputTelefone;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        // End of variables declaration//GEN-END:variables
}
