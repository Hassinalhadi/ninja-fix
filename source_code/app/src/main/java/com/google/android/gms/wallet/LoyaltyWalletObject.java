package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new e(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f7727a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f7728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7730d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterval f7731f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7732g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7733h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7734i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7735j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7736k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7737l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f7738m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7739n;

    /* renamed from: o, reason: collision with root package name */
    public final LoyaltyPoints f7740o;
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final String white;
    public final String yellow;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i4, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z2, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.silver = str4;
        this.teal = str5;
        this.white = str6;
        this.yellow = str7;
        this.f7727a = str8;
        this.f7728b = str9;
        this.f7729c = str10;
        this.f7730d = i4;
        this.e = arrayList;
        this.f7731f = timeInterval;
        this.f7732g = arrayList2;
        this.f7733h = str11;
        this.f7734i = str12;
        this.f7735j = arrayList3;
        this.f7736k = z2;
        this.f7737l = arrayList4;
        this.f7738m = arrayList5;
        this.f7739n = arrayList6;
        this.f7740o = loyaltyPoints;
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
        AbstractC3043q.lima(parcel, 9, this.f7727a);
        AbstractC3043q.lima(parcel, 10, this.f7728b);
        AbstractC3043q.lima(parcel, 11, this.f7729c);
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeInt(this.f7730d);
        AbstractC3043q.papa(parcel, 13, this.e);
        AbstractC3043q.kilo(parcel, 14, this.f7731f, i4);
        AbstractC3043q.papa(parcel, 15, this.f7732g);
        AbstractC3043q.lima(parcel, 16, this.f7733h);
        AbstractC3043q.lima(parcel, 17, this.f7734i);
        AbstractC3043q.papa(parcel, 18, this.f7735j);
        AbstractC3043q.sierra(parcel, 19, 4);
        parcel.writeInt(this.f7736k ? 1 : 0);
        AbstractC3043q.papa(parcel, 20, this.f7737l);
        AbstractC3043q.papa(parcel, 21, this.f7738m);
        AbstractC3043q.papa(parcel, 22, this.f7739n);
        AbstractC3043q.kilo(parcel, 23, this.f7740o, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
