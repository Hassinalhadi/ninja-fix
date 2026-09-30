package com.google.android.gms.maps.model;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new c(15);
    public final int alpha;
    public final Float purple;

    public PatternItem(int i4, Float f5) {
        boolean z2 = true;
        if (i4 != 1 && (f5 == null || f5.floatValue() < 0.0f)) {
            z2 = false;
        }
        x.alpha("Invalid PatternItem: type=" + i4 + " length=" + f5, z2);
        this.alpha = i4;
        this.purple = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.alpha == patternItem.alpha && x.lima(this.purple, patternItem.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), this.purple});
    }

    public String toString() {
        return "[PatternItem: type=" + this.alpha + " length=" + this.purple + Constants.AES_SUFFIX;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.echo(parcel, 3, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
