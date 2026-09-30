package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class b implements E3.l {
    public static final E3.h purple = E3.h.alpha(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final E3.h red = new E3.h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, E3.h.echo);
    public final G3.g alpha;

    public b(G3.g gVar) {
        this.alpha = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // E3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean azure(Object obj, File file, E3.i iVar) {
        boolean z2;
        Bitmap bitmap = (Bitmap) ((com.bumptech.glide.load.engine.w) obj).get();
        E3.h hVar = red;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.charlie(hVar);
        if (compressFormat == null) {
            if (bitmap.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i4 = Y3.h.bravo;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) iVar.charlie(purple)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                G3.g gVar = this.alpha;
                if (gVar != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.c(fileOutputStream, gVar);
                    } catch (IOException e) {
                        e = e;
                        outputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z2 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z2;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
                z2 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Y3.l.charlie(bitmap) + " in " + Y3.h.alpha(elapsedRealtimeNanos) + ", options format: " + iVar.charlie(hVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z2;
    }

    @Override // E3.l
    public final int beige(E3.i iVar) {
        return 2;
    }
}
