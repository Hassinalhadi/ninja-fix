package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1460o {
    public final String alpha;
    public final String bravo;
    public final long charlie;
    public final long delta;
    public final long echo;
    public final long foxtrot;
    public final long golf;
    public final Long hotel;
    public final Long india;
    public final Long juliet;
    public final Boolean kilo;

    public C1460o(String str, String str2, long j5, long j6, long j7, long j10, long j11, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z2;
        boolean z10;
        boolean z11;
        V5.x.echo(str);
        V5.x.echo(str2);
        if (j5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.bravo(z2);
        if (j6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        V5.x.bravo(z10);
        if (j7 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        V5.x.bravo(z11);
        V5.x.bravo(j11 >= 0);
        this.alpha = str;
        this.bravo = str2;
        this.charlie = j5;
        this.delta = j6;
        this.echo = j7;
        this.foxtrot = j10;
        this.golf = j11;
        this.hotel = l10;
        this.india = l11;
        this.juliet = l12;
        this.kilo = bool;
    }

    public final C1460o alpha(Long l10, Long l11, Boolean bool) {
        return new C1460o(this.alpha, this.bravo, this.charlie, this.delta, this.echo, this.foxtrot, this.golf, this.hotel, l10, l11, bool);
    }

    public final C1460o bravo(long j5) {
        return new C1460o(this.alpha, this.bravo, this.charlie, this.delta, this.echo, j5, this.golf, this.hotel, this.india, this.juliet, this.kilo);
    }
}
