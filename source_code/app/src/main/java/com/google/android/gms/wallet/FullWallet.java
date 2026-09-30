package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new e(10);

    /* renamed from: a, reason: collision with root package name */
    public UserAddress f7722a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public UserAddress f7723b;

    /* renamed from: c, reason: collision with root package name */
    public InstrumentInfo[] f7724c;

    /* renamed from: d, reason: collision with root package name */
    public PaymentMethodToken f7725d;
    public String purple;
    public zzaj red;
    public String silver;
    public zza teal;
    public zza white;
    public String[] yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        AbstractC3043q.kilo(parcel, 7, this.white, i4);
        AbstractC3043q.mike(parcel, 8, this.yellow);
        AbstractC3043q.kilo(parcel, 9, this.f7722a, i4);
        AbstractC3043q.kilo(parcel, 10, this.f7723b, i4);
        AbstractC3043q.oscar(parcel, 11, this.f7724c, i4);
        AbstractC3043q.kilo(parcel, 12, this.f7725d, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
