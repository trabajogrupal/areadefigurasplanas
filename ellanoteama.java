import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraAreas extends JFrame implements ActionListener {
    private JTextField radioField, baseField, alturaField;
    private JButton calcularCirculoBtn, calcularTrianguloBtn;

    public CalculadoraAreas() {
        setTitle("Calculadora de Áreas");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel radioLabel = new JLabel("Radio:");
        radioLabel.setBounds(20, 20, 80, 25);
        add(radioLabel);

        radioField = new JTextField(10);
        radioField.setBounds(100, 20, 160, 25);
        add(radioField);

        calcularCirculoBtn = new JButton("Calcular Área del Círculo");
        calcularCirculoBtn.setBounds(20, 50, 240, 25);
        calcularCirculoBtn.addActionListener(this);
        add(calcularCirculoBtn);

        JLabel baseLabel = new JLabel("Base:");
        baseLabel.setBounds(20, 80, 80, 25);
        add(baseLabel);

        baseField = new JTextField(10);
        baseField.setBounds(100, 80, 160, 25);
        add(baseField);

        JLabel alturaLabel = new JLabel("Altura:");
        alturaLabel.setBounds(20, 110, 80, 25);
        add(alturaLabel);

        alturaField = new JTextField(10);
        alturaField.setBounds(100, 110, 160, 25);
        add(alturaField);

        calcularTrianguloBtn = new JButton("Calcular Área del Triángulo");
        calcularTrianguloBtn.setBounds(20, 140, 240, 25);
        calcularTrianguloBtn.addActionListener(this);
        add(calcularTrianguloBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularCirculoBtn) {
            double radio = Double.parseDouble(radioField.getText());
            double areaCirculo = Math.PI * radio * radio;
            JOptionPane.showMessageDialog(this, "El área del círculo es: " + areaCirculo);
        } else if (e.getSource() == calcularTrianguloBtn) {
            double base = Double.parseDouble(baseField.getText());
            double altura = Double.parseDouble(alturaField.getText());
            double areaTriangulo = (base * altura) / 2;
            JOptionPane.showMessageDialog(this, "El área del triángulo es: " + areaTriangulo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraAreas app = new CalculadoraAreas();
            app.setVisible(true);
        });
    }
}
