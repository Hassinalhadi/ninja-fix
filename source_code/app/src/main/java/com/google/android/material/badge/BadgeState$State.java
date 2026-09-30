package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import z6.k;

/* loaded from: classes2.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new k(20);

    /* renamed from: a, reason: collision with root package name */
    public Integer f7822a;
    public int alpha;

    /* renamed from: c, reason: collision with root package name */
    public String f7824c;

    /* renamed from: g, reason: collision with root package name */
    public Locale f7827g;

    /* renamed from: h, reason: collision with root package name */
    public String f7828h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f7829i;

    /* renamed from: j, reason: collision with root package name */
    public int f7830j;

    /* renamed from: k, reason: collision with root package name */
    public int f7831k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f7832l;

    /* renamed from: n, reason: collision with root package name */
    public Integer f7834n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f7835o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f7836p;
    public Integer purple;

    /* renamed from: q, reason: collision with root package name */
    public Integer f7837q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f7838r;
    public Integer red;

    /* renamed from: s, reason: collision with root package name */
    public Integer f7839s;
    public Integer silver;

    /* renamed from: t, reason: collision with root package name */
    public Integer f7840t;
    public Integer teal;

    /* renamed from: u, reason: collision with root package name */
    public Integer f7841u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f7842v;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f7843w;
    public Integer white;

    /* renamed from: x, reason: collision with root package name */
    public Integer f7844x;
    public Integer yellow;

    /* renamed from: b, reason: collision with root package name */
    public int f7823b = 255;

    /* renamed from: d, reason: collision with root package name */
    public int f7825d = -2;
    public int e = -2;

    /* renamed from: f, reason: collision with root package name */
    public int f7826f = -2;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f7833m = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str;
        parcel.writeInt(this.alpha);
        parcel.writeSerializable(this.purple);
        parcel.writeSerializable(this.red);
        parcel.writeSerializable(this.silver);
        parcel.writeSerializable(this.teal);
        parcel.writeSerializable(this.white);
        parcel.writeSerializable(this.yellow);
        parcel.writeSerializable(this.f7822a);
        parcel.writeInt(this.f7823b);
        parcel.writeString(this.f7824c);
        parcel.writeInt(this.f7825d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f7826f);
        String str2 = this.f7828h;
        String str3 = null;
        if (str2 != null) {
            str = str2.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence = this.f7829i;
        if (charSequence != null) {
            str3 = charSequence.toString();
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f7830j);
        parcel.writeSerializable(this.f7832l);
        parcel.writeSerializable(this.f7834n);
        parcel.writeSerializable(this.f7835o);
        parcel.writeSerializable(this.f7836p);
        parcel.writeSerializable(this.f7837q);
        parcel.writeSerializable(this.f7838r);
        parcel.writeSerializable(this.f7839s);
        parcel.writeSerializable(this.f7842v);
        parcel.writeSerializable(this.f7840t);
        parcel.writeSerializable(this.f7841u);
        parcel.writeSerializable(this.f7833m);
        parcel.writeSerializable(this.f7827g);
        parcel.writeSerializable(this.f7843w);
        parcel.writeSerializable(this.f7844x);
    }
}
