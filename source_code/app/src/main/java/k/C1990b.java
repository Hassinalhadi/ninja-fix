package k;

import Yb.C0312j0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC2972b3;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1990b {
    public final J.e alpha = new J.e(new C1991c[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Z.c cVar, Pd.c cVar2) {
        C1989a c1989a;
        int i4;
        Z.c cVar3;
        int i5;
        Object[] objArr;
        int i10;
        if (cVar2 instanceof C1989a) {
            c1989a = (C1989a) cVar2;
            int i11 = c1989a.yellow;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1989a.yellow = i11 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c1989a.teal;
                Od.a aVar = Od.a.alpha;
                i4 = c1989a.yellow;
                if (i4 == 0) {
                    if (i4 == 1) {
                        i5 = c1989a.silver;
                        i10 = c1989a.red;
                        objArr = c1989a.purple;
                        Z.c cVar4 = c1989a.alpha;
                        ResultKt.alpha(obj);
                        cVar3 = cVar4;
                        i10++;
                        if (i10 < i5) {
                            C1991c c1991c = (C1991c) objArr[i10];
                            C0312j0 c0312j0 = new C0312j0(28, cVar3);
                            c1989a.alpha = cVar3;
                            c1989a.purple = objArr;
                            c1989a.red = i10;
                            c1989a.silver = i5;
                            c1989a.yellow = 1;
                            if (AbstractC2972b3.alpha(c1991c, c0312j0, c1989a) == aVar) {
                                return aVar;
                            }
                            i10++;
                            if (i10 < i5) {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    J.e eVar = this.alpha;
                    Object[] objArr2 = eVar.alpha;
                    int i12 = eVar.red;
                    cVar3 = cVar;
                    i5 = i12;
                    objArr = objArr2;
                    i10 = 0;
                    if (i10 < i5) {
                    }
                }
            }
        }
        c1989a = new C1989a(this, cVar2);
        Object obj2 = c1989a.teal;
        Od.a aVar2 = Od.a.alpha;
        i4 = c1989a.yellow;
        if (i4 == 0) {
        }
    }
}
