package com.canhub.cropper;

import a4.m;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/canhub/cropper/CropException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "<init>", "(Ljava/lang/String;)V", "Companion", "Cancellation", "a4/m", "FailedToDecodeImage", "FailedToLoadBitmap", "Lcom/canhub/cropper/CropException$Cancellation;", "Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CropException extends Exception {

    @NotNull
    public static final m Companion = new Object();

    @NotNull
    public static final String EXCEPTION_PREFIX = "crop:";
    private static final long serialVersionUID = 4933890872862969613L;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropException$Cancellation;", "Lcom/canhub/cropper/CropException;", "<init>", "()V", "Companion", "com/canhub/cropper/a", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Cancellation extends CropException {

        @NotNull
        public static final a Companion = new Object();
        private static final long serialVersionUID = -6896269134508601990L;

        public Cancellation() {
            super("crop: cropping has been cancelled by the user", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Companion", "com/canhub/cropper/b", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FailedToDecodeImage extends CropException {

        @NotNull
        public static final b Companion = new Object();
        private static final long serialVersionUID = 3516154387706407275L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToDecodeImage(@NotNull Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            Intrinsics.echo(uri, "uri");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "Lcom/canhub/cropper/CropException;", "Landroid/net/Uri;", "uri", "", Constants.KEY_MESSAGE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "Companion", "com/canhub/cropper/c", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FailedToLoadBitmap extends CropException {

        @NotNull
        public static final c Companion = new Object();
        private static final long serialVersionUID = 7791142932960927332L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToLoadBitmap(@NotNull Uri uri, @Nullable String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            Intrinsics.echo(uri, "uri");
        }
    }

    public /* synthetic */ CropException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private CropException(String str) {
        super(str);
    }
}
