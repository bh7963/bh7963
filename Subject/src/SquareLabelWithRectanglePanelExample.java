import javax.swing.*;
import java.awt.*;

public class SquareLabelWithRectanglePanelExample {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Square JLabel with Centered Rectangle JPanel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Create an outer square JLabel
            JLabel outerLabel = new JLabel();
            outerLabel.setPreferredSize(new Dimension(200, 200)); // Set preferred size for square
            outerLabel.setLayout(new GridBagLayout()); // Use GridBagLayout to center innerPanel
            
            // Create an inner JPanel with rectangle shape
            JPanel innerPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.RED);
                    // Calculate position to center rectangle
                    int x = (getWidth() - 150) / 2; // (Outer width - Rectangle width) / 2
                    int y = (getHeight() - 100) / 2; // (Outer height - Rectangle height) / 2
                    g.fillRect(x, y, 150, 100); // Draw a red rectangle
                }
                
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(150, 100); // Set preferred size for inner panel
                }
            };
            
            // Add the inner panel to the outer label using GridBagLayout constraints
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            outerLabel.add(innerPanel, gbc);
            
            // Add the outer label to the frame
            frame.getContentPane().add(outerLabel, BorderLayout.CENTER);
            
            frame.pack();
            frame.setVisible(true);
        });
    }
}