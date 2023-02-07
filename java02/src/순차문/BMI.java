package 순차문;

import javax.swing.JOptionPane;

public class BMI {

	public static void main(String[] args) {
		//BMI : 체질량 지수 = 체중(Kg)/{키(m)*키(m)}
		//입력
		String weight = JOptionPane.showInputDialog("체중");
		String height = JOptionPane.showInputDialog("키");
		
		//처리
		
		double weight2 = Double.parseDouble(weight);
		double height2 = Double.parseDouble(height) / 100;
		double result = weight2 / (height2*height2);
		//출력
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
