package K3;

import E3.i;
import J3.q;
import J3.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import java.io.File;
import java.io.FileNotFoundException;
import s6.L4;

/* loaded from: classes3.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1671d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Class f1672a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f1673b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.e f1674c;
    public final r purple;
    public final r red;
    public final Uri silver;
    public final int teal;
    public final int white;
    public final i yellow;

    public d(Context context, r rVar, r rVar2, Uri uri, int i4, int i5, i iVar, Class cls) {
        this.alpha = context.getApplicationContext();
        this.purple = rVar;
        this.red = rVar2;
        this.silver = uri;
        this.teal = i4;
        this.white = i5;
        this.yellow = iVar;
        this.f1672a = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        return this.f1672a;
    }

    public final com.bumptech.glide.load.data.e bravo() {
        boolean isExternalStorageLegacy;
        q alpha;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.alpha;
        i iVar = this.yellow;
        int i4 = this.white;
        int i5 = this.teal;
        if (isExternalStorageLegacy) {
            Uri uri = this.silver;
            try {
                Cursor query = context.getContentResolver().query(uri, f1671d, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                alpha = this.purple.alpha(file, i5, i4, iVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.silver;
            boolean bravo = L4.bravo(uri2);
            r rVar = this.red;
            if (bravo && uri2.getPathSegments().contains("picker")) {
                alpha = rVar.alpha(uri2, i5, i4, iVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                alpha = rVar.alpha(uri2, i5, i4, iVar);
            }
        }
        if (alpha == null) {
            return null;
        }
        return alpha.charlie;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f1673b = true;
        com.bumptech.glide.load.data.e eVar = this.f1674c;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        return E3.a.alpha;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        com.bumptech.glide.load.data.e eVar = this.f1674c;
        if (eVar != null) {
            eVar.cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            com.bumptech.glide.load.data.e bravo = bravo();
            if (bravo == null) {
                dVar.bravo(new IllegalArgumentException("Failed to build fetcher for: " + this.silver));
            } else {
                this.f1674c = bravo;
                if (this.f1673b) {
                    cancel();
                } else {
                    bravo.delta(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e) {
            dVar.bravo(e);
        }
    }
}
