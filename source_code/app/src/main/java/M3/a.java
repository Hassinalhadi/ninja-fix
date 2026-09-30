package M3;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a implements f {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class alpha() {
        switch (this.alpha) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return new b((ByteBuffer) obj, 0);
            case 1:
                return new h(obj);
            default:
                return new h((ParcelFileDescriptor) obj);
        }
    }
}
