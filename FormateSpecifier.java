public class FormateSpecifier{
	public static void main(String[] args){
		boolean b=true;
		char c ='p';
		short  s= 34;
		int i=425;
		float f=34.23f;
		double  d=33.45;
		
	System.out.printf("boolean=%b\n",b);
	System.out.printf("char=%c\n",c);
	System.out.printf("short=%d\n",s);
	System.out.printf("int=%d\n",i);
	System.out.printf("float=%.1f\n",f);
	System.out.printf("double=%.1f\n",d);
	}
}