package com.google.android.libraries.barhopper;

import a9.C0416a;
import android.graphics.Bitmap;
import android.util.Log;
import ao.ad;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.H;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.aa;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ac;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import q7.C2416a;

/* loaded from: classes2.dex */
public class BarhopperV3 implements Closeable, AutoCloseable {
    public long alpha;

    private native void closeNative(long j5);

    private native long createNativeWithClientOptions(byte[] bArr);

    public static C0416a juliet(byte[] bArr) {
        bArr.getClass();
        try {
            ac acVar = ac.bravo;
            H h4 = H.charlie;
            return C0416a.november(bArr, ac.bravo);
        } catch (zzer e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native byte[] recognizeBitmapNative(long j5, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j5, int i4, int i5, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j5, int i4, int i5, byte[] bArr, RecognitionOptions recognitionOptions);

    public final void charlie(C2416a c2416a) {
        if (this.alpha != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        try {
            int charlie = c2416a.charlie();
            byte[] bArr = new byte[charlie];
            aa aaVar = new aa(charlie, bArr);
            c2416a.lima(aaVar);
            if (charlie - aaVar.delta == 0) {
                long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.alpha = createNativeWithClientOptions;
                if (createNativeWithClientOptions != 0) {
                    return;
                } else {
                    throw new IllegalArgumentException("Failed to create native pointer with client options.");
                }
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(ad.gray("Serializing ", C2416a.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j5 = this.alpha;
        if (j5 != 0) {
            closeNative(j5);
            this.alpha = 0L;
        }
    }

    public final C0416a echo(int i4, int i5, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j5 = this.alpha;
        if (j5 != 0) {
            return juliet(recognizeBufferNative(j5, i4, i5, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public final C0416a foxtrot(int i4, int i5, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j5 = this.alpha;
        if (j5 != 0) {
            return juliet(recognizeNative(j5, i4, i5, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public final C0416a golf(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.alpha != 0) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(config2, bitmap.isMutable());
            }
            return juliet(recognizeBitmapNative(this.alpha, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }
}
