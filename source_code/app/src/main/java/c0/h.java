package c0;

import a0.C0355i;
import ao.ad;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends e {
    public final float alpha;
    public final float bravo;
    public final int charlie;
    public final int delta;
    public final C0355i echo;

    public h(float f5, float f10, int i4, int i5, C0355i c0355i, int i10) {
        f10 = (i10 & 2) != 0 ? 4.0f : f10;
        i4 = (i10 & 4) != 0 ? 0 : i4;
        i5 = (i10 & 8) != 0 ? 0 : i5;
        c0355i = (i10 & 16) != 0 ? null : c0355i;
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = i4;
        this.delta = i5;
        this.echo = c0355i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.alpha == hVar.alpha && this.bravo == hVar.bravo) {
            if (this.charlie == hVar.charlie) {
                if (this.delta == hVar.delta && Intrinsics.areEqual(this.echo, hVar.echo)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int sierra = (((ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31) + this.charlie) * 31) + this.delta) * 31;
        C0355i c0355i = this.echo;
        if (c0355i != null) {
            i4 = c0355i.hashCode();
        } else {
            i4 = 0;
        }
        return sierra + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.alpha);
        sb2.append(", miter=");
        sb2.append(this.bravo);
        sb2.append(", cap=");
        String str2 = "Unknown";
        int i4 = this.charlie;
        if (i4 == 0) {
            str = "Butt";
        } else if (i4 == 1) {
            str = "Round";
        } else if (i4 != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i5 = this.delta;
        if (i5 == 0) {
            str2 = "Miter";
        } else if (i5 == 1) {
            str2 = "Round";
        } else if (i5 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append(this.echo);
        sb2.append(')');
        return sb2.toString();
    }
}
