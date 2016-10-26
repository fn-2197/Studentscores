import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Studentscores {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sf = new Scanner(new File("E:\\Workspace\\fileinout\\StudentScores.txt"));
		int maxIndx = -1;
		String me[] = new String[10000];
		while(sf.hasNext()){
			maxIndx++;
			me[maxIndx] = sf.nextLine();
		}
			sf.close();
			
			String answer = "";
		int sum;
		FileWriter fw = new FileWriter("E:\\Workspace\\fileinout\\StudentSCoresout.txt");
		PrintWriter output = new PrintWriter(fw);
		for(int j = 0; j <=maxIndx;j++){
			
			Scanner sc = new Scanner(me[j]);
			sum = 0;
			answer = "";
			int nscore = 0;
			answer += sc.next() + ", average = ";
			while(sc.hasNext()){
				int i = sc.nextInt();
				nscore++;
				sum += i;}
				
			
			answer += sum/nscore;
			System.out.println(answer);
			output.println(answer);
			
			
		}
		output.close();
		fw.close();
	}

}
