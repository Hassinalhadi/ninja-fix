package wc;

import Pd.i;
import Xd.l;
import af.C0437h;
import androidx.compose.runtime.ax;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: wc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3262h extends i implements l {
    public final /* synthetic */ C0437h alpha;
    public final /* synthetic */ ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3262h(C0437h c0437h, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c0437h;
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3262h(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3262h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (!((Boolean) this.purple.getValue()).booleanValue()) {
            this.alpha.alpha("android.permission.CAMERA");
        }
        return Unit.INSTANCE;
    }
}
