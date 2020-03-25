package com.epam.Junit;

public class RemoveA {

	public String removeA(String string) {
		String newString="";
		int length=string.length();
		if (length==1) {
			if (string.charAt(0)!='A')
				newString+=string.charAt(0);
		}
		if (length>1) {
			for (int i=0;i<2;i++)
				if (string.charAt(i)!='A')
					newString+=string.charAt(i);
			newString+=string.substring(2,length);
		}
		return newString;
	}

}
