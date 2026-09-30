package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1311e2 {
    public static final Unsafe alpha;
    public static final Class bravo;
    public static final AbstractC1306d2 charlie;
    public static final boolean delta;
    public static final boolean echo;
    public static final long foxtrot;
    public static final boolean golf;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(17:(1:65)(1:(1:67))|4|(7:43|44|45|46|47|(4:51|52|(1:54)|57)|(14:50|7|(14:36|37|38|39|10|11|12|(3:26|27|(6:31|(1:18)|19|(1:21)(1:25)|22|23))|14|(2:16|18)|19|(0)(0)|22|23)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23))|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23)|3|4|(0)|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r0.getType() == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    static {
        AbstractC1306d2 abstractC1306d2;
        Field field;
        boolean z2;
        AbstractC1306d2 abstractC1306d22;
        boolean z10;
        Field field2;
        Field field3;
        boolean z11;
        AbstractC1306d2 abstractC1306d23;
        Unsafe hotel = hotel();
        alpha = hotel;
        int i4 = AbstractC1349m1.alpha;
        bravo = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean november = november(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean november2 = november(cls2);
        if (hotel != null) {
            if (november) {
                abstractC1306d2 = new AbstractC1306d2(hotel);
            } else if (november2) {
                abstractC1306d2 = new AbstractC1306d2(hotel);
            }
            charlie = abstractC1306d2;
            if (abstractC1306d2 != null) {
                try {
                    Class<?> cls3 = abstractC1306d2.alpha.getClass();
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("getLong", Object.class, cls);
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field == null) {
                        try {
                            field = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field = null;
                        }
                        if (field != null) {
                        }
                        field = null;
                    }
                } catch (Throwable th) {
                    Logger.getLogger(AbstractC1311e2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
                if (field != null) {
                    z2 = true;
                    delta = z2;
                    abstractC1306d22 = charlie;
                    if (abstractC1306d22 != null) {
                        try {
                            Class<?> cls4 = abstractC1306d22.alpha.getClass();
                            cls4.getMethod("objectFieldOffset", Field.class);
                            cls4.getMethod("arrayBaseOffset", Class.class);
                            cls4.getMethod("arrayIndexScale", Class.class);
                            cls4.getMethod("getInt", Object.class, cls);
                            cls4.getMethod("putInt", Object.class, cls, cls2);
                            cls4.getMethod("getLong", Object.class, cls);
                            cls4.getMethod("putLong", Object.class, cls, cls);
                            cls4.getMethod("getObject", Object.class, cls);
                            cls4.getMethod("putObject", Object.class, cls, Object.class);
                            z10 = true;
                        } catch (Throwable th2) {
                            Logger.getLogger(AbstractC1311e2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                        echo = z10;
                        foxtrot = oscar(byte[].class);
                        oscar(boolean[].class);
                        alpha(boolean[].class);
                        oscar(int[].class);
                        alpha(int[].class);
                        oscar(long[].class);
                        alpha(long[].class);
                        oscar(float[].class);
                        alpha(float[].class);
                        oscar(double[].class);
                        alpha(double[].class);
                        oscar(Object[].class);
                        alpha(Object[].class);
                        int i5 = AbstractC1349m1.alpha;
                        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field2 == null) {
                            try {
                                field2 = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field2 = null;
                            }
                            if (field2 == null || field2.getType() != cls) {
                                field3 = null;
                                if (field3 != null && (abstractC1306d23 = charlie) != null) {
                                    abstractC1306d23.alpha.objectFieldOffset(field3);
                                }
                                if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                golf = z11;
                            }
                        }
                        field3 = field2;
                        if (field3 != null) {
                            abstractC1306d23.alpha.objectFieldOffset(field3);
                        }
                        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                        }
                        golf = z11;
                    }
                    z10 = false;
                    echo = z10;
                    foxtrot = oscar(byte[].class);
                    oscar(boolean[].class);
                    alpha(boolean[].class);
                    oscar(int[].class);
                    alpha(int[].class);
                    oscar(long[].class);
                    alpha(long[].class);
                    oscar(float[].class);
                    alpha(float[].class);
                    oscar(double[].class);
                    alpha(double[].class);
                    oscar(Object[].class);
                    alpha(Object[].class);
                    int i52 = AbstractC1349m1.alpha;
                    field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field2 == null) {
                    }
                    field3 = field2;
                    if (field3 != null) {
                    }
                    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                    }
                    golf = z11;
                }
            }
            z2 = false;
            delta = z2;
            abstractC1306d22 = charlie;
            if (abstractC1306d22 != null) {
            }
            z10 = false;
            echo = z10;
            foxtrot = oscar(byte[].class);
            oscar(boolean[].class);
            alpha(boolean[].class);
            oscar(int[].class);
            alpha(int[].class);
            oscar(long[].class);
            alpha(long[].class);
            oscar(float[].class);
            alpha(float[].class);
            oscar(double[].class);
            alpha(double[].class);
            oscar(Object[].class);
            alpha(Object[].class);
            int i522 = AbstractC1349m1.alpha;
            field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field2 == null) {
            }
            field3 = field2;
            if (field3 != null) {
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            }
            golf = z11;
        }
        abstractC1306d2 = null;
        charlie = abstractC1306d2;
        if (abstractC1306d2 != null) {
        }
        z2 = false;
        delta = z2;
        abstractC1306d22 = charlie;
        if (abstractC1306d22 != null) {
        }
        z10 = false;
        echo = z10;
        foxtrot = oscar(byte[].class);
        oscar(boolean[].class);
        alpha(boolean[].class);
        oscar(int[].class);
        alpha(int[].class);
        oscar(long[].class);
        alpha(long[].class);
        oscar(float[].class);
        alpha(float[].class);
        oscar(double[].class);
        alpha(double[].class);
        oscar(Object[].class);
        alpha(Object[].class);
        int i5222 = AbstractC1349m1.alpha;
        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field2 == null) {
        }
        field3 = field2;
        if (field3 != null) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
        }
        golf = z11;
    }

    public static void alpha(Class cls) {
        if (echo) {
            charlie.alpha.arrayIndexScale(cls);
        }
    }

    public static void bravo(Object obj, long j5, byte b2) {
        Unsafe unsafe = charlie.alpha;
        long j6 = (-4) & j5;
        int i4 = unsafe.getInt(obj, j6);
        int i5 = ((~((int) j5)) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b2) << i5) | (i4 & (~(255 << i5))));
    }

    public static void charlie(Object obj, long j5, byte b2) {
        Unsafe unsafe = charlie.alpha;
        long j6 = (-4) & j5;
        int i4 = (((int) j5) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b2) << i4) | (unsafe.getInt(obj, j6) & (~(255 << i4))));
    }

    public static int delta(long j5, Object obj) {
        return charlie.alpha.getInt(obj, j5);
    }

    public static long echo(long j5, Object obj) {
        return charlie.alpha.getLong(obj, j5);
    }

    public static Object foxtrot(Class cls) {
        try {
            return alpha.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object golf(long j5, Object obj) {
        return charlie.alpha.getObject(obj, j5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe hotel() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void india(long j5, int i4, Object obj) {
        charlie.alpha.putInt(obj, j5, i4);
    }

    public static void juliet(Object obj, long j5, long j6) {
        charlie.alpha.putLong(obj, j5, j6);
    }

    public static void kilo(Object obj, long j5, Object obj2) {
        charlie.alpha.putObject(obj, j5, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean lima(long j5, Object obj) {
        if (((byte) ((charlie.alpha.getInt(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean mike(long j5, Object obj) {
        if (((byte) ((charlie.alpha.getInt(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean november(Class cls) {
        int i4 = AbstractC1349m1.alpha;
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

    public static int oscar(Class cls) {
        if (echo) {
            return charlie.alpha.arrayBaseOffset(cls);
        }
        return -1;
    }
}
