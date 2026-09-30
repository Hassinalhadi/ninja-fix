package androidx.compose.foundation.layout;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s6.X6;

/* loaded from: classes3.dex */
public final class S implements q0.ap, O {
    public final InterfaceC0539e alpha;
    public final T.j bravo;

    public S(InterfaceC0539e interfaceC0539e, T.j jVar) {
        this.alpha = interfaceC0539e;
        this.bravo = jVar;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
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
            int lima = interfaceC2401t.lima(i4);
            if (mike == 0.0f) {
                i10 += lima;
            } else if (mike > 0.0f) {
                f5 += mike;
                i5 = Math.max(i5, Math.round(lima / mike));
            }
        }
        return ((list.size() - 1) * ochre) + Math.round(i5 * f5) + i10;
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
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
                int min2 = Math.min(interfaceC2401t.romeo(LottieConstants.IterateForever), i10);
                min += min2;
                i11 = Math.max(i11, interfaceC2401t.jade(min2));
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
                i11 = Math.max(i11, interfaceC2401t2.jade(i5));
            }
        }
        return i11;
    }

    @Override // androidx.compose.foundation.layout.O
    public final long charlie(int i4, int i5, int i10, boolean z2) {
        if (!z2) {
            return Q0.b.alpha(i4, i5, 0, i10);
        }
        return X6.bravo(i4, i5, 0, i10);
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        return AbstractC0538d.papa(this, Q0.a.juliet(j5), Q0.a.india(j5), Q0.a.hotel(j5), Q0.a.golf(j5), arVar.ochre(this.alpha.alpha()), arVar, list, new AbstractC2367C[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.foundation.layout.O
    public final void echo(int i4, int[] iArr, int[] iArr2, q0.ar arVar) {
        this.alpha.charlie(arVar, i4, iArr, arVar.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s3 = (S) obj;
        return Intrinsics.areEqual(this.alpha, s3.alpha) && Intrinsics.areEqual(this.bravo, s3.bravo);
    }

    @Override // androidx.compose.foundation.layout.O
    public final int foxtrot(AbstractC2367C abstractC2367C) {
        return abstractC2367C.alpha;
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
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
            int romeo = interfaceC2401t.romeo(i4);
            if (mike == 0.0f) {
                i10 += romeo;
            } else if (mike > 0.0f) {
                f5 += mike;
                i5 = Math.max(i5, Math.round(romeo / mike));
            }
        }
        return ((list.size() - 1) * ochre) + Math.round(i5 * f5) + i10;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.bravo.alpha) + (this.alpha.hashCode() * 31);
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
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
                int min2 = Math.min(interfaceC2401t.romeo(LottieConstants.IterateForever), i10);
                min += min2;
                i11 = Math.max(i11, interfaceC2401t.delta(min2));
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
                i11 = Math.max(i11, interfaceC2401t2.delta(i5));
            }
        }
        return i11;
    }

    @Override // androidx.compose.foundation.layout.O
    public final q0.aq india(AbstractC2367C[] abstractC2367CArr, q0.ar arVar, int[] iArr, int i4, int i5, int[] iArr2, int i10, int i11, int i12) {
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new R9.a(abstractC2367CArr, this, i5, iArr));
    }

    @Override // androidx.compose.foundation.layout.O
    public final int juliet(AbstractC2367C abstractC2367C) {
        return abstractC2367C.purple;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.alpha + ", verticalAlignment=" + this.bravo + ')';
    }
}
