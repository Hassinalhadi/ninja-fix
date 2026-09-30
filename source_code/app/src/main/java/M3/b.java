package M3;

import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.bumptech.glide.load.resource.bitmap.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class b implements g, k, E3.g {
    public final ByteBuffer alpha;

    public b(ByteBuffer byteBuffer, int i4) {
        switch (i4) {
            case 1:
                this.alpha = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
            default:
                this.alpha = byteBuffer;
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object alpha() {
        ByteBuffer byteBuffer = this.alpha;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }

    @Override // E3.g
    public void echo(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l10 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.alpha) {
            this.alpha.position(0);
            messageDigest.update(this.alpha.putLong(l10.longValue()).array());
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public long india(long j5) {
        ByteBuffer byteBuffer = this.alpha;
        int min = (int) Math.min(byteBuffer.remaining(), j5);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public int mike() {
        return (sierra() << 8) | sierra();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public short sierra() {
        ByteBuffer byteBuffer = this.alpha;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.k
    public int tango(int i4, byte[] bArr) {
        ByteBuffer byteBuffer = this.alpha;
        int min = Math.min(i4, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    public b() {
        this.alpha = ByteBuffer.allocate(8);
    }
}
