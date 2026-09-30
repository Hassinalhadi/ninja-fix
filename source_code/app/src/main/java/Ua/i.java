package Ua;

import androidx.appcompat.widget.P0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class i {
    public final String alpha;
    public final String bravo;
    public final int charlie;
    public final int delta;
    public final int echo;

    public i(String title, String message, int i4, int i5, int i10) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(message, "message");
        this.alpha = title;
        this.bravo = message;
        this.charlie = i4;
        this.delta = i5;
        this.echo = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!Intrinsics.areEqual(this.alpha, iVar.alpha) || !Intrinsics.areEqual(this.bravo, iVar.bravo) || this.charlie != iVar.charlie || this.delta != iVar.delta || this.echo != iVar.echo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo) + this.charlie) * 31) + R.color.white) * 31) + this.delta) * 31) + this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackgroundLocationDowngradedDialogContent(title=");
        sb2.append(this.alpha);
        sb2.append(", message=");
        sb2.append(this.bravo);
        sb2.append(", iconBg=");
        sb2.append(this.charlie);
        sb2.append(", iconTint=2131100779, titleColor=");
        sb2.append(this.delta);
        sb2.append(", buttonColor=");
        return P0.cyan(sb2, this.echo, ")");
    }
}
