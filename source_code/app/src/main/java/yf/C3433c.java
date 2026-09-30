package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import xf.EnumC3340a;

/* renamed from: yf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3433c extends zf.f {
    public final Pd.i silver;
    public final Pd.i teal;

    /* JADX WARN: Multi-variable type inference failed */
    public C3433c(Xd.l lVar, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        super(hVar, i4, enumC3340a);
        Pd.i iVar = (Pd.i) lVar;
        this.silver = iVar;
        this.teal = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v3, types: [Xd.l, Pd.i] */
    @Override // zf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(xf.r rVar, Nd.c cVar) {
        C3432b c3432b;
        int i4;
        if (cVar instanceof C3432b) {
            c3432b = (C3432b) cVar;
            int i5 = c3432b.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3432b.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c3432b.purple;
                Object obj2 = Od.a.alpha;
                i4 = c3432b.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        rVar = c3432b.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    c3432b.alpha = rVar;
                    c3432b.silver = 1;
                    Object invoke = this.silver.invoke(rVar, c3432b);
                    if (invoke != obj2) {
                        invoke = Unit.INSTANCE;
                    }
                    if (invoke == obj2) {
                        return obj2;
                    }
                }
                if (!((xf.q) rVar).silver.xray()) {
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        c3432b = new C3432b(this, (Pd.c) cVar);
        Object obj3 = c3432b.purple;
        Object obj22 = Od.a.alpha;
        i4 = c3432b.silver;
        if (i4 == 0) {
        }
        if (!((xf.q) rVar).silver.xray()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // zf.f
    public final zf.f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return new C3433c(this.teal, hVar, i4, enumC3340a);
    }

    @Override // zf.f
    public final String toString() {
        return "block[" + this.silver + "] -> " + super.toString();
    }
}
