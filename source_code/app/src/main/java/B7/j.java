package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.Timestamp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.echo(source, "source");
        return new Timestamp(source.readLong(), source.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new Timestamp[i4];
    }
}
