package T1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends c {
    public e(c initialExtras) {
        Intrinsics.echo(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.alpha;
        Intrinsics.echo(initialExtras2, "initialExtras");
        this.alpha.putAll(initialExtras2);
    }

    @Override // T1.c
    public final Object alpha(b key) {
        Intrinsics.echo(key, "key");
        return this.alpha.get(key);
    }

    public /* synthetic */ e(int i4) {
        this(a.bravo);
    }
}
