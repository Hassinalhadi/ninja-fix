package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.aa;
import com.google.gson.ab;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends ad {
    private static final ae LAZILY_PARSED_NUMBER_FACTORY = newFactory(aa.purple);
    private final ab toNumberStrategy;

    private NumberTypeAdapter(ab abVar) {
        this.toNumberStrategy = abVar;
    }

    public static ae getFactory(ab abVar) {
        if (abVar == aa.purple) {
            return LAZILY_PARSED_NUMBER_FACTORY;
        }
        return newFactory(abVar);
    }

    private static ae newFactory(ab abVar) {
        return new ae() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.ae
            public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.ad
    public Number read(S8.a aVar) throws IOException {
        S8.b white = aVar.white();
        int ordinal = white.ordinal();
        if (ordinal == 5 || ordinal == 6) {
            return this.toNumberStrategy.alpha(aVar);
        }
        if (ordinal == 8) {
            aVar.peach();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + white + "; at path " + aVar.uniform());
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, Number number) throws IOException {
        cVar.magenta(number);
    }
}
