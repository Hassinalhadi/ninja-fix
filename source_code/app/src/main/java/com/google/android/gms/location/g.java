package com.google.android.gms.location;

import V5.x;
import android.os.WorkSource;
import com.airbnb.lottie.compose.LottieConstants;

/* loaded from: classes2.dex */
public final class g {
    public int alpha;
    public final long bravo;
    public long charlie;
    public long delta;
    public long echo;
    public int foxtrot;
    public float golf;
    public boolean hotel;
    public long india;
    public int juliet;
    public int kilo;
    public boolean lima;
    public WorkSource mike;

    public g(int i4, long j5) {
        this(j5);
        n.alpha(i4);
        this.alpha = i4;
    }

    public final LocationRequest alpha() {
        int i4 = this.alpha;
        long j5 = this.bravo;
        long j6 = this.charlie;
        if (j6 == -1) {
            j6 = j5;
        } else if (i4 != 105) {
            j6 = Math.min(j6, j5);
        }
        long max = Math.max(this.delta, this.bravo);
        long j7 = this.echo;
        int i5 = this.foxtrot;
        float f5 = this.golf;
        boolean z2 = this.hotel;
        long j10 = this.india;
        if (j10 == -1) {
            j10 = this.bravo;
        }
        return new LocationRequest(i4, j5, j6, max, Long.MAX_VALUE, j7, i5, f5, z2, j10, this.juliet, this.kilo, this.lima, new WorkSource(this.mike), null);
    }

    public final void bravo(int i4) {
        int i5;
        boolean z2;
        if (i4 != 0 && i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = i4;
                z2 = false;
                x.charlie(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i5));
                this.juliet = i4;
            }
        } else {
            i5 = i4;
        }
        z2 = true;
        x.charlie(z2, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i5));
        this.juliet = i4;
    }

    public final void charlie(long j5) {
        boolean z2 = true;
        if (j5 != -1 && j5 < 0) {
            z2 = false;
        }
        x.alpha("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z2);
        this.india = j5;
    }

    public final void delta(long j5) {
        boolean z2 = true;
        if (j5 != -1 && j5 < 0) {
            z2 = false;
        }
        x.alpha("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z2);
        this.charlie = j5;
    }

    public g(long j5) {
        this.alpha = 102;
        this.charlie = -1L;
        this.delta = 0L;
        this.echo = Long.MAX_VALUE;
        this.foxtrot = LottieConstants.IterateForever;
        this.golf = 0.0f;
        this.hotel = true;
        this.india = -1L;
        this.juliet = 0;
        this.kilo = 0;
        this.lima = false;
        this.mike = null;
        x.alpha("intervalMillis must be greater than or equal to 0", j5 >= 0);
        this.bravo = j5;
    }
}
