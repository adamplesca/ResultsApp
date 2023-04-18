// Application that checks many results, gets highest and lowest result aswell as the median result
// Adam Plesca
// 18/4/23

 import javax.swing.JOptionPane;

 public class ResultsApp{
	 public static void main(String args[]){
		 //declare variables
		 int avg, high, low;

		 int results[] = new int[10];

		 //declare objects
		 Results myResults;

		 //create objects
		 myResults = new Results();

		 //input
		 for(int i = 0; i < 10; i++){
			 results[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number"));
		 }
		 myResults.setResults(results);

		 //compute
		 myResults.computeAvg();
		 myResults.computeHigh();
		 myResults.computeLow();


		 //output
		 avg = myResults.getAvg();
		 high = myResults.getHigh();
		 low = myResults.getLow();
		 JOptionPane.showMessageDialog(null,"The average result is "+avg);
		 JOptionPane.showMessageDialog(null, "The highest result is "+high+" and the lowest is "+low);

	 }
 }