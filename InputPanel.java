import java.awt.*;

import javax.swing.*;

public class InputPanel extends JPanel{
	
	JLabel text = new JLabel("입력");
	JButton enter = new JButton("확인");
	JTextField input = new JTextField(20);
	
	InputPanel(){
		setPreferredSize(new Dimension(300,40));
		setLayout(null);//크기와 위치를 조절해주는 레이아웃매니져를 없앰.
		//레이아웃매니져 없으면 자기가 위치를 결정해야
		
		text.setSize(30,30);
		text.setLocation(15,5);
		add(text);
		
		input.setSize(280,30);
		input.setLocation(45,5);
		add(new JLabel("입력"));
		add(input);
		
		enter.setSize(60,30);
		enter.setLocation(330,5);
		add(new JButton("ㅁㄴㅇㄹ"));
		add(enter);
	}
	

}
