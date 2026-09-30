package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class J extends K {
    @Override // com.google.protobuf.K
    public final boolean charlie(long j5, Object obj) {
        return this.alpha.getBoolean(obj, j5);
    }

    @Override // com.google.protobuf.K
    public final byte delta(long j5, Object obj) {
        return this.alpha.getByte(obj, j5);
    }

    @Override // com.google.protobuf.K
    public final double echo(long j5, Object obj) {
        return this.alpha.getDouble(obj, j5);
    }

    @Override // com.google.protobuf.K
    public final float foxtrot(long j5, Object obj) {
        return this.alpha.getFloat(obj, j5);
    }

    @Override // com.google.protobuf.K
    public final void kilo(Object obj, long j5, boolean z2) {
        this.alpha.putBoolean(obj, j5, z2);
    }

    @Override // com.google.protobuf.K
    public final void lima(Object obj, long j5, byte b2) {
        this.alpha.putByte(obj, j5, b2);
    }

    @Override // com.google.protobuf.K
    public final void mike(Object obj, long j5, double d4) {
        this.alpha.putDouble(obj, j5, d4);
    }

    @Override // com.google.protobuf.K
    public final void november(Object obj, long j5, float f5) {
        this.alpha.putFloat(obj, j5, f5);
    }

    @Override // com.google.protobuf.K
    public final boolean romeo() {
        if (!super.romeo()) {
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
            L.alpha(th);
            return false;
        }
    }

    @Override // com.google.protobuf.K
    public final boolean sierra() {
        Unsafe unsafe = this.alpha;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (L.echo() != null) {
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
                        L.alpha(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                L.alpha(th2);
            }
        }
        return false;
    }
}
