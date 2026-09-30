package com.clevertap.android.sdk.network;

import Qd.a;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "", "bitmap", "Landroid/graphics/Bitmap;", "status", "Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "downloadTime", "", "bytes", "", "<init>", "(Landroid/graphics/Bitmap;Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;J[B)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getStatus", "()Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "getDownloadTime", "()J", "getBytes", "()[B", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "toString", "", "Status", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DownloadedBitmap {

    @Nullable
    private final Bitmap bitmap;

    @Nullable
    private final byte[] bytes;
    private final long downloadTime;

    @NotNull
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "", "statusValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatusValue", "()Ljava/lang/String;", "NO_IMAGE", "SUCCESS", "DOWNLOAD_FAILED", "NO_NETWORK", "INIT_ERROR", "SIZE_LIMIT_EXCEEDED", "GIF_SUCCESS", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @NotNull
        private final String statusValue;
        public static final Status NO_IMAGE = new Status("NO_IMAGE", 0, "NO_IMAGE");
        public static final Status SUCCESS = new Status("SUCCESS", 1, "SUCCESS");
        public static final Status DOWNLOAD_FAILED = new Status("DOWNLOAD_FAILED", 2, "DOWNLOAD_FAILED");
        public static final Status NO_NETWORK = new Status("NO_NETWORK", 3, "NO_NETWORK");
        public static final Status INIT_ERROR = new Status("INIT_ERROR", 4, "INIT_ERROR");
        public static final Status SIZE_LIMIT_EXCEEDED = new Status("SIZE_LIMIT_EXCEEDED", 5, "SIZE_LIMIT_EXCEEDED");
        public static final Status GIF_SUCCESS = new Status("GIF_SUCCESS", 6, "GIF_SUCCESS");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NO_IMAGE, SUCCESS, DOWNLOAD_FAILED, NO_NETWORK, INIT_ERROR, SIZE_LIMIT_EXCEEDED, GIF_SUCCESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC2708l7.bravo($values);
        }

        private Status(String str, int i4, String str2) {
            this.statusValue = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @NotNull
        public final String getStatusValue() {
            return this.statusValue;
        }
    }

    public DownloadedBitmap(@Nullable Bitmap bitmap, @NotNull Status status, long j5, @Nullable byte[] bArr) {
        Intrinsics.echo(status, "status");
        this.bitmap = bitmap;
        this.status = status;
        this.downloadTime = j5;
        this.bytes = bArr;
    }

    public static /* synthetic */ DownloadedBitmap copy$default(DownloadedBitmap downloadedBitmap, Bitmap bitmap, Status status, long j5, byte[] bArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bitmap = downloadedBitmap.bitmap;
        }
        if ((i4 & 2) != 0) {
            status = downloadedBitmap.status;
        }
        if ((i4 & 4) != 0) {
            j5 = downloadedBitmap.downloadTime;
        }
        if ((i4 & 8) != 0) {
            bArr = downloadedBitmap.bytes;
        }
        byte[] bArr2 = bArr;
        return downloadedBitmap.copy(bitmap, status, j5, bArr2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDownloadTime() {
        return this.downloadTime;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final DownloadedBitmap copy(@Nullable Bitmap bitmap, @NotNull Status status, long downloadTime, @Nullable byte[] bytes) {
        Intrinsics.echo(status, "status");
        return new DownloadedBitmap(bitmap, status, downloadTime, bytes);
    }

    public boolean equals(@Nullable Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(DownloadedBitmap.class, cls)) {
            return false;
        }
        Intrinsics.charlie(other, "null cannot be cast to non-null type com.clevertap.android.sdk.network.DownloadedBitmap");
        DownloadedBitmap downloadedBitmap = (DownloadedBitmap) other;
        if (Intrinsics.areEqual(this.bitmap, downloadedBitmap.bitmap) && this.status == downloadedBitmap.status && this.downloadTime == downloadedBitmap.downloadTime && Arrays.equals(this.bytes, downloadedBitmap.bytes)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final byte[] getBytes() {
        return this.bytes;
    }

    public final long getDownloadTime() {
        return this.downloadTime;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i4;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            i4 = bitmap.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = this.status.hashCode();
        long j5 = this.downloadTime;
        return Arrays.hashCode(this.bytes) + ((((hashCode + (i4 * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        return "DownloadedBitmap(bitmap=" + this.bitmap + ", status=" + this.status + ", downloadTime=" + this.downloadTime + ", bytes=" + Arrays.toString(this.bytes) + ')';
    }

    public /* synthetic */ DownloadedBitmap(Bitmap bitmap, Status status, long j5, byte[] bArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, status, j5, (i4 & 8) != 0 ? null : bArr);
    }
}
