package Y1;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class an extends aq {
    public final Class romeo;

    public an(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.romeo = cls;
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        return bundle.get(key);
    }

    @Override // Y1.aq
    public final String bravo() {
        return this.romeo.getName();
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        Intrinsics.echo(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        Intrinsics.echo(key, "key");
        this.romeo.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(key, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(an.class, obj.getClass())) {
            return Intrinsics.areEqual(this.romeo, ((an) obj).romeo);
        }
        return false;
    }

    public final int hashCode() {
        return this.romeo.hashCode();
    }
}
