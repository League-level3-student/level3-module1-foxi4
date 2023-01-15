package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */

	public class _02_GuestBook extends JFrame implements ActionListener {
	    JButton addNames;
	    JButton viewNames;
	    ArrayList<String> names = new ArrayList<String>();

	    public _02_GuestBook() {
	        start();
	    }

	    public void start() {
	        JFrame frame = new JFrame("Guest Book!!!!!");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500, 500);
	        JPanel panel = new JPanel();
	        frame.add(panel);
	        addNames = new JButton("Add Name");
	        viewNames = new JButton("View Names");
	        panel.add(addNames);
	        panel.add(viewNames);
	        addNames.addActionListener(this);
	        viewNames.addActionListener(this);
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        _02_GuestBook guestbook = new _02_GuestBook();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == addNames) {
	            String name = JOptionPane.showInputDialog("Enter a name: ");
	            names.add(name);
	        }

	        if (e.getSource() == viewNames) {
	            for (int i = 0; i < names.size(); i++) {
	                System.out.println("Guest #" + i + ": " + names.get(i));
	            }
	        }
	    }
	}
	/* INCORRECT CODE BELOW
	 
	public GuestBook() {
		start();
	}
	public void start(){
		//add panel/frame/actionlistener
	JFrame frame = new JFrame("Guest Book!!!!!");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(addNames);
    panel.add(viewNames);
	addNames = new JButton("Add Name");
	viewNames = new JButton("View Names");
	addNames.addActionListener(this);
	viewNames.addActionListener(this);
	frame.setVisible(true);
	}
	public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				
		if(addNames == e.getSource()) {
			//line of code checks (e.getSource) what was "triggered," in this case it's addNames
			String name = JOptionPane.showInputDialog("Enter a name: ");
			names.add(name);
		}
		
		if(viewNames == e.getSource()) {
			for(int i=0; i<names.size(); i++) {
				System.out.print("Guest #" +i+": " +names.get(i));
			}
		}
	}

}
*/
