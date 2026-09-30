package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new e(4);

    /* renamed from: a, reason: collision with root package name */
    public TransactionInfo f7746a;
    public boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7747b;

    /* renamed from: c, reason: collision with root package name */
    public String f7748c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7749d;
    public Bundle e;
    public boolean purple;
    public CardRequirements red;
    public boolean silver;
    public ShippingAddressRequirements teal;
    public ArrayList white;
    public PaymentMethodTokenizationParameters yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.kilo(parcel, 5, this.teal, i4);
        AbstractC3043q.hotel(parcel, 6, this.white);
        AbstractC3043q.kilo(parcel, 7, this.yellow, i4);
        AbstractC3043q.kilo(parcel, 8, this.f7746a, i4);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f7747b ? 1 : 0);
        AbstractC3043q.lima(parcel, 10, this.f7748c);
        AbstractC3043q.bravo(parcel, 11, this.e);
        AbstractC3043q.charlie(parcel, 12, this.f7749d);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
