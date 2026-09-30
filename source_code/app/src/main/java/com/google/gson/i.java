package com.google.gson;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class i implements j {
    public static final b alpha;
    public static final f purple;
    public static final /* synthetic */ i[] red;

    static {
        b bVar = new b();
        alpha = bVar;
        i iVar = new i() { // from class: com.google.gson.c
            @Override // com.google.gson.j
            public final String alpha(Field field) {
                return i.charlie(field.getName());
            }
        };
        i iVar2 = new i() { // from class: com.google.gson.d
            @Override // com.google.gson.j
            public final String alpha(Field field) {
                return i.charlie(i.bravo(field.getName(), ' '));
            }
        };
        i iVar3 = new i() { // from class: com.google.gson.e
            @Override // com.google.gson.j
            public final String alpha(Field field) {
                return i.bravo(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f fVar = new f();
        purple = fVar;
        red = new i[]{bVar, iVar, iVar2, iVar3, fVar, new i() { // from class: com.google.gson.g
            @Override // com.google.gson.j
            public final String alpha(Field field) {
                return i.bravo(field.getName(), NumberOnlyZipVisualTransformation.HYPHEN).toLowerCase(Locale.ENGLISH);
            }
        }, new i() { // from class: com.google.gson.h
            @Override // com.google.gson.j
            public final String alpha(Field field) {
                return i.bravo(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String bravo(String str, char c3) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c3);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String charlie(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i4 == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i4) + upperCase + str.substring(i4 + 1);
                }
            } else {
                i4++;
            }
        }
        return str;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) red.clone();
    }
}
