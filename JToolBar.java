
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JToolBar extends JFrame {
	public JToolBar() {
		System.out.println("ToolBar 积己磊 积己");
		JToolBar tBar = new JToolBar();
		tBar.add(new JButton("1"));
		//tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("2"));
		//tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("场郴扁"));
		//tBar.addSeparator(new Dimension(50,20));
		getContentPane().add(tBar, BorderLayout.NORTH);
	}
}
