class Hello
{
public static void main (String[] args) {
	int n=args.length;
	float a[]=new float[n];
for(int i=0;i<n;i++)
{
	a[i]=Float.parseFloat(args[i]);
}
//sorting
for(int i=0;i<n-1;i++)
for(int j=i+1;j<n;j++)
if(a[i]>a[j])
{
	float t=a[i];
	a[i]=a[j];
	a[j]=t;
}
for(float e:a)
System.out.print(e +"\t");
}
}