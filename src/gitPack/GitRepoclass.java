package gitPack;

public class GitRepoclass {
	
	
	public void m() {
	System.out.println("Codex");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " Cognizant and Technology ";
		int count = 0;
		int le = s1.length();

		char[] inp = s1.toCharArray();

		for (int i = 0; i < le; i++) {

			for (int j = i + 1; j < le; j++) {
				if (inp[i] == inp[j]) {

					System.out.println(inp[j]);

					break;

				}

			}
		}
	}
}