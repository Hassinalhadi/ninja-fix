package com.google.gson;

import androidx.fragment.app.f0;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class l {
    public static final k hotel = k.delta;
    public static final b india = i.alpha;
    public static final w juliet = aa.alpha;
    public static final x kilo = aa.purple;
    public final ThreadLocal alpha;
    public final ConcurrentHashMap bravo;
    public final com.google.gson.internal.b charlie;
    public final JsonAdapterAnnotationTypeAdapterFactory delta;
    public final List echo;
    public final boolean foxtrot;
    public final k golf;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l() {
        this(r1, india, r3, true, hotel, true, 1, r8, juliet, kilo, r8);
        Excluder excluder = Excluder.DEFAULT;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
    }

    public static void alpha(double d4) {
        if (!Double.isNaN(d4) && !Double.isInfinite(d4)) {
            return;
        }
        throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public final Object bravo(S8.a aVar, TypeToken typeToken) {
        int i4 = aVar.f2047h;
        boolean z2 = true;
        if (i4 == 2) {
            aVar.f2047h = 1;
        }
        try {
            try {
                try {
                    aVar.white();
                    z2 = false;
                    ad foxtrot = foxtrot(typeToken);
                    Object read = foxtrot.read(aVar);
                    Class mike = com.google.gson.internal.f.mike(typeToken.getRawType());
                    if (read != null && !mike.isInstance(read)) {
                        throw new ClassCastException("Type adapter '" + foxtrot + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + read.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    return read;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e.getMessage(), e);
                } catch (IllegalStateException e4) {
                    throw new JsonSyntaxException(e4);
                }
            } catch (EOFException e5) {
                if (z2) {
                    aVar.j(i4);
                    return null;
                }
                throw new JsonSyntaxException(e5);
            } catch (IOException e10) {
                throw new JsonSyntaxException(e10);
            }
        } finally {
            aVar.j(i4);
        }
    }

    public final Object charlie(Reader reader, TypeToken typeToken) {
        S8.a aVar = new S8.a(reader);
        aVar.j(2);
        Object bravo = bravo(aVar, typeToken);
        if (bravo != null) {
            try {
                if (aVar.white() != S8.b.f2050c) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            }
        }
        return bravo;
    }

    public final Object delta(Class cls, String str) {
        TypeToken typeToken = TypeToken.get(cls);
        if (str == null) {
            return null;
        }
        return charlie(new StringReader(str), typeToken);
    }

    public final Object echo(String str, Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        if (str == null) {
            return null;
        }
        return charlie(new StringReader(str), typeToken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r4.setDelegate(r6);
        r2.put(r9, r6);
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.gson.Gson$FutureTypeAdapter, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ad foxtrot(TypeToken typeToken) {
        boolean z2;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.bravo;
        ad adVar = (ad) concurrentHashMap.get(typeToken);
        if (adVar != null) {
            return adVar;
        }
        ThreadLocal threadLocal = this.alpha;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            ad adVar2 = (ad) map.get(typeToken);
            if (adVar2 != null) {
                return adVar2;
            }
            z2 = false;
        }
        try {
            ?? r4 = new SerializationDelegatingTypeAdapter<T>() { // from class: com.google.gson.Gson$FutureTypeAdapter
                private ad delegate = null;

                private ad delegate() {
                    ad adVar3 = this.delegate;
                    if (adVar3 != null) {
                        return adVar3;
                    }
                    throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                }

                @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
                public ad getSerializationDelegate() {
                    return delegate();
                }

                @Override // com.google.gson.ad
                public T read(S8.a aVar) throws IOException {
                    return (T) delegate().read(aVar);
                }

                public void setDelegate(ad adVar3) {
                    if (this.delegate == null) {
                        this.delegate = adVar3;
                        return;
                    }
                    throw new AssertionError("Delegate is already set");
                }

                @Override // com.google.gson.ad
                public void write(S8.c cVar, T t5) throws IOException {
                    delegate().write(cVar, t5);
                }
            };
            map.put(typeToken, r4);
            Iterator it = this.echo.iterator();
            ad adVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                adVar3 = ((ae) it.next()).create(this, typeToken);
                if (adVar3 != null) {
                    break;
                }
            }
            if (adVar3 != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return adVar3;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } finally {
            if (z2) {
                threadLocal.remove();
            }
        }
    }

    public final ad golf(TypeToken typeToken, ae aeVar) {
        Objects.requireNonNull(aeVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.delta;
        if (jsonAdapterAnnotationTypeAdapterFactory.isClassJsonAdapterFactory(typeToken, aeVar)) {
            aeVar = jsonAdapterAnnotationTypeAdapterFactory;
        }
        boolean z2 = false;
        for (ae aeVar2 : this.echo) {
            if (!z2) {
                if (aeVar2 == aeVar) {
                    z2 = true;
                }
            } else {
                ad create = aeVar2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            }
        }
        if (!z2) {
            return foxtrot(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public final S8.c hotel(Writer writer) {
        S8.c cVar = new S8.c(writer);
        cVar.blue(this.golf);
        cVar.f2055b = this.foxtrot;
        cVar.crimson(2);
        cVar.f2057d = false;
        return cVar;
    }

    public final String india(Object obj) {
        Writer f0Var;
        Writer f0Var2;
        if (obj == null) {
            r rVar = r.alpha;
            StringWriter stringWriter = new StringWriter();
            try {
                if (av.q.kilo(stringWriter)) {
                    f0Var2 = stringWriter;
                } else {
                    f0Var2 = new f0(stringWriter);
                }
                juliet(hotel(f0Var2), rVar);
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            if (av.q.kilo(stringWriter2)) {
                f0Var = stringWriter2;
            } else {
                f0Var = new f0(stringWriter2);
            }
            kilo(obj, cls, hotel(f0Var));
            return stringWriter2.toString();
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    public final void juliet(S8.c cVar, q qVar) {
        int i4 = cVar.f2054a;
        boolean z2 = cVar.f2055b;
        boolean z10 = cVar.f2057d;
        cVar.f2055b = this.foxtrot;
        cVar.f2057d = false;
        if (i4 == 2) {
            cVar.f2054a = 1;
        }
        try {
            try {
                com.google.gson.internal.bind.l.zulu.write(cVar, qVar);
                cVar.crimson(i4);
                cVar.f2055b = z2;
                cVar.f2057d = z10;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            cVar.crimson(i4);
            cVar.f2055b = z2;
            cVar.f2057d = z10;
            throw th;
        }
    }

    public final void kilo(Object obj, Class cls, S8.c cVar) {
        ad foxtrot = foxtrot(TypeToken.get((Type) cls));
        int i4 = cVar.f2054a;
        if (i4 == 2) {
            cVar.f2054a = 1;
        }
        boolean z2 = cVar.f2055b;
        boolean z10 = cVar.f2057d;
        cVar.f2055b = this.foxtrot;
        cVar.f2057d = false;
        try {
            try {
                foxtrot.write(cVar, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e4.getMessage(), e4);
            }
        } finally {
            cVar.crimson(i4);
            cVar.f2055b = z2;
            cVar.f2057d = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.echo + ",instanceCreators:" + this.charlie + "}";
    }

    public l(Excluder excluder, i iVar, Map map, boolean z2, k kVar, boolean z10, int i4, List list, aa aaVar, aa aaVar2, List list2) {
        final ad adVar;
        this.alpha = new ThreadLocal();
        this.bravo = new ConcurrentHashMap();
        com.google.gson.internal.b bVar = new com.google.gson.internal.b(map, z10, list2);
        this.charlie = bVar;
        this.foxtrot = z2;
        this.golf = kVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.l.amber);
        arrayList.add(ObjectTypeAdapter.getFactory(aaVar));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(com.google.gson.internal.bind.l.papa);
        arrayList.add(com.google.gson.internal.bind.l.golf);
        arrayList.add(com.google.gson.internal.bind.l.delta);
        arrayList.add(com.google.gson.internal.bind.l.echo);
        arrayList.add(com.google.gson.internal.bind.l.foxtrot);
        if (i4 == 1) {
            adVar = com.google.gson.internal.bind.l.kilo;
        } else {
            adVar = new ad() { // from class: com.google.gson.Gson$3
                @Override // com.google.gson.ad
                public Number read(S8.a aVar) throws IOException {
                    if (aVar.white() == S8.b.f2049b) {
                        aVar.peach();
                        return null;
                    }
                    return Long.valueOf(aVar.magenta());
                }

                @Override // com.google.gson.ad
                public void write(S8.c cVar, Number number) throws IOException {
                    if (number == null) {
                        cVar.azure();
                    } else {
                        cVar.navy(number.toString());
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.l.charlie(Long.TYPE, Long.class, adVar));
        arrayList.add(com.google.gson.internal.bind.l.charlie(Double.TYPE, Double.class, new ad() { // from class: com.google.gson.Gson$1
            @Override // com.google.gson.ad
            public Double read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return Double.valueOf(aVar.indigo());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                    return;
                }
                double doubleValue = number.doubleValue();
                l.alpha(doubleValue);
                cVar.green(doubleValue);
            }
        }));
        arrayList.add(com.google.gson.internal.bind.l.charlie(Float.TYPE, Float.class, new ad() { // from class: com.google.gson.Gson$2
            @Override // com.google.gson.ad
            public Float read(S8.a aVar) throws IOException {
                if (aVar.white() == S8.b.f2049b) {
                    aVar.peach();
                    return null;
                }
                return Float.valueOf((float) aVar.indigo());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.azure();
                    return;
                }
                float floatValue = number.floatValue();
                l.alpha(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.magenta(number);
            }
        }));
        arrayList.add(NumberTypeAdapter.getFactory(aaVar2));
        arrayList.add(com.google.gson.internal.bind.l.hotel);
        arrayList.add(com.google.gson.internal.bind.l.india);
        arrayList.add(com.google.gson.internal.bind.l.bravo(AtomicLong.class, new ad() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.ad
            public AtomicLong read(S8.a aVar) throws IOException {
                return new AtomicLong(((Number) ad.this.read(aVar)).longValue());
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, AtomicLong atomicLong) throws IOException {
                ad.this.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(com.google.gson.internal.bind.l.bravo(AtomicLongArray.class, new ad() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.ad
            public AtomicLongArray read(S8.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.charlie();
                while (aVar.blue()) {
                    arrayList2.add(Long.valueOf(((Number) ad.this.read(aVar)).longValue()));
                }
                aVar.juliet();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList2.get(i5)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.ad
            public void write(S8.c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.echo();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    ad.this.write(cVar, Long.valueOf(atomicLongArray.get(i5)));
                }
                cVar.juliet();
            }
        }.nullSafe()));
        arrayList.add(com.google.gson.internal.bind.l.juliet);
        arrayList.add(com.google.gson.internal.bind.l.lima);
        arrayList.add(com.google.gson.internal.bind.l.quebec);
        arrayList.add(com.google.gson.internal.bind.l.romeo);
        arrayList.add(com.google.gson.internal.bind.l.bravo(BigDecimal.class, com.google.gson.internal.bind.l.mike));
        arrayList.add(com.google.gson.internal.bind.l.bravo(BigInteger.class, com.google.gson.internal.bind.l.november));
        arrayList.add(com.google.gson.internal.bind.l.bravo(com.google.gson.internal.h.class, com.google.gson.internal.bind.l.oscar));
        arrayList.add(com.google.gson.internal.bind.l.sierra);
        arrayList.add(com.google.gson.internal.bind.l.tango);
        arrayList.add(com.google.gson.internal.bind.l.victor);
        arrayList.add(com.google.gson.internal.bind.l.whiskey);
        arrayList.add(com.google.gson.internal.bind.l.yankee);
        arrayList.add(com.google.gson.internal.bind.l.uniform);
        arrayList.add(com.google.gson.internal.bind.l.bravo);
        arrayList.add(DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList.add(com.google.gson.internal.bind.l.xray);
        if (com.google.gson.internal.sql.b.alpha) {
            arrayList.add(com.google.gson.internal.sql.b.echo);
            arrayList.add(com.google.gson.internal.sql.b.delta);
            arrayList.add(com.google.gson.internal.sql.b.foxtrot);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(com.google.gson.internal.bind.l.alpha);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.delta = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.l.azure);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, iVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.echo = Collections.unmodifiableList(arrayList);
    }
}
