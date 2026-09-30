package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.internal.n;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements ae {
    private final com.google.gson.internal.b constructorConstructor;

    /* loaded from: classes2.dex */
    public static final class Adapter<E> extends ad {
        private final n constructor;
        private final ad elementTypeAdapter;

        public Adapter(ad adVar, n nVar) {
            this.elementTypeAdapter = adVar;
            this.constructor = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.ad
        public Collection<E> read(S8.a aVar) throws IOException {
            if (aVar.white() == S8.b.f2049b) {
                aVar.peach();
                return null;
            }
            L.c cVar = (Collection<E>) ((Collection) this.constructor.delta());
            aVar.charlie();
            while (aVar.blue()) {
                cVar.add(this.elementTypeAdapter.read(aVar));
            }
            aVar.juliet();
            return cVar;
        }

        @Override // com.google.gson.ad
        public void write(S8.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.azure();
                return;
            }
            cVar.echo();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(cVar, it.next());
            }
            cVar.juliet();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.constructorConstructor = bVar;
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        Type type;
        Type type2 = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType) type2).getUpperBounds()[0];
        }
        com.google.gson.internal.f.bravo(Collection.class.isAssignableFrom(rawType));
        Type kilo = com.google.gson.internal.f.kilo(type2, rawType, com.google.gson.internal.f.golf(type2, rawType, Collection.class), new HashMap());
        if (kilo instanceof ParameterizedType) {
            type = ((ParameterizedType) kilo).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(lVar, lVar.foxtrot(TypeToken.get(type)), type), this.constructorConstructor.bravo(typeToken, false));
    }
}
