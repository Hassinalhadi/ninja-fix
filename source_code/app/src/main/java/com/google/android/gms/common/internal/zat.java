package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new k(25);
    public final int alpha;
    public final Account purple;
    public final int red;
    public final GoogleSignInAccount silver;

    public zat(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.alpha = i4;
        this.purple = account;
        this.red = i5;
        this.silver = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.kilo(parcel, 4, this.silver, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
