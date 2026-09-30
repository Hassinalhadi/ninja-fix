package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ab implements E3.k {
    public static final E3.h delta = new E3.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new M3.b());
    public static final E3.h echo = new E3.h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new androidx.core.widget.f(21));
    public static final g7.f foxtrot = new g7.f(19);
    public static final List golf = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final aa alpha;
    public final G3.b bravo;
    public final g7.f charlie = foxtrot;

    public ab(G3.b bVar, aa aaVar) {
        this.bravo = bVar;
        this.alpha = aaVar;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, E3.i iVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E3.k
    public final com.bumptech.glide.load.engine.w bravo(Object obj, int i4, int i5, E3.i iVar) {
        long longValue = ((Long) iVar.charlie(delta)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(A0.z.india(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) iVar.charlie(echo);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) iVar.charlie(m.golf);
        if (mVar == null) {
            mVar = m.foxtrot;
        }
        m mVar2 = mVar;
        this.charlie.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.alpha.juliet(mediaMetadataRetriever, obj);
            try {
                Bitmap charlie = charlie(obj, mediaMetadataRetriever, longValue, num.intValue(), i4, i5, mVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (mediaMetadataRetriever instanceof AutoCloseable) {
                        mediaMetadataRetriever.close();
                    } else if (mediaMetadataRetriever instanceof ExecutorService) {
                        h9.z.tango((ExecutorService) mediaMetadataRetriever);
                    } else {
                        mediaMetadataRetriever.release();
                    }
                } else {
                    mediaMetadataRetriever.release();
                }
                return c.charlie(this.bravo, charlie);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    if (!(mediaMetadataRetriever instanceof AutoCloseable)) {
                        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
                            mediaMetadataRetriever.release();
                            throw th2;
                        }
                        h9.z.tango((ExecutorService) mediaMetadataRetriever);
                        throw th2;
                    }
                    mediaMetadataRetriever.close();
                    throw th2;
                }
                mediaMetadataRetriever.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(4:5|6|7|(1:9)(6:10|11|12|(2:14|(1:16)(3:17|18|19))|22|23))|38|(5:45|46|47|(1:53)|51)|(1:59)|60|(3:93|(0)|(1:76)(2:77|78))(4:64|(3:67|(1:69)(1:91)|65)|92|(0)(0))|70|71|72|(3:80|81|(3:83|(1:85)|86))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0181, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010e, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap charlie(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j5, int i4, int i5, int i10, m mVar) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.alpha.foxtrot(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i11 = 0; i11 < trackCount; i11++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i11).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                        }
                    } catch (Throwable th3) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th3;
                    }
                }
                mediaExtractor.release();
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i5 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && mVar != m.echo) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float bravo = mVar.bravo(parseInt, parseInt2, i5, i10);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j5, i4, Math.round(parseInt * bravo), Math.round(bravo * parseInt2));
            } catch (Throwable th4) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th4);
                }
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j5, i4);
        }
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = golf.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith((String) it.next())) {
                }
            }
            if (bitmap != null) {
            }
        } else {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new RuntimeException() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
                private static final long serialVersionUID = -2556382523004027815L;
            };
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt4 = Integer.parseInt(extractMetadata);
        int parseInt5 = Integer.parseInt(extractMetadata2);
        if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
            if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }
}
