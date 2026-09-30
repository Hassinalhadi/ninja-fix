package s6;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* loaded from: classes2.dex */
public abstract class Y5 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Type inference failed for: r0v14, types: [Ld.f, androidx.emoji2.text.flatbuffer.b] */
    public static androidx.emoji2.text.flatbuffer.b alpha(MappedByteBuffer mappedByteBuffer) {
        long j5;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i4 = duplicate.getShort() & 65535;
        if (i4 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    int i10 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j5 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i10) {
                        break;
                    }
                    i5++;
                } else {
                    j5 = -1;
                    break;
                }
            }
            if (j5 != -1) {
                duplicate.position(duplicate.position() + ((int) (j5 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j6 = duplicate.getInt() & 4294967295L;
                for (int i11 = 0; i11 < j6; i11++) {
                    int i12 = duplicate.getInt();
                    long j7 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i12 || 1701669481 == i12) {
                        duplicate.position((int) (j7 + j5));
                        ?? fVar = new Ld.f();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        fVar.silver = duplicate;
                        fVar.alpha = position;
                        int i13 = position - duplicate.getInt(position);
                        fVar.purple = i13;
                        fVar.red = ((ByteBuffer) fVar.silver).getShort(i13);
                        return fVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
