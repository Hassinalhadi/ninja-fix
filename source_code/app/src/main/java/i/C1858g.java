package i;

import kotlin.jvm.functions.Function1;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1858g implements androidx.compose.foundation.lazy.layout.p {
    public final Function1 alpha;
    public final Function1 bravo;
    public final P.d charlie;

    public C1858g(Function1 function1, Function1 function12, P.d dVar) {
        this.alpha = function1;
        this.bravo = function12;
        this.charlie = dVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public final Function1 getKey() {
        return this.alpha;
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public final Function1 getType() {
        return this.bravo;
    }
}
