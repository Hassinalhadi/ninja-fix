package me;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ j purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return n.juliet.charlie(this.purple.purple);
            default:
                return n.juliet.charlie(this.purple.alpha);
        }
    }
}
