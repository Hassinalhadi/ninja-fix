package F;

import a0.C0366t;

/* loaded from: classes3.dex */
public final class T1 {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final long echo;
    public final long foxtrot;
    public final long golf;
    public final long hotel;
    public final long india;
    public final long juliet;
    public final long kilo;
    public final long lima;
    public final long mike;

    public T1(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = j11;
        this.foxtrot = j12;
        this.golf = j13;
        this.hotel = j14;
        this.india = j15;
        this.juliet = j16;
        this.kilo = j17;
        this.lima = j18;
        this.mike = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T1)) {
            return false;
        }
        T1 t12 = (T1) obj;
        if (C0366t.charlie(this.alpha, t12.alpha) && C0366t.charlie(this.bravo, t12.bravo) && C0366t.charlie(this.charlie, t12.charlie) && C0366t.charlie(this.delta, t12.delta) && C0366t.charlie(this.echo, t12.echo) && C0366t.charlie(this.foxtrot, t12.foxtrot) && C0366t.charlie(this.golf, t12.golf) && C0366t.charlie(this.hotel, t12.hotel) && C0366t.charlie(this.india, t12.india) && C0366t.charlie(this.juliet, t12.juliet) && C0366t.charlie(this.kilo, t12.kilo) && C0366t.charlie(this.lima, t12.lima) && C0366t.charlie(this.mike, t12.mike)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.mike) + ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo), 31, this.foxtrot), 31, this.golf), 31, this.hotel), 31, this.india), 31, this.juliet), 31, this.kilo), 31, this.lima);
    }
}
