package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final g alpha;
    public final ArrayList purple;
    public static final d red = new Object();
    public static final e silver = new Object();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Object();

    public CompositeDateValidator(ArrayList arrayList, g gVar) {
        this.purple = arrayList;
        this.alpha = gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CompositeDateValidator) {
                CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
                if (this.purple.equals(compositeDateValidator.purple) && this.alpha.getId() == compositeDateValidator.alpha.getId()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.purple.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean white(long j5) {
        return this.alpha.alpha(this.purple, j5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeList(this.purple);
        parcel.writeInt(this.alpha.getId());
    }
}
