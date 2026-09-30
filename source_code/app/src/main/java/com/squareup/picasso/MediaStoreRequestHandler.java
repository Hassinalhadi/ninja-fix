package com.squareup.picasso;

import Tf.b;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.clevertap.android.sdk.Constants;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaStoreRequestHandler extends ContentStreamRequestHandler {
    private static final String[] CONTENT_ORIENTATION = {Constants.KEY_ORIENTATION};

    /* loaded from: classes2.dex */
    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i4, int i5, int i10) {
            this.androidKind = i4;
            this.width = i5;
            this.height = i10;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getExifOrientation(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, CONTENT_ORIENTATION, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i4 = cursor.getInt(0);
                cursor.close();
                return i4;
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
                throw th;
            }
            throw th;
        }
    }

    public static PicassoKind getPicassoKind(int i4, int i5) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i4 <= picassoKind.width && i5 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        if (i4 <= picassoKind2.width && i5 <= picassoKind2.height) {
            return picassoKind2;
        }
        return PicassoKind.FULL;
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        if (Constants.KEY_CONTENT.equals(uri.getScheme()) && Constants.KEY_MEDIA.equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i4) throws IOException {
        boolean z2;
        Request request2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.context.getContentResolver();
        int exifOrientation = getExifOrientation(contentResolver, request.uri);
        String type = contentResolver.getType(request.uri);
        int i5 = 1;
        if (type != null && type.startsWith("video/")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (request.hasSize()) {
            PicassoKind picassoKind = getPicassoKind(request.targetWidth, request.targetHeight);
            if (!z2 && picassoKind == PicassoKind.FULL) {
                return new RequestHandler.Result(null, b.juliet(getInputStream(request)), Picasso.LoadedFrom.DISK, exifOrientation);
            }
            long parseId = ContentUris.parseId(request.uri);
            BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
            createBitmapOptions.inJustDecodeBounds = true;
            request2 = request;
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, picassoKind.width, picassoKind.height, createBitmapOptions, request2);
            if (z2) {
                if (picassoKind != PicassoKind.FULL) {
                    i5 = picassoKind.androidKind;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i5, createBitmapOptions);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind.androidKind, createBitmapOptions);
            }
            if (thumbnail != null) {
                return new RequestHandler.Result(thumbnail, null, Picasso.LoadedFrom.DISK, exifOrientation);
            }
        } else {
            request2 = request;
        }
        return new RequestHandler.Result(null, b.juliet(getInputStream(request2)), Picasso.LoadedFrom.DISK, exifOrientation);
    }
}
