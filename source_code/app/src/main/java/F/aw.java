package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aw extends Lambda implements Xd.l {
    public final /* synthetic */ a0.as alpha;
    public final /* synthetic */ at purple;
    public final /* synthetic */ au red;
    public final /* synthetic */ b.ab silver;
    public final /* synthetic */ P.d teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(a0.as asVar, at atVar, au auVar, b.ab abVar, P.d dVar, int i4) {
        super(2);
        this.alpha = asVar;
        this.purple = atVar;
        this.red = auVar;
        this.silver = abVar;
        this.teal = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(196615);
        P.d dVar = this.teal;
        at atVar = this.purple;
        au auVar = this.red;
        K1.india(this.alpha, atVar, auVar, this.silver, dVar, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
