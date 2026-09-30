package F3;

import J3.ab;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.i;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import s6.H4;

/* loaded from: classes3.dex */
public final class b implements e {
    public final /* synthetic */ int alpha;
    public final Comparable purple;
    public final Object red;
    public Object silver;

    public /* synthetic */ b(int i4, Comparable comparable, Object obj) {
        this.alpha = i4;
        this.purple = comparable;
        this.red = obj;
    }

    public static b bravo(Context context, Uri uri, c cVar) {
        return new b(0, uri, new d(com.bumptech.glide.b.alpha(context).red.bravo().foxtrot(), cVar, com.bumptech.glide.b.alpha(context).silver, context.getContentResolver()));
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
                return InputStream.class;
            case 1:
                ((ab) this.red).getClass();
                return InputStream.class;
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
            case 1:
                return E3.a.alpha;
            default:
                return E3.a.alpha;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        switch (this.alpha) {
            case 0:
                InputStream inputStream = (InputStream) this.silver;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            case 1:
                try {
                    ((ByteArrayInputStream) this.silver).close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.silver;
                if (obj != null) {
                    try {
                        switch (((ab) this.red).alpha) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(g gVar, com.bumptech.glide.load.data.d dVar) {
        Object open;
        switch (this.alpha) {
            case 0:
                try {
                    InputStream hotel = hotel();
                    this.silver = hotel;
                    dVar.echo(hotel);
                    return;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
                    }
                    dVar.bravo(e);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream alpha = ab.alpha((String) this.purple);
                    this.silver = alpha;
                    dVar.echo(alpha);
                    return;
                } catch (IllegalArgumentException e4) {
                    dVar.bravo(e4);
                    return;
                }
            default:
                try {
                    ab abVar = (ab) this.red;
                    File file = (File) this.purple;
                    switch (abVar.alpha) {
                        case 8:
                            open = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            open = new FileInputStream(file);
                            break;
                    }
                    this.silver = open;
                    dVar.echo(open);
                    return;
                } catch (FileNotFoundException e5) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e5);
                    }
                    dVar.bravo(e5);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004c, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0026: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:39), block:B:68:0x0026 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream hotel() {
        Cursor cursor;
        ?? r62;
        InputStream openInputStream;
        int i4;
        Uri uri = (Uri) this.purple;
        d dVar = (d) this.red;
        ?? r5 = 0;
        InputStream inputStream = null;
        try {
            try {
                cursor = dVar.alpha.alpha(uri);
            } catch (Throwable th) {
                th = th;
                r5 = r62;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SecurityException e) {
            e = e;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r5 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            try {
            } catch (SecurityException e4) {
                e = e4;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
            }
            if (cursor.moveToFirst()) {
                String str = cursor.getString(0);
                cursor.close();
                boolean isEmpty = TextUtils.isEmpty(str);
                ContentResolver contentResolver = dVar.charlie;
                if (!isEmpty) {
                    File file = new File(str);
                    if (file.exists() && 0 < file.length()) {
                        Uri fromFile = Uri.fromFile(file);
                        try {
                            openInputStream = contentResolver.openInputStream(fromFile);
                            if (openInputStream != null) {
                                try {
                                    try {
                                        inputStream = contentResolver.openInputStream(uri);
                                        i4 = H4.bravo(dVar.delta, inputStream, dVar.bravo);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (0 != 0) {
                                            try {
                                                r5.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th3;
                                    }
                                } catch (IOException | NullPointerException e5) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e5);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                }
                                if (i4 != -1) {
                                    return new i(openInputStream, i4);
                                }
                                return openInputStream;
                            }
                            i4 = -1;
                            if (i4 != -1) {
                            }
                        } catch (NullPointerException e10) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
                        }
                    }
                }
                openInputStream = null;
                if (openInputStream != null) {
                }
                i4 = -1;
                if (i4 != -1) {
                }
            }
        }
    }
}
