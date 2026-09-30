package Ha;

import P8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LHa/b;", "", "", "name", "Ljava/lang/String;", "charlie", "()Ljava/lang/String;", "", "latitude", "D", "alpha", "()D", "longitude", "bravo", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class b {

    @c("latitude")
    private final double latitude;

    @c("longitude")
    private final double longitude;

    @c("name")
    @NotNull
    private final String name;

    /* renamed from: alpha, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: bravo, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: charlie, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.name, bVar.name) && Double.compare(this.latitude, bVar.latitude) == 0 && Double.compare(this.longitude, bVar.longitude) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i4 = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return i4 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "UniformStoreDto(name=" + this.name + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
