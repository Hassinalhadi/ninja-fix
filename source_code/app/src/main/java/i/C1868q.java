package i;

import androidx.compose.foundation.lazy.layout.aa;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC1719b;
import java.util.List;
import kotlin.KotlinNothingValueException;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.AbstractC2369E;
import q0.C2368D;

/* renamed from: i.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1868q implements aa {
    public final int alpha;
    public final List bravo;
    public final boolean charlie;
    public final T.i delta;
    public final T.j echo;
    public final Q0.n foxtrot;
    public final int golf;
    public final long hotel;
    public final Object india;
    public final Object juliet;
    public final androidx.compose.foundation.lazy.layout.s kilo;
    public int lima;
    public final int mike;
    public final int november;
    public final int oscar;
    public boolean papa;
    public int quebec = RecyclerView.UNDEFINED_DURATION;
    public final int[] romeo;

    public C1868q(int i4, List list, boolean z2, T.i iVar, T.j jVar, Q0.n nVar, int i5, int i10, int i11, long j5, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.s sVar, long j6) {
        int i12;
        int i13;
        this.alpha = i4;
        this.bravo = list;
        this.charlie = z2;
        this.delta = iVar;
        this.echo = jVar;
        this.foxtrot = nVar;
        this.golf = i11;
        this.hotel = j5;
        this.india = obj;
        this.juliet = obj2;
        this.kilo = sVar;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC2367C abstractC2367C = (AbstractC2367C) list.get(i16);
            boolean z10 = this.charlie;
            if (z10) {
                i12 = abstractC2367C.purple;
            } else {
                i12 = abstractC2367C.alpha;
            }
            i14 += i12;
            if (!z10) {
                i13 = abstractC2367C.purple;
            } else {
                i13 = abstractC2367C.alpha;
            }
            i15 = Math.max(i15, i13);
        }
        this.mike = i14;
        int i17 = i14 + this.golf;
        this.november = i17 >= 0 ? i17 : 0;
        this.oscar = i15;
        this.romeo = new int[this.bravo.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int alpha() {
        return this.bravo.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int bravo() {
        return this.november;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int charlie() {
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final Object delta(int i4) {
        return ((AbstractC2367C) this.bravo.get(i4)).yankee();
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final boolean echo() {
        return this.charlie;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final void foxtrot() {
        this.papa = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int getIndex() {
        return this.alpha;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final Object getKey() {
        return this.india;
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final void golf(int i4, int i5, int i10) {
        kilo(i4, i5, i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final long hotel(int i4) {
        if (i4 == 0 && this.bravo.size() == 0) {
            if (this.charlie) {
                return (4294967295L & this.lima) | (0 << 32);
            }
            return (4294967295L & 0) | (this.lima << 32);
        }
        int[] iArr = this.romeo;
        return (4294967295L & iArr[r7 + 1]) | (iArr[i4 * 2] << 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.aa
    public final int india() {
        return 0;
    }

    public final void juliet(AbstractC2366B abstractC2366B) {
        if (this.quebec == Integer.MIN_VALUE) {
            AbstractC1719b.alpha("position() should be called first");
        }
        List list = this.bravo;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2367C abstractC2367C = (AbstractC2367C) list.get(i4);
            boolean z2 = this.charlie;
            if (z2) {
                int i5 = abstractC2367C.purple;
            } else {
                int i10 = abstractC2367C.alpha;
            }
            long hotel = hotel(i4);
            this.kilo.alpha(i4, this.india);
            long charlie = Q0.k.charlie(hotel, this.hotel);
            if (z2) {
                AbstractC2366B.november(abstractC2366B, abstractC2367C, charlie);
            } else {
                C2368D c2368d = AbstractC2369E.alpha;
                if (abstractC2366B.foxtrot() != Q0.n.alpha && abstractC2366B.golf() != 0) {
                    int golf = (abstractC2366B.golf() - abstractC2367C.alpha) - ((int) (charlie >> 32));
                    AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
                    abstractC2367C.silver(Q0.k.charlie((golf << 32) | (4294967295L & ((int) (charlie & 4294967295L))), abstractC2367C.teal), 0.0f, c2368d);
                } else {
                    AbstractC2366B.charlie(abstractC2366B, abstractC2367C);
                    abstractC2367C.silver(Q0.k.charlie(charlie, abstractC2367C.teal), 0.0f, c2368d);
                }
            }
        }
    }

    public final void kilo(int i4, int i5, int i10) {
        int i11;
        int i12;
        this.lima = i4;
        boolean z2 = this.charlie;
        if (z2) {
            i11 = i10;
        } else {
            i11 = i5;
        }
        this.quebec = i11;
        List list = this.bravo;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC2367C abstractC2367C = (AbstractC2367C) list.get(i13);
            int i14 = i13 * 2;
            int[] iArr = this.romeo;
            if (z2) {
                T.i iVar = this.delta;
                if (iVar != null) {
                    iArr[i14] = iVar.alpha(abstractC2367C.alpha, i5, this.foxtrot);
                    iArr[i14 + 1] = i4;
                    i12 = abstractC2367C.purple;
                } else {
                    AbstractC1719b.bravo("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
            } else {
                iArr[i14] = i4;
                int i15 = i14 + 1;
                T.j jVar = this.echo;
                if (jVar != null) {
                    iArr[i15] = jVar.alpha(abstractC2367C.purple, i10);
                    i12 = abstractC2367C.alpha;
                } else {
                    AbstractC1719b.bravo("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
            }
            i4 += i12;
        }
    }
}
