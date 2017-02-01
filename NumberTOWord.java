package com.lara;

public class NumberTOWord
{
	final private static String[] units={"Zero","One","Two","Three","Four",
			"Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
			"Sixteen","Seventeen","Eighteen","Nineteen"};
	
	final private static String[]tens={"","","Twenty","Thirty","Forty","Fifty",
			"Sixty","Seventy","Eighty","Ninety"};
	
	
	
		public static String convert(Integer i)
		{
			if(i<20)
			{
				return units[i];
			}
			if(i<100)
			{
				return tens[i/10]+" "+convert(i%10);
			}
			if(i<1000)
			{
				return units[i/100]+" hundread "+" and "+convert(i%100);
			}
			if(i<10000)
			{
				return convert(i/1000)+"thousand"+convert(i/1000);
			}
			return null;
		}
	
	public static void main(String[] args) {
		System.out.println(convert(123));
	}
}