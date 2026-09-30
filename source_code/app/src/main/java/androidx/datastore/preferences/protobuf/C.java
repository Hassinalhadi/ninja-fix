package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class C {
    public final Unsafe alpha;

    public C(Unsafe unsafe) {
        this.alpha = unsafe;
    }

    public final int alpha(Class cls) {
        return this.alpha.arrayBaseOffset(cls);
    }

    public final int bravo(Class cls) {
        return this.alpha.arrayIndexScale(cls);
    }

    public abstract boolean charlie(long j5, Object obj);

    public abstract double delta(long j5, Object obj);

    public abstract float echo(long j5, Object obj);

    public final int foxtrot(long j5, Object obj) {
        return this.alpha.getInt(obj, j5);
    }

    public final long golf(long j5, Object obj) {
        return this.alpha.getLong(obj, j5);
    }

    public final Object hotel(long j5, Object obj) {
        return this.alpha.getObject(obj, j5);
    }

    public final long india(Field field) {
        return this.alpha.objectFieldOffset(field);
    }

    public abstract void juliet(Object obj, long j5, boolean z2);

    public abstract void kilo(Object obj, long j5, byte b2);

    public abstract void lima(Object obj, long j5, double d4);

    public abstract void mike(Object obj, long j5, float f5);

    public final void november(long j5, int i4, Object obj) {
        this.alpha.putInt(obj, j5, i4);
    }

    public final void oscar(Object obj, long j5, long j6) {
        this.alpha.putLong(obj, j5, j6);
    }

    public final void papa(Object obj, long j5, Object obj2) {
        this.alpha.putObject(obj, j5, obj2);
    }

    public boolean quebec() {
        Unsafe unsafe = this.alpha;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            D.alpha(th);
            return false;
        }
    }

    public abstract boolean romeo();
}
