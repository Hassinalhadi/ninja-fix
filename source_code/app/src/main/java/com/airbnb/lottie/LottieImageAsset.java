package com.airbnb.lottie;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class LottieImageAsset {
    private Bitmap bitmap;
    private final String dirName;
    private final String fileName;
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final String f3496id;
    private final int width;

    public LottieImageAsset(int i4, int i5, String str, String str2, String str3) {
        this.width = i4;
        this.height = i5;
        this.f3496id = str;
        this.fileName = str2;
        this.dirName = str3;
    }

    public LottieImageAsset copyWithScale(float f5) {
        LottieImageAsset lottieImageAsset = new LottieImageAsset((int) (this.width * f5), (int) (this.height * f5), this.f3496id, this.fileName, this.dirName);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            lottieImageAsset.setBitmap(Bitmap.createScaledBitmap(bitmap, lottieImageAsset.width, lottieImageAsset.height, true));
        }
        return lottieImageAsset;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDirName() {
        return this.dirName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f3496id;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasBitmap() {
        if (this.bitmap == null) {
            if (!this.fileName.startsWith("data:") || this.fileName.indexOf("base64,") <= 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
