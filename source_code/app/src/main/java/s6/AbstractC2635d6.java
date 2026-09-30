package s6;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import qd.C2464b;
import vf.C3195B;

/* renamed from: s6.d6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2635d6 {
    /* JADX WARN: Type inference failed for: r0v3, types: [Ke.f, java.lang.Object] */
    public static Ke.f alpha(Ie.D table) {
        Intrinsics.echo(table, "table");
        if (table.purple.size() == 0) {
            return Ke.f.alpha;
        }
        Intrinsics.delta(table.purple, "table.requirementList");
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r9 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(vd.e eVar, io.ktor.utils.io.m mVar, Pd.c cVar) {
        kd.af afVar;
        Object obj;
        int i4;
        io.ktor.utils.io.ag agVar;
        if (cVar instanceof kd.af) {
            kd.af afVar2 = (kd.af) cVar;
            int i5 = afVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                afVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                afVar = afVar2;
                Object obj2 = afVar.red;
                obj = Od.a.alpha;
                i4 = afVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                if (afVar.alpha == null) {
                                    ResultKt.alpha(obj2);
                                    throw null;
                                }
                                throw new ClassCastException();
                            }
                        }
                        vd.e eVar2 = afVar.alpha;
                        ResultKt.alpha(obj2);
                        return eVar2;
                    }
                    io.ktor.utils.io.ag agVar2 = afVar.purple;
                    eVar = afVar.alpha;
                    ResultKt.alpha(obj2);
                    agVar = agVar2;
                } else {
                    ResultKt.alpha(obj2);
                    if (eVar instanceof vd.c) {
                        byte[] echo = ((vd.c) eVar).echo();
                        afVar.alpha = eVar;
                        afVar.purple = mVar;
                        afVar.silver = 1;
                        Object sierra = io.ktor.utils.io.ak.sierra(mVar, echo, echo.length, afVar);
                        agVar = mVar;
                    } else {
                        if (eVar instanceof vd.d) {
                            io.ktor.utils.io.m mVar2 = new io.ktor.utils.io.m(false);
                            t6.a4.alpha(((vd.d) eVar).echo(), mVar, mVar2);
                            return new kd.f(eVar, mVar2);
                        }
                        if (eVar instanceof vd.a) {
                            io.ktor.utils.io.m mVar3 = new io.ktor.utils.io.m(false);
                            t6.a4.alpha((io.ktor.utils.io.m) io.ktor.utils.io.ak.uniform(C3195B.alpha, vf.ao.alpha, new kd.ag((vd.a) eVar, null), 2).purple, mVar, mVar3);
                            return new kd.f(eVar, mVar3);
                        }
                        if (eVar instanceof C2464b) {
                            afVar.alpha = eVar;
                            afVar.silver = 4;
                            if (mVar.india(afVar) != obj) {
                                return eVar;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return obj;
                }
                afVar.alpha = eVar;
                afVar.purple = null;
                afVar.silver = 2;
                if (((io.ktor.utils.io.m) agVar).india(afVar) == obj) {
                    return eVar;
                }
                return obj;
            }
        }
        afVar = new Pd.c(cVar);
        Object obj22 = afVar.red;
        obj = Od.a.alpha;
        i4 = afVar.silver;
        if (i4 == 0) {
        }
        afVar.alpha = eVar;
        afVar.purple = null;
        afVar.silver = 2;
        if (((io.ktor.utils.io.m) agVar).india(afVar) == obj) {
        }
    }
}
