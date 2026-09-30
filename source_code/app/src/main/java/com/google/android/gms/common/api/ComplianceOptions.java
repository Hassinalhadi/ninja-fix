package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new m(1);
    public final int alpha;
    public final int purple;
    public final int red;
    public final boolean silver;

    public ComplianceOptions(int i4, int i5, int i10, boolean z2) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        if (this.alpha != complianceOptions.alpha || this.purple != complianceOptions.purple || this.red != complianceOptions.red || this.silver != complianceOptions.silver) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple), Integer.valueOf(this.red), Boolean.valueOf(this.silver)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComplianceOptions{callerProductId=");
        sb2.append(this.alpha);
        sb2.append(", dataOwnerProductId=");
        sb2.append(this.purple);
        sb2.append(", processingReason=");
        sb2.append(this.red);
        sb2.append(", isUserData=");
        return Q0.c.romeo(sb2, this.silver, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
