package a0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai extends ao {
    public final Z.c echo;

    public ai(Z.c cVar) {
        this.echo = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        if (Intrinsics.areEqual(this.echo, ((ai) obj).echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.echo.hashCode();
    }

    @Override // a0.ao
    public final Z.c oscar() {
        return this.echo;
    }
}
