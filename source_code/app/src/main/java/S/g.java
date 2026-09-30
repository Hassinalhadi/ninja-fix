package S;

import Lb.am;
import id.C1915c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class g {
    public l alpha;
    public long bravo;
    public boolean charlie;
    public int delta;

    public g(long j5, l lVar) {
        int i4;
        int numberOfTrailingZeros;
        this.alpha = lVar;
        this.bravo = j5;
        am amVar = n.alpha;
        if (j5 != 0) {
            l delta = delta();
            long[] jArr = delta.silver;
            if (jArr != null) {
                j5 = jArr[0];
            } else {
                long j6 = delta.purple;
                long j7 = delta.red;
                if (j6 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                } else {
                    long j10 = delta.alpha;
                    if (j10 != 0) {
                        j7 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                j5 = numberOfTrailingZeros + j7;
            }
            synchronized (n.charlie) {
                i4 = n.foxtrot.alpha(j5);
            }
        } else {
            i4 = -1;
        }
        this.delta = i4;
    }

    public static void quebec(g gVar) {
        n.bravo.yankee(gVar);
    }

    public final void alpha() {
        synchronized (n.charlie) {
            bravo();
            papa();
        }
    }

    public void bravo() {
        n.delta = n.delta.bravo(golf());
    }

    public abstract void charlie();

    public l delta() {
        return this.alpha;
    }

    public abstract Function1 echo();

    public abstract boolean foxtrot();

    public long golf() {
        return this.bravo;
    }

    public int hotel() {
        return 0;
    }

    public abstract Function1 india();

    public final g juliet() {
        C1915c c1915c = n.bravo;
        g gVar = (g) c1915c.mike();
        c1915c.yankee(this);
        return gVar;
    }

    public abstract void kilo();

    public abstract void lima();

    public abstract void mike();

    public abstract void november(ac acVar);

    public final void oscar() {
        int i4 = this.delta;
        if (i4 >= 0) {
            n.victor(i4);
            this.delta = -1;
        }
    }

    public void papa() {
        oscar();
    }

    public void romeo(l lVar) {
        this.alpha = lVar;
    }

    public void sierra(long j5) {
        this.bravo = j5;
    }

    public void tango(int i4) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g uniform(Function1 function1);
}
