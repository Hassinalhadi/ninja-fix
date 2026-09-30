package I9;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final int alpha;
    public final long bravo;
    public final int charlie;
    public final int delta;
    public final int echo;
    public final boolean foxtrot;
    public final Long golf;
    public final String hotel;
    public final String india;
    public final boolean juliet;

    public a(int i4, long j5, int i5, int i10, int i11, boolean z2, Long l10, String str, String str2, int i12) {
        boolean z10;
        l10 = (i12 & 64) != 0 ? null : l10;
        str = (i12 & 512) != 0 ? null : str;
        str2 = (i12 & Barcode.FORMAT_UPC_E) != 0 ? null : str2;
        if ((i12 & 4096) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.alpha = i4;
        this.bravo = j5;
        this.charlie = i5;
        this.delta = i10;
        this.echo = i11;
        this.foxtrot = z2;
        this.golf = l10;
        this.hotel = str;
        this.india = str2;
        this.juliet = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.alpha != aVar.alpha || this.bravo != aVar.bravo || this.charlie != aVar.charlie || this.delta != aVar.delta || this.echo != aVar.echo || this.foxtrot != aVar.foxtrot || !Intrinsics.areEqual(this.golf, aVar.golf) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.hotel, aVar.hotel) || !Intrinsics.areEqual(this.india, aVar.india) || this.juliet != aVar.juliet) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2;
        int i5 = this.alpha * 31;
        long j5 = this.bravo;
        int i10 = (((((((i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.charlie) * 31) + this.delta) * 31) + this.echo) * 31;
        int i11 = 1237;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (i10 + i4) * 31;
        int i13 = 0;
        Long l10 = this.golf;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i14 = (i12 + hashCode) * 29791;
        String str = this.hotel;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i15 = (i14 + hashCode2) * 31;
        String str2 = this.india;
        if (str2 != null) {
            i13 = str2.hashCode();
        }
        int i16 = (((i15 + i13) * 31) + 1237) * 31;
        if (this.juliet) {
            i11 = 1231;
        }
        return i16 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompressionAttemptDetail(attemptNumber=");
        sb2.append(this.alpha);
        sb2.append(", maxBytes=");
        sb2.append(this.bravo);
        sb2.append(", maxDimension=");
        sb2.append(this.charlie);
        sb2.append(", minQuality=");
        sb2.append(this.delta);
        sb2.append(", minDim=");
        sb2.append(this.echo);
        sb2.append(", success=");
        sb2.append(this.foxtrot);
        sb2.append(", finalBytes=");
        sb2.append(this.golf);
        sb2.append(", bitmapWidth=null, bitmapHeight=null, error=");
        sb2.append(this.hotel);
        sb2.append(", exceptionType=");
        sb2.append(this.india);
        sb2.append(", usedFallback=false, usedSalvage=");
        return Q0.c.romeo(sb2, this.juliet, ")");
    }
}
