package com.google.gson;

import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public enum b extends i {
    public b() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.j
    public final String alpha(Field field) {
        return field.getName();
    }
}
