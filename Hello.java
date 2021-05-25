import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	   String str1 = "Listen";
	   String str2 = "Silent";
	   if(str1.length()!=str2.length()){
	       System.out.println("Not Anagaram");
	   }
	   char string1[] = str1.toLowerCase().toCharArray();
	   char string2[] = str2.toLowerCase().toCharArray();
	   Arrays.sort(string1);
	   Arrays.sort(string2);
	   boolean result = Arrays.equals(string1,string2);
	if(result){
	    System.out.println("Anagram");
	}
	else{
	    System.out.println("Not Anagaram");
	}
}