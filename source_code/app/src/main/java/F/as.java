package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class as extends Lambda implements Xd.l {
    public final /* synthetic */ Function0 alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1115d;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ a0.as silver;
    public final /* synthetic */ ak teal;
    public final /* synthetic */ androidx.compose.foundation.layout.M white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(Function0 function0, T.s sVar, boolean z2, a0.as asVar, ak akVar, androidx.compose.foundation.layout.M m4, P.d dVar, int i4, int i5) {
        super(2);
        this.alpha = function0;
        this.purple = sVar;
        this.red = z2;
        this.silver = asVar;
        this.teal = akVar;
        this.white = m4;
        this.yellow = dVar;
        this.f1114c = i4;
        this.f1115d = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1114c | 1);
        P.d dVar = this.yellow;
        androidx.compose.foundation.layout.M m4 = this.white;
        K1.juliet(this.alpha, this.purple, this.red, this.silver, this.teal, m4, dVar, (InterfaceC0581m) obj, cyan, this.f1115d);
        return Unit.INSTANCE;
    }
}
