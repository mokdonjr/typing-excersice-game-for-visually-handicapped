import java.awt.*;

import javax.swing.*;

public class GameFrame extends JFrame{
	MainPanel mPanel = new MainPanel();
	
	GameFrame(){
		//super("타이틀"); 또는 setTitle이용//JFrame의생성자를 호출
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//유저가 창을 닫으면 내 프로그램도 같이 죽겠다.
		this.setSize(800, 800);
		setTitle("타이틀");
		makeMenu();
		
		JSplitPane sPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		getContentPane().add(sPane, BorderLayout.CENTER);
		sPane.setLeftComponent(new MainPanel());
		sPane.setRightComponent(new ScorePanel());
		sPane.setDividerLocation(400);//pixel값을 입력시켜 고정시킨다. 전체 500pixel임
		sPane.setEnabled(false);
		makeToolBar();
	
		setVisible(true);
		
		
	}
	
	void makeMenu(){
		JMenuBar mBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		mBar.add(fileMenu);
		fileMenu.add(new JMenuItem("읽기"));
		fileMenu.add(new JMenuItem("쓰기"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("종료"));
		this.setJMenuBar(mBar);
	}
	
	void makeToolBar(){
		JToolBar tBar = new JToolBar();
		//JToolBar는 규칙이 있다.
		//반드시 BoardLayout 매니저가 만든
		tBar.add(new JButton("read"));
		tBar.add(new JButton("write"));
		tBar.addSeparator(new Dimension(50,20));
		tBar.add(new JButton("exit"));
		getContentPane().add(tBar, BorderLayout.NORTH);
	}
}
