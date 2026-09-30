package A2;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2716m6;

/* loaded from: classes3.dex */
public final class j {
    public static final j bravo;
    public final HashMap alpha;

    static {
        j jVar = new j(new LinkedHashMap());
        V8.a.charlie(jVar);
        bravo = jVar;
    }

    public j(j other) {
        Intrinsics.echo(other, "other");
        this.alpha = new HashMap(other.alpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: ClassNotFoundException -> 0x0065, IOException -> 0x0067, TRY_LEAVE, TryCatch #6 {IOException -> 0x0067, ClassNotFoundException -> 0x0065, blocks: (B:10:0x0017, B:12:0x002e, B:15:0x0035, B:17:0x003a, B:25:0x005a, B:33:0x0061, B:34:0x0064, B:35:0x0069, B:46:0x009c, B:56:0x00c2, B:57:0x00c5), top: B:9:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: ClassNotFoundException -> 0x0065, IOException -> 0x0067, TRY_LEAVE, TryCatch #6 {IOException -> 0x0067, ClassNotFoundException -> 0x0065, blocks: (B:10:0x0017, B:12:0x002e, B:15:0x0035, B:17:0x003a, B:25:0x005a, B:33:0x0061, B:34:0x0064, B:35:0x0069, B:46:0x009c, B:56:0x00c2, B:57:0x00c5), top: B:9:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final j alpha(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr;
        byte b2;
        int i4;
        boolean z2;
        Intrinsics.echo(bytes, "bytes");
        if (bytes.length <= 10240) {
            if (bytes.length == 0) {
                return bravo;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                byteArrayInputStream = new ByteArrayInputStream(bytes);
                bArr = new byte[2];
                byteArrayInputStream.read(bArr);
                b2 = (byte) (-21267);
                i4 = 0;
            } catch (IOException e) {
                z.echo().delta(k.alpha, "Error in Data#fromByteArray: ", e);
            } catch (ClassNotFoundException e4) {
                z.echo().delta(k.alpha, "Error in Data#fromByteArray: ", e4);
            }
            if (bArr[0] == ((byte) 16777132)) {
                z2 = true;
                if (bArr[1] == b2) {
                    byteArrayInputStream.reset();
                    if (!z2) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            int readInt = objectInputStream.readInt();
                            while (i4 < readInt) {
                                String readUTF = objectInputStream.readUTF();
                                Intrinsics.delta(readUTF, "readUTF()");
                                linkedHashMap.put(readUTF, objectInputStream.readObject());
                                i4++;
                            }
                            objectInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC2716m6.alpha(objectInputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                        try {
                            short readShort = dataInputStream.readShort();
                            if (readShort == -21521) {
                                short readShort2 = dataInputStream.readShort();
                                if (readShort2 == 1) {
                                    int readInt2 = dataInputStream.readInt();
                                    while (i4 < readInt2) {
                                        Serializable alpha = V8.a.alpha(dataInputStream, dataInputStream.readByte());
                                        String key = dataInputStream.readUTF();
                                        Intrinsics.delta(key, "key");
                                        linkedHashMap.put(key, alpha);
                                        i4++;
                                    }
                                    dataInputStream.close();
                                } else {
                                    throw new IllegalStateException(ao.ad.zulu(readShort2, "Unsupported version number: ").toString());
                                }
                            } else {
                                throw new IllegalStateException(ao.ad.zulu(readShort, "Magic number doesn't match: ").toString());
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC2716m6.alpha(dataInputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    return new j(linkedHashMap);
                }
            }
            z2 = false;
            byteArrayInputStream.reset();
            if (!z2) {
            }
            return new j(linkedHashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public final boolean bravo(String str) {
        Object obj = this.alpha.get(str);
        if (obj != null && String.class.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (obj != null && Intrinsics.areEqual(j.class, obj.getClass())) {
                HashMap hashMap = this.alpha;
                Set<String> keySet = hashMap.keySet();
                HashMap hashMap2 = ((j) obj).alpha;
                if (Intrinsics.areEqual(keySet, hashMap2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap.get(str);
                        Object obj3 = hashMap2.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z2 = kotlin.collections.ab.foxtrot(objArr, (Object[]) obj3);
                                }
                            }
                            z2 = Intrinsics.areEqual(obj2, obj3);
                        } else if (obj2 == obj3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        for (Map.Entry entry : this.alpha.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                hashCode = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i4 += hashCode;
        }
        return i4 * 31;
    }

    public final String toString() {
        String str = "Data {" + CollectionsKt.maroon(this.alpha.entrySet(), null, null, null, i.alpha, 31) + "}";
        Intrinsics.delta(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public j(LinkedHashMap values) {
        Intrinsics.echo(values, "values");
        this.alpha = new HashMap(values);
    }
}
