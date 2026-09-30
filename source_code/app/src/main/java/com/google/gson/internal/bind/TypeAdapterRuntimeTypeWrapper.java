package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends ad {
    private final com.google.gson.l context;
    private final ad delegate;
    private final Type type;

    public TypeAdapterRuntimeTypeWrapper(com.google.gson.l lVar, ad adVar, Type type) {
        this.context = lVar;
        this.delegate = adVar;
        this.type = type;
    }

    private static Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    private static boolean isReflective(ad adVar) {
        ad serializationDelegate;
        while ((adVar instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) adVar).getSerializationDelegate()) != adVar) {
            adVar = serializationDelegate;
        }
        return adVar instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.ad
    public T read(S8.a aVar) throws IOException {
        return (T) this.delegate.read(aVar);
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, T t5) throws IOException {
        ad adVar = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t5);
        if (runtimeTypeIfMoreSpecific != this.type) {
            adVar = this.context.foxtrot(TypeToken.get(runtimeTypeIfMoreSpecific));
            if ((adVar instanceof ReflectiveTypeAdapterFactory.Adapter) && !isReflective(this.delegate)) {
                adVar = this.delegate;
            }
        }
        adVar.write(cVar, t5);
    }
}
