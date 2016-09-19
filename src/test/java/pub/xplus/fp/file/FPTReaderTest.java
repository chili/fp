package pub.xplus.fp.file;

import org.junit.Test;

import java.io.*;

/**
 * Created by AllenYe on 2016/9/19.
 */
public class FPTReaderTest {
    @Test
    public void readXc0400() throws Exception {
        File xc = new File("d:/fp/A0003605219992008030002.FPT");
        InputStream in = new FileInputStream(xc);
        FPTReader reader = ReaderFactory.getInstance(in);
        if (reader != null) {
            reader.read(in);
        }
        in.close();
    }
}
