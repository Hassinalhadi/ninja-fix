package com.bumptech.glide;

/* loaded from: classes3.dex */
public final class a implements Cloneable {
    public W3.a alpha;

    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean bravo(Object obj) {
        if (obj instanceof a) {
            return Y3.l.bravo(this.alpha, ((a) obj).alpha);
        }
        return false;
    }

    public final int charlie() {
        W3.a aVar = this.alpha;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && bravo(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return charlie();
    }
}
