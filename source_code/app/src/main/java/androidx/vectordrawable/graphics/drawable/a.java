package androidx.vectordrawable.graphics.drawable;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import av.q;
import com.clevertap.android.sdk.inapp.evaluation.TriggerAdapter;
import i1.AbstractC1881b;
import j1.C1931e;
import java.util.ArrayList;
import s6.C5;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int[] alpha = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] bravo = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] charlie = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] delta = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] echo = {R.attr.drawable};
    public static final int[] foxtrot = {R.attr.name, R.attr.animation};
    public static final int[] golf = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] hotel = {R.attr.ordering};
    public static final int[] india = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] juliet = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] kilo = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03b6, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03c5, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03c7, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03d3, code lost:
    
        if (r33 != 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03d5, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03d9, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03dc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03b2, code lost:
    
        if (r32 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03b4, code lost:
    
        if (r22 == null) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0384 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator alpha(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i4) {
        int i5;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        boolean z2;
        int i15;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i16;
        Keyframe ofObject;
        Keyframe ofObject2;
        ArrayList arrayList3;
        TypedValue peekValue;
        boolean z10;
        int i17;
        Keyframe ofInt;
        int i18;
        float f5;
        int i19;
        TypedValue peekValue2;
        int i20;
        Resources.Theme theme2;
        int i21;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlResourceParser xmlResourceParser2;
        ValueAnimator valueAnimator;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList4 = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i22 = 0;
            int i23 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i24 = 1;
            if (next == 1) {
                break;
            }
            int i25 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    delta(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = delta(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray hotel2 = AbstractC1881b.hotel(resources3, theme3, attributeSet, hotel);
                        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i21 = hotel2.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlResourceParser2 = xmlResourceParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i21 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlResourceParser2 = xmlResourceParser;
                        }
                        alpha(context, resources2, theme2, xmlResourceParser2, attributeSet3, animatorSet2, i21);
                        valueAnimator2 = animatorSet2;
                        hotel2.recycle();
                        i5 = depth;
                        arrayList = arrayList4;
                        if (animatorSet == null && i22 == 0) {
                            if (arrayList == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList;
                            }
                            arrayList4.add(valueAnimator2);
                        } else {
                            arrayList4 = arrayList;
                        }
                        depth = i5;
                    } else if (name.equals("propertyValuesHolder")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList5 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i23 || eventType == i24) {
                                break;
                            }
                            if (eventType != i25) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals("propertyValuesHolder")) {
                                    TypedArray hotel3 = AbstractC1881b.hotel(resources3, theme3, asAttributeSet, india);
                                    String delta2 = AbstractC1881b.delta(hotel3, xmlResourceParser, TriggerAdapter.INAPP_PROPERTYNAME, i23);
                                    if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        i15 = 4;
                                    } else {
                                        i15 = hotel3.getInt(i25, 4);
                                    }
                                    attributeSet2 = asAttributeSet;
                                    int i26 = i15;
                                    i11 = i25;
                                    ArrayList arrayList6 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        i12 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = juliet;
                                            arrayList3 = arrayList4;
                                            if (i26 == 4) {
                                                TypedArray hotel4 = AbstractC1881b.hotel(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                if (!AbstractC1881b.echo(xmlResourceParser, "value")) {
                                                    peekValue2 = null;
                                                } else {
                                                    peekValue2 = hotel4.peekValue(0);
                                                }
                                                if (peekValue2 != null && charlie(peekValue2.type)) {
                                                    i20 = 3;
                                                } else {
                                                    i20 = 0;
                                                }
                                                hotel4.recycle();
                                                i26 = i20;
                                            }
                                            TypedArray hotel5 = AbstractC1881b.hotel(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float f10 = -1.0f;
                                            if (AbstractC1881b.echo(xmlResourceParser, "fraction")) {
                                                f10 = hotel5.getFloat(3, -1.0f);
                                            }
                                            if (!AbstractC1881b.echo(xmlResourceParser, "value")) {
                                                peekValue = null;
                                            } else {
                                                peekValue = hotel5.peekValue(0);
                                            }
                                            if (peekValue != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (i26 == 4) {
                                                if (z10 && charlie(peekValue.type)) {
                                                    i17 = 3;
                                                } else {
                                                    i17 = 0;
                                                }
                                            } else {
                                                i17 = i26;
                                            }
                                            if (z10) {
                                                if (i17 != 0) {
                                                    if (i17 != 1 && i17 != 3) {
                                                        ofInt = null;
                                                    } else {
                                                        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null) {
                                                            i19 = hotel5.getInt(0, 0);
                                                        } else {
                                                            i19 = 0;
                                                        }
                                                        ofInt = Keyframe.ofInt(f10, i19);
                                                    }
                                                } else {
                                                    if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null) {
                                                        f5 = hotel5.getFloat(0, 0.0f);
                                                    } else {
                                                        f5 = 0.0f;
                                                    }
                                                    ofInt = Keyframe.ofFloat(f10, f5);
                                                }
                                            } else if (i17 == 0) {
                                                ofInt = Keyframe.ofFloat(f10);
                                            } else {
                                                ofInt = Keyframe.ofInt(f10);
                                            }
                                            if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
                                                i18 = hotel5.getResourceId(1, 0);
                                            } else {
                                                i18 = 0;
                                            }
                                            if (i18 > 0) {
                                                ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, i18));
                                            }
                                            hotel5.recycle();
                                            if (ofInt != null) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(ofInt);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            arrayList3 = arrayList4;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i12;
                                        arrayList4 = arrayList3;
                                    }
                                    arrayList2 = arrayList4;
                                    if (arrayList6 != null && (size = arrayList6.size()) > 0) {
                                        Keyframe keyframe = (Keyframe) arrayList6.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList6.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i27 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                int size2 = arrayList6.size();
                                                if (keyframe2.getType() == cls2) {
                                                    ofObject2 = Keyframe.ofFloat(1.0f);
                                                } else if (keyframe2.getType() == cls) {
                                                    ofObject2 = Keyframe.ofInt(1.0f);
                                                } else {
                                                    ofObject2 = Keyframe.ofObject(1.0f);
                                                }
                                                arrayList6.add(size2, ofObject2);
                                                i27++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                if (keyframe.getType() == cls2) {
                                                    ofObject = Keyframe.ofFloat(0.0f);
                                                } else if (keyframe.getType() == cls) {
                                                    ofObject = Keyframe.ofInt(0.0f);
                                                } else {
                                                    ofObject = Keyframe.ofObject(0.0f);
                                                }
                                                arrayList6.add(0, ofObject);
                                                i27++;
                                            }
                                        }
                                        int i28 = i27;
                                        Keyframe[] keyframeArr = new Keyframe[i28];
                                        arrayList6.toArray(keyframeArr);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            Keyframe keyframe3 = keyframeArr[i29];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i29 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i30 = i28 - 1;
                                                    if (i29 == i30) {
                                                        keyframe3.setFraction(1.0f);
                                                        i16 = i28;
                                                    } else {
                                                        int i31 = i29;
                                                        for (int i32 = i29 + 1; i32 < i30 && keyframeArr[i32].getFraction() < 0.0f; i32++) {
                                                            i31 = i32;
                                                        }
                                                        float fraction3 = (keyframeArr[i31 + 1].getFraction() - keyframeArr[i29 - 1].getFraction()) / ((i31 - i29) + 2);
                                                        int i33 = i29;
                                                        while (i33 <= i31) {
                                                            float f11 = fraction3;
                                                            keyframeArr[i33].setFraction(keyframeArr[i33 - 1].getFraction() + f11);
                                                            i33++;
                                                            i28 = i28;
                                                            fraction3 = f11;
                                                        }
                                                        i16 = i28;
                                                    }
                                                    i29++;
                                                    i28 = i16;
                                                }
                                            }
                                            i16 = i28;
                                            i29++;
                                            i28 = i16;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(delta2, keyframeArr);
                                        i14 = 3;
                                        if (i26 == 3) {
                                            propertyValuesHolder.setEvaluator(f.alpha);
                                        }
                                    } else {
                                        i14 = 3;
                                        propertyValuesHolder = null;
                                    }
                                    i13 = 0;
                                    i10 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = bravo(hotel3, i15, 0, 1, delta2);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(propertyValuesHolder);
                                    }
                                    hotel3.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i10 = i24;
                                    i11 = i25;
                                    i12 = depth;
                                    arrayList2 = arrayList4;
                                    i13 = i22;
                                    i14 = i23;
                                }
                                xmlResourceParser.next();
                                resources3 = resources;
                                i22 = i13;
                                i24 = i10;
                                i23 = i14;
                                i25 = i11;
                                asAttributeSet = attributeSet2;
                                depth = i12;
                                arrayList4 = arrayList2;
                                theme3 = theme;
                            }
                        }
                        int i34 = i24;
                        i5 = depth;
                        arrayList = arrayList4;
                        int i35 = i22;
                        if (arrayList5 != null) {
                            int size3 = arrayList5.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size3];
                            for (int i36 = i35; i36 < size3; i36++) {
                                propertyValuesHolderArr[i36] = (PropertyValuesHolder) arrayList5.get(i36);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i22 = i34;
                        if (animatorSet == null) {
                        }
                        arrayList4 = arrayList;
                        depth = i5;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                }
                valueAnimator2 = valueAnimator;
                i5 = depth;
                arrayList = arrayList4;
                if (animatorSet == null) {
                }
                arrayList4 = arrayList;
                depth = i5;
            }
        }
    }

    public static PropertyValuesHolder bravo(TypedArray typedArray, int i4, int i5, int i10, String str) {
        boolean z2;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        f fVar;
        int i13;
        int i14;
        int i15;
        float f5;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        TypedValue peekValue = typedArray.peekValue(i5);
        if (peekValue != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i11 = peekValue.type;
        } else {
            i11 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i10);
        if (peekValue2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue2.type;
        } else {
            i12 = 0;
        }
        if (i4 == 4) {
            if ((z2 && charlie(i11)) || (z10 && charlie(i12))) {
                i4 = 3;
            } else {
                i4 = 0;
            }
        }
        if (i4 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i4 == 2) {
            String string = typedArray.getString(i5);
            String string2 = typedArray.getString(i10);
            C1931e[] charlie2 = C5.charlie(string);
            C1931e[] charlie3 = C5.charlie(string2);
            if (charlie2 != null || charlie3 != null) {
                if (charlie2 != null) {
                    X6.g gVar = new X6.g(1);
                    if (charlie3 != null) {
                        if (C5.alpha(charlie2, charlie3)) {
                            return PropertyValuesHolder.ofObject(str, gVar, charlie2, charlie3);
                        }
                        throw new InflateException(q.foxtrot(" Can't morph from ", string, " to ", string2));
                    }
                    return PropertyValuesHolder.ofObject(str, gVar, charlie2);
                }
                if (charlie3 != null) {
                    return PropertyValuesHolder.ofObject(str, new X6.g(1), charlie3);
                }
            }
            return null;
        }
        if (i4 == 3) {
            fVar = f.alpha;
        } else {
            fVar = null;
        }
        if (z11) {
            if (z2) {
                if (i11 == 5) {
                    f10 = typedArray.getDimension(i5, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i5, 0.0f);
                }
                if (z10) {
                    if (i12 == 5) {
                        f11 = typedArray.getDimension(i10, 0.0f);
                    } else {
                        f11 = typedArray.getFloat(i10, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i12 == 5) {
                    f5 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f5 = typedArray.getFloat(i10, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f5);
            }
            propertyValuesHolder = ofFloat;
        } else if (z2) {
            if (i11 == 5) {
                i14 = (int) typedArray.getDimension(i5, 0.0f);
            } else if (charlie(i11)) {
                i14 = typedArray.getColor(i5, 0);
            } else {
                i14 = typedArray.getInt(i5, 0);
            }
            if (z10) {
                if (i12 == 5) {
                    i15 = (int) typedArray.getDimension(i10, 0.0f);
                } else if (charlie(i12)) {
                    i15 = typedArray.getColor(i10, 0);
                } else {
                    i15 = typedArray.getInt(i10, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14, i15);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
            }
        } else if (z10) {
            if (i12 == 5) {
                i13 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (charlie(i12)) {
                i13 = typedArray.getColor(i10, 0);
            } else {
                i13 = typedArray.getInt(i10, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean charlie(int i4) {
        if (i4 >= 28 && i4 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator delta(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        boolean z2;
        int i4;
        boolean z10;
        int i5;
        int i10;
        int i11;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int i14 = 0;
        TypedArray hotel2 = AbstractC1881b.hotel(resources, theme, attributeSet, golf);
        TypedArray hotel3 = AbstractC1881b.hotel(resources, theme, attributeSet, kilo);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i15 = 300;
        if (AbstractC1881b.echo(xmlResourceParser, "duration")) {
            i15 = hotel2.getInt(1, 300);
        }
        long j5 = i15;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i4 = 0;
        } else {
            i4 = hotel2.getInt(2, 0);
        }
        long j6 = i4;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i5 = 4;
        } else {
            i5 = hotel2.getInt(7, 4);
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i5 == 4) {
                TypedValue peekValue = hotel2.peekValue(5);
                if (peekValue != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i12 = peekValue.type;
                } else {
                    i12 = 0;
                }
                TypedValue peekValue2 = hotel2.peekValue(6);
                if (peekValue2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i13 = peekValue2.type;
                } else {
                    i13 = 0;
                }
                if ((z11 && charlie(i12)) || (z12 && charlie(i13))) {
                    i5 = 3;
                } else {
                    i5 = 0;
                }
            }
            PropertyValuesHolder bravo2 = bravo(hotel2, i5, 5, 6, "");
            if (bravo2 != null) {
                valueAnimator.setValues(bravo2);
            }
        }
        valueAnimator.setDuration(j5);
        valueAnimator.setStartDelay(j6);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i10 = hotel2.getInt(3, 0);
        } else {
            i10 = 0;
        }
        valueAnimator.setRepeatCount(i10);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i11 = hotel2.getInt(4, 1);
        } else {
            i11 = 1;
        }
        valueAnimator.setRepeatMode(i11);
        if (hotel3 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String delta2 = AbstractC1881b.delta(hotel3, xmlResourceParser, "pathData", 1);
            if (delta2 != null) {
                String delta3 = AbstractC1881b.delta(hotel3, xmlResourceParser, "propertyXName", 2);
                String delta4 = AbstractC1881b.delta(hotel3, xmlResourceParser, "propertyYName", 3);
                if (i5 != 2) {
                }
                if (delta3 == null && delta4 == null) {
                    throw new InflateException(hotel3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path delta5 = C5.delta(delta2);
                PathMeasure pathMeasure = new PathMeasure(delta5, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f5 = 0.0f;
                do {
                    f5 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f5));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(delta5, false);
                int min = Math.min(100, ((int) (f5 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f10 = f5 / (min - 1);
                valueAnimator2 = valueAnimator;
                int i16 = 0;
                int i17 = 0;
                float f11 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i16 >= min) {
                        break;
                    }
                    int i18 = i16;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i17)).floatValue(), fArr3, null);
                    fArr[i18] = fArr3[0];
                    fArr2[i18] = fArr3[1];
                    int i19 = i17 + 1;
                    f11 += f10;
                    if (i19 < arrayList.size() && f11 > ((Float) arrayList.get(i19)).floatValue()) {
                        pathMeasure2.nextContour();
                        i17 = i19;
                    }
                    i16 = i18 + 1;
                }
                if (delta3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(delta3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (delta4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(delta4, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(propertyValuesHolder);
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(propertyValuesHolder2);
                } else {
                    objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                }
                i14 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                objectAnimator2.setPropertyName(AbstractC1881b.delta(hotel3, xmlResourceParser, TriggerAdapter.INAPP_PROPERTYNAME, 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i14 = hotel2.getResourceId(i14, i14);
        }
        if (i14 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i14));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        hotel2.recycle();
        if (hotel3 != null) {
            hotel3.recycle();
        }
        return valueAnimator3;
    }
}
