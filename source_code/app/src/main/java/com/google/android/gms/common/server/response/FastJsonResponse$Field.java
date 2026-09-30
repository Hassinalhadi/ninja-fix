package com.google.android.gms.common.server.response;

import J2.e;
import android.os.Parcel;
import c6.C0828a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class FastJsonResponse$Field<I, O> extends AbstractSafeParcelable {
    public static final C0828a CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Class f6652a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f6653b;

    /* renamed from: c, reason: collision with root package name */
    public zan f6654c;

    /* renamed from: d, reason: collision with root package name */
    public final StringToIntConverter f6655d;
    public final int purple;
    public final boolean red;
    public final int silver;
    public final boolean teal;
    public final String white;
    public final int yellow;

    public FastJsonResponse$Field(int i4, int i5, boolean z2, int i10, boolean z10, String str, int i11, String str2, zaa zaaVar) {
        this.alpha = i4;
        this.purple = i5;
        this.red = z2;
        this.silver = i10;
        this.teal = z10;
        this.white = str;
        this.yellow = i11;
        if (str2 == null) {
            this.f6652a = null;
            this.f6653b = null;
        } else {
            this.f6652a = SafeParcelResponse.class;
            this.f6653b = str2;
        }
        if (zaaVar == null) {
            this.f6655d = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaaVar.purple;
        if (stringToIntConverter != null) {
            this.f6655d = stringToIntConverter;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(Integer.valueOf(this.alpha), "versionCode");
        eVar.y(Integer.valueOf(this.purple), "typeIn");
        eVar.y(Boolean.valueOf(this.red), "typeInArray");
        eVar.y(Integer.valueOf(this.silver), "typeOut");
        eVar.y(Boolean.valueOf(this.teal), "typeOutArray");
        eVar.y(this.white, "outputFieldName");
        eVar.y(Integer.valueOf(this.yellow), "safeParcelFieldId");
        String str = this.f6653b;
        if (str == null) {
            str = null;
        }
        eVar.y(str, "concreteTypeName");
        Class cls = this.f6652a;
        if (cls != null) {
            eVar.y(cls.getCanonicalName(), "concreteType.class");
        }
        if (this.f6655d != null) {
            eVar.y(StringToIntConverter.class.getCanonicalName(), "converterName");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.yellow);
        zaa zaaVar = null;
        String str = this.f6653b;
        if (str == null) {
            str = null;
        }
        AbstractC3043q.lima(parcel, 8, str);
        StringToIntConverter stringToIntConverter = this.f6655d;
        if (stringToIntConverter != null) {
            zaaVar = new zaa(stringToIntConverter);
        }
        AbstractC3043q.kilo(parcel, 9, zaaVar, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
