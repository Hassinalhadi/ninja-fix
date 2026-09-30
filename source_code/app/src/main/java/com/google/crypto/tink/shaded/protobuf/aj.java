package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class aj implements an {
    public an[] alpha;

    @Override // com.google.crypto.tink.shaded.protobuf.an
    public final ay alpha(Class cls) {
        for (an anVar : this.alpha) {
            if (anVar.bravo(cls)) {
                return anVar.alpha(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.an
    public final boolean bravo(Class cls) {
        for (an anVar : this.alpha) {
            if (anVar.bravo(cls)) {
                return true;
            }
        }
        return false;
    }
}
