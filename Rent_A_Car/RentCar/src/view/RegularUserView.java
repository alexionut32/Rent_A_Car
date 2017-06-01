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

public class RegularUserView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel antetTabel;
	private DefaultTableModel antetTabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblAddress;
	private JTextField textField_3;
	private JLabel lblUsername;
	private JTextField textField_4;
	private JLabel lblPassword;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton btnUpdateCustomerInfo;
	private JButton btnDeleteCustomerInfo;
	private JButton btnFindCustomerBy;
	private JButton btnUpdateContractInfo;
	private JButton btnDeleteContract;
	private JButton btnFindContractBy;
	private JButton btnNewButton;
	private JButton btnAddCustomerInfo;

	public JButton getBtnAddCustomerInfo() {
		return btnAddCustomerInfo;
	}

	public void setBtnAddCustomerInfo(JButton btnAddCustomerInfo) {
		this.btnAddCustomerInfo = btnAddCustomerInfo;
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

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public JTextField getTextField_11() {
		return textField_11;
	}

	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}

	public JButton getBtnUpdateCustomerInfo() {
		return btnUpdateCustomerInfo;
	}

	public void setBtnUpdateCustomerInfo(JButton btnUpdateCustomerInfo) {
		this.btnUpdateCustomerInfo = btnUpdateCustomerInfo;
	}

	public JButton getBtnDeleteCustomerInfo() {
		return btnDeleteCustomerInfo;
	}

	public void setBtnDeleteCustomerInfo(JButton btnDeleteCustomerInfo) {
		this.btnDeleteCustomerInfo = btnDeleteCustomerInfo;
	}

	public JButton getBtnFindCustomerBy() {
		return btnFindCustomerBy;
	}

	public void setBtnFindCustomerBy(JButton btnFindCustomerBy) {
		this.btnFindCustomerBy = btnFindCustomerBy;
	}

	public JButton getBtnUpdateContractInfo() {
		return btnUpdateContractInfo;
	}

	public void setBtnUpdateContractInfo(JButton btnUpdateContractInfo) {
		this.btnUpdateContractInfo = btnUpdateContractInfo;
	}

	public JButton getBtnDeleteContract() {
		return btnDeleteContract;
	}

	public void setBtnDeleteContract(JButton btnDeleteContract) {
		this.btnDeleteContract = btnDeleteContract;
	}

	public JButton getBtnFindContractBy() {
		return btnFindContractBy;
	}

	public void setBtnFindContractBy(JButton btnFindContractBy) {
		this.btnFindContractBy = btnFindContractBy;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegularUserView frame = new RegularUserView();
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
	public RegularUserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1117, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		JScrollPane scrollPane_1 = new JScrollPane();

		JLabel lblId = new JLabel("id");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblCnp = new JLabel("cnp");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblName = new JLabel("name");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		lblAddress = new JLabel("address");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		lblUsername = new JLabel("username");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		lblPassword = new JLabel("password");

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		JLabel lblContractId = new JLabel("contract id");

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		JLabel lblCarid = new JLabel("carID");

		textField_7 = new JTextField();
		textField_7.setColumns(10);

		JLabel lblClientid = new JLabel("clientID");

		textField_8 = new JTextField();
		textField_8.setColumns(10);

		JLabel lblStartingdate = new JLabel("starting_date");

		textField_9 = new JTextField();
		textField_9.setColumns(10);

		JLabel lblEndingdate = new JLabel("ending_date");

		textField_10 = new JTextField();
		textField_10.setColumns(10);

		JLabel lblCost = new JLabel("cost");

		textField_11 = new JTextField();
		textField_11.setColumns(10);

		btnAddCustomerInfo = new JButton("Add customer info");

		btnUpdateCustomerInfo = new JButton("Update customer info");

		btnDeleteCustomerInfo = new JButton("Delete customer info");

		btnFindCustomerBy = new JButton("Find customer by ID");

		btnUpdateContractInfo = new JButton("Update contract info");

		btnDeleteContract = new JButton("Delete contract");

		btnFindContractBy = new JButton("Find contract by ID");

		btnNewButton = new JButton("Generate bills");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										ComponentPlacement.RELATED)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(
								gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(btnFindCustomerBy, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnDeleteCustomerInfo, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnUpdateCustomerInfo, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnAddCustomerInfo, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 520,
														Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblId)
														.addGap(116).addComponent(lblCnp).addGap(98)
														.addComponent(lblName).addGap(99).addComponent(lblAddress))
												.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
														.createParallelGroup(Alignment.LEADING)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblUsername))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblPassword)
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addComponent(textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textField_2,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textField_3,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))))
										.addGroup(
												gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(
														gl_contentPane.createSequentialGroup().addGap(18).addGroup(
																gl_contentPane
																		.createParallelGroup(Alignment.LEADING, false)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(lblContractId).addGap(69)
																				.addComponent(lblCarid)
																				.addGap(93).addComponent(lblClientid)
																				.addGap(93).addComponent(lblCost))
																		.addComponent(scrollPane_1,
																				GroupLayout.PREFERRED_SIZE, 551,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(textField_6,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(textField_7,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addGroup(gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(lblEndingdate)
																						.addGroup(gl_contentPane
																								.createSequentialGroup()
																								.addComponent(
																										textField_8,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.DEFAULT_SIZE,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(
																										textField_11,
																										GroupLayout.PREFERRED_SIZE,
																										GroupLayout.DEFAULT_SIZE,
																										GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								textField_10,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)))
																		.addGroup(Alignment.TRAILING, gl_contentPane
																				.createSequentialGroup()
																				.addGroup(gl_contentPane
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(btnFindContractBy,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								539, Short.MAX_VALUE)
																						.addComponent(btnDeleteContract,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								539, Short.MAX_VALUE)
																						.addComponent(
																								btnUpdateContractInfo,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(btnNewButton,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								539, Short.MAX_VALUE))
																				.addContainerGap())))
														.addGroup(gl_contentPane.createSequentialGroup().addGap(124)
																.addGroup(gl_contentPane
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addComponent(textField_9,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblStartingdate))))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(2)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane
								.createSequentialGroup().addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblId)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblCnp).addComponent(lblName)
										.addComponent(lblAddress))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblUsername)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField_4, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_5, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblPassword)))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblContractId)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField_6, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_7, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_8, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_11, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblCarid).addComponent(lblClientid))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblStartingdate)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField_9, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_10, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblEndingdate)))
						.addComponent(lblCost))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnAddCustomerInfo)
						.addComponent(btnNewButton))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnUpdateCustomerInfo)
						.addComponent(btnUpdateContractInfo))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnDeleteCustomerInfo)
						.addComponent(btnDeleteContract))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnFindCustomerBy)
						.addComponent(btnFindContractBy))
				.addContainerGap(19, Short.MAX_VALUE)));
		antetTabel_1 = new DefaultTableModel(null,
				new Object[] { "id", "carID", "clientID", "starting_date", "ending_date", "cost" });
		table_1 = new JTable(antetTabel_1);
		scrollPane_1.setViewportView(table_1);

		antetTabel = new DefaultTableModel(null,
				new Object[] { "id", "cnp", "name", "address", "username", "password" });
		table = new JTable(antetTabel);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
