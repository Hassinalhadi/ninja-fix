package g0;

import a0.C0356j;
import android.graphics.PathMeasure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1727g extends Lambda implements Function0 {
    public static final C1727g purple = new C1727g(0, 0);
    public static final C1727g red = new C1727g(0, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1727g(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return new C0356j(new PathMeasure());
            default:
                return Unit.INSTANCE;
        }
    }
}
