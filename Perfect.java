class Perfect
{
	public static boolean isPerfect(int num){
		int sum=0;
		int i=1;

		while(i<=num/2){
			if(num/i==0){
				sum=sum+i;
				i++;
				}
		}
			return sum==num;
	}

	public static void main(String[]args){
		
		int num=6;
		System.out.println(num+" is perfect ::"+isPerfect(num));
		
		}

			
			



}