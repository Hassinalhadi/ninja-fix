package J3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ab implements s, E3.c {
    public static final ab purple = new ab(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ ab(int i4) {
        this.alpha = i4;
    }

    public static ByteArrayInputStream alpha(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    @Override // E3.c
    public boolean azure(Object obj, File file, E3.i iVar) {
        try {
            Y3.b.delta((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
                return false;
            }
            return false;
        }
    }

    public Class bravo() {
        switch (this.alpha) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // J3.s
    public r sierra(x xVar) {
        switch (this.alpha) {
            case 0:
                return ac.bravo;
            case 2:
                return new c(0, new ab(1));
            case 4:
                return new c(0, new ab(3));
            case 6:
                return new ac(1);
            case 11:
                return new aa(xVar.bravo(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new aa(xVar.bravo(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new aa(xVar.bravo(Uri.class, InputStream.class), 0);
            default:
                return new ag(xVar.bravo(h.class, InputStream.class));
        }
    }
}
