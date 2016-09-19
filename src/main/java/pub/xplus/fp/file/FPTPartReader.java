package pub.xplus.fp.file;

import java.io.InputStream;

/**
 * Created by AllenYe on 2016/9/19.
 */
public interface FPTPartReader<T> {
    public T read(InputStream in);
}
