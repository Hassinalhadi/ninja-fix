package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class K extends Lambda implements Xd.l {
    public final /* synthetic */ boolean alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W1 f1033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.ab f1034d;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ T.p silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ a0.as white;
    public final /* synthetic */ T1 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(boolean z2, Function0 function0, P.d dVar, T.p pVar, boolean z10, a0.as asVar, T1 t12, W1 w12, b.ab abVar, int i4) {
        super(2);
        this.alpha = z2;
        this.purple = function0;
        this.red = dVar;
        this.silver = pVar;
        this.teal = z10;
        this.white = asVar;
        this.yellow = t12;
        this.f1033c = w12;
        this.f1034d = abVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(385);
        P.d dVar = this.red;
        T1 t12 = this.yellow;
        W1 w12 = this.f1033c;
        N.alpha(this.alpha, this.purple, dVar, this.silver, this.teal, this.white, t12, w12, this.f1034d, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
