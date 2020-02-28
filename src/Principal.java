import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;

public class Principal {

	private JFrame frmLocadora;
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JTextField textFieldMarca;
	private JTextField textFieldModelo;
	private JTextField textFieldPreco;
	private JTextField textFieldValor;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmLocadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLocadora = new JFrame();
		frmLocadora.setTitle("Locadora");
		frmLocadora.setBounds(100, 100, 1072, 760);
		frmLocadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLocadora.getContentPane().setLayout(null);
		
		JTabbedPane CadastroCarros = new JTabbedPane(JTabbedPane.TOP);
		CadastroCarros.setBounds(12, 13, 1030, 687);
		frmLocadora.getContentPane().add(CadastroCarros);
		
		JPanel panelCarro = new JPanel();
		CadastroCarros.addTab("Cadastro Carros", null, panelCarro, null);
		panelCarro.setLayout(null);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(131, 36, 850, 22);
		panelCarro.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(12, 38, 86, 19);
		panelCarro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(12, 74, 56, 16);
		panelCarro.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(131, 71, 850, 22);
		panelCarro.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(12, 109, 56, 16);
		panelCarro.add(lblNewLabel_2);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setBounds(130, 106, 851, 22);
		panelCarro.add(textFieldMarca);
		textFieldMarca.setColumns(10);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setBounds(131, 141, 850, 22);
		panelCarro.add(textFieldModelo);
		textFieldModelo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo");
		lblNewLabel_3.setBounds(12, 144, 56, 16);
		panelCarro.add(lblNewLabel_3);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setBounds(131, 176, 851, 22);
		panelCarro.add(textFieldPreco);
		textFieldPreco.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o");
		lblNewLabel_4.setBounds(12, 179, 56, 16);
		panelCarro.add(lblNewLabel_4);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(131, 211, 850, 22);
		panelCarro.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor de Loca\u00E7\u00E3o");
		lblNewLabel_5.setBounds(12, 214, 107, 16);
		panelCarro.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(12, 287, 97, 25);
		panelCarro.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar valor de Loca\u00E7\u00E3o");
		btnNewButton_1.setBounds(307, 287, 184, 25);
		panelCarro.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exibir Informa\u00E7\u00E3o ");
		btnNewButton_2.setBounds(131, 287, 149, 25);
		panelCarro.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBounds(12, 325, 1001, 319);
		panelCarro.add(list);
		
