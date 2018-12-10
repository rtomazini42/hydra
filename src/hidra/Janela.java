package hidra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Janela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		Ajeitar pixels = new Ajeitar();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 269, 113);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFechar.setBounds(44, 41, 163, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela frame = new Janela();
				frame.setBounds(pixels.getCord(),pixels.getCord(), 269, 113);
				frame.setVisible(true);

			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JTextArea txtrLolHue = new JTextArea();
		txtrLolHue.setEnabled(false);
		txtrLolHue.setEditable(false);
		txtrLolHue.setText("LOL, hue");
		txtrLolHue.setBounds(44, 8, 163, 22);
		contentPane.add(txtrLolHue);
		
	}
}
