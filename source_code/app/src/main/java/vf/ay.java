package vf;

/* loaded from: classes2.dex */
public abstract class ay extends AbstractC3220y {
    public static final /* synthetic */ int teal = 0;
    public long purple;
    public boolean red;
    public kotlin.collections.l silver;

    @Override // vf.AbstractC3220y
    public final AbstractC3220y jade(int i4) {
        Af.f.alpha(i4);
        return this;
    }

    public final void magenta(boolean z2) {
        long j5;
        long j6 = this.purple;
        if (z2) {
            j5 = 4294967296L;
        } else {
            j5 = 1;
        }
        long j7 = j6 - j5;
        this.purple = j7;
        if (j7 <= 0 && this.red) {
            shutdown();
        }
    }

    public final void navy(al alVar) {
        kotlin.collections.l lVar = this.silver;
        if (lVar == null) {
            lVar = new kotlin.collections.l();
            this.silver = lVar;
        }
        lVar.addLast(alVar);
    }

    public abstract Thread olive();

    public final void peach(boolean z2) {
        long j5;
        long j6 = this.purple;
        if (z2) {
            j5 = 4294967296L;
        } else {
            j5 = 1;
        }
        this.purple = j5 + j6;
        if (!z2) {
            this.red = true;
        }
    }

    public abstract long pink();

    public final boolean purple() {
        Object removeFirst;
        kotlin.collections.l lVar = this.silver;
        if (lVar != null) {
            if (lVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = lVar.removeFirst();
            }
            al alVar = (al) removeFirst;
            if (alVar == null) {
                return false;
            }
            alVar.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();

    public void silver(long j5, av avVar) {
        ae.f13993b.l(j5, avVar);
    }
}
