public static void main(String...lkj)
{  Scanner s=new Scanner(System.in);
      System.out.println("enter size");
	  int n=s.nextInt();
	  int[] arr=new int[n];
	  System.out.println("enter element");
    for(int k=0;k<n;k++)
      arr[k]=s.nextInt();
   
   Arrays.sort(arr);
   
int max=0;
for(int i=0;i<n;i++)
{
	int c=1;
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
c++;
}
if(c>max & c>(n/2))
max=c;}
if(max==0)
	System.out.println(-1);
else System.out.println(max);
}
}
