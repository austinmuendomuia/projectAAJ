//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class loginpage {
//
//    public static void main(String[] args) {
//        //Create a new Window
//        JFrame frame = new JFrame();
//
//        //Create the Label for Username and set its position
//        JLabel lblUsername = new JLabel("Enter Username");
//        lblUsername.setBounds(10,10,200,30);
//
//        //Create the textfield for username and set its size. Take note of the naming
//        JTextField txtUserName = new JTextField();
//        txtUserName.setEditable(true);
//        txtUserName.setBounds(10, 50, 200, 30);
//
//        //Create the label for Password and set its size
//        JLabel lblPassword = new JLabel("Enter Password");
//        lblPassword.setBounds(10, 90, 200, 30);
//
//        //Create the password field and set its size and position
//        JPasswordField txtPassword = new JPasswordField();
//        txtPassword.setEditable(true);
//        txtPassword.setBounds(10, 130, 200, 30);
//
//        //Create the button to save the user (trigger an action)
//        JButton buttonSave = new JButton("Add User");
//        buttonSave.setBounds(10,170,200,40);
//
//        //Create the Label to display to the user the response
//        JLabel label = new JLabel("Waiting for Connection");
//        label.setBounds(10, 240, 200, 30);
//
//        //Add the actions for the button
//        buttonSave.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//                //Get input from the form.
//                String userName = txtUserName.getText();
//                //Get the password and convert to string equivalent
//                String password = String.valueOf(txtPassword.getPassword());
//
//                //Create the sql statement
//                String sql_users = "insert into user_details(`username`,`password`) values('"+userName+"','"+password+"')";
//
//                //Create the Db object from Database Connection Class
//                jdbcconnector db = new jdbcconnector();
//
//                //Insert the data and get the result
//                String result = db.(sql_users);
//
//                //Set the result to the label on the form
//                label.setText(result);
//
//                //Clear the inputs to allow user to type more values
//                txtUserName.setText("");
//                txtPassword.setText("");
//
//                //Move the curser to the username
//                txtUserName.requestFocusInWindow();
//            }
//        });
//
//        //Set the title of the Frame
//        frame.setTitle("SAMPLE Interface");
//
//        //Set the window to close and terminate the running project when user clicks X
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Set the size and position of the window
//        frame.setBounds(0, 0, 600, 800);
//
//        //Add the labels, textfields and password fields to the frame
//        frame.add(lblUsername);
//        frame.add(txtUserName);
//        frame.add(lblPassword);
//        frame.add(txtPassword);
//        frame.add(buttonSave);
//        frame.add(label);
//
//        //Make the frame visible
//        frame.setVisible(true);
//
//    }
//}