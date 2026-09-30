package N2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2367C purple;

    public /* synthetic */ t(AbstractC2367C abstractC2367C, int i4) {
        this.alpha = i4;
        this.purple = abstractC2367C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        switch (this.alpha) {
            case 0:
                AbstractC2366B.hotel(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 2:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 3:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 4:
                Q0.n foxtrot = abstractC2366B.foxtrot();
                Q0.n nVar = Q0.n.alpha;
                AbstractC2367C abstractC2367C = this.purple;
                if (foxtrot != nVar && abstractC2366B.golf() != 0) {
                    long golf = ((abstractC2366B.golf() - abstractC2367C.alpha) - r1) << 32;
                    AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
                    abstractC2367C.silver(Q0.k.charlie((((int) 0) & 4294967295L) | golf, abstractC2367C.teal), 0.0f, null);
                } else {
                    AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
                    abstractC2367C.silver(Q0.k.charlie(0L, abstractC2367C.teal), 0.0f, null);
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 6:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 7:
                AbstractC2366B.hotel(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 8:
                AbstractC2366B.hotel(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 9:
                AbstractC2366B.juliet(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 10:
                AbstractC2366B.hotel(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
            default:
                AbstractC2366B.hotel(abstractC2366B, this.purple, 0, 0);
                return Unit.INSTANCE;
        }
    }
}
