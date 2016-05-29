import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MPanel extends JPanel {//mainpanel
	
	public static JLabel displayWord;
	
	public MPanel() {
		setBackground(Color.gray);
		
		/* 1. MPanel에 단어가 나타나도록
		 * 
		 * SPanel.getWordBook()[0]를 화면에 출력
		 * 
		 */
		displayWord = new JLabel(SPanel.getWordBook(0));
		displayWord.setLayout(null);
		displayWord.setLocation(350,280);
		displayWord.setSize(200,50);
		displayWord.setFont(new Font("휴먼편지체",Font.PLAIN,30));
		add(displayWord);
		
		/*
		 * 0. MPanel 아래에 InputPanel
		 * 
		 * 원래 기존 코드
		 * add(new InputPanel(),BorderLayout.SOUTH);
		 * 
		 * 하지만 ,BorderLayout배치관리자가 작동하는 바람에 배경이미지와 단어 위치조정등 불편함이있음
		 * 따라서 배치관리자를 null로두고, InputPanel클래스에 완성된 inputpanel객체의 size와 location조절 완료.
		 */
		InputPanel inputpanel = new InputPanel();
		inputpanel.setSize(800,40);
		inputpanel.setLocation(0,600);
		add(inputpanel);
		
		/* 2. MPanel 배경 이미지
		 * 
		 * 목표 : MPanel에 배경이미지를 깔고, 그 위에 단어가 나타나게 하자.
		 * 
		 * 불러온 이미지 : [layer1.gif] 파일과 [layer위.png] 파일을 불러왔다.
		 * 이미지 출처 : [layer1.gif]파일은 다운받은 파일이고 [layer위.png]파일은 그에 맞추어 디자인제작한 파일
		 * JPanel에 JLabel을 넣을때 주의할 점 : 코딩 시 위에 보여질 이미지 불러오는 JLabel add를 먼저 쓰고 아래에 깔고자 하는 배경 이미지를 나중에 쓴다
		 * 
		 */
		setLayout(null);
		//맨아래2번째이미지
		ImageIcon image2 = new ImageIcon("layer위.png");
		JLabel label2 = new JLabel(image2);
		label2.setSize(800,600);
		label2.setLocation(0,0);
		add(label2);
		//맨아래이미지
		ImageIcon image1 = new ImageIcon("layer1.gif");
		JLabel label1 = new JLabel(image1);
		label1.setSize(800,600);
		label1.setLocation(0,0);
		add(label1);
	}
}
