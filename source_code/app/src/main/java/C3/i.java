package C3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class i {
    public static final Charset alpha = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void alpha(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    alpha(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
