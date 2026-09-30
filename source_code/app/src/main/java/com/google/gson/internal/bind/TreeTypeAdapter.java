package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final k context;
    private volatile ad delegate;
    private final p deserializer;
    final com.google.gson.l gson;
    private final boolean nullSafe;
    private final v serializer;
    private final ae skipPastForGetDelegateAdapter;
    private final TypeToken<T> typeToken;

    /* loaded from: classes2.dex */
    public static final class SingleTypeFactory implements ae {
        private final p deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final v serializer;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z2, Class<?> cls) {
            v vVar;
            boolean z10;
            if (obj instanceof v) {
                vVar = (v) obj;
            } else {
                vVar = null;
            }
            this.serializer = vVar;
            p pVar = obj instanceof p ? (p) obj : null;
            this.deserializer = pVar;
            if (vVar == null && pVar == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            com.google.gson.internal.f.bravo(z10);
            this.exactType = typeToken;
            this.matchRawType = z2;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.ae
        public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
            boolean isAssignableFrom;
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.matchRawType || this.exactType.getType() != typeToken.getRawType())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, lVar, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(v vVar, p pVar, com.google.gson.l lVar, TypeToken<T> typeToken, ae aeVar, boolean z2) {
        this.context = new k(this);
        this.serializer = vVar;
        this.deserializer = pVar;
        this.gson = lVar;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = aeVar;
        this.nullSafe = z2;
    }

    private ad delegate() {
        ad adVar = this.delegate;
        if (adVar == null) {
            ad golf = this.gson.golf(this.typeToken, this.skipPastForGetDelegateAdapter);
            this.delegate = golf;
            return golf;
        }
        return adVar;
    }

    public static ae newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static ae newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        boolean z2;
        if (typeToken.getType() == typeToken.getRawType()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new SingleTypeFactory(obj, typeToken, z2, null);
    }

    public static ae newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public ad getSerializationDelegate() {
        if (this.serializer != null) {
            return this;
        }
        return delegate();
    }

    @Override // com.google.gson.ad
    public T read(S8.a aVar) throws IOException {
        if (this.deserializer == null) {
            return (T) delegate().read(aVar);
        }
        q india = com.google.gson.internal.f.india(aVar);
        if (this.nullSafe) {
            india.getClass();
            if (india instanceof r) {
                return null;
            }
        }
        return (T) this.deserializer.deserialize(india, this.typeToken.getType(), this.context);
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, T t5) throws IOException {
        v vVar = this.serializer;
        if (vVar == null) {
            delegate().write(cVar, t5);
        } else if (this.nullSafe && t5 == null) {
            cVar.azure();
        } else {
            l.zulu.write(cVar, vVar.serialize(t5, this.typeToken.getType(), this.context));
        }
    }

    public TreeTypeAdapter(v vVar, p pVar, com.google.gson.l lVar, TypeToken<T> typeToken, ae aeVar) {
        this(vVar, pVar, lVar, typeToken, aeVar, true);
    }
}
