

import java.io.IOException;

public class InitiateProcess {

	public static void main(String[] args) throws InterruptedException, Exception, IOException {
		System.out.println("PROCESS NAME:"+args[0]+" - PROCESS ID:"+args[1]);
		Process proc = new Process(args[0], Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		
		proc.processActivated();
	}
}

