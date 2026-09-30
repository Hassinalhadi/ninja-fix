package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z6.k;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryCache$Key implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR = new k(23);
    public final String alpha;
    public final Map purple;

    public MemoryCache$Key(String str, Map map) {
        this.alpha = str;
        this.purple = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MemoryCache$Key) {
            MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
            if (Intrinsics.areEqual(this.alpha, memoryCache$Key.alpha) && Intrinsics.areEqual(this.purple, memoryCache$Key.purple)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.purple.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.alpha + ", extras=" + this.purple + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.alpha);
        Map map = this.purple;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
