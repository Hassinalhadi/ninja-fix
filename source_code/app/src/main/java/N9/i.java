package N9;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import q3.AbstractC2410d;
import q3.C2407a;
import q3.C2408b;
import q3.C2409c;
import td.C3117a;
import vf.ad;
import yf.at;
import yf.av;

/* loaded from: classes2.dex */
public final class i implements q3.g {
    public final q3.e alpha;
    public final LinkedHashMap bravo;
    public final ConcurrentHashMap charlie;

    public i(q3.e eVar, q3.f fVar, List flags, C3117a c3117a) {
        int collectionSizeOrDefault;
        Intrinsics.echo(flags, "flags");
        this.alpha = eVar;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(flags, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec < 16 ? 16 : quebec);
        for (Object obj : flags) {
            linkedHashMap.put(((AbstractC2410d) obj).alpha, obj);
        }
        this.bravo = linkedHashMap;
        this.charlie = new ConcurrentHashMap();
        ad.zulu(c3117a, null, null, new h(this, null), 3);
    }

    public final Object alpha(AbstractC2410d flag) {
        long longValue;
        boolean booleanValue;
        Intrinsics.echo(flag, "flag");
        boolean z2 = flag instanceof C2407a;
        q3.e eVar = this.alpha;
        if (z2) {
            C2407a c2407a = (C2407a) flag;
            Boolean charlie = eVar.charlie(c2407a.alpha);
            if (charlie != null) {
                booleanValue = charlie.booleanValue();
            } else {
                booleanValue = ((Boolean) c2407a.bravo).booleanValue();
            }
            return Boolean.valueOf(booleanValue);
        }
        if (flag instanceof C2409c) {
            C2409c c2409c = (C2409c) flag;
            String echo = eVar.echo(c2409c.alpha);
            if (echo == null) {
                return (String) c2409c.bravo;
            }
            return echo;
        }
        if (flag instanceof C2408b) {
            C2408b c2408b = (C2408b) flag;
            Long delta = eVar.delta(c2408b.alpha);
            if (delta != null) {
                longValue = delta.longValue();
            } else {
                longValue = ((Number) c2408b.bravo).longValue();
            }
            return Long.valueOf(longValue);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean bravo(C2407a flag) {
        Intrinsics.echo(flag, "flag");
        return ((Boolean) alpha(flag)).booleanValue();
    }

    public final av charlie(C2407a flag) {
        Object computeIfAbsent;
        Intrinsics.echo(flag, "flag");
        computeIfAbsent = this.charlie.computeIfAbsent(flag.alpha, new g(0, new Cb.ad(15, this, flag)));
        Intrinsics.delta(computeIfAbsent, "computeIfAbsent(...)");
        return new av((at) computeIfAbsent);
    }
}
