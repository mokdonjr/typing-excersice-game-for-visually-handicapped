import java.awt.*;

import javax.swing.*;

public class InputPanel extends JPanel{
	
	JLabel text = new JLabel("�Է�");
	JButton enter = new JButton("Ȯ��");
	JTextField input = new JTextField(20);
	
	InputPanel(){
		setPreferredSize(new Dimension(300,40));
		setLayout(null);//ũ��� ��ġ�� �������ִ� ���̾ƿ��Ŵ����� ����.
		//���̾ƿ��Ŵ��� ������ �ڱⰡ ��ġ�� �����ؾ�
		
		text.setSize(30,30);
		text.setLocation(15,5);
		add(text);
		
		input.setSize(280,30);
		input.setLocation(45,5);
		add(new JLabel("�Է�"));
		add(input);
		
		enter.setSize(60,30);
		enter.setLocation(330,5);
		add(new JButton("��������"));
		add(enter);
	}
	

}
