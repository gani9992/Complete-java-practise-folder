class WrapperClass1{
	public static void main(String args[]){
		Integer i1=new Integer(10);
		Integer i2=new Integer("10");
		System.out.println(i1.getClass().getName());
		System.out.println(i2.getClass().getName());
		Double i3=new Double(10);
		Double i4=new Double("10");
		System.out.println(i3.getClass().getName());
		System.out.println(i4.getClass().getName());
		Float i5=new Float(10);
		Float i6=new Float("10");
		System.out.println(i5.getClass().getName());
		System.out.println(i6.getClass().getName());
		short s1=10;
		Short i9=new Short(s1);
		Short i10=new Short("10");
		System.out.println(i9.getClass().getName());
		System.out.println(i10.getClass().getName());
		byte b1=90;
		Byte i11=new Byte(b1);
		Byte i12=new Byte("10");
		//System.out.println(i11.getClass().getName());
		System.out.println(i12.getClass().getName());
		Long i13=new Long(10);
		Long i14=new Long("10");
		System.out.println(i13.getClass().getName());
		System.out.println(i14.getClass().getName());
		
		String i16=new String("10");
		
		System.out.println(i16.getClass().getName());
		
		
	}
}