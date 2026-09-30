package af;

import com.google.android.gms.internal.measurement.C1290a1;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: af.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0441l extends Pd.i implements Xd.l {
    public final /* synthetic */ C0440k alpha;
    public final /* synthetic */ boolean purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0441l(C0440k c0440k, boolean z2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c0440k;
        this.purple = z2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0441l(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0441l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        C1290a1 c1290a1;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C0440k c0440k = this.alpha;
        boolean z2 = this.purple;
        if (!z2 && !c0440k.delta && c0440k.isEnabled() && (c1290a1 = c0440k.charlie) != null) {
            c1290a1.echo();
        }
        c0440k.setEnabled(z2);
        return Unit.INSTANCE;
    }
}
