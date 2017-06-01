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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private DefaultTableModel antetTabel;
	private DefaultTableModel antetTabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JRadioButton rdbtnIsadmin;
	private JButton btnAddNewEmployee;
	private JButton btnUpdateEmployeeInfo;
	private JButton btnDeleteEmployee;
	private JButton btnFindEmployeeBy;
	private JButton btnAddNewCar;
	private JButton btnUpdateCarInfo;
	private JButton btnDeleteACar;
	private JButton btnFindCarBy;
	private JTextField textField_8;
	private JLabel lblAvailability;

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

	public JRadioButton getRdbtnIsadmin() {
		return rdbtnIsadmin;
	}

	public void setRdbtnIsadmin(JRadioButton rdbtnIsadmin) {
		this.rdbtnIsadmin = rdbtnIsadmin;
	}

	public JButton getBtnAddNewEmployee() {
		return btnAddNewEmployee;
	}

	public void setBtnAddNewEmployee(JButton btnAddNewEmployee) {
		this.btnAddNewEmployee = btnAddNewEmployee;
	}

	public JButton getBtnUpdateEmployeeInfo() {
		return btnUpdateEmployeeInfo;
	}

	public void setBtnUpdateEmployeeInfo(JButton btnUpdateEmployeeInfo) {
		this.btnUpdateEmployeeInfo = btnUpdateEmployeeInfo;
	}

	public JButton getBtnDeleteEmployee() {
		return btnDeleteEmployee;
	}

	public void setBtnDeleteEmployee(JButton btnDeleteEmployee) {
		this.btnDeleteEmployee = btnDeleteEmployee;
	}

	public JButton getBtnFindEmployeeBy() {
		return btnFindEmployeeBy;
	}

	public void setBtnFindEmployeeBy(JButton btnFindEmployeeBy) {
		this.btnFindEmployeeBy = btnFindEmployeeBy;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JButton getBtnAddNewCar() {
		return btnAddNewCar;
	}

	public void setBtnAddNewCar(JButton btnAddNewCar) {
		this.btnAddNewCar = btnAddNewCar;
	}

	public JButton getBtnUpdateCarInfo() {
		return btnUpdateCarInfo;
	}

	public void setBtnUpdateCarInfo(JButton btnUpdateCarInfo) {
		this.btnUpdateCarInfo = btnUpdateCarInfo;
	}

	public JButton getBtnDeleteACar() {
		return btnDeleteACar;
	}

	public void setBtnDeleteACar(JButton btnDeleteACar) {
		this.btnDeleteACar = btnDeleteACar;
	}

	public JButton getBtnFindCarBy() {
		return btnFindCarBy;
	}

	public void setBtnFindCarBy(JButton btnFindCarBy) {
		this.btnFindCarBy = btnFindCarBy;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView();
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
	public AdminView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		JScrollPane scrollPane_1 = new JScrollPane();

		JLabel lblEmplId = new JLabel("empl. id");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblName = new JLabel("name");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblUsername = new JLabel("username");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblPassword = new JLabel("password");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		rdbtnIsadmin = new JRadioButton("isAdmin");

		btnAddNewEmployee = new JButton("Add new employee");

		btnUpdateEmployeeInfo = new JButton("Update employee info");

		btnDeleteEmployee = new JButton("Delete employee");

		btnFindEmployeeBy = new JButton("Find employee by id");

		JLabel lblCarId = new JLabel("car id");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		JLabel lblBrand = new JLabel("brand");

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		JLabel lblModel = new JLabel("model");

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		JLabel lblPriceday = new JLabel("price/day");

		textField_7 = new JTextField();
		textField_7.setColumns(10);

		btnAddNewCar = new JButton("Add new car");

		btnUpdateCarInfo = new JButton("Update car info");

		btnDeleteACar = new JButton("Delete a car");

		btnFindCarBy = new JButton("Find car by id");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		lblAvailability = new JLabel("availability");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEmplId)
							.addGap(75)
							.addComponent(lblName)
							.addGap(91)
							.addComponent(lblUsername)
							.addGap(66)
							.addComponent(lblPassword))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnFindEmployeeBy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnDeleteEmployee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnUpdateEmployeeInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(rdbtnIsadmin)
								.addGap(18)
								.addComponent(btnAddNewEmployee, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnUpdateCarInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnFindCarBy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblCarId)
							.addGap(90)
							.addComponent(lblBrand)
							.addGap(92)
							.addComponent(lblModel)
							.addGap(99)
							.addComponent(lblPriceday)
							.addGap(18)
							.addComponent(lblAvailability))
						.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
						.addComponent(btnDeleteACar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddNewCar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEmplId)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblName)
								.addComponent(lblUsername)
								.addComponent(lblPassword))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnIsadmin)
								.addComponent(btnAddNewEmployee))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdateEmployeeInfo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPriceday)
									.addComponent(lblAvailability))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCarId)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblBrand)
								.addComponent(lblModel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAddNewCar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdateCarInfo)))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDeleteEmployee)
						.addComponent(btnDeleteACar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFindEmployeeBy)
						.addComponent(btnFindCarBy))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		antetTabel_1 = new DefaultTableModel(null,
				new Object[] { "id", "brand", "podel", "price/day", "availability" });
		table_1 = new JTable(antetTabel_1);
		scrollPane_1.setViewportView(table_1);

		antetTabel = new DefaultTableModel(null, new Object[] { "id", "name", "username", "password", "isAdmin" });
		table = new JTable(antetTabel);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
