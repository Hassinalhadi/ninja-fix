package x2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: x2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3292m {
    public static <T, V> ObjectAnimator alpha(T t5, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t5, property, (TypeConverter) null, path);
    }
}
