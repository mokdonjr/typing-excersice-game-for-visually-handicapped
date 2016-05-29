/*
 *  - 외부 참조 파일 설명 :
 * 우리 프로그램이 불러오는 외부 참조 파일은 총 3가지이다 ('layer위.png', 'layer1.gif', 'words.txt')
 * 작업 시 작업프로젝트file에 작업package와 함께 copy해두었으며
 * 모두 경로명이 현 작업프로젝트 경로이다.
 * 
 *  - 외부 참조 파일 사용법 : 
 * 따라서, 사용자는 우리 프로그램을 이용 시
 * 프로그램이 있는 디렉터리에 위 3가지 참조하는 파일을 함께 지정해야 실행이 원활히 가능하다.
 * 
 * 1. MPanel클래스
 * 	ImageIcon image2 = new ImageIcon("layer위.png");
 * 
 * 2. MPanel클래스
 * ImageIcon image1 = new ImageIcon("layer1.gif");
 * 
 * 3. SPanel클래스
 * public static String randomWords(){//랜덤단어
 * 		Words words = new Words("words.txt");
 * 		return words.getRandomWord();
 * 	}
 */

public class MainApp {
	public static void main(String[] args){
		TypingGame prj = new TypingGame();
	}
}
