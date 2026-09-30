package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class L {
    public static final Unsafe alpha;
    public static final Class bravo;
    public static final K charlie;
    public static final boolean delta;
    public static final boolean echo;
    public static final long foxtrot;
    public static final boolean golf;

    static {
        boolean sierra;
        boolean romeo;
        Unsafe juliet = juliet();
        alpha = juliet;
        bravo = AbstractC1500c.alpha;
        boolean foxtrot2 = foxtrot(Long.TYPE);
        boolean foxtrot3 = foxtrot(Integer.TYPE);
        K k6 = null;
        if (juliet != null) {
            if (AbstractC1500c.alpha()) {
                if (foxtrot2) {
                    k6 = new I(juliet, 1);
                } else if (foxtrot3) {
                    k6 = new I(juliet, 0);
                }
            } else {
                k6 = new K(juliet);
            }
        }
        charlie = k6;
        boolean z2 = false;
        if (k6 == null) {
            sierra = false;
        } else {
            sierra = k6.sierra();
        }
        delta = sierra;
        if (k6 == null) {
            romeo = false;
        } else {
            romeo = k6.romeo();
        }
        echo = romeo;
        foxtrot = charlie(byte[].class);
        charlie(boolean[].class);
        delta(boolean[].class);
        charlie(int[].class);
        delta(int[].class);
        charlie(long[].class);
        delta(long[].class);
        charlie(float[].class);
        delta(float[].class);
        charlie(double[].class);
        delta(double[].class);
        charlie(Object[].class);
        delta(Object[].class);
        Field echo2 = echo();
        if (echo2 != null && k6 != null) {
            k6.juliet(echo2);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        golf = z2;
    }

    public static void alpha(Throwable th) {
        Logger.getLogger(L.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object bravo(Class cls) {
        try {
            return alpha.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int charlie(Class cls) {
        if (echo) {
            return charlie.alpha(cls);
        }
        return -1;
    }

    public static void delta(Class cls) {
        if (echo) {
            charlie.bravo(cls);
        }
    }

    public static Field echo() {
        Field field;
        Field field2;
        if (AbstractC1500c.alpha()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean foxtrot(Class cls) {
        if (!AbstractC1500c.alpha()) {
            return false;
        }
        try {
            Class cls2 = bravo;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte golf(long j5, byte[] bArr) {
        return charlie.delta(foxtrot + j5, bArr);
    }

    public static byte hotel(long j5, Object obj) {
        return (byte) ((charlie.golf((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    public static byte india(long j5, Object obj) {
        return (byte) ((charlie.golf((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe juliet() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kilo(byte[] bArr, long j5, byte b2) {
        charlie.lima(bArr, foxtrot + j5, b2);
    }

    public static void lima(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int golf2 = charlie.golf(j6, obj);
        int i4 = ((~((int) j5)) & 3) << 3;
        november(j6, ((255 & b2) << i4) | (golf2 & (~(255 << i4))), obj);
    }

    public static void mike(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int i4 = (((int) j5) & 3) << 3;
        november(j6, ((255 & b2) << i4) | (charlie.golf(j6, obj) & (~(255 << i4))), obj);
    }

    public static void november(long j5, int i4, Object obj) {
        charlie.oscar(j5, i4, obj);
    }

    public static void oscar(Object obj, long j5, Object obj2) {
        charlie.quebec(obj, j5, obj2);
    }
}
