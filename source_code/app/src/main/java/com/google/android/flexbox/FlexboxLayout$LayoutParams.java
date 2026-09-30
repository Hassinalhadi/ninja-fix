package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator<FlexboxLayout$LayoutParams> CREATOR = new Y5.a(13);

    /* renamed from: a, reason: collision with root package name */
    public int f6622a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f6623b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6624c;
    public float purple;
    public float red;
    public int silver;
    public float teal;
    public int white;
    public int yellow;

    @Override // com.google.android.flexbox.FlexItem
    public final int B() {
        return this.f6622a;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int alpha() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int azure() {
        return this.silver;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float blue() {
        return this.red;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int bravo() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int crimson() {
        return this.white;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final void green(int i4) {
        this.white = i4;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int indigo() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int jade() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int n() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int navy() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final void olive(int i4) {
        this.yellow = i4;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float purple() {
        return this.purple;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int q() {
        return this.yellow;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final boolean r() {
        return this.f6624c;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int t() {
        return this.f6623b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeFloat(this.purple);
        parcel.writeFloat(this.red);
        parcel.writeInt(this.silver);
        parcel.writeFloat(this.teal);
        parcel.writeInt(this.white);
        parcel.writeInt(this.yellow);
        parcel.writeInt(this.f6622a);
        parcel.writeInt(this.f6623b);
        parcel.writeByte(this.f6624c ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float yellow() {
        return this.teal;
    }
}
