package androidx.compose.runtime;

import androidx.appcompat.widget.P0;

/* renamed from: androidx.compose.runtime.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0562a {
    public int alpha;

    public C0562a(int i4) {
        this.alpha = i4;
    }

    public final boolean alpha() {
        if (this.alpha != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return P0.cyan(sb2, this.alpha, " }");
    }
}
