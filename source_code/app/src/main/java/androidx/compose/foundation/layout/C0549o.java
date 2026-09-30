package androidx.compose.foundation.layout;

import androidx.appcompat.widget.P0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.InterfaceC2402u;

/* renamed from: androidx.compose.foundation.layout.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0549o implements q0.ap {
    public final T.f alpha;
    public final boolean bravo;

    public C0549o(T.f fVar, boolean z2) {
        this.alpha = fVar;
        this.bravo = z2;
    }

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.s, java.lang.Object] */
    @Override // q0.ap
    public final q0.aq delta(final q0.ar arVar, List list, long j5) {
        long j6;
        int i4;
        int i5;
        C0544j c0544j;
        boolean z2;
        C0544j c0544j2;
        boolean z10;
        boolean z11;
        int juliet;
        int india;
        boolean z12;
        AbstractC2367C victor;
        boolean isEmpty = list.isEmpty();
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if (isEmpty) {
            return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), tVar, new a5.c(5));
        }
        if (this.bravo) {
            j6 = j5;
        } else {
            j6 = j5 & (-8589934589L);
        }
        C0544j c0544j3 = null;
        boolean z13 = true;
        if (list.size() == 1) {
            final q0.ao aoVar = (q0.ao) list.get(0);
            Object yankee = aoVar.yankee();
            if (yankee instanceof C0544j) {
                c0544j3 = (C0544j) yankee;
            }
            if (c0544j3 != null) {
                z11 = c0544j3.purple;
            } else {
                z11 = false;
            }
            if (!z11) {
                victor = aoVar.victor(j6);
                juliet = Math.max(Q0.a.juliet(j5), victor.alpha);
                india = Math.max(Q0.a.india(j5), victor.purple);
            } else {
                juliet = Q0.a.juliet(j5);
                india = Q0.a.india(j5);
                int juliet2 = Q0.a.juliet(j5);
                int india2 = Q0.a.india(j5);
                if (juliet2 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (india2 < 0) {
                    z13 = false;
                }
                if (!(z13 & z12)) {
                    Q0.j.alpha("width and height must be >= 0");
                }
                victor = aoVar.victor(Q0.b.hotel(juliet2, juliet2, india2, india2));
            }
            final int i10 = india;
            final int i11 = juliet;
            final AbstractC2367C abstractC2367C = victor;
            return arVar.papa(i11, i10, tVar, new Function1() { // from class: androidx.compose.foundation.layout.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AbstractC0547m.bravo((AbstractC2366B) obj, AbstractC2367C.this, aoVar, arVar.getLayoutDirection(), i11, i10, this.alpha);
                    return Unit.INSTANCE;
                }
            });
        }
        AbstractC2367C[] abstractC2367CArr = new AbstractC2367C[list.size()];
        ?? obj = new Object();
        obj.alpha = Q0.a.juliet(j5);
        ?? obj2 = new Object();
        obj2.alpha = Q0.a.india(j5);
        int size = list.size();
        boolean z14 = false;
        for (int i12 = 0; i12 < size; i12++) {
            q0.ao aoVar2 = (q0.ao) list.get(i12);
            Object yankee2 = aoVar2.yankee();
            if (yankee2 instanceof C0544j) {
                c0544j2 = (C0544j) yankee2;
            } else {
                c0544j2 = null;
            }
            if (c0544j2 != null) {
                z10 = c0544j2.purple;
            } else {
                z10 = false;
            }
            if (!z10) {
                AbstractC2367C victor2 = aoVar2.victor(j6);
                abstractC2367CArr[i12] = victor2;
                obj.alpha = Math.max(obj.alpha, victor2.alpha);
                obj2.alpha = Math.max(obj2.alpha, victor2.purple);
            } else {
                z14 = true;
            }
        }
        if (z14) {
            int i13 = obj.alpha;
            if (i13 != Integer.MAX_VALUE) {
                i4 = i13;
            } else {
                i4 = 0;
            }
            int i14 = obj2.alpha;
            if (i14 != Integer.MAX_VALUE) {
                i5 = i14;
            } else {
                i5 = 0;
            }
            long alpha = Q0.b.alpha(i4, i13, i5, i14);
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                q0.ao aoVar3 = (q0.ao) list.get(i15);
                Object yankee3 = aoVar3.yankee();
                if (yankee3 instanceof C0544j) {
                    c0544j = (C0544j) yankee3;
                } else {
                    c0544j = null;
                }
                if (c0544j != null) {
                    z2 = c0544j.purple;
                } else {
                    z2 = false;
                }
                if (z2) {
                    abstractC2367CArr[i15] = aoVar3.victor(alpha);
                }
            }
        }
        return arVar.papa(obj.alpha, obj2.alpha, tVar, new Y4.a(abstractC2367CArr, list, arVar, obj, obj2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0549o)) {
            return false;
        }
        C0549o c0549o = (C0549o) obj;
        return Intrinsics.areEqual(this.alpha, c0549o.alpha) && this.bravo == c0549o.bravo;
    }

    @Override // q0.ap
    public final /* synthetic */ int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.alpha);
        sb2.append(", propagateMinConstraints=");
        return P0.gray(sb2, this.bravo, ')');
    }
}
