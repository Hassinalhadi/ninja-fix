package com.squareup.moshi;

/* loaded from: classes2.dex */
public final class aa extends Tf.w {
    public final /* synthetic */ Tf.k alpha;
    public final /* synthetic */ ab purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ab abVar, Tf.k kVar, Tf.k kVar2) {
        super(kVar);
        this.purple = abVar;
        this.alpha = kVar2;
    }

    @Override // Tf.w, Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ab abVar = this.purple;
        if (abVar.peekScope() == 9) {
            Object[] objArr = abVar.alpha;
            int i4 = abVar.stackSize;
            if (objArr[i4] == null) {
                abVar.stackSize = i4 - 1;
                Object readJsonValue = JsonReader.of(this.alpha).readJsonValue();
                boolean z2 = abVar.serializeNulls;
                abVar.serializeNulls = true;
                try {
                    abVar.charlie(readJsonValue);
                    abVar.serializeNulls = z2;
                    int[] iArr = abVar.pathIndices;
                    int i5 = abVar.stackSize - 1;
                    iArr[i5] = iArr[i5] + 1;
                    return;
                } catch (Throwable th) {
                    abVar.serializeNulls = z2;
                    throw th;
                }
            }
        }
        throw new AssertionError();
    }
}
