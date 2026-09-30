package cc;

import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.AddressNoteListItem;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f implements Xd.n {
    public final /* synthetic */ List alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Xd.m red;
    public final /* synthetic */ Function0 silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ float white;

    public f(List list, Function1 function1, Xd.m mVar, Function0 function0, boolean z2, float f5) {
        this.alpha = list;
        this.purple = function1;
        this.red = mVar;
        this.silver = function0;
        this.teal = z2;
        this.white = f5;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        boolean z2;
        T.s alpha;
        int i5;
        int i10;
        InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
        int intValue = ((Number) obj2).intValue();
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | intValue2;
        } else {
            i4 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((C0585q) interfaceC0581m).echo(intValue)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AddressNoteListItem addressNoteListItem = (AddressNoteListItem) this.alpha.get(intValue);
            c0585q.purple(128853679);
            T.p pVar = T.p.alpha;
            if (this.teal) {
                alpha = V.oscar(pVar, this.white);
            } else {
                alpha = androidx.compose.foundation.lazy.a.alpha(interfaceC1854c);
            }
            g.bravo(addressNoteListItem, this.purple, this.red, this.silver, alpha, c0585q, 0);
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
