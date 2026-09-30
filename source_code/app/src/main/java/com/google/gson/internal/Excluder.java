package com.google.gson.internal;

import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s6.AbstractC2726n7;

/* loaded from: classes2.dex */
public final class Excluder implements ae, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<com.google.gson.a> deserializationStrategies;
    private boolean requireExpose;
    private List<com.google.gson.a> serializationStrategies;
    private double version = -1.0d;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;

    public Excluder() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.serializationStrategies = list;
        this.deserializationStrategies = list;
    }

    private static boolean isInnerClass(Class<?> cls) {
        if (cls.isMemberClass()) {
            AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
            if (!Modifier.isStatic(cls.getModifiers())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isValidSince(P8.d dVar) {
        if (dVar == null) {
            return true;
        }
        if (this.version >= dVar.value()) {
            return true;
        }
        return false;
    }

    private boolean isValidUntil(P8.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (this.version < eVar.value()) {
            return true;
        }
        return false;
    }

    private boolean isValidVersion(P8.d dVar, P8.e eVar) {
        if (isValidSince(dVar) && isValidUntil(eVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.ae
    public <T> ad create(final com.google.gson.l lVar, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean excludeClass = excludeClass(rawType, true);
        final boolean excludeClass2 = excludeClass(rawType, false);
        if (!excludeClass && !excludeClass2) {
            return null;
        }
        return new ad() { // from class: com.google.gson.internal.Excluder.1
            private volatile ad delegate;

            private ad delegate() {
                ad adVar = this.delegate;
                if (adVar == null) {
                    ad golf = lVar.golf(typeToken, Excluder.this);
                    this.delegate = golf;
                    return golf;
                }
                return adVar;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // com.google.gson.ad
            public T read(S8.a aVar) throws IOException {
                if (excludeClass2) {
                    aVar.p();
                    return null;
                }
                return delegate().read(aVar);
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, T t5) throws IOException {
                if (excludeClass) {
                    cVar.azure();
                } else {
                    delegate().write(cVar, t5);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m203clone = m203clone();
        m203clone.serializeInnerClasses = false;
        return m203clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z2) {
        List<com.google.gson.a> list;
        if ((this.version != -1.0d && !isValidVersion((P8.d) cls.getAnnotation(P8.d.class), (P8.e) cls.getAnnotation(P8.e.class))) || (!this.serializeInnerClasses && isInnerClass(cls))) {
            return true;
        }
        if (!z2 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC2726n7 abstractC2726n7 = R8.c.alpha;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z2) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        Iterator<com.google.gson.a> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw ao.ad.yankee(it);
    }

    public boolean excludeField(Field field, boolean z2) {
        List<com.google.gson.a> list;
        if ((this.modifiers & field.getModifiers()) == 0) {
            if ((this.version == -1.0d || isValidVersion((P8.d) field.getAnnotation(P8.d.class), (P8.e) field.getAnnotation(P8.e.class))) && !field.isSynthetic()) {
                if (this.requireExpose) {
                    P8.a aVar = (P8.a) field.getAnnotation(P8.a.class);
                    if (aVar != null) {
                        if (z2) {
                            if (!aVar.serialize()) {
                                return true;
                            }
                        } else if (!aVar.deserialize()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                if (excludeClass(field.getType(), z2)) {
                    return true;
                }
                if (z2) {
                    list = this.serializationStrategies;
                } else {
                    list = this.deserializationStrategies;
                }
                if (!list.isEmpty()) {
                    Iterator<com.google.gson.a> it = list.iterator();
                    if (it.hasNext()) {
                        throw ao.ad.yankee(it);
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m203clone = m203clone();
        m203clone.requireExpose = true;
        return m203clone;
    }

    public Excluder withExclusionStrategy(com.google.gson.a aVar, boolean z2, boolean z10) {
        Excluder m203clone = m203clone();
        if (z2) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            m203clone.serializationStrategies = arrayList;
            arrayList.add(aVar);
        }
        if (z10) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            m203clone.deserializationStrategies = arrayList2;
            arrayList2.add(aVar);
        }
        return m203clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m203clone = m203clone();
        m203clone.modifiers = 0;
        for (int i4 : iArr) {
            m203clone.modifiers = i4 | m203clone.modifiers;
        }
        return m203clone;
    }

    public Excluder withVersion(double d4) {
        Excluder m203clone = m203clone();
        m203clone.version = d4;
        return m203clone;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m203clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
