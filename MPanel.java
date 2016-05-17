import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MPanel extends JPanel {//mainpanel
	public MPanel() {
		setBackground(Color.gray);
		setLayout(new BorderLayout(30,20));
		add(new InputPanel(),BorderLayout.SOUTH);
	}
}
