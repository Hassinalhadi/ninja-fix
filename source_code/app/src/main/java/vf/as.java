package vf;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class as implements D {
    public final boolean alpha;

    public as(boolean z2) {
        this.alpha = z2;
    }

    @Override // vf.D
    public final boolean echo() {
        return this.alpha;
    }

    @Override // vf.D
    public final T foxtrot() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.alpha) {
            str = "Active";
        } else {
            str = "New";
        }
        return P0.fuchsia(sb2, str, '}');
    }
}
