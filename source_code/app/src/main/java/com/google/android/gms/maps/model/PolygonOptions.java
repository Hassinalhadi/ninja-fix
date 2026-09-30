package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new k(0);

    /* renamed from: a, reason: collision with root package name */
    public boolean f7488a;
    public final ArrayList alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7489b;

    /* renamed from: c, reason: collision with root package name */
    public int f7490c;

    /* renamed from: d, reason: collision with root package name */
    public List f7491d;
    public final ArrayList purple;
    public float red;
    public int silver;
    public int teal;
    public float white;
    public boolean yellow;

    public PolygonOptions() {
        this.red = 10.0f;
        this.silver = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        this.teal = 0;
        this.white = 0.0f;
        this.yellow = true;
        this.f7488a = false;
        this.f7489b = false;
        this.f7490c = 0;
        this.f7491d = null;
        this.alpha = new ArrayList();
        this.purple = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 2, this.alpha);
        ArrayList arrayList = this.purple;
        if (arrayList != null) {
            int quebec2 = AbstractC3043q.quebec(parcel, 3);
            parcel.writeList(arrayList);
            AbstractC3043q.romeo(parcel, quebec2);
        }
        float f5 = this.red;
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(f5);
        int i5 = this.silver;
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(i5);
        int i10 = this.teal;
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(i10);
        float f10 = this.white;
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z2 = this.yellow;
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.f7488a;
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f7489b;
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.f7490c;
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeInt(i11);
        AbstractC3043q.papa(parcel, 12, this.f7491d);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public PolygonOptions(ArrayList arrayList, ArrayList arrayList2, float f5, int i4, int i5, float f10, boolean z2, boolean z10, boolean z11, int i10, ArrayList arrayList3) {
        this.alpha = arrayList;
        this.purple = arrayList2;
        this.red = f5;
        this.silver = i4;
        this.teal = i5;
        this.white = f10;
        this.yellow = z2;
        this.f7488a = z10;
        this.f7489b = z11;
        this.f7490c = i10;
        this.f7491d = arrayList3;
    }
}
