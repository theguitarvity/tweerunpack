

import java.io.File;
import java.io.FileNotFoundException;

import edu.princeton.cs.algs4.BinaryIn;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		if(args.length<1)
			System.out.println("Aponte o arquivo de tweets compactados");
		else {
			BinaryIn in = new BinaryIn(args[0]);
			File file = new File(args[0]);
			//HuffmanD.expand(file);
			CompacHuffman.expand(file);
			
			
			
		}

	}

}
