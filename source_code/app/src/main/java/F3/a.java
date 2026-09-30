package F3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes3.dex */
public final class a implements c {
    public static final String[] charlie = {"_data"};
    public static final String[] delta = {"_data"};
    public final /* synthetic */ int alpha;
    public final ContentResolver bravo;

    public /* synthetic */ a(ContentResolver contentResolver, int i4) {
        this.alpha = i4;
        this.bravo = contentResolver;
    }

    @Override // F3.c
    public final Cursor alpha(Uri uri) {
        switch (this.alpha) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.bravo.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, charlie, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.bravo.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, delta, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
