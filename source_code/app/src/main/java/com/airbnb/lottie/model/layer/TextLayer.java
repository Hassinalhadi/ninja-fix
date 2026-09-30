package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import bv.u;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class TextLayer extends BaseLayer {
    private final u codePointCache;
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final RectF rectF;
    private final StringBuilder stringBuilder;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint;
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeEndAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeOffsetAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeStartAnimation;
    private TextRangeUnits textRangeUnits;
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    private final List<TextSubLine> textSubLines;
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;
    private BaseKeyframeAnimation<Typeface, Typeface> typefaceCallbackAnimation;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class TextSubLine {
        private String text;
        private float width;

        private TextSubLine() {
            this.text = "";
            this.width = 0.0f;
        }

        public void set(String str, float f5) {
            this.text = str;
            this.width = f5;
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        AnimatableTextRangeSelector animatableTextRangeSelector;
        AnimatableTextRangeSelector animatableTextRangeSelector2;
        AnimatableIntegerValue animatableIntegerValue;
        AnimatableTextRangeSelector animatableTextRangeSelector3;
        AnimatableIntegerValue animatableIntegerValue2;
        AnimatableTextRangeSelector animatableTextRangeSelector4;
        AnimatableIntegerValue animatableIntegerValue3;
        AnimatableTextStyle animatableTextStyle;
        AnimatableIntegerValue animatableIntegerValue4;
        AnimatableTextStyle animatableTextStyle2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableTextStyle animatableTextStyle3;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableTextStyle animatableTextStyle4;
        AnimatableColorValue animatableColorValue;
        AnimatableTextStyle animatableTextStyle5;
        AnimatableColorValue animatableColorValue2;
        this.stringBuilder = new StringBuilder(2);
        this.rectF = new RectF();
        this.matrix = new Matrix();
        int i4 = 1;
        this.fillPaint = new Paint(i4) { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.strokePaint = new Paint(i4) { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.contentsForCharacter = new HashMap();
        this.codePointCache = new u((Object) null);
        this.textSubLines = new ArrayList();
        this.textRangeUnits = TextRangeUnits.INDEX;
        this.lottieDrawable = lottieDrawable;
        this.composition = layer.getComposition();
        TextKeyframeAnimation createAnimation = layer.getText().createAnimation();
        this.textAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        AnimatableTextProperties textProperties = layer.getTextProperties();
        if (textProperties != null && (animatableTextStyle5 = textProperties.textStyle) != null && (animatableColorValue2 = animatableTextStyle5.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation2 = animatableColorValue2.createAnimation();
            this.colorAnimation = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (textProperties != null && (animatableTextStyle4 = textProperties.textStyle) != null && (animatableColorValue = animatableTextStyle4.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation3 = animatableColorValue.createAnimation();
            this.strokeColorAnimation = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (textProperties != null && (animatableTextStyle3 = textProperties.textStyle) != null && (animatableFloatValue2 = animatableTextStyle3.strokeWidth) != null) {
            FloatKeyframeAnimation createAnimation4 = animatableFloatValue2.createAnimation();
            this.strokeWidthAnimation = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties != null && (animatableTextStyle2 = textProperties.textStyle) != null && (animatableFloatValue = animatableTextStyle2.tracking) != null) {
            FloatKeyframeAnimation createAnimation5 = animatableFloatValue.createAnimation();
            this.trackingAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            addAnimation(this.trackingAnimation);
        }
        if (textProperties != null && (animatableTextStyle = textProperties.textStyle) != null && (animatableIntegerValue4 = animatableTextStyle.opacity) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation6 = animatableIntegerValue4.createAnimation();
            this.opacityAnimation = createAnimation6;
            createAnimation6.addUpdateListener(this);
            addAnimation(this.opacityAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector4 = textProperties.rangeSelector) != null && (animatableIntegerValue3 = animatableTextRangeSelector4.start) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation7 = animatableIntegerValue3.createAnimation();
            this.textRangeStartAnimation = createAnimation7;
            createAnimation7.addUpdateListener(this);
            addAnimation(this.textRangeStartAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector3 = textProperties.rangeSelector) != null && (animatableIntegerValue2 = animatableTextRangeSelector3.end) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation8 = animatableIntegerValue2.createAnimation();
            this.textRangeEndAnimation = createAnimation8;
            createAnimation8.addUpdateListener(this);
            addAnimation(this.textRangeEndAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector2 = textProperties.rangeSelector) != null && (animatableIntegerValue = animatableTextRangeSelector2.offset) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation9 = animatableIntegerValue.createAnimation();
            this.textRangeOffsetAnimation = createAnimation9;
            createAnimation9.addUpdateListener(this);
            addAnimation(this.textRangeOffsetAnimation);
        }
        if (textProperties != null && (animatableTextRangeSelector = textProperties.rangeSelector) != null) {
            this.textRangeUnits = animatableTextRangeSelector.units;
        }
    }

    private String codePointToString(String str, int i4) {
        int codePointAt = str.codePointAt(i4);
        int charCount = Character.charCount(codePointAt) + i4;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!isModifier(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j5 = codePointAt;
        if (this.codePointCache.foxtrot(j5) >= 0) {
            return (String) this.codePointCache.delta(j5);
        }
        this.stringBuilder.setLength(0);
        while (i4 < charCount) {
            int codePointAt3 = str.codePointAt(i4);
            this.stringBuilder.appendCodePoint(codePointAt3);
            i4 += Character.charCount(codePointAt3);
        }
        String sb2 = this.stringBuilder.toString();
        this.codePointCache.hotel(j5, sb2);
        return sb2;
    }

    private void configurePaint(DocumentData documentData, int i4, int i5) {
        int intValue;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
        if (baseKeyframeAnimation != null) {
            this.fillPaint.setColor(baseKeyframeAnimation.getValue().intValue());
        } else if (this.colorAnimation != null && isIndexInRangeSelection(i5)) {
            this.fillPaint.setColor(this.colorAnimation.getValue().intValue());
        } else {
            this.fillPaint.setColor(documentData.color);
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
        if (baseKeyframeAnimation2 != null) {
            this.strokePaint.setColor(baseKeyframeAnimation2.getValue().intValue());
        } else if (this.strokeColorAnimation != null && isIndexInRangeSelection(i5)) {
            this.strokePaint.setColor(this.strokeColorAnimation.getValue().intValue());
        } else {
            this.strokePaint.setColor(documentData.strokeColor);
        }
        int i10 = 100;
        if (this.transform.getOpacity() == null) {
            intValue = 100;
        } else {
            intValue = this.transform.getOpacity().getValue().intValue();
        }
        if (this.opacityAnimation != null && isIndexInRangeSelection(i5)) {
            i10 = this.opacityAnimation.getValue().intValue();
        }
        int round = Math.round((((i10 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i4) / 255.0f);
        this.fillPaint.setAlpha(round);
        this.strokePaint.setAlpha(round);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
        if (baseKeyframeAnimation3 != null) {
            this.strokePaint.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
            return;
        }
        if (this.strokeWidthAnimation != null && isIndexInRangeSelection(i5)) {
            this.strokePaint.setStrokeWidth(this.strokeWidthAnimation.getValue().floatValue());
            return;
        }
        this.strokePaint.setStrokeWidth(Utils.dpScale() * documentData.strokeWidth);
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, float f5, DocumentData documentData, Canvas canvas, int i4, int i5) {
        configurePaint(documentData, i5, i4);
        List<ContentGroup> contentsForCharacter = getContentsForCharacter(fontCharacter);
        for (int i10 = 0; i10 < contentsForCharacter.size(); i10++) {
            Path path = contentsForCharacter.get(i10).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.reset();
            this.matrix.preTranslate(0.0f, Utils.dpScale() * (-documentData.baselineShift));
            this.matrix.preScale(f5, f5);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                drawGlyph(path, this.strokePaint, canvas);
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                drawGlyph(path, this.fillPaint, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas, int i4, int i5) {
        configurePaint(documentData, i5, i4);
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            drawCharacter(str, this.strokePaint, canvas);
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            drawCharacter(str, this.fillPaint, canvas);
        }
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f5, int i4, int i5) {
        int i10 = 0;
        while (i10 < str.length()) {
            String codePointToString = codePointToString(str, i10);
            DocumentData documentData2 = documentData;
            Canvas canvas2 = canvas;
            drawCharacterFromFont(codePointToString, documentData2, canvas2, i4 + i10, i5);
            canvas2.translate(this.fillPaint.measureText(codePointToString) + f5, 0.0f);
            i10 += codePointToString.length();
            documentData = documentData2;
            canvas = canvas2;
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Font font, Canvas canvas, float f5, float f10, float f11, int i4) {
        DocumentData documentData2;
        Canvas canvas2;
        float f12;
        int i5;
        int i10 = 0;
        while (i10 < str.length()) {
            FontCharacter fontCharacter = (FontCharacter) this.composition.getCharacters().delta(FontCharacter.hashFor(str.charAt(i10), font.getFamily(), font.getStyle()));
            if (fontCharacter == null) {
                documentData2 = documentData;
                canvas2 = canvas;
                f12 = f10;
                i5 = i4;
            } else {
                documentData2 = documentData;
                canvas2 = canvas;
                f12 = f10;
                i5 = i4;
                drawCharacterAsGlyph(fontCharacter, f12, documentData2, canvas2, i10, i5);
                canvas2.translate((Utils.dpScale() * ((float) fontCharacter.getWidth()) * f12) + f11, 0.0f);
            }
            i10++;
            f10 = f12;
            documentData = documentData2;
            canvas = canvas2;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawTextWithFont(DocumentData documentData, Font font, Canvas canvas, int i4) {
        float f5;
        float floatValue;
        int size;
        int i5;
        float f10;
        float measureText;
        float f11;
        int i10;
        TextLayer textLayer = this;
        DocumentData documentData2 = documentData;
        Font font2 = font;
        Typeface typeface = textLayer.getTypeface(font2);
        if (typeface != null) {
            String str = documentData2.text;
            TextDelegate textDelegate = textLayer.lottieDrawable.getTextDelegate();
            if (textDelegate != null) {
                str = textDelegate.getTextInternal(textLayer.getName(), str);
            }
            textLayer.fillPaint.setTypeface(typeface);
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = textLayer.textSizeCallbackAnimation;
            if (baseKeyframeAnimation != null) {
                f5 = baseKeyframeAnimation.getValue().floatValue();
            } else {
                f5 = documentData2.size;
            }
            textLayer.fillPaint.setTextSize(Utils.dpScale() * f5);
            textLayer.strokePaint.setTypeface(textLayer.fillPaint.getTypeface());
            textLayer.strokePaint.setTextSize(textLayer.fillPaint.getTextSize());
            float f12 = documentData2.tracking / 10.0f;
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = textLayer.trackingCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                floatValue = baseKeyframeAnimation2.getValue().floatValue();
            } else {
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = textLayer.trackingAnimation;
                if (baseKeyframeAnimation3 != null) {
                    floatValue = baseKeyframeAnimation3.getValue().floatValue();
                }
                float dpScale = ((Utils.dpScale() * f12) * f5) / 100.0f;
                List<String> textLines = textLayer.getTextLines(str);
                size = textLines.size();
                int i11 = -1;
                i5 = 0;
                int i12 = 0;
                while (i5 < size) {
                    String str2 = textLines.get(i5);
                    PointF pointF = documentData2.boxSize;
                    if (pointF == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF.x;
                    }
                    float f13 = dpScale;
                    List<TextSubLine> splitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str2, f10, font2, 0.0f, f13, false);
                    int i13 = 0;
                    while (i13 < splitGlyphTextIntoLines.size()) {
                        TextSubLine textSubLine = splitGlyphTextIntoLines.get(i13);
                        i11++;
                        canvas.save();
                        if (textLayer.textAnimation == null && textLayer.textSizeCallbackAnimation == null && textLayer.trackingCallbackAnimation == null) {
                            measureText = textSubLine.width;
                        } else {
                            measureText = textLayer.fillPaint.measureText(textSubLine.text);
                        }
                        if (textLayer.offsetCanvas(canvas, documentData2, i11, measureText)) {
                            f11 = f13;
                            i10 = i12;
                            textLayer.drawFontTextLine(textSubLine.text, documentData2, canvas, f11, i10, i4);
                        } else {
                            f11 = f13;
                            i10 = i12;
                        }
                        i12 = textSubLine.text.length() + i10;
                        canvas.restore();
                        i13++;
                        textLayer = this;
                        documentData2 = documentData;
                        f13 = f11;
                    }
                    dpScale = f13;
                    i5++;
                    textLayer = this;
                    documentData2 = documentData;
                    font2 = font;
                }
            }
            f12 += floatValue;
            float dpScale2 = ((Utils.dpScale() * f12) * f5) / 100.0f;
            List<String> textLines2 = textLayer.getTextLines(str);
            size = textLines2.size();
            int i112 = -1;
            i5 = 0;
            int i122 = 0;
            while (i5 < size) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawTextWithGlyphs(DocumentData documentData, Matrix matrix, Font font, Canvas canvas, int i4) {
        float f5;
        float floatValue;
        int i5;
        float f10;
        float f11;
        float f12;
        TextLayer textLayer = this;
        DocumentData documentData2 = documentData;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = textLayer.textSizeCallbackAnimation;
        if (baseKeyframeAnimation != null) {
            f5 = baseKeyframeAnimation.getValue().floatValue();
        } else {
            f5 = documentData2.size;
        }
        float f13 = f5 / 100.0f;
        float scale = Utils.getScale(matrix);
        List<String> textLines = textLayer.getTextLines(documentData2.text);
        int size = textLines.size();
        float f14 = documentData2.tracking / 10.0f;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = textLayer.trackingCallbackAnimation;
        if (baseKeyframeAnimation2 != null) {
            floatValue = baseKeyframeAnimation2.getValue().floatValue();
        } else {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = textLayer.trackingAnimation;
            if (baseKeyframeAnimation3 != null) {
                floatValue = baseKeyframeAnimation3.getValue().floatValue();
            }
            float f15 = f14;
            int i10 = -1;
            i5 = 0;
            while (i5 < size) {
                String str = textLines.get(i5);
                PointF pointF = documentData2.boxSize;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                List<TextSubLine> splitGlyphTextIntoLines = textLayer.splitGlyphTextIntoLines(str, f10, font, f13, f15, true);
                int i11 = 0;
                while (i11 < splitGlyphTextIntoLines.size()) {
                    TextSubLine textSubLine = splitGlyphTextIntoLines.get(i11);
                    i10++;
                    canvas.save();
                    if (textLayer.offsetCanvas(canvas, documentData2, i10, textSubLine.width)) {
                        float f16 = f13;
                        DocumentData documentData3 = documentData2;
                        f11 = f15;
                        f12 = scale;
                        textLayer.drawGlyphTextLine(textSubLine.text, documentData3, font, canvas, f12, f16, f11, i4);
                        f13 = f16;
                    } else {
                        f11 = f15;
                        f12 = scale;
                    }
                    canvas.restore();
                    i11++;
                    textLayer = this;
                    scale = f12;
                    f15 = f11;
                    documentData2 = documentData;
                }
                i5++;
                textLayer = this;
                f15 = f15;
                documentData2 = documentData;
            }
        }
        f14 += floatValue;
        float f152 = f14;
        int i102 = -1;
        i5 = 0;
        while (i5 < size) {
        }
    }

    private TextSubLine ensureEnoughSubLines(int i4) {
        for (int size = this.textSubLines.size(); size < i4; size++) {
            this.textSubLines.add(new TextSubLine());
        }
        return this.textSubLines.get(i4 - 1);
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
        if (this.contentsForCharacter.containsKey(fontCharacter)) {
            return this.contentsForCharacter.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new ContentGroup(this.lottieDrawable, this, shapes.get(i4), this.composition));
        }
        this.contentsForCharacter.put(fontCharacter, arrayList);
        return arrayList;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface getTypeface(Font font) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.lottieDrawable.getTypeface(font);
        if (typeface != null) {
            return typeface;
        }
        return font.getTypeface();
    }

    private boolean isIndexInRangeSelection(int i4) {
        int length = this.textAnimation.getValue().text.length();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.textRangeStartAnimation;
        if (baseKeyframeAnimation == null || this.textRangeEndAnimation == null) {
            return true;
        }
        int min = Math.min(baseKeyframeAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        int max = Math.max(this.textRangeStartAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.textRangeOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            int intValue = baseKeyframeAnimation2.getValue().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.textRangeUnits == TextRangeUnits.INDEX) {
            if (i4 >= min && i4 < max) {
                return true;
            }
            return false;
        }
        float f5 = (i4 / length) * 100.0f;
        if (f5 >= min && f5 < max) {
            return true;
        }
        return false;
    }

    private boolean isModifier(int i4) {
        if (Character.getType(i4) != 16 && Character.getType(i4) != 27 && Character.getType(i4) != 6 && Character.getType(i4) != 28 && Character.getType(i4) != 8 && Character.getType(i4) != 19) {
            return false;
        }
        return true;
    }

    private boolean offsetCanvas(Canvas canvas, DocumentData documentData, int i4, float f5) {
        float f10;
        float f11;
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float dpScale = Utils.dpScale();
        float f12 = 0.0f;
        if (pointF == null) {
            f10 = 0.0f;
        } else {
            f10 = (documentData.lineHeight * dpScale) + pointF.y;
        }
        float f13 = (i4 * documentData.lineHeight * dpScale) + f10;
        if (this.lottieDrawable.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f13 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        if (pointF == null) {
            f11 = 0.0f;
        } else {
            f11 = pointF.x;
        }
        if (pointF2 != null) {
            f12 = pointF2.x;
        }
        int i5 = AnonymousClass3.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[documentData.justification.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    canvas.translate(((f12 / 2.0f) + f11) - (f5 / 2.0f), f13);
                }
            } else {
                canvas.translate((f11 + f12) - f5, f13);
            }
        } else {
            canvas.translate(f11, f13);
        }
        return true;
    }

    private List<TextSubLine> splitGlyphTextIntoLines(String str, float f5, Font font, float f10, float f11, boolean z2) {
        float measureText;
        int i4 = 0;
        int i5 = 0;
        boolean z10 = false;
        int i10 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (z2) {
                FontCharacter fontCharacter = (FontCharacter) this.composition.getCharacters().delta(FontCharacter.hashFor(charAt, font.getFamily(), font.getStyle()));
                if (fontCharacter != null) {
                    measureText = (Utils.dpScale() * ((float) fontCharacter.getWidth()) * f10) + f11;
                }
            } else {
                measureText = this.fillPaint.measureText(str.substring(i11, i11 + 1)) + f11;
            }
            if (charAt == ' ') {
                z10 = true;
                f14 = measureText;
            } else if (z10) {
                z10 = false;
                i10 = i11;
                f13 = measureText;
            } else {
                f13 += measureText;
            }
            f12 += measureText;
            if (f5 > 0.0f && f12 >= f5 && charAt != ' ') {
                i4++;
                TextSubLine ensureEnoughSubLines = ensureEnoughSubLines(i4);
                if (i10 == i5) {
                    ensureEnoughSubLines.set(str.substring(i5, i11).trim(), (f12 - measureText) - ((r9.length() - r7.length()) * f14));
                    i5 = i11;
                    i10 = i5;
                    f12 = measureText;
                    f13 = f12;
                } else {
                    ensureEnoughSubLines.set(str.substring(i5, i10 - 1).trim(), ((f12 - f13) - ((r7.length() - r13.length()) * f14)) - f14);
                    f12 = f13;
                    i5 = i10;
                }
            }
        }
        if (f12 > 0.0f) {
            i4++;
            ensureEnoughSubLines(i4).set(str.substring(i5), f12);
        }
        return this.textSubLines.subList(0, i4);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t5, LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t5, lottieValueCallback);
        if (t5 == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeColorCallbackAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeWidthCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.strokeWidthCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.trackingCallbackAnimation;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.trackingCallbackAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.trackingCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.textSizeCallbackAnimation;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.textSizeCallbackAnimation = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.textSizeCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.TYPEFACE) {
            BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.typefaceCallbackAnimation;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (lottieValueCallback == null) {
                this.typefaceCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.typefaceCallbackAnimation = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.addUpdateListener(this);
            addAnimation(this.typefaceCallbackAnimation);
            return;
        }
        if (t5 == LottieProperty.TEXT) {
            this.textAnimation.setStringValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i4, DropShadow dropShadow) {
        Canvas canvas2;
        DocumentData value = this.textAnimation.getValue();
        Font font = this.composition.getFonts().get(value.fontName);
        if (font == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        configurePaint(value, i4, 0);
        if (this.lottieDrawable.useTextGlyphs()) {
            canvas2 = canvas;
            drawTextWithGlyphs(value, matrix, font, canvas2, i4);
        } else {
            canvas2 = canvas;
            drawTextWithFont(value, font, canvas2, i4);
        }
        canvas2.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        super.getBounds(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.composition.getBounds().width(), this.composition.getBounds().height());
    }
}
