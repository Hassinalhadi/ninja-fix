package com.zendesk.util;

import com.zendesk.func.ZFunc1;
import com.zendesk.func.ZFunc2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class CollectionUtils {
    static final long[] EMPTY_LONG_ARRAY = new long[0];
    private static final ZFunc1 NOOP_FUNCTION = new ZFunc1() { // from class: com.zendesk.util.CollectionUtils.1
        @Override // com.zendesk.func.ZFunc1
        public Object apply(Object obj) {
            return obj;
        }
    };

    private CollectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TypeT> List<TypeT> appendOrReplace(Collection<TypeT> collection, TypeT typet, ZFunc2<TypeT, TypeT, Boolean> zFunc2) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection);
        boolean z2 = false;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (((Boolean) zFunc2.apply(arrayList.get(i4), typet)).booleanValue()) {
                arrayList.set(i4, typet);
                z2 = true;
            }
        }
        if (!z2) {
            arrayList.add(typet);
        }
        return arrayList;
    }

    public static <TypeT, KeyT> Map<KeyT, TypeT> associate(Collection<TypeT> collection, ZFunc1<TypeT, KeyT> zFunc1) {
        if (collection == null) {
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap(collection.size());
        for (TypeT typet : collection) {
            hashMap.put(zFunc1.apply(typet), typet);
        }
        return hashMap;
    }

    @SafeVarargs
    public static <TypeT> List<TypeT> combineLists(List<TypeT>... listArr) {
        if (listArr != null && listArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new CopyOnWriteArrayList(listArr).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (isNotEmpty(list)) {
                    Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static <TypeT> List<TypeT> copyOf(List<TypeT> list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <TypeT> List<TypeT> ensureEmpty(List<TypeT> list) {
        return isEmpty(list) ? new ArrayList() : list;
    }

    public static <TypeT> boolean equalsByContents(Collection<TypeT> collection, Collection<TypeT> collection2) {
        if (isEmpty(collection)) {
            return isEmpty(collection2);
        }
        if (isEmpty(collection2) || !collection.containsAll(collection2) || !collection2.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public static <TypeT> List<TypeT> filter(Collection<TypeT> collection, ZFunc1<TypeT, Boolean> zFunc1) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (TypeT typet : collection) {
            if (zFunc1.apply(typet).booleanValue()) {
                arrayList.add(typet);
            }
        }
        return arrayList;
    }

    public static <TypeT> TypeT findFirst(Collection<TypeT> collection, ZFunc1<TypeT, Boolean> zFunc1) {
        if (collection == null) {
            return null;
        }
        for (TypeT typet : collection) {
            if (zFunc1.apply(typet).booleanValue()) {
                return typet;
            }
        }
        return null;
    }

    public static <KeyT, ValueT> ValueT getOrDefault(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        ValueT valuet2;
        if (map != null && (valuet2 = map.get(keyt)) != null) {
            return valuet2;
        }
        return valuet;
    }

    public static <TypeT, KeyT> Map<KeyT, List<TypeT>> groupingBy(Collection<TypeT> collection, ZFunc1<TypeT, KeyT> zFunc1) {
        if (collection == null) {
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap(collection.size());
        for (TypeT typet : collection) {
            KeyT apply = zFunc1.apply(typet);
            List list = (List) hashMap.get(apply);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(typet);
            hashMap.put(apply, list);
        }
        return hashMap;
    }

    public static <TypeT> boolean isEmpty(TypeT[] typetArr) {
        return typetArr == null || typetArr.length == 0;
    }

    public static <TypeT> boolean isNotEmpty(TypeT[] typetArr) {
        return !isEmpty(typetArr);
    }

    public static <TypeT, ReturnT> List<ReturnT> map(Collection<TypeT> collection, ZFunc1<TypeT, ReturnT> zFunc1) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<TypeT> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(zFunc1.apply(it.next()));
        }
        return arrayList;
    }

    public static <KeyT, ValueT, ReturnKeyT, ReturnValueT> Map<ReturnKeyT, ReturnValueT> mapKeys(Map<KeyT, ValueT> map, ZFunc1<KeyT, ReturnKeyT> zFunc1) {
        return map(map, zFunc1, NOOP_FUNCTION);
    }

    public static <KeyT, ValueT, ReturnKeyT, ReturnValueT> Map<ReturnKeyT, ReturnValueT> mapValues(Map<KeyT, ValueT> map, ZFunc1<ValueT, ReturnValueT> zFunc1) {
        return map(map, NOOP_FUNCTION, zFunc1);
    }

    public static long[] toPrimitiveLong(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    public static <TypeT> List<TypeT> unmodifiableList(List<TypeT> list) {
        return Collections.unmodifiableList(ensureEmpty(list));
    }

    public static <TypeT> boolean isEmpty(Collection<TypeT> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <TypeT> boolean isNotEmpty(Collection<TypeT> collection) {
        return !isEmpty(collection);
    }

    public static <KeyT, ValueT> Map<KeyT, ValueT> ensureEmpty(Map<KeyT, ValueT> map) {
        return isEmpty(map) ? new HashMap() : map;
    }

    public static <KeyT, ValueT> boolean isEmpty(Map<KeyT, ValueT> map) {
        return map == null || isEmpty(map.keySet());
    }

    public static <KeyT, ValueT> boolean isNotEmpty(Map<KeyT, ValueT> map) {
        return !isEmpty(map);
    }

    public static <KeyT, ValueT, ReturnKeyT, ReturnValueT> Map<ReturnKeyT, ReturnValueT> map(Map<KeyT, ValueT> map, ZFunc1<KeyT, ReturnKeyT> zFunc1, ZFunc1<ValueT, ReturnValueT> zFunc12) {
        if (map == null) {
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<KeyT, ValueT> entry : map.entrySet()) {
            hashMap.put(zFunc1.apply(entry.getKey()), zFunc12.apply(entry.getValue()));
        }
        return hashMap;
    }

    public static <KeyT, ValueT> Map<KeyT, ValueT> copyOf(Map<KeyT, ValueT> map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    public static <KeyT, ValueT> Map<KeyT, ValueT> filter(Map<KeyT, ValueT> map, ZFunc2<KeyT, ValueT, Boolean> zFunc2) {
        if (map == null) {
            return new HashMap(0);
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<KeyT, ValueT> entry : map.entrySet()) {
            if (zFunc2.apply(entry.getKey(), entry.getValue()).booleanValue()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static long[] toPrimitiveLong(Long[] lArr, long j5) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            Long l10 = lArr[i4];
            jArr[i4] = l10 == null ? j5 : l10.longValue();
        }
        return jArr;
    }
}
