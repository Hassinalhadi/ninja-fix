package com.google.gson.internal.bind;

import androidx.appcompat.widget.P0;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.internal.n;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements ae {
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.b constructorConstructor;

    /* loaded from: classes2.dex */
    public final class Adapter<K, V> extends ad {
        private final n constructor;
        private final ad keyTypeAdapter;
        private final ad valueTypeAdapter;

        public Adapter(ad adVar, ad adVar2, n nVar) {
            this.keyTypeAdapter = adVar;
            this.valueTypeAdapter = adVar2;
            this.constructor = nVar;
        }

        private String keyToString(q qVar) {
            qVar.getClass();
            boolean z2 = qVar instanceof t;
            if (z2) {
                if (z2) {
                    t tVar = (t) qVar;
                    Serializable serializable = tVar.alpha;
                    if (serializable instanceof Number) {
                        return String.valueOf(tVar.lima());
                    }
                    if (serializable instanceof Boolean) {
                        return Boolean.toString(tVar.india());
                    }
                    if (serializable instanceof String) {
                        return tVar.delta();
                    }
                    throw new AssertionError();
                }
                throw new IllegalStateException("Not a JSON Primitive: " + qVar);
            }
            if (qVar instanceof r) {
                return BuildConfig.TRAVIS;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.ad
        public Map<K, V> read(S8.a aVar) throws IOException {
            S8.b white = aVar.white();
            if (white == S8.b.f2049b) {
                aVar.peach();
                return null;
            }
            P.i iVar = (Map<K, V>) ((Map) this.constructor.delta());
            if (white == S8.b.alpha) {
                aVar.charlie();
                while (aVar.blue()) {
                    aVar.charlie();
                    Object read = this.keyTypeAdapter.read(aVar);
                    if (iVar.put(read, this.valueTypeAdapter.read(aVar)) == null) {
                        aVar.juliet();
                    } else {
                        throw new JsonSyntaxException(P0.bronze(read, "duplicate key: "));
                    }
                }
                aVar.juliet();
                return iVar;
            }
            aVar.echo();
            while (aVar.blue()) {
                u8.b.red.getClass();
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    eVar.t(S8.b.teal);
                    Map.Entry entry = (Map.Entry) ((Iterator) eVar.B()).next();
                    eVar.E(entry.getValue());
                    eVar.E(new t((String) entry.getKey()));
                } else {
                    int i4 = aVar.yellow;
                    if (i4 == 0) {
                        i4 = aVar.golf();
                    }
                    if (i4 == 13) {
                        aVar.yellow = 9;
                    } else if (i4 == 12) {
                        aVar.yellow = 8;
                    } else if (i4 == 14) {
                        aVar.yellow = 10;
                    } else {
                        throw aVar.r("a name");
                    }
                }
                Object read2 = this.keyTypeAdapter.read(aVar);
                if (iVar.put(read2, this.valueTypeAdapter.read(aVar)) != null) {
                    throw new JsonSyntaxException(P0.bronze(read2, "duplicate key: "));
                }
            }
            aVar.papa();
            return iVar;
        }

        @Override // com.google.gson.ad
        public void write(S8.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.azure();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                cVar.foxtrot();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.quebec(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(cVar, entry.getValue());
                }
                cVar.papa();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i4 = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                q jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                jsonTree.getClass();
                z2 |= (jsonTree instanceof com.google.gson.n) || (jsonTree instanceof s);
            }
            if (z2) {
                cVar.echo();
                int size = arrayList.size();
                while (i4 < size) {
                    cVar.echo();
                    l.zulu.write(cVar, (q) arrayList.get(i4));
                    this.valueTypeAdapter.write(cVar, arrayList2.get(i4));
                    cVar.juliet();
                    i4++;
                }
                cVar.juliet();
                return;
            }
            cVar.foxtrot();
            int size2 = arrayList.size();
            while (i4 < size2) {
                cVar.quebec(keyToString((q) arrayList.get(i4)));
                this.valueTypeAdapter.write(cVar, arrayList2.get(i4));
                i4++;
            }
            cVar.papa();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.b bVar, boolean z2) {
        this.constructorConstructor = bVar;
        this.complexMapKeySerialization = z2;
    }

    private ad getKeyAdapter(com.google.gson.l lVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return lVar.foxtrot(TypeToken.get(type));
        }
        return l.charlie;
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        Type[] typeArr;
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(rawType)) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            com.google.gson.internal.f.bravo(Map.class.isAssignableFrom(rawType));
            Type kilo = com.google.gson.internal.f.kilo(type, rawType, com.google.gson.internal.f.golf(type, rawType, Map.class), new HashMap());
            if (kilo instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) kilo).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        Type type3 = typeArr[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(lVar, getKeyAdapter(lVar, type2), type2), new TypeAdapterRuntimeTypeWrapper(lVar, lVar.foxtrot(TypeToken.get(type3)), type3), this.constructorConstructor.bravo(typeToken, false));
    }
}
