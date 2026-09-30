package ja.burhanrashid52.photoeditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.leanplum.Constants;
import ja.burhanrashid52.photoeditor.shape.AbstractShape;
import ja.burhanrashid52.photoeditor.shape.BrushShape;
import ja.burhanrashid52.photoeditor.shape.LineShape;
import ja.burhanrashid52.photoeditor.shape.OvalShape;
import ja.burhanrashid52.photoeditor.shape.RectangleShape;
import ja.burhanrashid52.photoeditor.shape.ShapeAndPaint;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import ja.burhanrashid52.photoeditor.shape.ShapeType;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0001BB'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020*H\u0002J\u000e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\"J\u0018\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020:H\u0017J\u0018\u0010;\u001a\u00020*2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0002J\u0018\u0010<\u001a\u00020*2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0002J\u0018\u0010=\u001a\u00020*2\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0002J\u0006\u0010>\u001a\u00020\"J\u0010\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010(J\u0006\u0010A\u001a\u00020\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0017\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00160\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lja/burhanrashid52/photoeditor/DrawingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentShape", "Lja/burhanrashid52/photoeditor/shape/ShapeAndPaint;", "getCurrentShape$photoeditor_release", "()Lja/burhanrashid52/photoeditor/shape/ShapeAndPaint;", "setCurrentShape$photoeditor_release", "(Lja/burhanrashid52/photoeditor/shape/ShapeAndPaint;)V", "currentShapeBuilder", "Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "getCurrentShapeBuilder", "()Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;", "setCurrentShapeBuilder", "(Lja/burhanrashid52/photoeditor/shape/ShapeBuilder;)V", "drawShapes", "Ljava/util/Stack;", "drawingPath", "Landroid/util/Pair;", "getDrawingPath", "()Landroid/util/Pair;", "eraserSize", "", "getEraserSize", "()F", "setEraserSize", "(F)V", "<set-?>", "", "isDrawingEnabled", "()Z", "isErasing", "redoShapes", "viewChangeListener", "Lja/burhanrashid52/photoeditor/BrushViewChangeListener;", "brushEraser", "", "clearAll", "createEraserPaint", "Landroid/graphics/Paint;", "createPaint", "createShape", "enableDrawing", "brushDrawMode", "endShape", "touchX", "touchY", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", Constants.CHARGED_EVENT_PARAM, "Landroid/view/MotionEvent;", "onTouchEventDown", "onTouchEventMove", "onTouchEventUp", "redo", "setBrushViewChangeListener", "brushViewChangeListener", "undo", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawingView extends View {
    public static final float DEFAULT_ERASER_SIZE = 50.0f;

    @Nullable
    private ShapeAndPaint currentShape;

    @NotNull
    private ShapeBuilder currentShapeBuilder;

    @NotNull
    private final Stack<ShapeAndPaint> drawShapes;
    private float eraserSize;
    private boolean isDrawingEnabled;
    private boolean isErasing;

    @NotNull
    private final Stack<ShapeAndPaint> redoShapes;

    @Nullable
    private BrushViewChangeListener viewChangeListener;

    public DrawingView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    private final Paint createEraserPaint() {
        Paint createPaint = createPaint();
        createPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        return createPaint;
    }

    private final Paint createPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        ShapeBuilder shapeBuilder = this.currentShapeBuilder;
        if (shapeBuilder != null) {
            paint.setStrokeWidth(shapeBuilder.getShapeSize());
            paint.setColor(shapeBuilder.getShapeColor());
            Integer shapeOpacity = shapeBuilder.getShapeOpacity();
            if (shapeOpacity != null) {
                paint.setAlpha(shapeOpacity.intValue());
            }
        }
        return paint;
    }

    private final void createShape() {
        Paint createPaint = createPaint();
        AbstractShape brushShape = new BrushShape();
        if (this.isErasing) {
            createPaint = createEraserPaint();
        } else {
            ShapeType shapeType = this.currentShapeBuilder.getShapeType();
            if (Intrinsics.areEqual(shapeType, ShapeType.Oval.INSTANCE)) {
                brushShape = new OvalShape();
            } else if (Intrinsics.areEqual(shapeType, ShapeType.Brush.INSTANCE)) {
                brushShape = new BrushShape();
            } else if (Intrinsics.areEqual(shapeType, ShapeType.Rectangle.INSTANCE)) {
                brushShape = new RectangleShape();
            } else if (Intrinsics.areEqual(shapeType, ShapeType.Line.INSTANCE)) {
                Context context = getContext();
                Intrinsics.delta(context, "context");
                brushShape = new LineShape(context, null, 2, null);
            } else if (shapeType instanceof ShapeType.Arrow) {
                Context context2 = getContext();
                Intrinsics.delta(context2, "context");
                brushShape = new LineShape(context2, ((ShapeType.Arrow) shapeType).getPointerLocation());
            }
        }
        ShapeAndPaint shapeAndPaint = new ShapeAndPaint(brushShape, createPaint);
        this.currentShape = shapeAndPaint;
        this.drawShapes.push(shapeAndPaint);
        BrushViewChangeListener brushViewChangeListener = this.viewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onStartDrawing();
        }
    }

    private final void endShape(float touchX, float touchY) {
        AbstractShape shape;
        ShapeAndPaint shapeAndPaint = this.currentShape;
        if (shapeAndPaint != null && (shape = shapeAndPaint.getShape()) != null && shape.hasBeenTapped()) {
            this.drawShapes.remove(this.currentShape);
        }
        BrushViewChangeListener brushViewChangeListener = this.viewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onStopDrawing();
            if (!this.redoShapes.isEmpty()) {
                this.redoShapes.clear();
            }
            brushViewChangeListener.onViewAdd(this);
        }
    }

    private final void onTouchEventDown(float touchX, float touchY) {
        AbstractShape shape;
        createShape();
        ShapeAndPaint shapeAndPaint = this.currentShape;
        if (shapeAndPaint != null && (shape = shapeAndPaint.getShape()) != null) {
            shape.startShape(touchX, touchY);
        }
    }

    private final void onTouchEventMove(float touchX, float touchY) {
        AbstractShape shape;
        ShapeAndPaint shapeAndPaint = this.currentShape;
        if (shapeAndPaint != null && (shape = shapeAndPaint.getShape()) != null) {
            shape.moveShape(touchX, touchY);
        }
    }

    private final void onTouchEventUp(float touchX, float touchY) {
        ShapeAndPaint shapeAndPaint = this.currentShape;
        if (shapeAndPaint != null) {
            shapeAndPaint.getShape().stopShape();
            endShape(touchX, touchY);
        }
    }

    public final void brushEraser() {
        this.isDrawingEnabled = true;
        this.isErasing = true;
    }

    public final void clearAll() {
        this.drawShapes.clear();
        this.redoShapes.clear();
        invalidate();
    }

    public final void enableDrawing(boolean brushDrawMode) {
        this.isDrawingEnabled = brushDrawMode;
        this.isErasing = !brushDrawMode;
        if (brushDrawMode) {
            setVisibility(0);
        }
    }

    @Nullable
    /* renamed from: getCurrentShape$photoeditor_release, reason: from getter */
    public final ShapeAndPaint getCurrentShape() {
        return this.currentShape;
    }

    @NotNull
    public final ShapeBuilder getCurrentShapeBuilder() {
        return this.currentShapeBuilder;
    }

    @NotNull
    public final Pair<Stack<ShapeAndPaint>, Stack<ShapeAndPaint>> getDrawingPath() {
        return new Pair<>(this.drawShapes, this.redoShapes);
    }

    public final float getEraserSize() {
        return this.eraserSize;
    }

    /* renamed from: isDrawingEnabled, reason: from getter */
    public final boolean getIsDrawingEnabled() {
        return this.isDrawingEnabled;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        AbstractShape shape;
        Intrinsics.echo(canvas, "canvas");
        Iterator<ShapeAndPaint> it = this.drawShapes.iterator();
        while (it.hasNext()) {
            ShapeAndPaint next = it.next();
            if (next != null && (shape = next.getShape()) != null) {
                shape.draw(canvas, next.getPaint());
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.echo(event, "event");
        if (this.isDrawingEnabled) {
            float x4 = event.getX();
            float y10 = event.getY();
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        onTouchEventMove(x4, y10);
                    }
                } else {
                    onTouchEventUp(x4, y10);
                }
            } else {
                onTouchEventDown(x4, y10);
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final boolean redo() {
        if (!this.redoShapes.empty()) {
            this.drawShapes.push(this.redoShapes.pop());
            invalidate();
        }
        BrushViewChangeListener brushViewChangeListener = this.viewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onViewAdd(this);
        }
        return !this.redoShapes.empty();
    }

    public final void setBrushViewChangeListener(@Nullable BrushViewChangeListener brushViewChangeListener) {
        this.viewChangeListener = brushViewChangeListener;
    }

    public final void setCurrentShape$photoeditor_release(@Nullable ShapeAndPaint shapeAndPaint) {
        this.currentShape = shapeAndPaint;
    }

    public final void setCurrentShapeBuilder(@NotNull ShapeBuilder shapeBuilder) {
        Intrinsics.echo(shapeBuilder, "<set-?>");
        this.currentShapeBuilder = shapeBuilder;
    }

    public final void setEraserSize(float f5) {
        this.eraserSize = f5;
    }

    public final boolean undo() {
        if (!this.drawShapes.empty()) {
            this.redoShapes.push(this.drawShapes.pop());
            invalidate();
        }
        BrushViewChangeListener brushViewChangeListener = this.viewChangeListener;
        if (brushViewChangeListener != null) {
            brushViewChangeListener.onViewRemoved(this);
        }
        return !this.drawShapes.empty();
    }

    public DrawingView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DrawingView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    public DrawingView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.drawShapes = new Stack<>();
        this.redoShapes = new Stack<>();
        this.eraserSize = 50.0f;
        setLayerType(2, null);
        setVisibility(8);
        this.currentShapeBuilder = new ShapeBuilder();
    }
}
