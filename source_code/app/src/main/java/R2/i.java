package R2;

import android.net.Uri;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements f {
    public final Lazy alpha;
    public final Lazy bravo;
    public final boolean charlie;

    public i(Lazy lazy, Lazy lazy2, boolean z2) {
        this.alpha = lazy;
        this.bravo = lazy2;
        this.charlie = z2;
    }

    @Override // R2.f
    public final g alpha(Object obj, X2.k kVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.areEqual(uri.getScheme(), "http") && !Intrinsics.areEqual(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), kVar, this.alpha, this.bravo, this.charlie);
    }
}
