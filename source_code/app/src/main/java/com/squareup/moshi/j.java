package com.squareup.moshi;

import java.lang.reflect.Method;
import s6.AbstractC2665h0;

/* loaded from: classes2.dex */
public final class j extends AbstractC2665h0 {
    public final /* synthetic */ Method bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ Class delta;

    public j(Method method, Object obj, Class cls) {
        this.bravo = method;
        this.charlie = obj;
        this.delta = cls;
    }

    @Override // s6.AbstractC2665h0
    public final Object bravo() {
        return this.bravo.invoke(this.charlie, this.delta);
    }

    public final String toString() {
        return this.delta.getName();
    }
}
