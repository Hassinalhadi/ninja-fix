package C1;

import a2.C0398w;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import yf.C3431a;
import yf.C3441k;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class t implements InterfaceC3439i {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ t(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Type inference failed for: r9v32, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3439i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        C3441k c3441k;
        int i4;
        InterfaceC3440j interfaceC3440j2;
        Iterator it;
        yf.z zVar;
        int i5;
        AbortFlowException e;
        Object obj;
        C3431a c3431a;
        int i10;
        Throwable th;
        zf.y yVar;
        switch (this.alpha) {
            case 0:
                Object collect = ((yf.s) this.purple).collect(new s(interfaceC3440j, 0), cVar);
                if (collect != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect;
            case 1:
                InterfaceC3439i[] interfaceC3439iArr = (InterfaceC3439i[]) this.purple;
                Object alpha = zf.b.alpha(cVar, new F2.m(3, 0, (Nd.c) null), new Aa.g(16, interfaceC3439iArr), interfaceC3440j, interfaceC3439iArr);
                if (alpha != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return alpha;
            case 2:
                Object collect2 = ((yf.s) this.purple).collect(new s(interfaceC3440j, 5), cVar);
                if (collect2 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect2;
            case 3:
                Object collect3 = ((t) this.purple).collect(new s(interfaceC3440j, 6), cVar);
                if (collect3 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect3;
            case 4:
                if (cVar instanceof C3441k) {
                    c3441k = (C3441k) cVar;
                    int i11 = c3441k.purple;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3441k.purple = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj2 = c3441k.alpha;
                        Od.a aVar = Od.a.alpha;
                        i4 = c3441k.purple;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                it = c3441k.teal;
                                InterfaceC3440j interfaceC3440j3 = c3441k.silver;
                                ResultKt.alpha(obj2);
                                interfaceC3440j2 = interfaceC3440j3;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj2);
                            interfaceC3440j2 = interfaceC3440j;
                            it = ((List) this.purple).iterator();
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            c3441k.silver = interfaceC3440j2;
                            c3441k.teal = it;
                            c3441k.purple = 1;
                            if (interfaceC3440j2.emit(next, c3441k) == aVar) {
                                return aVar;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c3441k = new C3441k(this, cVar);
                Object obj22 = c3441k.alpha;
                Od.a aVar2 = Od.a.alpha;
                i4 = c3441k.purple;
                if (i4 == 0) {
                }
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            case 5:
                if (cVar instanceof yf.z) {
                    zVar = (yf.z) cVar;
                    int i12 = zVar.purple;
                    if ((i12 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        zVar.purple = i12 - RecyclerView.UNDEFINED_DURATION;
                        Object obj3 = zVar.alpha;
                        Od.a aVar3 = Od.a.alpha;
                        i5 = zVar.purple;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                obj = zVar.silver;
                                try {
                                    ResultKt.alpha(obj3);
                                } catch (AbortFlowException e4) {
                                    e = e4;
                                    if (e.owner != obj) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj3);
                            Object obj4 = new Object();
                            Object obj5 = new Object();
                            try {
                                t tVar = (t) this.purple;
                                C0398w c0398w = new C0398w(obj5, interfaceC3440j, obj4, 3);
                                zVar.silver = obj4;
                                zVar.purple = 1;
                                if (tVar.collect(c0398w, zVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (AbortFlowException e5) {
                                e = e5;
                                obj = obj4;
                                if (e.owner != obj) {
                                    throw e;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                zVar = new yf.z(this, cVar);
                Object obj32 = zVar.alpha;
                Od.a aVar32 = Od.a.alpha;
                i5 = zVar.purple;
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            case 6:
                Object collect4 = ((InterfaceC3439i) this.purple).collect(new s(interfaceC3440j, 7), cVar);
                if (collect4 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return collect4;
            default:
                if (cVar instanceof C3431a) {
                    c3431a = (C3431a) cVar;
                    int i13 = c3431a.silver;
                    if ((i13 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3431a.silver = i13 - RecyclerView.UNDEFINED_DURATION;
                        Object obj6 = c3431a.purple;
                        Object obj7 = Od.a.alpha;
                        i10 = c3431a.silver;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                yVar = c3431a.alpha;
                                try {
                                    ResultKt.alpha(obj6);
                                } catch (Throwable th2) {
                                    th = th2;
                                    yVar.releaseIntercepted();
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj6);
                            zf.y yVar2 = new zf.y(interfaceC3440j, c3431a.getContext());
                            try {
                                c3431a.alpha = yVar2;
                                c3431a.silver = 1;
                                Object invoke = ((Pd.i) this.purple).invoke(yVar2, c3431a);
                                if (invoke != obj7) {
                                    invoke = Unit.INSTANCE;
                                }
                                if (invoke != obj7) {
                                    yVar = yVar2;
                                } else {
                                    return obj7;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                yVar = yVar2;
                                yVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        yVar.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                }
                c3431a = new C3431a(this, cVar);
                Object obj62 = c3431a.purple;
                Object obj72 = Od.a.alpha;
                i10 = c3431a.silver;
                if (i10 == 0) {
                }
                yVar.releaseIntercepted();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(Xd.l lVar) {
        this.alpha = 7;
        this.purple = (Pd.i) lVar;
    }
}
