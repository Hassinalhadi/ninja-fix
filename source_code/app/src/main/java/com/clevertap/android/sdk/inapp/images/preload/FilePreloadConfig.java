package com.clevertap.android.sdk.inapp.images.preload;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "", "parallelDownloads", "", "<init>", "(I)V", "getParallelDownloads", "()I", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FilePreloadConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_PARALLEL_DOWNLOAD = 4;
    private final int parallelDownloads;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig$Companion;", "", "<init>", "()V", "DEFAULT_PARALLEL_DOWNLOAD", "", "default", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final FilePreloadConfig m201default() {
            return new FilePreloadConfig(4);
        }

        private Companion() {
        }
    }

    public FilePreloadConfig(int i4) {
        this.parallelDownloads = i4;
    }

    public static /* synthetic */ FilePreloadConfig copy$default(FilePreloadConfig filePreloadConfig, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = filePreloadConfig.parallelDownloads;
        }
        return filePreloadConfig.copy(i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getParallelDownloads() {
        return this.parallelDownloads;
    }

    @NotNull
    public final FilePreloadConfig copy(int parallelDownloads) {
        return new FilePreloadConfig(parallelDownloads);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FilePreloadConfig) && this.parallelDownloads == ((FilePreloadConfig) other).parallelDownloads;
    }

    public final int getParallelDownloads() {
        return this.parallelDownloads;
    }

    public int hashCode() {
        return this.parallelDownloads;
    }

    @NotNull
    public String toString() {
        return c.quebec(new StringBuilder("FilePreloadConfig(parallelDownloads="), this.parallelDownloads, ')');
    }
}
