package a2;

import ae.C0423b;
import androidx.compose.runtime.K;
import androidx.compose.runtime.M;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import bz.a0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.AbstractC3428A;
import yf.InterfaceC3440j;
import zf.ae;

/* renamed from: a2.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0398w implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;
    public final Object silver;

    public C0398w(K k6, a0 a0Var, ax axVar) {
        this.alpha = 1;
        this.red = k6;
        this.silver = a0Var;
        this.purple = axVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Type inference failed for: r8v23, types: [Xd.l, Pd.i] */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        boolean z2;
        yf.x xVar;
        int i4;
        C0398w c0398w;
        yf.aa aaVar;
        int i5;
        switch (this.alpha) {
            case 0:
                C0423b c0423b = (C0423b) obj;
                if (((List) ((ax) this.purple).getValue()).size() > 1) {
                    ((ax) this.red).setValue(Boolean.TRUE);
                    ((n0) ((aw) this.silver)).kilo(c0423b.charlie);
                }
                return Unit.INSTANCE;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    Xd.l lVar = (Xd.l) ((ax) this.purple).getValue();
                    a0 a0Var = (a0) this.silver;
                    z2 = ((Boolean) lVar.invoke(a0Var.alpha.L(), ((t0) a0Var.delta).getValue())).booleanValue();
                } else {
                    z2 = false;
                }
                ((M) ((K) this.red)).setValue(Boolean.valueOf(z2));
                return Unit.INSTANCE;
            case 2:
                if (cVar instanceof yf.x) {
                    xVar = (yf.x) cVar;
                    int i10 = xVar.teal;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        xVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                        Object obj2 = xVar.red;
                        Od.a aVar = Od.a.alpha;
                        i4 = xVar.teal;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    obj = xVar.purple;
                                    c0398w = xVar.alpha;
                                    ResultKt.alpha(obj2);
                                    if (!((Boolean) obj2).booleanValue()) {
                                        ((kotlin.jvm.internal.q) c0398w.purple).alpha = true;
                                        xVar.alpha = null;
                                        xVar.purple = null;
                                        xVar.teal = 3;
                                        if (((InterfaceC3440j) c0398w.red).emit(obj, xVar) == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            ResultKt.alpha(obj2);
                            return Unit.INSTANCE;
                        }
                        ResultKt.alpha(obj2);
                        if (((kotlin.jvm.internal.q) this.purple).alpha) {
                            xVar.teal = 1;
                            if (((InterfaceC3440j) this.red).emit(obj, xVar) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        }
                        xVar.alpha = this;
                        xVar.purple = obj;
                        xVar.teal = 2;
                        obj2 = ((Pd.i) this.silver).invoke(obj, xVar);
                        if (obj2 != aVar) {
                            c0398w = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                }
                xVar = new yf.x(this, cVar);
                Object obj22 = xVar.red;
                Od.a aVar2 = Od.a.alpha;
                i4 = xVar.teal;
                if (i4 == 0) {
                }
            case 3:
                if (cVar instanceof yf.aa) {
                    aaVar = (yf.aa) cVar;
                    int i11 = aaVar.red;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        aaVar.red = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj3 = aaVar.alpha;
                        Od.a aVar3 = Od.a.alpha;
                        i5 = aaVar.red;
                        if (i5 == 0) {
                            if (i5 == 1 || i5 == 2) {
                                ResultKt.alpha(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj3);
                            kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.purple;
                            int i12 = sVar.alpha + 1;
                            sVar.alpha = i12;
                            InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.red;
                            if (i12 < 1) {
                                aaVar.red = 1;
                                if (interfaceC3440j.emit(obj, aaVar) == aVar3) {
                                    return aVar3;
                                }
                            } else {
                                aaVar.red = 2;
                                AbstractC3428A.delta(interfaceC3440j, obj, this.silver, aaVar);
                                return aVar3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                aaVar = new yf.aa(this, cVar);
                Object obj32 = aaVar.alpha;
                Od.a aVar32 = Od.a.alpha;
                i5 = aaVar.red;
                if (i5 == 0) {
                }
                return Unit.INSTANCE;
            default:
                Object charlie = zf.b.charlie((Nd.h) this.purple, obj, this.red, (ae) this.silver, cVar);
                if (charlie != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return charlie;
        }
    }

    public /* synthetic */ C0398w(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0398w(kotlin.jvm.internal.q qVar, InterfaceC3440j interfaceC3440j, Xd.l lVar) {
        this.alpha = 2;
        this.purple = qVar;
        this.red = interfaceC3440j;
        this.silver = (Pd.i) lVar;
    }

    public C0398w(InterfaceC3440j interfaceC3440j, Nd.h hVar) {
        this.alpha = 4;
        this.purple = hVar;
        this.red = Af.f.lima(hVar);
        this.silver = new ae(interfaceC3440j, null);
    }
}
