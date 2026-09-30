package com.squareup.moshi;

import java.lang.reflect.Method;
import s6.AbstractC2665h0;

/* loaded from: classes2.dex */
public final class k extends AbstractC2665h0 {
    public final /* synthetic */ Method bravo;
    public final /* synthetic */ Class charlie;
    public final /* synthetic */ int delta;

    public k(Method method, Class cls, int i4) {
        this.bravo = method;
        this.charlie = cls;
        this.delta = i4;
    }

    @Override // s6.AbstractC2665h0
    public final Object bravo() {
        return this.bravo.invoke(null, this.charlie, Integer.valueOf(this.delta));
    }

    public final String toString() {
        return this.charlie.getName();
    }
}
