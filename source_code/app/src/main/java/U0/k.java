package U0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class k extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2367C purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractC2367C abstractC2367C, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = abstractC2367C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                AbstractC2366B.juliet((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B.juliet((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 2:
                AbstractC2366B.hotel((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 3:
                AbstractC2366B.hotel((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 4:
                AbstractC2366B.hotel((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            case 5:
                AbstractC2366B.kilo((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
            default:
                AbstractC2366B.hotel((AbstractC2366B) obj, this.purple, 0, 0);
                return Unit.INSTANCE;
        }
    }
}
