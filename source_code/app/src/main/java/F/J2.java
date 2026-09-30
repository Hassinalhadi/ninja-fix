package F;

import bz.C0778c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class J2 extends Lambda implements Function1 {
    public final /* synthetic */ AbstractC2367C alpha;
    public final /* synthetic */ L2 purple;
    public final /* synthetic */ float red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(AbstractC2367C abstractC2367C, L2 l22, float f5) {
        super(1);
        this.alpha = abstractC2367C;
        this.purple = l22;
        this.red = f5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        C0778c c0778c = this.purple.silver;
        if (c0778c != null) {
            f5 = ((Number) c0778c.delta()).floatValue();
        } else {
            f5 = this.red;
        }
        AbstractC2366B.juliet(abstractC2366B, this.alpha, (int) f5, 0);
        return Unit.INSTANCE;
    }
}
