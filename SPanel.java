package 백승찬박정석;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SPanel extends JPanel {//subPanel
	/*
	 * 5/28 수정 사항
	 * SPanel에 나타날 20개짜리 단어 wordBook은
	 * Array 구조가 아닌, Vector 구조여야만 빈 공간없이 유지 될 수 있다.
	 * (첫번째 단어 맞추었을 경우 첫번째 단어 사라지고 뒤 단어들이 앞으로 밀착
	 * wordBook의 19개 단어 뒤에 새로 word.txt에서 단어 1개 추가해 20개 wordBook유지)
	 */
	public static String randomWords(){//랜덤단어
		Words words = new Words("words.txt");
		return words.getRandomWord();
	}
	
	public static int num = 20;//SPanel에 가져올 랜덤 단어 개수( = wordBook크기 )
	//1. wordBook 구조 생성
	public static Vector<String> wordBook = new Vector<String>(num);
	//2. wordBook element 삽입
	public static void setWordBook(){
		for(int i=0; i<wordBook.capacity(); i++){
			wordBook.add(randomWords());
		}
	}
	//3. wordBook element 출력
	public static String getWordBook(int index){
		return wordBook.get(index);
	}

	/*
	 * 5월 29일 오후 8시33분
	 * SPanel 수술
	 * 
	 * 목표 : MPanel처럼.
	 * 맞은 단어 상쇄하며 다음단어 맨 앞, 추가된 단어 맨뒤 위치에
	 * ' 화면에 보여주기 '
	 * 
	 */
	//하긴했어.. 나도모르게.. 근데 이게머지? = new JLabel()[]; 이런 형식이어야 하는거 아냐..?
	public static JLabel displayWord[] = new JLabel [wordBook.capacity()];
	
	public SPanel(){
		setBackground(Color.white);
		setLayout(new GridLayout(num,1));//num(=20),1인 그리드 배치관리자
		
		setWordBook(); // 2. wordBook element삽입하는 메소드 호출
		for(int i=0 ;i<wordBook.capacity(); i++){
			displayWord[i] = new JLabel(getWordBook(i));//3. wordBook element출력 메소드 호출
			displayWord[i].setFont( new Font("고딕체",Font.PLAIN,20) );
			add(displayWord[i]);
		}
		
	}
}
