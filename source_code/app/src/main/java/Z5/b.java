package Z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int amber = AbstractC3038p.amber(parcel);
        ArrayList arrayList = null;
        String str = null;
        boolean z2 = false;
        String str2 = null;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            AbstractC3038p.zulu(parcel, readInt);
                        } else {
                            str = AbstractC3038p.india(parcel, readInt);
                        }
                    } else {
                        str2 = AbstractC3038p.india(parcel, readInt);
                    }
                } else {
                    z2 = AbstractC3038p.oscar(parcel, readInt);
                }
            } else {
                arrayList = AbstractC3038p.mike(parcel, readInt, Feature.CREATOR);
            }
        }
        AbstractC3038p.november(parcel, amber);
        return new ApiFeatureRequest(arrayList, z2, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new ApiFeatureRequest[i4];
    }
}
