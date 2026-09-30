package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: yf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3446p implements InterfaceC3439i {
    public final /* synthetic */ InterfaceC3439i alpha;
    public final /* synthetic */ Pd.i purple;

    /* JADX WARN: Multi-variable type inference failed */
    public C3446p(InterfaceC3439i interfaceC3439i, Xd.m mVar) {
        this.alpha = interfaceC3439i;
        this.purple = (Pd.i) mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Xd.m, Pd.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Xd.m, Pd.i] */
    @Override // yf.InterfaceC3439i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        C3445o c3445o;
        Od.a aVar;
        int i4;
        C3446p c3446p;
        P p4;
        ?? r22;
        zf.y yVar;
        Throwable th;
        zf.y yVar2;
        ?? r92;
        try {
            if (cVar instanceof C3445o) {
                c3445o = (C3445o) cVar;
                int i5 = c3445o.purple;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c3445o.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = c3445o.alpha;
                    aVar = Od.a.alpha;
                    i4 = c3445o.purple;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    yVar2 = (zf.y) c3445o.silver;
                                    try {
                                        ResultKt.alpha(obj);
                                        yVar2.releaseIntercepted();
                                        return Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        yVar2.releaseIntercepted();
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th3 = (Throwable) c3445o.silver;
                            ResultKt.alpha(obj);
                            throw th3;
                        }
                        interfaceC3440j = c3445o.teal;
                        c3446p = (C3446p) c3445o.silver;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            p4 = new P(th);
                            r22 = c3446p.purple;
                            c3445o.silver = th;
                            c3445o.teal = null;
                            c3445o.purple = 2;
                            if (AbstractC3428A.foxtrot(p4, r22, th, c3445o) != aVar) {
                            }
                        }
                    } else {
                        ResultKt.alpha(obj);
                        try {
                            InterfaceC3439i interfaceC3439i = this.alpha;
                            c3445o.silver = this;
                            c3445o.teal = interfaceC3440j;
                            c3445o.purple = 1;
                            if (interfaceC3439i.collect(interfaceC3440j, c3445o) != aVar) {
                                c3446p = this;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c3446p = this;
                            p4 = new P(th);
                            r22 = c3446p.purple;
                            c3445o.silver = th;
                            c3445o.teal = null;
                            c3445o.purple = 2;
                            if (AbstractC3428A.foxtrot(p4, r22, th, c3445o) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    yVar = new zf.y(interfaceC3440j, c3445o.getContext());
                    r92 = c3446p.purple;
                    c3445o.silver = yVar;
                    c3445o.teal = null;
                    c3445o.purple = 3;
                    if (r92.invoke(yVar, null, c3445o) != aVar) {
                        yVar2 = yVar;
                        yVar2.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
            }
            r92 = c3446p.purple;
            c3445o.silver = yVar;
            c3445o.teal = null;
            c3445o.purple = 3;
            if (r92.invoke(yVar, null, c3445o) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            yVar2 = yVar;
            yVar2.releaseIntercepted();
            throw th;
        }
        c3445o = new C3445o(this, cVar);
        Object obj2 = c3445o.alpha;
        aVar = Od.a.alpha;
        i4 = c3445o.purple;
        if (i4 == 0) {
        }
        yVar = new zf.y(interfaceC3440j, c3445o.getContext());
    }
}
