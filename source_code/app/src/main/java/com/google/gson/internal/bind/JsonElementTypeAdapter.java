package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes2.dex */
class JsonElementTypeAdapter extends ad {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    private q readTerminal(S8.a aVar, S8.b bVar) throws IOException {
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        aVar.peach();
                        return r.alpha;
                    }
                    throw new IllegalStateException("Unexpected token: " + bVar);
                }
                return new t(Boolean.valueOf(aVar.green()));
            }
            return new t(new com.google.gson.internal.h(aVar.purple()));
        }
        return new t(aVar.purple());
    }

    private q tryBeginNesting(S8.a aVar, S8.b bVar) throws IOException {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                return null;
            }
            aVar.echo();
            return new s();
        }
        aVar.charlie();
        return new n();
    }

    @Override // com.google.gson.ad
    public q read(S8.a aVar) throws IOException {
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            S8.b white = eVar.white();
            if (white != S8.b.teal && white != S8.b.purple && white != S8.b.silver && white != S8.b.f2050c) {
                q qVar = (q) eVar.B();
                eVar.p();
                return qVar;
            }
            throw new IllegalStateException("Unexpected " + white + " when reading a JsonElement.");
        }
        S8.b white2 = aVar.white();
        q tryBeginNesting = tryBeginNesting(aVar, white2);
        if (tryBeginNesting == null) {
            return readTerminal(aVar, white2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.blue()) {
                String navy = tryBeginNesting instanceof s ? aVar.navy() : null;
                S8.b white3 = aVar.white();
                q tryBeginNesting2 = tryBeginNesting(aVar, white3);
                boolean z2 = tryBeginNesting2 != null;
                if (tryBeginNesting2 == null) {
                    tryBeginNesting2 = readTerminal(aVar, white3);
                }
                boolean z10 = tryBeginNesting instanceof n;
                q qVar2 = r.alpha;
                if (z10) {
                    n nVar = (n) tryBeginNesting;
                    nVar.getClass();
                    if (tryBeginNesting2 != null) {
                        qVar2 = tryBeginNesting2;
                    }
                    nVar.alpha.add(qVar2);
                } else {
                    s sVar = (s) tryBeginNesting;
                    sVar.getClass();
                    if (tryBeginNesting2 != null) {
                        qVar2 = tryBeginNesting2;
                    }
                    sVar.alpha.put(navy, qVar2);
                }
                if (z2) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = tryBeginNesting2;
                }
            } else {
                if (tryBeginNesting instanceof n) {
                    aVar.juliet();
                } else {
                    aVar.papa();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = (q) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, q qVar) throws IOException {
        if (qVar != null && !(qVar instanceof r)) {
            boolean z2 = qVar instanceof t;
            if (z2) {
                if (z2) {
                    t tVar = (t) qVar;
                    Serializable serializable = tVar.alpha;
                    if (serializable instanceof Number) {
                        cVar.magenta(tVar.lima());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.olive(tVar.india());
                        return;
                    } else {
                        cVar.navy(tVar.delta());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + qVar);
            }
            boolean z10 = qVar instanceof n;
            if (z10) {
                cVar.echo();
                if (z10) {
                    Iterator it = ((n) qVar).alpha.iterator();
                    while (it.hasNext()) {
                        write(cVar, (q) it.next());
                    }
                    cVar.juliet();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + qVar);
            }
            if (qVar instanceof s) {
                cVar.foxtrot();
                Iterator it2 = ((com.google.gson.internal.j) qVar.bravo().alpha.entrySet()).iterator();
                while (((com.google.gson.internal.k) it2).hasNext()) {
                    com.google.gson.internal.l alpha = ((com.google.gson.internal.i) it2).alpha();
                    cVar.quebec((String) alpha.getKey());
                    write(cVar, (q) alpha.getValue());
                }
                cVar.papa();
                return;
            }
            throw new IllegalArgumentException("Couldn't write " + qVar.getClass());
        }
        cVar.azure();
    }
}
