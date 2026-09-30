package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class D {
    public static final Unsafe alpha;
    public static final Class bravo;
    public static final C charlie;
    public static final boolean delta;
    public static final boolean echo;
    public static final long foxtrot;
    public static final boolean golf;

    static {
        boolean romeo;
        boolean quebec;
        Unsafe india = india();
        alpha = india;
        bravo = AbstractC0596c.alpha;
        boolean hotel = hotel(Long.TYPE);
        boolean hotel2 = hotel(Integer.TYPE);
        C c3 = null;
        if (india != null) {
            if (AbstractC0596c.alpha()) {
                if (hotel) {
                    c3 = new A(india, 1);
                } else if (hotel2) {
                    c3 = new A(india, 0);
                }
            } else {
                c3 = new C(india);
            }
        }
        charlie = c3;
        boolean z2 = false;
        if (c3 == null) {
            romeo = false;
        } else {
            romeo = c3.romeo();
        }
        delta = romeo;
        if (c3 == null) {
            quebec = false;
        } else {
            quebec = c3.quebec();
        }
        echo = quebec;
        foxtrot = echo(byte[].class);
        echo(boolean[].class);
        foxtrot(boolean[].class);
        echo(int[].class);
        foxtrot(int[].class);
        echo(long[].class);
        foxtrot(long[].class);
        echo(float[].class);
        foxtrot(float[].class);
        echo(double[].class);
        foxtrot(double[].class);
        echo(Object[].class);
        foxtrot(Object[].class);
        Field golf2 = golf();
        if (golf2 != null && c3 != null) {
            c3.india(golf2);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        golf = z2;
    }

    public static void alpha(Throwable th) {
        Logger.getLogger(D.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean bravo(long j5, Object obj) {
        if (((byte) ((charlie.foxtrot((-4) & j5, obj) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean charlie(long j5, Object obj) {
        if (((byte) ((charlie.foxtrot((-4) & j5, obj) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object delta(Class cls) {
        try {
            return alpha.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int echo(Class cls) {
        if (echo) {
            return charlie.alpha(cls);
        }
        return -1;
    }

    public static void foxtrot(Class cls) {
        if (echo) {
            charlie.bravo(cls);
        }
    }

    public static Field golf() {
        Field field;
        Field field2;
        if (AbstractC0596c.alpha()) {
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
    public static boolean hotel(Class cls) {
        if (!AbstractC0596c.alpha()) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe india() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void juliet(byte[] bArr, long j5, byte b2) {
        charlie.kilo(bArr, foxtrot + j5, b2);
    }

    public static void kilo(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int foxtrot2 = charlie.foxtrot(j6, obj);
        int i4 = ((~((int) j5)) & 3) << 3;
        mike(j6, ((255 & b2) << i4) | (foxtrot2 & (~(255 << i4))), obj);
    }

    public static void lima(Object obj, long j5, byte b2) {
        long j6 = (-4) & j5;
        int i4 = (((int) j5) & 3) << 3;
        mike(j6, ((255 & b2) << i4) | (charlie.foxtrot(j6, obj) & (~(255 << i4))), obj);
    }

    public static void mike(long j5, int i4, Object obj) {
        charlie.november(j5, i4, obj);
    }

    public static void november(Object obj, long j5, long j6) {
        charlie.oscar(obj, j5, j6);
    }

    public static void oscar(Object obj, long j5, Object obj2) {
        charlie.papa(obj, j5, obj2);
    }
}
