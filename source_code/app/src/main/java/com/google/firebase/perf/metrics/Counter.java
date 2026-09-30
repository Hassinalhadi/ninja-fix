package com.google.firebase.perf.metrics;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new b(27);
    public final String alpha;
    public final AtomicLong purple;

    public Counter(String str) {
        this.alpha = str;
        this.purple = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.alpha);
        parcel.writeLong(this.purple.get());
    }

    public Counter(Parcel parcel) {
        this.alpha = parcel.readString();
        this.purple = new AtomicLong(parcel.readLong());
    }
}
