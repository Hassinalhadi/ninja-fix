package U0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1 {
    public static final c purple = new c(1, 0);
    public static final c red = new c(1, 1);
    public static final c silver = new c(1, 2);
    public static final c teal = new c(1, 3);
    public static final c white = new c(1, 4);
    public static final c yellow = new c(1, 5);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                ge.v[] vVarArr = A0.aa.alpha;
                A0.ac acVar = A0.x.whiskey;
                Unit unit = Unit.INSTANCE;
                ((A0.k) ((A0.ad) obj)).hotel(acVar, unit);
                return unit;
            case 1:
                ((Number) obj).longValue();
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                ge.v[] vVarArr2 = A0.aa.alpha;
                A0.ac acVar2 = A0.x.victor;
                Unit unit2 = Unit.INSTANCE;
                ((A0.k) ((A0.ad) obj)).hotel(acVar2, unit2);
                return unit2;
            case 4:
                return Unit.INSTANCE;
            default:
                z zVar = (z) obj;
                if (zVar.isAttachedToWindow()) {
                    zVar.november();
                }
                return Unit.INSTANCE;
        }
    }
}
