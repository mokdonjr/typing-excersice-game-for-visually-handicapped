import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MPanel extends JPanel {//mainpanel
	
	
	public MPanel() {
		setBackground(Color.gray);
		setLayout(new BorderLayout(30,20));
		add(new InputPanel(),BorderLayout.SOUTH);
		
		/*  
		 * Words 클래스 (words.txt 파일을 읽고 파일에서 랜덤하게 단어를 추출하는 클래스) 로 부터 words객체 생성
		 * words의 getRandonWord()메소드 이용해 랜덤한 단어 선택.
		 * newWord에 words.txt파일 내 단어를 랜덤하게 선택해 저장
		 * 
		 * 아래 JLabel을 통해 newWord를 화면에 보여주고자 함
		 * newWord를 JLabel객체인 displayWord객체에 연결
		 * displayWord객체를 통해 newWord가 화면에 출력됨
		 * 
		 * 하지만, setLocation, setSize 등 JLabel 통제하기위한 메소드가 잘 안받는 상태..
		 * 
		 */
		Words words = new Words("c:\\words.txt"); // 단어 선택하는 객체 생성
		String newWord = words.getRandomWord(); // 랜덤한 단어 선택
		
		//단어 위치와 크기
		JLabel displayWord = new JLabel(newWord);
		displayWord.setLayout(null);
		displayWord.setLocation(100,300);
		displayWord.setSize(100,30);
		add(displayWord);
		
	}
	
	
}
