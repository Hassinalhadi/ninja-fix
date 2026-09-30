package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
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
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class M4296 {
    public static final char[] charlie;
    public static final long delta;
    public static int echo;
    public static int foxtrot;
    public static final byte[] golf = null;
    public static final int hotel = 0;
    public static final int india;
    public static final byte[] juliet = null;
    public final bh alpha;
    public final Lazy bravo = LazyKt.lazy(E.alpha);

    static {
        hotel();
        india = 1;
        golf();
        echo = 0;
        foxtrot = 1;
        char[] cArr = new char[2156];
        ByteBuffer.wrap("\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ô«>²{º±ÁíÈ Ï|×¥ÞÜå ìcô¡ûÉ\u0002\u001c\tL\u0011\u008e\u0018ì\u001f\u0002&G.\u00945È<\f\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ô«>²{º±ÁíÈ Ï|×¥ÞÜå1ìnôµûÞ\u0002&\t[\u0011\u008d\u0018Á\u001f\u0012&C.\u0091´\u009cLiEª^ÿVdob`¨yíq'\n{\u0003¶\u0004ê\u001c3\u0015J.¤'è?=0N_Õ§7®ÿµ³½-\u0084!\u008bá\u0092¬\u009a\u007fá8èóïÿ÷uþ3ÅòÌ¼Ô|Û\r\"Õ)\u00881}8\u000e?Ï\u0006\u009c\u000e^\u0015\u0011\u001cÄc\u0089\u0004\u0007üóõ îqæÿßúÐ;É4Á¨ºô³+´r½JE¾LmW<_²f ixp:x»\u0003»\n{\r \u0015ýã\u009d\u001b\u007f\u0012ª\të\u0001+8v7¢.¯&\u0010]ZT\u0093S÷K,Bqy\u0092pñh&gMl@\u0094µ\u009dr\u0086!\u008eö·ö¸5¡>©ïÒ´ÛjÜ+ÄáÍ¦%ZÝùÔzÏpÇ¿þññ(è4àª\u009bã\u0092 \u0095p\u008d¯\u0084ç¿(¶U®¦¡ÓX\u0000SmK\u0094BÐE\u000f|\u000b\u007fW\u0087ô\u008ew\u0095}\u009d²¤ü«%²9º§ÁîÈ-Ï}×¢Þêå%ìXô«ûÞ\u0002\r\t`\u0011\u0099\u0018Ý\u001f\u0002&\u0005Uê\u00ad\b¤À¿\u008c·I\u008e\u0016\u0081Ü\u0098Ø\u0090Yë\u0002âËåÀýAô\nÏÃÆ\u0089ÞGÑu(ê#°\u007fG\u0087ò\u008e>\u0095q\u009d²¤ë,»ÔYÝ\u0091ÆÝÎ\u0018÷Gø\u008dá\u0089é\u0006\u0092S\u009b\u0096\u009c\u0091\u0084\u0012\u008dW¶\u009d¿Ã§\"¨GQåZàB)KoLµu«}'fuo¶\u0010ê\u0018.\u0001}\n¼\u007f\n\u0087è\u008e \u0095l\u009d©¤ö«<²8º·ÁâÈ'Ï ×£Þæå,ìrô\u0093ûö\u0002T\tO\u0011\u008f\u0018Ü\u001f\u0001\u007f\n\u0087è\u008e \u0095l\u009d©¤ö«<²8º¹ÁâÈ+Ï ×¡Þêå#ìiô ûÖ\u0002\f\ti\u0011°\u0018Ã\u001f\u0003&X.\u00855\u0085<\u001aC@\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ý«4²zº ÁìÈ<Ïj×¾Þ÷\u007fW\u0087ô\u008ew\u0095}\u009d¨¤ú«=²sºûÁãÈ&Ï|×¹P±¨\u0004¡Âº\u0096²B\u008bG\u0084Å\u009d\u0088\u0095[\u001a/âÎë\u000eðUø\u009bÁ\u0099Î\u0012×[ß\u009c¤Ë\u00ad\u001fªS²\u009b»Ò\u0080\u0001\u0089O\u0091\u0093\u007fK\u0087þ\u008e4\u0095j\u009d®¤õÄ\u0082<!Ög.Ä'G<_4\u009f\rÌ\u0002\u0005\u001bR\u0013\u0086hÏaWfR~\u009cwÝL\u0004EQ]\u0094Rè«= z¸¿±æ¶3\u007fB\u0087þ\u008e7\u0095f\u007fU\u0087þ\u008e+\u0095l\u009d´¤à«%²9º¦ÁòÈ:Ï!×¯Þçåoìcô ûÙ\u0002\f\tX\u0011Ó\u0018Ô\u001f\u0001&B.Û5Í<\bCDK\u0088RüY\u0006`Wh\u0090o\u0004vk~º\u0085ó\u008c7\u0093t\u009b¥¢ð©9\u008cþtU}\u0080fÇn\u001fWKX\u008eA\u0092I\r2Y;\u0091<\u008a$\u0004-L\u0016Ä\u001fÈ\u0007\u000b\brñ§úóâxë\u007fìªÕéÝpÆfÏ£°ï¸#¡Wª\u00ad\u0093ü\u009b;\u009c¯\u0085Ä\u008d\u0011vX\u007f\u009c`Õh\u000e\u007fU\u0087þ\u008e+\u0095l\u009d´¤à«%²9º¦ÁòÈ:Ï!×¯Þçåoìcô ûÙ\u0002\f\tX\u0011Ó\u0018Á\u001f\u001e&\u0019.\u00965Ú<\u0000à&\u0018\u008d\u0011X\n\u001f\u0002Ç;\u00934V-J%Õ^\u0081WIPRHÜA\u0094z\u001cs\u0010kÓdª\u009d\u007f\u0096+\u008e \u0087²\u0080m¹j±êª¹£y\u007fU\u0087þ\u008e+\u0095l\u009d´¤à«%²9º¦ÁòÈ:Ï!×¯Þçåoìcô ûÙ\u0002\f\tX\u0011Ó\u0018Á\u001f\u001e&\u0019.\u00985È<\n\u0014Æìmå¸þÿö'ÏsÀ¶ÙªÑ5ªa£©¤²¼<µt\u008eü\u0087ð\u009f3\u0090Ji\u009fbËz@sRt\u008dM\u008aE\u000b^VW\u0099\u007fS\u0087ù\u008e6\u0095g\u009d®¤õ\u007f\n\u0087ë\u008e+\u0095p\u009d¾¤¼«<²xº±ÁþÈ%Ïj×¾³ÀKjB¥YôQ)hug§~÷v2\u0014 ìBå\u008aþÆö\u0003Ï\\À\u0096Ù\u0092Ñ\u0019ªS£\u0082¤È¼\u0002µ^\u008e\u0084\u0087ß\u009f\u0004\u0090>i¤büz9s}t´MêE,^,W°(ü 49}2®\u000bà\u0003\u0010\u0004\u0082\u001dÖ\u0015\u0007îAç\u009cøÉðSÉUÂ\u0080ÛÑ\u007f\n\u0087í\u008e<\u0095q\u009d¹¤ü«#²8º¹ÁâÈ+Ï9×ùÞ¬å)ìpôêûÚ\u0002\f\t[\u0011\u0094\u0018Ü\u001f_&G.\u00875Â<\u0004CNK\u009fRÚYO`Ph\u008co5v}~°\u0085ê\u008c \u0093?\u009b¤¢ú\u009b[c¼jmq yè@\u00adOrVi^è%³,z+h3¨:ý\u0001x\b!\u0010»\u001f\u0082æ_í\rõÃü\u008fûPÂ\tÊ×Ñ\u009fØJ§P¯Ë¶\u009b½^\u0084\u0012\u008cÛ\u008b}\u0092;\u009a a¿hm\u009d\u0004eæl.wb\u007f§FøI2P6X·#ì*%-75÷<¢\u0007,\u000ee\u0016¤\u0019Àà\u0013ënó\u0092úÔý\u001bÄUÌ¤×ÌÞ\t¡U©\u0086°ß»\t\u0082H\u008a\u0088\u008d0\u0094:\u009c²gãn-q1yª@ô\u009c$dÐm\u0003vR~ÜGÔH\u0011QPY\u008f\"\u008a+\u000e,O4\u008a=Ù\u0006A\u000fJ\u0017\u0087\u0018úá\"êuò ûøü-ÅoÍ²Öæß\" /¨±±î\u007fb\u0087þ\u008e7\u0095f\u009d°¤ü«%²~ººÁå\u007fP\u0087õ\u008e2\u0095q\u009d²¤ä«?\u007fF\u0087ó\u008e+\u0095p\u009d°¤ú«$²zQX©û x»`³ \u008aó\u0085:\u009cm\u0094¹ïðæhádù§ðúË'ÂkÚ¯\u007fS\u0087ù\u008e6\u0095g\u009då¤¥«!\u007fB\u0087þ\u008e7\u0095z\u009d¯¤ú«2\u007fB\u0087þ\u008e7\u0095z\u009d¯¤ú«2²Hº\u00adÁ³È\u007fûã\u0003_\n\u0096\u0011Û\u0019\u000e [/\u00936é>\fE\u0012LÞKñSZZ\u0016\u007fW\u0087ô\u008ew\u0095o\u009d¯¤ü«5²bº¶ÁÿÈgÏb×¢Þçå$ìk\u007fV\u0087ÿ\u008e2\u000eÖö`ÿºäåì*ÕqÚ¨ÃóÐ\u0080(\u000f!Í:Û2k\u000b\u0002\u0004Û\u001d\u0087\u0015Xn\u0002gÈ`ËxOq\bJ×CÃ[bT7\u00adï¦´¾t·2Í\u00065\u0097<_'\u000f/Ð\u0016\u0098\u0019W\u0000U\bäs\u00adz`}MeÍl\u0094WJ^\tFÓIù°}»2£íªñ\u00adk\u0094m\u009c¡\u0090ûhja¢zòr-KeDª]¨U\u0019.P'\u009d °801i\n·\u0003ô\u001b.\u0014\u0004í\u0080æÏþ\u0010÷\fð\u0096É\u0090Á\\ÚkÓÀ¬\u0084\u007fW\u0087ô\u008ew\u0095w\u009d¼¤á«5²`º´ÁùÈ,Ìÿ4I=\u0088&Æ.\u0006\u0017G\u0018\u009f\u0001Â\u000e\u0093ö9ÿöä§ì%Õe\u007fW\u0087ú\u008e7\u0095|\u009dµ¤æëù\u0013Z\u001aÙ\u0001Á\t\u00010R?\u009b&Ì.\u0018UQ\\É[ÃC\u0011JLq\u0081xÍP\r¨®¡-º.²â\u008b»\u0084e\u009d(\u0095ãîÿçbà0øúñ¬2@\u007fW\u0087ô\u008ew\u0095l\u009d¸¤ð«$²eº°½\u001a\u009cVdõmvv|~©GûH<QrYú\"ú+:,a4¨=÷\u0006#\u000fr\u007fC\u0087î\u008e5\u0095s\u009d\u0082¤ë«i²!\u007fW\u0087ô\u008ew\u0095}\u009d¨¤ú«=²sºûÁíÈ Ïa×ªÞæå3ìwô·ûÒ\u0002\u0017\tK\u007fB\u0087þ\u008e7\u0095z\u009d¯¤ú«2²8º¦ÁïÈ\"Ï ×ªÞæå/ìbô·ûÒ\u0002\u001a\u007fB\u0087þ\u008e7\u0095z\u009d¯¤ú«2²Hº\u00adÁ³È\u007fÏ ×¾Þçå*ìXô½û\u0083\u0002O\t\u0010\u0011\u009a\u0018Ö\u001f\u001f&R.\u00875Â<\nCpK\u0095R\u009bYWêD\u0012ø\u001b1\u0000|\b©1ü>4'>/´Tâ] ZnB§Kàp\u0018yra§nÖ\u0097P\u009c^\u0084\u009e\u008dÛ\u008a\u0012³C»\u009a Î\u007fB\u0087þ\u008e7\u0095z\u009d¯¤ú«2²8º£ÁéÈ&Ïw×õÞµå1ì(ô³ûÙ\u0002\u0016\tG\u0011Å\u0018\u0085\u001f\u0001Í\u00925$<æ'¨/a\u0016&\u0019®\u0000´\bas0zÆ}¸eml;Wþ^¹FpI4°Ñ»×£\u001bªL\u00adÆ\u0094\u0082\u009cK\u0087\u001e\u008eËñ\u0096ù^à,ëÉÒÏÚ\u0003\u0013-ë\u008eâ\rù\u0007ñÈÈ\u0086Ç_Þ\u0001ÖÀ\u00ad\u0090¤W£\u0010»Å}\u000e\u0085\u00ad\u008c.\u0097$\u009fë¦¥©|°'¸áÃ³ÊwÍ3ÕºÜ¸çmî7öðù\u0086\u0000\u000e\u000b\u0000\u0013Í\u001a\u0084\u001dO$\u000b,Þ7\u0082>BA\u001fIÚP\u008e\u007fd\u0087õ\u008e=\u0095m\u009d²¤ú«5²:º\u00adÁ³È\u007f\u007fW\u0087ô\u008ew\u0095}\u009d¨¤ú«=²sºûÁïÈ Ï|×½Þïå ì~ôëûÒ\u0002\u001d\u007fQ\u0087þ\u008e*\u0095k\u009dðN^¶ç¿\"¤y¬á\u0095ò\u009a5\u0083f\u008béðèù>þpæªï¼Ô#ÝgÅ¸ÊÙ3\u0018\u007fT\u0087þ\u008e4\u0095j\u009dó¤û«&²9º¸ÁêÈ Ïa×¦Þæå8ìt\u007fT\u0087þ\u008e4\u0095j\u009dó¤à«7²9º³ÁêÈ\"Ïj×\u0092Þàå ìjô ûÉ\u0002\u0018\u007fT\u0087þ\u008e4\u0095j\u009dó¤à«7²9º¹ÁèÈ-ÏP×©Þæå/ìtô¬ûÏ\u0002\u0000\u007fW\u0087ô\u008ew\u0095t\u009d¸¤á«?²rº¹Á¥È(Ïa×©Þñå.ìnô¡û\u0095\u0002\b\tZ\u0011\u0090\u0018Æ\u001f\u0015\u007fW\u0087ô\u008ew\u0095}\u009d²¤ü«%²9º¤ÁîÈ$Ïz×ãÞâå7ìcô\u009aûÕ\u0002\u0018\tR\u0011\u0098\u007fW\u0087ô\u008ew\u0095p\u009d¹¤þ«\u007f²uº ÁâÈ%Ïk×ãÞåå(ìiô¢ûÞ\u0002\u000b\tO\u0011\u008f\u0018Ú\u001f\u001f&C\u007fW\u0087ô\u008ew\u0095o\u009d¯¤ü«5²bº¶ÁÿÈgÏm×¸Þêå-ìcôëûÝ\u0002\u0010\tQ\u0011\u009a\u0018Ö\u001f\u0003&G.\u00875Â<\u0007C[\u0088Äpgyäbÿj7Ss\\¶EáM+66?¸8é 7)|\u0012¶\u001bº\u00030\fAõ\u0084þËæ\u000bïRè\u0092ÑÖÙ\u000fÂVË\u008e$¥Ü\u0006Õ\u0085Î\u009eÆVÿ\u0012ð×é\u0080áJ\u009a&\u0093Þ\u0094\u0085\u008cK\u0085_¾Ñ·\u0080¯^ %YïRãJiC(Dí}¢ubn+gë\u0018¯\u0010v\t?\u0002çð¿\b\u001c\u0001\u009f\u001a\u0081\u0012P+\u0015$Ý=\u00905ONMGÃ@\u0092XLQ\u0007jÍcÁ{Kt:\u008dÿ\u0086°\u009ep\u0097)\u0090é©\u00ad¡tº-³õ\u007fW\u0087ô\u008ew\u0095i\u009d¸¤ý«5²xº§ÁÔÈ-Ïc×¦Þîåoìeô°ûÒ\u0002\u0015\t[\u0011Ó\u0018Õ\u001f\u0018&Y.\u00925Î<\u001bC_K\u009fRÊY\u000f`S\u007f\rK¯³\u001d\u007f\u001f\u007f\f\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤â«4²zº ÁÔÈ9Ïf×½Þæ\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤à«>²tº¾ÁîÈ=Ï ×¯Þâå2ìbô§ûÚ\u0002\u0017\t[\u0011¢\u0018Ô\u001f\u0014&Y.\u008c5Ï\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤à«>²tº¾ÁîÈ=Ï ×ªÞæå/ì~ô¡\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤à«>²tº¾ÁîÈ=Ï ×¼Þæå,ìrô¡\u009d\u0017eõl=wq\u007fïFÿI)PgX½#É* -`5±<ý\u00079\u007f\n\u0087è\u008e \u0095l\u009d©¤ö«<²8º¹ÁâÈ+Ï ×¡Þêå#ìdô\u009aûÖ\u0002\u0018\tS\u0011\u0091\u0018Ü\u001f\u0012&h.\u00915Î<\u000bCZK\u008aRüY\u0010`Bh\u0088o.v7~¬\u0085òA\u0005¹ð°3«f£ý\u009aþ\u0095-\u008cl\u0084\u0085ÿãö6ñs\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ñ«\"²cº\u008aÁÿÈ Ïb×¨\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤à«>²tº¾ÁîÈ=Ï ×¯Þðå5ìaôªû×\u0002\u001d\tZ\u0011\u008f\u0018×\u0082\u0010zòs:hv`³YìV&O\"G£<ø512:*»#ð\u00189\u0011\u007f\t¬\u0006Õÿ\u0005ôJì\u008båÍâ\u000eÛ_Ó°ÈÛÁ\u001d¾\\¶Ù¯Ê¤\u0014?þÇ\u000bÎÈÕ\u009dÝ\u0006ä\u0005ëÖò\u0097ú@\u0081\u001c\u0088Þ\u008f\u009e{%\u0083Ð\u008a\u0013\u0091F\u0099Ý Þ¯\r¶L¾\u009dÅÝÌ\u0014ËOiÐ\u0091%\u0098æ\u0083³\u008b(²+½ø¤¹¬b×4ÞôÙ»\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ñ«\"²cººÁùÈ Ïj\u0087Þ\u007f+vèm½e&\\%SöJ·Bw920î7¼\u007f\n\u0087ÿ\u008e<\u0095i\u009dò¤ñ«\"²cº¥ÁìÈ(Ïf×½Þà»\rCøJ;QnYõ`öo%vd~\u008d\u0005å\f#\u000bm\u0087O\u007fºv}m.eù\\ùSpJ=Bç9 0`7%/é&¢\u001dw\u0014m\f®\u0003\u0086ú^ñUéÚà\u0085ç@Þ\u0019\u007f\n\u0087ö\u008e7\u0095k\u009dò¤ä«8²yº±ÁäÈ>Ï|×âÞÁå2ìsô\u0096ûÓ\u0002\u0018\tM\u0011\u0098\u0018×\u001f7&X.\u00995Ï<\fC]\u007f\n\u0087ë\u008e+\u0095p\u009d¾¤¼«8²xº¥ÁäÈ;Ï{×¾\u007f\u0015\u0087ý\u008e?\u0095?\u009dçOØ·9¾ù¥¢\u00adl\u0094n\u009bð\u0082 \u008akñ?ø´ÿ°ç~î!Õà\u007fB\u0087é\u008e8\u0095s\u009d±¤ü«2²9º²ÁäÈ%Ïk×«Þêå2ìoôëûÈ\u0002\u0016¶\u00adN\u0016Gß\\¼Tum2bæ{¬sS\b\u001c\u0001Ù\u0006Å\u001eZ\u0017\b\u0086&~Òw\u0001lPdÞ]ÒR\u0018K_C\u00908Æ1:6@.\u008e'Ë\u001c\b\u0015H\r\u009a\u0002¹û-ð~è½\u007fG\u0087÷\u008e,\u0095z\u009d®¤ç«0²tº¾Áø\u008b%sÑz\u0002aSiÝPÑ_\u0011FMN\u00945Ð<\u0015\u007f\n\u0087ÿ\u008e8\u0095k\u009d¼¤¼«5²xº¢ÁåÈ%Ï`×¬Þçå2ì(ôëûß\u0002\t\t\u0010\u0011\u009c\u0018Ã\u001f\u0001&D.Û5Ó<\u0004CC¬lT\u008d]MF\u0016NØwÚxTa\u0001iÆ\u0012\u0084\u001bA\u001c\u000f\u0004ÄË>3¨:i!')ç\u0010¦\u001f~\u0006#\u007f\n\u0087ÿ\u008e8\u0095k\u009d¼¤¼«<²~º¦ÁèÈfÏ\u007f×¿Þìå'ìnô©ûÞ\u0002\n\t\u0010\u0011\u009e\u0018Æ\u001f\u0003&\u0018.Å5\u0084<\nC@K\u0080R\u008dY\f`Nh\u0086o)vv~©\u0085ô\u008c!\u0093e\u009bù¢ø©.°d¸º¿äÆ.Íd".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        charlie = cArr;
        delta = -4272501711851190373L;
    }

    public M4296(bh bhVar) {
        this.alpha = bhVar;
    }

    public static Object[] D8871(Context context, int i4, int i5, int i10) {
        return (Object[]) foxtrot(new Object[]{context, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i10)}, bh.alpha(), 1609898089, bh.alpha(), bh.alpha(), bh.alpha(), -1609898088);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, int i4, short s3) {
        int i5;
        int i10 = 4 - (s3 * 2);
        int i11 = b2 * 4;
        int i12 = 106 - i4;
        byte[] bArr = new byte[1 - i11];
        int i13 = 0 - i11;
        byte[] bArr2 = juliet;
        if (bArr2 == null) {
            int i14 = 0;
            byte[] bArr3 = bArr2;
            int i15 = i10;
            i12 += -i10;
            i10 = i15 + 1;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i12;
            i14 = i5 + 1;
            if (i5 == i13) {
                return new String(bArr, 0);
            }
            byte b4 = bArr2[i10];
            byte[] bArr4 = bArr2;
            i15 = i10;
            i10 = b4;
            bArr3 = bArr4;
            i12 += -i10;
            i10 = i15 + 1;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i12;
            i14 = i5 + 1;
            if (i5 == i13) {
            }
        } else {
            i5 = 0;
            bArr[i5] = (byte) i12;
            i14 = i5 + 1;
            if (i5 == i13) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(char c3, int i4, int i5, Object[] objArr) {
        byte[] bArr;
        Throwable cause;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13;
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        cy cyVar = new cy();
        long[] jArr = new long[i5];
        cyVar.component5 = 0;
        while (true) {
            int i17 = cyVar.component5;
            bArr = juliet;
            if (i17 >= i5) {
                break;
            }
            int i18 = (india + 111) % 2;
            long j6 = delta;
            char[] cArr = charlie;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i18 != 0) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i15] = Integer.valueOf(cArr[i4 << i17]);
                    Object D8871 = uH18377.D8871(-31669226);
                    if (D8871 == null) {
                        int tapTimeout = 52 - (ViewConfiguration.getTapTimeout() >> 16);
                        j5 = 0;
                        int red = 2123 - Color.red(i15);
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        i12 = 359345605;
                        byte b2 = (byte) (bArr[3] - 1);
                        i10 = i15;
                        byte b4 = b2;
                        i11 = i16;
                        String alpha = alpha(b4, b4, b2);
                        Class[] clsArr = new Class[i14];
                        clsArr[i10] = cls2;
                        D8871 = uH18377.setPivotYN16904(tapTimeout, red, windowTouchSlop, 564618947, false, alpha, clsArr);
                    } else {
                        i10 = i15;
                        i11 = i16;
                        j5 = 0;
                        i12 = 359345605;
                    }
                    Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                    l10.getClass();
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c3);
                    objArr3[i11] = Long.valueOf(j6);
                    objArr3[i14] = Long.valueOf(i17);
                    objArr3[i10] = l10;
                    Object D88712 = uH18377.D8871(-897540670);
                    if (D88712 == null) {
                        int indexOf = TextUtils.indexOf((CharSequence) "", '0') + 52;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2797;
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 32779);
                        byte b6 = (byte) (bArr[3] - i14);
                        byte b10 = (byte) (b6 + 3);
                        i13 = i14;
                        String alpha2 = alpha((byte) (b10 - 3), b10, b6);
                        Class[] clsArr2 = new Class[4];
                        clsArr2[i10] = cls;
                        clsArr2[i13] = cls;
                        clsArr2[i11] = cls;
                        clsArr2[3] = cls2;
                        D88712 = uH18377.setPivotYN16904(indexOf, modifierMetaStateMask, maxKeyCode, 356204311, false, alpha2, clsArr2);
                    } else {
                        i13 = i14;
                    }
                    jArr[i17] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[i11];
                    objArr4[i13] = cyVar;
                    objArr4[i10] = cyVar;
                    Object D88713 = uH18377.D8871(i12);
                    if (D88713 == null) {
                        int myPid = (Process.myPid() >> 22) + 52;
                        int packedPositionType = ExpandableListView.getPackedPositionType(j5) + 2175;
                        char indexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        byte b11 = (byte) (bArr[3] - 1);
                        byte b12 = (byte) (b11 + 2);
                        String alpha3 = alpha((byte) (b12 - 2), b12, b11);
                        Class[] clsArr3 = new Class[2];
                        clsArr3[i10] = Object.class;
                        clsArr3[i13] = Object.class;
                        D88713 = uH18377.setPivotYN16904(myPid, packedPositionType, indexOf2, -892301552, false, alpha3, clsArr3);
                    }
                    ((Method) D88713).invoke(null, objArr4);
                    i14 = i13;
                    i15 = i10;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
            } else {
                int i19 = i15;
                Object[] objArr5 = new Object[i14];
                objArr5[i19] = Integer.valueOf(cArr[i4 + i17]);
                Object D88714 = uH18377.D8871(-31669226);
                if (D88714 == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(i19, i19) + 52;
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2123;
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    byte b13 = (byte) (bArr[3] - 1);
                    byte b14 = b13;
                    D88714 = uH18377.setPivotYN16904(absoluteGravity, windowTouchSlop2, tapTimeout2, 564618947, false, alpha(b14, b14, b13), new Class[]{cls2});
                }
                Long l11 = (Long) ((Method) D88714).invoke(null, objArr5);
                l11.getClass();
                Object[] objArr6 = {l11, Long.valueOf(i17), Long.valueOf(j6), Integer.valueOf(c3)};
                Object D88715 = uH18377.D8871(-897540670);
                if (D88715 == null) {
                    byte b15 = (byte) (bArr[3] - 1);
                    byte b16 = (byte) (b15 + 3);
                    D88715 = uH18377.setPivotYN16904((ViewConfiguration.getTouchSlop() >> 8) + 51, 2796 - TextUtils.indexOf("", ""), (char) (32779 - Color.blue(0)), 356204311, false, alpha((byte) (b16 - 3), b16, b15), new Class[]{cls, cls, cls, cls2});
                }
                jArr[i17] = ((Long) ((Method) D88715).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cyVar, cyVar};
                Object D88716 = uH18377.D8871(359345605);
                if (D88716 == null) {
                    byte b17 = (byte) (bArr[3] - 1);
                    byte b18 = (byte) (b17 + 2);
                    D88716 = uH18377.setPivotYN16904(52 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2175 - (Process.myTid() >> 22), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -892301552, false, alpha((byte) (b18 - 2), b18, b17), new Class[]{Object.class, Object.class});
                }
                ((Method) D88716).invoke(null, objArr7);
                i14 = 1;
                i15 = 0;
            }
            i16 = 2;
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        char[] cArr2 = new char[i5];
        cyVar.component5 = 0;
        while (true) {
            int i20 = cyVar.component5;
            if (i20 < i5) {
                cArr2[i20] = (char) jArr[i20];
                Object[] objArr8 = {cyVar, cyVar};
                Object D88717 = uH18377.D8871(359345605);
                if (D88717 == null) {
                    byte b19 = (byte) (bArr[3] - 1);
                    byte b20 = (byte) (b19 + 2);
                    D88717 = uH18377.setPivotYN16904(ExpandableListView.getPackedPositionGroup(0L) + 52, 2175 - TextUtils.indexOf("", "", 0), (char) KeyEvent.normalizeMetaState(0), -892301552, false, alpha((byte) (b20 - 2), b20, b19), new Class[]{Object.class, Object.class});
                }
                ((Method) D88717).invoke(null, objArr8);
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    public static void delta(int i4, int i5, byte b2, Object[] objArr) {
        int i10 = b2 * 3;
        int i11 = 99 - i4;
        int i12 = 4 - (i5 * 2);
        byte[] bArr = new byte[4 - i10];
        int i13 = 3 - i10;
        int i14 = -1;
        byte[] bArr2 = golf;
        if (bArr2 == null) {
            i11 = i12 + i11 + 6;
            i12++;
            i14 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr[i15] = (byte) i11;
            if (i15 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i16 = i12;
            i11 = i11 + bArr2[i12] + 6;
            i12 = i16 + 1;
            i14 = i15;
            bArr2 = bArr2;
        }
    }

    public static /* synthetic */ Object foxtrot(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~(i13 | i5);
        int i15 = ~(i5 | i4);
        int i16 = i14 | i15;
        int i17 = ~i13;
        int i18 = ~i5;
        int i19 = (~(i17 | i4)) | (~(i17 | i18)) | (~(i18 | i4));
        int i20 = ~i4;
        int i21 = i19 | (~(i20 | i13 | i5));
        int i22 = (~(i20 | i18)) | i13 | i15;
        int i23 = 1274019840 * i11;
        int i24 = ((-325058560) * i12) + ((-1660944384) * i10) + i23 + ((-2001489518) * i22) + (i21 * (-2001489518)) + (2001489518 * i16) + ((-1019457937) * i5) + ((i13 * (-1019457937)) - 559939584);
        int papa = AbstractC2327c.papa(i12, 1167700406, (1962400304 * i10) + i13 + i5 + i11);
        if (AbstractC2327c.quebec(papa, 1407582208, (i12 * (-873382486)) + (i10 * (-1621399344)) + (i11 * (-1629561329)) + (i22 * 910) + (i21 * 910) + (i16 * (-910)) + (i5 * (-1629562239)) + ((i13 * (-1629562239)) - 1134582380), -1895432192, (867827712 * papa) + i24) != 1) {
            M4296 m4296 = (M4296) objArr[0];
            int i25 = foxtrot;
            int i26 = (i25 & 29) + (i25 | 29);
            echo = i26 % 128;
            if (i26 % 2 == 0) {
                return m4296.bravo();
            }
            m4296.bravo();
            throw null;
        }
        return india(objArr);
    }

    public static void golf() {
        golf = new byte[]{18, -63, 24, -102, 6, -5, 3};
        hotel = 215;
    }

    public static void hotel() {
        juliet = new byte[]{51, 94, -43, 1};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:154|(1:156)|157|158|(3:160|(1:162)(1:382)|163)(1:383)|164|165|(1:167)|168|(5:170|(1:172)|173|174|(27:176|(1:178)(1:379)|179|180|(6:182|(8:184|(6:186|187|(1:189)(1:226)|190|191|(1:193)(5:225|206|207|208|209))(5:227|228|(1:230)|231|232)|194|(7:196|(2:198|(4:200|(1:202)|203|204)(5:216|217|(1:219)|220|221))(1:223)|210|(1:212)(1:215)|213|214|209)|224|207|208|209)|234|235|(1:237)(1:377)|238)(1:378)|239|240|(1:242)|243|(1:245)(4:372|(1:374)|375|376)|246|(2:248|(18:250|(7:252|253|(1:255)(1:367)|256|257|(1:366)(3:259|(15:261|(7:263|(1:265)|266|267|(1:272)|269|270)(7:357|(1:359)|360|361|(1:363)|269|270)|275|(1:(4:277|(6:279|(1:352)(12:283|284|285|286|287|288|289|290|(1:292)(1:342)|293|294|(3:296|297|298)(2:299|300))|349|345|346|298)|353|354)(2:355|356))|301|302|303|(2:305|(2:307|(5:309|310|(1:312)|313|(6:315|316|317|(1:319)|320|321)))(6:328|329|330|331|332|333))|339|340|316|317|(0)|320|321)(2:364|365)|271)|273)|368|369|274|275|(2:(0)(0)|354)|301|302|303|(0)|339|340|316|317|(0)|320|321))|370|371|275|(2:(0)(0)|354)|301|302|303|(0)|339|340|316|317|(0)|320|321))(1:381)|380|180|(0)(0)|239|240|(0)|243|(0)(0)|246|(0)|370|371|275|(2:(0)(0)|354)|301|302|303|(0)|339|340|316|317|(0)|320|321) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x2ba3, code lost:
    
        if (((r4 & r6) | (r4 ^ r6)) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x2ca4, code lost:
    
        if (((r4 & r6) | (r4 ^ r6)) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x2a86, code lost:
    
        if (r1 != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x39fb, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x11de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x142f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1663  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x180a A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x18f4 A[Catch: all -> 0x3be9, TRY_ENTER, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1be3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x2dd6 A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x2e1f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x2f21  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x3870  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x399e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x3a66 A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x3927 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x2e22 A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x2da4  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x3b70  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x17e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1603  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x130f A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x13f7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1419  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1167 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0f50  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0ed9 A[Catch: all -> 0x3be9, TryCatch #3 {all -> 0x3be9, blocks: (B:6:0x0158, B:8:0x0165, B:9:0x01ac, B:19:0x0375, B:21:0x0381, B:22:0x03bf, B:29:0x0514, B:31:0x0523, B:32:0x0562, B:37:0x0770, B:39:0x0776, B:40:0x07ac, B:42:0x08f2, B:44:0x0901, B:45:0x0940, B:50:0x0b6b, B:52:0x0b7a, B:53:0x0bba, B:60:0x0cac, B:62:0x0cb6, B:63:0x0cf8, B:82:0x0ecf, B:84:0x0ed9, B:85:0x0f19, B:92:0x10db, B:94:0x10e5, B:95:0x1130, B:121:0x14b4, B:123:0x14be, B:124:0x1504, B:136:0x1665, B:138:0x1672, B:139:0x16bc, B:148:0x1804, B:150:0x180a, B:151:0x1844, B:154:0x18f4, B:156:0x1906, B:157:0x1946, B:165:0x1a65, B:167:0x1a6f, B:168:0x1aaf, B:170:0x1ab8, B:172:0x1ad2, B:173:0x1b1b, B:187:0x29b5, B:189:0x29bf, B:190:0x2a07, B:200:0x2aa2, B:202:0x2ab3, B:203:0x2af6, B:217:0x2bab, B:219:0x2bbd, B:220:0x2bfd, B:228:0x2a2b, B:230:0x2a35, B:231:0x2a75, B:240:0x2dcc, B:242:0x2dd6, B:243:0x2e16, B:253:0x32a2, B:255:0x32ac, B:256:0x32f2, B:263:0x33ea, B:265:0x33f5, B:266:0x3438, B:357:0x34d7, B:359:0x34e2, B:360:0x352d, B:317:0x3a5c, B:319:0x3a66, B:320:0x3aab, B:372:0x2e22, B:374:0x2e3b, B:375:0x2e7b, B:398:0x1300, B:400:0x130f, B:401:0x134f, B:428:0x065f, B:430:0x0669, B:431:0x06ad, B:437:0x06ee, B:439:0x06f8, B:440:0x0733), top: B:5:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x10d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object india(Object[] objArr) {
        int i4;
        int i5;
        Class cls;
        int i10;
        char c3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        File file;
        int i18;
        Object D8871;
        int i19;
        char c4;
        String[] strArr;
        int i20;
        int i21;
        int i22;
        File file2;
        Object D88712;
        int i23;
        int foxtrot2;
        int foxtrot3;
        int i24;
        int i25;
        int i26;
        int i27;
        char c10;
        int i28;
        String[] strArr2;
        int i29;
        int i30;
        int i31;
        Object D88713;
        int i32;
        int i33;
        int i34;
        String[] strArr3;
        int i35;
        int i36;
        boolean z2;
        int i37;
        String[] strArr4;
        Object D88714;
        Object invoke;
        int i38;
        String[] strArr5;
        int i39;
        char c11;
        int i40;
        int i41;
        int i42;
        int i43;
        Object D88715;
        File file3;
        int i44;
        String[] strArr6;
        String str2;
        String next;
        int i45;
        String[][] strArr7;
        int i46;
        String[] strArr8;
        String str3;
        int i47;
        String[] strArr9;
        int i48;
        String[] strArr10;
        int i49;
        int i50;
        int i51;
        String[] strArr11;
        int i52;
        int i53;
        String[] strArr12;
        String next2;
        int i54;
        int i55;
        String[] strArr13;
        int i56;
        String next3;
        String[] strArr14;
        int i57 = 4;
        int i58 = 0;
        int i59 = 1;
        int intValue = ((Number) objArr[1]).intValue();
        int i60 = 2;
        int intValue2 = ((Number) objArr[2]).intValue();
        int intValue3 = ((Number) objArr[3]).intValue();
        foxtrot = (echo + 113) % 128;
        int i61 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i62 = -ExpandableListView.getPackedPositionType(0L);
        Object[] objArr2 = new Object[1];
        charlie((char) ((i61 ^ 29079) + ((i61 & 29079) << 1)), (i62 & 910) + (i62 | 910), 7 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))), objArr2);
        String str4 = (String) objArr2[0];
        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
        int i63 = -1;
        int lastIndexOf = (-1) - TextUtils.lastIndexOf("", '0', 0);
        int i64 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
        int alpha = bh.alpha();
        int i65 = (i64 * 567) - 15255;
        int i66 = ~i64;
        int i67 = ~((i66 ^ 27) | (i66 & 27));
        int i68 = ~((i66 ^ alpha) | (i66 & alpha));
        int i69 = ((i67 ^ i68) | (i67 & i68)) * (-566);
        int i70 = (i65 & i69) + (i69 | i65);
        int i71 = (~((-28) | i64)) * 566;
        int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
        Object[] objArr3 = new Object[1];
        charlie(pressedStateDuration, lastIndexOf, ((~(i66 | (-28) | alpha)) * 566) + i72, objArr3);
        String str5 = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        charlie((char) ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), TextUtils.indexOf((CharSequence) "", '0') + 28, 25 - View.MeasureSpec.getSize(0), objArr4);
        String str6 = (String) objArr4[0];
        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
        int threadPriority = Process.getThreadPriority(0);
        int i73 = -(-View.getDefaultSize(0, 0));
        Object[] objArr5 = new Object[1];
        charlie((char) ((modifierMetaStateMask ^ 52119) + ((modifierMetaStateMask & 52119) << 1)), (((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6) + 52, ((i73 | 18) << 1) - (i73 ^ 18), objArr5);
        String str7 = (String) objArr5[0];
        char c12 = (char) (8414 - (~(-(Process.myTid() >> 22))));
        int i74 = -TextUtils.indexOf((CharSequence) "", '0', 0);
        int i75 = (i74 & 69) + (i74 | 69);
        int i76 = -Drawable.resolveOpacity(0, 0);
        Object[] objArr6 = new Object[1];
        charlie(c12, i75, (i76 & 28) + (i76 | 28), objArr6);
        String[] strArr15 = {str5, str6, str7, (String) objArr6[0]};
        int i77 = 0;
        while (true) {
            int i78 = hotel;
            if (i77 >= i57) {
                i4 = i60;
                i5 = i78;
                cls = String.class;
                i10 = i58;
                c3 = ' ';
                i11 = intValue;
                break;
            }
            c3 = ' ';
            try {
                Object[] objArr7 = new Object[1];
                objArr7[i58] = strArr15[i77];
                Object D88716 = uH18377.D8871(-2104138125);
                if (D88716 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                    int scrollBarFadeDuration = 2951 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    i4 = i60;
                    byte b2 = (byte) (i78 & 1);
                    byte b4 = (byte) (b2 - 1);
                    i10 = i58;
                    Object[] objArr8 = new Object[1];
                    delta(b2, b4, (byte) (b4 + 1), objArr8);
                    String str8 = (String) objArr8[i10];
                    Class[] clsArr = new Class[1];
                    clsArr[i10] = String.class;
                    D88716 = uH18377.setPivotYN16904(minimumFlingVelocity, scrollBarFadeDuration, doubleTapTimeout, 1563346086, false, str8, clsArr);
                } else {
                    i4 = i60;
                    i10 = i58;
                }
                long longValue = ((Long) ((Method) D88716).invoke(null, objArr7)).longValue();
                long j5 = 701489631;
                i5 = i78;
                long j6 = i63;
                long j7 = j5 ^ j6;
                cls = String.class;
                long elapsedRealtime = ((((int) SystemClock.elapsedRealtime()) ^ j6) | j5) ^ j6;
                long j10 = ((-374) * (((j7 | longValue) ^ j6) | elapsedRealtime)) + ((-747) * longValue) + (375 * j5);
                long j11 = longValue ^ j6;
                long j12 = ((374 * (((j7 | j11) ^ j6) | elapsedRealtime)) + ((748 * ((j11 | j5) ^ j6)) + j10)) - 1931110161;
                int tango = ao.ad.tango(738911655);
                int foxtrot4 = ((int) (j12 >> 32)) & A0.z.foxtrot((~(tango | (-1774508397))) | (~(1083232488 | tango)) | 692324612, -69, (((~(1775557100 | tango)) | (~((-1082183785) | tango))) * 69) + 1890623806, 72360576);
                int i79 = (int) j12;
                int i80 = (int) Runtime.getRuntime().totalMemory();
                int i81 = ~i80;
                if ((foxtrot4 | (i79 & ((((~(i81 | 1775170996)) | 337944586) * 217) + (((~(i80 | (-337944587))) | 337641482) * 217) + (((~((-337944587) | i81)) | (~(1775170996 | i80))) * 217) + 883728334))) != 0) {
                    int i82 = (i77 ^ 190) + ((i77 & 190) << 1);
                    i11 = (i82 & (~intValue)) | ((~i82) & intValue);
                    break;
                }
                i77++;
                i60 = i4;
                i58 = i10;
                i63 = -1;
                i57 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        char c13 = (char) (31500 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
        int i83 = -(-ImageFormat.getBitsPerPixel(i10));
        int i84 = (i83 ^ 99) + ((i83 & 99) << 1);
        int threadPriority2 = Process.getThreadPriority(i10);
        int i85 = -((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6);
        int i86 = i85 * (-721);
        int i87 = (i86 & (-8652)) + (i86 | (-8652));
        int i88 = ~intValue;
        int i89 = ~i85;
        int i90 = ~((i89 ^ (-13)) | (i89 & (-13)));
        int i91 = (i90 & i88) | (i88 ^ i90);
        int i92 = ~((i85 ^ 12) | (i85 & 12));
        int i93 = (i87 - (~(-(-(((i91 & i92) | (i91 ^ i92)) * 1444))))) - 1;
        int i94 = ~(i85 | intValue);
        int i95 = (i94 & i92) | (i92 ^ i94);
        int i96 = ~((intValue ^ 12) | (intValue & 12));
        int i97 = (((i95 & i96) | (i95 ^ i96)) * (-1444)) + i93;
        int i98 = ~((i89 & 12) | (i89 ^ 12));
        int i99 = ~((i85 & (-13)) | ((-13) ^ i85));
        int i100 = -(-(((i99 & i98) | (i98 ^ i99)) * 722));
        int i101 = (i97 ^ i100) + ((i100 & i97) << 1);
        Object[] objArr9 = new Object[1];
        charlie(c13, i84, i101, objArr9);
        String str9 = (String) objArr9[i10];
        int i102 = i10;
        int i103 = (ExpandableListView.getPackedPositionForChild(i102, i102) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i102, i102) == 0L ? 0 : -1));
        Object[] objArr10 = new Object[1];
        charlie((char) (((i103 | 49729) << 1) - (i103 ^ 49729)), 110 - (~TextUtils.lastIndexOf("", '0')), 12 - (~(-View.MeasureSpec.getMode(0))), objArr10);
        String str10 = (String) objArr10[0];
        int i104 = -TextUtils.getOffsetAfter("", 0);
        int i105 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        Object[] objArr11 = new Object[1];
        charlie((char) ((i104 & 40087) + (i104 | 40087)), (i105 ^ 123) + ((i105 & 123) << 1), 17 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr11);
        String[] strArr16 = {str9, str10, (String) objArr11[0]};
        int i106 = 0;
        while (true) {
            if (i106 >= 3) {
                i12 = i59;
                i13 = intValue;
                break;
            }
            echo = (foxtrot + 89) % 128;
            Object[] objArr12 = new Object[i59];
            objArr12[0] = strArr16[i106];
            Object D88717 = uH18377.D8871(1979478258);
            if (D88717 == null) {
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52;
                int modifierMetaStateMask2 = 2950 - ((byte) KeyEvent.getModifierMetaStateMask());
                char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                byte b6 = (byte) (i5 & 10);
                byte b10 = (byte) (b6 - 2);
                Object[] objArr13 = new Object[i59];
                delta(b6, b10, (byte) (b10 + 1), objArr13);
                String str11 = (String) objArr13[0];
                Class[] clsArr2 = new Class[i59];
                clsArr2[0] = cls;
                D88717 = uH18377.setPivotYN16904(scrollBarFadeDuration2, modifierMetaStateMask2, combineMeasuredStates, -1438133721, false, str11, clsArr2);
            }
            long longValue2 = ((Long) ((Method) D88717).invoke(null, objArr12)).longValue();
            long j13 = 22716454;
            i12 = i59;
            long j14 = -1;
            long j15 = j13 ^ j14;
            long j16 = longValue2 ^ j14;
            long freeMemory = (int) Runtime.getRuntime().freeMemory();
            long j17 = freeMemory ^ j14;
            long j18 = (564 * (((j15 | j17) ^ j14) | ((longValue2 | j13) ^ j14))) + (1128 * (((j15 | longValue2) | freeMemory) ^ j14)) + ((-564) * (j15 | ((j16 | j17) ^ j14) | ((longValue2 | freeMemory) ^ j14))) + (565 * longValue2) + ((-563) * j13) + 752104852;
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            int i107 = ~((-817452123) | uptimeMillis);
            int i108 = ~uptimeMillis;
            int i109 = ((int) (j18 >> c3)) & ((((~(uptimeMillis | (-619774289))) | (~(817452122 | i108))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~((-268981259) | i108)) * (-406)) + ((i107 | (~(888755546 | i108))) * (-406)) + 90048390);
            int myUid = Process.myUid();
            int i110 = ((int) j18) & ((((~(myUid | 1771065156)) | (~((~myUid) | 1086675729))) * 627) + (((~((-1086675730) | myUid)) | 1771065156) * (-627)) + ((((-688915525) | myUid) * (-627)) - 635053948));
            if (((i109 & i110) | (i109 ^ i110)) != 0) {
                int i111 = (i106 & 270) + (i106 | 270);
                i13 = (i111 & i88) | ((~i111) & intValue);
                break;
            }
            i106++;
            i59 = i12;
        }
        int i112 = ((~i11) & intValue) | (i11 & i88);
        int i113 = (i112 | (-i112)) >> 31;
        int i114 = i13 & (~i113);
        int i115 = i11 & i113;
        int i116 = (i115 & i114) | (i114 ^ i115);
        int i117 = -(-(Process.myPid() >> 22));
        int doubleTapTimeout2 = ViewConfiguration.getDoubleTapTimeout() >> 16;
        int alpha2 = bh.alpha();
        int i118 = doubleTapTimeout2 * (-432);
        int i119 = (i118 ^ 61194) + ((i118 & 61194) << 1);
        int i120 = ~doubleTapTimeout2;
        int i121 = ~alpha2;
        int i122 = ((~((i121 & i120) | (i120 ^ i121) | ModuleDescriptor.MODULE_VERSION)) * 433) + i119;
        int i123 = ~(((-142) & alpha2) | ((-142) ^ alpha2));
        int i124 = ((i123 & i120) | (i120 ^ i123)) * (-433);
        int i125 = ((i122 | i124) << 1) - (i122 ^ i124);
        int i126 = ~((alpha2 & i120) | (i120 ^ alpha2));
        int i127 = ~((doubleTapTimeout2 & ModuleDescriptor.MODULE_VERSION) | (doubleTapTimeout2 ^ ModuleDescriptor.MODULE_VERSION));
        int i128 = ((i127 & i126) | (i126 ^ i127)) * 433;
        int i129 = i12;
        Object[] objArr14 = new Object[i129];
        charlie((char) ((i117 ^ 4938) + ((i117 & 4938) << 1)), (i125 & i128) + (i128 | i125), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr14);
        Object[] objArr15 = new Object[i129];
        objArr15[0] = (String) objArr14[0];
        Object D88718 = uH18377.D8871(-2104138125);
        if (D88718 == null) {
            int indexOf = 52 - TextUtils.indexOf("", "", 0);
            int i130 = 2952 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            char c14 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b11 = (byte) (i5 & 1);
            byte b12 = (byte) (b11 - 1);
            Object[] objArr16 = new Object[1];
            delta(b11, b12, (byte) (b12 + 1), objArr16);
            D88718 = uH18377.setPivotYN16904(indexOf, i130, c14, 1563346086, false, (String) objArr16[0], new Class[]{cls});
        }
        long longValue3 = ((Long) ((Method) D88718).invoke(null, objArr15)).longValue();
        long j19 = 230876971;
        long j20 = (713 * longValue3) + ((-711) * j19);
        long j21 = -712;
        long j22 = -1;
        long j23 = longValue3 ^ j22;
        long elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        long j24 = elapsedRealtime2 ^ j22;
        long j25 = (j24 | j19) ^ j22;
        long j26 = ((712 * (j23 | j25)) + ((j21 * (((elapsedRealtime2 | (j19 | longValue3)) ^ j22) | (((j23 | j24) | j19) ^ j22))) + (((((j23 | j19) ^ j22) | j25) * j21) + j20))) - 1460497501;
        int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int foxtrot5 = ((int) (j26 >> c3)) & A0.z.foxtrot((~(freeMemory2 | (-1387255106))) | (~(1470485779 | freeMemory2)) | 655424, -69, (((~(1471141203 | freeMemory2)) | (~((-1386599682) | freeMemory2))) * 69) - 10722800, 1493173466);
        int romeo = ao.ad.romeo();
        int i131 = ~romeo;
        int i132 = ((int) j26) & ((((~(romeo | 1638416505)) | (~(i131 | (-27803722)))) * 765) + (((~(1638416505 | i131)) | 173386374) * 1530) + (((~((-173386375) | i131)) | (~(1811802879 | romeo)) | (~((-27803722) | romeo))) * 765) + 2082494182);
        if (((i132 & foxtrot5) | (foxtrot5 ^ i132)) != 0) {
            i15 = (~(intValue & 266)) & (intValue | 266);
            i14 = -957097391;
        } else {
            Object[] objArr17 = new Object[1];
            charlie((char) (23052 - (~(-(-TextUtils.indexOf("", "", 0))))), ((byte) KeyEvent.getModifierMetaStateMask()) + 156, 23 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object D88719 = uH18377.D8871(-957097391);
            if (D88719 == null) {
                int i133 = 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int modifierMetaStateMask3 = 3157 - ((byte) KeyEvent.getModifierMetaStateMask());
                char keyCodeFromString = (char) (58074 - KeyEvent.keyCodeFromString(""));
                byte b13 = (byte) 0;
                byte b14 = b13;
                i14 = -957097391;
                Object[] objArr19 = new Object[1];
                delta(b13, b14, (byte) (b14 + 1), objArr19);
                D88719 = uH18377.setPivotYN16904(i133, modifierMetaStateMask3, keyCodeFromString, 424179844, false, (String) objArr19[0], new Class[]{cls});
            } else {
                i14 = -957097391;
            }
            String str12 = (String) ((Method) D88719).invoke(null, objArr18);
            if (str12 == null || str12.isEmpty()) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i134 = 179 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                int i135 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i136 = ((i135 | 24) << 1) - (i135 ^ 24);
                Object[] objArr20 = new Object[1];
                charlie(windowTouchSlop, i134, i136, objArr20);
                Object[] objArr21 = {(String) objArr20[0]};
                Object D887110 = uH18377.D8871(i14);
                if (D887110 == null) {
                    int axisFromString = MotionEvent.axisFromString("") + 53;
                    int offsetAfter = 3158 - TextUtils.getOffsetAfter("", 0);
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 58074);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr22 = new Object[1];
                    delta(b15, b16, (byte) (b16 + 1), objArr22);
                    D887110 = uH18377.setPivotYN16904(axisFromString, offsetAfter, packedPositionGroup, 424179844, false, (String) objArr22[0], new Class[]{cls});
                }
                String str13 = (String) ((Method) D887110).invoke(null, objArr21);
                if (str13 == null || str13.isEmpty()) {
                    i15 = intValue;
                } else {
                    int i137 = echo;
                    foxtrot = (((i137 | 125) << 1) - (i137 ^ 125)) % 128;
                    i15 = (intValue & (-268)) | (i88 & 267);
                }
            } else {
                i15 = (~(intValue & 267)) & (intValue | 267);
            }
        }
        int i138 = ((~i116) & intValue) | (i116 & i88);
        int i139 = -i138;
        int i140 = ((i138 & i139) | (i138 ^ i139)) >> 31;
        int i141 = i15 & (~i140);
        int i142 = i116 & i140;
        int i143 = (i142 & i141) | (i141 ^ i142);
        Object D887111 = uH18377.D8871(1074526551);
        if (D887111 == null) {
            int i144 = 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i145 = 1056 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
            byte b17 = (byte) 0;
            byte b18 = b17;
            Object[] objArr23 = new Object[1];
            delta(b17, b18, b18, objArr23);
            D887111 = uH18377.setPivotYN16904(i144, i145, offsetAfter2, -1615832190, false, (String) objArr23[0], new Class[0]);
        }
        long longValue4 = ((Long) ((Method) D887111).invoke(null, null)).longValue();
        long j27 = 145630110;
        long j28 = -949;
        long maxMemory = (int) Runtime.getRuntime().maxMemory();
        long j29 = maxMemory ^ j22;
        long j30 = (950 * (((j29 | longValue4) ^ j22) | ((maxMemory | j27) ^ j22))) + ((-950) * (((j29 | j27) ^ j22) | ((longValue4 | maxMemory) ^ j22))) + (1900 * ((((longValue4 ^ j22) | j29) ^ j22) | (((j27 ^ j22) | maxMemory) ^ j22))) + (j28 * longValue4) + (j28 * j27) + 33935607;
        int i146 = (int) Runtime.getRuntime().totalMemory();
        int i147 = ~i146;
        int i148 = ((int) (j30 >> c3)) & ((((~(i146 | 82564998)) | (~(i147 | (-8520961)))) * 765) + (((~(82564998 | i147)) | 1511270449) * 1530) + (((~((-1511270450) | i147)) | (~(1593835447 | i146)) | (~((-8520961) | i146))) * 765) + 208365331);
        int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
        int foxtrot6 = ((int) j30) & A0.z.foxtrot((~((~elapsedRealtime3) | (-147714))) | 1434977428, 576, (((~(1436028062 | elapsedRealtime3)) | (-1436175776)) * 576) + 1771465493, 1691441152);
        int i149 = (i148 & foxtrot6) | (i148 ^ foxtrot6);
        int i150 = 199 - (~(i149 - 1));
        int i151 = (i150 | intValue) & (~(intValue & i150));
        int i152 = (i149 | (-i149)) >> 31;
        int i153 = (~i152) & intValue;
        int i154 = i152 & i151;
        int i155 = (i154 & i153) | (i153 ^ i154);
        int i156 = intValue ^ i143;
        int i157 = -i156;
        int i158 = ((i156 & i157) | (i156 ^ i157)) >> 31;
        int i159 = i155 & (~i158);
        int i160 = i143 & i158;
        int i161 = (i160 & i159) | (i159 ^ i160);
        char c15 = (char) (10974 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
        str = "";
        int i162 = -TextUtils.indexOf((CharSequence) str, '0');
        Object[] objArr24 = new Object[1];
        charlie(c15, (i162 & 202) + (i162 | 202), 18 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), objArr24);
        String str14 = (String) objArr24[0];
        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
        int i163 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
        Object[] objArr25 = new Object[1];
        charlie(fadingEdgeLength, (i163 & 223) + (i163 | 223), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr25);
        String str15 = (String) objArr25[0];
        Object[] objArr26 = new Object[i4];
        objArr26[1] = str15;
        objArr26[0] = str14;
        Object D887112 = uH18377.D8871(1214576837);
        if (D887112 == null) {
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
            int rgb = Color.rgb(0, 0, 0) + 16780530;
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            byte b19 = (byte) 0;
            byte b20 = b19;
            Object[] objArr27 = new Object[1];
            delta(b19, b20, b20, objArr27);
            D887112 = uH18377.setPivotYN16904(maximumFlingVelocity, rgb, packedPositionChild, -1746970096, false, (String) objArr27[0], new Class[]{cls, cls});
        }
        long longValue5 = ((Long) ((Method) D887112).invoke(null, objArr26)).longValue();
        long j31 = 332242587;
        long j32 = -519;
        long j33 = 520;
        long j34 = j31 ^ j22;
        long j35 = longValue5 ^ j22;
        long freeMemory3 = (int) Runtime.getRuntime().freeMemory();
        long j36 = freeMemory3 ^ j22;
        long j37 = (((((j34 | j35) | j36) ^ j22) | ((longValue5 | freeMemory3) ^ j22)) * j33) + (521 * longValue5) + (j32 * j31);
        long j38 = (j31 | freeMemory3) ^ j22;
        long j39 = ((j33 * (j38 | (((j34 | j36) ^ j22) | ((j35 | j31) ^ j22)))) + (((-1040) * (((j35 | j36) ^ j22) | j38)) + j37)) - 1879880925;
        int i164 = ~((int) SystemClock.elapsedRealtime());
        int foxtrot7 = ((int) (j39 >> c3)) & A0.z.foxtrot((~(1642414942 | i164)) | (-1777690623) | (~(1215325942 | i164)), 184, (((~(i164 | (-562364681))) | (~((-135275681) | i164))) * (-184)) - 1019427974, -1160752776);
        int myPid = Process.myPid();
        int i165 = ~myPid;
        int i166 = ((int) j39) & (((~(i165 | 1683524504)) * 184) + ((myPid | 67633544) * (-184)) + (((~(246298094 | i165)) | (-1862189055)) * 184) + 1462813533);
        int i167 = (foxtrot7 & i166) | (foxtrot7 ^ i166);
        int i168 = -i167;
        int i169 = ((i167 & i168) | (i167 ^ i168)) >> 31;
        int i170 = (~i169) & intValue;
        int i171 = i169 & ((intValue & (-263)) | (i88 & 262));
        int i172 = (i171 & i170) | (i170 ^ i171);
        int i173 = (~(intValue & i161)) & (intValue | i161);
        int i174 = -i173;
        int i175 = ((i173 & i174) | (i173 ^ i174)) >> 31;
        int i176 = i172 & (~i175);
        int i177 = i175 & i161;
        int i178 = (i176 & i177) | (i176 ^ i177);
        Object[] objArr28 = new Object[1];
        charlie((char) ((ViewConfiguration.getTouchSlop() >> 8) + 21425), View.MeasureSpec.getSize(0) + 229, 29 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0, 0))), objArr28);
        String str16 = (String) objArr28[0];
        char lastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0));
        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
        int alpha3 = bh.alpha();
        int i179 = packedPositionGroup2 * 714;
        int i180 = ((i179 | (-185120)) << 1) - (i179 ^ (-185120));
        int i181 = ~packedPositionGroup2;
        int i182 = ~alpha3;
        int i183 = ~((i181 ^ i182) | (i181 & i182));
        int i184 = ~((i181 ^ 260) | (i181 & 260));
        int i185 = (i180 - (~((((i184 & i183) | (i183 ^ i184)) | (~(((-261) | packedPositionGroup2) | alpha3))) * (-713)))) - 1;
        int i186 = ((-261) ^ packedPositionGroup2) | ((-261) & packedPositionGroup2);
        int i187 = (((i185 - (~((~((i186 & alpha3) | (i186 ^ alpha3))) * 1426))) - 1) - (~(-(-((~(((-261) & i182) | ((-261) ^ i182))) * 713))))) - 1;
        int indexOf2 = TextUtils.indexOf(str, str, 0, 0);
        int alpha4 = bh.alpha();
        int i188 = indexOf2 * (-375);
        int i189 = (i188 & (-8625)) + (i188 | (-8625));
        int i190 = ~indexOf2;
        int i191 = ~(i190 | (-24));
        int i192 = (i191 & alpha4) | (alpha4 ^ i191);
        int i193 = ~((indexOf2 ^ 23) | (indexOf2 & 23));
        int i194 = (((i192 ^ i193) | (i192 & i193)) * 376) + i189;
        int i195 = ~alpha4;
        int i196 = ~((i195 ^ indexOf2) | (indexOf2 & i195));
        int i197 = ((i196 & i193) | (i196 ^ i193)) * (-376);
        int i198 = (((i194 & i197) + (i197 | i194)) - (~(((~(i190 | alpha4)) | 23) * 376))) - 1;
        Object[] objArr29 = new Object[1];
        charlie(lastIndexOf2, i187, i198, objArr29);
        String str17 = (String) objArr29[0];
        int i199 = -Color.rgb(0, 0, 0);
        char c16 = (char) ((i199 ^ ShapeBuilder.DEFAULT_SHAPE_COLOR) + ((i199 & ShapeBuilder.DEFAULT_SHAPE_COLOR) << 1));
        int i200 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
        int i201 = (i200 & 283) + (i200 | 283);
        int threadPriority3 = (Process.getThreadPriority(0) + 20) >> 6;
        int i202 = (threadPriority3 & 28) + (threadPriority3 | 28);
        Object[] objArr30 = new Object[1];
        charlie(c16, i201, i202, objArr30);
        String str18 = (String) objArr30[0];
        char axisFromString2 = (char) ((-1) - MotionEvent.axisFromString(str));
        int i203 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        int i204 = 1;
        Object[] objArr31 = new Object[1];
        charlie(axisFromString2, (i203 ^ 311) + ((i203 & 311) << 1), 13 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), objArr31);
        String[] strArr17 = {str16, str17, str18, (String) objArr31[0]};
        int i205 = 0;
        while (true) {
            if (i205 >= 4) {
                i16 = intValue;
                break;
            }
            int i206 = echo;
            foxtrot = (((i206 | 103) << i204) - (i206 ^ 103)) % 128;
            Object[] objArr32 = new Object[i204];
            objArr32[0] = strArr17[i205];
            Object D887113 = uH18377.D8871(1565484532);
            if (D887113 == null) {
                int axisFromString3 = MotionEvent.axisFromString(str) + 53;
                int touchSlop = 2951 - (ViewConfiguration.getTouchSlop() >> 8);
                char indexOf3 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
                byte b21 = (byte) 0;
                byte b22 = b21;
                strArr14 = strArr17;
                Object[] objArr33 = new Object[1];
                delta(b21, b22, b22, objArr33);
                D887113 = uH18377.setPivotYN16904(axisFromString3, touchSlop, indexOf3, -2097887455, false, (String) objArr33[0], new Class[]{cls});
            } else {
                strArr14 = strArr17;
            }
            long longValue6 = ((Long) ((Method) D887113).invoke(null, objArr32)).longValue();
            long j40 = 175122356;
            long j41 = (131 * longValue6) + ((-129) * j40);
            long j42 = 130;
            long j43 = longValue6 ^ j22;
            long tango2 = ao.ad.tango(1759298308);
            long j44 = ((((j43 | (tango2 ^ j22)) | j40) ^ j22) * j42) + j41;
            long j45 = j43 | j40;
            long j46 = (j42 * ((((j40 ^ j22) | longValue6) ^ j22) | ((j45 | tango2) ^ j22))) + ((-260) * (j45 ^ j22)) + j44 + 780031546;
            int myUid2 = Process.myUid();
            int i207 = ((((~(254403062 | myUid2)) | (-1878915064)) | (~(1691629473 | myUid2))) * (-754)) - 1287457798;
            int i208 = ~(1878915063 | myUid2);
            int i209 = ~myUid2;
            int i210 = ((int) (j46 >> c3)) & (((i209 | 254403062) * 754) + ((i208 | (~((-187285591) | i209))) * (-754)) + i207);
            int i211 = (int) j46;
            int romeo2 = ao.ad.romeo();
            if ((i210 | (i211 & (((romeo2 | 2128208216) * 496) + (((~((-729532670) | romeo2)) | 710525016 | (~((~romeo2) | 2147215869))) * (-496)) + ((r6 * 992) - 1537497691)))) != 0) {
                int i212 = i205 + 252;
                i16 = ((~i212) & intValue) | (i212 & i88);
                break;
            }
            i205++;
            strArr17 = strArr14;
            i204 = 1;
        }
        int i213 = (~(intValue & i178)) & (intValue | i178);
        int i214 = (i213 | (-i213)) >> 31;
        int i215 = (i16 & (~i214)) | (i178 & i214);
        Object[] objArr34 = new Object[1];
        charlie((char) Color.alpha(0), 325 - View.combineMeasuredStates(0, 0), 13 - (~TextUtils.lastIndexOf(str, '0', 0)), objArr34);
        Object[] objArr35 = {(String) objArr34[0]};
        Object D887114 = uH18377.D8871(i14);
        if (D887114 == null) {
            int longPressTimeout = 52 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int tapTimeout = 3158 - (ViewConfiguration.getTapTimeout() >> 16);
            char c17 = (char) (58075 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            byte b23 = (byte) 0;
            byte b24 = b23;
            Object[] objArr36 = new Object[1];
            delta(b23, b24, (byte) (b24 + 1), objArr36);
            D887114 = uH18377.setPivotYN16904(longPressTimeout, tapTimeout, c17, 424179844, false, (String) objArr36[0], new Class[]{cls});
        }
        String str19 = (String) ((Method) D887114).invoke(null, objArr35);
        if (str19 != null) {
            echo = (foxtrot + 105) % 128;
            char mirror = (char) (12330 - AndroidCharacter.getMirror('0'));
            int i216 = -Color.green(0);
            Object[] objArr37 = new Object[1];
            charlie(mirror, (i216 ^ 338) + ((i216 & 338) << 1), 8 - (~(-Color.blue(0))), objArr37);
            if (str19.contains((String) objArr37[0])) {
                i17 = (~(intValue & 250)) & (intValue | 250);
                int i217 = (~(intValue & i215)) & (intValue | i215);
                int i218 = -i217;
                int i219 = ((i217 & i218) | (i217 ^ i218)) >> 31;
                int i220 = (i215 & i219) | (i17 & (~i219));
                int i221 = -View.getDefaultSize(0, 0);
                int i222 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i223 = ((i222 | 347) << 1) - (i222 ^ 347);
                int trimmedLength = TextUtils.getTrimmedLength(str);
                int i224 = ((trimmedLength | 17) << 1) - (trimmedLength ^ 17);
                Object[] objArr38 = new Object[1];
                charlie((char) (((i221 | 25893) << 1) - (i221 ^ 25893)), i223, i224, objArr38);
                String str20 = (String) objArr38[0];
                Object[] objArr39 = new Object[1];
                charlie((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 363 - (~(Process.myPid() >> 22)), 6 - TextUtils.getTrimmedLength(str), objArr39);
                String str21 = (String) objArr39[0];
                file = new File(str20);
                if (file.exists()) {
                    int i225 = echo + 61;
                    foxtrot = i225 % 128;
                    if (i225 % 2 == 0) {
                        file.isFile();
                        throw null;
                    }
                    if (file.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file));
                            char c18 = (char) (48122 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                            int i226 = -Drawable.resolveOpacity(0, 0);
                            Object[] objArr40 = new Object[1];
                            charlie(c18, (i226 & 370) + (i226 | 370), 1 - (~(-(-TextUtils.getOffsetBefore(str, 0)))), objArr40);
                            Scanner useDelimiter = scanner.useDelimiter((String) objArr40[0]);
                            next3 = useDelimiter.hasNext() ? useDelimiter.next() : str;
                            useDelimiter.close();
                        } catch (IOException unused) {
                        }
                        if (next3.contains(str21)) {
                            i18 = intValue ^ 251;
                            int i227 = ((~i220) & intValue) | (i220 & i88);
                            int i228 = -i227;
                            int i229 = ((i227 & i228) | (i227 ^ i228)) >> 31;
                            int i230 = i18 & (~i229);
                            int i231 = i220 & i229;
                            int i232 = (i231 & i230) | (i230 ^ i231);
                            int i233 = -ExpandableListView.getPackedPositionGroup(0L);
                            int i234 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i235 = i234 * 569;
                            int i236 = ((i235 | 211668) << 1) - (i235 ^ 211668);
                            int i237 = ~i234;
                            int i238 = (i237 ^ (-373)) | (i237 & (-373));
                            int i239 = ~i238;
                            int i240 = ~(i237 | i88);
                            int i241 = (i239 ^ i240) | (i240 & i239);
                            int i242 = ~(((-373) ^ i88) | ((-373) & i88));
                            int i243 = -(-(((i241 ^ i242) | (i241 & i242)) * (-1136)));
                            int i244 = (i236 & i243) + (i243 | i236);
                            int i245 = ~((i237 ^ intValue) | (i237 & intValue));
                            int i246 = ~(((-373) & intValue) | ((-373) ^ intValue));
                            int i247 = (i245 & i246) | (i245 ^ i246);
                            int i248 = (i234 & i88) | (i88 ^ i234);
                            int i249 = ~((i248 ^ 372) | (i248 & 372));
                            int i250 = -(-(((i247 & i249) | (i247 ^ i249)) * (-568)));
                            int i251 = (i244 ^ i250) + ((i250 & i244) << 1);
                            int i252 = ~i248;
                            int i253 = ~((i88 ^ 372) | (i88 & 372));
                            int i254 = (i252 & i253) | (i252 ^ i253);
                            int i255 = ~((i238 ^ intValue) | (i238 & intValue));
                            int i256 = -(-(((i254 & i255) | (i254 ^ i255)) * Smooth$Close.expectedVersionCode));
                            Object[] objArr41 = new Object[1];
                            charlie((char) ((i233 & 43312) + (i233 | 43312)), (i251 & i256) + (i256 | i251), 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr41);
                            Object[] objArr42 = {(String) objArr41[0]};
                            D8871 = uH18377.D8871(i14);
                            if (D8871 == null) {
                                int packedPositionChild2 = 51 - ExpandableListView.getPackedPositionChild(0L);
                                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3158;
                                char indexOf4 = (char) (58073 - TextUtils.indexOf((CharSequence) str, '0'));
                                byte b25 = (byte) 0;
                                byte b26 = b25;
                                Object[] objArr43 = new Object[1];
                                delta(b25, b26, (byte) (b26 + 1), objArr43);
                                D8871 = uH18377.setPivotYN16904(packedPositionChild2, fadingEdgeLength2, indexOf4, 424179844, false, (String) objArr43[0], new Class[]{cls});
                            }
                            String lowerCase = ((String) ((Method) D8871).invoke(null, objArr42)).toLowerCase();
                            char makeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int packedPositionGroup3 = 395 - ExpandableListView.getPackedPositionGroup(0L);
                            int deadChar = KeyEvent.getDeadChar(0, 0);
                            int i257 = (deadChar & 4) + (deadChar | 4);
                            Object[] objArr44 = new Object[1];
                            charlie(makeMeasureSpec, packedPositionGroup3, i257, objArr44);
                            int i258 = lowerCase.contains((String) objArr44[0]) ? intValue ^ 264 : intValue;
                            int i259 = (~(intValue & i232)) & (intValue | i232);
                            int i260 = -i259;
                            int i261 = ((i259 & i260) | (i259 ^ i260)) >> 31;
                            int i262 = i258 & (~i261);
                            int i263 = i232 & i261;
                            int i264 = (i263 & i262) | (i262 ^ i263);
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i265 = -((byte) KeyEvent.getModifierMetaStateMask());
                            int i266 = (i265 ^ 398) + ((i265 & 398) << 1);
                            int i267 = -ExpandableListView.getPackedPositionType(0L);
                            int i268 = (i267 & 42) + (i267 | 42);
                            Object[] objArr45 = new Object[1];
                            charlie(keyRepeatDelay, i266, i268, objArr45);
                            String str22 = (String) objArr45[0];
                            int i269 = -AndroidCharacter.getMirror('0');
                            int i270 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i271 = ((i270 | 440) << 1) - (i270 ^ 440);
                            int i272 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i273 = (i272 & 40) + (i272 | 40);
                            Object[] objArr46 = new Object[1];
                            charlie((char) ((i269 & 62427) + (i269 | 62427)), i271, i273, objArr46);
                            String str23 = (String) objArr46[0];
                            int i274 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int deadChar2 = 481 - KeyEvent.getDeadChar(0, 0);
                            int i275 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i276 = (i275 ^ 27) + ((i275 & 27) << 1);
                            Object[] objArr47 = new Object[1];
                            charlie((char) ((i274 ^ (-1)) + (i274 << 1)), deadChar2, i276, objArr47);
                            String str24 = (String) objArr47[0];
                            char c19 = (char) (40819 - (~TextUtils.indexOf((CharSequence) str, '0')));
                            int i277 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            Object[] objArr48 = new Object[1];
                            charlie(c19, (i277 & 508) + (i277 | 508), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, objArr48);
                            String str25 = (String) objArr48[0];
                            char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int i278 = -(-MotionEvent.axisFromString(str));
                            Object[] objArr49 = new Object[1];
                            charlie(packedPositionChild3, (i278 & 536) + (i278 | 536), 27 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr49);
                            String str26 = (String) objArr49[0];
                            int offsetAfter3 = TextUtils.getOffsetAfter(str, 0);
                            int i279 = (offsetAfter3 * (-1975)) + 27236071;
                            int i280 = ~offsetAfter3;
                            int i281 = ~(i280 | 27539);
                            int i282 = ((i281 & intValue) | (intValue ^ i281)) * 988;
                            int i283 = ((i279 | i282) << 1) - (i279 ^ i282);
                            int i284 = ~(((-27540) ^ offsetAfter3) | ((-27540) & offsetAfter3));
                            int i285 = ~((offsetAfter3 & i88) | (i88 ^ offsetAfter3));
                            int i286 = -(-(((i285 & i284) | (i284 ^ i285)) * (-1976)));
                            int i287 = (i283 ^ i286) + ((i286 & i283) << 1);
                            int i288 = ~((i280 ^ 27539) | (i280 & 27539));
                            int i289 = ~(((-27540) & intValue) | ((-27540) ^ intValue));
                            int i290 = (i288 & i289) | (i288 ^ i289);
                            int i291 = ~((i88 ^ 27539) | (i88 & 27539));
                            int i292 = ((i290 & i291) | (i290 ^ i291)) * 988;
                            i19 = 1;
                            char c20 = (char) (((i287 | i292) << 1) - (i292 ^ i287));
                            int lastIndexOf3 = TextUtils.lastIndexOf(str, '0');
                            c4 = 0;
                            Object[] objArr50 = new Object[1];
                            charlie(c20, ((lastIndexOf3 | 563) << 1) - (lastIndexOf3 ^ 563), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr50);
                            strArr = new String[]{str22, str23, str24, str25, str26, (String) objArr50[0]};
                            i20 = 0;
                            i21 = 6;
                            while (true) {
                                if (i20 >= i21) {
                                    i22 = intValue;
                                    break;
                                }
                                Object[] objArr51 = new Object[i19];
                                objArr51[c4] = strArr[i20];
                                Object D887115 = uH18377.D8871(i14);
                                if (D887115 == null) {
                                    int i293 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i294 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3157;
                                    char indexOf5 = (char) (58073 - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                    byte b27 = (byte) 0;
                                    byte b28 = b27;
                                    strArr13 = strArr;
                                    i56 = i20;
                                    Object[] objArr52 = new Object[1];
                                    delta(b27, b28, (byte) (b28 + 1), objArr52);
                                    D887115 = uH18377.setPivotYN16904(i293, i294, indexOf5, 424179844, false, (String) objArr52[0], new Class[]{cls});
                                } else {
                                    strArr13 = strArr;
                                    i56 = i20;
                                }
                                String str27 = (String) ((Method) D887115).invoke(null, objArr51);
                                if (str27 != null && !str27.isEmpty()) {
                                    int i295 = echo;
                                    foxtrot = ((i295 & 59) + (i295 | 59)) % 128;
                                    i22 = (intValue & (-266)) | (i88 & 265);
                                    break;
                                }
                                int i296 = (i56 ^ 19) + ((i56 & 19) << 1);
                                i20 = (i296 & (-18)) + (i296 | (-18));
                                strArr = strArr13;
                                i21 = 6;
                                c4 = 0;
                                i19 = 1;
                            }
                            int i297 = ((~i264) & intValue) | (i264 & i88);
                            int i298 = -i297;
                            int i299 = ((i297 & i298) | (i297 ^ i298)) >> 31;
                            int i300 = i22 & (~i299);
                            int i301 = i264 & i299;
                            int i302 = (i301 & i300) | (i300 ^ i301);
                            int i303 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            int i304 = -View.combineMeasuredStates(0, 0);
                            Object[] objArr53 = new Object[1];
                            charlie((char) ((i303 & 25893) + (i303 | 25893)), (i304 & 347) + (i304 | 347), 15 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr53);
                            String str28 = (String) objArr53[0];
                            char trimmedLength2 = (char) TextUtils.getTrimmedLength(str);
                            int i305 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i306 = (i305 ^ 588) + ((i305 & 588) << 1);
                            int i307 = -(-Drawable.resolveOpacity(0, 0));
                            int i308 = ((i307 | 6) << 1) - (i307 ^ 6);
                            Object[] objArr54 = new Object[1];
                            charlie(trimmedLength2, i306, i308, objArr54);
                            String str29 = (String) objArr54[0];
                            file2 = new File(str28);
                            if (file2.exists()) {
                                int i309 = echo;
                                foxtrot = ((i309 ^ 125) + ((i309 & 125) << 1)) % 128;
                                if (file2.isFile()) {
                                    try {
                                        Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                        int i310 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        int i311 = -Color.alpha(0);
                                        Object[] objArr55 = new Object[1];
                                        charlie((char) (((i310 | 48123) << 1) - (i310 ^ 48123)), (i311 & 370) + (i311 | 370), (ViewConfiguration.getTapTimeout() >> 16) + 2, objArr55);
                                        Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr55[0]);
                                        next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str;
                                        useDelimiter2.close();
                                    } catch (IOException unused2) {
                                    }
                                    if (next2.contains(str29)) {
                                        int i312 = echo;
                                        int i313 = ((i312 | 15) << 1) - (i312 ^ 15);
                                        foxtrot = i313 % 128;
                                        if (i313 % 2 == 0) {
                                            i54 = ~(intValue & 17258);
                                            i55 = intValue | 17258;
                                        } else {
                                            i54 = ~(intValue & 260);
                                            i55 = intValue | 260;
                                        }
                                        i24 = i54 & i55;
                                        i23 = i302;
                                        int i314 = (~(intValue & i23)) & (intValue | i23);
                                        int i315 = -i314;
                                        int i316 = ((i314 & i315) | (i314 ^ i315)) >> 31;
                                        i27 = (i316 & i23) | (i24 & (~i316));
                                        if ((intValue2 & 8) != 0) {
                                            char c21 = (char) (27562 - (~TextUtils.indexOf((CharSequence) str, '0')));
                                            int i317 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            Object[] objArr56 = new Object[1];
                                            charlie(c21, ((i317 | 617) << 1) - (i317 ^ 617), Color.alpha(0) + 43, objArr56);
                                            String str30 = (String) objArr56[0];
                                            char c22 = (char) ((-2) - ((-TextUtils.lastIndexOf(str, '0', 0)) ^ (-1)));
                                            int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                            Object[] objArr57 = new Object[1];
                                            charlie(c22, (combineMeasuredStates2 & 660) + (combineMeasuredStates2 | 660), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40, objArr57);
                                            int i318 = 0;
                                            String str31 = (String) objArr57[0];
                                            char c23 = (char) (58448 - (~View.getDefaultSize(0, 0)));
                                            int scrollBarSize = 701 - (ViewConfiguration.getScrollBarSize() >> 8);
                                            int i319 = -View.MeasureSpec.getSize(0);
                                            int i320 = (i319 & 38) + (i319 | 38);
                                            int i321 = 1;
                                            Object[] objArr58 = new Object[1];
                                            charlie(c23, scrollBarSize, i320, objArr58);
                                            String[] strArr18 = {str30, str31, (String) objArr58[0]};
                                            int i322 = 0;
                                            while (true) {
                                                if (i322 >= 3) {
                                                    i52 = i27;
                                                    i53 = intValue;
                                                    break;
                                                }
                                                Object[] objArr59 = new Object[i321];
                                                objArr59[i318] = strArr18[i322];
                                                Object D887116 = uH18377.D8871(1979478258);
                                                if (D887116 == null) {
                                                    int size = View.MeasureSpec.getSize(i318) + 52;
                                                    int capsMode = TextUtils.getCapsMode(str, i318, i318) + 2951;
                                                    char size2 = (char) View.MeasureSpec.getSize(i318);
                                                    byte b29 = (byte) (i5 & 10);
                                                    byte b30 = (byte) (b29 - 2);
                                                    i52 = i27;
                                                    strArr12 = strArr18;
                                                    Object[] objArr60 = new Object[1];
                                                    delta(b29, b30, (byte) (b30 + 1), objArr60);
                                                    D887116 = uH18377.setPivotYN16904(size, capsMode, size2, -1438133721, false, (String) objArr60[0], new Class[]{cls});
                                                } else {
                                                    i52 = i27;
                                                    strArr12 = strArr18;
                                                }
                                                long longValue7 = ((Long) ((Method) D887116).invoke(null, objArr59)).longValue();
                                                long j47 = -1242668401;
                                                long j48 = 85;
                                                long j49 = (j48 * longValue7) + (j48 * j47);
                                                long j50 = -84;
                                                long j51 = j47 ^ j22;
                                                long j52 = longValue7 ^ j22;
                                                long romeo3 = ao.ad.romeo();
                                                long j53 = romeo3 ^ j22;
                                                long j54 = j47 | longValue7;
                                                long j55 = (j53 | longValue7) ^ j22;
                                                long j56 = (84 * (j55 | (j54 ^ j22))) + ((((j52 | romeo3) ^ j22) | j47 | j55) * j50) + ((((j51 | j52) ^ j22) | ((j51 | j53) ^ j22) | ((j52 | j53) ^ j22) | ((j54 | romeo3) ^ j22)) * j50) + j49 + 2017489707;
                                                int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                int i323 = ((int) (j56 >> c3)) & ((((~((-1417163509) | freeMemory4)) | (~((~freeMemory4) | 20062902))) * 979) + ((20062902 | freeMemory4) * (-979)) + (((~((-1417163509) | r5)) * 979) - 524666736));
                                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                int i324 = ~elapsedCpuTime;
                                                int i325 = ((int) j56) & ((((~(elapsedCpuTime | 1246874992)) | (~(i324 | (-1073825089)))) * 765) + (((~(1246874992 | i324)) | (-1264176506)) * 1530) + (((((~(1264176505 | i324)) | (~((-17301514) | elapsedCpuTime))) | (~((-1073825089) | elapsedCpuTime))) * 765) - 1094019839));
                                                if (((i323 & i325) | (i323 ^ i325)) != 0) {
                                                    i53 = (((i322 | 280) << 1) - (i322 ^ 280)) ^ intValue;
                                                    break;
                                                }
                                                i322 = ((i322 | 1) << 1) - (i322 ^ 1);
                                                i27 = i52;
                                                strArr18 = strArr12;
                                                i318 = 0;
                                                i321 = 1;
                                            }
                                            int i326 = (~(intValue & i52)) & (intValue | i52);
                                            int i327 = -i326;
                                            int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
                                            i27 = (i53 & (~i328)) | (i52 & i328);
                                        }
                                        int capsMode2 = TextUtils.getCapsMode(str, 0, 0);
                                        int combineMeasuredStates3 = View.combineMeasuredStates(0, 0);
                                        Object[] objArr61 = new Object[1];
                                        charlie((char) ((capsMode2 ^ 57870) + ((capsMode2 & 57870) << 1)), (combineMeasuredStates3 & 739) + (combineMeasuredStates3 | 739), 40 - TextUtils.lastIndexOf(str, '0', 0), objArr61);
                                        String str32 = (String) objArr61[0];
                                        c10 = 0;
                                        i28 = 1;
                                        Object[] objArr62 = new Object[1];
                                        charlie((char) (58158 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 780, 29 - (~(-TextUtils.getOffsetAfter(str, 0))), objArr62);
                                        strArr2 = new String[]{str32, (String) objArr62[0]};
                                        i29 = 0;
                                        while (true) {
                                            if (i29 < 2) {
                                                i30 = i27;
                                                i31 = intValue;
                                                break;
                                            }
                                            Object[] objArr63 = new Object[i28];
                                            objArr63[c10] = strArr2[i29];
                                            Object D887117 = uH18377.D8871(-2104138125);
                                            if (D887117 == null) {
                                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 52;
                                                int keyRepeatTimeout = 2951 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                byte b31 = (byte) (i5 & 1);
                                                byte b32 = (byte) (b31 - 1);
                                                i30 = i27;
                                                strArr11 = strArr2;
                                                Object[] objArr64 = new Object[1];
                                                delta(b31, b32, (byte) (b32 + 1), objArr64);
                                                D887117 = uH18377.setPivotYN16904(maxKeyCode, keyRepeatTimeout, doubleTapTimeout3, 1563346086, false, (String) objArr64[0], new Class[]{cls});
                                            } else {
                                                i30 = i27;
                                                strArr11 = strArr2;
                                            }
                                            long longValue8 = ((Long) ((Method) D887117).invoke(null, objArr63)).longValue();
                                            long j57 = -473764434;
                                            long j58 = longValue8 ^ j22;
                                            long j59 = ((-988) * (j57 | j58)) + ((-493) * longValue8) + (495 * j57);
                                            long j60 = 494;
                                            long j61 = j57 ^ j22;
                                            long j62 = longValue8 | j61;
                                            long myPid2 = Process.myPid() ^ j22;
                                            long j63 = ((((((myPid2 | longValue8) ^ j22) | ((j61 | j58) ^ j22)) | ((j57 | longValue8) ^ j22)) * j60) + (((j62 | myPid2) * j60) + j59)) - 755856096;
                                            int myTid = Process.myTid();
                                            int i329 = ((int) (j63 >> c3)) & ((((~(myTid | 2147479221)) | 338265088) * 130) + ((~((~myTid) | 2147479221)) * 130) + 411862550);
                                            int tango3 = ao.ad.tango(1159207802);
                                            if (((((int) j63) & (((tango3 | (-1772821043)) * 744) + (((~tango3) | 335594632) * 744) + (((((~(374400392 | tango3)) | 1772821042) | (~((-1811626803) | tango3))) * (-744)) - 1587633331))) | i329) != 0) {
                                                int i330 = ~((1586208198 & intValue) | (1586208198 ^ intValue));
                                                int i331 = (i330 & (-2144337919)) | ((-2144337919) ^ i330);
                                                int i332 = (-1774546747) | i88;
                                                int i333 = (((~((i332 & (-1586208199)) | (i332 ^ (-1586208199)))) | (~(((-558129721) & intValue) | ((-558129721) ^ intValue)))) * 470) + ((((i331 & r1) | (i331 ^ r1)) * (-470)) - 1882262316);
                                                int alpha5 = bh.alpha();
                                                int i334 = ~alpha5;
                                                int i335 = ((~(((-591902456) & i334) | ((-591902456) ^ i334))) * 979) - 117237146;
                                                int i336 = -(-(((-1442960675) | alpha5) * (-979)));
                                                int i337 = ((i335 | i336) << 1) - (i335 ^ i336);
                                                int i338 = ~(alpha5 | (-591902456));
                                                int i339 = ~((i334 & (-1442960675)) | (i334 ^ (-1442960675)));
                                                int i340 = ((i338 & i339) | (i338 ^ i339)) * 979;
                                                if (i333 <= (i337 & i340) + (i340 | i337)) {
                                                    int i341 = i29 / 7316;
                                                    i31 = (~(intValue & i341)) & (intValue | i341);
                                                } else {
                                                    i31 = ((i29 & 288) + (i29 | 288)) ^ intValue;
                                                }
                                            } else {
                                                i29 = (i29 ^ 1) + ((i29 & 1) << 1);
                                                i27 = i30;
                                                strArr2 = strArr11;
                                                c10 = 0;
                                                i28 = 1;
                                            }
                                        }
                                        int i342 = (~(intValue & i30)) & (intValue | i30);
                                        int i343 = -i342;
                                        int i344 = ((i342 & i343) | (i342 ^ i343)) >> 31;
                                        int i345 = i31 & (~i344);
                                        int i346 = i30 & i344;
                                        int i347 = (i345 & i346) | (i345 ^ i346);
                                        D88713 = uH18377.D8871(-344556366);
                                        if (D88713 == null) {
                                            int resolveSize = 52 - View.resolveSize(0, 0);
                                            int i348 = 3107 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            char lastIndexOf4 = (char) (15990 - TextUtils.lastIndexOf(str, '0', 0));
                                            byte b33 = (byte) 0;
                                            byte b34 = b33;
                                            Object[] objArr65 = new Object[1];
                                            delta(b33, b34, b34, objArr65);
                                            D88713 = uH18377.setPivotYN16904(resolveSize, i348, lastIndexOf4, 885907047, false, (String) objArr65[0], new Class[0]);
                                        }
                                        long longValue9 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                                        long j64 = 861181372;
                                        long j65 = ((j64 ^ j22) | longValue9) ^ j22;
                                        long j66 = (int) Runtime.getRuntime().totalMemory();
                                        long j67 = j66 ^ j22;
                                        long j68 = ((-1188) * (j65 | ((j67 | longValue9) ^ j22))) + ((-1187) * longValue9) + (595 * j64);
                                        long j69 = 594;
                                        long j70 = longValue9 ^ j22;
                                        long j71 = j65 | ((j70 | j66) ^ j22);
                                        long j72 = (j67 | j64) ^ j22;
                                        long j73 = ((j69 * ((((j70 | j67) ^ j22) | ((j70 | j64) ^ j22)) | j72)) + (((j71 | j72) * j69) + j68)) - 1013434470;
                                        int myUid3 = Process.myUid();
                                        i32 = ((int) (j73 >> c3)) & ((((~(myUid3 | (-1145061457))) | 268699648) * 235) + (((~((-1156794110) | myUid3)) | 280432301) * (-470)) + (((~((~myUid3) | (-1156794110))) | 280432301) * (-235)) + 1360097671);
                                        int romeo4 = ao.ad.romeo();
                                        i33 = ((int) j73) & ((((~((~romeo4) | 521825997)) | 186264200) * 420) + ((~(521825997 | romeo4)) * 420) + 2059775277);
                                        int i349 = 1;
                                        if (((i32 & i33) | (i32 ^ i33)) == 1) {
                                            Object[] objArr66 = {1};
                                            Object D887118 = uH18377.D8871(-38624464);
                                            if (D887118 == null) {
                                                int rgb2 = (-16777164) - Color.rgb(0, 0, 0);
                                                int touchSlop2 = 2847 - (ViewConfiguration.getTouchSlop() >> 8);
                                                char absoluteGravity = (char) (62567 - Gravity.getAbsoluteGravity(0, 0));
                                                byte b35 = (byte) 0;
                                                byte b36 = b35;
                                                Object[] objArr67 = new Object[1];
                                                delta(b35, b36, b36, objArr67);
                                                D887118 = uH18377.setPivotYN16904(rgb2, touchSlop2, absoluteGravity, 571015653, false, (String) objArr67[0], new Class[]{Integer.TYPE});
                                            }
                                            long longValue10 = ((Long) ((Method) D887118).invoke(null, objArr66)).longValue();
                                            long j74 = 1673911820;
                                            long j75 = 319;
                                            long j76 = -317;
                                            long j77 = (j76 * longValue10) + (j75 * j74);
                                            long j78 = -318;
                                            long j79 = longValue10 ^ j22;
                                            long myUid4 = Process.myUid();
                                            long j80 = ((j79 | (((j74 ^ j22) | myUid4) ^ j22)) * j78) + j77;
                                            long j81 = 318;
                                            long j82 = myUid4 ^ j22;
                                            long j83 = (((((j79 | j82) | j74) ^ j22) | ((myUid4 | (j74 | longValue10)) ^ j22)) * j81) + ((((j79 | myUid4) ^ j22) | (((j82 | j74) | longValue10) ^ j22)) * j81) + j80 + 318214946;
                                            int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                            int i350 = (((-627746840) | uptimeMillis2) * (-50)) - 54791914;
                                            int i351 = ~((-1511282113) | uptimeMillis2);
                                            int i352 = ~uptimeMillis2;
                                            int i353 = ((int) (j83 >> c3)) & ((((~((-2064973251) | i352)) | 553691138 | (~(i352 | (-627746840)))) * 50) + (((~(i352 | (-553691139))) | i351) * 50) + i350);
                                            int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                            if ((i353 | (((int) j83) & (((elapsedRealtime4 | (-1403648938)) * 496) + (((~(33577472 | elapsedRealtime4)) | (-1403648938) | (~((~elapsedRealtime4) | (-33577473)))) * (-496)) + ((r6 * 992) - 1537497691)))) != 0) {
                                                int i354 = foxtrot + 21;
                                                echo = i354 % 128;
                                                if (i354 % 2 != 0) {
                                                    i50 = intValue & (-18423);
                                                    i51 = i88 & 18422;
                                                } else {
                                                    i50 = intValue & (-221);
                                                    i51 = i88 & 220;
                                                }
                                                i35 = i50 | i51;
                                            } else {
                                                i35 = intValue;
                                            }
                                            int i355 = ((~i347) & intValue) | (i347 & i88);
                                            int i356 = -i355;
                                            int i357 = ((i355 & i356) | (i355 ^ i356)) >> 31;
                                            int i358 = i35 & (~i357);
                                            int i359 = i347 & i357;
                                            int i360 = (i359 & i358) | (i358 ^ i359);
                                            char c24 = (char) (43311 - (~TextUtils.indexOf(str, str)));
                                            int keyCodeFromString2 = KeyEvent.keyCodeFromString(str);
                                            Object[] objArr68 = new Object[1];
                                            charlie(c24, ((keyCodeFromString2 | 372) << 1) - (keyCodeFromString2 ^ 372), TextUtils.getTrimmedLength(str) + 23, objArr68);
                                            Object[] objArr69 = {(String) objArr68[0]};
                                            Object D887119 = uH18377.D8871(i14);
                                            if (D887119 == null) {
                                                int i361 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51;
                                                int gidForName = Process.getGidForName(str) + 3159;
                                                char lastIndexOf5 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 58075);
                                                byte b37 = (byte) 0;
                                                byte b38 = b37;
                                                Object[] objArr70 = new Object[1];
                                                delta(b37, b38, (byte) (b38 + 1), objArr70);
                                                D887119 = uH18377.setPivotYN16904(i361, gidForName, lastIndexOf5, 424179844, false, (String) objArr70[0], new Class[]{cls});
                                            }
                                            Object invoke2 = ((Method) D887119).invoke(null, objArr69);
                                            if (invoke2 != null) {
                                                Object[] objArr71 = {invoke2, 42};
                                                Object D887120 = uH18377.D8871(2072770498);
                                                if (D887120 == null) {
                                                    int jumpTapTimeout = 51 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int touchSlop3 = 1209 - (ViewConfiguration.getTouchSlop() >> 8);
                                                    char c25 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44355);
                                                    byte b39 = (byte) 0;
                                                    byte b40 = b39;
                                                    Object[] objArr72 = new Object[1];
                                                    delta(b39, b40, b40, objArr72);
                                                    D887120 = uH18377.setPivotYN16904(jumpTapTimeout, touchSlop3, c25, -1540336361, false, (String) objArr72[0], new Class[]{cls, Integer.TYPE});
                                                }
                                                long longValue11 = ((Long) ((Method) D887120).invoke(null, objArr71)).longValue();
                                                long j84 = 1596056622;
                                                long j85 = -518;
                                                long j86 = (j85 * longValue11) + (j85 * j84);
                                                long j87 = 519;
                                                i36 = intValue;
                                                long freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                                long j88 = (j84 ^ j22) | (freeMemory5 ^ j22);
                                                long j89 = ((j87 * (((longValue11 | freeMemory5) ^ j22) | j84)) + ((j32 * (((j88 | longValue11) ^ j22) | (((j84 | longValue11) | freeMemory5) ^ j22))) + (((longValue11 | (j88 ^ j22)) * j87) + j86))) - 1603501652;
                                                int romeo5 = ao.ad.romeo();
                                                int foxtrot8 = ((int) (j89 >> c3)) & A0.z.foxtrot((~(romeo5 | (-17105169))) | 546325508, 446, (((~((~romeo5) | (-454003036))) | 436897867) * 446) + 384374654, 1582920362);
                                                int i362 = ((int) j89) & ((((~((~Process.myPid()) | 169920168)) | 1441520378) * 184) + (((1609293562 | r5) * 184) - 389003427));
                                                if (((foxtrot8 & i362) | (foxtrot8 ^ i362)) == 1986687685) {
                                                    int i363 = foxtrot;
                                                    int i364 = (i363 & 105) + (i363 | 105);
                                                    int i365 = i364 % 128;
                                                    echo = i365;
                                                    z2 = i364 % 2 == 0;
                                                    foxtrot = ((i365 & 51) + (i365 | 51)) % 128;
                                                    if (z2) {
                                                        int deadChar3 = KeyEvent.getDeadChar(0, 0);
                                                        int i366 = -View.MeasureSpec.getMode(0);
                                                        Object[] objArr73 = new Object[1];
                                                        charlie((char) ((43312 & deadChar3) + (deadChar3 | 43312)), (i366 ^ 372) + ((i366 & 372) << 1), 22 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr73);
                                                        String str33 = (String) objArr73[0];
                                                        char modifierMetaStateMask4 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                                        int myTid2 = (Process.myTid() >> 22) + 810;
                                                        int i367 = -TextUtils.indexOf((CharSequence) str, '0');
                                                        int i368 = (i367 ^ 9) + ((i367 & 9) << 1);
                                                        Object[] objArr74 = new Object[1];
                                                        charlie(modifierMetaStateMask4, myTid2, i368, objArr74);
                                                        String str34 = (String) objArr74[0];
                                                        char c26 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        int i369 = 818 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                                                        int i370 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                        int i371 = ((i370 | 7) << 1) - (i370 ^ 7);
                                                        Object[] objArr75 = new Object[1];
                                                        charlie(c26, i369, i371, objArr75);
                                                        String str35 = (String) objArr75[0];
                                                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        int i372 = 826 - (~(-(-KeyEvent.normalizeMetaState(0))));
                                                        int keyCodeFromString3 = KeyEvent.keyCodeFromString(str);
                                                        int i373 = ((keyCodeFromString3 | 8) << 1) - (keyCodeFromString3 ^ 8);
                                                        Object[] objArr76 = new Object[1];
                                                        charlie(keyRepeatDelay2, i372, i373, objArr76);
                                                        String[] strArr19 = {str33, str34, str35, (String) objArr76[0]};
                                                        int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                        int i374 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int i375 = (i374 & 835) + (i374 | 835);
                                                        int i376 = -(-TextUtils.indexOf(str, str));
                                                        int i377 = (i376 ^ 17) + ((i376 & 17) << 1);
                                                        Object[] objArr77 = new Object[1];
                                                        charlie((char) ((jumpTapTimeout2 & 11791) + (jumpTapTimeout2 | 11791)), i375, i377, objArr77);
                                                        String str36 = (String) objArr77[0];
                                                        char c27 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int i378 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int i379 = (i378 ^ 852) + ((i378 & 852) << 1);
                                                        int i380 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                        int i381 = (i380 & 7) + (i380 | 7);
                                                        Object[] objArr78 = new Object[1];
                                                        charlie(c27, i379, i381, objArr78);
                                                        String str37 = (String) objArr78[0];
                                                        char c28 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                                        int i382 = ((tapTimeout2 | 859) << 1) - (tapTimeout2 ^ 859);
                                                        int i383 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        int i384 = (i383 & 7) + (i383 | 7);
                                                        Object[] objArr79 = new Object[1];
                                                        charlie(c28, i382, i384, objArr79);
                                                        String str38 = (String) objArr79[0];
                                                        Object[] objArr80 = new Object[1];
                                                        charlie((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 864 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), 9 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr80);
                                                        String str39 = (String) objArr80[0];
                                                        Object[] objArr81 = new Object[1];
                                                        charlie((char) (33952 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), 877 - (~(-(-TextUtils.lastIndexOf(str, '0', 0, 0)))), View.resolveSize(0, 0) + 14, objArr81);
                                                        String[] strArr20 = {str36, str37, str38, str39, (String) objArr81[0]};
                                                        int i385 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int i386 = 890 - (~(-(-Color.red(0))));
                                                        int i387 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int i388 = (i387 ^ 15) + ((i387 & 15) << 1);
                                                        Object[] objArr82 = new Object[1];
                                                        charlie((char) ((i385 ^ 1) + ((i385 & 1) << 1)), i386, i388, objArr82);
                                                        String str40 = (String) objArr82[0];
                                                        Object[] objArr83 = new Object[1];
                                                        charlie((char) ((-2) - ((-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) ^ (-1))), 906 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), 2 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr83);
                                                        String str41 = (String) objArr83[0];
                                                        int i389 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        Object[] objArr84 = new Object[1];
                                                        charlie((char) (((45029 | i389) << 1) - (i389 ^ 45029)), 917 - (~(-(-TextUtils.getOffsetAfter(str, 0)))), 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr84);
                                                        String str42 = (String) objArr84[0];
                                                        int i390 = -(-TextUtils.getOffsetBefore(str, 0));
                                                        int i391 = -(-Color.alpha(0));
                                                        int i392 = (i391 & 940) + (i391 | 940);
                                                        int i393 = -Color.red(0);
                                                        int i394 = ((i393 | 25) << 1) - (i393 ^ 25);
                                                        Object[] objArr85 = new Object[1];
                                                        charlie((char) ((45666 ^ i390) + ((i390 & 45666) << 1)), i392, i394, objArr85);
                                                        String str43 = (String) objArr85[0];
                                                        char doubleTapTimeout4 = (char) (61343 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                        int gidForName2 = Process.getGidForName(str) + 966;
                                                        int i395 = -TextUtils.indexOf(str, str, 0, 0);
                                                        int i396 = i395 * 85;
                                                        int i397 = (i396 & 2380) + (i396 | 2380);
                                                        int i398 = ~i395;
                                                        int i399 = ~(i398 | (-29));
                                                        int i400 = ~((i398 & i88) | (i398 ^ i88));
                                                        int i401 = (i400 & i399) | (i399 ^ i400) | (~(((-29) ^ i88) | ((-29) & i88)));
                                                        int i402 = (i395 ^ 28) | (i395 & 28);
                                                        int i403 = ~((i402 & i36) | (i402 ^ i36));
                                                        int i404 = (((i401 & i403) | (i401 ^ i403)) * (-84)) + i397;
                                                        int i405 = ~(((-29) ^ i36) | ((-29) & i36));
                                                        int i406 = (i405 & i395) | (i395 ^ i405);
                                                        int i407 = ~(i88 | 28);
                                                        int i408 = ((i406 & i407) | (i406 ^ i407)) * (-84);
                                                        int i409 = ((i404 | i408) << 1) - (i404 ^ i408);
                                                        int i410 = ~(i395 | 28);
                                                        int i411 = -(-(((i410 & i407) | (i407 ^ i410)) * 84));
                                                        int i412 = ((i409 | i411) << 1) - (i411 ^ i409);
                                                        Object[] objArr86 = new Object[1];
                                                        charlie(doubleTapTimeout4, gidForName2, i412, objArr86);
                                                        String[] strArr21 = {str40, str41, str4, str42, str43, (String) objArr86[0]};
                                                        int i413 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                        int i414 = 991 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                        int i415 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                                        int i416 = (i415 ^ 11) + ((i415 & 11) << 1);
                                                        Object[] objArr87 = new Object[1];
                                                        charlie((char) ((i413 & 1) + (i413 | 1)), i414, i416, objArr87);
                                                        String str44 = (String) objArr87[0];
                                                        int i417 = -(-TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                                        int i418 = -(-Color.alpha(0));
                                                        int i419 = (i418 ^ 1004) + ((i418 & 1004) << 1);
                                                        int i420 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                        int i421 = (i420 & 8) + (i420 | 8);
                                                        Object[] objArr88 = new Object[1];
                                                        charlie((char) (((46014 | i417) << 1) - (i417 ^ 46014)), i419, i421, objArr88);
                                                        String str45 = (String) objArr88[0];
                                                        int blue = Color.blue(0);
                                                        Object[] objArr89 = new Object[1];
                                                        charlie((char) ((blue ^ 29120) + ((blue & 29120) << 1)), 1011 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr89);
                                                        String str46 = (String) objArr89[0];
                                                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                        int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 1019;
                                                        int i422 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        int i423 = (i422 ^ 6) + ((i422 & 6) << 1);
                                                        Object[] objArr90 = new Object[1];
                                                        charlie(longPressTimeout2, packedPositionChild4, i423, objArr90);
                                                        String[] strArr22 = {str44, str45, str46, (String) objArr90[0]};
                                                        char c29 = (char) (38060 - (~(-TextUtils.lastIndexOf(str, '0', 0, 0))));
                                                        int i424 = 1023 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                                        int i425 = -Color.rgb(0, 0, 0);
                                                        int alpha6 = bh.alpha();
                                                        int i426 = i425 * 71;
                                                        int i427 = (1157626800 ^ i426) + ((i426 & 1157626800) << 1);
                                                        int i428 = ~i425;
                                                        int i429 = ~((i428 & (-16777200)) | ((-16777200) ^ i428));
                                                        int i430 = ~(((-16777200) ^ alpha6) | (alpha6 & (-16777200)));
                                                        int i431 = (i427 - (~(((i429 ^ i430) | (i430 & i429)) * (-140)))) - 1;
                                                        int i432 = -(-((~(((-16777200) ^ i425) | (i425 & (-16777200)) | alpha6)) * 70));
                                                        int i433 = (i431 & i432) + (i431 | i432);
                                                        int i434 = ~((16777199 ^ i425) | (16777199 & i425));
                                                        int i435 = (i429 & i434) | (i429 ^ i434);
                                                        int i436 = ~((i425 & alpha6) | (i425 ^ alpha6));
                                                        Object[] objArr91 = new Object[1];
                                                        charlie(c29, i424, (((i436 & i435) | (i435 ^ i436)) * 70) + i433, objArr91);
                                                        String str47 = (String) objArr91[0];
                                                        char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i437 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 858;
                                                        int i438 = -(-Color.argb(0, 0, 0, 0));
                                                        int i439 = (i438 ^ 7) + ((i438 & 7) << 1);
                                                        Object[] objArr92 = new Object[1];
                                                        charlie(jumpTapTimeout3, i437, i439, objArr92);
                                                        String str48 = (String) objArr92[0];
                                                        Object[] objArr93 = new Object[1];
                                                        charlie((char) TextUtils.getCapsMode(str, 0, 0), 826 - (~(-TextUtils.indexOf(str, str))), 8 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr93);
                                                        String[] strArr23 = {str47, str48, (String) objArr93[0]};
                                                        char c30 = (char) (12121 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                        int i440 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1039;
                                                        int i441 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        int i442 = (i441 ^ 15) + ((i441 & 15) << 1);
                                                        Object[] objArr94 = new Object[1];
                                                        charlie(c30, i440, i442, objArr94);
                                                        String str49 = (String) objArr94[0];
                                                        char blue2 = (char) (19796 - Color.blue(0));
                                                        int i443 = -TextUtils.lastIndexOf(str, '0', 0, 0);
                                                        int i444 = i443 * (-919);
                                                        int i445 = (((-967707) | i444) << 1) - (i444 ^ (-967707));
                                                        int i446 = ~i443;
                                                        int i447 = (i446 & (-1054)) | (i446 ^ (-1054));
                                                        int i448 = (-1054) | i88;
                                                        int i449 = (((~((i448 ^ i443) | (i448 & i443))) | (~(i447 | i36))) * 920) + i445;
                                                        int i450 = ~i447;
                                                        int i451 = ~((i446 ^ i88) | (i446 & i88));
                                                        int i452 = ((i450 ^ i451) | (i450 & i451)) * 920;
                                                        int i453 = (i449 ^ i452) + ((i449 & i452) << 1);
                                                        int i454 = ~((i447 & i88) | (i447 ^ i88));
                                                        int i455 = (i446 ^ 1053) | (i446 & 1053);
                                                        int i456 = ~((i455 & i36) | (i455 ^ i36));
                                                        int i457 = (i454 & i456) | (i454 ^ i456);
                                                        int i458 = ((-1054) ^ i443) | (i443 & (-1054));
                                                        int i459 = ~((i458 & i36) | (i458 ^ i36));
                                                        int i460 = ((i457 & i459) | (i457 ^ i459)) * 920;
                                                        Object[] objArr95 = new Object[1];
                                                        charlie(blue2, (i453 & i460) + (i460 | i453), ExpandableListView.getPackedPositionGroup(0L) + 1, objArr95);
                                                        String[] strArr24 = {str49, (String) objArr95[0]};
                                                        char green = (char) Color.green(0);
                                                        int gidForName3 = Process.getGidForName(str);
                                                        int i461 = (gidForName3 ^ 1056) + ((gidForName3 & 1056) << 1);
                                                        int i462 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int i463 = (i462 & 10) + (i462 | 10);
                                                        Object[] objArr96 = new Object[1];
                                                        charlie(green, i461, i463, objArr96);
                                                        String str50 = (String) objArr96[0];
                                                        int i464 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                        Object[] objArr97 = new Object[1];
                                                        charlie((char) (((49679 | i464) << 1) - (i464 ^ 49679)), (Process.myTid() >> 22) + 1064, Color.green(0) + 1, objArr97);
                                                        String[] strArr25 = {str50, (String) objArr97[0]};
                                                        char c31 = (char) (58112 - (~(-(-(Process.myPid() >> 22)))));
                                                        int i465 = -AndroidCharacter.getMirror('0');
                                                        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                        int i466 = (resolveSizeAndState ^ 16) + ((resolveSizeAndState & 16) << 1);
                                                        Object[] objArr98 = new Object[1];
                                                        charlie(c31, (i465 ^ 1113) + ((i465 & 1113) << 1), i466, objArr98);
                                                        String str51 = (String) objArr98[0];
                                                        char combineMeasuredStates4 = (char) View.combineMeasuredStates(0, 0);
                                                        int i467 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                        int i468 = ((i467 | 906) << 1) - (i467 ^ 906);
                                                        int indexOf6 = TextUtils.indexOf((CharSequence) str, '0');
                                                        int i469 = ((indexOf6 | 4) << 1) - (indexOf6 ^ 4);
                                                        Object[] objArr99 = new Object[1];
                                                        charlie(combineMeasuredStates4, i468, i469, objArr99);
                                                        String str52 = (String) objArr99[0];
                                                        char c32 = (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str, '0', 0))));
                                                        int i470 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                        int mode = View.MeasureSpec.getMode(0);
                                                        int i471 = (mode & 7) + (mode | 7);
                                                        Object[] objArr100 = new Object[1];
                                                        charlie(c32, (i470 ^ 852) + ((i470 & 852) << 1), i471, objArr100);
                                                        String str53 = (String) objArr100[0];
                                                        int i472 = -View.resolveSize(0, 0);
                                                        Object[] objArr101 = new Object[1];
                                                        charlie((char) (AndroidCharacter.getMirror('0') - '0'), (i472 & 1081) + (i472 | 1081), 7 - (~KeyEvent.normalizeMetaState(0)), objArr101);
                                                        String str54 = (String) objArr101[0];
                                                        int i473 = -ExpandableListView.getPackedPositionChild(0L);
                                                        int alpha7 = bh.alpha();
                                                        int i474 = i473 * (-300);
                                                        int i475 = ((i474 | (-302)) << 1) - (i474 ^ (-302));
                                                        int i476 = (~(((-1) ^ alpha7) | alpha7)) * (-301);
                                                        int i477 = (i475 & i476) + (i476 | i475);
                                                        int i478 = ~alpha7;
                                                        int i479 = ~((i478 ^ i473) | (i478 & i473));
                                                        int i480 = ((i478 & i479) | (i478 ^ i479)) * (-301);
                                                        int i481 = ~i473;
                                                        char c33 = (char) ((((i477 & i480) + (i480 | i477)) - (~((~((i481 & alpha7) | (i481 ^ alpha7))) * 301))) - 1);
                                                        int doubleTapTimeout5 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                        int i482 = -Gravity.getAbsoluteGravity(0, 0);
                                                        int i483 = (i482 ^ 11) + ((i482 & 11) << 1);
                                                        Object[] objArr102 = new Object[1];
                                                        charlie(c33, (doubleTapTimeout5 ^ 866) + ((doubleTapTimeout5 & 866) << 1), i483, objArr102);
                                                        String str55 = (String) objArr102[0];
                                                        int i484 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                        int i485 = -(-View.MeasureSpec.getMode(0));
                                                        Object[] objArr103 = new Object[1];
                                                        charlie((char) ((33952 ^ i484) + ((i484 & 33952) << 1)), (i485 ^ 877) + ((i485 & 877) << 1), 14 - TextUtils.indexOf(str, str, 0), objArr103);
                                                        String[] strArr26 = {str51, str52, str53, str54, str55, (String) objArr103[0]};
                                                        char c34 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                        int i486 = -(-TextUtils.indexOf((CharSequence) str, '0'));
                                                        int i487 = (i486 & 1090) + (i486 | 1090);
                                                        int i488 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i489 = (i488 ^ 20) + ((i488 & 20) << 1);
                                                        Object[] objArr104 = new Object[1];
                                                        charlie(c34, i487, i489, objArr104);
                                                        String str56 = (String) objArr104[0];
                                                        Object[] objArr105 = new Object[1];
                                                        charlie((char) View.getDefaultSize(0, 0), 1108 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), 18 - (~(-(-View.combineMeasuredStates(0, 0)))), objArr105);
                                                        String str57 = (String) objArr105[0];
                                                        char alpha8 = (char) Color.alpha(0);
                                                        int i490 = -TextUtils.indexOf((CharSequence) str, '0', 0);
                                                        Object[] objArr106 = new Object[1];
                                                        charlie(alpha8, (i490 ^ 1127) + ((i490 & 1127) << 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr106);
                                                        String str58 = (String) objArr106[0];
                                                        int i491 = -View.getDefaultSize(0, 0);
                                                        int i492 = -ImageFormat.getBitsPerPixel(0);
                                                        Object[] objArr107 = new Object[1];
                                                        charlie((char) ((38150 & i491) + (i491 | 38150)), ((i492 | 1158) << 1) - (i492 ^ 1158), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr107);
                                                        String str59 = (String) objArr107[0];
                                                        Object[] objArr108 = new Object[1];
                                                        charlie((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1185 - TextUtils.indexOf(str, str, 0, 0), 23 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr108);
                                                        String str60 = (String) objArr108[0];
                                                        char indexOf7 = (char) (45775 - TextUtils.indexOf((CharSequence) str, '0'));
                                                        int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                                                        int alpha9 = bh.alpha();
                                                        int i493 = tapTimeout3 * (-496);
                                                        int i494 = ((-599168) & i493) + (i493 | (-599168));
                                                        int i495 = ~tapTimeout3;
                                                        int i496 = (i495 ^ (-1209)) | (i495 & (-1209));
                                                        int i497 = (~i496) * 497;
                                                        int i498 = (i494 ^ i497) + ((i497 & i494) << 1);
                                                        int i499 = ~((i496 & alpha9) | (i496 ^ alpha9));
                                                        int i500 = ~alpha9;
                                                        int i501 = (-1209) | i500;
                                                        int i502 = (i498 - (~(-(-((i499 | (~((i501 ^ tapTimeout3) | (i501 & tapTimeout3)))) * 497))))) - 1;
                                                        int i503 = ~((i495 ^ i500) | (i500 & i495));
                                                        int i504 = ~(i495 | 1208);
                                                        int i505 = (i503 & i504) | (i503 ^ i504);
                                                        int i506 = ((-1209) ^ tapTimeout3) | (tapTimeout3 & (-1209));
                                                        int i507 = ~((i506 & alpha9) | (i506 ^ alpha9));
                                                        Object[] objArr109 = new Object[1];
                                                        charlie(indexOf7, (((i505 & i507) | (i505 ^ i507)) * 497) + i502, TextUtils.getCapsMode(str, 0, 0) + 33, objArr109);
                                                        String[] strArr27 = {str56, str57, str58, str59, str60, (String) objArr109[0], str4};
                                                        char blue3 = (char) (Color.blue(0) + 27770);
                                                        int i508 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        int i509 = -(-TextUtils.getCapsMode(str, 0, 0));
                                                        Object[] objArr110 = new Object[1];
                                                        charlie(blue3, ((i508 | 1241) << 1) - (i508 ^ 1241), (i509 & 13) + (i509 | 13), objArr110);
                                                        String str61 = (String) objArr110[0];
                                                        char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                        int i510 = -KeyEvent.getDeadChar(0, 0);
                                                        Object[] objArr111 = new Object[1];
                                                        charlie(touchSlop4, ((i510 | 820) << 1) - (i510 ^ 820), View.MeasureSpec.makeMeasureSpec(0, 0) + 7, objArr111);
                                                        String[] strArr28 = {str61, (String) objArr111[0]};
                                                        int i511 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                        int threadPriority4 = Process.getThreadPriority(0);
                                                        int i512 = -(-(((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6));
                                                        int i513 = (i512 & 1254) + (i512 | 1254);
                                                        int i514 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int i515 = (i514 ^ 31) + ((i514 & 31) << 1);
                                                        Object[] objArr112 = new Object[1];
                                                        charlie((char) ((i511 & 601) + (i511 | 601)), i513, i515, objArr112);
                                                        String str62 = (String) objArr112[0];
                                                        Object[] objArr113 = new Object[1];
                                                        charlie((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf(str, str) + 1284, 11 - ExpandableListView.getPackedPositionType(0L), objArr113);
                                                        String[] strArr29 = {str62, (String) objArr113[0]};
                                                        char blue4 = (char) Color.blue(0);
                                                        int i516 = 1294 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                        int indexOf8 = TextUtils.indexOf(str, str, 0);
                                                        int i517 = (indexOf8 ^ 19) + ((indexOf8 & 19) << 1);
                                                        Object[] objArr114 = new Object[1];
                                                        charlie(blue4, i516, i517, objArr114);
                                                        String str63 = (String) objArr114[0];
                                                        char c35 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        int i518 = -View.getDefaultSize(0, 0);
                                                        int i519 = (i518 ^ 1314) + ((i518 & 1314) << 1);
                                                        int i520 = -(-View.MeasureSpec.getSize(0));
                                                        Object[] objArr115 = new Object[1];
                                                        charlie(c35, i519, (i520 & 5) + (i520 | 5), objArr115);
                                                        String[] strArr30 = {str63, (String) objArr115[0]};
                                                        int trimmedLength3 = TextUtils.getTrimmedLength(str);
                                                        int i521 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        Object[] objArr116 = new Object[1];
                                                        charlie((char) (((trimmedLength3 | 12562) << 1) - (trimmedLength3 ^ 12562)), (i521 & 1319) + (i521 | 1319), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, objArr116);
                                                        String[] strArr31 = {(String) objArr116[0]};
                                                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                        int resolveSizeAndState2 = 1338 - View.resolveSizeAndState(0, 0, 0);
                                                        int i522 = -(-TextUtils.indexOf(str, str));
                                                        int i523 = ((i522 | 16) << 1) - (i522 ^ 16);
                                                        Object[] objArr117 = new Object[1];
                                                        charlie(edgeSlop, resolveSizeAndState2, i523, objArr117);
                                                        String[] strArr32 = {(String) objArr117[0]};
                                                        char c36 = (char) ((-2) - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))));
                                                        int i524 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                        int resolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0);
                                                        Object[] objArr118 = new Object[1];
                                                        charlie(c36, (i524 & 1354) + (i524 | 1354), (resolveSizeAndState3 ^ 19) + ((resolveSizeAndState3 & 19) << 1), objArr118);
                                                        String[] strArr33 = {(String) objArr118[0]};
                                                        char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                        int i525 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int alpha10 = bh.alpha();
                                                        int i526 = (i525 * 70) - 93364;
                                                        int i527 = ~i525;
                                                        int i528 = (i527 ^ (-1374)) | (i527 & (-1374));
                                                        int i529 = ~((i528 ^ alpha10) | (i528 & alpha10));
                                                        int i530 = (i525 ^ 1373) | (i525 & 1373);
                                                        int i531 = (i529 | (~((i530 ^ alpha10) | (i530 & alpha10)))) * 69;
                                                        int i532 = ((i526 | i531) << 1) - (i531 ^ i526);
                                                        int i533 = ~((i527 ^ 1373) | (i527 & 1373));
                                                        int i534 = ~((i527 & alpha10) | (i527 ^ alpha10));
                                                        int i535 = (i534 & i533) | (i533 ^ i534);
                                                        int i536 = ~((alpha10 ^ 1373) | (alpha10 & 1373));
                                                        int i537 = -(-(((i535 & i536) | (i535 ^ i536)) * (-69)));
                                                        int i538 = ((i532 | i537) << 1) - (i532 ^ i537);
                                                        int i539 = (~(((-1374) ^ i525) | (i525 & (-1374)))) * 69;
                                                        Object[] objArr119 = new Object[1];
                                                        charlie(maxKeyCode2, (i538 ^ i539) + ((i539 & i538) << 1), 16777234 - (~Color.rgb(0, 0, 0)), objArr119);
                                                        String[] strArr34 = {(String) objArr119[0]};
                                                        char threadPriority5 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                        int i540 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int i541 = i540 * 85;
                                                        int i542 = ((118320 | i541) << 1) - (i541 ^ 118320);
                                                        int i543 = ~i540;
                                                        int i544 = ~((i543 & (-1393)) | (i543 ^ (-1393)));
                                                        int i545 = ~((i543 & i88) | (i543 ^ i88));
                                                        int i546 = (i544 & i545) | (i544 ^ i545);
                                                        int i547 = ~((-1393) | i88);
                                                        int i548 = (i546 & i547) | (i546 ^ i547);
                                                        int i549 = (i540 ^ 1392) | (i540 & 1392);
                                                        int i550 = ~((i549 ^ i36) | (i549 & i36));
                                                        int i551 = -(-(((i548 ^ i550) | (i548 & i550)) * (-84)));
                                                        int i552 = ((i542 | i551) << 1) - (i551 ^ i542);
                                                        int i553 = ~(((-1393) ^ i36) | ((-1393) & i36));
                                                        int i554 = (i540 & i553) | (i540 ^ i553);
                                                        int i555 = ~((i88 ^ 1392) | (i88 & 1392));
                                                        int i556 = -(-((i554 | i555) * (-84)));
                                                        int i557 = (i552 & i556) + (i556 | i552);
                                                        int i558 = ~i549;
                                                        int i559 = -(-(((i558 & i555) | (i555 ^ i558)) * 84));
                                                        int i560 = ((i557 | i559) << 1) - (i559 ^ i557);
                                                        int mode2 = View.MeasureSpec.getMode(0);
                                                        int alpha11 = bh.alpha();
                                                        int i561 = mode2 * (-183);
                                                        int i562 = (i561 ^ 4255) + ((i561 & 4255) << 1);
                                                        int i563 = ~mode2;
                                                        int i564 = ~((i563 ^ 23) | (i563 & 23));
                                                        int i565 = ~alpha11;
                                                        int i566 = ~(i565 | 23);
                                                        Object[] objArr120 = new Object[1];
                                                        charlie(threadPriority5, i560, ((~(i563 | i565)) * 184) + ((alpha11 | (~((-24) | mode2))) * (-184)) + (((i564 ^ i566) | (i564 & i566)) * 184) + i562, objArr120);
                                                        String[] strArr35 = {(String) objArr120[0]};
                                                        char c37 = (char) ((-2) - (~(-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))));
                                                        int i567 = -TextUtils.getCapsMode(str, 0, 0);
                                                        int i568 = ((i567 | 1415) << 1) - (i567 ^ 1415);
                                                        int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                        int i569 = (jumpTapTimeout4 ^ 21) + ((jumpTapTimeout4 & 21) << 1);
                                                        Object[] objArr121 = new Object[1];
                                                        charlie(c37, i568, i569, objArr121);
                                                        String[] strArr36 = {(String) objArr121[0]};
                                                        Object[] objArr122 = new Object[1];
                                                        charlie((char) View.MeasureSpec.getMode(0), 1436 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) str, '0', 0) + 25, objArr122);
                                                        String[] strArr37 = {(String) objArr122[0], str4};
                                                        char mode3 = (char) View.MeasureSpec.getMode(0);
                                                        int alpha12 = Color.alpha(0);
                                                        int i570 = -(-TextUtils.indexOf(str, str, 0));
                                                        Object[] objArr123 = new Object[1];
                                                        charlie(mode3, ((alpha12 | 1460) << 1) - (alpha12 ^ 1460), (i570 & 28) + (i570 | 28), objArr123);
                                                        String[] strArr38 = {(String) objArr123[0], str4};
                                                        char c38 = (char) (63378 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                        int i571 = -View.MeasureSpec.getSize(0);
                                                        Object[] objArr124 = new Object[1];
                                                        charlie(c38, (i571 & 1488) + (i571 | 1488), 27 - (~TextUtils.lastIndexOf(str, '0', 0, 0)), objArr124);
                                                        String[] strArr39 = {(String) objArr124[0], str4};
                                                        char c39 = (char) (23537 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                                                        int i572 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                        Object[] objArr125 = new Object[1];
                                                        charlie(c39, (i572 ^ 1515) + ((i572 & 1515) << 1), 30 - (~(-Color.blue(0))), objArr125);
                                                        String[] strArr40 = {(String) objArr125[0], str4};
                                                        int rgb3 = Color.rgb(0, 0, 0);
                                                        int indexOf9 = TextUtils.indexOf(str, str, 0, 0);
                                                        int i573 = (indexOf9 & 1546) + (indexOf9 | 1546);
                                                        int i574 = -ExpandableListView.getPackedPositionChild(0L);
                                                        int i575 = (i574 ^ 26) + ((i574 & 26) << 1);
                                                        Object[] objArr126 = new Object[1];
                                                        charlie((char) ((16814056 ^ rgb3) + ((rgb3 & 16814056) << 1)), i573, i575, objArr126);
                                                        String[] strArr41 = {(String) objArr126[0], str4};
                                                        char jumpTapTimeout5 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                                        int alpha13 = bh.alpha();
                                                        int i576 = packedPositionType * 284;
                                                        int i577 = ((i576 | (-443586)) << 1) - (i576 ^ (-443586));
                                                        int i578 = ~packedPositionType;
                                                        int i579 = ~((i578 ^ 1573) | (i578 & 1573));
                                                        int i580 = ~((i578 ^ alpha13) | (i578 & alpha13));
                                                        int i581 = -(-(((i579 ^ i580) | (i579 & i580)) * (-283)));
                                                        int i582 = (i577 ^ i581) + ((i577 & i581) << 1);
                                                        int i583 = -(-((~(((-1574) ^ packedPositionType) | ((-1574) & packedPositionType))) * 283));
                                                        int i584 = ((i582 | i583) << 1) - (i582 ^ i583);
                                                        int i585 = -(-((~((i578 ^ (-1574)) | (i578 & (-1574)) | alpha13)) * 283));
                                                        int i586 = (i584 ^ i585) + ((i585 & i584) << 1);
                                                        int myTid3 = Process.myTid() >> 22;
                                                        int i587 = (myTid3 & 32) + (myTid3 | 32);
                                                        Object[] objArr127 = new Object[1];
                                                        charlie(jumpTapTimeout5, i586, i587, objArr127);
                                                        String[][] strArr42 = {strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, new String[]{(String) objArr127[0], str4}};
                                                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                        int i588 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i589 = (i588 & 1605) + (i588 | 1605);
                                                        int i590 = -ExpandableListView.getPackedPositionGroup(0L);
                                                        int i591 = (i590 & 1) + (i590 | 1);
                                                        Object[] objArr128 = new Object[1];
                                                        charlie(minimumFlingVelocity2, i589, i591, objArr128);
                                                        StringBuilder sb2 = new StringBuilder((String) objArr128[0]);
                                                        int i592 = i36;
                                                        int i593 = 0;
                                                        int i594 = 0;
                                                        for (int i595 = 24; i593 < i595; i595 = 24) {
                                                            int i596 = (737126432 ^ i36) | (737126432 & i36);
                                                            int i597 = 1789600127 - (~(-(-(((i596 & 618011711) | (i596 ^ 618011711)) * (-627)))));
                                                            int i598 = ((~(((-737126433) & i36) | ((-737126433) ^ i36))) | (-618011712)) * (-627);
                                                            int i599 = (i597 & i598) + (i598 | i597);
                                                            int i600 = ~((737126432 & i88) | (i88 ^ 737126432));
                                                            int i601 = ~(((-618011712) ^ i36) | ((-618011712) & i36));
                                                            int i602 = -(-(((i600 & i601) | (i600 ^ i601)) * 627));
                                                            int i603 = ((i599 | i602) << 1) - (i602 ^ i599);
                                                            int i604 = ~bh.alpha();
                                                            int i605 = ~((i604 ^ (-689092818)) | (i604 & (-689092818)));
                                                            int i606 = -(-(((i605 & 151158864) | (i605 ^ 151158864)) * (-160)));
                                                            int i607 = (449198357 ^ i606) + ((i606 & 449198357) << 1);
                                                            int i608 = ~(i604 | 157991768);
                                                            int i609 = ((i608 & (-689092818)) | ((-689092818) ^ i608)) * 160;
                                                            if (i603 <= (i607 ^ i609) + ((i609 & i607) << 1)) {
                                                                strArr8 = strArr42[i593];
                                                                Object[] objArr129 = {strArr8[0]};
                                                                Object D887121 = uH18377.D8871(i14);
                                                                if (D887121 == null) {
                                                                    int myPid3 = (Process.myPid() >> 22) + 52;
                                                                    int makeMeasureSpec2 = 3158 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                    char c40 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58074);
                                                                    byte b41 = (byte) 0;
                                                                    byte b42 = b41;
                                                                    strArr7 = strArr42;
                                                                    i46 = i593;
                                                                    Object[] objArr130 = new Object[1];
                                                                    delta(b41, b42, (byte) (b42 + 1), objArr130);
                                                                    D887121 = uH18377.setPivotYN16904(myPid3, makeMeasureSpec2, c40, 424179844, false, (String) objArr130[0], new Class[]{cls});
                                                                } else {
                                                                    strArr7 = strArr42;
                                                                    i46 = i593;
                                                                }
                                                                str3 = (String) ((Method) D887121).invoke(null, objArr129);
                                                                strArr9 = (String[]) Arrays.copyOfRange(strArr8, 1, strArr8.length);
                                                                if (str3 != null) {
                                                                    i47 = 1;
                                                                } else {
                                                                    i48 = i592;
                                                                    i592 = i48;
                                                                    i593 = i46 + 1;
                                                                    strArr42 = strArr7;
                                                                }
                                                            } else {
                                                                strArr7 = strArr42;
                                                                i46 = i593;
                                                                strArr8 = strArr7[i46];
                                                                Object[] objArr131 = {strArr8[0]};
                                                                Object D887122 = uH18377.D8871(i14);
                                                                if (D887122 == null) {
                                                                    int absoluteGravity2 = 52 - Gravity.getAbsoluteGravity(0, 0);
                                                                    int i610 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3158;
                                                                    char lastIndexOf6 = (char) (TextUtils.lastIndexOf(str, '0') + 58075);
                                                                    byte b43 = (byte) 0;
                                                                    byte b44 = b43;
                                                                    Object[] objArr132 = new Object[1];
                                                                    delta(b43, b44, (byte) (b44 + 1), objArr132);
                                                                    D887122 = uH18377.setPivotYN16904(absoluteGravity2, i610, lastIndexOf6, 424179844, false, (String) objArr132[0], new Class[]{cls});
                                                                }
                                                                str3 = (String) ((Method) D887122).invoke(null, objArr131);
                                                                i47 = 1;
                                                                strArr9 = (String[]) Arrays.copyOfRange(strArr8, 1, strArr8.length);
                                                            }
                                                            if (!str3.isEmpty()) {
                                                                if (strArr8.length != i47) {
                                                                    int i611 = foxtrot;
                                                                    int i612 = (i611 & 3) + (i611 | 3);
                                                                    echo = i612 % 128;
                                                                    if (i612 % 2 != 0) {
                                                                        Object[] objArr133 = new Object[2];
                                                                        objArr133[i47] = strArr9;
                                                                        objArr133[0] = str3;
                                                                        Object D887123 = uH18377.D8871(-1363379003);
                                                                        if (D887123 == null) {
                                                                            int myPid4 = 52 - (Process.myPid() >> 22);
                                                                            int scrollDefaultDelay = 1415 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                            char argb = (char) (Color.argb(0, 0, 0, 0) + 3047);
                                                                            byte b45 = (byte) 0;
                                                                            byte b46 = b45;
                                                                            Object[] objArr134 = new Object[1];
                                                                            delta(b45, b46, b46, objArr134);
                                                                            D887123 = uH18377.setPivotYN16904(myPid4, scrollDefaultDelay, argb, 1896341008, false, (String) objArr134[0], new Class[]{cls, String[].class});
                                                                        }
                                                                        long longValue12 = ((Long) ((Method) D887123).invoke(null, objArr133)).longValue();
                                                                        long j90 = -458575119;
                                                                        long j91 = 371;
                                                                        long j92 = (j91 * longValue12) + (j91 * j90);
                                                                        strArr10 = strArr8;
                                                                        i48 = i592;
                                                                        long j93 = -370;
                                                                        long j94 = longValue12 ^ j22;
                                                                        long tango4 = ao.ad.tango(2101979645);
                                                                        long j95 = tango4 ^ j22;
                                                                        long j96 = j90 ^ j22;
                                                                        long j97 = (longValue12 | j90) ^ j22;
                                                                        long j98 = (370 * j97) + ((((j94 | tango4) ^ j22) | ((j96 | j95) ^ j22) | j97) * j93) + ((((j94 | j95) ^ j22) | ((j96 | tango4) ^ j22)) * j93) + j92 + 1248702742;
                                                                        int myTid4 = Process.myTid();
                                                                        int i613 = ~myTid4;
                                                                        int i614 = ((int) (j98 >>> 89)) & ((((~(myTid4 | (-554205185))) | (~(994629296 | i613)) | 2173002) * 140) + (((~(442597114 | i613)) | 554205184) * (-280)) + (((442597114 | myTid4) * 140) - 421733254));
                                                                        int i615 = ~((~((int) Runtime.getRuntime().totalMemory())) | (-2005519691));
                                                                        int i616 = ((int) j98) & (((i615 | 5649056) * 970) + (((-2011168747) | i615) * (-970)) + 754591655);
                                                                    } else {
                                                                        strArr10 = strArr8;
                                                                        i48 = i592;
                                                                        Object[] objArr135 = {str3, strArr9};
                                                                        Object D887124 = uH18377.D8871(-1363379003);
                                                                        if (D887124 == null) {
                                                                            int indexOf10 = TextUtils.indexOf(str, str, 0) + 52;
                                                                            int indexOf11 = 1414 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                                                            char doubleTapTimeout6 = (char) (3047 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                            byte b47 = (byte) 0;
                                                                            byte b48 = b47;
                                                                            Object[] objArr136 = new Object[1];
                                                                            delta(b47, b48, b48, objArr136);
                                                                            D887124 = uH18377.setPivotYN16904(indexOf10, indexOf11, doubleTapTimeout6, 1896341008, false, (String) objArr136[0], new Class[]{cls, String[].class});
                                                                        }
                                                                        long longValue13 = ((Long) ((Method) D887124).invoke(null, objArr135)).longValue();
                                                                        long j99 = -600181591;
                                                                        long j100 = ((-301) * longValue13) + (HttpConstants.HTTP_SEE_OTHER * j99);
                                                                        long j101 = j99 ^ j22;
                                                                        long myPid5 = Process.myPid();
                                                                        long j102 = (HttpConstants.HTTP_MOVED_TEMP * (((longValue13 | myPid5) ^ j22) | (((longValue13 ^ j22) | j99) ^ j22))) + ((-604) * (((j101 | longValue13) | myPid5) ^ j22)) + ((-302) * ((((j101 | (myPid5 ^ j22)) | longValue13) ^ j22) | (((j99 | longValue13) | myPid5) ^ j22))) + j100 + 1390309214;
                                                                        int i617 = ((int) (j102 >> c3)) & ((((~((~((int) Process.getElapsedCpuTime())) | 927692457)) | (-689285545)) * 494) + ((((-135563521) | r6) * 494) - 1653097546));
                                                                        int romeo6 = ao.ad.romeo();
                                                                        int i618 = ~romeo6;
                                                                        int i619 = ((int) j102) & (((~(i618 | 321270338)) * 301) + (((~(romeo6 | 1758496748)) | 321269762 | (~((-1758496173) | i618))) * (-301)) + (((~(1758496748 | i618)) | 321270338) * (-602)) + 1962412000);
                                                                    }
                                                                } else {
                                                                    strArr10 = strArr8;
                                                                }
                                                                int i620 = (i46 ^ 10) + ((i46 & 10) << 1);
                                                                i592 = (~(i36 & i620)) & (i36 | i620);
                                                                int i621 = (i594 & 1) + (i594 | 1);
                                                                if (i621 > 1) {
                                                                    foxtrot = (echo + 119) % 128;
                                                                    char c41 = (char) (13477 - (~(-Color.red(0))));
                                                                    int i622 = -ExpandableListView.getPackedPositionChild(0L);
                                                                    int i623 = (i622 ^ 1605) + ((i622 & 1605) << 1);
                                                                    int i624 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                    int i625 = (i624 & 3) + (i624 | 3);
                                                                    Object[] objArr137 = new Object[1];
                                                                    charlie(c41, i623, i625, objArr137);
                                                                    i49 = 0;
                                                                    sb2.append((String) objArr137[0]);
                                                                } else {
                                                                    i49 = 0;
                                                                }
                                                                sb2.append(strArr10[i49]);
                                                                char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                int i626 = 1606 - (~(-TextUtils.lastIndexOf(str, '0', i49, i49)));
                                                                int i627 = (ExpandableListView.getPackedPositionForGroup(i49) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i49) == 0L ? 0 : -1));
                                                                int i628 = ((i627 | 1) << 1) - (i627 ^ 1);
                                                                Object[] objArr138 = new Object[1];
                                                                charlie(fadingEdgeLength3, i626, i628, objArr138);
                                                                sb2.append((String) objArr138[i49]);
                                                                sb2.append(str3);
                                                                i594 = i621;
                                                                i593 = i46 + 1;
                                                                strArr42 = strArr7;
                                                            }
                                                            i48 = i592;
                                                            i592 = i48;
                                                            i593 = i46 + 1;
                                                            strArr42 = strArr7;
                                                        }
                                                        int i629 = i592;
                                                        Object[] objArr139 = new Object[1];
                                                        charlie((char) Gravity.getAbsoluteGravity(0, 0), 1608 - TextUtils.lastIndexOf(str, '0', 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr139);
                                                        sb2.append((String) objArr139[0]);
                                                        Object[] objArr140 = new Object[2];
                                                        if (i594 > 2) {
                                                            objArr140[1] = new int[1];
                                                            String[] strArr43 = {sb2.toString()};
                                                            ((int[]) objArr140[1])[0] = i629;
                                                            objArr140[0] = strArr43;
                                                        } else {
                                                            int[] iArr = new int[1];
                                                            objArr140[1] = iArr;
                                                            iArr[0] = i36;
                                                            objArr140[0] = new String[0];
                                                        }
                                                        int i630 = ((int[]) objArr140[1])[0];
                                                        int i631 = (~(i36 & i360)) & (i36 | i360);
                                                        int i632 = -i631;
                                                        int i633 = ((i631 & i632) | (i631 ^ i632)) >> 31;
                                                        int i634 = i630 & (~i633);
                                                        int i635 = i360 & i633;
                                                        i360 = (i634 & i635) | (i634 ^ i635);
                                                        i37 = 0;
                                                        strArr4 = (String[]) objArr140[0];
                                                    } else {
                                                        i37 = 0;
                                                        strArr4 = null;
                                                    }
                                                    char mode4 = (char) View.MeasureSpec.getMode(i37);
                                                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                    Object[] objArr141 = new Object[1];
                                                    charlie(mode4, (maximumDrawingCacheSize & 891) + (maximumDrawingCacheSize | 891), 15 - (~(-TextUtils.getOffsetAfter(str, i37))), objArr141);
                                                    Object[] objArr142 = new Object[1];
                                                    objArr142[i37] = (String) objArr141[i37];
                                                    D88714 = uH18377.D8871(i14);
                                                    if (D88714 == null) {
                                                        int deadChar4 = KeyEvent.getDeadChar(i37, i37) + 52;
                                                        int i636 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3157;
                                                        char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58074);
                                                        byte b49 = (byte) 0;
                                                        byte b50 = b49;
                                                        Object[] objArr143 = new Object[1];
                                                        delta(b49, b50, (byte) (b50 + 1), objArr143);
                                                        D88714 = uH18377.setPivotYN16904(deadChar4, i636, edgeSlop2, 424179844, false, (String) objArr143[0], new Class[]{cls});
                                                    }
                                                    invoke = ((Method) D88714).invoke(null, objArr142);
                                                    if (invoke != null) {
                                                        i38 = 0;
                                                    } else {
                                                        Object[] objArr144 = {invoke, 42};
                                                        Object D887125 = uH18377.D8871(2072770498);
                                                        if (D887125 == null) {
                                                            int alpha14 = 51 - Color.alpha(0);
                                                            int normalizeMetaState = 1209 - KeyEvent.normalizeMetaState(0);
                                                            char scrollBarSize2 = (char) (44356 - (ViewConfiguration.getScrollBarSize() >> 8));
                                                            byte b51 = (byte) 0;
                                                            byte b52 = b51;
                                                            Object[] objArr145 = new Object[1];
                                                            delta(b51, b52, b52, objArr145);
                                                            D887125 = uH18377.setPivotYN16904(alpha14, normalizeMetaState, scrollBarSize2, -1540336361, false, (String) objArr145[0], new Class[]{cls, Integer.TYPE});
                                                        }
                                                        long longValue14 = ((Long) ((Method) D887125).invoke(null, objArr144)).longValue();
                                                        long j103 = 2118141499;
                                                        long j104 = 52;
                                                        long romeo7 = ao.ad.romeo() ^ j22;
                                                        long j105 = romeo7 | j103;
                                                        long j106 = longValue14 ^ j22;
                                                        long j107 = ((-52) * (((j106 | romeo7) ^ j22) | ((j106 | j103) ^ j22) | (j105 ^ j22))) + (((j105 | longValue14) ^ j22) * j104) + (53 * longValue14) + ((-51) * j103);
                                                        long j108 = j103 ^ j22;
                                                        long j109 = ((j104 * (((j108 | longValue14) ^ j22) | ((romeo7 | j108) ^ j22))) + j107) - 2125586529;
                                                        int freeMemory6 = (int) Runtime.getRuntime().freeMemory();
                                                        int i637 = ~freeMemory6;
                                                        int i638 = ((int) (j109 >> c3)) & ((((~(freeMemory6 | 1217931723)) | (~(i637 | (-1639809162)))) * 979) + (((-1639809162) | freeMemory6) * (-979)) + ((~(1217931723 | i637)) * 979) + 736075024);
                                                        int i639 = ~Process.myTid();
                                                        int i640 = ((int) j109) & ((((~(i639 | 531567678)) | 542130497) * 983) + (((~(905658731 | i639)) | 531567678) * (-983)) + 1064424400);
                                                        i38 = (i638 & i640) | (i638 ^ i640);
                                                    }
                                                    if (i38 != 1986687685) {
                                                        echo = (foxtrot + 113) % 128;
                                                        if (i38 != -1514516938) {
                                                            char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                            int i641 = -MotionEvent.axisFromString(str);
                                                            Object[] objArr146 = new Object[1];
                                                            charlie(resolveOpacity, (i641 & 1609) + (i641 | 1609), 13 - (~(-Drawable.resolveOpacity(0, 0))), objArr146);
                                                            String str64 = (String) objArr146[0];
                                                            char c42 = (char) (0 - (~(-(-TextUtils.lastIndexOf(str, '0', 0)))));
                                                            int i642 = -Color.green(0);
                                                            Object[] objArr147 = new Object[1];
                                                            charlie(c42, (i642 ^ 1624) + ((i642 & 1624) << 1), 25 - (~(-TextUtils.getTrimmedLength(str))), objArr147);
                                                            String str65 = (String) objArr147[0];
                                                            Object[] objArr148 = new Object[1];
                                                            charlie((char) TextUtils.getOffsetBefore(str, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 1650, (ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr148);
                                                            String str66 = (String) objArr148[0];
                                                            char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int i643 = (-16775550) - (~(-Color.rgb(0, 0, 0)));
                                                            int i644 = -Process.getGidForName(str);
                                                            int i645 = ((i644 | 16) << 1) - (i644 ^ 16);
                                                            Object[] objArr149 = new Object[1];
                                                            charlie(scrollBarSize3, i643, i645, objArr149);
                                                            String str67 = (String) objArr149[0];
                                                            int i646 = -TextUtils.getOffsetAfter(str, 0);
                                                            Object[] objArr150 = new Object[1];
                                                            charlie((char) (((i646 | 57885) << 1) - (i646 ^ 57885)), 1683 - (~View.resolveSizeAndState(0, 0, 0)), 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr150);
                                                            String str68 = (String) objArr150[0];
                                                            int i647 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                            Object[] objArr151 = new Object[1];
                                                            charlie((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (i647 & 1699) + (i647 | 1699), 37 - ExpandableListView.getPackedPositionGroup(0L), objArr151);
                                                            String str69 = (String) objArr151[0];
                                                            char c43 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15887);
                                                            int i648 = 1735 - (~(-(Process.myTid() >> 22)));
                                                            int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                            int i649 = ((longPressTimeout3 | 12) << 1) - (longPressTimeout3 ^ 12);
                                                            Object[] objArr152 = new Object[1];
                                                            charlie(c43, i648, i649, objArr152);
                                                            String str70 = (String) objArr152[0];
                                                            char makeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int i650 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            Object[] objArr153 = new Object[1];
                                                            charlie(makeMeasureSpec3, (i650 & 1748) + (i650 | 1748), 13 - Color.red(0), objArr153);
                                                            String str71 = (String) objArr153[0];
                                                            int i651 = -TextUtils.lastIndexOf(str, '0', 0, 0);
                                                            int maximumDrawingCacheSize2 = 1761 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                            int i652 = -TextUtils.lastIndexOf(str, '0', 0, 0);
                                                            int i653 = ((i652 | 21) << 1) - (i652 ^ 21);
                                                            Object[] objArr154 = new Object[1];
                                                            charlie((char) ((i651 ^ (-1)) + (i651 << 1)), maximumDrawingCacheSize2, i653, objArr154);
                                                            String str72 = (String) objArr154[0];
                                                            char c44 = (char) (64793 - (~(-Color.red(0))));
                                                            int i654 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                            int i655 = (i654 ^ 1783) + ((i654 & 1783) << 1);
                                                            int i656 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int i657 = ((i656 | 31) << 1) - (i656 ^ 31);
                                                            Object[] objArr155 = new Object[1];
                                                            charlie(c44, i655, i657, objArr155);
                                                            String str73 = (String) objArr155[0];
                                                            int rgb4 = Color.rgb(0, 0, 0);
                                                            int offsetBefore = TextUtils.getOffsetBefore(str, 0);
                                                            int alpha15 = bh.alpha();
                                                            int i658 = offsetBefore * HttpConstants.HTTP_UNAVAILABLE;
                                                            int i659 = (i658 ^ 912442) + ((i658 & 912442) << 1);
                                                            int i660 = (offsetBefore ^ 1814) | (offsetBefore & 1814);
                                                            int i661 = -(-(i660 * (-502)));
                                                            int i662 = (i659 & i661) + (i661 | i659);
                                                            int i663 = ~offsetBefore;
                                                            int i664 = ~(i663 | (-1815));
                                                            int i665 = ~alpha15;
                                                            int i666 = (i663 & i665) | (i663 ^ i665);
                                                            int i667 = ~i666;
                                                            int i668 = (i664 & i667) | (i664 ^ i667);
                                                            int i669 = ~((alpha15 & i660) | (i660 ^ alpha15));
                                                            int i670 = (((i668 ^ i669) | (i668 & i669)) * (-502)) + i662;
                                                            int i671 = ~((i666 & 1814) | (i666 ^ 1814));
                                                            int i672 = ((i671 & i669) | (i671 ^ i669)) * HttpConstants.HTTP_BAD_GATEWAY;
                                                            int i673 = (i670 ^ i672) + ((i672 & i670) << 1);
                                                            int i674 = -Color.alpha(0);
                                                            int i675 = (i674 & 12) + (i674 | 12);
                                                            Object[] objArr156 = new Object[1];
                                                            charlie((char) (((rgb4 | 16793844) << 1) - (rgb4 ^ 16793844)), i673, i675, objArr156);
                                                            String str74 = (String) objArr156[0];
                                                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                                                            int i676 = -View.resolveSize(0, 0);
                                                            Object[] objArr157 = new Object[1];
                                                            charlie((char) (((packedPositionType2 | 1071) << 1) - (packedPositionType2 ^ 1071)), (i676 & 1826) + (i676 | 1826), Color.blue(0) + 12, objArr157);
                                                            String str75 = (String) objArr157[0];
                                                            int i677 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                                            Object[] objArr158 = new Object[1];
                                                            charlie((char) ((i677 ^ 5850) + ((i677 & 5850) << 1)), 1837 - (~(-TextUtils.getTrimmedLength(str))), 11 - Process.getGidForName(str), objArr158);
                                                            String str76 = (String) objArr158[0];
                                                            char doubleTapTimeout7 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int i678 = 1848 - (~(-ImageFormat.getBitsPerPixel(0)));
                                                            int i679 = -(-Color.alpha(0));
                                                            int i680 = ((i679 | 12) << 1) - (i679 ^ 12);
                                                            Object[] objArr159 = new Object[1];
                                                            charlie(doubleTapTimeout7, i678, i680, objArr159);
                                                            String str77 = (String) objArr159[0];
                                                            char lastIndexOf7 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 63701);
                                                            int defaultSize = 1862 - View.getDefaultSize(0, 0);
                                                            int i681 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            int i682 = (i681 & 12) + (i681 | 12);
                                                            Object[] objArr160 = new Object[1];
                                                            charlie(lastIndexOf7, defaultSize, i682, objArr160);
                                                            String str78 = (String) objArr160[0];
                                                            char resolveSizeAndState4 = (char) View.resolveSizeAndState(0, 0, 0);
                                                            int i683 = 1873 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            int i684 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i685 = ((i684 | 14) << 1) - (i684 ^ 14);
                                                            Object[] objArr161 = new Object[1];
                                                            charlie(resolveSizeAndState4, i683, i685, objArr161);
                                                            String str79 = (String) objArr161[0];
                                                            int axisFromString4 = MotionEvent.axisFromString(str);
                                                            int i686 = -TextUtils.getOffsetBefore(str, 0);
                                                            int i687 = (i686 ^ 1888) + ((i686 & 1888) << 1);
                                                            int i688 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            int i689 = (i688 & 12) + (i688 | 12);
                                                            Object[] objArr162 = new Object[1];
                                                            charlie((char) ((axisFromString4 ^ 50184) + ((axisFromString4 & 50184) << 1)), i687, i689, objArr162);
                                                            String str80 = (String) objArr162[0];
                                                            char c45 = (char) (63556 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                            int i690 = 1899 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                                                            int i691 = -View.resolveSizeAndState(0, 0, 0);
                                                            int i692 = ((i691 | 24) << 1) - (i691 ^ 24);
                                                            Object[] objArr163 = new Object[1];
                                                            charlie(c45, i690, i692, objArr163);
                                                            String str81 = (String) objArr163[0];
                                                            int i693 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i694 = 1924 - (~TextUtils.indexOf((CharSequence) str, '0'));
                                                            int i695 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i696 = (i695 & 29) + (i695 | 29);
                                                            int i697 = 1;
                                                            Object[] objArr164 = new Object[1];
                                                            charlie((char) ((i693 & 1) + (i693 | 1)), i694, i696, objArr164);
                                                            int i698 = 0;
                                                            String[] strArr44 = {str64, str65, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, (String) objArr164[0]};
                                                            int i699 = 0;
                                                            int i700 = 19;
                                                            while (i699 < i700) {
                                                                String str82 = strArr44[i699];
                                                                Object[] objArr165 = new Object[i697];
                                                                objArr165[i698] = str82;
                                                                Object D887126 = uH18377.D8871(1979478258);
                                                                if (D887126 == null) {
                                                                    int argb2 = 52 - Color.argb(i698, i698, i698, i698);
                                                                    int scrollBarFadeDuration3 = 2951 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                    char offsetAfter4 = (char) TextUtils.getOffsetAfter(str, i698);
                                                                    byte b53 = (byte) (i5 & 10);
                                                                    byte b54 = (byte) (b53 - 2);
                                                                    strArr5 = strArr4;
                                                                    Object[] objArr166 = new Object[1];
                                                                    delta(b53, b54, (byte) (b54 + 1), objArr166);
                                                                    D887126 = uH18377.setPivotYN16904(argb2, scrollBarFadeDuration3, offsetAfter4, -1438133721, false, (String) objArr166[0], new Class[]{cls});
                                                                } else {
                                                                    strArr5 = strArr4;
                                                                }
                                                                long longValue15 = ((Long) ((Method) D887126).invoke(null, objArr165)).longValue();
                                                                long j110 = 638611212;
                                                                String[] strArr45 = strArr44;
                                                                int i701 = i699;
                                                                long j111 = (591 * longValue15) + ((-589) * j110);
                                                                long j112 = 590;
                                                                long j113 = longValue15 ^ j22;
                                                                long elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                                long j114 = elapsedRealtime5 ^ j22;
                                                                long j115 = ((j113 | j114) ^ j22) | ((j113 | j110) ^ j22) | ((j114 | j110) ^ j22);
                                                                long j116 = j110 ^ j22;
                                                                long j117 = (j112 * (((j114 | longValue15) ^ j22) | ((j116 | j114) ^ j22))) + ((-1180) * j115) + ((j115 | (((j116 | longValue15) | elapsedRealtime5) ^ j22)) * j112) + j111 + 136210094;
                                                                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                                int i702 = ((int) (j117 >> c3)) & ((((~((~maxMemory2) | 477755812)) | 553649154) * 560) + ((~(maxMemory2 | (-71934369))) * (-560)) + (((~(959470598 | r5)) * (-560)) - 2035081398));
                                                                int i703 = ((int) j117) & ((((~((int) Runtime.getRuntime().totalMemory())) | (-1621792779)) * 756) + ((((~((-1621792779) | r5)) | 184566368) * (-756)) - 1629311407));
                                                                if (((i702 & i703) | (i702 ^ i703)) == 0) {
                                                                    int i704 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                    int i705 = -View.resolveSize(0, 0);
                                                                    int i706 = ((i705 | 1874) << 1) - (i705 ^ 1874);
                                                                    int green2 = Color.green(0);
                                                                    int i707 = ((green2 | 14) << 1) - (green2 ^ 14);
                                                                    Object[] objArr167 = new Object[1];
                                                                    charlie((char) ((i704 & 1) + (i704 | 1)), i706, i707, objArr167);
                                                                    if (str82.equals((String) objArr167[0])) {
                                                                        int i708 = foxtrot;
                                                                        int i709 = (i708 ^ 25) + ((i708 & 25) << 1);
                                                                        echo = i709 % 128;
                                                                        if (i709 % 2 != 0) {
                                                                            Object[] objArr168 = {str82};
                                                                            Object D887127 = uH18377.D8871(1979478258);
                                                                            if (D887127 == null) {
                                                                                int deadChar5 = KeyEvent.getDeadChar(0, 0) + 52;
                                                                                int i710 = 2952 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                char capsMode3 = (char) TextUtils.getCapsMode(str, 0, 0);
                                                                                byte b55 = (byte) (i5 & 10);
                                                                                byte b56 = (byte) (b55 - 2);
                                                                                Object[] objArr169 = new Object[1];
                                                                                delta(b55, b56, (byte) (b56 + 1), objArr169);
                                                                                D887127 = uH18377.setPivotYN16904(deadChar5, i710, capsMode3, -1438133721, false, (String) objArr169[0], new Class[]{cls});
                                                                            }
                                                                            long longValue16 = ((Long) ((Method) D887127).invoke(null, objArr168)).longValue();
                                                                            long j118 = -779656850;
                                                                            long j119 = -964;
                                                                            long j120 = longValue16 ^ j22;
                                                                            long elapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                                                                            long j121 = (j119 * (((j120 | (elapsedRealtime6 ^ j22)) ^ j22) | ((j120 | j118) ^ j22))) + ((((j120 | elapsedRealtime6) ^ j22) | (j118 ^ j22)) * j119) + (965 * longValue16) + ((-963) * j118) + j119 + 1554478156;
                                                                            int elapsedRealtime7 = (int) SystemClock.elapsedRealtime();
                                                                            if (((((int) (j121 << 104)) & A0.z.foxtrot((~(elapsedRealtime7 | (-525688191))) | (~(1962914601 | elapsedRealtime7)) | 184568918, -1444, (((~elapsedRealtime7) | 1806364247) * 1444) - 1153123274, 1475070928)) | (((int) j121) & A0.z.foxtrot((~((~ao.ad.romeo()) | 1111869570)) | 287311141, 933, (((~(325356839 | r5)) | 1111869570) * (-933)) - 2060256004, 1136897866))) != 0) {
                                                                            }
                                                                        } else {
                                                                            Object[] objArr170 = {str82};
                                                                            Object D887128 = uH18377.D8871(1979478258);
                                                                            if (D887128 == null) {
                                                                                byte b57 = (byte) (i5 & 10);
                                                                                byte b58 = (byte) (b57 - 2);
                                                                                Object[] objArr171 = new Object[1];
                                                                                delta(b57, b58, (byte) (b58 + 1), objArr171);
                                                                                D887128 = uH18377.setPivotYN16904((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52, 2950 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1438133721, false, (String) objArr171[0], new Class[]{cls});
                                                                            }
                                                                            long longValue17 = ((Long) ((Method) D887128).invoke(null, objArr170)).longValue();
                                                                            long j122 = -970671020;
                                                                            long j123 = (j76 * longValue17) + (j75 * j122);
                                                                            long j124 = longValue17 ^ j22;
                                                                            long myUid5 = Process.myUid();
                                                                            long j125 = myUid5 ^ j22;
                                                                            long j126 = (j81 * (((myUid5 | (j122 | longValue17)) ^ j22) | (((j124 | j125) | j122) ^ j22))) + ((((j124 | myUid5) ^ j22) | (((j125 | j122) | longValue17) ^ j22)) * j81) + ((j124 | (((j122 ^ j22) | myUid5) ^ j22)) * j78) + j123 + 1745492326;
                                                                            int myUid6 = Process.myUid();
                                                                            int i711 = ~myUid6;
                                                                            int i712 = ((int) (j126 >> c3)) & ((((~(myUid6 | 1602220031)) | (~(i711 | (-85295685)))) * 210) + (((~(125144652 | i711)) | (~((-1562371064) | myUid6))) * 210) + 1215575308);
                                                                            int i713 = (int) j126;
                                                                            int myTid5 = Process.myTid();
                                                                            int i714 = ~myTid5;
                                                                            int i715 = i713 & ((((~(myTid5 | (-464777392))) | (~(i714 | 1006105855)) | 431120554) * 717) + (((~(i714 | (-464777392))) | 431120554 | (~(1006105855 | myTid5))) * 717) + 272434448);
                                                                            if (((i712 & i715) | (i712 ^ i715)) != 0) {
                                                                            }
                                                                        }
                                                                        int i716 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                        Object[] objArr172 = new Object[1];
                                                                        charlie((char) (((i716 | 1) << 1) - (i716 ^ 1)), (Process.myTid() >> 22) + 1952, 12 - (~(-TextUtils.indexOf(str, str, 0, 0))), objArr172);
                                                                        String str83 = (String) objArr172[0];
                                                                        char myTid6 = (char) (Process.myTid() >> 22);
                                                                        int i717 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                        Object[] objArr173 = new Object[1];
                                                                        charlie(myTid6, (i717 ^ 1966) + ((i717 & 1966) << 1), 5 - (~TextUtils.indexOf((CharSequence) str, '0', 0)), objArr173);
                                                                        String[] strArr46 = {str83, (String) objArr173[0]};
                                                                        int i718 = -Color.green(0);
                                                                        int i719 = 1971 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                        int i720 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                        int i721 = (i720 & 15) + (i720 | 15);
                                                                        Object[] objArr174 = new Object[1];
                                                                        charlie((char) ((i718 & 12498) + (i718 | 12498)), i719, i721, objArr174);
                                                                        String str84 = (String) objArr174[0];
                                                                        char resolveSizeAndState5 = (char) View.resolveSizeAndState(0, 0, 0);
                                                                        int i722 = 1983 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                                                        int i723 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                        int i724 = (i723 ^ 19) + ((i723 & 19) << 1);
                                                                        Object[] objArr175 = new Object[1];
                                                                        charlie(resolveSizeAndState5, i722, i724, objArr175);
                                                                        String str85 = (String) objArr175[0];
                                                                        Object[] objArr176 = new Object[1];
                                                                        charlie((char) (51682 - (~(-TextUtils.lastIndexOf(str, '0', 0, 0)))), 2002 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr176);
                                                                        String[] strArr47 = {str84, str85, (String) objArr176[0]};
                                                                        char lastIndexOf8 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 63789);
                                                                        int i725 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                                        Object[] objArr177 = new Object[1];
                                                                        charlie(lastIndexOf8, (i725 ^ 2017) + ((i725 & 2017) << 1), Color.argb(0, 0, 0, 0) + 21, objArr177);
                                                                        String str86 = (String) objArr177[0];
                                                                        char c46 = (char) ((-2) - (~(-Process.getGidForName(str))));
                                                                        int i726 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                        int i727 = (i726 & 2039) + (i726 | 2039);
                                                                        int i728 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                        int i729 = (i728 ^ 11) + ((i728 & 11) << 1);
                                                                        Object[] objArr178 = new Object[1];
                                                                        charlie(c46, i727, i729, objArr178);
                                                                        String[] strArr48 = {str86, (String) objArr178[0]};
                                                                        int i730 = -(-Color.alpha(0));
                                                                        int i731 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                        Object[] objArr179 = new Object[1];
                                                                        charlie((char) ((i730 ^ 62511) + ((i730 & 62511) << 1)), (i731 & 2050) + (i731 | 2050), 11 - View.MeasureSpec.getSize(0), objArr179);
                                                                        String str87 = (String) objArr179[0];
                                                                        int i732 = -1;
                                                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                                                        int i733 = (bitsPerPixel ^ 590) + ((bitsPerPixel & 590) << 1);
                                                                        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                        int i734 = ((makeMeasureSpec4 | 6) << 1) - (makeMeasureSpec4 ^ 6);
                                                                        Object[] objArr180 = new Object[1];
                                                                        charlie((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i733, i734, objArr180);
                                                                        String[] strArr49 = {str87, (String) objArr180[0]};
                                                                        char myPid6 = (char) (Process.myPid() >> 22);
                                                                        int i735 = -(-TextUtils.getOffsetAfter(str, 0));
                                                                        int i736 = ((i735 | 2060) << 1) - (i735 ^ 2060);
                                                                        int blue5 = Color.blue(0);
                                                                        int i737 = ((blue5 | 28) << 1) - (blue5 ^ 28);
                                                                        Object[] objArr181 = new Object[1];
                                                                        charlie(myPid6, i736, i737, objArr181);
                                                                        String str88 = (String) objArr181[0];
                                                                        int lastIndexOf9 = TextUtils.lastIndexOf(str, '0', 0);
                                                                        int alpha16 = bh.alpha();
                                                                        int i738 = lastIndexOf9 * 370;
                                                                        int i739 = (i738 & 370) + (i738 | 370);
                                                                        int i740 = (lastIndexOf9 ^ 1) | (lastIndexOf9 & 1);
                                                                        int i741 = ~alpha16;
                                                                        int i742 = ((i740 & i741) | (i740 ^ i741)) * (-369);
                                                                        int i743 = (i739 & i742) + (i742 | i739);
                                                                        int i744 = ~lastIndexOf9;
                                                                        int i745 = (i744 & i741) | (i744 ^ i741);
                                                                        int i746 = ~i745;
                                                                        int i747 = (i743 - (~(-(-(((i746 & 1) | (i746 ^ 1)) * (-369)))))) - 1;
                                                                        int i748 = (~((lastIndexOf9 & alpha16) | (lastIndexOf9 ^ alpha16))) | (~(((-2) ^ lastIndexOf9) | ((-2) & lastIndexOf9)));
                                                                        int i749 = ~((i745 ^ 1) | (i745 & 1));
                                                                        int i750 = ((i748 & i749) | (i748 ^ i749)) * 369;
                                                                        int deadChar6 = KeyEvent.getDeadChar(0, 0);
                                                                        i39 = 1;
                                                                        int i751 = (deadChar6 ^ 2039) + ((deadChar6 & 2039) << 1);
                                                                        int i752 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                        int i753 = (i752 & 10) + (i752 | 10);
                                                                        Object[] objArr182 = new Object[1];
                                                                        charlie((char) ((i747 & i750) + (i750 | i747)), i751, i753, objArr182);
                                                                        c11 = 0;
                                                                        i40 = 5;
                                                                        String[][] strArr50 = {strArr46, strArr47, strArr48, strArr49, new String[]{str88, (String) objArr182[0]}};
                                                                        i41 = 0;
                                                                        loop8: while (true) {
                                                                            if (i41 < i40) {
                                                                                i42 = i36;
                                                                                break;
                                                                            }
                                                                            String[] strArr51 = strArr50[i41];
                                                                            String str89 = strArr51[c11];
                                                                            String[] strArr52 = (String[]) Arrays.copyOfRange(strArr51, i39, strArr51.length);
                                                                            int length = strArr52.length;
                                                                            int i754 = 0;
                                                                            while (i754 < length) {
                                                                                String str90 = strArr52[i754];
                                                                                int i755 = (i732 & 1) + (i732 | 1);
                                                                                File file4 = new File(str89);
                                                                                if (file4.exists() && file4.isFile()) {
                                                                                    try {
                                                                                        Scanner scanner3 = new Scanner(new FileInputStream(file4));
                                                                                        i44 = i41;
                                                                                        try {
                                                                                            strArr6 = strArr52;
                                                                                            str2 = str89;
                                                                                            try {
                                                                                                Object[] objArr183 = new Object[1];
                                                                                                charlie((char) (48122 - (~(-View.MeasureSpec.getMode(0)))), 370 - (ViewConfiguration.getWindowTouchSlop() >> 8), 0 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr183);
                                                                                                Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr183[0]);
                                                                                                next = useDelimiter3.hasNext() ? useDelimiter3.next() : str;
                                                                                                useDelimiter3.close();
                                                                                            } catch (IOException unused3) {
                                                                                            }
                                                                                        } catch (IOException unused4) {
                                                                                        }
                                                                                    } catch (IOException unused5) {
                                                                                        i44 = i41;
                                                                                    }
                                                                                    if (next.contains(str90)) {
                                                                                        int i756 = ((i755 | 170) << 1) - (i755 ^ 170);
                                                                                        i42 = (i36 | i756) & (~(i36 & i756));
                                                                                        break loop8;
                                                                                    }
                                                                                    i754 = ((i754 | 1) << 1) - (i754 ^ 1);
                                                                                    i732 = i755;
                                                                                    i41 = i44;
                                                                                    strArr52 = strArr6;
                                                                                    str89 = str2;
                                                                                } else {
                                                                                    i44 = i41;
                                                                                }
                                                                                strArr6 = strArr52;
                                                                                str2 = str89;
                                                                                i754 = ((i754 | 1) << 1) - (i754 ^ 1);
                                                                                i732 = i755;
                                                                                i41 = i44;
                                                                                strArr52 = strArr6;
                                                                                str89 = str2;
                                                                            }
                                                                            i41++;
                                                                            i40 = 5;
                                                                            i39 = 1;
                                                                            c11 = 0;
                                                                        }
                                                                        int i757 = (i36 & (~i360)) | (i360 & i88);
                                                                        int i758 = -i757;
                                                                        int i759 = ((i757 & i758) | (i757 ^ i758)) >> 31;
                                                                        int i760 = i42 & (~i759);
                                                                        int i761 = i360 & i759;
                                                                        int i762 = (i761 & i760) | (i760 ^ i761);
                                                                        int i763 = -View.resolveSizeAndState(0, 0, 0);
                                                                        int i764 = -View.resolveSize(0, 0);
                                                                        int i765 = (i764 & 2088) + (i764 | 2088);
                                                                        int combineMeasuredStates5 = View.combineMeasuredStates(0, 0);
                                                                        int i766 = (combineMeasuredStates5 ^ 13) + ((combineMeasuredStates5 & 13) << 1);
                                                                        Object[] objArr184 = new Object[1];
                                                                        charlie((char) ((i763 & 54118) + (i763 | 54118)), i765, i766, objArr184);
                                                                        String str91 = (String) objArr184[0];
                                                                        int i767 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                        Object[] objArr185 = new Object[1];
                                                                        charlie((char) ((i767 & 46172) + (i767 | 46172)), 2101 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7 - (~(-TextUtils.indexOf(str, str, 0))), objArr185);
                                                                        String str92 = (String) objArr185[0];
                                                                        file3 = new File(str91);
                                                                        if (file3.exists()) {
                                                                            int i768 = foxtrot;
                                                                            int i769 = ((i768 | 101) << 1) - (i768 ^ 101);
                                                                            echo = i769 % 128;
                                                                            if (i769 % 2 != 0) {
                                                                                i34 = i36;
                                                                                try {
                                                                                    file3.isFile();
                                                                                    throw null;
                                                                                } catch (Exception unused6) {
                                                                                    i43 = (i34 & (-152)) | (i88 & 151);
                                                                                    int i770 = (~(i34 & i762)) & (i34 | i762);
                                                                                    int i771 = -i770;
                                                                                    int i772 = ((i770 & i771) | (i770 ^ i771)) >> 31;
                                                                                    int i773 = i43 & (~i772);
                                                                                    int i774 = i762 & i772;
                                                                                    int i775 = (i774 & i773) | (i773 ^ i774);
                                                                                    char size3 = (char) View.MeasureSpec.getSize(0);
                                                                                    int i776 = -View.resolveSize(0, 0);
                                                                                    Object[] objArr186 = new Object[1];
                                                                                    charlie(size3, (i776 ^ 2109) + ((i776 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr186);
                                                                                    Object[] objArr187 = {(String) objArr186[0]};
                                                                                    D88715 = uH18377.D8871(1979478258);
                                                                                    if (D88715 == null) {
                                                                                    }
                                                                                    long longValue18 = ((Long) ((Method) D88715).invoke(null, objArr187)).longValue();
                                                                                    long j127 = -1175882571;
                                                                                    long j128 = 46;
                                                                                    long j129 = longValue18 ^ j22;
                                                                                    long j130 = (int) Runtime.getRuntime().totalMemory();
                                                                                    long j131 = j130 ^ j22;
                                                                                    long j132 = (45 * (((j131 | j127) ^ j22) | ((j130 | (j127 ^ j22)) ^ j22) | j129)) + ((-45) * (((j129 | j130) ^ j22) | ((longValue18 | j127) ^ j22))) + ((-90) * (j127 | ((j129 | j131) ^ j22))) + (j128 * longValue18) + (j128 * j127) + 1950703877;
                                                                                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                                    int i777 = (((~((-1377974707) | elapsedCpuTime2)) | (-1479766179)) * 672) - 907921526;
                                                                                    int i778 = ~elapsedCpuTime2;
                                                                                    int i779 = ((int) (j132 >> c3)) & ((((~(1479766178 | i778)) | 33556752) * 672) + (((~(elapsedCpuTime2 | (-1479766179))) | (~(1377974706 | i778))) * (-672)) + i777);
                                                                                    int foxtrot9 = ((int) j132) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                                                                    int i780 = (((foxtrot9 & i779) | (i779 ^ foxtrot9)) * 263) ^ i34;
                                                                                    int i781 = (~(i34 & i775)) & (i34 | i775);
                                                                                    int i782 = -i781;
                                                                                    int i783 = ((i781 & i782) | (i781 ^ i782)) >> 31;
                                                                                    int i784 = i780 & (~i783);
                                                                                    int i785 = i775 & i783;
                                                                                    i347 = (i785 & i784) | (i784 ^ i785);
                                                                                    strArr3 = strArr5;
                                                                                    i349 = 1;
                                                                                    int[] iArr2 = new int[i349];
                                                                                    int[] iArr3 = new int[i349];
                                                                                    int i786 = i34 ^ i347;
                                                                                    iArr3[0] = i34;
                                                                                    iArr2[0] = i347;
                                                                                    Object[] objArr188 = new Object[4];
                                                                                    objArr188[0] = iArr2;
                                                                                    objArr188[i349] = iArr3;
                                                                                    objArr188[2] = new int[i349];
                                                                                    objArr188[3] = strArr3;
                                                                                    int i787 = (~((-197478579) | ao.ad.tango(249089754))) | 168116242;
                                                                                    int i788 = (((((r1 | 169689951) * 496) + (((i787 | (~((~r1) | 199052287))) * (-496)) + ((i787 * 992) - 1359795423))) - (~(-(-(((i786 | (-i786)) >> 31) & 16))))) - 1) + intValue3;
                                                                                    int i789 = i788 << 13;
                                                                                    int i790 = ((~i788) & i789) | ((~i789) & i788);
                                                                                    int i791 = i790 >>> 17;
                                                                                    int i792 = ((~i790) & i791) | ((~i791) & i790);
                                                                                    int i793 = i792 << 5;
                                                                                    ((int[]) objArr188[2])[0] = ((~i792) & i793) | ((~i793) & i792);
                                                                                    return objArr188;
                                                                                }
                                                                            }
                                                                            if (file3.isFile()) {
                                                                                try {
                                                                                    Scanner scanner4 = new Scanner(new FileInputStream(file3));
                                                                                    Object[] objArr189 = new Object[1];
                                                                                    charlie((char) (48122 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 369, 1 - (~TextUtils.getCapsMode(str, 0, 0)), objArr189);
                                                                                    Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr189[0]);
                                                                                    str = useDelimiter4.hasNext() ? useDelimiter4.next() : "";
                                                                                    useDelimiter4.close();
                                                                                } catch (IOException unused7) {
                                                                                }
                                                                                if (str.contains(str92)) {
                                                                                    i34 = i36;
                                                                                    i43 = i34 ^ 150;
                                                                                    int i7702 = (~(i34 & i762)) & (i34 | i762);
                                                                                    int i7712 = -i7702;
                                                                                    int i7722 = ((i7702 & i7712) | (i7702 ^ i7712)) >> 31;
                                                                                    int i7732 = i43 & (~i7722);
                                                                                    int i7742 = i762 & i7722;
                                                                                    int i7752 = (i7742 & i7732) | (i7732 ^ i7742);
                                                                                    char size32 = (char) View.MeasureSpec.getSize(0);
                                                                                    int i7762 = -View.resolveSize(0, 0);
                                                                                    Object[] objArr1862 = new Object[1];
                                                                                    charlie(size32, (i7762 ^ 2109) + ((i7762 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr1862);
                                                                                    Object[] objArr1872 = {(String) objArr1862[0]};
                                                                                    D88715 = uH18377.D8871(1979478258);
                                                                                    if (D88715 == null) {
                                                                                        byte b59 = (byte) (i5 & 10);
                                                                                        byte b60 = (byte) (b59 - 2);
                                                                                        Object[] objArr190 = new Object[1];
                                                                                        delta(b59, b60, (byte) (b60 + 1), objArr190);
                                                                                        D88715 = uH18377.setPivotYN16904(52 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2951, (char) (AndroidCharacter.getMirror('0') - '0'), -1438133721, false, (String) objArr190[0], new Class[]{cls});
                                                                                    }
                                                                                    long longValue182 = ((Long) ((Method) D88715).invoke(null, objArr1872)).longValue();
                                                                                    long j1272 = -1175882571;
                                                                                    long j1282 = 46;
                                                                                    long j1292 = longValue182 ^ j22;
                                                                                    long j1302 = (int) Runtime.getRuntime().totalMemory();
                                                                                    long j1312 = j1302 ^ j22;
                                                                                    long j1322 = (45 * (((j1312 | j1272) ^ j22) | ((j1302 | (j1272 ^ j22)) ^ j22) | j1292)) + ((-45) * (((j1292 | j1302) ^ j22) | ((longValue182 | j1272) ^ j22))) + ((-90) * (j1272 | ((j1292 | j1312) ^ j22))) + (j1282 * longValue182) + (j1282 * j1272) + 1950703877;
                                                                                    int elapsedCpuTime22 = (int) Process.getElapsedCpuTime();
                                                                                    int i7772 = (((~((-1377974707) | elapsedCpuTime22)) | (-1479766179)) * 672) - 907921526;
                                                                                    int i7782 = ~elapsedCpuTime22;
                                                                                    int i7792 = ((int) (j1322 >> c3)) & ((((~(1479766178 | i7782)) | 33556752) * 672) + (((~(elapsedCpuTime22 | (-1479766179))) | (~(1377974706 | i7782))) * (-672)) + i7772);
                                                                                    int foxtrot92 = ((int) j1322) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                                                                    int i7802 = (((foxtrot92 & i7792) | (i7792 ^ foxtrot92)) * 263) ^ i34;
                                                                                    int i7812 = (~(i34 & i7752)) & (i34 | i7752);
                                                                                    int i7822 = -i7812;
                                                                                    int i7832 = ((i7812 & i7822) | (i7812 ^ i7822)) >> 31;
                                                                                    int i7842 = i7802 & (~i7832);
                                                                                    int i7852 = i7752 & i7832;
                                                                                    i347 = (i7852 & i7842) | (i7842 ^ i7852);
                                                                                    strArr3 = strArr5;
                                                                                    i349 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                        i34 = i36;
                                                                        echo = (foxtrot + 53) % 128;
                                                                        i43 = i34;
                                                                        int i77022 = (~(i34 & i762)) & (i34 | i762);
                                                                        int i77122 = -i77022;
                                                                        int i77222 = ((i77022 & i77122) | (i77022 ^ i77122)) >> 31;
                                                                        int i77322 = i43 & (~i77222);
                                                                        int i77422 = i762 & i77222;
                                                                        int i77522 = (i77422 & i77322) | (i77322 ^ i77422);
                                                                        char size322 = (char) View.MeasureSpec.getSize(0);
                                                                        int i77622 = -View.resolveSize(0, 0);
                                                                        Object[] objArr18622 = new Object[1];
                                                                        charlie(size322, (i77622 ^ 2109) + ((i77622 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr18622);
                                                                        Object[] objArr18722 = {(String) objArr18622[0]};
                                                                        D88715 = uH18377.D8871(1979478258);
                                                                        if (D88715 == null) {
                                                                        }
                                                                        long longValue1822 = ((Long) ((Method) D88715).invoke(null, objArr18722)).longValue();
                                                                        long j12722 = -1175882571;
                                                                        long j12822 = 46;
                                                                        long j12922 = longValue1822 ^ j22;
                                                                        long j13022 = (int) Runtime.getRuntime().totalMemory();
                                                                        long j13122 = j13022 ^ j22;
                                                                        long j13222 = (45 * (((j13122 | j12722) ^ j22) | ((j13022 | (j12722 ^ j22)) ^ j22) | j12922)) + ((-45) * (((j12922 | j13022) ^ j22) | ((longValue1822 | j12722) ^ j22))) + ((-90) * (j12722 | ((j12922 | j13122) ^ j22))) + (j12822 * longValue1822) + (j12822 * j12722) + 1950703877;
                                                                        int elapsedCpuTime222 = (int) Process.getElapsedCpuTime();
                                                                        int i77722 = (((~((-1377974707) | elapsedCpuTime222)) | (-1479766179)) * 672) - 907921526;
                                                                        int i77822 = ~elapsedCpuTime222;
                                                                        int i77922 = ((int) (j13222 >> c3)) & ((((~(1479766178 | i77822)) | 33556752) * 672) + (((~(elapsedCpuTime222 | (-1479766179))) | (~(1377974706 | i77822))) * (-672)) + i77722);
                                                                        int foxtrot922 = ((int) j13222) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                                                        int i78022 = (((foxtrot922 & i77922) | (i77922 ^ foxtrot922)) * 263) ^ i34;
                                                                        int i78122 = (~(i34 & i77522)) & (i34 | i77522);
                                                                        int i78222 = -i78122;
                                                                        int i78322 = ((i78122 & i78222) | (i78122 ^ i78222)) >> 31;
                                                                        int i78422 = i78022 & (~i78322);
                                                                        int i78522 = i77522 & i78322;
                                                                        i347 = (i78522 & i78422) | (i78422 ^ i78522);
                                                                        strArr3 = strArr5;
                                                                        i349 = 1;
                                                                    }
                                                                    i699 = ((i701 | 1) << 1) - (i701 ^ 1);
                                                                    strArr4 = strArr5;
                                                                    strArr44 = strArr45;
                                                                    i700 = 19;
                                                                    i698 = 0;
                                                                    i697 = 1;
                                                                }
                                                                i45 = i701;
                                                                break;
                                                            }
                                                            strArr5 = strArr4;
                                                            i45 = -1;
                                                            int i794 = i45 + 130;
                                                            int i795 = (i794 & i88) | (i36 & (~i794));
                                                            int i796 = ~i45;
                                                            int i797 = (i796 | (-i796)) >> 31;
                                                            int i798 = i36 & (~i797);
                                                            int i799 = i795 & i797;
                                                            int i800 = (i799 & i798) | (i798 ^ i799);
                                                            int i801 = (i36 & (~i360)) | (i360 & i88);
                                                            int i802 = -i801;
                                                            int i803 = ((i801 & i802) | (i801 ^ i802)) >> 31;
                                                            int i804 = i800 & (~i803);
                                                            int i805 = i360 & i803;
                                                            i360 = (i805 & i804) | (i804 ^ i805);
                                                            foxtrot = (echo + 65) % 128;
                                                            int i7162 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                            Object[] objArr1722 = new Object[1];
                                                            charlie((char) (((i7162 | 1) << 1) - (i7162 ^ 1)), (Process.myTid() >> 22) + 1952, 12 - (~(-TextUtils.indexOf(str, str, 0, 0))), objArr1722);
                                                            String str832 = (String) objArr1722[0];
                                                            char myTid62 = (char) (Process.myTid() >> 22);
                                                            int i7172 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr1732 = new Object[1];
                                                            charlie(myTid62, (i7172 ^ 1966) + ((i7172 & 1966) << 1), 5 - (~TextUtils.indexOf((CharSequence) str, '0', 0)), objArr1732);
                                                            String[] strArr462 = {str832, (String) objArr1732[0]};
                                                            int i7182 = -Color.green(0);
                                                            int i7192 = 1971 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            int i7202 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            int i7212 = (i7202 & 15) + (i7202 | 15);
                                                            Object[] objArr1742 = new Object[1];
                                                            charlie((char) ((i7182 & 12498) + (i7182 | 12498)), i7192, i7212, objArr1742);
                                                            String str842 = (String) objArr1742[0];
                                                            char resolveSizeAndState52 = (char) View.resolveSizeAndState(0, 0, 0);
                                                            int i7222 = 1983 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                                            int i7232 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int i7242 = (i7232 ^ 19) + ((i7232 & 19) << 1);
                                                            Object[] objArr1752 = new Object[1];
                                                            charlie(resolveSizeAndState52, i7222, i7242, objArr1752);
                                                            String str852 = (String) objArr1752[0];
                                                            Object[] objArr1762 = new Object[1];
                                                            charlie((char) (51682 - (~(-TextUtils.lastIndexOf(str, '0', 0, 0)))), 2002 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1762);
                                                            String[] strArr472 = {str842, str852, (String) objArr1762[0]};
                                                            char lastIndexOf82 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 63789);
                                                            int i7252 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                            Object[] objArr1772 = new Object[1];
                                                            charlie(lastIndexOf82, (i7252 ^ 2017) + ((i7252 & 2017) << 1), Color.argb(0, 0, 0, 0) + 21, objArr1772);
                                                            String str862 = (String) objArr1772[0];
                                                            char c462 = (char) ((-2) - (~(-Process.getGidForName(str))));
                                                            int i7262 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i7272 = (i7262 & 2039) + (i7262 | 2039);
                                                            int i7282 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            int i7292 = (i7282 ^ 11) + ((i7282 & 11) << 1);
                                                            Object[] objArr1782 = new Object[1];
                                                            charlie(c462, i7272, i7292, objArr1782);
                                                            String[] strArr482 = {str862, (String) objArr1782[0]};
                                                            int i7302 = -(-Color.alpha(0));
                                                            int i7312 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr1792 = new Object[1];
                                                            charlie((char) ((i7302 ^ 62511) + ((i7302 & 62511) << 1)), (i7312 & 2050) + (i7312 | 2050), 11 - View.MeasureSpec.getSize(0), objArr1792);
                                                            String str872 = (String) objArr1792[0];
                                                            int i7322 = -1;
                                                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                                                            int i7332 = (bitsPerPixel2 ^ 590) + ((bitsPerPixel2 & 590) << 1);
                                                            int makeMeasureSpec42 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int i7342 = ((makeMeasureSpec42 | 6) << 1) - (makeMeasureSpec42 ^ 6);
                                                            Object[] objArr1802 = new Object[1];
                                                            charlie((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i7332, i7342, objArr1802);
                                                            String[] strArr492 = {str872, (String) objArr1802[0]};
                                                            char myPid62 = (char) (Process.myPid() >> 22);
                                                            int i7352 = -(-TextUtils.getOffsetAfter(str, 0));
                                                            int i7362 = ((i7352 | 2060) << 1) - (i7352 ^ 2060);
                                                            int blue52 = Color.blue(0);
                                                            int i7372 = ((blue52 | 28) << 1) - (blue52 ^ 28);
                                                            Object[] objArr1812 = new Object[1];
                                                            charlie(myPid62, i7362, i7372, objArr1812);
                                                            String str882 = (String) objArr1812[0];
                                                            int lastIndexOf92 = TextUtils.lastIndexOf(str, '0', 0);
                                                            int alpha162 = bh.alpha();
                                                            int i7382 = lastIndexOf92 * 370;
                                                            int i7392 = (i7382 & 370) + (i7382 | 370);
                                                            int i7402 = (lastIndexOf92 ^ 1) | (lastIndexOf92 & 1);
                                                            int i7412 = ~alpha162;
                                                            int i7422 = ((i7402 & i7412) | (i7402 ^ i7412)) * (-369);
                                                            int i7432 = (i7392 & i7422) + (i7422 | i7392);
                                                            int i7442 = ~lastIndexOf92;
                                                            int i7452 = (i7442 & i7412) | (i7442 ^ i7412);
                                                            int i7462 = ~i7452;
                                                            int i7472 = (i7432 - (~(-(-(((i7462 & 1) | (i7462 ^ 1)) * (-369)))))) - 1;
                                                            int i7482 = (~((lastIndexOf92 & alpha162) | (lastIndexOf92 ^ alpha162))) | (~(((-2) ^ lastIndexOf92) | ((-2) & lastIndexOf92)));
                                                            int i7492 = ~((i7452 ^ 1) | (i7452 & 1));
                                                            int i7502 = ((i7482 & i7492) | (i7482 ^ i7492)) * 369;
                                                            int deadChar62 = KeyEvent.getDeadChar(0, 0);
                                                            i39 = 1;
                                                            int i7512 = (deadChar62 ^ 2039) + ((deadChar62 & 2039) << 1);
                                                            int i7522 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                            int i7532 = (i7522 & 10) + (i7522 | 10);
                                                            Object[] objArr1822 = new Object[1];
                                                            charlie((char) ((i7472 & i7502) + (i7502 | i7472)), i7512, i7532, objArr1822);
                                                            c11 = 0;
                                                            i40 = 5;
                                                            String[][] strArr502 = {strArr462, strArr472, strArr482, strArr492, new String[]{str882, (String) objArr1822[0]}};
                                                            i41 = 0;
                                                            loop8: while (true) {
                                                                if (i41 < i40) {
                                                                }
                                                                i41++;
                                                                i40 = 5;
                                                                i39 = 1;
                                                                c11 = 0;
                                                            }
                                                            int i7572 = (i36 & (~i360)) | (i360 & i88);
                                                            int i7582 = -i7572;
                                                            int i7592 = ((i7572 & i7582) | (i7572 ^ i7582)) >> 31;
                                                            int i7602 = i42 & (~i7592);
                                                            int i7612 = i360 & i7592;
                                                            int i7622 = (i7612 & i7602) | (i7602 ^ i7612);
                                                            int i7632 = -View.resolveSizeAndState(0, 0, 0);
                                                            int i7642 = -View.resolveSize(0, 0);
                                                            int i7652 = (i7642 & 2088) + (i7642 | 2088);
                                                            int combineMeasuredStates52 = View.combineMeasuredStates(0, 0);
                                                            int i7662 = (combineMeasuredStates52 ^ 13) + ((combineMeasuredStates52 & 13) << 1);
                                                            Object[] objArr1842 = new Object[1];
                                                            charlie((char) ((i7632 & 54118) + (i7632 | 54118)), i7652, i7662, objArr1842);
                                                            String str912 = (String) objArr1842[0];
                                                            int i7672 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                            Object[] objArr1852 = new Object[1];
                                                            charlie((char) ((i7672 & 46172) + (i7672 | 46172)), 2101 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7 - (~(-TextUtils.indexOf(str, str, 0))), objArr1852);
                                                            String str922 = (String) objArr1852[0];
                                                            file3 = new File(str912);
                                                            if (file3.exists()) {
                                                            }
                                                            i34 = i36;
                                                            echo = (foxtrot + 53) % 128;
                                                            i43 = i34;
                                                            int i770222 = (~(i34 & i7622)) & (i34 | i7622);
                                                            int i771222 = -i770222;
                                                            int i772222 = ((i770222 & i771222) | (i770222 ^ i771222)) >> 31;
                                                            int i773222 = i43 & (~i772222);
                                                            int i774222 = i7622 & i772222;
                                                            int i775222 = (i774222 & i773222) | (i773222 ^ i774222);
                                                            char size3222 = (char) View.MeasureSpec.getSize(0);
                                                            int i776222 = -View.resolveSize(0, 0);
                                                            Object[] objArr186222 = new Object[1];
                                                            charlie(size3222, (i776222 ^ 2109) + ((i776222 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr186222);
                                                            Object[] objArr187222 = {(String) objArr186222[0]};
                                                            D88715 = uH18377.D8871(1979478258);
                                                            if (D88715 == null) {
                                                            }
                                                            long longValue18222 = ((Long) ((Method) D88715).invoke(null, objArr187222)).longValue();
                                                            long j127222 = -1175882571;
                                                            long j128222 = 46;
                                                            long j129222 = longValue18222 ^ j22;
                                                            long j130222 = (int) Runtime.getRuntime().totalMemory();
                                                            long j131222 = j130222 ^ j22;
                                                            long j132222 = (45 * (((j131222 | j127222) ^ j22) | ((j130222 | (j127222 ^ j22)) ^ j22) | j129222)) + ((-45) * (((j129222 | j130222) ^ j22) | ((longValue18222 | j127222) ^ j22))) + ((-90) * (j127222 | ((j129222 | j131222) ^ j22))) + (j128222 * longValue18222) + (j128222 * j127222) + 1950703877;
                                                            int elapsedCpuTime2222 = (int) Process.getElapsedCpuTime();
                                                            int i777222 = (((~((-1377974707) | elapsedCpuTime2222)) | (-1479766179)) * 672) - 907921526;
                                                            int i778222 = ~elapsedCpuTime2222;
                                                            int i779222 = ((int) (j132222 >> c3)) & ((((~(1479766178 | i778222)) | 33556752) * 672) + (((~(elapsedCpuTime2222 | (-1479766179))) | (~(1377974706 | i778222))) * (-672)) + i777222);
                                                            int foxtrot9222 = ((int) j132222) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                                            int i780222 = (((foxtrot9222 & i779222) | (i779222 ^ foxtrot9222)) * 263) ^ i34;
                                                            int i781222 = (~(i34 & i775222)) & (i34 | i775222);
                                                            int i782222 = -i781222;
                                                            int i783222 = ((i781222 & i782222) | (i781222 ^ i782222)) >> 31;
                                                            int i784222 = i780222 & (~i783222);
                                                            int i785222 = i775222 & i783222;
                                                            i347 = (i785222 & i784222) | (i784222 ^ i785222);
                                                            strArr3 = strArr5;
                                                            i349 = 1;
                                                        }
                                                    }
                                                    strArr5 = strArr4;
                                                    echo = (foxtrot + 7) % 128;
                                                    int i71622 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    Object[] objArr17222 = new Object[1];
                                                    charlie((char) (((i71622 | 1) << 1) - (i71622 ^ 1)), (Process.myTid() >> 22) + 1952, 12 - (~(-TextUtils.indexOf(str, str, 0, 0))), objArr17222);
                                                    String str8322 = (String) objArr17222[0];
                                                    char myTid622 = (char) (Process.myTid() >> 22);
                                                    int i71722 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    Object[] objArr17322 = new Object[1];
                                                    charlie(myTid622, (i71722 ^ 1966) + ((i71722 & 1966) << 1), 5 - (~TextUtils.indexOf((CharSequence) str, '0', 0)), objArr17322);
                                                    String[] strArr4622 = {str8322, (String) objArr17322[0]};
                                                    int i71822 = -Color.green(0);
                                                    int i71922 = 1971 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    int i72022 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int i72122 = (i72022 & 15) + (i72022 | 15);
                                                    Object[] objArr17422 = new Object[1];
                                                    charlie((char) ((i71822 & 12498) + (i71822 | 12498)), i71922, i72122, objArr17422);
                                                    String str8422 = (String) objArr17422[0];
                                                    char resolveSizeAndState522 = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int i72222 = 1983 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                                    int i72322 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i72422 = (i72322 ^ 19) + ((i72322 & 19) << 1);
                                                    Object[] objArr17522 = new Object[1];
                                                    charlie(resolveSizeAndState522, i72222, i72422, objArr17522);
                                                    String str8522 = (String) objArr17522[0];
                                                    Object[] objArr17622 = new Object[1];
                                                    charlie((char) (51682 - (~(-TextUtils.lastIndexOf(str, '0', 0, 0)))), 2002 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr17622);
                                                    String[] strArr4722 = {str8422, str8522, (String) objArr17622[0]};
                                                    char lastIndexOf822 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 63789);
                                                    int i72522 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                    Object[] objArr17722 = new Object[1];
                                                    charlie(lastIndexOf822, (i72522 ^ 2017) + ((i72522 & 2017) << 1), Color.argb(0, 0, 0, 0) + 21, objArr17722);
                                                    String str8622 = (String) objArr17722[0];
                                                    char c4622 = (char) ((-2) - (~(-Process.getGidForName(str))));
                                                    int i72622 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i72722 = (i72622 & 2039) + (i72622 | 2039);
                                                    int i72822 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    int i72922 = (i72822 ^ 11) + ((i72822 & 11) << 1);
                                                    Object[] objArr17822 = new Object[1];
                                                    charlie(c4622, i72722, i72922, objArr17822);
                                                    String[] strArr4822 = {str8622, (String) objArr17822[0]};
                                                    int i73022 = -(-Color.alpha(0));
                                                    int i73122 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    Object[] objArr17922 = new Object[1];
                                                    charlie((char) ((i73022 ^ 62511) + ((i73022 & 62511) << 1)), (i73122 & 2050) + (i73122 | 2050), 11 - View.MeasureSpec.getSize(0), objArr17922);
                                                    String str8722 = (String) objArr17922[0];
                                                    int i73222 = -1;
                                                    int bitsPerPixel22 = ImageFormat.getBitsPerPixel(0);
                                                    int i73322 = (bitsPerPixel22 ^ 590) + ((bitsPerPixel22 & 590) << 1);
                                                    int makeMeasureSpec422 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int i73422 = ((makeMeasureSpec422 | 6) << 1) - (makeMeasureSpec422 ^ 6);
                                                    Object[] objArr18022 = new Object[1];
                                                    charlie((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i73322, i73422, objArr18022);
                                                    String[] strArr4922 = {str8722, (String) objArr18022[0]};
                                                    char myPid622 = (char) (Process.myPid() >> 22);
                                                    int i73522 = -(-TextUtils.getOffsetAfter(str, 0));
                                                    int i73622 = ((i73522 | 2060) << 1) - (i73522 ^ 2060);
                                                    int blue522 = Color.blue(0);
                                                    int i73722 = ((blue522 | 28) << 1) - (blue522 ^ 28);
                                                    Object[] objArr18122 = new Object[1];
                                                    charlie(myPid622, i73622, i73722, objArr18122);
                                                    String str8822 = (String) objArr18122[0];
                                                    int lastIndexOf922 = TextUtils.lastIndexOf(str, '0', 0);
                                                    int alpha1622 = bh.alpha();
                                                    int i73822 = lastIndexOf922 * 370;
                                                    int i73922 = (i73822 & 370) + (i73822 | 370);
                                                    int i74022 = (lastIndexOf922 ^ 1) | (lastIndexOf922 & 1);
                                                    int i74122 = ~alpha1622;
                                                    int i74222 = ((i74022 & i74122) | (i74022 ^ i74122)) * (-369);
                                                    int i74322 = (i73922 & i74222) + (i74222 | i73922);
                                                    int i74422 = ~lastIndexOf922;
                                                    int i74522 = (i74422 & i74122) | (i74422 ^ i74122);
                                                    int i74622 = ~i74522;
                                                    int i74722 = (i74322 - (~(-(-(((i74622 & 1) | (i74622 ^ 1)) * (-369)))))) - 1;
                                                    int i74822 = (~((lastIndexOf922 & alpha1622) | (lastIndexOf922 ^ alpha1622))) | (~(((-2) ^ lastIndexOf922) | ((-2) & lastIndexOf922)));
                                                    int i74922 = ~((i74522 ^ 1) | (i74522 & 1));
                                                    int i75022 = ((i74822 & i74922) | (i74822 ^ i74922)) * 369;
                                                    int deadChar622 = KeyEvent.getDeadChar(0, 0);
                                                    i39 = 1;
                                                    int i75122 = (deadChar622 ^ 2039) + ((deadChar622 & 2039) << 1);
                                                    int i75222 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    int i75322 = (i75222 & 10) + (i75222 | 10);
                                                    Object[] objArr18222 = new Object[1];
                                                    charlie((char) ((i74722 & i75022) + (i75022 | i74722)), i75122, i75322, objArr18222);
                                                    c11 = 0;
                                                    i40 = 5;
                                                    String[][] strArr5022 = {strArr4622, strArr4722, strArr4822, strArr4922, new String[]{str8822, (String) objArr18222[0]}};
                                                    i41 = 0;
                                                    loop8: while (true) {
                                                        if (i41 < i40) {
                                                        }
                                                        i41++;
                                                        i40 = 5;
                                                        i39 = 1;
                                                        c11 = 0;
                                                    }
                                                    int i75722 = (i36 & (~i360)) | (i360 & i88);
                                                    int i75822 = -i75722;
                                                    int i75922 = ((i75722 & i75822) | (i75722 ^ i75822)) >> 31;
                                                    int i76022 = i42 & (~i75922);
                                                    int i76122 = i360 & i75922;
                                                    int i76222 = (i76122 & i76022) | (i76022 ^ i76122);
                                                    int i76322 = -View.resolveSizeAndState(0, 0, 0);
                                                    int i76422 = -View.resolveSize(0, 0);
                                                    int i76522 = (i76422 & 2088) + (i76422 | 2088);
                                                    int combineMeasuredStates522 = View.combineMeasuredStates(0, 0);
                                                    int i76622 = (combineMeasuredStates522 ^ 13) + ((combineMeasuredStates522 & 13) << 1);
                                                    Object[] objArr18422 = new Object[1];
                                                    charlie((char) ((i76322 & 54118) + (i76322 | 54118)), i76522, i76622, objArr18422);
                                                    String str9122 = (String) objArr18422[0];
                                                    int i76722 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    Object[] objArr18522 = new Object[1];
                                                    charlie((char) ((i76722 & 46172) + (i76722 | 46172)), 2101 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7 - (~(-TextUtils.indexOf(str, str, 0))), objArr18522);
                                                    String str9222 = (String) objArr18522[0];
                                                    file3 = new File(str9122);
                                                    if (file3.exists()) {
                                                    }
                                                    i34 = i36;
                                                    echo = (foxtrot + 53) % 128;
                                                    i43 = i34;
                                                    int i7702222 = (~(i34 & i76222)) & (i34 | i76222);
                                                    int i7712222 = -i7702222;
                                                    int i7722222 = ((i7702222 & i7712222) | (i7702222 ^ i7712222)) >> 31;
                                                    int i7732222 = i43 & (~i7722222);
                                                    int i7742222 = i76222 & i7722222;
                                                    int i7752222 = (i7742222 & i7732222) | (i7732222 ^ i7742222);
                                                    char size32222 = (char) View.MeasureSpec.getSize(0);
                                                    int i7762222 = -View.resolveSize(0, 0);
                                                    Object[] objArr1862222 = new Object[1];
                                                    charlie(size32222, (i7762222 ^ 2109) + ((i7762222 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr1862222);
                                                    Object[] objArr1872222 = {(String) objArr1862222[0]};
                                                    D88715 = uH18377.D8871(1979478258);
                                                    if (D88715 == null) {
                                                    }
                                                    long longValue182222 = ((Long) ((Method) D88715).invoke(null, objArr1872222)).longValue();
                                                    long j1272222 = -1175882571;
                                                    long j1282222 = 46;
                                                    long j1292222 = longValue182222 ^ j22;
                                                    long j1302222 = (int) Runtime.getRuntime().totalMemory();
                                                    long j1312222 = j1302222 ^ j22;
                                                    long j1322222 = (45 * (((j1312222 | j1272222) ^ j22) | ((j1302222 | (j1272222 ^ j22)) ^ j22) | j1292222)) + ((-45) * (((j1292222 | j1302222) ^ j22) | ((longValue182222 | j1272222) ^ j22))) + ((-90) * (j1272222 | ((j1292222 | j1312222) ^ j22))) + (j1282222 * longValue182222) + (j1282222 * j1272222) + 1950703877;
                                                    int elapsedCpuTime22222 = (int) Process.getElapsedCpuTime();
                                                    int i7772222 = (((~((-1377974707) | elapsedCpuTime22222)) | (-1479766179)) * 672) - 907921526;
                                                    int i7782222 = ~elapsedCpuTime22222;
                                                    int i7792222 = ((int) (j1322222 >> c3)) & ((((~(1479766178 | i7782222)) | 33556752) * 672) + (((~(elapsedCpuTime22222 | (-1479766179))) | (~(1377974706 | i7782222))) * (-672)) + i7772222);
                                                    int foxtrot92222 = ((int) j1322222) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                                    int i7802222 = (((foxtrot92222 & i7792222) | (i7792222 ^ foxtrot92222)) * 263) ^ i34;
                                                    int i7812222 = (~(i34 & i7752222)) & (i34 | i7752222);
                                                    int i7822222 = -i7812222;
                                                    int i7832222 = ((i7812222 & i7822222) | (i7812222 ^ i7822222)) >> 31;
                                                    int i7842222 = i7802222 & (~i7832222);
                                                    int i7852222 = i7752222 & i7832222;
                                                    i347 = (i7852222 & i7842222) | (i7842222 ^ i7852222);
                                                    strArr3 = strArr5;
                                                    i349 = 1;
                                                }
                                            } else {
                                                i36 = intValue;
                                            }
                                            z2 = false;
                                            if (z2) {
                                            }
                                            char mode42 = (char) View.MeasureSpec.getMode(i37);
                                            int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                            Object[] objArr1412 = new Object[1];
                                            charlie(mode42, (maximumDrawingCacheSize3 & 891) + (maximumDrawingCacheSize3 | 891), 15 - (~(-TextUtils.getOffsetAfter(str, i37))), objArr1412);
                                            Object[] objArr1422 = new Object[1];
                                            objArr1422[i37] = (String) objArr1412[i37];
                                            D88714 = uH18377.D8871(i14);
                                            if (D88714 == null) {
                                            }
                                            invoke = ((Method) D88714).invoke(null, objArr1422);
                                            if (invoke != null) {
                                            }
                                            if (i38 != 1986687685) {
                                            }
                                            strArr5 = strArr4;
                                            echo = (foxtrot + 7) % 128;
                                            int i716222 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            Object[] objArr172222 = new Object[1];
                                            charlie((char) (((i716222 | 1) << 1) - (i716222 ^ 1)), (Process.myTid() >> 22) + 1952, 12 - (~(-TextUtils.indexOf(str, str, 0, 0))), objArr172222);
                                            String str83222 = (String) objArr172222[0];
                                            char myTid6222 = (char) (Process.myTid() >> 22);
                                            int i717222 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            Object[] objArr173222 = new Object[1];
                                            charlie(myTid6222, (i717222 ^ 1966) + ((i717222 & 1966) << 1), 5 - (~TextUtils.indexOf((CharSequence) str, '0', 0)), objArr173222);
                                            String[] strArr46222 = {str83222, (String) objArr173222[0]};
                                            int i718222 = -Color.green(0);
                                            int i719222 = 1971 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            int i720222 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i721222 = (i720222 & 15) + (i720222 | 15);
                                            Object[] objArr174222 = new Object[1];
                                            charlie((char) ((i718222 & 12498) + (i718222 | 12498)), i719222, i721222, objArr174222);
                                            String str84222 = (String) objArr174222[0];
                                            char resolveSizeAndState5222 = (char) View.resolveSizeAndState(0, 0, 0);
                                            int i722222 = 1983 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                            int i723222 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int i724222 = (i723222 ^ 19) + ((i723222 & 19) << 1);
                                            Object[] objArr175222 = new Object[1];
                                            charlie(resolveSizeAndState5222, i722222, i724222, objArr175222);
                                            String str85222 = (String) objArr175222[0];
                                            Object[] objArr176222 = new Object[1];
                                            charlie((char) (51682 - (~(-TextUtils.lastIndexOf(str, '0', 0, 0)))), 2002 - (~(-TextUtils.indexOf((CharSequence) str, '0'))), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr176222);
                                            String[] strArr47222 = {str84222, str85222, (String) objArr176222[0]};
                                            char lastIndexOf8222 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 63789);
                                            int i725222 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            Object[] objArr177222 = new Object[1];
                                            charlie(lastIndexOf8222, (i725222 ^ 2017) + ((i725222 & 2017) << 1), Color.argb(0, 0, 0, 0) + 21, objArr177222);
                                            String str86222 = (String) objArr177222[0];
                                            char c46222 = (char) ((-2) - (~(-Process.getGidForName(str))));
                                            int i726222 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i727222 = (i726222 & 2039) + (i726222 | 2039);
                                            int i728222 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            int i729222 = (i728222 ^ 11) + ((i728222 & 11) << 1);
                                            Object[] objArr178222 = new Object[1];
                                            charlie(c46222, i727222, i729222, objArr178222);
                                            String[] strArr48222 = {str86222, (String) objArr178222[0]};
                                            int i730222 = -(-Color.alpha(0));
                                            int i731222 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            Object[] objArr179222 = new Object[1];
                                            charlie((char) ((i730222 ^ 62511) + ((i730222 & 62511) << 1)), (i731222 & 2050) + (i731222 | 2050), 11 - View.MeasureSpec.getSize(0), objArr179222);
                                            String str87222 = (String) objArr179222[0];
                                            int i732222 = -1;
                                            int bitsPerPixel222 = ImageFormat.getBitsPerPixel(0);
                                            int i733222 = (bitsPerPixel222 ^ 590) + ((bitsPerPixel222 & 590) << 1);
                                            int makeMeasureSpec4222 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i734222 = ((makeMeasureSpec4222 | 6) << 1) - (makeMeasureSpec4222 ^ 6);
                                            Object[] objArr180222 = new Object[1];
                                            charlie((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i733222, i734222, objArr180222);
                                            String[] strArr49222 = {str87222, (String) objArr180222[0]};
                                            char myPid6222 = (char) (Process.myPid() >> 22);
                                            int i735222 = -(-TextUtils.getOffsetAfter(str, 0));
                                            int i736222 = ((i735222 | 2060) << 1) - (i735222 ^ 2060);
                                            int blue5222 = Color.blue(0);
                                            int i737222 = ((blue5222 | 28) << 1) - (blue5222 ^ 28);
                                            Object[] objArr181222 = new Object[1];
                                            charlie(myPid6222, i736222, i737222, objArr181222);
                                            String str88222 = (String) objArr181222[0];
                                            int lastIndexOf9222 = TextUtils.lastIndexOf(str, '0', 0);
                                            int alpha16222 = bh.alpha();
                                            int i738222 = lastIndexOf9222 * 370;
                                            int i739222 = (i738222 & 370) + (i738222 | 370);
                                            int i740222 = (lastIndexOf9222 ^ 1) | (lastIndexOf9222 & 1);
                                            int i741222 = ~alpha16222;
                                            int i742222 = ((i740222 & i741222) | (i740222 ^ i741222)) * (-369);
                                            int i743222 = (i739222 & i742222) + (i742222 | i739222);
                                            int i744222 = ~lastIndexOf9222;
                                            int i745222 = (i744222 & i741222) | (i744222 ^ i741222);
                                            int i746222 = ~i745222;
                                            int i747222 = (i743222 - (~(-(-(((i746222 & 1) | (i746222 ^ 1)) * (-369)))))) - 1;
                                            int i748222 = (~((lastIndexOf9222 & alpha16222) | (lastIndexOf9222 ^ alpha16222))) | (~(((-2) ^ lastIndexOf9222) | ((-2) & lastIndexOf9222)));
                                            int i749222 = ~((i745222 ^ 1) | (i745222 & 1));
                                            int i750222 = ((i748222 & i749222) | (i748222 ^ i749222)) * 369;
                                            int deadChar6222 = KeyEvent.getDeadChar(0, 0);
                                            i39 = 1;
                                            int i751222 = (deadChar6222 ^ 2039) + ((deadChar6222 & 2039) << 1);
                                            int i752222 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                            int i753222 = (i752222 & 10) + (i752222 | 10);
                                            Object[] objArr182222 = new Object[1];
                                            charlie((char) ((i747222 & i750222) + (i750222 | i747222)), i751222, i753222, objArr182222);
                                            c11 = 0;
                                            i40 = 5;
                                            String[][] strArr50222 = {strArr46222, strArr47222, strArr48222, strArr49222, new String[]{str88222, (String) objArr182222[0]}};
                                            i41 = 0;
                                            loop8: while (true) {
                                                if (i41 < i40) {
                                                }
                                                i41++;
                                                i40 = 5;
                                                i39 = 1;
                                                c11 = 0;
                                            }
                                            int i757222 = (i36 & (~i360)) | (i360 & i88);
                                            int i758222 = -i757222;
                                            int i759222 = ((i757222 & i758222) | (i757222 ^ i758222)) >> 31;
                                            int i760222 = i42 & (~i759222);
                                            int i761222 = i360 & i759222;
                                            int i762222 = (i761222 & i760222) | (i760222 ^ i761222);
                                            int i763222 = -View.resolveSizeAndState(0, 0, 0);
                                            int i764222 = -View.resolveSize(0, 0);
                                            int i765222 = (i764222 & 2088) + (i764222 | 2088);
                                            int combineMeasuredStates5222 = View.combineMeasuredStates(0, 0);
                                            int i766222 = (combineMeasuredStates5222 ^ 13) + ((combineMeasuredStates5222 & 13) << 1);
                                            Object[] objArr184222 = new Object[1];
                                            charlie((char) ((i763222 & 54118) + (i763222 | 54118)), i765222, i766222, objArr184222);
                                            String str91222 = (String) objArr184222[0];
                                            int i767222 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            Object[] objArr185222 = new Object[1];
                                            charlie((char) ((i767222 & 46172) + (i767222 | 46172)), 2101 - (ViewConfiguration.getFadingEdgeLength() >> 16), 7 - (~(-TextUtils.indexOf(str, str, 0))), objArr185222);
                                            String str92222 = (String) objArr185222[0];
                                            file3 = new File(str91222);
                                            if (file3.exists()) {
                                            }
                                            i34 = i36;
                                            echo = (foxtrot + 53) % 128;
                                            i43 = i34;
                                            int i77022222 = (~(i34 & i762222)) & (i34 | i762222);
                                            int i77122222 = -i77022222;
                                            int i77222222 = ((i77022222 & i77122222) | (i77022222 ^ i77122222)) >> 31;
                                            int i77322222 = i43 & (~i77222222);
                                            int i77422222 = i762222 & i77222222;
                                            int i77522222 = (i77422222 & i77322222) | (i77322222 ^ i77422222);
                                            char size322222 = (char) View.MeasureSpec.getSize(0);
                                            int i77622222 = -View.resolveSize(0, 0);
                                            Object[] objArr18622222 = new Object[1];
                                            charlie(size322222, (i77622222 ^ 2109) + ((i77622222 & 2109) << 1), Drawable.resolveOpacity(0, 0) + 47, objArr18622222);
                                            Object[] objArr18722222 = {(String) objArr18622222[0]};
                                            D88715 = uH18377.D8871(1979478258);
                                            if (D88715 == null) {
                                            }
                                            long longValue1822222 = ((Long) ((Method) D88715).invoke(null, objArr18722222)).longValue();
                                            long j12722222 = -1175882571;
                                            long j12822222 = 46;
                                            long j12922222 = longValue1822222 ^ j22;
                                            long j13022222 = (int) Runtime.getRuntime().totalMemory();
                                            long j13122222 = j13022222 ^ j22;
                                            long j13222222 = (45 * (((j13122222 | j12722222) ^ j22) | ((j13022222 | (j12722222 ^ j22)) ^ j22) | j12922222)) + ((-45) * (((j12922222 | j13022222) ^ j22) | ((longValue1822222 | j12722222) ^ j22))) + ((-90) * (j12722222 | ((j12922222 | j13122222) ^ j22))) + (j12822222 * longValue1822222) + (j12822222 * j12722222) + 1950703877;
                                            int elapsedCpuTime222222 = (int) Process.getElapsedCpuTime();
                                            int i77722222 = (((~((-1377974707) | elapsedCpuTime222222)) | (-1479766179)) * 672) - 907921526;
                                            int i77822222 = ~elapsedCpuTime222222;
                                            int i77922222 = ((int) (j13222222 >> c3)) & ((((~(1479766178 | i77822222)) | 33556752) * 672) + (((~(elapsedCpuTime222222 | (-1479766179))) | (~(1377974706 | i77822222))) * (-672)) + i77722222);
                                            int foxtrot922222 = ((int) j13222222) & A0.z.foxtrot((~((int) Runtime.getRuntime().totalMemory())) | 1777695219, -828, (((~r3) | 1080045666) * (-828)) - 1754753727, 1242140368);
                                            int i78022222 = (((foxtrot922222 & i77922222) | (i77922222 ^ foxtrot922222)) * 263) ^ i34;
                                            int i78122222 = (~(i34 & i77522222)) & (i34 | i77522222);
                                            int i78222222 = -i78122222;
                                            int i78322222 = ((i78122222 & i78222222) | (i78122222 ^ i78222222)) >> 31;
                                            int i78422222 = i78022222 & (~i78322222);
                                            int i78522222 = i77522222 & i78322222;
                                            i347 = (i78522222 & i78422222) | (i78422222 ^ i78522222);
                                            strArr3 = strArr5;
                                            i349 = 1;
                                        } else {
                                            i34 = intValue;
                                            strArr3 = null;
                                        }
                                        int[] iArr22 = new int[i349];
                                        int[] iArr32 = new int[i349];
                                        int i7862 = i34 ^ i347;
                                        iArr32[0] = i34;
                                        iArr22[0] = i347;
                                        Object[] objArr1882 = new Object[4];
                                        objArr1882[0] = iArr22;
                                        objArr1882[i349] = iArr32;
                                        objArr1882[2] = new int[i349];
                                        objArr1882[3] = strArr3;
                                        int i7872 = (~((-197478579) | ao.ad.tango(249089754))) | 168116242;
                                        int i7882 = (((((r1 | 169689951) * 496) + (((i7872 | (~((~r1) | 199052287))) * (-496)) + ((i7872 * 992) - 1359795423))) - (~(-(-(((i7862 | (-i7862)) >> 31) & 16))))) - 1) + intValue3;
                                        int i7892 = i7882 << 13;
                                        int i7902 = ((~i7882) & i7892) | ((~i7892) & i7882);
                                        int i7912 = i7902 >>> 17;
                                        int i7922 = ((~i7902) & i7912) | ((~i7912) & i7902);
                                        int i7932 = i7922 << 5;
                                        ((int[]) objArr1882[2])[0] = ((~i7922) & i7932) | ((~i7932) & i7922);
                                        return objArr1882;
                                    }
                                }
                            }
                            int i806 = foxtrot;
                            echo = ((i806 & 99) + (i806 | 99)) % 128;
                            Object[] objArr191 = new Object[1];
                            charlie((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 594 - (~(-TextUtils.indexOf(str, str, 0, 0))), 12 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr191);
                            String str93 = (String) objArr191[0];
                            char alpha17 = (char) (Color.alpha(0) + 52371);
                            int gidForName4 = Process.getGidForName(str);
                            int alpha18 = bh.alpha();
                            int i807 = ~gidForName4;
                            int i808 = ~((i807 & (-610)) | (i807 ^ (-610)));
                            int i809 = ~((-610) | (~alpha18));
                            int i810 = (((i808 ^ i809) | (i809 & i808)) * 446) + ((gidForName4 * (-445)) - 271005);
                            int i811 = ((-610) & gidForName4) | ((-610) ^ gidForName4);
                            int i812 = ((~((i811 & alpha18) | (i811 ^ alpha18))) | (~((i807 ^ 609) | (i807 & 609)))) * 446;
                            int i813 = (i810 & i812) + (i812 | i810);
                            int i814 = i808 * 446;
                            Object[] objArr192 = new Object[1];
                            charlie(alpha17, ((i813 | i814) << 1) - (i814 ^ i813), 8 - TextUtils.lastIndexOf(str, '0'), objArr192);
                            Object[] objArr193 = {str93, (String) objArr192[0]};
                            D88712 = uH18377.D8871(1214576837);
                            if (D88712 == null) {
                                int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
                                int i815 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3314;
                                char offsetBefore2 = (char) TextUtils.getOffsetBefore(str, 0);
                                byte b61 = (byte) 0;
                                byte b62 = b61;
                                Object[] objArr194 = new Object[1];
                                delta(b61, b62, b62, objArr194);
                                D88712 = uH18377.setPivotYN16904(maximumFlingVelocity2, i815, offsetBefore2, -1746970096, false, (String) objArr194[0], new Class[]{cls, cls});
                            }
                            long longValue19 = ((Long) ((Method) D88712).invoke(null, objArr193)).longValue();
                            long j133 = -1013007585;
                            long j134 = -159;
                            long j135 = 160;
                            i23 = i302;
                            long romeo8 = ao.ad.romeo() ^ j22;
                            long j136 = (((((romeo8 | (longValue19 ^ j22)) ^ j22) | j133) * j135) + (((-160) * (((romeo8 | j133) ^ j22) | ((j133 | longValue19) ^ j22))) + (((longValue19 | (j133 ^ j22)) * j135) + ((j134 * longValue19) + (j134 * j133))))) - 534630753;
                            int i816 = ~((int) Runtime.getRuntime().maxMemory());
                            foxtrot2 = ((int) (j136 >> c3)) & A0.z.foxtrot((~(i816 | (-1567739171))) | 88163618, 933, (((~(130512759 | i816)) | (-1567739171)) * (-933)) + 1811107944, 857042889);
                            int myTid7 = Process.myTid();
                            foxtrot3 = ((int) j136) & A0.z.foxtrot((~((~myTid7) | (-4292865))) | (-2062540667), 576, (((~((-314803561) | myTid7)) | 310510696) * 576) + 1771465493, -1534465536);
                            if (((foxtrot3 & foxtrot2) | (foxtrot2 ^ foxtrot3)) != 0) {
                                int i817 = foxtrot;
                                int i818 = ((i817 | 101) << 1) - (i817 ^ 101);
                                echo = i818 % 128;
                                if (i818 % 2 != 0) {
                                    i25 = ~(intValue & 28096);
                                    i26 = intValue | 28096;
                                } else {
                                    i25 = ~(intValue & 261);
                                    i26 = intValue | 261;
                                }
                                i24 = i26 & i25;
                            } else {
                                i24 = intValue;
                            }
                            int i3142 = (~(intValue & i23)) & (intValue | i23);
                            int i3152 = -i3142;
                            int i3162 = ((i3142 & i3152) | (i3142 ^ i3152)) >> 31;
                            i27 = (i3162 & i23) | (i24 & (~i3162));
                            if ((intValue2 & 8) != 0) {
                            }
                            int capsMode22 = TextUtils.getCapsMode(str, 0, 0);
                            int combineMeasuredStates32 = View.combineMeasuredStates(0, 0);
                            Object[] objArr612 = new Object[1];
                            charlie((char) ((capsMode22 ^ 57870) + ((capsMode22 & 57870) << 1)), (combineMeasuredStates32 & 739) + (combineMeasuredStates32 | 739), 40 - TextUtils.lastIndexOf(str, '0', 0), objArr612);
                            String str322 = (String) objArr612[0];
                            c10 = 0;
                            i28 = 1;
                            Object[] objArr622 = new Object[1];
                            charlie((char) (58158 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 780, 29 - (~(-TextUtils.getOffsetAfter(str, 0))), objArr622);
                            strArr2 = new String[]{str322, (String) objArr622[0]};
                            i29 = 0;
                            while (true) {
                                if (i29 < 2) {
                                }
                                i29 = (i29 ^ 1) + ((i29 & 1) << 1);
                                i27 = i30;
                                strArr2 = strArr11;
                                c10 = 0;
                                i28 = 1;
                            }
                            int i3422 = (~(intValue & i30)) & (intValue | i30);
                            int i3432 = -i3422;
                            int i3442 = ((i3422 & i3432) | (i3422 ^ i3432)) >> 31;
                            int i3452 = i31 & (~i3442);
                            int i3462 = i30 & i3442;
                            int i3472 = (i3452 & i3462) | (i3452 ^ i3462);
                            D88713 = uH18377.D8871(-344556366);
                            if (D88713 == null) {
                            }
                            long longValue92 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                            long j642 = 861181372;
                            long j652 = ((j642 ^ j22) | longValue92) ^ j22;
                            long j662 = (int) Runtime.getRuntime().totalMemory();
                            long j672 = j662 ^ j22;
                            long j682 = ((-1188) * (j652 | ((j672 | longValue92) ^ j22))) + ((-1187) * longValue92) + (595 * j642);
                            long j692 = 594;
                            long j702 = longValue92 ^ j22;
                            long j712 = j652 | ((j702 | j662) ^ j22);
                            long j722 = (j672 | j642) ^ j22;
                            long j732 = ((j692 * ((((j702 | j672) ^ j22) | ((j702 | j642) ^ j22)) | j722)) + (((j712 | j722) * j692) + j682)) - 1013434470;
                            int myUid32 = Process.myUid();
                            i32 = ((int) (j732 >> c3)) & ((((~(myUid32 | (-1145061457))) | 268699648) * 235) + (((~((-1156794110) | myUid32)) | 280432301) * (-470)) + (((~((~myUid32) | (-1156794110))) | 280432301) * (-235)) + 1360097671);
                            int romeo42 = ao.ad.romeo();
                            i33 = ((int) j732) & ((((~((~romeo42) | 521825997)) | 186264200) * 420) + ((~(521825997 | romeo42)) * 420) + 2059775277);
                            int i3492 = 1;
                            if (((i32 & i33) | (i32 ^ i33)) == 1) {
                            }
                            int[] iArr222 = new int[i3492];
                            int[] iArr322 = new int[i3492];
                            int i78622 = i34 ^ i3472;
                            iArr322[0] = i34;
                            iArr222[0] = i3472;
                            Object[] objArr18822 = new Object[4];
                            objArr18822[0] = iArr222;
                            objArr18822[i3492] = iArr322;
                            objArr18822[2] = new int[i3492];
                            objArr18822[3] = strArr3;
                            int i78722 = (~((-197478579) | ao.ad.tango(249089754))) | 168116242;
                            int i78822 = (((((r1 | 169689951) * 496) + (((i78722 | (~((~r1) | 199052287))) * (-496)) + ((i78722 * 992) - 1359795423))) - (~(-(-(((i78622 | (-i78622)) >> 31) & 16))))) - 1) + intValue3;
                            int i78922 = i78822 << 13;
                            int i79022 = ((~i78822) & i78922) | ((~i78922) & i78822);
                            int i79122 = i79022 >>> 17;
                            int i79222 = ((~i79022) & i79122) | ((~i79122) & i79022);
                            int i79322 = i79222 << 5;
                            ((int[]) objArr18822[2])[0] = ((~i79222) & i79322) | ((~i79322) & i79222);
                            return objArr18822;
                        }
                    }
                }
                i18 = intValue;
                int i2272 = ((~i220) & intValue) | (i220 & i88);
                int i2282 = -i2272;
                int i2292 = ((i2272 & i2282) | (i2272 ^ i2282)) >> 31;
                int i2302 = i18 & (~i2292);
                int i2312 = i220 & i2292;
                int i2322 = (i2312 & i2302) | (i2302 ^ i2312);
                int i2332 = -ExpandableListView.getPackedPositionGroup(0L);
                int i2342 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i2352 = i2342 * 569;
                int i2362 = ((i2352 | 211668) << 1) - (i2352 ^ 211668);
                int i2372 = ~i2342;
                int i2382 = (i2372 ^ (-373)) | (i2372 & (-373));
                int i2392 = ~i2382;
                int i2402 = ~(i2372 | i88);
                int i2412 = (i2392 ^ i2402) | (i2402 & i2392);
                int i2422 = ~(((-373) ^ i88) | ((-373) & i88));
                int i2432 = -(-(((i2412 ^ i2422) | (i2412 & i2422)) * (-1136)));
                int i2442 = (i2362 & i2432) + (i2432 | i2362);
                int i2452 = ~((i2372 ^ intValue) | (i2372 & intValue));
                int i2462 = ~(((-373) & intValue) | ((-373) ^ intValue));
                int i2472 = (i2452 & i2462) | (i2452 ^ i2462);
                int i2482 = (i2342 & i88) | (i88 ^ i2342);
                int i2492 = ~((i2482 ^ 372) | (i2482 & 372));
                int i2502 = -(-(((i2472 & i2492) | (i2472 ^ i2492)) * (-568)));
                int i2512 = (i2442 ^ i2502) + ((i2502 & i2442) << 1);
                int i2522 = ~i2482;
                int i2532 = ~((i88 ^ 372) | (i88 & 372));
                int i2542 = (i2522 & i2532) | (i2522 ^ i2532);
                int i2552 = ~((i2382 ^ intValue) | (i2382 & intValue));
                int i2562 = -(-(((i2542 & i2552) | (i2542 ^ i2552)) * Smooth$Close.expectedVersionCode));
                Object[] objArr412 = new Object[1];
                charlie((char) ((i2332 & 43312) + (i2332 | 43312)), (i2512 & i2562) + (i2562 | i2512), 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr412);
                Object[] objArr422 = {(String) objArr412[0]};
                D8871 = uH18377.D8871(i14);
                if (D8871 == null) {
                }
                String lowerCase2 = ((String) ((Method) D8871).invoke(null, objArr422)).toLowerCase();
                char makeMeasureSpec5 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int packedPositionGroup32 = 395 - ExpandableListView.getPackedPositionGroup(0L);
                int deadChar7 = KeyEvent.getDeadChar(0, 0);
                int i2572 = (deadChar7 & 4) + (deadChar7 | 4);
                Object[] objArr442 = new Object[1];
                charlie(makeMeasureSpec5, packedPositionGroup32, i2572, objArr442);
                if (lowerCase2.contains((String) objArr442[0])) {
                }
                int i2592 = (~(intValue & i2322)) & (intValue | i2322);
                int i2602 = -i2592;
                int i2612 = ((i2592 & i2602) | (i2592 ^ i2602)) >> 31;
                int i2622 = i258 & (~i2612);
                int i2632 = i2322 & i2612;
                int i2642 = (i2632 & i2622) | (i2622 ^ i2632);
                char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i2652 = -((byte) KeyEvent.getModifierMetaStateMask());
                int i2662 = (i2652 ^ 398) + ((i2652 & 398) << 1);
                int i2672 = -ExpandableListView.getPackedPositionType(0L);
                int i2682 = (i2672 & 42) + (i2672 | 42);
                Object[] objArr452 = new Object[1];
                charlie(keyRepeatDelay3, i2662, i2682, objArr452);
                String str222 = (String) objArr452[0];
                int i2692 = -AndroidCharacter.getMirror('0');
                int i2702 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i2712 = ((i2702 | 440) << 1) - (i2702 ^ 440);
                int i2722 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i2732 = (i2722 & 40) + (i2722 | 40);
                Object[] objArr462 = new Object[1];
                charlie((char) ((i2692 & 62427) + (i2692 | 62427)), i2712, i2732, objArr462);
                String str232 = (String) objArr462[0];
                int i2742 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int deadChar22 = 481 - KeyEvent.getDeadChar(0, 0);
                int i2752 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i2762 = (i2752 ^ 27) + ((i2752 & 27) << 1);
                Object[] objArr472 = new Object[1];
                charlie((char) ((i2742 ^ (-1)) + (i2742 << 1)), deadChar22, i2762, objArr472);
                String str242 = (String) objArr472[0];
                char c192 = (char) (40819 - (~TextUtils.indexOf((CharSequence) str, '0')));
                int i2772 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                Object[] objArr482 = new Object[1];
                charlie(c192, (i2772 & 508) + (i2772 | 508), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, objArr482);
                String str252 = (String) objArr482[0];
                char packedPositionChild32 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int i2782 = -(-MotionEvent.axisFromString(str));
                Object[] objArr492 = new Object[1];
                charlie(packedPositionChild32, (i2782 & 536) + (i2782 | 536), 27 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr492);
                String str262 = (String) objArr492[0];
                int offsetAfter32 = TextUtils.getOffsetAfter(str, 0);
                int i2792 = (offsetAfter32 * (-1975)) + 27236071;
                int i2802 = ~offsetAfter32;
                int i2812 = ~(i2802 | 27539);
                int i2822 = ((i2812 & intValue) | (intValue ^ i2812)) * 988;
                int i2832 = ((i2792 | i2822) << 1) - (i2792 ^ i2822);
                int i2842 = ~(((-27540) ^ offsetAfter32) | ((-27540) & offsetAfter32));
                int i2852 = ~((offsetAfter32 & i88) | (i88 ^ offsetAfter32));
                int i2862 = -(-(((i2852 & i2842) | (i2842 ^ i2852)) * (-1976)));
                int i2872 = (i2832 ^ i2862) + ((i2862 & i2832) << 1);
                int i2882 = ~((i2802 ^ 27539) | (i2802 & 27539));
                int i2892 = ~(((-27540) & intValue) | ((-27540) ^ intValue));
                int i2902 = (i2882 & i2892) | (i2882 ^ i2892);
                int i2912 = ~((i88 ^ 27539) | (i88 & 27539));
                int i2922 = ((i2902 & i2912) | (i2902 ^ i2912)) * 988;
                i19 = 1;
                char c202 = (char) (((i2872 | i2922) << 1) - (i2922 ^ i2872));
                int lastIndexOf32 = TextUtils.lastIndexOf(str, '0');
                c4 = 0;
                Object[] objArr502 = new Object[1];
                charlie(c202, ((lastIndexOf32 | 563) << 1) - (lastIndexOf32 ^ 563), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr502);
                strArr = new String[]{str222, str232, str242, str252, str262, (String) objArr502[0]};
                i20 = 0;
                i21 = 6;
                while (true) {
                    if (i20 >= i21) {
                    }
                    int i2962 = (i56 ^ 19) + ((i56 & 19) << 1);
                    i20 = (i2962 & (-18)) + (i2962 | (-18));
                    strArr = strArr13;
                    i21 = 6;
                    c4 = 0;
                    i19 = 1;
                }
                int i2972 = ((~i2642) & intValue) | (i2642 & i88);
                int i2982 = -i2972;
                int i2992 = ((i2972 & i2982) | (i2972 ^ i2982)) >> 31;
                int i3002 = i22 & (~i2992);
                int i3012 = i2642 & i2992;
                int i3022 = (i3012 & i3002) | (i3002 ^ i3012);
                int i3032 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i3042 = -View.combineMeasuredStates(0, 0);
                Object[] objArr532 = new Object[1];
                charlie((char) ((i3032 & 25893) + (i3032 | 25893)), (i3042 & 347) + (i3042 | 347), 15 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr532);
                String str282 = (String) objArr532[0];
                char trimmedLength22 = (char) TextUtils.getTrimmedLength(str);
                int i3052 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i3062 = (i3052 ^ 588) + ((i3052 & 588) << 1);
                int i3072 = -(-Drawable.resolveOpacity(0, 0));
                int i3082 = ((i3072 | 6) << 1) - (i3072 ^ 6);
                Object[] objArr542 = new Object[1];
                charlie(trimmedLength22, i3062, i3082, objArr542);
                String str292 = (String) objArr542[0];
                file2 = new File(str282);
                if (file2.exists()) {
                }
                int i8062 = foxtrot;
                echo = ((i8062 & 99) + (i8062 | 99)) % 128;
                Object[] objArr1912 = new Object[1];
                charlie((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 594 - (~(-TextUtils.indexOf(str, str, 0, 0))), 12 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr1912);
                String str932 = (String) objArr1912[0];
                char alpha172 = (char) (Color.alpha(0) + 52371);
                int gidForName42 = Process.getGidForName(str);
                int alpha182 = bh.alpha();
                int i8072 = ~gidForName42;
                int i8082 = ~((i8072 & (-610)) | (i8072 ^ (-610)));
                int i8092 = ~((-610) | (~alpha182));
                int i8102 = (((i8082 ^ i8092) | (i8092 & i8082)) * 446) + ((gidForName42 * (-445)) - 271005);
                int i8112 = ((-610) & gidForName42) | ((-610) ^ gidForName42);
                int i8122 = ((~((i8112 & alpha182) | (i8112 ^ alpha182))) | (~((i8072 ^ 609) | (i8072 & 609)))) * 446;
                int i8132 = (i8102 & i8122) + (i8122 | i8102);
                int i8142 = i8082 * 446;
                Object[] objArr1922 = new Object[1];
                charlie(alpha172, ((i8132 | i8142) << 1) - (i8142 ^ i8132), 8 - TextUtils.lastIndexOf(str, '0'), objArr1922);
                Object[] objArr1932 = {str932, (String) objArr1922[0]};
                D88712 = uH18377.D8871(1214576837);
                if (D88712 == null) {
                }
                long longValue192 = ((Long) ((Method) D88712).invoke(null, objArr1932)).longValue();
                long j1332 = -1013007585;
                long j1342 = -159;
                long j1352 = 160;
                i23 = i3022;
                long romeo82 = ao.ad.romeo() ^ j22;
                long j1362 = (((((romeo82 | (longValue192 ^ j22)) ^ j22) | j1332) * j1352) + (((-160) * (((romeo82 | j1332) ^ j22) | ((j1332 | longValue192) ^ j22))) + (((longValue192 | (j1332 ^ j22)) * j1352) + ((j1342 * longValue192) + (j1342 * j1332))))) - 534630753;
                int i8162 = ~((int) Runtime.getRuntime().maxMemory());
                foxtrot2 = ((int) (j1362 >> c3)) & A0.z.foxtrot((~(i8162 | (-1567739171))) | 88163618, 933, (((~(130512759 | i8162)) | (-1567739171)) * (-933)) + 1811107944, 857042889);
                int myTid72 = Process.myTid();
                foxtrot3 = ((int) j1362) & A0.z.foxtrot((~((~myTid72) | (-4292865))) | (-2062540667), 576, (((~((-314803561) | myTid72)) | 310510696) * 576) + 1771465493, -1534465536);
                if (((foxtrot3 & foxtrot2) | (foxtrot2 ^ foxtrot3)) != 0) {
                }
                int i31422 = (~(intValue & i23)) & (intValue | i23);
                int i31522 = -i31422;
                int i31622 = ((i31422 & i31522) | (i31422 ^ i31522)) >> 31;
                i27 = (i31622 & i23) | (i24 & (~i31622));
                if ((intValue2 & 8) != 0) {
                }
                int capsMode222 = TextUtils.getCapsMode(str, 0, 0);
                int combineMeasuredStates322 = View.combineMeasuredStates(0, 0);
                Object[] objArr6122 = new Object[1];
                charlie((char) ((capsMode222 ^ 57870) + ((capsMode222 & 57870) << 1)), (combineMeasuredStates322 & 739) + (combineMeasuredStates322 | 739), 40 - TextUtils.lastIndexOf(str, '0', 0), objArr6122);
                String str3222 = (String) objArr6122[0];
                c10 = 0;
                i28 = 1;
                Object[] objArr6222 = new Object[1];
                charlie((char) (58158 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 780, 29 - (~(-TextUtils.getOffsetAfter(str, 0))), objArr6222);
                strArr2 = new String[]{str3222, (String) objArr6222[0]};
                i29 = 0;
                while (true) {
                    if (i29 < 2) {
                    }
                    i29 = (i29 ^ 1) + ((i29 & 1) << 1);
                    i27 = i30;
                    strArr2 = strArr11;
                    c10 = 0;
                    i28 = 1;
                }
                int i34222 = (~(intValue & i30)) & (intValue | i30);
                int i34322 = -i34222;
                int i34422 = ((i34222 & i34322) | (i34222 ^ i34322)) >> 31;
                int i34522 = i31 & (~i34422);
                int i34622 = i30 & i34422;
                int i34722 = (i34522 & i34622) | (i34522 ^ i34622);
                D88713 = uH18377.D8871(-344556366);
                if (D88713 == null) {
                }
                long longValue922 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                long j6422 = 861181372;
                long j6522 = ((j6422 ^ j22) | longValue922) ^ j22;
                long j6622 = (int) Runtime.getRuntime().totalMemory();
                long j6722 = j6622 ^ j22;
                long j6822 = ((-1188) * (j6522 | ((j6722 | longValue922) ^ j22))) + ((-1187) * longValue922) + (595 * j6422);
                long j6922 = 594;
                long j7022 = longValue922 ^ j22;
                long j7122 = j6522 | ((j7022 | j6622) ^ j22);
                long j7222 = (j6722 | j6422) ^ j22;
                long j7322 = ((j6922 * ((((j7022 | j6722) ^ j22) | ((j7022 | j6422) ^ j22)) | j7222)) + (((j7122 | j7222) * j6922) + j6822)) - 1013434470;
                int myUid322 = Process.myUid();
                i32 = ((int) (j7322 >> c3)) & ((((~(myUid322 | (-1145061457))) | 268699648) * 235) + (((~((-1156794110) | myUid322)) | 280432301) * (-470)) + (((~((~myUid322) | (-1156794110))) | 280432301) * (-235)) + 1360097671);
                int romeo422 = ao.ad.romeo();
                i33 = ((int) j7322) & ((((~((~romeo422) | 521825997)) | 186264200) * 420) + ((~(521825997 | romeo422)) * 420) + 2059775277);
                int i34922 = 1;
                if (((i32 & i33) | (i32 ^ i33)) == 1) {
                }
                int[] iArr2222 = new int[i34922];
                int[] iArr3222 = new int[i34922];
                int i786222 = i34 ^ i34722;
                iArr3222[0] = i34;
                iArr2222[0] = i34722;
                Object[] objArr188222 = new Object[4];
                objArr188222[0] = iArr2222;
                objArr188222[i34922] = iArr3222;
                objArr188222[2] = new int[i34922];
                objArr188222[3] = strArr3;
                int i787222 = (~((-197478579) | ao.ad.tango(249089754))) | 168116242;
                int i788222 = (((((r1 | 169689951) * 496) + (((i787222 | (~((~r1) | 199052287))) * (-496)) + ((i787222 * 992) - 1359795423))) - (~(-(-(((i786222 | (-i786222)) >> 31) & 16))))) - 1) + intValue3;
                int i789222 = i788222 << 13;
                int i790222 = ((~i788222) & i789222) | ((~i789222) & i788222);
                int i791222 = i790222 >>> 17;
                int i792222 = ((~i790222) & i791222) | ((~i791222) & i790222);
                int i793222 = i792222 << 5;
                ((int[]) objArr188222[2])[0] = ((~i792222) & i793222) | ((~i793222) & i792222);
                return objArr188222;
            }
        }
        i17 = intValue;
        int i2172 = (~(intValue & i215)) & (intValue | i215);
        int i2182 = -i2172;
        int i2192 = ((i2172 & i2182) | (i2172 ^ i2182)) >> 31;
        int i2202 = (i215 & i2192) | (i17 & (~i2192));
        int i2212 = -View.getDefaultSize(0, 0);
        int i2222 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
        int i2232 = ((i2222 | 347) << 1) - (i2222 ^ 347);
        int trimmedLength4 = TextUtils.getTrimmedLength(str);
        int i2242 = ((trimmedLength4 | 17) << 1) - (trimmedLength4 ^ 17);
        Object[] objArr382 = new Object[1];
        charlie((char) (((i2212 | 25893) << 1) - (i2212 ^ 25893)), i2232, i2242, objArr382);
        String str202 = (String) objArr382[0];
        Object[] objArr392 = new Object[1];
        charlie((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 363 - (~(Process.myPid() >> 22)), 6 - TextUtils.getTrimmedLength(str), objArr392);
        String str212 = (String) objArr392[0];
        file = new File(str202);
        if (file.exists()) {
        }
        i18 = intValue;
        int i22722 = ((~i2202) & intValue) | (i2202 & i88);
        int i22822 = -i22722;
        int i22922 = ((i22722 & i22822) | (i22722 ^ i22822)) >> 31;
        int i23022 = i18 & (~i22922);
        int i23122 = i2202 & i22922;
        int i23222 = (i23122 & i23022) | (i23022 ^ i23122);
        int i23322 = -ExpandableListView.getPackedPositionGroup(0L);
        int i23422 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
        int i23522 = i23422 * 569;
        int i23622 = ((i23522 | 211668) << 1) - (i23522 ^ 211668);
        int i23722 = ~i23422;
        int i23822 = (i23722 ^ (-373)) | (i23722 & (-373));
        int i23922 = ~i23822;
        int i24022 = ~(i23722 | i88);
        int i24122 = (i23922 ^ i24022) | (i24022 & i23922);
        int i24222 = ~(((-373) ^ i88) | ((-373) & i88));
        int i24322 = -(-(((i24122 ^ i24222) | (i24122 & i24222)) * (-1136)));
        int i24422 = (i23622 & i24322) + (i24322 | i23622);
        int i24522 = ~((i23722 ^ intValue) | (i23722 & intValue));
        int i24622 = ~(((-373) & intValue) | ((-373) ^ intValue));
        int i24722 = (i24522 & i24622) | (i24522 ^ i24622);
        int i24822 = (i23422 & i88) | (i88 ^ i23422);
        int i24922 = ~((i24822 ^ 372) | (i24822 & 372));
        int i25022 = -(-(((i24722 & i24922) | (i24722 ^ i24922)) * (-568)));
        int i25122 = (i24422 ^ i25022) + ((i25022 & i24422) << 1);
        int i25222 = ~i24822;
        int i25322 = ~((i88 ^ 372) | (i88 & 372));
        int i25422 = (i25222 & i25322) | (i25222 ^ i25322);
        int i25522 = ~((i23822 ^ intValue) | (i23822 & intValue));
        int i25622 = -(-(((i25422 & i25522) | (i25422 ^ i25522)) * Smooth$Close.expectedVersionCode));
        Object[] objArr4122 = new Object[1];
        charlie((char) ((i23322 & 43312) + (i23322 | 43312)), (i25122 & i25622) + (i25622 | i25122), 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4122);
        Object[] objArr4222 = {(String) objArr4122[0]};
        D8871 = uH18377.D8871(i14);
        if (D8871 == null) {
        }
        String lowerCase22 = ((String) ((Method) D8871).invoke(null, objArr4222)).toLowerCase();
        char makeMeasureSpec52 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
        int packedPositionGroup322 = 395 - ExpandableListView.getPackedPositionGroup(0L);
        int deadChar72 = KeyEvent.getDeadChar(0, 0);
        int i25722 = (deadChar72 & 4) + (deadChar72 | 4);
        Object[] objArr4422 = new Object[1];
        charlie(makeMeasureSpec52, packedPositionGroup322, i25722, objArr4422);
        if (lowerCase22.contains((String) objArr4422[0])) {
        }
        int i25922 = (~(intValue & i23222)) & (intValue | i23222);
        int i26022 = -i25922;
        int i26122 = ((i25922 & i26022) | (i25922 ^ i26022)) >> 31;
        int i26222 = i258 & (~i26122);
        int i26322 = i23222 & i26122;
        int i26422 = (i26322 & i26222) | (i26222 ^ i26322);
        char keyRepeatDelay32 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i26522 = -((byte) KeyEvent.getModifierMetaStateMask());
        int i26622 = (i26522 ^ 398) + ((i26522 & 398) << 1);
        int i26722 = -ExpandableListView.getPackedPositionType(0L);
        int i26822 = (i26722 & 42) + (i26722 | 42);
        Object[] objArr4522 = new Object[1];
        charlie(keyRepeatDelay32, i26622, i26822, objArr4522);
        String str2222 = (String) objArr4522[0];
        int i26922 = -AndroidCharacter.getMirror('0');
        int i27022 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        int i27122 = ((i27022 | 440) << 1) - (i27022 ^ 440);
        int i27222 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int i27322 = (i27222 & 40) + (i27222 | 40);
        Object[] objArr4622 = new Object[1];
        charlie((char) ((i26922 & 62427) + (i26922 | 62427)), i27122, i27322, objArr4622);
        String str2322 = (String) objArr4622[0];
        int i27422 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        int deadChar222 = 481 - KeyEvent.getDeadChar(0, 0);
        int i27522 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        int i27622 = (i27522 ^ 27) + ((i27522 & 27) << 1);
        Object[] objArr4722 = new Object[1];
        charlie((char) ((i27422 ^ (-1)) + (i27422 << 1)), deadChar222, i27622, objArr4722);
        String str2422 = (String) objArr4722[0];
        char c1922 = (char) (40819 - (~TextUtils.indexOf((CharSequence) str, '0')));
        int i27722 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
        Object[] objArr4822 = new Object[1];
        charlie(c1922, (i27722 & 508) + (i27722 | 508), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, objArr4822);
        String str2522 = (String) objArr4822[0];
        char packedPositionChild322 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
        int i27822 = -(-MotionEvent.axisFromString(str));
        Object[] objArr4922 = new Object[1];
        charlie(packedPositionChild322, (i27822 & 536) + (i27822 | 536), 27 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4922);
        String str2622 = (String) objArr4922[0];
        int offsetAfter322 = TextUtils.getOffsetAfter(str, 0);
        int i27922 = (offsetAfter322 * (-1975)) + 27236071;
        int i28022 = ~offsetAfter322;
        int i28122 = ~(i28022 | 27539);
        int i28222 = ((i28122 & intValue) | (intValue ^ i28122)) * 988;
        int i28322 = ((i27922 | i28222) << 1) - (i27922 ^ i28222);
        int i28422 = ~(((-27540) ^ offsetAfter322) | ((-27540) & offsetAfter322));
        int i28522 = ~((offsetAfter322 & i88) | (i88 ^ offsetAfter322));
        int i28622 = -(-(((i28522 & i28422) | (i28422 ^ i28522)) * (-1976)));
        int i28722 = (i28322 ^ i28622) + ((i28622 & i28322) << 1);
        int i28822 = ~((i28022 ^ 27539) | (i28022 & 27539));
        int i28922 = ~(((-27540) & intValue) | ((-27540) ^ intValue));
        int i29022 = (i28822 & i28922) | (i28822 ^ i28922);
        int i29122 = ~((i88 ^ 27539) | (i88 & 27539));
        int i29222 = ((i29022 & i29122) | (i29022 ^ i29122)) * 988;
        i19 = 1;
        char c2022 = (char) (((i28722 | i29222) << 1) - (i29222 ^ i28722));
        int lastIndexOf322 = TextUtils.lastIndexOf(str, '0');
        c4 = 0;
        Object[] objArr5022 = new Object[1];
        charlie(c2022, ((lastIndexOf322 | 563) << 1) - (lastIndexOf322 ^ 563), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5022);
        strArr = new String[]{str2222, str2322, str2422, str2522, str2622, (String) objArr5022[0]};
        i20 = 0;
        i21 = 6;
        while (true) {
            if (i20 >= i21) {
            }
            int i29622 = (i56 ^ 19) + ((i56 & 19) << 1);
            i20 = (i29622 & (-18)) + (i29622 | (-18));
            strArr = strArr13;
            i21 = 6;
            c4 = 0;
            i19 = 1;
        }
        int i29722 = ((~i26422) & intValue) | (i26422 & i88);
        int i29822 = -i29722;
        int i29922 = ((i29722 & i29822) | (i29722 ^ i29822)) >> 31;
        int i30022 = i22 & (~i29922);
        int i30122 = i26422 & i29922;
        int i30222 = (i30122 & i30022) | (i30022 ^ i30122);
        int i30322 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        int i30422 = -View.combineMeasuredStates(0, 0);
        Object[] objArr5322 = new Object[1];
        charlie((char) ((i30322 & 25893) + (i30322 | 25893)), (i30422 & 347) + (i30422 | 347), 15 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr5322);
        String str2822 = (String) objArr5322[0];
        char trimmedLength222 = (char) TextUtils.getTrimmedLength(str);
        int i30522 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int i30622 = (i30522 ^ 588) + ((i30522 & 588) << 1);
        int i30722 = -(-Drawable.resolveOpacity(0, 0));
        int i30822 = ((i30722 | 6) << 1) - (i30722 ^ 6);
        Object[] objArr5422 = new Object[1];
        charlie(trimmedLength222, i30622, i30822, objArr5422);
        String str2922 = (String) objArr5422[0];
        file2 = new File(str2822);
        if (file2.exists()) {
        }
        int i80622 = foxtrot;
        echo = ((i80622 & 99) + (i80622 | 99)) % 128;
        Object[] objArr19122 = new Object[1];
        charlie((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 594 - (~(-TextUtils.indexOf(str, str, 0, 0))), 12 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr19122);
        String str9322 = (String) objArr19122[0];
        char alpha1722 = (char) (Color.alpha(0) + 52371);
        int gidForName422 = Process.getGidForName(str);
        int alpha1822 = bh.alpha();
        int i80722 = ~gidForName422;
        int i80822 = ~((i80722 & (-610)) | (i80722 ^ (-610)));
        int i80922 = ~((-610) | (~alpha1822));
        int i81022 = (((i80822 ^ i80922) | (i80922 & i80822)) * 446) + ((gidForName422 * (-445)) - 271005);
        int i81122 = ((-610) & gidForName422) | ((-610) ^ gidForName422);
        int i81222 = ((~((i81122 & alpha1822) | (i81122 ^ alpha1822))) | (~((i80722 ^ 609) | (i80722 & 609)))) * 446;
        int i81322 = (i81022 & i81222) + (i81222 | i81022);
        int i81422 = i80822 * 446;
        Object[] objArr19222 = new Object[1];
        charlie(alpha1722, ((i81322 | i81422) << 1) - (i81422 ^ i81322), 8 - TextUtils.lastIndexOf(str, '0'), objArr19222);
        Object[] objArr19322 = {str9322, (String) objArr19222[0]};
        D88712 = uH18377.D8871(1214576837);
        if (D88712 == null) {
        }
        long longValue1922 = ((Long) ((Method) D88712).invoke(null, objArr19322)).longValue();
        long j13322 = -1013007585;
        long j13422 = -159;
        long j13522 = 160;
        i23 = i30222;
        long romeo822 = ao.ad.romeo() ^ j22;
        long j13622 = (((((romeo822 | (longValue1922 ^ j22)) ^ j22) | j13322) * j13522) + (((-160) * (((romeo822 | j13322) ^ j22) | ((j13322 | longValue1922) ^ j22))) + (((longValue1922 | (j13322 ^ j22)) * j13522) + ((j13422 * longValue1922) + (j13422 * j13322))))) - 534630753;
        int i81622 = ~((int) Runtime.getRuntime().maxMemory());
        foxtrot2 = ((int) (j13622 >> c3)) & A0.z.foxtrot((~(i81622 | (-1567739171))) | 88163618, 933, (((~(130512759 | i81622)) | (-1567739171)) * (-933)) + 1811107944, 857042889);
        int myTid722 = Process.myTid();
        foxtrot3 = ((int) j13622) & A0.z.foxtrot((~((~myTid722) | (-4292865))) | (-2062540667), 576, (((~((-314803561) | myTid722)) | 310510696) * 576) + 1771465493, -1534465536);
        if (((foxtrot3 & foxtrot2) | (foxtrot2 ^ foxtrot3)) != 0) {
        }
        int i314222 = (~(intValue & i23)) & (intValue | i23);
        int i315222 = -i314222;
        int i316222 = ((i314222 & i315222) | (i314222 ^ i315222)) >> 31;
        i27 = (i316222 & i23) | (i24 & (~i316222));
        if ((intValue2 & 8) != 0) {
        }
        int capsMode2222 = TextUtils.getCapsMode(str, 0, 0);
        int combineMeasuredStates3222 = View.combineMeasuredStates(0, 0);
        Object[] objArr61222 = new Object[1];
        charlie((char) ((capsMode2222 ^ 57870) + ((capsMode2222 & 57870) << 1)), (combineMeasuredStates3222 & 739) + (combineMeasuredStates3222 | 739), 40 - TextUtils.lastIndexOf(str, '0', 0), objArr61222);
        String str32222 = (String) objArr61222[0];
        c10 = 0;
        i28 = 1;
        Object[] objArr62222 = new Object[1];
        charlie((char) (58158 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 780, 29 - (~(-TextUtils.getOffsetAfter(str, 0))), objArr62222);
        strArr2 = new String[]{str32222, (String) objArr62222[0]};
        i29 = 0;
        while (true) {
            if (i29 < 2) {
            }
            i29 = (i29 ^ 1) + ((i29 & 1) << 1);
            i27 = i30;
            strArr2 = strArr11;
            c10 = 0;
            i28 = 1;
        }
        int i342222 = (~(intValue & i30)) & (intValue | i30);
        int i343222 = -i342222;
        int i344222 = ((i342222 & i343222) | (i342222 ^ i343222)) >> 31;
        int i345222 = i31 & (~i344222);
        int i346222 = i30 & i344222;
        int i347222 = (i345222 & i346222) | (i345222 ^ i346222);
        D88713 = uH18377.D8871(-344556366);
        if (D88713 == null) {
        }
        long longValue9222 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
        long j64222 = 861181372;
        long j65222 = ((j64222 ^ j22) | longValue9222) ^ j22;
        long j66222 = (int) Runtime.getRuntime().totalMemory();
        long j67222 = j66222 ^ j22;
        long j68222 = ((-1188) * (j65222 | ((j67222 | longValue9222) ^ j22))) + ((-1187) * longValue9222) + (595 * j64222);
        long j69222 = 594;
        long j70222 = longValue9222 ^ j22;
        long j71222 = j65222 | ((j70222 | j66222) ^ j22);
        long j72222 = (j67222 | j64222) ^ j22;
        long j73222 = ((j69222 * ((((j70222 | j67222) ^ j22) | ((j70222 | j64222) ^ j22)) | j72222)) + (((j71222 | j72222) * j69222) + j68222)) - 1013434470;
        int myUid3222 = Process.myUid();
        i32 = ((int) (j73222 >> c3)) & ((((~(myUid3222 | (-1145061457))) | 268699648) * 235) + (((~((-1156794110) | myUid3222)) | 280432301) * (-470)) + (((~((~myUid3222) | (-1156794110))) | 280432301) * (-235)) + 1360097671);
        int romeo4222 = ao.ad.romeo();
        i33 = ((int) j73222) & ((((~((~romeo4222) | 521825997)) | 186264200) * 420) + ((~(521825997 | romeo4222)) * 420) + 2059775277);
        int i349222 = 1;
        if (((i32 & i33) | (i32 ^ i33)) == 1) {
        }
        int[] iArr22222 = new int[i349222];
        int[] iArr32222 = new int[i349222];
        int i7862222 = i34 ^ i347222;
        iArr32222[0] = i34;
        iArr22222[0] = i347222;
        Object[] objArr1882222 = new Object[4];
        objArr1882222[0] = iArr22222;
        objArr1882222[i349222] = iArr32222;
        objArr1882222[2] = new int[i349222];
        objArr1882222[3] = strArr3;
        int i7872222 = (~((-197478579) | ao.ad.tango(249089754))) | 168116242;
        int i7882222 = (((((r1 | 169689951) * 496) + (((i7872222 | (~((~r1) | 199052287))) * (-496)) + ((i7872222 * 992) - 1359795423))) - (~(-(-(((i7862222 | (-i7862222)) >> 31) & 16))))) - 1) + intValue3;
        int i7892222 = i7882222 << 13;
        int i7902222 = ((~i7882222) & i7892222) | ((~i7892222) & i7882222);
        int i7912222 = i7902222 >>> 17;
        int i7922222 = ((~i7902222) & i7912222) | ((~i7912222) & i7902222);
        int i7932222 = i7922222 << 5;
        ((int[]) objArr1882222[2])[0] = ((~i7922222) & i7932222) | ((~i7932222) & i7922222);
        return objArr1882222;
    }

    public final List bravo() {
        foxtrot = (echo + 11) % 128;
        List list = (List) this.bravo.getValue();
        int i4 = echo;
        foxtrot = ((i4 ^ 95) + ((i4 & 95) << 1)) % 128;
        return list;
    }

    public final N14263A23323 echo() {
        try {
            Object[] objArr = {0L, new F(this), 1, null};
            Object echo2 = am.echo(853678683);
            if (echo2 == null) {
                echo2 = am.charlie((char) (40619 - Color.red(0)), 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 221 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo2).invoke(null, objArr);
            int i4 = foxtrot;
            int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
            echo = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 64 / 0;
            }
            return n14263a23323;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
