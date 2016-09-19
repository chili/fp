package pub.xplus.fp.file.v4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.xplus.fp.file.FPTReader;
import pub.xplus.fp.file.model.V0400F01;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by AllenYe on 2016/9/19.
 */
public class V0400Reader implements FPTReader {
    static Logger LOG = LoggerFactory.getLogger(V0400Reader.class);

    public void read(InputStream in) {
        LOG.debug("V0400 Read开始");
        V0400F01Reader f01r = new V0400F01Reader();
        V0400F01 header = f01r.read(in);
        LOG.debug("V0400 Read结束");
    }

    public void write(OutputStream out) {

    }
}
