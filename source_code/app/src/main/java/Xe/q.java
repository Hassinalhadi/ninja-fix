package Xe;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = this.purple;
        switch (this.alpha) {
            case 0:
                return CollectionsKt.listOf(Qe.l.india(rVar.bravo), Qe.l.juliet(rVar.bravo));
            default:
                return CollectionsKt.orange(Qe.l.hotel(rVar.bravo));
        }
    }
}
