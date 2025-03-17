import javax.swing.*;
import java.awt.*;

public class EstudiForm extends JFrame {
    private JTextField nombre, edad, curso;
    private JButton confirmar;

    public EstudiForm() {
        setTitle("Formulario Estudiante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setVisible(true);

        nimbus();

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.CYAN);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;

        panel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        nombre = new JTextField(15);
        panel.add(nombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Edad:"), gbc);
        gbc.gridx = 1;
        edad = new JTextField(15);
        panel.add(edad, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Curso:"), gbc);
        gbc.gridx = 1;
        curso = new JTextField(15);
        panel.add(curso, gbc);

        add(panel);

        confirmar = new JButton("Confirmar");
        confirmar.setBackground(new Color(97, 255, 30));
        confirmar.setForeground(Color.RED);
        confirmar.setFocusPainted(false);
        confirmar.setBorder(BorderFactory.createRaisedBevelBorder());

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        panel.add(confirmar, gbc);

        confirmar.addActionListener(e -> saveEstudiForm());
        setVisible(true);

    }

    private void saveEstudiForm() {
        String name = nombre.getText().trim();
        String age = edad.getText().trim();
        String curs = curso.getText().trim();

        if (name.isEmpty() || age.isEmpty() || curs.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Estudiante estudiante = new Estudiante(name, age, curs);
            JOptionPane.showMessageDialog(this, "Datos guardados:\n" + estudiante, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void nimbus() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}