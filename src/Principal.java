import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Principal {

	private JFrame frame;
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JTextField textFieldMarca;
	private JTextField textFieldModelo;
	private JTextField textFieldPreco;
	private JTextField textFieldValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1072, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane CadastroCarros = new JTabbedPane(JTabbedPane.TOP);
		CadastroCarros.setBounds(12, 13, 1030, 687);
		frame.getContentPane().add(CadastroCarros);
		
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
		
		JPanel panelUsuario = new JPanel();
		CadastroCarros.addTab("Cadastro Usuarios", null, panelUsuario, null);
		panelUsuario.setLayout(null);
		
		JPanel panelLocacao = new JPanel();
		CadastroCarros.addTab("Locacao", null, panelLocacao, null);
		panelLocacao.setLayout(null);
	}
}
