package ja.burhanrashid52.photoeditor.shape;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType;", "", "Arrow", "Brush", "Line", "Oval", "Rectangle", "Lja/burhanrashid52/photoeditor/shape/ShapeType$Arrow;", "Lja/burhanrashid52/photoeditor/shape/ShapeType$Brush;", "Lja/burhanrashid52/photoeditor/shape/ShapeType$Line;", "Lja/burhanrashid52/photoeditor/shape/ShapeType$Oval;", "Lja/burhanrashid52/photoeditor/shape/ShapeType$Rectangle;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ShapeType {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType$Arrow;", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "pointerLocation", "Lja/burhanrashid52/photoeditor/shape/ArrowPointerLocation;", "(Lja/burhanrashid52/photoeditor/shape/ArrowPointerLocation;)V", "getPointerLocation", "()Lja/burhanrashid52/photoeditor/shape/ArrowPointerLocation;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Arrow implements ShapeType {

        @NotNull
        private final ArrowPointerLocation pointerLocation;

        /* JADX WARN: Multi-variable type inference failed */
        public Arrow() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final ArrowPointerLocation getPointerLocation() {
            return this.pointerLocation;
        }

        public Arrow(@NotNull ArrowPointerLocation pointerLocation) {
            Intrinsics.echo(pointerLocation, "pointerLocation");
            this.pointerLocation = pointerLocation;
        }

        public /* synthetic */ Arrow(ArrowPointerLocation arrowPointerLocation, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? ArrowPointerLocation.START : arrowPointerLocation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType$Brush;", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "()V", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Brush implements ShapeType {

        @NotNull
        public static final Brush INSTANCE = new Brush();

        private Brush() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType$Line;", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "()V", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Line implements ShapeType {

        @NotNull
        public static final Line INSTANCE = new Line();

        private Line() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType$Oval;", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "()V", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Oval implements ShapeType {

        @NotNull
        public static final Oval INSTANCE = new Oval();

        private Oval() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lja/burhanrashid52/photoeditor/shape/ShapeType$Rectangle;", "Lja/burhanrashid52/photoeditor/shape/ShapeType;", "()V", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Rectangle implements ShapeType {

        @NotNull
        public static final Rectangle INSTANCE = new Rectangle();

        private Rectangle() {
        }
    }
}
