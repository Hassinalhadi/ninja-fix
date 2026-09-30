package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0105f0 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105f0(T.s sVar, float f5, long j5, int i4) {
        super(2);
        this.alpha = sVar;
        this.purple = f5;
        this.red = j5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(391);
        long j5 = this.red;
        K1.kilo(this.alpha, this.purple, j5, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
