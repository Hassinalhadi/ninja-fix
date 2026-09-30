package J3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class m implements com.bumptech.glide.load.data.e {
    public static final String[] silver = {"_data"};
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;

    public /* synthetic */ m(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
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
                return File.class;
            default:
                return ((ab) this.red).bravo();
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
        Object wrap;
        switch (this.alpha) {
            case 0:
                Cursor query = ((Context) this.purple).getContentResolver().query((Uri) this.red, silver, null, null, null);
                String str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    dVar.bravo(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.red)));
                    return;
                }
                dVar.echo(new File(str));
                return;
            default:
                ab abVar = (ab) this.red;
                byte[] bArr = (byte[]) this.purple;
                switch (abVar.alpha) {
                    case 1:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.echo(wrap);
                return;
        }
    }
}
