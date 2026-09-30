package J3;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ag implements r {
    public static final Set bravo = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final r alpha;

    public ag(r rVar) {
        this.alpha = rVar;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        return this.alpha.alpha(new h(((Uri) obj).toString(), i.alpha), i4, i5, iVar);
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        return bravo.contains(((Uri) obj).getScheme());
    }
}
