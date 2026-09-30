package bl;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class b {
    public final UUID alpha;
    public final int bravo;
    public final int charlie;
    public final Rect delta;
    public final Size echo;
    public final int foxtrot;
    public final boolean golf;

    public b(UUID uuid, int i4, int i5, Rect rect, Size size, int i10, boolean z2) {
        if (uuid != null) {
            this.alpha = uuid;
            this.bravo = i4;
            this.charlie = i5;
            if (rect != null) {
                this.delta = rect;
                if (size != null) {
                    this.echo = size;
                    this.foxtrot = i10;
                    this.golf = z2;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.alpha.equals(bVar.alpha) && this.bravo == bVar.bravo && this.charlie == bVar.charlie && this.delta.equals(bVar.delta) && this.echo.equals(bVar.echo) && this.foxtrot == bVar.foxtrot && this.golf == bVar.golf) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (((((((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo.hashCode()) * 1000003) ^ this.foxtrot) * 1000003;
        if (this.golf) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((hashCode ^ i4) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.alpha);
        sb2.append(", getTargets=");
        sb2.append(this.bravo);
        sb2.append(", getFormat=");
        sb2.append(this.charlie);
        sb2.append(", getCropRect=");
        sb2.append(this.delta);
        sb2.append(", getSize=");
        sb2.append(this.echo);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.foxtrot);
        sb2.append(", isMirroring=");
        return Q0.c.romeo(sb2, this.golf, ", shouldRespectInputCropRect=false}");
    }
}
