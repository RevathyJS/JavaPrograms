
package IOdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class bytestreamdemo {
    public static void main(String[] args)throws Exception {
        FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("input.jpg");
        fou=new FileWriter("output.jpg");
        int i;
        while((i=fio.read())!= -1)
        fou.write(i);
    }
    
}
