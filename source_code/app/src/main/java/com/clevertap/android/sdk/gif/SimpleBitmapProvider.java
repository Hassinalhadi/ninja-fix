package com.clevertap.android.sdk.gif;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.gif.GifDecoder;

/* loaded from: classes3.dex */
public class SimpleBitmapProvider implements GifDecoder.BitmapProvider {
    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public Bitmap obtain(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public byte[] obtainByteArray(int i4) {
        return new byte[i4];
    }

    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public int[] obtainIntArray(int i4) {
        return new int[i4];
    }

    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public void release(byte[] bArr) {
    }

    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public void release(int[] iArr) {
    }

    @Override // com.clevertap.android.sdk.gif.GifDecoder.BitmapProvider
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
