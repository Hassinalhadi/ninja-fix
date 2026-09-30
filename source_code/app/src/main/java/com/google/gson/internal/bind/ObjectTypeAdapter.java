package com.google.gson.internal.bind;

import com.google.gson.aa;
import com.google.gson.ab;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.internal.m;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends ad {
    private static final ae DOUBLE_FACTORY = newFactory(aa.alpha);
    private final com.google.gson.l gson;
    private final ab toNumberStrategy;

    public static ae getFactory(ab abVar) {
        if (abVar == aa.alpha) {
            return DOUBLE_FACTORY;
        }
        return newFactory(abVar);
    }

    private static ae newFactory(final ab abVar) {
        return new ae() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.ae
            public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(lVar, ab.this);
            }
        };
    }

    private Object readTerminal(S8.a aVar, S8.b bVar) throws IOException {
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        aVar.peach();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + bVar);
                }
                return Boolean.valueOf(aVar.green());
            }
            return this.toNumberStrategy.alpha(aVar);
        }
        return aVar.purple();
    }

    private Object tryBeginNesting(S8.a aVar, S8.b bVar) throws IOException {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                return null;
            }
            aVar.echo();
            return new m(true);
        }
        aVar.charlie();
        return new ArrayList();
    }

    @Override // com.google.gson.ad
    public Object read(S8.a aVar) throws IOException {
        String str;
        boolean z2;
        S8.b white = aVar.white();
        Object tryBeginNesting = tryBeginNesting(aVar, white);
        if (tryBeginNesting == null) {
            return readTerminal(aVar, white);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.blue()) {
                if (tryBeginNesting instanceof Map) {
                    str = aVar.navy();
                } else {
                    str = null;
                }
                S8.b white2 = aVar.white();
                Object tryBeginNesting2 = tryBeginNesting(aVar, white2);
                if (tryBeginNesting2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tryBeginNesting2 == null) {
                    tryBeginNesting2 = readTerminal(aVar, white2);
                }
                if (tryBeginNesting instanceof List) {
                    ((List) tryBeginNesting).add(tryBeginNesting2);
                } else {
                    ((Map) tryBeginNesting).put(str, tryBeginNesting2);
                }
                if (z2) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = tryBeginNesting2;
                }
            } else {
                if (tryBeginNesting instanceof List) {
                    aVar.juliet();
                } else {
                    aVar.papa();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.azure();
            return;
        }
        com.google.gson.l lVar = this.gson;
        Class<?> cls = obj.getClass();
        lVar.getClass();
        ad foxtrot = lVar.foxtrot(TypeToken.get((Class) cls));
        if (foxtrot instanceof ObjectTypeAdapter) {
            cVar.foxtrot();
            cVar.papa();
        } else {
            foxtrot.write(cVar, obj);
        }
    }

    private ObjectTypeAdapter(com.google.gson.l lVar, ab abVar) {
        this.gson = lVar;
        this.toNumberStrategy = abVar;
    }
}
