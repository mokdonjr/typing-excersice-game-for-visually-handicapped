
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JToolBar extends JFrame {
	public JToolBar() {
		System.out.println("ToolBar ������ ����");
		JToolBar tBar = new JToolBar();
		tBar.add(new JButton("1"));
		//tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("2"));
		//tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("������"));
		//tBar.addSeparator(new Dimension(50,20));
		getContentPane().add(tBar, BorderLayout.NORTH);
	}
}
