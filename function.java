package fail;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class function extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numtxt;
	private JTextField maxtxt;

	
	public function() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 120, 1000, 300);
		setTitle("四则运算生成器");
		setSize(1000, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((screen.getWidth() - getWidth()) / 2);
		int y = (int) ((screen.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel bracketer = new JLabel("括号");
		bracketer.setBounds(10, 149, 35, 23);
		contentPane.add(bracketer);
		
		JRadioButton khY = new JRadioButton("Y");
		khY.setBounds(56, 149, 35, 23);
		contentPane.add(khY);
		
		JRadioButton khN = new JRadioButton("N");
		khN.setBounds(110, 149, 40, 23);
		contentPane.add(khN);
		
		ButtonGroup groupkuohao = new ButtonGroup();
		groupkuohao.add(khY);
		groupkuohao.add(khN);
		
		JLabel point = new JLabel("小数点");
		point.setBounds(10, 182, 35, 23);
		contentPane.add(point);
		
		JRadioButton xsY = new JRadioButton("Y");
		xsY.setBounds(56, 182, 35, 23);
		contentPane.add(xsY);
		
		JRadioButton xsN = new JRadioButton("N");
		xsN.setBounds(110, 182, 40, 23);
		contentPane.add(xsN);
		
		ButtonGroup groupxiaoshu = new ButtonGroup();
		groupxiaoshu.add(xsY);
		groupxiaoshu.add(xsN);
		
		JLabel operate = new JLabel("操作符");
		operate.setBounds(10, 76, 40, 23);
		contentPane.add(operate);
		
		JCheckBox Add = new JCheckBox("+");
		Add.setBounds(56, 76, 50, 23);
		contentPane.add(Add);
		
		JCheckBox Sub = new JCheckBox("-");
		Sub.setBounds(110, 76, 50, 23);
		contentPane.add(Sub);
		
		JCheckBox Mult = new JCheckBox("*");
		Mult.setBounds(56, 114, 50, 23);
		contentPane.add(Mult);
		
		JCheckBox Div = new JCheckBox("/");
		Div.setBounds(110, 114, 50, 23);
		contentPane.add(Div);
		
		JLabel num = new JLabel("个数");
		num.setBounds(10, 10, 60, 15);
		contentPane.add(num);
		
		JLabel max = new JLabel("最大数");
		max.setBounds(10, 45, 65, 15);
		contentPane.add(max);
		
		numtxt = new JTextField();
		numtxt.setBounds(80, 7, 66, 21);
		contentPane.add(numtxt);
		numtxt.setColumns(10);
		
		maxtxt = new JTextField();
		maxtxt.setBounds(80, 42, 66, 21);
		contentPane.add(maxtxt);
		maxtxt.setColumns(10);
		
		JLabel outMethod = new JLabel("输出到:");
		outMethod.setBounds(10, 220, 54, 15);
		contentPane.add(outMethod);
		
		JRadioButton outMethodF = new JRadioButton("文件");
		outMethodF.setFont(new Font("微软雅黑", Font.BOLD, 13));
		outMethodF.setBounds(70, 216, 60, 23);
		contentPane.add(outMethodF);
		
		JRadioButton outMethodP = new JRadioButton("控制台");
		outMethodP.setBounds(130, 216, 70, 23);
		contentPane.add(outMethodP);
		
		ButtonGroup prin = new ButtonGroup();
		prin.add(outMethodP);
		prin.add(outMethodF);
		
		JButton button = new JButton("开始生成");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n1 = numtxt.getText();
				int num = Integer.parseInt(n1);
				String n2 = maxtxt.getText();
				int max = Integer.parseInt(n2);
				int[] a = {0,0,0,0};
				int kh=0,outp=0,xs=0;
				if(Add.isSelected())
					a[0] = 1;
				if(Sub.isSelected())
					a[1] = 1;
				if(Mult.isSelected())
					a[2] = 1;
				if(Div.isSelected())
					a[3] = 1;
				if(khY.isSelected()) {
					kh = 1;
				}else {
					kh = 0;
				}
				if(xsY.isSelected()) {
					xs = 1;
				}else {
					xs = 0;
				}
				if(outMethodF.isSelected()) {
					outp = 1;
				}else {
					outp = 0;
				}
				view.out(num,max,a,kh,xs,outp);
			}
		});
		button.setBounds(299, 182, 93, 23);
		contentPane.add(button);
	}
}
