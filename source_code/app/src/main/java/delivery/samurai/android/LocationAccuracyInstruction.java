package delivery.samurai.android;

import A0.z;
import P8.c;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w9.u;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"Ldelivery/samurai/android/LocationAccuracyInstruction;", "", "", Constants.KEY_ID, "", Constants.KEY_TITLE, "tip", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", Constants.COPY_TYPE, "(ILjava/lang/String;Ljava/lang/String;)Ldelivery/samurai/android/LocationAccuracyInstruction;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getTitle", "getTip", "Companion", "w9/u", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocationAccuracyInstruction {
    public static final int $stable = 0;

    @NotNull
    public static final u Companion = new Object();

    @c(Constants.KEY_ID)
    private final int id;

    @c("tip")
    @Nullable
    private final String tip;

    @c(Constants.KEY_TITLE)
    @Nullable
    private final String title;

    public LocationAccuracyInstruction() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ LocationAccuracyInstruction copy$default(LocationAccuracyInstruction locationAccuracyInstruction, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = locationAccuracyInstruction.id;
        }
        if ((i5 & 2) != 0) {
            str = locationAccuracyInstruction.title;
        }
        if ((i5 & 4) != 0) {
            str2 = locationAccuracyInstruction.tip;
        }
        return locationAccuracyInstruction.copy(i4, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @NotNull
    public final LocationAccuracyInstruction copy(int id2, @Nullable String title, @Nullable String tip) {
        return new LocationAccuracyInstruction(id2, title, tip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationAccuracyInstruction)) {
            return false;
        }
        LocationAccuracyInstruction locationAccuracyInstruction = (LocationAccuracyInstruction) other;
        return this.id == locationAccuracyInstruction.id && Intrinsics.areEqual(this.title, locationAccuracyInstruction.title) && Intrinsics.areEqual(this.tip, locationAccuracyInstruction.tip);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i4 = this.id * 31;
        String str = this.title;
        int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tip;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.title;
        return P0.gold(z.lima("LocationAccuracyInstruction(id=", ", title=", str, ", tip=", i4), this.tip, ")");
    }

    public LocationAccuracyInstruction(int i4, @Nullable String str, @Nullable String str2) {
        this.id = i4;
        this.title = str;
        this.tip = str2;
    }

    public /* synthetic */ LocationAccuracyInstruction(int i4, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i4, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2);
    }
}
