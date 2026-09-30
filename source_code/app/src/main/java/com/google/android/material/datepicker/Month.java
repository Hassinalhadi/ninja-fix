package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new x(0);
    public final Calendar alpha;
    public final int purple;
    public final int red;
    public final int silver;
    public final int teal;
    public final long white;
    public String yellow;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar delta = ai.delta(calendar);
        this.alpha = delta;
        this.purple = delta.get(2);
        this.red = delta.get(1);
        this.silver = delta.getMaximum(7);
        this.teal = delta.getActualMaximum(5);
        this.white = delta.getTimeInMillis();
    }

    public static Month delta(int i4, int i5) {
        Calendar india = ai.india(null);
        india.set(1, i4);
        india.set(2, i5);
        return new Month(india);
    }

    public static Month echo(long j5) {
        Calendar india = ai.india(null);
        india.setTimeInMillis(j5);
        return new Month(india);
    }

    @Override // java.lang.Comparable
    /* renamed from: charlie, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.alpha.compareTo(month.alpha);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.purple == month.purple && this.red == month.red) {
            return true;
        }
        return false;
    }

    public final String foxtrot() {
        String formatDateTime;
        if (this.yellow == null) {
            long timeInMillis = this.alpha.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = Rf.a.kilo(ai.charlie("yMMMM", Locale.getDefault()), new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.yellow = formatDateTime;
        }
        return this.yellow;
    }

    public final int golf(Month month) {
        if (this.alpha instanceof GregorianCalendar) {
            return (month.purple - this.purple) + ((month.red - this.red) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.purple), Integer.valueOf(this.red)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.red);
        parcel.writeInt(this.purple);
    }
}
