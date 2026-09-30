package c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import t6.AbstractC3038p;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0828a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int amber = AbstractC3038p.amber(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i4 = AbstractC3038p.uniform(parcel, readInt);
                    break;
                case 2:
                    i5 = AbstractC3038p.uniform(parcel, readInt);
                    break;
                case 3:
                    z2 = AbstractC3038p.oscar(parcel, readInt);
                    break;
                case 4:
                    i10 = AbstractC3038p.uniform(parcel, readInt);
                    break;
                case 5:
                    z10 = AbstractC3038p.oscar(parcel, readInt);
                    break;
                case 6:
                    str = AbstractC3038p.india(parcel, readInt);
                    break;
                case 7:
                    i11 = AbstractC3038p.uniform(parcel, readInt);
                    break;
                case '\b':
                    str2 = AbstractC3038p.india(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (zaa) AbstractC3038p.hotel(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    AbstractC3038p.zulu(parcel, readInt);
                    break;
            }
        }
        AbstractC3038p.november(parcel, amber);
        return new FastJsonResponse$Field(i4, i5, z2, i10, z10, str, i11, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new FastJsonResponse$Field[i4];
    }
}
