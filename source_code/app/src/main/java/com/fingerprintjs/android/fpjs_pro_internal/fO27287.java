package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
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
import com.fingerprintjs.android.fpjs_pro.InvalidProxyIntegrationHeaders;
import com.fingerprintjs.android.fpjs_pro_internal.M0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0001\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/fO27287;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class fO27287 {
    public static final char[] bravo;
    public static final long charlie;
    public static int delta;
    public static int echo;
    public static final byte[] foxtrot = null;
    public static final int golf = 0;
    public static final byte[] hotel = null;
    public static final int india = 0;
    public final Context alpha;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/L;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/L;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.fO27287$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<L> {
        public static int red;
        public static int silver;
        public final /* synthetic */ C2.d purple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C2.d dVar) {
            super(0);
            this.purple = dVar;
        }

        public static int setPivotYN16904() {
            int i4 = red;
            int i5 = i4 % 6797907;
            red = i4 + 1;
            if (i5 != 0) {
                return silver;
            }
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            silver = freeMemory;
            return freeMemory;
        }

        /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.A] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.z1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            int i4 = fO27287.echo + 19;
            fO27287.delta = i4 % 128;
            int i5 = i4 % 2;
            fO27287 fo27287 = fO27287.this;
            if (i5 == 0) {
                Context context = fo27287.alpha;
                C2.d dVar = this.purple;
                getRightG17489 getrightg17489 = new getRightG17489(context, CollectionsKt.a(kotlin.collections.ab.juliet((String) dVar.red), (List) dVar.silver), (String) dVar.purple, false, (List) dVar.teal, false, dVar.alpha, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -128, 1048575, null);
                String str = getrightg17489.kilo;
                String str2 = getrightg17489.bravo;
                List list = getrightg17489.alpha;
                List list2 = getrightg17489.delta;
                String str3 = getrightg17489.india;
                W0 w02 = getrightg17489.november;
                X0 x02 = new X0(w02, w02, true);
                M0.Companion companion = M0.INSTANCE;
                InterfaceC1276x interfaceC1276x = getrightg17489.juliet;
                M0 m02 = new M0(interfaceC1276x, x02, null, null);
                boolean z2 = getrightg17489.charlie;
                try {
                    Object[] objArr = {new yY18494(m02, z2), list, str2, str, str3, Boolean.valueOf(z2), list2};
                    Object D8871 = uH18377.D8871(2021864650);
                    if (D8871 == null) {
                        D8871 = uH18377.setPivotYN16904(ExpandableListView.getPackedPositionGroup(0L) + 60, 201 - Color.red(0), (char) View.getDefaultSize(0, 0), -1489463777, false, null, new Class[]{iA15411.class, List.class, String.class, String.class, String.class, Boolean.TYPE, List.class});
                    }
                    Object newInstance = ((Constructor) D8871).newInstance(objArr);
                    C1211g1 c1211g1 = new C1211g1(new Object());
                    ContentResolver contentResolver = getrightg17489.hotel;
                    C1285z0 c1285z0 = new C1285z0(contentResolver);
                    ?? obj = new Object();
                    sB6055 sb6055 = new sB6055(contentResolver);
                    av.ah ahVar = new av.ah(16, getrightg17489.golf);
                    SensorManager sensorManager = getrightg17489.foxtrot;
                    G2 g2 = getrightg17489.quebec;
                    ah ahVar2 = new ah(ahVar, new w.o(28, sensorManager, g2), new androidx.core.widget.f(22, getrightg17489.echo), getrightg17489.india, getrightg17489.oscar, getrightg17489.papa, c1211g1, c1285z0, obj, sb6055, g2, getrightg17489.sierra, getrightg17489.tango, getrightg17489.uniform, getrightg17489.victor, getrightg17489.whiskey, getrightg17489.xray, getrightg17489.zulu, getrightg17489.azure, getrightg17489.beige, getrightg17489.blue, getrightg17489.bronze, getrightg17489.coral, getrightg17489.crimson, getrightg17489.yankee, getrightg17489.cyan, getrightg17489.emerald, getrightg17489.fuchsia, getrightg17489.gold);
                    Object[] objArr2 = {new M0(interfaceC1276x, null, null, null), new rP23717(getrightg17489.lima, str2, str, getrightg17489.mike)};
                    Object D88712 = uH18377.D8871(-1848062409);
                    if (D88712 == null) {
                        D88712 = uH18377.setPivotYN16904(74 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 66 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ShapeBuilder.DEFAULT_SHAPE_COLOR - Color.rgb(0, 0, 0)), 1315138786, false, null, new Class[]{bz.class, rP23717.class});
                    }
                    Object newInstance2 = ((Constructor) D88712).newInstance(objArr2);
                    Object[] objArr3 = {w02};
                    Object echo = am.echo(1663347981);
                    if (echo == null) {
                        echo = am.charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2951), Color.rgb(0, 0, 0) + 16777268, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1210, 1792500907, null, new Class[]{cd.class});
                    }
                    return new p3(newInstance, ahVar2, new B(newInstance2, getrightg17489.amber, new J2((cj) ((Constructor) echo).newInstance(objArr3)), getrightg17489.quebec, getrightg17489.romeo), getrightg17489.juliet, getrightg17489.azure);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Context context2 = fo27287.alpha;
            throw null;
        }
    }

    static {
        echo();
        delta();
        delta = 0;
        echo = 1;
        char[] cArr = new char[2156];
        ByteBuffer.wrap("$ïFWáC\fo¯#Ê\u0018u\u001d\u0090\t3<^-ù×dÂ\u0087Ì\"ÈMëè\u0099\u000b\u0094¶\u0091Ñ³|º\u009eO9p¤QÇebi\u008d\u0018(\u000bÑý³E\u0014Qù}Z1?\n\u0080\u000fe\u001bÆ.«?\fÅ\u0091ÐrÞ×Ú¸è\u001d\u0086þ\u0092C\u0094$\u009b\u0089¿k^ÌOQS2s\u0097~\u0007·e\u000fÂ\u001b/7\u008c{é@VE³Q\u0010d}uÚ\u008fG\u009a¤\u0094\u0001\u0090n¡ËÜ(Æ\u0095Ø\u00adQÏþhá\u0085Ô&\u009dC¬ü£\u0019¿º\u0093×\u0099peí \u000e}«FÄXa'\u0082(?4X\u001bõ\u001f\u0017Ý°ó-ýNßëÂ\u0004 ¡¢Â¦\u001e\u001e|§Û£6\u008b\u0095ÒðêOäªº\tÙdÈÃ ^0\u007f\n\u001d³º·W\u009fôÆ\u0091é.þËíh\u0093\u0005Þ¢)?;Ü1K\\)ó\u008eñcÉÀÞ¥¾\u001a¥ÿù\\¹1¾\u0096@\u000bmèaMA\"}\u0087/d7Ù1\u007f\n\u001d²º¢W\u0088ô\u0088\u0091µ.¹ËãhÍ\u0005Û¢2?:Ü'y\u001d²ÈÐ&wr\u009a\u00019\u0019\\jã|\u00061¥PÈTo ò¹\u0011±´\u0084Û\u0094~Ø\u009dä üGØêì\b\"¯;2+Q^ä\u0084\u0086j!>ÌMoU\n&µ0P}ó\u001c\u009e\u00189ì¤õGýâÈ\u008dØ(\u0094Ë¨v°\u0011\u0094¼ ^nùwdg\u0007\u00113 Q\u008fö\u0090\u001b¥¸·ÝÕbÐ\u0087\u0085$ûIíî\u0013sQ\u0090\u000751Z'ÿ\\\u001c]¡\u0002Æjki\u0082¢àZGAªw\tcl\u0007\u007fy\u001d\u0097\u007f\n\u001d¥ººW\u008fô\u009d\u0091ÿ.úË¯hß\u0005Ç¢5?{Ü/y\u0017\u0016\u0002³mPCíK\u008a\u001e'BÅ¼b§ÿ²\u009cÝ9\u008eÖñså\u0010ð\u00adÃJÍç3\u007f\n\u001d¥ººW\u008fô\u009d\u0091ÿ.úË¯hß\u0005Ç¢5?{Ü/y\u0017\u0016\u0002³mPCíK\u008a\u001e'\\Å«b¥ÿ·êi\u0088Æ/ÙÂìaþ\u0004\u009c»\u0099^Ìý²\u0090¤7Zª\u0018INìx\u0083n&\u0015Å\u0013x\b\u001f%²\u0019P÷÷ÙjÖ\tü¬þCÓæ\u009b\u0085\u0088,\u0010N¨é¼\u0004\u0090§ÜÂî}è\u0098÷;ÒVÓñ4l+\u008f(*\u001c|9\u001e×¹\u0083Tð÷ò\u0092\u009d-\u0095È\u008aký\u0006¨¡Z<Iß[È\u0080ªx\riàDCG&\u007f\u00992|.ß\u0002\u007f\n\u001d¦º±W\u0093ô\u008a\u0091µ.ñËéhÑ\u0005Ë¢(?-Ü2y\u0006\u0016\n³uPf\u007fK\u001d³º®W\u0089ô\u009a\u0091ü\u007fW\u001d¹ºíW\u008cô\u009b\u0091õ.óËõhÞ\u0005Ú¢u?9Ü y\u001c\u0016\u001a³~Ptíe\u008aG'YÅ«b¯ÿµ\u0000\u008bbzÅd(Lß\u0002½ä\u001aæ÷ØT×1¾\u008e´kùÈ\u0099¥\u0080\u0002\u007f\u009f-|tÙA¶\u0016\u0013+ð'M3*\u0011\u0087\u001ce Âú_à<Ò\u0099\u0094v¯Ó½°¸\r\u0083êªGo$o\u0081g\u001e~ûFX.50\u0092\to\u0005Ì\u0005ªï\u0007ë\u007fU\u001d³º±W\u008fô\u0080\u0091é.ãË®hÎ\u0005×¢(?zÜ#y\u0016\u0016A³|Ppíd\u008aF'KÅ÷b\u00adÿ·\u009c\u00859ÃÖøsê\u0010ï\u00adÔJýç8\u00848!0¾)[\u0015øy\u0095g2^ÏXlR-zO\u009cè\u009e\u0005 ¦¯ÃÆ|Ì\u0099\u0081:áWøð\u0007mU\u008e\f+9DnáS\u0002_¿KØiud\u0097Ø0\u0097\u00ad\u0087Îñk¡\u0084À!Í-fO\u0080è\u0082\u0005¼¦³ÃÚ|Ð\u0099\u009d:ýWäð\u001bmI\u008e\u0010+%DráO\u0002C¿WØuux\u0097Ä0\u008b\u00ad\u009bÎík²\u0084Ì!Û\u007fU\u001d³º±W\u008fô\u0080\u0091é.ãË®hÎ\u0005×¢(?zÜ#y\u0016\u0016A³|Ppíd\u008aF'KÅ÷b¸ÿ¨\u009cÞ9\u0080Öýsè\u007fU\u001d³º±W\u008fô\u0080\u0091é.ãË®hÎ\u0005×¢(?zÜ#y\u0016\u0016A³|Ppíd\u008aF'KÅ÷b¸ÿ¨\u009cÞ9\u0080Öðsèg£\u0005D¢\\Otìj\u0089\f\u007f\n\u001d¦º±W\u0093ô\u008a\u0091µ.úËïhÙ\u0005Û¢7?1Ü2yæ\u001b\u0001¼\u0019Q1ò;\u0097Z(GÍFn|\u007f\n\u001d¥ººW\u008fô\u009d\u0091ÿ.úË¯hÛ\u0005Ü¢:?9Ü$y\u0005\u0016\u0000³jP~í)\u008aD'EÅ·b®ÿ¨\u009c\u00879\u009eÖ³sø\u0010ý\u00adÂJÖç:\u0084%!\u001a¾\u0005[\u0006øn\u0095\u007f2_ÏEl\u000e\n·§¯D\u0089\u007f\n\u001d º¦W\u0092ô\u008d\u0091õ.åË¯hÑ\u0005Ç¢9?bÜuy]\u0016\u0007³oP:íg\u008aF'HÅ°b¥ÿé\u009c\u00809\u009fÖ÷sæ\u0010å\u00adÃJÛçq\u0084?!,¾\u0018[\u0007øs\u0095~2IÏ\u0019lS\n²\u007f\n\u001d º¦W\u0092ô\u008d\u0091õ.åË¯hÑ\u0005Ç¢9?bÜuy]\u0016\u0007³oP:ín\u008aD'OÅ¶b§ÿ·\u009c\u009f9\u009eÖûsù\u0010ª\u00adÆJËç1\u0084,!*¾\u0001[\u0010ø2\u0095z2U8ÎZaý~\u0010K³YÖ;i>\u008ck/\u0015B\u0003åýx¦\u009b±>\u0099QÈô°\u0017¾ª·Í\u0093`·\u0082|%g¸gÛX~v\u009134!W4ê\u0010\r\u0014 ýÃífâù×\u001c\u008a¿»Ò½u\u008e\u0088Ý+\u0097Mv\u007f\n\u001d³º·W\u009fôÆ\u0091ó.ùËéhÉ\u0005\u0081¢2?:Ü(y\u0006\u0016A³{Pyíi\u008aF'HÅªb¯ÿµ\u009c\u00869\u0084Öýsî\u0010ª\u00adÃJÁ\b#jòÍì Ä\u0083Åæ´Y¢¼¨\u001f\u0093r\u0081ÓÒ±:\u0016*û\u0010X\u0004=o\u0082{\u007fF\u001d¾º±W\u0093ô\u0084\u0091ó.âËí\u007fW\u001d¹ºíW\u008cô\u009b\u0091õ.óËõhÞ\u0005Ú¢u?0Ü$y\u0004\u0016\u0006³{Pp9\u008f[hüp\u0011X²\r×ph;\u007fB\u001d³º\u00adW\u0099ô\u009b\u0091ó.ô\u0003Ùa(Æ6+\u0002\u0088\u0000íhRo·D\u0014^y\rÞö\u007fB\u001d³º\u00adW\u0099ô\u009b\u0091ó.ôËßhÅ\u0005\u0096¢m?\u000bÜwyFÛ$¹Ê\u001e\u009eóÿPè5\u0086\u008a\u0080o\u0086Ì\u00ad¡©\u0006\u0006\u009bJx]Ýe²y\u0017\u0007\u007fV\u001d²º¨u÷\u0017\f°\u0001]'þ?\u009bY$OÁE\u007fd\u001d¦º³WÜô»\u0091ï.ùËôhÔ\u0005Ã¢>?tÜ'y\u001d\u0016\u001d³8PVín\u008aA'CÅ´b¯\u007fd\u001d¸º§W\u008eô\u0086\u0091ó.óË hî\u0005ê¢\u0010?tÜ#y\u0007\u0016\u0006³tPaí&\u008aU'CÅ«bêÿ¿\u009cÈ9Û\u007fd\u001d¸º§W\u008eô\u0086\u0091ó.óË hî\u0005ê¢\u0010?tÜ#y\u0007\u0016\u0006³tPaí&\u008aU'CÅ«bêÿ¿\u009cÈ9ÛÖÁs½\u0010°\u007fW\u001d¹ºíW\u0094ô\u0088\u0091è.óË÷hÜ\u0005Ü¢>S½1F\u0096P{gØp½\f\u0002\u001bç\u0017è4\u008aÓ-ËÀãc¶\u0006Ë\u007fW\u001d·º\u00adW\u009fô\u0081\u0091ï?Ä]*ú~\u0017\u001f´\bÑfn`\u008bf(MEIâæ\u007f¥\u009c 9\u0080V\u0092óï\u007fW\u001d¹ºíW\u0097ô\u008c\u0091è.ùËåhÑ\u0005\u0080¢*?1Ü,y\u0007Þa\u007fW\u001d¹ºíW\u008fô\u008c\u0091ù.âËòhØ\u009eS\u007fW\u001d¹ºíW\u009eô\u009c\u0091ó.ûËäh\u0093\u0005Þ¢)?;Ü%y\u0007\u0016\f³l\u007fC\u001d£º¯W\u0090ô¶\u0091â.¯Ë¶&\u008aDdã0\u000eC\u00adAÈ.w&\u009291N\\\u0015ûïfç\u0085û ÊOÀêµ\tº´²Ó\u0080~\u00851ÒS#ô=\u0019\tº\u000bßc`d\u0085?&^KZì që\u0092¶7\u0087X\u0091ýí\u001e÷£ÿÄÀ\u007fB\u001d³º\u00adW\u0099ô\u009b\u0091ó.ôËßhÅ\u0005\u0096¢m?{Ü2y\u0016\u0016\u0004³GPmí>\u008a\u0005'\u0003Å¾b¯ÿ©\u009c\u00959\u009fÖ÷sè\u0010Û\u00adÉJ\u009açi\u007fB\u001d³º\u00adW\u0099ô\u009b\u0091ó.ôË¯hÚ\u0005Á¢4?3Ü-y\u0017\u00160³kPqím\u008a\u001c'KÅ¼b¤ÿ¢\u009c\u00829\u0084Öý\u0012\u001cpí×ó:Ç\u0099Åü\u00adCª¦ñ\u0005\u0095h\u0092ÏjRr±'\u0014\u001a{AÞi==\u0080:ç\u0002J\n¨¿\u000f¢\u0092é\u007fB\u001d¹º¬W\u009bô\u0085\u0091ÿ.¸ËóhÙ\u0005Å¢\u0004?3Ü1y\u001a\u0016\u0000³vPpíY\u008aK'\u0014Åïbåÿ \u009c\u00959\u0083Öûsù\u0010í\u00adÒJýç'\u0084p!s\u007fW\u001d¹ºíW\u009eô\u0086\u0091õ.ãËìhÒ\u0005Ï¢??1Ü3bN\u0000 §ôJ\u0087é\u009f\u008cì3úÖðuÉ\u0018Ö¿%\"(Ávd\t\u000b\u0003®hM`ð{\u0097\u0004:SØ©\u007f½â¹\u0081\u008c$\u0086Ë÷nà\rô°ÆWÏ\u00adìÏ0h/\u0085\u0006&\u000eC{ü{\u0019%ºM×\u001epåR¯0A\u0097\u0015zfÙd¼\u000b\u0003\u0003æ\u001cEk(2\u008fÊ\u0012ßñÉTæ;ö\u009e\u0099}ÃÀ\u0097§¯\u007fQ\u001d³º°W\u0088ôÄ)³KGìU\u0001w¢8Ç\u0016x\u001e\u009d\u001c>lS ôÁiÆ\u008aË/ @àå\u0095\u0006\u0085»\u0089Ü¿Éü«\u001b\f\u0006á!Bo'Z\u0098H}\u0006Þx³g\u0014\u009a\u0089\u0092j\u0082Ï¿ ¾\u0005Ã\u007fT\u001d³º®W\u0089ôÇ\u0091é.ñË®hÛ\u0005Ï¢0?1Ü\u001ey\u0011\u0016\u000e³uPpít\u008aR\u007fT\u001d³º®W\u0089ôÇ\u0091é.ñË®hÑ\u0005Í¢??\u000bÜ%y\u0017\u0016\u0001³kP|ír\u008aJ\u007fW\u001d¹ºíW\u0097ô\u008c\u0091è.ùËåhÑ\u0005\u0080¢:?:Ü%y\u0000\u0016\u0000³qPqí(\u008aB'IÅ´b¿ÿ£\u007fW\u001d¹ºíW\u009eô\u0086\u0091õ.ãË®hÌ\u0005Ë¢6?!Üoy\u0013\u0016\u0019³|PJíh\u008aR'AÅ¼\u007fW\u001d¹ºíW\u0093ô\u008d\u0091÷.¹ËâhÈ\u0005Ç¢7?0Üoy\u0014\u0016\u0006³vPríc\u008aA'\\Å«b£ÿ©\u009c\u0084\u007fW\u001d¹ºíW\u008cô\u009b\u0091õ.óËõhÞ\u0005Ú¢u?6Ü4y\u001b\u0016\u0003³|P;í`\u008aZ'BÅ¾b¯ÿµ\u009c\u00809\u009fÖ÷så\u0010ð\u007fW\u001d¹ºíW\u008fô\u0090\u0091é.ãËåhÐ\u0005\u0080¢9?!Ü(y\u001e\u0016\u000b³6Psío\u008a]'KÅ¼b¸ÿ·\u009c\u00829\u0084Öðsÿ\u007fW\u001d¹ºíW\u008fô\u0090\u0091é.ãËåhÐ\u0005ñ¢>?,Ü5y\\\u0016\r³mP|íj\u008aW'\u0002Å¿b£ÿ©\u009c\u00979\u0088Öìsû\u0010ö\u00adØJÌç+ø`\u009a\u008e=ÚÐ½s»\u0016Ã©ÄLØïø\u0082·%\u000e¸\u0016[\u001fþ)\u0091<4\u0001×DjX\rj |B\u008bå\u008fx\u0080\u001bµ¾³QÇôÈ\u007fW\u001d¹ºíW\u008aô\u008c\u0091ô.óËïhÏ\u0005ñ¢??8Ü*y\u001f\u0016A³zP`ío\u008a_'HÅ÷b¬ÿ®\u009c\u009e9\u008aÖûsù\u0010ô\u00adÃJËç1\u0084<\u007f\r®JÌµÏ\u0088\u007f\f\u007f\n\u001d²º¦W\u008aôÆ\u0091ë.òËíhÈ\u0005ñ¢+?=Ü1y\u0017\u007f\n\u001d²º¦W\u008aôÆ\u0091é.øËãhÖ\u0005Ë¢/?{Ü#y\u0013\u0016\u001c³}Pwíg\u008a]'HÅ\u0086b\u00adÿ¢\u009c\u009e9\u0094Öú° Ò\u0098u\u008c\u0098 ;ì^ÃáÒ\u0004É§üÊám\u0005ðQ\u0013\f¶=Ù+|K\u009f[\u007f\n\u001d²º¦W\u008aôÆ\u0091é.øËãhÖ\u0005Ë¢/?{Ü0y\u0017\u0016\u0002³mPqÁ\u0010£¿\u0004 é\u0095JÜ/ñ\u0090èu÷ÖÒ»ë\u001c5\u0081<b:Ç\u000b¨\u0010\u007f\n\u001d¥ººW\u008fô\u009d\u0091ÿ.úË¯hÑ\u0005Ç¢9?{Ü-y\u001b\u0016\r³{PJík\u008aR'@Åµb¥ÿ¤\u009c¯9\u0089Öûsé\u0010ñ\u00adÖJýç.\u0084-!(¾\u0003[Møo\u0095f'\u001dE¥â±\u000f\u009d¬ÑÉïvó\u0093ã0õ]Þú<g0\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhâ\u0005Ú¢2?9Ü$\u007f\n\u001d²º¦W\u008aôÆ\u0091é.øËãhÖ\u0005Ë¢/?{Ü#y\u0001\u0016\u001b³~Pzíj\u008aW'IÅ«b®\u007f\n\u001d¥ººW\u008fô\u009d\u0091ÿ.úË¯hÑ\u0005Ç¢9?{Ü-y\u001b\u0016\r³zPfír\u008aU'CÅµb®ÿ¢\u009c\u00829²Öôså\u0010í\u00ad\u009fJÑç0¨\u001fÊ§m³\u0080\u009f#ÓFíùñ\u001cá¿ÉÒØu-è$\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhÚ\u0005×¢)?;\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhÐ\u0005Ë¢<?:\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhÒ\u0005Ü¢2?1\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhË\u0005Ã¢(?3\u0002\u000f`·Ç£*\u008f\u0089ÃìýSá¶ñ\u0015ÈxÌß?B8¡4\u0004\u0014\u007f\n\u001d²º¦W\u008aôÆ\u0091ø.äËôhâ\u0005Ç¢6?1\u009bßùg^w³]\u0010]u`Ê&/:\u008c\u001fá\u0015FâÛî8õ\u009dÃòÉWâ´î\t«n\u0084ÃÖ!n\u0086l\u001bfxNõ\u001b\u0097ª0¼Ý\u0099~×\u001bü¤ïAÿâÈ\u008fÐ(=µ6V\u007fó!\u009c\r9}ÚWg\u007f\u0000C\u00adOO\u00adè¿u\u0090\u0016\u008e³\u0090\\ëùÿ\u009açXJ:æ\u009dñpÓÓÊ¶õ\t¾ì¯O\u008d\"\u0081\u0085i\u0018`ûr\u0083Úá\u007fFj«\u0013\b\u001c\u007f\n\u001d¦º±W\u0093ô\u008a\u0091µ.äËåhÑ\u0005È¢t?9Ü y\u0002\u0016\u001c\u007fB\u001d¤º¢W\u0090ô\u0085\u0091õ.ôË®hÚ\u0005Á¢7?0Ü'y\u001b\u0016\u001c³pP;íu\u008a\\\u007fI\u001d¿º¡W»ô¥\u0091ß.ÄËßhß\u0005Ý¢/?zÜ2y\u001d\u007f\n\u001d³º·W\u009fôÆ\u0091÷.òËähÔ\u0005Ï¢\u0004?7Ü.y\u0016\u0016\n³{Pfí(\u008aK'AÅµp\u0093\u0012nµbXMûN\u009e:!\"Ä7g\u0002\n\t«óÉJnN\u0083f ?E\u000eú\u0001\u001f\f¼*Ñ#vÑ\u007f\n\u001d²º¢W\u0088ô\u0088\u0091µ.óËïhÊ\u0005À¢7?;Ü y\u0016\u0016\u001c³7P;íb\u008aC'\u0003Å¸bºÿ·\u009c\u00839ÃÖæsæ\u0010è\"ç@Kç\\\n~©gÌXs\u0019\u0096\u001d5%X*ÿØbß\u0081Ã\u008fµínJx§O\u0004Xa$Þ3;?ár\u0083Ê$ÚÉðjð\u000fÍ°\u0082U\u0091ö¶\u009bµ<\f¡\\BKçe\u0088q-\tÎ\u0001s\u001b\u00148¹{[ÂüÇaÍ\u0002§§¥HÉí\u0090\u008e\u00933¤ÔôyJ\u001aY¿^ |Åtf\u0012\u000b\u0018¬0Q;òv\u0094È9ÓÚî\u007fùàð\u0085\u0087&\u0092".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        bravo = cArr;
        charlie = 7872024809271205334L;
    }

    public fO27287(Context context) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext);
            m206constructorimpl = Result.m206constructorimpl(applicationContext);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        this.alpha = (Context) component13.vD14832N6715(bk.component5(m206constructorimpl), context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:166|(1:168)|169|170|(1:172)(1:345)|173|174|(1:176)|177|(5:179|(1:181)|182|183|(17:185|186|187|(1:189)|190|(1:192)(4:303|(1:305)|306|307)|193|(2:195|(5:197|(7:199|200|(1:202)|203|204|(1:229)(4:206|(2:208|(5:210|(1:212)|213|214|(2:216|217))(5:220|(1:222)|223|224|(2:226|217)))|227|228)|218)|230|231|219))|232|(2:233|(4:235|(6:237|238|(1:240)(1:298)|241|242|(2:245|246)(1:244))|299|300)(2:301|302))|247|248|249|(2:251|(2:253|(5:255|256|(2:258|(1:260)(4:280|281|282|283))(1:287)|261|(3:263|264|(6:266|267|268|(1:270)|271|272)(7:278|279|267|268|(0)|271|272))))(4:289|290|291|292))|296|264|(0)(0)))(1:344)|308|(7:310|311|(1:313)(1:337)|314|315|(6:319|(3:321|(2:323|(1:326)(1:325))|327)|329|(1:331)(1:334)|332|333)|328)|338|339|(1:341)(1:343)|342|186|187|(0)|190|(0)(0)|193|(0)|232|(3:233|(0)(0)|300)|247|248|249|(0)|296|264|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x357d, code lost:
    
        r2 = ~(r80 & 151);
        r3 = r80 | 151;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x112f A[Catch: IOException -> 0x1162, TryCatch #3 {IOException -> 0x1162, blocks: (B:121:0x10f6, B:123:0x112f, B:124:0x1135), top: B:120:0x10f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1296  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x14f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x1612 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x16f7 A[Catch: all -> 0x3758, TRY_ENTER, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x2881 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x28d1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x29f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x32c1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x34d6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x3574  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x35f7 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x3576  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x342b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x28d4 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x36d4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x15f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1492  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1134  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1259 A[Catch: IOException -> 0x1284, TryCatch #1 {IOException -> 0x1284, blocks: (B:363:0x1219, B:365:0x1259, B:366:0x125f), top: B:362:0x1219 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x1268  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x125e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x1079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0abe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x069c A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b08 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0c0c A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0d46 A[Catch: all -> 0x3758, TryCatch #2 {all -> 0x3758, blocks: (B:6:0x010e, B:8:0x011b, B:9:0x0162, B:19:0x02c0, B:21:0x02cd, B:22:0x0307, B:29:0x03fe, B:31:0x040b, B:32:0x0447, B:41:0x0696, B:43:0x069c, B:44:0x06dc, B:64:0x09a0, B:66:0x09ad, B:67:0x09f1, B:76:0x0afe, B:78:0x0b08, B:79:0x0b4b, B:85:0x0bfd, B:87:0x0c0c, B:88:0x0c55, B:93:0x0d3c, B:95:0x0d46, B:96:0x0d8a, B:105:0x0ff3, B:107:0x0ffe, B:108:0x1046, B:135:0x1358, B:137:0x1365, B:138:0x13a4, B:150:0x14f8, B:152:0x1505, B:153:0x1548, B:160:0x160c, B:162:0x1612, B:163:0x1654, B:166:0x16f7, B:168:0x170a, B:169:0x1750, B:174:0x184e, B:176:0x1858, B:177:0x189f, B:179:0x18a8, B:181:0x18c1, B:182:0x1909, B:187:0x2877, B:189:0x2881, B:190:0x28c8, B:200:0x2d48, B:202:0x2d55, B:203:0x2d91, B:210:0x2e71, B:212:0x2e7f, B:213:0x2eb4, B:220:0x2f66, B:222:0x2f74, B:223:0x2fa8, B:238:0x32d7, B:240:0x32e8, B:241:0x334a, B:268:0x35ea, B:270:0x35f7, B:271:0x3634, B:303:0x28d4, B:305:0x28ec, B:306:0x2935, B:311:0x26a4, B:313:0x26ae, B:314:0x26fe, B:401:0x0566, B:403:0x0570, B:404:0x05b4, B:414:0x0610, B:416:0x061a, B:417:0x0664), top: B:5:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0dca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] D8871(Context context, int i4, int i5, int i10) {
        int i11;
        int i12;
        Class<String> cls;
        int i13;
        int i14;
        int i15;
        String str;
        float f5;
        int i16;
        int i17;
        int i18;
        int i19;
        Class<String> cls2;
        int i20;
        String str2;
        int i21;
        int i22;
        int i23;
        int i24;
        Object D8871;
        File file;
        int i25;
        int i26;
        int i27;
        String[] strArr;
        int i28;
        long j5;
        int i29;
        Object D88712;
        String str3;
        int i30;
        Object D88713;
        Object D88714;
        String lowerCase;
        Object[] objArr;
        int i31;
        String[] strArr2;
        int i32;
        int i33;
        int i34;
        String str4;
        File file2;
        String str5;
        File file3;
        int i35;
        String next;
        int i36;
        int i37;
        int i38;
        long j6;
        int i39;
        char c3;
        String[] strArr3;
        int i40;
        int i41;
        int i42;
        Object D88715;
        int i43;
        int i44;
        String[] strArr4;
        String str6;
        int i45;
        int i46;
        String[] strArr5;
        int i47;
        int i48;
        char c4;
        Object D88716;
        Object invoke;
        int i49;
        int i50;
        char c10;
        int i51;
        int i52;
        int i53;
        Object D88717;
        File file4;
        boolean z2;
        int i54;
        String[] strArr6;
        String str7;
        int i55;
        int i56;
        String[] strArr7;
        int i57;
        int i58;
        String next2;
        String[] strArr8;
        String[] strArr9;
        String next3;
        int i59 = 6;
        int i60 = 4;
        int i61 = 0;
        int i62 = 1;
        char c11 = (char) (2742 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))));
        int i63 = 909 - (~(-Color.argb(0, 0, 0, 0)));
        int i64 = -(-(KeyEvent.getMaxKeyCode() >> 16));
        Object[] objArr2 = new Object[1];
        bravo(c11, i63, (i64 & 8) + (i64 | 8), objArr2);
        String str8 = (String) objArr2[0];
        char bitsPerPixel = (char) (23524 - ImageFormat.getBitsPerPixel(0));
        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        String str9 = "";
        int i65 = -TextUtils.indexOf((CharSequence) "", '0', 0);
        Object[] objArr3 = new Object[1];
        bravo(bitsPerPixel, scrollBarFadeDuration, (i65 ^ 26) + ((i65 & 26) << 1), objArr3);
        String str10 = (String) objArr3[0];
        char resolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 44791);
        int i66 = 26 - (~(-(-((Process.getThreadPriority(0) + 20) >> 6))));
        int indexOf = TextUtils.indexOf("", "", 0);
        Object[] objArr4 = new Object[1];
        bravo(resolveOpacity, i66, (indexOf ^ 25) + ((indexOf & 25) << 1), objArr4);
        String str11 = (String) objArr4[0];
        char c12 = (char) (30908 - (~(-(-TextUtils.getTrimmedLength("")))));
        int i67 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        Object[] objArr5 = new Object[1];
        bravo(c12, (i67 & 52) + (i67 | 52), 18 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
        String str12 = (String) objArr5[0];
        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
        int i68 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i69 = (i68 ^ 70) + ((i68 & 70) << 1);
        int i70 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        Object[] objArr6 = new Object[1];
        bravo((char) ((packedPositionType & 53851) + (packedPositionType | 53851)), i69, (i70 ^ 29) + ((i70 & 29) << 1), objArr6);
        String[] strArr10 = {str10, str11, str12, (String) objArr6[0]};
        int i71 = 0;
        while (true) {
            i11 = golf;
            i12 = -1;
            cls = String.class;
            if (i71 >= i60) {
                i13 = i59;
                i14 = i61;
                i15 = i62;
                str = str9;
                f5 = 0.0f;
                i16 = 2;
                i17 = i4;
                break;
            }
            i13 = i59;
            try {
                Object[] objArr7 = new Object[i62];
                objArr7[i61] = strArr10[i71];
                Object D88718 = uH18377.D8871(1565484532);
                if (D88718 == null) {
                    int i72 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
                    f5 = 0.0f;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2951;
                    i16 = 2;
                    char trimmedLength = (char) TextUtils.getTrimmedLength(str9);
                    byte b2 = (byte) (i11 & 3);
                    byte b4 = (byte) (b2 - 1);
                    i14 = i61;
                    Object[] objArr8 = new Object[i62];
                    charlie(b4, b2, b4, objArr8);
                    String str13 = (String) objArr8[i14];
                    Class[] clsArr = new Class[i62];
                    clsArr[i14] = cls;
                    D88718 = uH18377.setPivotYN16904(i72, keyRepeatTimeout, trimmedLength, -2097887455, false, str13, clsArr);
                } else {
                    i14 = i61;
                    f5 = 0.0f;
                    i16 = 2;
                }
                long longValue = ((Long) ((Method) D88718).invoke(null, objArr7)).longValue();
                long j7 = 383296515;
                str = str9;
                long j10 = 184;
                int i73 = i62;
                String[] strArr11 = strArr10;
                long j11 = -1;
                long j12 = j7 ^ j11;
                i15 = i73;
                long j13 = i4;
                long j14 = j13 ^ j11;
                long j15 = (j10 * ((j12 | j14) ^ j11)) + ((-184) * ((((longValue ^ j11) | j7) ^ j11) | j13)) + ((((j12 | longValue) ^ j11) | ((j14 | longValue) ^ j11)) * j10) + (185 * longValue) + ((-183) * j7) + 571857387;
                int i74 = ((int) (j15 >> 32)) & ((((~((~((int) SystemClock.elapsedRealtime())) | 1087118356)) | (-1410475395)) * 494) + ((((-336732547) | r2) * 494) - 1867597214));
                int uptimeMillis = (int) SystemClock.uptimeMillis();
                int i75 = ~uptimeMillis;
                if ((i74 | (((int) j15) & ((((~(uptimeMillis | 2140409573)) | (~(i75 | (-696256546)))) * 765) + (((~(2140409573 | i75)) | 6926618) * 1530) + (((((~((-6926619) | i75)) | (~(2147336191 | uptimeMillis))) | (~((-696256546) | uptimeMillis))) * 765) - 439865438)))) != 0) {
                    int i76 = i71 + 190;
                    i17 = ((~i76) & i4) | ((~i4) & i76);
                    break;
                }
                int i77 = (i71 & 72) + (i71 | 72);
                i71 = ((i77 | (-71)) << 1) - (i77 ^ (-71));
                strArr10 = strArr11;
                i59 = i13;
                str9 = str;
                i62 = i15;
                i61 = i14;
                i60 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        char c13 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24851);
        int i78 = 97 - (~(-Color.alpha(i14)));
        int gidForName = Process.getGidForName(str);
        Object[] objArr9 = new Object[i15];
        bravo(c13, i78, (gidForName & 13) + (gidForName | 13), objArr9);
        String str14 = (String) objArr9[i14];
        char myTid = (char) (Process.myTid() >> 22);
        int i79 = (TypedValue.complexToFloat(i14) > f5 ? 1 : (TypedValue.complexToFloat(i14) == f5 ? 0 : -1));
        int i80 = ((i79 | 110) << 1) - (i79 ^ 110);
        int i81 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
        int i82 = (i81 & 13) + (i81 | 13);
        Object[] objArr10 = new Object[1];
        bravo(myTid, i80, i82, objArr10);
        String str15 = (String) objArr10[i14];
        int i83 = i14;
        int deadChar = KeyEvent.getDeadChar(i83, i83);
        int i84 = (TypedValue.complexToFloat(i83) > f5 ? 1 : (TypedValue.complexToFloat(i83) == f5 ? 0 : -1));
        int i85 = 1;
        Object[] objArr11 = new Object[1];
        bravo((char) ((deadChar & 13398) + (deadChar | 13398)), (i84 ^ 123) + ((i84 & 123) << 1), Color.blue(i83) + 18, objArr11);
        String[] strArr12 = {str14, str15, (String) objArr11[i83]};
        int i86 = i83;
        while (true) {
            if (i86 >= 3) {
                i18 = i17;
                i19 = i12;
                cls2 = cls;
                i20 = i4;
                break;
            }
            Object[] objArr12 = new Object[i85];
            objArr12[i83] = strArr12[i86];
            Object D88719 = uH18377.D8871(1979478258);
            if (D88719 == null) {
                int i87 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 51;
                int i88 = 2952 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b6 = (byte) 0;
                byte b10 = b6;
                Object[] objArr13 = new Object[1];
                charlie(b10, b6, b10, objArr13);
                D88719 = uH18377.setPivotYN16904(i87, i88, longPressTimeout, -1438133721, false, (String) objArr13[0], new Class[]{cls});
            }
            long longValue2 = ((Long) ((Method) D88719).invoke(null, objArr12)).longValue();
            long j16 = -701442535;
            long j17 = 184;
            i18 = i17;
            String[] strArr13 = strArr12;
            long j18 = i12;
            long j19 = j16 ^ j18;
            i19 = i12;
            cls2 = cls;
            long myTid2 = Process.myTid();
            long j20 = myTid2 ^ j18;
            long j21 = (j17 * (j18 ^ (j19 | j20))) + ((-184) * ((((longValue2 ^ j18) | j16) ^ j18) | myTid2)) + ((((j19 | longValue2) ^ j18) | ((j20 | longValue2) ^ j18)) * j17) + (185 * longValue2) + ((-183) * j16) + 1476263841;
            if (((((int) (j21 >> 32)) & (((1525979112 | (~((-88752702) | (~i4)))) * 56) + (((~(1525979112 | i4)) | (-88752702)) * 56) + 2116654050)) | (((int) j21) & (((~((~((int) Process.getElapsedCpuTime())) | (-69929))) * HttpConstants.HTTP_NOT_IMPLEMENTED) + ((((~((-69929) | r3)) | (-1807745023)) * HttpConstants.HTTP_NOT_IMPLEMENTED) - 2030103272)))) != 0) {
                int i89 = delta;
                echo = (((i89 | 11) << 1) - (i89 ^ 11)) % 128;
                i20 = ((i86 & 270) + (i86 | 270)) ^ i4;
                break;
            }
            int i90 = (i86 ^ (-81)) + ((i86 & (-81)) << 1);
            i86 = ((i90 | 82) << 1) - (i90 ^ 82);
            i17 = i18;
            strArr12 = strArr13;
            i12 = i19;
            cls = cls2;
            i85 = 1;
            i83 = 0;
        }
        int i91 = (~(i4 & i18)) & (i4 | i18);
        int i92 = (i91 | (-i91)) >> 31;
        int i93 = i20 & (~i92);
        int i94 = i92 & i18;
        int i95 = (i93 & i94) | (i93 ^ i94);
        String str16 = str;
        Object[] objArr14 = new Object[1];
        bravo((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf(str16, str16) + ModuleDescriptor.MODULE_VERSION, 13 - (~(-(-(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1))))), objArr14);
        Object[] objArr15 = {(String) objArr14[0]};
        Object D887110 = uH18377.D8871(-2104138125);
        if (D887110 == null) {
            int normalizeMetaState = KeyEvent.normalizeMetaState(0) + 52;
            int i96 = 2952 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            byte b11 = (byte) 1;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr16 = new Object[1];
            charlie(b12, b11, b12, objArr16);
            D887110 = uH18377.setPivotYN16904(normalizeMetaState, i96, modifierMetaStateMask, 1563346086, false, (String) objArr16[0], new Class[]{cls2});
        }
        long longValue3 = ((Long) ((Method) D887110).invoke(null, objArr15)).longValue();
        long j22 = 454063457;
        long j23 = i19;
        long j24 = j22 ^ j23;
        long j25 = i4;
        long j26 = j25 ^ j23;
        long j27 = 904;
        long j28 = longValue3 ^ j23;
        long j29 = j26 | j22;
        long j30 = ((j27 * ((((longValue3 | j24) ^ j23) | ((j28 | j25) ^ j23)) | (j29 ^ j23))) + ((((((j24 | j28) | j25) ^ j23) | ((j29 | longValue3) ^ j23)) * j27) + (((-1808) * (((j24 | j25) ^ j23) | ((j26 | longValue3) ^ j23))) + (((-903) * longValue3) + (905 * j22))))) - 1683683987;
        int i97 = ~ao.ad.romeo();
        int foxtrot2 = ((int) (j30 >> 32)) & A0.z.foxtrot((~(797739509 | i97)) | (-2144184832) | (~(2060001375 | i97)), 184, (((~(i97 | (-84183457))) | (~((-1346445323) | i97))) * (-184)) - 1019427974, 1849672240);
        int tango = ao.ad.tango(396993160);
        int i98 = ((int) j30) & ((((~(tango | (-984127814))) | (-1873613073)) * HttpConstants.HTTP_BAD_GATEWAY) + ((~((~tango) | (-1157955601))) * (-502)) + ((((~((-1873613073) | tango)) | (-2142083414)) * (-502)) - 1592225177));
        if (((foxtrot2 & i98) | (foxtrot2 ^ i98)) != 0) {
            int i99 = delta;
            int i100 = ((i99 | 5) << 1) - (i99 ^ 5);
            echo = i100 % 128;
            i22 = i100 % 2 == 0 ? (i4 & (-620)) | ((~i4) & 619) : i4 ^ 266;
            echo = ((i99 & 63) + (i99 | 63)) % 128;
        } else {
            int i101 = -(-ImageFormat.getBitsPerPixel(0));
            Object[] objArr17 = new Object[1];
            bravo((char) ((i101 & 52640) + (i101 | 52640)), 153 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), 24 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object D887111 = uH18377.D8871(-957097391);
            if (D887111 == null) {
                int i102 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int touchSlop = 3158 - (ViewConfiguration.getTouchSlop() >> 8);
                char resolveSize = (char) (58074 - View.resolveSize(0, 0));
                byte b13 = (byte) (i11 & 3);
                byte b14 = (byte) (b13 - 2);
                Object[] objArr19 = new Object[1];
                charlie(b14, b13, b14, objArr19);
                D887111 = uH18377.setPivotYN16904(i102, touchSlop, resolveSize, 424179844, false, (String) objArr19[0], new Class[]{cls2});
            }
            String str17 = (String) ((Method) D887111).invoke(null, objArr18);
            if (str17 == null || str17.isEmpty()) {
                int i103 = -(Process.myPid() >> 22);
                int i104 = 177 - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i105 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i106 = (i105 & 24) + (i105 | 24);
                Object[] objArr20 = new Object[1];
                bravo((char) ((i103 & 39891) + (i103 | 39891)), i104, i106, objArr20);
                Object[] objArr21 = {(String) objArr20[0]};
                Object D887112 = uH18377.D8871(-957097391);
                if (D887112 == null) {
                    str2 = str16;
                    int lastIndexOf = 51 - TextUtils.lastIndexOf(str2, '0', 0, 0);
                    int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3158;
                    char mirror = (char) (58122 - AndroidCharacter.getMirror('0'));
                    byte b15 = (byte) (i11 & 3);
                    byte b16 = (byte) (b15 - 2);
                    i21 = 24;
                    Object[] objArr22 = new Object[1];
                    charlie(b16, b15, b16, objArr22);
                    D887112 = uH18377.setPivotYN16904(lastIndexOf, normalizeMetaState2, mirror, 424179844, false, (String) objArr22[0], new Class[]{cls2});
                } else {
                    str2 = str16;
                    i21 = 24;
                }
                String str18 = (String) ((Method) D887112).invoke(null, objArr21);
                i22 = (str18 == null || str18.isEmpty()) ? i4 : (i4 & (-268)) | ((~i4) & 267);
                int i107 = (~i95) & i4;
                int i108 = ~i4;
                int i109 = i107 | (i95 & i108);
                int i110 = -i109;
                int i111 = ((i109 & i110) | (i109 ^ i110)) >> 31;
                int i112 = i22 & (~i111);
                int i113 = i95 & i111;
                int i114 = (i113 & i112) | (i112 ^ i113);
                D8871 = uH18377.D8871(1074526551);
                if (D8871 == null) {
                    int i115 = 52 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i116 = 1056 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    char c14 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b17 = (byte) (i11 & 3);
                    byte b18 = (byte) (b17 - 1);
                    Object[] objArr23 = new Object[1];
                    charlie(b18, b17, b18, objArr23);
                    D8871 = uH18377.setPivotYN16904(i115, i116, c14, -1615832190, false, (String) objArr23[0], new Class[0]);
                }
                long longValue4 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                long j31 = -152006299;
                long j32 = -964;
                long j33 = (965 * longValue4) + ((-963) * j31) + j32;
                long j34 = longValue4 ^ j23;
                long j35 = ((((j34 | j26) ^ j23) | ((j34 | j31) ^ j23)) * j32) + (((j31 ^ j23) | ((j34 | j25) ^ j23)) * j32) + j33 + 331572016;
                int i117 = ((int) (j35 >> 32)) & ((((~(i108 | (-840992448))) | (~((-2016748438) | i4))) * 950) + (((~((-840992448) | i4)) | (~(i108 | (-2016748438)))) * (-950)) + (((~(840992447 | i108)) | (~(2016748437 | i4))) * 1900) + 1871737038);
                int i118 = ((int) j35) & ((((~((~Process.myTid()) | (-2139057469))) | (-701831059)) * HttpConstants.HTTP_USE_PROXY) + ((((~((-2139057469) | r2)) | 1445619756) * HttpConstants.HTTP_USE_PROXY) - 1704616964));
                int i119 = (i118 & i117) | (i117 ^ i118);
                int i120 = -(-(i119 - 1));
                int i121 = -i119;
                int i122 = ((i119 & i121) | (i119 ^ i121)) >> 31;
                int i123 = (~i122) & i4;
                int i124 = i122 & (i4 ^ ((i120 ^ 200) + ((i120 & 200) << 1)));
                int i125 = (i124 & i123) | (i123 ^ i124);
                int i126 = (~(i4 & i114)) & (i4 | i114);
                int i127 = -i126;
                int i128 = ((i126 & i127) | (i126 ^ i127)) >> 31;
                int i129 = i125 & (~i128);
                int i130 = i128 & i114;
                int i131 = (i129 & i130) | (i129 ^ i130);
                char c15 = (char) (19496 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))));
                int i132 = -View.getDefaultSize(0, 0);
                int i133 = (i132 & 203) + (i132 | 203);
                int i134 = -((byte) KeyEvent.getModifierMetaStateMask());
                int i135 = ((i134 | 19) << 1) - (i134 ^ 19);
                Object[] objArr24 = new Object[1];
                bravo(c15, i133, i135, objArr24);
                String str19 = (String) objArr24[0];
                int i136 = -(-ExpandableListView.getPackedPositionGroup(0L));
                int i137 = 222 - (~(-TextUtils.getOffsetAfter(str2, 0)));
                int argb = Color.argb(0, 0, 0, 0);
                int i138 = ((argb | 6) << 1) - (argb ^ 6);
                Object[] objArr25 = new Object[1];
                bravo((char) (((i136 | 64997) << 1) - (i136 ^ 64997)), i137, i138, objArr25);
                String str20 = (String) objArr25[0];
                file = new File(str19);
                if (file.exists()) {
                    int i139 = echo;
                    int i140 = (i139 ^ 111) + ((i139 & 111) << 1);
                    delta = i140 % 128;
                    if (i140 % 2 != 0) {
                        file.isFile();
                        throw null;
                    }
                    if (file.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file));
                            char c16 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i141 = 228 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                            int i142 = ((absoluteGravity | 2) << 1) - (absoluteGravity ^ 2);
                            Object[] objArr26 = new Object[1];
                            bravo(c16, i141, i142, objArr26);
                            Scanner useDelimiter = scanner.useDelimiter((String) objArr26[0]);
                            next3 = useDelimiter.hasNext() ? useDelimiter.next() : str2;
                            useDelimiter.close();
                        } catch (IOException unused) {
                        }
                        if (next3.contains(str20)) {
                            int i143 = echo;
                            int i144 = (i143 ^ 125) + ((i143 & 125) << 1);
                            delta = i144 % 128;
                            if (i144 % 2 == 0) {
                                i25 = 1;
                                int i145 = (i25 | (-i25)) >> 31;
                                int i146 = (i145 & ((i4 & (-263)) | (i108 & 262))) | ((~i145) & i4);
                                int i147 = ((~i131) & i4) | (i131 & i108);
                                int i148 = -i147;
                                int i149 = ((i147 & i148) | (i147 ^ i148)) >> 31;
                                int i150 = (i131 & i149) | (i146 & (~i149));
                                Object[] objArr27 = new Object[1];
                                bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetBefore(str2, 0) + 231, 29 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr27);
                                String str21 = (String) objArr27[0];
                                int i151 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int i152 = -View.MeasureSpec.getSize(0);
                                int i153 = (i152 ^ 262) + ((i152 & 262) << 1);
                                int indexOf2 = TextUtils.indexOf(str2, str2);
                                int D887113 = InvalidProxyIntegrationHeaders.D8871();
                                int i154 = indexOf2 * 714;
                                int i155 = (i154 ^ (-16376)) + ((i154 & (-16376)) << 1);
                                int i156 = ~indexOf2;
                                int i157 = ~D887113;
                                int i158 = ~((i156 ^ i157) | (i157 & i156));
                                int i159 = ~(i156 | 23);
                                int i160 = (i158 ^ i159) | (i158 & i159);
                                int i161 = ((-24) ^ indexOf2) | ((-24) & indexOf2);
                                int i162 = ~((i161 ^ D887113) | (i161 & D887113));
                                int i163 = (((i160 ^ i162) | (i160 & i162)) * (-713)) + i155;
                                int i164 = (indexOf2 & (-24)) | ((-24) ^ indexOf2);
                                int i165 = (~((i164 & D887113) | (i164 ^ D887113))) * 1426;
                                int i166 = (i163 ^ i165) + ((i163 & i165) << 1);
                                int i167 = ~D887113;
                                int i168 = -(-((~((i167 & (-24)) | ((-24) ^ i167))) * 713));
                                int i169 = (i166 ^ i168) + ((i168 & i166) << 1);
                                Object[] objArr28 = new Object[1];
                                bravo((char) ((i151 ^ (-1)) + (i151 << 1)), i153, i169, objArr28);
                                String str22 = (String) objArr28[0];
                                int i170 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i171 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 286;
                                int i172 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                int i173 = (i172 & 28) + (i172 | 28);
                                Object[] objArr29 = new Object[1];
                                bravo((char) (((i170 | 38243) << 1) - (i170 ^ 38243)), i171, i173, objArr29);
                                String str23 = (String) objArr29[0];
                                i26 = 1;
                                Object[] objArr30 = new Object[1];
                                bravo((char) (21273 - (~(-(-(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)))))), Process.getGidForName(str2) + 314, (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr30);
                                i27 = 0;
                                strArr = new String[]{str21, str22, str23, (String) objArr30[0]};
                                i28 = 0;
                                while (true) {
                                    if (i28 >= 4) {
                                        j5 = j25;
                                        i29 = i4;
                                        break;
                                    }
                                    Object[] objArr31 = new Object[i26];
                                    objArr31[i27] = strArr[i28];
                                    Object D887114 = uH18377.D8871(-2104138125);
                                    if (D887114 == null) {
                                        int defaultSize = View.getDefaultSize(i27, i27) + 52;
                                        int i174 = 2952 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        byte b19 = (byte) 1;
                                        byte b20 = (byte) (b19 - 1);
                                        strArr9 = strArr;
                                        j5 = j25;
                                        Object[] objArr32 = new Object[1];
                                        charlie(b20, b19, b20, objArr32);
                                        D887114 = uH18377.setPivotYN16904(defaultSize, i174, keyRepeatDelay, 1563346086, false, (String) objArr32[0], new Class[]{cls2});
                                    } else {
                                        strArr9 = strArr;
                                        j5 = j25;
                                    }
                                    long longValue5 = ((Long) ((Method) D887114).invoke(null, objArr31)).longValue();
                                    long j36 = -641106201;
                                    long j37 = -496;
                                    long j38 = (j37 * longValue5) + (j37 * j36);
                                    long j39 = 497;
                                    long j40 = j36 ^ j23;
                                    long j41 = longValue5 ^ j23;
                                    long j42 = j40 | j41;
                                    long j43 = ((j39 * ((((j40 | j26) ^ j23) | ((j40 | longValue5) ^ j23)) | (((j41 | j36) | j5) ^ j23))) + (((((j42 | j5) ^ j23) | (((j41 | j26) | j36) ^ j23)) * j39) + (((j42 ^ j23) * j39) + j38))) - 588514329;
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i175 = ~elapsedCpuTime;
                                    int i176 = ((int) (j43 >> 32)) & ((((~((-793034724) | i175)) | 151005728) * 859) + (((~(elapsedCpuTime | (-642028996))) | (~(644191687 | i175))) * 859) + (((644191687 | elapsedCpuTime) * (-859)) - 1864889930));
                                    int i177 = ~((-2028337105) | i108);
                                    int i178 = ((int) j43) & (((i177 | 52035622) * 970) + (((-2080372727) | i177) * (-970)) + 300911731);
                                    if (((i176 & i178) | (i176 ^ i178)) != 0) {
                                        int i179 = echo;
                                        int i180 = (i179 & 67) + (i179 | 67);
                                        delta = i180 % 128;
                                        if (i180 % 2 != 0) {
                                            i29 = ((i28 & (-6394)) + (i28 | (-6394))) ^ i4;
                                        } else {
                                            int i181 = i28 + 252;
                                            i29 = ((~i181) & i4) | (i181 & i108);
                                        }
                                    } else {
                                        int i182 = (i28 ^ (-106)) + ((i28 & (-106)) << 1);
                                        i28 = (i182 & 107) + (i182 | 107);
                                        strArr = strArr9;
                                        j25 = j5;
                                        i27 = 0;
                                        i26 = 1;
                                    }
                                }
                                int i183 = (~(i4 & i150)) & (i4 | i150);
                                int i184 = -i183;
                                int i185 = ((i183 & i184) | (i183 ^ i184)) >> 31;
                                int i186 = i29 & (~i185);
                                int i187 = i150 & i185;
                                int i188 = (i186 & i187) | (i186 ^ i187);
                                int i189 = -(-View.combineMeasuredStates(0, 0));
                                int indexOf3 = TextUtils.indexOf(str2, str2, 0);
                                Object[] objArr33 = new Object[1];
                                bravo((char) ((i189 & 878) + (i189 | 878)), (indexOf3 & 327) + (indexOf3 | 327), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, objArr33);
                                Object[] objArr34 = {(String) objArr33[0]};
                                D88712 = uH18377.D8871(-957097391);
                                if (D88712 == null) {
                                    int offsetBefore = TextUtils.getOffsetBefore(str2, 0) + 52;
                                    int i190 = 3159 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    char windowTouchSlop = (char) (58074 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                    byte b21 = (byte) (i11 & 3);
                                    byte b22 = (byte) (b21 - 2);
                                    Object[] objArr35 = new Object[1];
                                    charlie(b22, b21, b22, objArr35);
                                    D88712 = uH18377.setPivotYN16904(offsetBefore, i190, windowTouchSlop, 424179844, false, (String) objArr35[0], new Class[]{cls2});
                                }
                                str3 = (String) ((Method) D88712).invoke(null, objArr34);
                                if (str3 != null) {
                                    echo = (delta + 103) % 128;
                                    char c17 = (char) (47050 - (~(-Color.red(0))));
                                    int mode = View.MeasureSpec.getMode(0);
                                    int i191 = (mode ^ 340) + ((mode & 340) << 1);
                                    int i192 = -Color.green(0);
                                    int i193 = (i192 ^ 9) + ((i192 & 9) << 1);
                                    Object[] objArr36 = new Object[1];
                                    bravo(c17, i191, i193, objArr36);
                                    if (str3.contains((String) objArr36[0])) {
                                        i30 = (~(i4 & 250)) & (i4 | 250);
                                        int i194 = i4 ^ i188;
                                        int i195 = (i194 | (-i194)) >> 31;
                                        int i196 = i30 & (~i195);
                                        int i197 = i188 & i195;
                                        int i198 = (i197 & i196) | (i196 ^ i197);
                                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                        int i199 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                        int i200 = (i199 & 349) + (i199 | 349);
                                        int i201 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        int i202 = ((i201 | 17) << 1) - (i201 ^ 17);
                                        Object[] objArr37 = new Object[1];
                                        bravo(absoluteGravity2, i200, i202, objArr37);
                                        String str24 = (String) objArr37[0];
                                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int i203 = -ImageFormat.getBitsPerPixel(0);
                                        int i204 = (i203 ^ 365) + ((i203 & 365) << 1);
                                        int i205 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        int i206 = (i205 & 6) + (i205 | 6);
                                        Object[] objArr38 = new Object[1];
                                        bravo(scrollDefaultDelay, i204, i206, objArr38);
                                        Object[] objArr39 = new Object[i16];
                                        objArr39[1] = (String) objArr38[0];
                                        objArr39[0] = str24;
                                        D88713 = uH18377.D8871(1214576837);
                                        if (D88713 == null) {
                                            int minimumFlingVelocity = 52 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int minimumFlingVelocity2 = 3314 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            float f10 = f5;
                                            char c18 = (char) (TypedValue.complexToFraction(0, f10, f10) > f10 ? 1 : (TypedValue.complexToFraction(0, f10, f10) == f10 ? 0 : -1));
                                            byte b23 = (byte) (i11 & 3);
                                            byte b24 = (byte) (b23 - 1);
                                            Object[] objArr40 = new Object[1];
                                            charlie(b24, b23, b24, objArr40);
                                            D88713 = uH18377.setPivotYN16904(minimumFlingVelocity, minimumFlingVelocity2, c18, -1746970096, false, (String) objArr40[0], new Class[]{cls2, cls2});
                                        }
                                        long longValue6 = ((Long) ((Method) D88713).invoke(null, objArr39)).longValue();
                                        long j44 = 183599130;
                                        long j45 = -115;
                                        long maxMemory = (int) Runtime.getRuntime().maxMemory();
                                        long j46 = ((-116) * ((((maxMemory ^ j23) | j44) | longValue6) ^ j23)) + (j45 * longValue6) + (j45 * j44);
                                        long j47 = 116;
                                        long j48 = ((j44 | maxMemory) * j47) + j46;
                                        long j49 = j44 ^ j23;
                                        long j50 = longValue6 ^ j23;
                                        long j51 = ((j47 * (((j49 | j50) ^ j23) | ((maxMemory | j50) ^ j23))) + j48) - 1731237468;
                                        int i207 = ((int) (j51 >> 32)) & ((((~(1129112812 | i108)) | (-1733092845) | (~((-1124648041) | i4))) * 676) + (((~((-1728628073) | i108)) | 603980032) * 676) + ((((-603980033) | i4) * (-676)) - 108163526));
                                        int i208 = (~((-345946096) | i4)) | 345420390;
                                        int i209 = ~((-1782646801) | i108);
                                        int i210 = (i207 | (((int) j51) & (((i209 | (~((-525706) | i4))) * 470) + (((i208 | i209) * (-470)) + 1996566937)))) == 0 ? (~(i4 & 251)) & (i4 | 251) : i4;
                                        int i211 = (~(i4 & i198)) & (i4 | i198);
                                        int i212 = -i211;
                                        int i213 = ((i211 & i212) | (i211 ^ i212)) >> 31;
                                        int i214 = i210 & (~i213);
                                        int i215 = i213 & i198;
                                        int i216 = (i214 & i215) | (i214 ^ i215);
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                        int i217 = 371 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        int i218 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        int i219 = ((i218 | 23) << 1) - (i218 ^ 23);
                                        Object[] objArr41 = new Object[1];
                                        bravo((char) ((packedPositionChild & 1) + (packedPositionChild | 1)), i217, i219, objArr41);
                                        Object[] objArr42 = {(String) objArr41[0]};
                                        D88714 = uH18377.D8871(-957097391);
                                        if (D88714 == null) {
                                            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 53;
                                            int indexOf4 = TextUtils.indexOf(str2, str2) + 3158;
                                            char lastIndexOf2 = (char) (58073 - TextUtils.lastIndexOf(str2, '0'));
                                            byte b25 = (byte) (i11 & 3);
                                            byte b26 = (byte) (b25 - 2);
                                            Object[] objArr43 = new Object[1];
                                            charlie(b26, b25, b26, objArr43);
                                            D88714 = uH18377.setPivotYN16904(modifierMetaStateMask2, indexOf4, lastIndexOf2, 424179844, false, (String) objArr43[0], new Class[]{cls2});
                                        }
                                        lowerCase = ((String) ((Method) D88714).invoke(null, objArr42)).toLowerCase();
                                        int i220 = -View.combineMeasuredStates(0, 0);
                                        int i221 = -TextUtils.indexOf(str2, str2, 0);
                                        objArr = new Object[1];
                                        bravo((char) ((i220 & 32713) + (i220 | 32713)), ((i221 | 395) << 1) - (i221 ^ 395), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr);
                                        if (lowerCase.contains((String) objArr[0])) {
                                            i31 = i4;
                                        } else {
                                            int i222 = ~(((-1636059876) & i4) | ((-1636059876) ^ i4));
                                            int i223 = -(-(((i222 & 553928897) | (553928897 ^ i222)) * (-566)));
                                            int i224 = ((-1874695741) ^ i223) + ((i223 & (-1874695741)) << 1);
                                            int i225 = (((i224 ^ (-1550040304)) + (((-1550040304) & i224) << 1)) - (~((~(((-1082130979) & i4) | ((-1082130979) ^ i4))) * 566))) - 1;
                                            int D887115 = InvalidProxyIntegrationHeaders.D8871();
                                            int i226 = ~((~D887115) | (-1185074305));
                                            int i227 = -(-(((i226 & 1075987584) | (i226 ^ 1075987584)) * 529));
                                            i31 = i225 <= ((((-1268882534) ^ i227) + ((i227 & (-1268882534)) << 1)) - (~(-(-(((~((D887115 & (-1185074305)) | ((-1185074305) ^ D887115))) | (-915257694)) * 529))))) + (-1) ? (i4 & (-26736)) | (i108 & 26735) : (~(i4 & 264)) & (i4 | 264);
                                        }
                                        int i228 = ((~i216) & i4) | (i216 & i108);
                                        int i229 = -i228;
                                        int i230 = ((i228 & i229) | (i228 ^ i229)) >> 31;
                                        int i231 = i31 & (~i230);
                                        int i232 = i216 & i230;
                                        int i233 = (i232 & i231) | (i231 ^ i232);
                                        char c19 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41046);
                                        int i234 = -TextUtils.indexOf(str2, str2);
                                        Object[] objArr44 = new Object[1];
                                        bravo(c19, (i234 ^ 399) + ((i234 & 399) << 1), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr44);
                                        String str25 = (String) objArr44[0];
                                        char normalizeMetaState3 = (char) KeyEvent.normalizeMetaState(0);
                                        int i235 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i236 = ((i235 | 441) << 1) - (i235 ^ 441);
                                        int i237 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i238 = ((i237 | 40) << 1) - (i237 ^ 40);
                                        Object[] objArr45 = new Object[1];
                                        bravo(normalizeMetaState3, i236, i238, objArr45);
                                        String str26 = (String) objArr45[0];
                                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                        int i239 = (jumpTapTimeout * (-375)) - 7889625;
                                        int i240 = ~jumpTapTimeout;
                                        int i241 = (~((i240 ^ (-21040)) | (i240 & (-21040)))) | i4;
                                        int i242 = ~((jumpTapTimeout ^ 21039) | (jumpTapTimeout & 21039));
                                        int i243 = -(-(((i241 & i242) | (i241 ^ i242)) * 376));
                                        int i244 = ((i239 | i243) << 1) - (i239 ^ i243);
                                        int i245 = ~((jumpTapTimeout & i108) | (i108 ^ jumpTapTimeout));
                                        int i246 = ((i245 & i242) | (i245 ^ i242)) * (-376);
                                        int i247 = (i244 & i246) + (i246 | i244);
                                        int i248 = ~(i240 | i4);
                                        char c20 = (char) ((((i248 & 21039) | (i248 ^ 21039)) * 376) + i247);
                                        int i249 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        int i250 = (i249 ^ 482) + ((i249 & 482) << 1);
                                        int indexOf5 = TextUtils.indexOf(str2, str2, 0, 0);
                                        int i251 = (indexOf5 & 27) + (indexOf5 | 27);
                                        Object[] objArr46 = new Object[1];
                                        bravo(c20, i250, i251, objArr46);
                                        String str27 = (String) objArr46[0];
                                        char gidForName2 = (char) (Process.getGidForName(str2) + 21044);
                                        int i252 = -(-TextUtils.indexOf(str2, str2, 0));
                                        int i253 = (i252 ^ 508) + ((i252 & 508) << 1);
                                        int i254 = -(-View.resolveSize(0, 0));
                                        int i255 = (i254 ^ 27) + ((i254 & 27) << 1);
                                        Object[] objArr47 = new Object[1];
                                        bravo(gidForName2, i253, i255, objArr47);
                                        String str28 = (String) objArr47[0];
                                        int i256 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int D887116 = InvalidProxyIntegrationHeaders.D8871();
                                        int i257 = i256 * 905;
                                        int i258 = (i257 ^ 903) + ((i257 & 903) << 1);
                                        int i259 = ~i256;
                                        int i260 = ~(i259 | D887116);
                                        int i261 = ~D887116;
                                        int i262 = ~((~i261) | i261);
                                        int i263 = (((i260 & i262) | (i260 ^ i262)) * (-1808)) + i258;
                                        int i264 = (i261 ^ i256) | (i261 & i256);
                                        int i265 = ((~((i259 ^ D887116) | (i259 & D887116))) | (~(i264 | (~i264)))) * 904;
                                        int i266 = ((i263 | i265) << 1) - (i265 ^ i263);
                                        int i267 = ~(i259 | (~i259));
                                        int i268 = ~D887116;
                                        int i269 = (i268 & i267) | (i267 ^ i268);
                                        int i270 = ~((i256 & i261) | (i261 ^ i256));
                                        Object[] objArr48 = new Object[1];
                                        bravo((char) ((i266 - (~(-(-(((i270 & i269) | (i269 ^ i270)) * 904))))) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 534, KeyEvent.keyCodeFromString(str2) + 27, objArr48);
                                        String str29 = (String) objArr48[0];
                                        char gidForName3 = (char) ((-1) - Process.getGidForName(str2));
                                        int i271 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        Object[] objArr49 = new Object[1];
                                        bravo(gidForName3, (i271 & 561) + (i271 | 561), View.resolveSizeAndState(0, 0, 0) + 27, objArr49);
                                        strArr2 = new String[]{str25, str26, str27, str28, str29, (String) objArr49[0]};
                                        i32 = i13;
                                        i33 = 0;
                                        while (true) {
                                            if (i33 < i32) {
                                                i34 = i4;
                                                break;
                                            }
                                            int i272 = echo;
                                            delta = ((i272 & 25) + (i272 | 25)) % 128;
                                            Object[] objArr50 = {strArr2[i33]};
                                            Object D887117 = uH18377.D8871(-957097391);
                                            if (D887117 == null) {
                                                int argb2 = Color.argb(0, 0, 0, 0) + 52;
                                                int normalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 3158;
                                                char c21 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58073);
                                                byte b27 = (byte) (i11 & 3);
                                                byte b28 = (byte) (b27 - 2);
                                                strArr8 = strArr2;
                                                Object[] objArr51 = new Object[1];
                                                charlie(b28, b27, b28, objArr51);
                                                D887117 = uH18377.setPivotYN16904(argb2, normalizeMetaState4, c21, 424179844, false, (String) objArr51[0], new Class[]{cls2});
                                            } else {
                                                strArr8 = strArr2;
                                            }
                                            String str30 = (String) ((Method) D887117).invoke(null, objArr50);
                                            if (str30 != null) {
                                                int i273 = echo;
                                                int i274 = ((i273 | 109) << 1) - (i273 ^ 109);
                                                delta = i274 % 128;
                                                if (i274 % 2 != 0) {
                                                    throw null;
                                                }
                                                if (!str30.isEmpty()) {
                                                    i34 = i4 ^ 265;
                                                    break;
                                                }
                                            }
                                            i33++;
                                            strArr2 = strArr8;
                                            i32 = 6;
                                        }
                                        int i275 = ((~i233) & i4) | (i233 & i108);
                                        int i276 = -i275;
                                        int i277 = ((i275 & i276) | (i275 ^ i276)) >> 31;
                                        int i278 = i34 & (~i277);
                                        int i279 = i233 & i277;
                                        int i280 = (i279 & i278) | (i278 ^ i279);
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i281 = -Drawable.resolveOpacity(0, 0);
                                        int i282 = (i281 ^ 349) + ((i281 & 349) << 1);
                                        int i283 = -TextUtils.indexOf(str2, str2, 0);
                                        int i284 = (i283 ^ 17) + ((i283 & 17) << 1);
                                        Object[] objArr52 = new Object[1];
                                        bravo(fadingEdgeLength, i282, i284, objArr52);
                                        String str31 = (String) objArr52[0];
                                        char indexOf6 = (char) (6383 - TextUtils.indexOf((CharSequence) str2, '0', 0));
                                        int i285 = -Color.red(0);
                                        int i286 = (i285 ^ 589) + ((i285 & 589) << 1);
                                        int i287 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        int i288 = ((i287 | 6) << 1) - (i287 ^ 6);
                                        Object[] objArr53 = new Object[1];
                                        bravo(indexOf6, i286, i288, objArr53);
                                        str4 = (String) objArr53[0];
                                        file2 = new File(str31);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                                                int i289 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                Object[] objArr54 = new Object[1];
                                                bravo(packedPositionType2, (i289 & 230) + (i289 | 230), 2 - TextUtils.indexOf(str2, str2), objArr54);
                                                Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr54[0]);
                                                next2 = !useDelimiter2.hasNext() ? useDelimiter2.next() : str2;
                                                useDelimiter2.close();
                                            } catch (IOException unused2) {
                                            }
                                            if (next2.contains(str4)) {
                                                int i290 = echo;
                                                int i291 = ((i290 | 81) << 1) - (i290 ^ 81);
                                                delta = i291 % 128;
                                                if (i291 % 2 == 0) {
                                                    i36 = ~(i4 & 260);
                                                    i37 = i4 | 260;
                                                    i35 = i36 & i37;
                                                    int i292 = i4 ^ i280;
                                                    int i293 = (i292 | (-i292)) >> 31;
                                                    int i294 = i35 & (~i293);
                                                    int i295 = i280 & i293;
                                                    i38 = (i295 & i294) | (i294 ^ i295);
                                                    if ((i5 & 8) == 0) {
                                                    }
                                                    int i296 = -Color.red(0);
                                                    int i297 = -(-(Process.myPid() >> 22));
                                                    Object[] objArr55 = new Object[1];
                                                    bravo((char) ((i296 ^ 18372) + ((i296 & 18372) << 1)), (i297 ^ 739) + ((i297 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr55);
                                                    String str32 = (String) objArr55[0];
                                                    char c22 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                    int i298 = (maximumDrawingCacheSize & 780) + (maximumDrawingCacheSize | 780);
                                                    int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                    i39 = 1;
                                                    int i299 = (keyRepeatDelay2 ^ 30) + ((keyRepeatDelay2 & 30) << 1);
                                                    Object[] objArr56 = new Object[1];
                                                    bravo(c22, i298, i299, objArr56);
                                                    c3 = 0;
                                                    strArr3 = new String[]{str32, (String) objArr56[0]};
                                                    i40 = 0;
                                                    while (true) {
                                                        if (i40 >= 2) {
                                                        }
                                                        i40++;
                                                        i38 = i41;
                                                        strArr3 = strArr7;
                                                        i39 = 1;
                                                        c3 = 0;
                                                    }
                                                    int i300 = i4 ^ i41;
                                                    int i301 = -i300;
                                                    int i302 = ((i300 & i301) | (i300 ^ i301)) >> 31;
                                                    int i303 = i42 & (~i302);
                                                    int i304 = i41 & i302;
                                                    int i305 = (i303 & i304) | (i303 ^ i304);
                                                    D88715 = uH18377.D8871(-344556366);
                                                    if (D88715 == null) {
                                                    }
                                                    long longValue7 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                    long j52 = 43243451;
                                                    long j53 = 628;
                                                    long j54 = -627;
                                                    long uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                    long j55 = ((627 * ((((uptimeMillis2 ^ j6) | longValue7) ^ j6) | ((j52 | uptimeMillis2) ^ j6))) + ((j54 * ((((longValue7 ^ j6) | uptimeMillis2) ^ j6) | j52)) + ((((longValue7 | uptimeMillis2) | (j52 ^ j6)) * j54) + ((j53 * longValue7) + (j53 * j52))))) - 195496549;
                                                    int myTid3 = Process.myTid();
                                                    i43 = ((int) (j55 >> 32)) & (((myTid3 | (-1292370017)) * 220) + (((~((~myTid3) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                                                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                    i44 = ((int) j55) & ((((~(elapsedCpuTime2 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime2)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime2) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                                                    if (((i43 & i44) | (i43 ^ i44)) != 1) {
                                                    }
                                                    int i306 = (~(i4 & i305)) & (i4 | i305);
                                                    int i307 = -i306;
                                                    int i308 = (((i306 & i307) | (i306 ^ i307)) >> 31) & 16;
                                                    Object[] objArr57 = {new int[]{i305}, new int[]{i4}, new int[1], strArr4};
                                                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                    int i309 = (((~(elapsedCpuTime3 | (-674538))) | (~((~elapsedCpuTime3) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime3))) * 210) - 585050909);
                                                    int i310 = (i309 ^ i308) + ((i309 & i308) << 1);
                                                    int i311 = (i10 & i310) + (i10 | i310);
                                                    int i312 = i311 << 13;
                                                    int i313 = (i311 | i312) & (~(i311 & i312));
                                                    int i314 = i313 >>> 17;
                                                    int i315 = ((~i313) & i314) | ((~i314) & i313);
                                                    int i316 = i315 << 5;
                                                    ((int[]) objArr57[2])[0] = ((~i315) & i316) | ((~i316) & i315);
                                                    return objArr57;
                                                }
                                                i35 = (i4 & (-1927)) | (i108 & 1926);
                                                int i2922 = i4 ^ i280;
                                                int i2932 = (i2922 | (-i2922)) >> 31;
                                                int i2942 = i35 & (~i2932);
                                                int i2952 = i280 & i2932;
                                                i38 = (i2952 & i2942) | (i2942 ^ i2952);
                                                if ((i5 & 8) == 0) {
                                                    int i317 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i318 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                    Object[] objArr58 = new Object[1];
                                                    bravo((char) ((i317 & 1) + (i317 | 1)), (i318 ^ 616) + ((i318 & 616) << 1), 42 - (~(-TextUtils.getTrimmedLength(str2))), objArr58);
                                                    String str33 = (String) objArr58[0];
                                                    int indexOf7 = TextUtils.indexOf((CharSequence) str2, '0', 0, 0);
                                                    int i319 = 660 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int combineMeasuredStates = View.combineMeasuredStates(0, 0);
                                                    int D887118 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i320 = combineMeasuredStates * (-963);
                                                    int i321 = ((i320 & (-964)) + (i320 | (-964))) - (-39565);
                                                    int i322 = ~combineMeasuredStates;
                                                    int i323 = ~(((-42) ^ D887118) | ((-42) & D887118));
                                                    int i324 = (i321 - (~(((i322 ^ i323) | (i322 & i323)) * (-964)))) - 1;
                                                    int i325 = ~D887118;
                                                    int i326 = -(-(((~(combineMeasuredStates | (-42))) | (~((i325 & (-42)) | ((-42) ^ i325)))) * (-964)));
                                                    int i327 = ((i324 | i326) << 1) - (i326 ^ i324);
                                                    Object[] objArr59 = new Object[1];
                                                    bravo((char) (((indexOf7 | 1) << 1) - (indexOf7 ^ 1)), i319, i327, objArr59);
                                                    String str34 = (String) objArr59[0];
                                                    byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                                                    int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 701;
                                                    int i328 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int i329 = 1;
                                                    int i330 = (i328 ^ 38) + ((i328 & 38) << 1);
                                                    Object[] objArr60 = new Object[1];
                                                    bravo((char) (((modifierMetaStateMask3 | 1) << 1) - (modifierMetaStateMask3 ^ 1)), resolveOpacity2, i330, objArr60);
                                                    int i331 = 0;
                                                    String[] strArr14 = {str33, str34, (String) objArr60[0]};
                                                    int i332 = 0;
                                                    while (true) {
                                                        if (i332 < 3) {
                                                            Object[] objArr61 = new Object[i329];
                                                            objArr61[i331] = strArr14[i332];
                                                            Object D887119 = uH18377.D8871(1979478258);
                                                            if (D887119 == null) {
                                                                int normalizeMetaState5 = 52 - KeyEvent.normalizeMetaState(i331);
                                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2951;
                                                                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                                byte b29 = (byte) 0;
                                                                byte b30 = b29;
                                                                i57 = i38;
                                                                Object[] objArr62 = new Object[1];
                                                                charlie(b30, b29, b30, objArr62);
                                                                D887119 = uH18377.setPivotYN16904(normalizeMetaState5, edgeSlop, edgeSlop2, -1438133721, false, (String) objArr62[0], new Class[]{cls2});
                                                            } else {
                                                                i57 = i38;
                                                            }
                                                            long longValue8 = ((Long) ((Method) D887119).invoke(null, objArr61)).longValue();
                                                            long j56 = 382709009;
                                                            String[] strArr15 = strArr14;
                                                            j6 = j23;
                                                            long j57 = 216;
                                                            long freeMemory = (int) Runtime.getRuntime().freeMemory();
                                                            long j58 = (((j56 | freeMemory) ^ j6) * j57) + ((-215) * longValue8) + (217 * j56);
                                                            long j59 = freeMemory ^ j6;
                                                            long j60 = (j57 * (((j59 | j56) ^ j6) | longValue8)) + ((-216) * (j56 | (longValue8 ^ j6) | j59)) + j58 + 392112297;
                                                            int myPid = Process.myPid();
                                                            int i333 = ((int) (j60 >> 32)) & (((myPid | 160734094) * 104) + ((~((~myPid) | 1301658526)) * (-104)) + ((((~((-1276492317) | myPid)) | 135567884) * 104) - 2005432166));
                                                            int i334 = (int) j60;
                                                            int romeo = ao.ad.romeo();
                                                            int i335 = ~romeo;
                                                            int i336 = i334 & ((((~((-1858285766) | i335)) | (-999455121)) * 68) + ((~((-286279953) | i335)) * (-68)) + (((~(romeo | 1858285765)) | (~((-713175169) | i335)) | (-2144565718)) * (-68)) + 291831873);
                                                            if (((i333 & i336) | (i333 ^ i336)) != 0) {
                                                                int i337 = i332 + 280;
                                                                i58 = ((~i337) & i4) | (i337 & i108);
                                                                break;
                                                            }
                                                            int i338 = (i332 & 67) + (i332 | 67);
                                                            i332 = (i338 ^ (-66)) + ((i338 & (-66)) << 1);
                                                            strArr14 = strArr15;
                                                            i38 = i57;
                                                            j23 = j6;
                                                            i329 = 1;
                                                            i331 = 0;
                                                        } else {
                                                            i57 = i38;
                                                            j6 = j23;
                                                            echo = (delta + 67) % 128;
                                                            i58 = i4;
                                                            break;
                                                        }
                                                    }
                                                    int i339 = (~(i4 & i57)) & (i4 | i57);
                                                    int i340 = (i339 | (-i339)) >> 31;
                                                    int i341 = i58 & (~i340);
                                                    int i342 = i57 & i340;
                                                    i38 = (i341 & i342) | (i341 ^ i342);
                                                } else {
                                                    j6 = j23;
                                                }
                                                int i2962 = -Color.red(0);
                                                int i2972 = -(-(Process.myPid() >> 22));
                                                Object[] objArr552 = new Object[1];
                                                bravo((char) ((i2962 ^ 18372) + ((i2962 & 18372) << 1)), (i2972 ^ 739) + ((i2972 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr552);
                                                String str322 = (String) objArr552[0];
                                                char c222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                int i2982 = (maximumDrawingCacheSize2 & 780) + (maximumDrawingCacheSize2 | 780);
                                                int keyRepeatDelay22 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                i39 = 1;
                                                int i2992 = (keyRepeatDelay22 ^ 30) + ((keyRepeatDelay22 & 30) << 1);
                                                Object[] objArr562 = new Object[1];
                                                bravo(c222, i2982, i2992, objArr562);
                                                c3 = 0;
                                                strArr3 = new String[]{str322, (String) objArr562[0]};
                                                i40 = 0;
                                                while (true) {
                                                    if (i40 >= 2) {
                                                        i41 = i38;
                                                        i42 = i4;
                                                        break;
                                                    }
                                                    Object[] objArr63 = new Object[i39];
                                                    objArr63[c3] = strArr3[i40];
                                                    Object D887120 = uH18377.D8871(1565484532);
                                                    if (D887120 == null) {
                                                        int i343 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
                                                        int scrollDefaultDelay2 = 2951 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        byte b31 = (byte) (i11 & 3);
                                                        byte b32 = (byte) (b31 - 1);
                                                        Object[] objArr64 = new Object[1];
                                                        charlie(b32, b31, b32, objArr64);
                                                        D887120 = uH18377.setPivotYN16904(i343, scrollDefaultDelay2, minimumFlingVelocity3, -2097887455, false, (String) objArr64[0], new Class[]{cls2});
                                                    }
                                                    long longValue9 = ((Long) ((Method) D887120).invoke(null, objArr63)).longValue();
                                                    long j61 = -727870044;
                                                    long j62 = (949 * longValue9) + ((-947) * j61);
                                                    long j63 = -948;
                                                    long j64 = j61 ^ j6;
                                                    long j65 = longValue9 ^ j6;
                                                    i41 = i38;
                                                    strArr7 = strArr3;
                                                    long myPid2 = Process.myPid();
                                                    long j66 = (948 * (j65 | j61)) + (j63 * (((myPid2 ^ j6) | (j64 | j65)) ^ j6)) + ((j64 | ((j65 | myPid2) ^ j6)) * j63) + j62 + 1683023946;
                                                    int i344 = ((int) (j66 >> 32)) & ((((~((-1955860433) | i108)) | (-1976934357)) * 420) + ((~((-1955860433) | i4)) * 420) + 1698340318);
                                                    int i345 = (((~((-703344988) | i4)) | 6828122 | (~(2140571397 | i4))) * (-880)) + 818884229;
                                                    int i346 = (~((-703344988) | i108)) | (-2140571398);
                                                    int i347 = ~(703344987 | i4);
                                                    int i348 = ((int) j66) & ((i347 * 880) + ((i346 | i347) * (-880)) + i345);
                                                    if (((i348 & i344) | (i344 ^ i348)) != 0) {
                                                        int i349 = ((i40 | 288) << 1) - (i40 ^ 288);
                                                        i42 = (i349 & i108) | ((~i349) & i4);
                                                        break;
                                                    }
                                                    i40++;
                                                    i38 = i41;
                                                    strArr3 = strArr7;
                                                    i39 = 1;
                                                    c3 = 0;
                                                }
                                                int i3002 = i4 ^ i41;
                                                int i3012 = -i3002;
                                                int i3022 = ((i3002 & i3012) | (i3002 ^ i3012)) >> 31;
                                                int i3032 = i42 & (~i3022);
                                                int i3042 = i41 & i3022;
                                                int i3052 = (i3032 & i3042) | (i3032 ^ i3042);
                                                D88715 = uH18377.D8871(-344556366);
                                                if (D88715 == null) {
                                                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 53;
                                                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 3106;
                                                    char c23 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15991);
                                                    byte b33 = (byte) (i11 & 3);
                                                    byte b34 = (byte) (b33 - 1);
                                                    Object[] objArr65 = new Object[1];
                                                    charlie(b34, b33, b34, objArr65);
                                                    D88715 = uH18377.setPivotYN16904(bitsPerPixel2, edgeSlop3, c23, 885907047, false, (String) objArr65[0], new Class[0]);
                                                }
                                                long longValue72 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                long j522 = 43243451;
                                                long j532 = 628;
                                                long j542 = -627;
                                                long uptimeMillis22 = (int) SystemClock.uptimeMillis();
                                                long j552 = ((627 * ((((uptimeMillis22 ^ j6) | longValue72) ^ j6) | ((j522 | uptimeMillis22) ^ j6))) + ((j542 * ((((longValue72 ^ j6) | uptimeMillis22) ^ j6) | j522)) + ((((longValue72 | uptimeMillis22) | (j522 ^ j6)) * j542) + ((j532 * longValue72) + (j532 * j522))))) - 195496549;
                                                int myTid32 = Process.myTid();
                                                i43 = ((int) (j552 >> 32)) & (((myTid32 | (-1292370017)) * 220) + (((~((~myTid32) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                                                int elapsedCpuTime22 = (int) Process.getElapsedCpuTime();
                                                i44 = ((int) j552) & ((((~(elapsedCpuTime22 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime22)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime22) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                                                if (((i43 & i44) | (i43 ^ i44)) != 1) {
                                                    Object[] objArr66 = {1};
                                                    Object D887121 = uH18377.D8871(-38624464);
                                                    if (D887121 == null) {
                                                        int myTid4 = 52 - (Process.myTid() >> 22);
                                                        int i350 = 2848 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                        char deadChar2 = (char) (62567 - KeyEvent.getDeadChar(0, 0));
                                                        byte b35 = (byte) (i11 & 3);
                                                        byte b36 = (byte) (b35 - 1);
                                                        Object[] objArr67 = new Object[1];
                                                        charlie(b36, b35, b36, objArr67);
                                                        D887121 = uH18377.setPivotYN16904(myTid4, i350, deadChar2, 571015653, false, (String) objArr67[0], new Class[]{Integer.TYPE});
                                                    }
                                                    long longValue10 = ((Long) ((Method) D887121).invoke(null, objArr66)).longValue();
                                                    long j67 = 858259452;
                                                    long j68 = ((-67) * longValue10) + (69 * j67);
                                                    long j69 = -68;
                                                    long j70 = j67 ^ j6;
                                                    long j71 = longValue10 ^ j6;
                                                    long myPid3 = Process.myPid();
                                                    long j72 = myPid3 ^ j6;
                                                    long j73 = (68 * (((j71 | j72) ^ j6) | j70)) + (j69 * (((j70 | j72) | longValue10) ^ j6)) + ((((longValue10 | myPid3) ^ j6) | (((j70 | j71) | j72) ^ j6) | ((j67 | longValue10) ^ j6)) * j69) + j68 + 1133867314;
                                                    int tango2 = ao.ad.tango(1747654671);
                                                    int i351 = ~tango2;
                                                    int i352 = (((~(1036535106 | i351)) | 35786792) * (-1188)) + 181600434;
                                                    int i353 = (~(tango2 | (-1036535107))) | 35786792;
                                                    int i354 = ~(400691304 | i351);
                                                    int i355 = ((int) (j73 >> 32)) & ((((~(i351 | (-1036535107))) | 671630594 | i354) * 594) + ((i353 | i354) * 594) + i352);
                                                    int foxtrot3 = ((int) j73) & A0.z.foxtrot((~(ao.ad.tango(1532463895) | (-2361665))) | 536887313, 446, (((~((~r3) | (-1161607619))) | 1159245954) * 446) - 384374209, 1627619964);
                                                    int i356 = ((foxtrot3 & i355) | (i355 ^ foxtrot3)) != 0 ? (~(i4 & 220)) & (i4 | 220) : i4;
                                                    int i357 = ((~i3052) & i4) | (i3052 & i108);
                                                    int i358 = -i357;
                                                    int i359 = ((i357 & i358) | (i357 ^ i358)) >> 31;
                                                    int i360 = i356 & (~i359);
                                                    int i361 = i3052 & i359;
                                                    int i362 = (i361 & i360) | (i360 ^ i361);
                                                    char resolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                                                    int i363 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    Object[] objArr68 = new Object[1];
                                                    bravo(resolveOpacity3, (i363 ^ 372) + ((i363 & 372) << 1), 22 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr68);
                                                    Object[] objArr69 = {(String) objArr68[0]};
                                                    Object D887122 = uH18377.D8871(-957097391);
                                                    if (D887122 == null) {
                                                        int keyRepeatDelay3 = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        int i364 = 3159 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 58074);
                                                        byte b37 = (byte) (i11 & 3);
                                                        byte b38 = (byte) (b37 - 2);
                                                        Object[] objArr70 = new Object[1];
                                                        charlie(b38, b37, b38, objArr70);
                                                        D887122 = uH18377.setPivotYN16904(keyRepeatDelay3, i364, scrollDefaultDelay3, 424179844, false, (String) objArr70[0], new Class[]{cls2});
                                                    }
                                                    Object invoke2 = ((Method) D887122).invoke(null, objArr69);
                                                    if (invoke2 != null) {
                                                        Object[] objArr71 = {invoke2, 42};
                                                        Object D887123 = uH18377.D8871(2072770498);
                                                        if (D887123 == null) {
                                                            int indexOf8 = TextUtils.indexOf(str2, str2, 0) + 51;
                                                            int offsetBefore2 = 1209 - TextUtils.getOffsetBefore(str2, 0);
                                                            char mirror2 = (char) (44404 - AndroidCharacter.getMirror('0'));
                                                            byte b39 = (byte) (i11 & 3);
                                                            byte b40 = (byte) (b39 - 1);
                                                            Object[] objArr72 = new Object[1];
                                                            charlie(b40, b39, b40, objArr72);
                                                            D887123 = uH18377.setPivotYN16904(indexOf8, offsetBefore2, mirror2, -1540336361, false, (String) objArr72[0], new Class[]{cls2, Integer.TYPE});
                                                        }
                                                        long longValue11 = ((Long) ((Method) D887123).invoke(null, objArr71)).longValue();
                                                        long j74 = 882723464;
                                                        long j75 = 764;
                                                        str6 = str2;
                                                        long freeMemory2 = ((int) Runtime.getRuntime().freeMemory()) ^ j6;
                                                        long j76 = (freeMemory2 | j74) ^ j6;
                                                        long j77 = ((j74 ^ j6) | longValue11) ^ j6;
                                                        long j78 = ((j75 * ((j77 | (((longValue11 ^ j6) | j74) ^ j6)) | j76)) + (((-1528) * (j77 | ((freeMemory2 | longValue11) ^ j6))) + (((longValue11 | j76) * j75) + (((-1527) * longValue11) + (765 * j74))))) - 890168494;
                                                        int myUid = Process.myUid();
                                                        int i365 = ((int) (j78 >> 32)) & ((((~((~myUid) | 1897737653)) | 460511242) * 168) + (((~(1897737653 | myUid)) | 174247946) * (-168)) + (((~(460511242 | myUid)) | 1611474357) * 336) + 501358106);
                                                        int i366 = ((int) j78) & ((((~(2057181514 | i108)) | (-1428785218)) * 494) + (((-86081538) | i108) * 494) + 8035231);
                                                        if (((i365 & i366) | (i365 ^ i366)) == 1986687685) {
                                                            i45 = i108;
                                                            strArr5 = null;
                                                            i46 = 0;
                                                            Object[] objArr73 = new Object[1];
                                                            bravo((char) (42099 - View.MeasureSpec.getMode(i46)), (ViewConfiguration.getTouchSlop() >> 8) + 891, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr73);
                                                            Object[] objArr74 = {(String) objArr73[0]};
                                                            D88716 = uH18377.D8871(-957097391);
                                                            if (D88716 == null) {
                                                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 52;
                                                                int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 3158;
                                                                char c24 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58074);
                                                                byte b41 = (byte) (i11 & 3);
                                                                byte b42 = (byte) (b41 - 2);
                                                                Object[] objArr75 = new Object[1];
                                                                charlie(b42, b41, b42, objArr75);
                                                                D88716 = uH18377.setPivotYN16904(maxKeyCode, combineMeasuredStates2, c24, 424179844, false, (String) objArr75[0], new Class[]{cls2});
                                                            }
                                                            invoke = ((Method) D88716).invoke(null, objArr74);
                                                            if (invoke != null) {
                                                                i49 = 0;
                                                            } else {
                                                                Object[] objArr76 = {invoke, 42};
                                                                Object D887124 = uH18377.D8871(2072770498);
                                                                if (D887124 == null) {
                                                                    int offsetAfter = TextUtils.getOffsetAfter(str6, 0) + 51;
                                                                    int indexOf9 = 1208 - TextUtils.indexOf((CharSequence) str6, '0', 0);
                                                                    char minimumFlingVelocity4 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44356);
                                                                    byte b43 = (byte) (i11 & 3);
                                                                    byte b44 = (byte) (b43 - 1);
                                                                    Object[] objArr77 = new Object[1];
                                                                    charlie(b44, b43, b44, objArr77);
                                                                    D887124 = uH18377.setPivotYN16904(offsetAfter, indexOf9, minimumFlingVelocity4, -1540336361, false, (String) objArr77[0], new Class[]{cls2, Integer.TYPE});
                                                                }
                                                                long longValue12 = ((Long) ((Method) D887124).invoke(null, objArr76)).longValue();
                                                                long j79 = 1711017333;
                                                                long j80 = -919;
                                                                long j81 = 920;
                                                                long j82 = j79 ^ j6;
                                                                long j83 = longValue12 ^ j6;
                                                                long j84 = j82 | j83;
                                                                long j85 = ((j81 * ((((j84 | j26) ^ j6) | (((j82 | longValue12) | j5) ^ j6)) | (((j83 | j79) | j5) ^ j6))) + ((((j84 ^ j6) | ((j82 | j26) ^ j6)) * j81) + (((((j84 | j5) ^ j6) | (((j83 | j26) | j79) ^ j6)) * j81) + ((j80 * longValue12) + (j80 * j79))))) - 1718462363;
                                                                int i367 = ((int) (j85 >> 32)) & ((((~(i45 | (-575092836))) | (~((-2012319247) | i45)) | 574687234) * 50) + (((~((-1437632013) | i4)) | (~(i45 | (-574687235)))) * 50) + (((-575092836) | i4) * (-50)) + 915641190);
                                                                int i368 = ((int) j85) & ((((~(916937482 | i4)) | 547684608 | (~(i45 | (-520288928)))) * 904) + (((~(1067973535 | i4)) | (~(i45 | (-369252875)))) * 904) + (((~(520288927 | i4)) | (~(i45 | (-916937483)))) * (-1808)) + 650781741);
                                                                i49 = (i367 & i368) | (i367 ^ i368);
                                                            }
                                                            if (i49 != 1986687685) {
                                                                echo = (delta + 7) % 128;
                                                                if (i49 != -1514516938) {
                                                                    char minimumFlingVelocity5 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                    int resolveSize2 = View.resolveSize(0, 0);
                                                                    int i369 = ((resolveSize2 | 1610) << 1) - (resolveSize2 ^ 1610);
                                                                    int i370 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                    int i371 = (i370 & 15) + (i370 | 15);
                                                                    Object[] objArr78 = new Object[1];
                                                                    bravo(minimumFlingVelocity5, i369, i371, objArr78);
                                                                    String str35 = (String) objArr78[0];
                                                                    int lastIndexOf3 = TextUtils.lastIndexOf(str6, '0', 0);
                                                                    int indexOf10 = TextUtils.indexOf(str6, str6);
                                                                    int i372 = (indexOf10 ^ 1624) + ((indexOf10 & 1624) << 1);
                                                                    int i373 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    int i374 = (i373 & 26) + (i373 | 26);
                                                                    Object[] objArr79 = new Object[1];
                                                                    bravo((char) ((lastIndexOf3 & 1) + (lastIndexOf3 | 1)), i372, i374, objArr79);
                                                                    String str36 = (String) objArr79[0];
                                                                    int i375 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                                                    Object[] objArr80 = new Object[1];
                                                                    bravo((char) ((i375 & 53034) + (i375 | 53034)), 1649 - (~(-(-TextUtils.indexOf(str6, str6)))), View.MeasureSpec.getMode(0) + 17, objArr80);
                                                                    String str37 = (String) objArr80[0];
                                                                    int i376 = -(-TextUtils.lastIndexOf(str6, '0'));
                                                                    Object[] objArr81 = new Object[1];
                                                                    bravo((char) ((i376 & 1) + (i376 | 1)), 1667 - (KeyEvent.getMaxKeyCode() >> 16), 15 - (~(-TextUtils.indexOf((CharSequence) str6, '0', 0, 0))), objArr81);
                                                                    String str38 = (String) objArr81[0];
                                                                    int i377 = -TextUtils.indexOf(str6, str6);
                                                                    int i378 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                    Object[] objArr82 = new Object[1];
                                                                    bravo((char) (((i377 | 48666) << 1) - (i377 ^ 48666)), ((i378 | 1684) << 1) - (i378 ^ 1684), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr82);
                                                                    String str39 = (String) objArr82[0];
                                                                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                    int i379 = 1699 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                                    int i380 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    int i381 = ((i380 | 37) << 1) - (i380 ^ 37);
                                                                    Object[] objArr83 = new Object[1];
                                                                    bravo(fadingEdgeLength2, i379, i381, objArr83);
                                                                    String str40 = (String) objArr83[0];
                                                                    int i382 = -TextUtils.indexOf(str6, str6, 0, 0);
                                                                    int trimmedLength2 = TextUtils.getTrimmedLength(str6);
                                                                    Object[] objArr84 = new Object[1];
                                                                    bravo((char) ((i382 & 22551) + (i382 | 22551)), ((trimmedLength2 | 1736) << 1) - (trimmedLength2 ^ 1736), 10 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr84);
                                                                    String str41 = (String) objArr84[0];
                                                                    char c25 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                                                    Object[] objArr85 = new Object[1];
                                                                    bravo(c25, ((packedPositionChild2 | 1749) << 1) - (packedPositionChild2 ^ 1749), TextUtils.getOffsetAfter(str6, 0) + 13, objArr85);
                                                                    String str42 = (String) objArr85[0];
                                                                    char c26 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                    int normalizeMetaState6 = KeyEvent.normalizeMetaState(0);
                                                                    Object[] objArr86 = new Object[1];
                                                                    bravo(c26, (normalizeMetaState6 & 1761) + (normalizeMetaState6 | 1761), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr86);
                                                                    String str43 = (String) objArr86[0];
                                                                    char c27 = (char) ((-2) - ((-TextUtils.indexOf((CharSequence) str6, '0', 0)) ^ (-1)));
                                                                    int i383 = -Color.rgb(0, 0, 0);
                                                                    Object[] objArr87 = new Object[1];
                                                                    bravo(c27, ((i383 | (-16775433)) << 1) - (i383 ^ (-16775433)), 16777246 - (~Color.rgb(0, 0, 0)), objArr87);
                                                                    String str44 = (String) objArr87[0];
                                                                    int i384 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                    Object[] objArr88 = new Object[1];
                                                                    bravo((char) ((i384 ^ 55061) + ((i384 & 55061) << 1)), 1814 - TextUtils.getTrimmedLength(str6), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr88);
                                                                    String str45 = (String) objArr88[0];
                                                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    int i385 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                    Object[] objArr89 = new Object[1];
                                                                    bravo(maximumFlingVelocity, (i385 & 1826) + (i385 | 1826), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr89);
                                                                    String str46 = (String) objArr89[0];
                                                                    char resolveSize3 = (char) View.resolveSize(0, 0);
                                                                    int i386 = -(-TextUtils.getCapsMode(str6, 0, 0));
                                                                    Object[] objArr90 = new Object[1];
                                                                    bravo(resolveSize3, (i386 ^ 1838) + ((i386 & 1838) << 1), 11 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr90);
                                                                    String str47 = (String) objArr90[0];
                                                                    char c28 = (char) (0 - (~(-(-ExpandableListView.getPackedPositionChild(0L)))));
                                                                    int normalizeMetaState7 = KeyEvent.normalizeMetaState(0) + 1850;
                                                                    int i387 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                    int i388 = (i387 ^ 12) + ((i387 & 12) << 1);
                                                                    Object[] objArr91 = new Object[1];
                                                                    bravo(c28, normalizeMetaState7, i388, objArr91);
                                                                    String str48 = (String) objArr91[0];
                                                                    char capsMode = (char) TextUtils.getCapsMode(str6, 0, 0);
                                                                    int i389 = -(Process.myTid() >> 22);
                                                                    Object[] objArr92 = new Object[1];
                                                                    bravo(capsMode, (i389 & 1862) + (i389 | 1862), 11 - (~(-View.resolveSizeAndState(0, 0, 0))), objArr92);
                                                                    String str49 = (String) objArr92[0];
                                                                    int i390 = -(Process.myPid() >> 22);
                                                                    int threadPriority = 1874 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                                    int i391 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                    int i392 = ((i391 | 15) << 1) - (i391 ^ 15);
                                                                    Object[] objArr93 = new Object[1];
                                                                    bravo((char) ((i390 & 32005) + (i390 | 32005)), threadPriority, i392, objArr93);
                                                                    String str50 = (String) objArr93[0];
                                                                    char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                    int lastIndexOf4 = TextUtils.lastIndexOf(str6, '0', 0, 0) + 1889;
                                                                    int i393 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                    int i394 = (i393 ^ 12) + ((i393 & 12) << 1);
                                                                    Object[] objArr94 = new Object[1];
                                                                    bravo(fadingEdgeLength3, lastIndexOf4, i394, objArr94);
                                                                    String str51 = (String) objArr94[0];
                                                                    int i395 = -View.resolveSizeAndState(0, 0, 0);
                                                                    Object[] objArr95 = new Object[1];
                                                                    bravo((char) ((i395 & 58581) + (i395 | 58581)), 1899 - (~(-TextUtils.indexOf(str6, str6))), View.MeasureSpec.makeMeasureSpec(0, 0) + 24, objArr95);
                                                                    String str52 = (String) objArr95[0];
                                                                    int i396 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                    int i397 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1923;
                                                                    int i398 = 0;
                                                                    int i399 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int i400 = (i399 & 28) + (i399 | 28);
                                                                    int i401 = 1;
                                                                    Object[] objArr96 = new Object[1];
                                                                    bravo((char) ((i396 & 35346) + (i396 | 35346)), i397, i400, objArr96);
                                                                    String[] strArr16 = {str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, (String) objArr96[0]};
                                                                    int i402 = 0;
                                                                    int i403 = 19;
                                                                    while (i402 < i403) {
                                                                        String str53 = strArr16[i402];
                                                                        Object[] objArr97 = new Object[i401];
                                                                        objArr97[i398] = str53;
                                                                        Object D887125 = uH18377.D8871(-2104138125);
                                                                        if (D887125 == null) {
                                                                            int red = Color.red(i398) + 52;
                                                                            int i404 = 2951 - (TypedValue.complexToFraction(i398, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i398, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                            char myPid4 = (char) (Process.myPid() >> 22);
                                                                            byte b45 = (byte) 1;
                                                                            byte b46 = (byte) (b45 - 1);
                                                                            Object[] objArr98 = new Object[1];
                                                                            charlie(b46, b45, b46, objArr98);
                                                                            D887125 = uH18377.setPivotYN16904(red, i404, myPid4, 1563346086, false, (String) objArr98[0], new Class[]{cls2});
                                                                        }
                                                                        long longValue13 = ((Long) ((Method) D887125).invoke(null, objArr97)).longValue();
                                                                        long j86 = 896997837;
                                                                        long j87 = -496;
                                                                        long j88 = 497;
                                                                        long j89 = j86 ^ j6;
                                                                        long j90 = longValue13 ^ j6;
                                                                        long j91 = j89 | j90;
                                                                        long j92 = ((j88 * ((((j89 | j26) ^ j6) | ((j89 | longValue13) ^ j6)) | (((j90 | j86) | j5) ^ j6))) + (((((j91 | j5) ^ j6) | (((j90 | j26) | j86) ^ j6)) * j88) + (((j91 ^ j6) * j88) + ((j87 * longValue13) + (j87 * j86))))) - 2126618367;
                                                                        int i405 = ((int) (j92 >> 32)) & ((((~(i45 | 870142511)) | (-303059285)) * 494) + (((-337) | i45) * 494) + 824658334);
                                                                        int myPid5 = Process.myPid();
                                                                        int i406 = ((int) j92) & ((((~((~myPid5) | 207294813)) | 1644521223) * 168) + (((~(207294813 | myPid5)) | 1644455426) * (-168)) + ((((~(1644521223 | myPid5)) | 207229016) * 336) - 501357939));
                                                                        if (((i405 & i406) | (i405 ^ i406)) == 0) {
                                                                            char windowTouchSlop2 = (char) (32005 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                            int i407 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                            int i408 = ((i407 | 1874) << 1) - (i407 ^ 1874);
                                                                            int indexOf11 = TextUtils.indexOf((CharSequence) str6, '0', 0, 0);
                                                                            int i409 = (indexOf11 & 15) + (indexOf11 | 15);
                                                                            Object[] objArr99 = new Object[1];
                                                                            bravo(windowTouchSlop2, i408, i409, objArr99);
                                                                            if (str53.equals((String) objArr99[0])) {
                                                                                int i410 = echo + 31;
                                                                                delta = i410 % 128;
                                                                                if (i410 % 2 != 0) {
                                                                                    Object[] objArr100 = {str53};
                                                                                    Object D887126 = uH18377.D8871(1979478258);
                                                                                    if (D887126 == null) {
                                                                                        int i411 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53;
                                                                                        int size = 2951 - View.MeasureSpec.getSize(0);
                                                                                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                                                        byte b47 = (byte) 0;
                                                                                        byte b48 = b47;
                                                                                        Object[] objArr101 = new Object[1];
                                                                                        charlie(b48, b47, b48, objArr101);
                                                                                        D887126 = uH18377.setPivotYN16904(i411, size, packedPositionGroup, -1438133721, false, (String) objArr101[0], new Class[]{cls2});
                                                                                    }
                                                                                    long longValue14 = ((Long) ((Method) D887126).invoke(null, objArr100)).longValue();
                                                                                    long j93 = -1336324520;
                                                                                    long j94 = longValue14 ^ j6;
                                                                                    long j95 = (49 * (((j94 | j5) ^ j6) | ((longValue14 | j93) ^ j6))) + ((-49) * (j94 | (((j93 ^ j6) | j26) ^ j6) | ((j93 | j5) ^ j6))) + (98 * (((j94 | j26) ^ j6) | ((j94 | j93) ^ j6))) + ((-97) * longValue14) + (50 * j93) + 2111145826;
                                                                                    int i412 = ((int) (j95 >>> 33)) & ((((~(1766817740 | i45)) | (~(i45 | (-1090923145)))) * 614) + (((~(1229946828 | i45)) | 536870912 | (~(i45 | (-1627794057)))) * (-1228)) + ((675894596 | i4) * 614) + 902288530);
                                                                                    int i413 = ~(((int) Runtime.getRuntime().freeMemory()) | 981764858);
                                                                                    int i414 = ((int) j95) & (((i413 | 713034330) * 196) + ((268730528 | i413) * (-196)) + 1673541613);
                                                                                    if (((i412 & i414) | (i412 ^ i414)) != 0) {
                                                                                        int i415 = delta;
                                                                                        echo = ((i415 & 31) + (i415 | 31)) % 128;
                                                                                    }
                                                                                } else {
                                                                                    Object[] objArr102 = {str53};
                                                                                    Object D887127 = uH18377.D8871(1979478258);
                                                                                    if (D887127 == null) {
                                                                                        int resolveSize4 = 52 - View.resolveSize(0, 0);
                                                                                        int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2952;
                                                                                        char alpha = (char) Color.alpha(0);
                                                                                        byte b49 = (byte) 0;
                                                                                        byte b50 = b49;
                                                                                        Object[] objArr103 = new Object[1];
                                                                                        charlie(b50, b49, b50, objArr103);
                                                                                        D887127 = uH18377.setPivotYN16904(resolveSize4, modifierMetaStateMask4, alpha, -1438133721, false, (String) objArr103[0], new Class[]{cls2});
                                                                                    }
                                                                                    long longValue15 = ((Long) ((Method) D887127).invoke(null, objArr102)).longValue();
                                                                                    long j96 = -706939681;
                                                                                    long j97 = 530;
                                                                                    long j98 = 529;
                                                                                    long j99 = (j98 * ((longValue15 ^ j6) | ((j96 | j5) ^ j6))) + ((((j26 | j96) ^ j6) | ((j96 | longValue15) ^ j6)) * j98) + (j97 * longValue15) + (j97 * j96) + 1058 + 1481760987;
                                                                                    int i416 = ((int) (j99 >> 32)) & ((((~(482929374 | i45)) | (-1857792600)) * 262) + (((~(482929374 | i4)) | (-1857792600)) * 262) + 2107179204);
                                                                                    int i417 = ~(2010628062 | i4);
                                                                                    if ((i416 | (((int) j99) & (((~(i45 | 2010628062)) * 476) + (i417 * 952) + ((25168392 | i417) * (-476)) + 1234244569))) != 0) {
                                                                                        int i4152 = delta;
                                                                                        echo = ((i4152 & 31) + (i4152 | 31)) % 128;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i402 = (i402 | 1) + (i402 & 1);
                                                                            i403 = 19;
                                                                            i398 = 0;
                                                                            i401 = 1;
                                                                        }
                                                                        i56 = i402;
                                                                        break;
                                                                    }
                                                                    i56 = -1;
                                                                    int i418 = (i56 & 130) + (i56 | 130);
                                                                    int i419 = (i418 & i45) | ((~i418) & i4);
                                                                    int i420 = ~i56;
                                                                    int i421 = -i420;
                                                                    int i422 = ((i420 & i421) | (i420 ^ i421)) >> 31;
                                                                    int i423 = (~i422) & i4;
                                                                    int i424 = i422 & i419;
                                                                    int i425 = (i424 & i423) | (i423 ^ i424);
                                                                    int i426 = i4 ^ i362;
                                                                    int i427 = -i426;
                                                                    int i428 = ((i426 & i427) | (i426 ^ i427)) >> 31;
                                                                    int i429 = i425 & (~i428);
                                                                    int i430 = i362 & i428;
                                                                    i362 = (i430 & i429) | (i429 ^ i430);
                                                                }
                                                            }
                                                            int i431 = -(-TextUtils.indexOf(str6, str6));
                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                            Object[] objArr104 = new Object[1];
                                                            bravo((char) ((i431 ^ 10048) + ((i431 & 10048) << 1)), 1952 - (((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6), 12 - (~(-(-View.resolveSizeAndState(0, 0, 0)))), objArr104);
                                                            String str54 = (String) objArr104[0];
                                                            int i432 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                            int D887128 = InvalidProxyIntegrationHeaders.D8871();
                                                            int i433 = (i432 * HttpConstants.HTTP_SEE_OTHER) - 19480419;
                                                            int i434 = ~i432;
                                                            int i435 = ~D887128;
                                                            int i436 = (i435 & i434) | (i434 ^ i435);
                                                            int i437 = -(-(((~((i436 & 64719) | (i436 ^ 64719))) | (~((i432 ^ 64719) | (i432 & 64719) | D887128))) * (-302)));
                                                            int i438 = (i433 & i437) + (i433 | i437);
                                                            int i439 = (i434 ^ 64719) | (i434 & 64719);
                                                            int i440 = (i438 - (~(-(-((~((i439 & D887128) | (i439 ^ D887128))) * (-604)))))) - 1;
                                                            int i441 = ~((i432 & (-64720)) | ((-64720) ^ i432));
                                                            int i442 = ~((D887128 & 64719) | (D887128 ^ 64719));
                                                            int i443 = ((i441 & i442) | (i441 ^ i442)) * HttpConstants.HTTP_MOVED_TEMP;
                                                            int i444 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            Object[] objArr105 = new Object[1];
                                                            bravo((char) ((i440 & i443) + (i443 | i440)), (i444 & 1965) + (i444 | 1965), 4 - ImageFormat.getBitsPerPixel(0), objArr105);
                                                            String[] strArr17 = {str54, (String) objArr105[0]};
                                                            Object[] objArr106 = new Object[1];
                                                            bravo((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1969 - (~(-(Process.myPid() >> 22))), 14 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr106);
                                                            String str55 = (String) objArr106[0];
                                                            char size2 = (char) View.MeasureSpec.getSize(0);
                                                            int i445 = 1984 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16))));
                                                            int trimmedLength3 = TextUtils.getTrimmedLength(str6);
                                                            int i446 = (trimmedLength3 & 19) + (trimmedLength3 | 19);
                                                            Object[] objArr107 = new Object[1];
                                                            bravo(size2, i445, i446, objArr107);
                                                            String str56 = (String) objArr107[0];
                                                            char c29 = (char) (0 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))));
                                                            int i447 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                            Object[] objArr108 = new Object[1];
                                                            bravo(c29, (i447 & 2003) + (i447 | 2003), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr108);
                                                            String[] strArr18 = {str55, str56, (String) objArr108[0]};
                                                            int i448 = -(-TextUtils.lastIndexOf(str6, '0', 0, 0));
                                                            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                                                            int i449 = ((packedPositionChild3 | 2019) << 1) - (packedPositionChild3 ^ 2019);
                                                            int i450 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            int i451 = (i450 & 21) + (i450 | 21);
                                                            Object[] objArr109 = new Object[1];
                                                            bravo((char) ((i448 ^ 1) + ((i448 & 1) << 1)), i449, i451, objArr109);
                                                            String str57 = (String) objArr109[0];
                                                            int i452 = -TextUtils.indexOf((CharSequence) str6, '0', 0, 0);
                                                            int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                            Object[] objArr110 = new Object[1];
                                                            bravo((char) (((i452 | 4051) << 1) - (i452 ^ 4051)), (fadingEdgeLength4 & 2039) + (fadingEdgeLength4 | 2039), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, objArr110);
                                                            String[] strArr19 = {str57, (String) objArr110[0]};
                                                            int i453 = -KeyEvent.keyCodeFromString(str6);
                                                            int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                            Object[] objArr111 = new Object[1];
                                                            bravo((char) ((i453 ^ 54521) + ((i453 & 54521) << 1)), (maximumDrawingCacheSize3 & 2049) + (maximumDrawingCacheSize3 | 2049), 11 - (~((byte) KeyEvent.getModifierMetaStateMask())), objArr111);
                                                            String str58 = (String) objArr111[0];
                                                            int i454 = -ExpandableListView.getPackedPositionType(0L);
                                                            int i455 = -(-Gravity.getAbsoluteGravity(0, 0));
                                                            int i456 = ((i455 | 589) << 1) - (i455 ^ 589);
                                                            int i457 = -(-Color.alpha(0));
                                                            int i458 = (i457 ^ 6) + ((i457 & 6) << 1);
                                                            Object[] objArr112 = new Object[1];
                                                            bravo((char) ((i454 ^ 6384) + ((i454 & 6384) << 1)), i456, i458, objArr112);
                                                            String[] strArr20 = {str58, (String) objArr112[0]};
                                                            Object[] objArr113 = new Object[1];
                                                            bravo((char) Color.alpha(0), 2059 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16)))), 27 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr113);
                                                            String str59 = (String) objArr113[0];
                                                            char c30 = (char) (4053 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                            int i459 = 2040 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int i460 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            i50 = 1;
                                                            int i461 = ((i460 | 9) << 1) - (i460 ^ 9);
                                                            Object[] objArr114 = new Object[1];
                                                            bravo(c30, i459, i461, objArr114);
                                                            c10 = 0;
                                                            String[][] strArr21 = {strArr17, strArr18, strArr19, strArr20, new String[]{str59, (String) objArr114[0]}};
                                                            i51 = 0;
                                                            int i462 = -1;
                                                            loop7: while (true) {
                                                                if (i51 < 5) {
                                                                    strArr4 = strArr5;
                                                                    i52 = i4;
                                                                    break;
                                                                }
                                                                String[] strArr22 = strArr21[i51];
                                                                String str60 = strArr22[c10];
                                                                String[] strArr23 = (String[]) Arrays.copyOfRange(strArr22, i50, strArr22.length);
                                                                int length = strArr23.length;
                                                                int i463 = 0;
                                                                while (i463 < length) {
                                                                    int i464 = i462 + 1;
                                                                    int i465 = i50;
                                                                    Object[] objArr115 = new Object[2];
                                                                    objArr115[i465] = strArr23[i463];
                                                                    objArr115[0] = str60;
                                                                    Object D887129 = uH18377.D8871(1214576837);
                                                                    if (D887129 == null) {
                                                                        i54 = i51;
                                                                        byte b51 = (byte) (i11 & 3);
                                                                        strArr6 = strArr23;
                                                                        byte b52 = (byte) (b51 - 1);
                                                                        str7 = str60;
                                                                        i55 = length;
                                                                        strArr4 = strArr5;
                                                                        Object[] objArr116 = new Object[1];
                                                                        charlie(b52, b51, b52, objArr116);
                                                                        D887129 = uH18377.setPivotYN16904(52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getMode(0) + 3314, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), -1746970096, false, (String) objArr116[0], new Class[]{cls2, cls2});
                                                                    } else {
                                                                        i54 = i51;
                                                                        strArr6 = strArr23;
                                                                        str7 = str60;
                                                                        i55 = length;
                                                                        strArr4 = strArr5;
                                                                    }
                                                                    long longValue16 = ((Long) ((Method) D887129).invoke(null, objArr115)).longValue();
                                                                    long j100 = -1289930630;
                                                                    long j101 = ((-215) * longValue16) + (217 * j100);
                                                                    long j102 = 216;
                                                                    long elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                                                    long j103 = elapsedCpuTime4 ^ j6;
                                                                    long j104 = ((j102 * (longValue16 | ((j103 | j100) ^ j6))) + (((-216) * ((j100 | (longValue16 ^ j6)) | j103)) + ((((j100 | elapsedCpuTime4) ^ j6) * j102) + j101))) - 257707708;
                                                                    int foxtrot4 = ((int) (j104 >> 32)) & A0.z.foxtrot((~((~Process.myUid()) | (-8652865))) | 17826314, 576, (((~(1433457167 | r4)) | (-1442110032)) * 576) - 1771464918, -1726690304);
                                                                    int tango3 = ao.ad.tango(1634781476);
                                                                    int i466 = ~tango3;
                                                                    if ((foxtrot4 | (((int) j104) & ((((~(tango3 | (-203218528))) | 68192277) * 464) + ((1302200159 | tango3) * (-464)) + (((~(i466 | (-203218528))) | (~(1234007882 | i466)) | 68192277) * 464) + 107664453))) != 0) {
                                                                        int i467 = delta;
                                                                        echo = (((i467 | 65) << 1) - (i467 ^ 65)) % 128;
                                                                        int i468 = i462 + 171;
                                                                        i52 = (i468 & i45) | ((~i468) & i4);
                                                                        break loop7;
                                                                    }
                                                                    i463 = (i463 & 1) + (i463 | 1);
                                                                    strArr23 = strArr6;
                                                                    str60 = str7;
                                                                    i462 = i464;
                                                                    i51 = i54;
                                                                    length = i55;
                                                                    strArr5 = strArr4;
                                                                    i50 = 1;
                                                                }
                                                                int i469 = i51;
                                                                i51 = (i469 & 1) + (i469 | 1);
                                                                i50 = 1;
                                                                c10 = 0;
                                                            }
                                                            int i470 = ((~i362) & i4) | (i362 & i45);
                                                            int i471 = -i470;
                                                            int i472 = ((i470 & i471) | (i470 ^ i471)) >> 31;
                                                            int i473 = i52 & (~i472);
                                                            int i474 = i362 & i472;
                                                            int i475 = (i474 & i473) | (i473 ^ i474);
                                                            char alpha2 = (char) (Color.alpha(0) + 24045);
                                                            int i476 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            Object[] objArr117 = new Object[1];
                                                            bravo(alpha2, (i476 & 2088) + (i476 | 2088), ExpandableListView.getPackedPositionGroup(0L) + 13, objArr117);
                                                            String str61 = (String) objArr117[0];
                                                            char windowTouchSlop3 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 61655);
                                                            int i477 = -(-TextUtils.indexOf((CharSequence) str6, '0', 0, 0));
                                                            int i478 = (i477 ^ 2102) + ((i477 & 2102) << 1);
                                                            int i479 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int i480 = ~i479;
                                                            int i481 = ~i4;
                                                            int i482 = ~((i480 & i481) | (i480 ^ i481));
                                                            int i483 = (((((i482 & (-10)) | ((-10) ^ i482)) * (-865)) + ((i479 * 866) - 7776)) - (~(-(-((~((i479 ^ i4) | (i479 & i4))) * 865))))) - 1;
                                                            int i484 = ~(((-10) ^ i45) | ((-10) & i45));
                                                            int i485 = ~((i479 & i481) | (i481 ^ i479));
                                                            int i486 = ((i485 & i484) | (i484 ^ i485)) * 865;
                                                            int i487 = (i483 & i486) + (i486 | i483);
                                                            Object[] objArr118 = new Object[1];
                                                            bravo(windowTouchSlop3, i478, i487, objArr118);
                                                            String str62 = (String) objArr118[0];
                                                            file4 = new File(str61);
                                                            if (file4.exists()) {
                                                                int i488 = delta;
                                                                int i489 = ((i488 | 53) << 1) - (i488 ^ 53);
                                                                echo = i489 % 128;
                                                                if (i489 % 2 == 0) {
                                                                    file4.isFile();
                                                                    throw null;
                                                                }
                                                                if (file4.isFile()) {
                                                                    try {
                                                                        Scanner scanner3 = new Scanner(new FileInputStream(file4));
                                                                        Object[] objArr119 = new Object[1];
                                                                        bravo((char) (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 228, 2 - View.resolveSizeAndState(0, 0, 0), objArr119);
                                                                        Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr119[0]);
                                                                        if (useDelimiter3.hasNext()) {
                                                                            int i490 = delta;
                                                                            int i491 = (i490 ^ 61) + ((i490 & 61) << 1);
                                                                            echo = i491 % 128;
                                                                            if (i491 % 2 == 0) {
                                                                                useDelimiter3.next();
                                                                                throw null;
                                                                            }
                                                                            str6 = useDelimiter3.next();
                                                                        } else {
                                                                            int i492 = echo;
                                                                            delta = (((i492 | 75) << 1) - (i492 ^ 75)) % 128;
                                                                        }
                                                                        useDelimiter3.close();
                                                                    } catch (IOException unused3) {
                                                                    }
                                                                    if (str6.contains(str62)) {
                                                                        delta = (echo + 17) % 128;
                                                                        z2 = true;
                                                                        if (!z2) {
                                                                            i53 = i4;
                                                                            int i493 = ((~i475) & i4) | (i475 & i45);
                                                                            int i494 = -i493;
                                                                            int i495 = ((i493 & i494) | (i493 ^ i494)) >> 31;
                                                                            int i496 = i53 & (~i495);
                                                                            int i497 = i475 & i495;
                                                                            int i498 = (i497 & i496) | (i496 ^ i497);
                                                                            char keyRepeatDelay4 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 40568);
                                                                            int i499 = -(-Drawable.resolveOpacity(0, 0));
                                                                            int i500 = (i499 ^ 2109) + ((i499 & 2109) << 1);
                                                                            int deadChar3 = KeyEvent.getDeadChar(0, 0);
                                                                            int D887130 = InvalidProxyIntegrationHeaders.D8871();
                                                                            int i501 = (deadChar3 * 306) + 610;
                                                                            int i502 = (i501 & 14382) + (i501 | 14382);
                                                                            int i503 = ~((deadChar3 ^ 47) | (deadChar3 & 47));
                                                                            int i504 = ~(deadChar3 | D887130);
                                                                            int i505 = (((i503 & i504) | (i503 ^ i504)) * HttpConstants.HTTP_USE_PROXY) + i502;
                                                                            int i506 = ~D887130;
                                                                            int i507 = ~((deadChar3 & i506) | (i506 ^ deadChar3));
                                                                            Object[] objArr120 = new Object[1];
                                                                            bravo(keyRepeatDelay4, i500, (((i507 & (-48)) | ((-48) ^ i507)) * HttpConstants.HTTP_USE_PROXY) + i505, objArr120);
                                                                            Object[] objArr121 = {(String) objArr120[0]};
                                                                            D88717 = uH18377.D8871(1565484532);
                                                                            if (D88717 == null) {
                                                                                int defaultSize2 = 52 - View.getDefaultSize(0, 0);
                                                                                int i508 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2950;
                                                                                char blue = (char) Color.blue(0);
                                                                                byte b53 = (byte) (i11 & 3);
                                                                                byte b54 = (byte) (b53 - 1);
                                                                                Object[] objArr122 = new Object[1];
                                                                                charlie(b54, b53, b54, objArr122);
                                                                                D88717 = uH18377.setPivotYN16904(defaultSize2, i508, blue, -2097887455, false, (String) objArr122[0], new Class[]{cls2});
                                                                            }
                                                                            long longValue17 = ((Long) ((Method) D88717).invoke(null, objArr121)).longValue();
                                                                            long j105 = -791251059;
                                                                            long j106 = -575;
                                                                            long j107 = 576;
                                                                            long j108 = j105 ^ j6;
                                                                            long j109 = longValue17 ^ j6;
                                                                            long j110 = (j108 | j109) ^ j6;
                                                                            long j111 = (j107 * j110) + ((((longValue17 | j108) ^ j6) | ((j105 | (j109 | j26)) ^ j6)) * j107) + ((j110 | ((j109 | j5) ^ j6)) * j107) + (j106 * longValue17) + (j106 * j105) + 1746404961;
                                                                            int i509 = ~(1504333521 | i45);
                                                                            int i510 = ((int) (j111 >> 32)) & (((i509 | (~((-1353337474) | i4))) * 338) + ((150996048 | i509 | (~((-1504333522) | i4))) * (-338)) + 934283082);
                                                                            int myPid6 = Process.myPid();
                                                                            int i511 = ((int) j111) & ((((~((~myPid6) | (-753471648))) | 1367705897) * 398) + (((~((-753471648) | myPid6)) | 1367705897) * 398) + 626353573);
                                                                            int i512 = ((i510 & i511) | (i510 ^ i511)) * 263;
                                                                            int i513 = i4 ^ i498;
                                                                            int i514 = -i513;
                                                                            int i515 = ((i513 & i514) | (i513 ^ i514)) >> 31;
                                                                            int i516 = ((i512 & i45) | ((~i512) & i4)) & (~i515);
                                                                            int i517 = i498 & i515;
                                                                            i3052 = (i517 & i516) | (i516 ^ i517);
                                                                        } else {
                                                                            int i518 = ~(i4 & 150);
                                                                            int i519 = i4 | 150;
                                                                            i53 = i518 & i519;
                                                                            int i4932 = ((~i475) & i4) | (i475 & i45);
                                                                            int i4942 = -i4932;
                                                                            int i4952 = ((i4932 & i4942) | (i4932 ^ i4942)) >> 31;
                                                                            int i4962 = i53 & (~i4952);
                                                                            int i4972 = i475 & i4952;
                                                                            int i4982 = (i4972 & i4962) | (i4962 ^ i4972);
                                                                            char keyRepeatDelay42 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 40568);
                                                                            int i4992 = -(-Drawable.resolveOpacity(0, 0));
                                                                            int i5002 = (i4992 ^ 2109) + ((i4992 & 2109) << 1);
                                                                            int deadChar32 = KeyEvent.getDeadChar(0, 0);
                                                                            int D8871302 = InvalidProxyIntegrationHeaders.D8871();
                                                                            int i5012 = (deadChar32 * 306) + 610;
                                                                            int i5022 = (i5012 & 14382) + (i5012 | 14382);
                                                                            int i5032 = ~((deadChar32 ^ 47) | (deadChar32 & 47));
                                                                            int i5042 = ~(deadChar32 | D8871302);
                                                                            int i5052 = (((i5032 & i5042) | (i5032 ^ i5042)) * HttpConstants.HTTP_USE_PROXY) + i5022;
                                                                            int i5062 = ~D8871302;
                                                                            int i5072 = ~((deadChar32 & i5062) | (i5062 ^ deadChar32));
                                                                            Object[] objArr1202 = new Object[1];
                                                                            bravo(keyRepeatDelay42, i5002, (((i5072 & (-48)) | ((-48) ^ i5072)) * HttpConstants.HTTP_USE_PROXY) + i5052, objArr1202);
                                                                            Object[] objArr1212 = {(String) objArr1202[0]};
                                                                            D88717 = uH18377.D8871(1565484532);
                                                                            if (D88717 == null) {
                                                                            }
                                                                            long longValue172 = ((Long) ((Method) D88717).invoke(null, objArr1212)).longValue();
                                                                            long j1052 = -791251059;
                                                                            long j1062 = -575;
                                                                            long j1072 = 576;
                                                                            long j1082 = j1052 ^ j6;
                                                                            long j1092 = longValue172 ^ j6;
                                                                            long j1102 = (j1082 | j1092) ^ j6;
                                                                            long j1112 = (j1072 * j1102) + ((((longValue172 | j1082) ^ j6) | ((j1052 | (j1092 | j26)) ^ j6)) * j1072) + ((j1102 | ((j1092 | j5) ^ j6)) * j1072) + (j1062 * longValue172) + (j1062 * j1052) + 1746404961;
                                                                            int i5092 = ~(1504333521 | i45);
                                                                            int i5102 = ((int) (j1112 >> 32)) & (((i5092 | (~((-1353337474) | i4))) * 338) + ((150996048 | i5092 | (~((-1504333522) | i4))) * (-338)) + 934283082);
                                                                            int myPid62 = Process.myPid();
                                                                            int i5112 = ((int) j1112) & ((((~((~myPid62) | (-753471648))) | 1367705897) * 398) + (((~((-753471648) | myPid62)) | 1367705897) * 398) + 626353573);
                                                                            int i5122 = ((i5102 & i5112) | (i5102 ^ i5112)) * 263;
                                                                            int i5132 = i4 ^ i4982;
                                                                            int i5142 = -i5132;
                                                                            int i5152 = ((i5132 & i5142) | (i5132 ^ i5142)) >> 31;
                                                                            int i5162 = ((i5122 & i45) | ((~i5122) & i4)) & (~i5152);
                                                                            int i5172 = i4982 & i5152;
                                                                            i3052 = (i5172 & i5162) | (i5162 ^ i5172);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                            }
                                                        }
                                                    } else {
                                                        str6 = str2;
                                                    }
                                                    char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int i520 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                    int i521 = (i520 ^ 372) + ((i520 & 372) << 1);
                                                    int i522 = -(Process.myPid() >> 22);
                                                    int i523 = (i522 ^ 23) + ((i522 & 23) << 1);
                                                    Object[] objArr123 = new Object[1];
                                                    bravo(scrollDefaultDelay4, i521, i523, objArr123);
                                                    String str63 = (String) objArr123[0];
                                                    char c31 = (char) (30528 - (~(-(-Color.argb(0, 0, 0, 0)))));
                                                    int defaultSize3 = View.getDefaultSize(0, 0);
                                                    int i524 = ((defaultSize3 | 810) << 1) - (defaultSize3 ^ 810);
                                                    int i525 = -Color.rgb(0, 0, 0);
                                                    int i526 = (((-16777206) | i525) << 1) - (i525 ^ (-16777206));
                                                    Object[] objArr124 = new Object[1];
                                                    bravo(c31, i524, i526, objArr124);
                                                    String str64 = (String) objArr124[0];
                                                    int i527 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i528 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    Object[] objArr125 = new Object[1];
                                                    bravo((char) ((44163 ^ i527) + ((i527 & 44163) << 1)), ((i528 | 820) << 1) - (i528 ^ 820), 6 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr125);
                                                    String str65 = (String) objArr125[0];
                                                    Object[] objArr126 = new Object[1];
                                                    bravo((char) TextUtils.indexOf(str6, str6, 0), 826 - (~(-TextUtils.indexOf(str6, str6, 0, 0))), 7 - TextUtils.indexOf((CharSequence) str6, '0', 0, 0), objArr126);
                                                    String[] strArr24 = {str63, str64, str65, (String) objArr126[0]};
                                                    int i529 = -MotionEvent.axisFromString(str6);
                                                    int i530 = 836 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int i531 = -TextUtils.indexOf((CharSequence) str6, '0');
                                                    int i532 = ((i531 | 16) << 1) - (i531 ^ 16);
                                                    Object[] objArr127 = new Object[1];
                                                    bravo((char) ((i529 ^ (-1)) + (i529 << 1)), i530, i532, objArr127);
                                                    String str66 = (String) objArr127[0];
                                                    int i533 = -TextUtils.indexOf(str6, str6);
                                                    int i534 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 852;
                                                    int i535 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                    int i536 = (i535 & 6) + (i535 | 6);
                                                    Object[] objArr128 = new Object[1];
                                                    bravo((char) ((i533 ^ 18140) + ((i533 & 18140) << 1)), i534, i536, objArr128);
                                                    String str67 = (String) objArr128[0];
                                                    Object[] objArr129 = new Object[1];
                                                    bravo((char) KeyEvent.keyCodeFromString(str6), 858 - (~(-(-View.MeasureSpec.getSize(0)))), View.resolveSize(0, 0) + 7, objArr129);
                                                    String str68 = (String) objArr129[0];
                                                    char packedPositionType3 = (char) (31899 - ExpandableListView.getPackedPositionType(0L));
                                                    int i537 = -TextUtils.indexOf(str6, str6);
                                                    Object[] objArr130 = new Object[1];
                                                    bravo(packedPositionType3, (i537 ^ 866) + ((i537 & 866) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 11, objArr130);
                                                    String str69 = (String) objArr130[0];
                                                    char c32 = (char) ((-2) - ((-TextUtils.lastIndexOf(str6, '0')) ^ (-1)));
                                                    int i538 = -(-View.resolveSizeAndState(0, 0, 0));
                                                    Object[] objArr131 = new Object[1];
                                                    bravo(c32, (i538 & 877) + (i538 | 877), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, objArr131);
                                                    String[] strArr25 = {str66, str67, str68, str69, (String) objArr131[0]};
                                                    int i539 = -(-TextUtils.indexOf(str6, str6, 0, 0));
                                                    int resolveSize5 = View.resolveSize(0, 0);
                                                    int i540 = (resolveSize5 & 891) + (resolveSize5 | 891);
                                                    int i541 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    int i542 = (i541 ^ 15) + ((i541 & 15) << 1);
                                                    Object[] objArr132 = new Object[1];
                                                    bravo((char) (((42099 | i539) << 1) - (i539 ^ 42099)), i540, i542, objArr132);
                                                    String str70 = (String) objArr132[0];
                                                    char c33 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int size3 = View.MeasureSpec.getSize(0) + 907;
                                                    int i543 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int i544 = (i543 ^ 3) + ((i543 & 3) << 1);
                                                    Object[] objArr133 = new Object[1];
                                                    bravo(c33, size3, i544, objArr133);
                                                    String str71 = (String) objArr133[0];
                                                    Object[] objArr134 = new Object[1];
                                                    bravo((char) Color.blue(0), 16778133 - (~Color.rgb(0, 0, 0)), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr134);
                                                    String str72 = (String) objArr134[0];
                                                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 940;
                                                    int i545 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    int i546 = ((i545 | 25) << 1) - (i545 ^ 25);
                                                    Object[] objArr135 = new Object[1];
                                                    bravo(touchSlop2, touchSlop3, i546, objArr135);
                                                    String str73 = (String) objArr135[0];
                                                    char keyRepeatDelay5 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i547 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    int i548 = ((i547 | 965) << 1) - (i547 ^ 965);
                                                    int i549 = -(-View.combineMeasuredStates(0, 0));
                                                    int i550 = ((i549 | 28) << 1) - (i549 ^ 28);
                                                    Object[] objArr136 = new Object[1];
                                                    bravo(keyRepeatDelay5, i548, i550, objArr136);
                                                    String[] strArr26 = {str70, str71, str8, str72, str73, (String) objArr136[0]};
                                                    Object[] objArr137 = new Object[1];
                                                    bravo((char) Color.blue(0), 992 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), Color.alpha(0) + 11, objArr137);
                                                    String str74 = (String) objArr137[0];
                                                    int i551 = -KeyEvent.keyCodeFromString(str6);
                                                    int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1004;
                                                    int rgb = Color.rgb(0, 0, 0);
                                                    int i552 = ~rgb;
                                                    int i553 = (((~((i552 & 16777224) | (16777224 ^ i552))) | i4) * 988) + ((rgb * (-1975)) - 587194648);
                                                    int i554 = ~(((-16777225) ^ rgb) | ((-16777225) & rgb));
                                                    int i555 = ~((i108 ^ rgb) | (i108 & rgb));
                                                    int i556 = (((i554 & i555) | (i554 ^ i555)) * (-1976)) + i553;
                                                    int i557 = ~rgb;
                                                    int i558 = ~((i557 & 16777224) | (16777224 ^ i557));
                                                    int i559 = ~((-16777225) | i4);
                                                    int i560 = (i558 & i559) | (i558 ^ i559);
                                                    int i561 = ~(16777224 | i108);
                                                    int i562 = (i556 - (~(((i560 & i561) | (i560 ^ i561)) * 988))) - 1;
                                                    Object[] objArr138 = new Object[1];
                                                    bravo((char) ((i551 & 11519) + (i551 | 11519)), maximumDrawingCacheSize4, i562, objArr138);
                                                    String str75 = (String) objArr138[0];
                                                    int i563 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    Object[] objArr139 = new Object[1];
                                                    bravo((char) ((38760 & i563) + (i563 | 38760)), 1011 - (~(ViewConfiguration.getTouchSlop() >> 8)), 6 - View.combineMeasuredStates(0, 0), objArr139);
                                                    String str76 = (String) objArr139[0];
                                                    Object[] objArr140 = new Object[1];
                                                    bravo((char) Gravity.getAbsoluteGravity(0, 0), 1019 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 6 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr140);
                                                    String[] strArr27 = {str74, str75, str76, (String) objArr140[0]};
                                                    char packedPositionType4 = (char) (ExpandableListView.getPackedPositionType(0L) + 16531);
                                                    int normalizeMetaState8 = KeyEvent.normalizeMetaState(0);
                                                    int i564 = (normalizeMetaState8 & Barcode.FORMAT_UPC_E) + (normalizeMetaState8 | Barcode.FORMAT_UPC_E);
                                                    int i565 = -View.MeasureSpec.getSize(0);
                                                    int i566 = (i565 ^ 16) + ((i565 & 16) << 1);
                                                    Object[] objArr141 = new Object[1];
                                                    bravo(packedPositionType4, i564, i566, objArr141);
                                                    String str77 = (String) objArr141[0];
                                                    char bitsPerPixel3 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                                    int i567 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i568 = (i567 ^ 858) + ((i567 & 858) << 1);
                                                    int scrollDefaultDelay5 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                    int i569 = ((scrollDefaultDelay5 | 7) << 1) - (scrollDefaultDelay5 ^ 7);
                                                    Object[] objArr142 = new Object[1];
                                                    bravo(bitsPerPixel3, i568, i569, objArr142);
                                                    String str78 = (String) objArr142[0];
                                                    char minimumFlingVelocity6 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int i570 = -(-AndroidCharacter.getMirror('0'));
                                                    Object[] objArr143 = new Object[1];
                                                    bravo(minimumFlingVelocity6, ((i570 | 779) << 1) - (i570 ^ 779), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, objArr143);
                                                    String[] strArr28 = {str77, str78, (String) objArr143[0]};
                                                    int indexOf12 = TextUtils.indexOf((CharSequence) str6, '0');
                                                    char c34 = (char) (((indexOf12 | 1) << 1) - (indexOf12 ^ 1));
                                                    int i571 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    Object[] objArr144 = new Object[1];
                                                    bravo(c34, (i571 & 1040) + (i571 | 1040), 14 - Gravity.getAbsoluteGravity(0, 0), objArr144);
                                                    String str79 = (String) objArr144[0];
                                                    char c35 = (char) (41333 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))));
                                                    int i572 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i573 = i572 * 236;
                                                    int i574 = (496434 & i573) + (i573 | 496434);
                                                    int i575 = ~i572;
                                                    int i576 = ~i4;
                                                    int i577 = ~(i575 | i576);
                                                    int i578 = (i574 - (~(((i577 ^ 1054) | (i577 & 1054)) * (-235)))) - 1;
                                                    int i579 = ~i572;
                                                    int i580 = ~((i579 ^ i4) | (i579 & i4));
                                                    int i581 = (((i580 ^ 1054) | (i580 & 1054)) * (-470)) + i578;
                                                    int i582 = ~((i572 & (-1055)) | ((-1055) ^ i572));
                                                    int i583 = (i579 & 1054) | (i579 ^ 1054);
                                                    int i584 = ~((i583 & i4) | (i583 ^ i4));
                                                    int i585 = i582 ^ i584;
                                                    Object[] objArr145 = new Object[1];
                                                    bravo(c35, (i581 - (~(-(-(((i584 & i582) | i585) * 235))))) - 1, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr145);
                                                    String[] strArr29 = {str79, (String) objArr145[0]};
                                                    char indexOf13 = (char) TextUtils.indexOf(str6, str6, 0, 0);
                                                    int i586 = -(-MotionEvent.axisFromString(str6));
                                                    int i587 = (i586 ^ 1056) + ((i586 & 1056) << 1);
                                                    int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                    int i588 = (doubleTapTimeout & 9) + (doubleTapTimeout | 9);
                                                    Object[] objArr146 = new Object[1];
                                                    bravo(indexOf13, i587, i588, objArr146);
                                                    String str80 = (String) objArr146[0];
                                                    int offsetBefore3 = TextUtils.getOffsetBefore(str6, 0);
                                                    int D887131 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i589 = (offsetBefore3 * 495) - 28431310;
                                                    int i590 = -(-((((-57671) ^ offsetBefore3) | ((-57671) & offsetBefore3)) * (-988)));
                                                    int i591 = (i589 ^ i590) + ((i589 & i590) << 1);
                                                    int i592 = ~offsetBefore3;
                                                    int i593 = (i592 & 57670) | (57670 ^ i592);
                                                    int i594 = ~D887131;
                                                    int i595 = -(-(((i593 & i594) | (i593 ^ i594)) * 494));
                                                    int i596 = ((i591 | i595) << 1) - (i595 ^ i591);
                                                    int i597 = (~((i594 & 57670) | (57670 ^ i594))) | (~((~offsetBefore3) | (-57671)));
                                                    int i598 = ~(offsetBefore3 | 57670);
                                                    int i599 = -(-(((i598 & i597) | (i597 ^ i598)) * 494));
                                                    Object[] objArr147 = new Object[1];
                                                    bravo((char) ((i596 & i599) + (i599 | i596)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1064, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr147);
                                                    String[] strArr30 = {str80, (String) objArr147[0]};
                                                    char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                    int i600 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                    int i601 = (i600 ^ 1065) + ((i600 & 1065) << 1);
                                                    int i602 = -TextUtils.indexOf((CharSequence) str6, '0', 0, 0);
                                                    int i603 = i602 * 491;
                                                    int i604 = (i603 ^ (-7335)) + ((i603 & (-7335)) << 1);
                                                    int i605 = (~i602) | (-16);
                                                    int i606 = (i604 - (~(-(-(((i605 ^ i108) | (i605 & i108)) * (-490)))))) - 1;
                                                    int i607 = ~(((-16) ^ i602) | ((-16) & i602));
                                                    int i608 = ~(((-16) ^ i4) | ((-16) & i4));
                                                    int i609 = (((i607 ^ i608) | (i608 & i607)) * 490) + i606;
                                                    int i610 = (~i602) * 490;
                                                    int i611 = (i609 & i610) + (i609 | i610);
                                                    Object[] objArr148 = new Object[1];
                                                    bravo(packedPositionGroup2, i601, i611, objArr148);
                                                    String str81 = (String) objArr148[0];
                                                    char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i612 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    Object[] objArr149 = new Object[1];
                                                    bravo(windowTouchSlop4, (i612 & 908) + (i612 | 908), 2 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr149);
                                                    String str82 = (String) objArr149[0];
                                                    int i613 = -(-Color.argb(0, 0, 0, 0));
                                                    int i614 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i615 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i616 = (i615 ^ 7) + ((i615 & 7) << 1);
                                                    Object[] objArr150 = new Object[1];
                                                    bravo((char) (((i613 | 18140) << 1) - (i613 ^ 18140)), (i614 ^ 853) + ((i614 & 853) << 1), i616, objArr150);
                                                    String str83 = (String) objArr150[0];
                                                    int i617 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    Object[] objArr151 = new Object[1];
                                                    bravo((char) ((i617 ^ (-1)) + (i617 << 1)), 1081 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf(str6, str6) + 8, objArr151);
                                                    String str84 = (String) objArr151[0];
                                                    int i618 = -TextUtils.indexOf(str6, str6);
                                                    int i619 = -TextUtils.indexOf(str6, str6, 0);
                                                    int i620 = (i619 & 866) + (i619 | 866);
                                                    int i621 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i622 = (i621 & 11) + (i621 | 11);
                                                    Object[] objArr152 = new Object[1];
                                                    bravo((char) ((i618 & 31899) + (i618 | 31899)), i620, i622, objArr152);
                                                    String str85 = (String) objArr152[0];
                                                    Object[] objArr153 = new Object[1];
                                                    bravo((char) (Process.myPid() >> 22), 876 - (~(-TextUtils.indexOf(str6, str6, 0))), 12 - (~(-ImageFormat.getBitsPerPixel(0))), objArr153);
                                                    String[] strArr31 = {str81, str82, str83, str84, str85, (String) objArr153[0]};
                                                    char rgb2 = (char) ((-16754211) - Color.rgb(0, 0, 0));
                                                    int i623 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                    int i624 = (i623 ^ 1090) + ((i623 & 1090) << 1);
                                                    int resolveSize6 = View.resolveSize(0, 0);
                                                    Object[] objArr154 = new Object[1];
                                                    bravo(rgb2, i624, ((resolveSize6 | 20) << 1) - (resolveSize6 ^ 20), objArr154);
                                                    String str86 = (String) objArr154[0];
                                                    int i625 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    Object[] objArr155 = new Object[1];
                                                    bravo((char) ((i625 ^ 20112) + ((i625 & 20112) << 1)), TextUtils.indexOf(str6, str6, 0) + 1109, TextUtils.indexOf((CharSequence) str6, '0', 0) + 20, objArr155);
                                                    String str87 = (String) objArr155[0];
                                                    int i626 = -(-ImageFormat.getBitsPerPixel(0));
                                                    int i627 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    Object[] objArr156 = new Object[1];
                                                    bravo((char) (((i626 | 1) << 1) - (i626 ^ 1)), (i627 & 1129) + (i627 | 1129), 30 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr156);
                                                    String str88 = (String) objArr156[0];
                                                    char maximumDrawingCacheSize5 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i628 = 1158 - (~View.combineMeasuredStates(0, 0));
                                                    int indexOf14 = TextUtils.indexOf(str6, str6, 0);
                                                    int i629 = ((indexOf14 | 26) << 1) - (indexOf14 ^ 26);
                                                    Object[] objArr157 = new Object[1];
                                                    bravo(maximumDrawingCacheSize5, i628, i629, objArr157);
                                                    String str89 = (String) objArr157[0];
                                                    char indexOf15 = (char) (27998 - TextUtils.indexOf(str6, str6, 0));
                                                    int indexOf16 = TextUtils.indexOf(str6, str6) + 1185;
                                                    byte modifierMetaStateMask5 = (byte) KeyEvent.getModifierMetaStateMask();
                                                    int i630 = (modifierMetaStateMask5 ^ 24) + ((modifierMetaStateMask5 & 24) << 1);
                                                    Object[] objArr158 = new Object[1];
                                                    bravo(indexOf15, indexOf16, i630, objArr158);
                                                    String str90 = (String) objArr158[0];
                                                    char c36 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                    Object[] objArr159 = new Object[1];
                                                    bravo(c36, (resolveSizeAndState & 1208) + (resolveSizeAndState | 1208), 32 - (~Gravity.getAbsoluteGravity(0, 0)), objArr159);
                                                    String[] strArr32 = {str86, str87, str88, str89, str90, (String) objArr159[0], str8};
                                                    char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                    int i631 = 1240 - (~(-(Process.myTid() >> 22)));
                                                    int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                                    Object[] objArr160 = new Object[1];
                                                    bravo(edgeSlop4, i631, (resolveSizeAndState2 ^ 13) + ((resolveSizeAndState2 & 13) << 1), objArr160);
                                                    String str91 = (String) objArr160[0];
                                                    int i632 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int doubleTapTimeout2 = 820 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i633 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    Object[] objArr161 = new Object[1];
                                                    bravo((char) ((44163 ^ i632) + ((i632 & 44163) << 1)), doubleTapTimeout2, (i633 & 7) + (i633 | 7), objArr161);
                                                    String[] strArr33 = {str91, (String) objArr161[0]};
                                                    int i634 = -(-AndroidCharacter.getMirror('0'));
                                                    int alpha3 = 1254 - Color.alpha(0);
                                                    int i635 = -(-KeyEvent.keyCodeFromString(str6));
                                                    int i636 = (i635 ^ 30) + ((i635 & 30) << 1);
                                                    Object[] objArr162 = new Object[1];
                                                    bravo((char) ((i634 ^ 7401) + ((i634 & 7401) << 1)), alpha3, i636, objArr162);
                                                    String str92 = (String) objArr162[0];
                                                    char combineMeasuredStates3 = (char) (53896 - View.combineMeasuredStates(0, 0));
                                                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 1285;
                                                    int i637 = -View.MeasureSpec.getSize(0);
                                                    Object[] objArr163 = new Object[1];
                                                    bravo(combineMeasuredStates3, bitsPerPixel4, (i637 & 11) + (i637 | 11), objArr163);
                                                    String[] strArr34 = {str92, (String) objArr163[0]};
                                                    int i638 = -Color.green(0);
                                                    int D887132 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i639 = (i638 * (-523)) + 3094984;
                                                    int i640 = ~i638;
                                                    int i641 = ~(i640 | 11768);
                                                    int i642 = ~((-11769) | i638);
                                                    int i643 = ((i641 ^ i642) | (i642 & i641) | (~((-11769) | D887132))) * 262;
                                                    int i644 = ((i639 | i643) << 1) - (i643 ^ i639);
                                                    int i645 = ((-11769) ^ i638) | (i638 & (-11769));
                                                    int i646 = (~i645) * (-786);
                                                    int i647 = (i644 ^ i646) + ((i646 & i644) << 1);
                                                    int i648 = ~D887132;
                                                    int i649 = ~((i648 & (-11769)) | ((-11769) ^ i648));
                                                    int i650 = ~((i640 ^ 11768) | (i640 & 11768));
                                                    char c37 = (char) ((i647 - (~(((~i645) | ((i649 & i650) | (i649 ^ i650))) * 262))) - 1);
                                                    int i651 = -View.MeasureSpec.getMode(0);
                                                    int i652 = (i651 ^ 1295) + ((i651 & 1295) << 1);
                                                    int i653 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                    int i654 = (i653 ^ 18) + ((i653 & 18) << 1);
                                                    Object[] objArr164 = new Object[1];
                                                    bravo(c37, i652, i654, objArr164);
                                                    String str93 = (String) objArr164[0];
                                                    char resolveSize7 = (char) View.resolveSize(0, 0);
                                                    int i655 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int D887133 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i656 = (i655 * (-103)) - 135239;
                                                    int i657 = ~i655;
                                                    int i658 = ((~((i657 ^ (-1314)) | (i657 & (-1314)))) | (~(((-1314) ^ D887133) | ((-1314) & D887133)))) * 104;
                                                    int i659 = (i656 & i658) + (i658 | i656);
                                                    int i660 = ~D887133;
                                                    int i661 = (i660 & i655) | (i660 ^ i655);
                                                    int i662 = -(-((~((i661 & 1313) | (i661 ^ 1313))) * (-104)));
                                                    int i663 = (i659 & i662) + (i662 | i659);
                                                    int i664 = -(-(((i655 ^ D887133) | (i655 & D887133)) * 104));
                                                    Object[] objArr165 = new Object[1];
                                                    bravo(resolveSize7, ((i663 | i664) << 1) - (i664 ^ i663), 4 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), objArr165);
                                                    String[] strArr35 = {str93, (String) objArr165[0]};
                                                    int i665 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                    int D887134 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i666 = (i665 * 367) - (-8173457);
                                                    int i667 = -(-(((i665 ^ 22271) | (i665 & 22271)) * (-366)));
                                                    int i668 = (i666 & i667) + (i666 | i667);
                                                    int i669 = ~(((-22272) ^ D887134) | ((-22272) & D887134));
                                                    int i670 = -(-(((i669 & i665) | (i665 ^ i669)) * (-366)));
                                                    int i671 = ((i668 | i670) << 1) - (i670 ^ i668);
                                                    int i672 = ~((~i665) | 22271);
                                                    int i673 = ~(((-22272) & i665) | ((-22272) ^ i665) | D887134);
                                                    int i674 = ((i673 & i672) | (i672 ^ i673)) * 366;
                                                    char c38 = (char) ((i671 & i674) + (i674 | i671));
                                                    int i675 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    int i676 = ~((-1321) | i4);
                                                    int i677 = i576 | i675;
                                                    int i678 = ~((i677 ^ 1320) | (i677 & 1320));
                                                    int i679 = (((i678 & i676) | (i676 ^ i678)) * (-406)) + ((i675 * (-405)) - (-537240));
                                                    int i680 = -(-((~(((-1321) ^ i576) | ((-1321) & i576) | i675)) * (-406)));
                                                    int i681 = (i679 & i680) + (i679 | i680);
                                                    int i682 = ~i675;
                                                    int i683 = ~((i682 & i4) | (i682 ^ i4));
                                                    int i684 = ~(i108 | 1320);
                                                    int i685 = -(-(((i683 & i684) | (i683 ^ i684)) * HttpConstants.HTTP_NOT_ACCEPTABLE));
                                                    int i686 = ((i681 | i685) << 1) - (i685 ^ i681);
                                                    int i687 = -(-Color.green(0));
                                                    int i688 = (i687 & 19) + (i687 | 19);
                                                    Object[] objArr166 = new Object[1];
                                                    bravo(c38, i686, i688, objArr166);
                                                    String[] strArr36 = {(String) objArr166[0]};
                                                    int edgeSlop5 = ViewConfiguration.getEdgeSlop() >> 16;
                                                    int i689 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                    int i690 = ((i689 | 1337) << 1) - (i689 ^ 1337);
                                                    int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    int D887135 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i691 = scrollBarFadeDuration2 * (-109);
                                                    int i692 = ((i691 | 1776) << 1) - (i691 ^ 1776);
                                                    int i693 = ~scrollBarFadeDuration2;
                                                    int i694 = (D887135 ^ 16) | (D887135 & 16);
                                                    int i695 = ~i694;
                                                    int i696 = (i692 - (~(((i693 ^ i695) | (i695 & i693)) * (-220)))) - 1;
                                                    int i697 = ~((scrollBarFadeDuration2 ^ 16) | (scrollBarFadeDuration2 & 16));
                                                    int i698 = ~i694;
                                                    int i699 = ((i697 ^ i698) | (i697 & i698)) * 220;
                                                    int i700 = ((i696 | i699) << 1) - (i699 ^ i696);
                                                    int i701 = ~((i693 ^ 16) | (i693 & 16));
                                                    int i702 = ~((scrollBarFadeDuration2 & (-17)) | ((-17) ^ scrollBarFadeDuration2));
                                                    int i703 = -(-(((i701 & i702) | (i701 ^ i702)) * 110));
                                                    int i704 = ((i700 | i703) << 1) - (i703 ^ i700);
                                                    Object[] objArr167 = new Object[1];
                                                    bravo((char) (((46760 | edgeSlop5) << 1) - (edgeSlop5 ^ 46760)), i690, i704, objArr167);
                                                    String[] strArr37 = {(String) objArr167[0]};
                                                    char c39 = (char) ((-2) - ((-Process.getGidForName(str6)) ^ (-1)));
                                                    int i705 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    Object[] objArr168 = new Object[1];
                                                    bravo(c39, (i705 ^ 1354) + ((i705 & 1354) << 1), 19 - (ViewConfiguration.getTouchSlop() >> 8), objArr168);
                                                    String[] strArr38 = {(String) objArr168[0]};
                                                    int i706 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    Object[] objArr169 = new Object[1];
                                                    bravo((char) ((i706 & 1) + (i706 | 1)), 1372 - (~(-(-ExpandableListView.getPackedPositionType(0L)))), 19 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr169);
                                                    String[] strArr39 = {(String) objArr169[0]};
                                                    Object[] objArr170 = new Object[1];
                                                    bravo((char) ((-1) - TextUtils.indexOf((CharSequence) str6, '0')), 1392 - Drawable.resolveOpacity(0, 0), 23 - TextUtils.indexOf(str6, str6), objArr170);
                                                    String[] strArr40 = {(String) objArr170[0]};
                                                    char indexOf17 = (char) TextUtils.indexOf(str6, str6);
                                                    int i707 = 1413 - (~(-ExpandableListView.getPackedPositionChild(0L)));
                                                    int i708 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                    Object[] objArr171 = new Object[1];
                                                    bravo(indexOf17, i707, (i708 & 21) + (i708 | 21), objArr171);
                                                    String[] strArr41 = {(String) objArr171[0]};
                                                    Object[] objArr172 = new Object[1];
                                                    bravo((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1436, Color.rgb(0, 0, 0) + 16777240, objArr172);
                                                    String[] strArr42 = {(String) objArr172[0], str8};
                                                    Object[] objArr173 = new Object[1];
                                                    bravo((char) KeyEvent.normalizeMetaState(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1460, 28 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr173);
                                                    String[] strArr43 = {(String) objArr173[0], str8};
                                                    char c40 = (char) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1)));
                                                    int pressedStateDuration = 1488 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i709 = -(-MotionEvent.axisFromString(str6));
                                                    Object[] objArr174 = new Object[1];
                                                    bravo(c40, pressedStateDuration, (i709 & 28) + (i709 | 28), objArr174);
                                                    String[] strArr44 = {(String) objArr174[0], str8};
                                                    int i710 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i711 = 1514 - (~(-TextUtils.getTrimmedLength(str6)));
                                                    int keyRepeatDelay6 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                    Object[] objArr175 = new Object[1];
                                                    bravo((char) ((i710 & 1) + (i710 | 1)), i711, (keyRepeatDelay6 & 31) + (keyRepeatDelay6 | 31), objArr175);
                                                    String[] strArr45 = {(String) objArr175[0], str8};
                                                    char c41 = (char) (34614 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                    int i712 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int i713 = ((i712 | 1546) << 1) - (i712 ^ 1546);
                                                    int i714 = -(-Color.blue(0));
                                                    Object[] objArr176 = new Object[1];
                                                    bravo(c41, i713, ((i714 | 27) << 1) - (i714 ^ 27), objArr176);
                                                    String[] strArr46 = {(String) objArr176[0], str8};
                                                    char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                    int i715 = -Process.getGidForName(str6);
                                                    int i716 = i715 * (-1939);
                                                    int i717 = (i716 & 1526412) + (i716 | 1526412);
                                                    int i718 = ~(((-1573) ^ i715) | ((-1573) & i715));
                                                    int i719 = ~((i108 & 1572) | (i108 ^ 1572));
                                                    int i720 = ~i715;
                                                    int i721 = ((~((i720 ^ 1572) | (i720 & 1572))) * 1940) + (((i719 & i718) | (i718 ^ i719)) * (-970)) + i717;
                                                    int i722 = -(-(((~((i720 ^ (-1573)) | (i720 & (-1573)))) | (~((i108 ^ 1572) | (i108 & 1572)))) * 970));
                                                    int i723 = ((i721 | i722) << 1) - (i722 ^ i721);
                                                    int i724 = -View.resolveSize(0, 0);
                                                    Object[] objArr177 = new Object[1];
                                                    bravo(touchSlop4, i723, ((i724 | 32) << 1) - (i724 ^ 32), objArr177);
                                                    String[][] strArr47 = {strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, new String[]{(String) objArr177[0], str8}};
                                                    int i725 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                    int i726 = 1;
                                                    Object[] objArr178 = new Object[1];
                                                    bravo((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ((i725 | 1604) << 1) - (i725 ^ 1604), -Process.getGidForName(str6), objArr178);
                                                    int i727 = 0;
                                                    StringBuilder sb2 = new StringBuilder((String) objArr178[0]);
                                                    int i728 = i4;
                                                    int i729 = i21;
                                                    int i730 = 0;
                                                    int i731 = 0;
                                                    while (i730 < i729) {
                                                        String[] strArr48 = strArr47[i730];
                                                        Object[] objArr179 = new Object[i726];
                                                        objArr179[i727] = strArr48[i727];
                                                        Object D887136 = uH18377.D8871(-957097391);
                                                        if (D887136 == null) {
                                                            int mode2 = 52 - View.MeasureSpec.getMode(i727);
                                                            int i732 = 3159 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58074);
                                                            byte b55 = (byte) (i11 & 3);
                                                            byte b56 = (byte) (b55 - 2);
                                                            i47 = i730;
                                                            i48 = i108;
                                                            Object[] objArr180 = new Object[1];
                                                            charlie(b56, b55, b56, objArr180);
                                                            D887136 = uH18377.setPivotYN16904(mode2, i732, keyRepeatTimeout2, 424179844, false, (String) objArr180[0], new Class[]{cls2});
                                                        } else {
                                                            i47 = i730;
                                                            i48 = i108;
                                                        }
                                                        String str94 = (String) ((Method) D887136).invoke(null, objArr179);
                                                        String[] strArr49 = (String[]) Arrays.copyOfRange(strArr48, 1, strArr48.length);
                                                        if (str94 != null && !str94.isEmpty()) {
                                                            delta = (echo + 123) % 128;
                                                            int i733 = 1;
                                                            if (strArr48.length != 1) {
                                                                int length2 = strArr49.length;
                                                                int i734 = 0;
                                                                while (i734 < length2) {
                                                                    int i735 = echo;
                                                                    delta = (((i735 | 39) << i733) - (i735 ^ 39)) % 128;
                                                                    if (!str94.contains(strArr49[i734])) {
                                                                        i734 = (i734 & (-13)) + (i734 | (-13)) + 14;
                                                                        i733 = 1;
                                                                    }
                                                                }
                                                            }
                                                            int i736 = (i47 ^ 10) + ((i47 & 10) << 1);
                                                            i728 = ((~i736) & i4) | (i736 & i48);
                                                            i731++;
                                                            if (i731 > 1) {
                                                                int indexOf18 = TextUtils.indexOf((CharSequence) str6, '0', 0);
                                                                int mirror3 = AndroidCharacter.getMirror('0') + 1558;
                                                                int i737 = -(-TextUtils.indexOf((CharSequence) str6, '0'));
                                                                int i738 = ((i737 | 3) << 1) - (i737 ^ 3);
                                                                Object[] objArr181 = new Object[1];
                                                                bravo((char) (((indexOf18 | 53572) << 1) - (indexOf18 ^ 53572)), mirror3, i738, objArr181);
                                                                c4 = 0;
                                                                sb2.append((String) objArr181[0]);
                                                            } else {
                                                                c4 = 0;
                                                            }
                                                            sb2.append(strArr48[c4]);
                                                            char c42 = (char) (45207 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                                                            int i739 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            Object[] objArr182 = new Object[1];
                                                            bravo(c42, (i739 & 1608) + (i739 | 1608), 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr182);
                                                            sb2.append((String) objArr182[0]);
                                                            sb2.append(str94);
                                                            delta = (echo + 119) % 128;
                                                        }
                                                        i730 = (i47 ^ 1) + ((i47 & 1) << 1);
                                                        i108 = i48;
                                                        i729 = 24;
                                                        i726 = 1;
                                                        i727 = 0;
                                                    }
                                                    i45 = i108;
                                                    int i740 = i727;
                                                    int i741 = -(-(ExpandableListView.getPackedPositionForChild(i740, i740) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i740, i740) == 0L ? 0 : -1)));
                                                    Object[] objArr183 = new Object[1];
                                                    bravo((char) ((i741 ^ 1) + ((i741 & 1) << 1)), 1608 - (~(-View.combineMeasuredStates(i740, i740))), 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr183);
                                                    sb2.append((String) objArr183[i740]);
                                                    Object[] objArr184 = new Object[2];
                                                    if (i731 > 2) {
                                                        objArr184[1] = new int[1];
                                                        String[] strArr50 = {sb2.toString()};
                                                        ((int[]) objArr184[1])[i740] = i728;
                                                        objArr184[i740] = strArr50;
                                                    } else {
                                                        int[] iArr = new int[1];
                                                        objArr184[1] = iArr;
                                                        iArr[i740] = i4;
                                                        objArr184[i740] = new String[i740];
                                                    }
                                                    int i742 = ((int[]) objArr184[1])[i740];
                                                    int i743 = (~(i4 & i362)) & (i4 | i362);
                                                    int i744 = -i743;
                                                    int i745 = ((i743 & i744) | (i743 ^ i744)) >> 31;
                                                    int i746 = i742 & (~i745);
                                                    int i747 = i362 & i745;
                                                    i362 = (i746 & i747) | (i746 ^ i747);
                                                    i46 = 0;
                                                    strArr5 = (String[]) objArr184[0];
                                                    Object[] objArr732 = new Object[1];
                                                    bravo((char) (42099 - View.MeasureSpec.getMode(i46)), (ViewConfiguration.getTouchSlop() >> 8) + 891, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, objArr732);
                                                    Object[] objArr742 = {(String) objArr732[0]};
                                                    D88716 = uH18377.D8871(-957097391);
                                                    if (D88716 == null) {
                                                    }
                                                    invoke = ((Method) D88716).invoke(null, objArr742);
                                                    if (invoke != null) {
                                                    }
                                                    if (i49 != 1986687685) {
                                                    }
                                                    int i4312 = -(-TextUtils.indexOf(str6, str6));
                                                    int threadPriority22 = Process.getThreadPriority(0);
                                                    Object[] objArr1042 = new Object[1];
                                                    bravo((char) ((i4312 ^ 10048) + ((i4312 & 10048) << 1)), 1952 - (((threadPriority22 ^ 20) + ((threadPriority22 & 20) << 1)) >> 6), 12 - (~(-(-View.resolveSizeAndState(0, 0, 0)))), objArr1042);
                                                    String str542 = (String) objArr1042[0];
                                                    int i4322 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                    int D8871282 = InvalidProxyIntegrationHeaders.D8871();
                                                    int i4332 = (i4322 * HttpConstants.HTTP_SEE_OTHER) - 19480419;
                                                    int i4342 = ~i4322;
                                                    int i4352 = ~D8871282;
                                                    int i4362 = (i4352 & i4342) | (i4342 ^ i4352);
                                                    int i4372 = -(-(((~((i4362 & 64719) | (i4362 ^ 64719))) | (~((i4322 ^ 64719) | (i4322 & 64719) | D8871282))) * (-302)));
                                                    int i4382 = (i4332 & i4372) + (i4332 | i4372);
                                                    int i4392 = (i4342 ^ 64719) | (i4342 & 64719);
                                                    int i4402 = (i4382 - (~(-(-((~((i4392 & D8871282) | (i4392 ^ D8871282))) * (-604)))))) - 1;
                                                    int i4412 = ~((i4322 & (-64720)) | ((-64720) ^ i4322));
                                                    int i4422 = ~((D8871282 & 64719) | (D8871282 ^ 64719));
                                                    int i4432 = ((i4412 & i4422) | (i4412 ^ i4422)) * HttpConstants.HTTP_MOVED_TEMP;
                                                    int i4442 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    Object[] objArr1052 = new Object[1];
                                                    bravo((char) ((i4402 & i4432) + (i4432 | i4402)), (i4442 & 1965) + (i4442 | 1965), 4 - ImageFormat.getBitsPerPixel(0), objArr1052);
                                                    String[] strArr172 = {str542, (String) objArr1052[0]};
                                                    Object[] objArr1062 = new Object[1];
                                                    bravo((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1969 - (~(-(Process.myPid() >> 22))), 14 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr1062);
                                                    String str552 = (String) objArr1062[0];
                                                    char size22 = (char) View.MeasureSpec.getSize(0);
                                                    int i4452 = 1984 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16))));
                                                    int trimmedLength32 = TextUtils.getTrimmedLength(str6);
                                                    int i4462 = (trimmedLength32 & 19) + (trimmedLength32 | 19);
                                                    Object[] objArr1072 = new Object[1];
                                                    bravo(size22, i4452, i4462, objArr1072);
                                                    String str562 = (String) objArr1072[0];
                                                    char c292 = (char) (0 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))));
                                                    int i4472 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                    Object[] objArr1082 = new Object[1];
                                                    bravo(c292, (i4472 & 2003) + (i4472 | 2003), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr1082);
                                                    String[] strArr182 = {str552, str562, (String) objArr1082[0]};
                                                    int i4482 = -(-TextUtils.lastIndexOf(str6, '0', 0, 0));
                                                    int packedPositionChild32 = ExpandableListView.getPackedPositionChild(0L);
                                                    int i4492 = ((packedPositionChild32 | 2019) << 1) - (packedPositionChild32 ^ 2019);
                                                    int i4502 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                    int i4512 = (i4502 & 21) + (i4502 | 21);
                                                    Object[] objArr1092 = new Object[1];
                                                    bravo((char) ((i4482 ^ 1) + ((i4482 & 1) << 1)), i4492, i4512, objArr1092);
                                                    String str572 = (String) objArr1092[0];
                                                    int i4522 = -TextUtils.indexOf((CharSequence) str6, '0', 0, 0);
                                                    int fadingEdgeLength42 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                    Object[] objArr1102 = new Object[1];
                                                    bravo((char) (((i4522 | 4051) << 1) - (i4522 ^ 4051)), (fadingEdgeLength42 & 2039) + (fadingEdgeLength42 | 2039), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, objArr1102);
                                                    String[] strArr192 = {str572, (String) objArr1102[0]};
                                                    int i4532 = -KeyEvent.keyCodeFromString(str6);
                                                    int maximumDrawingCacheSize32 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                    Object[] objArr1112 = new Object[1];
                                                    bravo((char) ((i4532 ^ 54521) + ((i4532 & 54521) << 1)), (maximumDrawingCacheSize32 & 2049) + (maximumDrawingCacheSize32 | 2049), 11 - (~((byte) KeyEvent.getModifierMetaStateMask())), objArr1112);
                                                    String str582 = (String) objArr1112[0];
                                                    int i4542 = -ExpandableListView.getPackedPositionType(0L);
                                                    int i4552 = -(-Gravity.getAbsoluteGravity(0, 0));
                                                    int i4562 = ((i4552 | 589) << 1) - (i4552 ^ 589);
                                                    int i4572 = -(-Color.alpha(0));
                                                    int i4582 = (i4572 ^ 6) + ((i4572 & 6) << 1);
                                                    Object[] objArr1122 = new Object[1];
                                                    bravo((char) ((i4542 ^ 6384) + ((i4542 & 6384) << 1)), i4562, i4582, objArr1122);
                                                    String[] strArr202 = {str582, (String) objArr1122[0]};
                                                    Object[] objArr1132 = new Object[1];
                                                    bravo((char) Color.alpha(0), 2059 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16)))), 27 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr1132);
                                                    String str592 = (String) objArr1132[0];
                                                    char c302 = (char) (4053 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                    int i4592 = 2040 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int i4602 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    i50 = 1;
                                                    int i4612 = ((i4602 | 9) << 1) - (i4602 ^ 9);
                                                    Object[] objArr1142 = new Object[1];
                                                    bravo(c302, i4592, i4612, objArr1142);
                                                    c10 = 0;
                                                    String[][] strArr212 = {strArr172, strArr182, strArr192, strArr202, new String[]{str592, (String) objArr1142[0]}};
                                                    i51 = 0;
                                                    int i4622 = -1;
                                                    loop7: while (true) {
                                                        if (i51 < 5) {
                                                        }
                                                        int i4692 = i51;
                                                        i51 = (i4692 & 1) + (i4692 | 1);
                                                        i50 = 1;
                                                        c10 = 0;
                                                    }
                                                    int i4702 = ((~i362) & i4) | (i362 & i45);
                                                    int i4712 = -i4702;
                                                    int i4722 = ((i4702 & i4712) | (i4702 ^ i4712)) >> 31;
                                                    int i4732 = i52 & (~i4722);
                                                    int i4742 = i362 & i4722;
                                                    int i4752 = (i4742 & i4732) | (i4732 ^ i4742);
                                                    char alpha22 = (char) (Color.alpha(0) + 24045);
                                                    int i4762 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    Object[] objArr1172 = new Object[1];
                                                    bravo(alpha22, (i4762 & 2088) + (i4762 | 2088), ExpandableListView.getPackedPositionGroup(0L) + 13, objArr1172);
                                                    String str612 = (String) objArr1172[0];
                                                    char windowTouchSlop32 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 61655);
                                                    int i4772 = -(-TextUtils.indexOf((CharSequence) str6, '0', 0, 0));
                                                    int i4782 = (i4772 ^ 2102) + ((i4772 & 2102) << 1);
                                                    int i4792 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i4802 = ~i4792;
                                                    int i4812 = ~i4;
                                                    int i4822 = ~((i4802 & i4812) | (i4802 ^ i4812));
                                                    int i4832 = (((((i4822 & (-10)) | ((-10) ^ i4822)) * (-865)) + ((i4792 * 866) - 7776)) - (~(-(-((~((i4792 ^ i4) | (i4792 & i4))) * 865))))) - 1;
                                                    int i4842 = ~(((-10) ^ i45) | ((-10) & i45));
                                                    int i4852 = ~((i4792 & i4812) | (i4812 ^ i4792));
                                                    int i4862 = ((i4852 & i4842) | (i4842 ^ i4852)) * 865;
                                                    int i4872 = (i4832 & i4862) + (i4862 | i4832);
                                                    Object[] objArr1182 = new Object[1];
                                                    bravo(windowTouchSlop32, i4782, i4872, objArr1182);
                                                    String str622 = (String) objArr1182[0];
                                                    file4 = new File(str612);
                                                    if (file4.exists()) {
                                                    }
                                                    z2 = false;
                                                    if (!z2) {
                                                    }
                                                } else {
                                                    strArr4 = null;
                                                }
                                                int i3062 = (~(i4 & i3052)) & (i4 | i3052);
                                                int i3072 = -i3062;
                                                int i3082 = (((i3062 & i3072) | (i3062 ^ i3072)) >> 31) & 16;
                                                Object[] objArr572 = {new int[]{i3052}, new int[]{i4}, new int[1], strArr4};
                                                int elapsedCpuTime32 = (int) Process.getElapsedCpuTime();
                                                int i3092 = (((~(elapsedCpuTime32 | (-674538))) | (~((~elapsedCpuTime32) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime32))) * 210) - 585050909);
                                                int i3102 = (i3092 ^ i3082) + ((i3092 & i3082) << 1);
                                                int i3112 = (i10 & i3102) + (i10 | i3102);
                                                int i3122 = i3112 << 13;
                                                int i3132 = (i3112 | i3122) & (~(i3112 & i3122));
                                                int i3142 = i3132 >>> 17;
                                                int i3152 = ((~i3132) & i3142) | ((~i3142) & i3132);
                                                int i3162 = i3152 << 5;
                                                ((int[]) objArr572[2])[0] = ((~i3152) & i3162) | ((~i3162) & i3152);
                                                return objArr572;
                                            }
                                        }
                                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                        int i748 = -Drawable.resolveOpacity(0, 0);
                                        Object[] objArr185 = new Object[1];
                                        bravo(tapTimeout, (i748 & 595) + (i748 | 595), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr185);
                                        String str95 = (String) objArr185[0];
                                        int i749 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i750 = (i749 * 370) - (-635290);
                                        int i751 = (i749 ^ 1717) | (i749 & 1717);
                                        int i752 = -(-(((i751 & i108) | (i751 ^ i108)) * (-369)));
                                        int i753 = (i750 ^ i752) + ((i750 & i752) << 1);
                                        int i754 = ~i749;
                                        int i755 = ~((i754 & i108) | (i754 ^ i108));
                                        int i756 = -(-(((i755 & 1717) | (i755 ^ 1717)) * (-369)));
                                        int i757 = (i753 & i756) + (i756 | i753);
                                        int i758 = (~(((-1718) & i749) | ((-1718) ^ i749))) | (~((i749 ^ i4) | (i749 & i4)));
                                        int i759 = ~i749;
                                        int i760 = (i759 & i108) | (i759 ^ i108);
                                        int i761 = ((~((i760 & 1717) | (i760 ^ 1717))) | i758) * 369;
                                        char c43 = (char) ((i757 ^ i761) + ((i761 & i757) << 1));
                                        int i762 = -(-TextUtils.getOffsetBefore(str2, 0));
                                        int i763 = (i762 & 608) + (i762 | 608);
                                        int i764 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i765 = (i764 ^ 9) + ((i764 & 9) << 1);
                                        Object[] objArr186 = new Object[1];
                                        bravo(c43, i763, i765, objArr186);
                                        str5 = (String) objArr186[0];
                                        file3 = new File(str95);
                                        if (file3.exists() && file3.isFile()) {
                                            try {
                                                Scanner scanner4 = new Scanner(new FileInputStream(file3));
                                                char lastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf(str2, '0', 0));
                                                int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 229;
                                                int i766 = -TextUtils.indexOf(str2, str2);
                                                int i767 = (i766 & 2) + (i766 | 2);
                                                Object[] objArr187 = new Object[1];
                                                bravo(lastIndexOf5, doubleTapTimeout3, i767, objArr187);
                                                Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr187[0]);
                                                next = !useDelimiter4.hasNext() ? useDelimiter4.next() : str2;
                                                useDelimiter4.close();
                                            } catch (IOException unused4) {
                                            }
                                            if (next.contains(str5)) {
                                                int i768 = delta + 31;
                                                echo = i768 % 128;
                                                if (i768 % 2 == 0) {
                                                    i36 = ~(i4 & 12750);
                                                    i37 = i4 | 12750;
                                                } else {
                                                    i36 = ~(i4 & 261);
                                                    i37 = i4 | 261;
                                                }
                                                i35 = i36 & i37;
                                                int i29222 = i4 ^ i280;
                                                int i29322 = (i29222 | (-i29222)) >> 31;
                                                int i29422 = i35 & (~i29322);
                                                int i29522 = i280 & i29322;
                                                i38 = (i29522 & i29422) | (i29422 ^ i29522);
                                                if ((i5 & 8) == 0) {
                                                }
                                                int i29622 = -Color.red(0);
                                                int i29722 = -(-(Process.myPid() >> 22));
                                                Object[] objArr5522 = new Object[1];
                                                bravo((char) ((i29622 ^ 18372) + ((i29622 & 18372) << 1)), (i29722 ^ 739) + ((i29722 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr5522);
                                                String str3222 = (String) objArr5522[0];
                                                char c2222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int maximumDrawingCacheSize22 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                int i29822 = (maximumDrawingCacheSize22 & 780) + (maximumDrawingCacheSize22 | 780);
                                                int keyRepeatDelay222 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                i39 = 1;
                                                int i29922 = (keyRepeatDelay222 ^ 30) + ((keyRepeatDelay222 & 30) << 1);
                                                Object[] objArr5622 = new Object[1];
                                                bravo(c2222, i29822, i29922, objArr5622);
                                                c3 = 0;
                                                strArr3 = new String[]{str3222, (String) objArr5622[0]};
                                                i40 = 0;
                                                while (true) {
                                                    if (i40 >= 2) {
                                                    }
                                                    i40++;
                                                    i38 = i41;
                                                    strArr3 = strArr7;
                                                    i39 = 1;
                                                    c3 = 0;
                                                }
                                                int i30022 = i4 ^ i41;
                                                int i30122 = -i30022;
                                                int i30222 = ((i30022 & i30122) | (i30022 ^ i30122)) >> 31;
                                                int i30322 = i42 & (~i30222);
                                                int i30422 = i41 & i30222;
                                                int i30522 = (i30322 & i30422) | (i30322 ^ i30422);
                                                D88715 = uH18377.D8871(-344556366);
                                                if (D88715 == null) {
                                                }
                                                long longValue722 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                                long j5222 = 43243451;
                                                long j5322 = 628;
                                                long j5422 = -627;
                                                long uptimeMillis222 = (int) SystemClock.uptimeMillis();
                                                long j5522 = ((627 * ((((uptimeMillis222 ^ j6) | longValue722) ^ j6) | ((j5222 | uptimeMillis222) ^ j6))) + ((j5422 * ((((longValue722 ^ j6) | uptimeMillis222) ^ j6) | j5222)) + ((((longValue722 | uptimeMillis222) | (j5222 ^ j6)) * j5422) + ((j5322 * longValue722) + (j5322 * j5222))))) - 195496549;
                                                int myTid322 = Process.myTid();
                                                i43 = ((int) (j5522 >> 32)) & (((myTid322 | (-1292370017)) * 220) + (((~((~myTid322) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                                                int elapsedCpuTime222 = (int) Process.getElapsedCpuTime();
                                                i44 = ((int) j5522) & ((((~(elapsedCpuTime222 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime222)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime222) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                                                if (((i43 & i44) | (i43 ^ i44)) != 1) {
                                                }
                                                int i30622 = (~(i4 & i30522)) & (i4 | i30522);
                                                int i30722 = -i30622;
                                                int i30822 = (((i30622 & i30722) | (i30622 ^ i30722)) >> 31) & 16;
                                                Object[] objArr5722 = {new int[]{i30522}, new int[]{i4}, new int[1], strArr4};
                                                int elapsedCpuTime322 = (int) Process.getElapsedCpuTime();
                                                int i30922 = (((~(elapsedCpuTime322 | (-674538))) | (~((~elapsedCpuTime322) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime322))) * 210) - 585050909);
                                                int i31022 = (i30922 ^ i30822) + ((i30922 & i30822) << 1);
                                                int i31122 = (i10 & i31022) + (i10 | i31022);
                                                int i31222 = i31122 << 13;
                                                int i31322 = (i31122 | i31222) & (~(i31122 & i31222));
                                                int i31422 = i31322 >>> 17;
                                                int i31522 = ((~i31322) & i31422) | ((~i31422) & i31322);
                                                int i31622 = i31522 << 5;
                                                ((int[]) objArr5722[2])[0] = ((~i31522) & i31622) | ((~i31622) & i31522);
                                                return objArr5722;
                                            }
                                        }
                                        i35 = i4;
                                        int i292222 = i4 ^ i280;
                                        int i293222 = (i292222 | (-i292222)) >> 31;
                                        int i294222 = i35 & (~i293222);
                                        int i295222 = i280 & i293222;
                                        i38 = (i295222 & i294222) | (i294222 ^ i295222);
                                        if ((i5 & 8) == 0) {
                                        }
                                        int i296222 = -Color.red(0);
                                        int i297222 = -(-(Process.myPid() >> 22));
                                        Object[] objArr55222 = new Object[1];
                                        bravo((char) ((i296222 ^ 18372) + ((i296222 & 18372) << 1)), (i297222 ^ 739) + ((i297222 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr55222);
                                        String str32222 = (String) objArr55222[0];
                                        char c22222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int maximumDrawingCacheSize222 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        int i298222 = (maximumDrawingCacheSize222 & 780) + (maximumDrawingCacheSize222 | 780);
                                        int keyRepeatDelay2222 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                        i39 = 1;
                                        int i299222 = (keyRepeatDelay2222 ^ 30) + ((keyRepeatDelay2222 & 30) << 1);
                                        Object[] objArr56222 = new Object[1];
                                        bravo(c22222, i298222, i299222, objArr56222);
                                        c3 = 0;
                                        strArr3 = new String[]{str32222, (String) objArr56222[0]};
                                        i40 = 0;
                                        while (true) {
                                            if (i40 >= 2) {
                                            }
                                            i40++;
                                            i38 = i41;
                                            strArr3 = strArr7;
                                            i39 = 1;
                                            c3 = 0;
                                        }
                                        int i300222 = i4 ^ i41;
                                        int i301222 = -i300222;
                                        int i302222 = ((i300222 & i301222) | (i300222 ^ i301222)) >> 31;
                                        int i303222 = i42 & (~i302222);
                                        int i304222 = i41 & i302222;
                                        int i305222 = (i303222 & i304222) | (i303222 ^ i304222);
                                        D88715 = uH18377.D8871(-344556366);
                                        if (D88715 == null) {
                                        }
                                        long longValue7222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                        long j52222 = 43243451;
                                        long j53222 = 628;
                                        long j54222 = -627;
                                        long uptimeMillis2222 = (int) SystemClock.uptimeMillis();
                                        long j55222 = ((627 * ((((uptimeMillis2222 ^ j6) | longValue7222) ^ j6) | ((j52222 | uptimeMillis2222) ^ j6))) + ((j54222 * ((((longValue7222 ^ j6) | uptimeMillis2222) ^ j6) | j52222)) + ((((longValue7222 | uptimeMillis2222) | (j52222 ^ j6)) * j54222) + ((j53222 * longValue7222) + (j53222 * j52222))))) - 195496549;
                                        int myTid3222 = Process.myTid();
                                        i43 = ((int) (j55222 >> 32)) & (((myTid3222 | (-1292370017)) * 220) + (((~((~myTid3222) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                                        int elapsedCpuTime2222 = (int) Process.getElapsedCpuTime();
                                        i44 = ((int) j55222) & ((((~(elapsedCpuTime2222 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime2222)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime2222) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                                        if (((i43 & i44) | (i43 ^ i44)) != 1) {
                                        }
                                        int i306222 = (~(i4 & i305222)) & (i4 | i305222);
                                        int i307222 = -i306222;
                                        int i308222 = (((i306222 & i307222) | (i306222 ^ i307222)) >> 31) & 16;
                                        Object[] objArr57222 = {new int[]{i305222}, new int[]{i4}, new int[1], strArr4};
                                        int elapsedCpuTime3222 = (int) Process.getElapsedCpuTime();
                                        int i309222 = (((~(elapsedCpuTime3222 | (-674538))) | (~((~elapsedCpuTime3222) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime3222))) * 210) - 585050909);
                                        int i310222 = (i309222 ^ i308222) + ((i309222 & i308222) << 1);
                                        int i311222 = (i10 & i310222) + (i10 | i310222);
                                        int i312222 = i311222 << 13;
                                        int i313222 = (i311222 | i312222) & (~(i311222 & i312222));
                                        int i314222 = i313222 >>> 17;
                                        int i315222 = ((~i313222) & i314222) | ((~i314222) & i313222);
                                        int i316222 = i315222 << 5;
                                        ((int[]) objArr57222[2])[0] = ((~i315222) & i316222) | ((~i316222) & i315222);
                                        return objArr57222;
                                    }
                                }
                                i30 = i4;
                                int i1942 = i4 ^ i188;
                                int i1952 = (i1942 | (-i1942)) >> 31;
                                int i1962 = i30 & (~i1952);
                                int i1972 = i188 & i1952;
                                int i1982 = (i1972 & i1962) | (i1962 ^ i1972);
                                char absoluteGravity22 = (char) Gravity.getAbsoluteGravity(0, 0);
                                int i1992 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int i2002 = (i1992 & 349) + (i1992 | 349);
                                int i2012 = -(ViewConfiguration.getTouchSlop() >> 8);
                                int i2022 = ((i2012 | 17) << 1) - (i2012 ^ 17);
                                Object[] objArr372 = new Object[1];
                                bravo(absoluteGravity22, i2002, i2022, objArr372);
                                String str242 = (String) objArr372[0];
                                char scrollDefaultDelay6 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i2032 = -ImageFormat.getBitsPerPixel(0);
                                int i2042 = (i2032 ^ 365) + ((i2032 & 365) << 1);
                                int i2052 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                int i2062 = (i2052 & 6) + (i2052 | 6);
                                Object[] objArr382 = new Object[1];
                                bravo(scrollDefaultDelay6, i2042, i2062, objArr382);
                                Object[] objArr392 = new Object[i16];
                                objArr392[1] = (String) objArr382[0];
                                objArr392[0] = str242;
                                D88713 = uH18377.D8871(1214576837);
                                if (D88713 == null) {
                                }
                                long longValue62 = ((Long) ((Method) D88713).invoke(null, objArr392)).longValue();
                                long j442 = 183599130;
                                long j452 = -115;
                                long maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                long j462 = ((-116) * ((((maxMemory2 ^ j23) | j442) | longValue62) ^ j23)) + (j452 * longValue62) + (j452 * j442);
                                long j472 = 116;
                                long j482 = ((j442 | maxMemory2) * j472) + j462;
                                long j492 = j442 ^ j23;
                                long j502 = longValue62 ^ j23;
                                long j512 = ((j472 * (((j492 | j502) ^ j23) | ((maxMemory2 | j502) ^ j23))) + j482) - 1731237468;
                                int i2072 = ((int) (j512 >> 32)) & ((((~(1129112812 | i108)) | (-1733092845) | (~((-1124648041) | i4))) * 676) + (((~((-1728628073) | i108)) | 603980032) * 676) + ((((-603980033) | i4) * (-676)) - 108163526));
                                int i2082 = (~((-345946096) | i4)) | 345420390;
                                int i2092 = ~((-1782646801) | i108);
                                if ((i2072 | (((int) j512) & (((i2092 | (~((-525706) | i4))) * 470) + (((i2082 | i2092) * (-470)) + 1996566937)))) == 0) {
                                }
                                int i2112 = (~(i4 & i1982)) & (i4 | i1982);
                                int i2122 = -i2112;
                                int i2132 = ((i2112 & i2122) | (i2112 ^ i2122)) >> 31;
                                int i2142 = i210 & (~i2132);
                                int i2152 = i2132 & i1982;
                                int i2162 = (i2142 & i2152) | (i2142 ^ i2152);
                                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                                int i2172 = 371 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int i2182 = -(ViewConfiguration.getTouchSlop() >> 8);
                                int i2192 = ((i2182 | 23) << 1) - (i2182 ^ 23);
                                Object[] objArr412 = new Object[1];
                                bravo((char) ((packedPositionChild4 & 1) + (packedPositionChild4 | 1)), i2172, i2192, objArr412);
                                Object[] objArr422 = {(String) objArr412[0]};
                                D88714 = uH18377.D8871(-957097391);
                                if (D88714 == null) {
                                }
                                lowerCase = ((String) ((Method) D88714).invoke(null, objArr422)).toLowerCase();
                                int i2202 = -View.combineMeasuredStates(0, 0);
                                int i2212 = -TextUtils.indexOf(str2, str2, 0);
                                objArr = new Object[1];
                                bravo((char) ((i2202 & 32713) + (i2202 | 32713)), ((i2212 | 395) << 1) - (i2212 ^ 395), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr);
                                if (lowerCase.contains((String) objArr[0])) {
                                }
                                int i2282 = ((~i2162) & i4) | (i2162 & i108);
                                int i2292 = -i2282;
                                int i2302 = ((i2282 & i2292) | (i2282 ^ i2292)) >> 31;
                                int i2312 = i31 & (~i2302);
                                int i2322 = i2162 & i2302;
                                int i2332 = (i2322 & i2312) | (i2312 ^ i2322);
                                char c192 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41046);
                                int i2342 = -TextUtils.indexOf(str2, str2);
                                Object[] objArr442 = new Object[1];
                                bravo(c192, (i2342 ^ 399) + ((i2342 & 399) << 1), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr442);
                                String str252 = (String) objArr442[0];
                                char normalizeMetaState32 = (char) KeyEvent.normalizeMetaState(0);
                                int i2352 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i2362 = ((i2352 | 441) << 1) - (i2352 ^ 441);
                                int i2372 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i2382 = ((i2372 | 40) << 1) - (i2372 ^ 40);
                                Object[] objArr452 = new Object[1];
                                bravo(normalizeMetaState32, i2362, i2382, objArr452);
                                String str262 = (String) objArr452[0];
                                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i2392 = (jumpTapTimeout2 * (-375)) - 7889625;
                                int i2402 = ~jumpTapTimeout2;
                                int i2412 = (~((i2402 ^ (-21040)) | (i2402 & (-21040)))) | i4;
                                int i2422 = ~((jumpTapTimeout2 ^ 21039) | (jumpTapTimeout2 & 21039));
                                int i2432 = -(-(((i2412 & i2422) | (i2412 ^ i2422)) * 376));
                                int i2442 = ((i2392 | i2432) << 1) - (i2392 ^ i2432);
                                int i2452 = ~((jumpTapTimeout2 & i108) | (i108 ^ jumpTapTimeout2));
                                int i2462 = ((i2452 & i2422) | (i2452 ^ i2422)) * (-376);
                                int i2472 = (i2442 & i2462) + (i2462 | i2442);
                                int i2482 = ~(i2402 | i4);
                                char c202 = (char) ((((i2482 & 21039) | (i2482 ^ 21039)) * 376) + i2472);
                                int i2492 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i2502 = (i2492 ^ 482) + ((i2492 & 482) << 1);
                                int indexOf52 = TextUtils.indexOf(str2, str2, 0, 0);
                                int i2512 = (indexOf52 & 27) + (indexOf52 | 27);
                                Object[] objArr462 = new Object[1];
                                bravo(c202, i2502, i2512, objArr462);
                                String str272 = (String) objArr462[0];
                                char gidForName22 = (char) (Process.getGidForName(str2) + 21044);
                                int i2522 = -(-TextUtils.indexOf(str2, str2, 0));
                                int i2532 = (i2522 ^ 508) + ((i2522 & 508) << 1);
                                int i2542 = -(-View.resolveSize(0, 0));
                                int i2552 = (i2542 ^ 27) + ((i2542 & 27) << 1);
                                Object[] objArr472 = new Object[1];
                                bravo(gidForName22, i2532, i2552, objArr472);
                                String str282 = (String) objArr472[0];
                                int i2562 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int D8871162 = InvalidProxyIntegrationHeaders.D8871();
                                int i2572 = i2562 * 905;
                                int i2582 = (i2572 ^ 903) + ((i2572 & 903) << 1);
                                int i2592 = ~i2562;
                                int i2602 = ~(i2592 | D8871162);
                                int i2612 = ~D8871162;
                                int i2622 = ~((~i2612) | i2612);
                                int i2632 = (((i2602 & i2622) | (i2602 ^ i2622)) * (-1808)) + i2582;
                                int i2642 = (i2612 ^ i2562) | (i2612 & i2562);
                                int i2652 = ((~((i2592 ^ D8871162) | (i2592 & D8871162))) | (~(i2642 | (~i2642)))) * 904;
                                int i2662 = ((i2632 | i2652) << 1) - (i2652 ^ i2632);
                                int i2672 = ~(i2592 | (~i2592));
                                int i2682 = ~D8871162;
                                int i2692 = (i2682 & i2672) | (i2672 ^ i2682);
                                int i2702 = ~((i2562 & i2612) | (i2612 ^ i2562));
                                Object[] objArr482 = new Object[1];
                                bravo((char) ((i2662 - (~(-(-(((i2702 & i2692) | (i2692 ^ i2702)) * 904))))) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 534, KeyEvent.keyCodeFromString(str2) + 27, objArr482);
                                String str292 = (String) objArr482[0];
                                char gidForName32 = (char) ((-1) - Process.getGidForName(str2));
                                int i2712 = -((byte) KeyEvent.getModifierMetaStateMask());
                                Object[] objArr492 = new Object[1];
                                bravo(gidForName32, (i2712 & 561) + (i2712 | 561), View.resolveSizeAndState(0, 0, 0) + 27, objArr492);
                                strArr2 = new String[]{str252, str262, str272, str282, str292, (String) objArr492[0]};
                                i32 = i13;
                                i33 = 0;
                                while (true) {
                                    if (i33 < i32) {
                                    }
                                    i33++;
                                    strArr2 = strArr8;
                                    i32 = 6;
                                }
                                int i2752 = ((~i2332) & i4) | (i2332 & i108);
                                int i2762 = -i2752;
                                int i2772 = ((i2752 & i2762) | (i2752 ^ i2762)) >> 31;
                                int i2782 = i34 & (~i2772);
                                int i2792 = i2332 & i2772;
                                int i2802 = (i2792 & i2782) | (i2782 ^ i2792);
                                char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i2812 = -Drawable.resolveOpacity(0, 0);
                                int i2822 = (i2812 ^ 349) + ((i2812 & 349) << 1);
                                int i2832 = -TextUtils.indexOf(str2, str2, 0);
                                int i2842 = (i2832 ^ 17) + ((i2832 & 17) << 1);
                                Object[] objArr522 = new Object[1];
                                bravo(fadingEdgeLength5, i2822, i2842, objArr522);
                                String str312 = (String) objArr522[0];
                                char indexOf62 = (char) (6383 - TextUtils.indexOf((CharSequence) str2, '0', 0));
                                int i2852 = -Color.red(0);
                                int i2862 = (i2852 ^ 589) + ((i2852 & 589) << 1);
                                int i2872 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int i2882 = ((i2872 | 6) << 1) - (i2872 ^ 6);
                                Object[] objArr532 = new Object[1];
                                bravo(indexOf62, i2862, i2882, objArr532);
                                str4 = (String) objArr532[0];
                                file2 = new File(str312);
                                if (file2.exists()) {
                                    Scanner scanner22 = new Scanner(new FileInputStream(file2));
                                    char packedPositionType22 = (char) ExpandableListView.getPackedPositionType(0L);
                                    int i2892 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    Object[] objArr542 = new Object[1];
                                    bravo(packedPositionType22, (i2892 & 230) + (i2892 | 230), 2 - TextUtils.indexOf(str2, str2), objArr542);
                                    Scanner useDelimiter22 = scanner22.useDelimiter((String) objArr542[0]);
                                    if (!useDelimiter22.hasNext()) {
                                    }
                                    useDelimiter22.close();
                                    if (next2.contains(str4)) {
                                    }
                                }
                                char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int i7482 = -Drawable.resolveOpacity(0, 0);
                                Object[] objArr1852 = new Object[1];
                                bravo(tapTimeout2, (i7482 & 595) + (i7482 | 595), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr1852);
                                String str952 = (String) objArr1852[0];
                                int i7492 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i7502 = (i7492 * 370) - (-635290);
                                int i7512 = (i7492 ^ 1717) | (i7492 & 1717);
                                int i7522 = -(-(((i7512 & i108) | (i7512 ^ i108)) * (-369)));
                                int i7532 = (i7502 ^ i7522) + ((i7502 & i7522) << 1);
                                int i7542 = ~i7492;
                                int i7552 = ~((i7542 & i108) | (i7542 ^ i108));
                                int i7562 = -(-(((i7552 & 1717) | (i7552 ^ 1717)) * (-369)));
                                int i7572 = (i7532 & i7562) + (i7562 | i7532);
                                int i7582 = (~(((-1718) & i7492) | ((-1718) ^ i7492))) | (~((i7492 ^ i4) | (i7492 & i4)));
                                int i7592 = ~i7492;
                                int i7602 = (i7592 & i108) | (i7592 ^ i108);
                                int i7612 = ((~((i7602 & 1717) | (i7602 ^ 1717))) | i7582) * 369;
                                char c432 = (char) ((i7572 ^ i7612) + ((i7612 & i7572) << 1));
                                int i7622 = -(-TextUtils.getOffsetBefore(str2, 0));
                                int i7632 = (i7622 & 608) + (i7622 | 608);
                                int i7642 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i7652 = (i7642 ^ 9) + ((i7642 & 9) << 1);
                                Object[] objArr1862 = new Object[1];
                                bravo(c432, i7632, i7652, objArr1862);
                                str5 = (String) objArr1862[0];
                                file3 = new File(str952);
                                if (file3.exists()) {
                                    Scanner scanner42 = new Scanner(new FileInputStream(file3));
                                    char lastIndexOf52 = (char) ((-1) - TextUtils.lastIndexOf(str2, '0', 0));
                                    int doubleTapTimeout32 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 229;
                                    int i7662 = -TextUtils.indexOf(str2, str2);
                                    int i7672 = (i7662 & 2) + (i7662 | 2);
                                    Object[] objArr1872 = new Object[1];
                                    bravo(lastIndexOf52, doubleTapTimeout32, i7672, objArr1872);
                                    Scanner useDelimiter42 = scanner42.useDelimiter((String) objArr1872[0]);
                                    if (!useDelimiter42.hasNext()) {
                                    }
                                    useDelimiter42.close();
                                    if (next.contains(str5)) {
                                    }
                                }
                                i35 = i4;
                                int i2922222 = i4 ^ i2802;
                                int i2932222 = (i2922222 | (-i2922222)) >> 31;
                                int i2942222 = i35 & (~i2932222);
                                int i2952222 = i2802 & i2932222;
                                i38 = (i2952222 & i2942222) | (i2942222 ^ i2952222);
                                if ((i5 & 8) == 0) {
                                }
                                int i2962222 = -Color.red(0);
                                int i2972222 = -(-(Process.myPid() >> 22));
                                Object[] objArr552222 = new Object[1];
                                bravo((char) ((i2962222 ^ 18372) + ((i2962222 & 18372) << 1)), (i2972222 ^ 739) + ((i2972222 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr552222);
                                String str322222 = (String) objArr552222[0];
                                char c222222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int maximumDrawingCacheSize2222 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                int i2982222 = (maximumDrawingCacheSize2222 & 780) + (maximumDrawingCacheSize2222 | 780);
                                int keyRepeatDelay22222 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                i39 = 1;
                                int i2992222 = (keyRepeatDelay22222 ^ 30) + ((keyRepeatDelay22222 & 30) << 1);
                                Object[] objArr562222 = new Object[1];
                                bravo(c222222, i2982222, i2992222, objArr562222);
                                c3 = 0;
                                strArr3 = new String[]{str322222, (String) objArr562222[0]};
                                i40 = 0;
                                while (true) {
                                    if (i40 >= 2) {
                                    }
                                    i40++;
                                    i38 = i41;
                                    strArr3 = strArr7;
                                    i39 = 1;
                                    c3 = 0;
                                }
                                int i3002222 = i4 ^ i41;
                                int i3012222 = -i3002222;
                                int i3022222 = ((i3002222 & i3012222) | (i3002222 ^ i3012222)) >> 31;
                                int i3032222 = i42 & (~i3022222);
                                int i3042222 = i41 & i3022222;
                                int i3052222 = (i3032222 & i3042222) | (i3032222 ^ i3042222);
                                D88715 = uH18377.D8871(-344556366);
                                if (D88715 == null) {
                                }
                                long longValue72222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                                long j522222 = 43243451;
                                long j532222 = 628;
                                long j542222 = -627;
                                long uptimeMillis22222 = (int) SystemClock.uptimeMillis();
                                long j552222 = ((627 * ((((uptimeMillis22222 ^ j6) | longValue72222) ^ j6) | ((j522222 | uptimeMillis22222) ^ j6))) + ((j542222 * ((((longValue72222 ^ j6) | uptimeMillis22222) ^ j6) | j522222)) + ((((longValue72222 | uptimeMillis22222) | (j522222 ^ j6)) * j542222) + ((j532222 * longValue72222) + (j532222 * j522222))))) - 195496549;
                                int myTid32222 = Process.myTid();
                                i43 = ((int) (j552222 >> 32)) & (((myTid32222 | (-1292370017)) * 220) + (((~((~myTid32222) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                                int elapsedCpuTime22222 = (int) Process.getElapsedCpuTime();
                                i44 = ((int) j552222) & ((((~(elapsedCpuTime22222 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime22222)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime22222) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                                if (((i43 & i44) | (i43 ^ i44)) != 1) {
                                }
                                int i3062222 = (~(i4 & i3052222)) & (i4 | i3052222);
                                int i3072222 = -i3062222;
                                int i3082222 = (((i3062222 & i3072222) | (i3062222 ^ i3072222)) >> 31) & 16;
                                Object[] objArr572222 = {new int[]{i3052222}, new int[]{i4}, new int[1], strArr4};
                                int elapsedCpuTime32222 = (int) Process.getElapsedCpuTime();
                                int i3092222 = (((~(elapsedCpuTime32222 | (-674538))) | (~((~elapsedCpuTime32222) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime32222))) * 210) - 585050909);
                                int i3102222 = (i3092222 ^ i3082222) + ((i3092222 & i3082222) << 1);
                                int i3112222 = (i10 & i3102222) + (i10 | i3102222);
                                int i3122222 = i3112222 << 13;
                                int i3132222 = (i3112222 | i3122222) & (~(i3112222 & i3122222));
                                int i3142222 = i3132222 >>> 17;
                                int i3152222 = ((~i3132222) & i3142222) | ((~i3142222) & i3132222);
                                int i3162222 = i3152222 << 5;
                                ((int[]) objArr572222[2])[0] = ((~i3152222) & i3162222) | ((~i3162222) & i3152222);
                                return objArr572222;
                            }
                        }
                    }
                }
                i25 = 0;
                int i1452 = (i25 | (-i25)) >> 31;
                int i1462 = (i1452 & ((i4 & (-263)) | (i108 & 262))) | ((~i1452) & i4);
                int i1472 = ((~i131) & i4) | (i131 & i108);
                int i1482 = -i1472;
                int i1492 = ((i1472 & i1482) | (i1472 ^ i1482)) >> 31;
                int i1502 = (i131 & i1492) | (i1462 & (~i1492));
                Object[] objArr272 = new Object[1];
                bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetBefore(str2, 0) + 231, 29 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr272);
                String str212 = (String) objArr272[0];
                int i1512 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i1522 = -View.MeasureSpec.getSize(0);
                int i1532 = (i1522 ^ 262) + ((i1522 & 262) << 1);
                int indexOf22 = TextUtils.indexOf(str2, str2);
                int D8871132 = InvalidProxyIntegrationHeaders.D8871();
                int i1542 = indexOf22 * 714;
                int i1552 = (i1542 ^ (-16376)) + ((i1542 & (-16376)) << 1);
                int i1562 = ~indexOf22;
                int i1572 = ~D8871132;
                int i1582 = ~((i1562 ^ i1572) | (i1572 & i1562));
                int i1592 = ~(i1562 | 23);
                int i1602 = (i1582 ^ i1592) | (i1582 & i1592);
                int i1612 = ((-24) ^ indexOf22) | ((-24) & indexOf22);
                int i1622 = ~((i1612 ^ D8871132) | (i1612 & D8871132));
                int i1632 = (((i1602 ^ i1622) | (i1602 & i1622)) * (-713)) + i1552;
                int i1642 = (indexOf22 & (-24)) | ((-24) ^ indexOf22);
                int i1652 = (~((i1642 & D8871132) | (i1642 ^ D8871132))) * 1426;
                int i1662 = (i1632 ^ i1652) + ((i1632 & i1652) << 1);
                int i1672 = ~D8871132;
                int i1682 = -(-((~((i1672 & (-24)) | ((-24) ^ i1672))) * 713));
                int i1692 = (i1662 ^ i1682) + ((i1682 & i1662) << 1);
                Object[] objArr282 = new Object[1];
                bravo((char) ((i1512 ^ (-1)) + (i1512 << 1)), i1532, i1692, objArr282);
                String str222 = (String) objArr282[0];
                int i1702 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i1712 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 286;
                int i1722 = -(-ExpandableListView.getPackedPositionGroup(0L));
                int i1732 = (i1722 & 28) + (i1722 | 28);
                Object[] objArr292 = new Object[1];
                bravo((char) (((i1702 | 38243) << 1) - (i1702 ^ 38243)), i1712, i1732, objArr292);
                String str232 = (String) objArr292[0];
                i26 = 1;
                Object[] objArr302 = new Object[1];
                bravo((char) (21273 - (~(-(-(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)))))), Process.getGidForName(str2) + 314, (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr302);
                i27 = 0;
                strArr = new String[]{str212, str222, str232, (String) objArr302[0]};
                i28 = 0;
                while (true) {
                    if (i28 >= 4) {
                    }
                    int i1822 = (i28 ^ (-106)) + ((i28 & (-106)) << 1);
                    i28 = (i1822 & 107) + (i1822 | 107);
                    strArr = strArr9;
                    j25 = j5;
                    i27 = 0;
                    i26 = 1;
                }
                int i1832 = (~(i4 & i1502)) & (i4 | i1502);
                int i1842 = -i1832;
                int i1852 = ((i1832 & i1842) | (i1832 ^ i1842)) >> 31;
                int i1862 = i29 & (~i1852);
                int i1872 = i1502 & i1852;
                int i1882 = (i1862 & i1872) | (i1862 ^ i1872);
                int i1892 = -(-View.combineMeasuredStates(0, 0));
                int indexOf32 = TextUtils.indexOf(str2, str2, 0);
                Object[] objArr332 = new Object[1];
                bravo((char) ((i1892 & 878) + (i1892 | 878)), (indexOf32 & 327) + (indexOf32 | 327), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, objArr332);
                Object[] objArr342 = {(String) objArr332[0]};
                D88712 = uH18377.D8871(-957097391);
                if (D88712 == null) {
                }
                str3 = (String) ((Method) D88712).invoke(null, objArr342);
                if (str3 != null) {
                }
                i30 = i4;
                int i19422 = i4 ^ i1882;
                int i19522 = (i19422 | (-i19422)) >> 31;
                int i19622 = i30 & (~i19522);
                int i19722 = i1882 & i19522;
                int i19822 = (i19722 & i19622) | (i19622 ^ i19722);
                char absoluteGravity222 = (char) Gravity.getAbsoluteGravity(0, 0);
                int i19922 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i20022 = (i19922 & 349) + (i19922 | 349);
                int i20122 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i20222 = ((i20122 | 17) << 1) - (i20122 ^ 17);
                Object[] objArr3722 = new Object[1];
                bravo(absoluteGravity222, i20022, i20222, objArr3722);
                String str2422 = (String) objArr3722[0];
                char scrollDefaultDelay62 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i20322 = -ImageFormat.getBitsPerPixel(0);
                int i20422 = (i20322 ^ 365) + ((i20322 & 365) << 1);
                int i20522 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i20622 = (i20522 & 6) + (i20522 | 6);
                Object[] objArr3822 = new Object[1];
                bravo(scrollDefaultDelay62, i20422, i20622, objArr3822);
                Object[] objArr3922 = new Object[i16];
                objArr3922[1] = (String) objArr3822[0];
                objArr3922[0] = str2422;
                D88713 = uH18377.D8871(1214576837);
                if (D88713 == null) {
                }
                long longValue622 = ((Long) ((Method) D88713).invoke(null, objArr3922)).longValue();
                long j4422 = 183599130;
                long j4522 = -115;
                long maxMemory22 = (int) Runtime.getRuntime().maxMemory();
                long j4622 = ((-116) * ((((maxMemory22 ^ j23) | j4422) | longValue622) ^ j23)) + (j4522 * longValue622) + (j4522 * j4422);
                long j4722 = 116;
                long j4822 = ((j4422 | maxMemory22) * j4722) + j4622;
                long j4922 = j4422 ^ j23;
                long j5022 = longValue622 ^ j23;
                long j5122 = ((j4722 * (((j4922 | j5022) ^ j23) | ((maxMemory22 | j5022) ^ j23))) + j4822) - 1731237468;
                int i20722 = ((int) (j5122 >> 32)) & ((((~(1129112812 | i108)) | (-1733092845) | (~((-1124648041) | i4))) * 676) + (((~((-1728628073) | i108)) | 603980032) * 676) + ((((-603980033) | i4) * (-676)) - 108163526));
                int i20822 = (~((-345946096) | i4)) | 345420390;
                int i20922 = ~((-1782646801) | i108);
                if ((i20722 | (((int) j5122) & (((i20922 | (~((-525706) | i4))) * 470) + (((i20822 | i20922) * (-470)) + 1996566937)))) == 0) {
                }
                int i21122 = (~(i4 & i19822)) & (i4 | i19822);
                int i21222 = -i21122;
                int i21322 = ((i21122 & i21222) | (i21122 ^ i21222)) >> 31;
                int i21422 = i210 & (~i21322);
                int i21522 = i21322 & i19822;
                int i21622 = (i21422 & i21522) | (i21422 ^ i21522);
                int packedPositionChild42 = ExpandableListView.getPackedPositionChild(0L);
                int i21722 = 371 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i21822 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i21922 = ((i21822 | 23) << 1) - (i21822 ^ 23);
                Object[] objArr4122 = new Object[1];
                bravo((char) ((packedPositionChild42 & 1) + (packedPositionChild42 | 1)), i21722, i21922, objArr4122);
                Object[] objArr4222 = {(String) objArr4122[0]};
                D88714 = uH18377.D8871(-957097391);
                if (D88714 == null) {
                }
                lowerCase = ((String) ((Method) D88714).invoke(null, objArr4222)).toLowerCase();
                int i22022 = -View.combineMeasuredStates(0, 0);
                int i22122 = -TextUtils.indexOf(str2, str2, 0);
                objArr = new Object[1];
                bravo((char) ((i22022 & 32713) + (i22022 | 32713)), ((i22122 | 395) << 1) - (i22122 ^ 395), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr);
                if (lowerCase.contains((String) objArr[0])) {
                }
                int i22822 = ((~i21622) & i4) | (i21622 & i108);
                int i22922 = -i22822;
                int i23022 = ((i22822 & i22922) | (i22822 ^ i22922)) >> 31;
                int i23122 = i31 & (~i23022);
                int i23222 = i21622 & i23022;
                int i23322 = (i23222 & i23122) | (i23122 ^ i23222);
                char c1922 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41046);
                int i23422 = -TextUtils.indexOf(str2, str2);
                Object[] objArr4422 = new Object[1];
                bravo(c1922, (i23422 ^ 399) + ((i23422 & 399) << 1), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4422);
                String str2522 = (String) objArr4422[0];
                char normalizeMetaState322 = (char) KeyEvent.normalizeMetaState(0);
                int i23522 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i23622 = ((i23522 | 441) << 1) - (i23522 ^ 441);
                int i23722 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i23822 = ((i23722 | 40) << 1) - (i23722 ^ 40);
                Object[] objArr4522 = new Object[1];
                bravo(normalizeMetaState322, i23622, i23822, objArr4522);
                String str2622 = (String) objArr4522[0];
                int jumpTapTimeout22 = ViewConfiguration.getJumpTapTimeout() >> 16;
                int i23922 = (jumpTapTimeout22 * (-375)) - 7889625;
                int i24022 = ~jumpTapTimeout22;
                int i24122 = (~((i24022 ^ (-21040)) | (i24022 & (-21040)))) | i4;
                int i24222 = ~((jumpTapTimeout22 ^ 21039) | (jumpTapTimeout22 & 21039));
                int i24322 = -(-(((i24122 & i24222) | (i24122 ^ i24222)) * 376));
                int i24422 = ((i23922 | i24322) << 1) - (i23922 ^ i24322);
                int i24522 = ~((jumpTapTimeout22 & i108) | (i108 ^ jumpTapTimeout22));
                int i24622 = ((i24522 & i24222) | (i24522 ^ i24222)) * (-376);
                int i24722 = (i24422 & i24622) + (i24622 | i24422);
                int i24822 = ~(i24022 | i4);
                char c2022 = (char) ((((i24822 & 21039) | (i24822 ^ 21039)) * 376) + i24722);
                int i24922 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i25022 = (i24922 ^ 482) + ((i24922 & 482) << 1);
                int indexOf522 = TextUtils.indexOf(str2, str2, 0, 0);
                int i25122 = (indexOf522 & 27) + (indexOf522 | 27);
                Object[] objArr4622 = new Object[1];
                bravo(c2022, i25022, i25122, objArr4622);
                String str2722 = (String) objArr4622[0];
                char gidForName222 = (char) (Process.getGidForName(str2) + 21044);
                int i25222 = -(-TextUtils.indexOf(str2, str2, 0));
                int i25322 = (i25222 ^ 508) + ((i25222 & 508) << 1);
                int i25422 = -(-View.resolveSize(0, 0));
                int i25522 = (i25422 ^ 27) + ((i25422 & 27) << 1);
                Object[] objArr4722 = new Object[1];
                bravo(gidForName222, i25322, i25522, objArr4722);
                String str2822 = (String) objArr4722[0];
                int i25622 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int D88711622 = InvalidProxyIntegrationHeaders.D8871();
                int i25722 = i25622 * 905;
                int i25822 = (i25722 ^ 903) + ((i25722 & 903) << 1);
                int i25922 = ~i25622;
                int i26022 = ~(i25922 | D88711622);
                int i26122 = ~D88711622;
                int i26222 = ~((~i26122) | i26122);
                int i26322 = (((i26022 & i26222) | (i26022 ^ i26222)) * (-1808)) + i25822;
                int i26422 = (i26122 ^ i25622) | (i26122 & i25622);
                int i26522 = ((~((i25922 ^ D88711622) | (i25922 & D88711622))) | (~(i26422 | (~i26422)))) * 904;
                int i26622 = ((i26322 | i26522) << 1) - (i26522 ^ i26322);
                int i26722 = ~(i25922 | (~i25922));
                int i26822 = ~D88711622;
                int i26922 = (i26822 & i26722) | (i26722 ^ i26822);
                int i27022 = ~((i25622 & i26122) | (i26122 ^ i25622));
                Object[] objArr4822 = new Object[1];
                bravo((char) ((i26622 - (~(-(-(((i27022 & i26922) | (i26922 ^ i27022)) * 904))))) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 534, KeyEvent.keyCodeFromString(str2) + 27, objArr4822);
                String str2922 = (String) objArr4822[0];
                char gidForName322 = (char) ((-1) - Process.getGidForName(str2));
                int i27122 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr4922 = new Object[1];
                bravo(gidForName322, (i27122 & 561) + (i27122 | 561), View.resolveSizeAndState(0, 0, 0) + 27, objArr4922);
                strArr2 = new String[]{str2522, str2622, str2722, str2822, str2922, (String) objArr4922[0]};
                i32 = i13;
                i33 = 0;
                while (true) {
                    if (i33 < i32) {
                    }
                    i33++;
                    strArr2 = strArr8;
                    i32 = 6;
                }
                int i27522 = ((~i23322) & i4) | (i23322 & i108);
                int i27622 = -i27522;
                int i27722 = ((i27522 & i27622) | (i27522 ^ i27622)) >> 31;
                int i27822 = i34 & (~i27722);
                int i27922 = i23322 & i27722;
                int i28022 = (i27922 & i27822) | (i27822 ^ i27922);
                char fadingEdgeLength52 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i28122 = -Drawable.resolveOpacity(0, 0);
                int i28222 = (i28122 ^ 349) + ((i28122 & 349) << 1);
                int i28322 = -TextUtils.indexOf(str2, str2, 0);
                int i28422 = (i28322 ^ 17) + ((i28322 & 17) << 1);
                Object[] objArr5222 = new Object[1];
                bravo(fadingEdgeLength52, i28222, i28422, objArr5222);
                String str3122 = (String) objArr5222[0];
                char indexOf622 = (char) (6383 - TextUtils.indexOf((CharSequence) str2, '0', 0));
                int i28522 = -Color.red(0);
                int i28622 = (i28522 ^ 589) + ((i28522 & 589) << 1);
                int i28722 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i28822 = ((i28722 | 6) << 1) - (i28722 ^ 6);
                Object[] objArr5322 = new Object[1];
                bravo(indexOf622, i28622, i28822, objArr5322);
                str4 = (String) objArr5322[0];
                file2 = new File(str3122);
                if (file2.exists()) {
                }
                char tapTimeout22 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int i74822 = -Drawable.resolveOpacity(0, 0);
                Object[] objArr18522 = new Object[1];
                bravo(tapTimeout22, (i74822 & 595) + (i74822 | 595), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr18522);
                String str9522 = (String) objArr18522[0];
                int i74922 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i75022 = (i74922 * 370) - (-635290);
                int i75122 = (i74922 ^ 1717) | (i74922 & 1717);
                int i75222 = -(-(((i75122 & i108) | (i75122 ^ i108)) * (-369)));
                int i75322 = (i75022 ^ i75222) + ((i75022 & i75222) << 1);
                int i75422 = ~i74922;
                int i75522 = ~((i75422 & i108) | (i75422 ^ i108));
                int i75622 = -(-(((i75522 & 1717) | (i75522 ^ 1717)) * (-369)));
                int i75722 = (i75322 & i75622) + (i75622 | i75322);
                int i75822 = (~(((-1718) & i74922) | ((-1718) ^ i74922))) | (~((i74922 ^ i4) | (i74922 & i4)));
                int i75922 = ~i74922;
                int i76022 = (i75922 & i108) | (i75922 ^ i108);
                int i76122 = ((~((i76022 & 1717) | (i76022 ^ 1717))) | i75822) * 369;
                char c4322 = (char) ((i75722 ^ i76122) + ((i76122 & i75722) << 1));
                int i76222 = -(-TextUtils.getOffsetBefore(str2, 0));
                int i76322 = (i76222 & 608) + (i76222 | 608);
                int i76422 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i76522 = (i76422 ^ 9) + ((i76422 & 9) << 1);
                Object[] objArr18622 = new Object[1];
                bravo(c4322, i76322, i76522, objArr18622);
                str5 = (String) objArr18622[0];
                file3 = new File(str9522);
                if (file3.exists()) {
                }
                i35 = i4;
                int i29222222 = i4 ^ i28022;
                int i29322222 = (i29222222 | (-i29222222)) >> 31;
                int i29422222 = i35 & (~i29322222);
                int i29522222 = i28022 & i29322222;
                i38 = (i29522222 & i29422222) | (i29422222 ^ i29522222);
                if ((i5 & 8) == 0) {
                }
                int i29622222 = -Color.red(0);
                int i29722222 = -(-(Process.myPid() >> 22));
                Object[] objArr5522222 = new Object[1];
                bravo((char) ((i29622222 ^ 18372) + ((i29622222 & 18372) << 1)), (i29722222 ^ 739) + ((i29722222 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr5522222);
                String str3222222 = (String) objArr5522222[0];
                char c2222222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int maximumDrawingCacheSize22222 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                int i29822222 = (maximumDrawingCacheSize22222 & 780) + (maximumDrawingCacheSize22222 | 780);
                int keyRepeatDelay222222 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                i39 = 1;
                int i29922222 = (keyRepeatDelay222222 ^ 30) + ((keyRepeatDelay222222 & 30) << 1);
                Object[] objArr5622222 = new Object[1];
                bravo(c2222222, i29822222, i29922222, objArr5622222);
                c3 = 0;
                strArr3 = new String[]{str3222222, (String) objArr5622222[0]};
                i40 = 0;
                while (true) {
                    if (i40 >= 2) {
                    }
                    i40++;
                    i38 = i41;
                    strArr3 = strArr7;
                    i39 = 1;
                    c3 = 0;
                }
                int i30022222 = i4 ^ i41;
                int i30122222 = -i30022222;
                int i30222222 = ((i30022222 & i30122222) | (i30022222 ^ i30122222)) >> 31;
                int i30322222 = i42 & (~i30222222);
                int i30422222 = i41 & i30222222;
                int i30522222 = (i30322222 & i30422222) | (i30322222 ^ i30422222);
                D88715 = uH18377.D8871(-344556366);
                if (D88715 == null) {
                }
                long longValue722222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                long j5222222 = 43243451;
                long j5322222 = 628;
                long j5422222 = -627;
                long uptimeMillis222222 = (int) SystemClock.uptimeMillis();
                long j5522222 = ((627 * ((((uptimeMillis222222 ^ j6) | longValue722222) ^ j6) | ((j5222222 | uptimeMillis222222) ^ j6))) + ((j5422222 * ((((longValue722222 ^ j6) | uptimeMillis222222) ^ j6) | j5222222)) + ((((longValue722222 | uptimeMillis222222) | (j5222222 ^ j6)) * j5422222) + ((j5322222 * longValue722222) + (j5322222 * j5222222))))) - 195496549;
                int myTid322222 = Process.myTid();
                i43 = ((int) (j5522222 >> 32)) & (((myTid322222 | (-1292370017)) * 220) + (((~((~myTid322222) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
                int elapsedCpuTime222222 = (int) Process.getElapsedCpuTime();
                i44 = ((int) j5522222) & ((((~(elapsedCpuTime222222 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime222222)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime222222) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
                if (((i43 & i44) | (i43 ^ i44)) != 1) {
                }
                int i30622222 = (~(i4 & i30522222)) & (i4 | i30522222);
                int i30722222 = -i30622222;
                int i30822222 = (((i30622222 & i30722222) | (i30622222 ^ i30722222)) >> 31) & 16;
                Object[] objArr5722222 = {new int[]{i30522222}, new int[]{i4}, new int[1], strArr4};
                int elapsedCpuTime322222 = (int) Process.getElapsedCpuTime();
                int i30922222 = (((~(elapsedCpuTime322222 | (-674538))) | (~((~elapsedCpuTime322222) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime322222))) * 210) - 585050909);
                int i31022222 = (i30922222 ^ i30822222) + ((i30922222 & i30822222) << 1);
                int i31122222 = (i10 & i31022222) + (i10 | i31022222);
                int i31222222 = i31122222 << 13;
                int i31322222 = (i31122222 | i31222222) & (~(i31122222 & i31222222));
                int i31422222 = i31322222 >>> 17;
                int i31522222 = ((~i31322222) & i31422222) | ((~i31422222) & i31322222);
                int i31622222 = i31522222 << 5;
                ((int[]) objArr5722222[2])[0] = ((~i31522222) & i31622222) | ((~i31622222) & i31522222);
                return objArr5722222;
            }
            int i769 = echo;
            int i770 = (i769 & 121) + (i769 | 121);
            delta = i770 % 128;
            if (i770 % 2 != 0) {
                i23 = ~(i4 & 21036);
                i24 = i4 | 21036;
            } else {
                i23 = ~(i4 & 267);
                i24 = i4 | 267;
            }
            i22 = i24 & i23;
        }
        str2 = str16;
        i21 = 24;
        int i1072 = (~i95) & i4;
        int i1082 = ~i4;
        int i1092 = i1072 | (i95 & i1082);
        int i1102 = -i1092;
        int i1112 = ((i1092 & i1102) | (i1092 ^ i1102)) >> 31;
        int i1122 = i22 & (~i1112);
        int i1132 = i95 & i1112;
        int i1142 = (i1132 & i1122) | (i1122 ^ i1132);
        D8871 = uH18377.D8871(1074526551);
        if (D8871 == null) {
        }
        long longValue42 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
        long j312 = -152006299;
        long j322 = -964;
        long j332 = (965 * longValue42) + ((-963) * j312) + j322;
        long j342 = longValue42 ^ j23;
        long j352 = ((((j342 | j26) ^ j23) | ((j342 | j312) ^ j23)) * j322) + (((j312 ^ j23) | ((j342 | j25) ^ j23)) * j322) + j332 + 331572016;
        int i1172 = ((int) (j352 >> 32)) & ((((~(i1082 | (-840992448))) | (~((-2016748438) | i4))) * 950) + (((~((-840992448) | i4)) | (~(i1082 | (-2016748438)))) * (-950)) + (((~(840992447 | i1082)) | (~(2016748437 | i4))) * 1900) + 1871737038);
        int i1182 = ((int) j352) & ((((~((~Process.myTid()) | (-2139057469))) | (-701831059)) * HttpConstants.HTTP_USE_PROXY) + ((((~((-2139057469) | r2)) | 1445619756) * HttpConstants.HTTP_USE_PROXY) - 1704616964));
        int i1192 = (i1182 & i1172) | (i1172 ^ i1182);
        int i1202 = -(-(i1192 - 1));
        int i1212 = -i1192;
        int i1222 = ((i1192 & i1212) | (i1192 ^ i1212)) >> 31;
        int i1232 = (~i1222) & i4;
        int i1242 = i1222 & (i4 ^ ((i1202 ^ 200) + ((i1202 & 200) << 1)));
        int i1252 = (i1242 & i1232) | (i1232 ^ i1242);
        int i1262 = (~(i4 & i1142)) & (i4 | i1142);
        int i1272 = -i1262;
        int i1282 = ((i1262 & i1272) | (i1262 ^ i1272)) >> 31;
        int i1292 = i1252 & (~i1282);
        int i1302 = i1282 & i1142;
        int i1312 = (i1292 & i1302) | (i1292 ^ i1302);
        char c152 = (char) (19496 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))));
        int i1322 = -View.getDefaultSize(0, 0);
        int i1332 = (i1322 & 203) + (i1322 | 203);
        int i1342 = -((byte) KeyEvent.getModifierMetaStateMask());
        int i1352 = ((i1342 | 19) << 1) - (i1342 ^ 19);
        Object[] objArr242 = new Object[1];
        bravo(c152, i1332, i1352, objArr242);
        String str192 = (String) objArr242[0];
        int i1362 = -(-ExpandableListView.getPackedPositionGroup(0L));
        int i1372 = 222 - (~(-TextUtils.getOffsetAfter(str2, 0)));
        int argb3 = Color.argb(0, 0, 0, 0);
        int i1382 = ((argb3 | 6) << 1) - (argb3 ^ 6);
        Object[] objArr252 = new Object[1];
        bravo((char) (((i1362 | 64997) << 1) - (i1362 ^ 64997)), i1372, i1382, objArr252);
        String str202 = (String) objArr252[0];
        file = new File(str192);
        if (file.exists()) {
        }
        i25 = 0;
        int i14522 = (i25 | (-i25)) >> 31;
        int i14622 = (i14522 & ((i4 & (-263)) | (i1082 & 262))) | ((~i14522) & i4);
        int i14722 = ((~i1312) & i4) | (i1312 & i1082);
        int i14822 = -i14722;
        int i14922 = ((i14722 & i14822) | (i14722 ^ i14822)) >> 31;
        int i15022 = (i1312 & i14922) | (i14622 & (~i14922));
        Object[] objArr2722 = new Object[1];
        bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetBefore(str2, 0) + 231, 29 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2722);
        String str2122 = (String) objArr2722[0];
        int i15122 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int i15222 = -View.MeasureSpec.getSize(0);
        int i15322 = (i15222 ^ 262) + ((i15222 & 262) << 1);
        int indexOf222 = TextUtils.indexOf(str2, str2);
        int D88711322 = InvalidProxyIntegrationHeaders.D8871();
        int i15422 = indexOf222 * 714;
        int i15522 = (i15422 ^ (-16376)) + ((i15422 & (-16376)) << 1);
        int i15622 = ~indexOf222;
        int i15722 = ~D88711322;
        int i15822 = ~((i15622 ^ i15722) | (i15722 & i15622));
        int i15922 = ~(i15622 | 23);
        int i16022 = (i15822 ^ i15922) | (i15822 & i15922);
        int i16122 = ((-24) ^ indexOf222) | ((-24) & indexOf222);
        int i16222 = ~((i16122 ^ D88711322) | (i16122 & D88711322));
        int i16322 = (((i16022 ^ i16222) | (i16022 & i16222)) * (-713)) + i15522;
        int i16422 = (indexOf222 & (-24)) | ((-24) ^ indexOf222);
        int i16522 = (~((i16422 & D88711322) | (i16422 ^ D88711322))) * 1426;
        int i16622 = (i16322 ^ i16522) + ((i16322 & i16522) << 1);
        int i16722 = ~D88711322;
        int i16822 = -(-((~((i16722 & (-24)) | ((-24) ^ i16722))) * 713));
        int i16922 = (i16622 ^ i16822) + ((i16822 & i16622) << 1);
        Object[] objArr2822 = new Object[1];
        bravo((char) ((i15122 ^ (-1)) + (i15122 << 1)), i15322, i16922, objArr2822);
        String str2222 = (String) objArr2822[0];
        int i17022 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        int i17122 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 286;
        int i17222 = -(-ExpandableListView.getPackedPositionGroup(0L));
        int i17322 = (i17222 & 28) + (i17222 | 28);
        Object[] objArr2922 = new Object[1];
        bravo((char) (((i17022 | 38243) << 1) - (i17022 ^ 38243)), i17122, i17322, objArr2922);
        String str2322 = (String) objArr2922[0];
        i26 = 1;
        Object[] objArr3022 = new Object[1];
        bravo((char) (21273 - (~(-(-(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)))))), Process.getGidForName(str2) + 314, (ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr3022);
        i27 = 0;
        strArr = new String[]{str2122, str2222, str2322, (String) objArr3022[0]};
        i28 = 0;
        while (true) {
            if (i28 >= 4) {
            }
            int i18222 = (i28 ^ (-106)) + ((i28 & (-106)) << 1);
            i28 = (i18222 & 107) + (i18222 | 107);
            strArr = strArr9;
            j25 = j5;
            i27 = 0;
            i26 = 1;
        }
        int i18322 = (~(i4 & i15022)) & (i4 | i15022);
        int i18422 = -i18322;
        int i18522 = ((i18322 & i18422) | (i18322 ^ i18422)) >> 31;
        int i18622 = i29 & (~i18522);
        int i18722 = i15022 & i18522;
        int i18822 = (i18622 & i18722) | (i18622 ^ i18722);
        int i18922 = -(-View.combineMeasuredStates(0, 0));
        int indexOf322 = TextUtils.indexOf(str2, str2, 0);
        Object[] objArr3322 = new Object[1];
        bravo((char) ((i18922 & 878) + (i18922 | 878)), (indexOf322 & 327) + (indexOf322 | 327), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, objArr3322);
        Object[] objArr3422 = {(String) objArr3322[0]};
        D88712 = uH18377.D8871(-957097391);
        if (D88712 == null) {
        }
        str3 = (String) ((Method) D88712).invoke(null, objArr3422);
        if (str3 != null) {
        }
        i30 = i4;
        int i194222 = i4 ^ i18822;
        int i195222 = (i194222 | (-i194222)) >> 31;
        int i196222 = i30 & (~i195222);
        int i197222 = i18822 & i195222;
        int i198222 = (i197222 & i196222) | (i196222 ^ i197222);
        char absoluteGravity2222 = (char) Gravity.getAbsoluteGravity(0, 0);
        int i199222 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        int i200222 = (i199222 & 349) + (i199222 | 349);
        int i201222 = -(ViewConfiguration.getTouchSlop() >> 8);
        int i202222 = ((i201222 | 17) << 1) - (i201222 ^ 17);
        Object[] objArr37222 = new Object[1];
        bravo(absoluteGravity2222, i200222, i202222, objArr37222);
        String str24222 = (String) objArr37222[0];
        char scrollDefaultDelay622 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
        int i203222 = -ImageFormat.getBitsPerPixel(0);
        int i204222 = (i203222 ^ 365) + ((i203222 & 365) << 1);
        int i205222 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
        int i206222 = (i205222 & 6) + (i205222 | 6);
        Object[] objArr38222 = new Object[1];
        bravo(scrollDefaultDelay622, i204222, i206222, objArr38222);
        Object[] objArr39222 = new Object[i16];
        objArr39222[1] = (String) objArr38222[0];
        objArr39222[0] = str24222;
        D88713 = uH18377.D8871(1214576837);
        if (D88713 == null) {
        }
        long longValue6222 = ((Long) ((Method) D88713).invoke(null, objArr39222)).longValue();
        long j44222 = 183599130;
        long j45222 = -115;
        long maxMemory222 = (int) Runtime.getRuntime().maxMemory();
        long j46222 = ((-116) * ((((maxMemory222 ^ j23) | j44222) | longValue6222) ^ j23)) + (j45222 * longValue6222) + (j45222 * j44222);
        long j47222 = 116;
        long j48222 = ((j44222 | maxMemory222) * j47222) + j46222;
        long j49222 = j44222 ^ j23;
        long j50222 = longValue6222 ^ j23;
        long j51222 = ((j47222 * (((j49222 | j50222) ^ j23) | ((maxMemory222 | j50222) ^ j23))) + j48222) - 1731237468;
        int i207222 = ((int) (j51222 >> 32)) & ((((~(1129112812 | i1082)) | (-1733092845) | (~((-1124648041) | i4))) * 676) + (((~((-1728628073) | i1082)) | 603980032) * 676) + ((((-603980033) | i4) * (-676)) - 108163526));
        int i208222 = (~((-345946096) | i4)) | 345420390;
        int i209222 = ~((-1782646801) | i1082);
        if ((i207222 | (((int) j51222) & (((i209222 | (~((-525706) | i4))) * 470) + (((i208222 | i209222) * (-470)) + 1996566937)))) == 0) {
        }
        int i211222 = (~(i4 & i198222)) & (i4 | i198222);
        int i212222 = -i211222;
        int i213222 = ((i211222 & i212222) | (i211222 ^ i212222)) >> 31;
        int i214222 = i210 & (~i213222);
        int i215222 = i213222 & i198222;
        int i216222 = (i214222 & i215222) | (i214222 ^ i215222);
        int packedPositionChild422 = ExpandableListView.getPackedPositionChild(0L);
        int i217222 = 371 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16));
        int i218222 = -(ViewConfiguration.getTouchSlop() >> 8);
        int i219222 = ((i218222 | 23) << 1) - (i218222 ^ 23);
        Object[] objArr41222 = new Object[1];
        bravo((char) ((packedPositionChild422 & 1) + (packedPositionChild422 | 1)), i217222, i219222, objArr41222);
        Object[] objArr42222 = {(String) objArr41222[0]};
        D88714 = uH18377.D8871(-957097391);
        if (D88714 == null) {
        }
        lowerCase = ((String) ((Method) D88714).invoke(null, objArr42222)).toLowerCase();
        int i220222 = -View.combineMeasuredStates(0, 0);
        int i221222 = -TextUtils.indexOf(str2, str2, 0);
        objArr = new Object[1];
        bravo((char) ((i220222 & 32713) + (i220222 | 32713)), ((i221222 | 395) << 1) - (i221222 ^ 395), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr);
        if (lowerCase.contains((String) objArr[0])) {
        }
        int i228222 = ((~i216222) & i4) | (i216222 & i1082);
        int i229222 = -i228222;
        int i230222 = ((i228222 & i229222) | (i228222 ^ i229222)) >> 31;
        int i231222 = i31 & (~i230222);
        int i232222 = i216222 & i230222;
        int i233222 = (i232222 & i231222) | (i231222 ^ i232222);
        char c19222 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41046);
        int i234222 = -TextUtils.indexOf(str2, str2);
        Object[] objArr44222 = new Object[1];
        bravo(c19222, (i234222 ^ 399) + ((i234222 & 399) << 1), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr44222);
        String str25222 = (String) objArr44222[0];
        char normalizeMetaState3222 = (char) KeyEvent.normalizeMetaState(0);
        int i235222 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int i236222 = ((i235222 | 441) << 1) - (i235222 ^ 441);
        int i237222 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int i238222 = ((i237222 | 40) << 1) - (i237222 ^ 40);
        Object[] objArr45222 = new Object[1];
        bravo(normalizeMetaState3222, i236222, i238222, objArr45222);
        String str26222 = (String) objArr45222[0];
        int jumpTapTimeout222 = ViewConfiguration.getJumpTapTimeout() >> 16;
        int i239222 = (jumpTapTimeout222 * (-375)) - 7889625;
        int i240222 = ~jumpTapTimeout222;
        int i241222 = (~((i240222 ^ (-21040)) | (i240222 & (-21040)))) | i4;
        int i242222 = ~((jumpTapTimeout222 ^ 21039) | (jumpTapTimeout222 & 21039));
        int i243222 = -(-(((i241222 & i242222) | (i241222 ^ i242222)) * 376));
        int i244222 = ((i239222 | i243222) << 1) - (i239222 ^ i243222);
        int i245222 = ~((jumpTapTimeout222 & i1082) | (i1082 ^ jumpTapTimeout222));
        int i246222 = ((i245222 & i242222) | (i245222 ^ i242222)) * (-376);
        int i247222 = (i244222 & i246222) + (i246222 | i244222);
        int i248222 = ~(i240222 | i4);
        char c20222 = (char) ((((i248222 & 21039) | (i248222 ^ 21039)) * 376) + i247222);
        int i249222 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i250222 = (i249222 ^ 482) + ((i249222 & 482) << 1);
        int indexOf5222 = TextUtils.indexOf(str2, str2, 0, 0);
        int i251222 = (indexOf5222 & 27) + (indexOf5222 | 27);
        Object[] objArr46222 = new Object[1];
        bravo(c20222, i250222, i251222, objArr46222);
        String str27222 = (String) objArr46222[0];
        char gidForName2222 = (char) (Process.getGidForName(str2) + 21044);
        int i252222 = -(-TextUtils.indexOf(str2, str2, 0));
        int i253222 = (i252222 ^ 508) + ((i252222 & 508) << 1);
        int i254222 = -(-View.resolveSize(0, 0));
        int i255222 = (i254222 ^ 27) + ((i254222 & 27) << 1);
        Object[] objArr47222 = new Object[1];
        bravo(gidForName2222, i253222, i255222, objArr47222);
        String str28222 = (String) objArr47222[0];
        int i256222 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        int D887116222 = InvalidProxyIntegrationHeaders.D8871();
        int i257222 = i256222 * 905;
        int i258222 = (i257222 ^ 903) + ((i257222 & 903) << 1);
        int i259222 = ~i256222;
        int i260222 = ~(i259222 | D887116222);
        int i261222 = ~D887116222;
        int i262222 = ~((~i261222) | i261222);
        int i263222 = (((i260222 & i262222) | (i260222 ^ i262222)) * (-1808)) + i258222;
        int i264222 = (i261222 ^ i256222) | (i261222 & i256222);
        int i265222 = ((~((i259222 ^ D887116222) | (i259222 & D887116222))) | (~(i264222 | (~i264222)))) * 904;
        int i266222 = ((i263222 | i265222) << 1) - (i265222 ^ i263222);
        int i267222 = ~(i259222 | (~i259222));
        int i268222 = ~D887116222;
        int i269222 = (i268222 & i267222) | (i267222 ^ i268222);
        int i270222 = ~((i256222 & i261222) | (i261222 ^ i256222));
        Object[] objArr48222 = new Object[1];
        bravo((char) ((i266222 - (~(-(-(((i270222 & i269222) | (i269222 ^ i270222)) * 904))))) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 534, KeyEvent.keyCodeFromString(str2) + 27, objArr48222);
        String str29222 = (String) objArr48222[0];
        char gidForName3222 = (char) ((-1) - Process.getGidForName(str2));
        int i271222 = -((byte) KeyEvent.getModifierMetaStateMask());
        Object[] objArr49222 = new Object[1];
        bravo(gidForName3222, (i271222 & 561) + (i271222 | 561), View.resolveSizeAndState(0, 0, 0) + 27, objArr49222);
        strArr2 = new String[]{str25222, str26222, str27222, str28222, str29222, (String) objArr49222[0]};
        i32 = i13;
        i33 = 0;
        while (true) {
            if (i33 < i32) {
            }
            i33++;
            strArr2 = strArr8;
            i32 = 6;
        }
        int i275222 = ((~i233222) & i4) | (i233222 & i1082);
        int i276222 = -i275222;
        int i277222 = ((i275222 & i276222) | (i275222 ^ i276222)) >> 31;
        int i278222 = i34 & (~i277222);
        int i279222 = i233222 & i277222;
        int i280222 = (i279222 & i278222) | (i278222 ^ i279222);
        char fadingEdgeLength522 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
        int i281222 = -Drawable.resolveOpacity(0, 0);
        int i282222 = (i281222 ^ 349) + ((i281222 & 349) << 1);
        int i283222 = -TextUtils.indexOf(str2, str2, 0);
        int i284222 = (i283222 ^ 17) + ((i283222 & 17) << 1);
        Object[] objArr52222 = new Object[1];
        bravo(fadingEdgeLength522, i282222, i284222, objArr52222);
        String str31222 = (String) objArr52222[0];
        char indexOf6222 = (char) (6383 - TextUtils.indexOf((CharSequence) str2, '0', 0));
        int i285222 = -Color.red(0);
        int i286222 = (i285222 ^ 589) + ((i285222 & 589) << 1);
        int i287222 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
        int i288222 = ((i287222 | 6) << 1) - (i287222 ^ 6);
        Object[] objArr53222 = new Object[1];
        bravo(indexOf6222, i286222, i288222, objArr53222);
        str4 = (String) objArr53222[0];
        file2 = new File(str31222);
        if (file2.exists()) {
        }
        char tapTimeout222 = (char) (ViewConfiguration.getTapTimeout() >> 16);
        int i748222 = -Drawable.resolveOpacity(0, 0);
        Object[] objArr185222 = new Object[1];
        bravo(tapTimeout222, (i748222 & 595) + (i748222 | 595), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr185222);
        String str95222 = (String) objArr185222[0];
        int i749222 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i750222 = (i749222 * 370) - (-635290);
        int i751222 = (i749222 ^ 1717) | (i749222 & 1717);
        int i752222 = -(-(((i751222 & i1082) | (i751222 ^ i1082)) * (-369)));
        int i753222 = (i750222 ^ i752222) + ((i750222 & i752222) << 1);
        int i754222 = ~i749222;
        int i755222 = ~((i754222 & i1082) | (i754222 ^ i1082));
        int i756222 = -(-(((i755222 & 1717) | (i755222 ^ 1717)) * (-369)));
        int i757222 = (i753222 & i756222) + (i756222 | i753222);
        int i758222 = (~(((-1718) & i749222) | ((-1718) ^ i749222))) | (~((i749222 ^ i4) | (i749222 & i4)));
        int i759222 = ~i749222;
        int i760222 = (i759222 & i1082) | (i759222 ^ i1082);
        int i761222 = ((~((i760222 & 1717) | (i760222 ^ 1717))) | i758222) * 369;
        char c43222 = (char) ((i757222 ^ i761222) + ((i761222 & i757222) << 1));
        int i762222 = -(-TextUtils.getOffsetBefore(str2, 0));
        int i763222 = (i762222 & 608) + (i762222 | 608);
        int i764222 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i765222 = (i764222 ^ 9) + ((i764222 & 9) << 1);
        Object[] objArr186222 = new Object[1];
        bravo(c43222, i763222, i765222, objArr186222);
        str5 = (String) objArr186222[0];
        file3 = new File(str95222);
        if (file3.exists()) {
        }
        i35 = i4;
        int i292222222 = i4 ^ i280222;
        int i293222222 = (i292222222 | (-i292222222)) >> 31;
        int i294222222 = i35 & (~i293222222);
        int i295222222 = i280222 & i293222222;
        i38 = (i295222222 & i294222222) | (i294222222 ^ i295222222);
        if ((i5 & 8) == 0) {
        }
        int i296222222 = -Color.red(0);
        int i297222222 = -(-(Process.myPid() >> 22));
        Object[] objArr55222222 = new Object[1];
        bravo((char) ((i296222222 ^ 18372) + ((i296222222 & 18372) << 1)), (i297222222 ^ 739) + ((i297222222 & 739) << 1), 41 - View.MeasureSpec.getSize(0), objArr55222222);
        String str32222222 = (String) objArr55222222[0];
        char c22222222 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        int maximumDrawingCacheSize222222 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        int i298222222 = (maximumDrawingCacheSize222222 & 780) + (maximumDrawingCacheSize222222 | 780);
        int keyRepeatDelay2222222 = ViewConfiguration.getKeyRepeatDelay() >> 16;
        i39 = 1;
        int i299222222 = (keyRepeatDelay2222222 ^ 30) + ((keyRepeatDelay2222222 & 30) << 1);
        Object[] objArr56222222 = new Object[1];
        bravo(c22222222, i298222222, i299222222, objArr56222222);
        c3 = 0;
        strArr3 = new String[]{str32222222, (String) objArr56222222[0]};
        i40 = 0;
        while (true) {
            if (i40 >= 2) {
            }
            i40++;
            i38 = i41;
            strArr3 = strArr7;
            i39 = 1;
            c3 = 0;
        }
        int i300222222 = i4 ^ i41;
        int i301222222 = -i300222222;
        int i302222222 = ((i300222222 & i301222222) | (i300222222 ^ i301222222)) >> 31;
        int i303222222 = i42 & (~i302222222);
        int i304222222 = i41 & i302222222;
        int i305222222 = (i303222222 & i304222222) | (i303222222 ^ i304222222);
        D88715 = uH18377.D8871(-344556366);
        if (D88715 == null) {
        }
        long longValue7222222 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
        long j52222222 = 43243451;
        long j53222222 = 628;
        long j54222222 = -627;
        long uptimeMillis2222222 = (int) SystemClock.uptimeMillis();
        long j55222222 = ((627 * ((((uptimeMillis2222222 ^ j6) | longValue7222222) ^ j6) | ((j52222222 | uptimeMillis2222222) ^ j6))) + ((j54222222 * ((((longValue7222222 ^ j6) | uptimeMillis2222222) ^ j6) | j52222222)) + ((((longValue7222222 | uptimeMillis2222222) | (j52222222 ^ j6)) * j54222222) + ((j53222222 * longValue7222222) + (j53222222 * j52222222))))) - 195496549;
        int myTid3222222 = Process.myTid();
        i43 = ((int) (j55222222 >> 32)) & (((myTid3222222 | (-1292370017)) * 220) + (((~((~myTid3222222) | (-1561102689))) | (-1296638197)) * (-440)) + ((((~((-1292370017) | r4)) | (-1565370869)) * 220) - 510127494));
        int elapsedCpuTime2222222 = (int) Process.getElapsedCpuTime();
        i44 = ((int) j55222222) & ((((~(elapsedCpuTime2222222 | (-1168379969))) | 99337) * 235) + (((~(134472889 | elapsedCpuTime2222222)) | (-1302753521)) * (-470)) + ((((~((~elapsedCpuTime2222222) | 134472889)) | (-1302753521)) * (-235)) - 1087416031));
        if (((i43 & i44) | (i43 ^ i44)) != 1) {
        }
        int i306222222 = (~(i4 & i305222222)) & (i4 | i305222222);
        int i307222222 = -i306222222;
        int i308222222 = (((i306222222 & i307222222) | (i306222222 ^ i307222222)) >> 31) & 16;
        Object[] objArr57222222 = {new int[]{i305222222}, new int[]{i4}, new int[1], strArr4};
        int elapsedCpuTime3222222 = (int) Process.getElapsedCpuTime();
        int i309222222 = (((~(elapsedCpuTime3222222 | (-674538))) | (~((~elapsedCpuTime3222222) | (-336601349)))) * 210) + ((((~((-15620860) | r1)) | (~((-351547671) | elapsedCpuTime3222222))) * 210) - 585050909);
        int i310222222 = (i309222222 ^ i308222222) + ((i309222222 & i308222222) << 1);
        int i311222222 = (i10 & i310222222) + (i10 | i310222222);
        int i312222222 = i311222222 << 13;
        int i313222222 = (i311222222 | i312222222) & (~(i311222222 & i312222222));
        int i314222222 = i313222222 >>> 17;
        int i315222222 = ((~i313222222) & i314222222) | ((~i314222222) & i313222222);
        int i316222222 = i315222222 << 5;
        ((int[]) objArr57222222[2])[0] = ((~i315222222) & i316222222) | ((~i316222222) & i315222222);
        return objArr57222222;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, int i4, byte b4) {
        int i5;
        int i10 = b4 * 4;
        int i11 = b2 + 103;
        int i12 = 3 - (i4 * 4);
        byte[] bArr = new byte[1 - i10];
        int i13 = 0 - i10;
        byte[] bArr2 = hotel;
        if (bArr2 == null) {
            int i14 = 0;
            byte[] bArr3 = bArr2;
            int i15 = i12;
            i11 += i12;
            i12 = i15;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i11;
            int i16 = i12 + 1;
            i14 = i5 + 1;
            if (i5 == i13) {
                return new String(bArr, 0);
            }
            byte b6 = bArr2[i16];
            i12 = i11;
            i11 = b6;
            bArr3 = bArr2;
            i15 = i16;
            i11 += i12;
            i12 = i15;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i11;
            int i162 = i12 + 1;
            i14 = i5 + 1;
            if (i5 == i13) {
            }
        } else {
            i5 = 0;
            bArr[i5] = (byte) i11;
            int i1622 = i12 + 1;
            i14 = i5 + 1;
            if (i5 == i13) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(char c3, int i4, int i5, Object[] objArr) {
        int i10;
        Throwable cause;
        int i11;
        char c4;
        int i12;
        int i13;
        long j5;
        int i14;
        int i15 = 0;
        int i16 = 1;
        cy cyVar = new cy();
        long[] jArr = new long[i5];
        cyVar.component5 = 0;
        while (true) {
            int i17 = cyVar.component5;
            i10 = india;
            if (i17 >= i5) {
                break;
            }
            try {
                Object[] objArr2 = new Object[i16];
                objArr2[i15] = Integer.valueOf(bravo[i4 + i17]);
                Object D8871 = uH18377.D8871(-31669226);
                Class cls = Integer.TYPE;
                if (D8871 == null) {
                    int windowTouchSlop = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int doubleTapTimeout = 2123 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    c4 = 3;
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    i12 = 359345605;
                    byte b2 = (byte) (i10 & 15);
                    i13 = 2;
                    byte b4 = (byte) (b2 - 3);
                    i11 = i15;
                    String alpha = alpha(b2, b4, b4);
                    Class[] clsArr = new Class[i16];
                    clsArr[i11] = cls;
                    D8871 = uH18377.setPivotYN16904(windowTouchSlop, doubleTapTimeout, scrollBarSize, 564618947, false, alpha, clsArr);
                } else {
                    i11 = i15;
                    c4 = 3;
                    i12 = 359345605;
                    i13 = 2;
                }
                Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                l10.getClass();
                long j6 = i17;
                long j7 = charlie;
                Object[] objArr3 = new Object[4];
                objArr3[c4] = Integer.valueOf(c3);
                objArr3[i13] = Long.valueOf(j7);
                objArr3[i16] = Long.valueOf(j6);
                objArr3[i11] = l10;
                Object D88712 = uH18377.D8871(-897540670);
                if (D88712 == null) {
                    int i18 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50;
                    int keyRepeatDelay = 2796 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 32779);
                    j5 = 0;
                    int i19 = i11;
                    byte b6 = (byte) i19;
                    byte b10 = b6;
                    i14 = i16;
                    String alpha2 = alpha(b6, b10, b10);
                    Class[] clsArr2 = new Class[4];
                    Class cls2 = Long.TYPE;
                    clsArr2[i19] = cls2;
                    clsArr2[i14] = cls2;
                    clsArr2[i13] = cls2;
                    clsArr2[c4] = cls;
                    D88712 = uH18377.setPivotYN16904(i18, keyRepeatDelay, keyRepeatDelay2, 356204311, false, alpha2, clsArr2);
                } else {
                    j5 = 0;
                    i14 = i16;
                }
                jArr[i17] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                Object[] objArr4 = new Object[i13];
                objArr4[i14] = cyVar;
                objArr4[0] = cyVar;
                Object D88713 = uH18377.D8871(i12);
                if (D88713 == null) {
                    int i20 = (ExpandableListView.getPackedPositionForChild(0, 0) > j5 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j5 ? 0 : -1)) + 53;
                    int resolveOpacity = 2175 - Drawable.resolveOpacity(0, 0);
                    char indexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b11 = (byte) (i10 & 5);
                    byte b12 = (byte) (b11 - 1);
                    String alpha3 = alpha(b11, b12, b12);
                    Class[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    clsArr3[i14] = Object.class;
                    D88713 = uH18377.setPivotYN16904(i20, resolveOpacity, indexOf, -892301552, false, alpha3, clsArr3);
                }
                ((Method) D88713).invoke(null, objArr4);
                i16 = i14;
                i15 = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause == null) {
                }
            }
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        int i21 = i16;
        char[] cArr = new char[i5];
        cyVar.component5 = 0;
        while (true) {
            int i22 = cyVar.component5;
            if (i22 < i5) {
                cArr[i22] = (char) jArr[i22];
                Object[] objArr5 = new Object[2];
                objArr5[i21] = cyVar;
                objArr5[0] = cyVar;
                Object D88714 = uH18377.D8871(359345605);
                if (D88714 == null) {
                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 52;
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2175;
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b13 = (byte) (i10 & 5);
                    byte b14 = (byte) (b13 - 1);
                    String alpha4 = alpha(b13, b14, b14);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[0] = Object.class;
                    clsArr4[i21] = Object.class;
                    D88714 = uH18377.setPivotYN16904(resolveSizeAndState, scrollBarSize2, minimumFlingVelocity, -892301552, false, alpha4, clsArr4);
                }
                ((Method) D88714).invoke(null, objArr5);
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(int i4, short s3, short s9, Object[] objArr) {
        int i5;
        int i10 = 6 - (i4 * 3);
        int i11 = s3 + 97;
        int i12 = s9 * 3;
        byte[] bArr = new byte[i12 + 1];
        byte[] bArr2 = foxtrot;
        if (bArr2 == null) {
            byte[] bArr3 = bArr2;
            int i13 = 0;
            int i14 = i11;
            int i15 = i10;
            int i16 = i14 + (-i10) + 6;
            int i17 = i15;
            i11 = i16;
            i10 = i17;
            bArr2 = bArr3;
            i5 = i13;
            int i18 = i10 + 1;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i19 = i11;
            i15 = i18;
            i10 = bArr2[i18];
            i13 = i5 + 1;
            bArr3 = bArr2;
            i14 = i19;
            int i162 = i14 + (-i10) + 6;
            int i172 = i15;
            i11 = i162;
            i10 = i172;
            bArr2 = bArr3;
            i5 = i13;
            int i182 = i10 + 1;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
            }
        } else {
            i5 = 0;
            int i1822 = i10 + 1;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
            }
        }
    }

    public static void delta() {
        foxtrot = new byte[]{56, -38, -79, 117, -6, 5, -3};
        golf = 78;
    }

    public static void echo() {
        hotel = new byte[]{13, -123, -100, -11};
        india = 131;
    }
}
