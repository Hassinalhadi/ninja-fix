package a0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: a0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0360n extends AbstractC0367u {
    public final long bravo;
    public final int charlie;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0360n(long j5, int i4) {
        super(r0);
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0340a.echo();
            porterDuffColorFilter = AbstractC0340a.charlie(ao.beige(j5), ao.xray(i4));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ao.beige(j5), ao.coral(i4));
        }
        this.bravo = j5;
        this.charlie = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0360n)) {
            return false;
        }
        C0360n c0360n = (C0360n) obj;
        if (!C0366t.charlie(this.bravo, c0360n.bravo)) {
            return false;
        }
        if (this.charlie == c0360n.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return (kotlin.p.alpha(this.bravo) * 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        ao.ad.bronze(this.bravo, ", blendMode=", sb2);
        sb2.append((Object) C0359m.alpha(this.charlie));
        sb2.append(')');
        return sb2.toString();
    }
}
