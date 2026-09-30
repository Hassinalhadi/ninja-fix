package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new c(16);

    /* renamed from: a, reason: collision with root package name */
    public final Cap f7492a;
    public final ArrayList alpha;

    /* renamed from: b, reason: collision with root package name */
    public final Cap f7493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7494c;

    /* renamed from: d, reason: collision with root package name */
    public List f7495d;
    public final ArrayList e;
    public float purple;
    public int red;
    public float silver;
    public boolean teal;
    public boolean white;
    public boolean yellow;

    public PolylineOptions() {
        this.purple = 10.0f;
        this.red = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        this.silver = 0.0f;
        this.teal = true;
        this.white = false;
        this.yellow = false;
        this.f7492a = new ButtCap();
        this.f7493b = new ButtCap();
        this.f7494c = 0;
        this.f7495d = null;
        this.e = new ArrayList();
        this.alpha = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 2, this.alpha);
        float f5 = this.purple;
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeFloat(f5);
        int i5 = this.red;
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(i5);
        float f10 = this.silver;
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeFloat(f10);
        boolean z2 = this.teal;
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.white;
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.yellow;
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(z11 ? 1 : 0);
        AbstractC3043q.kilo(parcel, 9, this.f7492a.o(), i4);
        AbstractC3043q.kilo(parcel, 10, this.f7493b.o(), i4);
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeInt(this.f7494c);
        AbstractC3043q.papa(parcel, 12, this.f7495d);
        ArrayList<StyleSpan> arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (StyleSpan styleSpan : arrayList) {
            StrokeStyle strokeStyle = styleSpan.alpha;
            float f11 = strokeStyle.alpha;
            Pair pair = new Pair(Integer.valueOf(strokeStyle.purple), Integer.valueOf(strokeStyle.red));
            arrayList2.add(new StyleSpan(new StrokeStyle(this.purple, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.teal, strokeStyle.teal), styleSpan.purple));
        }
        AbstractC3043q.papa(parcel, 13, arrayList2);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public PolylineOptions(ArrayList arrayList, float f5, int i4, float f10, boolean z2, boolean z10, boolean z11, Cap cap, Cap cap2, int i5, ArrayList arrayList2, ArrayList arrayList3) {
        this.purple = 10.0f;
        this.red = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        this.silver = 0.0f;
        this.teal = true;
        this.white = false;
        this.yellow = false;
        this.f7492a = new ButtCap();
        this.f7493b = new ButtCap();
        this.f7494c = 0;
        this.f7495d = null;
        this.e = new ArrayList();
        this.alpha = arrayList;
        this.purple = f5;
        this.red = i4;
        this.silver = f10;
        this.teal = z2;
        this.white = z10;
        this.yellow = z11;
        if (cap != null) {
            this.f7492a = cap;
        }
        if (cap2 != null) {
            this.f7493b = cap2;
        }
        this.f7494c = i5;
        this.f7495d = arrayList2;
        if (arrayList3 != null) {
            this.e = arrayList3;
        }
    }
}
