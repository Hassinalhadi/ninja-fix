package com.clevertap.android.sdk.inapp.images.memory;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/memory/MemoryConfig;", "", "minInMemorySizeKB", "", "optimistic", "maxDiskSizeKB", "diskDirectory", "Ljava/io/File;", "<init>", "(JJJLjava/io/File;)V", "getMinInMemorySizeKB", "()J", "getOptimistic", "getMaxDiskSizeKB", "getDiskDirectory", "()Ljava/io/File;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MemoryConfig {

    @NotNull
    private final File diskDirectory;
    private final long maxDiskSizeKB;
    private final long minInMemorySizeKB;
    private final long optimistic;

    public MemoryConfig(long j5, long j6, long j7, @NotNull File diskDirectory) {
        Intrinsics.echo(diskDirectory, "diskDirectory");
        this.minInMemorySizeKB = j5;
        this.optimistic = j6;
        this.maxDiskSizeKB = j7;
        this.diskDirectory = diskDirectory;
    }

    public static /* synthetic */ MemoryConfig copy$default(MemoryConfig memoryConfig, long j5, long j6, long j7, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = memoryConfig.minInMemorySizeKB;
        }
        long j10 = j5;
        if ((i4 & 2) != 0) {
            j6 = memoryConfig.optimistic;
        }
        long j11 = j6;
        if ((i4 & 4) != 0) {
            j7 = memoryConfig.maxDiskSizeKB;
        }
        long j12 = j7;
        if ((i4 & 8) != 0) {
            file = memoryConfig.diskDirectory;
        }
        return memoryConfig.copy(j10, j11, j12, file);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinInMemorySizeKB() {
        return this.minInMemorySizeKB;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOptimistic() {
        return this.optimistic;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxDiskSizeKB() {
        return this.maxDiskSizeKB;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final File getDiskDirectory() {
        return this.diskDirectory;
    }

    @NotNull
    public final MemoryConfig copy(long minInMemorySizeKB, long optimistic, long maxDiskSizeKB, @NotNull File diskDirectory) {
        Intrinsics.echo(diskDirectory, "diskDirectory");
        return new MemoryConfig(minInMemorySizeKB, optimistic, maxDiskSizeKB, diskDirectory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryConfig)) {
            return false;
        }
        MemoryConfig memoryConfig = (MemoryConfig) other;
        return this.minInMemorySizeKB == memoryConfig.minInMemorySizeKB && this.optimistic == memoryConfig.optimistic && this.maxDiskSizeKB == memoryConfig.maxDiskSizeKB && Intrinsics.areEqual(this.diskDirectory, memoryConfig.diskDirectory);
    }

    @NotNull
    public final File getDiskDirectory() {
        return this.diskDirectory;
    }

    public final long getMaxDiskSizeKB() {
        return this.maxDiskSizeKB;
    }

    public final long getMinInMemorySizeKB() {
        return this.minInMemorySizeKB;
    }

    public final long getOptimistic() {
        return this.optimistic;
    }

    public int hashCode() {
        long j5 = this.minInMemorySizeKB;
        long j6 = this.optimistic;
        int i4 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.maxDiskSizeKB;
        return this.diskDirectory.hashCode() + ((i4 + ((int) ((j7 >>> 32) ^ j7))) * 31);
    }

    @NotNull
    public String toString() {
        return "MemoryConfig(minInMemorySizeKB=" + this.minInMemorySizeKB + ", optimistic=" + this.optimistic + ", maxDiskSizeKB=" + this.maxDiskSizeKB + ", diskDirectory=" + this.diskDirectory + ')';
    }
}
