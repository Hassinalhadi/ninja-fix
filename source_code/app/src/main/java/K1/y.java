package K1;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class y {
    public static final ThreadLocal delta = new ThreadLocal();
    public final int alpha;
    public final com.google.firebase.messaging.o bravo;
    public volatile int charlie = 0;

    public y(com.google.firebase.messaging.o oVar, int i4) {
        this.bravo = oVar;
        this.alpha = i4;
    }

    public final int alpha(int i4) {
        androidx.emoji2.text.flatbuffer.a bravo = bravo();
        int alpha = bravo.alpha(16);
        if (alpha != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) bravo.silver;
            int i5 = alpha + bravo.alpha;
            return byteBuffer.getInt((i4 * 4) + byteBuffer.getInt(i5) + i5 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Ld.f, java.lang.Object] */
    public final androidx.emoji2.text.flatbuffer.a bravo() {
        ThreadLocal threadLocal = delta;
        androidx.emoji2.text.flatbuffer.a aVar = (androidx.emoji2.text.flatbuffer.a) threadLocal.get();
        androidx.emoji2.text.flatbuffer.a aVar2 = aVar;
        if (aVar == null) {
            ?? fVar = new Ld.f();
            threadLocal.set(fVar);
            aVar2 = fVar;
        }
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) this.bravo.alpha;
        int alpha = bVar.alpha(6);
        if (alpha != 0) {
            int i4 = alpha + bVar.alpha;
            int i5 = (this.alpha * 4) + ((ByteBuffer) bVar.silver).getInt(i4) + i4 + 4;
            int i10 = ((ByteBuffer) bVar.silver).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.silver;
            aVar2.silver = byteBuffer;
            if (byteBuffer != null) {
                aVar2.alpha = i10;
                int i11 = i10 - byteBuffer.getInt(i10);
                aVar2.purple = i11;
                aVar2.red = ((ByteBuffer) aVar2.silver).getShort(i11);
                return aVar2;
            }
            aVar2.alpha = 0;
            aVar2.purple = 0;
            aVar2.red = 0;
        }
        return aVar2;
    }

    public final String toString() {
        int i4;
        int i5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        androidx.emoji2.text.flatbuffer.a bravo = bravo();
        int alpha = bravo.alpha(4);
        if (alpha != 0) {
            i4 = ((ByteBuffer) bravo.silver).getInt(alpha + bravo.alpha);
        } else {
            i4 = 0;
        }
        sb2.append(Integer.toHexString(i4));
        sb2.append(", codepoints:");
        androidx.emoji2.text.flatbuffer.a bravo2 = bravo();
        int alpha2 = bravo2.alpha(16);
        if (alpha2 != 0) {
            int i10 = alpha2 + bravo2.alpha;
            i5 = ((ByteBuffer) bravo2.silver).getInt(((ByteBuffer) bravo2.silver).getInt(i10) + i10);
        } else {
            i5 = 0;
        }
        for (int i11 = 0; i11 < i5; i11++) {
            sb2.append(Integer.toHexString(alpha(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
