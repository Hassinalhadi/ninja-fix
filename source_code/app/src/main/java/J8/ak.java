package J8;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ak {
    public final Nd.h alpha;
    public final C1.h bravo;
    public final AtomicReference charlie;
    public final ah delta;

    public ak(Nd.h backgroundDispatcher, C1.h dataStore) {
        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.echo(dataStore, "dataStore");
        this.alpha = backgroundDispatcher;
        this.bravo = dataStore;
        this.charlie = new AtomicReference();
        this.delta = new ah(0, new yf.s(dataStore.alpha(), new F2.m(3, 1, (Nd.c) null)), this);
        vf.ad.zulu(vf.ad.charlie(backgroundDispatcher), null, null, new af(this, null), 3);
    }
}
