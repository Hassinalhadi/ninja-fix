package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* renamed from: F.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0176y0 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2367C purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176y0(int i4, AbstractC2367C abstractC2367C, int i5) {
        super(1);
        this.alpha = i4;
        this.purple = abstractC2367C;
        this.red = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B.hotel((AbstractC2366B) obj, this.purple, Zd.a.delta((this.alpha - r0.alpha) / 2.0f), Zd.a.delta((this.red - r0.purple) / 2.0f));
        return Unit.INSTANCE;
    }
}
