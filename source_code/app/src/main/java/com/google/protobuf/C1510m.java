package com.google.protobuf;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510m implements ai {
    public static final C1510m bravo = new C1510m(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1510m(int i4) {
        this.alpha = i4;
    }

    @Override // com.google.protobuf.ai
    public final at alpha(Class cls) {
        switch (this.alpha) {
            case 0:
                if (AbstractC1513p.class.isAssignableFrom(cls)) {
                    try {
                        return (at) AbstractC1513p.kilo(cls.asSubclass(AbstractC1513p.class)).juliet(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.ai
    public final boolean bravo(Class cls) {
        switch (this.alpha) {
            case 0:
                return AbstractC1513p.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
