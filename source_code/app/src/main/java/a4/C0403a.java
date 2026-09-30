package a4;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0403a {
    public final Bitmap alpha;
    public final Uri bravo;
    public final Exception charlie;
    public final int delta;

    public C0403a(Uri uri, Exception exc, int i4, int i5) {
        uri = (i5 & 2) != 0 ? null : uri;
        exc = (i5 & 4) != 0 ? null : exc;
        this.alpha = null;
        this.bravo = uri;
        this.charlie = exc;
        this.delta = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0403a)) {
            return false;
        }
        C0403a c0403a = (C0403a) obj;
        if (Intrinsics.areEqual(this.alpha, c0403a.alpha) && Intrinsics.areEqual(this.bravo, c0403a.bravo) && Intrinsics.areEqual(this.charlie, c0403a.charlie) && this.delta == c0403a.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        Bitmap bitmap = this.alpha;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i5 = hashCode * 31;
        Uri uri = this.bravo;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Exception exc = this.charlie;
        if (exc != null) {
            i4 = exc.hashCode();
        }
        return ((i10 + i4) * 31) + this.delta;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Result(bitmap=");
        sb2.append(this.alpha);
        sb2.append(", uri=");
        sb2.append(this.bravo);
        sb2.append(", error=");
        sb2.append(this.charlie);
        sb2.append(", sampleSize=");
        return Q0.c.quebec(sb2, this.delta, ')');
    }
}
