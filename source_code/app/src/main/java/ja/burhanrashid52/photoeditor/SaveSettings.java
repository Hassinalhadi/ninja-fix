package ja.burhanrashid52.photoeditor;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lja/burhanrashid52/photoeditor/SaveSettings;", "", "builder", "Lja/burhanrashid52/photoeditor/SaveSettings$Builder;", "(Lja/burhanrashid52/photoeditor/SaveSettings$Builder;)V", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "compressQuality", "", "getCompressQuality", "()I", "isClearViewsEnabled", "", "()Z", "isTransparencyEnabled", "Builder", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SaveSettings {

    @NotNull
    private final Bitmap.CompressFormat compressFormat;
    private final int compressQuality;
    private final boolean isClearViewsEnabled;
    private final boolean isTransparencyEnabled;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lja/burhanrashid52/photoeditor/SaveSettings$Builder;", "", "()V", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "compressQuality", "", "isClearViewsEnabled", "", "isTransparencyEnabled", "build", "Lja/burhanrashid52/photoeditor/SaveSettings;", "setClearViewsEnabled", "clearViewsEnabled", "setCompressFormat", "setCompressQuality", "setTransparencyEnabled", "transparencyEnabled", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        public boolean isTransparencyEnabled = true;
        public boolean isClearViewsEnabled = true;

        @NotNull
        public Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        public int compressQuality = 100;

        @NotNull
        public final SaveSettings build() {
            return new SaveSettings(this, null);
        }

        @NotNull
        public final Builder setClearViewsEnabled(boolean clearViewsEnabled) {
            this.isClearViewsEnabled = clearViewsEnabled;
            return this;
        }

        @NotNull
        public final Builder setCompressFormat(@NotNull Bitmap.CompressFormat compressFormat) {
            Intrinsics.echo(compressFormat, "compressFormat");
            this.compressFormat = compressFormat;
            return this;
        }

        @NotNull
        public final Builder setCompressQuality(int compressQuality) {
            this.compressQuality = compressQuality;
            return this;
        }

        @NotNull
        public final Builder setTransparencyEnabled(boolean transparencyEnabled) {
            this.isTransparencyEnabled = transparencyEnabled;
            return this;
        }
    }

    public /* synthetic */ SaveSettings(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public final Bitmap.CompressFormat getCompressFormat() {
        return this.compressFormat;
    }

    public final int getCompressQuality() {
        return this.compressQuality;
    }

    /* renamed from: isClearViewsEnabled, reason: from getter */
    public final boolean getIsClearViewsEnabled() {
        return this.isClearViewsEnabled;
    }

    /* renamed from: isTransparencyEnabled, reason: from getter */
    public final boolean getIsTransparencyEnabled() {
        return this.isTransparencyEnabled;
    }

    private SaveSettings(Builder builder) {
        this.isClearViewsEnabled = builder.isClearViewsEnabled;
        this.isTransparencyEnabled = builder.isTransparencyEnabled;
        this.compressFormat = builder.compressFormat;
        this.compressQuality = builder.compressQuality;
    }
}
