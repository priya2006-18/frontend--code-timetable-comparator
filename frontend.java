import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FacultyLogin extends JFrame implements ActionListener {

    // Components
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JLabel messageLabel;

    // Demo credentials
    String[][] users = {
        {"faculty1", "pass123"},
        {"faculty2",
