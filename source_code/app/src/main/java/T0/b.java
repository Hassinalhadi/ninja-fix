package T0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {
    public static final b purple = new b(1, 0);
    public static final b red = new b(1, 1);
    public static final b silver = new b(1, 2);
    public static final b teal = new b(1, 3);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new A2.q(19, jVar.f2075j));
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
