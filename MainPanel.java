import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MainPanel extends JPanel{
	
	MainPanel(){
		setBackground(Color.YELLOW);//JComponent�� �ִ� �޼ҵ��̱⿡ setBackGround�޼ҵ�� ��𿡳� �ִ� �޼ҵ��̴�.
		setLayout(new BorderLayout(30,20));//��ġ�����ڸ� ����
		//add(new JButton("click"), BorderLayout.EAST);
		//add(new JButton("click"), BorderLayout.NORTH);
//		add(new JButton("click"), BorderLayout.SOUTH);
		add(new InputPanel(), BorderLayout.SOUTH);
		
	}
	
	
}
