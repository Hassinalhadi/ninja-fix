package com.google.android.gms.identity.intents.model;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new b(22);

    /* renamed from: a, reason: collision with root package name */
    public String f6663a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public String f6664b;

    /* renamed from: c, reason: collision with root package name */
    public String f6665c;

    /* renamed from: d, reason: collision with root package name */
    public String f6666d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6667f;

    /* renamed from: g, reason: collision with root package name */
    public String f6668g;

    /* renamed from: h, reason: collision with root package name */
    public String f6669h;
    public String purple;
    public String red;
    public String silver;
    public String teal;
    public String white;
    public String yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.lima(parcel, 6, this.teal);
        AbstractC3043q.lima(parcel, 7, this.white);
        AbstractC3043q.lima(parcel, 8, this.yellow);
        AbstractC3043q.lima(parcel, 9, this.f6663a);
        AbstractC3043q.lima(parcel, 10, this.f6664b);
        AbstractC3043q.lima(parcel, 11, this.f6665c);
        AbstractC3043q.lima(parcel, 12, this.f6666d);
        AbstractC3043q.lima(parcel, 13, this.e);
        AbstractC3043q.sierra(parcel, 14, 4);
        parcel.writeInt(this.f6667f ? 1 : 0);
        AbstractC3043q.lima(parcel, 15, this.f6668g);
        AbstractC3043q.lima(parcel, 16, this.f6669h);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
