package com.google.mlkit.vision.barcode;

import X8.a;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.lifecycle.B;
import androidx.lifecycle.aa;
import androidx.lifecycle.ak;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.nio.ByteBuffer;
import n7.AbstractC2162a;

/* loaded from: classes2.dex */
public interface BarcodeScanner extends Closeable, ak, l {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @B(aa.ON_DESTROY)
    void close();

    /* synthetic */ int getDetectorType();

    @Override // com.google.android.gms.common.api.l
    /* synthetic */ Feature[] getOptionalFeatures();

    Task process(a aVar);

    /* synthetic */ Task process(Bitmap bitmap, int i4);

    /* synthetic */ Task process(Image image, int i4);

    /* synthetic */ Task process(Image image, int i4, Matrix matrix);

    /* synthetic */ Task process(ByteBuffer byteBuffer, int i4, int i5, int i10, int i11);

    Task process(AbstractC2162a abstractC2162a);
}
