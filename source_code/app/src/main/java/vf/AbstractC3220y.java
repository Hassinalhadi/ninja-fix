package vf;

import kotlin.jvm.internal.Intrinsics;
import pf.C2361k;

/* renamed from: vf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3220y extends Nd.a implements Nd.e {
    public static final C3219x alpha = new C3219x(Nd.d.alpha, new C2361k(22));

    public AbstractC3220y() {
        super(Nd.d.alpha);
    }

    public abstract void beige(Nd.h hVar, Runnable runnable);

    @Override // Nd.a, Nd.h
    public final Nd.f get(Nd.g key) {
        Nd.f fVar;
        Intrinsics.echo(key, "key");
        if (key instanceof C3219x) {
            C3219x c3219x = (C3219x) key;
            Nd.g key2 = getKey();
            Intrinsics.echo(key2, "key");
            if ((key2 == c3219x || c3219x.purple == key2) && (fVar = (Nd.f) c3219x.alpha.invoke(this)) != null) {
                return fVar;
            }
            return null;
        }
        if (Nd.d.alpha == key) {
            return this;
        }
        return null;
    }

    public void green(Nd.h hVar, Runnable runnable) {
        Af.f.hotel(this, hVar, runnable);
    }

    public boolean indigo(Nd.h hVar) {
        return !(this instanceof g0);
    }

    public AbstractC3220y jade(int i4) {
        Af.f.alpha(i4);
        return new Af.g(this, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    @Override // Nd.a, Nd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Nd.h minusKey(Nd.g key) {
        Intrinsics.echo(key, "key");
        boolean z2 = key instanceof C3219x;
        Nd.i iVar = Nd.i.alpha;
        if (z2) {
            C3219x c3219x = (C3219x) key;
            Nd.g key2 = getKey();
            Intrinsics.echo(key2, "key");
            if (key2 != c3219x && c3219x.purple != key2) {
                return this;
            }
            if (((Nd.f) c3219x.alpha.invoke(this)) != null) {
                return iVar;
            }
            return this;
        }
        if (Nd.d.alpha == key) {
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ad.romeo(this);
    }
}
