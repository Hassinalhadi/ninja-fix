package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import z1.e;

/* loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new e(1);
    public long alpha;
    public long purple;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long charlie() {
        return new Timer().purple - this.purple;
    }

    public final long delta(Timer timer) {
        return timer.purple - this.purple;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void echo() {
        this.alpha = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.purple = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.alpha);
        parcel.writeLong(this.purple);
    }

    public Timer(long j5, long j6) {
        this.alpha = j5;
        this.purple = j6;
    }
}
