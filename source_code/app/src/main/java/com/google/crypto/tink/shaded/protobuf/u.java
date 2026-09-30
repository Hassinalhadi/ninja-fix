package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class u implements an {
    public static final u bravo = new u(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ u(int i4) {
        this.alpha = i4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.an
    public final ay alpha(Class cls) {
        switch (this.alpha) {
            case 0:
                if (x.class.isAssignableFrom(cls)) {
                    try {
                        return (ay) x.echo(cls.asSubclass(x.class)).delta(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.an
    public final boolean bravo(Class cls) {
        switch (this.alpha) {
            case 0:
                return x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
