package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.runtime.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0570e implements Function1 {
    public final /* synthetic */ C0568d alpha;
    public final /* synthetic */ C0572f purple;
    public final /* synthetic */ kotlin.jvm.internal.s red;

    public C0570e(C0568d c0568d, C0572f c0572f, kotlin.jvm.internal.s sVar) {
        this.alpha = c0568d;
        this.purple = c0572f;
        this.red = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        int i5;
        C0568d c0568d = this.alpha;
        c0568d.alpha = null;
        c0568d.bravo = null;
        P.a aVar = this.purple.silver;
        int i10 = this.red.alpha;
        do {
            i4 = aVar.get();
            if (((i4 >>> 27) & 15) == i10) {
                i5 = i4 - 1;
            } else {
                i5 = i4;
            }
        } while (!aVar.compareAndSet(i4, i5));
        return Unit.INSTANCE;
    }
}
