package P3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;
import s6.H4;

/* loaded from: classes3.dex */
public final class k implements E3.k {
    public final ArrayList alpha;
    public final a bravo;
    public final G3.g charlie;

    public k(ArrayList arrayList, a aVar, G3.g gVar) {
        this.alpha = arrayList;
        this.bravo = aVar;
        this.charlie = gVar;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, E3.i iVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) iVar.charlie(j.bravo)).booleanValue() && H4.charlie(this.alpha, inputStream, this.charlie) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // E3.k
    public final w bravo(Object obj, int i4, int i5, E3.i iVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr2 = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.bravo.bravo(ByteBuffer.wrap(bArr), i4, i5, iVar);
    }
}