		JPanel panelUsuario = new JPanel();
		CadastroCarros.addTab("Cadastro Usuarios", null, panelUsuario, null);
		panelUsuario.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(12, 23, 56, 16);
		panelUsuario.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sobrenome");
		lblNewLabel_7.setBounds(12, 52, 92, 16);
		panelUsuario.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CNH");
		lblNewLabel_8.setBounds(12, 81, 56, 16);
		panelUsuario.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Categoria");
		lblNewLabel_9.setBounds(288, 81, 56, 16);
		panelUsuario.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Data de Nascimento");
		lblNewLabel_10.setBounds(12, 113, 123, 16);
		panelUsuario.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(134, 20, 116, 22);
		panelUsuario.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 49, 116, 22);
		panelUsuario.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 78, 116, 22);
		panelUsuario.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(358, 78, 116, 22);
		panelUsuario.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(134, 110, 116, 22);
		panelUsuario.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(134, 142, 56, 22);
		panelUsuario.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(202, 142, 116, 22);
		panelUsuario.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Telefone");
		lblNewLabel_11.setBounds(12, 145, 56, 16);
		panelUsuario.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("E-mail");
		lblNewLabel_12.setBounds(12, 174, 56, 16);
		panelUsuario.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(134, 177, 184, 22);
		panelUsuario.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Rua");
		lblNewLabel_13.setBounds(533, 23, 56, 16);
		panelUsuario.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(629, 20, 384, 22);
		panelUsuario.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Complemento");
		lblNewLabel_14.setBounds(533, 52, 84, 16);
		panelUsuario.add(lblNewLabel_14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(629, 49, 66, 22);
		panelUsuario.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("CEP");
		lblNewLabel_15.setBounds(723, 52, 56, 16);
		panelUsuario.add(lblNewLabel_15);
		
		textField_10 = new JTextField();
		textField_10.setBounds(759, 49, 116, 22);
		panelUsuario.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Cidade");
		lblNewLabel_16.setBounds(533, 81, 56, 16);
		panelUsuario.add(lblNewLabel_16);
		
		textField_11 = new JTextField();
		textField_11.setBounds(629, 78, 116, 22);
		panelUsuario.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Estado");
		lblNewLabel_17.setBounds(779, 81, 56, 16);
		panelUsuario.add(lblNewLabel_17);
		
		textField_12 = new JTextField();
		textField_12.setBounds(829, 78, 116, 22);
		panelUsuario.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Cadastrar Usuario");
		btnNewButton_3.setBounds(838, 170, 147, 25);
		panelUsuario.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exibir Informa\u00E7\u00F5es");
		btnNewButton_4.setBounds(643, 170, 154, 25);
		panelUsuario.add(btnNewButton_4);
		
		JList list_1 = new JList();
		list_1.setBounds(12, 248, 1001, 396);
		panelUsuario.add(list_1);
		
		JPanel panelLocacao = new JPanel();
		CadastroCarros.addTab("Locacao", null, panelLocacao, null);
		panelLocacao.setLayout(null);
		
		textField_13 = new JTextField();
		textField_13.setBounds(137, 13, 116, 22);
		panelLocacao.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Usu\u00E1rio");
		lblNewLabel_18.setBounds(12, 16, 56, 16);
		panelLocacao.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Carro");
		lblNewLabel_19.setBounds(12, 43, 56, 16);
		panelLocacao.add(lblNewLabel_19);
		
		textField_14 = new JTextField();
		textField_14.setBounds(137, 40, 116, 22);
		panelLocacao.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Data de Loca\u00E7\u00E3o");
		lblNewLabel_20.setBounds(12, 72, 113, 16);
		panelLocacao.add(lblNewLabel_20);
		
		textField_15 = new JTextField();
		textField_15.setBounds(137, 69, 116, 22);
		panelLocacao.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Data estimada de devolu\u00E7\u00E3o");
		lblNewLabel_21.setBounds(12, 101, 182, 16);
		panelLocacao.add(lblNewLabel_21);
		
		textField_16 = new JTextField();
		textField_16.setBounds(183, 98, 116, 22);
		panelLocacao.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Data de devolu\u00E7\u00E3o");
		lblNewLabel_22.setBounds(12, 130, 160, 16);
		panelLocacao.add(lblNewLabel_22);
		
		textField_17 = new JTextField();
		textField_17.setBounds(183, 130, 116, 22);
		panelLocacao.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Valor Cobrado");
		lblNewLabel_23.setBounds(460, 16, 97, 16);
		panelLocacao.add(lblNewLabel_23);
		
		textField_18 = new JTextField();
		textField_18.setBounds(569, 13, 116, 22);
		panelLocacao.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Valor Pago");
		lblNewLabel_24.setBounds(460, 43, 70, 16);
		panelLocacao.add(lblNewLabel_24);
		
		textField_19 = new JTextField();
		textField_19.setBounds(569, 40, 116, 22);
		panelLocacao.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Valor Multa");
		lblNewLabel_25.setBounds(460, 72, 97, 16);
		panelLocacao.add(lblNewLabel_25);
		
		textField_20 = new JTextField();
		textField_20.setBounds(569, 69, 116, 22);
		panelLocacao.add(textField_20);
		textField_20.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Locar Carro");
		btnNewButton_5.setBounds(858, 126, 128, 25);
		panelLocacao.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Carros Locados");
		btnNewButton_6.setBounds(692, 126, 133, 25);
		panelLocacao.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Devolver Carro");
		btnNewButton_7.setBounds(515, 126, 140, 25);
		panelLocacao.add(btnNewButton_7);
		
		JList list_2 = new JList();
		list_2.setBounds(12, 191, 1001, 453);
		panelLocacao.add(list_2);
	}
}
