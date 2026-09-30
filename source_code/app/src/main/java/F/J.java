package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class J extends Lambda implements Xd.l {
    public final /* synthetic */ P.d alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1032c;
    public final /* synthetic */ D0.an purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ androidx.compose.foundation.layout.M yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P.d dVar, D0.an anVar, long j5, long j6, long j7, float f5, androidx.compose.foundation.layout.M m4, int i4) {
        super(2);
        this.alpha = dVar;
        this.purple = anVar;
        this.red = j5;
        this.silver = j6;
        this.teal = j7;
        this.white = f5;
        this.yellow = m4;
        this.f1032c = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1032c | 1);
        P.d dVar = this.alpha;
        long j5 = this.silver;
        long j6 = this.teal;
        N.charlie(dVar, this.purple, this.red, j5, j6, this.white, this.yellow, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
