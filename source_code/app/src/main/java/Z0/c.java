package Z0;

import a1.n;
import androidx.recyclerview.widget.RecyclerView;
import av.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c {
    public int bravo;
    public boolean charlie;
    public final d delta;
    public final int echo;
    public c foxtrot;
    public W0.f india;
    public HashSet alpha = null;
    public int golf = 0;
    public int hotel = RecyclerView.UNDEFINED_DURATION;

    public c(d dVar, int i4) {
        this.delta = dVar;
        this.echo = i4;
    }

    public final void alpha(c cVar, int i4) {
        bravo(cVar, i4, RecyclerView.UNDEFINED_DURATION, false);
    }

    public final boolean bravo(c cVar, int i4, int i5, boolean z2) {
        if (cVar == null) {
            juliet();
            return true;
        }
        if (!z2 && !india(cVar)) {
            return false;
        }
        this.foxtrot = cVar;
        if (cVar.alpha == null) {
            cVar.alpha = new HashSet();
        }
        HashSet hashSet = this.foxtrot.alpha;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.golf = i4;
        this.hotel = i5;
        return true;
    }

    public final void charlie(int i4, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.alpha;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                a1.h.bravo(((c) it.next()).delta, i4, arrayList, nVar);
            }
        }
    }

    public final int delta() {
        if (!this.charlie) {
            return 0;
        }
        return this.bravo;
    }

    public final int echo() {
        c cVar;
        if (this.delta.white == 8) {
            return 0;
        }
        int i4 = this.hotel;
        if (i4 != Integer.MIN_VALUE && (cVar = this.foxtrot) != null && cVar.delta.white == 8) {
            return i4;
        }
        return this.golf;
    }

    public final c foxtrot() {
        int i4 = this.echo;
        int mike = q.mike(i4);
        d dVar = this.delta;
        switch (mike) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.fuchsia;
            case 2:
                return dVar.gold;
            case 3:
                return dVar.cyan;
            case 4:
                return dVar.emerald;
            default:
                throw new AssertionError(Q0.c.black(i4));
        }
    }

    public final boolean golf() {
        HashSet hashSet = this.alpha;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).foxtrot().hotel()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hotel() {
        if (this.foxtrot != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean india(c cVar) {
        boolean z2;
        boolean z10;
        if (cVar != null) {
            int i4 = this.echo;
            d dVar = cVar.delta;
            int i5 = cVar.echo;
            if (i5 == i4) {
                if (i4 != 6 || (dVar.blue && this.delta.blue)) {
                    return true;
                }
            } else {
                switch (q.mike(i4)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        if (i5 != 2 && i5 != 4) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (dVar instanceof h) {
                            if (z2 || i5 == 8) {
                            }
                        } else {
                            return z2;
                        }
                        break;
                    case 2:
                    case 4:
                        if (i5 != 3 && i5 != 5) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (dVar instanceof h) {
                            if (z10 || i5 == 9) {
                            }
                        } else {
                            return z10;
                        }
                        break;
                    case 5:
                        if (i5 == 2 || i5 == 4) {
                        }
                        break;
                    case 6:
                        if (i5 == 6 || i5 == 8 || i5 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(Q0.c.black(i4));
                }
            }
        }
        return false;
    }

    public final void juliet() {
        HashSet hashSet;
        c cVar = this.foxtrot;
        if (cVar != null && (hashSet = cVar.alpha) != null) {
            hashSet.remove(this);
            if (this.foxtrot.alpha.size() == 0) {
                this.foxtrot.alpha = null;
            }
        }
        this.alpha = null;
        this.foxtrot = null;
        this.golf = 0;
        this.hotel = RecyclerView.UNDEFINED_DURATION;
        this.charlie = false;
        this.bravo = 0;
    }

    public final void kilo() {
        W0.f fVar = this.india;
        if (fVar == null) {
            this.india = new W0.f(1);
        } else {
            fVar.charlie();
        }
    }

    public final void lima(int i4) {
        this.bravo = i4;
        this.charlie = true;
    }

    public final String toString() {
        return this.delta.yellow + ":" + Q0.c.black(this.echo);
    }
}
