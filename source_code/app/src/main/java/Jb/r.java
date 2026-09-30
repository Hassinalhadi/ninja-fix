package Jb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class r {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;

    public r(String str, String str2, String str3, String str4, String str5) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.alpha, rVar.alpha) && Intrinsics.areEqual(this.bravo, rVar.bravo) && Intrinsics.areEqual(this.charlie, rVar.charlie) && Intrinsics.areEqual(this.delta, rVar.delta) && Intrinsics.areEqual(this.echo, rVar.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie);
        String str = this.delta;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.echo.hashCode() + ((sierra + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CaptainHeaderState(id=");
        sb2.append(this.alpha);
        sb2.append(", name=");
        sb2.append(this.bravo);
        sb2.append(", email=");
        sb2.append(this.charlie);
        sb2.append(", avatarUrl=");
        sb2.append(this.delta);
        sb2.append(", appVersionLabel=");
        return P0.gold(sb2, this.echo, ")");
    }
}
