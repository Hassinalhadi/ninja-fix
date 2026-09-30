package com.squareup.moshi;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import s6.AbstractC2665h0;

/* loaded from: classes2.dex */
public final class i extends AbstractC2665h0 {
    public final /* synthetic */ int bravo = 0;
    public final /* synthetic */ Class charlie;
    public final /* synthetic */ AccessibleObject delta;

    public i(Constructor constructor, Class cls) {
        this.delta = constructor;
        this.charlie = cls;
    }

    @Override // s6.AbstractC2665h0
    public final Object bravo() {
        AccessibleObject accessibleObject = this.delta;
        switch (this.bravo) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.charlie, Object.class);
        }
    }

    public final String toString() {
        switch (this.bravo) {
            case 0:
                return this.charlie.getName();
            default:
                return this.charlie.getName();
        }
    }

    public i(Method method, Class cls) {
        this.delta = method;
        this.charlie = cls;
    }
}
