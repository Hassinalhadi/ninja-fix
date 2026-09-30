package com.google.android.gms.maps;

import J2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import t6.AbstractC3043q;
import t6.C3;
import w6.c;

/* loaded from: classes2.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public Boolean f7468a;
    public StreetViewPanoramaCamera alpha;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7469b;

    /* renamed from: c, reason: collision with root package name */
    public StreetViewSource f7470c;
    public String purple;
    public LatLng red;
    public Integer silver;
    public Boolean teal;
    public Boolean white;
    public Boolean yellow;

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.purple, "PanoramaId");
        eVar.y(this.red, "Position");
        eVar.y(this.silver, "Radius");
        eVar.y(this.f7470c, "Source");
        eVar.y(this.alpha, "StreetViewPanoramaCamera");
        eVar.y(this.teal, "UserNavigationEnabled");
        eVar.y(this.white, "ZoomGesturesEnabled");
        eVar.y(this.yellow, "PanningGesturesEnabled");
        eVar.y(this.f7468a, "StreetNamesEnabled");
        eVar.y(this.f7469b, "UseViewLifecycleInFragment");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.india(parcel, 5, this.silver);
        byte bravo = C3.bravo(this.teal);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(bravo);
        byte bravo2 = C3.bravo(this.white);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(bravo2);
        byte bravo3 = C3.bravo(this.yellow);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(bravo3);
        byte bravo4 = C3.bravo(this.f7468a);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(bravo4);
        byte bravo5 = C3.bravo(this.f7469b);
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(bravo5);
        AbstractC3043q.kilo(parcel, 11, this.f7470c, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
