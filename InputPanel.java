import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class InputPanel extends JPanel{
	
	JLabel text = new JLabel("입력");
	JButton enter = new JButton("확인");
	JTextField input = new JTextField(20);
	
	InputPanel(){
		setPreferredSize(new Dimension(300,40));
		setLayout(null);
		
		text.setSize(30,30);
		text.setLocation(215,5);
		add(text);
		
		input.setSize(280,30);
		input.setLocation(245,5);
		add(input);
		
		enter.setSize(60,30);
		enter.setLocation(530,5);
		enter.setBackground(new Color(255,255,255));
		add(enter);
		
		/* 이벤트 리스너 작성
		 * 
		 * 5월 28일 PM03:10 승찬
		 * '확인' 버튼 눌렀을 때 랜덤 단어 나타나기 
		 * 
		 * JTextField라는 EventSource에 Event가 발생하는 경우는 : 텍스트 입력중 <Enter>키 입력
		 * 이 때, EventObject는 : ActionEvent
		 * ActionEvent 이벤트 객체가 전달 될 Event Lister는 : ActionListener이다.
		 * 
		 * 따라서, 개발자인 나는 JTextField라는 이벤트 소스와 ActionListener라는 이벤트 리스너를 생성, 결합.
		 * JTextField에서 발생하는 이벤트인 '텍스트 입력중 <Enter>키 입력'은
		 * OS를 통해 JVM으로, JVM을 통해 Event Dispatch Thread로, 
		 * Event Dispatch Thread가 이 이벤트를 ActionEvent라는 이벤트 객체로 정보를 담아 ActionListener를 찾아 전달,처리
		 * 
		 * 위 사항을 숙지하여 아래 ActionListener 리스너 인터페이스를 구현하고 
		 * 추상메소드 void actionPerformed(ActionEvent); 구현하시오
		 */
		//이벤트소스와 이벤트리스너 연결
		MyKeyListener listener = new MyKeyListener();
		input.addKeyListener(listener);
		input.requestFocus();
		}

	class MyKeyListener implements KeyListener{
		@Override
		public void keyReleased(KeyEvent arg0) {}
		@Override
		public void keyTyped(KeyEvent arg0) {}
		
		/*
		 * input의 텍스트가 화면의 단어와 맞을 경우
		 * 화면의 단어 사라지고 wordBook의 두번째 단어가 화면에 출력
		 * input창은 비어진다
		 */
		@Override
		public void keyPressed(KeyEvent arg0) {
			if(arg0.getKeyCode() == KeyEvent.VK_ENTER){//(input에 입력된 상태로)엔터키를 누르면
				if( input.getText().equals(SPanel.wordBook.get(0)) ){//맞았을 경우
					//1. 맞은단어 상쇄
					SPanel.wordBook.remove(0);
					input.setText("");
					System.out.println("input.getText() >> " + input.getText());
					
					//2. (MPanel) 맞은단어 상쇄되며 다음단어 보여줌
					MPanel.displayWord.setText(SPanel.wordBook.get(0));//됏다... 기념시각 2016-05-29 오후7시40분

					//3. (SPanel) 맞출때마다 맨 뒤에 단어 계속 추가
					SPanel.wordBook.add(SPanel.num-1, SPanel.randomWords());

					//4. (SPanel) 맞은단어 상쇄되며 다음단어 맨앞, 추가된단어 맨뒤 보여줌
					for(int i=0; i<SPanel.wordBook.size(); i++){
						SPanel.displayWord[i].setText(SPanel.getWordBook(i));//됏다... 기념시각 2016-05-29 오후9시08분
					}
//					TextToSpeech.textToSpeech(SPanel.getWordBook(0));//음성으로 읽어준다.
				}
				else{//틀렸을 경우
//					TextToSpeech.textToSpeech("You writed" + input.getText());//음성으로 읽어준다.
					System.out.println(SPanel.wordBook.size());
					System.out.println(input.getText());//틀린단어
				}
			}
		}
	}
}
