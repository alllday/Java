package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		
		String[] head = {"a", "b", "c"};
		String[][] body = {
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"},
				{"a", "b", "c"}
		};
		
		JTable table = new JTable(body, head);
		JScrollPane scr = new JScrollPane(table);
		f.add(scr);
		f.setVisible(true);
	}

}
