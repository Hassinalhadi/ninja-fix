package bc;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class c implements Comparator {
    public final boolean alpha;

    public c(boolean z2) {
        this.alpha = z2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.alpha) {
            return signum * (-1);
        }
        return signum;
    }
}
