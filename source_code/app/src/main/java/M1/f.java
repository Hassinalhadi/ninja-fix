package M1;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.alpha.mark(LottieConstants.IterateForever);
    }

    public final void echo(long j5) {
        int i4 = this.purple;
        if (i4 > j5) {
            this.purple = 0;
            this.alpha.reset();
        } else {
            j5 -= i4;
        }
        charlie((int) j5);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.alpha.mark(LottieConstants.IterateForever);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
