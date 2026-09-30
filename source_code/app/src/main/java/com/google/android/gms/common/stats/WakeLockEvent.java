package com.google.android.gms.common.stats;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import t6.AbstractC3043q;

@Deprecated
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new a(21);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6656a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f6657b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6658c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6659d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6660f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6661g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6662h;
    public final long purple;
    public final int red;
    public final String silver;
    public final String teal;
    public final String white;
    public final int yellow;

    public WakeLockEvent(int i4, long j5, int i5, String str, int i10, ArrayList arrayList, String str2, long j6, int i11, String str3, String str4, float f5, long j7, String str5, boolean z2) {
        this.alpha = i4;
        this.purple = j5;
        this.red = i5;
        this.silver = str;
        this.teal = str3;
        this.white = str5;
        this.yellow = i10;
        this.f6656a = arrayList;
        this.f6657b = str2;
        this.f6658c = j6;
        this.f6659d = i11;
        this.e = str4;
        this.f6660f = f5;
        this.f6661g = j7;
        this.f6662h = z2;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String E() {
        String join;
        String str = "";
        ArrayList arrayList = this.f6656a;
        if (arrayList == null) {
            join = "";
        } else {
            join = TextUtils.join(Constants.SEPARATOR_COMMA, arrayList);
        }
        StringBuilder sb2 = new StringBuilder("\t");
        sb2.append(this.silver);
        sb2.append("\t");
        sb2.append(this.yellow);
        sb2.append("\t");
        sb2.append(join);
        sb2.append("\t");
        sb2.append(this.f6659d);
        sb2.append("\t");
        String str2 = this.teal;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\t");
        String str3 = this.e;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append("\t");
        sb2.append(this.f6660f);
        sb2.append("\t");
        String str4 = this.white;
        if (str4 != null) {
            str = str4;
        }
        sb2.append(str);
        sb2.append("\t");
        sb2.append(this.f6662h);
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long o() {
        return this.purple;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.purple);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.yellow);
        AbstractC3043q.november(parcel, 6, this.f6656a);
        AbstractC3043q.sierra(parcel, 8, 8);
        parcel.writeLong(this.f6658c);
        AbstractC3043q.lima(parcel, 10, this.teal);
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.lima(parcel, 12, this.f6657b);
        AbstractC3043q.lima(parcel, 13, this.e);
        AbstractC3043q.sierra(parcel, 14, 4);
        parcel.writeInt(this.f6659d);
        AbstractC3043q.sierra(parcel, 15, 4);
        parcel.writeFloat(this.f6660f);
        AbstractC3043q.sierra(parcel, 16, 8);
        parcel.writeLong(this.f6661g);
        AbstractC3043q.lima(parcel, 17, this.white);
        AbstractC3043q.sierra(parcel, 18, 4);
        parcel.writeInt(this.f6662h ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.red;
    }
}
