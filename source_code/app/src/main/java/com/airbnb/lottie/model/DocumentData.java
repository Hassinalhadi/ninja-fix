package com.airbnb.lottie.model;

import android.graphics.PointF;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public class DocumentData {
    public float baselineShift;
    public PointF boxPosition;
    public PointF boxSize;
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    /* loaded from: classes3.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f5, Justification justification, int i4, float f10, float f11, int i5, int i10, float f12, boolean z2, PointF pointF, PointF pointF2) {
        set(str, str2, f5, justification, i4, f10, f11, i5, i10, f12, z2, pointF, pointF2);
    }

    public int hashCode() {
        int ordinal = ((this.justification.ordinal() + (((int) (AbstractC2327c.sierra(this.text.hashCode() * 31, 31, this.fontName) + this.size)) * 31)) * 31) + this.tracking;
        long floatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f5, Justification justification, int i4, float f10, float f11, int i5, int i10, float f12, boolean z2, PointF pointF, PointF pointF2) {
        this.text = str;
        this.fontName = str2;
        this.size = f5;
        this.justification = justification;
        this.tracking = i4;
        this.lineHeight = f10;
        this.baselineShift = f11;
        this.color = i5;
        this.strokeColor = i10;
        this.strokeWidth = f12;
        this.strokeOverFill = z2;
        this.boxPosition = pointF;
        this.boxSize = pointF2;
    }

    public DocumentData() {
    }
}
