package J8;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.U;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.N;

/* loaded from: classes2.dex */
public final class ah implements InterfaceC3439i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ah(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a2 -> B:18:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b4 -> B:21:0x00b1). Please report as a decompilation issue!!! */
    @Override // yf.InterfaceC3439i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        yf.q qVar;
        int i4;
        Throwable th;
        zf.y yVar;
        ah ahVar;
        InterfaceC3440j interfaceC3440j2;
        yf.w wVar;
        int i5;
        long j5;
        ah ahVar2;
        ah ahVar3;
        InterfaceC3440j interfaceC3440j3;
        Throwable th2;
        Serializable juliet;
        switch (this.alpha) {
            case 0:
                Object collect = ((yf.s) this.purple).collect(new E.e(4, interfaceC3440j, (ak) this.red), cVar);
                if (collect != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect;
            case 1:
                if (cVar instanceof yf.q) {
                    qVar = (yf.q) cVar;
                    int i10 = qVar.purple;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        qVar.purple = i10 - RecyclerView.UNDEFINED_DURATION;
                        Object obj = qVar.alpha;
                        Od.a aVar = Od.a.alpha;
                        i4 = qVar.purple;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    ResultKt.alpha(obj);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yVar = qVar.white;
                            interfaceC3440j2 = qVar.teal;
                            ahVar = qVar.silver;
                            try {
                                ResultKt.alpha(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                yVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            ResultKt.alpha(obj);
                            zf.y yVar2 = new zf.y(interfaceC3440j, qVar.getContext());
                            try {
                                C1.n nVar = (C1.n) this.purple;
                                qVar.silver = this;
                                qVar.teal = interfaceC3440j;
                                qVar.white = yVar2;
                                qVar.purple = 1;
                                if (nVar.invoke(yVar2, qVar) != aVar) {
                                    ahVar = this;
                                    interfaceC3440j2 = interfaceC3440j;
                                    yVar = yVar2;
                                } else {
                                    return aVar;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                yVar = yVar2;
                                yVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        yVar.releaseIntercepted();
                        N n5 = (N) ahVar.red;
                        qVar.silver = null;
                        qVar.teal = null;
                        qVar.white = null;
                        qVar.purple = 2;
                        n5.collect(interfaceC3440j2, qVar);
                        return aVar;
                    }
                }
                qVar = new yf.q(this, cVar);
                Object obj2 = qVar.alpha;
                Od.a aVar2 = Od.a.alpha;
                i4 = qVar.purple;
                if (i4 == 0) {
                }
                yVar.releaseIntercepted();
                N n52 = (N) ahVar.red;
                qVar.silver = null;
                qVar.teal = null;
                qVar.white = null;
                qVar.purple = 2;
                n52.collect(interfaceC3440j2, qVar);
                return aVar2;
            case 2:
                if (cVar instanceof yf.w) {
                    wVar = (yf.w) cVar;
                    int i11 = wVar.purple;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        wVar.purple = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj3 = wVar.alpha;
                        Od.a aVar3 = Od.a.alpha;
                        i5 = wVar.purple;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    j5 = wVar.yellow;
                                    th2 = wVar.white;
                                    interfaceC3440j3 = wVar.teal;
                                    ahVar3 = wVar.silver;
                                    ResultKt.alpha(obj3);
                                    if (!((Boolean) obj3).booleanValue()) {
                                        j5++;
                                        boolean z2 = true;
                                        ahVar2 = ahVar3;
                                        if (z2) {
                                            return Unit.INSTANCE;
                                        }
                                        interfaceC3440j = interfaceC3440j3;
                                        C1.t tVar = (C1.t) ahVar2.purple;
                                        wVar.silver = ahVar2;
                                        wVar.teal = interfaceC3440j;
                                        wVar.white = null;
                                        wVar.yellow = j5;
                                        wVar.purple = 1;
                                        juliet = AbstractC3428A.juliet(tVar, interfaceC3440j, wVar);
                                        if (juliet == aVar3) {
                                            ahVar3 = ahVar2;
                                            obj3 = juliet;
                                            interfaceC3440j3 = interfaceC3440j;
                                            th2 = (Throwable) obj3;
                                            if (th2 == null) {
                                                B2.n nVar2 = (B2.n) ahVar3.red;
                                                Long l10 = new Long(j5);
                                                wVar.silver = ahVar3;
                                                wVar.teal = interfaceC3440j3;
                                                wVar.white = th2;
                                                wVar.yellow = j5;
                                                wVar.purple = 2;
                                                obj3 = nVar2.invoke(interfaceC3440j3, th2, l10, wVar);
                                                if (obj3 == aVar3) {
                                                    return aVar3;
                                                }
                                                if (!((Boolean) obj3).booleanValue()) {
                                                    throw th2;
                                                }
                                            } else {
                                                z2 = false;
                                                ahVar2 = ahVar3;
                                                if (z2) {
                                                }
                                            }
                                        } else {
                                            return aVar3;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                j5 = wVar.yellow;
                                interfaceC3440j = wVar.teal;
                                ah ahVar4 = wVar.silver;
                                ResultKt.alpha(obj3);
                                ahVar3 = ahVar4;
                                interfaceC3440j3 = interfaceC3440j;
                                th2 = (Throwable) obj3;
                                if (th2 == null) {
                                }
                            }
                        } else {
                            ResultKt.alpha(obj3);
                            j5 = 0;
                            ahVar2 = this;
                            C1.t tVar2 = (C1.t) ahVar2.purple;
                            wVar.silver = ahVar2;
                            wVar.teal = interfaceC3440j;
                            wVar.white = null;
                            wVar.yellow = j5;
                            wVar.purple = 1;
                            juliet = AbstractC3428A.juliet(tVar2, interfaceC3440j, wVar);
                            if (juliet == aVar3) {
                            }
                        }
                    }
                }
                wVar = new yf.w(this, cVar);
                Object obj32 = wVar.alpha;
                Od.a aVar32 = Od.a.alpha;
                i5 = wVar.purple;
                if (i5 == 0) {
                }
            default:
                Object alpha = zf.b.alpha(cVar, new cd.a((Nd.c) null, (U) this.red), yf.ar.alpha, interfaceC3440j, (InterfaceC3439i[]) this.purple);
                if (alpha != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return alpha;
        }
    }
}
