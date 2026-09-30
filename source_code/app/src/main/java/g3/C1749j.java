package g3;

import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1749j {
    public final boolean alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final EnumC1750k echo;
    public final boolean foxtrot;
    public final long golf;
    public final Function1 hotel;

    public C1749j(int i4) {
        boolean z2;
        EnumC1750k enumC1750k = EnumC1750k.alpha;
        if ((i4 & 8) != 0 && Build.VERSION.SDK_INT >= 34) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.clevertap.android.sdk.inapp.images.preload.a aVar = new com.clevertap.android.sdk.inapp.images.preload.a(17);
        this.alpha = true;
        this.bravo = false;
        this.charlie = true;
        this.delta = z2;
        this.echo = enumC1750k;
        this.foxtrot = true;
        this.golf = 60000L;
        this.hotel = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749j)) {
            return false;
        }
        C1749j c1749j = (C1749j) obj;
        if (this.alpha == c1749j.alpha && this.bravo == c1749j.bravo && this.charlie == c1749j.charlie && this.delta == c1749j.delta && this.echo == c1749j.echo && this.foxtrot == c1749j.foxtrot && this.golf == c1749j.golf && Intrinsics.areEqual(this.hotel, c1749j.hotel)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = i4 * 31;
        if (this.bravo) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        if (this.charlie) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (this.delta) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int hashCode = (this.echo.hashCode() + ((i15 + i11) * 31)) * 31;
        if (this.foxtrot) {
            i12 = 1231;
        }
        long j5 = this.golf;
        return this.hotel.hashCode() + ((((hashCode + i12) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Config(requireFineLocation=" + this.alpha + ", requireBackgroundLocation=" + this.bravo + ", requireSystemLocationEnabled=" + this.charlie + ", requireForegroundServiceLocationPermission=" + this.delta + ", googleAccuracyPolicy=" + this.echo + ", alwaysShowResolution=" + this.foxtrot + ", googlePromptCooldownMs=" + this.golf + ", preciseAccessCheck=" + this.hotel + ")";
    }
}
