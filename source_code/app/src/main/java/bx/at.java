package bx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class at extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ C1.av silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(AbstractC2367C abstractC2367C, long j5, long j6, C1.av avVar) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = j5;
        this.red = j6;
        this.silver = avVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        long j5 = this.purple;
        long j6 = this.red;
        int i4 = ((int) (j5 >> 32)) + ((int) (j6 >> 32));
        int i5 = ((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L));
        C1.av avVar = this.silver;
        AbstractC2367C abstractC2367C = this.alpha;
        abstractC2366B.getClass();
        AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
        abstractC2367C.silver(Q0.k.charlie((i4 << 32) | (4294967295L & i5), abstractC2367C.teal), 0.0f, avVar);
        return Unit.INSTANCE;
    }
}
