package cryptoP3;

public class Monoalphabetic 
{
	public static void main(String[] args)
	{
		FileManagment fm = new FileManagment();
		String st = fm.readFromFile().toLowerCase();
		
		
		int[] freq = new int[26];
		for(int i = 0;i<st.length();i++)// check the frequency of each letter, if matched increment by 1
		{
			char c = st.charAt(i);
			
			if(c>='a' && c<='z')
			{
				int x = c-'a';
				freq[x]++;
			}
		}
		int max=0;
		for(int i = 0;i<26;i++)// check for most frequent letter
		{
			
			if(freq[i]>freq[max])
				max=i;
		}
		char mostfreq = (char)(max +'a');// turn into a letter
		int key = (mostfreq-'e'+26)%26; // calculate the key (most frequent number - 'e') 
		
		char[] letters= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] shifted = new char[26];
		for(int i=0;i<letters.length;i++)// apply the key to all characters and save in a char array
		{
			shifted[i]=letters[(i-key+26)%26];
		}
		
		String res="";
		for(int i=0;i<st.length();i++)// decryption process
		{
			char c = st.charAt(i);
			if(c>='a' && c<='z')
			{
				int index = c-'a';
				char newC=shifted[index];
				res+=newC;
			}
			else
				res+=c;
		}
		fm.writeToFile(res);
	}
}
