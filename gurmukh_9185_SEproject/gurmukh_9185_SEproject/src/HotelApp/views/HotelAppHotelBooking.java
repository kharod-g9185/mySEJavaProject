package HotelApp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import HotelApp.common.HotelAppInterface;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class HotelAppHotelBooking implements HotelAppInterface{

	public JFrame frmHotelBooking;
	private JLabel lblHotelBookingTitle;
	private JLabel lblHotelBookingInstructions;
	private JLabel lblChooseRoom;
	private JComboBox<String> comboBoxRoomSize;
	private JComboBox<String> comboBoxLocation;
	private JLabel lblHotelLocations;
	private JLabel lblChooseAdditions;
	private JComboBox<String> comboBoxAdditions;
	private JLabel lblNightsStaying;
	private JComboBox<String> comboBoxNightsStaying;
	private JLabel lblAccountCreated;
	private JComboBox<String> comboBoxAccountCreated;
	private JButton btnHotelBooking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAppHotelBooking window = new HotelAppHotelBooking();
					window.frmHotelBooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HotelAppHotelBooking() {
		initComponents();
		createEvents();
	}

	@Override
	public void clearFields() {
		comboBoxRoomSize.setSelectedIndex(0);
		comboBoxLocation.setSelectedIndex(0);
		comboBoxAdditions.setSelectedIndex(0);
		comboBoxNightsStaying.setSelectedIndex(0);
		comboBoxAccountCreated.setSelectedIndex(0);
		
	}

	@Override
	public void initComponents() {
		frmHotelBooking = new JFrame();
		frmHotelBooking.setTitle("Hotel Booking");
		frmHotelBooking.setBounds(100, 100, 400, 400);
		frmHotelBooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblHotelBookingTitle = new JLabel("Hotel App Hotel Booking");
		lblHotelBookingTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		lblHotelBookingInstructions = new JLabel("Please choose one option from each section below.");
		lblHotelBookingInstructions.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblChooseRoom = new JLabel("ChooseRoomSize: ($100 more per size)");
		
		comboBoxRoomSize = new JComboBox<String>();
		comboBoxRoomSize.setModel(new DefaultComboBoxModel(new String[] {"Small", "Medium", "Large"}));
		
		lblChooseAdditions = new JLabel("Choose A Room Addition: ($25 for addition)");
		
		comboBoxAdditions = new JComboBox<String>();
		comboBoxAdditions.setModel(new DefaultComboBoxModel(new String[] {"Resteraunt", "TV", "Pool", "None"}));
		
		lblHotelLocations = new JLabel("Choose Hotel Location: (no extra cost!)");
		
		comboBoxLocation = new JComboBox<String>();
		comboBoxLocation.setModel(new DefaultComboBoxModel<String>(new String[] {"Canada", "USA", "Mexico"}));
		
		lblNightsStaying = new JLabel("Nights Staying: (Up to 3 - $50 per night)");
		
		comboBoxNightsStaying = new JComboBox<String>();
		comboBoxNightsStaying.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3"}));
		
		lblAccountCreated = new JLabel("Have You Created a User Account? (10% discount)");
		
		comboBoxAccountCreated = new JComboBox<String>();
		comboBoxAccountCreated.setModel(new DefaultComboBoxModel<String>(new String[] {"Yes", "No"}));
		
		btnHotelBooking = new JButton("Confirm Hotel Booking");
		
		
		GroupLayout groupLayout = new GroupLayout(frmHotelBooking.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(77)
							.addComponent(lblHotelBookingTitle))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblAccountCreated)
								.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
								.addComponent(comboBoxAccountCreated, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNightsStaying)
								.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
								.addComponent(comboBoxNightsStaying, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblHotelLocations)
								.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
								.addComponent(comboBoxLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblChooseAdditions)
								.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
								.addComponent(comboBoxAdditions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblChooseRoom)
								.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
								.addComponent(comboBoxRoomSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(60)
								.addComponent(lblHotelBookingInstructions))))
					.addContainerGap(79, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(90)
					.addComponent(btnHotelBooking)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHotelBookingTitle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHotelBookingInstructions)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseRoom)
						.addComponent(comboBoxRoomSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblChooseAdditions)
						.addComponent(comboBoxAdditions, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHotelLocations)
						.addComponent(comboBoxLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNightsStaying)
						.addComponent(comboBoxNightsStaying, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxAccountCreated, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAccountCreated))
					.addGap(18)
					.addComponent(btnHotelBooking)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		frmHotelBooking.getContentPane().setLayout(groupLayout);
		
	}

	@Override
	public void createEvents() {
		btnHotelBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cost = 00.00;
				DecimalFormat df = new DecimalFormat("#####.##");
				String roomSize = comboBoxRoomSize.getSelectedItem().toString();
				String location = comboBoxLocation.getSelectedItem().toString();
				String additions = comboBoxAdditions.getSelectedItem().toString();
				String nightsStaying = comboBoxNightsStaying.getSelectedItem().toString();
				String accountCreated = comboBoxAccountCreated.getSelectedItem().toString();
				switch(roomSize) {
					case "Small":
						cost += 100.00;
					case "Medium":
						cost += 200.00;
					case "Large":
						cost += 300.00;
				}
				switch(additions) {
					case "Resteraunt":
						cost += 25.00;
					case "TV":
						cost += 25.00;
					case "Pool":
						cost += 25.00;
					case "None":
						cost += 00.00;
				}
				switch(nightsStaying) {
					case "1":
						cost += 50.00;
					case "2":
						cost += 100.00;
					case "3":
						cost += 150.00;
				}
				switch(accountCreated) {
					case "Yes":
						cost = (cost - (cost * 0.10));
					case "No":
				}
				df.format(cost);
				JOptionPane.showMessageDialog(null, "Total cost: $" + cost);
				cost = 00.00;
				clearFields();
			}
		});
		
		
		
	}
}
