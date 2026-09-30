package androidx.compose.foundation.layout;

import Yb.B0;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s6.X6;

/* renamed from: androidx.compose.foundation.layout.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0554u implements q0.ap, O {
    public final InterfaceC0541g alpha;
    public final T.i bravo;

    public C0554u(InterfaceC0541g interfaceC0541g, T.i iVar) {
        this.alpha = interfaceC0541g;
        this.bravo = iVar;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int round;
        int i5;
        int i10;
        int ochre = interfaceC2402u.ochre(this.alpha.alpha());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * ochre, i4);
        int size = list.size();
        int i11 = 0;
        float f5 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2401t interfaceC2401t = (InterfaceC2401t) list.get(i12);
            float mike = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t));
            if (mike == 0.0f) {
                if (i4 == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i4 - min;
                }
                int min2 = Math.min(interfaceC2401t.delta(LottieConstants.IterateForever), i10);
                min += min2;
                i11 = Math.max(i11, interfaceC2401t.lima(min2));
            } else if (mike > 0.0f) {
                f5 += mike;
            }
        }
        if (f5 == 0.0f) {
            round = 0;
        } else if (i4 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i4 - min, 0) / f5);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2401t interfaceC2401t2 = (InterfaceC2401t) list.get(i13);
            float mike2 = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t2));
            if (mike2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i5 = Math.round(round * mike2);
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                i11 = Math.max(i11, interfaceC2401t2.lima(i5));
            }
        }
        return i11;
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int ochre = interfaceC2402u.ochre(this.alpha.alpha());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i5 = 0;
        int i10 = 0;
        float f5 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC2401t interfaceC2401t = (InterfaceC2401t) list.get(i11);
            float mike = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t));
            int jade = interfaceC2401t.jade(i4);
            if (mike == 0.0f) {
                i10 += jade;
            } else if (mike > 0.0f) {
                f5 += mike;
                i5 = Math.max(i5, Math.round(jade / mike));
            }
        }
        return ((list.size() - 1) * ochre) + Math.round(i5 * f5) + i10;
    }

    @Override // androidx.compose.foundation.layout.O
    public final long charlie(int i4, int i5, int i10, boolean z2) {
        if (!z2) {
            return Q0.b.alpha(0, i10, i4, i5);
        }
        return X6.alpha(0, i10, i4, i5);
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        return AbstractC0538d.papa(this, Q0.a.india(j5), Q0.a.juliet(j5), Q0.a.golf(j5), Q0.a.hotel(j5), arVar.ochre(this.alpha.alpha()), arVar, list, new AbstractC2367C[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.O
    public final void echo(int i4, int[] iArr, int[] iArr2, q0.ar arVar) {
        this.alpha.bravo(arVar, i4, iArr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0554u)) {
            return false;
        }
        C0554u c0554u = (C0554u) obj;
        return Intrinsics.areEqual(this.alpha, c0554u.alpha) && Intrinsics.areEqual(this.bravo, c0554u.bravo);
    }

    @Override // androidx.compose.foundation.layout.O
    public final int foxtrot(AbstractC2367C abstractC2367C) {
        return abstractC2367C.purple;
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int round;
        int i5;
        int i10;
        int ochre = interfaceC2402u.ochre(this.alpha.alpha());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * ochre, i4);
        int size = list.size();
        int i11 = 0;
        float f5 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2401t interfaceC2401t = (InterfaceC2401t) list.get(i12);
            float mike = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t));
            if (mike == 0.0f) {
                if (i4 == Integer.MAX_VALUE) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = i4 - min;
                }
                int min2 = Math.min(interfaceC2401t.delta(LottieConstants.IterateForever), i10);
                min += min2;
                i11 = Math.max(i11, interfaceC2401t.romeo(min2));
            } else if (mike > 0.0f) {
                f5 += mike;
            }
        }
        if (f5 == 0.0f) {
            round = 0;
        } else if (i4 == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i4 - min, 0) / f5);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2401t interfaceC2401t2 = (InterfaceC2401t) list.get(i13);
            float mike2 = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t2));
            if (mike2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i5 = Math.round(round * mike2);
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                i11 = Math.max(i11, interfaceC2401t2.romeo(i5));
            }
        }
        return i11;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo.alpha) + (this.alpha.hashCode() * 31);
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int ochre = interfaceC2402u.ochre(this.alpha.alpha());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i5 = 0;
        int i10 = 0;
        float f5 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC2401t interfaceC2401t = (InterfaceC2401t) list.get(i11);
            float mike = AbstractC0538d.mike(AbstractC0538d.lima(interfaceC2401t));
            int delta = interfaceC2401t.delta(i4);
            if (mike == 0.0f) {
                i10 += delta;
            } else if (mike > 0.0f) {
                f5 += mike;
                i5 = Math.max(i5, Math.round(delta / mike));
            }
        }
        return ((list.size() - 1) * ochre) + Math.round(i5 * f5) + i10;
    }

    @Override // androidx.compose.foundation.layout.O
    public final q0.aq india(AbstractC2367C[] abstractC2367CArr, q0.ar arVar, int[] iArr, int i4, int i5, int[] iArr2, int i10, int i11, int i12) {
        return arVar.papa(i5, i4, kotlin.collections.t.alpha, new B0(abstractC2367CArr, this, i5, arVar, iArr));
    }

    @Override // androidx.compose.foundation.layout.O
    public final int juliet(AbstractC2367C abstractC2367C) {
        return abstractC2367C.alpha;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.alpha + ", horizontalAlignment=" + this.bravo + ')';
    }
}
