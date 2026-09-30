package Y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int amber = AbstractC3038p.amber(parcel);
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            if (c3 != 5) {
                                AbstractC3038p.zulu(parcel, readInt);
                            } else {
                                i11 = AbstractC3038p.uniform(parcel, readInt);
                            }
                        } else {
                            j5 = AbstractC3038p.whiskey(parcel, readInt);
                        }
                    } else {
                        i10 = AbstractC3038p.uniform(parcel, readInt);
                    }
                } else {
                    i5 = AbstractC3038p.uniform(parcel, readInt);
                }
            } else {
                i4 = AbstractC3038p.uniform(parcel, readInt);
            }
        }
        AbstractC3038p.november(parcel, amber);
        return new VisionImageMetadataParcel(i4, i5, i10, i11, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new VisionImageMetadataParcel[i4];
    }
}
