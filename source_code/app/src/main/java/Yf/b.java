package Yf;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b implements Function1 {
    public static final b purple = new b(0);
    public static final b red = new b(1);
    public static final b silver = new b(2);
    public static final b teal = new b(3);
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(obj instanceof Zf.a);
            case 1:
                return Boolean.valueOf(obj instanceof Zf.a);
            case 2:
                return Boolean.valueOf(obj instanceof Zf.a);
            default:
                return Boolean.valueOf(obj instanceof Zf.a);
        }
    }
}
