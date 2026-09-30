package com.google.android.gms.common.api;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new m(2);
    public final int alpha;
    public final String purple;

    public Scope(int i4, String str) {
        x.foxtrot(str, "scopeUri must not be null or empty");
        this.alpha = i4;
        this.purple = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.purple.equals(((Scope) obj).purple);
    }

    public final int hashCode() {
        return this.purple.hashCode();
    }

    public final String toString() {
        return this.purple;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
