package bx;

import androidx.compose.runtime.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class t implements q0.ap {
    public final ab alpha;
    public boolean bravo;

    public t(ab abVar) {
        this.alpha = abVar;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        int lima = ((InterfaceC2401t) list.get(0)).lima(i4);
        int ivory = CollectionsKt.ivory(list);
        int i5 = 1;
        if (1 <= ivory) {
            while (true) {
                int lima2 = ((InterfaceC2401t) list.get(i5)).lima(i4);
                if (lima2 > lima) {
                    lima = lima2;
                }
                if (i5 == ivory) {
                    break;
                }
                i5++;
            }
        }
        return lima;
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        int jade = ((InterfaceC2401t) list.get(0)).jade(i4);
        int ivory = CollectionsKt.ivory(list);
        int i5 = 1;
        if (1 <= ivory) {
            while (true) {
                int jade2 = ((InterfaceC2401t) list.get(i5)).jade(i4);
                if (jade2 > jade) {
                    jade = jade2;
                }
                if (i5 == ivory) {
                    break;
                }
                i5++;
            }
        }
        return jade;
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2367C victor = ((q0.ao) list.get(i10)).victor(j5);
            i4 = Math.max(i4, victor.alpha);
            i5 = Math.max(i5, victor.purple);
            arrayList.add(victor);
        }
        boolean ivory = arVar.ivory();
        ab abVar = this.alpha;
        if (ivory) {
            this.bravo = true;
            ((t0) abVar.alpha).setValue(new Q0.m((4294967295L & i5) | (i4 << 32)));
        } else if (!this.bravo) {
            ((t0) abVar.alpha).setValue(new Q0.m((4294967295L & i5) | (i4 << 32)));
        }
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new U0.e(2, arrayList));
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        int romeo = ((InterfaceC2401t) list.get(0)).romeo(i4);
        int ivory = CollectionsKt.ivory(list);
        int i5 = 1;
        if (1 <= ivory) {
            while (true) {
                int romeo2 = ((InterfaceC2401t) list.get(i5)).romeo(i4);
                if (romeo2 > romeo) {
                    romeo = romeo2;
                }
                if (i5 == ivory) {
                    break;
                }
                i5++;
            }
        }
        return romeo;
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        int delta = ((InterfaceC2401t) list.get(0)).delta(i4);
        int ivory = CollectionsKt.ivory(list);
        int i5 = 1;
        if (1 <= ivory) {
            while (true) {
                int delta2 = ((InterfaceC2401t) list.get(i5)).delta(i4);
                if (delta2 > delta) {
                    delta = delta2;
                }
                if (i5 == ivory) {
                    break;
                }
                i5++;
            }
        }
        return delta;
    }
}
