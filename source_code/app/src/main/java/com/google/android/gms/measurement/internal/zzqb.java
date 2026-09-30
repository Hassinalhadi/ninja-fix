package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzqb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqb> CREATOR = new Y5.b(18);
    public final int alpha;
    public final String purple;
    public final long red;
    public final Long silver;
    public final String teal;
    public final String white;
    public final Double yellow;

    public zzqb(int i4, String str, long j5, Long l10, Float f5, String str2, String str3, Double d4) {
        this.alpha = i4;
        this.purple = str;
        this.red = j5;
        this.silver = l10;
        this.yellow = i4 == 1 ? f5 != null ? Double.valueOf(f5.doubleValue()) : null : d4;
        this.teal = str2;
        this.white = str3;
    }

    public final Object o() {
        Long l10 = this.silver;
        if (l10 != null) {
            return l10;
        }
        Double d4 = this.yellow;
        if (d4 != null) {
            return d4;
        }
        String str = this.teal;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Y5.b.alpha(this, parcel);
    }

    public zzqb(long j5, Object obj, String str, String str2) {
        V5.x.echo(str);
        this.alpha = 2;
        this.purple = str;
        this.red = j5;
        this.white = str2;
        if (obj == null) {
            this.silver = null;
            this.yellow = null;
            this.teal = null;
            return;
        }
        if (obj instanceof Long) {
            this.silver = (Long) obj;
            this.yellow = null;
            this.teal = null;
        } else if (obj instanceof String) {
            this.silver = null;
            this.yellow = null;
            this.teal = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.silver = null;
                this.yellow = (Double) obj;
                this.teal = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqb(c1 c1Var) {
        this(c1Var.delta, c1Var.echo, r4, c1Var.bravo);
        String str = c1Var.charlie;
    }
}
