package fd;

import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import sd.q;

/* loaded from: classes2.dex */
public abstract class k {
    public static final Set alpha;

    static {
        List list = q.alpha;
        alpha = ArraysKt.g(new String[]{"Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since"});
    }
}
