package com.google.protobuf;

/* loaded from: classes2.dex */
public final class ab implements ai {
    public ai[] alpha;

    @Override // com.google.protobuf.ai
    public final at alpha(Class cls) {
        for (ai aiVar : this.alpha) {
            if (aiVar.bravo(cls)) {
                return aiVar.alpha(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.ai
    public final boolean bravo(Class cls) {
        for (ai aiVar : this.alpha) {
            if (aiVar.bravo(cls)) {
                return true;
            }
        }
        return false;
    }
}
