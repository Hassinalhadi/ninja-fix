package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum f extends i {
    public f() {
        super("LOWER_CASE_WITH_UNDERSCORES", 4);
    }

    @Override // com.google.gson.j
    public final String alpha(Field field) {
        return i.bravo(field.getName(), '_').toLowerCase(Locale.ENGLISH);
    }
}
