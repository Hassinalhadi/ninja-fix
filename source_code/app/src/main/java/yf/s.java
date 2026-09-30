package yf;

import a2.C0398w;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class s implements InterfaceC3439i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InterfaceC3439i purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: Multi-variable type inference failed */
    public s(InterfaceC3439i interfaceC3439i, Xd.l lVar, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 2:
                this.purple = interfaceC3439i;
                this.red = (Pd.i) lVar;
                return;
            case 3:
                this.purple = interfaceC3439i;
                this.red = (Pd.i) lVar;
                return;
            default:
                this.purple = interfaceC3439i;
                this.red = (Pd.i) lVar;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Xd.m, Pd.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3439i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        r rVar;
        int i4;
        s sVar;
        Throwable th;
        ab abVar;
        int i5;
        ad adVar;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof r) {
                    rVar = (r) cVar;
                    int i10 = rVar.purple;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        rVar.purple = i10 - RecyclerView.UNDEFINED_DURATION;
                        Object obj = rVar.alpha;
                        Object obj2 = Od.a.alpha;
                        i4 = rVar.purple;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    ResultKt.alpha(obj);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3440j = rVar.teal;
                            sVar = rVar.silver;
                            ResultKt.alpha(obj);
                        } else {
                            ResultKt.alpha(obj);
                            rVar.silver = this;
                            rVar.teal = interfaceC3440j;
                            rVar.purple = 1;
                            obj = AbstractC3428A.juliet(this.purple, interfaceC3440j, rVar);
                            if (obj != obj2) {
                                sVar = this;
                            } else {
                                return obj2;
                            }
                        }
                        th = (Throwable) obj;
                        if (th != null) {
                            ?? r22 = sVar.red;
                            rVar.silver = null;
                            rVar.teal = null;
                            rVar.purple = 2;
                            if (r22.invoke(interfaceC3440j, th, rVar) == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                rVar = new r(this, cVar);
                Object obj3 = rVar.alpha;
                Object obj22 = Od.a.alpha;
                i4 = rVar.purple;
                if (i4 == 0) {
                }
                th = (Throwable) obj3;
                if (th != null) {
                }
                return Unit.INSTANCE;
            case 1:
                Object collect = this.purple.collect(new C0398w((kotlin.jvm.internal.q) new Object(), interfaceC3440j, (Xd.l) this.red), cVar);
                if (collect != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect;
            case 2:
                if (cVar instanceof ab) {
                    abVar = (ab) cVar;
                    int i11 = abVar.purple;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        abVar.purple = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj4 = abVar.alpha;
                        Od.a aVar = Od.a.alpha;
                        i5 = abVar.purple;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                adVar = abVar.silver;
                                try {
                                    ResultKt.alpha(obj4);
                                } catch (AbortFlowException e) {
                                    e = e;
                                    if (e.owner != adVar) {
                                        vf.ad.oscar(abVar.getContext());
                                        return Unit.INSTANCE;
                                    }
                                    throw e;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj4);
                            InterfaceC3439i interfaceC3439i = this.purple;
                            ad adVar2 = new ad((Xd.l) this.red, interfaceC3440j);
                            try {
                                abVar.silver = adVar2;
                                abVar.purple = 1;
                                if (interfaceC3439i.collect(adVar2, abVar) == aVar) {
                                    return aVar;
                                }
                            } catch (AbortFlowException e4) {
                                e = e4;
                                adVar = adVar2;
                                if (e.owner != adVar) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                abVar = new ab(this, cVar);
                Object obj42 = abVar.alpha;
                Od.a aVar2 = Od.a.alpha;
                i5 = abVar.purple;
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            default:
                Object collect2 = this.purple.collect(new ad(interfaceC3440j, (Xd.l) this.red), cVar);
                if (collect2 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(InterfaceC3439i interfaceC3439i, Xd.m mVar) {
        this.alpha = 0;
        this.purple = interfaceC3439i;
        this.red = (Pd.i) mVar;
    }
}
