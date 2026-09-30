package Q3;

import E3.i;
import P3.h;
import S5.l;
import com.bumptech.glide.load.engine.w;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements a {
    public static final d purple = new d(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ d(int i4) {
        this.alpha = i4;
    }

    @Override // Q3.a
    public final w alpha(w wVar, i iVar) {
        l lVar;
        byte[] bArr;
        switch (this.alpha) {
            case 0:
                return wVar;
            default:
                ByteBuffer asReadOnlyBuffer = ((h) ((P3.c) wVar.get()).alpha.bravo).alpha.delta.asReadOnlyBuffer();
                AtomicReference atomicReference = Y3.b.alpha;
                if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
                    lVar = new l(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit(), 1);
                } else {
                    lVar = null;
                }
                if (lVar != null && lVar.purple == 0) {
                    if (lVar.red == ((byte[]) lVar.silver).length) {
                        bArr = asReadOnlyBuffer.array();
                        return new M3.c(bArr);
                    }
                }
                ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                asReadOnlyBuffer2.get(bArr2);
                bArr = bArr2;
                return new M3.c(bArr);
        }
    }
}
