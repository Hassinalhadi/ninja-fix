package androidx.compose.foundation.gestures;

import Pd.c;
import T.s;
import Xd.l;
import Z.b;
import androidx.recyclerview.widget.RecyclerView;
import b.M;
import d.C1548o0;
import d.K;
import d.Q;
import d.S;
import d.T;
import d.U;
import d.V;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.jvm.internal.r;
import n.a0;

/* loaded from: classes3.dex */
public abstract class a {
    public static final com.clevertap.android.sdk.inapp.images.preload.a alpha = new com.clevertap.android.sdk.inapp.images.preload.a(7);
    public static final S bravo = new Object();
    public static final Q charlie = new Object();
    public static final T delta = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(C1548o0 c1548o0, long j5, c cVar) {
        U u4;
        int i4;
        C1548o0 c1548o02;
        r rVar;
        if (cVar instanceof U) {
            U u10 = (U) cVar;
            int i5 = u10.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                u10.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                u4 = u10;
                Object obj = u4.red;
                Object obj2 = Od.a.alpha;
                i4 = u4.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        r rVar2 = u4.purple;
                        C1548o0 c1548o03 = u4.alpha;
                        ResultKt.alpha(obj);
                        rVar = rVar2;
                        c1548o02 = c1548o03;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    ?? obj3 = new Object();
                    M m4 = M.alpha;
                    l v4 = new V(c1548o0, j5, obj3, null);
                    u4.alpha = c1548o0;
                    u4.purple = obj3;
                    u4.silver = 1;
                    if (c1548o0.foxtrot(m4, v4, u4) == obj2) {
                        return obj2;
                    }
                    c1548o02 = c1548o0;
                    rVar = obj3;
                }
                return new b(c1548o02.hotel(rVar.alpha));
            }
        }
        u4 = new c(cVar);
        Object obj4 = u4.red;
        Object obj22 = Od.a.alpha;
        i4 = u4.silver;
        if (i4 == 0) {
        }
        return new b(c1548o02.hotel(rVar.alpha));
    }

    public static s bravo(a0 a0Var, K k6, boolean z2, boolean z10, InterfaceC1673j interfaceC1673j) {
        return new ScrollableElement(a0Var, k6, z2, z10, interfaceC1673j);
    }
}
