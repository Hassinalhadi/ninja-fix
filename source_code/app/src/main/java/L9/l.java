package L9;

import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final Integer delta;
    public final Integer echo;
    public final Integer foxtrot;

    public l(String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = num;
        this.echo = num2;
        this.foxtrot = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!Intrinsics.areEqual(this.alpha, lVar.alpha) || !Intrinsics.areEqual(this.bravo, lVar.bravo) || !Intrinsics.areEqual(this.charlie, lVar.charlie) || !Intrinsics.areEqual(this.delta, lVar.delta) || !Intrinsics.areEqual(Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)) || !Intrinsics.areEqual(this.echo, lVar.echo) || !Intrinsics.areEqual(this.foxtrot, lVar.foxtrot)) {
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
        int hashCode2;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.bravo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.charlie;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return this.foxtrot.hashCode() + ((this.echo.hashCode() + ((Integer.valueOf(R.color.white).hashCode() + ((this.delta.hashCode() + ((i10 + i4) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Tuple7(first=" + ((Object) this.alpha) + ", second=" + ((Object) this.bravo) + ", third=" + ((Object) this.charlie) + ", fourth=" + this.delta + ", fifth=" + Integer.valueOf(R.color.white) + ", sixth=" + this.echo + ", seventh=" + this.foxtrot + ")";
    }
}
