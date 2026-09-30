package com.google.android.gms.maps;

import J2.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import t6.AbstractC3043q;
import t6.C3;
import w6.b;
import x6.o;

/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new b(1);

    /* renamed from: n, reason: collision with root package name */
    public static final Integer f7455n = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* renamed from: a, reason: collision with root package name */
    public Boolean f7456a;
    public Boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7457b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f7458c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f7459d;
    public Boolean e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f7460f;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f7464j;

    /* renamed from: m, reason: collision with root package name */
    public int f7467m;
    public Boolean purple;
    public CameraPosition silver;
    public Boolean teal;
    public Boolean white;
    public Boolean yellow;
    public int red = -1;

    /* renamed from: g, reason: collision with root package name */
    public Float f7461g = null;

    /* renamed from: h, reason: collision with root package name */
    public Float f7462h = null;

    /* renamed from: i, reason: collision with root package name */
    public LatLngBounds f7463i = null;

    /* renamed from: k, reason: collision with root package name */
    public Integer f7465k = null;

    /* renamed from: l, reason: collision with root package name */
    public String f7466l = null;

    public static GoogleMapOptions o(Context context, AttributeSet attributeSet) {
        Float f5;
        Float f10;
        Float f11;
        Float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = o.alpha;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.red = obtainAttributes.getInt(16, -1);
        }
        if (obtainAttributes.hasValue(26)) {
            googleMapOptions.alpha = Boolean.valueOf(obtainAttributes.getBoolean(26, false));
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.purple = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.white = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.f7458c = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.f7464j = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.yellow = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.f7457b = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.f7456a = Boolean.valueOf(obtainAttributes.getBoolean(24, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.teal = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.f7459d = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.e = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.f7460f = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.f7461g = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.f7462h = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.f7465k = Integer.valueOf(obtainAttributes.getColor(1, f7455n.intValue()));
        }
        if (obtainAttributes.hasValue(15) && (string = obtainAttributes.getString(15)) != null && !string.isEmpty()) {
            googleMapOptions.f7466l = string;
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.f7467m = obtainAttributes.getInt(14, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        float f17 = 0.0f;
        if (obtainAttributes2.hasValue(11)) {
            f5 = Float.valueOf(obtainAttributes2.getFloat(11, 0.0f));
        } else {
            f5 = null;
        }
        if (obtainAttributes2.hasValue(12)) {
            f10 = Float.valueOf(obtainAttributes2.getFloat(12, 0.0f));
        } else {
            f10 = null;
        }
        if (obtainAttributes2.hasValue(9)) {
            f11 = Float.valueOf(obtainAttributes2.getFloat(9, 0.0f));
        } else {
            f11 = null;
        }
        if (obtainAttributes2.hasValue(10)) {
            f12 = Float.valueOf(obtainAttributes2.getFloat(10, 0.0f));
        } else {
            f12 = null;
        }
        obtainAttributes2.recycle();
        if (f5 != null && f10 != null && f11 != null && f12 != null) {
            latLngBounds = new LatLngBounds(new LatLng(f5.floatValue(), f10.floatValue()), new LatLng(f11.floatValue(), f12.floatValue()));
        }
        googleMapOptions.f7463i = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        if (obtainAttributes3.hasValue(5)) {
            f13 = obtainAttributes3.getFloat(5, 0.0f);
        } else {
            f13 = 0.0f;
        }
        if (obtainAttributes3.hasValue(6)) {
            f14 = obtainAttributes3.getFloat(6, 0.0f);
        } else {
            f14 = 0.0f;
        }
        LatLng latLng = new LatLng(f13, f14);
        if (obtainAttributes3.hasValue(8)) {
            f15 = obtainAttributes3.getFloat(8, 0.0f);
        } else {
            f15 = 0.0f;
        }
        if (obtainAttributes3.hasValue(2)) {
            f16 = obtainAttributes3.getFloat(2, 0.0f);
        } else {
            f16 = 0.0f;
        }
        if (obtainAttributes3.hasValue(7)) {
            f17 = obtainAttributes3.getFloat(7, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.silver = new CameraPosition(latLng, f15, f17, f16);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(Integer.valueOf(this.red), "MapType");
        eVar.y(this.f7459d, "LiteMode");
        eVar.y(this.silver, "Camera");
        eVar.y(this.white, "CompassEnabled");
        eVar.y(this.teal, "ZoomControlsEnabled");
        eVar.y(this.yellow, "ScrollGesturesEnabled");
        eVar.y(this.f7456a, "ZoomGesturesEnabled");
        eVar.y(this.f7457b, "TiltGesturesEnabled");
        eVar.y(this.f7458c, "RotateGesturesEnabled");
        eVar.y(this.f7464j, "ScrollGesturesEnabledDuringRotateOrZoom");
        eVar.y(this.e, "MapToolbarEnabled");
        eVar.y(this.f7460f, "AmbientEnabled");
        eVar.y(this.f7461g, "MinZoomPreference");
        eVar.y(this.f7462h, "MaxZoomPreference");
        eVar.y(this.f7465k, "BackgroundColor");
        eVar.y(this.f7463i, "LatLngBoundsForCameraTarget");
        eVar.y(this.alpha, "ZOrderOnTop");
        eVar.y(this.purple, "UseViewLifecycleInFragment");
        eVar.y(Integer.valueOf(this.f7467m), "mapColorScheme");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        byte bravo = C3.bravo(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(bravo);
        byte bravo2 = C3.bravo(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(bravo2);
        int i5 = this.red;
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(i5);
        AbstractC3043q.kilo(parcel, 5, this.silver, i4);
        byte bravo3 = C3.bravo(this.teal);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(bravo3);
        byte bravo4 = C3.bravo(this.white);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(bravo4);
        byte bravo5 = C3.bravo(this.yellow);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(bravo5);
        byte bravo6 = C3.bravo(this.f7456a);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(bravo6);
        byte bravo7 = C3.bravo(this.f7457b);
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(bravo7);
        byte bravo8 = C3.bravo(this.f7458c);
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeInt(bravo8);
        byte bravo9 = C3.bravo(this.f7459d);
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeInt(bravo9);
        byte bravo10 = C3.bravo(this.e);
        AbstractC3043q.sierra(parcel, 14, 4);
        parcel.writeInt(bravo10);
        byte bravo11 = C3.bravo(this.f7460f);
        AbstractC3043q.sierra(parcel, 15, 4);
        parcel.writeInt(bravo11);
        AbstractC3043q.echo(parcel, 16, this.f7461g);
        AbstractC3043q.echo(parcel, 17, this.f7462h);
        AbstractC3043q.kilo(parcel, 18, this.f7463i, i4);
        byte bravo12 = C3.bravo(this.f7464j);
        AbstractC3043q.sierra(parcel, 19, 4);
        parcel.writeInt(bravo12);
        AbstractC3043q.india(parcel, 20, this.f7465k);
        AbstractC3043q.lima(parcel, 21, this.f7466l);
        int i10 = this.f7467m;
        AbstractC3043q.sierra(parcel, 23, 4);
        parcel.writeInt(i10);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
