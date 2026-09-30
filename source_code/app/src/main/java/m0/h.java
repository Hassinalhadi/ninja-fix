package m0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class h {
    public long alpha;
    public final SparseLongArray bravo = new SparseLongArray();
    public final SparseBooleanArray charlie = new SparseBooleanArray();
    public final ArrayList delta = new ArrayList();
    public int echo = -1;
    public int foxtrot = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.play.core.integrity.c alpha(MotionEvent motionEvent, C2946x c2946x) {
        long j5;
        boolean z2;
        boolean z10;
        int i4;
        int i5;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j6;
        float f5;
        long j7;
        long quebec;
        float rawX;
        float rawY;
        long black;
        int toolType;
        int i11;
        int historySize;
        int i12;
        long j10;
        long j11;
        int i13;
        C2946x c2946x2 = c2946x;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.bravo;
        SparseBooleanArray sparseBooleanArray = this.charlie;
        int i14 = 3;
        if (actionMasked != 3) {
            int i15 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.echo || source != this.foxtrot) {
                        this.echo = toolType2;
                        this.foxtrot = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0 && actionMasked2 != 5) {
                    if (actionMasked2 == 9) {
                        int pointerId = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId) < 0) {
                            long j12 = this.alpha;
                            j5 = 1;
                            this.alpha = j12 + 1;
                            sparseLongArray.put(pointerId, j12);
                        }
                    }
                    j5 = 1;
                } else {
                    j5 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j13 = this.alpha;
                        this.alpha = j13 + 1;
                        sparseLongArray.put(pointerId2, j13);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId2, true);
                        }
                    }
                }
                if (actionMasked != 9 && actionMasked != 7 && actionMasked != 10) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (actionMasked == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z2) {
                    i4 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i4 = 1;
                }
                if (actionMasked != i4) {
                    if (actionMasked != 6) {
                        i5 = -1;
                    } else {
                        i5 = motionEvent.getActionIndex();
                    }
                } else {
                    i5 = 0;
                }
                ArrayList arrayList = this.delta;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i16 = 0;
                while (i16 < pointerCount) {
                    if (!z2 && i16 != i5 && (!z10 || motionEvent.getButtonState() != 0)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int pointerId3 = motionEvent.getPointerId(i16);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z13 = z2;
                        z12 = z10;
                        j6 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z12 = z10;
                        long j14 = this.alpha;
                        z13 = z2;
                        this.alpha = j14 + j5;
                        sparseLongArray.put(pointerId3, j14);
                        j6 = j14;
                    }
                    float pressure = motionEvent.getPressure(i16);
                    float x4 = motionEvent.getX(i16);
                    float y10 = motionEvent.getY(i16);
                    char c3 = ' ';
                    long floatToRawIntBits = (Float.floatToRawIntBits(y10) & 4294967295L) | (Float.floatToRawIntBits(x4) << 32);
                    long alpha = Z.b.alpha(0.0f, i14, floatToRawIntBits);
                    if (i16 == 0) {
                        float rawX2 = motionEvent.getRawX();
                        float rawY2 = motionEvent.getRawY();
                        f5 = 0.0f;
                        quebec = (Float.floatToRawIntBits(rawY2) & 4294967295L) | (Float.floatToRawIntBits(rawX2) << 32);
                        black = c2946x2.black(quebec);
                    } else {
                        f5 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            rawX = motionEvent.getRawX(i16);
                            rawY = motionEvent.getRawY(i16);
                            quebec = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                            black = c2946x2.black(quebec);
                        } else {
                            j7 = floatToRawIntBits;
                            quebec = c2946x2.quebec(floatToRawIntBits);
                            toolType = motionEvent.getToolType(i16);
                            if (toolType != 0) {
                                if (toolType != 1) {
                                    if (toolType != 2) {
                                        if (toolType != i14) {
                                            if (toolType == i15) {
                                                i11 = i15;
                                            }
                                        } else {
                                            i11 = 2;
                                        }
                                    } else {
                                        i11 = i14;
                                    }
                                } else {
                                    i11 = 1;
                                }
                                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                                historySize = motionEvent.getHistorySize();
                                i12 = 0;
                                while (i12 < historySize) {
                                    float historicalX = motionEvent.getHistoricalX(i16, i12);
                                    float historicalY = motionEvent.getHistoricalY(i16, i12);
                                    char c4 = c3;
                                    if ((Float.floatToRawIntBits(historicalX) & LottieConstants.IterateForever) < 2139095040 && (Float.floatToRawIntBits(historicalY) & LottieConstants.IterateForever) < 2139095040) {
                                        i13 = i5;
                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(historicalX) << c4) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                                        arrayList2.add(new b(motionEvent.getHistoricalEventTime(i12), floatToRawIntBits2, floatToRawIntBits2));
                                    } else {
                                        i13 = i5;
                                    }
                                    i12++;
                                    i5 = i13;
                                    c3 = c4;
                                }
                                char c10 = c3;
                                int i17 = i5;
                                if (motionEvent.getActionMasked() == 8) {
                                    float axisValue = motionEvent.getAxisValue(10);
                                    float f10 = (-motionEvent.getAxisValue(9)) + f5;
                                    j10 = quebec;
                                    j11 = (Float.floatToRawIntBits(axisValue) << c10) | (Float.floatToRawIntBits(f10) & 4294967295L);
                                } else {
                                    j10 = quebec;
                                    j11 = 0;
                                }
                                arrayList.add(new t(j6, motionEvent.getEventTime(), j10, j7, z11, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList2, j11, alpha));
                                i16++;
                                c2946x2 = c2946x;
                                i5 = i17;
                                z10 = z12;
                                z2 = z13;
                                i14 = 3;
                                i15 = 4;
                            }
                            i11 = 0;
                            ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i12 = 0;
                            while (i12 < historySize) {
                            }
                            char c102 = c3;
                            int i172 = i5;
                            if (motionEvent.getActionMasked() == 8) {
                            }
                            arrayList.add(new t(j6, motionEvent.getEventTime(), j10, j7, z11, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList22, j11, alpha));
                            i16++;
                            c2946x2 = c2946x;
                            i5 = i172;
                            z10 = z12;
                            z2 = z13;
                            i14 = 3;
                            i15 = 4;
                        }
                    }
                    j7 = black;
                    toolType = motionEvent.getToolType(i16);
                    if (toolType != 0) {
                    }
                    i11 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i12 = 0;
                    while (i12 < historySize) {
                    }
                    char c1022 = c3;
                    int i1722 = i5;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new t(j6, motionEvent.getEventTime(), j10, j7, z11, pressure, i11, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList222, j11, alpha));
                    i16++;
                    c2946x2 = c2946x;
                    i5 = i1722;
                    z10 = z12;
                    z2 = z13;
                    i14 = 3;
                    i15 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 != 1 && actionMasked3 != 6) {
                    i10 = 0;
                } else {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i10 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i18 = i10;
                        while (true) {
                            if (i18 < pointerCount2) {
                                if (motionEvent.getPointerId(i18) == keyAt) {
                                    break;
                                }
                                i18++;
                            } else {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                        }
                    }
                }
                motionEvent.getEventTime();
                return new com.google.android.play.core.integrity.c(4, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
