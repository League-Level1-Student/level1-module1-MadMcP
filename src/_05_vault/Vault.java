package _05_vault;

import java.util.Random;

public class Vault {
	
	Random r = new Random();
	int code = r.nextInt(1000001);
	
	boolean tryCode(int guess) {
		if (guess==code) {
			return true;
		}
		else {
			return false;
		}
	}
}

 class JamesBond {
	
	Vault vault = new Vault();
	
	int findCode() {
		for (int i = 0; i <= 1000000; i++) {
			boolean tc = vault.tryCode(i);
			if (tc == true) {
				return i;
			}
		}
		return -1;
	}
}