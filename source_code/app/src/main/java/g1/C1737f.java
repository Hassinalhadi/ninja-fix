package g1;

import android.net.Uri;
import androidx.appcompat.widget.P0;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1737f implements InterfaceC1736e {
    public final String alpha;
    public final HashMap bravo = new HashMap();

    public C1737f(String str) {
        this.alpha = str;
    }

    public final File alpha(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.bravo.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    String path = canonicalFile.getPath();
                    String path2 = file.getPath();
                    if (FileProvider.access$000(path).startsWith(FileProvider.access$000(path2) + '/')) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException(P0.beige(uri, "Unable to find configured root for "));
        }
        throw new IllegalArgumentException(P0.beige(uri, "Unable to find path from root: "));
    }
}
