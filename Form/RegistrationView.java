import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationView extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JComboBox<String> courseComboBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JCheckBox jsCheckBox;
    private JTextField ageField;
    private JButton submitButton;

    public RegistrationView() {
        setTitle("Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));

        // Name
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Email
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        // Gender
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderPanel);

        // Course
        panel.add(new JLabel("Course:"));
        String[] courses = {"Computer Science", "Mathematics", "Physics"};
        courseComboBox = new JComboBox<>(courses);
        panel.add(courseComboBox);

        // Languages
        panel.add(new JLabel("Languages Known:"));
        JPanel languagePanel = new JPanel();
        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        jsCheckBox = new JCheckBox("JavaScript");
        languagePanel.add(javaCheckBox);
        languagePanel.add(pythonCheckBox);
        languagePanel.add(jsCheckBox);
        panel.add(languagePanel);

        // Age
        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        // Submit Button
        submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Empty label to fill the grid
        panel.add(new JLabel());

        add(panel);

        // Add ActionListener for submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        String name = nameField.getText();
        String email = emailField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String course = (String) courseComboBox.getSelectedItem();
        StringBuilder languages = new StringBuilder();
        if (javaCheckBox.isSelected()) languages.append("Java ");
        if (pythonCheckBox.isSelected()) languages.append("Python ");
        if (jsCheckBox.isSelected()) languages.append("JavaScript ");
        int age = Integer.parseInt(ageField.getText());

        // Display the collected information
        String message = String.format("Name: %s\nEmail: %s\nGender: %s\nCourse: %s\nLanguages: %s\nAge: %d",
                name, email, gender, course, languages.toString(), age);

        JOptionPane.showMessageDialog(this, message, "Registration Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationView view = new RegistrationView();
            view.setVisible(true);
        });
    }
}
