package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Object();
    public final Month alpha;
    public final Month purple;
    public final DateValidator red;
    public Month silver;
    public final int teal;
    public final int white;
    public final int yellow;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean white(long j5);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i4) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.alpha = month;
        this.purple = month2;
        this.silver = month3;
        this.teal = i4;
        this.red = dateValidator;
        if (month3 != null && month.alpha.compareTo(month3.alpha) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.alpha.compareTo(month2.alpha) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i4 >= 0 && i4 <= ai.india(null).getMaximum(7)) {
            this.yellow = month.golf(month2) + 1;
            this.white = (month2.red - month.red) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.alpha.equals(calendarConstraints.alpha) && this.purple.equals(calendarConstraints.purple) && Objects.equals(this.silver, calendarConstraints.silver) && this.teal == calendarConstraints.teal && this.red.equals(calendarConstraints.red)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.purple, this.silver, Integer.valueOf(this.teal), this.red});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.alpha, 0);
        parcel.writeParcelable(this.purple, 0);
        parcel.writeParcelable(this.silver, 0);
        parcel.writeParcelable(this.red, 0);
        parcel.writeInt(this.teal);
    }
}
