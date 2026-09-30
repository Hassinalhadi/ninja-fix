package t6;

import a0.AbstractC0362p;
import a0.C0352f;
import a0.C0363q;
import a0.C0366t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import f0.AbstractC1680b;
import f0.C1679a;
import g0.AbstractC1722b;
import g0.C1725e;
import h0.AbstractC1799b;
import h0.C1798a;
import i1.AbstractC1881b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;
import y0.C3387a;

/* renamed from: t6.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3076w3 implements ar.a {
    public static androidx.camera.core.impl.E alpha(Context context, Bundle bundle) {
        boolean z2 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] bravo = bravo(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] bravo2 = bravo(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC3066u3.bravo("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC3066u3.bravo("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z2);
        AbstractC3066u3.bravo("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(bravo));
        AbstractC3066u3.bravo("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(bravo2));
        return new androidx.camera.core.impl.E(z2, new HashSet(delta(bravo)), new HashSet(delta(bravo2)));
    }

    public static String[] bravo(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i4 = bundle.getInt(str, -1);
        if (i4 == -1) {
            AbstractC3066u3.india("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i4);
        } catch (Resources.NotFoundException e) {
            AbstractC3066u3.juliet("QuirkSettingsLoader", "Quirk class names resource not found: " + i4, e);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC1680b charlie(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        TypedValue typedValue;
        int i10;
        boolean z2;
        C3387a c3387a;
        boolean z10;
        long j5;
        int i11;
        C1725e c1725e;
        int eventType;
        XmlResourceParser xmlResourceParser;
        y0.b bVar;
        C1725e c1725e2;
        char c3;
        List list;
        String str;
        List list2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Shader shader;
        AbstractC0362p auVar;
        Shader shader2;
        AbstractC0362p auVar2;
        AbstractC0362p abstractC0362p;
        int i18;
        String str2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        Resources resources = (Resources) c0585q.kilo(AndroidCompositionLocals_androidKt.charlie);
        y0.d dVar = (y0.d) c0585q.kilo(AndroidCompositionLocals_androidKt.echo);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.alpha.bravo(i4);
            i10 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i4, typedValue, true);
                bv.aa aaVar = dVar.alpha;
                int delta = aaVar.delta(i4);
                Object[] objArr = aaVar.charlie;
                Object obj = objArr[delta];
                aaVar.bravo[delta] = i4;
                objArr[delta] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt.bronze(charSequence, ".xml")) {
            c0585q.purple(-1771786530);
            Resources.Theme theme = context.getTheme();
            int i19 = typedValue.changingConfigurations;
            y0.c cVar = (y0.c) c0585q.kilo(AndroidCompositionLocals_androidKt.delta);
            y0.b bVar2 = new y0.b(theme, i4);
            WeakReference weakReference = (WeakReference) cVar.alpha.get(bVar2);
            if (weakReference != null) {
                c3387a = (C3387a) weakReference.get();
            } else {
                c3387a = null;
            }
            if (c3387a == null) {
                XmlResourceParser xml = resources.getXml(i4);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    if (Intrinsics.areEqual(xml.getName(), "vector")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        C1798a c1798a = new C1798a(xml);
                        TypedArray hotel = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1799b.alpha);
                        c1798a.bravo(hotel.getChangingConfigurations());
                        if (!AbstractC1881b.echo(xml, "autoMirrored")) {
                            z10 = false;
                        } else {
                            z10 = hotel.getBoolean(5, false);
                        }
                        c1798a.bravo(hotel.getChangingConfigurations());
                        float alpha = c1798a.alpha(hotel, "viewportWidth", 7, 0.0f);
                        float alpha2 = c1798a.alpha(hotel, "viewportHeight", 8, 0.0f);
                        if (alpha > 0.0f) {
                            if (alpha2 > 0.0f) {
                                float dimension = hotel.getDimension(3, 0.0f);
                                c1798a.bravo(hotel.getChangingConfigurations());
                                float dimension2 = hotel.getDimension(2, 0.0f);
                                c1798a.bravo(hotel.getChangingConfigurations());
                                if (hotel.hasValue(1)) {
                                    TypedValue typedValue2 = new TypedValue();
                                    hotel.getValue(1, typedValue2);
                                    if (typedValue2.type == 2) {
                                        j5 = C0366t.kilo;
                                    } else {
                                        ColorStateList bravo = AbstractC1881b.bravo(hotel, xml, theme);
                                        c1798a.bravo(hotel.getChangingConfigurations());
                                        if (bravo != null) {
                                            j5 = a0.ao.charlie(bravo.getDefaultColor());
                                        } else {
                                            j5 = C0366t.kilo;
                                        }
                                    }
                                } else {
                                    j5 = C0366t.kilo;
                                }
                                long j6 = j5;
                                int i20 = hotel.getInt(6, -1);
                                c1798a.bravo(hotel.getChangingConfigurations());
                                if (i20 != -1) {
                                    if (i20 != 3) {
                                        if (i20 != 5) {
                                            if (i20 != 9) {
                                                switch (i20) {
                                                    case 14:
                                                        i11 = 13;
                                                        break;
                                                    case 15:
                                                        i11 = 14;
                                                        break;
                                                    case 16:
                                                        i11 = 12;
                                                        break;
                                                }
                                            } else {
                                                i11 = 9;
                                            }
                                        }
                                    } else {
                                        i11 = 3;
                                    }
                                    float f5 = dimension / resources.getDisplayMetrics().density;
                                    float f10 = dimension2 / resources.getDisplayMetrics().density;
                                    hotel.recycle();
                                    c1725e = new C1725e(null, f5, f10, alpha, alpha2, j6, i11, z10, 1);
                                    int i21 = 0;
                                    for (int i22 = 3; xml.getEventType() != i10 && (xml.getDepth() >= i10 || xml.getEventType() != i22); i22 = 3) {
                                        XmlResourceParser xmlResourceParser2 = c1798a.alpha;
                                        eventType = xmlResourceParser2.getEventType();
                                        if (eventType == 2) {
                                            if (eventType == i22 && Intrinsics.areEqual(CTVariableUtils.DICTIONARY, xmlResourceParser2.getName())) {
                                                int i23 = i21 + 1;
                                                for (int i24 = 0; i24 < i23; i24++) {
                                                    c1725e.foxtrot();
                                                }
                                                xmlResourceParser = xml;
                                                bVar = bVar2;
                                                c1725e2 = c1725e;
                                                i21 = 0;
                                                c3 = '\t';
                                                xmlResourceParser.next();
                                                c1725e = c1725e2;
                                                xml = xmlResourceParser;
                                                bVar2 = bVar;
                                                i10 = 1;
                                            }
                                        } else {
                                            String name = xmlResourceParser2.getName();
                                            if (name != null) {
                                                int hashCode = name.hashCode();
                                                com.google.android.play.core.integrity.k kVar = c1798a.charlie;
                                                if (hashCode != -1649314686) {
                                                    xmlResourceParser = xml;
                                                    if (hashCode != 3433509) {
                                                        if (hashCode == 98629247 && name.equals(CTVariableUtils.DICTIONARY)) {
                                                            TypedArray hotel2 = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1799b.bravo);
                                                            c1798a.bravo(hotel2.getChangingConfigurations());
                                                            float alpha3 = c1798a.alpha(hotel2, "rotation", 5, 0.0f);
                                                            float f11 = hotel2.getFloat(1, 0.0f);
                                                            c1798a.bravo(hotel2.getChangingConfigurations());
                                                            float f12 = hotel2.getFloat(2, 0.0f);
                                                            c1798a.bravo(hotel2.getChangingConfigurations());
                                                            float alpha4 = c1798a.alpha(hotel2, "scaleX", 3, 1.0f);
                                                            float alpha5 = c1798a.alpha(hotel2, "scaleY", 4, 1.0f);
                                                            float alpha6 = c1798a.alpha(hotel2, "translateX", 6, 0.0f);
                                                            float alpha7 = c1798a.alpha(hotel2, "translateY", 7, 0.0f);
                                                            String string = hotel2.getString(0);
                                                            c1798a.bravo(hotel2.getChangingConfigurations());
                                                            if (string == null) {
                                                                str2 = "";
                                                            } else {
                                                                str2 = string;
                                                            }
                                                            hotel2.recycle();
                                                            c1725e.alpha(str2, alpha3, f11, f12, alpha4, alpha5, alpha6, alpha7, g0.ah.alpha);
                                                        }
                                                    } else if (name.equals("path")) {
                                                        TypedArray hotel3 = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1799b.charlie);
                                                        c1798a.bravo(hotel3.getChangingConfigurations());
                                                        if (xmlResourceParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                            String string2 = hotel3.getString(0);
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            if (string2 == null) {
                                                                str = "";
                                                            } else {
                                                                str = string2;
                                                            }
                                                            String string3 = hotel3.getString(2);
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            if (string3 == null) {
                                                                list2 = g0.ah.alpha;
                                                            } else {
                                                                ArrayList arrayList = new ArrayList();
                                                                kVar.hotel(string3, arrayList);
                                                                list2 = arrayList;
                                                            }
                                                            B0.a charlie = AbstractC1881b.charlie(hotel3, c1798a.alpha, theme, "fillColor", 1);
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            float alpha8 = c1798a.alpha(hotel3, "fillAlpha", 12, 1.0f);
                                                            if (!AbstractC1881b.echo(c1798a.alpha, "strokeLineCap")) {
                                                                i12 = -1;
                                                            } else {
                                                                i12 = hotel3.getInt(8, -1);
                                                            }
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            if (i12 != 0) {
                                                                if (i12 != 1) {
                                                                    i13 = 2;
                                                                    if (i12 == 2) {
                                                                        i14 = 2;
                                                                    }
                                                                } else {
                                                                    i13 = 2;
                                                                    i14 = 1;
                                                                }
                                                                if (AbstractC1881b.echo(c1798a.alpha, "strokeLineJoin")) {
                                                                    i15 = -1;
                                                                } else {
                                                                    i15 = hotel3.getInt(9, -1);
                                                                }
                                                                c1798a.bravo(hotel3.getChangingConfigurations());
                                                                if (i15 == 0) {
                                                                    if (i15 != 1) {
                                                                        i16 = i13;
                                                                    } else {
                                                                        i16 = 1;
                                                                    }
                                                                } else {
                                                                    i16 = 0;
                                                                }
                                                                float alpha9 = c1798a.alpha(hotel3, "strokeMiterLimit", 10, 1.0f);
                                                                B0.a charlie2 = AbstractC1881b.charlie(hotel3, c1798a.alpha, theme, "strokeColor", 3);
                                                                c1798a.bravo(hotel3.getChangingConfigurations());
                                                                float alpha10 = c1798a.alpha(hotel3, "strokeAlpha", 11, 1.0f);
                                                                float alpha11 = c1798a.alpha(hotel3, "strokeWidth", 4, 1.0f);
                                                                float alpha12 = c1798a.alpha(hotel3, "trimPathEnd", 6, 1.0f);
                                                                float alpha13 = c1798a.alpha(hotel3, "trimPathOffset", 7, 0.0f);
                                                                float alpha14 = c1798a.alpha(hotel3, "trimPathStart", 5, 0.0f);
                                                                if (AbstractC1881b.echo(c1798a.alpha, "fillType")) {
                                                                    i17 = 0;
                                                                } else {
                                                                    i17 = hotel3.getInt(13, 0);
                                                                }
                                                                c1798a.bravo(hotel3.getChangingConfigurations());
                                                                hotel3.recycle();
                                                                shader = (Shader) charlie.charlie;
                                                                if (shader != null || charlie.bravo != 0) {
                                                                    if (shader == null) {
                                                                        auVar = new C0363q(shader);
                                                                        bVar = bVar2;
                                                                    } else {
                                                                        bVar = bVar2;
                                                                        auVar = new a0.au(a0.ao.charlie(charlie.bravo));
                                                                    }
                                                                } else {
                                                                    bVar = bVar2;
                                                                    auVar = null;
                                                                }
                                                                shader2 = (Shader) charlie2.charlie;
                                                                if (shader2 != null || charlie2.bravo != 0) {
                                                                    if (shader2 != null) {
                                                                        auVar2 = new C0363q(shader2);
                                                                    } else {
                                                                        auVar2 = new a0.au(a0.ao.charlie(charlie2.bravo));
                                                                    }
                                                                    abstractC0362p = auVar2;
                                                                } else {
                                                                    abstractC0362p = null;
                                                                }
                                                                if (i17 != 0) {
                                                                    i18 = 0;
                                                                } else {
                                                                    i18 = 1;
                                                                }
                                                                c1725e.charlie(alpha8, alpha10, alpha11, alpha9, alpha14, alpha12, alpha13, i18, i14, i16, auVar, abstractC0362p, str, list2);
                                                                c1725e2 = c1725e;
                                                                c3 = '\t';
                                                                xmlResourceParser.next();
                                                                c1725e = c1725e2;
                                                                xml = xmlResourceParser;
                                                                bVar2 = bVar;
                                                                i10 = 1;
                                                            } else {
                                                                i13 = 2;
                                                            }
                                                            i14 = 0;
                                                            if (AbstractC1881b.echo(c1798a.alpha, "strokeLineJoin")) {
                                                            }
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            if (i15 == 0) {
                                                            }
                                                            float alpha92 = c1798a.alpha(hotel3, "strokeMiterLimit", 10, 1.0f);
                                                            B0.a charlie22 = AbstractC1881b.charlie(hotel3, c1798a.alpha, theme, "strokeColor", 3);
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            float alpha102 = c1798a.alpha(hotel3, "strokeAlpha", 11, 1.0f);
                                                            float alpha112 = c1798a.alpha(hotel3, "strokeWidth", 4, 1.0f);
                                                            float alpha122 = c1798a.alpha(hotel3, "trimPathEnd", 6, 1.0f);
                                                            float alpha132 = c1798a.alpha(hotel3, "trimPathOffset", 7, 0.0f);
                                                            float alpha142 = c1798a.alpha(hotel3, "trimPathStart", 5, 0.0f);
                                                            if (AbstractC1881b.echo(c1798a.alpha, "fillType")) {
                                                            }
                                                            c1798a.bravo(hotel3.getChangingConfigurations());
                                                            hotel3.recycle();
                                                            shader = (Shader) charlie.charlie;
                                                            if (shader != null) {
                                                                bVar = bVar2;
                                                                auVar = null;
                                                                shader2 = (Shader) charlie22.charlie;
                                                                if (shader2 != null) {
                                                                    abstractC0362p = null;
                                                                    if (i17 != 0) {
                                                                    }
                                                                    c1725e.charlie(alpha8, alpha102, alpha112, alpha92, alpha142, alpha122, alpha132, i18, i14, i16, auVar, abstractC0362p, str, list2);
                                                                    c1725e2 = c1725e;
                                                                    c3 = '\t';
                                                                    xmlResourceParser.next();
                                                                    c1725e = c1725e2;
                                                                    xml = xmlResourceParser;
                                                                    bVar2 = bVar;
                                                                    i10 = 1;
                                                                }
                                                                if (shader2 != null) {
                                                                }
                                                                abstractC0362p = auVar2;
                                                                if (i17 != 0) {
                                                                }
                                                                c1725e.charlie(alpha8, alpha102, alpha112, alpha92, alpha142, alpha122, alpha132, i18, i14, i16, auVar, abstractC0362p, str, list2);
                                                                c1725e2 = c1725e;
                                                                c3 = '\t';
                                                                xmlResourceParser.next();
                                                                c1725e = c1725e2;
                                                                xml = xmlResourceParser;
                                                                bVar2 = bVar;
                                                                i10 = 1;
                                                            }
                                                            if (shader == null) {
                                                            }
                                                            shader2 = (Shader) charlie22.charlie;
                                                            if (shader2 != null) {
                                                            }
                                                            if (shader2 != null) {
                                                            }
                                                            abstractC0362p = auVar2;
                                                            if (i17 != 0) {
                                                            }
                                                            c1725e.charlie(alpha8, alpha102, alpha112, alpha92, alpha142, alpha122, alpha132, i18, i14, i16, auVar, abstractC0362p, str, list2);
                                                            c1725e2 = c1725e;
                                                            c3 = '\t';
                                                            xmlResourceParser.next();
                                                            c1725e = c1725e2;
                                                            xml = xmlResourceParser;
                                                            bVar2 = bVar;
                                                            i10 = 1;
                                                        } else {
                                                            throw new IllegalArgumentException("No path data available");
                                                        }
                                                    }
                                                    bVar = bVar2;
                                                    c1725e2 = c1725e;
                                                    c3 = '\t';
                                                    xmlResourceParser.next();
                                                    c1725e = c1725e2;
                                                    xml = xmlResourceParser;
                                                    bVar2 = bVar;
                                                    i10 = 1;
                                                } else {
                                                    xmlResourceParser = xml;
                                                    bVar = bVar2;
                                                    c1725e2 = c1725e;
                                                    c3 = '\t';
                                                    if (name.equals("clip-path")) {
                                                        TypedArray hotel4 = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1799b.delta);
                                                        c1798a.bravo(hotel4.getChangingConfigurations());
                                                        String string4 = hotel4.getString(0);
                                                        c1798a.bravo(hotel4.getChangingConfigurations());
                                                        if (string4 == null) {
                                                            string4 = "";
                                                        }
                                                        String string5 = hotel4.getString(1);
                                                        c1798a.bravo(hotel4.getChangingConfigurations());
                                                        if (string5 == null) {
                                                            list = g0.ah.alpha;
                                                        } else {
                                                            ArrayList arrayList2 = new ArrayList();
                                                            kVar.hotel(string5, arrayList2);
                                                            list = arrayList2;
                                                        }
                                                        hotel4.recycle();
                                                        C1725e.bravo(c1725e2, string4, list);
                                                        i21++;
                                                    }
                                                    xmlResourceParser.next();
                                                    c1725e = c1725e2;
                                                    xml = xmlResourceParser;
                                                    bVar2 = bVar;
                                                    i10 = 1;
                                                }
                                            }
                                        }
                                        xmlResourceParser = xml;
                                        bVar = bVar2;
                                        c1725e2 = c1725e;
                                        c3 = '\t';
                                        xmlResourceParser.next();
                                        c1725e = c1725e2;
                                        xml = xmlResourceParser;
                                        bVar2 = bVar;
                                        i10 = 1;
                                    }
                                    y0.b bVar3 = bVar2;
                                    c3387a = new C3387a(c1725e.echo(), c1798a.bravo | i19);
                                    cVar.alpha.put(bVar3, new WeakReference(c3387a));
                                }
                                i11 = 5;
                                float f52 = dimension / resources.getDisplayMetrics().density;
                                float f102 = dimension2 / resources.getDisplayMetrics().density;
                                hotel.recycle();
                                c1725e = new C1725e(null, f52, f102, alpha, alpha2, j6, i11, z10, 1);
                                int i212 = 0;
                                while (xml.getEventType() != i10) {
                                    XmlResourceParser xmlResourceParser22 = c1798a.alpha;
                                    eventType = xmlResourceParser22.getEventType();
                                    if (eventType == 2) {
                                    }
                                    xmlResourceParser = xml;
                                    bVar = bVar2;
                                    c1725e2 = c1725e;
                                    c3 = '\t';
                                    xmlResourceParser.next();
                                    c1725e = c1725e2;
                                    xml = xmlResourceParser;
                                    bVar2 = bVar;
                                    i10 = 1;
                                }
                                y0.b bVar32 = bVar2;
                                c3387a = new C3387a(c1725e.echo(), c1798a.bravo | i19);
                                cVar.alpha.put(bVar32, new WeakReference(c3387a));
                            } else {
                                throw new XmlPullParserException(hotel.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                            }
                        } else {
                            throw new XmlPullParserException(hotel.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                    } else {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            g0.aj bravo2 = AbstractC1722b.bravo(c3387a.alpha, c0585q);
            c0585q.quebec(false);
            return bravo2;
        }
        c0585q.purple(-1771631096);
        Resources.Theme theme2 = context.getTheme();
        boolean golf = c0585q.golf(charSequence);
        if ((((i5 & 14) ^ 6) > 4 && c0585q.echo(i4)) || (i5 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean golf2 = c0585q.golf(theme2) | golf | z2;
        Object jade = c0585q.jade();
        if (golf2 || jade == C0580l.alpha) {
            try {
                Drawable drawable = resources.getDrawable(i4, null);
                Intrinsics.charlie(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                jade = new C0352f(((BitmapDrawable) drawable).getBitmap());
                c0585q.f(jade);
            } catch (Exception e) {
                throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
            }
        }
        C1679a c1679a = new C1679a((C0352f) jade);
        c0585q.quebec(false);
        return c1679a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashSet delta(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                AbstractC3066u3.juliet("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (!androidx.camera.core.impl.D.class.isAssignableFrom(cls)) {
                AbstractC3066u3.india("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                cls = null;
                if (cls == null) {
                }
            } else {
                if (cls == null) {
                    hashSet.add(cls);
                }
            }
        }
        return hashSet;
    }
}
