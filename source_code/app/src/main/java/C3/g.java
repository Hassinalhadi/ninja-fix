package C3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class g extends ByteArrayOutputStream {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Closeable purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Closeable closeable, int i4, int i5) {
        super(i4);
        this.alpha = i5;
        this.purple = closeable;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        switch (this.alpha) {
            case 0:
                int i4 = ((ByteArrayOutputStream) this).count;
                if (i4 > 0 && ((ByteArrayOutputStream) this).buf[i4 - 1] == 13) {
                    i4--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i4, ((h) this.purple).red.name());
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            default:
                int i5 = ((ByteArrayOutputStream) this).count;
                if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                    i5--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i5, ((h) this.purple).red.name());
                } catch (UnsupportedEncodingException e4) {
                    throw new AssertionError(e4);
                }
        }
    }
}
