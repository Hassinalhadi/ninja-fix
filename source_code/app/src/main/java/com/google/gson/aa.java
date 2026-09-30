package com.google.gson;

import com.google.gson.stream.MalformedJsonException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class aa implements ab {
    public static final w alpha;
    public static final x purple;
    public static final /* synthetic */ aa[] red;

    static {
        w wVar = new w();
        alpha = wVar;
        x xVar = new x();
        purple = xVar;
        red = new aa[]{wVar, xVar, new aa() { // from class: com.google.gson.y
            public static Double bravo(String str, S8.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    boolean z2 = true;
                    if (aVar.f2047h != 1) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.beige());
                    }
                    return valueOf;
                } catch (NumberFormatException e) {
                    StringBuilder victor = Q0.c.victor("Cannot parse ", str, "; at path ");
                    victor.append(aVar.beige());
                    throw new JsonParseException(victor.toString(), e);
                }
            }

            @Override // com.google.gson.ab
            public final Number alpha(S8.a aVar) {
                String purple2 = aVar.purple();
                if (purple2.indexOf(46) >= 0) {
                    return bravo(purple2, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(purple2));
                } catch (NumberFormatException unused) {
                    return bravo(purple2, aVar);
                }
            }
        }, new aa() { // from class: com.google.gson.z
            @Override // com.google.gson.ab
            public final Number alpha(S8.a aVar) {
                String purple2 = aVar.purple();
                try {
                    return com.google.gson.internal.f.juliet(purple2);
                } catch (NumberFormatException e) {
                    StringBuilder victor = Q0.c.victor("Cannot parse ", purple2, "; at path ");
                    victor.append(aVar.beige());
                    throw new JsonParseException(victor.toString(), e);
                }
            }
        }};
    }

    public static aa valueOf(String str) {
        return (aa) Enum.valueOf(aa.class, str);
    }

    public static aa[] values() {
        return (aa[]) red.clone();
    }
}
