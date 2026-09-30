package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class L {
    public final Unsafe alpha;

    public L(Unsafe unsafe) {
        this.alpha = unsafe;
    }

    public final int alpha(Class cls) {
        return this.alpha.arrayBaseOffset(cls);
    }

    public final int bravo(Class cls) {
        return this.alpha.arrayIndexScale(cls);
    }

    public abstract boolean charlie(long j5, Object obj);

    public abstract byte delta(long j5, Object obj);

    public abstract double echo(long j5, Object obj);

    public abstract float foxtrot(long j5, Object obj);

    public final int golf(long j5, Object obj) {
        return this.alpha.getInt(obj, j5);
    }

    public final long hotel(long j5, Object obj) {
        return this.alpha.getLong(obj, j5);
    }

    public final Object india(long j5, Object obj) {
        return this.alpha.getObject(obj, j5);
    }

    public final long juliet(Field field) {
        return this.alpha.objectFieldOffset(field);
    }

    public abstract void kilo(Object obj, long j5, boolean z2);

    public abstract void lima(Object obj, long j5, byte b2);

    public abstract void mike(Object obj, long j5, double d4);

    public abstract void november(Object obj, long j5, float f5);

    public final void oscar(long j5, int i4, Object obj) {
        this.alpha.putInt(obj, j5, i4);
    }

    public final void papa(Object obj, long j5, long j6) {
        this.alpha.putLong(obj, j5, j6);
    }

    public final void quebec(Object obj, long j5, Object obj2) {
        this.alpha.putObject(obj, j5, obj2);
    }
}
