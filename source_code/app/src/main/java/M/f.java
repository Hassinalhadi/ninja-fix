package M;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import s6.AbstractC2725n6;

/* loaded from: classes3.dex */
public class f extends d {
    public final e silver;
    public Object teal;
    public boolean white;
    public int yellow;

    public f(e eVar, n[] nVarArr) {
        super(eVar.red, nVarArr);
        this.silver = eVar;
        this.yellow = eVar.teal;
    }

    public final void charlie(int i4, m mVar, Object obj, int i5) {
        int i10 = i5 * 5;
        n[] nVarArr = this.alpha;
        if (i10 > 30) {
            n nVar = nVarArr[i5];
            Object[] objArr = mVar.delta;
            nVar.alpha(objArr.length, objArr, 0);
            while (true) {
                n nVar2 = nVarArr[i5];
                if (!Intrinsics.areEqual(nVar2.alpha[nVar2.red], obj)) {
                    nVarArr[i5].red += 2;
                } else {
                    this.purple = i5;
                    return;
                }
            }
        } else {
            int delta = 1 << AbstractC2725n6.delta(i4, i10);
            if (mVar.hotel(delta)) {
                nVarArr[i5].alpha(Integer.bitCount(mVar.alpha) * 2, mVar.delta, mVar.foxtrot(delta));
                this.purple = i5;
                return;
            }
            int tango = mVar.tango(delta);
            m sierra = mVar.sierra(tango);
            nVarArr[i5].alpha(Integer.bitCount(mVar.alpha) * 2, mVar.delta, tango);
            charlie(i4, sierra, obj, i5 + 1);
        }
    }

    @Override // M.d, java.util.Iterator
    public final Object next() {
        if (this.silver.teal == this.yellow) {
            if (this.red) {
                n nVar = this.alpha[this.purple];
                this.teal = nVar.alpha[nVar.red];
                this.white = true;
                return super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // M.d, java.util.Iterator
    public final void remove() {
        int i4;
        if (this.white) {
            boolean z2 = this.red;
            e eVar = this.silver;
            if (z2) {
                if (z2) {
                    n nVar = this.alpha[this.purple];
                    Object obj = nVar.alpha[nVar.red];
                    x.charlie(eVar).remove(this.teal);
                    if (obj != null) {
                        i4 = obj.hashCode();
                    } else {
                        i4 = 0;
                    }
                    charlie(i4, eVar.red, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                x.charlie(eVar).remove(this.teal);
            }
            this.teal = null;
            this.white = false;
            this.yellow = eVar.teal;
            return;
        }
        throw new IllegalStateException();
    }
}
