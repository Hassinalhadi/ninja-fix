package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ak extends LinkedHashMap {
    public static final ak purple;
    public boolean alpha = true;

    static {
        ak akVar = new ak();
        purple = akVar;
        akVar.alpha = false;
    }

    public static int alpha(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = ab.alpha;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof z)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void bravo() {
        if (this.alpha) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.crypto.tink.shaded.protobuf.ak] */
    public final ak charlie() {
        if (isEmpty()) {
            return new ak();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.alpha = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        bravo();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    return true;
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = 0;
        for (Map.Entry entry : entrySet()) {
            i4 += alpha(entry.getValue()) ^ alpha(entry.getKey());
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        bravo();
        Charset charset = ab.alpha;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        bravo();
        for (Object obj : map.keySet()) {
            Charset charset = ab.alpha;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bravo();
        return super.remove(obj);
    }
}
