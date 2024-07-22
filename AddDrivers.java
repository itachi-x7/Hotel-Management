/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddDrivers extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4, t5;
    private JComboBox comboBox, comboBox_1;
    JButton b1,b2;
    Choice c1;

    public static void main(String[] args) {
        new AddDrivers().setVisible(true);
    }


    public AddDrivers() {
        setBounds(450, 200, 1000, 500);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleven.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(400,30,500,370);
                add(l15);
        
        JLabel l10 = new JLabel("Add Drivers");
        l10.setFont(new Font("Tahoma", Font.BOLD, 18));
	l10.setBounds(194, 10, 120, 22);
	contentPane.add(l10);
        
	
        
	JLabel l1 = new JLabel("Name");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(64, 70, 102, 22);
	contentPane.add(l1);
        
        
        t1 = new JTextField();
	t1.setBounds(174, 70, 156, 20);
	contentPane.add(t1);
        

	JLabel l2 = new JLabel("Age");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(64, 110, 102, 22);
	contentPane.add(l2);
        
        t2 = new JTextField();
	t2.setBounds(174, 110, 156, 20);
	contentPane.add(t2);


	JLabel l3 = new JLabel("Gender");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(64, 150, 102, 22);
	contentPane.add(l3);
        
        comboBox = new JComboBox(new String[] { "Male", "Female" });
	comboBox.setBounds(176, 150, 154, 20);
	contentPane.add(comboBox);

	JLabel l4 = new JLabel("Car Company");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(64, 190, 102, 22);
	contentPane.add(l4);
        
        t3 = new JTextField();
	t3.setBounds(174, 190, 156, 20);
	contentPane.add(t3);

        JLabel l5 = new JLabel("Car Brand");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(64, 230, 102, 22);
	contentPane.add(l5);


        t4 = new JTextField();
	t4.setBounds(174, 230, 156, 20);
	contentPane.add(t4);

	
        JLabel l6 = new JLabel("Available");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(64, 270, 102, 22);
	contentPane.add(l6);


        comboBox_1 = new JComboBox(new String[] { "Yes", "No" });
	comboBox_1.setBounds(176, 270, 154, 20);
	contentPane.add(comboBox_1);

        
        JLabel l7 = new JLabel("Location");
	l7.setForeground(new Color(25, 25, 112));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(64, 310, 102, 22);
	contentPane.add(l7);


        t5 = new JTextField();
	t5.setBounds(174, 310, 156, 20);
	contentPane.add(t5);
        
	

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBounds(64, 380, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBounds(198, 380, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn c = new conn();
                String name = t1.getText();
                String age = t2.getText();
                String gender = (String)comboBox.getSelectedItem();
                String company  = t3.getText();
                String brand = t4.getText();
                String available = (String)comboBox_1.getSelectedItem();
                String location = t5.getText();
                String str = "INSERT INTO driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+brand+"', '"+available+"','"+location+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
            }
        }catch(Exception eee){
            
        }
    }
}
/*
package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AddEmployee extends JFrame {
    JTextField textField, textField_1, textField_3, textField_4, textField_5, textField_6;
    JComboBox<String> c1;

    public AddEmployee() {
        // Set the frame properties
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");

        // Close the frame when the user closes the window
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778, 486);
        getContentPane().setLayout(null);

        // Add label and text field for employee name
        JLabel Passportno = new JLabel("NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(60, 30, 150, 27);
        add(Passportno);

        textField = new JTextField();
        textField.setBounds(200, 30, 150, 27);
        add(textField);

        // Add Save button
        JButton Next = new JButton("SAVE");
        Next.setBounds(200, 420, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);

        // Add label and text field for employee age
        JLabel Pnrno = new JLabel("AGE");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 80, 150, 27);
        add(Pnrno);

        textField_1 = new JTextField();
        textField_1.setBounds(200, 80, 150, 27);
        add(textField_1);

        // Add label and radio buttons for gender
        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 120, 150, 27);
        add(Gender);

        JRadioButton NewRadioButton = new JRadioButton("MALE");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(200, 120, 70, 27);
        add(NewRadioButton);

        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 120, 70, 27);
        add(Female);

        // Group the radio buttons to ensure only one can be selected
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(NewRadioButton);
        genderGroup.add(Female);

        // Add label and combo box for job
        JLabel Address = new JLabel("JOB");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 170, 150, 27);
        add(Address);

        String course[] = { "Front Desk Clerks", "Porters", "Housekeeping", "Kitchen Staff", "Room Service", "Waiter/Waitress", "Manager", "Accountant", "Chef" };
        c1 = new JComboBox<>(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 170, 150, 30);
        add(c1);

        // Add label and text field for salary
        JLabel Nationality = new JLabel("SALARY");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(60, 220, 150, 27);
        add(Nationality);

        textField_3 = new JTextField();
        textField_3.setBounds(200, 220, 150, 27);
        add(textField_3);

        // Add label and text field for phone number
        JLabel Name = new JLabel("PHONE");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 270, 150, 27);
        add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 270, 150, 27);
        add(textField_4);

        // Add label and text field for Aadhar number
        JLabel Phno = new JLabel("AADHAR");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(60, 320, 150, 27);
        add(Phno);

        textField_5 = new JTextField();
        textField_5.setBounds(200, 320, 150, 27);
        add(textField_5);

        // Add label and text field for email
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 370, 150, 27);
        add(email);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 370, 150, 27);
        add(textField_6);

        // Add header label
        JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(450, 24, 442, 35);
        add(AddPassengers);

        // Add an image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tenth.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(410, 80, 480, 410);
        add(image);

        // Add action listener to the Save button to handle input validation and database insertion
        Next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Get input values
                String name = textField.getText();
                String age = textField_1.getText();
                String salary = textField_3.getText();
                String phone = textField_4.getText();
                String aadhar = textField_5.getText();
                String email = textField_6.getText();

                String gender = null;
                if (NewRadioButton.isSelected()) {
                    gender = "male";
                } else if (Female.isSelected()) {
                    gender = "female";
                }

                String job = (String) c1.getSelectedItem();

                // Input validation
                if (name.isEmpty() || age.isEmpty() || salary.isEmpty() || phone.isEmpty() || aadhar.isEmpty() || email.isEmpty() || gender == null || job == null) {
                    JOptionPane.showMessageDialog(null, "All fields are required.");
                    return;
                }

                try {
                    Integer.parseInt(age);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid age.");
                    return;
                }

                try {
                    Double.parseDouble(salary);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid salary.");
                    return;
                }

                try {
                    Long.parseLong(phone);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid phone number.");
                    return;
                }

                try {
                    Long.parseLong(aadhar);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid Aadhar number.");
                    return;
                }

                // Database insertion using PreparedStatement
                try {
                    conn c = new conn();
                    String str = "INSERT INTO employee (name, age, gender, job, salary, phone, aadhar, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = c.s.prepareStatement(str);
                    pst.setString(1, name);
                    pst.setString(2, age);
                    pst.setString(3, gender);
                    pst.setString(4, job);
                    pst.setString(5, salary);
                    pst.setString(6, phone);
                    pst.setString(7, aadhar);
                    pst.setString(8, email);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Employee Added");
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(900, 600);
        setVisible(true);
        setLocation(530, 200);
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}

*/
