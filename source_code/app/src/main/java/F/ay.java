package F;

import a0.C0366t;

/* loaded from: classes3.dex */
public final class ay {
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

    public ay(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        if (C0366t.charlie(this.alpha, ayVar.alpha) && C0366t.charlie(this.bravo, ayVar.bravo) && C0366t.charlie(this.charlie, ayVar.charlie) && C0366t.charlie(this.delta, ayVar.delta) && C0366t.charlie(this.echo, ayVar.echo) && C0366t.charlie(this.foxtrot, ayVar.foxtrot) && C0366t.charlie(this.golf, ayVar.golf) && C0366t.charlie(this.hotel, ayVar.hotel) && C0366t.charlie(this.india, ayVar.india) && C0366t.charlie(this.juliet, ayVar.juliet) && C0366t.charlie(this.kilo, ayVar.kilo) && C0366t.charlie(this.lima, ayVar.lima)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return kotlin.p.alpha(this.lima) + ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(ao.ad.whiskey(kotlin.p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo), 31, this.foxtrot), 31, this.golf), 31, this.hotel), 31, this.india), 31, this.juliet), 31, this.kilo);
    }
}
