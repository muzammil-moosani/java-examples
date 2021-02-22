class StringExample
{
	public static void main(String args[])
	{
		char chars[]={'a','b','c','d','e','f'};
		String s=new String(chars);
		String s1=new String(chars,2,3);
		String s2=new String(s);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		byte asc[]={65,66,67,68,69,70};
		String s3=new String(asc);
		String s4=new String(asc,2,3);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s.length());
		System.out.println(asc.length);
		String s5="abcdef";
		System.out.println("abcdef".length());
		String age="9";
		String s6="He is "+age+" years old.";
		String s7="My name is "+"Muzammil Moosani "+"Iam from Ajmer";
		int i=20;
		String s8="Iam "+i+" years old.";
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		String s9="four:"+2+2;
		System.out.println(s9);
		String s10="four:"+2;
		System.out.println(s10);
		String s11="four:"+i;
		System.out.println(s11);
		String s12="four:"+(2+2);
		System.out.println(s12);
		char ch=s5.charAt(2);
		System.out.println(ch);
		char ch1="xyz".charAt(2);
		System.out.println(ch1);
		String s13="This is a java program";
		int start=10;
		int end=15;
		char buf[]=new char[end-start];
		s13.getChars(start,end,buf,0);
		System.out.println(buf);
		int se=0;
		int e=22;
		char b[]=new char[e-se];
		s13.getChars(se,e,b,0);
		System.out.println(b);
		char sc[]=new char[50];
		sc=s13.toCharArray();
		System.out.println(sc);
		String s14="Hello";
		String s15="Hello";
		String s16="GoodBye";
		String s17="HELLO";
		System.out.println(s14+" equals "+s15+"->"+s14.equals(s15));
		System.out.println(s14+" equals "+s16+"->"+s14.equals(s16));
		System.out.println(s14+" equals "+s17+"->"+s14.equals(s17));
		System.out.println(s14+" equalsIgnoreCase "+s17+"->"+s14.equalsIgnoreCase(s17));
		String s18="hello java";
		String s19="hi jaVa";
		int si1=6;
		int si2=3;
		int num=4;
		System.out.println(s18.regionMatches(false,si1,s19,si2,num));
		String s20="Irrespective";
		String s21="Irr";
		String s22="ive";
		System.out.println(s20.startsWith(s21));
		System.out.println(s20.endsWith(s22));
		System.out.println("Irrespective".endsWith("tive"));
		String s23=new String(s15);
		System.out.println(s15+" equals "+s23+"->"+s15.equals(s23));
		System.out.println("s15+"=="+s23+"->"+(s15==s23));
	
		
	}
}