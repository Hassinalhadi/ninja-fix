package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class M {
    public static final Logger alpha = Logger.getLogger(M.class.getName());
    public static final Unsafe bravo;
    public static final Class charlie;
    public static final L delta;
    public static final boolean echo;
    public static final boolean foxtrot;
    public static final long golf;
    public static final boolean hotel;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        boolean z2;
        Unsafe unsafe;
        boolean z10;
        boolean z11;
        Class<?> cls2;
        Field delta2;
        boolean z12;
        L l10;
        Unsafe india = india();
        bravo = india;
        charlie = AbstractC1485c.alpha;
        Class<?> cls3 = Long.TYPE;
        boolean echo2 = echo(cls3);
        Class<?> cls4 = Integer.TYPE;
        boolean echo3 = echo(cls4);
        L l11 = null;
        if (india != null) {
            if (AbstractC1485c.alpha()) {
                if (echo2) {
                    l11 = new J(india, 1);
                } else if (echo3) {
                    l11 = new J(india, 0);
                }
            } else {
                l11 = new L(india);
            }
        }
        delta = l11;
        Class<?> cls5 = Byte.TYPE;
        if (india != null) {
            try {
                cls = india.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th) {
                alpha.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (delta() != null) {
                if (AbstractC1485c.alpha()) {
                    z2 = true;
                } else {
                    cls.getMethod("getByte", cls3);
                    cls.getMethod("putByte", cls3, cls5);
                    cls.getMethod("getInt", cls3);
                    cls.getMethod("putInt", cls3, cls4);
                    cls.getMethod("getLong", cls3);
                    cls.getMethod("putLong", cls3, cls3);
                    cls.getMethod("copyMemory", cls3, cls3, cls3);
                    cls.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                    z2 = true;
                }
                echo = z2;
                unsafe = bravo;
                if (unsafe != null) {
                    z11 = false;
                } else {
                    try {
                        cls2 = unsafe.getClass();
                        try {
                            cls2.getMethod("objectFieldOffset", Field.class);
                            cls2.getMethod("arrayBaseOffset", Class.class);
                            cls2.getMethod("arrayIndexScale", Class.class);
                            cls2.getMethod("getInt", Object.class, cls3);
                            cls2.getMethod("putInt", Object.class, cls3, cls4);
                            cls2.getMethod("getLong", Object.class, cls3);
                            Class<?>[] clsArr = new Class[3];
                            clsArr[0] = Object.class;
                            clsArr[1] = cls3;
                            clsArr[2] = cls3;
                            cls2.getMethod("putLong", clsArr);
                            Class<?>[] clsArr2 = new Class[2];
                            clsArr2[0] = Object.class;
                            z10 = true;
                            try {
                                clsArr2[1] = cls3;
                                cls2.getMethod("getObject", clsArr2);
                                Class<?>[] clsArr3 = new Class[3];
                                clsArr3[0] = Object.class;
                                clsArr3[1] = cls3;
                                clsArr3[2] = Object.class;
                                cls2.getMethod("putObject", clsArr3);
                            } catch (Throwable th2) {
                                th = th2;
                                alpha.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                z11 = false;
                                foxtrot = z11;
                                golf = bravo(byte[].class);
                                bravo(boolean[].class);
                                charlie(boolean[].class);
                                bravo(int[].class);
                                charlie(int[].class);
                                bravo(long[].class);
                                charlie(long[].class);
                                bravo(float[].class);
                                charlie(float[].class);
                                bravo(double[].class);
                                charlie(double[].class);
                                bravo(Object[].class);
                                charlie(Object[].class);
                                delta2 = delta();
                                if (delta2 != null) {
                                }
                                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                                }
                                hotel = z12;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = true;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = true;
                    }
                    if (AbstractC1485c.alpha()) {
                        z11 = true;
                    } else {
                        Class<?>[] clsArr4 = new Class[2];
                        clsArr4[0] = Object.class;
                        clsArr4[1] = cls3;
                        cls2.getMethod("getByte", clsArr4);
                        Class<?>[] clsArr5 = new Class[3];
                        clsArr5[0] = Object.class;
                        clsArr5[1] = cls3;
                        clsArr5[2] = cls5;
                        cls2.getMethod("putByte", clsArr5);
                        Class<?>[] clsArr6 = new Class[2];
                        clsArr6[0] = Object.class;
                        clsArr6[1] = cls3;
                        cls2.getMethod("getBoolean", clsArr6);
                        Class<?>[] clsArr7 = new Class[3];
                        clsArr7[0] = Object.class;
                        clsArr7[1] = cls3;
                        clsArr7[2] = Boolean.TYPE;
                        cls2.getMethod("putBoolean", clsArr7);
                        Class<?>[] clsArr8 = new Class[2];
                        clsArr8[0] = Object.class;
                        clsArr8[1] = cls3;
                        cls2.getMethod("getFloat", clsArr8);
                        Class<?>[] clsArr9 = new Class[3];
                        clsArr9[0] = Object.class;
                        clsArr9[1] = cls3;
                        clsArr9[2] = Float.TYPE;
                        cls2.getMethod("putFloat", clsArr9);
                        Class<?>[] clsArr10 = new Class[2];
                        clsArr10[0] = Object.class;
                        z10 = true;
                        clsArr10[1] = cls3;
                        cls2.getMethod("getDouble", clsArr10);
                        cls2.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                        z11 = true;
                        foxtrot = z11;
                        golf = bravo(byte[].class);
                        bravo(boolean[].class);
                        charlie(boolean[].class);
                        bravo(int[].class);
                        charlie(int[].class);
                        bravo(long[].class);
                        charlie(long[].class);
                        bravo(float[].class);
                        charlie(float[].class);
                        bravo(double[].class);
                        charlie(double[].class);
                        bravo(Object[].class);
                        charlie(Object[].class);
                        delta2 = delta();
                        if (delta2 != null && (l10 = delta) != null) {
                            l10.juliet(delta2);
                        }
                        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                            z12 = z10;
                        } else {
                            z12 = false;
                        }
                        hotel = z12;
                    }
                }
                z10 = true;
                foxtrot = z11;
                golf = bravo(byte[].class);
                bravo(boolean[].class);
                charlie(boolean[].class);
                bravo(int[].class);
                charlie(int[].class);
                bravo(long[].class);
                charlie(long[].class);
                bravo(float[].class);
                charlie(float[].class);
                bravo(double[].class);
                charlie(double[].class);
                bravo(Object[].class);
                charlie(Object[].class);
                delta2 = delta();
                if (delta2 != null) {
                    l10.juliet(delta2);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                hotel = z12;
            }
        }
        z2 = false;
        echo = z2;
        unsafe = bravo;
        if (unsafe != null) {
        }
        z10 = true;
        foxtrot = z11;
        golf = bravo(byte[].class);
        bravo(boolean[].class);
        charlie(boolean[].class);
        bravo(int[].class);
        charlie(int[].class);
        bravo(long[].class);
        charlie(long[].class);
        bravo(float[].class);
        charlie(float[].class);
        bravo(double[].class);
        charlie(double[].class);
        bravo(Object[].class);
        charlie(Object[].class);
        delta2 = delta();
        if (delta2 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        hotel = z12;
    }

    public static Object alpha(Class cls) {
        try {
            return bravo.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int bravo(Class cls) {
        if (foxtrot) {
            return delta.alpha(cls);
        }
        return -1;
    }

    public static void charlie(Class cls) {
        if (foxtrot) {
            delta.bravo(cls);
        }
    }

    public static Field delta() {
        Field field;
        Field field2;
        if (AbstractC1485c.alpha()) {
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
    public static boolean echo(Class cls) {
        if (!AbstractC1485c.alpha()) {
            return false;
        }
        try {
            Class cls2 = charlie;
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

    public static byte foxtrot(long j5, byte[] bArr) {
        return delta.delta(golf + j5, bArr);
    }

    public static byte golf(long j5, Object obj) {
        return (byte) ((delta.golf((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255);
    }

    public static byte hotel(long j5, Object obj) {
        return (byte) ((delta.golf((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe india() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void juliet(byte[] bArr, long j5, byte b2) {
        delta.lima(bArr, golf + j5, b2);
    }

    public static void kilo(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int golf2 = delta.golf(j6, obj);
        int i4 = ((~((int) j5)) & 3) << 3;
        mike(j6, ((255 & b2) << i4) | (golf2 & (~(255 << i4))), obj);
    }

    public static void lima(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int i4 = (((int) j5) & 3) << 3;
        mike(j6, ((255 & b2) << i4) | (delta.golf(j6, obj) & (~(255 << i4))), obj);
    }

    public static void mike(long j5, int i4, Object obj) {
        delta.oscar(j5, i4, obj);
    }

    public static void november(Object obj, long j5, long j6) {
        delta.papa(obj, j5, j6);
    }

    public static void oscar(Object obj, long j5, Object obj2) {
        delta.quebec(obj, j5, obj2);
    }
}
