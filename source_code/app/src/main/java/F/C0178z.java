package F;

import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.AbstractC2384c;
import q0.C2396o;
import q0.InterfaceC2402u;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0178z implements q0.ap {
    public final /* synthetic */ S1 alpha;
    public final /* synthetic */ InterfaceC0539e bravo;
    public final /* synthetic */ InterfaceC0541g charlie;
    public final /* synthetic */ int delta;

    public C0178z(S1 s12, InterfaceC0539e interfaceC0539e, InterfaceC0541g interfaceC0541g, int i4) {
        this.alpha = s12;
        this.bravo = interfaceC0539e;
        this.charlie = interfaceC0541g;
        this.delta = i4;
    }

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        int hotel;
        int i4;
        int golf;
        int size = list.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            q0.ao aoVar = (q0.ao) list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar), "navigationIcon")) {
                AbstractC2367C victor = aoVar.victor(Q0.a.alpha(j5, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    q0.ao aoVar2 = (q0.ao) list.get(i11);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar2), "actionIcons")) {
                        AbstractC2367C victor2 = aoVar2.victor(Q0.a.alpha(j5, 0, 0, 0, 0, 14));
                        if (Q0.a.hotel(j5) == Integer.MAX_VALUE) {
                            hotel = Q0.a.hotel(j5);
                        } else {
                            hotel = (Q0.a.hotel(j5) - victor.alpha) - victor2.alpha;
                            if (hotel < 0) {
                                hotel = 0;
                            }
                        }
                        int i12 = hotel;
                        int size3 = list.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            q0.ao aoVar3 = (q0.ao) list.get(i13);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar3), Constants.KEY_TITLE)) {
                                AbstractC2367C victor3 = aoVar3.victor(Q0.a.alpha(j5, 0, i12, 0, 0, 12));
                                C2396o c2396o = AbstractC2384c.bravo;
                                if (victor3.magenta(c2396o) != Integer.MIN_VALUE) {
                                    i4 = victor3.magenta(c2396o);
                                } else {
                                    i4 = 0;
                                }
                                float alpha = this.alpha.alpha();
                                if (!Float.isNaN(alpha)) {
                                    i5 = Zd.a.delta(alpha);
                                }
                                if (Q0.a.golf(j5) == Integer.MAX_VALUE) {
                                    golf = Q0.a.golf(j5);
                                } else {
                                    golf = Q0.a.golf(j5) + i5;
                                }
                                int i14 = golf;
                                return arVar.papa(Q0.a.hotel(j5), i14, kotlin.collections.t.alpha, new C0175y(victor, i14, victor3, this.bravo, j5, victor2, arVar, this.charlie, this.delta, i4));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q0.ap
    public final /* synthetic */ int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }
}
