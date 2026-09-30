package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro_internal.fO27287;
import com.google.mlkit.common.MlKitException;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;
import pe.AbstractC2327c;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class D2 implements com.fingerprintjs.android.fpjs_pro.h {
    public static final long charlie;
    public static int delta;
    public static int echo;
    public static final byte[] foxtrot = null;
    public static final byte[] golf = null;
    public static final int hotel = 0;
    public static int india;
    public static int juliet;
    public static final byte[] kilo = null;
    public final fO27287.AnonymousClass2 alpha;
    public final Lazy bravo = LazyKt.lazy(new A2(this));

    static {
        lima();
        india = 0;
        juliet = 1;
        kilo();
        juliet();
        delta = 0;
        echo = 1;
        charlie = -2058298903565937161L;
    }

    public D2(fO27287.AnonymousClass2 anonymousClass2) {
        this.alpha = anonymousClass2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, short s3, short s9) {
        int i4;
        int i5;
        int i10 = 1 - (s3 * 4);
        int i11 = 116 - (b2 * 2);
        int i12 = 3 - (s9 * 3);
        byte[] bArr = new byte[i10];
        byte[] bArr2 = kilo;
        if (bArr2 == null) {
            int i13 = i10;
            i5 = 0;
            i11 += i13;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            i12++;
            if (i5 == i10) {
                return new String(bArr, 0);
            }
            i13 = bArr2[i12];
            i11 += i13;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            i12++;
            if (i5 == i10) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            i12++;
            if (i5 == i10) {
            }
        }
    }

    public static /* synthetic */ void bravo(Object[] objArr) {
        char c3;
        int i4;
        int i5;
        int i10;
        int i11;
        char c4;
        char c10;
        char c11;
        Object[] objArr2;
        byte[] bArr;
        char c12;
        int i12;
        Object[] hotel2;
        int i13;
        int i14;
        byte[] bArr2 = golf;
        D2 d22 = (D2) objArr[0];
        Map map = (Map) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        System.identityHashCode(d22);
        System.identityHashCode(d22);
        Object D8871 = uH18377.D8871(-1032283660);
        byte[] bArr3 = foxtrot;
        if (D8871 == null) {
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 51;
            int rgb = (-16776110) - Color.rgb(0, 0, 0);
            i4 = -34544;
            char indexOf = (char) (24632 - TextUtils.indexOf("", "", 0));
            i5 = 34543;
            byte b2 = (byte) (-bArr3[47]);
            i10 = -1232884077;
            c3 = '/';
            i11 = 13;
            Object[] objArr3 = new Object[1];
            charlie(b2, (byte) (b2 | 26), bArr3[27], objArr3);
            D8871 = uH18377.setPivotYN16904(absoluteGravity, rgb, indexOf, 499333921, false, (String) objArr3[0], null);
        } else {
            c3 = '/';
            i4 = -34544;
            i5 = 34543;
            i10 = -1232884077;
            i11 = 13;
        }
        long j5 = ((Field) D8871).getLong(null);
        int i15 = -ExpandableListView.getPackedPositionGroup(0L);
        int identityHashCode = System.identityHashCode(d22);
        int i16 = i15 * 677;
        int i17 = (i16 & (-38850975)) + (i16 | (-38850975));
        int i18 = i15 & identityHashCode;
        int i19 = (~i18) & (i15 | identityHashCode);
        int i20 = ~identityHashCode;
        int i21 = (i19 ^ i18) | (i18 & i19);
        int i22 = -(-(((i21 ^ (-57558)) | (i21 & (-57558))) * (-676)));
        int i23 = i17 ^ i22;
        int i24 = (i17 & i22) << 1;
        int i25 = (i23 & i24) + (i23 | i24);
        int i26 = ~i15;
        int i27 = i15 & 57557;
        int i28 = ((-57558) & i26) | i27;
        int i29 = (-57558) & i15;
        int i30 = ~((i28 ^ i29) | (i28 & i29));
        int i31 = ~((i20 ^ i15) | (i20 & i15));
        int i32 = -(-(((i30 ^ i31) | (i30 & i31)) * 676));
        int i33 = ((~i25) & i32) | ((~i32) & i25);
        int i34 = (i32 & i25) << 1;
        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
        int i36 = (i26 | i15) & i26;
        int i37 = ~((i36 & (-57558)) | (i36 ^ (-57558)));
        int i38 = ~(((-57558) ^ i20) | ((-57558) & i20));
        int i39 = i37 & i38;
        int i40 = ((i37 | i38) & (~i39)) | i39;
        int i41 = (i15 ^ 57557) | i27;
        int i42 = (i41 & i20) | ((~i41) & identityHashCode);
        int i43 = i41 & identityHashCode;
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = i40 & i46;
        int i48 = (i46 | i40) & (~i47);
        Object[] objArr4 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", (((i48 & i47) | (i48 ^ i47)) * 676) + i35, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        int i49 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int identityHashCode2 = System.identityHashCode(d22);
        int i50 = i49 * 673;
        int i51 = i50 & (-67347421);
        int i52 = ((i50 ^ (-67347421)) | i51) << 1;
        int i53 = -((~i51) & (i50 | (-67347421)));
        int i54 = (i52 & i53) + (i53 | i52);
        int i55 = ~identityHashCode2;
        int i56 = ~i49;
        int i57 = (i49 & i55) | (identityHashCode2 & i56);
        int i58 = i49 & identityHashCode2;
        int i59 = ~((i57 ^ i58) | (i57 & i58));
        int i60 = ((~i59) & 50147) | (i59 & (-50148));
        int i61 = i59 & 50147;
        int i62 = -(-(((i60 ^ i61) | (i60 & i61)) * 672));
        int i63 = ((i54 ^ i62) | (i54 & i62)) << 1;
        int i64 = -((i62 & (~i54)) | ((~i62) & i54));
        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
        int i66 = i56 ^ i55;
        int i67 = i56 & i55;
        int i68 = ~((i66 & i67) | (i66 ^ i67));
        int i69 = ~((identityHashCode2 & 50147) | (i55 & 50147) | (identityHashCode2 & (-50148)));
        int i70 = (i65 - (~(-(-(((i69 & i68) | (i68 ^ i69)) * (-672)))))) - 1;
        int i71 = (-50148) & i55;
        int i72 = ((-50148) | i55) & (~i71);
        int i73 = ((~(((-50148) & i49) | ((-50148) ^ i49))) | (~((i72 & i71) | (i72 ^ i71)))) * 672;
        int i74 = (i70 ^ i73) + ((i73 & i70) << 1);
        Object[] objArr5 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i74, objArr5);
        long longValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], null).invoke(null, null)).longValue();
        Object D88712 = uH18377.D8871(302164976);
        if (D88712 == null) {
            int axisFromString = MotionEvent.axisFromString("") + 52;
            int rgb2 = (-16776110) - Color.rgb(0, 0, 0);
            char red = (char) (24632 - Color.red(0));
            c10 = '\f';
            c4 = '4';
            Object[] objArr6 = new Object[1];
            charlie(bArr3[20], (byte) 0, bArr3[12], objArr6);
            D88712 = uH18377.setPivotYN16904(axisFromString, rgb2, red, -843511515, false, (String) objArr6[0], null);
        } else {
            c4 = '4';
            c10 = '\f';
        }
        if (j5 == ((longValue - ((((Field) D88712).getLong(null) << c4) >>> c4)) >> c10)) {
            int i75 = delta;
            int i76 = i75 & 9;
            int i77 = -(-((i75 ^ 9) | i76));
            echo = ((i76 ^ i77) + ((i77 & i76) << 1)) % 128;
            Object D88713 = uH18377.D8871(-1242515371);
            if (D88713 == null) {
                int resolveSizeAndState = 51 - View.resolveSizeAndState(0, 0, 0);
                int argb = Color.argb(0, 0, 0, 0) + 1106;
                char offsetBefore = (char) (24632 - TextUtils.getOffsetBefore("", 0));
                byte b4 = (byte) 0;
                c11 = '\t';
                Object[] objArr7 = new Object[1];
                charlie(b4, (byte) (b4 | 47), (byte) (-bArr3[9]), objArr7);
                D88713 = uH18377.setPivotYN16904(resolveSizeAndState, argb, offsetBefore, 1783306880, false, (String) objArr7[0], null);
            } else {
                c11 = '\t';
            }
            Object[] objArr8 = (Object[]) ((Field) D88713).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, new int[1], (String[]) objArr8[3]};
            int myPid = Process.myPid();
            int i78 = ~(377726521 | myPid);
            int i79 = (((~(myPid | (-10557992))) | (~((-377726522) | myPid)) | 8454689) * HttpConstants.HTTP_PROXY_AUTH) + ((i78 | (~((~myPid) | 10557991)) | 8454689) * HttpConstants.HTTP_PROXY_AUTH) + (((-379829824) | i78) * (-814)) + 2133290299;
            int identityHashCode3 = System.identityHashCode(d22);
            int i80 = i79 * (-300);
            int i81 = i80 & (-1331163800);
            int i82 = -(-((i80 ^ (-1331163800)) | i81));
            int i83 = (i81 & i82) + (i82 | i81);
            int i84 = ~i79;
            int i85 = (i79 & i10) | (i84 & 1232884076);
            int i86 = i79 & 1232884076;
            int i87 = (i85 ^ i86) | (i85 & i86);
            int i88 = i87 & identityHashCode3;
            int i89 = (~i88) & (i87 | identityHashCode3);
            int i90 = ~identityHashCode3;
            int i91 = (~((i89 ^ i88) | (i89 & i88))) * (-301);
            int i92 = ((i83 | i91) << 1) - (i91 ^ i83);
            int i93 = i10 & identityHashCode3;
            int i94 = ~(i93 | ((~i93) & (i10 | identityHashCode3)));
            int i95 = i90 & (i90 | identityHashCode3);
            c12 = 1;
            int i96 = (i95 & i84) | ((~i95) & i79);
            int i97 = i95 & i79;
            int i98 = ~((i97 & i96) | (i96 ^ i97));
            int i99 = i94 & i98;
            int i100 = (i94 | i98) & (~i99);
            int i101 = (((i100 & i99) | (i100 ^ i99)) * (-301)) + i92;
            int i102 = (i79 | i84) & i84;
            int i103 = ~((i102 & identityHashCode3) | (i102 ^ identityHashCode3));
            int i104 = i10 ^ i103;
            int i105 = i10 & i103;
            int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * 301));
            int i107 = i101 & i106;
            int i108 = ((i106 | i101) & (~i107)) + (i107 << 1);
            int i109 = i108 << 13;
            int i110 = (~i109) & i108;
            int i111 = (~i108) & i109;
            int i112 = (i111 & i110) | (i110 ^ i111);
            int i113 = i112 >>> 17;
            int i114 = (~i113) & i112;
            int i115 = (~i112) & i113;
            int i116 = (i115 & i114) | (i114 ^ i115);
            int i117 = i116 << 5;
            ((int[]) objArr2[2])[0] = ((~i116) & i117) | ((~i117) & i116);
            int i118 = echo;
            delta = (((i118 ^ 98) + ((i118 & 98) << 1)) - 1) % 128;
            bArr = bArr2;
        } else {
            c11 = '\t';
            int i119 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int component9 = k3.component9();
            int i120 = i119 * (-721);
            int i121 = ((i120 & (-5398126)) + (i120 | (-5398126))) - 1;
            int i122 = ~component9;
            int i123 = ~i119;
            int i124 = i123 & 7487;
            int i125 = ((-7488) & (~i123)) | i124;
            int i126 = i123 & (-7488);
            int i127 = ~((i125 & i126) | (i125 ^ i126));
            int i128 = ((~i127) & i122) | ((~i122) & i127);
            int i129 = i122 & i127;
            int i130 = (i129 & i128) | (i128 ^ i129);
            int i131 = i119 & 7487;
            int i132 = ~((i119 ^ 7487) | i131);
            int i133 = ((i130 & i132) | (i130 ^ i132)) * 1444;
            int i134 = i121 & i133;
            int i135 = -(-((i133 ^ i121) | i134));
            int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
            int i137 = (~i131) & (i119 | 7487);
            int i138 = ~((i137 & i131) | (i137 ^ i131));
            int i139 = ~(i119 | component9);
            int i140 = i138 ^ i139;
            int i141 = i138 & i139;
            int i142 = (i141 & i140) | (i140 ^ i141);
            int i143 = component9 ^ 7487;
            int i144 = component9 & 7487;
            int i145 = ~((i144 & i143) | (i143 ^ i144));
            int i146 = i142 ^ i145;
            int i147 = i145 & i142;
            int i148 = ((i147 & i146) | (i146 ^ i147)) * (-1444);
            int i149 = (i136 ^ i148) + ((i148 & i136) << 1);
            int i150 = ~((i123 ^ 7487) | i124);
            int i151 = (-7488) ^ i119;
            int i152 = (-7488) & i119;
            int i153 = ~((i152 & i151) | (i151 ^ i152));
            int i154 = i150 ^ i153;
            int i155 = i153 & i150;
            int i156 = -(~(((i155 & i154) | (i154 ^ i155)) * 722));
            int i157 = ((i149 | i156) << 1) - (i156 ^ i149);
            Object[] objArr9 = new Object[1];
            delta("㮘⚨ǣ氶佪ꦫ铧\uf76e퉠㲾\u1fff穢敌䞩ꋿ贡\ue87f쪿㗣ိ獁嶺룡鬵虰\ue0ba", (i157 ^ (-1)) + (i157 << 1), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            int i158 = -View.resolveSizeAndState(0, 0, 0);
            int i159 = i158 & 6637;
            int i160 = ((i158 ^ 6637) | i159) << 1;
            int i161 = -((i158 | 6637) & (~i159));
            int i162 = (i160 & i161) + (i161 | i160);
            Object[] objArr10 = new Object[1];
            delta("㮚≡ࡑ癌尨먶ꀃ軃\uf4e1틜㣗⚿ಆ檑养뽳ꕆ茪", i162, objArr10);
            Context context = (Context) cls2.getMethod((String) objArr10[0], null).invoke(null, null);
            if (context != null) {
                int identityHashCode4 = System.identityHashCode(d22);
                int i163 = (-403706017) ^ identityHashCode4;
                int i164 = ~identityHashCode4;
                int i165 = (-403706017) & identityHashCode4;
                int i166 = ~((i165 & i163) | (i163 ^ i165));
                int i167 = 114238743 & i164;
                int i168 = ((114238743 | i164) & (~i167)) | i167;
                int i169 = i168 ^ 483407010;
                int i170 = i168 & 483407010;
                int i171 = ~((i170 & i169) | (i169 ^ i170));
                int i172 = ((i166 & i171) | (i166 ^ i171)) * 497;
                int i173 = 354560832 & i172;
                int i174 = ((i172 | 354560832) & (~i173)) + (i173 << 1);
                int i175 = ~(((-483407011) & i164) | ((-483407011) ^ i164));
                int i176 = i175 & 79700994;
                int i177 = (i175 | 79700994) & (~i176);
                int i178 = (i177 & i176) | (i177 ^ i176);
                int i179 = (i164 & 517944759) | ((-517944760) & identityHashCode4);
                int i180 = identityHashCode4 & 517944759;
                int i181 = ~((i180 & i179) | (i179 ^ i180));
                int i182 = (((i181 & i178) | (i178 ^ i181)) * 497) + i174;
                int component92 = k3.component9();
                int i183 = ~component92;
                int i184 = (1129976922 & i183) | ((-1129976923) & component92);
                int i185 = 1129976922 & component92;
                int i186 = (i185 & i184) | (i184 ^ i185);
                int i187 = ~i186;
                int i188 = (i186 | i187) & i187;
                int i189 = ((i188 & (-944753144)) | ((-944753144) ^ i188)) * 672;
                int i190 = ((2053377186 | i189) << 1) - (i189 ^ 2053377186);
                int i191 = (i183 | component92) & i183;
                int i192 = ~(((-1129976923) & i191) | ((-1129976923) ^ i191));
                int i193 = (i183 & (-944753144)) | (944753143 & component92);
                int i194 = component92 & (-944753144);
                int i195 = ~((i194 & i193) | (i193 ^ i194));
                int i196 = i192 ^ i195;
                int i197 = i195 & i192;
                int i198 = ((i197 & i196) | (i196 ^ i197)) * (-672);
                int i199 = i190 & i198;
                int i200 = ((i190 ^ i198) | i199) << 1;
                int i201 = -((i198 | i190) & (~i199));
                int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                int i203 = 944753143 & i191;
                int i204 = (944753143 | i191) & (~i203);
                int i205 = ~((i204 & i203) | (i204 ^ i203));
                int i206 = i205 & (-2069880320);
                int i207 = (i205 | (-2069880320)) & (~i206);
                int i208 = ((i207 & i206) | (i207 ^ i206)) * 672;
                if (i182 > ((((~i208) & i202) | ((~i202) & i208)) - (~((i208 & i202) << 1))) - 1) {
                    if (!(!(context instanceof ContextWrapper))) {
                        delta = (echo + 53) % 128;
                        if (((ContextWrapper) context).getBaseContext() == null) {
                            int i209 = echo;
                            int i210 = (i209 & (-48)) | ((~i209) & 47);
                            int i211 = (i209 & 47) << 1;
                            delta = (((i210 | i211) << 1) - (i211 ^ i210)) % 128;
                            context = null;
                        }
                    }
                    context = context.getApplicationContext();
                    int i212 = delta;
                    int i213 = i212 & 109;
                    echo = (i213 + ((i212 ^ 109) | i213)) % 128;
                } else {
                    boolean z2 = context instanceof ContextWrapper;
                    throw null;
                }
            }
            int deadChar = KeyEvent.getDeadChar(0, 0);
            int component93 = k3.component9();
            int i214 = deadChar * (-661);
            int i215 = (i214 | (-22832923)) << 1;
            int i216 = -(((~i214) & (-22832923)) | (22832922 & i214));
            int i217 = (i215 & i216) + (i216 | i215);
            int i218 = ~component93;
            int i219 = ~deadChar;
            int i220 = (i219 | deadChar) & i219;
            int i221 = ~((i220 & i4) | (i220 & i5) | (i4 & (~i220)));
            int i222 = ((~i221) & i218) | ((~i218) & i221);
            int i223 = i221 & i218;
            int i224 = -(-(((i223 & i222) | (i222 ^ i223)) * 1324));
            int i225 = (i217 | i224) << 1;
            int i226 = -(((~i217) & i224) | ((~i224) & i217));
            int i227 = (i225 ^ i226) + ((i226 & i225) << 1);
            int i228 = ~((deadChar ^ component93) | (deadChar & component93));
            int i229 = (i218 & i5) | (component93 & i4);
            int i230 = component93 & i5;
            int i231 = ~((i230 & i229) | (i229 ^ i230));
            int i232 = i228 & i231;
            int i233 = (i231 | i228) & (~i232);
            int i234 = -(-(((i233 & i232) | (i233 ^ i232)) * (-1324)));
            int i235 = (i227 ^ i234) + ((i234 & i227) << 1);
            int i236 = i219 & i4;
            int i237 = ((~i219) & i5) | i236 | (i219 & i5);
            int i238 = ~i237;
            int i239 = (i237 | i238) & i238;
            int i240 = i236 | (deadChar & i5);
            int i241 = i4 & deadChar;
            int i242 = ~((i241 & i240) | (i240 ^ i241));
            int i243 = i239 ^ i242;
            int i244 = i242 & i239;
            int i245 = ((i244 & i243) | (i243 ^ i244)) * 662;
            int i246 = i235 ^ i245;
            int i247 = ((i245 & i235) | i246) << 1;
            int i248 = -i246;
            int i249 = ((i247 | i248) << 1) - (i247 ^ i248);
            Object[] objArr11 = new Object[1];
            delta("㮓뵷㙑꽕\u206b餾ሂ謞೦薰综\uf7c5梾\ue1ae媎펕", i249, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            int keyCodeFromString = KeyEvent.keyCodeFromString("");
            int i250 = ((((~keyCodeFromString) & 769) | (keyCodeFromString & (-770))) - (~(-(-((keyCodeFromString & 769) << 1))))) - 1;
            Object[] objArr12 = new Object[1];
            delta("㮐㢜㶞㊔㞉㒕⦋⺇⎹ₑ▀\u1a9aᾶᲛᆓᚓ", i250, objArr12);
            try {
                Object[] objArr13 = {context, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, d22)).intValue()), 0, 1232884076};
                Object D88714 = uH18377.D8871(1221386136);
                if (D88714 == null) {
                    int keyCodeFromString2 = KeyEvent.keyCodeFromString("") + 52;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 640;
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43559);
                    Object[] objArr14 = new Object[1];
                    echo(bArr2[656], bArr2[192], (short) 709, objArr14);
                    String str = (String) objArr14[0];
                    Class cls4 = Integer.TYPE;
                    D88714 = uH18377.setPivotYN16904(keyCodeFromString2, windowTouchSlop, capsMode, -1753776819, false, str, new Class[]{Context.class, cls4, cls4, cls4});
                }
                objArr2 = (Object[]) ((Method) D88714).invoke(null, objArr13);
                Object D88715 = uH18377.D8871(-1242515371);
                if (D88715 == null) {
                    int size = 51 - View.MeasureSpec.getSize(0);
                    int jumpTapTimeout = 1106 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 24632);
                    byte b6 = (byte) 0;
                    Object[] objArr15 = new Object[1];
                    charlie(b6, (byte) (b6 | 47), (byte) (-bArr3[9]), objArr15);
                    D88715 = uH18377.setPivotYN16904(size, jumpTapTimeout, packedPositionType, 1783306880, false, (String) objArr15[0], null);
                }
                ((Field) D88715).set(null, objArr2);
                try {
                    Object[] objArr16 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", 57556 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    int i251 = -(-ExpandableListView.getPackedPositionChild(0L));
                    int i252 = i251 & 50148;
                    int i253 = -(-((i251 ^ 50148) | i252));
                    int i254 = (i252 ^ i253) + ((i253 & i252) << 1);
                    Object[] objArr17 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i254, objArr17);
                    long longValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], null).invoke(null, null)).longValue();
                    Long valueOf = Long.valueOf(longValue2);
                    Object D88716 = uH18377.D8871(302164976);
                    if (D88716 == null) {
                        int lastIndexOf = 50 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int maxKeyCode = 1106 - (KeyEvent.getMaxKeyCode() >> 16);
                        char absoluteGravity2 = (char) (24632 - Gravity.getAbsoluteGravity(0, 0));
                        bArr = bArr2;
                        Object[] objArr18 = new Object[1];
                        charlie(bArr3[20], (byte) 0, bArr3[c10], objArr18);
                        D88716 = uH18377.setPivotYN16904(lastIndexOf, maxKeyCode, absoluteGravity2, -843511515, false, (String) objArr18[0], null);
                    } else {
                        bArr = bArr2;
                    }
                    ((Field) D88716).set(null, valueOf);
                    Long valueOf2 = Long.valueOf(longValue2 >> c10);
                    Object D88717 = uH18377.D8871(-1032283660);
                    if (D88717 == null) {
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51;
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1106;
                        char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 24632);
                        byte b10 = (byte) (-bArr3[c3]);
                        Object[] objArr19 = new Object[1];
                        charlie(b10, (byte) (b10 | 26), bArr3[27], objArr19);
                        D88717 = uH18377.setPivotYN16904(scrollBarFadeDuration, jumpTapTimeout2, jumpTapTimeout3, 499333921, false, (String) objArr19[0], null);
                    }
                    ((Field) D88717).set(null, valueOf2);
                    int i255 = delta;
                    int i256 = i255 & 39;
                    c12 = 1;
                    echo = (((i255 | 39) & (~i256)) + (i256 << 1)) % 128;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object obj = objArr2[0];
        int i257 = ((int[]) obj)[0];
        Object obj2 = objArr2[c12];
        if (((int[]) obj2)[0] == i257) {
            int i258 = echo;
            int i259 = i258 & 35;
            int i260 = -(-((i258 ^ 35) | i259));
            delta = (((i259 | i260) << 1) - (i260 ^ i259)) % 128;
            int i261 = ((int[]) objArr2[2])[0];
            int i262 = ((int[]) obj2)[0];
            Object[] objArr20 = {new int[]{((int[]) obj)[0]}, new int[]{i262}, new int[1], (String[]) objArr2[3]};
            int myTid = Process.myTid();
            int i263 = (~(690118396 | myTid)) | 369402114;
            int i264 = ~myTid;
            int i265 = ((~(i264 | 1057286926)) * 886) + (((~(i264 | (-690118397))) | 1057286926) * (-1772)) + (((i263 | (~((-2233585) | i264))) * 886) - 1461563241);
            int identityHashCode5 = System.identityHashCode(d22);
            int i266 = i265 * (-445);
            int i267 = (i266 << 1) - i266;
            int i268 = ~i265;
            int i269 = ~i268;
            int i270 = (i269 ^ i268) | (i269 & i268);
            int i271 = ~i270;
            int i272 = (i268 | i265) & i268;
            int i273 = ~identityHashCode5;
            int i274 = i272 & i273;
            int i275 = ~(i274 | ((~i274) & (i272 | i273)));
            int i276 = i271 & i275;
            int i277 = (i275 | i271) & (~i276);
            int i278 = ((i277 & i276) | (i277 ^ i276)) * 446;
            int i279 = i267 ^ i278;
            int i280 = (((i278 & i267) | i279) << 1) - i279;
            int i281 = ~((i268 ^ i265) | (i268 & i265));
            int i282 = (i268 & i273) | (identityHashCode5 & i269);
            int i283 = i268 & identityHashCode5;
            int i284 = ~((i283 & i282) | (i282 ^ i283));
            int i285 = ((~i284) & i281) | ((~i281) & i284);
            int i286 = i281 & i284;
            int i287 = -(-(((i286 & i285) | (i285 ^ i286)) * 446));
            int i288 = i280 & i287;
            int i289 = (i280 ^ i287) | i288;
            int i290 = (i288 ^ i289) + ((i289 & i288) << 1);
            int i291 = -(~(((i271 | i270) & i271) * 446));
            int i292 = (((i290 ^ i291) + ((i291 & i290) << 1)) - 1) + i261;
            int i293 = (i292 << 13) ^ i292;
            int i294 = i293 >>> 17;
            int i295 = ((~i293) & i294) | ((~i294) & i293);
            int i296 = i295 << 5;
            int i297 = i295 & i296;
            ((int[]) objArr20[2])[0] = ((i295 ^ i296) | i297) & (~i297);
            int i298 = echo ^ 83;
            delta = (((((r1 & 83) | i298) << 1) - (~(-i298))) - 1) % 128;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[3];
            if (strArr != null) {
                int i299 = delta;
                int i300 = i299 & 99;
                int victor = ao.ad.victor(i300, ~(-(-((i299 ^ 99) | i300))), 1, 128);
                echo = victor;
                delta = ((-2) - (((victor ^ 16) + ((victor & 16) << 1)) ^ (-1))) % 128;
                int i301 = 0;
                while (i301 < strArr.length) {
                    int i302 = delta;
                    echo = ((i302 ^ 45) + ((i302 & 45) << 1)) % 128;
                    arrayList.add(strArr[i301]);
                    i301 = (((i301 | 2) << 1) - (i301 ^ 2)) - 1;
                    int i303 = echo;
                    int i304 = i303 & 77;
                    delta = ao.ad.victor((i303 | 77) & (~i304), ~(i304 << 1), 1, 128);
                }
            }
            long j6 = (((~(i257 & r4)) & (i257 | r4)) & 4294967295L) ^ (-5969366734501576704L);
            int i305 = echo;
            int i306 = (i305 & (-4)) | (3 & (~i305));
            int i307 = (i305 & 3) << 1;
            int i308 = ((i306 ^ i307) + ((i307 & i306) << 1)) % 128;
            delta = i308;
            echo = (((i308 & (-14)) | (i11 & (~i308))) + ((i308 & 13) << 1)) % 128;
            try {
                Object[] objArr21 = {Long.valueOf(j6), -1389851491L};
                Object[] objArr22 = new Object[1];
                echo((byte) (bArr[435] - 1), bArr[192], (short) 334, objArr22);
                Class<?> cls6 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                echo((byte) (-bArr[46]), (byte) (-bArr[491]), (short) 116, objArr23);
                String str2 = (String) objArr23[0];
                Class<?> cls7 = Long.TYPE;
                cls6.getMethod(str2, cls7, cls7).invoke(null, objArr21);
                int i309 = ((int[]) objArr2[2])[0];
                int i310 = ((int[]) objArr2[1])[0];
                Object[] objArr24 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{i310}, new int[1], (String[]) objArr2[3]};
                int romeo = ao.ad.romeo();
                int i311 = ~romeo;
                int i312 = (((~((-878196541) | i311)) | 537400340 | (~(511028010 | i311)) | (~((-170231811) | romeo))) * (-84)) + 1144553893;
                int i313 = (~(romeo | 511028010)) | 878196540;
                int i314 = ~(i311 | (-511028011));
                int i315 = ((i314 | 170231810) * 84) + ((i313 | i314) * (-84)) + i312;
                int i316 = i315 << 1;
                int i317 = -i315;
                int i318 = (i316 & i317) + (i316 | i317);
                int component94 = k3.component9();
                int i319 = (-2) - (((i318 * 677) - (~(i309 * (-675)))) ^ (-1));
                int i320 = ~component94;
                int i321 = i318 & i320;
                int i322 = ~i318;
                int i323 = (component94 & i322) | i321 | (i318 & component94);
                int i324 = ~i309;
                int i325 = (i324 | i309) & i324;
                int i326 = ((~i325) & i323) | ((~i323) & i325);
                int i327 = i323 & i325;
                int i328 = ((i326 ^ i327) | (i326 & i327)) * (-676);
                int i329 = (i319 & i328) + (i328 | i319);
                int i330 = i325 & i318;
                int i331 = (~i330) & (i325 | i318);
                int i332 = ~((i331 ^ i330) | (i330 & i331));
                int i333 = (i320 ^ i318) | i321;
                int i334 = ~i333;
                int i335 = (i333 | i334) & i334;
                int i336 = -(-(((i332 & i335) | (i335 & (~i332)) | ((~i335) & i332)) * 676));
                int i337 = (((i329 ^ i336) | (i329 & i336)) << 1) - ((i336 & (~i329)) | ((~i336) & i329));
                int i338 = (i322 | i318) & i322;
                int i339 = i338 ^ i325;
                int i340 = i338 & i325;
                int i341 = ~((i340 & i339) | (i339 ^ i340));
                int i342 = i320 | i324;
                int i343 = ~i342;
                int i344 = (i342 | i343) & i343;
                int i345 = i341 & i344;
                int i346 = (i341 | i344) & (~i345);
                int i347 = (i346 & i345) | (i346 ^ i345);
                int i348 = i318 | i309;
                int i349 = i348 & component94;
                int i350 = (i348 | component94) & (~i349);
                int i351 = ~((i350 & i349) | (i350 ^ i349));
                int i352 = ((i347 & i351) | (i347 ^ i351)) * 676;
                int i353 = ((i337 ^ i352) | (i337 & i352)) << 1;
                int i354 = -((i352 & (~i337)) | ((~i352) & i337));
                int i355 = (i353 & i354) + (i354 | i353);
                int i356 = i355 << 13;
                int i357 = i355 & i356;
                int i358 = ((i356 ^ i355) | i357) & (~i357);
                int i359 = i358 >>> 17;
                int i360 = (~i359) & i358;
                int i361 = (~i358) & i359;
                int i362 = (i361 & i360) | (i360 ^ i361);
                int i363 = i362 << 5;
                int i364 = i362 & i363;
                ((int[]) objArr24[2])[0] = ((i362 ^ i363) | i364) & (~i364);
                System.identityHashCode(d22);
                k3.component9();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object D88718 = uH18377.D8871(-620579543);
        if (D88718 == null) {
            int i365 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
            int myPid2 = (Process.myPid() >> 22) + 1622;
            char myTid2 = (char) (Process.myTid() >> 22);
            byte b11 = (byte) (-bArr3[c3]);
            Object[] objArr25 = new Object[1];
            charlie(b11, (byte) (b11 | 26), (byte) (-1), objArr25);
            i12 = 0;
            D88718 = uH18377.setPivotYN16904(i365, myPid2, myTid2, 79239164, false, (String) objArr25[0], null);
        } else {
            i12 = 0;
        }
        long j7 = ((Field) D88718).getLong(null);
        int i366 = -KeyEvent.normalizeMetaState(i12);
        int i367 = i366 & 57557;
        int i368 = (i367 - (~((i366 ^ 57557) | i367))) - 1;
        Object[] objArr26 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i368, objArr26);
        Class<?> cls8 = Class.forName((String) objArr26[i12]);
        int i369 = -Color.rgb(i12, i12, i12);
        int component95 = k3.component9();
        int i370 = i369 * (-55);
        int i371 = ((-919988796) & i370) | ((~i370) & 919988795);
        int i372 = -(-((i370 & 919988795) << 1));
        int i373 = ((i371 | i372) << 1) - (i372 ^ i371);
        int i374 = ~((i369 ^ component95) | (i369 & component95));
        int i375 = i374 ^ (-16727069);
        int i376 = i374 & (-16727069);
        int i377 = ((i376 & i375) | (i375 ^ i376)) * 56;
        int i378 = (((~i377) & i373) | ((~i373) & i377)) + ((i377 & i373) << 1);
        int i379 = i369 & (-16727069);
        int i380 = (~i379) & (i369 | (-16727069));
        int i381 = (i379 & i380) | (i380 ^ i379);
        int i382 = ~i381;
        int i383 = -(-(((i381 | i382) & i382) * (-56)));
        int i384 = i378 & i383;
        int i385 = (i383 | i378) & (~i384);
        int i386 = i384 << 1;
        int i387 = (i385 & i386) + (i385 | i386);
        int i388 = ~component95;
        int i389 = ~((i388 & (-16727069)) | (i388 ^ (-16727069)));
        int i390 = i369 ^ i389;
        int i391 = i369 & i389;
        Object[] objArr27 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", (((i391 & i390) | (i390 ^ i391)) * 56) + i387, objArr27);
        long longValue3 = ((Long) cls8.getDeclaredMethod((String) objArr27[0], null).invoke(null, null)).longValue();
        Object D88719 = uH18377.D8871(-3501628);
        if (D88719 == null) {
            int i392 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
            int indexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1623;
            char indexOf3 = (char) TextUtils.indexOf("", "", 0);
            byte b12 = (byte) 0;
            Object[] objArr28 = new Object[1];
            charlie(b12, (byte) (b12 | 47), (byte) (-bArr3[c11]), objArr28);
            D88719 = uH18377.setPivotYN16904(i392, indexOf2, indexOf3, 544289553, false, (String) objArr28[0], null);
        }
        if (j7 == ((longValue3 - ((((Field) D88719).getLong(null) << c4) >>> c4)) >> c10)) {
            echo = (delta + 111) % 128;
            Object D887110 = uH18377.D8871(-881784774);
            if (D887110 == null) {
                int i393 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int green = Color.green(0) + 1622;
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr29 = new Object[1];
                charlie((byte) (-bArr3[i11]), (byte) (bArr3[1] - 1), (byte) (-bArr3[19]), objArr29);
                D887110 = uH18377.setPivotYN16904(i393, green, keyRepeatTimeout, 348826351, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) D887110).get(null);
            hotel2 = new Object[]{new int[1], new int[]{((int[]) objArr30[1])[0]}, new int[]{((int[]) objArr30[2])[0]}, (String[]) objArr30[3]};
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int i394 = (~(114594267 | maxMemory)) | 553780224;
            int i395 = ~maxMemory;
            int i396 = ((~(i395 | 625116171)) * 886) + (((~(i395 | (-114594268))) | 625116171) * (-1772)) + (((i394 | (~((-43258321) | i395))) * 886) - 1433879109);
            int identityHashCode6 = System.identityHashCode(d22);
            int i397 = i396 * 989;
            int i398 = i397 << 1;
            int i399 = -i397;
            int i400 = (i398 ^ i399) + ((i399 & i398) << 1);
            int i401 = ~i396;
            int i402 = ~((i401 ^ i396) | (i401 & i396));
            int i403 = identityHashCode6 & i402;
            int i404 = -(~(-(-((((i402 | identityHashCode6) & (~i403)) | i403) * 988))));
            int i405 = ((i400 & i404) + (i404 | i400)) - 1;
            int i406 = ~((i401 | i396) & i401);
            int i407 = ~identityHashCode6;
            int i408 = i407 & (i407 | identityHashCode6);
            int i409 = ~i408;
            int i410 = i409 & (i409 | i408);
            int i411 = ((i406 & i410) | (i406 ^ i410)) * (-1976);
            int i412 = ((i405 ^ i411) - (~((i411 & i405) << 1))) - 1;
            int i413 = ~(((-1) ^ i396) | i396);
            int i414 = i401 & identityHashCode6;
            int i415 = ~(((identityHashCode6 | i401) & (~i414)) | i414);
            int i416 = i413 & i415;
            int i417 = ((i415 | i413) & (~i416)) | i416;
            int i418 = i408 & i396;
            int i419 = ((i396 | i408) & (~i418)) | i418;
            int i420 = ~i419;
            int i421 = (i419 | i420) & i420;
            int i422 = i417 & i421;
            int i423 = -(-((((i417 | i421) & (~i422)) | i422) * 988));
            int i424 = i412 & i423;
            int i425 = (i423 ^ i412) | i424;
            int i426 = ((i424 | i425) << 1) - (i425 ^ i424);
            int component96 = k3.component9();
            int i427 = i426 * 483;
            int i428 = i427 & 1175957676;
            int i429 = (i427 | 1175957676) & (~i428);
            int i430 = i428 << 1;
            int i431 = ((i429 | i430) << 1) - (i429 ^ i430);
            int i432 = ~i426;
            int i433 = 1406935430 & i432;
            int i434 = ((~i432) & (-1406935431)) | i433;
            int i435 = i432 & (-1406935431);
            int i436 = ~((i434 & i435) | (i434 ^ i435));
            int i437 = ~component96;
            int i438 = i432 ^ i437;
            int i439 = i432 & i437;
            int i440 = ~((i438 & i439) | (i438 ^ i439));
            int i441 = ((i436 & i440) | (i436 ^ i440)) * (-241);
            int i442 = (i431 ^ i441) + ((i431 & i441) << 1);
            int i443 = (-1406935431) & i426;
            int i444 = -(-((i433 | i443 | (i426 & 1406935430)) * (-482)));
            int i445 = (i442 ^ i444) + ((i444 & i442) << 1);
            int i446 = i426 ^ (-1406935431);
            int i447 = (i446 & i443) | (i446 ^ i443);
            int i448 = ~i447;
            int i449 = (i447 | i448) & i448;
            int i450 = (component96 | i437) & i437;
            int i451 = i432 & i450;
            int i452 = (i450 | i432) & (~i451);
            int i453 = (i452 & i451) | (i452 ^ i451);
            int i454 = i453 & 1406935430;
            int i455 = ~(((i453 | 1406935430) & (~i454)) | i454);
            int i456 = i449 ^ i455;
            int i457 = i455 & i449;
            int i458 = -(-(((i457 & i456) | (i456 ^ i457)) * 241));
            int i459 = ((((~i458) & i445) | ((~i445) & i458)) - (~(-(-((i458 & i445) << 1))))) - 1;
            int i460 = i459 << 13;
            int i461 = (i460 & (~i459)) | ((~i460) & i459);
            int i462 = i461 ^ (i461 >>> 17);
            int i463 = i462 << 5;
            ((int[]) hotel2[0])[0] = ((~i462) & i463) | ((~i463) & i462);
            int i464 = delta;
            int i465 = i464 & 107;
            echo = ((((i464 ^ 107) | i465) << 1) - ((i464 | 107) & (~i465))) % 128;
            i14 = 1;
        } else {
            Object[] objArr31 = new Object[1];
            delta("㮓뵷㙑꽕\u206b餾ሂ謞೦薰综\uf7c5梾\ue1ae媎펕", 34542 - (~(-ExpandableListView.getPackedPositionGroup(0L))), objArr31);
            Class<?> cls9 = Class.forName((String) objArr31[0]);
            int indexOf4 = TextUtils.indexOf((CharSequence) "", '0');
            int component97 = k3.component9();
            int i466 = indexOf4 * (-518);
            int i467 = ((((i466 ^ (-398860)) | (i466 & (-398860))) << 1) - (~(-(((~i466) & (-398860)) | (398859 & i466))))) - 1;
            int i468 = ~indexOf4;
            int i469 = ~component97;
            int i470 = i468 ^ i469;
            int i471 = i468 & i469;
            int i472 = (i471 & i470) | (i470 ^ i471);
            int i473 = ~i472;
            int i474 = ((~i473) & 770) | (i473 & (-771));
            int i475 = i473 & 770;
            int i476 = -(-((i474 | i475) * 519));
            int i477 = (i467 ^ i476) + ((i467 & i476) << 1);
            int i478 = i475 | (i472 & (-771));
            int i479 = i472 & 770;
            int i480 = ~((i479 & i478) | (i478 ^ i479));
            int i481 = indexOf4 & 770;
            int i482 = (~i481) & (indexOf4 | 770);
            int i483 = (i481 & i482) | (i482 ^ i481);
            int i484 = i483 ^ component97;
            int i485 = i483 & component97;
            int i486 = (i485 & i484) | (i484 ^ i485);
            int i487 = ~i486;
            int i488 = (i486 | i487) & i487;
            int i489 = -(-(((i480 & i488) | ((~i488) & i480) | ((~i480) & i488)) * (-519)));
            int i490 = i477 & i489;
            int i491 = (i490 - (~((i489 ^ i477) | i490))) - 1;
            int i492 = ~((component97 & 770) | (component97 ^ 770));
            int i493 = indexOf4 ^ i492;
            int i494 = indexOf4 & i492;
            int i495 = -(-(((i494 & i493) | (i493 ^ i494)) * 519));
            int i496 = i491 & i495;
            int i497 = (i496 - (~(-(-((i495 ^ i491) | i496))))) - 1;
            Object[] objArr32 = new Object[1];
            delta("㮐㢜㶞㊔㞉㒕⦋⺇⎹ₑ▀\u1a9aᾶᲛᆓᚓ", i497, objArr32);
            int intValue = ((Integer) cls9.getMethod((String) objArr32[0], Object.class).invoke(null, d22)).intValue();
            Object[] objArr33 = {1170334536};
            Object D887111 = uH18377.D8871(187486525);
            if (D887111 == null) {
                D887111 = uH18377.setPivotYN16904(View.resolveSize(0, 0) + 51, 1570 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27580), -728271896, false, null, new Class[]{Integer.TYPE});
            }
            hotel2 = C1206f0.hotel(intValue, ((Constructor) D887111).newInstance(objArr33));
            Object D887112 = uH18377.D8871(-881784774);
            if (D887112 == null) {
                int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                int green2 = Color.green(0) + 1622;
                char c13 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr34 = new Object[1];
                charlie((byte) (-bArr3[i11]), (byte) (bArr3[1] - 1), (byte) (-bArr3[19]), objArr34);
                i13 = 0;
                D887112 = uH18377.setPivotYN16904(jumpTapTimeout4, green2, c13, 348826351, false, (String) objArr34[0], null);
            } else {
                i13 = 0;
            }
            ((Field) D887112).set(null, hotel2);
            try {
                int i498 = -(~(-TextUtils.indexOf((CharSequence) "", '0', i13, i13)));
                int i499 = (i498 & 57556) + (i498 | 57556);
                Object[] objArr35 = new Object[1];
                delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", (i499 ^ (-1)) + (i499 << 1), objArr35);
                Class<?> cls10 = Class.forName((String) objArr35[0]);
                int i500 = -(-Gravity.getAbsoluteGravity(0, 0));
                int i501 = (i500 | 50147) << 1;
                int i502 = -(i500 ^ 50147);
                int i503 = (i501 ^ i502) + ((i502 & i501) << 1);
                Object[] objArr36 = new Object[1];
                delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i503, objArr36);
                long longValue4 = ((Long) cls10.getDeclaredMethod((String) objArr36[0], null).invoke(null, null)).longValue();
                Long valueOf3 = Long.valueOf(longValue4);
                Object D887113 = uH18377.D8871(-3501628);
                if (D887113 == null) {
                    int i504 = 53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int indexOf5 = 1622 - TextUtils.indexOf("", "", 0, 0);
                    char lastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    byte b13 = (byte) 0;
                    Object[] objArr37 = new Object[1];
                    charlie(b13, (byte) (b13 | 47), (byte) (-bArr3[c11]), objArr37);
                    D887113 = uH18377.setPivotYN16904(i504, indexOf5, lastIndexOf2, 544289553, false, (String) objArr37[0], null);
                }
                ((Field) D887113).set(null, valueOf3);
                Long valueOf4 = Long.valueOf(longValue4 >> c10);
                Object D887114 = uH18377.D8871(-620579543);
                if (D887114 == null) {
                    int i505 = 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i506 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1621;
                    char lastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    byte b14 = (byte) (-bArr3[c3]);
                    Object[] objArr38 = new Object[1];
                    charlie(b14, (byte) (b14 | 26), (byte) (-1), objArr38);
                    D887114 = uH18377.setPivotYN16904(i505, i506, lastIndexOf3, 79239164, false, (String) objArr38[0], null);
                }
                ((Field) D887114).set(null, valueOf4);
                int i507 = delta;
                int i508 = i507 & 39;
                i14 = 1;
                echo = ao.ad.victor(i508, ~((i507 ^ 39) | i508), 1, 128);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        Object obj3 = hotel2[i14];
        int i509 = ((int[]) obj3)[0];
        Object obj4 = hotel2[2];
        if (((int[]) obj4)[0] == i509) {
            int i510 = echo;
            delta = (((i510 | 33) << i14) - (i510 ^ 33)) % 128;
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int i511 = ((int[]) hotel2[0])[0];
            int i512 = ((int[]) obj4)[0];
            int i513 = ((int[]) obj3)[0];
            String[] strArr2 = (String[]) hotel2[3];
            iArr2[0] = i512;
            iArr[0] = i513;
            Object[] objArr39 = {new int[i14], iArr, iArr2, strArr2};
            int myPid3 = Process.myPid();
            int i514 = (((~(myPid3 | 1014558600)) | (~((~myPid3) | (-504036697)))) * 627) + (((~(504036696 | myPid3)) | 1014558600) * (-627)) + ((((-470347017) | myPid3) * (-627)) - 1514792116);
            int identityHashCode7 = System.identityHashCode(d22);
            int i515 = i514 * (-958);
            int i516 = i511 * (-958);
            int i517 = (i515 ^ i516) + ((i515 & i516) << 1);
            int i518 = ~i511;
            int i519 = (i518 | i511) & i518;
            int i520 = ~identityHashCode7;
            int i521 = i519 & i520;
            int i522 = (i519 | i520) & (~i521);
            int i523 = ~((i522 & i521) | (i522 ^ i521));
            int i524 = ~i514;
            int i525 = (i524 | i514) & i524;
            int i526 = i525 & i520;
            int i527 = ((~i525) & identityHashCode7) | i526;
            int i528 = i525 & identityHashCode7;
            int i529 = ~((i527 & i528) | (i527 ^ i528));
            int i530 = (i523 & i529) | (i523 ^ i529);
            int i531 = i520 & i514;
            int i532 = (i520 & i524) | ((~i520) & i514) | i531;
            int i533 = ~i532;
            int i534 = (i532 | i533) & i533;
            int i535 = ((~i530) & i534) | ((~i534) & i530);
            int i536 = i530 & i534;
            int i537 = ((i535 & i536) | (i535 ^ i536)) * 959;
            int i538 = (i517 & i537) + (i537 | i517);
            int i539 = (i514 & i518) | (i511 & i524);
            int i540 = i514 & i511;
            int i541 = (i539 & i540) | (i539 ^ i540);
            int i542 = ~i541;
            int i543 = ((i541 | i542) & i542) * (-959);
            int i544 = i538 & i543;
            int i545 = ((i543 | i538) & (~i544)) + (i544 << 1);
            int i546 = ~(((~i526) & (i525 | i520)) | i526);
            int i547 = ~((i518 & identityHashCode7) | (i518 & i520) | ((~i518) & identityHashCode7));
            int i548 = ((~i547) & i546) | ((~i546) & i547);
            int i549 = i547 & i546;
            int i550 = (i549 & i548) | (i548 ^ i549);
            int i551 = (identityHashCode7 & i524) | i531;
            int i552 = i514 & identityHashCode7;
            int i553 = (i552 & i551) | (i551 ^ i552);
            int i554 = ~i553;
            int i555 = (i553 | i554) & i554;
            int i556 = (((i555 & i550) | (i550 ^ i555)) * 959) + i545;
            int i557 = i556 << 13;
            int i558 = (~i557) & i556;
            int i559 = i557 & (~i556);
            int i560 = (i559 & i558) | (i558 ^ i559);
            int i561 = i560 ^ (i560 >>> 17);
            int i562 = i561 << 5;
            int i563 = i561 & i562;
            ((int[]) objArr39[0])[0] = ((i561 ^ i562) | i563) & (~i563);
            k3.component9();
            k3.component9();
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) hotel2[3];
            if (strArr3 != null) {
                int i564 = echo;
                int i565 = i564 & 63;
                int i566 = (i564 ^ 63) | i565;
                int i567 = ((i565 ^ i566) + ((i566 & i565) << 1)) % 128;
                delta = i567;
                echo = ao.ad.victor(((i567 ^ 17) | (i567 & 17)) << 1, ~(-((i567 & (-18)) | (17 & (~i567)))), 1, 128);
                int i568 = 0;
                while (i568 < strArr3.length) {
                    int i569 = echo;
                    int i570 = i569 & 13;
                    int i571 = (i569 ^ 13) | i570;
                    delta = ((i570 & i571) + (i571 | i570)) % 128;
                    arrayList2.add(strArr3[i568]);
                    int i572 = i568 & (-48);
                    int i573 = (i572 - (~(-(-((i568 ^ (-48)) | i572))))) - 1;
                    int i574 = i573 & 49;
                    i568 = i574 + ((i573 ^ 49) | i574);
                    int i575 = delta;
                    echo = ao.ad.victor((i575 | 96) << 1, i575 ^ 96, 1, 128);
                }
            }
            Object[] objArr40 = {Long.valueOf((((~(i509 & r4)) & (i509 | r4)) & 4294967295L) ^ (-6419312894319525888L)), -1494612755L};
            Object[] objArr41 = new Object[1];
            echo(bArr[48], bArr[192], (short) 662, objArr41);
            Class<?> cls11 = Class.forName((String) objArr41[0]);
            Object[] objArr42 = new Object[1];
            echo((byte) (-bArr[46]), (byte) (-bArr[491]), (short) 116, objArr42);
            String str3 = (String) objArr42[0];
            Class<?> cls12 = Long.TYPE;
            cls11.getMethod(str3, cls12, cls12).invoke(null, objArr40);
            int i576 = ((int[]) hotel2[0])[0];
            int i577 = ((int[]) hotel2[2])[0];
            Object[] objArr43 = {new int[1], new int[]{((int[]) hotel2[1])[0]}, new int[]{i577}, (String[]) hotel2[3]};
            int myUid = Process.myUid();
            int i578 = ~myUid;
            int i579 = (((~(myUid | (-11534913))) | (~(i578 | 481822699)) | (~(28699204 | i578))) * Smooth$Close.expectedVersionCode) + (((~((-28699205) | myUid)) | (~((-481822700) | myUid)) | (~(498986991 | i578))) * (-568)) + (((((~((-28699205) | i578)) | 11534912) | (~((-481822700) | i578))) * (-1136)) - 1570813321);
            int identityHashCode8 = System.identityHashCode(d22);
            int i580 = -(-(i579 * (-494)));
            int i581 = ((i580 << 1) - (~(-i580))) - 1;
            int i582 = ~i579;
            int i583 = ((i579 | i582) & i582) * (-495);
            int i584 = (((i581 | i583) << 1) - (~(-(i583 ^ i581)))) - 1;
            int i585 = ~identityHashCode8;
            int i586 = ((identityHashCode8 | i585) & i585) * 495;
            int i587 = (i584 ^ i586) + ((i586 & i584) << 1);
            int i588 = (~i582) | i582;
            int i589 = ~i588;
            int i590 = (i588 | i589) & i589;
            int i591 = ~i585;
            int i592 = (i585 | i591) & i591;
            int i593 = ((~i592) & i590) | ((~i590) & i592);
            int i594 = i592 & i590;
            int i595 = ((i594 & i593) | (i593 ^ i594)) * 495;
            int i596 = -(-((i587 ^ i595) + ((i595 & i587) << 1)));
            int i597 = (i576 & i596) + (i596 | i576);
            int i598 = i597 << 13;
            int i599 = i597 & i598;
            int i600 = ((i598 ^ i597) | i599) & (~i599);
            int i601 = i600 >>> 17;
            int i602 = (i600 | i601) & (~(i600 & i601));
            int i603 = i602 << 5;
            ((int[]) objArr43[0])[0] = (i602 | i603) & (~(i602 & i603));
            System.identityHashCode(d22);
            System.identityHashCode(d22);
        }
        golf(d22, function1, null, map, null, function12, 10);
        int i604 = delta;
        int i605 = ((i604 | 51) << 1) - (i604 ^ 51);
        echo = i605 % 128;
        if (i605 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(short s3, byte b2, short s9, Object[] objArr) {
        int i4;
        int i5 = 15 - s3;
        int i10 = s9 + 4;
        int i11 = b2 + 68;
        byte[] bArr = new byte[i5];
        byte[] bArr2 = foxtrot;
        if (bArr2 == null) {
            int i12 = i5;
            int i13 = i10;
            i4 = 0;
            int i14 = (i10 + (-i12)) - 17;
            i10 = i13;
            i11 = i14;
            int i15 = i10 + 1;
            bArr[i4] = (byte) i11;
            i4++;
            if (i4 == i5) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i12 = bArr2[i15];
            i10 = i11;
            i13 = i15;
            int i142 = (i10 + (-i12)) - 17;
            i10 = i13;
            i11 = i142;
            int i152 = i10 + 1;
            bArr[i4] = (byte) i11;
            i4++;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            int i1522 = i10 + 1;
            bArr[i4] = (byte) i11;
            i4++;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f4  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.ct] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void delta(String str, int i4, Object[] objArr) {
        Throwable cause;
        int i5;
        int i10;
        int i11 = 0;
        int i12 = india + 97;
        juliet = i12 % 128;
        if (i12 % 2 != 0) {
            char[] charArray = str.toCharArray();
            ?? obj = new Object();
            obj.component9 = i4;
            int length = charArray.length;
            long[] jArr = new long[length];
            obj.setPivotYN16904 = 0;
            while (true) {
                int i13 = obj.setPivotYN16904;
                if (i13 >= charArray.length) {
                    break;
                }
                int i14 = juliet + 39;
                india = i14 % 128;
                int i15 = i14 % 2;
                long j5 = charlie;
                Class cls = Integer.TYPE;
                if (i15 != 0) {
                    char c3 = charArray[i13];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[2] = obj;
                        objArr2[1] = obj;
                        objArr2[i11] = Integer.valueOf(c3);
                        Object D8871 = uH18377.D8871(1142442855);
                        if (D8871 == null) {
                            int i16 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63;
                            int i17 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 462;
                            char offsetBefore = (char) (29265 - TextUtils.getOffsetBefore("", i11));
                            i5 = 495480529;
                            Class[] clsArr = new Class[3];
                            clsArr[i11] = cls;
                            clsArr[1] = Object.class;
                            clsArr[2] = Object.class;
                            D8871 = uH18377.setPivotYN16904(i16, i17, offsetBefore, -1683756622, false, "s", clsArr);
                        } else {
                            i5 = 495480529;
                        }
                        jArr[i13] = ((Long) ((Method) D8871).invoke(null, objArr2)).longValue() ^ (j5 - (-461071229536473586L));
                        Object[] objArr3 = new Object[2];
                        objArr3[1] = obj;
                        objArr3[i11] = obj;
                        Object D88712 = uH18377.D8871(i5);
                        if (D88712 == null) {
                            int mode = View.MeasureSpec.getMode(i11) + 60;
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1734;
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b2 = (byte) i11;
                            byte b4 = b2;
                            String alpha = alpha(b4, b2, b4);
                            Class[] clsArr2 = new Class[2];
                            clsArr2[i11] = Object.class;
                            clsArr2[1] = Object.class;
                            D88712 = uH18377.setPivotYN16904(mode, maxKeyCode, scrollDefaultDelay, -1036792828, false, alpha, clsArr2);
                        }
                        ((Method) D88712).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause == null) {
                        }
                    }
                } else {
                    char c4 = charArray[i13];
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = obj;
                    objArr4[1] = obj;
                    objArr4[i11] = Integer.valueOf(c4);
                    Object D88713 = uH18377.D8871(1142442855);
                    if (D88713 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 64;
                        int indexOf = 463 - TextUtils.indexOf("", "");
                        char c10 = (char) (29265 - (CdmaCellLocation.convertQuartSecToDecDegrees(i11) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i11) == 0.0d ? 0 : -1)));
                        i10 = i11;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i10] = cls;
                        clsArr3[1] = Object.class;
                        clsArr3[2] = Object.class;
                        D88713 = uH18377.setPivotYN16904(fadingEdgeLength, indexOf, c10, -1683756622, false, "s", clsArr3);
                    } else {
                        i10 = i11;
                    }
                    jArr[i13] = ((Long) ((Method) D88713).invoke(null, objArr4)).longValue() ^ (j5 ^ (-461071229536473586L));
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = obj;
                    objArr5[i10] = obj;
                    Object D88714 = uH18377.D8871(495480529);
                    if (D88714 == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 60;
                        int red = 1734 - Color.red(i10);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i18 = i10;
                        byte b6 = (byte) i18;
                        byte b10 = b6;
                        String alpha2 = alpha(b10, b6, b10);
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i18] = Object.class;
                        clsArr4[1] = Object.class;
                        D88714 = uH18377.setPivotYN16904(pressedStateDuration, red, trimmedLength, -1036792828, false, alpha2, clsArr4);
                    }
                    ((Method) D88714).invoke(null, objArr5);
                    i11 = 0;
                }
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            char[] cArr = new char[length];
            obj.setPivotYN16904 = 0;
            while (true) {
                int i19 = obj.setPivotYN16904;
                if (i19 < charArray.length) {
                    india = (juliet + 125) % 128;
                    cArr[i19] = (char) jArr[i19];
                    Object[] objArr6 = {obj, obj};
                    Object D88715 = uH18377.D8871(495480529);
                    if (D88715 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        D88715 = uH18377.setPivotYN16904(MotionEvent.axisFromString("") + 61, 1734 - View.getDefaultSize(0, 0), (char) Color.red(0), -1036792828, false, alpha(b12, b11, b12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88715).invoke(null, objArr6);
                } else {
                    String str2 = new String(cArr);
                    juliet = (india + 25) % 128;
                    objArr[0] = str2;
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void echo(short s3, byte b2, short s9, Object[] objArr) {
        int i4;
        int i5;
        int i10 = b2 + 68;
        int i11 = s9 + 4;
        int i12 = 75 - s3;
        byte[] bArr = new byte[i12];
        byte[] bArr2 = golf;
        if (bArr2 == null) {
            int i13 = i12;
            int i14 = i11;
            i5 = 0;
            int i15 = (i11 + i13) - 2;
            i11 = i14 + 1;
            i10 = i15;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i10;
            if (i5 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i13 = bArr2[i11];
            int i16 = i11;
            i11 = i10;
            i14 = i16;
            int i152 = (i11 + i13) - 2;
            i11 = i14 + 1;
            i10 = i152;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i10;
            if (i5 == i12) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr[i4] = (byte) i10;
            if (i5 == i12) {
            }
        }
    }

    public static final /* synthetic */ Function0 foxtrot(D2 d22) {
        int i4 = echo;
        int i5 = i4 & 63;
        int i10 = -(-(i4 | 63));
        int i11 = ((i5 & i10) + (i10 | i5)) % 128;
        delta = i11;
        fO27287.AnonymousClass2 anonymousClass2 = d22.alpha;
        int i12 = i11 & 105;
        int i13 = ((((i11 ^ 105) | i12) << 1) - (~(-((~i12) & (i11 | 105))))) - 1;
        echo = i13 % 128;
        if (i13 % 2 != 0) {
            return anonymousClass2;
        }
        throw null;
    }

    public static /* synthetic */ void golf(D2 d22, Function1 function1, Integer num, Map map, String str, Function1 function12, int i4) {
        Integer num2;
        Map map2;
        String str2;
        int i5 = echo;
        int i10 = i5 ^ 115;
        int i11 = -(-((i5 & 115) << 1));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        delta = i12 % 128;
        if (i12 % 2 == 0 ? (i4 & 2) != 0 : (i4 & 5) != 0) {
            delta = ((i5 ^ 117) + ((i5 & 117) << 1)) % 128;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i4 & 4) != 0) {
            int i13 = (delta + 109) % 128;
            echo = i13;
            map2 = kotlin.collections.t.alpha;
            int i14 = (i13 & 76) + (i13 | 76);
            delta = ((i14 ^ (-1)) + (i14 << 1)) % 128;
        } else {
            map2 = map;
        }
        if ((i4 & 8) != 0) {
            int i15 = delta;
            int i16 = (i15 & (-44)) | ((~i15) & 43);
            int i17 = -(-((i15 & 43) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            int i19 = i18 % 128;
            echo = i19;
            if (i18 % 2 != 0) {
                delta = (i19 + 39) % 128;
                str2 = "";
            } else {
                throw null;
            }
        } else {
            str2 = str;
        }
        november(new Object[]{d22, function1, num2, map2, str2, function12}, k3.component9(), k3.component9(), k3.component9(), k3.component9(), -1370639029, 1370639035);
        int i20 = echo + 23;
        delta = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 10 / 0;
        }
    }

    public static /* synthetic */ void hotel(Object[] objArr) {
        char c3;
        int i4;
        int i5;
        char c4;
        int i10;
        char c10;
        int i11;
        char c11;
        char c12;
        Object[] hotel2;
        char c13;
        Object[] objArr2;
        int i12;
        D2 d22 = (D2) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        int i13 = echo;
        int i14 = i13 ^ 109;
        int i15 = (i14 | (i13 & 109)) << 1;
        int i16 = -i14;
        delta = ((i15 & i16) + (i15 | i16)) % 128;
        Object D8871 = uH18377.D8871(-620579543);
        byte[] bArr = foxtrot;
        if (D8871 == null) {
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 52;
            int rgb = (-16775594) - Color.rgb(0, 0, 0);
            char c14 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            i4 = -34544;
            byte b2 = (byte) (-bArr[47]);
            i5 = 83;
            c3 = '/';
            c4 = 3;
            Object[] objArr3 = new Object[1];
            charlie(b2, (byte) (b2 | 26), (byte) (-1), objArr3);
            D8871 = uH18377.setPivotYN16904(maxKeyCode, rgb, c14, 79239164, false, (String) objArr3[0], null);
        } else {
            c3 = '/';
            i4 = -34544;
            i5 = 83;
            c4 = 3;
        }
        long j5 = ((Field) D8871).getLong(null);
        int i17 = -(~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
        Object[] objArr4 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", (-2) - (((i17 ^ 57556) + ((i17 & 57556) << 1)) ^ (-1)), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        int i18 = -MotionEvent.axisFromString("");
        int identityHashCode = System.identityHashCode(d22);
        int i19 = (i18 * (-520)) + 26176212;
        int i20 = ~i18;
        int i21 = i20 | 50146;
        int i22 = ~identityHashCode;
        int i23 = (i21 & i22) | ((~i21) & identityHashCode);
        int i24 = i21 & identityHashCode;
        int i25 = (i24 & i23) | (i23 ^ i24);
        int i26 = ~i25;
        int i27 = ((i25 | i26) & i26) * 521;
        int i28 = ((i19 ^ i27) - (~(-(-((i27 & i19) << 1))))) - 1;
        int i29 = (-50147) & i18;
        int i30 = (~i29) & ((-50147) | i18);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = ~i31;
        int i33 = ((i31 | i32) & i32) * (-1042);
        int i34 = i28 & i33;
        int i35 = (i18 & 50146) | ((-50147) & i20);
        int i36 = ~((i29 & i35) | (i35 ^ i29));
        int i37 = i20 ^ i22;
        int i38 = i20 & i22;
        int i39 = (i38 & i37) | (i37 ^ i38);
        int i40 = ~((i39 & 50146) | (i39 & (-50147)) | ((~i39) & 50146));
        int i41 = i36 & i40;
        int i42 = (i34 + ((i28 ^ i33) | i34)) - (~(-(-((((i36 | i40) & (~i41)) | i41) * 521))));
        Object[] objArr5 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", (i42 ^ (-1)) + (i42 << 1), objArr5);
        long longValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], null).invoke(null, null)).longValue();
        Object D88712 = uH18377.D8871(-3501628);
        if (D88712 == null) {
            int maxKeyCode2 = 52 - (KeyEvent.getMaxKeyCode() >> 16);
            int capsMode = 1622 - TextUtils.getCapsMode("", 0, 0);
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            byte b4 = (byte) 0;
            c10 = '\t';
            i10 = 0;
            Object[] objArr6 = new Object[1];
            charlie(b4, (byte) (b4 | 47), (byte) (-bArr[9]), objArr6);
            D88712 = uH18377.setPivotYN16904(maxKeyCode2, capsMode, packedPositionChild, 544289553, false, (String) objArr6[0], null);
        } else {
            i10 = 0;
            c10 = '\t';
        }
        if (j5 == ((longValue - ((((Field) D88712).getLong(null) << 52) >>> 52)) >> 12)) {
            int i43 = delta;
            int i44 = ((i43 ^ 103) | (i43 & 103)) << 1;
            int i45 = -(((~i43) & 103) | (i43 & (-104)));
            echo = ((i44 ^ i45) + ((i45 & i44) << 1)) % 128;
            Object D88713 = uH18377.D8871(-881784774);
            if (D88713 == null) {
                int axisFromString = MotionEvent.axisFromString("") + 53;
                int i46 = i10;
                int lastIndexOf = 1621 - TextUtils.lastIndexOf("", '0', i46, i46);
                char capsMode2 = (char) TextUtils.getCapsMode("", i46, i46);
                i11 = -57558;
                Object[] objArr7 = new Object[1];
                charlie((byte) (-bArr[13]), (byte) (bArr[1] - 1), (byte) (-bArr[19]), objArr7);
                D88713 = uH18377.setPivotYN16904(axisFromString, lastIndexOf, capsMode2, 348826351, false, (String) objArr7[0], null);
            } else {
                i11 = -57558;
            }
            Object[] objArr8 = (Object[]) ((Field) D88713).get(null);
            hotel2 = new Object[4];
            hotel2[0] = new int[1];
            int[] iArr = new int[1];
            hotel2[1] = iArr;
            int[] iArr2 = new int[1];
            hotel2[2] = iArr2;
            int i47 = ((int[]) objArr8[2])[0];
            int i48 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[c4];
            iArr2[0] = i47;
            iArr[0] = i48;
            hotel2[c4] = strArr;
            int romeo = ao.ad.romeo();
            int i49 = ~romeo;
            int i50 = -(-((((~(romeo | 546447619)) | (-582365140) | (~(i49 | (-8196)))) * 369) + (((~((-546447620) | i49)) | (-35925716)) * (-369)) + ((((-35917521) | i49) * (-369)) - 85456914)));
            int i51 = i50 & 666910677;
            int i52 = -(-((i50 ^ 666910677) | i51));
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            int i54 = i53 << 13;
            int i55 = (i54 & (~i53)) | ((~i54) & i53);
            int i56 = i55 >>> 17;
            int i57 = ((~i55) & i56) | ((~i56) & i55);
            int i58 = i57 << 5;
            int i59 = i57 & i58;
            ((int[]) hotel2[0])[0] = ((i57 ^ i58) | i59) & (~i59);
            k3.component9();
            k3.component9();
            c11 = '\f';
            c12 = '0';
            c13 = 1;
        } else {
            i11 = -57558;
            int indexOf = TextUtils.indexOf((CharSequence) "", '0');
            int component9 = k3.component9();
            int i60 = indexOf * (-501);
            int i61 = (((i60 | 17375633) << 1) - (i60 ^ 17375633)) - 1;
            int i62 = (-34545) ^ component9;
            int i63 = (-34545) & component9;
            int i64 = ~((i62 ^ i63) | (i62 & i63));
            c11 = '\f';
            int i65 = ~indexOf;
            int i66 = (indexOf & (-34545)) | (i65 & 34544);
            int i67 = indexOf & 34544;
            int i68 = ~((i66 ^ i67) | (i66 & i67));
            c12 = '0';
            int i69 = ((~i64) & i68) | ((~i68) & i64);
            int i70 = i64 & i68;
            int i71 = -(-(((i69 & i70) | (i69 ^ i70)) * (-502)));
            int i72 = i61 & i71;
            int i73 = ((i61 ^ i71) | i72) << 1;
            int i74 = -((i71 | i61) & (~i72));
            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
            int i76 = ~component9;
            int i77 = i76 & (i76 | component9);
            int i78 = ((-34545) & i77) | ((-34545) ^ i77);
            int i79 = i78 ^ indexOf;
            int i80 = indexOf & i78;
            int i81 = -(-((~((i80 & i79) | (i79 ^ i80))) * (-502)));
            int i82 = ((~i81) & i75) | ((~i75) & i81);
            int i83 = -(-((i81 & i75) << 1));
            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
            int i85 = i65 ^ component9;
            int i86 = component9 & i65;
            int i87 = ~((i85 & i86) | (i85 ^ i86));
            int i88 = (((-34545) & i87) | ((-34545) ^ i87)) * HttpConstants.HTTP_BAD_GATEWAY;
            int i89 = i84 ^ i88;
            int i90 = (((i88 & i84) | i89) << 1) - i89;
            Object[] objArr9 = new Object[1];
            delta("㮓뵷㙑꽕\u206b餾ሂ謞೦薰综\uf7c5梾\ue1ae媎펕", i90, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            int capsMode3 = TextUtils.getCapsMode("", 0, 0);
            int i91 = ((capsMode3 ^ 769) | (capsMode3 & 769)) << 1;
            int i92 = -((capsMode3 & (-770)) | ((~capsMode3) & 769));
            int i93 = (i91 & i92) + (i91 | i92);
            Object[] objArr10 = new Object[1];
            delta("㮐㢜㶞㊔㞉㒕⦋⺇⎹ₑ▀\u1a9aᾶᲛᆓᚓ", i93, objArr10);
            int intValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, d22)).intValue();
            try {
                Object[] objArr11 = {544582373};
                Object D88714 = uH18377.D8871(187486525);
                if (D88714 == null) {
                    D88714 = uH18377.setPivotYN16904(TextUtils.indexOf("", "", 0) + 51, Color.rgb(0, 0, 0) + 16778787, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27578), -728271896, false, null, new Class[]{Integer.TYPE});
                }
                hotel2 = com.fingerprintjs.android.fpjs_pro.b.hotel(intValue, ((Constructor) D88714).newInstance(objArr11));
                Object D88715 = uH18377.D8871(-881784774);
                if (D88715 == null) {
                    Object[] objArr12 = new Object[1];
                    charlie((byte) (-bArr[13]), (byte) (bArr[1] - 1), (byte) (-bArr[19]), objArr12);
                    D88715 = uH18377.setPivotYN16904(52 - Color.blue(0), Color.alpha(0) + 1622, (char) (AndroidCharacter.getMirror('0') - '0'), 348826351, false, (String) objArr12[0], null);
                }
                ((Field) D88715).set(null, hotel2);
                try {
                    int i94 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int component92 = k3.component9();
                    int i95 = i94 * 70;
                    int i96 = i95 & (-3913876);
                    int i97 = ((i95 | (-3913876)) & (~i96)) + (i96 << 1);
                    int i98 = ~i94;
                    int i99 = (i98 | i94) & i98;
                    int i100 = i99 & (-57558);
                    int i101 = (~i100) & (i99 | (-57558));
                    int i102 = (i101 ^ i100) | (i100 & i101);
                    int i103 = i102 & component92;
                    int i104 = (~i103) & (i102 | component92);
                    int i105 = ~((i104 & i103) | (i104 ^ i103));
                    int i106 = i94 & (-57558);
                    int i107 = i98 & 57557;
                    int i108 = i106 | i107;
                    int i109 = i94 & 57557;
                    int i110 = (i108 ^ i109) | (i108 & i109);
                    int i111 = ~((i110 ^ component92) | (i110 & component92));
                    int i112 = i105 ^ i111;
                    int i113 = i105 & i111;
                    int i114 = ((i112 & i113) | (i112 ^ i113)) * 69;
                    int i115 = ((((~i97) & i114) | ((~i114) & i97)) - (~((i97 & i114) << 1))) - 1;
                    int i116 = (i98 & (-57558)) | ((~i98) & 57557);
                    int i117 = (i116 & i107) | (i116 ^ i107);
                    int i118 = ~i117;
                    int i119 = (i117 | i118) & i118;
                    int i120 = (i99 ^ component92) | (i99 & component92);
                    int i121 = ~i120;
                    int i122 = (i120 | i121) & i121;
                    int i123 = i119 ^ i122;
                    int i124 = i119 & i122;
                    int i125 = (i124 & i123) | (i123 ^ i124);
                    int i126 = component92 & 57557;
                    int i127 = (component92 | 57557) & (~i126);
                    int i128 = ~((i127 & i126) | (i127 ^ i126));
                    int i129 = ((~i128) & i125) | ((~i125) & i128);
                    int i130 = i128 & i125;
                    int i131 = ((i130 & i129) | (i129 ^ i130)) * (-69);
                    int i132 = i115 & i131;
                    int i133 = i132 + ((i131 ^ i115) | i132);
                    int i134 = (~(((-57558) ^ i94) | i106)) * 69;
                    int i135 = i133 & i134;
                    int i136 = ((i133 ^ i134) | i135) << 1;
                    int i137 = -((i134 | i133) & (~i135));
                    int i138 = (i136 & i137) + (i137 | i136);
                    Object[] objArr13 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i138, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0);
                    int identityHashCode2 = System.identityHashCode(d22);
                    int i139 = offsetBefore * 615;
                    int i140 = i139 ^ (-30740111);
                    int i141 = -(-((i139 & (-30740111)) << 1));
                    int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                    int i143 = ~offsetBefore;
                    int i144 = (i143 | offsetBefore) & i143;
                    int i145 = i144 ^ 50147;
                    int i146 = i144 & 50147;
                    int i147 = (i146 & i145) | (i145 ^ i146);
                    int i148 = ~i147;
                    int i149 = (i147 | i148) & i148;
                    int i150 = identityHashCode2 & i149;
                    int i151 = (i149 | identityHashCode2) & (~i150);
                    int i152 = (i151 & i150) | (i151 ^ i150);
                    int i153 = ((-50148) ^ offsetBefore) | ((-50148) & offsetBefore);
                    int i154 = ~i153;
                    int i155 = (i153 | i154) & i154;
                    int i156 = i152 & i155;
                    int i157 = (i152 | i155) & (~i156);
                    int i158 = -(-(((i157 & i156) | (i157 ^ i156)) * 614));
                    int i159 = (i142 ^ i158) + ((i142 & i158) << 1);
                    int i160 = ~identityHashCode2;
                    int i161 = (identityHashCode2 | i160) & i160;
                    int i162 = (i143 ^ i161) | (i143 & i161);
                    int i163 = ~i162;
                    int i164 = (i162 | i163) & i163;
                    int i165 = i143 & (-50148);
                    int i166 = ((~i143) & 50147) | i165;
                    int i167 = i143 & 50147;
                    int i168 = (i166 ^ i167) | (i166 & i167);
                    int i169 = ~i168;
                    int i170 = (i168 | i169) & i169;
                    int i171 = (i164 & i170) | (i164 ^ i170);
                    int i172 = (i160 & (-50148)) | ((~i160) & 50147);
                    int i173 = i160 & 50147;
                    int i174 = ~((i173 & i172) | (i172 ^ i173));
                    int i175 = i171 & i174;
                    int i176 = (((i174 | i171) & (~i175)) | i175) * (-1228);
                    int i177 = i159 & i176;
                    int i178 = ((i159 ^ i176) | i177) << 1;
                    int i179 = -((i176 | i159) & (~i177));
                    int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                    int i181 = (i143 ^ (-50148)) | i165;
                    int i182 = i181 ^ i161;
                    int i183 = i181 & i161;
                    int i184 = ~((i183 & i182) | (i182 ^ i183));
                    int i185 = i161 & offsetBefore;
                    int i186 = (offsetBefore | i161) & (~i185);
                    int i187 = (i186 & i185) | (i186 ^ i185);
                    int i188 = i187 & 50147;
                    int i189 = (i187 | 50147) & (~i188);
                    int i190 = ~((i189 & i188) | (i189 ^ i188));
                    int i191 = ((i190 & i184) | (i184 ^ i190)) * 614;
                    Object[] objArr14 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", (i180 & i191) + (i191 | i180), objArr14);
                    long longValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], null).invoke(null, null)).longValue();
                    Long valueOf = Long.valueOf(longValue2);
                    Object D88716 = uH18377.D8871(-3501628);
                    if (D88716 == null) {
                        int resolveOpacity = 52 - Drawable.resolveOpacity(0, 0);
                        int myTid = 1622 - (Process.myTid() >> 22);
                        char axisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                        byte b6 = (byte) 0;
                        Object[] objArr15 = new Object[1];
                        charlie(b6, (byte) (b6 | 47), (byte) (-bArr[c10]), objArr15);
                        D88716 = uH18377.setPivotYN16904(resolveOpacity, myTid, axisFromString2, 544289553, false, (String) objArr15[0], null);
                    }
                    ((Field) D88716).set(null, valueOf);
                    Long valueOf2 = Long.valueOf(longValue2 >> 12);
                    Object D88717 = uH18377.D8871(-620579543);
                    if (D88717 == null) {
                        int i192 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                        int argb = 1622 - Color.argb(0, 0, 0, 0);
                        char indexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        byte b10 = (byte) (-bArr[c3]);
                        Object[] objArr16 = new Object[1];
                        charlie(b10, (byte) (b10 | 26), (byte) (-1), objArr16);
                        D88717 = uH18377.setPivotYN16904(i192, argb, indexOf2, 79239164, false, (String) objArr16[0], null);
                    }
                    ((Field) D88717).set(null, valueOf2);
                    int i193 = echo;
                    c13 = 1;
                    delta = (((i193 & (-104)) | (103 & (~i193))) + ((i193 & 103) << 1)) % 128;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object obj = hotel2[c13];
        int i194 = ((int[]) obj)[0];
        Object obj2 = hotel2[2];
        int i195 = ((int[]) obj2)[0];
        if (i195 == i194) {
            int i196 = delta;
            int i197 = i196 & 49;
            int i198 = (i196 | 49) & (~i197);
            int i199 = i197 << 1;
            echo = (((i198 | i199) << 1) - (i198 ^ i199)) % 128;
            int[] iArr3 = new int[1];
            int[] iArr4 = new int[1];
            int i200 = ((int[]) hotel2[0])[0];
            int i201 = ((int[]) obj2)[0];
            int i202 = ((int[]) obj)[0];
            String[] strArr2 = (String[]) hotel2[c4];
            iArr4[0] = i201;
            iArr3[0] = i202;
            Object[] objArr17 = new Object[4];
            objArr17[0] = new int[1];
            objArr17[1] = iArr3;
            objArr17[2] = iArr4;
            objArr17[c4] = strArr2;
            int foxtrot2 = A0.z.foxtrot(~(Process.myUid() | (-819246)), -1504, (((~((-247247918) | r0)) | 246428672) * 1504) - 1149859809, 398846480);
            int i203 = (i200 - (~(((foxtrot2 ^ 1) + ((foxtrot2 & 1) << 1)) - 1))) - 1;
            int i204 = i203 << 13;
            int i205 = i203 & i204;
            int i206 = ((i204 ^ i203) | i205) & (~i205);
            int i207 = i206 >>> 17;
            int i208 = i206 & i207;
            int i209 = ((i206 ^ i207) | i208) & (~i208);
            int i210 = i209 << 5;
            int i211 = (~i210) & i209;
            int i212 = (~i209) & i210;
            ((int[]) objArr17[0])[0] = (i212 & i211) | (i211 ^ i212);
            int i213 = echo;
            int i214 = i213 & 29;
            int i215 = (i213 ^ 29) | i214;
            delta = ((i214 ^ i215) + ((i215 & i214) << 1)) % 128;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) hotel2[c4];
            if (strArr3 != null) {
                int i216 = echo;
                int i217 = ((-2) - (((i216 ^ 10) + ((i216 & 10) << 1)) ^ (-1))) % 128;
                delta = i217;
                echo = ((i217 & 125) + (i217 | 125)) % 128;
                int i218 = 0;
                while (i218 < strArr3.length) {
                    int i219 = delta;
                    int i220 = i219 & 11;
                    int i221 = i219 | 11;
                    int i222 = ((i220 | i221) << 1) - (i221 ^ i220);
                    echo = i222 % 128;
                    if (i222 % 2 == 0) {
                        arrayList.add(strArr3[i218]);
                        int i223 = (i218 & (-76)) | ((~i218) & 75);
                        int i224 = (i218 & 75) << 1;
                        int i225 = ((i223 | i224) << 1) - (i224 ^ i223);
                        i218 = ((i225 & 30) + (i225 | 30)) - 1;
                    } else {
                        arrayList.add(strArr3[i218]);
                        i218 = ((((i218 ^ 11) | (i218 & 11)) << 1) - (~(-(((~i218) & 11) | (i218 & (-12)))))) - 11;
                    }
                    int i226 = delta;
                    int i227 = i226 ^ 33;
                    int i228 = -(-((i226 & 33) << 1));
                    echo = (((i227 | i228) << 1) - (i228 ^ i227)) % 128;
                }
            }
            int i229 = i194 & i195;
            long j6 = (((i229 | (i194 ^ i195)) & (~i229)) & 4294967295L) ^ 6650119218421301248L;
            int i230 = echo;
            int i231 = ((i230 ^ 65) + ((i230 & 65) << 1)) % 128;
            delta = i231;
            echo = (((i231 | 123) << 1) - (i231 ^ 123)) % 128;
            try {
                Object[] objArr18 = {Long.valueOf(j6), 1548351536L};
                byte[] bArr2 = golf;
                Object[] objArr19 = new Object[1];
                echo(bArr2[24], bArr2[192], bArr2[5], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                echo((byte) (bArr2[177] - 1), bArr2[5], bArr2[7], objArr20);
                String str = (String) objArr20[0];
                Class<?> cls5 = Long.TYPE;
                cls4.getMethod(str, cls5, cls5).invoke(null, objArr18);
                int[] iArr5 = new int[1];
                int[] iArr6 = new int[1];
                int i232 = ((int[]) hotel2[0])[0];
                int i233 = ((int[]) hotel2[2])[0];
                int i234 = ((int[]) hotel2[1])[0];
                String[] strArr4 = (String[]) hotel2[c4];
                iArr6[0] = i233;
                iArr5[0] = i234;
                Object[] objArr21 = new Object[4];
                objArr21[0] = new int[1];
                objArr21[1] = iArr5;
                objArr21[2] = iArr6;
                objArr21[c4] = strArr4;
                int i235 = (((~((~((int) SystemClock.uptimeMillis())) | 671126260)) | 563229232) * 184) + (((697479924 | r0) * 184) - 44441497);
                int identityHashCode3 = System.identityHashCode(d22);
                int i236 = -(-(i235 * (-159)));
                int i237 = (i236 << 1) - i236;
                int i238 = ~i235;
                int i239 = i235 | i238;
                int i240 = i239 * 160;
                int i241 = ((((~i240) & i237) | ((~i237) & i240)) - (~(-(-((i237 & i240) << 1))))) - 1;
                int i242 = ~identityHashCode3;
                int i243 = ~i242;
                int i244 = ((i243 & (i243 | i242)) | i238) * (-160);
                int i245 = i241 & i244;
                int i246 = (i244 | i241) & (~i245);
                int i247 = i245 << 1;
                int i248 = ((i246 | i247) << 1) - (i246 ^ i247);
                int i249 = -(~((~((i239 & i238) | i242)) * 160));
                int i250 = (i232 - (~(((i248 & i249) + (i249 | i248)) - 1))) - 1;
                int i251 = i250 << 13;
                int i252 = (~i251) & i250;
                int i253 = i251 & (~i250);
                int i254 = (i253 & i252) | (i252 ^ i253);
                int i255 = i254 >>> 17;
                int i256 = (~i255) & i254;
                int i257 = (~i254) & i255;
                int i258 = (i257 & i256) | (i256 ^ i257);
                int i259 = i258 << 5;
                ((int[]) objArr21[0])[0] = ((~i258) & i259) | ((~i259) & i258);
                int i260 = echo;
                delta = (((i260 & (-34)) | ((~i260) & 33)) + ((i260 & 33) << 1)) % 128;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object D88718 = uH18377.D8871(-1032283660);
        if (D88718 == null) {
            int myTid2 = (Process.myTid() >> 22) + 51;
            int bitsPerPixel = 1105 - ImageFormat.getBitsPerPixel(0);
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24632);
            byte b11 = (byte) (-bArr[c3]);
            Object[] objArr22 = new Object[1];
            charlie(b11, (byte) (b11 | 26), bArr[27], objArr22);
            D88718 = uH18377.setPivotYN16904(myTid2, bitsPerPixel, minimumFlingVelocity, 499333921, false, (String) objArr22[0], null);
        }
        long j7 = ((Field) D88718).getLong(null);
        int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
        int identityHashCode4 = System.identityHashCode(d22);
        int i261 = minimumFlingVelocity2 * 51;
        int i262 = (i261 ^ (-2820293)) + ((i261 & (-2820293)) << 1);
        int i263 = minimumFlingVelocity2 ^ identityHashCode4;
        int i264 = ~identityHashCode4;
        int i265 = minimumFlingVelocity2 & identityHashCode4;
        int i266 = -(-(((i263 & i265) | (i263 ^ i265)) * (-50)));
        int i267 = (i262 | i266) << 1;
        int i268 = -(i266 ^ i262);
        int i269 = (i267 ^ i268) + ((i268 & i267) << 1);
        int i270 = ~minimumFlingVelocity2;
        int i271 = (i270 | minimumFlingVelocity2) & i270;
        int i272 = i271 & i11;
        int i273 = (i271 | i11) & (~i272);
        int i274 = (i273 & i272) | (i273 ^ i272);
        int i275 = i274 & identityHashCode4;
        int i276 = (identityHashCode4 | i274) & (~i275);
        int i277 = ~((i276 & i275) | (i276 ^ i275));
        int i278 = i11 & i264;
        int i279 = (~i278) & (i11 | i264);
        int i280 = (i279 & i278) | (i279 ^ i278);
        int i281 = ((~i280) & minimumFlingVelocity2) | (i280 & i270);
        int i282 = i280 & minimumFlingVelocity2;
        int i283 = ~((i281 & i282) | (i281 ^ i282));
        int i284 = ((~i283) & i277) | ((~i277) & i283);
        int i285 = i283 & i277;
        int i286 = (i269 - (~(-(~(((i285 & i284) | (i284 ^ i285)) * 50))))) - 1;
        int i287 = (i286 ^ (-1)) + (i286 << 1);
        int i288 = ~((i11 ^ i264) | i278);
        int i289 = i11 & minimumFlingVelocity2;
        int i290 = (~i289) & (i11 | minimumFlingVelocity2);
        int i291 = ~((i289 & i290) | (i290 ^ i289));
        int i292 = i288 & i291;
        int i293 = (i288 | i291) & (~i292);
        int i294 = (i293 & i292) | (i293 ^ i292);
        int i295 = (i270 & i264) | ((~i264) & minimumFlingVelocity2);
        int i296 = minimumFlingVelocity2 & i264;
        int i297 = ~((i296 & i295) | (i295 ^ i296));
        int i298 = i294 & i297;
        int i299 = (i297 | i294) & (~i298);
        int i300 = -(-(((i299 & i298) | (i299 ^ i298)) * 50));
        int i301 = ((i287 | i300) << 1) - (i300 ^ i287);
        Object[] objArr23 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i301, objArr23);
        Class<?> cls6 = Class.forName((String) objArr23[0]);
        int i302 = -View.resolveSize(0, 0);
        int i303 = i302 & 50147;
        int i304 = i302 | 50147;
        int i305 = ((i303 | i304) << 1) - (i304 ^ i303);
        Object[] objArr24 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i305, objArr24);
        long longValue3 = ((Long) cls6.getDeclaredMethod((String) objArr24[0], null).invoke(null, null)).longValue();
        Object D88719 = uH18377.D8871(302164976);
        if (D88719 == null) {
            int axisFromString3 = 50 - MotionEvent.axisFromString("");
            int keyCodeFromString = 1106 - KeyEvent.keyCodeFromString("");
            char c15 = (char) (24633 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            Object[] objArr25 = new Object[1];
            charlie(bArr[20], (byte) 0, bArr[c11], objArr25);
            D88719 = uH18377.setPivotYN16904(axisFromString3, keyCodeFromString, c15, -843511515, false, (String) objArr25[0], null);
        }
        if (j7 == ((longValue3 - ((((Field) D88719).getLong(null) << 52) >>> 52)) >> c11)) {
            int i306 = delta;
            echo = (((i306 & 4) + (i306 | 4)) - 1) % 128;
            Object D887110 = uH18377.D8871(-1242515371);
            if (D887110 == null) {
                int i307 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1107;
                char indexOf3 = (char) (24632 - TextUtils.indexOf("", "", 0));
                byte b12 = (byte) 0;
                Object[] objArr26 = new Object[1];
                charlie(b12, (byte) (b12 | 47), (byte) (-bArr[c10]), objArr26);
                D887110 = uH18377.setPivotYN16904(i307, modifierMetaStateMask, indexOf3, 1783306880, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) D887110).get(null);
            objArr2 = new Object[4];
            int[] iArr7 = new int[1];
            objArr2[0] = iArr7;
            int[] iArr8 = new int[1];
            objArr2[1] = iArr8;
            objArr2[2] = new int[1];
            int i308 = ((int[]) objArr27[1])[0];
            int i309 = ((int[]) objArr27[0])[0];
            String[] strArr5 = (String[]) objArr27[c4];
            iArr8[0] = i308;
            iArr7[0] = i309;
            objArr2[c4] = strArr5;
            int myPid = Process.myPid();
            int i310 = ~myPid;
            int i311 = (((~(myPid | (-116354703))) | (~(i310 | (-403738657))) | 36570126) * 717) + (((~(i310 | (-116354703))) | 36570126 | (~((-403738657) | myPid))) * 717) + 671409029;
            int i312 = i311 << 1;
            int i313 = -i311;
            int i314 = ((i312 | i313) << 1) - (i313 ^ i312);
            int identityHashCode5 = System.identityHashCode(d22);
            int i315 = i314 * 960;
            int i316 = ((i315 ^ (-9501015)) | (i315 & (-9501015))) << 1;
            int i317 = -(((~i315) & (-9501015)) | (9501014 & i315));
            int i318 = ((i316 | i317) << 1) - (i317 ^ i316);
            int i319 = ~identityHashCode5;
            int i320 = (-174761060) & i319;
            int i321 = ~(((-174761060) ^ i319) | i320);
            int i322 = i314 & i319;
            int i323 = ((~i314) & identityHashCode5) | i322;
            int i324 = i314 & identityHashCode5;
            int i325 = ~((i323 & i324) | (i323 ^ i324));
            int i326 = ((~i325) & i321) | ((~i321) & i325);
            int i327 = i321 & i325;
            int i328 = (i318 - (~(-(-(((i327 & i326) | (i326 ^ i327)) * 959))))) - 1;
            int i329 = i328 ^ 92131996;
            int i330 = ((i328 & 92131996) | i329) << 1;
            int i331 = -i329;
            int i332 = ((i330 | i331) << 1) - (i330 ^ i331);
            int i333 = (174761059 & identityHashCode5) | i320;
            int i334 = identityHashCode5 & (-174761060);
            int i335 = (i334 & i333) | (i333 ^ i334);
            int i336 = ~i335;
            int i337 = (i335 | i336) & i336;
            int i338 = (i319 ^ i314) | i322;
            int i339 = ~i338;
            int i340 = (i338 | i339) & i339;
            int i341 = -(-(((i337 & i340) | ((~i340) & i337) | ((~i337) & i340)) * 959));
            int i342 = i332 & i341;
            int i343 = ((i341 | i332) & (~i342)) + (i342 << 1);
            int i344 = i343 << 13;
            int i345 = (~i344) & i343;
            int i346 = (~i343) & i344;
            int i347 = (i346 & i345) | (i345 ^ i346);
            int i348 = i347 >>> 17;
            int i349 = (~i348) & i347;
            int i350 = (~i347) & i348;
            int i351 = (i350 & i349) | (i349 ^ i350);
            int i352 = i351 << 5;
            ((int[]) objArr2[2])[0] = ((~i351) & i352) | ((~i352) & i351);
            int i353 = delta & 109;
            echo = ((i353 - (~((r0 ^ 109) | i353))) - 1) % 128;
            i12 = 1;
        } else {
            int i354 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i355 = i354 & 7486;
            int i356 = ((i354 | 7486) & (~i355)) + (i355 << 1);
            Object[] objArr28 = new Object[1];
            delta("㮘⚨ǣ氶佪ꦫ铧\uf76e퉠㲾\u1fff穢敌䞩ꋿ贡\ue87f쪿㗣ိ獁嶺룡鬵虰\ue0ba", i356, objArr28);
            Class<?> cls7 = Class.forName((String) objArr28[0]);
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            int component93 = k3.component9();
            int i357 = maximumDrawingCacheSize * 714;
            int i358 = ((i357 | (-4725544)) << 1) - (((~i357) & (-4725544)) | (4725543 & i357));
            int i359 = ~maximumDrawingCacheSize;
            int i360 = ~component93;
            int i361 = (i359 ^ i360) | (i359 & i360);
            int i362 = ~i361;
            int i363 = (i361 | i362) & i362;
            int i364 = (i359 | maximumDrawingCacheSize) & i359;
            int i365 = (i364 & 6637) | (i364 ^ 6637);
            int i366 = ~i365;
            int i367 = (i365 | i366) & i366;
            int i368 = i363 ^ i367;
            int i369 = i363 & i367;
            int i370 = (i369 & i368) | (i368 ^ i369);
            int i371 = (-6638) ^ maximumDrawingCacheSize;
            int i372 = (-6638) & maximumDrawingCacheSize;
            int i373 = (i371 & i372) | (i371 ^ i372);
            int i374 = i373 & component93;
            int i375 = ~(((i373 | component93) & (~i374)) | i374);
            int i376 = i370 & i375;
            int i377 = (i370 | i375) & (~i376);
            int i378 = ((i377 & i376) | (i377 ^ i376)) * (-713);
            int i379 = i358 & i378;
            int i380 = i379 + ((i358 ^ i378) | i379);
            int i381 = (maximumDrawingCacheSize & 6637) | (i359 & (-6638));
            int i382 = (i381 & i372) | (i381 ^ i372);
            int i383 = i382 & component93;
            int i384 = (i382 | component93) & (~i383);
            int i385 = (i384 & i383) | (i384 ^ i383);
            int i386 = ~i385;
            int i387 = -(-(((i385 | i386) & i386) * 1426));
            int i388 = i380 & i387;
            int i389 = (i387 ^ i380) | i388;
            int i390 = (i388 & i389) + (i389 | i388);
            int i391 = (-6638) ^ i360;
            int i392 = (-6638) & i360;
            int i393 = (i392 & i391) | (i391 ^ i392);
            int i394 = ~i393;
            int i395 = ((i393 | i394) & i394) * 713;
            int i396 = i390 & i395;
            int i397 = (((i390 ^ i395) | i396) << 1) - ((i395 | i390) & (~i396));
            Object[] objArr29 = new Object[1];
            delta("㮚≡ࡑ癌尨먶ꀃ軃\uf4e1틜㣗⚿ಆ檑养뽳ꕆ茪", i397, objArr29);
            Context context = (Context) cls7.getMethod((String) objArr29[0], null).invoke(null, null);
            if (context != null) {
                int i398 = delta;
                int i399 = (i398 & (-84)) | (i5 & (~i398));
                int i400 = -(-((i398 & 83) << 1));
                echo = ((i399 ^ i400) + ((i399 & i400) << 1)) % 128;
                if (context instanceof ContextWrapper) {
                    int i401 = i398 + 93;
                    echo = i401 % 128;
                    if (i401 % 2 != 0) {
                        if (((ContextWrapper) context).getBaseContext() == null) {
                            int i402 = echo;
                            delta = ((i402 & 29) + (i402 | 29)) % 128;
                            context = null;
                        }
                    } else {
                        ((ContextWrapper) context).getBaseContext();
                        throw null;
                    }
                }
                context = context.getApplicationContext();
                System.identityHashCode(d22);
                k3.component9();
            }
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            int component94 = k3.component9();
            int i403 = doubleTapTimeout * 677;
            int i404 = (i403 | (-23316525)) << 1;
            int i405 = -(((~i403) & (-23316525)) | (23316524 & i403));
            int i406 = (i404 & i405) + (i405 | i404);
            int i407 = doubleTapTimeout ^ component94;
            int i408 = ~component94;
            int i409 = doubleTapTimeout & component94;
            int i410 = (i407 & i409) | (i407 ^ i409);
            int i411 = i410 & i4;
            int i412 = -(-((((i410 | i4) & (~i411)) | i411) * (-676)));
            int i413 = i406 & i412;
            int i414 = (i412 ^ i406) | i413;
            int i415 = ((i413 | i414) << 1) - (i414 ^ i413);
            int i416 = ~doubleTapTimeout;
            int i417 = i4 & i416;
            int i418 = 34543 & doubleTapTimeout;
            int i419 = i417 | i418;
            int i420 = i4 & doubleTapTimeout;
            int i421 = ~((i419 & i420) | (i419 ^ i420));
            int i422 = (i408 | component94) & i408;
            int i423 = i422 & doubleTapTimeout;
            Context context2 = context;
            int i424 = (~i423) & (i422 | doubleTapTimeout);
            int i425 = ~((i424 & i423) | (i424 ^ i423));
            int i426 = i415 - (~(((i425 & i421) | (((~i425) & i421) | ((~i421) & i425))) * 676));
            int i427 = (i426 ^ (-1)) + (i426 << 1);
            int i428 = (i416 | i4) & (~i417);
            int i429 = (~((i428 & i417) | (i428 ^ i417))) | (~(i4 | i408));
            int i430 = (doubleTapTimeout ^ 34543) | i418;
            int i431 = ~((i430 & component94) | (i430 ^ component94));
            int i432 = i429 ^ i431;
            int i433 = i431 & i429;
            int i434 = -(-(((i433 & i432) | (i432 ^ i433)) * 676));
            int i435 = (i427 ^ i434) + ((i427 & i434) << 1);
            Object[] objArr30 = new Object[1];
            delta("㮓뵷㙑꽕\u206b餾ሂ謞೦薰综\uf7c5梾\ue1ae媎펕", i435, objArr30);
            Class<?> cls8 = Class.forName((String) objArr30[0]);
            int i436 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i437 = (i436 ^ 768) + ((i436 & 768) << 1);
            Object[] objArr31 = new Object[1];
            delta("㮐㢜㶞㊔㞉㒕⦋⺇⎹ₑ▀\u1a9aᾶᲛᆓᚓ", i437, objArr31);
            int intValue2 = ((Integer) cls8.getMethod((String) objArr31[0], Object.class).invoke(null, d22)).intValue();
            Object[] objArr32 = new Object[4];
            objArr32[c4] = 174761059;
            objArr32[2] = 0;
            objArr32[1] = Integer.valueOf(intValue2);
            objArr32[0] = context2;
            Object D887111 = uH18377.D8871(280321296);
            if (D887111 == null) {
                int i438 = 53 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                char c16 = c12;
                int indexOf4 = 586 - TextUtils.indexOf("", c16);
                char lastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", c16));
                byte b13 = (byte) (-golf[99]);
                Object[] objArr33 = new Object[1];
                echo(b13, (byte) (b13 & 242), (short) 275, objArr33);
                String str2 = (String) objArr33[0];
                Class[] clsArr = new Class[4];
                clsArr[0] = Context.class;
                Class cls9 = Integer.TYPE;
                clsArr[1] = cls9;
                clsArr[2] = cls9;
                clsArr[c4] = cls9;
                D887111 = uH18377.setPivotYN16904(i438, indexOf4, lastIndexOf2, -821100603, false, str2, clsArr);
            }
            objArr2 = (Object[]) ((Method) D887111).invoke(null, objArr32);
            Object D887112 = uH18377.D8871(-1242515371);
            if (D887112 == null) {
                int green = 51 - Color.green(0);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1106;
                char c17 = (char) (24632 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                byte b14 = (byte) 0;
                Object[] objArr34 = new Object[1];
                charlie(b14, (byte) (b14 | 47), (byte) (-bArr[c10]), objArr34);
                D887112 = uH18377.setPivotYN16904(green, threadPriority, c17, 1783306880, false, (String) objArr34[0], null);
            }
            ((Field) D887112).set(null, objArr2);
            try {
                int i439 = -ExpandableListView.getPackedPositionType(0L);
                int component95 = k3.component9();
                int i440 = i439 * (-375);
                int i441 = ((i440 | (-21583875)) << 1) - (i440 ^ (-21583875));
                int i442 = ~i439;
                int i443 = ~((i442 ^ i11) | (i442 & i11));
                int i444 = component95 ^ i443;
                int i445 = i443 & component95;
                int i446 = (i445 & i444) | (i444 ^ i445);
                int i447 = i439 & 57557;
                int i448 = ~((i439 ^ 57557) | i447);
                int i449 = ((i446 & i448) | (i446 ^ i448)) * 376;
                int i450 = (i441 ^ i449) + ((i449 & i441) << 1);
                int i451 = ~component95;
                int i452 = ~((i451 ^ i439) | (i451 & i439));
                int i453 = ~((i439 & i11) | (i442 & 57557) | i447);
                int i454 = ((i453 & i452) | (i452 ^ i453)) * (-376);
                int i455 = ((~i454) & i450) | ((~i450) & i454);
                int i456 = -(-((i454 & i450) << 1));
                int i457 = ((i455 | i456) << 1) - (i456 ^ i455);
                int i458 = (i442 & i451) | ((~i442) & component95);
                int i459 = component95 & i442;
                int i460 = ~((i458 & i459) | (i458 ^ i459));
                int i461 = i460 & 57557;
                int i462 = (i460 | 57557) & (~i461);
                int i463 = i457 - (~(((i462 & i461) | (i462 ^ i461)) * 376));
                Object[] objArr35 = new Object[1];
                delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", (i463 ^ (-1)) + (i463 << 1), objArr35);
                Class<?> cls10 = Class.forName((String) objArr35[0]);
                int i464 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                int i465 = i464 & 50148;
                int i466 = (i464 | 50148) & (~i465);
                int i467 = -(-(i465 << 1));
                int i468 = ((i466 | i467) << 1) - (i466 ^ i467);
                Object[] objArr36 = new Object[1];
                delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i468, objArr36);
                long longValue4 = ((Long) cls10.getDeclaredMethod((String) objArr36[0], null).invoke(null, null)).longValue();
                Long valueOf3 = Long.valueOf(longValue4);
                Object D887113 = uH18377.D8871(302164976);
                if (D887113 == null) {
                    int combineMeasuredStates = 51 - View.combineMeasuredStates(0, 0);
                    int indexOf5 = 1106 - TextUtils.indexOf("", "", 0, 0);
                    char c18 = (char) (24633 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    Object[] objArr37 = new Object[1];
                    charlie(bArr[20], (byte) 0, bArr[c11], objArr37);
                    D887113 = uH18377.setPivotYN16904(combineMeasuredStates, indexOf5, c18, -843511515, false, (String) objArr37[0], null);
                }
                ((Field) D887113).set(null, valueOf3);
                Long valueOf4 = Long.valueOf(longValue4 >> c11);
                Object D887114 = uH18377.D8871(-1032283660);
                if (D887114 == null) {
                    int indexOf6 = TextUtils.indexOf((CharSequence) "", '0') + 52;
                    int lastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 1107;
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24632);
                    byte b15 = (byte) (-bArr[c3]);
                    Object[] objArr38 = new Object[1];
                    charlie(b15, (byte) (b15 | 26), bArr[27], objArr38);
                    D887114 = uH18377.setPivotYN16904(indexOf6, lastIndexOf3, scrollBarFadeDuration, 499333921, false, (String) objArr38[0], null);
                }
                ((Field) D887114).set(null, valueOf4);
                int i469 = delta;
                int i470 = i469 & 125;
                int i471 = (i469 ^ 125) | i470;
                i12 = 1;
                echo = (((i470 | i471) << 1) - (i471 ^ i470)) % 128;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        Object obj3 = objArr2[0];
        int i472 = ((int[]) obj3)[0];
        Object obj4 = objArr2[i12];
        if (((int[]) obj4)[0] == i472) {
            int i473 = delta;
            int i474 = i473 & 83;
            int i475 = ((i473 ^ 83) | i474) << i12;
            int i476 = -((i473 | 83) & (~i474));
            echo = ((i475 & i476) + (i476 | i475)) % 128;
            int[] iArr9 = new int[i12];
            int[] iArr10 = new int[i12];
            int i477 = ((int[]) objArr2[2])[0];
            int i478 = ((int[]) obj4)[0];
            int i479 = ((int[]) obj3)[0];
            String[] strArr6 = (String[]) objArr2[c4];
            iArr10[0] = i478;
            iArr9[0] = i479;
            Object[] objArr39 = new Object[4];
            objArr39[0] = iArr9;
            objArr39[1] = iArr10;
            objArr39[2] = new int[i12];
            objArr39[c4] = strArr6;
            int myTid3 = Process.myTid();
            int foxtrot3 = A0.z.foxtrot((~(myTid3 | (-474233784))) | (~(841402313 | myTid3)), -1324, (((~myTid3) | 572703816) * 1324) + 2114738203, 201789334);
            int component96 = k3.component9();
            int i480 = foxtrot3 * (-167);
            int i481 = ~foxtrot3;
            int i482 = ~i481;
            int i483 = (i482 ^ i481) | (i482 & i481);
            int i484 = ~i483;
            int i485 = (i483 | i484) & i484;
            int i486 = ~component96;
            int i487 = (i486 | component96) & i486;
            int i488 = (i482 & i487) | ((~i487) & i481);
            int i489 = i481 & i487;
            int i490 = ~((i488 & i489) | (i488 ^ i489));
            int i491 = i485 & i490;
            int i492 = (((i490 | i485) & (~i491)) | i491) * 168;
            int i493 = (i480 ^ i492) + ((i480 & i492) << 1);
            int i494 = (~(((-1) ^ component96) | component96)) * 168;
            int i495 = i493 & i494;
            int i496 = -(-((i494 ^ i493) | i495));
            int i497 = ((i495 | i496) << 1) - (i496 ^ i495);
            int i498 = ((-1) ^ i487) | i487;
            int i499 = ~i498;
            int i500 = (i498 | i499) & i499;
            int i501 = ~(((-1) ^ foxtrot3) | foxtrot3);
            int i502 = ((~i501) & i500) | ((~i500) & i501);
            int i503 = i500 & i501;
            int i504 = (i503 & i502) | (i502 ^ i503);
            int i505 = (foxtrot3 | i481) & i481;
            int i506 = ~((i505 & component96) | (i505 & i486) | ((~i505) & component96));
            int i507 = ((~i506) & i504) | ((~i504) & i506);
            int i508 = i506 & i504;
            int i509 = ((i508 & i507) | (i507 ^ i508)) * 168;
            int i510 = i497 & i509;
            int i511 = -(-((i509 ^ i497) | i510));
            int i512 = (i510 & i511) + (i511 | i510);
            int component97 = k3.component9();
            int i513 = i512 * 491;
            int i514 = i477 * (-489);
            int i515 = i513 & i514;
            int i516 = (((i513 ^ i514) | i515) << 1) - ((i513 | i514) & (~i515));
            int i517 = ~i512;
            int i518 = ~i477;
            int i519 = i517 & i518;
            int i520 = (i517 ^ i518) | i519;
            int i521 = ~component97;
            int i522 = -(~(((i520 & i521) | ((~i521) & i520) | ((~i520) & i521)) * (-490)));
            int i523 = (-2) - (((i516 ^ i522) + ((i516 & i522) << 1)) ^ (-1));
            int i524 = ((~i518) & i512) | i519;
            int i525 = i512 & i518;
            int i526 = ~((i525 & i524) | (i524 ^ i525));
            int i527 = i518 & (i477 | i518);
            int i528 = i527 & component97;
            int i529 = (component97 | i527) & (~i528);
            int i530 = ~((i529 & i528) | (i529 ^ i528));
            int i531 = i526 ^ i530;
            int i532 = i530 & i526;
            int i533 = -(-(((i532 & i531) | (i531 ^ i532)) * 490));
            int i534 = i523 ^ i533;
            int i535 = (i533 & i523) << 1;
            int i536 = (i534 & i535) + (i535 | i534);
            int i537 = -(-(i517 * 490));
            int i538 = (((~i537) & i536) | ((~i536) & i537)) + ((i537 & i536) << 1);
            int i539 = i538 << 13;
            int i540 = (i539 & (~i538)) | ((~i539) & i538);
            int i541 = i540 >>> 17;
            int i542 = i540 & i541;
            int i543 = ((i540 ^ i541) | i542) & (~i542);
            int i544 = i543 << 5;
            int i545 = (~i544) & i543;
            int i546 = (~i543) & i544;
            ((int[]) objArr39[2])[0] = (i546 & i545) | (i545 ^ i546);
            int i547 = delta;
            echo = ((((i547 | 44) << 1) - (i547 ^ 44)) - 1) % 128;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr7 = (String[]) objArr2[c4];
            if (strArr7 != null) {
                int i548 = echo;
                int i549 = i548 | 85;
                delta = ((i549 << 1) - ((~(i548 & 85)) & i549)) % 128;
                echo = (((r7 ^ 40) + ((r7 & 40) << 1)) - 1) % 128;
                int i550 = 0;
                while (i550 < strArr7.length) {
                    int i551 = delta;
                    int i552 = i551 & 27;
                    echo = ao.ad.victor(((i551 ^ 27) | i552) << 1, ~(-((i551 | 27) & (~i552))), 1, 128);
                    arrayList2.add(strArr7[i550]);
                    int i553 = ((i550 & (-59)) + (i550 | (-59))) - 1;
                    int i554 = i553 & 61;
                    i550 = (i554 << 1) + ((i553 | 61) & (~i554));
                    echo = (delta + 49) % 128;
                }
            }
            Object[] objArr40 = {Long.valueOf((((~(i472 & r4)) & (i472 | r4)) & 4294967295L) ^ 7678101619036127232L), 1787697334L};
            byte[] bArr3 = golf;
            Object[] objArr41 = new Object[1];
            echo((byte) (bArr3[435] - 1), bArr3[192], (short) 334, objArr41);
            Class<?> cls11 = Class.forName((String) objArr41[0]);
            Object[] objArr42 = new Object[1];
            echo((byte) (-bArr3[46]), (byte) (-bArr3[491]), (short) 116, objArr42);
            String str3 = (String) objArr42[0];
            Class<?> cls12 = Long.TYPE;
            cls11.getMethod(str3, cls12, cls12).invoke(null, objArr40);
            int[] iArr11 = new int[1];
            int[] iArr12 = new int[1];
            int i555 = ((int[]) objArr2[2])[0];
            int i556 = ((int[]) objArr2[1])[0];
            int i557 = ((int[]) objArr2[0])[0];
            String[] strArr8 = (String[]) objArr2[c4];
            iArr12[0] = i556;
            iArr11[0] = i557;
            Object[] objArr43 = new Object[4];
            objArr43[0] = iArr11;
            objArr43[1] = iArr12;
            objArr43[2] = new int[1];
            objArr43[c4] = strArr8;
            int i558 = (int) Runtime.getRuntime().totalMemory();
            int i559 = ~i558;
            int i560 = (((~(i558 | 327051247)) | (~((-58614952) | i559)) | 40117282) * 676) + (((~(308553578 | i559)) | 18497669) * 676) + (((-18497670) | i558) * (-676)) + 1821955837;
            int i561 = (i560 << 1) - i560;
            int component98 = k3.component9();
            int i562 = i561 * (-519);
            int i563 = -(-(i555 * 521));
            int i564 = (i562 ^ i563) + ((i562 & i563) << 1);
            int i565 = ~i561;
            int i566 = ~i555;
            int i567 = i565 | i566;
            int i568 = ~component98;
            int i569 = (i568 | component98) & i568;
            int i570 = i567 & i569;
            int i571 = (i567 | i569) & (~i570);
            int i572 = ~i569;
            int i573 = -(-(((~((i555 & component98) | (i555 ^ component98))) | (~((i571 & i570) | (i571 ^ i570)))) * 520));
            int i574 = ((~i573) & i564) | ((~i564) & i573);
            int i575 = -(-((i573 & i564) << 1));
            int i576 = (i574 ^ i575) + ((i575 & i574) << 1);
            int i577 = ~(i566 | i568);
            int i578 = i561 & component98;
            int i579 = ~((i561 ^ component98) | i578);
            int i580 = i577 & i579;
            int i581 = (((i577 | i579) & (~i580)) | i580) * (-1040);
            int i582 = i576 & i581;
            int i583 = i582 + ((i581 ^ i576) | i582);
            int i584 = (i565 | i561) & i565;
            int i585 = (i584 & i572) | ((~i584) & i569);
            int i586 = i584 & i569;
            int i587 = ~((i586 & i585) | (i585 ^ i586));
            int i588 = ~((i566 & i561) | (i566 ^ i561));
            int i589 = (component98 & i565) | (i561 & i568);
            int i590 = ((~((i589 & i578) | (i589 ^ i578))) | (i588 & i587) | ((~i588) & i587) | ((~i587) & i588)) * 520;
            int i591 = i583 & i590;
            int i592 = i591 + ((i590 ^ i583) | i591);
            int i593 = i592 << 13;
            int i594 = (i593 & (~i592)) | ((~i593) & i592);
            int i595 = i594 >>> 17;
            int i596 = (~i595) & i594;
            int i597 = (~i594) & i595;
            int i598 = (i597 & i596) | (i596 ^ i597);
            int i599 = i598 << 5;
            int i600 = i598 & i599;
            ((int[]) objArr43[2])[0] = ((i598 ^ i599) | i600) & (~i600);
            delta = ((-2) - ((echo + 12) ^ (-1))) % 128;
        }
        golf(d22, function1, null, null, null, function12, 14);
        int i601 = echo + 11;
        delta = i601 % 128;
        if (i601 % 2 != 0) {
            throw null;
        }
    }

    public static void juliet() {
        foxtrot = new byte[]{40, 51, 123, -41, -29, -15, -20, -16, -16, -8, -26, -23, 42, -3, -32, 19, -42, -30, -10, -22, 10, -6, 12, -22, -20, -8, -21, 33, 2, -20, -21, -12, -16, -45, 7, -18, -11, -21, -29, -15, -20, -16, -16, -8, -26, -23, 46, -5, -17, -16, -11};
    }

    public static void kilo() {
        byte[] bArr = new byte[840];
        System.arraycopy("\u000f»\u0083ÿ\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ5\u001b¬TÐï\u0005\u0006ý\u0001\u001eê\u0003ü\u0006ö\u0002\u0001ü\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿÁ\u001a%\u0007û\u0000\u000f\u0000\u0004ù\u0007\bØ\u000bõ\u001d\u0004\u0013ý\u0005\tô\u0011Þ\u001b\u000fû\u0007ç÷å\u0007\u0005ù\u0006\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄGô\u0011Ý!à%\u0001ûÞ+ÿü\nã\u001f\f\u0003ó\u000bù\u000fâá\b\u0002û\u0003\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ;\u0000\u0011Ï6\u0001ýù\u0005\u0005\u0002ê'ù÷ÁQô\u0011Þ\u001b\u000fû\u0007ç÷å\u0007\u0005ù\u0006Ðï\u0005\u0006ý\u0001\u001eê\u0003ü\u0006\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ!é\u0000\tÿ\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ\u001fìÿ\u0006\u0000ò\u0013\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ;\u0000\u0011à\u0019\u0000\u0003\u000eÕì\bÿ\u0006\u0003í\u0014\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄGÑöü\u0007\u0002\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿÁ\"#\u0007Ï7í\n\u0005÷\u0003\fûô\u0014\rö\t\b\u0001ãî\u000e\u0000\u0005\u0001\u0001ù\u000b\bÃ\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ:ëå\u0007ý\b\u0001\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ6\u001a¬A\u000e\u0000\u0005\u0001\u0001ù\u000b\bÃ\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ5\u0019®\u0013\u000e\u0000\u0005\u0001\u0001ù\u000b\bÇ\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄ;\u0000\u0011Ñ.\u0001\bó\u0015þÛ\u001a\u000b\tÖ'ú\u000bÔó\u0001\u0002\u0002\b\u000e\u0000Ã:\u0005\u0007û\u0000\u000f\u0000\u0004ù\u0007\bø\u000b½5\u000fø\u0010ÿüýÌ:\fü\u000bî\u0013\u0004ÿò\f\u0007\bó\u000fþõ\rÄKÍò\u0006\u0000\u0003ñ\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 840);
        golf = bArr;
        hotel = 142;
    }

    public static void lima() {
        kilo = new byte[]{114, -2, -56, 47};
    }

    public static Object november(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = i14 | i13;
        int i16 = ~(i15 | i5);
        int i17 = (~i5) | (~((~i13) | i12));
        int i18 = (~(i5 | i13)) | (~(i14 | i5)) | (~i15);
        int i19 = (-1703411712) * i11;
        int i20 = (1961361408 * i4) + i19 + (1394081792 * i10) + ((-342977397) * i18) + (342977397 * i17) + (i16 * (-342977397)) + (1051104396 * i13) + (1737059190 * i12) + 1765277696;
        int papa = AbstractC2327c.papa(i4, -1992133889, ((-953487067) * i11) + i12 + i13 + i10);
        switch (AbstractC2327c.quebec(papa, 166854656, (i4 * 1957688713) + (2077717299 * i11) + (272662391 * i10) + (i18 * HttpConstants.HTTP_ENTITY_TOO_LARGE) + (i17 * (-413)) + (i16 * HttpConstants.HTTP_ENTITY_TOO_LARGE) + (i13 * 272662804) + ((i12 * 272661978) - 2115615402), -213778432, (907935744 * papa) + i20)) {
            case 1:
                D2 d22 = (D2) objArr[0];
                int i21 = (-2) - ((echo + 18) ^ (-1));
                delta = i21 % 128;
                int i22 = i21 % 2;
                N14263A23323 n14263a23323 = (N14263A23323) d22.bravo.getValue();
                if (i22 == 0) {
                    int i23 = echo;
                    int i24 = i23 & 63;
                    int i25 = (i23 ^ 63) | i24;
                    delta = (((i24 | i25) << 1) - (i25 ^ i24)) % 128;
                    return n14263a23323;
                }
                throw null;
            case 2:
                hotel(objArr);
                return null;
            case 3:
                oscar(objArr);
                return null;
            case 4:
                papa(objArr);
                return null;
            case 5:
                D2 d23 = (D2) objArr[0];
                Nd.c cVar = (Nd.c) objArr[1];
                int i26 = echo;
                int i27 = i26 & 61;
                int i28 = i27 + ((i26 ^ 61) | i27);
                delta = i28 % 128;
                Object[] objArr2 = new Object[2];
                if (i28 % 2 != 0) {
                    objArr2[0] = d23;
                    objArr2[1] = cVar;
                    int i29 = 29 / 0;
                    return november(objArr2, k3.component9(), k3.component9(), k3.component9(), k3.component9(), -1609676830, 1609676837);
                }
                objArr2[0] = d23;
                objArr2[1] = cVar;
                return november(objArr2, k3.component9(), k3.component9(), k3.component9(), k3.component9(), -1609676830, 1609676837);
            case 6:
                try {
                    Object[] objArr3 = {new rV4669$8((D2) objArr[0], I0.echo(), (Integer) objArr[2], (Map) objArr[3], (String) objArr[4], (Function1) objArr[1], (Function1) objArr[5])};
                    Object echo2 = am.echo(438988851);
                    if (echo2 == null) {
                        echo2 = am.charlie((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 52, ExpandableListView.getPackedPositionGroup(0L) + 584, 333035925, "component9", new Class[]{Function0.class});
                    }
                    ((Method) echo2).invoke(null, objArr3);
                    int i30 = delta;
                    echo = ao.ad.victor(i30 ^ 67, ~(-(-((i30 & 67) << 1))), 1, 128);
                    return null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 7:
                D2 d24 = (D2) objArr[0];
                Nd.c cVar2 = (Nd.c) objArr[1];
                int i31 = echo;
                delta = (((i31 | 61) << 1) - (i31 ^ 61)) % 128;
                Object mike = d24.mike(null, kotlin.collections.t.alpha, "", cVar2);
                int i32 = echo;
                int i33 = i32 & 23;
                int i34 = (i33 - (~(-(-((i32 ^ 23) | i33))))) - 1;
                delta = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = 45 / 0;
                }
                return mike;
            case 8:
                D2 d25 = (D2) objArr[0];
                int intValue = ((Number) objArr[1]).intValue();
                Map map = (Map) objArr[2];
                String str = (String) objArr[3];
                Nd.c cVar3 = (Nd.c) objArr[4];
                int i36 = delta;
                int i37 = i36 & 29;
                int i38 = ((i36 ^ 29) | i37) << 1;
                int i39 = -((29 | i36) & (~i37));
                echo = (((i38 | i39) << 1) - (i39 ^ i38)) % 128;
                Object mike2 = d25.mike(new Integer(intValue), map, str, cVar3);
                int i40 = echo;
                int i41 = (i40 ^ 15) + ((i40 & 15) << 1);
                delta = i41 % 128;
                if (i41 % 2 == 0) {
                    return mike2;
                }
                throw null;
            case 9:
                D2 d26 = (D2) objArr[0];
                int i42 = echo;
                int i43 = i42 & 125;
                int i44 = -(-((i42 ^ 125) | i43));
                int i45 = (i43 & i44) + (i44 | i43);
                delta = i45 % 128;
                Object[] objArr4 = new Object[1];
                if (i45 % 2 != 0) {
                    objArr4[0] = d26;
                    N14263A23323 n14263a233232 = (N14263A23323) november(objArr4, k3.component9(), k3.component9(), k3.component9(), k3.component9(), 63630148, -63630147);
                    int i46 = 20 / 0;
                    return n14263a233232;
                }
                objArr4[0] = d26;
                return (N14263A23323) november(objArr4, k3.component9(), k3.component9(), k3.component9(), k3.component9(), 63630148, -63630147);
            default:
                bravo(objArr);
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0ccc, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0cd9, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.D2.echo;
        r1 = r0 & 77;
        com.fingerprintjs.android.fpjs_pro_internal.D2.delta = (r1 + ((r0 ^ 77) | r1)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0cd6, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() != null) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void oscar(Object[] objArr) {
        char c3;
        char c4;
        int i4;
        char c10;
        int i5;
        Class<?> cls;
        int i10;
        char c11;
        char c12;
        Object[] objArr2;
        int i11;
        long j5;
        char c13;
        char c14;
        long j6;
        byte[] bArr;
        Object[] objArr3;
        Class<?> cls2 = Integer.TYPE;
        D2 d22 = (D2) objArr[0];
        int intValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        Function1 function12 = (Function1) objArr[4];
        int i12 = echo;
        int i13 = ((i12 ^ 5) | (i12 & 5)) << 1;
        int i14 = -((i12 & (-6)) | ((~i12) & 5));
        delta = (((i13 | i14) << 1) - (i13 ^ i14)) % 128;
        Object D8871 = uH18377.D8871(-620579543);
        byte[] bArr2 = foxtrot;
        if (D8871 == null) {
            int myTid = 52 - (Process.myTid() >> 22);
            int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1622;
            c4 = 19;
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            i4 = 50147;
            byte b2 = (byte) (-bArr2[47]);
            c3 = '/';
            c10 = '\r';
            i5 = 116;
            Object[] objArr4 = new Object[1];
            charlie(b2, (byte) (b2 | 26), (byte) (-1), objArr4);
            D8871 = uH18377.setPivotYN16904(myTid, i15, keyRepeatDelay, 79239164, false, (String) objArr4[0], null);
        } else {
            c3 = '/';
            c4 = 19;
            i4 = 50147;
            c10 = '\r';
            i5 = 116;
        }
        long j7 = ((Field) D8871).getLong(null);
        int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
        int i16 = pressedStateDuration * (-103);
        int i17 = i16 ^ (-5928371);
        int i18 = ((i16 & (-5928371)) | i17) << 1;
        int i19 = -i17;
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        int i21 = ~pressedStateDuration;
        int i22 = i21 ^ (-57558);
        int i23 = i21 & (-57558);
        int i24 = ~((i22 ^ i23) | (i22 & i23));
        int i25 = (-57558) & intValue;
        int i26 = (~i25) & ((-57558) | intValue);
        int i27 = ~intValue;
        int i28 = (i26 ^ i25) | (i25 & i26);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = ((i30 & i24) | (i24 ^ i30)) * 104;
        int i32 = i20 | i31;
        int i33 = ((i32 << 1) - (~(-((~(i20 & i31)) & i32)))) - 1;
        int i34 = i27 & pressedStateDuration;
        int i35 = (~i34) & (i27 | pressedStateDuration);
        int i36 = (i35 ^ i34) | (i35 & i34);
        int i37 = i36 & 57557;
        int i38 = (i36 | 57557) & (~i37);
        int i39 = (~((i37 & i38) | (i38 ^ i37))) * (-104);
        int i40 = i33 & i39;
        int i41 = i40 + ((i39 ^ i33) | i40);
        int i42 = (i34 | (intValue & i21) | (pressedStateDuration & intValue)) * 104;
        int i43 = ((i41 & i42) - (~(i42 | i41))) - 1;
        Object[] objArr5 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i43, objArr5);
        Class<?> cls3 = Class.forName((String) objArr5[0]);
        int i44 = -ExpandableListView.getPackedPositionType(0L);
        int component9 = k3.component9();
        int i45 = -(-(i44 * 530));
        int i46 = ((i45 & 1058) - (~(i45 | 1058))) - (-26577909);
        int i47 = -(-(((~((~component9) | i44)) | (~((i44 ^ i4) | (i44 & i4)))) * 529));
        int i48 = i46 ^ i47;
        int i49 = (i47 & i46) << 1;
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        int i51 = i44 ^ component9;
        int i52 = i44 & component9;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = (-50148) ^ i53;
        int i55 = i53 & (-50148);
        int i56 = ((i55 & i54) | (i54 ^ i55)) * 529;
        int i57 = ((i50 | i56) << 1) - (i56 ^ i50);
        Object[] objArr6 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i57, objArr6);
        long longValue = ((Long) cls3.getDeclaredMethod((String) objArr6[0], null).invoke(null, null)).longValue();
        Object D88712 = uH18377.D8871(-3501628);
        if (D88712 == null) {
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
            int keyCodeFromString = KeyEvent.keyCodeFromString("") + 1622;
            c11 = '\t';
            char indexOf = (char) TextUtils.indexOf("", "");
            byte b4 = (byte) 0;
            i10 = 0;
            cls = cls2;
            Object[] objArr7 = new Object[1];
            charlie(b4, (byte) (b4 | 47), (byte) (-bArr2[9]), objArr7);
            D88712 = uH18377.setPivotYN16904(minimumFlingVelocity, keyCodeFromString, indexOf, 544289553, false, (String) objArr7[0], null);
        } else {
            cls = cls2;
            i10 = 0;
            c11 = '\t';
        }
        long j10 = (longValue - ((((Field) D88712).getLong(null) << 52) >>> 52)) >> 12;
        byte[] bArr3 = golf;
        if (j7 == j10) {
            int i58 = delta;
            echo = ((i58 ^ 109) + ((i58 & 109) << 1)) % 128;
            Object D88713 = uH18377.D8871(-881784774);
            if (D88713 == null) {
                int i59 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51;
                int packedPositionChild = 1621 - ExpandableListView.getPackedPositionChild(0L);
                char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                Object[] objArr8 = new Object[1];
                charlie((byte) (-bArr2[c10]), (byte) (bArr2[1] - 1), (byte) (-bArr2[c4]), objArr8);
                D88713 = uH18377.setPivotYN16904(i59, packedPositionChild, lastIndexOf, 348826351, false, (String) objArr8[i10], null);
            }
            Object[] objArr9 = (Object[]) ((Field) D88713).get(null);
            objArr2 = new Object[4];
            objArr2[i10] = new int[1];
            int[] iArr = new int[1];
            objArr2[1] = iArr;
            int[] iArr2 = new int[1];
            objArr2[2] = iArr2;
            int i60 = ((int[]) objArr9[2])[i10];
            int i61 = ((int[]) objArr9[1])[i10];
            String[] strArr = (String[]) objArr9[3];
            iArr2[i10] = i60;
            iArr[i10] = i61;
            objArr2[3] = strArr;
            int myTid2 = Process.myTid();
            int i62 = ~myTid2;
            int i63 = (((~((-41030721) | i62)) | (~(192075210 | myTid2))) * 520) - 778139817;
            int i64 = ~((-192075211) | i62);
            int i65 = ~(myTid2 | 318446693);
            int i66 = ((i65 | (~(i62 | (-318446694))) | 151044490) * 520) + ((i64 | i65) * (-1040)) + i63;
            int i67 = -(-(i66 * (-494)));
            int i68 = ~i66;
            int i69 = -(-(i68 * (-495)));
            int i70 = (i67 & i69) + (i67 | i69);
            int i71 = -(-(i27 * 495));
            int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
            int i73 = (-1) ^ i68;
            int i74 = ~((i68 & i73) | (i73 ^ i68));
            int i75 = ~i27;
            int i76 = (i75 | i27) & i75;
            int i77 = i74 & i76;
            int i78 = -(~(-(-((((i74 | i76) & (~i77)) | i77) * 495))));
            int i79 = (((i72 | i78) << 1) - (i78 ^ i72)) - 1;
            int i80 = ~i79;
            int i81 = (i80 | i79) & i80;
            c12 = '\f';
            int i82 = ((~i81) & (-718083098)) | (i81 & 718083097);
            int i83 = i81 & (-718083098);
            int i84 = ~((i82 ^ i83) | (i82 & i83));
            int i85 = ((~i84) & intValue) | (i84 & i27);
            int i86 = i84 & intValue;
            int i87 = (i85 ^ i86) | (i86 & i85);
            int i88 = 718083097 ^ i79;
            int i89 = 718083097 & i79;
            int i90 = (i88 ^ i89) | (i88 & i89);
            int i91 = ~i90;
            int i92 = i91 & (i90 | i91);
            int i93 = (-2) - ((((i79 * 615) - (-2098274882)) - (~(-(-(((i87 & i92) | ((i92 & (~i87)) | ((~i92) & i87))) * 614))))) ^ (-1));
            int i94 = ~i80;
            int i95 = (i80 & i75) | (i27 & i94);
            int i96 = i80 & i27;
            int i97 = ~((i95 ^ i96) | (i95 & i96));
            int i98 = ~((i81 ^ (-718083098)) | i83);
            int i99 = i97 & i98;
            int i100 = (i97 | i98) & (~i99);
            int i101 = (i100 & i99) | (i100 ^ i99);
            int i102 = i27 & (-718083098);
            int i103 = (~i102) & (i27 | (-718083098));
            int i104 = (i101 | (~((i102 & i103) | (i103 ^ i102)))) * (-1228);
            int i105 = i93 & i104;
            int i106 = i105 + ((i93 ^ i104) | i105);
            int i107 = (i80 & (-718083098)) | (718083097 & i94);
            int i108 = i80 & 718083097;
            int i109 = (i107 & i108) | (i107 ^ i108);
            int i110 = i109 & i27;
            int i111 = ~(((i109 | i27) & (~i110)) | i110);
            int i112 = (i27 | intValue) & i27;
            int i113 = (i112 & i79) | (i112 & i80) | ((~i112) & i79);
            int i114 = (i113 & (-718083098)) | (i113 ^ (-718083098));
            int i115 = ~i114;
            int i116 = (i114 | i115) & i115;
            int i117 = i111 & i116;
            int i118 = (i111 | i116) & (~i117);
            int i119 = ((i118 & i117) | (i118 ^ i117)) * 614;
            int i120 = i106 | i119;
            int i121 = (i120 << 1) - ((~(i119 & i106)) & i120);
            int i122 = i121 << 13;
            int i123 = (~i122) & i121;
            int i124 = i122 & (~i121);
            int i125 = (i124 & i123) | (i123 ^ i124);
            int i126 = i125 >>> 17;
            int i127 = (~i126) & i125;
            int i128 = (~i125) & i126;
            int i129 = (i128 & i127) | (i127 ^ i128);
            int i130 = i129 << 5;
            int i131 = (~i130) & i129;
            int i132 = (~i129) & i130;
            ((int[]) objArr2[i10])[i10] = (i132 & i131) | (i131 ^ i132);
            int i133 = delta;
            int i134 = i133 & 113;
            int i135 = (i133 | 113) & (~i134);
            int i136 = -(-(i134 << 1));
            echo = ((i135 & i136) + (i135 | i136)) % 128;
            c13 = 1;
        } else {
            c12 = '\f';
            try {
                Object[] objArr10 = new Object[1];
                objArr10[i10] = 1243929146;
                Object D88714 = uH18377.D8871(187486525);
                if (D88714 == null) {
                    int jumpTapTimeout = 51 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i137 = (CdmaCellLocation.convertQuartSecToDecDegrees(i10) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i10) == 0.0d ? 0 : -1)) + 1571;
                    int i138 = i10;
                    char absoluteGravity = (char) (27579 - Gravity.getAbsoluteGravity(i138, i138));
                    Class[] clsArr = new Class[1];
                    clsArr[i138] = cls;
                    D88714 = uH18377.setPivotYN16904(jumpTapTimeout, i137, absoluteGravity, -728271896, false, null, clsArr);
                }
                Object[] objArr11 = {Integer.valueOf(intValue), Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), ((Constructor) D88714).newInstance(objArr10), -718083098, Boolean.FALSE};
                Object D88715 = uH18377.D8871(569818160);
                if (D88715 == null) {
                    byte b6 = (byte) (-bArr3[99]);
                    Object[] objArr12 = new Object[1];
                    echo(b6, (byte) (b6 & 242), (short) 275, objArr12);
                    D88715 = uH18377.setPivotYN16904(TextUtils.indexOf((CharSequence) "", '0') + 61, ExpandableListView.getPackedPositionGroup(0L) + 527, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -28500251, false, (String) objArr12[0], new Class[]{cls, cls, (Class) uH18377.charlie((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 18791), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52, 2536 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), cls, Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) D88715).invoke(null, objArr11);
                Object D88716 = uH18377.D8871(-881784774);
                if (D88716 == null) {
                    int packedPositionType = 52 - ExpandableListView.getPackedPositionType(0L);
                    int indexOf2 = 1621 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    char rgb = (char) (ShapeBuilder.DEFAULT_SHAPE_COLOR - Color.rgb(0, 0, 0));
                    Object[] objArr13 = new Object[1];
                    charlie((byte) (-bArr2[c10]), (byte) (bArr2[1] - 1), (byte) (-bArr2[c4]), objArr13);
                    i11 = 0;
                    D88716 = uH18377.setPivotYN16904(packedPositionType, indexOf2, rgb, 348826351, false, (String) objArr13[0], null);
                } else {
                    i11 = 0;
                }
                ((Field) D88716).set(null, objArr2);
                try {
                    int resolveOpacity = Drawable.resolveOpacity(i11, i11);
                    int i139 = ((~resolveOpacity) & 57557) | (resolveOpacity & (-57558));
                    int i140 = (resolveOpacity & 57557) << 1;
                    int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                    Object[] objArr14 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i141, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    int i142 = -(~(-(Process.myTid() >> 22)));
                    int i143 = (((i142 | i4) << 1) - (i142 ^ i4)) - 1;
                    Object[] objArr15 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i143, objArr15);
                    long longValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], null).invoke(null, null)).longValue();
                    Long valueOf = Long.valueOf(longValue2);
                    Object D88717 = uH18377.D8871(-3501628);
                    if (D88717 == null) {
                        int i144 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1622;
                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                        byte b10 = (byte) 0;
                        j5 = longValue2;
                        Object[] objArr16 = new Object[1];
                        charlie(b10, (byte) (b10 | 47), (byte) (-bArr2[c11]), objArr16);
                        D88717 = uH18377.setPivotYN16904(i144, windowTouchSlop, absoluteGravity2, 544289553, false, (String) objArr16[0], null);
                    } else {
                        j5 = longValue2;
                    }
                    ((Field) D88717).set(null, valueOf);
                    Long valueOf2 = Long.valueOf(j5 >> 12);
                    Object D88718 = uH18377.D8871(-620579543);
                    if (D88718 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 4;
                        int i145 = 1622 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        char c15 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b11 = (byte) (-bArr2[c3]);
                        Object[] objArr17 = new Object[1];
                        charlie(b11, (byte) (b11 | 26), (byte) (-1), objArr17);
                        D88718 = uH18377.setPivotYN16904(mirror, i145, c15, 79239164, false, (String) objArr17[0], null);
                    }
                    ((Field) D88718).set(null, valueOf2);
                    int i146 = echo;
                    c13 = 1;
                    delta = ao.ad.victor((i146 & (-58)) | ((~i146) & 57), ~((i146 & 57) << 1), 1, 128);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object obj = objArr2[c13];
        int i147 = ((int[]) obj)[0];
        Object obj2 = objArr2[2];
        int i148 = ((int[]) obj2)[0];
        if (i148 == i147) {
            int i149 = delta;
            echo = ao.ad.victor((i149 & (-8)) | ((~i149) & 7), ~(-(-((i149 & 7) << 1))), 1, 128);
            int i150 = ((int[]) objArr2[0])[0];
            int i151 = ((int[]) obj2)[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) obj)[0]}, new int[]{i151}, (String[]) objArr2[3]};
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            int i152 = ((freeMemory | 484630754) * 104) + ((~((~freeMemory) | 502002159)) * (-104)) + ((((~((-25891150) | freeMemory)) | 8519744) * 104) - 1044148457);
            int component92 = k3.component9();
            int i153 = i152 * (-115);
            int i154 = ~component92;
            int i155 = i154 & i152;
            c14 = 192;
            int i156 = (i154 | i152) & (~i155);
            int i157 = ~i152;
            int i158 = -(-((~(i156 | i155)) * (-116)));
            int i159 = ((~i158) & i153) | ((~i153) & i158);
            int i160 = -(-((i153 & i158) << 1));
            int i161 = (i159 & i160) + (i160 | i159);
            int i162 = -(~(-(-(component92 * 116))));
            int i163 = ((i161 ^ i162) + ((i162 & i161) << 1)) - 1;
            int i164 = ~(((-1) ^ i157) | i157);
            int i165 = i157 & component92;
            int i166 = (i157 | component92) & (~i165);
            int i167 = ~((i166 & i165) | (i166 ^ i165));
            int i168 = i164 & i167;
            int i169 = (i167 | i164) & (~i168);
            int i170 = ((i169 & i168) | (i169 ^ i168)) * 116;
            int i171 = -(-((i163 ^ i170) + ((i170 & i163) << 1)));
            int i172 = i150 & i171;
            int i173 = i172 + ((i171 ^ i150) | i172);
            int i174 = i173 << 13;
            int i175 = i173 & i174;
            int i176 = ((i174 ^ i173) | i175) & (~i175);
            int i177 = i176 >>> 17;
            int i178 = i176 & i177;
            int i179 = ((i176 ^ i177) | i178) & (~i178);
            int i180 = i179 << 5;
            int i181 = i179 & i180;
            ((int[]) objArr18[0])[0] = ((i179 ^ i180) | i181) & (~i181);
            k3.component9();
            k3.component9();
        } else {
            c14 = 192;
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[3];
            if (strArr2 != null) {
                int i182 = delta;
                echo = ((-2) - (((i182 ^ 78) + ((i182 & 78) << 1)) ^ (-1))) % 128;
                int i183 = 0;
                while (i183 < strArr2.length) {
                    int i184 = echo;
                    delta = (((i184 & 92) + (i184 | 92)) - 1) % 128;
                    arrayList.add(strArr2[i183]);
                    int i185 = i183 & 123;
                    int i186 = (((i183 | 123) & (~i185)) - (~(i185 << 1))) - 1;
                    int i187 = i186 & (-122);
                    i183 = (((i186 ^ (-122)) | i187) << 1) - ((i186 | (-122)) & (~i187));
                    int i188 = delta;
                    echo = (((i188 | 1) << 1) - (i188 ^ 1)) % 128;
                }
            }
            int i189 = (~i148) & i147;
            int i190 = (~i147) & i148;
            long j11 = (((i189 & i190) | (i189 ^ i190)) & 4294967295L) ^ (-8011175628466290688L);
            delta = ((-2) - ((echo + 90) ^ (-1))) % 128;
            try {
                Object[] objArr19 = {Long.valueOf(j11), -1865247180L};
                Object[] objArr20 = new Object[1];
                echo(bArr3[48], bArr3[192], (short) 662, objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                echo((byte) (-bArr3[46]), (byte) (-bArr3[491]), (short) i5, objArr21);
                String str2 = (String) objArr21[0];
                Class<?> cls6 = Long.TYPE;
                cls5.getMethod(str2, cls6, cls6).invoke(null, objArr19);
                int i191 = ((int[]) objArr2[0])[0];
                int i192 = ((int[]) objArr2[2])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, new int[]{i192}, (String[]) objArr2[3]};
                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i193 = i191 - (~(-(-(((~(elapsedRealtime | (-544215601))) * 345) + ((((~((-620272191) | (~elapsedRealtime))) | (-653965887)) * 345) + ((((~((-620272191) | elapsedRealtime)) | 544215600) * 345) + 474124504))))));
                int i194 = (i193 ^ (-1)) + (i193 << 1);
                int i195 = i194 << 13;
                int i196 = ((~i194) & i195) | ((~i195) & i194);
                int i197 = i196 >>> 17;
                int i198 = (~i197) & i196;
                int i199 = (~i196) & i197;
                int i200 = (i199 & i198) | (i198 ^ i199);
                int i201 = i200 << 5;
                int i202 = i200 & i201;
                ((int[]) objArr22[0])[0] = ((i200 ^ i201) | i202) & (~i202);
                System.identityHashCode(d22);
                k3.component9();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        Object D88719 = uH18377.D8871(-1032283660);
        if (D88719 == null) {
            int trimmedLength = 51 - TextUtils.getTrimmedLength("");
            int scrollBarSize = 1106 - (ViewConfiguration.getScrollBarSize() >> 8);
            char threadPriority = (char) (24632 - ((Process.getThreadPriority(0) + 20) >> 6));
            byte b12 = (byte) (-bArr2[c3]);
            Object[] objArr23 = new Object[1];
            charlie(b12, (byte) (b12 | 26), bArr2[27], objArr23);
            D88719 = uH18377.setPivotYN16904(trimmedLength, scrollBarSize, threadPriority, 499333921, false, (String) objArr23[0], null);
        }
        long j12 = ((Field) D88719).getLong(null);
        int i203 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        int i204 = i203 & 57557;
        int i205 = (i204 - (~(-(-((i203 ^ 57557) | i204))))) - 1;
        Object[] objArr24 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i205, objArr24);
        Class<?> cls7 = Class.forName((String) objArr24[0]);
        int i206 = -TextUtils.indexOf("", "");
        int i207 = (i206 * HttpConstants.HTTP_SEE_OTHER) - 15094247;
        int i208 = ~i206;
        int i209 = (i208 | i206) & i208;
        int i210 = i209 & i27;
        int i211 = (~i210) & (i209 | i27);
        int i212 = (i211 & i210) | (i211 ^ i210);
        int i213 = i212 & i4;
        int i214 = (i212 | i4) & (~i213);
        int i215 = ~((i214 & i213) | (i214 ^ i213));
        int i216 = (i206 ^ i4) | (i206 & i4);
        int i217 = ((~i216) & intValue) | (i216 & i27);
        int i218 = i216 & intValue;
        int i219 = ~((i217 & i218) | (i217 ^ i218));
        int i220 = -(~(-(-(((i219 & i215) | (i215 ^ i219)) * (-302)))));
        int i221 = (-2) - ((((i207 | i220) << 1) - (i220 ^ i207)) ^ (-1));
        int i222 = i208 ^ i4;
        int i223 = i208 & i4;
        int i224 = (i222 & i223) | (i222 ^ i223);
        int i225 = i224 & intValue;
        int i226 = (i224 | intValue) & (~i225);
        int i227 = ((~((i226 & i225) | (i226 ^ i225))) * (-604)) + i221;
        int i228 = ((-50148) & i206) | ((-50148) ^ i206);
        int i229 = ~i228;
        int i230 = (i228 | i229) & i229;
        int i231 = intValue & i4;
        int i232 = (~i231) & (intValue | i4);
        int i233 = ~((i231 & i232) | (i232 ^ i231));
        int i234 = i230 ^ i233;
        int i235 = i230 & i233;
        int i236 = ((i235 & i234) | (i234 ^ i235)) * HttpConstants.HTTP_MOVED_TEMP;
        int i237 = ((i227 | i236) << 1) - (i236 ^ i227);
        Object[] objArr25 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i237, objArr25);
        long longValue3 = ((Long) cls7.getDeclaredMethod((String) objArr25[0], null).invoke(null, null)).longValue();
        Object D887110 = uH18377.D8871(302164976);
        if (D887110 == null) {
            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 51;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1106;
            char packedPositionGroup = (char) (24632 - ExpandableListView.getPackedPositionGroup(0L));
            j6 = longValue3;
            Object[] objArr26 = new Object[1];
            charlie(bArr2[20], (byte) 0, bArr2[c12], objArr26);
            D887110 = uH18377.setPivotYN16904(pressedStateDuration2, maximumFlingVelocity, packedPositionGroup, -843511515, false, (String) objArr26[0], null);
        } else {
            j6 = longValue3;
        }
        if (j12 == ((j6 - ((((Field) D887110).getLong(null) << 52) >>> 52)) >> c12)) {
            int i238 = echo;
            delta = (((i238 ^ 4) + ((i238 & 4) << 1)) - 1) % 128;
            Object D887111 = uH18377.D8871(-1242515371);
            if (D887111 == null) {
                int resolveSize = 51 - View.resolveSize(0, 0);
                int i239 = 1106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24632);
                byte b13 = (byte) 0;
                Object[] objArr27 = new Object[1];
                charlie(b13, (byte) (b13 | 47), (byte) (-bArr2[c11]), objArr27);
                D887111 = uH18377.setPivotYN16904(resolveSize, i239, doubleTapTimeout, 1783306880, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) D887111).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr28[0])[0]}, new int[]{((int[]) objArr28[1])[0]}, new int[1], (String[]) objArr28[3]};
            int i240 = 166804883 - (~(-(-((((~((~Process.myTid()) | (-52682676))) | 419851205) * 56) + ((((~(r0 | 419851205)) | (-52682676)) * 56) - 721715863)))));
            int i241 = i240 << 13;
            int i242 = i240 & i241;
            int i243 = ((i241 ^ i240) | i242) & (~i242);
            int i244 = i243 >>> 17;
            int i245 = ((~i243) & i244) | ((~i244) & i243);
            int i246 = i245 << 5;
            int i247 = (~i246) & i245;
            int i248 = (~i245) & i246;
            ((int[]) objArr3[2])[0] = (i248 & i247) | (i247 ^ i248);
            echo = (delta + 97) % 128;
            bArr = bArr3;
        } else {
            int i249 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int component93 = k3.component9();
            int i250 = i249 * 465;
            int i251 = i250 & (-3466481);
            int i252 = (i250 ^ (-3466481)) | i251;
            int i253 = ((i251 | i252) << 1) - (i252 ^ i251);
            int i254 = ~component93;
            int i255 = (i254 | component93) & i254;
            int i256 = ~((i255 & (-7488)) | ((-7488) ^ i255));
            int i257 = ~i249;
            int i258 = (-7488) & i249;
            int i259 = ~(((-7488) & i257) | (i249 & 7487) | i258);
            int i260 = ((~i256) & i259) | ((~i259) & i256);
            int i261 = i256 & i259;
            int i262 = (i260 & i261) | (i260 ^ i261);
            int i263 = (i254 & i257) | (i249 & (~i254));
            int i264 = i254 & i249;
            int i265 = ~((i264 & i263) | (i263 ^ i264));
            int i266 = ((~i265) & i262) | ((~i262) & i265);
            int i267 = i262 & i265;
            int i268 = ((i267 & i266) | (i266 ^ i267)) * 464;
            int i269 = ((((~i268) & i253) | ((~i253) & i268)) - (~((i268 & i253) << 1))) - 1;
            int i270 = (i257 | i249) & i257;
            int i271 = (i270 & component93) | (component93 ^ i270);
            int i272 = (i271 & 7487) | ((-7488) & (~i271));
            int i273 = i271 & (-7488);
            int i274 = ((i273 & i272) | (i272 ^ i273)) * (-464);
            int i275 = (i269 ^ i274) + ((i274 & i269) << 1);
            int i276 = (-7488) ^ i249;
            int i277 = (i276 & i258) | (i276 ^ i258);
            int i278 = ~i277;
            int i279 = (i277 | i278) & i278;
            int i280 = ~((i249 & component93) | (i249 ^ component93));
            int i281 = (i275 - (~(-(~(-(-(((i279 & i280) | (i279 ^ i280)) * 464))))))) - 1;
            Object[] objArr29 = new Object[1];
            delta("㮘⚨ǣ氶佪ꦫ铧\uf76e퉠㲾\u1fff穢敌䞩ꋿ贡\ue87f쪿㗣ိ獁嶺룡鬵虰\ue0ba", (i281 ^ (-1)) + (i281 << 1), objArr29);
            Class<?> cls8 = Class.forName((String) objArr29[0]);
            int lastIndexOf2 = TextUtils.lastIndexOf("", '0');
            int identityHashCode = System.identityHashCode(d22);
            int i282 = lastIndexOf2 * (-721);
            int i283 = i282 & (-4785998);
            int i284 = (i282 | (-4785998)) & (~i283);
            int i285 = -(-(i283 << 1));
            int i286 = (i284 & i285) + (i284 | i285);
            int i287 = ~identityHashCode;
            int i288 = ~lastIndexOf2;
            int i289 = (i288 | lastIndexOf2) & i288;
            int i290 = i289 & (-6639);
            bArr = bArr3;
            int i291 = (i289 | (-6639)) & (~i290);
            int i292 = ~((i291 & i290) | (i291 ^ i290));
            int i293 = (i287 & i292) | (i287 ^ i292);
            int i294 = lastIndexOf2 ^ 6638;
            int i295 = lastIndexOf2 & 6638;
            int i296 = (i294 & i295) | (i294 ^ i295);
            int i297 = ~i296;
            int i298 = (i296 | i297) & i297;
            int i299 = -(-(((i293 & i298) | (i293 ^ i298)) * 1444));
            int i300 = ((~i299) & i286) | ((~i286) & i299);
            int i301 = (i299 & i286) << 1;
            int i302 = (i300 & i301) + (i301 | i300);
            int i303 = (~i295) & (lastIndexOf2 | 6638);
            int i304 = ~((i303 & i295) | (i303 ^ i295));
            int i305 = (lastIndexOf2 ^ identityHashCode) | (lastIndexOf2 & identityHashCode);
            int i306 = ~i305;
            int i307 = (i305 | i306) & i306;
            int i308 = (i304 & i307) | (i304 ^ i307);
            int i309 = identityHashCode & 6638;
            int i310 = ~(((identityHashCode | 6638) & (~i309)) | i309);
            int i311 = ((~i310) & i308) | ((~i308) & i310);
            int i312 = i310 & i308;
            int i313 = ((i312 & i311) | (i311 ^ i312)) * (-1444);
            int i314 = (i302 ^ i313) + ((i313 & i302) << 1);
            int i315 = (i288 & (-6639)) | ((~i288) & 6638);
            int i316 = i288 & 6638;
            int i317 = (i315 & i316) | (i315 ^ i316);
            int i318 = ~i317;
            int i319 = (i317 | i318) & i318;
            int i320 = (-6639) & lastIndexOf2;
            int i321 = ((-6639) | lastIndexOf2) & (~i320);
            int i322 = ~((i321 & i320) | (i321 ^ i320));
            int i323 = i319 ^ i322;
            int i324 = i319 & i322;
            int i325 = ((i324 & i323) | (i323 ^ i324)) * 722;
            int i326 = i314 & i325;
            int i327 = i326 + ((i325 ^ i314) | i326);
            Object[] objArr30 = new Object[1];
            delta("㮚≡ࡑ癌尨먶ꀃ軃\uf4e1틜㣗⚿ಆ檑养뽳ꕆ茪", i327, objArr30);
            Context context = (Context) cls8.getMethod((String) objArr30[0], null).invoke(null, null);
            if (context != null) {
                int i328 = echo;
                delta = (i328 + 1) % 128;
                if (context instanceof ContextWrapper) {
                    int i329 = i328 & 71;
                    int i330 = i328 | 71;
                    int i331 = (i329 ^ i330) + ((i330 & i329) << 1);
                    delta = i331 % 128;
                    if (i331 % 2 != 0) {
                        int i332 = 12 / 0;
                    }
                }
                context = context.getApplicationContext();
                System.identityHashCode(d22);
            }
            int i333 = delta;
            int i334 = i333 ^ 7;
            int i335 = ((i333 & 7) | i334) << 1;
            int i336 = -i334;
            echo = ((i335 ^ i336) + ((i335 & i336) << 1)) % 128;
            try {
                Object[] objArr31 = {context, Integer.valueOf(intValue), 0, 166804884};
                Object[] objArr32 = new Object[1];
                echo(bArr[c11], bArr[c14], (short) (hotel | 576), objArr32);
                Class<?> cls9 = Class.forName((String) objArr32[0]);
                Object[] objArr33 = new Object[1];
                echo(bArr[656], bArr[c14], (short) 547, objArr33);
                objArr3 = (Object[]) cls9.getMethod((String) objArr33[0], Context.class, cls, cls, cls).invoke(null, objArr31);
                Object D887112 = uH18377.D8871(-1242515371);
                if (D887112 == null) {
                    int makeMeasureSpec = 51 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int resolveSize2 = View.resolveSize(0, 0) + 1106;
                    char c16 = (char) (24632 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    byte b14 = (byte) 0;
                    Object[] objArr34 = new Object[1];
                    charlie(b14, (byte) (b14 | 47), (byte) (-bArr2[c11]), objArr34);
                    D887112 = uH18377.setPivotYN16904(makeMeasureSpec, resolveSize2, c16, 1783306880, false, (String) objArr34[0], null);
                }
                ((Field) D887112).set(null, objArr3);
                try {
                    int trimmedLength2 = TextUtils.getTrimmedLength("");
                    int i337 = (trimmedLength2 * 221) - 12604983;
                    int i338 = ~trimmedLength2;
                    int i339 = i338 & (-57558);
                    int i340 = ~(i339 | ((~i339) & (i338 | (-57558))));
                    int i341 = (i27 & i338) | ((~i27) & trimmedLength2) | (i27 & trimmedLength2);
                    int i342 = ~((i341 & 57557) | (i341 ^ 57557));
                    int i343 = i340 & i342;
                    int i344 = (i340 | i342) & (~i343);
                    int i345 = -(-(((i344 & i343) | (i344 ^ i343)) * 220));
                    int i346 = (i337 & i345) + (i337 | i345);
                    int i347 = i27 & 57557;
                    int i348 = (~i347) & (i27 | 57557);
                    int i349 = ~((i347 & i348) | (i348 ^ i347));
                    int i350 = ((~i349) & trimmedLength2) | (i349 & i338);
                    int i351 = i349 & trimmedLength2;
                    int i352 = -(-(((i351 & i350) | (i350 ^ i351)) * (-440)));
                    int i353 = (i346 & i352) + (i352 | i346);
                    int i354 = (trimmedLength2 & (-57558)) | (i338 & 57557);
                    int i355 = trimmedLength2 & 57557;
                    int i356 = -(-(((i355 & i354) | (i354 ^ i355) | intValue) * 220));
                    int i357 = ((((~i356) & i353) | ((~i353) & i356)) - (~((i356 & i353) << 1))) - 1;
                    Object[] objArr35 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i357, objArr35);
                    Class<?> cls10 = Class.forName((String) objArr35[0]);
                    int i358 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i359 = i358 * (-300);
                    int i360 = i359 ^ 15144092;
                    int i361 = ((i359 & 15144092) | i360) << 1;
                    int i362 = -i360;
                    int i363 = ((i361 | i362) << 1) - (i361 ^ i362);
                    int i364 = 50146 | i358 | intValue;
                    int i365 = ~i364;
                    int i366 = -(-(((i364 | i365) & i365) * (-301)));
                    int i367 = i363 ^ i366;
                    int i368 = (((i366 & i363) | i367) << 1) - i367;
                    int i369 = ((-50147) & i27) | (50146 & intValue);
                    int i370 = (-50147) & intValue;
                    int i371 = ~((i370 & i369) | (i369 ^ i370));
                    int i372 = i27 & i358;
                    int i373 = (~i372) & (i27 | i358);
                    int i374 = ~i358;
                    int i375 = ~((i372 & i373) | (i373 ^ i372));
                    int i376 = i371 ^ i375;
                    int i377 = i371 & i375;
                    int i378 = -(~(-(-(((i377 & i376) | (i376 ^ i377)) * (-301)))));
                    int i379 = (((i368 | i378) << 1) - (i368 ^ i378)) - 1;
                    int i380 = (i358 | i374) & i374;
                    int i381 = (i380 & intValue) | (i380 & i27) | ((~i380) & intValue);
                    int i382 = ~i381;
                    int i383 = (i381 | i382) & i382;
                    int i384 = ((~i383) & (-50147)) | (50146 & i383);
                    int i385 = i383 & (-50147);
                    int i386 = ((i385 & i384) | (i384 ^ i385)) * 301;
                    int i387 = i379 & i386;
                    int i388 = i387 + ((i386 ^ i379) | i387);
                    Object[] objArr36 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i388, objArr36);
                    long longValue4 = ((Long) cls10.getDeclaredMethod((String) objArr36[0], null).invoke(null, null)).longValue();
                    Long valueOf3 = Long.valueOf(longValue4);
                    Object D887113 = uH18377.D8871(302164976);
                    if (D887113 == null) {
                        int indexOf3 = 50 - TextUtils.indexOf((CharSequence) "", '0');
                        int resolveSize3 = 1106 - View.resolveSize(0, 0);
                        char mirror2 = (char) (AndroidCharacter.getMirror('0') + 24584);
                        Object[] objArr37 = new Object[1];
                        charlie(bArr2[20], (byte) 0, bArr2[c12], objArr37);
                        D887113 = uH18377.setPivotYN16904(indexOf3, resolveSize3, mirror2, -843511515, false, (String) objArr37[0], null);
                    }
                    ((Field) D887113).set(null, valueOf3);
                    Long valueOf4 = Long.valueOf(longValue4 >> c12);
                    Object D887114 = uH18377.D8871(-1032283660);
                    if (D887114 == null) {
                        int resolveSize4 = View.resolveSize(0, 0) + 51;
                        int indexOf4 = 1105 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char myTid3 = (char) ((Process.myTid() >> 22) + 24632);
                        byte b15 = (byte) (-bArr2[c3]);
                        Object[] objArr38 = new Object[1];
                        charlie(b15, (byte) (b15 | 26), bArr2[27], objArr38);
                        D887114 = uH18377.setPivotYN16904(resolveSize4, indexOf4, myTid3, 499333921, false, (String) objArr38[0], null);
                    }
                    ((Field) D887114).set(null, valueOf4);
                    echo = (delta + 115) % 128;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        Object obj3 = objArr3[0];
        int i389 = ((int[]) obj3)[0];
        Object obj4 = objArr3[1];
        if (((int[]) obj4)[0] == i389) {
            delta = (echo + 89) % 128;
            int i390 = ((int[]) objArr3[2])[0];
            int i391 = ((int[]) obj4)[0];
            Object[] objArr39 = {new int[]{((int[]) obj3)[0]}, new int[]{i391}, new int[1], (String[]) objArr3[3]};
            int myTid4 = Process.myTid();
            int i392 = ~((-54681428) | (~myTid4));
            int i393 = (((~(myTid4 | 333611007)) | i392) * 338) + ((278929580 | i392 | (~(54681427 | myTid4))) * (-338)) + 156086057;
            int identityHashCode2 = System.identityHashCode(d22);
            int i394 = -(-(i393 * (-958)));
            int i395 = ~i393;
            int i396 = ~identityHashCode2;
            int i397 = i395 & i396;
            int i398 = (~i397) & (i395 | i396);
            int i399 = ~((i397 & i398) | (i398 ^ i397));
            int i400 = ~((i396 ^ identityHashCode2) | (i396 & identityHashCode2));
            int i401 = ((~i400) & i399) | ((~i399) & i400);
            int i402 = i399 & i400;
            int i403 = (i402 & i401) | (i401 ^ i402);
            int i404 = ~i396;
            int i405 = i404 & (i404 | i396);
            int i406 = (((i403 & i405) | (i403 ^ i405)) * 959) + i394;
            int i407 = -(-(i395 * (-959)));
            int i408 = ((i406 ^ i407) | (i406 & i407)) << 1;
            int i409 = -((i407 & (~i406)) | ((~i407) & i406));
            int i410 = (i408 ^ i409) + ((i409 & i408) << 1);
            int i411 = (i396 | identityHashCode2) & i396;
            int i412 = ~(((-1) ^ i411) | i411);
            int i413 = ~(i395 | identityHashCode2);
            int i414 = (i413 & i412) | ((~i413) & i412) | ((~i412) & i413);
            int i415 = i414 & i411;
            int i416 = (i414 | i411) & (~i415);
            int i417 = ((i416 & i415) | (i416 ^ i415)) * 959;
            int i418 = i410 & i417;
            int i419 = (i417 ^ i410) | i418;
            int i420 = ((i418 | i419) << 1) - (i419 ^ i418);
            int i421 = i390 & i420;
            int i422 = (i390 ^ i420) | i421;
            int i423 = ((i421 | i422) << 1) - (i421 ^ i422);
            int i424 = i423 << 13;
            int i425 = (i424 & (~i423)) | ((~i424) & i423);
            int i426 = i425 >>> 17;
            int i427 = (~i426) & i425;
            int i428 = (~i425) & i426;
            int i429 = (i428 & i427) | (i427 ^ i428);
            int i430 = i429 << 5;
            ((int[]) objArr39[2])[0] = (i429 | i430) & (~(i429 & i430));
            int i431 = delta;
            echo = ((i431 & 75) + (i431 | 75)) % 128;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr3[3];
            if (strArr3 != null) {
                echo = (delta + 43) % 128;
                int i432 = 0;
                while (i432 < strArr3.length) {
                    int i433 = delta;
                    int i434 = i433 & 59;
                    int i435 = (i433 | 59) & (~i434);
                    int i436 = -(-(i434 << 1));
                    int i437 = (i435 ^ i436) + ((i435 & i436) << 1);
                    echo = i437 % 128;
                    if (i437 % 2 == 0) {
                        arrayList2.add(strArr3[i432]);
                        int i438 = i432 ^ 130;
                        int i439 = (i432 & 130) << 1;
                        int i440 = (i438 ^ i439) + ((i439 & i438) << 1);
                        int i441 = i440 ^ (-30);
                        int i442 = ((i440 & (-30)) | i441) << 1;
                        int i443 = -i441;
                        i432 = ((i442 | i443) << 1) - (i443 ^ i442);
                    } else {
                        arrayList2.add(strArr3[i432]);
                        i432++;
                    }
                    delta = (echo + 19) % 128;
                }
            }
            Object[] objArr40 = {Long.valueOf(((((~r4) & i389) | ((~i389) & r4)) & 4294967295L) ^ 5903281983978471424L), 1374464952L};
            Object[] objArr41 = new Object[1];
            echo(bArr[435], bArr[c14], (short) 443, objArr41);
            Class<?> cls11 = Class.forName((String) objArr41[0]);
            Object[] objArr42 = new Object[1];
            echo((byte) (bArr[177] - 1), bArr[5], bArr[7], objArr42);
            String str3 = (String) objArr42[0];
            Class<?> cls12 = Long.TYPE;
            cls11.getMethod(str3, cls12, cls12).invoke(null, objArr40);
            int i444 = ((int[]) objArr3[2])[0];
            int i445 = ((int[]) objArr3[1])[0];
            Object[] objArr43 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{i445}, new int[1], (String[]) objArr3[3]};
            int tango = ao.ad.tango(944317047);
            int i446 = ~tango;
            int i447 = (((~(tango | (-25168202))) | (~(i446 | (-167845923))) | (~((-6308485) | tango))) * 867) + (((~((-174154407) | tango)) | 167845922 | (~((-193014124) | tango))) * (-1734)) + (((~((-174154407) | i446)) | (~((-193014124) | i446))) * (-867)) + 874703268;
            int i448 = ((i447 << 1) - (~(-i447))) - 1;
            int i449 = i444 & i448;
            int i450 = ((((i444 ^ i448) | i449) << 1) - (~(-((i448 | i444) & (~i449))))) - 1;
            int i451 = i450 << 13;
            int i452 = (~i451) & i450;
            int i453 = (~i450) & i451;
            int i454 = (i453 & i452) | (i452 ^ i453);
            int i455 = i454 >>> 17;
            int i456 = (~i455) & i454;
            int i457 = (~i454) & i455;
            int i458 = (i457 & i456) | (i456 ^ i457);
            int i459 = i458 << 5;
            ((int[]) objArr43[2])[0] = (i458 | i459) & (~(i458 & i459));
            int i460 = echo;
            int i461 = (i460 & (-106)) | ((~i460) & 105);
            int i462 = -(-((i460 & 105) << 1));
            delta = ((i461 ^ i462) + ((i462 & i461) << 1)) % 128;
        }
        golf(d22, function1, Integer.valueOf(intValue), null, str, function12, 4);
        int i463 = echo + 71;
        delta = i463 % 128;
        if (i463 % 2 != 0) {
            int i464 = 86 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0cb7, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cc4, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.D2.echo;
        r2 = r0 & 83;
        r0 = (r0 | 83) & (~r2);
        r2 = r2 << 1;
        com.fingerprintjs.android.fpjs_pro_internal.D2.delta = ((r0 ^ r2) + ((r0 & r2) << 1)) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0cc1, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() != null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void papa(Object[] objArr) {
        char c3;
        char c4;
        int i4;
        int i5;
        char c10;
        int i10;
        char c11;
        char c12;
        int i11;
        int i12;
        Object[] echo2;
        int i13;
        char c13;
        char c14;
        int i14;
        int i15;
        char c15;
        Object[] objArr2;
        int i16;
        int i17;
        byte[] bArr = golf;
        D2 d22 = (D2) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        int i18 = delta;
        echo = ao.ad.victor((i18 | 41) << 1, ~(-((41 & (~i18)) | (i18 & (-42)))), 1, 128);
        Object D8871 = uH18377.D8871(-620579543);
        byte[] bArr2 = foxtrot;
        if (D8871 == null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 52;
            int resolveSize = View.resolveSize(0, 0) + 1622;
            c3 = '4';
            char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            i4 = 19;
            byte b2 = (byte) (-bArr2[47]);
            i5 = 97;
            c4 = '/';
            c10 = '\r';
            Object[] objArr3 = new Object[1];
            charlie(b2, (byte) (b2 | 26), (byte) (-1), objArr3);
            D8871 = uH18377.setPivotYN16904(makeMeasureSpec, resolveSize, resolveOpacity, 79239164, false, (String) objArr3[0], null);
        } else {
            c3 = '4';
            c4 = '/';
            i4 = 19;
            i5 = 97;
            c10 = '\r';
        }
        long j5 = ((Field) D8871).getLong(null);
        int i19 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
        int i20 = i19 & 57557;
        int i21 = -(-((i19 ^ 57557) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        Object[] objArr4 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        int i23 = -Color.blue(0);
        int identityHashCode = System.identityHashCode(d22);
        int i24 = i23 * 483;
        int i25 = i24 ^ 12135574;
        int i26 = -(-((i24 & 12135574) << 1));
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = ~i23;
        int i29 = i28 & (-50148);
        int i30 = (~i29) & (i28 | (-50148));
        int i31 = (i30 ^ i29) | (i30 & i29);
        int i32 = ~i31;
        int i33 = i32 & (i31 | i32);
        int i34 = (i28 | i23) & i28;
        int i35 = ~identityHashCode;
        int i36 = ~((i34 ^ i35) | (i34 & i35));
        int i37 = ((i36 & (~i33)) | ((~i36) & i33) | (i33 & i36)) * (-241);
        int i38 = (((i27 ^ i37) | (i27 & i37)) << 1) - ((i37 & (~i27)) | ((~i37) & i27));
        int i39 = i23 & (-50148);
        int i40 = (i28 & 50147) | i39;
        int i41 = i23 & 50147;
        int i42 = -(-(((i40 & i41) | (i40 ^ i41)) * (-482)));
        int i43 = i38 ^ i42;
        int i44 = ((i38 & i42) | i43) << 1;
        int i45 = -i43;
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = i29 | i41;
        int i48 = ~((i39 & i47) | (i47 ^ i39));
        int i49 = ((i35 | identityHashCode) & i35) | i34;
        int i50 = i49 & 50147;
        int i51 = (i49 | 50147) & (~i50);
        int i52 = ~((i51 & i50) | (i51 ^ i50));
        int i53 = ((~i52) & i48) | ((~i48) & i52);
        int i54 = i48 & i52;
        int i55 = -(-(((i54 & i53) | (i53 ^ i54)) * 241));
        int i56 = i46 & i55;
        int i57 = -(-(i55 | i46));
        int i58 = (i56 & i57) + (i57 | i56);
        Object[] objArr5 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i58, objArr5);
        long longValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], null).invoke(null, null)).longValue();
        Object D88712 = uH18377.D8871(-3501628);
        if (D88712 == null) {
            int lastIndexOf = 51 - TextUtils.lastIndexOf("", '0', 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1622;
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b4 = (byte) 0;
            c11 = '\t';
            i10 = 50147;
            Object[] objArr6 = new Object[1];
            charlie(b4, (byte) (b4 | 47), (byte) (-bArr2[9]), objArr6);
            D88712 = uH18377.setPivotYN16904(lastIndexOf, capsMode, maximumFlingVelocity, 544289553, false, (String) objArr6[0], null);
        } else {
            i10 = 50147;
            c11 = '\t';
        }
        if (j5 == ((longValue - ((((Field) D88712).getLong(null) << c3) >>> c3)) >> 12)) {
            int i59 = delta;
            echo = (((i59 | 111) << 1) - (((~i59) & 111) | (i59 & (-112)))) % 128;
            Object D88713 = uH18377.D8871(-881784774);
            if (D88713 == null) {
                int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 53;
                int i60 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1622;
                char indexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                Object[] objArr7 = new Object[1];
                charlie((byte) (-bArr2[c10]), (byte) (bArr2[1] - 1), (byte) (-bArr2[i4]), objArr7);
                D88713 = uH18377.setPivotYN16904(indexOf, i60, indexOf2, 348826351, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) D88713).get(null);
            echo2 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i61 = (int) Runtime.getRuntime().totalMemory();
            int i62 = ~i61;
            int i63 = (((~(i61 | 995900769)) | (-1073643378) | (~(i62 | (-407636258)))) * 369) + (((~((-995900770) | i62)) | (-485378866)) * (-369)) + ((((-77742609) | i62) * (-369)) - 85456914);
            int component9 = k3.component9();
            int i64 = -(-(i63 * HttpConstants.HTTP_CLIENT_TIMEOUT));
            int i65 = ~i63;
            int i66 = (i65 | i63) & i65;
            int i67 = ~i66;
            int i68 = i67 & (i67 | i66);
            int i69 = ~component9;
            int i70 = (i69 | component9) & i69;
            c12 = '\f';
            int i71 = -(-((((~i68) & i70) | ((~i70) & i68) | (i68 & i70)) * (-814)));
            int i72 = i64 & i71;
            int i73 = (i71 | i64) & (~i72);
            int i74 = i72 << 1;
            int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
            int i76 = ~(i66 | i69);
            int i77 = (i65 ^ i63) | (i65 & i63);
            int i78 = ~i77;
            int i79 = (i77 | i78) & i78;
            int i80 = ((~i79) & i76) | ((~i76) & i79);
            int i81 = i76 & i79;
            int i82 = (i81 & i80) | (i80 ^ i81);
            int i83 = ((~i69) & i82) | ((~i82) & i69);
            int i84 = i82 & i69;
            int i85 = -(-(((i84 & i83) | (i83 ^ i84)) * HttpConstants.HTTP_PROXY_AUTH));
            int i86 = ((((i75 ^ i85) | (i75 & i85)) << 1) - (~(-((i85 & (~i75)) | ((~i85) & i75))))) - 1;
            int i87 = ~(((-1) ^ i63) | i63);
            int i88 = ~((i69 ^ component9) | (i69 & component9));
            int i89 = (i87 & i88) | ((~i88) & i87) | ((~i87) & i88);
            int i90 = i63 ^ component9;
            int i91 = i63 & component9;
            int i92 = ~((i91 & i90) | (i90 ^ i91));
            int i93 = -(-(((i89 & i92) | ((~i92) & i89) | ((~i89) & i92)) * HttpConstants.HTTP_PROXY_AUTH));
            int i94 = i86 & i93;
            int i95 = -(-((i93 ^ i86) | i94));
            int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
            int component92 = k3.component9();
            int i97 = i96 * 399;
            int i98 = i97 ^ (-1877943254);
            int i99 = -(-((i97 & (-1877943254)) << 1));
            int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
            int i101 = ~i96;
            int i102 = (i101 & (-630388791)) | ((~i101) & 630388790);
            int i103 = i101 & 630388790;
            int i104 = (i102 & i103) | (i102 ^ i103);
            int i105 = ~i104;
            int i106 = (i104 | i105) & i105;
            int i107 = (-630388791) & i96;
            int i108 = (~i107) & ((-630388791) | i96);
            int i109 = ~((i108 & i107) | (i108 ^ i107));
            int i110 = i106 ^ i109;
            int i111 = i106 & i109;
            int i112 = (i111 & i110) | (i110 ^ i111);
            int i113 = (-630388791) & component92;
            int i114 = (~i113) & ((-630388791) | component92);
            int i115 = (i114 ^ i113) | (i113 & i114);
            int i116 = ~i115;
            int i117 = (i115 | i116) & i116;
            int i118 = i112 & i117;
            int i119 = (~i118) & (i112 | i117);
            int i120 = -(-(((i119 & i118) | (i119 ^ i118)) * 398));
            int i121 = i100 & i120;
            int i122 = -(-(i100 | i120));
            int i123 = (i121 & i122) + (i122 | i121);
            int i124 = i96 & 630388790;
            int i125 = (i124 | ((~i124) & (i96 | 630388790))) * (-1194);
            int i126 = ((i123 | i125) << 1) - (i125 ^ i123);
            int i127 = ~component92;
            int i128 = ~(((-630388791) & i127) | ((-630388791) ^ i127));
            int i129 = i101 & (i101 | i96);
            int i130 = i129 ^ 630388790;
            int i131 = i129 & 630388790;
            int i132 = ~((i131 & i130) | (i130 ^ i131));
            int i133 = i128 & i132;
            int i134 = (i128 | i132) & (~i133);
            int i135 = (i134 & i133) | (i134 ^ i133);
            int i136 = (-630388791) ^ i96;
            int i137 = ~((i136 & i107) | (i136 ^ i107));
            int i138 = ((i135 & i137) | (i135 ^ i137)) * 398;
            int i139 = i126 & i138;
            int i140 = ((i126 ^ i138) | i139) << 1;
            int i141 = -((i138 | i126) & (~i139));
            int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
            int i143 = i142 << 13;
            int i144 = i142 & i143;
            int i145 = ((i143 ^ i142) | i144) & (~i144);
            int i146 = i145 >>> 17;
            int i147 = (~i146) & i145;
            int i148 = (~i145) & i146;
            int i149 = (i148 & i147) | (i147 ^ i148);
            int i150 = i149 << 5;
            int i151 = (~i150) & i149;
            int i152 = (~i149) & i150;
            ((int[]) echo2[0])[0] = (i152 & i151) | (i151 ^ i152);
            int i153 = delta | 109;
            echo = (((i153 << 1) - (~(-((~(r0 & 109)) & i153)))) - 1) % 128;
            c13 = 1;
        } else {
            c12 = '\f';
            if (str != null) {
                int i154 = delta;
                int i155 = i154 & 97;
                echo = (i155 + ((i154 ^ 97) | i155)) % 128;
                i12 = str.length();
                int i156 = delta;
                int i157 = i156 ^ 59;
                i11 = 1;
                int i158 = ((i156 & 59) | i157) << 1;
                int i159 = -i157;
                echo = (((i158 | i159) << 1) - (i158 ^ i159)) % 128;
            } else {
                i11 = 1;
                int i160 = delta;
                echo = ((i160 ^ 95) + ((i160 & 95) << 1)) % 128;
                i12 = 0;
            }
            try {
                Object[] objArr9 = new Object[i11];
                objArr9[0] = -1996193907;
                Object D88714 = uH18377.D8871(187486525);
                if (D88714 == null) {
                    D88714 = uH18377.setPivotYN16904(Color.rgb(0, 0, 0) + 16777267, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1571, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27578), -728271896, false, null, new Class[]{Integer.TYPE});
                }
                echo2 = AbstractC1287z2.echo(i12, ((Constructor) D88714).newInstance(objArr9));
                Object D88715 = uH18377.D8871(-881784774);
                if (D88715 == null) {
                    int i161 = 52 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i162 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1622;
                    char resolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    Object[] objArr10 = new Object[1];
                    charlie((byte) (-bArr2[c10]), (byte) (bArr2[1] - 1), (byte) (-bArr2[i4]), objArr10);
                    i13 = 0;
                    D88715 = uH18377.setPivotYN16904(i161, i162, resolveOpacity2, 348826351, false, (String) objArr10[0], null);
                } else {
                    i13 = 0;
                }
                ((Field) D88715).set(null, echo2);
                try {
                    int i163 = -Color.red(i13);
                    int i164 = ((i163 | 57557) << 1) - (i163 ^ 57557);
                    Object[] objArr11 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i164, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    int i165 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i166 = i165 & 50146;
                    int i167 = -(-((i165 ^ 50146) | i166));
                    int i168 = ((i166 | i167) << 1) - (i167 ^ i166);
                    Object[] objArr12 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i168, objArr12);
                    long longValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], null).invoke(null, null)).longValue();
                    Long valueOf = Long.valueOf(longValue2);
                    Object D88716 = uH18377.D8871(-3501628);
                    if (D88716 == null) {
                        int alpha = 52 - Color.alpha(0);
                        int resolveOpacity3 = 1622 - Drawable.resolveOpacity(0, 0);
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = (byte) 0;
                        Object[] objArr13 = new Object[1];
                        charlie(b6, (byte) (b6 | 47), (byte) (-bArr2[c11]), objArr13);
                        D88716 = uH18377.setPivotYN16904(alpha, resolveOpacity3, longPressTimeout, 544289553, false, (String) objArr13[0], null);
                    }
                    ((Field) D88716).set(null, valueOf);
                    Long valueOf2 = Long.valueOf(longValue2 >> 12);
                    Object D88717 = uH18377.D8871(-620579543);
                    if (D88717 == null) {
                        int i169 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1622;
                        char argb = (char) Color.argb(0, 0, 0, 0);
                        byte b10 = (byte) (-bArr2[c4]);
                        Object[] objArr14 = new Object[1];
                        charlie(b10, (byte) (b10 | 26), (byte) (-1), objArr14);
                        D88717 = uH18377.setPivotYN16904(i169, maximumDrawingCacheSize, argb, 79239164, false, (String) objArr14[0], null);
                    }
                    ((Field) D88717).set(null, valueOf2);
                    int i170 = delta;
                    int i171 = i170 & 125;
                    c13 = 1;
                    echo = (((i170 | 125) & (~i171)) + (i171 << 1)) % 128;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object obj = echo2[c13];
        int i172 = ((int[]) obj)[0];
        Object obj2 = echo2[2];
        int i173 = ((int[]) obj2)[0];
        if (i173 == i172) {
            int i174 = echo;
            int i175 = (i174 & (-20)) | (i4 & (~i174));
            int i176 = -(-((i174 & 19) << 1));
            delta = ((i175 ^ i176) + ((i176 & i175) << 1)) % 128;
            int i177 = ((int[]) echo2[0])[0];
            int i178 = ((int[]) obj2)[0];
            Object[] objArr15 = {new int[1], new int[]{((int[]) obj)[0]}, new int[]{i178}, (String[]) echo2[3]};
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            int i179 = (((~((~uptimeMillis) | 62558829)) | (-599430910)) * (-964)) + (((~(62558829 | uptimeMillis)) | (-573080734)) * (-964)) + 1934305535;
            int identityHashCode2 = System.identityHashCode(d22);
            int i180 = i179 * (-167);
            int i181 = (i180 << 1) - i180;
            int i182 = ~i179;
            int i183 = (-1) ^ i182;
            int i184 = (i183 & i182) | (i183 ^ i182);
            int i185 = ~i184;
            int i186 = (i184 | i185) & i185;
            int i187 = ~identityHashCode2;
            int i188 = i182 ^ i187;
            int i189 = i182 & i187;
            int i190 = (i188 ^ i189) | (i188 & i189);
            int i191 = ~i190;
            int i192 = (i190 | i191) & i191;
            int i193 = (i181 - (~(-(-(((i186 & i192) | (i186 ^ i192)) * 168))))) - 1;
            int i194 = (i182 | i179) & i182;
            int i195 = ~i194;
            int i196 = (i194 & i195) | (i195 ^ i194);
            int i197 = (i196 & i187) | ((~i196) & identityHashCode2);
            int i198 = i196 & identityHashCode2;
            int i199 = -(~(-(-((~((i198 & i197) | (i197 ^ i198))) * 168))));
            int i200 = (-2) - (((i193 ^ i199) + ((i193 & i199) << 1)) ^ (-1));
            int i201 = (-1) ^ i187;
            int i202 = ~((i201 & i187) | (i201 ^ i187));
            int i203 = ~((i179 & i182) | (i182 ^ i179));
            int i204 = i202 & i203;
            int i205 = (i203 | i202) & (~i204);
            int i206 = (i205 & i204) | (i205 ^ i204);
            int i207 = ~((identityHashCode2 & i182) | (i182 ^ identityHashCode2));
            int i208 = i206 ^ i207;
            int i209 = i206 & i207;
            int i210 = -(-(((i209 & i208) | (i208 ^ i209)) * 168));
            int i211 = i200 & i210;
            int i212 = i211 + ((i210 ^ i200) | i211);
            int component93 = k3.component9();
            int i213 = i212 * 69;
            int i214 = -(-(i177 * (-67)));
            int i215 = (i213 & i214) + (i213 | i214);
            int i216 = ~i212;
            int i217 = ~i177;
            int i218 = (i216 ^ i217) | (i216 & i217);
            int i219 = ~component93;
            int i220 = (i219 | component93) & i219;
            int i221 = i218 ^ i220;
            int i222 = i218 & i220;
            int i223 = ~((i221 ^ i222) | (i221 & i222));
            c14 = 192;
            int i224 = i212 & i177;
            int i225 = ((~i224) & (i212 | i177)) | i224;
            int i226 = ~i225;
            int i227 = (i225 | i226) & i226;
            int i228 = ((~i227) & i223) | ((~i223) & i227);
            int i229 = i227 & i223;
            int i230 = (i229 & i228) | (i228 ^ i229);
            int i231 = (i177 & i219) | (component93 & i217);
            int i232 = component93 & i177;
            int i233 = ~((i232 & i231) | (i231 ^ i232));
            int i234 = -(-(((i230 & i233) | (i230 ^ i233)) * (-68)));
            int i235 = ((i215 ^ i234) | (i215 & i234)) << 1;
            int i236 = -((i234 & (~i215)) | ((~i234) & i215));
            int i237 = ((i235 | i236) << 1) - (i236 ^ i235);
            int i238 = (i216 ^ i220) | (i216 & i220);
            int i239 = -(-((~((i238 & i177) | (i238 & i217) | ((~i238) & i177))) * (-68)));
            int i240 = (i237 ^ i239) + ((i239 & i237) << 1);
            int i241 = (i217 | i177) & i217;
            int i242 = i241 ^ i220;
            int i243 = i241 & i220;
            int i244 = ~((i243 & i242) | (i242 ^ i243));
            int i245 = ((~i244) & i216) | ((~i216) & i244);
            int i246 = i244 & i216;
            int i247 = ((i246 & i245) | (i245 ^ i246)) * 68;
            int i248 = ((i240 | i247) << 1) - (i247 ^ i240);
            int i249 = i248 << 13;
            int i250 = i248 & i249;
            int i251 = ((i249 ^ i248) | i250) & (~i250);
            int i252 = i251 >>> 17;
            int i253 = i251 & i252;
            int i254 = ((i251 ^ i252) | i253) & (~i253);
            int i255 = i254 << 5;
            ((int[]) objArr15[0])[0] = ((~i254) & i255) | ((~i255) & i254);
            int i256 = delta;
            int i257 = i256 & 95;
            int i258 = (i256 ^ 95) | i257;
            echo = ((i257 & i258) + (i258 | i257)) % 128;
        } else {
            c14 = 192;
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) echo2[3];
            if (strArr != null) {
                int i259 = delta;
                int i260 = i259 & 31;
                int i261 = 1;
                echo = ao.ad.victor(i260, ~((i259 ^ 31) | i260), 1, 128);
                int i262 = 0;
                while (i262 < strArr.length) {
                    int i263 = echo;
                    int i264 = ((i263 | 113) << i261) - (i263 ^ 113);
                    delta = i264 % 128;
                    if (i264 % 2 != 0) {
                        arrayList.add(strArr[i262]);
                        int i265 = (i262 & (-40)) + (i262 | (-40));
                        i262 = (i265 ^ 63) + ((i265 & 63) << 1);
                    } else {
                        arrayList.add(strArr[i262]);
                        int i266 = i262 & (-92);
                        int i267 = (i262 ^ (-92)) | i266;
                        int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
                        int i269 = i268 ^ 93;
                        i262 = (((i268 & 93) | i269) << 1) - i269;
                    }
                    echo = (delta + 33) % 128;
                    i261 = 1;
                }
            }
            int i270 = (~i173) & i172;
            int i271 = (~i172) & i173;
            long j6 = (((i270 & i271) | (i270 ^ i271)) & 4294967295L) ^ 2459948527443247104L;
            int i272 = echo;
            int i273 = i272 ^ 39;
            int i274 = ((i272 & 39) | i273) << 1;
            int i275 = -i273;
            delta = (((i274 | i275) << 1) - (i274 ^ i275)) % 128;
            try {
                Object[] objArr16 = {Long.valueOf(j6), 572751397L};
                Object[] objArr17 = new Object[1];
                echo(bArr[34], bArr[192], (short) 492, objArr17);
                Class<?> cls3 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                echo(bArr[656], bArr[192], (short) 547, objArr18);
                String str2 = (String) objArr18[0];
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod(str2, cls4, cls4).invoke(null, objArr16);
                int i276 = ((int[]) echo2[0])[0];
                int i277 = ((int[]) echo2[2])[0];
                Object[] objArr19 = {new int[1], new int[]{((int[]) echo2[1])[0]}, new int[]{i277}, (String[]) echo2[3]};
                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i278 = (((~(elapsedRealtime | 81499915)) | (~((~elapsedRealtime) | 592021819))) * 979) + ((elapsedRealtime | 592021819) * (-979)) + (((~(81499915 | r2)) * 979) - 1536663116);
                int i279 = ((i276 ^ i278) | (i276 & i278)) << 1;
                int i280 = -((i278 & (~i276)) | ((~i278) & i276));
                int i281 = (i279 & i280) + (i280 | i279);
                int i282 = i281 << 13;
                int i283 = i281 & i282;
                int i284 = ((i282 ^ i281) | i283) & (~i283);
                int i285 = i284 >>> 17;
                int i286 = ((~i284) & i285) | ((~i285) & i284);
                int i287 = i286 << 5;
                ((int[]) objArr19[0])[0] = (i286 | i287) & (~(i286 & i287));
                int i288 = delta;
                echo = ((i288 & 83) + (i288 | 83)) % 128;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object D88718 = uH18377.D8871(-1032283660);
        if (D88718 == null) {
            int green = Color.green(0) + 51;
            int modifierMetaStateMask = 1105 - ((byte) KeyEvent.getModifierMetaStateMask());
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24632);
            byte b11 = (byte) (-bArr2[c4]);
            Object[] objArr20 = new Object[1];
            charlie(b11, (byte) (b11 | 26), bArr2[27], objArr20);
            i14 = 0;
            D88718 = uH18377.setPivotYN16904(green, modifierMetaStateMask, scrollBarFadeDuration, 499333921, false, (String) objArr20[0], null);
        } else {
            i14 = 0;
        }
        long j7 = ((Field) D88718).getLong(null);
        int i289 = -TextUtils.lastIndexOf("", '0', i14);
        int i290 = i289 & 57556;
        int i291 = (i290 - (~((i289 ^ 57556) | i290))) - 1;
        Object[] objArr21 = new Object[1];
        delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i291, objArr21);
        Class<?> cls5 = Class.forName((String) objArr21[i14]);
        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
        int component94 = k3.component9();
        int i292 = scrollDefaultDelay * 1773;
        int i293 = (i292 ^ (-44380095)) + ((i292 & (-44380095)) << 1);
        int i294 = ~scrollDefaultDelay;
        int i295 = i294 & (-50148);
        int i296 = (i294 | (-50148)) & (~i295);
        int i297 = ~((i296 & i295) | (i296 ^ i295));
        int i298 = (-50148) & component94;
        int i299 = i298 | ((~i298) & ((-50148) | component94));
        int i300 = ~i299;
        int i301 = (i299 | i300) & i300;
        int i302 = i297 ^ i301;
        int i303 = i297 & i301;
        int i304 = (i303 & i302) | (i302 ^ i303);
        int i305 = ~component94;
        int i306 = i305 & scrollDefaultDelay;
        int i307 = (i305 ^ scrollDefaultDelay) | i306;
        int i308 = (i307 & (-50148)) | ((~i307) & i10);
        int i309 = i307 & i10;
        int i310 = (i309 & i308) | (i308 ^ i309);
        int i311 = ~i310;
        int i312 = (i310 | i311) & i311;
        int i313 = i304 ^ i312;
        int i314 = i304 & i312;
        int i315 = (((i314 & i313) | (i313 ^ i314)) * 886) + i293;
        int i316 = i305 & i10;
        int i317 = ~(i316 | ((~i316) & (i305 | i10)));
        int i318 = -(-(((i317 & scrollDefaultDelay) | (scrollDefaultDelay ^ i317)) * (-1772)));
        int i319 = (i315 & i318) + (i315 | i318);
        int i320 = (scrollDefaultDelay | i305) & (~i306);
        int i321 = (i320 & i306) | (i320 ^ i306);
        int i322 = ~i321;
        int i323 = ((i321 | i322) & i322) * 886;
        int i324 = ((i319 ^ i323) - (~((i323 & i319) << 1))) - 1;
        Object[] objArr22 = new Object[1];
        delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i324, objArr22);
        long longValue3 = ((Long) cls5.getDeclaredMethod((String) objArr22[0], null).invoke(null, null)).longValue();
        Object D88719 = uH18377.D8871(302164976);
        if (D88719 == null) {
            int green2 = Color.green(0) + 51;
            int resolveSize2 = 1106 - View.resolveSize(0, 0);
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 24632);
            Object[] objArr23 = new Object[1];
            charlie(bArr2[20], (byte) 0, bArr2[c12], objArr23);
            D88719 = uH18377.setPivotYN16904(green2, resolveSize2, deadChar, -843511515, false, (String) objArr23[0], null);
        }
        if (j7 == ((longValue3 - ((((Field) D88719).getLong(null) << c3) >>> c3)) >> c12)) {
            System.identityHashCode(d22);
            System.identityHashCode(d22);
            Object D887110 = uH18377.D8871(-1242515371);
            if (D887110 == null) {
                int rgb = Color.rgb(0, 0, 0) + 16777267;
                int argb2 = 1106 - Color.argb(0, 0, 0, 0);
                char c16 = (char) (24633 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                byte b12 = (byte) 0;
                Object[] objArr24 = new Object[1];
                charlie(b12, (byte) (b12 | 47), (byte) (-bArr2[c11]), objArr24);
                D887110 = uH18377.setPivotYN16904(rgb, argb2, c16, 1783306880, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) D887110).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr25[0])[0]}, new int[]{((int[]) objArr25[1])[0]}, new int[1], (String[]) objArr25[3]};
            int foxtrot2 = A0.z.foxtrot(~(Process.myUid() | (-270541706)), -1504, (((~((-841037742) | r0)) | 570496036) * 1504) - 865658335, -2094719376);
            int identityHashCode3 = System.identityHashCode(d22);
            int i325 = foxtrot2 * 832;
            int i326 = (i325 << 1) - i325;
            int i327 = ~foxtrot2;
            int i328 = (i327 | foxtrot2) & i327;
            int i329 = ~identityHashCode3;
            int i330 = (i328 & i329) | (i328 ^ i329);
            int i331 = ~i330;
            int i332 = (i330 | i331) & i331;
            int i333 = (foxtrot2 & identityHashCode3) | (foxtrot2 ^ identityHashCode3);
            int i334 = ~i333;
            int i335 = (i333 | i334) & i334;
            int i336 = ((~i335) & i332) | ((~i332) & i335);
            int i337 = i335 & i332;
            int i338 = ((i337 & i336) | (i336 ^ i337)) * (-831);
            int i339 = i326 & i338;
            int i340 = -(-(i338 | i326));
            int i341 = ((i339 | i340) << 1) - (i340 ^ i339);
            int i342 = -(-((~((i327 & i329) | ((~i327) & identityHashCode3) | (identityHashCode3 & i327))) * (-1662)));
            int i343 = i341 & i342;
            int i344 = (i342 ^ i341) | i343;
            int i345 = ((i343 | i344) << 1) - (i344 ^ i343);
            int i346 = (~(((-1) ^ i329) | i329)) | i329;
            int i347 = -(~(((i346 & i334) | (i346 ^ i334)) * 831));
            int i348 = (-955785836) - (~(-(-(((i345 ^ i347) + ((i347 & i345) << 1)) - 1))));
            int i349 = i348 << 13;
            int i350 = (i349 & (~i348)) | ((~i349) & i348);
            int i351 = i350 >>> 17;
            int i352 = ((~i350) & i351) | ((~i351) & i350);
            int i353 = i352 << 5;
            int i354 = i352 & i353;
            ((int[]) objArr2[2])[0] = ((i352 ^ i353) | i354) & (~i354);
            k3.component9();
            k3.component9();
            c15 = 0;
        } else {
            int i355 = -Drawable.resolveOpacity(0, 0);
            int identityHashCode4 = System.identityHashCode(d22);
            int i356 = -(-(i355 * (-963)));
            int i357 = i356 ^ (-964);
            int i358 = ((((i356 & (-964)) | i357) << 1) - (~(-i357))) - 1;
            int i359 = ((((-7224956) & i358) | ((~i358) & 7224955)) - (~((i358 & 7224955) << 1))) - 1;
            int i360 = ~i355;
            int i361 = ~identityHashCode4;
            int i362 = (-7488) & i361;
            int i363 = (identityHashCode4 & 7487) | i362;
            int i364 = identityHashCode4 & (-7488);
            int i365 = ~((i364 & i363) | (i363 ^ i364));
            int i366 = -(-(((i365 & i360) | (i360 ^ i365)) * (-964)));
            int i367 = i359 ^ i366;
            int i368 = (((i366 & i359) | i367) << 1) - i367;
            int i369 = ~(((~i361) & (-7488)) | (i361 & 7487) | i362);
            int i370 = (i360 & (-7488)) | (i355 & 7487);
            int i371 = i355 & (-7488);
            int i372 = (i371 & i370) | (i370 ^ i371);
            int i373 = ~i372;
            int i374 = (i372 | i373) & i373;
            int i375 = i369 & i374;
            int i376 = (i374 | i369) & (~i375);
            int i377 = -(~(((i376 & i375) | (i376 ^ i375)) * (-964)));
            int i378 = (((i368 | i377) << 1) - (i377 ^ i368)) - 1;
            Object[] objArr26 = new Object[1];
            delta("㮘⚨ǣ氶佪ꦫ铧\uf76e퉠㲾\u1fff穢敌䞩ꋿ贡\ue87f쪿㗣ိ獁嶺룡鬵虰\ue0ba", i378, objArr26);
            Class<?> cls6 = Class.forName((String) objArr26[0]);
            int i379 = -TextUtils.indexOf((CharSequence) "", '0', 0);
            int i380 = i379 ^ 6636;
            int i381 = ((((i379 & 6636) | i380) << 1) - (~(-i380))) - 1;
            Object[] objArr27 = new Object[1];
            delta("㮚≡ࡑ癌尨먶ꀃ軃\uf4e1틜㣗⚿ಆ檑养뽳ꕆ茪", i381, objArr27);
            Context context = (Context) cls6.getMethod((String) objArr27[0], null).invoke(null, null);
            if (context != null) {
                int i382 = delta;
                echo = ((((i382 ^ 57) | (i382 & 57)) << 1) - ((i382 & (-58)) | ((~i382) & 57))) % 128;
                if (context instanceof ContextWrapper) {
                    int i383 = i382 | 113;
                    int i384 = ((i383 << 1) - (~(-((~(i382 & 113)) & i383)))) - 1;
                    echo = i384 % 128;
                    if (i384 % 2 == 0) {
                        int i385 = 53 / 0;
                    }
                }
                context = context.getApplicationContext();
                int i386 = echo;
                int i387 = ((i386 | 88) << 1) - (i386 ^ 88);
                delta = ((i387 ^ (-1)) + (i387 << 1)) % 128;
            }
            if (str != null) {
                int i388 = delta;
                int i389 = (i388 ^ 16) + ((i388 & 16) << 1);
                echo = ((i389 ^ (-1)) + (i389 << 1)) % 128;
                i15 = str.length();
                delta = ((-2) - ((echo + 56) ^ (-1))) % 128;
            } else {
                int i390 = echo;
                int i391 = i390 & 87;
                delta = (((i390 | 87) & (~i391)) + (i391 << 1)) % 128;
                i15 = 0;
            }
            int i392 = delta;
            int i393 = ((-2) - ((((i392 | 42) << 1) - (i392 ^ 42)) ^ (-1))) % 128;
            echo = i393;
            int i394 = (i393 | 21) << 1;
            int i395 = -(i393 ^ 21);
            delta = (((i394 | i395) << 1) - (i395 ^ i394)) % 128;
            try {
                Object[] objArr28 = {context, Integer.valueOf(i15), 0, -955785835};
                Object[] objArr29 = new Object[1];
                echo((byte) (-bArr[334]), bArr[c14], (short) 785, objArr29);
                Class<?> cls7 = Class.forName((String) objArr29[0]);
                byte b13 = (byte) (-bArr[99]);
                Object[] objArr30 = new Object[1];
                echo(b13, (byte) (b13 & 242), (short) 275, objArr30);
                String str3 = (String) objArr30[0];
                Class<?> cls8 = Integer.TYPE;
                Object[] objArr31 = (Object[]) cls7.getMethod(str3, Context.class, cls8, cls8, cls8).invoke(null, objArr28);
                Object D887111 = uH18377.D8871(-1242515371);
                if (D887111 == null) {
                    int argb3 = Color.argb(0, 0, 0, 0) + 51;
                    int myPid = (Process.myPid() >> 22) + 1106;
                    char mode = (char) (View.MeasureSpec.getMode(0) + 24632);
                    byte b14 = (byte) 0;
                    Object[] objArr32 = new Object[1];
                    charlie(b14, (byte) (b14 | 47), (byte) (-bArr2[c11]), objArr32);
                    D887111 = uH18377.setPivotYN16904(argb3, myPid, mode, 1783306880, false, (String) objArr32[0], null);
                }
                ((Field) D887111).set(null, objArr31);
                try {
                    int i396 = -ImageFormat.getBitsPerPixel(0);
                    int component95 = k3.component9();
                    int i397 = i396 * 881;
                    int i398 = i397 | 50706836;
                    int i399 = (i398 << 1) - ((~(i397 & 50706836)) & i398);
                    int i400 = ~i396;
                    int i401 = (i400 | i396) & i400;
                    int i402 = ~i401;
                    int i403 = (i401 & 57556) | ((-57557) & i402);
                    int i404 = i401 & (-57557);
                    int i405 = ~((i403 & i404) | (i403 ^ i404));
                    int i406 = ~component95;
                    int i407 = i401 & i406;
                    int i408 = (i402 & component95) | i407;
                    int i409 = i401 & component95;
                    int i410 = (i408 ^ i409) | (i408 & i409);
                    int i411 = ~i410;
                    int i412 = (i410 | i411) & i411;
                    int i413 = i405 & i412;
                    int i414 = (~i413) & (i405 | i412);
                    int i415 = (i414 & i413) | (i414 ^ i413);
                    int i416 = ((-57557) ^ component95) | ((-57557) & component95);
                    int i417 = ~i416;
                    int i418 = (i416 | i417) & i417;
                    int i419 = i415 & i418;
                    int i420 = -(-((((i415 | i418) & (~i419)) | i419) * (-880)));
                    int i421 = ((~i420) & i399) | ((~i399) & i420);
                    int i422 = -(-((i420 & i399) << 1));
                    int i423 = (i421 & i422) + (i422 | i421);
                    int i424 = i401 ^ i406;
                    int i425 = ~((i424 & i407) | (i424 ^ i407));
                    int i426 = (i425 & 57556) | (i425 ^ 57556);
                    int i427 = i396 & component95;
                    int i428 = ~((i396 ^ component95) | i427);
                    int i429 = i426 & i428;
                    int i430 = (i426 | i428) & (~i429);
                    int i431 = ((i430 & i429) | (i430 ^ i429)) * (-880);
                    int i432 = ((((i423 ^ i431) | (i423 & i431)) << 1) - (~(-((i431 & (~i423)) | ((~i431) & i423))))) - 1;
                    int i433 = -(-((~((i396 & i406) | (component95 & i400) | i427)) * 880));
                    int i434 = i432 & i433;
                    int i435 = -(-(i433 | i432));
                    int i436 = (i434 ^ i435) + ((i435 & i434) << 1);
                    Object[] objArr33 = new Object[1];
                    delta("㮘\udb42嘆駴룂徹罣Ḅ㴾\udcf7\uf385銍뉼兛瀫៧㛄햟\uf56f鑙ꬾ䫫", i436, objArr33);
                    Class<?> cls9 = Class.forName((String) objArr33[0]);
                    int i437 = -View.resolveSizeAndState(0, 0, 0);
                    int identityHashCode5 = System.identityHashCode(d22);
                    int i438 = i437 * (-433);
                    int i439 = (i438 & (-10831752)) + (i438 | (-10831752));
                    int i440 = ~i437;
                    int i441 = ~identityHashCode5;
                    int i442 = i440 & i441;
                    int i443 = (~i442) & (i440 | i441);
                    int i444 = (i442 & i443) | (i443 ^ i442);
                    int i445 = ~i444;
                    int i446 = (i444 | i445) & i445;
                    int i447 = ~(((-50148) ^ identityHashCode5) | ((-50148) & identityHashCode5));
                    int i448 = i446 & i447;
                    int i449 = (((i446 | i447) & (~i448)) | i448) * 217;
                    int i450 = ((i439 ^ i449) - (~((i439 & i449) << 1))) - 1;
                    int i451 = i440 ^ (-50148);
                    int i452 = i440 & (-50148);
                    int i453 = (i451 & i452) | (i451 ^ i452);
                    int i454 = ~i453;
                    int i455 = (i453 | i454) & i454;
                    int i456 = i440 ^ identityHashCode5;
                    int i457 = i440 & identityHashCode5;
                    int i458 = ~((i457 & i456) | (i456 ^ i457));
                    int i459 = i455 & i458;
                    int i460 = (i458 | i455) & (~i459);
                    int i461 = -(-(((i460 & i459) | (i460 ^ i459)) * 217));
                    int i462 = ((i450 ^ i461) | (i450 & i461)) << 1;
                    int i463 = -((i461 & (~i450)) | ((~i461) & i450));
                    int i464 = ((i462 | i463) << 1) - (i463 ^ i462);
                    int i465 = (identityHashCode5 | i441) & i441;
                    int i466 = ((-50148) & (~i465)) | (i465 & i10);
                    int i467 = (-50148) & i465;
                    int i468 = ~((i467 & i466) | (i466 ^ i467));
                    int i469 = i437 ^ i468;
                    int i470 = i437 & i468;
                    int i471 = -(-(((i470 & i469) | (i469 ^ i470)) * 217));
                    int i472 = (i464 & i471) + (i471 | i464);
                    Object[] objArr34 = new Object[1];
                    delta("㮜\uf876뱞瀠㐆\ue8f3곏悞⒄\ud963鵋兌ᔴ줓跶", i472, objArr34);
                    long longValue4 = ((Long) cls9.getDeclaredMethod((String) objArr34[0], null).invoke(null, null)).longValue();
                    Long valueOf3 = Long.valueOf(longValue4);
                    Object D887112 = uH18377.D8871(302164976);
                    if (D887112 == null) {
                        int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 51;
                        int myPid2 = (Process.myPid() >> 22) + 1106;
                        char capsMode2 = (char) (24632 - TextUtils.getCapsMode("", 0, 0));
                        Object[] objArr35 = new Object[1];
                        charlie(bArr2[20], (byte) 0, bArr2[c12], objArr35);
                        D887112 = uH18377.setPivotYN16904(combineMeasuredStates, myPid2, capsMode2, -843511515, false, (String) objArr35[0], null);
                    }
                    ((Field) D887112).set(null, valueOf3);
                    Long valueOf4 = Long.valueOf(longValue4 >> c12);
                    Object D887113 = uH18377.D8871(-1032283660);
                    if (D887113 == null) {
                        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 51;
                        int touchSlop = 1106 - (ViewConfiguration.getTouchSlop() >> 8);
                        char size = (char) (View.MeasureSpec.getSize(0) + 24632);
                        byte b15 = (byte) (-bArr2[c4]);
                        Object[] objArr36 = new Object[1];
                        charlie(b15, (byte) (b15 | 26), bArr2[27], objArr36);
                        c15 = 0;
                        D887113 = uH18377.setPivotYN16904(combineMeasuredStates2, touchSlop, size, 499333921, false, (String) objArr36[0], null);
                    } else {
                        c15 = 0;
                    }
                    ((Field) D887113).set(null, valueOf4);
                    objArr2 = objArr31;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        Object obj3 = objArr2[c15];
        int i473 = ((int[]) obj3)[c15];
        Object obj4 = objArr2[1];
        if (((int[]) obj4)[c15] == i473) {
            int i474 = delta;
            echo = (((i474 | 43) << 1) - (i474 ^ 43)) % 128;
            int i475 = ((int[]) objArr2[2])[0];
            int i476 = ((int[]) obj4)[0];
            Object[] objArr37 = {new int[]{((int[]) obj3)[0]}, new int[]{i476}, new int[1], (String[]) objArr2[3]};
            int myUid = Process.myUid();
            int i477 = (((~(myUid | (-210285938))) | 577454467) * 519) + (((~((~myUid) | (-524546))) | (~((-209761393) | myUid))) * (-519)) + ((((~((-577454468) | r2)) | (-210285938)) * 519) - 1214736998);
            int identityHashCode6 = System.identityHashCode(d22);
            int i478 = i477 * (-590);
            int i479 = ~i477;
            int i480 = (~((i479 ^ i477) | (i479 & i477))) * (-1182);
            int i481 = i478 & i480;
            int i482 = i481 + ((i478 ^ i480) | i481);
            int i483 = (~i479) | i479;
            int i484 = ~identityHashCode6;
            int i485 = ((~i484) & i483) | ((~i483) & i484);
            int i486 = i483 & i484;
            int i487 = ~((i486 & i485) | (i485 ^ i486));
            int i488 = (i477 | i479) & i479;
            int i489 = -(-(((i488 & i487) | ((~i488) & i487) | ((~i487) & i488)) * (-591)));
            int i490 = i482 & i489;
            int i491 = i490 + ((i489 ^ i482) | i490);
            int i492 = identityHashCode6 ^ (-1);
            int i493 = (i492 & identityHashCode6) | (i492 ^ identityHashCode6);
            int i494 = i493 ^ i479;
            int i495 = i493 & i479;
            int i496 = i491 - (~(-(-(((i495 & i494) | (i494 ^ i495)) * 591))));
            int i497 = -(-((i496 ^ (-1)) + (i496 << 1)));
            int i498 = i475 ^ i497;
            int i499 = ((((i497 & i475) | i498) << 1) - (~(-i498))) - 1;
            int i500 = i499 << 13;
            int i501 = ((~i499) & i500) | ((~i500) & i499);
            int i502 = i501 >>> 17;
            int i503 = ((~i501) & i502) | ((~i502) & i501);
            int i504 = i503 << 5;
            int i505 = (~i504) & i503;
            int i506 = (~i503) & i504;
            ((int[]) objArr37[2])[0] = (i506 & i505) | (i505 ^ i506);
            int i507 = echo;
            i16 = i507 & 45;
            i17 = i507 | 45;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr2[3];
            if (strArr2 != null) {
                int i508 = delta;
                int i509 = i508 & 69;
                int i510 = (i508 | 69) & (~i509);
                int i511 = i509 << 1;
                int i512 = ((i510 ^ i511) + ((i510 & i511) << 1)) % 128;
                echo = i512;
                delta = (((i512 | 97) << 1) - ((i512 & (-98)) | (i5 & (~i512)))) % 128;
                int i513 = 0;
                while (i513 < strArr2.length) {
                    int i514 = delta;
                    int i515 = i514 & 65;
                    int i516 = (((i514 ^ 65) | i515) << 1) - ((i514 | 65) & (~i515));
                    echo = i516 % 128;
                    if (i516 % 2 == 0) {
                        arrayList2.add(strArr2[i513]);
                        i513 += 127;
                    } else {
                        arrayList2.add(strArr2[i513]);
                        i513 = ((i513 | 1) << 1) - (((~i513) & 1) | (i513 & (-2)));
                    }
                }
            }
            Object[] objArr38 = {Long.valueOf((((~(i473 & r4)) & (i473 | r4)) & 4294967295L) ^ 1970681280605454336L), 458834983L};
            Object[] objArr39 = new Object[1];
            echo((byte) (bArr[435] - 1), bArr[c14], (short) 334, objArr39);
            Class<?> cls10 = Class.forName((String) objArr39[0]);
            Object[] objArr40 = new Object[1];
            echo((byte) (-bArr[46]), (byte) (-bArr[491]), (short) 116, objArr40);
            String str4 = (String) objArr40[0];
            Class<?> cls11 = Long.TYPE;
            cls10.getMethod(str4, cls11, cls11).invoke(null, objArr38);
            int i517 = ((int[]) objArr2[2])[0];
            int i518 = ((int[]) objArr2[1])[0];
            Object[] objArr41 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{i518}, new int[1], (String[]) objArr2[3]};
            int uptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i519 = (~(52500256 | uptimeMillis2)) | 402825234;
            int i520 = ~((~uptimeMillis2) | (-35656705));
            int i521 = -(-((((~(uptimeMillis2 | 455325490)) | i520) * 470) + ((i519 | i520) * (-470)) + 716467485));
            int i522 = i517 & i521;
            int i523 = (i521 | i517) & (~i522);
            int i524 = -(-(i522 << 1));
            int i525 = (i523 & i524) + (i523 | i524);
            int i526 = i525 << 13;
            int i527 = (~i526) & i525;
            int i528 = i526 & (~i525);
            int i529 = (i528 & i527) | (i527 ^ i528);
            int i530 = i529 >>> 17;
            int i531 = ((~i529) & i530) | ((~i530) & i529);
            ((int[]) objArr41[2])[0] = i531 ^ (i531 << 5);
            int i532 = echo;
            i16 = i532 & 15;
            i17 = (i532 ^ 15) | i16;
        }
        delta = (i16 + i17) % 128;
        golf(d22, function1, null, null, str, function12, 6);
    }

    public final void india(Map map, Function1 function1, Function1 function12) {
        november(new Object[]{this, map, function1, function12}, k3.component9(), k3.component9(), k3.component9(), k3.component9(), 2132779701, -2132779701);
    }

    public final Object mike(Integer num, Map map, String str, Nd.c cVar) {
        final C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c3207k.victor(new C2(atomicBoolean));
        Function1<FingerprintJSProResponse, Unit> function1 = new Function1<FingerprintJSProResponse, Unit>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.rV4669$4
            public static int red = 0;
            public static int silver = 1;
            public static int teal;
            public static int white;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public static /* synthetic */ Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
                int i14 = (1582236324 * i5) + (766573918 * i11) + RecyclerView.UNDEFINED_DURATION;
                int i15 = ~i11;
                int i16 = ~(i15 | i10);
                int i17 = ~(i5 | i10);
                int i18 = ~i5;
                int i19 = ~i10;
                int i20 = i16 | i17 | (~(i18 | i19 | i11));
                int i21 = (i20 * (-407831203)) + i14;
                int i22 = (~(i15 | i5)) | i16 | i17;
                int i23 = (~(i10 | i11)) | (~(i18 | i10)) | (~(i15 | i19 | i5));
                int i24 = ((-973078528) * i12) + (1711276032 * i4) + (1174405120 * i13) + ((-407831203) * i23) + (815662406 * i22) + i21;
                int papa = AbstractC2327c.papa(i12, 458392769, (1880080305 * i4) + i11 + i5 + i13);
                if (AbstractC2327c.quebec(papa, -1109000192, ((-1160779685) * i12) + (i4 * (-161570901)) + (319678491 * i13) + (i23 * MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD) + (i22 * (-414)) + (i20 * MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD) + (i5 * 319678284) + ((i11 * 319678698) - 2002258816), -1432485888, (68288512 * papa) + i24) != 1) {
                    rV4669$4 rv4669_4 = (rV4669$4) objArr[0];
                    Object obj = objArr[1];
                    int i25 = red;
                    int i26 = i25 & 61;
                    silver = ao.ad.victor(((i25 ^ 61) | i26) << 1, ~(-((i25 | 61) & (~i26))), 1, 128);
                    alpha(new Object[]{rv4669_4, (FingerprintJSProResponse) obj}, C1211g1.alpha(), 190867559, C1211g1.alpha(), -190867558, C1211g1.alpha(), C1211g1.alpha());
                    Unit unit = Unit.INSTANCE;
                    int i27 = red;
                    silver = (((i27 ^ 80) + ((i27 & 80) << 1)) - 1) % 128;
                    return unit;
                }
                rV4669$4 rv4669_42 = (rV4669$4) objArr[0];
                FingerprintJSProResponse fingerprintJSProResponse = (FingerprintJSProResponse) objArr[1];
                int i28 = red + 55;
                silver = i28 % 128;
                if (i28 % 2 != 0 ? !(!atomicBoolean.compareAndSet(false, true)) : atomicBoolean.compareAndSet(true, false)) {
                    c3207k.resumeWith(Result.m206constructorimpl(fingerprintJSProResponse));
                    int i29 = red;
                    int i30 = i29 & 37;
                    silver = ao.ad.victor(i30, ~(-(-((i29 ^ 37) | i30))), 1, 128);
                }
                int i31 = silver;
                int i32 = ((i31 ^ 121) | (i31 & 121)) << 1;
                int i33 = -(((~i31) & 121) | (i31 & (-122)));
                red = ((i32 ^ i33) + ((i33 & i32) << 1)) % 128;
                return null;
            }

            public static int component9() {
                int i4 = teal;
                int i5 = i4 % 9415933;
                teal = i4 + 1;
                if (i5 != 0) {
                    return white;
                }
                int myTid = Process.myTid();
                white = myTid;
                return myTid;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(FingerprintJSProResponse fingerprintJSProResponse) {
                return alpha(new Object[]{this, fingerprintJSProResponse}, C1211g1.alpha(), 1608225466, C1211g1.alpha(), -1608225466, C1211g1.alpha(), C1211g1.alpha());
            }
        };
        B2 b2 = new B2(atomicBoolean, c3207k);
        int i4 = delta;
        echo = ((i4 & 5) + (i4 | 5)) % 128;
        november(new Object[]{this, function1, num, map, str, b2}, k3.component9(), k3.component9(), k3.component9(), k3.component9(), -1370639029, 1370639035);
        int i5 = delta;
        int i10 = i5 & 101;
        echo = ((((i5 ^ 101) | i10) << 1) - ((i5 | 101) & (~i10))) % 128;
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            int i11 = delta;
            int i12 = i11 & 85;
            int i13 = (i11 ^ 85) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = i14 % 128;
            echo = i15;
            if (i14 % 2 != 0) {
                delta = (i15 + 125) % 128;
            } else {
                throw null;
            }
        }
        int i16 = delta;
        int i17 = i16 & 77;
        echo = ao.ad.victor(i17, ~(-(-((i16 ^ 77) | i17))), 1, 128);
        return sierra;
    }
}
