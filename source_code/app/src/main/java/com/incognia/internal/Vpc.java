package com.incognia.internal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import s6.AbstractC2734o6;

/* loaded from: classes2.dex */
public final class Vpc {
    public final Jme b(InputStream inputStream) {
        if (inputStream == null) {
            return new Jme();
        }
        try {
            try {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC2734o6.charlie(new BufferedReader(new InputStreamReader(inputStream)), new pVN(arrayList, this, linkedHashMap));
                return new Jme(arrayList, linkedHashMap);
            } finally {
                inputStream.close();
            }
        } catch (Throwable unused) {
            return new Jme();
        }
    }
}
