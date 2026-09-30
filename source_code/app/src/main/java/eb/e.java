package eb;

import a0.C0366t;
import ao.ad;
import av.q;
import kotlin.p;

/* loaded from: classes2.dex */
public final class e {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final long delta;
    public final long echo;
    public final long foxtrot;
    public final long golf;
    public final long hotel;

    public e(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = j10;
        this.echo = j11;
        this.foxtrot = j12;
        this.golf = j13;
        this.hotel = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (C0366t.charlie(this.alpha, eVar.alpha) && C0366t.charlie(this.bravo, eVar.bravo) && C0366t.charlie(this.charlie, eVar.charlie) && C0366t.charlie(this.delta, eVar.delta) && C0366t.charlie(this.echo, eVar.echo) && C0366t.charlie(this.foxtrot, eVar.foxtrot) && C0366t.charlie(this.golf, eVar.golf) && C0366t.charlie(this.hotel, eVar.hotel)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return p.alpha(this.hotel) + ad.whiskey(ad.whiskey(ad.whiskey(ad.whiskey(ad.whiskey(ad.whiskey(p.alpha(this.alpha) * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo), 31, this.foxtrot), 31, this.golf);
    }

    public final String toString() {
        String india = C0366t.india(this.alpha);
        String india2 = C0366t.india(this.bravo);
        String india3 = C0366t.india(this.charlie);
        String india4 = C0366t.india(this.delta);
        String india5 = C0366t.india(this.echo);
        String india6 = C0366t.india(this.foxtrot);
        String india7 = C0366t.india(this.golf);
        String india8 = C0366t.india(this.hotel);
        StringBuilder india9 = q.india("OrderTasksCardColors(containerColor=", india, ", progressCountColor=", india2, ", progressCountSecondaryColor=");
        Q0.c.azure(india9, india3, ", progressLabelColor=", india4, ", timerValueColor=");
        Q0.c.azure(india9, india5, ", timerLabelColor=", india6, ", dividerColor=");
        return com.google.android.material.datepicker.j.lima(india9, india7, ", timerIconTint=", india8, ")");
    }
}
