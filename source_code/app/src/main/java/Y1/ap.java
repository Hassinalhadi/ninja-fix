package Y1;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ap extends aq {
    public final Class romeo;

    public ap(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.romeo = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // Y1.aq
    public String bravo() {
        return this.romeo.getName();
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        this.romeo.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        return Intrinsics.areEqual(this.romeo, ((ap) obj).romeo);
    }

    @Override // Y1.aq
    /* renamed from: golf, reason: merged with bridge method [inline-methods] */
    public Serializable delta(String value) {
        Intrinsics.echo(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.romeo.hashCode();
    }

    public ap(int i4, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.romeo = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
