
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPane extends JMenuBar {
	private JMenu fileM, etcM;//파일, 기타등등
	private JMenuItem newM, openM, saveOriginM,saveM, exitM, rankM, levelM, keyboardShorCutM , wordeditM,makerM;
	//파일 - 새로만들기, 불러오기, 다른이름으로 저장하기, 끝내기, 저장
	//기타- 랭킹, 만든사람, 난이도
	
	public MenuPane() {//생성자
		System.out.println("메뉴페인 생성자 생성");
		
		
	
		
		fileM = new JMenu("파일");
		etcM = new JMenu("기타");
		//매뉴
		
		newM = new JMenuItem("다시 시작하기");
		openM = new JMenuItem("열기");
		saveOriginM= new JMenuItem("저장");
		saveM = new JMenuItem("다른 이름으로 저장");
		exitM = new JMenuItem("끝내기");
		rankM = new JMenuItem("렝킹보기");
		levelM= new JMenuItem("난이도 조절");
		keyboardShorCutM = new JMenuItem("단축키");
		wordeditM = new JMenuItem("단어장 편집");
		makerM = new JMenuItem("만든 사람들");
		
		//파일 !!!추가 하기
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveOriginM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		
		//기타에!!! 기능 추가하기
		etcM.add(rankM);
		etcM.add(levelM);
		etcM.add(keyboardShorCutM);
		etcM.add(wordeditM);
		etcM.add(makerM);
		
	
		//실행
		this.add(fileM);
		this.add(etcM);
		
		
	}
	
	//JMenu!!
	public JMenu getFileM() {
		return fileM;
	}
	public JMenu getEtcM() {
		return etcM;
	}
	
	//JMenuItem!!
	public JMenuItem getNewM() {
		return newM;
	}
	public JMenuItem getOpenM() {
		return openM;
	}
	public JMenuItem getSaveOriginM() {
		return saveOriginM;
	}
	public JMenuItem getSaveM() {
		return saveM;
	}
	public JMenuItem getExitM() {
		return exitM;
	}
	public JMenuItem getRankM() {
		return rankM;
	}
	public JMenuItem getLevelM() {
		return levelM;
	}
	public JMenuItem getKeyboardShorCut() {
		return keyboardShorCutM;
	}
	public JMenuItem getWordEditM() {
		return wordeditM;
	}
	public JMenuItem getMakerM() {
		return makerM;
	}

}
