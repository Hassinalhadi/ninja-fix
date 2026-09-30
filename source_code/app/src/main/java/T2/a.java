package T2;

import X2.k;
import java.io.File;

/* loaded from: classes3.dex */
public final class a implements b {
    public final boolean alpha;

    public a(boolean z2) {
        this.alpha = z2;
    }

    @Override // T2.b
    public final String alpha(Object obj, k kVar) {
        File file = (File) obj;
        if (this.alpha) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
