package j;

import androidx.compose.foundation.lazy.layout.aa;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC1719b;
import java.util.List;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class m implements aa {
    public final int alpha;
    public final Object bravo;
    public final int charlie;
    public final Q0.n delta;
    public final List echo;
    public final long foxtrot;
    public final Object golf;
    public final androidx.compose.foundation.lazy.layout.s hotel;
    public final int india;
    public final int juliet;
    public final int kilo;
    public final int lima;
    public int mike = RecyclerView.UNDEFINED_DURATION;
    public final long november;
    public long oscar;
    public int papa;
    public int quebec;
    public boolean romeo;

    public m(int i4, Object obj, int i5, int i10, Q0.n nVar, int i11, int i12, List list, long j5, Object obj2, androidx.compose.foundation.lazy.layout.s sVar, long j6, int i13, int i14) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = i5;
        this.delta = nVar;
        this.echo = list;
        this.foxtrot = j5;
        this.golf = obj2;
        this.hotel = sVar;
        this.india = i13;
        this.juliet = i14;
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i15 = Math.max(i15, ((AbstractC2367C) list.get(i16)).purple);
        }
        this.kilo = i15;
        int i17 = i10 + i15;
        this.lima = i17 >= 0 ? i17 : 0;
        this.november = (this.charlie << 32) | (i15 & 4294967295L);
        this.oscar = 0L;
        this.papa = -1;
        this.quebec = -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int alpha() {
        return this.echo.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int bravo() {
        return this.lima;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int charlie() {
        return this.juliet;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final Object delta(int i4) {
        return ((AbstractC2367C) this.echo.get(i4)).yankee();
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final boolean echo() {
        return true;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final void foxtrot() {
        this.romeo = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int getIndex() {
        return this.alpha;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final Object getKey() {
        return this.bravo;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final void golf(int i4, int i5, int i10) {
        kilo(i4, 0, i5, i10, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final long hotel(int i4) {
        return this.oscar;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int india() {
        return this.india;
    }

    public final void juliet(AbstractC2366B abstractC2366B) {
        if (this.mike == Integer.MIN_VALUE) {
            AbstractC1719b.alpha("position() should be called first");
        }
        List list = this.echo;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2367C abstractC2367C = (AbstractC2367C) list.get(i4);
            int i5 = abstractC2367C.purple;
            long j5 = this.oscar;
            this.hotel.alpha(i4, this.bravo);
            AbstractC2366B.november(abstractC2366B, abstractC2367C, Q0.k.charlie(j5, this.foxtrot));
        }
    }

    public final void kilo(int i4, int i5, int i10, int i11, int i12, int i13) {
        this.mike = i11;
        if (this.delta == Q0.n.purple) {
            i5 = (i10 - i5) - this.charlie;
        }
        this.oscar = (i5 << 32) | (i4 & 4294967295L);
        this.papa = i12;
        this.quebec = i13;
    }
}
