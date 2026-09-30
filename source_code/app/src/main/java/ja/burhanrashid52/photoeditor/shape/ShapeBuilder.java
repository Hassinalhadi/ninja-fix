package ja.burhanrashid52.photoeditor.shape;

import com.clevertap.android.sdk.Constants;
import ja.burhanrashid52.photoeditor.shape.ShapeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u0004J\u0017\u0010\u0016\u001a\u00020\u00002\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010R \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@BX\u0087\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0087\u000e¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "", "()V", "<set-?>", "", "shapeColor", "getShapeColor", "()I", "shapeOpacity", "getShapeOpacity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "", "shapeSize", "getShapeSize", "()F", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "shapeType", "getShapeType", "()Lja/burhanrashid52/photoeditor/shape/ShapeType;", "withShapeColor", Constants.KEY_COLOR, "withShapeOpacity", "opacity", "(Ljava/lang/Integer;)Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "withShapeSize", "size", "withShapeType", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShapeBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_SHAPE_COLOR = -16777216;

    @Nullable
    private static final Void DEFAULT_SHAPE_OPACITY = null;
    public static final float DEFAULT_SHAPE_SIZE = 25.0f;

    @NotNull
    private ShapeType shapeType = ShapeType.Brush.INSTANCE;
    private float shapeSize = 25.0f;

    @Nullable
    private Integer shapeOpacity = (Integer) DEFAULT_SHAPE_OPACITY;
    private int shapeColor = DEFAULT_SHAPE_COLOR;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeBuilder$Companion;", "", "()V", "DEFAULT_SHAPE_COLOR", "", "DEFAULT_SHAPE_OPACITY", "", "getDEFAULT_SHAPE_OPACITY", "()Ljava/lang/Void;", "DEFAULT_SHAPE_SIZE", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Void getDEFAULT_SHAPE_OPACITY() {
            return ShapeBuilder.DEFAULT_SHAPE_OPACITY;
        }

        private Companion() {
        }
    }

    public final int getShapeColor() {
        return this.shapeColor;
    }

    @Nullable
    public final Integer getShapeOpacity() {
        return this.shapeOpacity;
    }

    public final float getShapeSize() {
        return this.shapeSize;
    }

    @NotNull
    public final ShapeType getShapeType() {
        return this.shapeType;
    }

    @NotNull
    public final ShapeBuilder withShapeColor(int color) {
        this.shapeColor = color;
        return this;
    }

    @NotNull
    public final ShapeBuilder withShapeOpacity(@Nullable Integer opacity) {
        this.shapeOpacity = opacity;
        return this;
    }

    @NotNull
    public final ShapeBuilder withShapeSize(float size) {
        this.shapeSize = size;
        return this;
    }

    @NotNull
    public final ShapeBuilder withShapeType(@NotNull ShapeType shapeType) {
        Intrinsics.echo(shapeType, "shapeType");
        this.shapeType = shapeType;
        return this;
    }
}
