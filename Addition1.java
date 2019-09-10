class Add
{
	int a,b,c;
	void accept(int p,int q)
	{
	a=p;
	b=q;
	}
	void add()
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of c="+c);
	}
}
class Addition1
{
	public static void main(String[] args) 
	{
		System.out.println("i am from main()-beg");
		int x1=Integer.parseInt(args[0]);
		int x2=Integer.parseInt(args[1]);
		Add a=new Add();
		a.accept(x1,x2);
		a.add();
		a.disp();
		System.out.println("i am from main()-end");
	}
}
