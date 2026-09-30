package Y1;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class am extends aq {
    public final Class romeo;

    public am(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.romeo = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // Y1.aq
    public final String bravo() {
        return this.romeo.getName();
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        Intrinsics.echo(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.echo(key, "key");
        this.romeo.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(am.class, obj.getClass())) {
            return Intrinsics.areEqual(this.romeo, ((am) obj).romeo);
        }
        return false;
    }

    public final int hashCode() {
        return this.romeo.hashCode();
    }
}
