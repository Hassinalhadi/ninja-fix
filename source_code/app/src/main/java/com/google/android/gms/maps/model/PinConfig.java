package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h6.BinderC1814d;
import java.util.Objects;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PinConfig> CREATOR = new Object();
    public final int alpha;
    public final int purple;
    public final Glyph red;

    /* loaded from: classes2.dex */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR = new Object();
        public String alpha;
        public z6.b purple;
        public int red;
        public int silver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.red != glyph.red || !Objects.equals(this.alpha, glyph.alpha) || this.silver != glyph.silver) {
                return false;
            }
            z6.b bVar = glyph.purple;
            z6.b bVar2 = this.purple;
            if ((bVar2 == null && bVar != null) || (bVar2 != null && bVar == null)) {
                return false;
            }
            if (bVar2 == null || bVar == null) {
                return true;
            }
            return Objects.equals(BinderC1814d.magenta(bVar2.alpha), BinderC1814d.magenta(bVar.alpha));
        }

        public final int hashCode() {
            return Objects.hash(this.alpha, this.purple, Integer.valueOf(this.red));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            IBinder asBinder;
            int quebec = AbstractC3043q.quebec(parcel, 20293);
            AbstractC3043q.lima(parcel, 2, this.alpha);
            z6.b bVar = this.purple;
            if (bVar == null) {
                asBinder = null;
            } else {
                asBinder = bVar.alpha.asBinder();
            }
            AbstractC3043q.foxtrot(parcel, 3, asBinder);
            AbstractC3043q.sierra(parcel, 4, 4);
            parcel.writeInt(this.red);
            AbstractC3043q.sierra(parcel, 5, 4);
            parcel.writeInt(this.silver);
            AbstractC3043q.romeo(parcel, quebec);
        }
    }

    public PinConfig(int i4, int i5, Glyph glyph) {
        this.alpha = i4;
        this.purple = i5;
        this.red = glyph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
