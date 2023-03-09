package view;

import java.awt.EventQueue;

import view.converteStringDouble;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JList;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

//@SuppressWarnings("serial")
public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	
	static Conversor frame = new Conversor();
	private JTextField txtResultado;
	
	Moeda moeda = new Moeda();
	converteStringDouble converte = new converteStringDouble();
	Calcula calcula = new Calcula();
	int selecao = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public Conversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 
			if(selecao == 1) {
				//JOptionPane.showMessageDialog( null, "Numero digitado é : " + txtNumero.getText());
				moeda.setMoeda(converte.converteDouble(txtNumero.getText()));
				double resultado_D = calcula.converteDolarReais(moeda.getMoeda());
				txtResultado.setText(converte.converteString(resultado_D));
				
			}
			else {
				selecao = 7;
				 
			}
				
			
			 
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.setToolTipText("");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(6, 237, 117, 29);
		contentPane.add(btnNewButton_1);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(16, 29, 130, 41);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira o valor");
		lblNewLabel.setBounds(17, 6, 90, 16);
		contentPane.add(lblNewLabel);
		
		int[] lista  = new int[2];
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Reais em Dolares", "Reais em Euros", "Reais em Libras", "Reais em Yenes", "Reias em Won Coreano", "Dolares em Reais", "Libras em Reais"}));
		comboBox_1.setBounds(6, 126, 175, 29);
		contentPane.add(comboBox_1);
		
		comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                //
                // Get the source of the component, which is our combo
                // box.
                //
                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Reais em Dolares"))
                selecao = 1;
                else if(selected.toString().equals("Reais em Euros"))
                selecao = 2;
                if(selected.toString().equals("Reais em Libras"))
                selecao = 3;
                else if(selected.toString().equals("Reais em Yenes"))
                selecao = 4;
                if(selected.toString().equals("Reias em Won Coreano"))
                selecao = 5;
                else if(selected.toString().equals("Dolares em Reais"))
                selecao = 6;
                if(selected.toString().equals("Libras em Reais"))
                selecao = 7;
                else txtResultado.setText("Erro");
                
                /*
                 * Reais em Dolares
					Reais em Euros
					Reais em Libras
					Reais em Yenes
					Reias em Won Coreano
					Dolares em Reais
					Libras em Reais
                 */

            }
        });
		
		JLabel lblNewLabel_2 = new JLabel("Escolha a conversão");
		lblNewLabel_2.setBounds(16, 94, 233, 16);
		contentPane.add(lblNewLabel_2);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(314, 36, 130, 26);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado");
		lblNewLabel_4.setBounds(319, 12, 117, 16);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
