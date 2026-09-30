package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: y.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3347G implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3344D purple;

    public /* synthetic */ C3347G(C3344D c3344d, int i4) {
        this.alpha = i4;
        this.purple = c3344d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(!this.purple.azure);
            case 1:
                C3344D c3344d = this.purple;
                I0.aa golf = C3344D.golf(c3344d.oscar().alpha, D0.ae.bravo(0, c3344d.oscar().alpha.purple.length()));
                c3344d.charlie.invoke(golf);
                long j5 = golf.bravo;
                c3344d.whiskey = new D0.am(j5);
                c3344d.uniform = I0.aa.alpha(c3344d.uniform, null, j5, 5);
                c3344d.juliet(true);
                return Unit.INSTANCE;
            default:
                Function0 function0 = this.purple.golf;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
