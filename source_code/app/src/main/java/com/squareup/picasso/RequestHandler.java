package com.squareup.picasso;

import Tf.ap;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class RequestHandler {

    /* loaded from: classes2.dex */
    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final ap source;

        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getExifOrientation() {
            return this.exifOrientation;
        }

        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        public ap getSource() {
            return this.source;
        }

        public Result(ap apVar, Picasso.LoadedFrom loadedFrom) {
            this(null, (ap) Utils.checkNotNull(apVar, "source == null"), loadedFrom, 0);
        }

        public Result(Bitmap bitmap, ap apVar, Picasso.LoadedFrom loadedFrom, int i4) {
            if ((bitmap != null) != (apVar != null)) {
                this.bitmap = bitmap;
                this.source = apVar;
                this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i4;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void calculateInSampleSize(int i4, int i5, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i4, i5, options.outWidth, options.outHeight, options, request);
    }

    public static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean z2;
        boolean hasSize = request.hasSize();
        if (request.config != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!hasSize && !z2 && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        boolean z10 = request.purgeable;
        options.inInputShareable = z10;
        options.inPurgeable = z10;
        if (z2) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        if (options != null && options.inJustDecodeBounds) {
            return true;
        }
        return false;
    }

    public abstract boolean canHandleRequest(Request request);

    public int getRetryCount() {
        return 0;
    }

    public abstract Result load(Request request, int i4) throws IOException;

    public boolean shouldRetry(boolean z2, NetworkInfo networkInfo) {
        return false;
    }

    public boolean supportsReplay() {
        return false;
    }

    public static void calculateInSampleSize(int i4, int i5, int i10, int i11, BitmapFactory.Options options, Request request) {
        int min;
        double floor;
        if (i11 > i5 || i10 > i4) {
            if (i5 == 0) {
                floor = Math.floor(i10 / i4);
            } else if (i4 == 0) {
                floor = Math.floor(i11 / i5);
            } else {
                int floor2 = (int) Math.floor(i11 / i5);
                int floor3 = (int) Math.floor(i10 / i4);
                if (request.centerInside) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }
}
