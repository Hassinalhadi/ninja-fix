package com.airbnb.lottie.model.layer;

import Q0.c;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class Layer {
    private final LBlendMode blendMode;
    private final BlurEffect blurEffect;
    private final LottieComposition composition;
    private final DropShadowEffect dropShadowEffect;
    private final boolean hidden;
    private final List<Keyframe<Float>> inOutKeyframes;
    private final long layerId;
    private final String layerName;
    private final LayerType layerType;
    private final List<Mask> masks;
    private final MatteType matteType;
    private final long parentId;
    private final float preCompHeight;
    private final float preCompWidth;
    private final String refId;
    private final List<ContentModel> shapes;
    private final int solidColor;
    private final int solidHeight;
    private final int solidWidth;
    private final float startFrame;
    private final AnimatableTextFrame text;
    private final AnimatableTextProperties textProperties;
    private final AnimatableFloatValue timeRemapping;
    private final float timeStretch;
    private final AnimatableTransform transform;

    /* loaded from: classes3.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes3.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j5, LayerType layerType, long j6, String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i4, int i5, int i10, float f5, float f10, float f11, float f12, AnimatableTextFrame animatableTextFrame, AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, AnimatableFloatValue animatableFloatValue, boolean z2, BlurEffect blurEffect, DropShadowEffect dropShadowEffect, LBlendMode lBlendMode) {
        this.shapes = list;
        this.composition = lottieComposition;
        this.layerName = str;
        this.layerId = j5;
        this.layerType = layerType;
        this.parentId = j6;
        this.refId = str2;
        this.masks = list2;
        this.transform = animatableTransform;
        this.solidWidth = i4;
        this.solidHeight = i5;
        this.solidColor = i10;
        this.timeStretch = f5;
        this.startFrame = f10;
        this.preCompWidth = f11;
        this.preCompHeight = f12;
        this.text = animatableTextFrame;
        this.textProperties = animatableTextProperties;
        this.inOutKeyframes = list3;
        this.matteType = matteType;
        this.timeRemapping = animatableFloatValue;
        this.hidden = z2;
        this.blurEffect = blurEffect;
        this.dropShadowEffect = dropShadowEffect;
        this.blendMode = lBlendMode;
    }

    public LBlendMode getBlendMode() {
        return this.blendMode;
    }

    public BlurEffect getBlurEffect() {
        return this.blurEffect;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public DropShadowEffect getDropShadowEffect() {
        return this.dropShadowEffect;
    }

    public long getId() {
        return this.layerId;
    }

    public List<Keyframe<Float>> getInOutKeyframes() {
        return this.inOutKeyframes;
    }

    public LayerType getLayerType() {
        return this.layerType;
    }

    public List<Mask> getMasks() {
        return this.masks;
    }

    public MatteType getMatteType() {
        return this.matteType;
    }

    public String getName() {
        return this.layerName;
    }

    public long getParentId() {
        return this.parentId;
    }

    public float getPreCompHeight() {
        return this.preCompHeight;
    }

    public float getPreCompWidth() {
        return this.preCompWidth;
    }

    public String getRefId() {
        return this.refId;
    }

    public List<ContentModel> getShapes() {
        return this.shapes;
    }

    public int getSolidColor() {
        return this.solidColor;
    }

    public int getSolidHeight() {
        return this.solidHeight;
    }

    public int getSolidWidth() {
        return this.solidWidth;
    }

    public float getStartProgress() {
        return this.startFrame / this.composition.getDurationFrames();
    }

    public AnimatableTextFrame getText() {
        return this.text;
    }

    public AnimatableTextProperties getTextProperties() {
        return this.textProperties;
    }

    public AnimatableFloatValue getTimeRemapping() {
        return this.timeRemapping;
    }

    public float getTimeStretch() {
        return this.timeStretch;
    }

    public AnimatableTransform getTransform() {
        return this.transform;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public String toString(String str) {
        StringBuilder tango = c.tango(str);
        tango.append(getName());
        tango.append("\n");
        Layer layerModelForId = this.composition.layerModelForId(getParentId());
        if (layerModelForId != null) {
            tango.append("\t\tParents: ");
            tango.append(layerModelForId.getName());
            Layer layerModelForId2 = this.composition.layerModelForId(layerModelForId.getParentId());
            while (layerModelForId2 != null) {
                tango.append("->");
                tango.append(layerModelForId2.getName());
                layerModelForId2 = this.composition.layerModelForId(layerModelForId2.getParentId());
            }
            tango.append(str);
            tango.append("\n");
        }
        if (!getMasks().isEmpty()) {
            tango.append(str);
            tango.append("\tMasks: ");
            tango.append(getMasks().size());
            tango.append("\n");
        }
        if (getSolidWidth() != 0 && getSolidHeight() != 0) {
            tango.append(str);
            tango.append("\tBackground: ");
            tango.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(getSolidWidth()), Integer.valueOf(getSolidHeight()), Integer.valueOf(getSolidColor())));
        }
        if (!this.shapes.isEmpty()) {
            tango.append(str);
            tango.append("\tShapes:\n");
            for (ContentModel contentModel : this.shapes) {
                tango.append(str);
                tango.append("\t\t");
                tango.append(contentModel);
                tango.append("\n");
            }
        }
        return tango.toString();
    }

    public String toString() {
        return toString("");
    }
}
