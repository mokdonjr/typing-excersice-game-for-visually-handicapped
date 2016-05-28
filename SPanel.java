
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SPanel extends JPanel {//subPanel
	
	public static int num = 20;//SPanel에 출력할 단어 개수. wordBook 크기 설정
	public static String wordBook[] = new String[num];//SPanel에 출력할 단어 저장소 wordBook 생성
	
	public static String randomWords(){//랜덤단어
		Words words = new Words("C:\\백승찬박정석\\words.txt");
		return words.getRandomWord();
	}
	public static void setWordBook(){//랜덤단어를 wordBook에 저장
		for(int i=0; i<wordBook.length; i++){
			wordBook[i] = randomWords();
		}
	}
	
	public static String[] getWordBook(){//wordBook 출력
		return wordBook;
	}
	
	//매개변수로 들어오는 어떠한 단어 화면에 나타내는 메소드
	public void displayWords(String word){
		JLabel displayWord = new JLabel(word);
		displayWord.setFont(new Font("고딕체",Font.PLAIN,20));
		add(displayWord);
	}

	public SPanel(){
		//배치
		setBackground(Color.white);
		setLayout(new GridLayout(num,1));
		//SPanel에는 여러개의 단어가 출력
		setWordBook();
		for(int i=0; i<wordBook.length; i++){
			displayWords(this.getWordBook()[i]);//
		}
//		System.out.println("wordBook[1]은" + wordBook[1]);
	}
}
