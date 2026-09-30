package com.clevertap.android.sdk.inapp.images.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.inapp.images.ExtensionsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.C2361k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\"'\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"'\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"'\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Ljava/io/File;", "Landroid/graphics/Bitmap;", "fileToBitmap", "Lkotlin/jvm/functions/Function1;", "getFileToBitmap", "()Lkotlin/jvm/functions/Function1;", "", "fileToBytes", "getFileToBytes", "bytesToBitmap", "getBytesToBitmap", "bitmapToBytes", "getBitmapToBytes", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryAccessObjectKt {

    @NotNull
    private static final Function1<File, Bitmap> fileToBitmap = new C2361k(7);

    @NotNull
    private static final Function1<File, byte[]> fileToBytes = new C2361k(8);

    @NotNull
    private static final Function1<byte[], Bitmap> bytesToBitmap = new C2361k(9);

    @NotNull
    private static final Function1<Bitmap, byte[]> bitmapToBytes = new C2361k(10);

    public static /* synthetic */ byte[] alpha(File file) {
        return fileToBytes$lambda$1(file);
    }

    public static final byte[] bitmapToBytes$lambda$4(Bitmap bitmap) {
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public static /* synthetic */ byte[] bravo(Bitmap bitmap) {
        return bitmapToBytes$lambda$4(bitmap);
    }

    public static final Bitmap bytesToBitmap$lambda$2(byte[] it) {
        Intrinsics.echo(it, "it");
        return BitmapFactory.decodeByteArray(it, 0, it.length);
    }

    public static /* synthetic */ Bitmap charlie(File file) {
        return fileToBitmap$lambda$0(file);
    }

    public static /* synthetic */ Bitmap delta(byte[] bArr) {
        return bytesToBitmap$lambda$2(bArr);
    }

    public static final Bitmap fileToBitmap$lambda$0(File file) {
        if (file != null && ExtensionsKt.hasValidBitmap(file)) {
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        return null;
    }

    public static final byte[] fileToBytes$lambda$1(File file) {
        if (file != null) {
            return FilesKt.india(file);
        }
        return null;
    }

    @NotNull
    public static final Function1<Bitmap, byte[]> getBitmapToBytes() {
        return bitmapToBytes;
    }

    @NotNull
    public static final Function1<byte[], Bitmap> getBytesToBitmap() {
        return bytesToBitmap;
    }

    @NotNull
    public static final Function1<File, Bitmap> getFileToBitmap() {
        return fileToBitmap;
    }

    @NotNull
    public static final Function1<File, byte[]> getFileToBytes() {
        return fileToBytes;
    }
}
