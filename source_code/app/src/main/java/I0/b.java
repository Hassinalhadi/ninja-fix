package I0;

import a0.C0347ag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class b extends Lambda implements Function1 {
    public static final b purple = new b(1, 0);
    public static final b red = new b(1, 1);
    public static final b silver = new b(1, 2);
    public static final b teal = new b(1, 3);
    public static final b white = new b(1, 4);
    public static final b yellow = new b(1, 5);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                float[] fArr = ((C0347ag) obj).alpha;
                return Unit.INSTANCE;
            case 1:
                float[] fArr2 = ((C0347ag) obj).alpha;
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                int i4 = ((k) obj).alpha;
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            default:
                int i5 = ((k) obj).alpha;
                return Unit.INSTANCE;
        }
    }
}
