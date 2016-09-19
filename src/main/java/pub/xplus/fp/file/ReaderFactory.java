package pub.xplus.fp.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.xplus.fp.file.constants.FPT;
import pub.xplus.fp.file.v4.V0400Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by AllenYe on 2016/9/19.
 */
public class ReaderFactory {
    static Logger LOG = LoggerFactory.getLogger(ReaderFactory.class);

    public static FPTReader getInstance(InputStream in) {
        FPTReader reader = null;
        byte[] buf = new byte[FPT.FILE_HEAD_LENGTH];
        try {
            if (in.markSupported()) {
                in.mark(FPT.FILE_HEAD_LENGTH);
            }
            in.read(buf);
            if (in.markSupported()) {
                in.reset();
            }
            String version = new String(buf);
            if (FPT.V0400.equals(version)) {
                reader = new V0400Reader();
            }
        } catch (IOException e) {
            LOG.error("FPT文件格式不正确,{}", e.getMessage());
        }
        return reader;
    }
}
