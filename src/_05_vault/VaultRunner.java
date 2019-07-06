package _05_vault;

public class VaultRunner {
	
	public static void main(String[] args) {
		JamesBond jamesbond = new JamesBond();
		int fc = jamesbond.findCode();
		System.out.println(fc);
	}
}
