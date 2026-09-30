package h0;

import Q0.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import com.google.android.play.core.integrity.k;
import i1.AbstractC1881b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1798a {
    public final XmlResourceParser alpha;
    public int bravo = 0;
    public final k charlie = new k(1);

    public C1798a(XmlResourceParser xmlResourceParser) {
        this.alpha = xmlResourceParser;
    }

    public final float alpha(TypedArray typedArray, String str, int i4, float f5) {
        if (AbstractC1881b.echo(this.alpha, str)) {
            f5 = typedArray.getFloat(i4, f5);
        }
        bravo(typedArray.getChangingConfigurations());
        return f5;
    }

    public final void bravo(int i4) {
        this.bravo = i4 | this.bravo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1798a) {
                C1798a c1798a = (C1798a) obj;
                if (!Intrinsics.areEqual(this.alpha, c1798a.alpha) || this.bravo != c1798a.bravo) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.alpha);
        sb2.append(", config=");
        return c.quebec(sb2, this.bravo, ')');
    }
}
