package a2;

import Y1.aj;
import Y1.as;
import Y1.at;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@as("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La2/h;", "LY1/at;", "La2/g;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0383h extends at {
    public final ax charlie = C0564b.zulu(Boolean.FALSE);

    @Override // Y1.at
    public final Y1.aa alpha() {
        return new C0382g(this, AbstractC0377b.alpha);
    }

    @Override // Y1.at
    public final void delta(List list, aj ajVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bravo().india((Y1.l) it.next());
        }
        ((t0) this.charlie).setValue(Boolean.FALSE);
    }

    @Override // Y1.at
    public final void india(Y1.l lVar, boolean z2) {
        bravo().foxtrot(lVar, z2);
        ((t0) this.charlie).setValue(Boolean.TRUE);
    }
}
