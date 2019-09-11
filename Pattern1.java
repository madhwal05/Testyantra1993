public class Pattern1 {

		public static void main(String[] args) {
		
		int n=7;
		int count=n;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}