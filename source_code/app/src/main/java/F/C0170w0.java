package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0170w0 extends Lambda implements Xd.l {
    public final /* synthetic */ P.d alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ C0156s0 teal;
    public final /* synthetic */ androidx.compose.foundation.layout.M white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170w0(P.d dVar, Function0 function0, T.s sVar, boolean z2, C0156s0 c0156s0, androidx.compose.foundation.layout.M m4, int i4) {
        super(2);
        this.alpha = dVar;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
        this.teal = c0156s0;
        this.white = m4;
        this.yellow = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.yellow | 1);
        P.d dVar = this.alpha;
        boolean z2 = this.silver;
        C0156s0 c0156s0 = this.teal;
        AbstractC0173x0.bravo(dVar, this.purple, this.red, z2, c0156s0, this.white, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
