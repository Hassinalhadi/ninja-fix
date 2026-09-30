package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

@KeepName
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new e(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f7752a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f7753b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7754c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterval f7755d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7756f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7757g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7758h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7759i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7760j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7761k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7762l;
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final String white;
    public final String yellow;

    public CommonWalletObject() {
        this.f7754c = new ArrayList();
        this.e = new ArrayList();
        this.f7758h = new ArrayList();
        this.f7760j = new ArrayList();
        this.f7761k = new ArrayList();
        this.f7762l = new ArrayList();
    }

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
        AbstractC3043q.lima(parcel, 9, this.f7752a);
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(this.f7753b);
        AbstractC3043q.papa(parcel, 11, this.f7754c);
        AbstractC3043q.kilo(parcel, 12, this.f7755d, i4);
        AbstractC3043q.papa(parcel, 13, this.e);
        AbstractC3043q.lima(parcel, 14, this.f7756f);
        AbstractC3043q.lima(parcel, 15, this.f7757g);
        AbstractC3043q.papa(parcel, 16, this.f7758h);
        AbstractC3043q.sierra(parcel, 17, 4);
        parcel.writeInt(this.f7759i ? 1 : 0);
        AbstractC3043q.papa(parcel, 18, this.f7760j);
        AbstractC3043q.papa(parcel, 19, this.f7761k);
        AbstractC3043q.papa(parcel, 20, this.f7762l);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i4, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z2, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.silver = str4;
        this.teal = str5;
        this.white = str6;
        this.yellow = str7;
        this.f7752a = str8;
        this.f7753b = i4;
        this.f7754c = arrayList;
        this.f7755d = timeInterval;
        this.e = arrayList2;
        this.f7756f = str9;
        this.f7757g = str10;
        this.f7758h = arrayList3;
        this.f7759i = z2;
        this.f7760j = arrayList4;
        this.f7761k = arrayList5;
        this.f7762l = arrayList6;
    }
}
