package algorithms;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Noah Tyler
 */
public class MainMST {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0 || !new File(args[0]).exists())
        {
            System.out.println("ERROR: Invalid Filename!");
            System.exit(0);
        }
        new KruskalMST(new File(args[0]));
    }
}
