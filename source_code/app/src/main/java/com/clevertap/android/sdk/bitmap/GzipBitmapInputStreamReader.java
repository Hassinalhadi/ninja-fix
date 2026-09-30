package com.clevertap.android.sdk.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.network.DownloadedBitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/GzipBitmapInputStreamReader;", "Lcom/clevertap/android/sdk/bitmap/BitmapInputStreamDecoder;", "saveBytes", "", "logger", "Lcom/clevertap/android/sdk/Logger;", "<init>", "(ZLcom/clevertap/android/sdk/Logger;)V", "readInputStream", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "inputStream", "Ljava/io/InputStream;", "connection", "Ljava/net/HttpURLConnection;", "downloadStartTimeInMilliseconds", "", "getDownloadedBitmapFromStream", "dataReadFromStream", "Ljava/io/ByteArrayOutputStream;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GzipBitmapInputStreamReader extends BitmapInputStreamDecoder {
    /* JADX WARN: Multi-variable type inference failed */
    public GzipBitmapInputStreamReader() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final DownloadedBitmap getDownloadedBitmapFromStream(ByteArrayOutputStream dataReadFromStream, long downloadStartTimeInMilliseconds) {
        byte[] byteArray = dataReadFromStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        DownloadedBitmapFactory downloadedBitmapFactory = DownloadedBitmapFactory.INSTANCE;
        Intrinsics.checkNotNull(decodeByteArray);
        return DownloadedBitmapFactory.successBitmap$default(downloadedBitmapFactory, decodeByteArray, Utils.getNowInMillis() - downloadStartTimeInMilliseconds, null, 4, null);
    }

    @Override // com.clevertap.android.sdk.bitmap.BitmapInputStreamDecoder, com.clevertap.android.sdk.bitmap.IBitmapInputStreamReader
    @NotNull
    public DownloadedBitmap readInputStream(@NotNull InputStream inputStream, @NotNull HttpURLConnection connection, long downloadStartTimeInMilliseconds) {
        boolean z2;
        Intrinsics.echo(inputStream, "inputStream");
        Intrinsics.echo(connection, "connection");
        Logger.v("reading bitmap input stream in GzipBitmapInputStreamReader....");
        String contentEncoding = connection.getContentEncoding();
        if (contentEncoding != null) {
            z2 = StringsKt.beige(contentEncoding, "gzip", false);
        } else {
            z2 = false;
        }
        if (z2) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            Logger logger = getLogger();
            if (logger != null) {
                logger.verbose("Total decompressed download size for bitmap from output stream = " + byteArrayOutputStream.size());
            }
            return getDownloadedBitmapFromStream(byteArrayOutputStream, downloadStartTimeInMilliseconds);
        }
        return super.readInputStream(inputStream, connection, downloadStartTimeInMilliseconds);
    }

    public /* synthetic */ GzipBitmapInputStreamReader(boolean z2, Logger logger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z2, (i4 & 2) != 0 ? null : logger);
    }

    public GzipBitmapInputStreamReader(boolean z2, @Nullable Logger logger) {
        super(z2, false, logger, 2, null);
    }
}
