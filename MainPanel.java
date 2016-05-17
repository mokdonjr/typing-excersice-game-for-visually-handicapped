import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MainPanel extends JPanel{
	
	MainPanel(){
		setBackground(Color.YELLOW);//JComponent에 있는 메소드이기에 setBackGround메소드는 어디에나 있는 메소드이다.
		setLayout(new BorderLayout(30,20));//배치관리자를 설정
		//add(new JButton("click"), BorderLayout.EAST);
		//add(new JButton("click"), BorderLayout.NORTH);
//		add(new JButton("click"), BorderLayout.SOUTH);
		add(new InputPanel(), BorderLayout.SOUTH);
		
	}
	
	
}
