package J3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class d implements com.bumptech.glide.load.data.e {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void bravo() {
    }

    private final void echo() {
    }

    private final void foxtrot() {
    }

    private final void golf() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        switch (this.alpha) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.purple.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i4 = this.alpha;
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        switch (this.alpha) {
            case 0:
                return E3.a.alpha;
            default:
                return E3.a.alpha;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        int i4 = this.alpha;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.alpha) {
            case 0:
                try {
                    dVar.echo(Y3.b.alpha((File) this.purple));
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    dVar.bravo(e);
                    return;
                }
            default:
                dVar.echo(this.purple);
                return;
        }
    }
}
