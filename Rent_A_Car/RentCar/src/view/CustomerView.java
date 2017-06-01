package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class CustomerView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel antetTabel;
	private DefaultTableModel antetTabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnReservACar;
	private JButton btnEditReservation;
	private JButton btnDeleteReservation;

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public DefaultTableModel getAntetTabel() {
		return antetTabel;
	}

	public void setAntetTabel(DefaultTableModel antetTabel) {
		this.antetTabel = antetTabel;
	}

	public DefaultTableModel getAntetTabel_1() {
		return antetTabel_1;
	}

	public void setAntetTabel_1(DefaultTableModel antetTabel_1) {
		this.antetTabel_1 = antetTabel_1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JButton getBtnReservACar() {
		return btnReservACar;
	}

	public void setBtnReservACar(JButton btnReservACar) {
		this.btnReservACar = btnReservACar;
	}

	public JButton getBtnEditReservation() {
		return btnEditReservation;
	}

	public void setBtnEditReservation(JButton btnEditReservation) {
		this.btnEditReservation = btnEditReservation;
	}

	public JButton getBtnDeleteReservation() {
		return btnDeleteReservation;
	}

	public void setBtnDeleteReservation(JButton btnDeleteReservation) {
		this.btnDeleteReservation = btnDeleteReservation;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerView frame = new CustomerView();
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
	public CustomerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1178, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		JScrollPane scrollPane_1 = new JScrollPane();

		antetTabel = new DefaultTableModel(null,
				new Object[] { "id", "carID", "clientID", "starting_date", "ending_date", "cost" });
		table = new JTable(antetTabel);
		scrollPane.setViewportView(table);

		JLabel lblCarid = new JLabel("carID");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblStartingDate = new JLabel("starting date");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblEndingDate = new JLabel("ending date");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		btnReservACar = new JButton("Reserve a car");

		btnEditReservation = new JButton("Edit reservation");

		btnDeleteReservation = new JButton("Delete reservation");

		JLabel lblReservId = new JLabel("reserv. id");

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(12).addComponent(btnDeleteReservation,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(
								btnEditReservation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnReservACar,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblCarid)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(30)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblStartingDate).addComponent(textField_1,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(26)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEndingDate).addComponent(textField_2,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblReservId).addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
												86, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE))
				.addGap(29).addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 584, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(scrollPane_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
												.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 243,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCarid).addComponent(lblStartingDate)
														.addComponent(lblEndingDate).addComponent(lblReservId))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnReservACar)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnEditReservation).addGap(12)
												.addComponent(btnDeleteReservation)))
										.addContainerGap(43, Short.MAX_VALUE)));

		antetTabel_1 = new DefaultTableModel(null,
				new Object[] { "id", "brand", "model", "price_per_day", "availability" });

		table_1 = new JTable(antetTabel_1);
		scrollPane_1.setViewportView(table_1);
		contentPane.setLayout(gl_contentPane);
	}
}
