package d0;

import a0.C0366t;
import ao.ad;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1563a extends Lambda implements Function1 {
    public static final C1563a purple = new C1563a(1, 0);
    public static final C1563a red = new C1563a(1, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1563a(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            default:
                ad.november((c0.d) obj, C0366t.juliet, 0L, 0L, 0.0f, null, 126);
                return Unit.INSTANCE;
        }
    }
}
