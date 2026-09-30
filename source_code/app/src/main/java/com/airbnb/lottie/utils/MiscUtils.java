package com.airbnb.lottie.utils;

import Q0.c;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.List;

/* loaded from: classes3.dex */
public class MiscUtils {
    private static final PointF pathFromDataCurrentPoint = new PointF();

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i4, int i5, int i10) {
        return Math.max(i5, Math.min(i10, i4));
    }

    public static boolean contains(float f5, float f10, float f11) {
        return f5 >= f10 && f5 <= f11;
    }

    private static int floorDiv(int i4, int i5) {
        boolean z2;
        int i10 = i4 / i5;
        if ((i4 ^ i5) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i11 = i4 % i5;
        if (!z2 && i11 != 0) {
            return i10 - 1;
        }
        return i10;
    }

    public static int floorMod(float f5, float f10) {
        return floorMod((int) f5, (int) f10);
    }

    public static void getPathFromData(ShapeData shapeData, Path path) {
        Path path2;
        path.reset();
        PointF initialPoint = shapeData.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        pathFromDataCurrentPoint.set(initialPoint.x, initialPoint.y);
        int i4 = 0;
        while (i4 < shapeData.getCurves().size()) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(i4);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            PointF pointF = pathFromDataCurrentPoint;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
            i4++;
            path = path2;
        }
        Path path3 = path;
        if (shapeData.isClosed()) {
            path3.close();
        }
    }

    public static double lerp(double d4, double d9, double d10) {
        return ((d9 - d4) * d10) + d4;
    }

    public static void resolveKeyPath(KeyPath keyPath, int i4, List<KeyPath> list, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.fullyResolvesTo(keyPathElementContent.getName(), i4)) {
            list.add(keyPath2.addKey(keyPathElementContent.getName()).resolve(keyPathElementContent));
        }
    }

    public static float clamp(float f5, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f5));
    }

    private static int floorMod(int i4, int i5) {
        return i4 - (i5 * floorDiv(i4, i5));
    }

    public static int lerp(int i4, int i5, float f5) {
        return (int) ((f5 * (i5 - i4)) + i4);
    }

    public static double clamp(double d4, double d9, double d10) {
        return Math.max(d9, Math.min(d10, d4));
    }

    public static float lerp(float f5, float f10, float f11) {
        return c.lima(f10, f5, f11, f5);
    }
}
