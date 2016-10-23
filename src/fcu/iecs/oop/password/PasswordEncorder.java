package fcu.iecs.oop.password;

public class PasswordEncorder {
	public String encode(String password){
		char a[]=password.toCharArray();
		for(int i=0;i<password.length();i++){
			if(a[i]=='a'||a[i]=='A'){
				a[i]='4';
			}
			if(a[i]=='e'||a[i]=='e'){
				a[i]='3';
			}
			if(a[i]=='i'||a[i]=='I'){
				a[i]='1';
			}
			if(a[i]=='o'||a[i]=='O'){
				a[i]='0';
			}
			if(a[i]=='t'||a[i]=='T'){
				a[i]='7';
			}
		}
		String newstring=String.valueOf(a);
		return newstring;
	}

}
