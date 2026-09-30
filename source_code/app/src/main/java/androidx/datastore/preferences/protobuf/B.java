package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class B extends C {
    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean charlie(long j5, Object obj) {
        return this.alpha.getBoolean(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final double delta(long j5, Object obj) {
        return this.alpha.getDouble(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final float echo(long j5, Object obj) {
        return this.alpha.getFloat(obj, j5);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void juliet(Object obj, long j5, boolean z2) {
        this.alpha.putBoolean(obj, j5, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void kilo(Object obj, long j5, byte b2) {
        this.alpha.putByte(obj, j5, b2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void lima(Object obj, long j5, double d4) {
        this.alpha.putDouble(obj, j5, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void mike(Object obj, long j5, float f5) {
        this.alpha.putFloat(obj, j5, f5);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean quebec() {
        if (!super.quebec()) {
            return false;
        }
        try {
            Class<?> cls = this.alpha.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            D.alpha(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final boolean romeo() {
        Unsafe unsafe = this.alpha;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (D.golf() != null) {
                    try {
                        Class<?> cls3 = this.alpha.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        D.alpha(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                D.alpha(th2);
            }
        }
        return false;
    }
}
