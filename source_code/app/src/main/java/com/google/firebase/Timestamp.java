package com.google.firebase;

import A0.z;
import B7.k;
import B7.l;
import Q0.c;
import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2769s6;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Object();
    public final long alpha;
    public final int purple;

    public Timestamp(long j5, int i4) {
        if (i4 >= 0 && i4 < 1000000000) {
            if (-62135596800L <= j5 && j5 < 253402300800L) {
                this.alpha = j5;
                this.purple = i4;
                return;
            }
            throw new IllegalArgumentException(z.india(j5, "Timestamp seconds out of range: ").toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "Timestamp nanoseconds out of range: ").toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Timestamp timestamp) {
        Timestamp other = timestamp;
        Intrinsics.echo(other, "other");
        Function1[] function1Arr = {k.purple, l.purple};
        for (int i4 = 0; i4 < 2; i4++) {
            Function1 function1 = function1Arr[i4];
            int bravo = AbstractC2769s6.bravo((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (bravo != 0) {
                return bravo;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i4;
        if (obj != this) {
            if (obj instanceof Timestamp) {
                Timestamp other = (Timestamp) obj;
                Intrinsics.echo(other, "other");
                Function1[] function1Arr = {k.purple, l.purple};
                int i5 = 0;
                while (true) {
                    if (i5 < 2) {
                        Function1 function1 = function1Arr[i5];
                        i4 = AbstractC2769s6.bravo((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
                        if (i4 != 0) {
                            break;
                        }
                        i5++;
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                if (i4 == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (((((int) j5) * 1369) + ((int) (j5 >> 32))) * 37) + this.purple;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.alpha);
        sb2.append(", nanoseconds=");
        return c.quebec(sb2, this.purple, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        Intrinsics.echo(dest, "dest");
        dest.writeLong(this.alpha);
        dest.writeInt(this.purple);
    }
}
