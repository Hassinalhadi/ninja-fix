package V9;

import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class d {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final int echo;
    public final int foxtrot = R.color.white;
    public final int golf;
    public final int hotel;
    public final Integer india;

    public d(String str, String str2, String str3, String str4, int i4, int i5, int i10, Integer num) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = i4;
        this.golf = i5;
        this.hotel = i10;
        this.india = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!Intrinsics.areEqual(this.alpha, dVar.alpha) || !Intrinsics.areEqual(this.bravo, dVar.bravo) || !Intrinsics.areEqual(this.charlie, dVar.charlie) || !Intrinsics.areEqual(this.delta, dVar.delta) || this.echo != dVar.echo || this.foxtrot != dVar.foxtrot || this.golf != dVar.golf || this.hotel != dVar.hotel || !Intrinsics.areEqual(this.india, dVar.india)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie);
        int i4 = 0;
        String str = this.delta;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (((((((((sierra + hashCode) * 31) + this.echo) * 31) + this.foxtrot) * 31) + this.golf) * 31) + this.hotel) * 31;
        Integer num = this.india;
        if (num != null) {
            i4 = num.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        return "DialogContent(title=" + this.alpha + ", message=" + this.bravo + ", positiveButtonText=" + this.charlie + ", negativeButtonText=" + this.delta + ", iconBackground=" + this.echo + ", iconTint=" + this.foxtrot + ", titleColor=" + this.golf + ", buttonColor=" + this.hotel + ", negativeButtonColor=" + this.india + ")";
    }
}
