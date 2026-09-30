package q0;

import kotlin.jvm.functions.Function1;
import s6.J4;

/* renamed from: q0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2367C {
    public int alpha;
    public int purple;
    public long red;
    public long silver = AbstractC2369E.bravo;
    public long teal = 0;

    public AbstractC2367C() {
        long j5 = 0;
        this.red = (j5 & 4294967295L) | (j5 << 32);
    }

    public final void a(long j5) {
        if (!Q0.a.bravo(this.silver, j5)) {
            this.silver = j5;
            peach();
        }
    }

    public abstract int magenta(C2396o c2396o);

    public int maroon() {
        return (int) (this.red & 4294967295L);
    }

    public int navy() {
        return (int) (this.red >> 32);
    }

    public final void peach() {
        this.alpha = J4.delta((int) (this.red >> 32), Q0.a.juliet(this.silver), Q0.a.hotel(this.silver));
        this.purple = J4.delta((int) (this.red & 4294967295L), Q0.a.india(this.silver), Q0.a.golf(this.silver));
        int i4 = this.alpha;
        long j5 = this.red;
        this.teal = (((i4 - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    public abstract void silver(long j5, float f5, Function1 function1);

    public /* synthetic */ Object yankee() {
        return null;
    }

    public final void yellow(long j5) {
        if (!Q0.m.alpha(this.red, j5)) {
            this.red = j5;
            peach();
        }
    }
}
