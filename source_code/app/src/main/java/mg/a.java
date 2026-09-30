package mg;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import lg.b;

/* loaded from: classes2.dex */
public final class a {
    public static final b echo = new b("_root_");
    public final eg.a alpha;
    public final Set bravo;
    public final ConcurrentHashMap charlie;
    public final og.a delta;

    public a(eg.a _koin) {
        Intrinsics.echo(_koin, "_koin");
        this.alpha = _koin;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.delta(newSetFromMap, "newSetFromMap(...)");
        this.bravo = newSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.charlie = concurrentHashMap;
        b bVar = echo;
        og.a aVar = new og.a(bVar, _koin);
        this.delta = aVar;
        newSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
