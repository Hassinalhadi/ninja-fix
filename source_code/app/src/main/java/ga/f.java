package ga;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class f {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final boolean foxtrot;
    public final String golf;
    public final String hotel;
    public final String india;
    public final boolean juliet;
    public final boolean kilo;

    public f(String str, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, boolean z10, boolean z11) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
        this.foxtrot = z2;
        this.golf = str6;
        this.hotel = str7;
        this.india = str8;
        this.juliet = z10;
        this.kilo = z11;
    }

    public static f alpha(f fVar, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, boolean z10, boolean z11, int i4) {
        String str9;
        String str10;
        boolean z12;
        String str11;
        String str12;
        String str13;
        boolean z13;
        boolean z14;
        if ((i4 & 1) != 0) {
            str = fVar.alpha;
        }
        String str14 = str;
        if ((i4 & 2) != 0) {
            str2 = fVar.bravo;
        }
        String str15 = str2;
        if ((i4 & 4) != 0) {
            str3 = fVar.charlie;
        }
        String str16 = str3;
        if ((i4 & 8) != 0) {
            str9 = fVar.delta;
        } else {
            str9 = str4;
        }
        if ((i4 & 16) != 0) {
            str10 = fVar.echo;
        } else {
            str10 = str5;
        }
        if ((i4 & 32) != 0) {
            z12 = fVar.foxtrot;
        } else {
            z12 = z2;
        }
        if ((i4 & 64) != 0) {
            str11 = fVar.golf;
        } else {
            str11 = str6;
        }
        if ((i4 & 128) != 0) {
            str12 = fVar.hotel;
        } else {
            str12 = str7;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            str13 = fVar.india;
        } else {
            str13 = str8;
        }
        if ((i4 & 512) != 0) {
            z13 = fVar.juliet;
        } else {
            z13 = z10;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            z14 = fVar.kilo;
        } else {
            z14 = z11;
        }
        fVar.getClass();
        return new f(str14, str15, str16, str9, str10, z12, str11, str12, str13, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && Intrinsics.areEqual(this.bravo, fVar.bravo) && Intrinsics.areEqual(this.charlie, fVar.charlie) && Intrinsics.areEqual(this.delta, fVar.delta) && Intrinsics.areEqual(this.echo, fVar.echo) && this.foxtrot == fVar.foxtrot && Intrinsics.areEqual(this.golf, fVar.golf) && Intrinsics.areEqual(this.hotel, fVar.hotel) && Intrinsics.areEqual(this.india, fVar.india) && this.juliet == fVar.juliet && this.kilo == fVar.kilo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int i5;
        int i10 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(hashCode * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo);
        int i11 = 1237;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int sierra2 = AbstractC2327c.sierra(AbstractC2327c.sierra((sierra + i4) * 31, 31, this.golf), 31, this.hotel);
        String str2 = this.india;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        int i12 = (sierra2 + i10) * 31;
        if (this.juliet) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i13 = (i12 + i5) * 31;
        if (this.kilo) {
            i11 = 1231;
        }
        return i13 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountUiState(avatarUrl=");
        sb2.append(this.alpha);
        sb2.append(", captainId=");
        sb2.append(this.bravo);
        sb2.append(", name=");
        sb2.append(this.charlie);
        sb2.append(", email=");
        sb2.append(this.delta);
        sb2.append(", stcPayValue=");
        sb2.append(this.echo);
        sb2.append(", isEditStcVisible=");
        sb2.append(this.foxtrot);
        sb2.append(", urPayId=");
        sb2.append(this.golf);
        sb2.append(", urPayIban=");
        sb2.append(this.hotel);
        sb2.append(", naqlReasons=");
        sb2.append(this.india);
        sb2.append(", showStcUpdateLabel=");
        sb2.append(this.juliet);
        sb2.append(", showUrPayUpdateLabel=");
        return Q0.c.romeo(sb2, this.kilo, ")");
    }
}
