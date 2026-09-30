package Y1;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ao extends aq {
    public final Class romeo;

    public ao(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.romeo = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        return (Serializable[]) bundle.get(key);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        ?? r4 = (Serializable[]) obj;
        Intrinsics.echo(key, "key");
        this.romeo.cast(r4);
        bundle.putSerializable(key, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(ao.class, obj.getClass())) {
            return Intrinsics.areEqual(this.romeo, ((ao) obj).romeo);
        }
        return false;
    }

    public final int hashCode() {
        return this.romeo.hashCode();
    }
}
