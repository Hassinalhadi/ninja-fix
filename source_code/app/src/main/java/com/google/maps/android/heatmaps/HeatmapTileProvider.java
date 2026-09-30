package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import bv.u;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import z6.i;

/* loaded from: classes2.dex */
public class HeatmapTileProvider implements i {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    /* loaded from: classes2.dex */
    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = 0.0d;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this, 0);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d4) {
            this.intensity = d4;
            return this;
        }

        public Builder opacity(double d4) {
            this.opacity = d4;
            if (d4 >= 0.0d && d4 <= 1.0d) {
                return this;
            }
            throw new IllegalArgumentException("Opacity must be in range [0, 1]");
        }

        public Builder radius(int i4) {
            this.radius = i4;
            if (i4 >= 10 && i4 <= 50) {
                return this;
            }
            throw new IllegalArgumentException("Radius not within bounds.");
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            throw new IllegalArgumentException("No input points.");
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    public /* synthetic */ HeatmapTileProvider(Builder builder, int i4) {
        this(builder);
    }

    public static Bitmap colorize(double[][] dArr, int[] iArr, double d4) {
        int i4 = iArr[iArr.length - 1];
        double length = (iArr.length - 1) / d4;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i5 = 0; i5 < length2; i5++) {
            for (int i10 = 0; i10 < length2; i10++) {
                double d9 = dArr[i10][i5];
                int i11 = (i5 * length2) + i10;
                int i12 = (int) (d9 * length);
                if (d9 != 0.0d) {
                    if (i12 < iArr.length) {
                        iArr2[i11] = iArr[i12];
                    } else {
                        iArr2[i11] = i4;
                    }
                } else {
                    iArr2[i11] = 0;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(byteArrayOutputStream.toByteArray(), 512, 512);
    }

    public static double[][] convolve(double[][] dArr, double[] dArr2) {
        int i4;
        boolean z2;
        int i5;
        double d4;
        int i10;
        int floor = (int) Math.floor(dArr2.length / 2.0d);
        int length = dArr.length;
        int i11 = length - (floor * 2);
        int i12 = floor + i11;
        int i13 = i12 - 1;
        boolean z10 = true;
        int i14 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i15 = 0;
        while (true) {
            double d9 = 0.0d;
            if (i15 >= length) {
                break;
            }
            int i16 = i14;
            while (i16 < length) {
                double d10 = dArr[i15][i16];
                if (d10 != d9) {
                    z2 = z10;
                    int i17 = i15 + floor;
                    if (i13 < i17) {
                        i17 = i13;
                    }
                    int i18 = i17 + 1;
                    i5 = i14;
                    int i19 = i15 - floor;
                    if (floor > i19) {
                        i10 = floor;
                    } else {
                        i10 = i19;
                    }
                    d4 = d9;
                    for (int i20 = i10; i20 < i18; i20++) {
                        double[] dArr4 = dArr3[i20];
                        dArr4[i16] = (dArr2[i20 - i19] * d10) + dArr4[i16];
                    }
                } else {
                    z2 = z10;
                    i5 = i14;
                    d4 = d9;
                }
                i16++;
                z10 = z2;
                i14 = i5;
                d9 = d4;
            }
            i15++;
        }
        int i21 = i14;
        int[] iArr = new int[2];
        iArr[z10 ? 1 : 0] = i11;
        iArr[i21] = i11;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i22 = floor; i22 < i12; i22++) {
            for (int i23 = i21; i23 < length; i23++) {
                double d11 = dArr3[i22][i23];
                if (d11 != 0.0d) {
                    int i24 = i23 + floor;
                    if (i13 < i24) {
                        i24 = i13;
                    }
                    int i25 = i24 + 1;
                    int i26 = i23 - floor;
                    if (floor > i26) {
                        i4 = floor;
                    } else {
                        i4 = i26;
                    }
                    while (i4 < i25) {
                        double[] dArr6 = dArr5[i22 - floor];
                        int i27 = i4 - floor;
                        dArr6[i27] = (dArr2[i4 - i26] * d11) + dArr6[i27];
                        i4++;
                    }
                }
            }
        }
        return dArr5;
    }

    public static double[] generateKernel(int i4, double d4) {
        double[] dArr = new double[(i4 * 2) + 1];
        for (int i5 = -i4; i5 <= i4; i5++) {
            dArr[i5 + i4] = Math.exp(((-i5) * i5) / ((2.0d * d4) * d4));
        }
        return dArr;
    }

    public static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d4 = next.getPoint().f8319x;
        double d9 = next.getPoint().f8319x;
        double d10 = d4;
        double d11 = d9;
        double d12 = next.getPoint().f8320y;
        double d13 = next.getPoint().f8320y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d14 = next2.getPoint().f8319x;
            double d15 = next2.getPoint().f8320y;
            if (d14 < d10) {
                d10 = d14;
            }
            if (d14 > d11) {
                d11 = d14;
            }
            if (d15 < d12) {
                d12 = d15;
            }
            if (d15 > d13) {
                d13 = d15;
            }
        }
        return new Bounds(d10, d11, d12, d13);
    }

    private double[] getMaxIntensities(int i4) {
        int i5;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i10 = 0; i10 < 22; i10++) {
                dArr[i10] = this.mCustomMaxIntensity;
            }
        } else {
            int i11 = 5;
            while (true) {
                if (i11 >= 11) {
                    break;
                }
                dArr[i11] = getMaxValue(this.mData, this.mBounds, i4, (int) (Math.pow(2.0d, i11 - 3) * 1280.0d));
                if (i11 == 5) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        dArr[i12] = dArr[i11];
                    }
                }
                i11++;
            }
            for (i5 = 11; i5 < 22; i5++) {
                dArr[i5] = dArr[10];
            }
        }
        return dArr;
    }

    public static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i4, int i5) {
        double d4 = bounds.minX;
        double d9 = bounds.maxX;
        double d10 = bounds.minY;
        double d11 = d9 - d4;
        double d12 = bounds.maxY - d10;
        if (d11 <= d12) {
            d11 = d12;
        }
        double d13 = ((int) ((i5 / (i4 * 2)) + 0.5d)) / d11;
        u uVar = new u((Object) null);
        double d14 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            double d15 = weightedLatLng.getPoint().f8319x;
            int i10 = (int) ((weightedLatLng.getPoint().f8320y - d10) * d13);
            long j5 = (int) ((d15 - d4) * d13);
            u uVar2 = (u) uVar.delta(j5);
            if (uVar2 == null) {
                uVar2 = new u((Object) null);
                uVar.hotel(j5, uVar2);
            }
            long j6 = i10;
            Double d16 = (Double) uVar2.delta(j6);
            if (d16 == null) {
                d16 = Double.valueOf(0.0d);
            }
            double intensity = weightedLatLng.getIntensity() + d16.doubleValue();
            uVar2.hotel(j6, Double.valueOf(intensity));
            if (intensity > d14) {
                d14 = intensity;
            }
        }
        return d14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    @Override // z6.i
    public Tile getTile(int i4, int i5, int i10) {
        double d4 = 1.0d;
        double pow = 1.0d / Math.pow(2.0d, i10);
        double d9 = (this.mRadius * pow) / 512.0d;
        double d10 = ((2.0d * d9) + pow) / ((r10 * 2) + 512);
        double d11 = (i4 * pow) - d9;
        double d12 = ((i4 + 1) * pow) + d9;
        double d13 = (i5 * pow) - d9;
        double d14 = ((i5 + 1) * pow) + d9;
        Collection<WeightedLatLng> arrayList = new ArrayList<>();
        if (d11 < 0.0d) {
            arrayList = this.mTree.search(new Bounds(d11 + 1.0d, 1.0d, d13, d14));
            d4 = -1.0d;
        } else if (d12 > 1.0d) {
            arrayList = this.mTree.search(new Bounds(0.0d, d12 - 1.0d, d13, d14));
        } else {
            d4 = 0.0d;
        }
        Bounds bounds = new Bounds(d11, d12, d13, d14);
        Bounds bounds2 = this.mBounds;
        boolean intersects = bounds.intersects(new Bounds(bounds2.minX - d9, bounds2.maxX + d9, bounds2.minY - d9, bounds2.maxY + d9));
        Tile tile = i.alpha;
        if (!intersects) {
            return tile;
        }
        Collection<WeightedLatLng> search = this.mTree.search(bounds);
        if (search.isEmpty()) {
            return tile;
        }
        int i11 = this.mRadius;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i11 * 2) + 512, (i11 * 2) + 512);
        for (WeightedLatLng weightedLatLng : search) {
            Point point = weightedLatLng.getPoint();
            int i12 = (int) ((point.f8319x - d11) / d10);
            int i13 = (int) ((point.f8320y - d13) / d10);
            double[] dArr2 = dArr[i12];
            dArr2[i13] = weightedLatLng.getIntensity() + dArr2[i13];
        }
        for (WeightedLatLng weightedLatLng2 : arrayList) {
            Point point2 = weightedLatLng2.getPoint();
            int i14 = (int) (((point2.f8319x + d4) - d11) / d10);
            int i15 = (int) ((point2.f8320y - d13) / d10);
            double[] dArr3 = dArr[i14];
            dArr3[i15] = weightedLatLng2.getIntensity() + dArr3[i15];
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i10]));
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d4) {
        this.mCustomMaxIntensity = d4;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d4) {
        this.mOpacity = d4;
        setGradient(this.mGradient);
    }

    public void setRadius(int i4) {
        this.mRadius = i4;
        this.mKernel = generateKernel(i4, i4 / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (!collection.isEmpty()) {
            Bounds bounds = getBounds(this.mData);
            this.mBounds = bounds;
            this.mTree = new PointQuadTree<>(bounds);
            Iterator<WeightedLatLng> it = this.mData.iterator();
            while (it.hasNext()) {
                this.mTree.add(it.next());
            }
            this.mMaxIntensity = getMaxIntensities(this.mRadius);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i4 = this.mRadius;
        this.mKernel = generateKernel(i4, i4 / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }
}
