package com.google.gson.internal.bind;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class i {
    public final String alpha;
    public final Field bravo;
    public final String charlie;

    public i(String str, Field field) {
        this.alpha = str;
        this.bravo = field;
        this.charlie = field.getName();
    }

    public abstract void alpha(S8.c cVar, Object obj);
}
