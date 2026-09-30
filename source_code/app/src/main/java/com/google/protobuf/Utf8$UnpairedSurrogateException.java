package com.google.protobuf;

/* loaded from: classes2.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i4, int i5) {
        super(A0.z.juliet("Unpaired surrogate at index ", i4, i5, " of "));
    }
}
