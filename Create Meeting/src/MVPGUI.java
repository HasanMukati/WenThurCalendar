import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MVPGUI {

	/*
	 
	 This iteration of the program simply answers the question.  
	 
	 All a user or developer could do is click on one or the other buttons and/or change the date and int variables 
	 for each date to change the constants of days left, holidays and meetings. 
	 
	 "If I schedule on Wednesdays, how many meetings
	 will we have between today and the end of 2019? If we move to Thursdays next year, how
	 many meetings will we have in total?" 
	 
	 As this is an open ended question I declared that there are 80 total work days left 
	 in 2019. 20 holidays and vacation days, and 20 meetings already set up .
	 
	 In 2020 there are 260 total work days left. 20 holidays and vacation days, 
	 and 0 meeting/s already set up.
	 
	 
	 
	 
	 */
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVPGUI window = new MVPGUI();
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
	public MVPGUI() {
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
		
		JLabel lblPickADate = new JLabel("Pick A Date ");
		lblPickADate.setBounds(187, 6, 76, 16);
		frame.getContentPane().add(lblPickADate);
		
		JButton btnNewButton = new JButton("Wednesday, December 25th 2019");
		btnNewButton.addActionListener(new ActionListener() {
		
		// Tells  user the number of days available in 2019, and adds the meeting to Wednesday making the years meeting total 21.  
			public void actionPerformed(ActionEvent e) {
		
		// Declares variables for  manipulation and output. Some aren't used in MVP will be used later. 
				int Meetingdays2019 = 20;
				int vacaholidaydays = 20;
				int workdays = 80;
				int addonemeeting = 1;
				int makemeeingweekly = 48;
				int makemeetingmonthly = 12;
				
			
		// Outputs the required text and does calculations to display days available and the added event. 		
		String output = "There are " +Meetingdays2019+  " meetings and " +vacaholidaydays +" vacation/holidays left in 2019\n"
		+ "That means you only have " + (workdays - vacaholidaydays - Meetingdays2019) + " working days left this year\n\n" + 
		"Now there are" + " " + (Meetingdays2019 + addonemeeting) + " meeting/s this year. \n";
				
				
				
			    JOptionPane.showMessageDialog(null, output);
			}
		});
		btnNewButton.setBounds(104, 72, 241, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnThursdayJanuarynd = new JButton("Thursday, January 2nd 2020");
		btnThursdayJanuarynd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Meetingdays2019 = 20;
				int vacaholidaydays = 20;
				int workdays = 260;
				int Meetingdays2020 = 0;
				int addonemeeting = 1;
				int makemeeingweekly = 5;
				int makemeetingmonthly = 20;
				
				
				String output = "There are already " +Meetingdays2020+  " meetings this year and " +vacaholidaydays +" vacation/holidays\n"
						+ "That means you only have " + (workdays - vacaholidaydays - Meetingdays2020) + " working days left this year\n\n" + 
						"Now there is" + " " + (Meetingdays2020 + addonemeeting) + " meeting/s in 2020, and still only " + Meetingdays2019 + " "
								+ "meeting/s in 2019 \n";
			   
				JOptionPane.showMessageDialog(null, output);

				
				
			}
		});
		btnThursdayJanuarynd.setBounds(104, 171, 241, 70);
		frame.getContentPane().add(btnThursdayJanuarynd);
	}
}
