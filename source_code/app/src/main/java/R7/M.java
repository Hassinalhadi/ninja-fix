package R7;

import android.os.Build;
import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class M {
    public final int alpha;
    public final int bravo;
    public final long charlie;
    public final long delta;
    public final boolean echo;
    public final int foxtrot;

    public M(int i4, int i5, long j5, long j6, boolean z2, int i10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.alpha = i4;
        if (str != null) {
            this.bravo = i5;
            this.charlie = j5;
            this.delta = j6;
            this.echo = z2;
            this.foxtrot = i10;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                } else {
                    throw new NullPointerException("Null modelClass");
                }
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof M) {
                M m4 = (M) obj;
                if (this.alpha == m4.alpha) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.bravo == m4.bravo && this.charlie == m4.charlie && this.delta == m4.delta && this.echo == m4.echo && this.foxtrot == m4.foxtrot) {
                        String str2 = Build.MANUFACTURER;
                        if (str2.equals(str2)) {
                            String str3 = Build.PRODUCT;
                            if (str3.equals(str3)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((this.alpha ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.bravo) * 1000003;
        long j5 = this.charlie;
        int i5 = (hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.delta;
        int i10 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        if (this.echo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return Build.PRODUCT.hashCode() ^ ((((((i10 ^ i4) * 1000003) ^ this.foxtrot) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.alpha);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.bravo);
        sb2.append(", totalRam=");
        sb2.append(this.charlie);
        sb2.append(", diskSpace=");
        sb2.append(this.delta);
        sb2.append(", isEmulator=");
        sb2.append(this.echo);
        sb2.append(", state=");
        sb2.append(this.foxtrot);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return P0.gold(sb2, Build.PRODUCT, "}");
    }
}
