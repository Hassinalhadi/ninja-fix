package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1483a implements ao {
    protected int memoizedHashCode;

    public final String alpha(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] bravo() {
        try {
            x xVar = (x) this;
            int foxtrot = xVar.foxtrot();
            byte[] bArr = new byte[foxtrot];
            C1494l c1494l = new C1494l(foxtrot, bArr);
            xVar.lima(c1494l);
            if (foxtrot - c1494l.delta == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(alpha("byte array"), e);
        }
    }
}
