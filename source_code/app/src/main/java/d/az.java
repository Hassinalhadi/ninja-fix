package d;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class az extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;

    /* JADX WARN: Type inference failed for: r0v0, types: [Pd.i, d.az, Nd.c] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ?? iVar = new Pd.i(2, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((az) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                abVar = (vf.ab) this.purple;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            abVar = (vf.ab) this.purple;
        }
        while (vf.ad.whiskey(abVar.charlie())) {
            com.clevertap.android.sdk.inapp.images.preload.a aVar2 = new com.clevertap.android.sdk.inapp.images.preload.a(6);
            this.purple = abVar;
            this.alpha = 1;
            if (C0564b.sierra(getContext()).blue(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
