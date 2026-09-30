package bx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function1 {
    public final /* synthetic */ r alpha;
    public final /* synthetic */ AbstractC2367C purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, AbstractC2367C abstractC2367C, long j5) {
        super(1);
        this.alpha = rVar;
        this.purple = abstractC2367C;
        this.red = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T.f fVar = this.alpha.silver.bravo;
        AbstractC2366B.india((AbstractC2366B) obj, this.purple, fVar.alpha((r0.purple & 4294967295L) | (r0.alpha << 32), this.red, Q0.n.alpha));
        return Unit.INSTANCE;
    }
}
