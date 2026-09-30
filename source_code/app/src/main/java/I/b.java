package I;

import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.au;
import androidx.compose.runtime.av;
import java.util.ArrayList;
import s6.AbstractC2777t5;

/* loaded from: classes3.dex */
public final class b {
    public final C0585q alpha;
    public a bravo;
    public boolean charlie;
    public int foxtrot;
    public int golf;
    public int lima;
    public final androidx.compose.runtime.al delta = new androidx.compose.runtime.al();
    public boolean echo = true;
    public final ArrayList hotel = new ArrayList();
    public int india = -1;
    public int juliet = -1;
    public int kilo = -1;

    public b(C0585q c0585q, a aVar) {
        this.alpha = c0585q;
        this.bravo = aVar;
    }

    public final void alpha(au auVar, AbstractC0587t abstractC0587t, av avVar, av avVar2) {
        a aVar = this.bravo;
        aVar.getClass();
        h hVar = h.delta;
        am amVar = aVar.alpha;
        amVar.foxtrot(hVar);
        int i4 = amVar.foxtrot - amVar.alpha[amVar.bravo - 1].charlie;
        Object[] objArr = amVar.echo;
        objArr[i4] = auVar;
        objArr[i4 + 1] = abstractC0587t;
        objArr[i4 + 3] = avVar2;
        objArr[i4 + 2] = avVar;
    }

    public final void bravo() {
        delta();
        ArrayList arrayList = this.hotel;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.golf++;
        }
    }

    public final void charlie() {
        int i4 = this.golf;
        if (i4 > 0) {
            a aVar = this.bravo;
            aVar.getClass();
            ah ahVar = ah.delta;
            am amVar = aVar.alpha;
            amVar.foxtrot(ahVar);
            amVar.charlie[amVar.delta - amVar.alpha[amVar.bravo - 1].bravo] = i4;
            this.golf = 0;
        }
        ArrayList arrayList = this.hotel;
        if (!arrayList.isEmpty()) {
            a aVar2 = this.bravo;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i5 = 0; i5 < size; i5++) {
                objArr[i5] = arrayList.get(i5);
            }
            aVar2.getClass();
            if (size != 0) {
                k kVar = k.delta;
                am amVar2 = aVar2.alpha;
                amVar2.foxtrot(kVar);
                AbstractC2777t5.bravo(amVar2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void delta() {
        int i4 = this.lima;
        if (i4 > 0) {
            int i5 = this.india;
            if (i5 >= 0) {
                charlie();
                a aVar = this.bravo;
                aVar.getClass();
                z zVar = z.delta;
                am amVar = aVar.alpha;
                amVar.foxtrot(zVar);
                int i10 = amVar.delta - amVar.alpha[amVar.bravo - 1].bravo;
                int[] iArr = amVar.charlie;
                iArr[i10] = i5;
                iArr[i10 + 1] = i4;
                this.india = -1;
            } else {
                int i11 = this.kilo;
                int i12 = this.juliet;
                charlie();
                a aVar2 = this.bravo;
                aVar2.getClass();
                v vVar = v.delta;
                am amVar2 = aVar2.alpha;
                amVar2.foxtrot(vVar);
                int i13 = amVar2.delta - amVar2.alpha[amVar2.bravo - 1].bravo;
                int[] iArr2 = amVar2.charlie;
                iArr2[i13 + 1] = i11;
                iArr2[i13] = i12;
                iArr2[i13 + 2] = i4;
                this.juliet = -1;
                this.kilo = -1;
            }
            this.lima = 0;
        }
    }

    public final void echo(boolean z2) {
        int i4;
        C0585q c0585q = this.alpha;
        if (z2) {
            i4 = c0585q.coral.india;
        } else {
            i4 = c0585q.coral.golf;
        }
        int i5 = i4 - this.foxtrot;
        if (i5 < 0) {
            androidx.compose.runtime.r.charlie("Tried to seek backward");
        }
        if (i5 > 0) {
            a aVar = this.bravo;
            aVar.getClass();
            d dVar = d.delta;
            am amVar = aVar.alpha;
            amVar.foxtrot(dVar);
            amVar.charlie[amVar.delta - amVar.alpha[amVar.bravo - 1].bravo] = i5;
            this.foxtrot = i4;
        }
    }

    public final void foxtrot(int i4, int i5) {
        boolean z2;
        if (i5 > 0) {
            if (i4 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                androidx.compose.runtime.r.charlie("Invalid remove index " + i4);
            }
            if (this.india == i4) {
                this.lima += i5;
                return;
            }
            delta();
            this.india = i4;
            this.lima = i5;
        }
    }
}
