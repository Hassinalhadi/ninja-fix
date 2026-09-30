package b0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0713c {
    public final String alpha;
    public final long bravo;
    public final int charlie;

    public AbstractC0713c(int i4, long j5, String str) {
        this.alpha = str;
        this.bravo = j5;
        this.charlie = i4;
        if (str.length() != 0) {
            if (i4 >= -1 && i4 <= 63) {
                return;
            } else {
                throw new IllegalArgumentException("The id must be between -1 and 63");
            }
        }
        throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
    }

    public abstract float alpha(int i4);

    public abstract float bravo(int i4);

    public boolean charlie() {
        return false;
    }

    public abstract long delta(float f5, float f10, float f11);

    public abstract float echo(float f5, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0713c abstractC0713c = (AbstractC0713c) obj;
        if (this.charlie != abstractC0713c.charlie || !Intrinsics.areEqual(this.alpha, abstractC0713c.alpha)) {
            return false;
        }
        return AbstractC0712b.alpha(this.bravo, abstractC0713c.bravo);
    }

    public abstract long foxtrot(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c);

    public int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        int i4 = AbstractC0712b.echo;
        long j5 = this.bravo;
        return ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.charlie;
    }

    public final String toString() {
        return this.alpha + " (id=" + this.charlie + ", model=" + ((Object) AbstractC0712b.bravo(this.bravo)) + ')';
    }
}
