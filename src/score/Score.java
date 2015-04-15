/**
 * @ likun Ma
 * assignment 5
 * date : 4/14/2015 
 */


package score;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * 
 */
public class Score {

	/**
	 * @param args
	 */

	/**
	 * 
	 */
	public Score() {
		final JFrame jf = new JFrame("Score Calculator");
		final JTextField course1_score = new JTextField("");
		final JTextField course1_weight = new JTextField("");
		final JTextField course2_score = new JTextField("");
		final JTextField course2_weight = new JTextField("");
		final JTextField course3_score = new JTextField("");
		final JTextField course3_weight = new JTextField("");
		final JTextField course4_score = new JTextField("");
		final JTextField course4_weight = new JTextField("");
		final JButton calculate = new JButton("Calculate");
		jf.setLayout(new GridLayout(6, 3));
		jf.add(new JLabel(""));
		jf.add(new JLabel("Score"));
		jf.add(new JLabel("Weight"));
		jf.add(new JLabel("Course1"));
		jf.add(course1_score);
		jf.add(course1_weight);
		jf.add(new JLabel("Course2"));
		jf.add(course2_score);
		jf.add(course2_weight);
		jf.add(new JLabel("Course3"));
		jf.add(course3_score);
		jf.add(course3_weight);
		jf.add(new JLabel("Course4"));
		jf.add(course4_score);
		jf.add(course4_weight);
		jf.add(new JLabel(""));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(calculate)) {
					Double weighted_total_score = Double.valueOf(course1_score
							.getText())
							* Double.valueOf(course1_weight.getText())
							+ Double.valueOf(course2_score.getText())
							* Double.valueOf(course2_weight.getText())
							+ Double.valueOf(course3_score.getText())
							* Double.valueOf(course3_weight.getText())
							+ Double.valueOf(course4_score.getText())
							* Double.valueOf(course4_weight.getText());
					JOptionPane.showMessageDialog(null, "Weighted Total Score:"
							+ weighted_total_score);
				}
			}
		});
		jf.add(calculate);
		jf.add(new JLabel(""));
		jf.resize(300, 200);
		jf.show();

	}

	// final BoxLayout lay_out = new BoxLayout();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sg = new Score();		

	}

}
