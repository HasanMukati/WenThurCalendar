import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class NewMeeting {

	/*
	 
	This program has lots of features that would allow a user or developer to choose between the two dates as well as 
	weekly and monthly features. A user also has the option to refresh the screen. A developer could add more contants
	or change the contants by changing the global variables. 
	
	 Document differences between your two approaches. 
	 
	 This iteration of the program answers the question with some added features. 
	 
	 Firstly, I made all outputs disply  on the application window instead of the console. 
	 
	 Next, I made the constants such as meetings, days left and holidays and made all of them changable through what the
	 user clicks. 
	 
	 I added the Weekly and Monthly features allowing the user to see how many meetings and days left they would have
	 if they chose one or the other. 
	 
	 I added a total feature  so the user can easily see the  total depending on the option he/she chooses
	 
	 I added a refresh button so that the user doesnt have to close the program to begin anew. 
	 
	 Have you covered other potential inputs or configuration? 
	 
	 The program doesn't allow inputs but all contants can be easily configured through the global variables, changing
	 the output for what the user clicks, that we this application can be configured for anyone. 
	 
	 Future cases: 
	 
	 The user could change global variables in the begining to modify the program to the 
	 days, holidays and meetings he/she has. 
	 
	 To make this program better we could add buttons for more days and/or allow for initial user input if needed.
	 
	 */
	// labels
	
	private JFrame frame;

	private JLabel lblPickADate;
	private JLabel lblDaysLeft;
	private JLabel lblHolidaysvaca;
	private JLabel lblMeetings;
	private JLabel label;
	private JLabel lblDaysLeft_1;
	private JLabel lblMeetings_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
	// variables 
	private int Meetingdays2019 = 20;
	private int workdaysleft  = 80;
	private int vacaholidaydays = 20;
	private int workdaysleft1 = 260;
	private int Meetingdays2020 = 0;
	private int addonemeeting = 1;
	private int makemeeingweekly = 48;
	private int makemeetingmonthly = 12;
	private JButton btnMonthly;
	private JButton button;
	private JLabel lblTotal;



	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMeeting window = new NewMeeting();
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
	public NewMeeting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblPickADate = new JLabel("Pick a Date:");
		lblPickADate.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblPickADate.setBounds(37, 6, 79, 34);
		frame.getContentPane().add(lblPickADate);
		
		
	
	// adds one meeting day to the year
		JButton btnNewButton = new JButton("Wednesday, 2019");
		btnNewButton.addActionListener(new ActionListener() {
		
		 
			public void actionPerformed(ActionEvent e) {
		
		
				
			
			
		String output = "There are " +Meetingdays2019+  " meetings and " +vacaholidaydays +" vacation/holidays left in 2019\n"
		+ "That means you only have " + (workdaysleft - vacaholidaydays - Meetingdays2019) + " working days left this year\n\n" + 
		"Now there are" + " " + (Meetingdays2019 + addonemeeting) + " meeting/s this year. \n";
				
				
				 
				lblDaysLeft.setText(""+ (workdaysleft-addonemeeting) + " Days Left");
				lblHolidaysvaca.setText("" +vacaholidaydays+ " Holidays");
				lblMeetings.setText(""+ (Meetingdays2019 + addonemeeting) + " meetings now");
				
				lblDaysLeft_1.setText(""+ (workdaysleft1) + " Days Left");
				label.setText("" + vacaholidaydays+ " Holidays");
				lblMeetings_1.setText(""+ (Meetingdays2020) + " meetings now");
				
				
				lblTotal.setText("Total Meetings: " +  (Meetingdays2019 + addonemeeting));
			   // JOptionPane.showMessageDialog(null, output);
				

				
		
			}
		});
		btnNewButton.setBounds(1, 65, 220, 70);
		frame.getContentPane().add(btnNewButton);
		
		
		//add meeting to Thursday of next week
		JButton btnThursdayJanuarynd = new JButton("Thursday, 2020");
		btnThursdayJanuarynd.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnThursdayJanuarynd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				/*String output = "There are already " +Meetingdays2020+  " meetings this year and " +vacaholidaydays +" vacation/holidays\n"
						+ "That means you only have " + (workdays - vacaholidaydays - Meetingdays2020) + " working days left this year\n\n" + 
						"Now there is" + " " + (Meetingdays2020 + addonemeeting) + " meeting/s in 2020, and still only " + Meetingdays2019 + " "
								+ "meeting/s in 2019 \n";
			   */
				
				lblDaysLeft_1.setText(""+ (workdaysleft1-addonemeeting) + " Days Left");
				label.setText("" + vacaholidaydays+ " Holidays");
				lblMeetings_1.setText(""+ (Meetingdays2020 + addonemeeting) + " meetings now");
				
				lblDaysLeft.setText(""+ workdaysleft + " Days Left");
				lblMeetings.setText("" + Meetingdays2019 + "  meetings now");
				
				lblTotal.setText("Total Meetings: " +  (Meetingdays2019 + addonemeeting));
				
				
				//JOptionPane.showMessageDialog(null, output);

				
				
			}
		});
		btnThursdayJanuarynd.setBounds(1, 181, 220, 70);
		frame.getContentPane().add(btnThursdayJanuarynd);
		
		lblMeetings = new JLabel("20 Meetings 2019");
		lblMeetings.setBounds(233, 65, 123, 16);
		frame.getContentPane().add(lblMeetings);
		
		lblHolidaysvaca = new JLabel("20  Holidays/Vaca");
		lblHolidaysvaca.setBounds(233, 91, 123, 16);
		frame.getContentPane().add(lblHolidaysvaca);
		
		lblDaysLeft = new JLabel("80 Days Left 2019");
		lblDaysLeft.setBounds(233, 119, 123, 16);
		frame.getContentPane().add(lblDaysLeft);
		
		lblMeetings_1 = new JLabel("0 Meetings 2020");
		lblMeetings_1.setBounds(233, 181, 123, 16);
		frame.getContentPane().add(lblMeetings_1);
		
		label = new JLabel("20  Holidays/Vaca");
		label.setBounds(233, 207, 123, 16);
		frame.getContentPane().add(label);
		
		lblDaysLeft_1 = new JLabel("260 Days Left 2020");
		lblDaysLeft_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblDaysLeft_1.setBounds(233, 235, 117, 16);
		frame.getContentPane().add(lblDaysLeft_1);
		
		
		// makes that one meeting weekly 2019
		
		JButton btnNewButton_1 = new JButton("Weekly");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				lblTotal.setText("Total Meetings: " + (Meetingdays2019 + makemeeingweekly));
				
				lblDaysLeft_1.setText(""+ (workdaysleft1) + " Days Left");
				label.setText("" + vacaholidaydays+ " Holidays");
				lblMeetings_1.setText(""+ (Meetingdays2020) + " meetings now");
				
				lblDaysLeft.setText(""+ (workdaysleft-makemeeingweekly) + " Days Left");
				lblMeetings.setText(""+ (Meetingdays2019 + makemeeingweekly) + " meetings now");	
			}
		});
		btnNewButton_1.setBounds(351, 65, 93, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		// makes that one meeting weekly 2020
		btnNewButton_2 = new JButton("Weekly");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblTotal.setText("Total Meetings: " + (Meetingdays2019 + makemeeingweekly));
				
				lblDaysLeft.setText(""+ workdaysleft + " Days Left");
				lblMeetings.setText("" + Meetingdays2019 + "  meetings now");
				
				lblDaysLeft_1.setText(""+ (workdaysleft1-makemeeingweekly) + " Days Left");
				lblMeetings_1.setText(""+ (Meetingdays2020 + makemeeingweekly) + " meetings now");	
			}
		});
		btnNewButton_2.setBounds(351, 176, 93, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		// makes that one meeting monthly 2019
		btnMonthly = new JButton("Monthly");
		btnMonthly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblTotal.setText("Total Meetings: " + (Meetingdays2019 + makemeetingmonthly));
				
				lblDaysLeft_1.setText(""+ (workdaysleft1) + " Days Left");
				label.setText("" + vacaholidaydays+ " Holidays");
				lblMeetings_1.setText(""+ (Meetingdays2020) + " meetings now");
				
				lblDaysLeft.setText(""+ (workdaysleft-makemeetingmonthly) + " Days Left");
				lblMeetings.setText(""+ (Meetingdays2019 + makemeetingmonthly) + " meetings now");	
				
			}
		});
		btnMonthly.setBounds(351, 106, 93, 29);
		frame.getContentPane().add(btnMonthly);
		
		// makes that one meeting monthly 2020
		button = new JButton("Monthly");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblTotal.setText("Total Meetings: " + (Meetingdays2019 + makemeetingmonthly));
				
				lblDaysLeft.setText(""+ workdaysleft + " Days Left");
				lblMeetings.setText("" + Meetingdays2019 + "  meetings now");
				
				lblDaysLeft_1.setText(""+ (workdaysleft1-makemeetingmonthly) + " Days Left");
				lblMeetings_1.setText(""+ (Meetingdays2020 + makemeetingmonthly) + " meetings now");	
				
			}
		});
		button.setBounds(351, 222, 93, 29);
		frame.getContentPane().add(button);
		
		lblTotal = new JLabel("Total Meetings:");
		lblTotal.setBounds(300, 15, 1109, 16);
		frame.getContentPane().add(lblTotal);
		
		
		// Refresh button
		btnNewButton_3 = new JButton("");
		
		Image img  = new ImageIcon(this.getClass().getResource("/refresh2.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img));
		
		btnNewButton_3.addActionListener(new ActionListener() {
			
		
			
			public void actionPerformed(ActionEvent e) {
				
				lblTotal.setText("Total Meetings: "+ Meetingdays2019);
				lblDaysLeft.setText(""+ workdaysleft + " Days Left");
				lblMeetings.setText("" + Meetingdays2019 + "  meetings now");
				
				lblDaysLeft_1.setText(""+ (workdaysleft1) + " Days Left");
				lblMeetings_1.setText(""+ (Meetingdays2020) + " meetings now");	
				
				
			}
		});
		btnNewButton_3.setBounds(209, 6, 34, 34);
		frame.getContentPane().add(btnNewButton_3);
		
		
		
	
	}
}
