package mantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class ConsultaCocina extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaCocina frame = new ConsultaCocina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaCocina() {
		setBackground(new Color(192, 192, 192));
		getContentPane().setBackground(new Color(192, 192, 192));
		setTitle("Consultar Cocina");
		setBounds(50, 50, 600, 319);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModelo.setBounds(10, 40, 133, 22);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecios.setBounds(10, 80, 133, 22);
		getContentPane().add(lblPrecios);
		
		JLabel lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnchocm.setBounds(10, 120, 133, 22);
		getContentPane().add(lblAnchocm);
		
		JLabel lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAltocm.setBounds(10, 160, 133, 22);
		getContentPane().add(lblAltocm);
		
		JLabel lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFondocm.setBounds(10, 200, 133, 22);
		getContentPane().add(lblFondocm);
		
		JLabel lblQuemadorescm = new JLabel("Quemadores");
		lblQuemadorescm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuemadorescm.setBounds(10, 240, 133, 22);
		getContentPane().add(lblQuemadorescm);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"modelo 1", "modelo 2", "modelo 3"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBounds(150, 40, 183, 22);
		getContentPane().add(comboBox);

	}
}
