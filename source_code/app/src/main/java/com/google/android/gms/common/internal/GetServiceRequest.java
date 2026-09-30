package com.google.android.gms.common.internal;

import V5.a;
import V5.aj;
import V5.h;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import o6.AbstractC2197a;
import z6.k;

/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new k(29);

    /* renamed from: h, reason: collision with root package name */
    public static final Scope[] f6642h = new Scope[0];

    /* renamed from: i, reason: collision with root package name */
    public static final Feature[] f6643i = new Feature[0];

    /* renamed from: a, reason: collision with root package name */
    public Account f6644a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public Feature[] f6645b;

    /* renamed from: c, reason: collision with root package name */
    public Feature[] f6646c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6647d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6648f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6649g;
    public final int purple;
    public final int red;
    public String silver;
    public IBinder teal;
    public Scope[] white;
    public Bundle yellow;

    public GetServiceRequest(int i4, int i5, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z2, int i11, boolean z10, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        Feature[] featureArr3;
        IInterface abstractC1394y;
        if (scopeArr == null) {
            scopeArr2 = f6642h;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        Feature[] featureArr4 = f6643i;
        if (featureArr == null) {
            featureArr3 = featureArr4;
        } else {
            featureArr3 = featureArr;
        }
        featureArr4 = featureArr2 != null ? featureArr2 : featureArr4;
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        if ("com.google.android.gms".equals(str)) {
            this.silver = "com.google.android.gms";
        } else {
            this.silver = str;
        }
        if (i4 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i12 = a.hotel;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    abstractC1394y = (h) queryLocalInterface;
                } else {
                    abstractC1394y = new AbstractC1394y(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                }
                if (abstractC1394y != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            aj ajVar = (aj) abstractC1394y;
                            Parcel charlie = ajVar.charlie(ajVar.ivory(), 2);
                            Account account3 = (Account) AbstractC2197a.alpha(charlie, Account.CREATOR);
                            charlie.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f6644a = account2;
        } else {
            this.teal = iBinder;
            this.f6644a = account;
        }
        this.white = scopeArr2;
        this.yellow = bundle2;
        this.f6645b = featureArr3;
        this.f6646c = featureArr4;
        this.f6647d = z2;
        this.e = i11;
        this.f6648f = z10;
        this.f6649g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.alpha(this, parcel, i4);
    }
}
