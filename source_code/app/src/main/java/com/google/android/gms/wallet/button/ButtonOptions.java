package com.google.android.gms.wallet.button;

import Aa.m;
import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new e(15);
    public int alpha;
    public int purple;
    public int red;
    public String silver;

    private ButtonOptions() {
    }

    public static m o() {
        return new m(19, new ButtonOptions());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (x.lima(Integer.valueOf(this.alpha), Integer.valueOf(buttonOptions.alpha)) && x.lima(Integer.valueOf(this.purple), Integer.valueOf(buttonOptions.purple)) && x.lima(Integer.valueOf(this.red), Integer.valueOf(buttonOptions.red)) && x.lima(this.silver, buttonOptions.silver)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        int i5 = this.alpha;
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(i5);
        int i10 = this.purple;
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.red;
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(i11);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
