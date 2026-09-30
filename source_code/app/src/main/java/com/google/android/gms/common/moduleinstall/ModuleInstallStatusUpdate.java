package com.google.android.gms.common.moduleinstall;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new b(1);
    public final int alpha;
    public final int purple;
    public final Long red;
    public final Long silver;
    public final int teal;

    public ModuleInstallStatusUpdate(int i4, int i5, Long l10, Long l11, int i10) {
        this.alpha = i4;
        this.purple = i5;
        this.red = l10;
        this.silver = l11;
        this.teal = i10;
        if (l10 == null || l11 == null || l11.longValue() == 0 || l11.longValue() != 0) {
        } else {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.juliet(parcel, 3, this.red);
        AbstractC3043q.juliet(parcel, 4, this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
