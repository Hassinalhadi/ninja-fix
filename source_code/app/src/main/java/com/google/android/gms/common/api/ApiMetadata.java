package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = m.bravo;
    public static final ApiMetadata purple = new ApiMetadata(null);
    public final ComplianceOptions alpha;

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.alpha = complianceOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        return Objects.equals(this.alpha, ((ApiMetadata) obj).alpha);
    }

    public final int hashCode() {
        return Objects.hashCode(this.alpha);
    }

    public final String toString() {
        return ad.gray("ApiMetadata(complianceOptions=", String.valueOf(this.alpha), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(-204102970);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
