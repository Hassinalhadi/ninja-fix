package bx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* renamed from: bx.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0773k extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C[] alpha;
    public final /* synthetic */ C0774l purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773k(AbstractC2367C[] abstractC2367CArr, C0774l c0774l, int i4, int i5) {
        super(1);
        this.alpha = abstractC2367CArr;
        this.purple = c0774l;
        this.red = i4;
        this.silver = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        for (AbstractC2367C abstractC2367C : this.alpha) {
            if (abstractC2367C != null) {
                long alpha = this.purple.alpha.bravo.alpha((abstractC2367C.alpha << 32) | (abstractC2367C.purple & 4294967295L), (this.silver & 4294967295L) | (this.red << 32), Q0.n.alpha);
                AbstractC2366B.hotel(abstractC2366B, abstractC2367C, (int) (alpha >> 32), (int) (alpha & 4294967295L));
            }
        }
        return Unit.INSTANCE;
    }
}
