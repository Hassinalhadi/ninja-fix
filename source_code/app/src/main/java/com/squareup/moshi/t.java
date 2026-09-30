package com.squareup.moshi;

import com.squareup.moshi.JsonReader;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] alpha;

    static {
        int[] iArr = new int[JsonReader.Token.values().length];
        alpha = iArr;
        try {
            iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            alpha[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            alpha[JsonReader.Token.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            alpha[JsonReader.Token.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            alpha[JsonReader.Token.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            alpha[JsonReader.Token.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
