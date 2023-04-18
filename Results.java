// instantiable class for results app
// Adam Plesca
// 18/4/23

 public class Results{
	 //declare data members (global variables)
	 private int avg;
	 private int high;
	 private int low;
	 private int results[];

	 //constructor
	 public Results(){
		 avg = 0;
		 high = 0;
		 low = 0;
		 results = new int[10];
	 }

	 //setters
	 public void setResults(int results[]){
		 this.results = results;
	 }

	 public void computeAvg(){
		 int sum = 0;//local variable
		 for(int i = 0; i < 10; i++){
			 sum = sum+results[i];
		 }
		 avg = sum/10;
	 }

	 public void computeHigh(){
		 high = results[0];
		 for(int i = 1; i < 10;i++){
			 if(results[i]>high){
				 high = results[i];
			 }
		 }

	 }

	 public void computeLow(){
		 low = results[0];
		 for(int i = 1;i < 10; i++){
			 if(results[i]<low){
				 low = results[i];
			 }
		 }
	 }

	 //getters
	 public int getAvg(){
		 return avg;
	 }

	 public int getHigh(){
		 return high;
	 }

	 public int getLow(){
		 return low;
	 }
 }
