package com.google.gson.internal.bind;

import com.google.gson.ae;
import java.util.Date;

/* loaded from: classes2.dex */
public abstract class b {
    public static final a bravo = new b(Date.class);
    public final Class alpha;

    public b(Class cls) {
        this.alpha = cls;
    }

    public final ae alpha(int i4, int i5) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i4, i5);
        ae aeVar = l.alpha;
        return new TypeAdapters$29(this.alpha, defaultDateTypeAdapter);
    }

    public abstract Date bravo(Date date);
}
