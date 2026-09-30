package com.google.gson.internal.bind;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class EnumTypeAdapter<T extends Enum<T>> extends ad {
    static final ae FACTORY = new ae() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };
    private final Map<T, String> constantToName;
    private final Map<String, T> nameToConstant;
    private final Map<String, T> stringToConstant;

    private EnumTypeAdapter(Class<T> cls) {
        this.nameToConstant = new HashMap();
        this.stringToConstant = new HashMap();
        this.constantToName = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i4 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i4] = field;
                    i4++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i4);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                P8.c cVar = (P8.c) field2.getAnnotation(P8.c.class);
                if (cVar != null) {
                    name = cVar.value();
                    for (String str2 : cVar.alternate()) {
                        this.nameToConstant.put(str2, r4);
                    }
                }
                this.nameToConstant.put(name, r4);
                this.stringToConstant.put(str, r4);
                this.constantToName.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.gson.ad
    public T read(S8.a aVar) throws IOException {
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        String purple = aVar.purple();
        T t5 = this.nameToConstant.get(purple);
        return t5 == null ? this.stringToConstant.get(purple) : t5;
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, T t5) throws IOException {
        cVar.navy(t5 == null ? null : this.constantToName.get(t5));
    }
}
