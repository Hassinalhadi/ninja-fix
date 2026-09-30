package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final /* data */ class DefaultLazyKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new Object();
    public final int alpha;

    public DefaultLazyKey(int i4) {
        this.alpha = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.alpha == ((DefaultLazyKey) obj).alpha;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getAlpha() {
        return this.alpha;
    }

    public final String toString() {
        return Q0.c.quebec(new StringBuilder("DefaultLazyKey(index="), this.alpha, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
    }
}
