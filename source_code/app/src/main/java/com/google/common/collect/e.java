package com.google.common.collect;

/* loaded from: classes2.dex */
public final class e {
    public final Object alpha;
    public final Object bravo;
    public final Object charlie;

    public e(Object obj, Object obj2, Object obj3) {
        this.alpha = obj;
        this.bravo = obj2;
        this.charlie = obj3;
    }

    public final IllegalArgumentException alpha() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.alpha;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.bravo);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.charlie);
        return new IllegalArgumentException(sb2.toString());
    }
}
