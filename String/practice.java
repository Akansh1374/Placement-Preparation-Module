public class practice{
	public static void main(String[] args) {
		String[] str={"flower","flow","flight"};
		String str1="";
		for(int i=0;i<str.length-1;i++){
			for(int j=0;j<str.length;j++){
				if(str[i].substring(0,j+1).equals(str[i+1].substring(0,j+1))){
					str1=str1+str[i].substring(0,j+1);
				}
			}
		}
		System.out.println(str1);
	}

}