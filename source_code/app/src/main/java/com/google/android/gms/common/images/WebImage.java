package com.google.android.gms.common.images;

import V5.x;
import Y5.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new b(13);
    public final int alpha;
    public final Uri purple;
    public final int red;
    public final int silver;

    public WebImage(int i4, Uri uri, int i5, int i10) {
        this.alpha = i4;
        this.purple = uri;
        this.red = i5;
        this.silver = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (x.lima(this.purple, webImage.purple) && this.red == webImage.red && this.silver == webImage.silver) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.purple, Integer.valueOf(this.red), Integer.valueOf(this.silver)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.red + "x" + this.silver + " " + this.purple.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
