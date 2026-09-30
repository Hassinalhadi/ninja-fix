package N9;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import q3.C2407a;
import q3.C2408b;
import u3.InterfaceC3143f;

/* loaded from: classes2.dex */
public final class e implements InterfaceC3143f {
    public final /* synthetic */ LinkedHashMap alpha;
    public final /* synthetic */ q3.g bravo;
    public final /* synthetic */ LinkedHashMap charlie;

    public e(LinkedHashMap linkedHashMap, q3.g gVar, LinkedHashMap linkedHashMap2) {
        this.alpha = linkedHashMap;
        this.bravo = gVar;
        this.charlie = linkedHashMap2;
    }

    public final boolean alpha(String key, boolean z2) {
        Intrinsics.echo(key, "key");
        C2407a c2407a = (C2407a) this.alpha.get(key);
        if (c2407a != null) {
            return ((i) this.bravo).bravo(c2407a);
        }
        return z2;
    }

    public final long bravo(String str, long j5) {
        C2408b c2408b = (C2408b) this.charlie.get(str);
        if (c2408b != null) {
            return ((Number) ((i) this.bravo).alpha(c2408b)).longValue();
        }
        return j5;
    }
}
