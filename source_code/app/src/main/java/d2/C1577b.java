package d2;

import Y1.aq;
import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1577b extends aq {
    public final Class romeo;
    public final Class sierra;

    public C1577b(Class cls) {
        super(true);
        this.romeo = cls;
        if (Serializable.class.isAssignableFrom(cls)) {
            if (cls.isEnum()) {
                this.sierra = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // Y1.aq
    public final Object alpha(Bundle bundle, String key) {
        Intrinsics.echo(bundle, "bundle");
        Intrinsics.echo(key, "key");
        Object obj = bundle.get(key);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // Y1.aq
    public final String bravo() {
        return this.sierra.getName();
    }

    @Override // Y1.aq
    public final Object delta(String value) {
        Intrinsics.echo(value, "value");
        Object obj = null;
        if (Intrinsics.areEqual(value, BuildConfig.TRAVIS)) {
            return null;
        }
        Class cls = this.sierra;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNull(enumConstants);
        int length = enumConstants.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Object obj2 = enumConstants[i4];
            Enum r62 = (Enum) obj2;
            Intrinsics.checkNotNull(r62);
            if (r.hotel(r62.name(), value, true)) {
                obj = obj2;
                break;
            }
            i4++;
        }
        Enum r12 = (Enum) obj;
        if (r12 != null) {
            return r12;
        }
        StringBuilder victor = Q0.c.victor("Enum value ", value, " not found for type ");
        victor.append(cls.getName());
        victor.append('.');
        throw new IllegalArgumentException(victor.toString());
    }

    @Override // Y1.aq
    public final void echo(Bundle bundle, String key, Object obj) {
        Intrinsics.echo(key, "key");
        bundle.putSerializable(key, (Serializable) this.romeo.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1577b)) {
            return false;
        }
        return Intrinsics.areEqual(this.romeo, ((C1577b) obj).romeo);
    }

    public final int hashCode() {
        return this.romeo.hashCode();
    }
}
