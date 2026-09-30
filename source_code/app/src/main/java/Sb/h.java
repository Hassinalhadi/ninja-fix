package Sb;

import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class h {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final int echo;
    public final String foxtrot;
    public final String golf;
    public final Integer hotel;
    public final Date india;
    public final Integer juliet;
    public final Integer kilo;
    public final boolean lima;

    public h(String title, String stepText, String str, String str2, int i4, Date date, Integer num, Integer num2, boolean z2, int i5) {
        String str3;
        String str4;
        Integer valueOf = Integer.valueOf(R.drawable.stars);
        if ((i5 & 32) != 0) {
            str3 = null;
        } else {
            str3 = "Deliver on time to earn:";
        }
        if ((i5 & 64) != 0) {
            str4 = null;
        } else {
            str4 = "25";
        }
        valueOf = (i5 & 128) != 0 ? null : valueOf;
        date = (i5 & Barcode.FORMAT_QR_CODE) != 0 ? null : date;
        num = (i5 & 512) != 0 ? null : num;
        num2 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? null : num2;
        Intrinsics.echo(title, "title");
        Intrinsics.echo(stepText, "stepText");
        this.alpha = title;
        this.bravo = stepText;
        this.charlie = str;
        this.delta = str2;
        this.echo = i4;
        this.foxtrot = str3;
        this.golf = str4;
        this.hotel = valueOf;
        this.india = date;
        this.juliet = num;
        this.kilo = num2;
        this.lima = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (Intrinsics.areEqual(this.alpha, hVar.alpha) && Intrinsics.areEqual(this.bravo, hVar.bravo) && Intrinsics.areEqual(this.charlie, hVar.charlie) && Intrinsics.areEqual(this.delta, hVar.delta) && this.echo == hVar.echo && Intrinsics.areEqual(this.foxtrot, hVar.foxtrot) && Intrinsics.areEqual(this.golf, hVar.golf) && Intrinsics.areEqual(this.hotel, hVar.hotel) && Intrinsics.areEqual(this.india, hVar.india) && Intrinsics.areEqual(this.juliet, hVar.juliet) && Intrinsics.areEqual(this.kilo, hVar.kilo) && this.lima == hVar.lima) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i4;
        int sierra = (AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie), 31, this.delta) + this.echo) * 31;
        int i5 = 0;
        String str = this.foxtrot;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (sierra + hashCode) * 31;
        String str2 = this.golf;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.hotel;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Date date = this.india;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Integer num2 = this.juliet;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Integer num3 = this.kilo;
        if (num3 != null) {
            i5 = num3.hashCode();
        }
        int i15 = (i14 + i5) * 31;
        if (this.lima) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i15 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderProgressUi(title=");
        sb2.append(this.alpha);
        sb2.append(", stepText=");
        sb2.append(this.bravo);
        sb2.append(", subtitle=");
        sb2.append(this.charlie);
        sb2.append(", timeLabel=");
        sb2.append(this.delta);
        sb2.append(", leftIconRes=");
        sb2.append(this.echo);
        sb2.append(", rewardText=");
        sb2.append(this.foxtrot);
        sb2.append(", rewardValue=");
        sb2.append(this.golf);
        sb2.append(", rewardIconRes=");
        sb2.append(this.hotel);
        sb2.append(", startedAt=");
        sb2.append(this.india);
        sb2.append(", etaInSeconds=");
        sb2.append(this.juliet);
        sb2.append(", remainingHandShakeSeconds=");
        sb2.append(this.kilo);
        sb2.append(", showTimer=");
        return Q0.c.romeo(sb2, this.lima, ")");
    }
}
