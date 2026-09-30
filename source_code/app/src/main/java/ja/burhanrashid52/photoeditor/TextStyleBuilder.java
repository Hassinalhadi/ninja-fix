package ja.burhanrashid52.photoeditor;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0014J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\rH\u0014J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\rH\u0014J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0014J0\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\f\u001a\u00020\rH\u0004J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020#H\u0014J\u0018\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0014J\u000e\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\rJ\u000e\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\rJ\u000e\u00100\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u00101\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\rJ\u000e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0013J\u000e\u00106\u001a\u00020\t2\u0006\u0010 \u001a\u00020!J&\u00106\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\f\u001a\u00020\rJ\u000e\u00107\u001a\u00020\t2\u0006\u0010'\u001a\u00020#J\u000e\u00108\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006:"}, d2 = {"Lja/burhanrashid52/photoeditor/TextStyleBuilder;", "", "()V", "values", "", "Lja/burhanrashid52/photoeditor/TextStyleBuilder$TextStyle;", "getValues", "()Ljava/util/Map;", "applyBackgroundColor", "", "textView", "Landroid/widget/TextView;", Constants.KEY_COLOR, "", "applyBackgroundDrawable", Constants.KEY_BG, "Landroid/graphics/drawable/Drawable;", "applyFontFamily", "typeface", "Landroid/graphics/Typeface;", "applyGravity", "gravity", "applyStyle", "applyTextAppearance", "styleAppearance", "applyTextBorder", "textBorder", "Lja/burhanrashid52/photoeditor/TextBorder;", "applyTextColor", "applyTextFlag", "flag", "applyTextShadow", "textShadow", "Lja/burhanrashid52/photoeditor/TextShadow;", Constants.KEY_RADIUS, "", "dx", "dy", "applyTextSize", "size", "applyTextStyle", "withBackgroundColor", "background", "withBackgroundDrawable", "bgDrawable", "withGravity", "withTextAppearance", "textAppearance", "withTextBorder", "withTextColor", "withTextFlag", "paintFlag", "withTextFont", "textTypeface", "withTextShadow", "withTextSize", "withTextStyle", "TextStyle", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class TextStyleBuilder {

    @NotNull
    private final Map<TextStyle, Object> values = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lja/burhanrashid52/photoeditor/TextStyleBuilder$TextStyle;", "", "property", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getProperty", "()Ljava/lang/String;", "SIZE", "COLOR", "GRAVITY", "FONT_FAMILY", "BACKGROUND", "TEXT_APPEARANCE", "TEXT_STYLE", "TEXT_FLAG", "SHADOW", "BORDER", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum TextStyle {
        SIZE("TextSize"),
        COLOR("TextColor"),
        GRAVITY("Gravity"),
        FONT_FAMILY("FontFamily"),
        BACKGROUND("Background"),
        TEXT_APPEARANCE("TextAppearance"),
        TEXT_STYLE("TextStyle"),
        TEXT_FLAG("TextFlag"),
        SHADOW("Shadow"),
        BORDER("Border");


        @NotNull
        private final String property;

        TextStyle(String str) {
            this.property = str;
        }

        @NotNull
        public final String getProperty() {
            return this.property;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStyle.FONT_FAMILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextStyle.GRAVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextStyle.BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextStyle.TEXT_APPEARANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextStyle.TEXT_STYLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextStyle.TEXT_FLAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextStyle.SHADOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TextStyle.BORDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void applyBackgroundColor(@NotNull TextView textView, int color) {
        Intrinsics.echo(textView, "textView");
        textView.setBackgroundColor(color);
    }

    public void applyBackgroundDrawable(@NotNull TextView textView, @Nullable Drawable bg2) {
        Intrinsics.echo(textView, "textView");
        textView.setBackground(bg2);
    }

    public void applyFontFamily(@NotNull TextView textView, @Nullable Typeface typeface) {
        Intrinsics.echo(textView, "textView");
        textView.setTypeface(typeface);
    }

    public void applyGravity(@NotNull TextView textView, int gravity) {
        Intrinsics.echo(textView, "textView");
        textView.setGravity(gravity);
    }

    public final void applyStyle(@NotNull TextView textView) {
        Intrinsics.echo(textView, "textView");
        for (Map.Entry<TextStyle, Object> entry : this.values.entrySet()) {
            TextStyle key = entry.getKey();
            Object value = entry.getValue();
            switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
                case 1:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.Float");
                    applyTextSize(textView, ((Float) value).floatValue());
                    break;
                case 2:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.Int");
                    applyTextColor(textView, ((Integer) value).intValue());
                    break;
                case 3:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    applyFontFamily(textView, (Typeface) value);
                    break;
                case 4:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.Int");
                    applyGravity(textView, ((Integer) value).intValue());
                    break;
                case 5:
                    if (value instanceof Drawable) {
                        applyBackgroundDrawable(textView, (Drawable) value);
                        break;
                    } else if (value instanceof Integer) {
                        applyBackgroundColor(textView, ((Number) value).intValue());
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (value instanceof Integer) {
                        applyTextAppearance(textView, ((Number) value).intValue());
                        break;
                    } else {
                        break;
                    }
                case 7:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.Int");
                    applyTextStyle(textView, ((Integer) value).intValue());
                    break;
                case 8:
                    Intrinsics.charlie(value, "null cannot be cast to non-null type kotlin.Int");
                    applyTextFlag(textView, ((Integer) value).intValue());
                    break;
                case 9:
                    if (value instanceof TextShadow) {
                        applyTextShadow(textView, (TextShadow) value);
                    }
                    if (value instanceof TextBorder) {
                        applyTextBorder(textView, (TextBorder) value);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (value instanceof TextBorder) {
                        applyTextBorder(textView, (TextBorder) value);
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public void applyTextAppearance(@NotNull TextView textView, int styleAppearance) {
        Intrinsics.echo(textView, "textView");
        textView.setTextAppearance(styleAppearance);
    }

    public void applyTextBorder(@NotNull TextView textView, @NotNull TextBorder textBorder) {
        Intrinsics.echo(textView, "textView");
        Intrinsics.echo(textBorder, "textBorder");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(textBorder.getCorner());
        gradientDrawable.setStroke(textBorder.getStrokeWidth(), textBorder.getStrokeColor());
        gradientDrawable.setColor(textBorder.getBackGroundColor());
        textView.setBackground(gradientDrawable);
    }

    public void applyTextColor(@NotNull TextView textView, int color) {
        Intrinsics.echo(textView, "textView");
        textView.setTextColor(color);
    }

    public void applyTextFlag(@NotNull TextView textView, int flag) {
        Intrinsics.echo(textView, "textView");
        textView.getPaint().setFlags(flag);
    }

    public final void applyTextShadow(@NotNull TextView textView, float radius, float dx, float dy, int color) {
        Intrinsics.echo(textView, "textView");
        textView.setShadowLayer(radius, dx, dy, color);
    }

    public void applyTextSize(@NotNull TextView textView, float size) {
        Intrinsics.echo(textView, "textView");
        textView.setTextSize(size);
    }

    public void applyTextStyle(@NotNull TextView textView, int typeface) {
        Intrinsics.echo(textView, "textView");
        textView.setTypeface(textView.getTypeface(), typeface);
    }

    @NotNull
    public final Map<TextStyle, Object> getValues() {
        return this.values;
    }

    public final void withBackgroundColor(int background) {
        this.values.put(TextStyle.BACKGROUND, Integer.valueOf(background));
    }

    public final void withBackgroundDrawable(@NotNull Drawable bgDrawable) {
        Intrinsics.echo(bgDrawable, "bgDrawable");
        this.values.put(TextStyle.BACKGROUND, bgDrawable);
    }

    public final void withGravity(int gravity) {
        this.values.put(TextStyle.GRAVITY, Integer.valueOf(gravity));
    }

    public final void withTextAppearance(int textAppearance) {
        this.values.put(TextStyle.TEXT_APPEARANCE, Integer.valueOf(textAppearance));
    }

    public final void withTextBorder(@NotNull TextBorder textBorder) {
        Intrinsics.echo(textBorder, "textBorder");
        this.values.put(TextStyle.BORDER, textBorder);
    }

    public final void withTextColor(int color) {
        this.values.put(TextStyle.COLOR, Integer.valueOf(color));
    }

    public final void withTextFlag(int paintFlag) {
        this.values.put(TextStyle.TEXT_FLAG, Integer.valueOf(paintFlag));
    }

    public final void withTextFont(@NotNull Typeface textTypeface) {
        Intrinsics.echo(textTypeface, "textTypeface");
        this.values.put(TextStyle.FONT_FAMILY, textTypeface);
    }

    public final void withTextShadow(float radius, float dx, float dy, int color) {
        withTextShadow(new TextShadow(radius, dx, dy, color));
    }

    public final void withTextSize(float size) {
        this.values.put(TextStyle.SIZE, Float.valueOf(size));
    }

    public final void withTextStyle(int typeface) {
        this.values.put(TextStyle.TEXT_STYLE, Integer.valueOf(typeface));
    }

    public void applyTextShadow(@NotNull TextView textView, @NotNull TextShadow textShadow) {
        Intrinsics.echo(textView, "textView");
        Intrinsics.echo(textShadow, "textShadow");
        textView.setShadowLayer(textShadow.getRadius(), textShadow.getDx(), textShadow.getDy(), textShadow.getColor());
    }

    public final void withTextShadow(@NotNull TextShadow textShadow) {
        Intrinsics.echo(textShadow, "textShadow");
        this.values.put(TextStyle.SHADOW, textShadow);
    }
}
