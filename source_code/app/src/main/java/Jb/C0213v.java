package Jb;

import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jb.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0213v extends Pd.i implements Xd.l {
    public final /* synthetic */ C0215x alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213v(C0215x c0215x, String str, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c0215x;
        this.purple = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0213v(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0213v) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        J2.i iVar = this.alpha.f1664p;
        if (iVar != null) {
            Intrinsics.checkNotNull(iVar);
            ((TextView) iVar.alpha).setText(this.purple);
        }
        return Unit.INSTANCE;
    }
}
