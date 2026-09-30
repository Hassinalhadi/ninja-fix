package androidx.emoji2.text.flatbuffer;

import A0.z;

/* loaded from: classes3.dex */
class Utf8Safe$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8Safe$UnpairedSurrogateException(int i4, int i5) {
        super(z.juliet("Unpaired surrogate at index ", i4, i5, " of "));
    }
}
