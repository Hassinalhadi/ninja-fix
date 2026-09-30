package z;

import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3449c {
    public final ax alpha;
    public final ax bravo;
    public final ax charlie;
    public final ax delta;
    public final ax echo;
    public final ax foxtrot;
    public final ax golf;
    public final ax hotel;
    public final ax india;
    public final ax juliet;
    public final ax kilo;
    public final ax lima;
    public final ax mike;

    public C3449c(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        C0366t c0366t = new C0366t(j5);
        as asVar = as.white;
        this.alpha = C0564b.yankee(c0366t, asVar);
        this.bravo = C0564b.yankee(new C0366t(j6), asVar);
        this.charlie = C0564b.yankee(new C0366t(j7), asVar);
        this.delta = C0564b.yankee(new C0366t(j10), asVar);
        this.echo = C0564b.yankee(new C0366t(j11), asVar);
        this.foxtrot = C0564b.yankee(new C0366t(j12), asVar);
        this.golf = C0564b.yankee(new C0366t(j13), asVar);
        this.hotel = C0564b.yankee(new C0366t(j14), asVar);
        this.india = C0564b.yankee(new C0366t(j15), asVar);
        this.juliet = C0564b.yankee(new C0366t(j16), asVar);
        this.kilo = C0564b.yankee(new C0366t(j17), asVar);
        this.lima = C0564b.yankee(new C0366t(j18), asVar);
        this.mike = C0564b.yankee(Boolean.TRUE, asVar);
    }

    public final long alpha() {
        return ((C0366t) ((t0) this.kilo).getValue()).alpha;
    }

    public final long bravo() {
        return ((C0366t) ((t0) this.alpha).getValue()).alpha;
    }

    public final long charlie() {
        return ((C0366t) ((t0) this.foxtrot).getValue()).alpha;
    }

    public final boolean delta() {
        return ((Boolean) ((t0) this.mike).getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        sb2.append((Object) C0366t.india(bravo()));
        sb2.append(", primaryVariant=");
        ao.ad.bronze(((C0366t) ((t0) this.bravo).getValue()).alpha, ", secondary=", sb2);
        ao.ad.bronze(((C0366t) ((t0) this.charlie).getValue()).alpha, ", secondaryVariant=", sb2);
        ao.ad.bronze(((C0366t) ((t0) this.delta).getValue()).alpha, ", background=", sb2);
        sb2.append((Object) C0366t.india(((C0366t) ((t0) this.echo).getValue()).alpha));
        sb2.append(", surface=");
        sb2.append((Object) C0366t.india(charlie()));
        sb2.append(", error=");
        ao.ad.bronze(((C0366t) ((t0) this.golf).getValue()).alpha, ", onPrimary=", sb2);
        ao.ad.bronze(((C0366t) ((t0) this.hotel).getValue()).alpha, ", onSecondary=", sb2);
        ao.ad.bronze(((C0366t) ((t0) this.india).getValue()).alpha, ", onBackground=", sb2);
        sb2.append((Object) C0366t.india(((C0366t) ((t0) this.juliet).getValue()).alpha));
        sb2.append(", onSurface=");
        sb2.append((Object) C0366t.india(alpha()));
        sb2.append(", onError=");
        sb2.append((Object) C0366t.india(((C0366t) ((t0) this.lima).getValue()).alpha));
        sb2.append(", isLight=");
        sb2.append(delta());
        sb2.append(')');
        return sb2.toString();
    }
}
