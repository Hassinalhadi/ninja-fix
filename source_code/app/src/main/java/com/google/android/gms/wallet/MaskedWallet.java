package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new k(12);

    /* renamed from: a, reason: collision with root package name */
    public OfferWalletObject[] f7741a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public UserAddress f7742b;

    /* renamed from: c, reason: collision with root package name */
    public UserAddress f7743c;

    /* renamed from: d, reason: collision with root package name */
    public InstrumentInfo[] f7744d;
    public String purple;
    public String[] red;
    public String silver;
    public zza teal;
    public zza white;
    public LoyaltyWalletObject[] yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.mike(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        AbstractC3043q.kilo(parcel, 7, this.white, i4);
        AbstractC3043q.oscar(parcel, 8, this.yellow, i4);
        AbstractC3043q.oscar(parcel, 9, this.f7741a, i4);
        AbstractC3043q.kilo(parcel, 10, this.f7742b, i4);
        AbstractC3043q.kilo(parcel, 11, this.f7743c, i4);
        AbstractC3043q.oscar(parcel, 12, this.f7744d, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
