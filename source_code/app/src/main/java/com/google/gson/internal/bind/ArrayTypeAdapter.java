package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends ad {
    public static final ae FACTORY = new ae() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
            Type componentType;
            Type type = typeToken.getType();
            boolean z2 = type instanceof GenericArrayType;
            if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z2) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new ArrayTypeAdapter(lVar, lVar.foxtrot(TypeToken.get(componentType)), com.google.gson.internal.f.hotel(componentType));
        }
    };
    private final Class<E> componentType;
    private final ad componentTypeAdapter;

    public ArrayTypeAdapter(com.google.gson.l lVar, ad adVar, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(lVar, adVar, cls);
        this.componentType = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.ad
    public Object read(S8.a aVar) throws IOException {
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.charlie();
        while (aVar.blue()) {
            arrayList.add(this.componentTypeAdapter.read(aVar));
        }
        aVar.juliet();
        int size = arrayList.size();
        if (this.componentType.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.componentType, size);
            for (int i4 = 0; i4 < size; i4++) {
                Array.set(newInstance, i4, arrayList.get(i4));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.componentType, size));
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.azure();
            return;
        }
        cVar.echo();
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.componentTypeAdapter.write(cVar, Array.get(obj, i4));
        }
        cVar.juliet();
    }
}
