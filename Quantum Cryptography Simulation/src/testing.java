import java.util.concurrent.ThreadLocalRandom;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<50) {
		System.out.println(ThreadLocalRandom.current().nextInt(1, 2 + 1));
		i++;
		}}

}
