package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Build;
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
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.C1203e1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class g3 {
    public static int echo = 0;
    public static int foxtrot = 0;
    public static int golf = 0;
    public static int hotel = 1;
    public final getAutofillType alpha;
    public final d3 bravo;
    public final boolean charlie;
    public final long delta;

    public g3(getAutofillType getautofilltype, d3 d3Var, boolean z2, long j5) {
        this.alpha = getautofilltype;
        this.bravo = d3Var;
        this.charlie = z2;
        this.delta = j5;
    }

    public static int alpha() {
        int i4 = echo;
        int i5 = i4 % 7505660;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        foxtrot = elapsedRealtime;
        return elapsedRealtime;
    }

    public static /* synthetic */ Object charlie(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (~(i14 | i15)) | (~(i14 | i4)) | (~(i15 | i4));
        int i17 = ~i4;
        int i18 = (~(i17 | i12)) | (~(i15 | i12));
        int i19 = ~(i14 | i17 | i15);
        int i20 = 1196425216 * i13;
        int i21 = 610271232 * i5;
        int i22 = (922746880 * i11) + i21 + i20 + ((-1134570258) * i19) + (i18 * (-1134570258)) + (1134570258 * i16) + (61854959 * i12) + ((-1963971821) * i4) + 932184064;
        int papa = AbstractC2327c.papa(i11, 2078889904, ((-2109949842) * i5) + i4 + i12 + i13);
        int i23 = i18 * 518;
        int i24 = i19 * 518;
        if (AbstractC2327c.quebec(papa, 458489856, ((-1524517520) * i11) + ((-843101306) * i5) + ((-573803307) * i13) + i24 + i23 + (i16 * (-518)) + (i12 * (-573802789)) + (i4 * (-573803825)) + 196542130, 64749568, (671350784 * papa) + i22) != 1) {
            final g3 g3Var = (g3) objArr[0];
            try {
                Object[] objArr2 = {Long.valueOf(((Number) objArr[1]).longValue()), r15, r15, new Function1<SafeWithTimeoutProContext, Location>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.wB2645$2

                    /* renamed from: c, reason: collision with root package name */
                    public static final byte[] f6621c = null;
                    public static final char[] purple;
                    public static final long red;
                    public static int silver;
                    public static int teal;
                    public static final byte[] white = null;
                    public static final int yellow = 0;

                    static {
                        juliet();
                        india();
                        silver = 0;
                        teal = 1;
                        char[] cArr = new char[2156];
                        ByteBuffer.wrap("\u007f\nJù\u00140Þ{©êsÚ=\u001a\u0007AÒ\u0081\u009c;f|1¾ûíÅ\"\u008fTZ\u0089$Áîo¹°\u0083þM6\u0017bâ\u0086¬Ýv\u0004A¾\u000bð\u007f\nJù\u00140Þ{©êsÚ=\u001a\u0007AÒ\u0081\u009c;f|1¾ûíÅ\"\u008fEZ\u0084$Õîx¹\u008a\u0083éM5\u0017Oâ\u0096¬Ùv\u00017}\u0002\u008e\\G\u0096\fá\u009d;\u00adumO6\u009aöÔL.\u000byÉ³\u009a\u008dUÇ1\u0012ãl¼¦\t\u007f\nJî\u0014,Þ~©êsÐ=\u001a\u0007IÒ\u0090\u009c1fp1âûâÅ\u0012\u008fYZ\u0089$Ãît¹¦\u0083åM\u001a\u0017_â\u0094¬Ùv\u0011A¸\u000bçÕ4\u007f\nJø\u0014!Þn©êsÙ=\u0012\u0007\u0003Ò\u0095\u009c/fz1½\u007f\nJø\u0014!Þn©êsÎ=\u001c\u0007@ÒË\u009c-fg1¢ûõ\u007f\nJî\u00141Þn©¤sÏ=\u0011\u0007\u0002Ò·\u009c\u001bfX1¢ûóÅ\u0018\u008fqZ\u008c$Ñî|\u007f\nJù\u00144Þy©¤s\u0092=[\u0007NÒ\u0095\u009c(f|1£ûãÅ\u0012\u007fWJò\u0014{Þo©ªsÒ=\u0001\u0007\u0003Ò\u0097\u009c8fq1¿ûêÅ\u0014\u008fQZ²$Ëîx¹¡\u0083ÒM!\u0017Sâ\u0086¬\u009c@\u009au?+¶á¢\u0096gL\u001f\u0002Ì8ÎíZ£õY¼\u000erÄ'úÙ°\u009ce\u007f\u001b\u0006Ñµ\u0086l¼\u001frì(\u009eÝK\u0093Ro\bZì\u0004.Î|¹³cÚ-\u001a\u0017\u0000Â\u008b\u008c6vu!àëëÕ\u0016\u009fUJ\u00814Åþ1©¤\u0093à\u007fGJô\u00142Þc©ªsÅ\u007fyJÜ+°\u001eT@\u0096\u008aÄý\u000b'bi¢S¸\u0086=È\u008e2ÁeX¯Q\u0091¢Ûâ\u000e\"pIºêíB×Y\u0019\u009aCê¶:ø:\"¼\u0015\b_A\u0081\u0083ËÍ>(`c\u007f\nJî\u0014,Þ~©±sØ=\u0018\u0007\u0002Ò\u0087\u009c4f{1âûëÅ\u0018\u008fXZ\u0098$óîP¹ø\u0083ýM7\u0017Râ\u0085îÜÛ8\u0085úO¨8gâ\u000e¬Î\u0096ÔC_\râ÷¡ 4j?TÂ\u001e\u0081ËUµ\u0016\u007f¦(v\u0012\rÜÞ\u0086\u009bsQ=\u0014çÃÐ%\u009a0Dô\u007f\nJù\u00140Þ{©êsÓ=\u0010\u0007@Ò\u0090\u009c:f`1¨ûöÅ\t\u0098\u0005\u00ad ó)9=Nâ\u0094\u0086ÚKà\u001b5\u0099{g\u0081(Öì\u001c£<¬\t\u001fWÓ\u009d\u0099êG0t~üD¯\u0091vB¾wY)\u0093ãÖ\u0094\u0012N&\u0000§:ðï=¡\u008c[Ò\f\u0000ÆBø½²äg4\u0019b\u007fKJø\u00148Þx©¶sÛ\u0011>$\u009bz\u0012°\u0014ÇÞ\u001d»Sxi1¼ïò@\bR_É\u0095\u008d«zá)4âJ\u00ad\u0080\u0017×Èí\u0091#^y1\u008cî\bâ=Xc\u009b©Ô\u0016\u0092#?}à·¹Àk\u001a\tTÆnÄ»Qõã\u000f¡X$\u0092 ¬ÞæÜ3NM\u0007\u0087¸Ðgê-$¬~\u009d\u008bBÅ\u001f\u001f\u008c(|b3¼áö§\u0003e]\u0015\u0097Ú¡\u0097ú\u00054àN¯\u009blÕ\u001eï×9\u0098rG\u008cèê\u009bß6\u0081éK°<bæ\u0000¨Ï\u0092ÍGX\têó¨¤-n)P×\u001aÕÏG±\u000e{±,n\u0016$Ø¥\u0082\u0094wK9\u0016ã\u0085Ôu\u009e:@è\n®ÿl¡\u001ckÓ]\u009e\u0006\fÈí²¦ge)\u0017\u0013ÔÅ\u0091\u007fUJø\u0014'Þ~©¬sÎ=\u0001\u0007\u0003Ò\u0096\u009c$ff1ãûçÅ\u0019\u008f\u001bZ\u0089$Àî\u007f¹ \u0083êMk\u0017Oâ\u009a¬\u0083v\u0006A¬\u000bü5g\u0000Ê^\u0015\u0094Lã\u009e9üw3M1\u0098¤Ö\u0016,T{Ñ±Õ\u008f+Å)\u0010»nò¤Mó\u0092ÉØ\u0007Y]}¨¨æ±<;\u000b\u008eAÄ\u009fmªÀô\u001f>FI\u0094\u0093öÝ9ç;2®|\u001c\u0086^ÑÛ\u001bß%!o#º±Äø\u000eGY\u0098cÒ\u00adS÷w\u0002¢L»\u00960¡\u0086ëÎ\u0001\r4 j\u007f &×ô\r\u0096CYy[¬Îâ|\u0018>O»\u0085¿»AñC$ÑZ\u0098\u0090'Çøý²33i\u0017\u009cÂÒÛ\bP?ëu®|!I\u008d\u0017HÝ\u0007ªÄp©\u007f\nJí\u0014'Þb©¦s\u0092=\u0018\u0007BÒ\u0081\u009c(fy1¨ûöz\u0089O%\u0011àÛ¯¬xv\u00128Ê\u0002\u0084×K\u0083\r¶éè+\"yU¶\u008fßÁ\u001fû\u0005.\u0084`(\u009asÍ§\u0007ç9\rs]¦\u0098ØÉ\u00125E¥\u007fã±,ë^\u001e\u009dPÝ\u008a\u0011½÷÷á)3cq\u0096\u008eÈ×\u0002\u00074}oé¡7Ûx\u000e´@ßz\u0000¬\u0004ç\u0088\u0019;S`\u007f\nJë\u00140Þc©¡sÒ=\u0007\u0007\u0002Ò\u0089\u009c4fw1ûû±ÅR\u008f]Z\u009a$\u008aî|¹ \u0083éM,\u0017RâÛ¬Ýv\u0017A´\u000bøÕ,\u009fwj\u00844\u009bþ\u001aÈL\u0093ó]1'bò²¼Î\u0086[P^\u001b\u008aCÒv3(èâ»\u0095yO\n\u0001ß;ÚîQ ìZ¯\r#Çiù\u008a³\u0085fB\u0018RÒ\u00ad\u0085z¿6qò+\u0088Þ]\u0090\u001aJÎ}`7?é»£ªVL\b\u0003ÂÑô\u0092¯2aþ\u001bûÎn\u0080\nt`A\u0084\u001fFÕ\u0014¢Ûx²6r\fhÙã\u0097^m\u001d:\u0091ðÛÎ8\u0084<Që/ å\u0002²Û\u0088¸FN\u001c>éû§«}PJÞ\u0000\u0091ÞS\u0094\naå?¹õfÃ,\u0098\u0092V\u0012,\u0004ùß·§\u008d1[4\u0010à\u007f\nJø\u0014!Þn©êsÔ=\u001b\u0007DÒ\u0091\u009crf|1£ûìÅ\t\u008f\u001bZ\u008e$Éîr¹ \u0083éM6\u0017Xâ\u0087¬Ûv\fA¾\u000bðÕc\u009fwj\u009e\u007fbJø\u0014;Þt©¨sÒ=\u0001\u0007DÒ\u008a\u009c3EVpõ.8äe\u0093¬IÌ\u0007\u001d\r68\u0085fW¬\u0012ÛØ\u0001¤Opu0\u007fWJò\u0014{Þ}©·sÒ=\u0011\u0007XÒ\u0086\u009c)f;1©ûàÅ\u000b\u008f\\Z\u008e$Àw\u000fB£\u001cfÖ)¡¡{×5YíÖØl\u0086¯Lü;#á@¯\u0082\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007rÒ\u009d\u009cef#\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007rÒ\u009d\u009cef#1\u0092û³ÅIØ\u0091í4³½y»\u000eqÔ\u0014\u009a× \u009eu@;ïÁý\u0096f\\,bß(\u0096ýGÂ\u0010÷¿©xMLxü&,ìm\u009b¨AÅ\u000f\u00165S\u007fdJí\u0014%Þ-©\u0097sÈ=\u001b\u0007YÒ\u008c\u009c0fp1íûãÅ\u0012\u008fGZÍ$æîu¹§\u0083âM(\u0017X\u007fdJó\u00141Þ\u007f©ªsÔ=\u0011\u0007\rÒ¶\u009c\u0019f^1íûçÅ\b\u008f\\Z\u0081$Ñî=¹³\u0083âM7\u0017\u001dâ\u008d¬\u0095vS\u0011²$%zç°©Ç|\u001d\u0002SÇiÛ¼`òÏ\b\u0088_;\u00951«Þá\u008a4WJ\u0007\u0080ë×eí4#áyË\u008c[ÂC\u0018\u0085/Teu»¯\u008e\u0097»2å»/¥Xd\u0082\u000fÌÑö\u009a#Dmï\u0097°Wobß<\u0014öD\u0081\u008e[ù\u0015+/h\u007fSJÿ\u0014:Þu©ýs\u008b\u007fWJü\u0014;Þn©\u00adsÈÃMöè¨abg\u0015\u00adÏÈ\u0081\u000b»Bn\u009c 3Ú!\u008dµGíy\u00063Aæ\u0093\u007fWJò\u0014{Þf© sÏ=\u001b\u0007HÒ\u0089\u009csfd1¨ûèÅ\b\u007f\u0014\u007fWJò\u0014{Þ~© sÞ=\u0000\u0007_Ò\u0080\u007f\u0015ÆnóË\u00adBgV\u0010\u0089Êí\u0084 ¾pkò%\u0014ß^\u0088\u009bBØ|16oã \u007fCJè\u00149Þa©\u009asÅ=M\u0007\u001býrÈ×\u0096^\\J+\u0095ññ¿<\u0085lPî\u001e\u001eäY³\u0086yÇG=\rbØ¸¦òlQ;\u009e\u0001Ü\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007\u0002Ò\u0096\u009c9f~1âûâÅ\u0018\u008f[Z\u0088$×ît¹¶\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007rÒ\u009d\u009cef#1âûöÅ\u0019\u008f^Z²$Ýî%¹ã\u0083¢M\"\u0017Xâ\u009b¬Èv\u0017A´\u000böÕ\u0012\u009f}jÅ4\u0083\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007\u0002Ò\u0082\u009c2fz1ªûéÅ\u0018\u008fjZ\u009e$Áîv¹ú\u0083êM \u0017Sâ\u0090¬ßv\fA¾\u007fBJø\u0014;Þh©·sÔ=\u0016\u0007\u0002Ò\u0093\u009c?fz1µû½ÅK\u008fEZÂ$Óî\u007f¹º\u0083õM}\u0017\u000bâ\u0085\u008c\u0011¹¡çi-9Zú\u0080\u008bÎ\tô\r!Òoe\u0095\u0019Âù\b¦6F|\t©Ð×\u0093\u001d\u0011Jþpæ¾ äA\u0011Á_\u009b\u0085X²ëø´&wl5\u0099ñÇ\u009e\r\u0006;@ù\u0090Ì5\u0092¼X¨/mõ\u0015»Æ\u0081\u0086TM\u001aûà¶·o}0\u007fWJò\u0014{Þo©ªsÒ=\u0001\u0007DÒ\u0088\u009c<fr1¨û«Å\u001f\u008f@Z\u0084$Éîy¹û\u0083ëM,\u0017Sâ\u0092¬Èv\u0017A\u00ad\u000bçÕ$\u009fkj\u0089\u0003\u008f6\u0018hÚ¢\u0094ÕA\u000f?Aú{ë®và\u008e\u001aÈ\u007fWJò\u0014{Þo©°sÔ=\u0019\u0007IÒË\u009c9f|1¾ûõÅ\u0011\u008fTZ\u0094$\u008bît¹±soFÆ\u0018\u0018ÒG¥Ö\u007fLJó\u0014<Þy©ësÎ=\u0003\u0007NÒË\u009c,fp1 ûðÅP\u008fEZ\u009f$Êîm¹¦s\u0084F(\u0018èÒ¨¥;\u007f\u00051Ò\u000bÓÞX\u0090ìj¬=s÷>ÉÈ\u0083\u009cVN\u007fTJø\u00148Þx©ësÎ=\u0013\u0007\u0003Ò\u0083\u009c<f~1¨ûÚÅ\u001e\u008fTZ\u0080$Àîo¹´\fg9Ëg\u000b\u00adKÚØ\u0000ýN t0¡ºï\r\u0015BB¡\u0088Ò¶+üh)\u00adWÿ\u009dZÊ\u009f^\u0019k¼55ÿ(\u0088îR\u0081\u001cU&\u0006óÇ½=G:\u0010íÚ¯äA®\u0014{Ê\u0005\u008fÏ}\u0098ê¢¦lf6\u0006Ãß®\u0014\u009b±Å8\u000f,xé¢\u0091ìBÖ@\u0003×M{·;àû*è\u0014_^\u0000\u008bÊõ¹?0h÷R£\u009cc\u0088Ä½aãè)ñ^2\u0084CÊÈðÜ%\u0003k§\u0091êÆ:\f82\u0088xÏ\u00ad\u0010ÓQ\u0019ëN4tnº¤àÇ\u0015\b[J\u007fWJò\u0014{Þ}©·sÒ=\u0011\u0007XÒ\u0086\u009c)f;1¯ûðÅ\u0014\u008fYZ\u0089$\u008bî{¹¼\u0083ãM\"\u0017Xâ\u0087¬Ýv\u0017A´\u000bûÕ9\u007fWJò\u0014{Þ~©¼sÎ=\u0001\u0007HÒ\u0088\u009csfw1¸ûìÅ\u0011\u008fQZÃ$Ãît¹»\u0083êM \u0017Oâ\u0085¬ßv\fA³\u000báÉ³ü\u0016¢\u009fh\u009a\u001fXÅ*\u008bå±¬dl*æÐ\u0094\u0087QM\u0015s·9³ì|\u0092(X\u0095\u000fU5GûÇ¡°T\u007f\u001a.Àä÷K½\u0001cÛ)\u0088Üw\u0082%\u007fWJò\u0014{Þ{© sÓ=\u0011\u0007BÒ\u0097\u009csfw1¸ûìÅ\u0011\u008fQZÃ$Ãît¹»\u0083êM \u0017Oâ\u0085¬ßv\fA³\u000báãºÖ\u001f\u0088\u0096B\u00965Mï>¡ü\u009b¯Nz\u0000ïú\u009c\u00adLg\u0003Yý\u0013öÆb¸=r\u0099%T\u001f\u0004Ñ\u0086\u008b¶~q0.êïÝU\u0097\nIÐ\u0003\u009aöy¨6bô\u007f\u009dRÇgs¬Ó\u007f\f\u007f\nJù\u00140Þ{©êsÌ=\u0010\u0007@Ò\u0090\u009c\u0002fe1¤ûõÅ\u0018\u007f\nJù\u00140Þ{©êsÎ=\u001a\u0007NÒ\u008e\u009c8fa1âûçÅ\u001c\u008fFZ\u0088$Çî|¹»\u0083éM\u001a\u0017Zâ\u0090¬Ãv\u001cA¹Ó\næù¸0r{\u0005êßÎ\u0091\u001a«N~\u008e08Êa\u009dâWâi\u0018#[ö\u0094\u0088Á£à\u0096\u0013ÈÚ\u0002\u0091u\u0000¯$áðÛ¤\u000ed@Òº\u008bí\b'\u001e\u0019òS²\u0086rø+\u007f\nJî\u0014,Þ~©êsÌ=\u0010\u0007@Ò\u0090\u009c\u0002fa1¿ûäÅ\u001e\u008fP\u007f\nJî\u0014,Þ~©±sØ=\u0018\u0007\u0002Ò\u0089\u009c4fw1âûéÅ\u0014\u008fWZ\u008e$úîp¹´\u0083áM)\u0017Râ\u0096¬òv\u0001A¸\u000b÷Õ8\u009fbj¢4Äþ\bÈH\u0093è]{'~òª\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒº\u009c:fe1¾\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒº\u009c)f|1 ûà÷-ÂÞ\u009c\u0017V\\!Íûéµ=\u008fiZ©\u0014\u001fîF¹ÅsÀM)\u0007fÒ¬¬ífV1\u0096\u000bÏÅ\u0010\u009f~\u007f\nJî\u0014,Þ~©±sØ=\u0018\u0007\u0002Ò\u0089\u009c4fw1âûéÅ\u0014\u008fWZ\u008f$Öîi¹³\u0083âM)\u0017Yâ\u0090¬ßv:A·\u000bûÕ$\u009f+j\u008e4Ú\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒ\u0084\u009c>fv1¨oÙZ*\u0004ãÎ¨¹9c\f-Õ\u0017\u008aÂQ\u008c÷v´!q¶B\u0083±Ýx\u00173`¢º\u0097ôNÎ\u0011\u001bÀUp¯:øë\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒ\u008a\u009c/f|1¨\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒ\u0093\u009c0ff1ªÜié\u009a·S}\u0018\n\u0089Ð¼\u009ee¤:qö?YÅ\u0017\u0092ÇX\u0096f}\u007f\nJù\u00140Þ{©êsß=\u0006\u0007YÒº\u009c4fx1¨\u007f\nJù\u00144Þy©¤s\u0092=\u0011\u0007BÒ\u0092\u009c3fy1¢ûäÅ\u0019\u008fFZÂ$\u008bîe¹·\u0083¢M'\u0017Nâ\u0081¬Æ\u007f\nJð\u0014;Þy©êsÊ=\u001c\u0007CÒ\u0081\u009c2fb1¾ûªÅ?\u008fFZ\u0099$öîu¹´\u0083ÿM \u0017Yâ³¬Âv\tA¹\u000bðÕ?\u007f\nJí\u0014'Þb©¦s\u0092=\u001c\u0007BÒ\u0095\u009c2fg1¹ûö\u0081É´'êï ñW#\u007f\nJí\u0014'Þb©¦s\u0092=\u0006\u0007HÒ\u0089\u009c;f:1 ûäÅ\r\u008fF\u007fBJï\u00144Þa©©sÒ=\u0016\u0007\u0003Ò\u0082\u009c2fy1©ûãÅ\u0014\u008fFZ\u0085$\u008bîn¹º¶k\u0083ÖÝ\u0015\u0017h`«ºÚô\u0004ÎP\u001b¥U\f¯CøÁ2Ô\f0½3\u0088ÁÖ\u0018\u001cWkÓ±éÿ)Åp\u0010µ^\u0005¤só\u00979Ó\u0007 Mi\u0098·æï,\n{\u0094AÙ\u008f\u0010\u007fGJñ\u0014 Þh©¶sÉ=\u0014\u0007NÒ\u008e\u009c. °\u0095BË\u009b\u0001ÔvP¬jâ Øâ\r1C\u0093¹ÜÙrì\u0081²Lx\u0001\u000fÜÕê\u009bi¡:tê:KÀ\u0001\u0097Ú]\u009cca)>üº\u0082óH\u0001\u001fÝ%Úë\\±5Dý\n¦Ð3çÝ\u00ad\u0080sY\u007f\nJí\u0014'Þb©¦s\u0092=\u0016\u0007]Ò\u0090\u009c4f{1«ûê¼n\u0089þ×5\u001dej¯°Øþ\nÄIq>DÍ\u001a\u0000ÐM§\u0090}¦3,\tpÜ¢\u0092\nh\u000e?\u0089õÃË&\u0081gT°*ýàL·\u0092\u008d\u0096C\u0012\u0019|ì³¢¶xaOÆ\u0005ÂÛ\u0016\u0091\\dç:ìð0Ær\u009dÛS\u000e)Oü\u0098²û\u00885^7\u0015¼ë\f¡Lt\u008cJØ\u0000$Öd".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
                        purple = cArr;
                        red = -3093755379613807971L;
                    }

                    {
                        super(1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static String alpha(byte b2, byte b4, byte b6) {
                        int i25;
                        int i26 = 106 - b6;
                        int i27 = (b4 * 2) + 4;
                        int i28 = b2 * 4;
                        byte[] bArr = new byte[1 - i28];
                        int i29 = 0 - i28;
                        byte[] bArr2 = f6621c;
                        if (bArr2 == null) {
                            int i30 = i27;
                            int i31 = 0;
                            byte[] bArr3 = bArr2;
                            int i32 = i29;
                            int i33 = i30 + 1;
                            i26 = (-i27) + i32;
                            i27 = i33;
                            bArr2 = bArr3;
                            i25 = i31;
                            bArr[i25] = (byte) i26;
                            i31 = i25 + 1;
                            if (i25 == i29) {
                                return new String(bArr, 0);
                            }
                            int i34 = i26;
                            i30 = i27;
                            i27 = bArr2[i27];
                            bArr3 = bArr2;
                            i32 = i34;
                            int i332 = i30 + 1;
                            i26 = (-i27) + i32;
                            i27 = i332;
                            bArr2 = bArr3;
                            i25 = i31;
                            bArr[i25] = (byte) i26;
                            i31 = i25 + 1;
                            if (i25 == i29) {
                            }
                        } else {
                            i25 = 0;
                            bArr[i25] = (byte) i26;
                            i31 = i25 + 1;
                            if (i25 == i29) {
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x01ac  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static void delta(char c3, int i25, int i26, Object[] objArr3) {
                        Throwable cause;
                        int i27;
                        char c4;
                        int i28;
                        int i29;
                        int i30;
                        int i31 = 1;
                        int i32 = 0;
                        cy cyVar = new cy();
                        long[] jArr = new long[i26];
                        cyVar.component5 = 0;
                        while (true) {
                            int i33 = cyVar.component5;
                            if (i33 >= i26) {
                                break;
                            }
                            try {
                                Object[] objArr4 = new Object[i31];
                                objArr4[i32] = Integer.valueOf(purple[i25 + i33]);
                                Object D8871 = uH18377.D8871(-31669226);
                                Class cls = Integer.TYPE;
                                if (D8871 == null) {
                                    int green = Color.green(i32) + 52;
                                    int gidForName = 2122 - Process.getGidForName("");
                                    c4 = 3;
                                    char c10 = (char) (ExpandableListView.getPackedPositionForGroup(i32) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i32) == 0L ? 0 : -1));
                                    i28 = 359345605;
                                    byte b2 = (byte) i32;
                                    i29 = 2;
                                    byte b4 = b2;
                                    i27 = i32;
                                    String alpha = alpha(b2, b4, b4);
                                    Class[] clsArr = new Class[i31];
                                    clsArr[i27] = cls;
                                    D8871 = uH18377.setPivotYN16904(green, gidForName, c10, 564618947, false, alpha, clsArr);
                                } else {
                                    i27 = i32;
                                    c4 = 3;
                                    i28 = 359345605;
                                    i29 = 2;
                                }
                                Long l10 = (Long) ((Method) D8871).invoke(null, objArr4);
                                l10.getClass();
                                long j5 = i33;
                                long j6 = red;
                                Object[] objArr5 = new Object[4];
                                objArr5[c4] = Integer.valueOf(c3);
                                objArr5[i29] = Long.valueOf(j6);
                                objArr5[i31] = Long.valueOf(j5);
                                objArr5[i27] = l10;
                                Object D88712 = uH18377.D8871(-897540670);
                                if (D88712 == null) {
                                    int i34 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50;
                                    int i35 = i27;
                                    int indexOf = TextUtils.indexOf((CharSequence) "", '0', i35, i35) + 2797;
                                    char c11 = (char) (32780 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    byte b6 = (byte) i35;
                                    byte b10 = b6;
                                    i30 = i31;
                                    String alpha2 = alpha(b6, b10, (byte) (b10 + 3));
                                    Class[] clsArr2 = new Class[4];
                                    Class cls2 = Long.TYPE;
                                    clsArr2[i35] = cls2;
                                    clsArr2[i30] = cls2;
                                    clsArr2[i29] = cls2;
                                    clsArr2[c4] = cls;
                                    D88712 = uH18377.setPivotYN16904(i34, indexOf, c11, 356204311, false, alpha2, clsArr2);
                                } else {
                                    i30 = i31;
                                }
                                jArr[i33] = ((Long) ((Method) D88712).invoke(null, objArr5)).longValue();
                                Object[] objArr6 = new Object[i29];
                                objArr6[i30] = cyVar;
                                objArr6[0] = cyVar;
                                Object D88713 = uH18377.D8871(i28);
                                if (D88713 == null) {
                                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 52;
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2175;
                                    char indexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                    byte b11 = (byte) 0;
                                    byte b12 = b11;
                                    String alpha3 = alpha(b11, b12, (byte) (b12 + 2));
                                    Class[] clsArr3 = new Class[2];
                                    clsArr3[0] = Object.class;
                                    clsArr3[i30] = Object.class;
                                    D88713 = uH18377.setPivotYN16904(offsetAfter, fadingEdgeLength, indexOf2, -892301552, false, alpha3, clsArr3);
                                }
                                ((Method) D88713).invoke(null, objArr6);
                                i31 = i30;
                                i32 = 0;
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
                        int i36 = i31;
                        char[] cArr = new char[i26];
                        cyVar.component5 = 0;
                        while (true) {
                            int i37 = cyVar.component5;
                            if (i37 < i26) {
                                cArr[i37] = (char) jArr[i37];
                                Object[] objArr7 = new Object[2];
                                objArr7[i36] = cyVar;
                                objArr7[0] = cyVar;
                                Object D88714 = uH18377.D8871(359345605);
                                if (D88714 == null) {
                                    int indexOf3 = 52 - TextUtils.indexOf("", "", 0, 0);
                                    int jumpTapTimeout = 2175 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                    byte b13 = (byte) 0;
                                    byte b14 = b13;
                                    String alpha4 = alpha(b13, b14, (byte) (b14 + 2));
                                    Class[] clsArr4 = new Class[2];
                                    clsArr4[0] = Object.class;
                                    clsArr4[i36] = Object.class;
                                    D88714 = uH18377.setPivotYN16904(indexOf3, jumpTapTimeout, modifierMetaStateMask, -892301552, false, alpha4, clsArr4);
                                }
                                ((Method) D88714).invoke(null, objArr7);
                            } else {
                                objArr3[0] = new String(cArr);
                                return;
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static void foxtrot(short s3, byte b2, short s9, Object[] objArr3) {
                        int i25;
                        int i26;
                        int i27;
                        int i28 = (s9 * 4) + 4;
                        int i29 = 99 - s3;
                        int i30 = (b2 * 3) + 1;
                        byte[] bArr = new byte[i30];
                        byte[] bArr2 = white;
                        if (bArr2 == null) {
                            int i31 = i30;
                            i25 = i28;
                            i27 = 0;
                            i28 = i28 + (-i31) + 6;
                            i25++;
                            i26 = i27;
                            i27 = i26 + 1;
                            bArr[i26] = (byte) i28;
                            if (i27 == i30) {
                                objArr3[0] = new String(bArr, 0);
                                return;
                            }
                            i31 = bArr2[i25];
                            i28 = i28 + (-i31) + 6;
                            i25++;
                            i26 = i27;
                            i27 = i26 + 1;
                            bArr[i26] = (byte) i28;
                            if (i27 == i30) {
                            }
                        } else {
                            i28 = i29;
                            i25 = i28;
                            i26 = 0;
                            i27 = i26 + 1;
                            bArr[i26] = (byte) i28;
                            if (i27 == i30) {
                            }
                        }
                    }

                    public static void india() {
                        white = new byte[]{10, -17, -106, -61, -6, 5, -3};
                        yellow = 59;
                    }

                    public static void juliet() {
                        f6621c = new byte[]{9, 50, -90, 103};
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(37:155|156|(1:158)|159|160|(3:162|(1:164)(1:338)|165)(1:339)|166|167|(1:169)|170|(5:172|(1:174)|175|176|(20:178|179|180|(1:182)|183|(1:185)(4:295|(1:297)|298|299)|186|(1:294)(5:190|(7:192|193|(1:195)|196|197|(2:290|291)(3:199|(5:201|(1:203)|204|205|(3:207|208|(2:285|286)(0))(1:287))(1:289)|288)|210)|292|293|211)|212|(1:(4:214|(6:216|(11:220|221|222|223|224|(1:226)(1:275)|227|(3:229|230|(1:232)(2:233|234))|274|230|(0)(0))|280|274|230|(0)(0))|281|282)(2:283|284))|235|236|237|(7:239|(4:241|242|243|244)(1:270)|246|247|(2:249|250)|251|(7:253|254|255|256|(1:258)|259|260))|272|255|256|(0)|259|260))|300|(10:303|304|(1:306)(1:331)|307|308|(1:330)(7:312|(5:314|315|(1:317)|318|319)|324|(1:326)(1:329)|327|328|323)|321|322|323|301)|332|333|(1:335)(1:337)|336|179|180|(0)|183|(0)(0)|186|(1:188)|294|212|(2:(0)(0)|282)|235|236|237|(0)|272|255|256|(0)|259|260) */
                    /* JADX WARN: Code restructure failed: missing block: B:245:0x3648, code lost:
                    
                        if (r5.isFile() != false) goto L395;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:271:0x3651, code lost:
                    
                        if (r5.isFile() != false) goto L395;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:273:0x36af, code lost:
                    
                        r2 = ~(r76 & 151);
                        r3 = r76 | 151;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:320:0x2825, code lost:
                    
                        if ((r5 | (r7 & (((r9 | ((~(r10 | (-746081871))) | 1367674881)) * 520) + (((r12 | r9) * (-1040)) + r11)))) != 0) goto L264;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:113:0x117e A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x1267  */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x1345  */
                    /* JADX WARN: Removed duplicated region for block: B:138:0x15ba  */
                    /* JADX WARN: Removed duplicated region for block: B:151:0x16f1 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:155:0x17d4  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x2968 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:185:0x29ad  */
                    /* JADX WARN: Removed duplicated region for block: B:214:0x3445  */
                    /* JADX WARN: Removed duplicated region for block: B:232:0x3537 A[LOOP:8: B:215:0x3452->B:232:0x3537, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:233:0x3548 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:239:0x3629  */
                    /* JADX WARN: Removed duplicated region for block: B:258:0x3701 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:283:0x356f A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:295:0x29b0 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:340:0x37cd  */
                    /* JADX WARN: Removed duplicated region for block: B:342:0x16d4 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:347:0x1514  */
                    /* JADX WARN: Removed duplicated region for block: B:348:0x126e  */
                    /* JADX WARN: Removed duplicated region for block: B:370:0x1101 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:372:0x0ec3  */
                    /* JADX WARN: Removed duplicated region for block: B:373:0x0da5  */
                    /* JADX WARN: Removed duplicated region for block: B:376:0x0b66 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:381:0x095f  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0798 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x0945  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0969  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0a3a  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0bb6 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x0bf4  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x0cba A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x0da2  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x0e36 A[Catch: all -> 0x384e, TryCatch #7 {all -> 0x384e, blocks: (B:6:0x00f8, B:8:0x0105, B:9:0x014e, B:21:0x02bc, B:23:0x02ca, B:24:0x0307, B:32:0x0516, B:34:0x0523, B:35:0x0558, B:41:0x0792, B:43:0x0798, B:44:0x07c8, B:62:0x0a3c, B:64:0x0a49, B:65:0x0a92, B:72:0x0bac, B:74:0x0bb6, B:75:0x0be9, B:81:0x0cab, B:83:0x0cba, B:84:0x0cfa, B:89:0x0e2c, B:91:0x0e36, B:92:0x0e6d, B:99:0x107e, B:101:0x1088, B:102:0x10c6, B:111:0x116f, B:113:0x117e, B:114:0x11be, B:125:0x13f9, B:127:0x1407, B:128:0x1451, B:139:0x15c5, B:141:0x15d4, B:142:0x1620, B:149:0x16eb, B:151:0x16f1, B:152:0x1732, B:156:0x17df, B:158:0x17f1, B:159:0x1832, B:167:0x192d, B:169:0x1937, B:170:0x1972, B:172:0x197b, B:174:0x1994, B:175:0x19d9, B:180:0x295e, B:182:0x2968, B:183:0x29a4, B:193:0x2f04, B:195:0x2f11, B:196:0x2f58, B:256:0x36f4, B:258:0x3701, B:259:0x373c, B:201:0x3054, B:203:0x3061, B:204:0x30a3, B:295:0x29b0, B:297:0x29ca, B:298:0x2a0c, B:304:0x26a3, B:306:0x26ad, B:307:0x26f8, B:315:0x271e, B:317:0x272e, B:318:0x2772, B:385:0x0687, B:387:0x0691, B:388:0x06c3, B:394:0x0715, B:396:0x071f, B:397:0x0753, B:407:0x03c2, B:409:0x03d0, B:410:0x0409), top: B:5:0x00f8 }] */
                    /* JADX WARN: Removed duplicated region for block: B:95:0x0eb1  */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x107c  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static Object[] vD14832N6715(Context context, int i25, int i26, int i27) {
                        int i28;
                        int i29;
                        int i30;
                        Class cls;
                        float f5;
                        int i31;
                        int i32;
                        int i33;
                        int i34;
                        int i35;
                        int i36;
                        int i37;
                        int i38;
                        Object D8871;
                        long j5;
                        String str;
                        File file;
                        int i39;
                        int i40;
                        char c3;
                        int i41;
                        int i42;
                        int i43;
                        long j6;
                        int i44;
                        Object D88712;
                        String str2;
                        int i45;
                        double d4;
                        Object D88713;
                        Object D88714;
                        String lowerCase;
                        Object[] objArr3;
                        int i46;
                        int i47;
                        int i48;
                        int i49;
                        int i50;
                        double d9;
                        int i51;
                        Object D88715;
                        int i52;
                        int foxtrot2;
                        int i53;
                        int i54;
                        int i55;
                        int i56;
                        String[] strArr;
                        int i57;
                        int i58;
                        int i59;
                        Object D88716;
                        int i60;
                        int i61;
                        String[] strArr2;
                        int i62;
                        int i63;
                        int i64;
                        int i65;
                        String[] strArr3;
                        int i66;
                        int i67;
                        int i68;
                        int i69;
                        int i70;
                        Object D88717;
                        Object invoke;
                        int i71;
                        int i72;
                        int i73;
                        char c4;
                        int i74;
                        int i75;
                        int i76;
                        int i77;
                        Object D88718;
                        File file2;
                        int i78;
                        String[] strArr4;
                        boolean z2;
                        String next;
                        int i79;
                        int i80;
                        int i81;
                        String[] strArr5;
                        int i82;
                        int i83;
                        String[] strArr6;
                        Scanner useDelimiter;
                        String str3;
                        String[] strArr7;
                        int i84 = yellow;
                        int i85 = 0;
                        int i86 = 1;
                        String str4 = "";
                        int i87 = -TextUtils.lastIndexOf("", '0', 0);
                        int i88 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i89 = (i88 ^ 909) + ((i88 & 909) << 1);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        Object[] objArr4 = new Object[1];
                        delta((char) ((i87 & 12811) + (i87 | 12811)), i89, (makeMeasureSpec ^ 8) + ((makeMeasureSpec & 8) << 1), objArr4);
                        String str5 = (String) objArr4[0];
                        Object[] objArr5 = new Object[1];
                        delta((char) Color.argb(0, 0, 0, 0), ViewConfiguration.getKeyRepeatDelay() >> 16, 26 - MotionEvent.axisFromString(""), objArr5);
                        String str6 = (String) objArr5[0];
                        char resolveSize = (char) View.resolveSize(0, 0);
                        int i90 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i91 = (i90 ^ 26) + ((i90 & 26) << 1);
                        int i92 = -(-Color.argb(0, 0, 0, 0));
                        Object[] objArr6 = new Object[1];
                        delta(resolveSize, i91, (i92 & 25) + (i92 | 25), objArr6);
                        String str7 = (String) objArr6[0];
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18551);
                        int normalizeMetaState = KeyEvent.normalizeMetaState(0);
                        int i93 = ((normalizeMetaState | 52) << 1) - (normalizeMetaState ^ 52);
                        float f10 = 0.0f;
                        int i94 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr7 = new Object[1];
                        delta(maximumFlingVelocity, i93, (i94 & 17) + (i94 | 17), objArr7);
                        String str8 = (String) objArr7[0];
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int i95 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int i96 = ((i95 | 70) << 1) - (i95 ^ 70);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr8 = new Object[1];
                        delta(absoluteGravity, i96, ((packedPositionGroup | 28) << 1) - (packedPositionGroup ^ 28), objArr8);
                        String[] strArr8 = {str6, str7, str8, (String) objArr8[0]};
                        int i97 = 0;
                        while (true) {
                            if (i97 >= 4) {
                                i28 = i85;
                                i29 = i86;
                                i30 = -1;
                                cls = String.class;
                                f5 = f10;
                                i31 = 6;
                                i32 = 2;
                                i33 = i25;
                                break;
                            }
                            i31 = 6;
                            try {
                                Object[] objArr9 = new Object[i86];
                                objArr9[i85] = strArr8[i97];
                                Object D88719 = uH18377.D8871(1979478258);
                                if (D88719 == null) {
                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 52;
                                    int i98 = 2952 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    i32 = 2;
                                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                    f5 = f10;
                                    byte b2 = (byte) (i84 & 6);
                                    byte b4 = (byte) (b2 - 2);
                                    i28 = i85;
                                    Object[] objArr10 = new Object[i86];
                                    foxtrot(b2, b4, b4, objArr10);
                                    String str9 = (String) objArr10[i28];
                                    Class[] clsArr = new Class[i86];
                                    clsArr[i28] = String.class;
                                    D88719 = uH18377.setPivotYN16904(longPressTimeout, i98, pressedStateDuration, -1438133721, false, str9, clsArr);
                                } else {
                                    i28 = i85;
                                    f5 = f10;
                                    i32 = 2;
                                }
                                long longValue = ((Long) ((Method) D88719).invoke(null, objArr9)).longValue();
                                long j7 = -858508574;
                                i29 = i86;
                                String[] strArr9 = strArr8;
                                long j10 = -1;
                                long j11 = ((longValue ^ j10) | j7) ^ j10;
                                long j12 = (((j7 ^ j10) | longValue) ^ j10) | j11;
                                i30 = -1;
                                cls = String.class;
                                long tango = j10 ^ (j7 | ao.ad.tango(1778852783));
                                long j13 = 658;
                                long j14 = (j13 * (j11 | tango)) + (j13 * j11) + ((-658) * (j12 | tango)) + ((-657) * longValue) + (659 * j7) + 1633329880;
                                int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                int foxtrot3 = ((int) (j14 >> 32)) & A0.z.foxtrot((~(maxMemory | 1644113840)) | (~((-206887430) | maxMemory)) | 201379845, -1444, (((~maxMemory) | 1839986101) * 1444) - 1153123274, -1325071180);
                                int i99 = (int) j14;
                                int i100 = ((~((-134358405) | i25)) * 521) + 426725032;
                                int i101 = ~i25;
                                int i102 = i99 & ((((~((-134358405) | i101)) | (-1572339711)) * 521) + i100);
                                if (((foxtrot3 & i102) | (foxtrot3 ^ i102)) != 0) {
                                    int i103 = (i97 & 190) + (i97 | 190);
                                    i33 = (i103 & i101) | ((~i103) & i25);
                                    break;
                                }
                                i97 = (i97 ^ 1) + ((i97 & 1) << 1);
                                strArr8 = strArr9;
                                i86 = i29;
                                f10 = f5;
                                i85 = i28;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i104 = -(-MotionEvent.axisFromString(""));
                        int i105 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i106 = (i105 ^ 98) + ((i105 & 98) << 1);
                        int i107 = i28;
                        Object[] objArr11 = new Object[i29];
                        delta((char) ((i104 & 1) + (i104 | 1)), i106, Color.argb(i107, i107, i107, i107) + 12, objArr11);
                        String str10 = (String) objArr11[i107];
                        char resolveOpacity = (char) Drawable.resolveOpacity(i107, i107);
                        int i108 = -(-(AudioTrack.getMinVolume() > f5 ? 1 : (AudioTrack.getMinVolume() == f5 ? 0 : -1)));
                        int i109 = ((i108 | 110) << 1) - (i108 ^ 110);
                        int i110 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i111 = (i110 ^ 12) + ((i110 & 12) << 1);
                        Object[] objArr12 = new Object[1];
                        delta(resolveOpacity, i109, i111, objArr12);
                        String str11 = (String) objArr12[0];
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int indexOf = TextUtils.indexOf((CharSequence) "", '0');
                        Object[] objArr13 = new Object[1];
                        delta(maximumDrawingCacheSize, (indexOf ^ 124) + ((indexOf & 124) << 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, objArr13);
                        String[] strArr10 = {str10, str11, (String) objArr13[0]};
                        int i112 = 0;
                        while (i112 < 3) {
                            int i113 = teal;
                            int i114 = (i113 ^ 111) + ((i113 & 111) << 1);
                            silver = i114 % 128;
                            if (i114 % 2 != 0) {
                                Object[] objArr14 = {strArr10[i112]};
                                Object D887110 = uH18377.D8871(-2104138125);
                                if (D887110 == null) {
                                    int indexOf2 = 52 - TextUtils.indexOf("", "", 0);
                                    int resolveSizeAndState = 2951 - View.resolveSizeAndState(0, 0, 0);
                                    char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                    byte b6 = (byte) (i84 & 5);
                                    byte b10 = (byte) (b6 - 1);
                                    Object[] objArr15 = new Object[1];
                                    foxtrot(b6, b10, b10, objArr15);
                                    D887110 = uH18377.setPivotYN16904(indexOf2, resolveSizeAndState, lastIndexOf, 1563346086, false, (String) objArr15[0], new Class[]{cls});
                                }
                                long longValue2 = ((Long) ((Method) D887110).invoke(null, objArr14)).longValue();
                                long j15 = 454406196;
                                long j16 = 216;
                                i34 = 5;
                                long myPid = Process.myPid();
                                long j17 = j15 | myPid;
                                strArr7 = strArr10;
                                long j18 = i30;
                                long j19 = myPid ^ j18;
                                long j20 = ((j16 * ((j18 ^ (j19 | j15)) | longValue2)) + (((-216) * ((j15 | (longValue2 ^ j18)) | j19)) + (((j17 ^ j18) * j16) + (((-215) * longValue2) + (217 * j15))))) - 1684026726;
                                int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                int i115 = (((~(342823518 | freeMemory)) | (-1780049930)) * (-318)) + 673335418;
                                int i116 = ~((-1780049930) | freeMemory);
                                int i117 = ~freeMemory;
                                int i118 = ((int) (j20 >> 30)) & ((((~(freeMemory | (-342233687))) | (~((-589833) | i117))) * 318) + ((i116 | (~((-342233687) | i117))) * 318) + i115);
                                int myTid = Process.myTid();
                                int foxtrot4 = ((int) j20) & A0.z.foxtrot(~(myTid | 1606414255), -1504, (((~(1589453615 | myTid)) | 16960640) * 1504) + 1320243365, 1798498736);
                                if (((i118 & foxtrot4) | (i118 ^ foxtrot4)) != 0) {
                                    teal = (silver + 97) % 128;
                                    i35 = i25 ^ (i112 + 270);
                                    break;
                                }
                                i112++;
                                strArr10 = strArr7;
                                i30 = -1;
                            } else {
                                strArr7 = strArr10;
                                i34 = 5;
                                Object[] objArr16 = {strArr7[i112]};
                                Object D887111 = uH18377.D8871(-2104138125);
                                if (D887111 == null) {
                                    int indexOf3 = TextUtils.indexOf("", "", 0, 0) + 52;
                                    int offsetAfter = 2951 - TextUtils.getOffsetAfter("", 0);
                                    char indexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                    byte b11 = (byte) (i84 & 5);
                                    byte b12 = (byte) (b11 - 1);
                                    Object[] objArr17 = new Object[1];
                                    foxtrot(b11, b12, b12, objArr17);
                                    D887111 = uH18377.setPivotYN16904(indexOf3, offsetAfter, indexOf4, 1563346086, false, (String) objArr17[0], new Class[]{cls});
                                }
                                long longValue3 = ((Long) ((Method) D887111).invoke(null, objArr16)).longValue();
                                long j21 = -728310847;
                                long j22 = (565 * longValue3) + ((-563) * j21);
                                long j23 = -1;
                                long j24 = j21 ^ j23;
                                long j25 = longValue3 ^ j23;
                                long j26 = i25;
                                long j27 = j26 ^ j23;
                                long j28 = ((564 * (((j21 | longValue3) ^ j23) | ((j24 | j27) ^ j23))) + ((1128 * (((j24 | longValue3) | j26) ^ j23)) + (((-564) * ((j24 | ((j25 | j27) ^ j23)) | ((longValue3 | j26) ^ j23))) + j22))) - 501309683;
                                int tango2 = ao.ad.tango(500470032);
                                int i119 = ((int) (j28 >> 32)) & ((((~(tango2 | 1072165781)) | (~((-533128086) | (~tango2)))) * 338) + ((((539037696 | r9) | (~(533128085 | tango2))) * (-338)) - 1051626070));
                                int i120 = ~i25;
                                if ((i119 | (((int) j28) & (((~(520819170 | i25)) * 113) + (((~(i120 | (-546587142))) | (~(916407239 | i25)) | 150999072) * (-113)) + (((~(520819170 | i120)) | (-916407240)) * 226) + 2055568080))) != 0) {
                                    teal = (silver + 97) % 128;
                                    i35 = i25 ^ (i112 + 270);
                                    break;
                                }
                                i112++;
                                strArr10 = strArr7;
                                i30 = -1;
                            }
                        }
                        i34 = 5;
                        silver = (teal + 3) % 128;
                        i35 = i25;
                        int i121 = (~i33) & i25;
                        int i122 = ~i25;
                        int i123 = i121 | (i33 & i122);
                        int i124 = -i123;
                        int i125 = ((i123 & i124) | (i123 ^ i124)) >> 31;
                        int i126 = i35 & (~i125);
                        int i127 = i33 & i125;
                        int i128 = (i127 & i126) | (i126 ^ i127);
                        int i129 = -(-Color.blue(0));
                        Object[] objArr18 = new Object[1];
                        delta((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), ((i129 | ModuleDescriptor.MODULE_VERSION) << 1) - (i129 ^ ModuleDescriptor.MODULE_VERSION), 61 - (~(-AndroidCharacter.getMirror('0'))), objArr18);
                        Object[] objArr19 = {(String) objArr18[0]};
                        Object D887112 = uH18377.D8871(-2104138125);
                        if (D887112 == null) {
                            int i130 = 52 - (AudioTrack.getMinVolume() > f5 ? 1 : (AudioTrack.getMinVolume() == f5 ? 0 : -1));
                            int red2 = 2951 - Color.red(0);
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b13 = (byte) (i84 & 5);
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr20 = new Object[1];
                            foxtrot(b13, b14, b14, objArr20);
                            D887112 = uH18377.setPivotYN16904(i130, red2, windowTouchSlop, 1563346086, false, (String) objArr20[0], new Class[]{cls});
                        }
                        long longValue4 = ((Long) ((Method) D887112).invoke(null, objArr19)).longValue();
                        long j29 = -1099583701;
                        long j30 = -272;
                        long j31 = -1;
                        long j32 = j29 ^ j31;
                        long j33 = j32 | (longValue4 ^ j31);
                        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        long j34 = ((272 * (longValue4 | ((elapsedCpuTime | j29) ^ j31))) + ((j30 * (((j32 | longValue4) ^ j31) | ((j32 | elapsedCpuTime) ^ j31))) + (((((j33 | (elapsedCpuTime ^ j31)) ^ j31) | (((j29 | longValue4) | elapsedCpuTime) ^ j31)) * j30) + (((-271) * longValue4) + (273 * j29))))) - 130036829;
                        int myUid = Process.myUid();
                        int foxtrot5 = ((int) (j34 >> 32)) & A0.z.foxtrot((~(myUid | (-1354721610))) | (~(1503019275 | myUid)) | 2697280, -69, (((~(1505716555 | myUid)) | (~((-1352024330) | myUid))) * 69) - 205377952, 1828716682);
                        int myUid2 = Process.myUid();
                        int i131 = ((int) j34) & ((((~((~myUid2) | 1657608456)) | (-1877989975)) * 398) + (((~(1657608456 | myUid2)) | (-1877989975)) * 398) + 1276538661);
                        if (((foxtrot5 & i131) | (foxtrot5 ^ i131)) == 0) {
                            char alpha = (char) Color.alpha(0);
                            int i132 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i133 = i132 * (-523);
                            int i134 = ((i133 | 40502) << 1) - (i133 ^ 40502);
                            int i135 = ~i132;
                            int i136 = (i135 & 154) | (i135 ^ 154);
                            int i137 = ~i136;
                            int i138 = ((-155) ^ i132) | ((-155) & i132);
                            int i139 = ~i138;
                            int i140 = (i137 & i139) | (i137 ^ i139);
                            int i141 = ~(((-155) ^ i25) | ((-155) & i25));
                            int i142 = -(-(((i140 & i141) | (i140 ^ i141)) * 262));
                            int i143 = ((i134 | i142) << 1) - (i142 ^ i134);
                            int i144 = (~i138) * (-786);
                            int i145 = (i143 & i144) + (i144 | i143);
                            int i146 = ~((-155) | i122);
                            int i147 = ~i136;
                            int i148 = (i147 & i146) | (i146 ^ i147);
                            int i149 = ~(i132 | (-155));
                            Object[] objArr21 = new Object[1];
                            delta(alpha, (i145 - (~(((i149 & i148) | (i148 ^ i149)) * 262))) - 1, 23 - (~(-TextUtils.indexOf("", ""))), objArr21);
                            Object[] objArr22 = {(String) objArr21[0]};
                            Object D887113 = uH18377.D8871(-957097391);
                            if (D887113 == null) {
                                int alpha2 = Color.alpha(0) + 52;
                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 3158;
                                char tapTimeout = (char) (58074 - (ViewConfiguration.getTapTimeout() >> 16));
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr23 = new Object[1];
                                foxtrot(b15, b16, b16, objArr23);
                                D887113 = uH18377.setPivotYN16904(alpha2, pressedStateDuration2, tapTimeout, 424179844, false, (String) objArr23[0], new Class[]{cls});
                            }
                            String str12 = (String) ((Method) D887113).invoke(null, objArr22);
                            if (str12 == null || str12.isEmpty()) {
                                int i150 = -ExpandableListView.getPackedPositionChild(0L);
                                int i151 = -ExpandableListView.getPackedPositionGroup(0L);
                                int i152 = (i151 & 179) + (i151 | 179);
                                int lastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                int i153 = (lastIndexOf2 ^ 25) + ((lastIndexOf2 & 25) << 1);
                                Object[] objArr24 = new Object[1];
                                delta((char) ((i150 ^ 16332) + ((i150 & 16332) << 1)), i152, i153, objArr24);
                                Object[] objArr25 = {(String) objArr24[0]};
                                Object D887114 = uH18377.D8871(-957097391);
                                if (D887114 == null) {
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3158;
                                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 58074);
                                    byte b17 = (byte) 0;
                                    byte b18 = b17;
                                    Object[] objArr26 = new Object[1];
                                    foxtrot(b17, b18, b18, objArr26);
                                    D887114 = uH18377.setPivotYN16904(jumpTapTimeout, maxKeyCode, touchSlop, 424179844, false, (String) objArr26[0], new Class[]{cls});
                                }
                                String str13 = (String) ((Method) D887114).invoke(null, objArr25);
                                if (str13 == null || str13.isEmpty()) {
                                    i36 = i25;
                                } else {
                                    int i154 = teal + 67;
                                    silver = i154 % 128;
                                    if (i154 % 2 != 0) {
                                        i36 = (~(i25 & 15941)) & (i25 | 15941);
                                    } else {
                                        i37 = i25 & (-268);
                                        i38 = i122 & 267;
                                    }
                                }
                            } else {
                                i36 = (~(i25 & 267)) & (i25 | 267);
                                teal = (silver + 15) % 128;
                            }
                            int i155 = (~(i25 & i128)) & (i25 | i128);
                            int i156 = (i155 | (-i155)) >> 31;
                            int i157 = i36 & (~i156);
                            int i158 = i156 & i128;
                            int i159 = (i157 & i158) | (i157 ^ i158);
                            D8871 = uH18377.D8871(1074526551);
                            if (D8871 == null) {
                                int i160 = 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int capsMode = 1055 - TextUtils.getCapsMode("", 0, 0);
                                char normalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                byte b19 = (byte) 0;
                                byte b20 = (byte) (b19 + 1);
                                Object[] objArr27 = new Object[1];
                                foxtrot(b19, b20, (byte) (b20 - 1), objArr27);
                                D8871 = uH18377.setPivotYN16904(i160, capsMode, normalizeMetaState2, -1615832190, false, (String) objArr27[0], new Class[0]);
                            }
                            long longValue5 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                            long j35 = 156404268;
                            long j36 = -949;
                            long j37 = (j36 * longValue5) + (j36 * j35);
                            long j38 = longValue5 ^ j31;
                            j5 = i25;
                            long j39 = j5 ^ j31;
                            long j40 = (950 * (((j35 | j5) ^ j31) | ((j39 | longValue5) ^ j31))) + ((-950) * (((j39 | j35) ^ j31) | ((longValue5 | j5) ^ j31))) + (1900 * (((j38 | j39) ^ j31) | (((j35 ^ j31) | j5) ^ j31))) + j37 + 23161449;
                            int myUid3 = Process.myUid();
                            int i161 = ((~(219027772 | myUid3)) * 216) + 364684154;
                            int i162 = ~myUid3;
                            int tango3 = ao.ad.tango(1903456119);
                            int i163 = ~tango3;
                            int i164 = (((int) (j40 >> 32)) & ((((~(i162 | 219027772)) | 1218198638) * 216) + (((-1083188291) | i162) * (-216)) + i161)) | (((int) j40) & ((((~(tango3 | (-1456215733))) | (~(2128361205 | i163)) | 18989322) * 676) + (((~(691134795 | i163)) | (-2147350528)) * 676) + ((2147350527 | tango3) * (-676)) + 1871558137));
                            int i165 = i164 + 199;
                            int i166 = (i165 & i122) | ((~i165) & i25);
                            int i167 = -i164;
                            int i168 = ((i164 & i167) | (i164 ^ i167)) >> 31;
                            int i169 = (~i168) & i25;
                            int i170 = i168 & i166;
                            int i171 = (i170 & i169) | (i169 ^ i170);
                            int i172 = ((~i159) & i25) | (i159 & i122);
                            int i173 = -i172;
                            int i174 = ((i172 & i173) | (i172 ^ i173)) >> 31;
                            int i175 = i171 & (~i174);
                            int i176 = i159 & i174;
                            int i177 = (i176 & i175) | (i175 ^ i176);
                            char c10 = (char) (4098 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
                            int i178 = -TextUtils.getCapsMode("", 0, 0);
                            int i179 = (i178 ^ 203) + ((i178 & 203) << 1);
                            int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                            int i180 = ((jumpTapTimeout2 | 20) << 1) - (jumpTapTimeout2 ^ 20);
                            Object[] objArr28 = new Object[1];
                            delta(c10, i179, i180, objArr28);
                            String str14 = (String) objArr28[0];
                            Object[] objArr29 = new Object[1];
                            delta((char) (0 - (~((byte) KeyEvent.getModifierMetaStateMask()))), 222 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), 5 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr29);
                            str = (String) objArr29[0];
                            file = new File(str14);
                            if (file.exists() && file.isFile()) {
                                try {
                                    Scanner scanner = new Scanner(new FileInputStream(file));
                                    char c11 = (char) (0 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))));
                                    int i181 = -KeyEvent.getDeadChar(0, 0);
                                    int i182 = (i181 ^ 229) + ((i181 & 229) << 1);
                                    int i183 = -(-TextUtils.getOffsetAfter("", 0));
                                    int i184 = (i183 ^ 2) + ((i183 & 2) << 1);
                                    Object[] objArr30 = new Object[1];
                                    delta(c11, i182, i184, objArr30);
                                    useDelimiter = scanner.useDelimiter((String) objArr30[0]);
                                    if (useDelimiter.hasNext()) {
                                        str3 = "";
                                    } else {
                                        int i185 = silver;
                                        int i186 = (i185 & 107) + (i185 | 107);
                                        teal = i186 % 128;
                                        if (i186 % 2 == 0) {
                                            useDelimiter.next();
                                            throw null;
                                        }
                                        str3 = useDelimiter.next();
                                    }
                                    useDelimiter.close();
                                } catch (IOException unused) {
                                }
                                if (str3.contains(str)) {
                                    i39 = 1;
                                    int i187 = (i39 | (-i39)) >> 31;
                                    int i188 = (i187 & ((i25 & (-263)) | (i122 & 262))) | ((~i187) & i25);
                                    int i189 = ((~i177) & i25) | (i177 & i122);
                                    int i190 = -i189;
                                    int i191 = ((i189 & i190) | (i189 ^ i190)) >> 31;
                                    int i192 = i188 & (~i191);
                                    int i193 = i177 & i191;
                                    i40 = (i193 & i192) | (i192 ^ i193);
                                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21690);
                                    c3 = 0;
                                    int i194 = 230 - (~(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)));
                                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                                    int i195 = (absoluteGravity2 & 31) + (absoluteGravity2 | 31);
                                    Object[] objArr31 = new Object[1];
                                    delta(scrollDefaultDelay, i194, i195, objArr31);
                                    String str15 = (String) objArr31[0];
                                    char red3 = (char) Color.red(0);
                                    int i196 = 262 - (~(-(-MotionEvent.axisFromString(""))));
                                    int i197 = -(-Color.green(0));
                                    Object[] objArr32 = new Object[1];
                                    delta(red3, i196, (i197 & 23) + (i197 | 23), objArr32);
                                    String str16 = (String) objArr32[0];
                                    int trimmedLength = TextUtils.getTrimmedLength("");
                                    int alpha3 = Color.alpha(0);
                                    int i198 = (alpha3 & 285) + (alpha3 | 285);
                                    int i199 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                    int i200 = (i199 ^ 27) + ((i199 & 27) << 1);
                                    Object[] objArr33 = new Object[1];
                                    delta((char) ((trimmedLength & 37334) + (trimmedLength | 37334)), i198, i200, objArr33);
                                    String str17 = (String) objArr33[0];
                                    char c12 = (char) ((-2) - ((-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) ^ (-1)));
                                    int i201 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    i41 = 1;
                                    int i202 = (i201 ^ 313) + ((i201 & 313) << 1);
                                    int i203 = -(-TextUtils.indexOf("", "", 0, 0));
                                    int i204 = (i203 ^ 14) + ((i203 & 14) << 1);
                                    Object[] objArr34 = new Object[1];
                                    delta(c12, i202, i204, objArr34);
                                    String[] strArr11 = {str15, str16, str17, (String) objArr34[0]};
                                    i42 = 0;
                                    while (true) {
                                        if (i42 >= 4) {
                                            i43 = i40;
                                            j6 = j5;
                                            i44 = i25;
                                            break;
                                        }
                                        Object[] objArr35 = new Object[i41];
                                        objArr35[c3] = strArr11[i42];
                                        Object D887115 = uH18377.D8871(1565484532);
                                        if (D887115 == null) {
                                            int i205 = 53 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int trimmedLength2 = 2951 - TextUtils.getTrimmedLength("");
                                            char c13 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                            byte b21 = (byte) 0;
                                            byte b22 = (byte) (b21 + 1);
                                            i43 = i40;
                                            Object[] objArr36 = new Object[1];
                                            foxtrot(b21, b22, (byte) (b22 - 1), objArr36);
                                            D887115 = uH18377.setPivotYN16904(i205, trimmedLength2, c13, -2097887455, false, (String) objArr36[0], new Class[]{cls});
                                        } else {
                                            i43 = i40;
                                        }
                                        long longValue6 = ((Long) ((Method) D887115).invoke(null, objArr35)).longValue();
                                        long j41 = -247287172;
                                        j6 = j5;
                                        long j42 = -712;
                                        long j43 = longValue6 ^ j31;
                                        long j44 = (j43 | j41) ^ j31;
                                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                        long j45 = elapsedCpuTime2 ^ j31;
                                        long j46 = (j45 | j41) ^ j31;
                                        long j47 = (712 * (j43 | j46)) + (j42 * ((((j43 | j45) | j41) ^ j31) | ((elapsedCpuTime2 | (longValue6 | j41)) ^ j31))) + ((j44 | j46) * j42) + (713 * longValue6) + ((-711) * j41) + 1202441074;
                                        int i206 = ((int) (j47 >> 32)) & ((((~((-1116524545) | i25)) | 286328234 | (~(320701866 | i122))) * 904) + (((~((-34373633) | i25)) | (~(1402852778 | i122))) * 904) + ((((~((-320701867) | i25)) | (~(1116524544 | i122))) * (-1808)) - 726936070));
                                        int myUid4 = Process.myUid();
                                        int i207 = ((int) j47) & (((~(myUid4 | (-721563657))) * 566) + (((~((-1058222602) | myUid4)) | 336658945) * (-566)) + 133175435);
                                        if (((i207 & i206) | (i206 ^ i207)) != 0) {
                                            int i208 = silver;
                                            teal = (((i208 | 87) << 1) - (i208 ^ 87)) % 128;
                                            int i209 = i42 + 252;
                                            i44 = (~(i25 & i209)) & (i25 | i209);
                                            break;
                                        }
                                        i42 = (i42 & 1) + (i42 | 1);
                                        i40 = i43;
                                        j5 = j6;
                                        c3 = 0;
                                        i41 = 1;
                                    }
                                    int i210 = (~(i25 & i43)) & (i25 | i43);
                                    int i211 = (i210 | (-i210)) >> 31;
                                    int i212 = (i44 & (~i211)) | (i43 & i211);
                                    float f11 = f5;
                                    int i213 = -(-(PointF.length(f11, f11) > f11 ? 1 : (PointF.length(f11, f11) == f11 ? 0 : -1)));
                                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    Object[] objArr37 = new Object[1];
                                    delta((char) ((i213 ^ 59218) + ((i213 & 59218) << 1)), (keyRepeatTimeout & 327) + (keyRepeatTimeout | 327), TextUtils.getOffsetAfter("", 0) + 13, objArr37);
                                    Object[] objArr38 = {(String) objArr37[0]};
                                    D88712 = uH18377.D8871(-957097391);
                                    if (D88712 == null) {
                                        int i214 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                                        int packedPositionType = 3158 - ExpandableListView.getPackedPositionType(0L);
                                        char green = (char) (58074 - Color.green(0));
                                        byte b23 = (byte) 0;
                                        byte b24 = b23;
                                        Object[] objArr39 = new Object[1];
                                        foxtrot(b23, b24, b24, objArr39);
                                        D88712 = uH18377.setPivotYN16904(i214, packedPositionType, green, 424179844, false, (String) objArr39[0], new Class[]{cls});
                                    }
                                    str2 = (String) ((Method) D88712).invoke(null, objArr38);
                                    if (str2 != null) {
                                        char c14 = (char) (17381 - (~(-TextUtils.lastIndexOf("", '0'))));
                                        int i215 = -View.resolveSizeAndState(0, 0, 0);
                                        Object[] objArr40 = new Object[1];
                                        delta(c14, (i215 ^ 340) + ((i215 & 340) << 1), 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr40);
                                        if (str2.contains((String) objArr40[0])) {
                                            teal = (silver + 15) % 128;
                                            i45 = (i25 & (-251)) | (i122 & 250);
                                            int i216 = (~(i25 & i212)) & (i25 | i212);
                                            int i217 = -i216;
                                            int i218 = ((i216 & i217) | (i216 ^ i217)) >> 31;
                                            int i219 = (i212 & i218) | (i45 & (~i218));
                                            char c15 = (char) (15795 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                                            int i220 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int i221 = (i220 ^ 348) + ((i220 & 348) << 1);
                                            d4 = 0.0d;
                                            int i222 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                            int i223 = (i222 & 17) + (i222 | 17);
                                            Object[] objArr41 = new Object[1];
                                            delta(c15, i221, i223, objArr41);
                                            String str18 = (String) objArr41[0];
                                            int i224 = -AndroidCharacter.getMirror('0');
                                            int i225 = 365 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            int i226 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i227 = ((i226 | 7) << 1) - (i226 ^ 7);
                                            Object[] objArr42 = new Object[1];
                                            delta((char) (((i224 | 48) << 1) - (i224 ^ 48)), i225, i227, objArr42);
                                            String str19 = (String) objArr42[0];
                                            Object[] objArr43 = new Object[i32];
                                            objArr43[1] = str19;
                                            objArr43[0] = str18;
                                            D88713 = uH18377.D8871(1214576837);
                                            if (D88713 == null) {
                                                int makeMeasureSpec2 = 52 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                int threadPriority = 3314 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                byte b25 = (byte) 0;
                                                byte b26 = (byte) (b25 + 1);
                                                Object[] objArr44 = new Object[1];
                                                foxtrot(b25, b26, (byte) (b26 - 1), objArr44);
                                                D88713 = uH18377.setPivotYN16904(makeMeasureSpec2, threadPriority, packedPositionGroup2, -1746970096, false, (String) objArr44[0], new Class[]{cls, cls});
                                            }
                                            long longValue7 = ((Long) ((Method) D88713).invoke(null, objArr43)).longValue();
                                            long j48 = 447548007;
                                            long j49 = longValue7 ^ j31;
                                            long j50 = (j39 | longValue7) ^ j31;
                                            long j51 = ((-970) * (((j49 | j48) ^ j31) | j50)) + (971 * longValue7) + ((-1939) * j48);
                                            long j52 = j48 ^ j31;
                                            long j53 = ((970 * (((j52 | j49) ^ j31) | j50)) + ((1940 * ((longValue7 | j52) ^ j31)) + j51)) - 1995186345;
                                            int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                            int i228 = ((int) (j53 >> 32)) & ((((~((~maxMemory2) | 1633448929)) | (-1224291956)) * 217) + (((~(maxMemory2 | 1224291955)) | (-1778218996)) * 217) + ((((~(1224291955 | r9)) | (~(1633448929 | maxMemory2))) * 217) - 1819877148));
                                            int i229 = ((int) j53) & ((((~(854148331 | i25)) | 2003592554) * 519) + (((~((-1157898497) | i122)) | (~(2012046827 | i25))) * (-519)) + (((~((-2003592555) | i122)) | 854148331) * 519) + 1453938690);
                                            int i230 = ((i229 & i228) | (i228 ^ i229)) == 0 ? i25 ^ 251 : i25;
                                            int i231 = ((~i219) & i25) | (i219 & i122);
                                            int i232 = -i231;
                                            int i233 = ((i231 & i232) | (i231 ^ i232)) >> 31;
                                            int i234 = (i219 & i233) | (i230 & (~i233));
                                            int i235 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                            int alpha4 = W0.alpha();
                                            int i236 = resolveOpacity2 * (-574);
                                            int i237 = (i236 & (-213528)) + (i236 | (-213528));
                                            int i238 = ~resolveOpacity2;
                                            int i239 = ~alpha4;
                                            int i240 = ~((i238 & i239) | (i238 ^ i239));
                                            int i241 = ~(((-373) & alpha4) | ((-373) ^ alpha4));
                                            int i242 = (((i240 & i241) | (i240 ^ i241)) * 1150) + i237;
                                            int i243 = ~(((-373) & alpha4) | ((-373) ^ alpha4));
                                            int i244 = ~((i239 ^ 372) | (i239 & 372));
                                            int i245 = (i242 - (~(((i243 & i244) | (i243 ^ i244)) * (-575)))) - 1;
                                            int i246 = ~(alpha4 | (~resolveOpacity2));
                                            int i247 = ~((resolveOpacity2 & i239) | (i239 ^ resolveOpacity2));
                                            int i248 = ((i247 & i246) | (i246 ^ i247)) * 575;
                                            int i249 = (i245 ^ i248) + ((i248 & i245) << 1);
                                            int i250 = -(-KeyEvent.getDeadChar(0, 0));
                                            int i251 = (i250 & 23) + (i250 | 23);
                                            Object[] objArr45 = new Object[1];
                                            delta((char) ((i235 & 28265) + (i235 | 28265)), i249, i251, objArr45);
                                            Object[] objArr46 = {(String) objArr45[0]};
                                            D88714 = uH18377.D8871(-957097391);
                                            if (D88714 == null) {
                                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52;
                                                int normalizeMetaState3 = 3158 - KeyEvent.normalizeMetaState(0);
                                                char red4 = (char) (Color.red(0) + 58074);
                                                byte b27 = (byte) 0;
                                                byte b28 = b27;
                                                Object[] objArr47 = new Object[1];
                                                foxtrot(b27, b28, b28, objArr47);
                                                D88714 = uH18377.setPivotYN16904(scrollBarFadeDuration, normalizeMetaState3, red4, 424179844, false, (String) objArr47[0], new Class[]{cls});
                                            }
                                            lowerCase = ((String) ((Method) D88714).invoke(null, objArr46)).toLowerCase();
                                            char c16 = (char) (30622 - (~(-TextUtils.lastIndexOf("", '0'))));
                                            int i252 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                            int i253 = ((i252 | 394) << 1) - (i252 ^ 394);
                                            int i254 = -(-TextUtils.lastIndexOf("", '0', 0));
                                            int i255 = (i254 & 5) + (i254 | 5);
                                            objArr3 = new Object[1];
                                            delta(c16, i253, i255, objArr3);
                                            if (lowerCase.contains((String) objArr3[0])) {
                                                i46 = i25;
                                            } else {
                                                int i256 = silver;
                                                teal = ((i256 & 39) + (i256 | 39)) % 128;
                                                i46 = (~(i25 & 264)) & (i25 | 264);
                                            }
                                            int i257 = (~(i25 & i234)) & (i25 | i234);
                                            int i258 = -i257;
                                            int i259 = ((i257 & i258) | (i257 ^ i258)) >> 31;
                                            int i260 = i46 & (~i259);
                                            int i261 = i234 & i259;
                                            int i262 = (i261 & i260) | (i260 ^ i261);
                                            char combineMeasuredStates = (char) (27079 - View.combineMeasuredStates(0, 0));
                                            int argb = 399 - Color.argb(0, 0, 0, 0);
                                            int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                            int i263 = (edgeSlop ^ 42) + ((edgeSlop & 42) << 1);
                                            Object[] objArr48 = new Object[1];
                                            delta(combineMeasuredStates, argb, i263, objArr48);
                                            String str20 = (String) objArr48[0];
                                            char c17 = (char) (38348 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))));
                                            int i264 = -TextUtils.getOffsetAfter("", 0);
                                            int i265 = i264 * (-755);
                                            int i266 = (i265 ^ (-332955)) + ((i265 & (-332955)) << 1);
                                            int i267 = ~i264;
                                            int i268 = ((~((i267 ^ (-442)) | (i267 & (-442)))) * 1512) + i266;
                                            int i269 = ~(i267 | (-442));
                                            int i270 = i264 | 441;
                                            int i271 = ~((i270 & i25) | (i270 ^ i25));
                                            int i272 = (i268 - (~(-(-(((i269 & i271) | (i269 ^ i271)) * (-756)))))) - 1;
                                            int i273 = (i264 & 441) | (i264 ^ 441);
                                            int i274 = ((i273 & i122) | (i273 ^ i122)) * 756;
                                            int i275 = ((i272 | i274) << 1) - (i274 ^ i272);
                                            int i276 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i277 = (i276 ^ 39) + ((i276 & 39) << 1);
                                            Object[] objArr49 = new Object[1];
                                            delta(c17, i275, i277, objArr49);
                                            String str21 = (String) objArr49[0];
                                            int i278 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i279 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            Object[] objArr50 = new Object[1];
                                            delta((char) (((i278 | 1) << 1) - (i278 ^ 1)), ((i279 | 481) << 1) - (i279 ^ 481), 25 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr50);
                                            String str22 = (String) objArr50[0];
                                            char c18 = (char) (18993 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                                            int i280 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i281 = (i280 & 508) + (i280 | 508);
                                            int i282 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int i283 = (i282 ^ 27) + ((i282 & 27) << 1);
                                            Object[] objArr51 = new Object[1];
                                            delta(c18, i281, i283, objArr51);
                                            String str23 = (String) objArr51[0];
                                            int i284 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i285 = i284 * 522;
                                            int i286 = (i285 ^ (-29848000)) + ((i285 & (-29848000)) << 1);
                                            int i287 = ~(i122 | 57400);
                                            int i288 = ((i287 & i284) | (i284 ^ i287)) * (-1042);
                                            int i289 = (((i25 ^ 57400) | (i25 & 57400)) * 521) + (i286 ^ i288) + ((i288 & i286) << 1);
                                            int i290 = ~((~i284) | (-57401));
                                            int i291 = ~i284;
                                            int i292 = ~((i291 & i25) | (i291 ^ i25));
                                            int i293 = (i290 & i292) | (i290 ^ i292);
                                            int i294 = ~i25;
                                            int i295 = (i284 & i294) | (i294 ^ i284);
                                            int i296 = ~((i295 & 57400) | (i295 ^ 57400));
                                            int i297 = -(-(((i296 & i293) | (i293 ^ i296)) * 521));
                                            char c19 = (char) ((i289 ^ i297) + ((i297 & i289) << 1));
                                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i298 = (makeMeasureSpec3 ^ 535) + ((makeMeasureSpec3 & 535) << 1);
                                            int threadPriority2 = Process.getThreadPriority(0);
                                            Object[] objArr52 = new Object[1];
                                            delta(c19, i298, 27 - (((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6), objArr52);
                                            String str24 = (String) objArr52[0];
                                            int i299 = -TextUtils.getTrimmedLength("");
                                            int i300 = 562 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            i47 = 0;
                                            int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                                            int i301 = (capsMode2 & 27) + (capsMode2 | 27);
                                            i48 = 1;
                                            Object[] objArr53 = new Object[1];
                                            delta((char) (((i299 | 32344) << 1) - (i299 ^ 32344)), i300, i301, objArr53);
                                            String[] strArr12 = {str20, str21, str22, str23, str24, (String) objArr53[0]};
                                            i49 = 0;
                                            i50 = i31;
                                            while (true) {
                                                if (i49 < i50) {
                                                    d9 = d4;
                                                    i51 = i25;
                                                    break;
                                                }
                                                Object[] objArr54 = new Object[i48];
                                                objArr54[i47] = strArr12[i49];
                                                Object D887116 = uH18377.D8871(-957097391);
                                                if (D887116 == null) {
                                                    int resolveOpacity3 = Drawable.resolveOpacity(i47, i47) + 52;
                                                    int resolveSizeAndState2 = 3158 - View.resolveSizeAndState(i47, i47, i47);
                                                    char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58074);
                                                    byte b29 = (byte) i47;
                                                    byte b30 = b29;
                                                    int i302 = i47;
                                                    d9 = d4;
                                                    Object[] objArr55 = new Object[1];
                                                    foxtrot(b29, b30, b30, objArr55);
                                                    String str25 = (String) objArr55[i302];
                                                    Class[] clsArr2 = new Class[1];
                                                    clsArr2[i302] = cls;
                                                    D887116 = uH18377.setPivotYN16904(resolveOpacity3, resolveSizeAndState2, edgeSlop2, 424179844, false, str25, clsArr2);
                                                } else {
                                                    d9 = d4;
                                                }
                                                String str26 = (String) ((Method) D887116).invoke(null, objArr54);
                                                if (str26 == null || str26.isEmpty()) {
                                                    i49++;
                                                    d4 = d9;
                                                    i47 = 0;
                                                    i50 = 6;
                                                    i48 = 1;
                                                } else {
                                                    int i303 = teal;
                                                    int i304 = ((i303 | 17) << 1) - (i303 ^ 17);
                                                    silver = i304 % 128;
                                                    i51 = i304 % 2 != 0 ? i25 ^ 30730 : (~(i25 & 265)) & (i25 | 265);
                                                }
                                            }
                                            int i305 = (~(i25 & i262)) & (i25 | i262);
                                            int i306 = (i305 | (-i305)) >> 31;
                                            int i307 = i51 & (~i306);
                                            int i308 = i262 & i306;
                                            int i309 = (i308 & i307) | (i307 ^ i308);
                                            char c20 = (char) (15796 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                            int i310 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            Object[] objArr56 = new Object[1];
                                            delta(c20, ((i310 | 349) << 1) - (i310 ^ 349), 16 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr56);
                                            String str27 = (String) objArr56[0];
                                            int i311 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int keyCodeFromString = 589 - KeyEvent.keyCodeFromString("");
                                            int i312 = -Color.rgb(0, 0, 0);
                                            int i313 = (i312 & (-16777210)) + (i312 | (-16777210));
                                            Object[] objArr57 = new Object[1];
                                            delta((char) ((i311 & 882) + (i311 | 882)), keyCodeFromString, i313, objArr57);
                                            Object[] objArr58 = {str27, (String) objArr57[0]};
                                            D88715 = uH18377.D8871(1214576837);
                                            if (D88715 == null) {
                                                int maxKeyCode2 = 52 - (KeyEvent.getMaxKeyCode() >> 16);
                                                int modifierMetaStateMask = 3313 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                char makeMeasureSpec4 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                byte b31 = (byte) 0;
                                                byte b32 = (byte) (b31 + 1);
                                                Object[] objArr59 = new Object[1];
                                                foxtrot(b31, b32, (byte) (b32 - 1), objArr59);
                                                D88715 = uH18377.setPivotYN16904(maxKeyCode2, modifierMetaStateMask, makeMeasureSpec4, -1746970096, false, (String) objArr59[0], new Class[]{cls, cls});
                                            }
                                            long longValue8 = ((Long) ((Method) D88715).invoke(null, objArr58)).longValue();
                                            long j54 = -219006220;
                                            int i314 = (int) Runtime.getRuntime().totalMemory();
                                            long j55 = HttpConstants.HTTP_PROXY_AUTH;
                                            long j56 = -406;
                                            long j57 = longValue8 ^ j31;
                                            long j58 = i314;
                                            long j59 = j58 ^ j31;
                                            long j60 = ((HttpConstants.HTTP_NOT_ACCEPTABLE * ((((j54 ^ j31) | j58) ^ j31) | ((j59 | longValue8) ^ j31))) + ((j56 * (((j57 | j59) | j54) ^ j31)) + (((((j57 | j58) ^ j31) | (((j59 | j54) | longValue8) ^ j31)) * j56) + ((j55 * longValue8) + ((-405) * j54))))) - 1328632118;
                                            i52 = ((int) (j60 >> 32)) & ((((~((-17056065) | i122)) | (~((-67179523) | i25))) * 210) + (((~(1403808713 | i122)) | (~(1453932171 | i25))) * 210) + 597506782);
                                            foxtrot2 = ((int) j60) & A0.z.foxtrot((~((-1934313034) | i122)) | 1860941526, 381, (((-285229066) | i25) * (-381)) - 87559792, 1298091365);
                                            if (((foxtrot2 & i52) | (i52 ^ foxtrot2)) != 0) {
                                                char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                int i315 = -(-View.getDefaultSize(0, 0));
                                                Object[] objArr60 = new Object[1];
                                                delta(edgeSlop3, (i315 & 595) + (i315 | 595), 12 - (~(-View.getDefaultSize(0, 0))), objArr60);
                                                String str28 = (String) objArr60[0];
                                                int i316 = -Color.green(0);
                                                int i317 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                Object[] objArr61 = new Object[1];
                                                delta((char) ((i316 ^ 1498) + ((i316 & 1498) << 1)), (i317 & 608) + (i317 | 608), 9 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)), objArr61);
                                                String str29 = (String) objArr61[0];
                                                File file3 = new File(str28);
                                                if (file3.exists() && file3.isFile()) {
                                                    try {
                                                        Scanner scanner2 = new Scanner(new FileInputStream(file3));
                                                        char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                        int i318 = 228 - (~(-(-(Process.myTid() >> 22))));
                                                        int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                        int i319 = (scrollDefaultDelay2 & 2) + (scrollDefaultDelay2 | 2);
                                                        Object[] objArr62 = new Object[1];
                                                        delta(maxKeyCode3, i318, i319, objArr62);
                                                        Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr62[0]);
                                                        String next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                                                        useDelimiter2.close();
                                                        if (next2.contains(str29)) {
                                                            int i320 = silver + 7;
                                                            teal = i320 % 128;
                                                            if (i320 % 2 != 0) {
                                                                i54 = i25 & (-262);
                                                                i55 = i122 & 261;
                                                            }
                                                        }
                                                    } catch (IOException unused2) {
                                                    }
                                                }
                                                i53 = i25;
                                                int i321 = i25 ^ i309;
                                                int i322 = (i321 | (-i321)) >> 31;
                                                int i323 = i53 & (~i322);
                                                int i324 = i322 & i309;
                                                i56 = (i323 & i324) | (i323 ^ i324);
                                                if ((i26 & 8) == 0) {
                                                    int i325 = silver;
                                                    teal = ((i325 & 25) + (i325 | 25)) % 128;
                                                    int indexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                    int i326 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    int i327 = (i326 ^ 617) + ((i326 & 617) << 1);
                                                    int i328 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                    int i329 = (i328 & 43) + (i328 | 43);
                                                    Object[] objArr63 = new Object[1];
                                                    delta((char) ((indexOf5 & 64520) + (indexOf5 | 64520)), i327, i329, objArr63);
                                                    String str30 = (String) objArr63[0];
                                                    int i330 = -AndroidCharacter.getMirror('0');
                                                    int i331 = -((Process.getThreadPriority(0) + 20) >> 6);
                                                    Object[] objArr64 = new Object[1];
                                                    delta((char) (((i330 | 48) << 1) - (i330 ^ 48)), (i331 & 660) + (i331 | 660), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42, objArr64);
                                                    String str31 = (String) objArr64[0];
                                                    int pressedStateDuration3 = ViewConfiguration.getPressedStateDuration() >> 16;
                                                    int i332 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    int i333 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int i334 = (i333 ^ 37) + ((i333 & 37) << 1);
                                                    Object[] objArr65 = new Object[1];
                                                    delta((char) ((pressedStateDuration3 & 15576) + (pressedStateDuration3 | 15576)), (i332 ^ 701) + ((i332 & 701) << 1), i334, objArr65);
                                                    String[] strArr13 = {str30, str31, (String) objArr65[0]};
                                                    int i335 = 0;
                                                    while (true) {
                                                        if (i335 >= 3) {
                                                            i82 = i56;
                                                            i83 = i25;
                                                            break;
                                                        }
                                                        silver = (teal + 93) % 128;
                                                        Object[] objArr66 = {strArr13[i335]};
                                                        Object D887117 = uH18377.D8871(1979478258);
                                                        if (D887117 == null) {
                                                            int capsMode3 = 52 - TextUtils.getCapsMode("", 0, 0);
                                                            int i336 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2950;
                                                            char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                                            byte b33 = (byte) (i84 & 6);
                                                            byte b34 = (byte) (b33 - 2);
                                                            i82 = i56;
                                                            strArr6 = strArr13;
                                                            Object[] objArr67 = new Object[1];
                                                            foxtrot(b33, b34, b34, objArr67);
                                                            D887117 = uH18377.setPivotYN16904(capsMode3, i336, modifierMetaStateMask2, -1438133721, false, (String) objArr67[0], new Class[]{cls});
                                                        } else {
                                                            i82 = i56;
                                                            strArr6 = strArr13;
                                                        }
                                                        long longValue9 = ((Long) ((Method) D887117).invoke(null, objArr66)).longValue();
                                                        long j61 = -427739408;
                                                        long j62 = 367;
                                                        long j63 = (j62 * longValue9) + (j62 * j61);
                                                        long j64 = -366;
                                                        long j65 = ((j61 | longValue9) * j64) + j63;
                                                        long j66 = longValue9 ^ j31;
                                                        long j67 = (366 * ((((j61 ^ j31) | longValue9) ^ j31) | (((j61 | j66) | j6) ^ j31))) + (j64 * (j61 | ((j66 | j6) ^ j31))) + j65 + 1202560714;
                                                        int foxtrot6 = ((int) (j67 >> 32)) & A0.z.foxtrot((~(1315189490 | i122)) | (-1226969163), 381, (((-16908297) | i25) * (-381)) + 761822204, 2147093480);
                                                        int i337 = ((int) j67) & ((((~(211206380 | i25)) | 135430316) * 49) + (((~(1226020029 | i122)) | 211206380 | (~((-1226020030) | i25))) * (-49)) + (((~(211206380 | i122)) | 1090589713) * 98) + 2135690417);
                                                        if (((i337 & foxtrot6) | (foxtrot6 ^ i337)) != 0) {
                                                            i83 = ((i335 ^ 280) + ((i335 & 280) << 1)) ^ i25;
                                                            break;
                                                        }
                                                        i335++;
                                                        strArr13 = strArr6;
                                                        i56 = i82;
                                                    }
                                                    int i338 = (~(i25 & i82)) & (i25 | i82);
                                                    int i339 = -i338;
                                                    int i340 = ((i338 & i339) | (i338 ^ i339)) >> 31;
                                                    i56 = (i83 & (~i340)) | (i82 & i340);
                                                }
                                                int i341 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                int alpha5 = W0.alpha();
                                                int i342 = (i341 * 236) - (-1375791);
                                                int i343 = ~i341;
                                                int i344 = ~alpha5;
                                                int i345 = ~((i343 & i344) | (i343 ^ i344));
                                                int i346 = -(-(((i345 & 2921) | (i345 ^ 2921)) * (-235)));
                                                int i347 = (i342 ^ i346) + ((i342 & i346) << 1);
                                                int i348 = ~i341;
                                                int i349 = ~((i348 ^ alpha5) | (i348 & alpha5));
                                                int i350 = ((i349 & 2921) | (i349 ^ 2921)) * (-470);
                                                int i351 = (i347 & i350) + (i350 | i347);
                                                int i352 = (i348 & 2921) | (i348 ^ 2921);
                                                int i353 = ((~((i341 & (-2922)) | ((-2922) ^ i341))) | (~((alpha5 & i352) | (i352 ^ alpha5)))) * 235;
                                                int i354 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 738;
                                                int i355 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                int i356 = ((i355 | 41) << 1) - (i355 ^ 41);
                                                Object[] objArr68 = new Object[1];
                                                delta((char) ((i351 & i353) + (i353 | i351)), i354, i356, objArr68);
                                                String str32 = (String) objArr68[0];
                                                char capsMode4 = (char) TextUtils.getCapsMode("", 0, 0);
                                                int i357 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int i358 = (i357 ^ 780) + ((i357 & 780) << 1);
                                                int i359 = -KeyEvent.keyCodeFromString("");
                                                int i360 = (i359 & 30) + (i359 | 30);
                                                Object[] objArr69 = new Object[1];
                                                delta(capsMode4, i358, i360, objArr69);
                                                strArr = new String[]{str32, (String) objArr69[0]};
                                                i57 = 0;
                                                while (true) {
                                                    if (i57 >= 2) {
                                                        i58 = i56;
                                                        i59 = i25;
                                                        break;
                                                    }
                                                    teal = (silver + 13) % 128;
                                                    Object[] objArr70 = {strArr[i57]};
                                                    Object D887118 = uH18377.D8871(1979478258);
                                                    if (D887118 == null) {
                                                        int gidForName = 51 - Process.getGidForName("");
                                                        int mirror = 2999 - AndroidCharacter.getMirror('0');
                                                        char c21 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                        byte b35 = (byte) (i84 & 6);
                                                        byte b36 = (byte) (b35 - 2);
                                                        i58 = i56;
                                                        strArr5 = strArr;
                                                        Object[] objArr71 = new Object[1];
                                                        foxtrot(b35, b36, b36, objArr71);
                                                        D887118 = uH18377.setPivotYN16904(gidForName, mirror, c21, -1438133721, false, (String) objArr71[0], new Class[]{cls});
                                                    } else {
                                                        i58 = i56;
                                                        strArr5 = strArr;
                                                    }
                                                    long longValue10 = ((Long) ((Method) D887118).invoke(null, objArr70)).longValue();
                                                    long j68 = 73054130;
                                                    long j69 = j68 ^ j31;
                                                    long j70 = ((-381) * (longValue10 | j6 | j69)) + (382 * longValue10) + ((-380) * j68);
                                                    long j71 = 381;
                                                    long j72 = (j71 * ((j69 | longValue10) ^ j31)) + ((((j69 | (longValue10 ^ j31)) ^ j31) | ((j39 | longValue10) ^ j31) | ((j68 | longValue10) ^ j31)) * j71) + j70 + 701767176;
                                                    int myUid5 = Process.myUid();
                                                    int i361 = ~(1979703284 | myUid5);
                                                    int i362 = ((int) (j72 >> 32)) & ((((~(myUid5 | (-9049361))) | (~((~myUid5) | 887086960)) | 1092616324) * 497) + (((i361 | (~((-9049361) | r11))) * 497) - 264750085));
                                                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                                                    int i363 = ((int) j72) & ((((~((~uptimeMillis) | (-84968865))) | 1350901761) * 521) + ((~((-84968865) | uptimeMillis)) * 521) + 2093454764);
                                                    if (((i363 & i362) | (i362 ^ i363)) != 0) {
                                                        teal = (silver + 99) % 128;
                                                        int i364 = i57 + 288;
                                                        i59 = ((~i364) & i25) | (i364 & i122);
                                                        break;
                                                    }
                                                    i57++;
                                                    i56 = i58;
                                                    strArr = strArr5;
                                                }
                                                int i365 = i25 ^ i58;
                                                int i366 = -i365;
                                                int i367 = ((i365 & i366) | (i365 ^ i366)) >> 31;
                                                int i368 = i59 & (~i367);
                                                int i369 = i58 & i367;
                                                int i370 = (i368 & i369) | (i368 ^ i369);
                                                D88716 = uH18377.D8871(-344556366);
                                                if (D88716 == null) {
                                                    int lastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 53;
                                                    int i371 = 3106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 15991);
                                                    byte b37 = (byte) 0;
                                                    byte b38 = (byte) (b37 + 1);
                                                    Object[] objArr72 = new Object[1];
                                                    foxtrot(b37, b38, (byte) (b38 - 1), objArr72);
                                                    D88716 = uH18377.setPivotYN16904(lastIndexOf3, i371, keyRepeatDelay, 885907047, false, (String) objArr72[0], new Class[0]);
                                                }
                                                long longValue11 = ((Long) ((Method) D88716).invoke(null, null)).longValue();
                                                long j73 = 1837943408;
                                                long j74 = -755;
                                                long j75 = ((j73 ^ j31) | (longValue11 ^ j31)) ^ j31;
                                                long j76 = (1512 * j75) + (j74 * longValue11) + (j74 * j73);
                                                long j77 = j73 | longValue11;
                                                long j78 = ((756 * (j77 | j39)) + (((-756) * (j75 | ((j77 | j6) ^ j31))) + j76)) - 1990196506;
                                                i60 = ((int) (j78 >> 32)) & (((~(i122 | (-1237973241))) * 886) + (((-1237973241) | (~((-1619767645) | i122))) * (-1772)) + (((((~(1619767644 | i25)) | (-1774975485)) | (~((-1082765401) | i122))) * 886) - 1222979076));
                                                i61 = ((int) j78) & ((((~(1295229528 | i25)) | 4460801 | (~((-141996882) | i25))) * HttpConstants.HTTP_PROXY_AUTH) + (((~((-1295229529) | i25)) | (~(141996881 | i122)) | 4460801) * HttpConstants.HTTP_PROXY_AUTH) + (((1157693448 | r3) * (-814)) - 1345533451));
                                                if (((i61 & i60) | (i60 ^ i61)) != 1) {
                                                    int i372 = teal;
                                                    silver = ((i372 & 107) + (i372 | 107)) % 128;
                                                    Object[] objArr73 = {1};
                                                    Object D887119 = uH18377.D8871(-38624464);
                                                    if (D887119 == null) {
                                                        int resolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 52;
                                                        int lastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 2848;
                                                        char gidForName2 = (char) (62566 - Process.getGidForName(""));
                                                        byte b39 = (byte) 0;
                                                        byte b40 = (byte) (b39 + 1);
                                                        Object[] objArr74 = new Object[1];
                                                        foxtrot(b39, b40, (byte) (b40 - 1), objArr74);
                                                        D887119 = uH18377.setPivotYN16904(resolveSizeAndState3, lastIndexOf4, gidForName2, 571015653, false, (String) objArr74[0], new Class[]{Integer.TYPE});
                                                    }
                                                    long longValue12 = ((Long) ((Method) D887119).invoke(null, objArr73)).longValue();
                                                    long j79 = 1220340258;
                                                    long j80 = longValue12 ^ j31;
                                                    long j81 = (j79 | j6) ^ j31;
                                                    long j82 = ((-814) * (((j80 | j79) ^ j31) | j81)) + (HttpConstants.HTTP_CLIENT_TIMEOUT * longValue12) + ((-813) * j79);
                                                    long j83 = (j80 | j39) ^ j31;
                                                    long j84 = j79 ^ j31;
                                                    long j85 = (j84 | longValue12) ^ j31;
                                                    long j86 = (j55 * (j85 | ((j84 | j6) ^ j31) | ((longValue12 | j6) ^ j31))) + ((j83 | j85 | j81) * j55) + j82 + 771786508;
                                                    int i373 = ((int) (j86 >> 32)) & ((((-173425670) | i25) * 220) + (((~((-192366152) | i122)) | 1629592562) * (-440)) + ((((~((-173425670) | i122)) | 1610652080) * 220) - 1458782334));
                                                    int i374 = ((int) j86) & ((((~(1533853693 | i25)) | 75513856) * 464) + (((-1248373337) | i25) * (-464)) + (((~((-1323887193) | i122)) | 75513856 | (~(i122 | 1533853693))) * 464) + 1497949541);
                                                    if (((i373 & i374) | (i373 ^ i374)) != 0) {
                                                        int i375 = teal + 21;
                                                        silver = i375 % 128;
                                                        if (i375 % 2 != 0) {
                                                            i80 = ~(i25 & 6580);
                                                            i81 = i25 | 6580;
                                                        } else {
                                                            i80 = ~(i25 & 220);
                                                            i81 = i25 | 220;
                                                        }
                                                        i62 = i80 & i81;
                                                    } else {
                                                        i62 = i25;
                                                    }
                                                    int i376 = ((~i370) & i25) | (i370 & i122);
                                                    int i377 = -i376;
                                                    int i378 = ((i376 & i377) | (i376 ^ i377)) >> 31;
                                                    int i379 = i62 & (~i378);
                                                    int i380 = i370 & i378;
                                                    int i381 = (i380 & i379) | (i379 ^ i380);
                                                    char c22 = (char) (28264 - (~(-(-Color.red(0)))));
                                                    int trimmedLength3 = TextUtils.getTrimmedLength("") + 372;
                                                    int i382 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)));
                                                    int i383 = ((i382 | 23) << 1) - (i382 ^ 23);
                                                    Object[] objArr75 = new Object[1];
                                                    delta(c22, trimmedLength3, i383, objArr75);
                                                    Object[] objArr76 = {(String) objArr75[0]};
                                                    Object D887120 = uH18377.D8871(-957097391);
                                                    if (D887120 == null) {
                                                        int i384 = 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                        int indexOf6 = 3158 - TextUtils.indexOf("", "", 0, 0);
                                                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 58074);
                                                        byte b41 = (byte) 0;
                                                        byte b42 = b41;
                                                        Object[] objArr77 = new Object[1];
                                                        foxtrot(b41, b42, b42, objArr77);
                                                        D887120 = uH18377.setPivotYN16904(i384, indexOf6, fadingEdgeLength, 424179844, false, (String) objArr77[0], new Class[]{cls});
                                                    }
                                                    Object invoke2 = ((Method) D887120).invoke(null, objArr76);
                                                    if (invoke2 != null) {
                                                        Object[] objArr78 = {invoke2, 42};
                                                        Object D887121 = uH18377.D8871(2072770498);
                                                        if (D887121 == null) {
                                                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 51;
                                                            int gidForName3 = Process.getGidForName("") + 1210;
                                                            char c23 = (char) (44357 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                            byte b43 = (byte) 0;
                                                            byte b44 = (byte) (b43 + 1);
                                                            Object[] objArr79 = new Object[1];
                                                            foxtrot(b43, b44, (byte) (b44 - 1), objArr79);
                                                            D887121 = uH18377.setPivotYN16904(offsetAfter2, gidForName3, c23, -1540336361, false, (String) objArr79[0], new Class[]{cls, Integer.TYPE});
                                                        }
                                                        long longValue13 = ((Long) ((Method) D887121).invoke(null, objArr78)).longValue();
                                                        long j87 = 1064304730;
                                                        long j88 = j87 ^ j31;
                                                        long j89 = ((235 * ((((j88 | longValue13) | j6) ^ j31) | (((longValue13 ^ j31) | j87) ^ j31))) + (((-470) * (longValue13 | ((j88 | j6) ^ j31))) + (((-235) * (longValue13 | ((j88 | j39) ^ j31))) + ((471 * longValue13) + (236 * j87))))) - 1071749760;
                                                        if (((((int) (j89 >> 32)) & ((((-1081411) | i25) * 668) + ((1397582776 | (~((-39643635) | i25))) * 1336) + (((~(1397582776 | i25)) | (-39643635)) * (-668)) + 1865267698)) | (((int) j89) & ((((~(908668782 | i122)) | 159383569 | (~((-539494725) | i25))) * 497) + (((~(1068052351 | i25)) | (~((-539494725) | i122))) * 497) + 1653654480))) == 1986687685) {
                                                            i63 = i84;
                                                            i64 = i294;
                                                            strArr3 = null;
                                                            i65 = 0;
                                                            char blue = (char) (Color.blue(i65) + 42950);
                                                            int i385 = -(-Color.blue(i65));
                                                            int i386 = (i385 ^ 891) + ((i385 & 891) << 1);
                                                            int i387 = -View.getDefaultSize(i65, i65);
                                                            int i388 = (i387 ^ 16) + ((i387 & 16) << 1);
                                                            Object[] objArr80 = new Object[1];
                                                            delta(blue, i386, i388, objArr80);
                                                            String str33 = (String) objArr80[i65];
                                                            Object[] objArr81 = new Object[1];
                                                            objArr81[i65] = str33;
                                                            D88717 = uH18377.D8871(-957097391);
                                                            if (D88717 == null) {
                                                                int i389 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
                                                                int i390 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3158;
                                                                char capsMode5 = (char) (TextUtils.getCapsMode("", 0, 0) + 58074);
                                                                byte b45 = (byte) 0;
                                                                byte b46 = b45;
                                                                Object[] objArr82 = new Object[1];
                                                                foxtrot(b45, b46, b46, objArr82);
                                                                D88717 = uH18377.setPivotYN16904(i389, i390, capsMode5, 424179844, false, (String) objArr82[0], new Class[]{cls});
                                                            }
                                                            invoke = ((Method) D88717).invoke(null, objArr81);
                                                            if (invoke != null) {
                                                                i71 = 0;
                                                            } else {
                                                                Object[] objArr83 = {invoke, 42};
                                                                Object D887122 = uH18377.D8871(2072770498);
                                                                if (D887122 == null) {
                                                                    int i391 = 51 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    int maximumFlingVelocity2 = 1209 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    char packedPositionType2 = (char) (44356 - ExpandableListView.getPackedPositionType(0L));
                                                                    byte b47 = (byte) 0;
                                                                    byte b48 = (byte) (b47 + 1);
                                                                    Object[] objArr84 = new Object[1];
                                                                    foxtrot(b47, b48, (byte) (b48 - 1), objArr84);
                                                                    D887122 = uH18377.setPivotYN16904(i391, maximumFlingVelocity2, packedPositionType2, -1540336361, false, (String) objArr84[0], new Class[]{cls, Integer.TYPE});
                                                                }
                                                                long longValue14 = ((Long) ((Method) D887122).invoke(null, objArr83)).longValue();
                                                                long j90 = 1164012697;
                                                                long j91 = -518;
                                                                long j92 = 519;
                                                                long j93 = (j90 ^ j31) | j39;
                                                                long j94 = ((j92 * (((longValue14 | j6) ^ j31) | j90)) + (((-519) * (((j93 | longValue14) ^ j31) | (((j90 | longValue14) | j6) ^ j31))) + (((longValue14 | (j93 ^ j31)) * j92) + ((j91 * longValue14) + (j91 * j90))))) - 1171457727;
                                                                int tango4 = ao.ad.tango(1446691750);
                                                                int i392 = ~tango4;
                                                                int i393 = ((int) (j94 >> 32)) & (((tango4 | 1020867494) * 220) + (((~(i392 | 953233956)) | 483992454) * (-440)) + (((~(1020867494 | i392)) | 416358916) * 220) + 1283311074);
                                                                int foxtrot7 = ((int) j94) & A0.z.foxtrot((~((-221299622) | i25)) | (~(1658526031 | i122)) | 1657477194, -370, (((~((-221299622) | i122)) | (~(1658526031 | i25))) * (-370)) - 635053777, -913761548);
                                                                i71 = (i393 & foxtrot7) | (i393 ^ foxtrot7);
                                                            }
                                                            if (i71 != 1986687685 || i71 == -1514516938) {
                                                                i72 = -1;
                                                            } else {
                                                                Object[] objArr85 = new Object[1];
                                                                delta((char) (0 - (~(-(-TextUtils.lastIndexOf("", '0', 0, 0))))), Color.red(0) + 1610, TextUtils.indexOf((CharSequence) "", '0') + 15, objArr85);
                                                                String str34 = (String) objArr85[0];
                                                                char alpha6 = (char) Color.alpha(0);
                                                                int i394 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                                Object[] objArr86 = new Object[1];
                                                                delta(alpha6, (i394 ^ 1624) + ((i394 & 1624) << 1), 25 - MotionEvent.axisFromString(""), objArr86);
                                                                String str35 = (String) objArr86[0];
                                                                int i395 = -TextUtils.indexOf((CharSequence) "", '0');
                                                                int i396 = 1649 - (~KeyEvent.keyCodeFromString(""));
                                                                int i397 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                                int i398 = (i397 & 17) + (i397 | 17);
                                                                Object[] objArr87 = new Object[1];
                                                                delta((char) (((i395 | 44031) << 1) - (i395 ^ 44031)), i396, i398, objArr87);
                                                                String str36 = (String) objArr87[0];
                                                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 56555);
                                                                int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                                                int i399 = touchSlop2 * 755;
                                                                int i400 = (i399 & (-1255251)) + (i399 | (-1255251));
                                                                int i401 = ~touchSlop2;
                                                                int i402 = ~(i401 | 1667);
                                                                int i403 = ~touchSlop2;
                                                                int i404 = i402 | (~((i403 ^ i25) | (i403 & i25)));
                                                                int i405 = ~(i25 | 1667);
                                                                int i406 = -(-(((i404 & i405) | (i404 ^ i405)) * (-754)));
                                                                int i407 = (i401 & 1667) | (i401 ^ 1667);
                                                                int i408 = ~((i407 & i25) | (i407 ^ i25));
                                                                int i409 = (touchSlop2 & i122) | (i122 ^ touchSlop2);
                                                                int i410 = ~((i409 & 1667) | (i409 ^ 1667));
                                                                int i411 = (((i410 & i408) | (i408 ^ i410)) * (-754)) + (i400 & i406) + (i406 | i400);
                                                                int i412 = -(-(((i403 ^ i122) | (i403 & i122)) * 754));
                                                                Object[] objArr88 = new Object[1];
                                                                delta(packedPositionChild, (i411 ^ i412) + ((i411 & i412) << 1), View.MeasureSpec.getSize(0) + 17, objArr88);
                                                                String str37 = (String) objArr88[0];
                                                                char normalizeMetaState4 = (char) KeyEvent.normalizeMetaState(0);
                                                                int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                                int i413 = (jumpTapTimeout3 & 1684) + (jumpTapTimeout3 | 1684);
                                                                int i414 = -(-TextUtils.getTrimmedLength(""));
                                                                int i415 = ((i414 | 15) << 1) - (i414 ^ 15);
                                                                Object[] objArr89 = new Object[1];
                                                                delta(normalizeMetaState4, i413, i415, objArr89);
                                                                String str38 = (String) objArr89[0];
                                                                int i416 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                int i417 = i416 * 55;
                                                                int i418 = (i417 ^ (-107)) + ((i417 & (-107)) << 1);
                                                                int i419 = ~i416;
                                                                int i420 = ~((i419 & 1) | (i419 ^ 1));
                                                                int i421 = ~(i122 | 1);
                                                                int i422 = (((i420 & i421) | (i420 ^ i421)) * (-108)) + i418;
                                                                int i423 = ~i416;
                                                                int i424 = ~((i423 & i25) | (i423 ^ i25));
                                                                int i425 = ~((-2) | i416);
                                                                int i426 = (i424 & i425) | (i424 ^ i425);
                                                                int i427 = ~((i122 ^ i416) | (i122 & i416));
                                                                int i428 = ((i426 & i427) | (i426 ^ i427)) * 54;
                                                                char c24 = (char) ((((~((i416 & (-2)) | ((-2) ^ i416))) | i25) * 54) + (((i422 | i428) << 1) - (i422 ^ i428)));
                                                                int gidForName4 = Process.getGidForName("") + 1700;
                                                                int i429 = -Color.rgb(0, 0, 0);
                                                                int i430 = (i429 ^ (-16777179)) + ((i429 & (-16777179)) << 1);
                                                                Object[] objArr90 = new Object[1];
                                                                delta(c24, gidForName4, i430, objArr90);
                                                                String str39 = (String) objArr90[0];
                                                                i72 = -1;
                                                                char indexOf7 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                                                int i431 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                                                                int i432 = (i431 ^ 1737) + ((i431 & 1737) << 1);
                                                                int i433 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i434 = ((i433 | 11) << 1) - (i433 ^ 11);
                                                                Object[] objArr91 = new Object[1];
                                                                delta(indexOf7, i432, i434, objArr91);
                                                                String str40 = (String) objArr91[0];
                                                                char combineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                                                int i435 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i436 = ((i435 | 1747) << 1) - (i435 ^ 1747);
                                                                int defaultSize = View.getDefaultSize(0, 0);
                                                                int i437 = ((defaultSize | 13) << 1) - (defaultSize ^ 13);
                                                                Object[] objArr92 = new Object[1];
                                                                delta(combineMeasuredStates2, i436, i437, objArr92);
                                                                String str41 = (String) objArr92[0];
                                                                int i438 = -Gravity.getAbsoluteGravity(0, 0);
                                                                int i439 = -View.resolveSize(0, 0);
                                                                int i440 = (i439 & 1761) + (i439 | 1761);
                                                                int i441 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                int i442 = (i441 & 23) + (i441 | 23);
                                                                Object[] objArr93 = new Object[1];
                                                                delta((char) ((i438 ^ 34855) + ((i438 & 34855) << 1)), i440, i442, objArr93);
                                                                String str42 = (String) objArr93[0];
                                                                char makeMeasureSpec5 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                int i443 = -(-TextUtils.getOffsetBefore("", 0));
                                                                Object[] objArr94 = new Object[1];
                                                                delta(makeMeasureSpec5, (i443 ^ 1783) + ((i443 & 1783) << 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, objArr94);
                                                                String str43 = (String) objArr94[0];
                                                                int lastIndexOf5 = TextUtils.lastIndexOf("", '0', 0);
                                                                int i444 = lastIndexOf5 * (-375);
                                                                int i445 = ((i444 | (-375)) << 1) - (i444 ^ (-375));
                                                                int i446 = ~lastIndexOf5;
                                                                int i447 = (~((i446 ^ (-2)) | (i446 & (-2)))) | i25;
                                                                int i448 = ~((lastIndexOf5 ^ 1) | (lastIndexOf5 & 1));
                                                                int i449 = -(-(((i447 & i448) | (i447 ^ i448)) * 376));
                                                                int i450 = ((((i445 | i449) << 1) - (i445 ^ i449)) - (~(((~(lastIndexOf5 | 1)) | (~((i64 ^ lastIndexOf5) | (i64 & lastIndexOf5)))) * (-376)))) - 1;
                                                                int i451 = ~((i446 ^ i25) | (i446 & i25));
                                                                Object[] objArr95 = new Object[1];
                                                                delta((char) ((((i451 & 1) | (i451 ^ 1)) * 376) + i450), 1813 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr95);
                                                                String str44 = (String) objArr95[0];
                                                                int i452 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                int i453 = -TextUtils.lastIndexOf("", '0', 0);
                                                                int i454 = (i453 & 1825) + (i453 | 1825);
                                                                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                                                int i455 = ((scrollBarSize | 12) << 1) - (scrollBarSize ^ 12);
                                                                Object[] objArr96 = new Object[1];
                                                                delta((char) ((i452 ^ 4307) + ((i452 & 4307) << 1)), i454, i455, objArr96);
                                                                String str45 = (String) objArr96[0];
                                                                char resolveSizeAndState4 = (char) (View.resolveSizeAndState(0, 0, 0) + 51528);
                                                                int i456 = -TextUtils.indexOf((CharSequence) "", '0');
                                                                int i457 = (i456 ^ 1837) + ((i456 & 1837) << 1);
                                                                int i458 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                int i459 = (i458 & 12) + (i458 | 12);
                                                                Object[] objArr97 = new Object[1];
                                                                delta(resolveSizeAndState4, i457, i459, objArr97);
                                                                String str46 = (String) objArr97[0];
                                                                int i460 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                int i461 = i460 * 319;
                                                                int i462 = (i461 ^ 317) + ((i461 & 317) << 1);
                                                                int i463 = ~i460;
                                                                int i464 = (~((i463 & i25) | (i463 ^ i25))) * (-318);
                                                                int i465 = (i462 & i464) + (i464 | i462);
                                                                int i466 = (i122 ^ i460) | (i122 & i460);
                                                                int i467 = ((~i25) | (~(i466 | (~i466)))) * 318;
                                                                int i468 = (i465 ^ i467) + ((i467 & i465) << 1);
                                                                int i469 = ~((i64 ^ i460) | (i64 & i460));
                                                                int i470 = i460 | (~i460);
                                                                int i471 = ~((i470 & i25) | (i470 ^ i25));
                                                                char c25 = (char) ((i468 - (~(-(-(((i471 & i469) | (i469 ^ i471)) * 318))))) - 1);
                                                                int i472 = -View.MeasureSpec.getMode(0);
                                                                Object[] objArr98 = new Object[1];
                                                                delta(c25, (i472 & 1850) + (i472 | 1850), 11 - (~TextUtils.getCapsMode("", 0, 0)), objArr98);
                                                                String str47 = (String) objArr98[0];
                                                                char myPid2 = (char) (Process.myPid() >> 22);
                                                                int i473 = 1861 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                                                int i474 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                int i475 = (i474 ^ 13) + ((i474 & 13) << 1);
                                                                Object[] objArr99 = new Object[1];
                                                                delta(myPid2, i473, i475, objArr99);
                                                                String str48 = (String) objArr99[0];
                                                                char axisFromString = (char) (MotionEvent.axisFromString("") + 41828);
                                                                int i476 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                int i477 = ((i476 | 1875) << 1) - (i476 ^ 1875);
                                                                int i478 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int i479 = ((i478 | 14) << 1) - (i478 ^ 14);
                                                                Object[] objArr100 = new Object[1];
                                                                delta(axisFromString, i477, i479, objArr100);
                                                                String str49 = (String) objArr100[0];
                                                                char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                int i480 = -View.combineMeasuredStates(0, 0);
                                                                Object[] objArr101 = new Object[1];
                                                                delta(fadingEdgeLength2, (i480 & 1888) + (i480 | 1888), 10 - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr101);
                                                                String str50 = (String) objArr101[0];
                                                                char maxKeyCode4 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                                int i481 = -(-ExpandableListView.getPackedPositionType(0L));
                                                                int i482 = 0;
                                                                Object[] objArr102 = new Object[1];
                                                                delta(maxKeyCode4, ((i481 | 1900) << 1) - (i481 ^ 1900), 23 - (~(-(-Color.blue(0)))), objArr102);
                                                                String str51 = (String) objArr102[0];
                                                                int i483 = 1;
                                                                Object[] objArr103 = new Object[1];
                                                                delta((char) (Process.myPid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 1924, Color.blue(0) + 28, objArr103);
                                                                String[] strArr14 = {str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, (String) objArr103[0]};
                                                                int i484 = 0;
                                                                int i485 = 19;
                                                                while (i484 < i485) {
                                                                    String str52 = strArr14[i484];
                                                                    Object[] objArr104 = new Object[i483];
                                                                    objArr104[i482] = str52;
                                                                    Object D887123 = uH18377.D8871(1979478258);
                                                                    if (D887123 == null) {
                                                                        int indexOf8 = TextUtils.indexOf((CharSequence) "", '0', i482, i482) + 53;
                                                                        int keyRepeatDelay2 = 2951 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                        char c26 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                                        byte b49 = (byte) (i63 & 6);
                                                                        byte b50 = (byte) (b49 - 2);
                                                                        Object[] objArr105 = new Object[1];
                                                                        foxtrot(b49, b50, b50, objArr105);
                                                                        D887123 = uH18377.setPivotYN16904(indexOf8, keyRepeatDelay2, c26, -1438133721, false, (String) objArr105[0], new Class[]{cls});
                                                                    }
                                                                    long longValue15 = ((Long) ((Method) D887123).invoke(null, objArr104)).longValue();
                                                                    long j95 = -372739585;
                                                                    long j96 = 46;
                                                                    String[] strArr15 = strArr14;
                                                                    int i486 = i484;
                                                                    long j97 = longValue15 ^ j31;
                                                                    long j98 = (int) Runtime.getRuntime().totalMemory();
                                                                    long j99 = j98 ^ j31;
                                                                    long j100 = (45 * (j97 | ((j98 | (j95 ^ j31)) ^ j31) | ((j99 | j95) ^ j31))) + ((-45) * (((longValue15 | j95) ^ j31) | ((j97 | j98) ^ j31))) + ((-90) * (j95 | ((j97 | j99) ^ j31))) + (j96 * longValue15) + (j96 * j95) + 1147560891;
                                                                    int tango5 = ao.ad.tango(34784940);
                                                                    int i487 = ~tango5;
                                                                    int i488 = ((int) (j100 >> 32)) & ((((~(tango5 | (-1321297796))) | 71378178 | (~(i487 | (-286523473)))) * 369) + (((~(1321297795 | i487)) | (-1536443090)) * (-369)) + ((((-1249919618) | i487) * (-369)) - 802173004));
                                                                    int foxtrot8 = ((int) j100) & A0.z.foxtrot(~((-33554434) | i25), -1504, (((~((-1108889768) | i25)) | 1075335334) * 1504) + 1320243365, -859141520);
                                                                    if (((i488 & foxtrot8) | (i488 ^ foxtrot8)) != 0) {
                                                                        int i489 = (silver + 39) % 128;
                                                                        teal = i489;
                                                                        silver = (i489 + 67) % 128;
                                                                    } else {
                                                                        char c27 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41826);
                                                                        int i490 = -ExpandableListView.getPackedPositionGroup(0L);
                                                                        int i491 = (i490 & 1874) + (i490 | 1874);
                                                                        int i492 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                        int i493 = (i492 & 14) + (i492 | 14);
                                                                        Object[] objArr106 = new Object[1];
                                                                        delta(c27, i491, i493, objArr106);
                                                                        if (str52.equals((String) objArr106[0])) {
                                                                            Object[] objArr107 = {str52};
                                                                            Object D887124 = uH18377.D8871(1979478258);
                                                                            if (D887124 == null) {
                                                                                int i494 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53;
                                                                                int deadChar = KeyEvent.getDeadChar(0, 0) + 2951;
                                                                                char indexOf9 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                                                                byte b51 = (byte) (i63 & 6);
                                                                                byte b52 = (byte) (b51 - 2);
                                                                                Object[] objArr108 = new Object[1];
                                                                                foxtrot(b51, b52, b52, objArr108);
                                                                                D887124 = uH18377.setPivotYN16904(i494, deadChar, indexOf9, -1438133721, false, (String) objArr108[0], new Class[]{cls});
                                                                            }
                                                                            long longValue16 = ((Long) ((Method) D887124).invoke(null, objArr107)).longValue();
                                                                            long j101 = -489093252;
                                                                            long j102 = j101 ^ j31;
                                                                            long j103 = ((-368) * (longValue16 | j102)) + (185 * longValue16) + ((-183) * j101);
                                                                            long j104 = 184;
                                                                            long j105 = longValue16 ^ j31;
                                                                            long romeo = ao.ad.romeo() ^ j31;
                                                                            long j106 = (j104 * (((romeo | j101) ^ j31) | ((j102 | j105) ^ j31) | ((j101 | longValue16) ^ j31))) + ((j101 | j105 | romeo) * j104) + j103 + 1263914558;
                                                                            if (((((int) (j106 >> 32)) & ((((~(1412636653 | i25)) | (~((-1445104232) | i122))) * 959) + (((~(1412636653 | i122)) | (~((-1445104232) | i25))) * 959) + 365591139)) | (((int) j106) & ((((~((~Process.myTid()) | (-5263381))) | (-1610283967)) * 449) + ((((~((-5263381) | r5)) | (-1610283967)) * 449) - 874493121)))) != 0) {
                                                                                int i495 = teal;
                                                                                int i496 = (i495 ^ 17) + ((i495 & 17) << 1);
                                                                                silver = i496 % 128;
                                                                                if (i496 % 2 != 0) {
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                        i484 = i486 + 1;
                                                                        strArr14 = strArr15;
                                                                        i485 = 19;
                                                                        i482 = 0;
                                                                        i483 = 1;
                                                                    }
                                                                    i79 = i486;
                                                                    break;
                                                                }
                                                                i79 = -1;
                                                                int i497 = (i79 & 130) + (i79 | 130);
                                                                int i498 = (i497 | i25) & (~(i25 & i497));
                                                                int i499 = ~i79;
                                                                int i500 = (i499 | (-i499)) >> 31;
                                                                int i501 = (i500 & i498) | ((~i500) & i25);
                                                                int i502 = ((~i381) & i25) | (i381 & i122);
                                                                int i503 = -i502;
                                                                int i504 = ((i502 & i503) | (i502 ^ i503)) >> 31;
                                                                int i505 = i501 & (~i504);
                                                                int i506 = i381 & i504;
                                                                i381 = (i506 & i505) | (i505 ^ i506);
                                                            }
                                                            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                            int i507 = 1903 - (~(-(-AndroidCharacter.getMirror('0'))));
                                                            int i508 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            int i509 = (i508 ^ 13) + ((i508 & 13) << 1);
                                                            Object[] objArr109 = new Object[1];
                                                            delta(tapTimeout2, i507, i509, objArr109);
                                                            String str53 = (String) objArr109[0];
                                                            int i510 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i511 = -View.resolveSize(0, 0);
                                                            int alpha7 = W0.alpha();
                                                            int i512 = i511 * 659;
                                                            int i513 = ((i512 | (-1291005)) << 1) - (i512 ^ (-1291005));
                                                            int i514 = ~i511;
                                                            int i515 = (~((i514 & 1965) | (i514 ^ 1965))) | (~(((-1966) & i511) | ((-1966) ^ i511)));
                                                            int i516 = (alpha7 & i511) | (i511 ^ alpha7);
                                                            int i517 = ~i516;
                                                            int i518 = (((i515 & i517) | (i515 ^ i517)) * (-658)) + i513;
                                                            int i519 = (~((-1966) | i511)) * 658;
                                                            int i520 = ((i518 | i519) << 1) - (i518 ^ i519);
                                                            int i521 = ~((i511 & (-1966)) | ((-1966) ^ i511));
                                                            int i522 = ~i516;
                                                            Object[] objArr110 = new Object[1];
                                                            delta((char) (((i510 | 65244) << 1) - (i510 ^ 65244)), (((i521 & i522) | (i521 ^ i522)) * 658) + i520, 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr110);
                                                            String[] strArr16 = {str53, (String) objArr110[0]};
                                                            char indexOf10 = (char) TextUtils.indexOf("", "", 0, 0);
                                                            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                            int i523 = (minimumFlingVelocity & 1970) + (minimumFlingVelocity | 1970);
                                                            int i524 = -Color.rgb(0, 0, 0);
                                                            int i525 = (i524 & (-16777201)) + (i524 | (-16777201));
                                                            Object[] objArr111 = new Object[1];
                                                            delta(indexOf10, i523, i525, objArr111);
                                                            String str54 = (String) objArr111[0];
                                                            char combineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                                                            int i526 = -TextUtils.getTrimmedLength("");
                                                            int alpha8 = W0.alpha();
                                                            int i527 = i526 * 306;
                                                            int i528 = (i527 & 610) + (i527 | 610);
                                                            int i529 = (i528 & 607410) + (607410 | i528);
                                                            int i530 = ~((i526 ^ 1985) | (i526 & 1985));
                                                            int i531 = ~((i526 ^ alpha8) | (i526 & alpha8));
                                                            int i532 = (i529 - (~(-(-(((i530 & i531) | (i530 ^ i531)) * HttpConstants.HTTP_USE_PROXY))))) - 1;
                                                            int i533 = ~alpha8;
                                                            int i534 = ~((i526 & i533) | (i533 ^ i526));
                                                            int i535 = -(-(((i534 & (-1986)) | ((-1986) ^ i534)) * HttpConstants.HTTP_USE_PROXY));
                                                            int i536 = ((i532 | i535) << 1) - (i535 ^ i532);
                                                            int i537 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                            int i538 = ((i537 | 19) << 1) - (i537 ^ 19);
                                                            Object[] objArr112 = new Object[1];
                                                            delta(combineMeasuredStates3, i536, i538, objArr112);
                                                            String str55 = (String) objArr112[0];
                                                            int i539 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            int lastIndexOf6 = 2003 - TextUtils.lastIndexOf("", '0');
                                                            int i540 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int i541 = (i540 & 13) + (i540 | 13);
                                                            Object[] objArr113 = new Object[1];
                                                            delta((char) (((i539 | 51490) << 1) - (i539 ^ 51490)), lastIndexOf6, i541, objArr113);
                                                            String[] strArr17 = {str54, str55, (String) objArr113[0]};
                                                            char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49721);
                                                            int i542 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i543 = (i542 & 2018) + (i542 | 2018);
                                                            int i544 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                            int i545 = ((i544 | 22) << 1) - (i544 ^ 22);
                                                            Object[] objArr114 = new Object[1];
                                                            delta(scrollDefaultDelay3, i543, i545, objArr114);
                                                            String str56 = (String) objArr114[0];
                                                            char indexOf11 = (char) TextUtils.indexOf("", "");
                                                            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                                                            int i546 = (scrollBarSize2 & 2039) + (scrollBarSize2 | 2039);
                                                            int i547 = -ExpandableListView.getPackedPositionChild(0L);
                                                            int i548 = ((i547 | 9) << 1) - (i547 ^ 9);
                                                            Object[] objArr115 = new Object[1];
                                                            delta(indexOf11, i546, i548, objArr115);
                                                            String[] strArr18 = {str56, (String) objArr115[0]};
                                                            int i549 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                            int i550 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                            Object[] objArr116 = new Object[1];
                                                            delta((char) (((i549 | 57275) << 1) - (i549 ^ 57275)), (i550 & 2048) + (i550 | 2048), ExpandableListView.getPackedPositionGroup(0L) + 11, objArr116);
                                                            String str57 = (String) objArr116[0];
                                                            int i551 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 589;
                                                            int i552 = -View.resolveSize(0, 0);
                                                            int i553 = (i552 ^ 6) + ((i552 & 6) << 1);
                                                            Object[] objArr117 = new Object[1];
                                                            delta((char) (((i551 | 883) << 1) - (i551 ^ 883)), absoluteGravity3, i553, objArr117);
                                                            String[] strArr19 = {str57, (String) objArr117[0]};
                                                            char c28 = (char) (42615 - (~(ViewConfiguration.getTouchSlop() >> 8)));
                                                            int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                            int alpha9 = W0.alpha();
                                                            int i554 = (longPressTimeout2 * (-743)) - 1530580;
                                                            int i555 = longPressTimeout2 | 2060;
                                                            int i556 = ~i555;
                                                            int i557 = ~(longPressTimeout2 | alpha9);
                                                            int i558 = (i556 ^ i557) | (i556 & i557);
                                                            int i559 = i381;
                                                            int i560 = ~((alpha9 & 2060) | (alpha9 ^ 2060));
                                                            int i561 = ((i560 & i558) | (i558 ^ i560)) * (-744);
                                                            int i562 = ((i554 | i561) << 1) - (i561 ^ i554);
                                                            int i563 = ~alpha9;
                                                            int i564 = ~longPressTimeout2;
                                                            int i565 = (i563 | (~((i564 & (-2061)) | (i564 ^ (-2061))))) * 744;
                                                            int i566 = (i562 & i565) + (i565 | i562);
                                                            int i567 = (i555 | alpha9) * 744;
                                                            i73 = 1;
                                                            int i568 = ((i566 | i567) << 1) - (i567 ^ i566);
                                                            int i569 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                                            int i570 = ((i569 | 28) << 1) - (i569 ^ 28);
                                                            Object[] objArr118 = new Object[1];
                                                            delta(c28, i568, i570, objArr118);
                                                            c4 = 0;
                                                            String str58 = (String) objArr118[0];
                                                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                            int i571 = -View.MeasureSpec.getSize(0);
                                                            Object[] objArr119 = new Object[1];
                                                            delta(bitsPerPixel, (i571 ^ 2039) + ((i571 & 2039) << 1), 10 - View.MeasureSpec.getSize(0), objArr119);
                                                            String[][] strArr20 = {strArr16, strArr17, strArr18, strArr19, new String[]{str58, (String) objArr119[0]}};
                                                            i74 = i34;
                                                            i75 = 0;
                                                            loop7: while (true) {
                                                                if (i75 < i74) {
                                                                    i76 = i25;
                                                                    break;
                                                                }
                                                                String[] strArr21 = strArr20[i75];
                                                                String str59 = strArr21[c4];
                                                                String[] strArr22 = (String[]) Arrays.copyOfRange(strArr21, i73, strArr21.length);
                                                                int length = strArr22.length;
                                                                int i572 = 0;
                                                                while (i572 < length) {
                                                                    String str60 = strArr22[i572];
                                                                    int i573 = (i72 & 81) + (i72 | 81);
                                                                    int i574 = (i573 | (-80)) + (i573 & (-80));
                                                                    File file4 = new File(str59);
                                                                    if (file4.exists() && file4.isFile()) {
                                                                        try {
                                                                            Scanner scanner3 = new Scanner(new FileInputStream(file4));
                                                                            int i575 = -TextUtils.indexOf((CharSequence) "", '0');
                                                                            char c29 = (char) ((i575 ^ (-1)) + (i575 << 1));
                                                                            int i576 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                            int alpha10 = W0.alpha();
                                                                            i78 = i75;
                                                                            int i577 = (i576 ^ 228) | (i576 & 228);
                                                                            int i578 = ~alpha10;
                                                                            int i579 = (((i577 ^ i578) | (i577 & i578)) * (-369)) + (i576 * 370) + 84360;
                                                                            int i580 = ~i576;
                                                                            int i581 = ~((i580 ^ i578) | (i580 & i578));
                                                                            strArr4 = strArr22;
                                                                            int i582 = (i579 - (~(-(-(((i581 & 228) | (i581 ^ 228)) * (-369)))))) - 1;
                                                                            int i583 = ~(((-229) ^ i576) | ((-229) & i576));
                                                                            int i584 = ~((i576 ^ alpha10) | (i576 & alpha10));
                                                                            int i585 = (i583 ^ i584) | (i584 & i583);
                                                                            int i586 = ~i576;
                                                                            int i587 = ~alpha10;
                                                                            int i588 = (i587 & i586) | (i586 ^ i587);
                                                                            int i589 = (i585 | (~((i588 & 228) | (i588 ^ 228)))) * 369;
                                                                            try {
                                                                                Object[] objArr120 = new Object[1];
                                                                                delta(c29, (i582 ^ i589) + ((i582 & i589) << 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, objArr120);
                                                                                Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr120[0]);
                                                                                next = useDelimiter3.hasNext() ? useDelimiter3.next() : "";
                                                                                useDelimiter3.close();
                                                                            } catch (IOException unused3) {
                                                                            }
                                                                        } catch (IOException unused4) {
                                                                        }
                                                                        if (next.contains(str60)) {
                                                                            z2 = true;
                                                                            if (z2) {
                                                                                i76 = ((i574 ^ 170) + ((i574 & 170) << 1)) ^ i25;
                                                                                break loop7;
                                                                            }
                                                                            i572 = ((i572 | 1) << 1) - (i572 ^ 1);
                                                                            i72 = i574;
                                                                            i75 = i78;
                                                                            strArr22 = strArr4;
                                                                        }
                                                                        z2 = false;
                                                                        if (z2) {
                                                                        }
                                                                    }
                                                                    i78 = i75;
                                                                    strArr4 = strArr22;
                                                                    z2 = false;
                                                                    if (z2) {
                                                                    }
                                                                }
                                                                int i590 = i75 - 33;
                                                                i75 = (i590 | 34) + (i590 & 34);
                                                                int i591 = silver;
                                                                teal = ((i591 ^ 53) + ((i591 & 53) << 1)) % 128;
                                                                i74 = 5;
                                                                i73 = 1;
                                                                c4 = 0;
                                                            }
                                                            int i592 = i25 ^ i559;
                                                            int i593 = -i592;
                                                            int i594 = ((i592 & i593) | (i592 ^ i593)) >> 31;
                                                            int i595 = i76 & (~i594);
                                                            int i596 = i559 & i594;
                                                            int i597 = (i595 & i596) | (i595 ^ i596);
                                                            char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                            int i598 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i599 = (i598 * (-515)) - (-1079496);
                                                            int i600 = ~((-2089) | i25);
                                                            int i601 = ~((i122 ^ i598) | (i122 & i598));
                                                            int i602 = (i600 & i601) | (i600 ^ i601);
                                                            int i603 = ~((i122 ^ 2088) | (i122 & 2088));
                                                            int i604 = ((i602 & i603) | (i602 ^ i603)) * (-516);
                                                            int i605 = (i599 ^ i604) + ((i599 & i604) << 1);
                                                            int i606 = ~i598;
                                                            int i607 = (i606 ^ (-2089)) | (i606 & (-2089));
                                                            int i608 = i606 | i122;
                                                            int i609 = (((~((i607 & i25) | (i607 ^ i25))) | (~((i608 & 2088) | (i608 ^ 2088)))) * 516) + i605;
                                                            int i610 = ~((i606 & 2088) | (i606 ^ 2088));
                                                            int i611 = ((i610 & i603) | (i610 ^ i603)) * 516;
                                                            Object[] objArr121 = new Object[1];
                                                            delta(pressedStateDuration4, (i609 ^ i611) + ((i611 & i609) << 1), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr121);
                                                            String str61 = (String) objArr121[0];
                                                            char c30 = (char) (49931 - (~(-TextUtils.getOffsetBefore("", 0))));
                                                            int argb2 = Color.argb(0, 0, 0, 0) + 2101;
                                                            int indexOf12 = TextUtils.indexOf((CharSequence) "", '0');
                                                            int i612 = (indexOf12 & 9) + (indexOf12 | 9);
                                                            Object[] objArr122 = new Object[1];
                                                            delta(c30, argb2, i612, objArr122);
                                                            String str62 = (String) objArr122[0];
                                                            file2 = new File(str61);
                                                            if (file2.exists()) {
                                                                int i613 = silver;
                                                                int i614 = ((i613 | 33) << 1) - (i613 ^ 33);
                                                                teal = i614 % 128;
                                                                if (i614 % 2 == 0) {
                                                                    int i615 = 35 / 0;
                                                                }
                                                                try {
                                                                    Scanner scanner4 = new Scanner(new FileInputStream(file2));
                                                                    char normalizeMetaState5 = (char) KeyEvent.normalizeMetaState(0);
                                                                    int i616 = -KeyEvent.keyCodeFromString("");
                                                                    int i617 = ((i616 | 229) << 1) - (i616 ^ 229);
                                                                    int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                    int i618 = (windowTouchSlop2 ^ 2) + ((windowTouchSlop2 & 2) << 1);
                                                                    Object[] objArr123 = new Object[1];
                                                                    delta(normalizeMetaState5, i617, i618, objArr123);
                                                                    Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr123[0]);
                                                                    if (useDelimiter4.hasNext()) {
                                                                        W0.alpha();
                                                                        W0.alpha();
                                                                        str4 = useDelimiter4.next();
                                                                    }
                                                                    useDelimiter4.close();
                                                                } catch (IOException unused5) {
                                                                }
                                                                if (str4.contains(str62)) {
                                                                    int i619 = ~(i25 & 150);
                                                                    int i620 = i25 | 150;
                                                                    i77 = i619 & i620;
                                                                    int i621 = ((~i597) & i25) | (i597 & i122);
                                                                    int i622 = (i621 | (-i621)) >> 31;
                                                                    int i623 = i77 & (~i622);
                                                                    int i624 = i597 & i622;
                                                                    int i625 = (i624 & i623) | (i623 ^ i624);
                                                                    int i626 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                                    Object[] objArr124 = new Object[1];
                                                                    delta((char) ((i626 ^ 3635) + ((i626 & 3635) << 1)), 2109 - (ViewConfiguration.getWindowTouchSlop() >> 8), 45 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr124);
                                                                    Object[] objArr125 = {(String) objArr124[0]};
                                                                    D88718 = uH18377.D8871(1979478258);
                                                                    if (D88718 == null) {
                                                                        int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 52;
                                                                        int blue2 = Color.blue(0) + 2951;
                                                                        char myTid2 = (char) (Process.myTid() >> 22);
                                                                        byte b53 = (byte) (i63 & 6);
                                                                        byte b54 = (byte) (b53 - 2);
                                                                        Object[] objArr126 = new Object[1];
                                                                        foxtrot(b53, b54, b54, objArr126);
                                                                        D88718 = uH18377.setPivotYN16904(scrollDefaultDelay4, blue2, myTid2, -1438133721, false, (String) objArr126[0], new Class[]{cls});
                                                                    }
                                                                    long longValue17 = ((Long) ((Method) D88718).invoke(null, objArr125)).longValue();
                                                                    long j107 = -989515092;
                                                                    long j108 = 521;
                                                                    long j109 = j107 ^ j31;
                                                                    long j110 = ((((j109 | longValue17) | j6) ^ j31) * j108) + (522 * longValue17) + ((-520) * j107);
                                                                    long j111 = ((longValue17 ^ j31) | j107) ^ j31;
                                                                    long j112 = (j108 * (((longValue17 | (j109 | j39)) ^ j31) | j111)) + ((-1042) * j111) + j110 + 1764336398;
                                                                    int i627 = ((int) (j112 >> 32)) & ((((~(Process.myTid() | (-1413631638))) | 4195328) * 658) + (((38868266 | r3) * (-658)) - 1517784162));
                                                                    int i628 = ((int) j112) & ((((~(554779704 | i122)) | 16794648) * 420) + ((~(554779704 | i25)) * 420) + 1178198137);
                                                                    int i629 = ((i627 & i628) | (i627 ^ i628)) * 263;
                                                                    int i630 = (i629 | i25) & (~(i25 & i629));
                                                                    int i631 = ((~i625) & i25) | (i625 & i122);
                                                                    int i632 = -i631;
                                                                    int i633 = ((i631 & i632) | (i631 ^ i632)) >> 31;
                                                                    i370 = (i625 & i633) | (i630 & (~i633));
                                                                    strArr2 = strArr3;
                                                                }
                                                            }
                                                            i77 = i25;
                                                            int i6212 = ((~i597) & i25) | (i597 & i122);
                                                            int i6222 = (i6212 | (-i6212)) >> 31;
                                                            int i6232 = i77 & (~i6222);
                                                            int i6242 = i597 & i6222;
                                                            int i6252 = (i6242 & i6232) | (i6232 ^ i6242);
                                                            int i6262 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                            Object[] objArr1242 = new Object[1];
                                                            delta((char) ((i6262 ^ 3635) + ((i6262 & 3635) << 1)), 2109 - (ViewConfiguration.getWindowTouchSlop() >> 8), 45 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr1242);
                                                            Object[] objArr1252 = {(String) objArr1242[0]};
                                                            D88718 = uH18377.D8871(1979478258);
                                                            if (D88718 == null) {
                                                            }
                                                            long longValue172 = ((Long) ((Method) D88718).invoke(null, objArr1252)).longValue();
                                                            long j1072 = -989515092;
                                                            long j1082 = 521;
                                                            long j1092 = j1072 ^ j31;
                                                            long j1102 = ((((j1092 | longValue172) | j6) ^ j31) * j1082) + (522 * longValue172) + ((-520) * j1072);
                                                            long j1112 = ((longValue172 ^ j31) | j1072) ^ j31;
                                                            long j1122 = (j1082 * (((longValue172 | (j1092 | j39)) ^ j31) | j1112)) + ((-1042) * j1112) + j1102 + 1764336398;
                                                            int i6272 = ((int) (j1122 >> 32)) & ((((~(Process.myTid() | (-1413631638))) | 4195328) * 658) + (((38868266 | r3) * (-658)) - 1517784162));
                                                            int i6282 = ((int) j1122) & ((((~(554779704 | i122)) | 16794648) * 420) + ((~(554779704 | i25)) * 420) + 1178198137);
                                                            int i6292 = ((i6272 & i6282) | (i6272 ^ i6282)) * 263;
                                                            int i6302 = (i6292 | i25) & (~(i25 & i6292));
                                                            int i6312 = ((~i6252) & i25) | (i6252 & i122);
                                                            int i6322 = -i6312;
                                                            int i6332 = ((i6312 & i6322) | (i6312 ^ i6322)) >> 31;
                                                            i370 = (i6252 & i6332) | (i6302 & (~i6332));
                                                            strArr2 = strArr3;
                                                        }
                                                    }
                                                    int i634 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    Object[] objArr127 = new Object[1];
                                                    delta((char) ((i634 ^ 28264) + ((i634 & 28264) << 1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 372, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, objArr127);
                                                    String str63 = (String) objArr127[0];
                                                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int indexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    int i635 = (indexOf13 ^ 811) + ((indexOf13 & 811) << 1);
                                                    int i636 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i637 = ((i636 | 10) << 1) - (i636 ^ 10);
                                                    Object[] objArr128 = new Object[1];
                                                    delta(minimumFlingVelocity2, i635, i637, objArr128);
                                                    String str64 = (String) objArr128[0];
                                                    int i638 = -Process.getGidForName("");
                                                    Object[] objArr129 = new Object[1];
                                                    delta((char) ((i638 & 14853) + (i638 | 14853)), 819 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))), 7 - TextUtils.indexOf("", "", 0, 0), objArr129);
                                                    String str65 = (String) objArr129[0];
                                                    int i639 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i640 = 825 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                                                    int i641 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    int i642 = (i641 ^ 8) + ((i641 & 8) << 1);
                                                    Object[] objArr130 = new Object[1];
                                                    delta((char) ((i639 ^ 29297) + ((i639 & 29297) << 1)), i640, i642, objArr130);
                                                    String[] strArr23 = {str63, str64, str65, (String) objArr130[0]};
                                                    char c31 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                    int i643 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    Object[] objArr131 = new Object[1];
                                                    delta(c31, (i643 ^ 836) + ((i643 & 836) << 1), TextUtils.getTrimmedLength("") + 17, objArr131);
                                                    String str66 = (String) objArr131[0];
                                                    int i644 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)));
                                                    int i645 = -(-MotionEvent.axisFromString(""));
                                                    Object[] objArr132 = new Object[1];
                                                    delta((char) (((i644 | 2140) << 1) - (i644 ^ 2140)), ((i645 | 853) << 1) - (i645 ^ 853), 5 - (~(-TextUtils.lastIndexOf("", '0', 0, 0))), objArr132);
                                                    String str67 = (String) objArr132[0];
                                                    char fadingEdgeLength3 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37524);
                                                    int i646 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                                    int i647 = i646 * (-495);
                                                    int i648 = ((-424710) ^ i647) + ((i647 & (-424710)) << 1);
                                                    int i649 = ~i646;
                                                    int i650 = ~(i649 | (-859));
                                                    int i651 = ~((~i646) | i25);
                                                    int i652 = ((i650 & i651) | (i650 ^ i651)) * 992;
                                                    int i653 = (i648 ^ i652) + ((i648 & i652) << 1);
                                                    int i654 = ~((i649 ^ (-859)) | (i649 & (-859)));
                                                    int i655 = ~((i649 & i25) | (i649 ^ i25));
                                                    int i656 = (i655 & i654) | (i654 ^ i655);
                                                    int i657 = ~(i646 | i122 | 858);
                                                    int i658 = (((i657 & i656) | (i656 ^ i657)) * (-496)) + i653;
                                                    int i659 = -(-(((i25 ^ 858) | (i25 & 858)) * 496));
                                                    Object[] objArr133 = new Object[1];
                                                    delta(fadingEdgeLength3, (i658 & i659) + (i658 | i659), 6 - (~(-View.resolveSizeAndState(0, 0, 0))), objArr133);
                                                    String str68 = (String) objArr133[0];
                                                    char c32 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1));
                                                    int i660 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i661 = -(-Color.green(0));
                                                    int i662 = ((i661 | 11) << 1) - (i661 ^ 11);
                                                    Object[] objArr134 = new Object[1];
                                                    delta(c32, ((i660 | 866) << 1) - (i660 ^ 866), i662, objArr134);
                                                    String str69 = (String) objArr134[0];
                                                    Object[] objArr135 = new Object[1];
                                                    delta((char) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.normalizeMetaState(0) + 877, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, objArr135);
                                                    String[] strArr24 = {str66, str67, str68, str69, (String) objArr135[0]};
                                                    char c33 = (char) (42949 - (~(-TextUtils.getCapsMode("", 0, 0))));
                                                    int i663 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int i664 = ((i663 | 890) << 1) - (i663 ^ 890);
                                                    int i665 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i666 = (i665 ^ 17) + ((i665 & 17) << 1);
                                                    Object[] objArr136 = new Object[1];
                                                    delta(c33, i664, i666, objArr136);
                                                    String str70 = (String) objArr136[0];
                                                    int threadPriority3 = Process.getThreadPriority(0);
                                                    Object[] objArr137 = new Object[1];
                                                    delta((char) (((((threadPriority3 | 20) << 1) - (threadPriority3 ^ 20)) >> 6) + 48454), 906 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), 2 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr137);
                                                    String str71 = (String) objArr137[0];
                                                    char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                    int i667 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    int i668 = (i667 & 917) + (i667 | 917);
                                                    int i669 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i670 = ((i669 | 22) << 1) - (i669 ^ 22);
                                                    Object[] objArr138 = new Object[1];
                                                    delta(tapTimeout3, i668, i670, objArr138);
                                                    String str72 = (String) objArr138[0];
                                                    char resolveSizeAndState5 = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int i671 = -Color.green(0);
                                                    Object[] objArr139 = new Object[1];
                                                    delta(resolveSizeAndState5, (i671 & 940) + (i671 | 940), (ViewConfiguration.getScrollBarSize() >> 8) + 25, objArr139);
                                                    String str73 = (String) objArr139[0];
                                                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28374);
                                                    int i672 = -(-View.MeasureSpec.getMode(0));
                                                    int i673 = (i672 ^ 965) + ((i672 & 965) << 1);
                                                    int size = View.MeasureSpec.getSize(0);
                                                    int i674 = ((size | 28) << 1) - (size ^ 28);
                                                    Object[] objArr140 = new Object[1];
                                                    delta(maximumDrawingCacheSize2, i673, i674, objArr140);
                                                    String[] strArr25 = {str70, str71, str5, str72, str73, (String) objArr140[0]};
                                                    char axisFromString2 = (char) (61887 - MotionEvent.axisFromString(""));
                                                    int i675 = 992 - (~(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    int alpha11 = Color.alpha(0);
                                                    int i676 = (alpha11 & 11) + (alpha11 | 11);
                                                    Object[] objArr141 = new Object[1];
                                                    delta(axisFromString2, i675, i676, objArr141);
                                                    String str74 = (String) objArr141[0];
                                                    int i677 = -MotionEvent.axisFromString("");
                                                    int i678 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int i679 = (i678 ^ WebSocketProtocol.CLOSE_NO_STATUS_CODE) + ((i678 & WebSocketProtocol.CLOSE_NO_STATUS_CODE) << 1);
                                                    int i680 = -(Process.myPid() >> 22);
                                                    int i681 = ((i680 | 8) << 1) - (i680 ^ 8);
                                                    Object[] objArr142 = new Object[1];
                                                    delta((char) ((i677 & 10284) + (i677 | 10284)), i679, i681, objArr142);
                                                    String str75 = (String) objArr142[0];
                                                    char resolveSizeAndState6 = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int longPressTimeout3 = 1012 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int i682 = -Gravity.getAbsoluteGravity(0, 0);
                                                    int i683 = ((i682 | 6) << 1) - (i682 ^ 6);
                                                    Object[] objArr143 = new Object[1];
                                                    delta(resolveSizeAndState6, longPressTimeout3, i683, objArr143);
                                                    String str76 = (String) objArr143[0];
                                                    char scrollDefaultDelay5 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int i684 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i685 = ((i684 | 1019) << 1) - (i684 ^ 1019);
                                                    int i686 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    Object[] objArr144 = new Object[1];
                                                    delta(scrollDefaultDelay5, i685, (i686 ^ 6) + ((i686 & 6) << 1), objArr144);
                                                    String[] strArr26 = {str74, str75, str76, (String) objArr144[0]};
                                                    char c34 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)) + 48154);
                                                    int i687 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                    int i688 = -Drawable.resolveOpacity(0, 0);
                                                    int i689 = (i688 ^ 16) + ((i688 & 16) << 1);
                                                    Object[] objArr145 = new Object[1];
                                                    delta(c34, (i687 ^ 1025) + ((i687 & 1025) << 1), i689, objArr145);
                                                    String str77 = (String) objArr145[0];
                                                    int i690 = -(-TextUtils.getOffsetAfter("", 0));
                                                    int i691 = -View.combineMeasuredStates(0, 0);
                                                    int i692 = (i691 & 859) + (i691 | 859);
                                                    int i693 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i694 = (i693 & 7) + (i693 | 7);
                                                    Object[] objArr146 = new Object[1];
                                                    delta((char) ((37524 ^ i690) + ((i690 & 37524) << 1)), i692, i694, objArr146);
                                                    String str78 = (String) objArr146[0];
                                                    int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                    int i695 = -(-TextUtils.getOffsetBefore("", 0));
                                                    Object[] objArr147 = new Object[1];
                                                    delta((char) ((keyRepeatTimeout2 & 29296) + (keyRepeatTimeout2 | 29296)), (i695 ^ 827) + ((i695 & 827) << 1), 6 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr147);
                                                    String[] strArr27 = {str77, str78, (String) objArr147[0]};
                                                    int i696 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int alpha12 = W0.alpha();
                                                    int i697 = i696 * ModuleDescriptor.MODULE_VERSION;
                                                    int i698 = (i697 ^ 139) + ((i697 & 139) << 1);
                                                    int i699 = ~i696;
                                                    int i700 = ~((~i699) | i699);
                                                    int i701 = ~((i699 ^ alpha12) | (i699 & alpha12));
                                                    int i702 = -(-((i700 | i701) * (-280)));
                                                    int i703 = (i698 ^ i702) + ((i698 & i702) << 1);
                                                    int i704 = ~alpha12;
                                                    int i705 = (i703 - (~(((i704 & i701) | (i701 ^ i704)) * 140))) - 1;
                                                    int i706 = ~((i699 & alpha12) | (i699 ^ alpha12));
                                                    int i707 = ~alpha12;
                                                    int i708 = ~((i696 & i707) | (i707 ^ i696));
                                                    char c35 = (char) ((((i708 & i706) | (i706 ^ i708)) * 140) + i705);
                                                    int i709 = 1038 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                                                    int keyCodeFromString2 = KeyEvent.keyCodeFromString("");
                                                    int i710 = (keyCodeFromString2 ^ 14) + ((keyCodeFromString2 & 14) << 1);
                                                    Object[] objArr148 = new Object[1];
                                                    delta(c35, i709, i710, objArr148);
                                                    String str79 = (String) objArr148[0];
                                                    int i711 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                    int edgeSlop4 = 1054 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    int keyRepeatTimeout3 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                    int i712 = (keyRepeatTimeout3 ^ 1) + ((keyRepeatTimeout3 & 1) << 1);
                                                    Object[] objArr149 = new Object[1];
                                                    delta((char) ((i711 ^ 1) + ((i711 & 1) << 1)), edgeSlop4, i712, objArr149);
                                                    String[] strArr28 = {str79, (String) objArr149[0]};
                                                    int i713 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    Object[] objArr150 = new Object[1];
                                                    delta((char) ((i713 ^ (-1)) + (i713 << 1)), 1054 - TextUtils.lastIndexOf("", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, objArr150);
                                                    String str80 = (String) objArr150[0];
                                                    char keyRepeatTimeout4 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int i714 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int alpha13 = W0.alpha();
                                                    int i715 = i714 * 193;
                                                    int i716 = (i715 ^ 205352) + ((i715 & 205352) << 1);
                                                    int i717 = ~alpha13;
                                                    int i718 = ~i714;
                                                    int i719 = ~(i718 | 1064);
                                                    int i720 = -(-(((i717 ^ i719) | (i719 & i717)) * (-192)));
                                                    int i721 = (i716 & i720) + (i716 | i720);
                                                    int i722 = ~(i718 | (-1065));
                                                    int i723 = ~alpha13;
                                                    int i724 = ((i722 | (~((-1065) | i723))) * (-384)) + i721;
                                                    int i725 = (i718 & (-1065)) | (i718 ^ (-1065));
                                                    int i726 = ~((i725 & alpha13) | (i725 ^ alpha13));
                                                    int i727 = ((-1065) ^ i723) | ((-1065) & i723);
                                                    int i728 = ~((i727 ^ i714) | (i727 & i714));
                                                    int i729 = (i726 ^ i728) | (i726 & i728);
                                                    int i730 = ~(i714 | 1064 | alpha13);
                                                    int i731 = ((i729 & i730) | (i729 ^ i730)) * 192;
                                                    int i732 = (i724 ^ i731) + ((i731 & i724) << 1);
                                                    int tapTimeout4 = ViewConfiguration.getTapTimeout() >> 16;
                                                    int i733 = (tapTimeout4 ^ 1) + ((tapTimeout4 & 1) << 1);
                                                    Object[] objArr151 = new Object[1];
                                                    delta(keyRepeatTimeout4, i732, i733, objArr151);
                                                    String[] strArr29 = {str80, (String) objArr151[0]};
                                                    char c36 = (char) (47416 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)))));
                                                    int i734 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    Object[] objArr152 = new Object[1];
                                                    delta(c36, (i734 & 1065) + (i734 | 1065), 15 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr152);
                                                    String str81 = (String) objArr152[0];
                                                    int i735 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 907;
                                                    int i736 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i737 = ((i736 | 3) << 1) - (i736 ^ 3);
                                                    Object[] objArr153 = new Object[1];
                                                    delta((char) ((48454 ^ i735) + ((i735 & 48454) << 1)), minimumFlingVelocity3, i737, objArr153);
                                                    String str82 = (String) objArr153[0];
                                                    int i738 = -TextUtils.indexOf("", "", 0, 0);
                                                    int i739 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                    Object[] objArr154 = new Object[1];
                                                    delta((char) ((i738 ^ 2140) + ((i738 & 2140) << 1)), (i739 ^ 853) + ((i739 & 853) << 1), View.resolveSize(0, 0) + 7, objArr154);
                                                    String str83 = (String) objArr154[0];
                                                    Object[] objArr155 = new Object[1];
                                                    delta((char) KeyEvent.getDeadChar(0, 0), 1081 - (ViewConfiguration.getScrollBarSize() >> 8), 7 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr155);
                                                    String str84 = (String) objArr155[0];
                                                    char normalizeMetaState6 = (char) KeyEvent.normalizeMetaState(0);
                                                    int i740 = 865 - (~TextUtils.getTrimmedLength(""));
                                                    int i741 = -View.MeasureSpec.getMode(0);
                                                    int i742 = i741 * (-519);
                                                    int i743 = (i742 ^ 5731) + ((i742 & 5731) << 1);
                                                    int i744 = ~i741;
                                                    int i745 = ~((i744 ^ (-12)) | (i744 & (-12)) | i294);
                                                    int i746 = ~((i25 ^ 11) | (i25 & 11));
                                                    int i747 = ((i745 ^ i746) | (i746 & i745)) * 520;
                                                    int i748 = (i743 ^ i747) + ((i747 & i743) << 1);
                                                    int i749 = ~(((-12) ^ i122) | ((-12) & i122));
                                                    int i750 = (i741 ^ i25) | (i741 & i25);
                                                    int i751 = ~i750;
                                                    int i752 = (i748 - (~(-(-(((i749 ^ i751) | (i749 & i751)) * (-1040)))))) - 1;
                                                    int i753 = ~((i744 ^ i122) | (i744 & i122));
                                                    int i754 = ~(i741 | (-12));
                                                    int i755 = (i753 & i754) | (i753 ^ i754);
                                                    int i756 = ~i750;
                                                    int i757 = -(-(((i755 & i756) | (i755 ^ i756)) * 520));
                                                    int i758 = ((i752 | i757) << 1) - (i757 ^ i752);
                                                    Object[] objArr156 = new Object[1];
                                                    delta(normalizeMetaState6, i740, i758, objArr156);
                                                    String str85 = (String) objArr156[0];
                                                    Object[] objArr157 = new Object[1];
                                                    delta((char) Color.red(0), 877 - TextUtils.getOffsetBefore("", 0), 13 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr157);
                                                    String[] strArr30 = {str81, str82, str83, str84, str85, (String) objArr157[0]};
                                                    int i759 = -(Process.myTid() >> 22);
                                                    int i760 = -Color.green(0);
                                                    int i761 = (i760 & 1089) + (i760 | 1089);
                                                    int keyRepeatTimeout5 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                    int i762 = (keyRepeatTimeout5 ^ 20) + ((keyRepeatTimeout5 & 20) << 1);
                                                    Object[] objArr158 = new Object[1];
                                                    delta((char) ((33317 & i759) + (i759 | 33317)), i761, i762, objArr158);
                                                    String str86 = (String) objArr158[0];
                                                    char argb3 = (char) Color.argb(0, 0, 0, 0);
                                                    int argb4 = Color.argb(0, 0, 0, 0);
                                                    Object[] objArr159 = new Object[1];
                                                    delta(argb3, (argb4 & 1109) + (argb4 | 1109), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr159);
                                                    String str87 = (String) objArr159[0];
                                                    char c37 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1));
                                                    int trimmedLength4 = TextUtils.getTrimmedLength("");
                                                    int i763 = (trimmedLength4 ^ 1128) + ((trimmedLength4 & 1128) << 1);
                                                    int i764 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i765 = (i764 & 31) + (i764 | 31);
                                                    Object[] objArr160 = new Object[1];
                                                    delta(c37, i763, i765, objArr160);
                                                    String str88 = (String) objArr160[0];
                                                    char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i766 = 1158 - (~(-(-TextUtils.getTrimmedLength(""))));
                                                    int i767 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    int i768 = ((i767 | 26) << 1) - (i767 ^ 26);
                                                    Object[] objArr161 = new Object[1];
                                                    delta(keyRepeatDelay3, i766, i768, objArr161);
                                                    String str89 = (String) objArr161[0];
                                                    char resolveSizeAndState7 = (char) View.resolveSizeAndState(0, 0, 0);
                                                    int i769 = -Color.alpha(0);
                                                    Object[] objArr162 = new Object[1];
                                                    delta(resolveSizeAndState7, (i769 ^ 1185) + ((i769 & 1185) << 1), 22 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))), objArr162);
                                                    String str90 = (String) objArr162[0];
                                                    int i770 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                    Object[] objArr163 = new Object[1];
                                                    delta((char) ((62292 & i770) + (i770 | 62292)), 1208 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 33, objArr163);
                                                    String[] strArr31 = {str86, str87, str88, str89, str90, (String) objArr163[0], str5};
                                                    char c38 = (char) (34502 - (~Drawable.resolveOpacity(0, 0)));
                                                    int i771 = -ExpandableListView.getPackedPositionGroup(0L);
                                                    Object[] objArr164 = new Object[1];
                                                    delta(c38, (i771 & 1241) + (i771 | 1241), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, objArr164);
                                                    String str91 = (String) objArr164[0];
                                                    char mirror2 = (char) (AndroidCharacter.getMirror('0') + 14806);
                                                    int i772 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i773 = (i772 ^ 820) + ((i772 & 820) << 1);
                                                    int i774 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    Object[] objArr165 = new Object[1];
                                                    delta(mirror2, i773, (i774 & 7) + (i774 | 7), objArr165);
                                                    String[] strArr32 = {str91, (String) objArr165[0]};
                                                    char mirror3 = AndroidCharacter.getMirror('0');
                                                    int i775 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    Object[] objArr166 = new Object[1];
                                                    delta((char) ((mirror3 ^ 65488) + ((mirror3 & 65488) << 1)), (i775 & 1254) + (i775 | 1254), KeyEvent.getDeadChar(0, 0) + 30, objArr166);
                                                    String str92 = (String) objArr166[0];
                                                    char c39 = (char) (31977 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))));
                                                    int keyRepeatTimeout6 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                    int i776 = (keyRepeatTimeout6 ^ 1284) + ((keyRepeatTimeout6 & 1284) << 1);
                                                    int i777 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                    Object[] objArr167 = new Object[1];
                                                    delta(c39, i776, (i777 ^ 11) + ((i777 & 11) << 1), objArr167);
                                                    String[] strArr33 = {str92, (String) objArr167[0]};
                                                    char maxKeyCode5 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                    int scrollDefaultDelay6 = 1295 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                                                    int i778 = (touchSlop3 ^ 19) + ((touchSlop3 & 19) << 1);
                                                    Object[] objArr168 = new Object[1];
                                                    delta(maxKeyCode5, scrollDefaultDelay6, i778, objArr168);
                                                    String str93 = (String) objArr168[0];
                                                    char c40 = (char) (3133 - (~Color.red(0)));
                                                    int i779 = -TextUtils.indexOf("", "", 0);
                                                    int i780 = (i779 ^ 1314) + ((i779 & 1314) << 1);
                                                    int trimmedLength5 = TextUtils.getTrimmedLength("");
                                                    Object[] objArr169 = new Object[1];
                                                    delta(c40, i780, (trimmedLength5 ^ 5) + ((trimmedLength5 & 5) << 1), objArr169);
                                                    String[] strArr34 = {str93, (String) objArr169[0]};
                                                    int i781 = -TextUtils.indexOf((CharSequence) "", '0');
                                                    int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                    int i782 = (doubleTapTimeout & 1319) + (doubleTapTimeout | 1319);
                                                    int i783 = -AndroidCharacter.getMirror('0');
                                                    int i784 = (i783 & 67) + (i783 | 67);
                                                    Object[] objArr170 = new Object[1];
                                                    delta((char) ((i781 ^ (-1)) + (i781 << 1)), i782, i784, objArr170);
                                                    String[] strArr35 = {(String) objArr170[0]};
                                                    int i785 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    char mirror4 = AndroidCharacter.getMirror('0');
                                                    int i786 = ((mirror4 | 1290) << 1) - (mirror4 ^ 1290);
                                                    int capsMode6 = TextUtils.getCapsMode("", 0, 0);
                                                    int i787 = (capsMode6 * (-813)) + 6528;
                                                    int i788 = ~((-17) | capsMode6);
                                                    int i789 = ~((capsMode6 ^ i25) | (capsMode6 & i25));
                                                    int i790 = ((i788 ^ i789) | (i788 & i789)) * (-814);
                                                    int i791 = (i787 ^ i790) + ((i790 & i787) << 1);
                                                    int i792 = ~(((-17) ^ i294) | ((-17) & i294));
                                                    int i793 = ~capsMode6;
                                                    int i794 = ~((i793 ^ 16) | (i793 & 16));
                                                    int i795 = (i792 ^ i794) | (i792 & i794);
                                                    int i796 = (((i795 & i789) | (i795 ^ i789)) * HttpConstants.HTTP_PROXY_AUTH) + i791;
                                                    int i797 = ~capsMode6;
                                                    int i798 = ~((i797 ^ 16) | (i797 & 16));
                                                    int i799 = ~(i797 | i25);
                                                    int i800 = (i798 ^ i799) | (i799 & i798);
                                                    int i801 = ~((i25 ^ 16) | (i25 & 16));
                                                    int i802 = (i796 - (~(((i800 ^ i801) | (i800 & i801)) * HttpConstants.HTTP_PROXY_AUTH))) - 1;
                                                    Object[] objArr171 = new Object[1];
                                                    delta((char) ((i785 ^ 3280) + ((i785 & 3280) << 1)), i786, i802, objArr171);
                                                    String[] strArr36 = {(String) objArr171[0]};
                                                    Object[] objArr172 = new Object[1];
                                                    delta((char) Color.alpha(0), 1353 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16))), 18 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr172);
                                                    String[] strArr37 = {(String) objArr172[0]};
                                                    int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    int i803 = 1373 - (~(-(-ExpandableListView.getPackedPositionChild(0L))));
                                                    int i804 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    Object[] objArr173 = new Object[1];
                                                    delta((char) ((scrollBarFadeDuration2 ^ 29491) + ((scrollBarFadeDuration2 & 29491) << 1)), i803, (i804 & 19) + (i804 | 19), objArr173);
                                                    String[] strArr38 = {(String) objArr173[0]};
                                                    int i805 = -(-TextUtils.getOffsetAfter("", 0));
                                                    int indexOf14 = TextUtils.indexOf((CharSequence) "", '0');
                                                    int i806 = (indexOf14 ^ 1393) + ((indexOf14 & 1393) << 1);
                                                    int i807 = -(-ImageFormat.getBitsPerPixel(0));
                                                    Object[] objArr174 = new Object[1];
                                                    delta((char) ((i805 ^ 8526) + ((i805 & 8526) << 1)), i806, (i807 & 24) + (i807 | 24), objArr174);
                                                    String[] strArr39 = {(String) objArr174[0]};
                                                    int i808 = -Color.rgb(0, 0, 0);
                                                    int i809 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    Object[] objArr175 = new Object[1];
                                                    delta((char) (((-16723645) ^ i808) + ((i808 & (-16723645)) << 1)), (i809 & 1415) + (i809 | 1415), TextUtils.indexOf((CharSequence) "", '0') + 22, objArr175);
                                                    String[] strArr40 = {(String) objArr175[0]};
                                                    int i810 = -ExpandableListView.getPackedPositionChild(0L);
                                                    int i811 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int i812 = (i811 & 1436) + (i811 | 1436);
                                                    int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0);
                                                    Object[] objArr176 = new Object[1];
                                                    delta((char) ((63378 ^ i810) + ((i810 & 63378) << 1)), i812, (absoluteGravity4 & 24) + (absoluteGravity4 | 24), objArr176);
                                                    String[] strArr41 = {(String) objArr176[0], str5};
                                                    Object[] objArr177 = new Object[1];
                                                    delta((char) KeyEvent.keyCodeFromString(""), 1459 - (~(-View.combineMeasuredStates(0, 0))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr177);
                                                    String[] strArr42 = {(String) objArr177[0], str5};
                                                    int i813 = -(-ImageFormat.getBitsPerPixel(0));
                                                    int i814 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)));
                                                    int i815 = -(-TextUtils.getCapsMode("", 0, 0));
                                                    Object[] objArr178 = new Object[1];
                                                    delta((char) ((i813 ^ 1) + ((i813 & 1) << 1)), (i814 ^ 1488) + ((i814 & 1488) << 1), (i815 ^ 27) + ((i815 & 27) << 1), objArr178);
                                                    String[] strArr43 = {(String) objArr178[0], str5};
                                                    int keyRepeatDelay4 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                    Object[] objArr179 = new Object[1];
                                                    delta((char) ((46820 & keyRepeatDelay4) + (keyRepeatDelay4 | 46820)), 1514 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), 31 - TextUtils.getCapsMode("", 0, 0), objArr179);
                                                    String[] strArr44 = {(String) objArr179[0], str5};
                                                    Object[] objArr180 = new Object[1];
                                                    delta((char) (ViewConfiguration.getTouchSlop() >> 8), 16778761 - (~Color.rgb(0, 0, 0)), 26 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr180);
                                                    String[] strArr45 = {(String) objArr180[0], str5};
                                                    char indexOf15 = (char) (40173 - TextUtils.indexOf("", "", 0, 0));
                                                    int lastIndexOf7 = 1572 - TextUtils.lastIndexOf("", '0', 0);
                                                    int i816 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int i817 = ((i816 | 33) << 1) - (i816 ^ 33);
                                                    Object[] objArr181 = new Object[1];
                                                    delta(indexOf15, lastIndexOf7, i817, objArr181);
                                                    String[][] strArr46 = {strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, new String[]{(String) objArr181[0], str5}};
                                                    char c41 = (char) (143 - (~(-(-TextUtils.indexOf("", "", 0, 0)))));
                                                    int i818 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d9 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d9 ? 0 : -1)));
                                                    int i819 = 1;
                                                    Object[] objArr182 = new Object[1];
                                                    delta(c41, (i818 ^ 1605) + ((i818 & 1605) << 1), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr182);
                                                    int i820 = 0;
                                                    StringBuilder sb2 = new StringBuilder((String) objArr182[0]);
                                                    int i821 = i25;
                                                    int i822 = 0;
                                                    int i823 = 0;
                                                    while (i822 < 24) {
                                                        String[] strArr47 = strArr46[i822];
                                                        Object[] objArr183 = new Object[i819];
                                                        objArr183[i820] = strArr47[i820];
                                                        Object D887125 = uH18377.D8871(-957097391);
                                                        if (D887125 == null) {
                                                            int lastIndexOf8 = TextUtils.lastIndexOf("", '0') + 53;
                                                            int rgb = Color.rgb(i820, i820, i820) + 16780374;
                                                            char c42 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 58074);
                                                            byte b55 = (byte) i820;
                                                            int i824 = i820;
                                                            byte b56 = b55;
                                                            i66 = i822;
                                                            i67 = i84;
                                                            i68 = i294;
                                                            Object[] objArr184 = new Object[1];
                                                            foxtrot(b55, b56, b56, objArr184);
                                                            String str94 = (String) objArr184[i824];
                                                            Class[] clsArr3 = new Class[1];
                                                            clsArr3[i824] = cls;
                                                            D887125 = uH18377.setPivotYN16904(lastIndexOf8, rgb, c42, 424179844, false, str94, clsArr3);
                                                        } else {
                                                            i66 = i822;
                                                            i67 = i84;
                                                            i68 = i294;
                                                        }
                                                        String str95 = (String) ((Method) D887125).invoke(null, objArr183);
                                                        String[] strArr48 = (String[]) Arrays.copyOfRange(strArr47, 1, strArr47.length);
                                                        if (str95 == null || str95.isEmpty()) {
                                                            i69 = i821;
                                                        } else {
                                                            silver = (teal + 61) % 128;
                                                            if (strArr47.length != 1) {
                                                                Object[] objArr185 = {str95, strArr48};
                                                                Object D887126 = uH18377.D8871(-1363379003);
                                                                if (D887126 == null) {
                                                                    int keyRepeatDelay5 = 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    int absoluteGravity5 = Gravity.getAbsoluteGravity(0, 0) + 1415;
                                                                    char resolveSizeAndState8 = (char) (3047 - View.resolveSizeAndState(0, 0, 0));
                                                                    byte b57 = (byte) 0;
                                                                    byte b58 = (byte) (b57 + 1);
                                                                    Object[] objArr186 = new Object[1];
                                                                    foxtrot(b57, b58, (byte) (b58 - 1), objArr186);
                                                                    D887126 = uH18377.setPivotYN16904(keyRepeatDelay5, absoluteGravity5, resolveSizeAndState8, 1896341008, false, (String) objArr186[0], new Class[]{cls, String[].class});
                                                                }
                                                                long longValue18 = ((Long) ((Method) D887126).invoke(null, objArr185)).longValue();
                                                                i69 = i821;
                                                                long j113 = 356205881;
                                                                long j114 = -500;
                                                                long j115 = (j114 * longValue18) + (j114 * j113);
                                                                long j116 = HttpConstants.HTTP_NOT_IMPLEMENTED;
                                                                long j117 = longValue18 ^ j31;
                                                                long j118 = j113 ^ j31;
                                                                long j119 = ((((j118 | j39) | longValue18) ^ j31) * j116) + (1002 * ((j118 | j117) ^ j31)) + ((((j117 | j113) ^ j31) | (((j118 | longValue18) | j6) ^ j31)) * j116) + j115 + 433921742;
                                                                int foxtrot9 = ((int) (j119 >> 32)) & A0.z.foxtrot((~((~((int) SystemClock.elapsedRealtime())) | (-33622019))) | 673710376, 576, (((~(1748914621 | r7)) | (-1782536640)) * 576) - 1771464918, -243920896);
                                                                int i825 = (int) j119;
                                                                int tango6 = ao.ad.tango(605380344);
                                                                int i826 = ~tango6;
                                                                int i827 = (((~((-743984135) | i826)) | (~(2111659015 | tango6))) * 520) - 6714851;
                                                                int i828 = ~((-2111659016) | i826);
                                                                int i829 = ~(tango6 | 746081870);
                                                            }
                                                            int i830 = i66 + 10;
                                                            i821 = ((~i830) & i25) | (i830 & i122);
                                                            int i831 = ((i823 & 53) + (i823 | 53)) - 52;
                                                            if (i831 > 1) {
                                                                int i832 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                                                i70 = 0;
                                                                Object[] objArr187 = new Object[1];
                                                                delta((char) (((i832 | 11726) << 1) - (i832 ^ 11726)), ((packedPositionGroup3 | 1606) << 1) - (packedPositionGroup3 ^ 1606), 16777217 - (~(-(-Color.rgb(0, 0, 0)))), objArr187);
                                                                sb2.append((String) objArr187[0]);
                                                            } else {
                                                                i70 = 0;
                                                            }
                                                            sb2.append(strArr47[i70]);
                                                            int i833 = -(-TextUtils.indexOf("", "", i70));
                                                            Object[] objArr188 = new Object[1];
                                                            delta((char) ((i833 ^ 54220) + ((i833 & 54220) << 1)), 1607 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), 0 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), objArr188);
                                                            sb2.append((String) objArr188[0]);
                                                            sb2.append(str95);
                                                            i823 = i831;
                                                            int i834 = (i66 & (-36)) + (i66 | (-36));
                                                            i822 = ((i834 | 37) << 1) - (i834 ^ 37);
                                                            i84 = i67;
                                                            i294 = i68;
                                                            i820 = 0;
                                                            i819 = 1;
                                                        }
                                                        i821 = i69;
                                                        int i8342 = (i66 & (-36)) + (i66 | (-36));
                                                        i822 = ((i8342 | 37) << 1) - (i8342 ^ 37);
                                                        i84 = i67;
                                                        i294 = i68;
                                                        i820 = 0;
                                                        i819 = 1;
                                                    }
                                                    i63 = i84;
                                                    i64 = i294;
                                                    int i835 = i821;
                                                    int i836 = i820;
                                                    char absoluteGravity6 = (char) Gravity.getAbsoluteGravity(i836, i836);
                                                    int i837 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    Object[] objArr189 = new Object[1];
                                                    delta(absoluteGravity6, (i837 & 1609) + (i837 | 1609), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr189);
                                                    sb2.append((String) objArr189[0]);
                                                    Object[] objArr190 = new Object[2];
                                                    if (i823 > 2) {
                                                        objArr190[1] = new int[1];
                                                        String[] strArr49 = {sb2.toString()};
                                                        ((int[]) objArr190[1])[0] = i835;
                                                        objArr190[0] = strArr49;
                                                    } else {
                                                        int[] iArr = new int[1];
                                                        objArr190[1] = iArr;
                                                        iArr[0] = i25;
                                                        objArr190[0] = new String[0];
                                                    }
                                                    int i838 = ((int[]) objArr190[1])[0];
                                                    int i839 = ((~i381) & i25) | (i381 & i122);
                                                    int i840 = -i839;
                                                    int i841 = ((i839 & i840) | (i839 ^ i840)) >> 31;
                                                    i381 = (i381 & i841) | (i838 & (~i841));
                                                    i65 = 0;
                                                    strArr3 = (String[]) objArr190[0];
                                                    char blue3 = (char) (Color.blue(i65) + 42950);
                                                    int i3852 = -(-Color.blue(i65));
                                                    int i3862 = (i3852 ^ 891) + ((i3852 & 891) << 1);
                                                    int i3872 = -View.getDefaultSize(i65, i65);
                                                    int i3882 = (i3872 ^ 16) + ((i3872 & 16) << 1);
                                                    Object[] objArr802 = new Object[1];
                                                    delta(blue3, i3862, i3882, objArr802);
                                                    String str332 = (String) objArr802[i65];
                                                    Object[] objArr812 = new Object[1];
                                                    objArr812[i65] = str332;
                                                    D88717 = uH18377.D8871(-957097391);
                                                    if (D88717 == null) {
                                                    }
                                                    invoke = ((Method) D88717).invoke(null, objArr812);
                                                    if (invoke != null) {
                                                    }
                                                    if (i71 != 1986687685) {
                                                    }
                                                    i72 = -1;
                                                    char tapTimeout22 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                    int i5072 = 1903 - (~(-(-AndroidCharacter.getMirror('0'))));
                                                    int i5082 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int i5092 = (i5082 ^ 13) + ((i5082 & 13) << 1);
                                                    Object[] objArr1092 = new Object[1];
                                                    delta(tapTimeout22, i5072, i5092, objArr1092);
                                                    String str532 = (String) objArr1092[0];
                                                    int i5102 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i5112 = -View.resolveSize(0, 0);
                                                    int alpha72 = W0.alpha();
                                                    int i5122 = i5112 * 659;
                                                    int i5132 = ((i5122 | (-1291005)) << 1) - (i5122 ^ (-1291005));
                                                    int i5142 = ~i5112;
                                                    int i5152 = (~((i5142 & 1965) | (i5142 ^ 1965))) | (~(((-1966) & i5112) | ((-1966) ^ i5112)));
                                                    int i5162 = (alpha72 & i5112) | (i5112 ^ alpha72);
                                                    int i5172 = ~i5162;
                                                    int i5182 = (((i5152 & i5172) | (i5152 ^ i5172)) * (-658)) + i5132;
                                                    int i5192 = (~((-1966) | i5112)) * 658;
                                                    int i5202 = ((i5182 | i5192) << 1) - (i5182 ^ i5192);
                                                    int i5212 = ~((i5112 & (-1966)) | ((-1966) ^ i5112));
                                                    int i5222 = ~i5162;
                                                    Object[] objArr1102 = new Object[1];
                                                    delta((char) (((i5102 | 65244) << 1) - (i5102 ^ 65244)), (((i5212 & i5222) | (i5212 ^ i5222)) * 658) + i5202, 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1102);
                                                    String[] strArr162 = {str532, (String) objArr1102[0]};
                                                    char indexOf102 = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int minimumFlingVelocity4 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                    int i5232 = (minimumFlingVelocity4 & 1970) + (minimumFlingVelocity4 | 1970);
                                                    int i5242 = -Color.rgb(0, 0, 0);
                                                    int i5252 = (i5242 & (-16777201)) + (i5242 | (-16777201));
                                                    Object[] objArr1112 = new Object[1];
                                                    delta(indexOf102, i5232, i5252, objArr1112);
                                                    String str542 = (String) objArr1112[0];
                                                    char combineMeasuredStates32 = (char) View.combineMeasuredStates(0, 0);
                                                    int i5262 = -TextUtils.getTrimmedLength("");
                                                    int alpha82 = W0.alpha();
                                                    int i5272 = i5262 * 306;
                                                    int i5282 = (i5272 & 610) + (i5272 | 610);
                                                    int i5292 = (i5282 & 607410) + (607410 | i5282);
                                                    int i5302 = ~((i5262 ^ 1985) | (i5262 & 1985));
                                                    int i5312 = ~((i5262 ^ alpha82) | (i5262 & alpha82));
                                                    int i5322 = (i5292 - (~(-(-(((i5302 & i5312) | (i5302 ^ i5312)) * HttpConstants.HTTP_USE_PROXY))))) - 1;
                                                    int i5332 = ~alpha82;
                                                    int i5342 = ~((i5262 & i5332) | (i5332 ^ i5262));
                                                    int i5352 = -(-(((i5342 & (-1986)) | ((-1986) ^ i5342)) * HttpConstants.HTTP_USE_PROXY));
                                                    int i5362 = ((i5322 | i5352) << 1) - (i5352 ^ i5322);
                                                    int i5372 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    int i5382 = ((i5372 | 19) << 1) - (i5372 ^ 19);
                                                    Object[] objArr1122 = new Object[1];
                                                    delta(combineMeasuredStates32, i5362, i5382, objArr1122);
                                                    String str552 = (String) objArr1122[0];
                                                    int i5392 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                    int lastIndexOf62 = 2003 - TextUtils.lastIndexOf("", '0');
                                                    int i5402 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i5412 = (i5402 & 13) + (i5402 | 13);
                                                    Object[] objArr1132 = new Object[1];
                                                    delta((char) (((i5392 | 51490) << 1) - (i5392 ^ 51490)), lastIndexOf62, i5412, objArr1132);
                                                    String[] strArr172 = {str542, str552, (String) objArr1132[0]};
                                                    char scrollDefaultDelay32 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49721);
                                                    int i5422 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i5432 = (i5422 & 2018) + (i5422 | 2018);
                                                    int i5442 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                    int i5452 = ((i5442 | 22) << 1) - (i5442 ^ 22);
                                                    Object[] objArr1142 = new Object[1];
                                                    delta(scrollDefaultDelay32, i5432, i5452, objArr1142);
                                                    String str562 = (String) objArr1142[0];
                                                    char indexOf112 = (char) TextUtils.indexOf("", "");
                                                    int scrollBarSize22 = ViewConfiguration.getScrollBarSize() >> 8;
                                                    int i5462 = (scrollBarSize22 & 2039) + (scrollBarSize22 | 2039);
                                                    int i5472 = -ExpandableListView.getPackedPositionChild(0L);
                                                    int i5482 = ((i5472 | 9) << 1) - (i5472 ^ 9);
                                                    Object[] objArr1152 = new Object[1];
                                                    delta(indexOf112, i5462, i5482, objArr1152);
                                                    String[] strArr182 = {str562, (String) objArr1152[0]};
                                                    int i5492 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                    int i5502 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                    Object[] objArr1162 = new Object[1];
                                                    delta((char) (((i5492 | 57275) << 1) - (i5492 ^ 57275)), (i5502 & 2048) + (i5502 | 2048), ExpandableListView.getPackedPositionGroup(0L) + 11, objArr1162);
                                                    String str572 = (String) objArr1162[0];
                                                    int i5512 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int absoluteGravity32 = Gravity.getAbsoluteGravity(0, 0) + 589;
                                                    int i5522 = -View.resolveSize(0, 0);
                                                    int i5532 = (i5522 ^ 6) + ((i5522 & 6) << 1);
                                                    Object[] objArr1172 = new Object[1];
                                                    delta((char) (((i5512 | 883) << 1) - (i5512 ^ 883)), absoluteGravity32, i5532, objArr1172);
                                                    String[] strArr192 = {str572, (String) objArr1172[0]};
                                                    char c282 = (char) (42615 - (~(ViewConfiguration.getTouchSlop() >> 8)));
                                                    int longPressTimeout22 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                    int alpha92 = W0.alpha();
                                                    int i5542 = (longPressTimeout22 * (-743)) - 1530580;
                                                    int i5552 = longPressTimeout22 | 2060;
                                                    int i5562 = ~i5552;
                                                    int i5572 = ~(longPressTimeout22 | alpha92);
                                                    int i5582 = (i5562 ^ i5572) | (i5562 & i5572);
                                                    int i5592 = i381;
                                                    int i5602 = ~((alpha92 & 2060) | (alpha92 ^ 2060));
                                                    int i5612 = ((i5602 & i5582) | (i5582 ^ i5602)) * (-744);
                                                    int i5622 = ((i5542 | i5612) << 1) - (i5612 ^ i5542);
                                                    int i5632 = ~alpha92;
                                                    int i5642 = ~longPressTimeout22;
                                                    int i5652 = (i5632 | (~((i5642 & (-2061)) | (i5642 ^ (-2061))))) * 744;
                                                    int i5662 = (i5622 & i5652) + (i5652 | i5622);
                                                    int i5672 = (i5552 | alpha92) * 744;
                                                    i73 = 1;
                                                    int i5682 = ((i5662 | i5672) << 1) - (i5672 ^ i5662);
                                                    int i5692 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                                    int i5702 = ((i5692 | 28) << 1) - (i5692 ^ 28);
                                                    Object[] objArr1182 = new Object[1];
                                                    delta(c282, i5682, i5702, objArr1182);
                                                    c4 = 0;
                                                    String str582 = (String) objArr1182[0];
                                                    char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                    int i5712 = -View.MeasureSpec.getSize(0);
                                                    Object[] objArr1192 = new Object[1];
                                                    delta(bitsPerPixel2, (i5712 ^ 2039) + ((i5712 & 2039) << 1), 10 - View.MeasureSpec.getSize(0), objArr1192);
                                                    String[][] strArr202 = {strArr162, strArr172, strArr182, strArr192, new String[]{str582, (String) objArr1192[0]}};
                                                    i74 = i34;
                                                    i75 = 0;
                                                    loop7: while (true) {
                                                        if (i75 < i74) {
                                                        }
                                                        int i5902 = i75 - 33;
                                                        i75 = (i5902 | 34) + (i5902 & 34);
                                                        int i5912 = silver;
                                                        teal = ((i5912 ^ 53) + ((i5912 & 53) << 1)) % 128;
                                                        i74 = 5;
                                                        i73 = 1;
                                                        c4 = 0;
                                                    }
                                                    int i5922 = i25 ^ i5592;
                                                    int i5932 = -i5922;
                                                    int i5942 = ((i5922 & i5932) | (i5922 ^ i5932)) >> 31;
                                                    int i5952 = i76 & (~i5942);
                                                    int i5962 = i5592 & i5942;
                                                    int i5972 = (i5952 & i5962) | (i5952 ^ i5962);
                                                    char pressedStateDuration42 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i5982 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i5992 = (i5982 * (-515)) - (-1079496);
                                                    int i6002 = ~((-2089) | i25);
                                                    int i6012 = ~((i122 ^ i5982) | (i122 & i5982));
                                                    int i6022 = (i6002 & i6012) | (i6002 ^ i6012);
                                                    int i6032 = ~((i122 ^ 2088) | (i122 & 2088));
                                                    int i6042 = ((i6022 & i6032) | (i6022 ^ i6032)) * (-516);
                                                    int i6052 = (i5992 ^ i6042) + ((i5992 & i6042) << 1);
                                                    int i6062 = ~i5982;
                                                    int i6072 = (i6062 ^ (-2089)) | (i6062 & (-2089));
                                                    int i6082 = i6062 | i122;
                                                    int i6092 = (((~((i6072 & i25) | (i6072 ^ i25))) | (~((i6082 & 2088) | (i6082 ^ 2088)))) * 516) + i6052;
                                                    int i6102 = ~((i6062 & 2088) | (i6062 ^ 2088));
                                                    int i6112 = ((i6102 & i6032) | (i6102 ^ i6032)) * 516;
                                                    Object[] objArr1212 = new Object[1];
                                                    delta(pressedStateDuration42, (i6092 ^ i6112) + ((i6112 & i6092) << 1), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr1212);
                                                    String str612 = (String) objArr1212[0];
                                                    char c302 = (char) (49931 - (~(-TextUtils.getOffsetBefore("", 0))));
                                                    int argb22 = Color.argb(0, 0, 0, 0) + 2101;
                                                    int indexOf122 = TextUtils.indexOf((CharSequence) "", '0');
                                                    int i6122 = (indexOf122 & 9) + (indexOf122 | 9);
                                                    Object[] objArr1222 = new Object[1];
                                                    delta(c302, argb22, i6122, objArr1222);
                                                    String str622 = (String) objArr1222[0];
                                                    file2 = new File(str612);
                                                    if (file2.exists()) {
                                                    }
                                                    i77 = i25;
                                                    int i62122 = ((~i5972) & i25) | (i5972 & i122);
                                                    int i62222 = (i62122 | (-i62122)) >> 31;
                                                    int i62322 = i77 & (~i62222);
                                                    int i62422 = i5972 & i62222;
                                                    int i62522 = (i62422 & i62322) | (i62322 ^ i62422);
                                                    int i62622 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                    Object[] objArr12422 = new Object[1];
                                                    delta((char) ((i62622 ^ 3635) + ((i62622 & 3635) << 1)), 2109 - (ViewConfiguration.getWindowTouchSlop() >> 8), 45 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr12422);
                                                    Object[] objArr12522 = {(String) objArr12422[0]};
                                                    D88718 = uH18377.D8871(1979478258);
                                                    if (D88718 == null) {
                                                    }
                                                    long longValue1722 = ((Long) ((Method) D88718).invoke(null, objArr12522)).longValue();
                                                    long j10722 = -989515092;
                                                    long j10822 = 521;
                                                    long j10922 = j10722 ^ j31;
                                                    long j11022 = ((((j10922 | longValue1722) | j6) ^ j31) * j10822) + (522 * longValue1722) + ((-520) * j10722);
                                                    long j11122 = ((longValue1722 ^ j31) | j10722) ^ j31;
                                                    long j11222 = (j10822 * (((longValue1722 | (j10922 | j39)) ^ j31) | j11122)) + ((-1042) * j11122) + j11022 + 1764336398;
                                                    int i62722 = ((int) (j11222 >> 32)) & ((((~(Process.myTid() | (-1413631638))) | 4195328) * 658) + (((38868266 | r3) * (-658)) - 1517784162));
                                                    int i62822 = ((int) j11222) & ((((~(554779704 | i122)) | 16794648) * 420) + ((~(554779704 | i25)) * 420) + 1178198137);
                                                    int i62922 = ((i62722 & i62822) | (i62722 ^ i62822)) * 263;
                                                    int i63022 = (i62922 | i25) & (~(i25 & i62922));
                                                    int i63122 = ((~i62522) & i25) | (i62522 & i122);
                                                    int i63222 = -i63122;
                                                    int i63322 = ((i63122 & i63222) | (i63122 ^ i63222)) >> 31;
                                                    i370 = (i62522 & i63322) | (i63022 & (~i63322));
                                                    strArr2 = strArr3;
                                                } else {
                                                    strArr2 = null;
                                                }
                                                int i842 = -((i122 & i370) | ((~i370) & i25));
                                                Object[] objArr191 = {new int[]{i370}, new int[]{i25}, new int[1], strArr2};
                                                int i843 = ~((int) Runtime.getRuntime().totalMemory());
                                                int i844 = -(-((((((~(r0 | 1047903798)) | (~(i843 | (-537920005)))) * 210) + ((((~(609327636 | i843)) | (~((-976496167) | r0))) * 210) - 1817097725)) - (~((((r4 & i842) | (r4 ^ i842)) >> 31) & 16))) - 1));
                                                int i845 = (i27 ^ i844) + ((i27 & i844) << 1);
                                                int i846 = (i845 << 13) ^ i845;
                                                int i847 = i846 ^ (i846 >>> 17);
                                                int i848 = i847 << 5;
                                                ((int[]) objArr191[2])[0] = ((~i847) & i848) | ((~i848) & i847);
                                                return objArr191;
                                            }
                                            i54 = i25 & (-261);
                                            i55 = i122 & 260;
                                            i53 = i54 | i55;
                                            int i3212 = i25 ^ i309;
                                            int i3222 = (i3212 | (-i3212)) >> 31;
                                            int i3232 = i53 & (~i3222);
                                            int i3242 = i3222 & i309;
                                            i56 = (i3232 & i3242) | (i3232 ^ i3242);
                                            if ((i26 & 8) == 0) {
                                            }
                                            int i3412 = -((byte) KeyEvent.getModifierMetaStateMask());
                                            int alpha52 = W0.alpha();
                                            int i3422 = (i3412 * 236) - (-1375791);
                                            int i3432 = ~i3412;
                                            int i3442 = ~alpha52;
                                            int i3452 = ~((i3432 & i3442) | (i3432 ^ i3442));
                                            int i3462 = -(-(((i3452 & 2921) | (i3452 ^ 2921)) * (-235)));
                                            int i3472 = (i3422 ^ i3462) + ((i3422 & i3462) << 1);
                                            int i3482 = ~i3412;
                                            int i3492 = ~((i3482 ^ alpha52) | (i3482 & alpha52));
                                            int i3502 = ((i3492 & 2921) | (i3492 ^ 2921)) * (-470);
                                            int i3512 = (i3472 & i3502) + (i3502 | i3472);
                                            int i3522 = (i3482 & 2921) | (i3482 ^ 2921);
                                            int i3532 = ((~((i3412 & (-2922)) | ((-2922) ^ i3412))) | (~((alpha52 & i3522) | (i3522 ^ alpha52)))) * 235;
                                            int i3542 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 738;
                                            int i3552 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                            int i3562 = ((i3552 | 41) << 1) - (i3552 ^ 41);
                                            Object[] objArr682 = new Object[1];
                                            delta((char) ((i3512 & i3532) + (i3532 | i3512)), i3542, i3562, objArr682);
                                            String str322 = (String) objArr682[0];
                                            char capsMode42 = (char) TextUtils.getCapsMode("", 0, 0);
                                            int i3572 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i3582 = (i3572 ^ 780) + ((i3572 & 780) << 1);
                                            int i3592 = -KeyEvent.keyCodeFromString("");
                                            int i3602 = (i3592 & 30) + (i3592 | 30);
                                            Object[] objArr692 = new Object[1];
                                            delta(capsMode42, i3582, i3602, objArr692);
                                            strArr = new String[]{str322, (String) objArr692[0]};
                                            i57 = 0;
                                            while (true) {
                                                if (i57 >= 2) {
                                                }
                                                i57++;
                                                i56 = i58;
                                                strArr = strArr5;
                                            }
                                            int i3652 = i25 ^ i58;
                                            int i3662 = -i3652;
                                            int i3672 = ((i3652 & i3662) | (i3652 ^ i3662)) >> 31;
                                            int i3682 = i59 & (~i3672);
                                            int i3692 = i58 & i3672;
                                            int i3702 = (i3682 & i3692) | (i3682 ^ i3692);
                                            D88716 = uH18377.D8871(-344556366);
                                            if (D88716 == null) {
                                            }
                                            long longValue112 = ((Long) ((Method) D88716).invoke(null, null)).longValue();
                                            long j732 = 1837943408;
                                            long j742 = -755;
                                            long j752 = ((j732 ^ j31) | (longValue112 ^ j31)) ^ j31;
                                            long j762 = (1512 * j752) + (j742 * longValue112) + (j742 * j732);
                                            long j772 = j732 | longValue112;
                                            long j782 = ((756 * (j772 | j39)) + (((-756) * (j752 | ((j772 | j6) ^ j31))) + j762)) - 1990196506;
                                            i60 = ((int) (j782 >> 32)) & (((~(i122 | (-1237973241))) * 886) + (((-1237973241) | (~((-1619767645) | i122))) * (-1772)) + (((((~(1619767644 | i25)) | (-1774975485)) | (~((-1082765401) | i122))) * 886) - 1222979076));
                                            i61 = ((int) j782) & ((((~(1295229528 | i25)) | 4460801 | (~((-141996882) | i25))) * HttpConstants.HTTP_PROXY_AUTH) + (((~((-1295229529) | i25)) | (~(141996881 | i122)) | 4460801) * HttpConstants.HTTP_PROXY_AUTH) + (((1157693448 | r3) * (-814)) - 1345533451));
                                            if (((i61 & i60) | (i60 ^ i61)) != 1) {
                                            }
                                            int i8422 = -((i122 & i3702) | ((~i3702) & i25));
                                            Object[] objArr1912 = {new int[]{i3702}, new int[]{i25}, new int[1], strArr2};
                                            int i8432 = ~((int) Runtime.getRuntime().totalMemory());
                                            int i8442 = -(-((((((~(r0 | 1047903798)) | (~(i8432 | (-537920005)))) * 210) + ((((~(609327636 | i8432)) | (~((-976496167) | r0))) * 210) - 1817097725)) - (~((((r4 & i8422) | (r4 ^ i8422)) >> 31) & 16))) - 1));
                                            int i8452 = (i27 ^ i8442) + ((i27 & i8442) << 1);
                                            int i8462 = (i8452 << 13) ^ i8452;
                                            int i8472 = i8462 ^ (i8462 >>> 17);
                                            int i8482 = i8472 << 5;
                                            ((int[]) objArr1912[2])[0] = ((~i8472) & i8482) | ((~i8482) & i8472);
                                            return objArr1912;
                                        }
                                    }
                                    i45 = i25;
                                    int i2162 = (~(i25 & i212)) & (i25 | i212);
                                    int i2172 = -i2162;
                                    int i2182 = ((i2162 & i2172) | (i2162 ^ i2172)) >> 31;
                                    int i2192 = (i212 & i2182) | (i45 & (~i2182));
                                    char c152 = (char) (15795 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                                    int i2202 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i2212 = (i2202 ^ 348) + ((i2202 & 348) << 1);
                                    d4 = 0.0d;
                                    int i2222 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    int i2232 = (i2222 & 17) + (i2222 | 17);
                                    Object[] objArr412 = new Object[1];
                                    delta(c152, i2212, i2232, objArr412);
                                    String str182 = (String) objArr412[0];
                                    int i2242 = -AndroidCharacter.getMirror('0');
                                    int i2252 = 365 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    int i2262 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i2272 = ((i2262 | 7) << 1) - (i2262 ^ 7);
                                    Object[] objArr422 = new Object[1];
                                    delta((char) (((i2242 | 48) << 1) - (i2242 ^ 48)), i2252, i2272, objArr422);
                                    String str192 = (String) objArr422[0];
                                    Object[] objArr432 = new Object[i32];
                                    objArr432[1] = str192;
                                    objArr432[0] = str182;
                                    D88713 = uH18377.D8871(1214576837);
                                    if (D88713 == null) {
                                    }
                                    long longValue72 = ((Long) ((Method) D88713).invoke(null, objArr432)).longValue();
                                    long j482 = 447548007;
                                    long j492 = longValue72 ^ j31;
                                    long j502 = (j39 | longValue72) ^ j31;
                                    long j512 = ((-970) * (((j492 | j482) ^ j31) | j502)) + (971 * longValue72) + ((-1939) * j482);
                                    long j522 = j482 ^ j31;
                                    long j532 = ((970 * (((j522 | j492) ^ j31) | j502)) + ((1940 * ((longValue72 | j522) ^ j31)) + j512)) - 1995186345;
                                    int maxMemory22 = (int) Runtime.getRuntime().maxMemory();
                                    int i2282 = ((int) (j532 >> 32)) & ((((~((~maxMemory22) | 1633448929)) | (-1224291956)) * 217) + (((~(maxMemory22 | 1224291955)) | (-1778218996)) * 217) + ((((~(1224291955 | r9)) | (~(1633448929 | maxMemory22))) * 217) - 1819877148));
                                    int i2292 = ((int) j532) & ((((~(854148331 | i25)) | 2003592554) * 519) + (((~((-1157898497) | i122)) | (~(2012046827 | i25))) * (-519)) + (((~((-2003592555) | i122)) | 854148331) * 519) + 1453938690);
                                    if (((i2292 & i2282) | (i2282 ^ i2292)) == 0) {
                                    }
                                    int i2312 = ((~i2192) & i25) | (i2192 & i122);
                                    int i2322 = -i2312;
                                    int i2332 = ((i2312 & i2322) | (i2312 ^ i2322)) >> 31;
                                    int i2342 = (i2192 & i2332) | (i230 & (~i2332));
                                    int i2352 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int resolveOpacity22 = Drawable.resolveOpacity(0, 0);
                                    int alpha42 = W0.alpha();
                                    int i2362 = resolveOpacity22 * (-574);
                                    int i2372 = (i2362 & (-213528)) + (i2362 | (-213528));
                                    int i2382 = ~resolveOpacity22;
                                    int i2392 = ~alpha42;
                                    int i2402 = ~((i2382 & i2392) | (i2382 ^ i2392));
                                    int i2412 = ~(((-373) & alpha42) | ((-373) ^ alpha42));
                                    int i2422 = (((i2402 & i2412) | (i2402 ^ i2412)) * 1150) + i2372;
                                    int i2432 = ~(((-373) & alpha42) | ((-373) ^ alpha42));
                                    int i2442 = ~((i2392 ^ 372) | (i2392 & 372));
                                    int i2452 = (i2422 - (~(((i2432 & i2442) | (i2432 ^ i2442)) * (-575)))) - 1;
                                    int i2462 = ~(alpha42 | (~resolveOpacity22));
                                    int i2472 = ~((resolveOpacity22 & i2392) | (i2392 ^ resolveOpacity22));
                                    int i2482 = ((i2472 & i2462) | (i2462 ^ i2472)) * 575;
                                    int i2492 = (i2452 ^ i2482) + ((i2482 & i2452) << 1);
                                    int i2502 = -(-KeyEvent.getDeadChar(0, 0));
                                    int i2512 = (i2502 & 23) + (i2502 | 23);
                                    Object[] objArr452 = new Object[1];
                                    delta((char) ((i2352 & 28265) + (i2352 | 28265)), i2492, i2512, objArr452);
                                    Object[] objArr462 = {(String) objArr452[0]};
                                    D88714 = uH18377.D8871(-957097391);
                                    if (D88714 == null) {
                                    }
                                    lowerCase = ((String) ((Method) D88714).invoke(null, objArr462)).toLowerCase();
                                    char c162 = (char) (30622 - (~(-TextUtils.lastIndexOf("", '0'))));
                                    int i2522 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int i2532 = ((i2522 | 394) << 1) - (i2522 ^ 394);
                                    int i2542 = -(-TextUtils.lastIndexOf("", '0', 0));
                                    int i2552 = (i2542 & 5) + (i2542 | 5);
                                    objArr3 = new Object[1];
                                    delta(c162, i2532, i2552, objArr3);
                                    if (lowerCase.contains((String) objArr3[0])) {
                                    }
                                    int i2572 = (~(i25 & i2342)) & (i25 | i2342);
                                    int i2582 = -i2572;
                                    int i2592 = ((i2572 & i2582) | (i2572 ^ i2582)) >> 31;
                                    int i2602 = i46 & (~i2592);
                                    int i2612 = i2342 & i2592;
                                    int i2622 = (i2612 & i2602) | (i2602 ^ i2612);
                                    char combineMeasuredStates4 = (char) (27079 - View.combineMeasuredStates(0, 0));
                                    int argb5 = 399 - Color.argb(0, 0, 0, 0);
                                    int edgeSlop5 = ViewConfiguration.getEdgeSlop() >> 16;
                                    int i2632 = (edgeSlop5 ^ 42) + ((edgeSlop5 & 42) << 1);
                                    Object[] objArr482 = new Object[1];
                                    delta(combineMeasuredStates4, argb5, i2632, objArr482);
                                    String str202 = (String) objArr482[0];
                                    char c172 = (char) (38348 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))));
                                    int i2642 = -TextUtils.getOffsetAfter("", 0);
                                    int i2652 = i2642 * (-755);
                                    int i2662 = (i2652 ^ (-332955)) + ((i2652 & (-332955)) << 1);
                                    int i2672 = ~i2642;
                                    int i2682 = ((~((i2672 ^ (-442)) | (i2672 & (-442)))) * 1512) + i2662;
                                    int i2692 = ~(i2672 | (-442));
                                    int i2702 = i2642 | 441;
                                    int i2712 = ~((i2702 & i25) | (i2702 ^ i25));
                                    int i2722 = (i2682 - (~(-(-(((i2692 & i2712) | (i2692 ^ i2712)) * (-756)))))) - 1;
                                    int i2732 = (i2642 & 441) | (i2642 ^ 441);
                                    int i2742 = ((i2732 & i122) | (i2732 ^ i122)) * 756;
                                    int i2752 = ((i2722 | i2742) << 1) - (i2742 ^ i2722);
                                    int i2762 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i2772 = (i2762 ^ 39) + ((i2762 & 39) << 1);
                                    Object[] objArr492 = new Object[1];
                                    delta(c172, i2752, i2772, objArr492);
                                    String str212 = (String) objArr492[0];
                                    int i2782 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i2792 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    Object[] objArr502 = new Object[1];
                                    delta((char) (((i2782 | 1) << 1) - (i2782 ^ 1)), ((i2792 | 481) << 1) - (i2792 ^ 481), 25 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr502);
                                    String str222 = (String) objArr502[0];
                                    char c182 = (char) (18993 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                                    int i2802 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i2812 = (i2802 & 508) + (i2802 | 508);
                                    int i2822 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int i2832 = (i2822 ^ 27) + ((i2822 & 27) << 1);
                                    Object[] objArr512 = new Object[1];
                                    delta(c182, i2812, i2832, objArr512);
                                    String str232 = (String) objArr512[0];
                                    int i2842 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i2852 = i2842 * 522;
                                    int i2862 = (i2852 ^ (-29848000)) + ((i2852 & (-29848000)) << 1);
                                    int i2872 = ~(i122 | 57400);
                                    int i2882 = ((i2872 & i2842) | (i2842 ^ i2872)) * (-1042);
                                    int i2892 = (((i25 ^ 57400) | (i25 & 57400)) * 521) + (i2862 ^ i2882) + ((i2882 & i2862) << 1);
                                    int i2902 = ~((~i2842) | (-57401));
                                    int i2912 = ~i2842;
                                    int i2922 = ~((i2912 & i25) | (i2912 ^ i25));
                                    int i2932 = (i2902 & i2922) | (i2902 ^ i2922);
                                    int i2942 = ~i25;
                                    int i2952 = (i2842 & i2942) | (i2942 ^ i2842);
                                    int i2962 = ~((i2952 & 57400) | (i2952 ^ 57400));
                                    int i2972 = -(-(((i2962 & i2932) | (i2932 ^ i2962)) * 521));
                                    char c192 = (char) ((i2892 ^ i2972) + ((i2972 & i2892) << 1));
                                    int makeMeasureSpec32 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i2982 = (makeMeasureSpec32 ^ 535) + ((makeMeasureSpec32 & 535) << 1);
                                    int threadPriority22 = Process.getThreadPriority(0);
                                    Object[] objArr522 = new Object[1];
                                    delta(c192, i2982, 27 - (((threadPriority22 & 20) + (threadPriority22 | 20)) >> 6), objArr522);
                                    String str242 = (String) objArr522[0];
                                    int i2992 = -TextUtils.getTrimmedLength("");
                                    int i3002 = 562 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                    i47 = 0;
                                    int capsMode22 = TextUtils.getCapsMode("", 0, 0);
                                    int i3012 = (capsMode22 & 27) + (capsMode22 | 27);
                                    i48 = 1;
                                    Object[] objArr532 = new Object[1];
                                    delta((char) (((i2992 | 32344) << 1) - (i2992 ^ 32344)), i3002, i3012, objArr532);
                                    String[] strArr122 = {str202, str212, str222, str232, str242, (String) objArr532[0]};
                                    i49 = 0;
                                    i50 = i31;
                                    while (true) {
                                        if (i49 < i50) {
                                        }
                                        i49++;
                                        d4 = d9;
                                        i47 = 0;
                                        i50 = 6;
                                        i48 = 1;
                                    }
                                    int i3052 = (~(i25 & i2622)) & (i25 | i2622);
                                    int i3062 = (i3052 | (-i3052)) >> 31;
                                    int i3072 = i51 & (~i3062);
                                    int i3082 = i2622 & i3062;
                                    int i3092 = (i3082 & i3072) | (i3072 ^ i3082);
                                    char c202 = (char) (15796 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                    int i3102 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    Object[] objArr562 = new Object[1];
                                    delta(c202, ((i3102 | 349) << 1) - (i3102 ^ 349), 16 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr562);
                                    String str272 = (String) objArr562[0];
                                    int i3112 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                    int keyCodeFromString3 = 589 - KeyEvent.keyCodeFromString("");
                                    int i3122 = -Color.rgb(0, 0, 0);
                                    int i3132 = (i3122 & (-16777210)) + (i3122 | (-16777210));
                                    Object[] objArr572 = new Object[1];
                                    delta((char) ((i3112 & 882) + (i3112 | 882)), keyCodeFromString3, i3132, objArr572);
                                    Object[] objArr582 = {str272, (String) objArr572[0]};
                                    D88715 = uH18377.D8871(1214576837);
                                    if (D88715 == null) {
                                    }
                                    long longValue82 = ((Long) ((Method) D88715).invoke(null, objArr582)).longValue();
                                    long j542 = -219006220;
                                    int i3142 = (int) Runtime.getRuntime().totalMemory();
                                    long j552 = HttpConstants.HTTP_PROXY_AUTH;
                                    long j562 = -406;
                                    long j572 = longValue82 ^ j31;
                                    long j582 = i3142;
                                    long j592 = j582 ^ j31;
                                    long j602 = ((HttpConstants.HTTP_NOT_ACCEPTABLE * ((((j542 ^ j31) | j582) ^ j31) | ((j592 | longValue82) ^ j31))) + ((j562 * (((j572 | j592) | j542) ^ j31)) + (((((j572 | j582) ^ j31) | (((j592 | j542) | longValue82) ^ j31)) * j562) + ((j552 * longValue82) + ((-405) * j542))))) - 1328632118;
                                    i52 = ((int) (j602 >> 32)) & ((((~((-17056065) | i122)) | (~((-67179523) | i25))) * 210) + (((~(1403808713 | i122)) | (~(1453932171 | i25))) * 210) + 597506782);
                                    foxtrot2 = ((int) j602) & A0.z.foxtrot((~((-1934313034) | i122)) | 1860941526, 381, (((-285229066) | i25) * (-381)) - 87559792, 1298091365);
                                    if (((foxtrot2 & i52) | (i52 ^ foxtrot2)) != 0) {
                                    }
                                    i53 = i54 | i55;
                                    int i32122 = i25 ^ i3092;
                                    int i32222 = (i32122 | (-i32122)) >> 31;
                                    int i32322 = i53 & (~i32222);
                                    int i32422 = i32222 & i3092;
                                    i56 = (i32322 & i32422) | (i32322 ^ i32422);
                                    if ((i26 & 8) == 0) {
                                    }
                                    int i34122 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int alpha522 = W0.alpha();
                                    int i34222 = (i34122 * 236) - (-1375791);
                                    int i34322 = ~i34122;
                                    int i34422 = ~alpha522;
                                    int i34522 = ~((i34322 & i34422) | (i34322 ^ i34422));
                                    int i34622 = -(-(((i34522 & 2921) | (i34522 ^ 2921)) * (-235)));
                                    int i34722 = (i34222 ^ i34622) + ((i34222 & i34622) << 1);
                                    int i34822 = ~i34122;
                                    int i34922 = ~((i34822 ^ alpha522) | (i34822 & alpha522));
                                    int i35022 = ((i34922 & 2921) | (i34922 ^ 2921)) * (-470);
                                    int i35122 = (i34722 & i35022) + (i35022 | i34722);
                                    int i35222 = (i34822 & 2921) | (i34822 ^ 2921);
                                    int i35322 = ((~((i34122 & (-2922)) | ((-2922) ^ i34122))) | (~((alpha522 & i35222) | (i35222 ^ alpha522)))) * 235;
                                    int i35422 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 738;
                                    int i35522 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                    int i35622 = ((i35522 | 41) << 1) - (i35522 ^ 41);
                                    Object[] objArr6822 = new Object[1];
                                    delta((char) ((i35122 & i35322) + (i35322 | i35122)), i35422, i35622, objArr6822);
                                    String str3222 = (String) objArr6822[0];
                                    char capsMode422 = (char) TextUtils.getCapsMode("", 0, 0);
                                    int i35722 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i35822 = (i35722 ^ 780) + ((i35722 & 780) << 1);
                                    int i35922 = -KeyEvent.keyCodeFromString("");
                                    int i36022 = (i35922 & 30) + (i35922 | 30);
                                    Object[] objArr6922 = new Object[1];
                                    delta(capsMode422, i35822, i36022, objArr6922);
                                    strArr = new String[]{str3222, (String) objArr6922[0]};
                                    i57 = 0;
                                    while (true) {
                                        if (i57 >= 2) {
                                        }
                                        i57++;
                                        i56 = i58;
                                        strArr = strArr5;
                                    }
                                    int i36522 = i25 ^ i58;
                                    int i36622 = -i36522;
                                    int i36722 = ((i36522 & i36622) | (i36522 ^ i36622)) >> 31;
                                    int i36822 = i59 & (~i36722);
                                    int i36922 = i58 & i36722;
                                    int i37022 = (i36822 & i36922) | (i36822 ^ i36922);
                                    D88716 = uH18377.D8871(-344556366);
                                    if (D88716 == null) {
                                    }
                                    long longValue1122 = ((Long) ((Method) D88716).invoke(null, null)).longValue();
                                    long j7322 = 1837943408;
                                    long j7422 = -755;
                                    long j7522 = ((j7322 ^ j31) | (longValue1122 ^ j31)) ^ j31;
                                    long j7622 = (1512 * j7522) + (j7422 * longValue1122) + (j7422 * j7322);
                                    long j7722 = j7322 | longValue1122;
                                    long j7822 = ((756 * (j7722 | j39)) + (((-756) * (j7522 | ((j7722 | j6) ^ j31))) + j7622)) - 1990196506;
                                    i60 = ((int) (j7822 >> 32)) & (((~(i122 | (-1237973241))) * 886) + (((-1237973241) | (~((-1619767645) | i122))) * (-1772)) + (((((~(1619767644 | i25)) | (-1774975485)) | (~((-1082765401) | i122))) * 886) - 1222979076));
                                    i61 = ((int) j7822) & ((((~(1295229528 | i25)) | 4460801 | (~((-141996882) | i25))) * HttpConstants.HTTP_PROXY_AUTH) + (((~((-1295229529) | i25)) | (~(141996881 | i122)) | 4460801) * HttpConstants.HTTP_PROXY_AUTH) + (((1157693448 | r3) * (-814)) - 1345533451));
                                    if (((i61 & i60) | (i60 ^ i61)) != 1) {
                                    }
                                    int i84222 = -((i122 & i37022) | ((~i37022) & i25));
                                    Object[] objArr19122 = {new int[]{i37022}, new int[]{i25}, new int[1], strArr2};
                                    int i84322 = ~((int) Runtime.getRuntime().totalMemory());
                                    int i84422 = -(-((((((~(r0 | 1047903798)) | (~(i84322 | (-537920005)))) * 210) + ((((~(609327636 | i84322)) | (~((-976496167) | r0))) * 210) - 1817097725)) - (~((((r4 & i84222) | (r4 ^ i84222)) >> 31) & 16))) - 1));
                                    int i84522 = (i27 ^ i84422) + ((i27 & i84422) << 1);
                                    int i84622 = (i84522 << 13) ^ i84522;
                                    int i84722 = i84622 ^ (i84622 >>> 17);
                                    int i84822 = i84722 << 5;
                                    ((int[]) objArr19122[2])[0] = ((~i84722) & i84822) | ((~i84822) & i84722);
                                    return objArr19122;
                                }
                            }
                            i39 = 0;
                            int i1872 = (i39 | (-i39)) >> 31;
                            int i1882 = (i1872 & ((i25 & (-263)) | (i122 & 262))) | ((~i1872) & i25);
                            int i1892 = ((~i177) & i25) | (i177 & i122);
                            int i1902 = -i1892;
                            int i1912 = ((i1892 & i1902) | (i1892 ^ i1902)) >> 31;
                            int i1922 = i1882 & (~i1912);
                            int i1932 = i177 & i1912;
                            i40 = (i1932 & i1922) | (i1922 ^ i1932);
                            char scrollDefaultDelay7 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21690);
                            c3 = 0;
                            int i1942 = 230 - (~(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)));
                            int absoluteGravity22 = Gravity.getAbsoluteGravity(0, 0);
                            int i1952 = (absoluteGravity22 & 31) + (absoluteGravity22 | 31);
                            Object[] objArr312 = new Object[1];
                            delta(scrollDefaultDelay7, i1942, i1952, objArr312);
                            String str152 = (String) objArr312[0];
                            char red32 = (char) Color.red(0);
                            int i1962 = 262 - (~(-(-MotionEvent.axisFromString(""))));
                            int i1972 = -(-Color.green(0));
                            Object[] objArr322 = new Object[1];
                            delta(red32, i1962, (i1972 & 23) + (i1972 | 23), objArr322);
                            String str162 = (String) objArr322[0];
                            int trimmedLength6 = TextUtils.getTrimmedLength("");
                            int alpha32 = Color.alpha(0);
                            int i1982 = (alpha32 & 285) + (alpha32 | 285);
                            int i1992 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            int i2002 = (i1992 ^ 27) + ((i1992 & 27) << 1);
                            Object[] objArr332 = new Object[1];
                            delta((char) ((trimmedLength6 & 37334) + (trimmedLength6 | 37334)), i1982, i2002, objArr332);
                            String str172 = (String) objArr332[0];
                            char c122 = (char) ((-2) - ((-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) ^ (-1)));
                            int i2012 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            i41 = 1;
                            int i2022 = (i2012 ^ 313) + ((i2012 & 313) << 1);
                            int i2032 = -(-TextUtils.indexOf("", "", 0, 0));
                            int i2042 = (i2032 ^ 14) + ((i2032 & 14) << 1);
                            Object[] objArr342 = new Object[1];
                            delta(c122, i2022, i2042, objArr342);
                            String[] strArr112 = {str152, str162, str172, (String) objArr342[0]};
                            i42 = 0;
                            while (true) {
                                if (i42 >= 4) {
                                }
                                i42 = (i42 & 1) + (i42 | 1);
                                i40 = i43;
                                j5 = j6;
                                c3 = 0;
                                i41 = 1;
                            }
                            int i2102 = (~(i25 & i43)) & (i25 | i43);
                            int i2112 = (i2102 | (-i2102)) >> 31;
                            int i2122 = (i44 & (~i2112)) | (i43 & i2112);
                            float f112 = f5;
                            int i2132 = -(-(PointF.length(f112, f112) > f112 ? 1 : (PointF.length(f112, f112) == f112 ? 0 : -1)));
                            int keyRepeatTimeout7 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            Object[] objArr372 = new Object[1];
                            delta((char) ((i2132 ^ 59218) + ((i2132 & 59218) << 1)), (keyRepeatTimeout7 & 327) + (keyRepeatTimeout7 | 327), TextUtils.getOffsetAfter("", 0) + 13, objArr372);
                            Object[] objArr382 = {(String) objArr372[0]};
                            D88712 = uH18377.D8871(-957097391);
                            if (D88712 == null) {
                            }
                            str2 = (String) ((Method) D88712).invoke(null, objArr382);
                            if (str2 != null) {
                            }
                            i45 = i25;
                            int i21622 = (~(i25 & i2122)) & (i25 | i2122);
                            int i21722 = -i21622;
                            int i21822 = ((i21622 & i21722) | (i21622 ^ i21722)) >> 31;
                            int i21922 = (i2122 & i21822) | (i45 & (~i21822));
                            char c1522 = (char) (15795 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                            int i22022 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i22122 = (i22022 ^ 348) + ((i22022 & 348) << 1);
                            d4 = 0.0d;
                            int i22222 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int i22322 = (i22222 & 17) + (i22222 | 17);
                            Object[] objArr4122 = new Object[1];
                            delta(c1522, i22122, i22322, objArr4122);
                            String str1822 = (String) objArr4122[0];
                            int i22422 = -AndroidCharacter.getMirror('0');
                            int i22522 = 365 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            int i22622 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i22722 = ((i22622 | 7) << 1) - (i22622 ^ 7);
                            Object[] objArr4222 = new Object[1];
                            delta((char) (((i22422 | 48) << 1) - (i22422 ^ 48)), i22522, i22722, objArr4222);
                            String str1922 = (String) objArr4222[0];
                            Object[] objArr4322 = new Object[i32];
                            objArr4322[1] = str1922;
                            objArr4322[0] = str1822;
                            D88713 = uH18377.D8871(1214576837);
                            if (D88713 == null) {
                            }
                            long longValue722 = ((Long) ((Method) D88713).invoke(null, objArr4322)).longValue();
                            long j4822 = 447548007;
                            long j4922 = longValue722 ^ j31;
                            long j5022 = (j39 | longValue722) ^ j31;
                            long j5122 = ((-970) * (((j4922 | j4822) ^ j31) | j5022)) + (971 * longValue722) + ((-1939) * j4822);
                            long j5222 = j4822 ^ j31;
                            long j5322 = ((970 * (((j5222 | j4922) ^ j31) | j5022)) + ((1940 * ((longValue722 | j5222) ^ j31)) + j5122)) - 1995186345;
                            int maxMemory222 = (int) Runtime.getRuntime().maxMemory();
                            int i22822 = ((int) (j5322 >> 32)) & ((((~((~maxMemory222) | 1633448929)) | (-1224291956)) * 217) + (((~(maxMemory222 | 1224291955)) | (-1778218996)) * 217) + ((((~(1224291955 | r9)) | (~(1633448929 | maxMemory222))) * 217) - 1819877148));
                            int i22922 = ((int) j5322) & ((((~(854148331 | i25)) | 2003592554) * 519) + (((~((-1157898497) | i122)) | (~(2012046827 | i25))) * (-519)) + (((~((-2003592555) | i122)) | 854148331) * 519) + 1453938690);
                            if (((i22922 & i22822) | (i22822 ^ i22922)) == 0) {
                            }
                            int i23122 = ((~i21922) & i25) | (i21922 & i122);
                            int i23222 = -i23122;
                            int i23322 = ((i23122 & i23222) | (i23122 ^ i23222)) >> 31;
                            int i23422 = (i21922 & i23322) | (i230 & (~i23322));
                            int i23522 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            int resolveOpacity222 = Drawable.resolveOpacity(0, 0);
                            int alpha422 = W0.alpha();
                            int i23622 = resolveOpacity222 * (-574);
                            int i23722 = (i23622 & (-213528)) + (i23622 | (-213528));
                            int i23822 = ~resolveOpacity222;
                            int i23922 = ~alpha422;
                            int i24022 = ~((i23822 & i23922) | (i23822 ^ i23922));
                            int i24122 = ~(((-373) & alpha422) | ((-373) ^ alpha422));
                            int i24222 = (((i24022 & i24122) | (i24022 ^ i24122)) * 1150) + i23722;
                            int i24322 = ~(((-373) & alpha422) | ((-373) ^ alpha422));
                            int i24422 = ~((i23922 ^ 372) | (i23922 & 372));
                            int i24522 = (i24222 - (~(((i24322 & i24422) | (i24322 ^ i24422)) * (-575)))) - 1;
                            int i24622 = ~(alpha422 | (~resolveOpacity222));
                            int i24722 = ~((resolveOpacity222 & i23922) | (i23922 ^ resolveOpacity222));
                            int i24822 = ((i24722 & i24622) | (i24622 ^ i24722)) * 575;
                            int i24922 = (i24522 ^ i24822) + ((i24822 & i24522) << 1);
                            int i25022 = -(-KeyEvent.getDeadChar(0, 0));
                            int i25122 = (i25022 & 23) + (i25022 | 23);
                            Object[] objArr4522 = new Object[1];
                            delta((char) ((i23522 & 28265) + (i23522 | 28265)), i24922, i25122, objArr4522);
                            Object[] objArr4622 = {(String) objArr4522[0]};
                            D88714 = uH18377.D8871(-957097391);
                            if (D88714 == null) {
                            }
                            lowerCase = ((String) ((Method) D88714).invoke(null, objArr4622)).toLowerCase();
                            char c1622 = (char) (30622 - (~(-TextUtils.lastIndexOf("", '0'))));
                            int i25222 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int i25322 = ((i25222 | 394) << 1) - (i25222 ^ 394);
                            int i25422 = -(-TextUtils.lastIndexOf("", '0', 0));
                            int i25522 = (i25422 & 5) + (i25422 | 5);
                            objArr3 = new Object[1];
                            delta(c1622, i25322, i25522, objArr3);
                            if (lowerCase.contains((String) objArr3[0])) {
                            }
                            int i25722 = (~(i25 & i23422)) & (i25 | i23422);
                            int i25822 = -i25722;
                            int i25922 = ((i25722 & i25822) | (i25722 ^ i25822)) >> 31;
                            int i26022 = i46 & (~i25922);
                            int i26122 = i23422 & i25922;
                            int i26222 = (i26122 & i26022) | (i26022 ^ i26122);
                            char combineMeasuredStates42 = (char) (27079 - View.combineMeasuredStates(0, 0));
                            int argb52 = 399 - Color.argb(0, 0, 0, 0);
                            int edgeSlop52 = ViewConfiguration.getEdgeSlop() >> 16;
                            int i26322 = (edgeSlop52 ^ 42) + ((edgeSlop52 & 42) << 1);
                            Object[] objArr4822 = new Object[1];
                            delta(combineMeasuredStates42, argb52, i26322, objArr4822);
                            String str2022 = (String) objArr4822[0];
                            char c1722 = (char) (38348 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))));
                            int i26422 = -TextUtils.getOffsetAfter("", 0);
                            int i26522 = i26422 * (-755);
                            int i26622 = (i26522 ^ (-332955)) + ((i26522 & (-332955)) << 1);
                            int i26722 = ~i26422;
                            int i26822 = ((~((i26722 ^ (-442)) | (i26722 & (-442)))) * 1512) + i26622;
                            int i26922 = ~(i26722 | (-442));
                            int i27022 = i26422 | 441;
                            int i27122 = ~((i27022 & i25) | (i27022 ^ i25));
                            int i27222 = (i26822 - (~(-(-(((i26922 & i27122) | (i26922 ^ i27122)) * (-756)))))) - 1;
                            int i27322 = (i26422 & 441) | (i26422 ^ 441);
                            int i27422 = ((i27322 & i122) | (i27322 ^ i122)) * 756;
                            int i27522 = ((i27222 | i27422) << 1) - (i27422 ^ i27222);
                            int i27622 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i27722 = (i27622 ^ 39) + ((i27622 & 39) << 1);
                            Object[] objArr4922 = new Object[1];
                            delta(c1722, i27522, i27722, objArr4922);
                            String str2122 = (String) objArr4922[0];
                            int i27822 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i27922 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Object[] objArr5022 = new Object[1];
                            delta((char) (((i27822 | 1) << 1) - (i27822 ^ 1)), ((i27922 | 481) << 1) - (i27922 ^ 481), 25 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr5022);
                            String str2222 = (String) objArr5022[0];
                            char c1822 = (char) (18993 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                            int i28022 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i28122 = (i28022 & 508) + (i28022 | 508);
                            int i28222 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i28322 = (i28222 ^ 27) + ((i28222 & 27) << 1);
                            Object[] objArr5122 = new Object[1];
                            delta(c1822, i28122, i28322, objArr5122);
                            String str2322 = (String) objArr5122[0];
                            int i28422 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i28522 = i28422 * 522;
                            int i28622 = (i28522 ^ (-29848000)) + ((i28522 & (-29848000)) << 1);
                            int i28722 = ~(i122 | 57400);
                            int i28822 = ((i28722 & i28422) | (i28422 ^ i28722)) * (-1042);
                            int i28922 = (((i25 ^ 57400) | (i25 & 57400)) * 521) + (i28622 ^ i28822) + ((i28822 & i28622) << 1);
                            int i29022 = ~((~i28422) | (-57401));
                            int i29122 = ~i28422;
                            int i29222 = ~((i29122 & i25) | (i29122 ^ i25));
                            int i29322 = (i29022 & i29222) | (i29022 ^ i29222);
                            int i29422 = ~i25;
                            int i29522 = (i28422 & i29422) | (i29422 ^ i28422);
                            int i29622 = ~((i29522 & 57400) | (i29522 ^ 57400));
                            int i29722 = -(-(((i29622 & i29322) | (i29322 ^ i29622)) * 521));
                            char c1922 = (char) ((i28922 ^ i29722) + ((i29722 & i28922) << 1));
                            int makeMeasureSpec322 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i29822 = (makeMeasureSpec322 ^ 535) + ((makeMeasureSpec322 & 535) << 1);
                            int threadPriority222 = Process.getThreadPriority(0);
                            Object[] objArr5222 = new Object[1];
                            delta(c1922, i29822, 27 - (((threadPriority222 & 20) + (threadPriority222 | 20)) >> 6), objArr5222);
                            String str2422 = (String) objArr5222[0];
                            int i29922 = -TextUtils.getTrimmedLength("");
                            int i30022 = 562 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                            i47 = 0;
                            int capsMode222 = TextUtils.getCapsMode("", 0, 0);
                            int i30122 = (capsMode222 & 27) + (capsMode222 | 27);
                            i48 = 1;
                            Object[] objArr5322 = new Object[1];
                            delta((char) (((i29922 | 32344) << 1) - (i29922 ^ 32344)), i30022, i30122, objArr5322);
                            String[] strArr1222 = {str2022, str2122, str2222, str2322, str2422, (String) objArr5322[0]};
                            i49 = 0;
                            i50 = i31;
                            while (true) {
                                if (i49 < i50) {
                                }
                                i49++;
                                d4 = d9;
                                i47 = 0;
                                i50 = 6;
                                i48 = 1;
                            }
                            int i30522 = (~(i25 & i26222)) & (i25 | i26222);
                            int i30622 = (i30522 | (-i30522)) >> 31;
                            int i30722 = i51 & (~i30622);
                            int i30822 = i26222 & i30622;
                            int i30922 = (i30822 & i30722) | (i30722 ^ i30822);
                            char c2022 = (char) (15796 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                            int i31022 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Object[] objArr5622 = new Object[1];
                            delta(c2022, ((i31022 | 349) << 1) - (i31022 ^ 349), 16 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr5622);
                            String str2722 = (String) objArr5622[0];
                            int i31122 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int keyCodeFromString32 = 589 - KeyEvent.keyCodeFromString("");
                            int i31222 = -Color.rgb(0, 0, 0);
                            int i31322 = (i31222 & (-16777210)) + (i31222 | (-16777210));
                            Object[] objArr5722 = new Object[1];
                            delta((char) ((i31122 & 882) + (i31122 | 882)), keyCodeFromString32, i31322, objArr5722);
                            Object[] objArr5822 = {str2722, (String) objArr5722[0]};
                            D88715 = uH18377.D8871(1214576837);
                            if (D88715 == null) {
                            }
                            long longValue822 = ((Long) ((Method) D88715).invoke(null, objArr5822)).longValue();
                            long j5422 = -219006220;
                            int i31422 = (int) Runtime.getRuntime().totalMemory();
                            long j5522 = HttpConstants.HTTP_PROXY_AUTH;
                            long j5622 = -406;
                            long j5722 = longValue822 ^ j31;
                            long j5822 = i31422;
                            long j5922 = j5822 ^ j31;
                            long j6022 = ((HttpConstants.HTTP_NOT_ACCEPTABLE * ((((j5422 ^ j31) | j5822) ^ j31) | ((j5922 | longValue822) ^ j31))) + ((j5622 * (((j5722 | j5922) | j5422) ^ j31)) + (((((j5722 | j5822) ^ j31) | (((j5922 | j5422) | longValue822) ^ j31)) * j5622) + ((j5522 * longValue822) + ((-405) * j5422))))) - 1328632118;
                            i52 = ((int) (j6022 >> 32)) & ((((~((-17056065) | i122)) | (~((-67179523) | i25))) * 210) + (((~(1403808713 | i122)) | (~(1453932171 | i25))) * 210) + 597506782);
                            foxtrot2 = ((int) j6022) & A0.z.foxtrot((~((-1934313034) | i122)) | 1860941526, 381, (((-285229066) | i25) * (-381)) - 87559792, 1298091365);
                            if (((foxtrot2 & i52) | (i52 ^ foxtrot2)) != 0) {
                            }
                            i53 = i54 | i55;
                            int i321222 = i25 ^ i30922;
                            int i322222 = (i321222 | (-i321222)) >> 31;
                            int i323222 = i53 & (~i322222);
                            int i324222 = i322222 & i30922;
                            i56 = (i323222 & i324222) | (i323222 ^ i324222);
                            if ((i26 & 8) == 0) {
                            }
                            int i341222 = -((byte) KeyEvent.getModifierMetaStateMask());
                            int alpha5222 = W0.alpha();
                            int i342222 = (i341222 * 236) - (-1375791);
                            int i343222 = ~i341222;
                            int i344222 = ~alpha5222;
                            int i345222 = ~((i343222 & i344222) | (i343222 ^ i344222));
                            int i346222 = -(-(((i345222 & 2921) | (i345222 ^ 2921)) * (-235)));
                            int i347222 = (i342222 ^ i346222) + ((i342222 & i346222) << 1);
                            int i348222 = ~i341222;
                            int i349222 = ~((i348222 ^ alpha5222) | (i348222 & alpha5222));
                            int i350222 = ((i349222 & 2921) | (i349222 ^ 2921)) * (-470);
                            int i351222 = (i347222 & i350222) + (i350222 | i347222);
                            int i352222 = (i348222 & 2921) | (i348222 ^ 2921);
                            int i353222 = ((~((i341222 & (-2922)) | ((-2922) ^ i341222))) | (~((alpha5222 & i352222) | (i352222 ^ alpha5222)))) * 235;
                            int i354222 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 738;
                            int i355222 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            int i356222 = ((i355222 | 41) << 1) - (i355222 ^ 41);
                            Object[] objArr68222 = new Object[1];
                            delta((char) ((i351222 & i353222) + (i353222 | i351222)), i354222, i356222, objArr68222);
                            String str32222 = (String) objArr68222[0];
                            char capsMode4222 = (char) TextUtils.getCapsMode("", 0, 0);
                            int i357222 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i358222 = (i357222 ^ 780) + ((i357222 & 780) << 1);
                            int i359222 = -KeyEvent.keyCodeFromString("");
                            int i360222 = (i359222 & 30) + (i359222 | 30);
                            Object[] objArr69222 = new Object[1];
                            delta(capsMode4222, i358222, i360222, objArr69222);
                            strArr = new String[]{str32222, (String) objArr69222[0]};
                            i57 = 0;
                            while (true) {
                                if (i57 >= 2) {
                                }
                                i57++;
                                i56 = i58;
                                strArr = strArr5;
                            }
                            int i365222 = i25 ^ i58;
                            int i366222 = -i365222;
                            int i367222 = ((i365222 & i366222) | (i365222 ^ i366222)) >> 31;
                            int i368222 = i59 & (~i367222);
                            int i369222 = i58 & i367222;
                            int i370222 = (i368222 & i369222) | (i368222 ^ i369222);
                            D88716 = uH18377.D8871(-344556366);
                            if (D88716 == null) {
                            }
                            long longValue11222 = ((Long) ((Method) D88716).invoke(null, null)).longValue();
                            long j73222 = 1837943408;
                            long j74222 = -755;
                            long j75222 = ((j73222 ^ j31) | (longValue11222 ^ j31)) ^ j31;
                            long j76222 = (1512 * j75222) + (j74222 * longValue11222) + (j74222 * j73222);
                            long j77222 = j73222 | longValue11222;
                            long j78222 = ((756 * (j77222 | j39)) + (((-756) * (j75222 | ((j77222 | j6) ^ j31))) + j76222)) - 1990196506;
                            i60 = ((int) (j78222 >> 32)) & (((~(i122 | (-1237973241))) * 886) + (((-1237973241) | (~((-1619767645) | i122))) * (-1772)) + (((((~(1619767644 | i25)) | (-1774975485)) | (~((-1082765401) | i122))) * 886) - 1222979076));
                            i61 = ((int) j78222) & ((((~(1295229528 | i25)) | 4460801 | (~((-141996882) | i25))) * HttpConstants.HTTP_PROXY_AUTH) + (((~((-1295229529) | i25)) | (~(141996881 | i122)) | 4460801) * HttpConstants.HTTP_PROXY_AUTH) + (((1157693448 | r3) * (-814)) - 1345533451));
                            if (((i61 & i60) | (i60 ^ i61)) != 1) {
                            }
                            int i842222 = -((i122 & i370222) | ((~i370222) & i25));
                            Object[] objArr191222 = {new int[]{i370222}, new int[]{i25}, new int[1], strArr2};
                            int i843222 = ~((int) Runtime.getRuntime().totalMemory());
                            int i844222 = -(-((((((~(r0 | 1047903798)) | (~(i843222 | (-537920005)))) * 210) + ((((~(609327636 | i843222)) | (~((-976496167) | r0))) * 210) - 1817097725)) - (~((((r4 & i842222) | (r4 ^ i842222)) >> 31) & 16))) - 1));
                            int i845222 = (i27 ^ i844222) + ((i27 & i844222) << 1);
                            int i846222 = (i845222 << 13) ^ i845222;
                            int i847222 = i846222 ^ (i846222 >>> 17);
                            int i848222 = i847222 << 5;
                            ((int[]) objArr191222[2])[0] = ((~i847222) & i848222) | ((~i848222) & i847222);
                            return objArr191222;
                        }
                        i37 = i25 & (-267);
                        i38 = i122 & 266;
                        i36 = i37 | i38;
                        int i1552 = (~(i25 & i128)) & (i25 | i128);
                        int i1562 = (i1552 | (-i1552)) >> 31;
                        int i1572 = i36 & (~i1562);
                        int i1582 = i1562 & i128;
                        int i1592 = (i1572 & i1582) | (i1572 ^ i1582);
                        D8871 = uH18377.D8871(1074526551);
                        if (D8871 == null) {
                        }
                        long longValue52 = ((Long) ((Method) D8871).invoke(null, null)).longValue();
                        long j352 = 156404268;
                        long j362 = -949;
                        long j372 = (j362 * longValue52) + (j362 * j352);
                        long j382 = longValue52 ^ j31;
                        j5 = i25;
                        long j392 = j5 ^ j31;
                        long j402 = (950 * (((j352 | j5) ^ j31) | ((j392 | longValue52) ^ j31))) + ((-950) * (((j392 | j352) ^ j31) | ((longValue52 | j5) ^ j31))) + (1900 * (((j382 | j392) ^ j31) | (((j352 ^ j31) | j5) ^ j31))) + j372 + 23161449;
                        int myUid32 = Process.myUid();
                        int i1612 = ((~(219027772 | myUid32)) * 216) + 364684154;
                        int i1622 = ~myUid32;
                        int tango32 = ao.ad.tango(1903456119);
                        int i1632 = ~tango32;
                        int i1642 = (((int) (j402 >> 32)) & ((((~(i1622 | 219027772)) | 1218198638) * 216) + (((-1083188291) | i1622) * (-216)) + i1612)) | (((int) j402) & ((((~(tango32 | (-1456215733))) | (~(2128361205 | i1632)) | 18989322) * 676) + (((~(691134795 | i1632)) | (-2147350528)) * 676) + ((2147350527 | tango32) * (-676)) + 1871558137));
                        int i1652 = i1642 + 199;
                        int i1662 = (i1652 & i122) | ((~i1652) & i25);
                        int i1672 = -i1642;
                        int i1682 = ((i1642 & i1672) | (i1642 ^ i1672)) >> 31;
                        int i1692 = (~i1682) & i25;
                        int i1702 = i1682 & i1662;
                        int i1712 = (i1702 & i1692) | (i1692 ^ i1702);
                        int i1722 = ((~i1592) & i25) | (i1592 & i122);
                        int i1732 = -i1722;
                        int i1742 = ((i1722 & i1732) | (i1722 ^ i1732)) >> 31;
                        int i1752 = i1712 & (~i1742);
                        int i1762 = i1592 & i1742;
                        int i1772 = (i1762 & i1752) | (i1752 ^ i1762);
                        char c102 = (char) (4098 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
                        int i1782 = -TextUtils.getCapsMode("", 0, 0);
                        int i1792 = (i1782 ^ 203) + ((i1782 & 203) << 1);
                        int jumpTapTimeout22 = ViewConfiguration.getJumpTapTimeout() >> 16;
                        int i1802 = ((jumpTapTimeout22 | 20) << 1) - (jumpTapTimeout22 ^ 20);
                        Object[] objArr282 = new Object[1];
                        delta(c102, i1792, i1802, objArr282);
                        String str142 = (String) objArr282[0];
                        Object[] objArr292 = new Object[1];
                        delta((char) (0 - (~((byte) KeyEvent.getModifierMetaStateMask()))), 222 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), 5 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr292);
                        str = (String) objArr292[0];
                        file = new File(str142);
                        if (file.exists()) {
                            Scanner scanner5 = new Scanner(new FileInputStream(file));
                            char c112 = (char) (0 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))));
                            int i1812 = -KeyEvent.getDeadChar(0, 0);
                            int i1822 = (i1812 ^ 229) + ((i1812 & 229) << 1);
                            int i1832 = -(-TextUtils.getOffsetAfter("", 0));
                            int i1842 = (i1832 ^ 2) + ((i1832 & 2) << 1);
                            Object[] objArr302 = new Object[1];
                            delta(c112, i1822, i1842, objArr302);
                            useDelimiter = scanner5.useDelimiter((String) objArr302[0]);
                            if (useDelimiter.hasNext()) {
                            }
                            useDelimiter.close();
                            if (str3.contains(str)) {
                            }
                        }
                        i39 = 0;
                        int i18722 = (i39 | (-i39)) >> 31;
                        int i18822 = (i18722 & ((i25 & (-263)) | (i122 & 262))) | ((~i18722) & i25);
                        int i18922 = ((~i1772) & i25) | (i1772 & i122);
                        int i19022 = -i18922;
                        int i19122 = ((i18922 & i19022) | (i18922 ^ i19022)) >> 31;
                        int i19222 = i18822 & (~i19122);
                        int i19322 = i1772 & i19122;
                        i40 = (i19322 & i19222) | (i19222 ^ i19322);
                        char scrollDefaultDelay72 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 21690);
                        c3 = 0;
                        int i19422 = 230 - (~(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)));
                        int absoluteGravity222 = Gravity.getAbsoluteGravity(0, 0);
                        int i19522 = (absoluteGravity222 & 31) + (absoluteGravity222 | 31);
                        Object[] objArr3122 = new Object[1];
                        delta(scrollDefaultDelay72, i19422, i19522, objArr3122);
                        String str1522 = (String) objArr3122[0];
                        char red322 = (char) Color.red(0);
                        int i19622 = 262 - (~(-(-MotionEvent.axisFromString(""))));
                        int i19722 = -(-Color.green(0));
                        Object[] objArr3222 = new Object[1];
                        delta(red322, i19622, (i19722 & 23) + (i19722 | 23), objArr3222);
                        String str1622 = (String) objArr3222[0];
                        int trimmedLength62 = TextUtils.getTrimmedLength("");
                        int alpha322 = Color.alpha(0);
                        int i19822 = (alpha322 & 285) + (alpha322 | 285);
                        int i19922 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i20022 = (i19922 ^ 27) + ((i19922 & 27) << 1);
                        Object[] objArr3322 = new Object[1];
                        delta((char) ((trimmedLength62 & 37334) + (trimmedLength62 | 37334)), i19822, i20022, objArr3322);
                        String str1722 = (String) objArr3322[0];
                        char c1222 = (char) ((-2) - ((-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) ^ (-1)));
                        int i20122 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        i41 = 1;
                        int i20222 = (i20122 ^ 313) + ((i20122 & 313) << 1);
                        int i20322 = -(-TextUtils.indexOf("", "", 0, 0));
                        int i20422 = (i20322 ^ 14) + ((i20322 & 14) << 1);
                        Object[] objArr3422 = new Object[1];
                        delta(c1222, i20222, i20422, objArr3422);
                        String[] strArr1122 = {str1522, str1622, str1722, (String) objArr3422[0]};
                        i42 = 0;
                        while (true) {
                            if (i42 >= 4) {
                            }
                            i42 = (i42 & 1) + (i42 | 1);
                            i40 = i43;
                            j5 = j6;
                            c3 = 0;
                            i41 = 1;
                        }
                        int i21022 = (~(i25 & i43)) & (i25 | i43);
                        int i21122 = (i21022 | (-i21022)) >> 31;
                        int i21222 = (i44 & (~i21122)) | (i43 & i21122);
                        float f1122 = f5;
                        int i21322 = -(-(PointF.length(f1122, f1122) > f1122 ? 1 : (PointF.length(f1122, f1122) == f1122 ? 0 : -1)));
                        int keyRepeatTimeout72 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                        Object[] objArr3722 = new Object[1];
                        delta((char) ((i21322 ^ 59218) + ((i21322 & 59218) << 1)), (keyRepeatTimeout72 & 327) + (keyRepeatTimeout72 | 327), TextUtils.getOffsetAfter("", 0) + 13, objArr3722);
                        Object[] objArr3822 = {(String) objArr3722[0]};
                        D88712 = uH18377.D8871(-957097391);
                        if (D88712 == null) {
                        }
                        str2 = (String) ((Method) D88712).invoke(null, objArr3822);
                        if (str2 != null) {
                        }
                        i45 = i25;
                        int i216222 = (~(i25 & i21222)) & (i25 | i21222);
                        int i217222 = -i216222;
                        int i218222 = ((i216222 & i217222) | (i216222 ^ i217222)) >> 31;
                        int i219222 = (i21222 & i218222) | (i45 & (~i218222));
                        char c15222 = (char) (15795 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                        int i220222 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i221222 = (i220222 ^ 348) + ((i220222 & 348) << 1);
                        d4 = 0.0d;
                        int i222222 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i223222 = (i222222 & 17) + (i222222 | 17);
                        Object[] objArr41222 = new Object[1];
                        delta(c15222, i221222, i223222, objArr41222);
                        String str18222 = (String) objArr41222[0];
                        int i224222 = -AndroidCharacter.getMirror('0');
                        int i225222 = 365 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int i226222 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i227222 = ((i226222 | 7) << 1) - (i226222 ^ 7);
                        Object[] objArr42222 = new Object[1];
                        delta((char) (((i224222 | 48) << 1) - (i224222 ^ 48)), i225222, i227222, objArr42222);
                        String str19222 = (String) objArr42222[0];
                        Object[] objArr43222 = new Object[i32];
                        objArr43222[1] = str19222;
                        objArr43222[0] = str18222;
                        D88713 = uH18377.D8871(1214576837);
                        if (D88713 == null) {
                        }
                        long longValue7222 = ((Long) ((Method) D88713).invoke(null, objArr43222)).longValue();
                        long j48222 = 447548007;
                        long j49222 = longValue7222 ^ j31;
                        long j50222 = (j392 | longValue7222) ^ j31;
                        long j51222 = ((-970) * (((j49222 | j48222) ^ j31) | j50222)) + (971 * longValue7222) + ((-1939) * j48222);
                        long j52222 = j48222 ^ j31;
                        long j53222 = ((970 * (((j52222 | j49222) ^ j31) | j50222)) + ((1940 * ((longValue7222 | j52222) ^ j31)) + j51222)) - 1995186345;
                        int maxMemory2222 = (int) Runtime.getRuntime().maxMemory();
                        int i228222 = ((int) (j53222 >> 32)) & ((((~((~maxMemory2222) | 1633448929)) | (-1224291956)) * 217) + (((~(maxMemory2222 | 1224291955)) | (-1778218996)) * 217) + ((((~(1224291955 | r9)) | (~(1633448929 | maxMemory2222))) * 217) - 1819877148));
                        int i229222 = ((int) j53222) & ((((~(854148331 | i25)) | 2003592554) * 519) + (((~((-1157898497) | i122)) | (~(2012046827 | i25))) * (-519)) + (((~((-2003592555) | i122)) | 854148331) * 519) + 1453938690);
                        if (((i229222 & i228222) | (i228222 ^ i229222)) == 0) {
                        }
                        int i231222 = ((~i219222) & i25) | (i219222 & i122);
                        int i232222 = -i231222;
                        int i233222 = ((i231222 & i232222) | (i231222 ^ i232222)) >> 31;
                        int i234222 = (i219222 & i233222) | (i230 & (~i233222));
                        int i235222 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int resolveOpacity2222 = Drawable.resolveOpacity(0, 0);
                        int alpha4222 = W0.alpha();
                        int i236222 = resolveOpacity2222 * (-574);
                        int i237222 = (i236222 & (-213528)) + (i236222 | (-213528));
                        int i238222 = ~resolveOpacity2222;
                        int i239222 = ~alpha4222;
                        int i240222 = ~((i238222 & i239222) | (i238222 ^ i239222));
                        int i241222 = ~(((-373) & alpha4222) | ((-373) ^ alpha4222));
                        int i242222 = (((i240222 & i241222) | (i240222 ^ i241222)) * 1150) + i237222;
                        int i243222 = ~(((-373) & alpha4222) | ((-373) ^ alpha4222));
                        int i244222 = ~((i239222 ^ 372) | (i239222 & 372));
                        int i245222 = (i242222 - (~(((i243222 & i244222) | (i243222 ^ i244222)) * (-575)))) - 1;
                        int i246222 = ~(alpha4222 | (~resolveOpacity2222));
                        int i247222 = ~((resolveOpacity2222 & i239222) | (i239222 ^ resolveOpacity2222));
                        int i248222 = ((i247222 & i246222) | (i246222 ^ i247222)) * 575;
                        int i249222 = (i245222 ^ i248222) + ((i248222 & i245222) << 1);
                        int i250222 = -(-KeyEvent.getDeadChar(0, 0));
                        int i251222 = (i250222 & 23) + (i250222 | 23);
                        Object[] objArr45222 = new Object[1];
                        delta((char) ((i235222 & 28265) + (i235222 | 28265)), i249222, i251222, objArr45222);
                        Object[] objArr46222 = {(String) objArr45222[0]};
                        D88714 = uH18377.D8871(-957097391);
                        if (D88714 == null) {
                        }
                        lowerCase = ((String) ((Method) D88714).invoke(null, objArr46222)).toLowerCase();
                        char c16222 = (char) (30622 - (~(-TextUtils.lastIndexOf("", '0'))));
                        int i252222 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i253222 = ((i252222 | 394) << 1) - (i252222 ^ 394);
                        int i254222 = -(-TextUtils.lastIndexOf("", '0', 0));
                        int i255222 = (i254222 & 5) + (i254222 | 5);
                        objArr3 = new Object[1];
                        delta(c16222, i253222, i255222, objArr3);
                        if (lowerCase.contains((String) objArr3[0])) {
                        }
                        int i257222 = (~(i25 & i234222)) & (i25 | i234222);
                        int i258222 = -i257222;
                        int i259222 = ((i257222 & i258222) | (i257222 ^ i258222)) >> 31;
                        int i260222 = i46 & (~i259222);
                        int i261222 = i234222 & i259222;
                        int i262222 = (i261222 & i260222) | (i260222 ^ i261222);
                        char combineMeasuredStates422 = (char) (27079 - View.combineMeasuredStates(0, 0));
                        int argb522 = 399 - Color.argb(0, 0, 0, 0);
                        int edgeSlop522 = ViewConfiguration.getEdgeSlop() >> 16;
                        int i263222 = (edgeSlop522 ^ 42) + ((edgeSlop522 & 42) << 1);
                        Object[] objArr48222 = new Object[1];
                        delta(combineMeasuredStates422, argb522, i263222, objArr48222);
                        String str20222 = (String) objArr48222[0];
                        char c17222 = (char) (38348 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))));
                        int i264222 = -TextUtils.getOffsetAfter("", 0);
                        int i265222 = i264222 * (-755);
                        int i266222 = (i265222 ^ (-332955)) + ((i265222 & (-332955)) << 1);
                        int i267222 = ~i264222;
                        int i268222 = ((~((i267222 ^ (-442)) | (i267222 & (-442)))) * 1512) + i266222;
                        int i269222 = ~(i267222 | (-442));
                        int i270222 = i264222 | 441;
                        int i271222 = ~((i270222 & i25) | (i270222 ^ i25));
                        int i272222 = (i268222 - (~(-(-(((i269222 & i271222) | (i269222 ^ i271222)) * (-756)))))) - 1;
                        int i273222 = (i264222 & 441) | (i264222 ^ 441);
                        int i274222 = ((i273222 & i122) | (i273222 ^ i122)) * 756;
                        int i275222 = ((i272222 | i274222) << 1) - (i274222 ^ i272222);
                        int i276222 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i277222 = (i276222 ^ 39) + ((i276222 & 39) << 1);
                        Object[] objArr49222 = new Object[1];
                        delta(c17222, i275222, i277222, objArr49222);
                        String str21222 = (String) objArr49222[0];
                        int i278222 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i279222 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Object[] objArr50222 = new Object[1];
                        delta((char) (((i278222 | 1) << 1) - (i278222 ^ 1)), ((i279222 | 481) << 1) - (i279222 ^ 481), 25 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr50222);
                        String str22222 = (String) objArr50222[0];
                        char c18222 = (char) (18993 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                        int i280222 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i281222 = (i280222 & 508) + (i280222 | 508);
                        int i282222 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i283222 = (i282222 ^ 27) + ((i282222 & 27) << 1);
                        Object[] objArr51222 = new Object[1];
                        delta(c18222, i281222, i283222, objArr51222);
                        String str23222 = (String) objArr51222[0];
                        int i284222 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i285222 = i284222 * 522;
                        int i286222 = (i285222 ^ (-29848000)) + ((i285222 & (-29848000)) << 1);
                        int i287222 = ~(i122 | 57400);
                        int i288222 = ((i287222 & i284222) | (i284222 ^ i287222)) * (-1042);
                        int i289222 = (((i25 ^ 57400) | (i25 & 57400)) * 521) + (i286222 ^ i288222) + ((i288222 & i286222) << 1);
                        int i290222 = ~((~i284222) | (-57401));
                        int i291222 = ~i284222;
                        int i292222 = ~((i291222 & i25) | (i291222 ^ i25));
                        int i293222 = (i290222 & i292222) | (i290222 ^ i292222);
                        int i294222 = ~i25;
                        int i295222 = (i284222 & i294222) | (i294222 ^ i284222);
                        int i296222 = ~((i295222 & 57400) | (i295222 ^ 57400));
                        int i297222 = -(-(((i296222 & i293222) | (i293222 ^ i296222)) * 521));
                        char c19222 = (char) ((i289222 ^ i297222) + ((i297222 & i289222) << 1));
                        int makeMeasureSpec3222 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i298222 = (makeMeasureSpec3222 ^ 535) + ((makeMeasureSpec3222 & 535) << 1);
                        int threadPriority2222 = Process.getThreadPriority(0);
                        Object[] objArr52222 = new Object[1];
                        delta(c19222, i298222, 27 - (((threadPriority2222 & 20) + (threadPriority2222 | 20)) >> 6), objArr52222);
                        String str24222 = (String) objArr52222[0];
                        int i299222 = -TextUtils.getTrimmedLength("");
                        int i300222 = 562 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        i47 = 0;
                        int capsMode2222 = TextUtils.getCapsMode("", 0, 0);
                        int i301222 = (capsMode2222 & 27) + (capsMode2222 | 27);
                        i48 = 1;
                        Object[] objArr53222 = new Object[1];
                        delta((char) (((i299222 | 32344) << 1) - (i299222 ^ 32344)), i300222, i301222, objArr53222);
                        String[] strArr12222 = {str20222, str21222, str22222, str23222, str24222, (String) objArr53222[0]};
                        i49 = 0;
                        i50 = i31;
                        while (true) {
                            if (i49 < i50) {
                            }
                            i49++;
                            d4 = d9;
                            i47 = 0;
                            i50 = 6;
                            i48 = 1;
                        }
                        int i305222 = (~(i25 & i262222)) & (i25 | i262222);
                        int i306222 = (i305222 | (-i305222)) >> 31;
                        int i307222 = i51 & (~i306222);
                        int i308222 = i262222 & i306222;
                        int i309222 = (i308222 & i307222) | (i307222 ^ i308222);
                        char c20222 = (char) (15796 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                        int i310222 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Object[] objArr56222 = new Object[1];
                        delta(c20222, ((i310222 | 349) << 1) - (i310222 ^ 349), 16 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), objArr56222);
                        String str27222 = (String) objArr56222[0];
                        int i311222 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int keyCodeFromString322 = 589 - KeyEvent.keyCodeFromString("");
                        int i312222 = -Color.rgb(0, 0, 0);
                        int i313222 = (i312222 & (-16777210)) + (i312222 | (-16777210));
                        Object[] objArr57222 = new Object[1];
                        delta((char) ((i311222 & 882) + (i311222 | 882)), keyCodeFromString322, i313222, objArr57222);
                        Object[] objArr58222 = {str27222, (String) objArr57222[0]};
                        D88715 = uH18377.D8871(1214576837);
                        if (D88715 == null) {
                        }
                        long longValue8222 = ((Long) ((Method) D88715).invoke(null, objArr58222)).longValue();
                        long j54222 = -219006220;
                        int i314222 = (int) Runtime.getRuntime().totalMemory();
                        long j55222 = HttpConstants.HTTP_PROXY_AUTH;
                        long j56222 = -406;
                        long j57222 = longValue8222 ^ j31;
                        long j58222 = i314222;
                        long j59222 = j58222 ^ j31;
                        long j60222 = ((HttpConstants.HTTP_NOT_ACCEPTABLE * ((((j54222 ^ j31) | j58222) ^ j31) | ((j59222 | longValue8222) ^ j31))) + ((j56222 * (((j57222 | j59222) | j54222) ^ j31)) + (((((j57222 | j58222) ^ j31) | (((j59222 | j54222) | longValue8222) ^ j31)) * j56222) + ((j55222 * longValue8222) + ((-405) * j54222))))) - 1328632118;
                        i52 = ((int) (j60222 >> 32)) & ((((~((-17056065) | i122)) | (~((-67179523) | i25))) * 210) + (((~(1403808713 | i122)) | (~(1453932171 | i25))) * 210) + 597506782);
                        foxtrot2 = ((int) j60222) & A0.z.foxtrot((~((-1934313034) | i122)) | 1860941526, 381, (((-285229066) | i25) * (-381)) - 87559792, 1298091365);
                        if (((foxtrot2 & i52) | (i52 ^ foxtrot2)) != 0) {
                        }
                        i53 = i54 | i55;
                        int i3212222 = i25 ^ i309222;
                        int i3222222 = (i3212222 | (-i3212222)) >> 31;
                        int i3232222 = i53 & (~i3222222);
                        int i3242222 = i3222222 & i309222;
                        i56 = (i3232222 & i3242222) | (i3232222 ^ i3242222);
                        if ((i26 & 8) == 0) {
                        }
                        int i3412222 = -((byte) KeyEvent.getModifierMetaStateMask());
                        int alpha52222 = W0.alpha();
                        int i3422222 = (i3412222 * 236) - (-1375791);
                        int i3432222 = ~i3412222;
                        int i3442222 = ~alpha52222;
                        int i3452222 = ~((i3432222 & i3442222) | (i3432222 ^ i3442222));
                        int i3462222 = -(-(((i3452222 & 2921) | (i3452222 ^ 2921)) * (-235)));
                        int i3472222 = (i3422222 ^ i3462222) + ((i3422222 & i3462222) << 1);
                        int i3482222 = ~i3412222;
                        int i3492222 = ~((i3482222 ^ alpha52222) | (i3482222 & alpha52222));
                        int i3502222 = ((i3492222 & 2921) | (i3492222 ^ 2921)) * (-470);
                        int i3512222 = (i3472222 & i3502222) + (i3502222 | i3472222);
                        int i3522222 = (i3482222 & 2921) | (i3482222 ^ 2921);
                        int i3532222 = ((~((i3412222 & (-2922)) | ((-2922) ^ i3412222))) | (~((alpha52222 & i3522222) | (i3522222 ^ alpha52222)))) * 235;
                        int i3542222 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 738;
                        int i3552222 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                        int i3562222 = ((i3552222 | 41) << 1) - (i3552222 ^ 41);
                        Object[] objArr682222 = new Object[1];
                        delta((char) ((i3512222 & i3532222) + (i3532222 | i3512222)), i3542222, i3562222, objArr682222);
                        String str322222 = (String) objArr682222[0];
                        char capsMode42222 = (char) TextUtils.getCapsMode("", 0, 0);
                        int i3572222 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i3582222 = (i3572222 ^ 780) + ((i3572222 & 780) << 1);
                        int i3592222 = -KeyEvent.keyCodeFromString("");
                        int i3602222 = (i3592222 & 30) + (i3592222 | 30);
                        Object[] objArr692222 = new Object[1];
                        delta(capsMode42222, i3582222, i3602222, objArr692222);
                        strArr = new String[]{str322222, (String) objArr692222[0]};
                        i57 = 0;
                        while (true) {
                            if (i57 >= 2) {
                            }
                            i57++;
                            i56 = i58;
                            strArr = strArr5;
                        }
                        int i3652222 = i25 ^ i58;
                        int i3662222 = -i3652222;
                        int i3672222 = ((i3652222 & i3662222) | (i3652222 ^ i3662222)) >> 31;
                        int i3682222 = i59 & (~i3672222);
                        int i3692222 = i58 & i3672222;
                        int i3702222 = (i3682222 & i3692222) | (i3682222 ^ i3692222);
                        D88716 = uH18377.D8871(-344556366);
                        if (D88716 == null) {
                        }
                        long longValue112222 = ((Long) ((Method) D88716).invoke(null, null)).longValue();
                        long j732222 = 1837943408;
                        long j742222 = -755;
                        long j752222 = ((j732222 ^ j31) | (longValue112222 ^ j31)) ^ j31;
                        long j762222 = (1512 * j752222) + (j742222 * longValue112222) + (j742222 * j732222);
                        long j772222 = j732222 | longValue112222;
                        long j782222 = ((756 * (j772222 | j392)) + (((-756) * (j752222 | ((j772222 | j6) ^ j31))) + j762222)) - 1990196506;
                        i60 = ((int) (j782222 >> 32)) & (((~(i122 | (-1237973241))) * 886) + (((-1237973241) | (~((-1619767645) | i122))) * (-1772)) + (((((~(1619767644 | i25)) | (-1774975485)) | (~((-1082765401) | i122))) * 886) - 1222979076));
                        i61 = ((int) j782222) & ((((~(1295229528 | i25)) | 4460801 | (~((-141996882) | i25))) * HttpConstants.HTTP_PROXY_AUTH) + (((~((-1295229529) | i25)) | (~(141996881 | i122)) | 4460801) * HttpConstants.HTTP_PROXY_AUTH) + (((1157693448 | r3) * (-814)) - 1345533451));
                        if (((i61 & i60) | (i60 ^ i61)) != 1) {
                        }
                        int i8422222 = -((i122 & i3702222) | ((~i3702222) & i25));
                        Object[] objArr1912222 = {new int[]{i3702222}, new int[]{i25}, new int[1], strArr2};
                        int i8432222 = ~((int) Runtime.getRuntime().totalMemory());
                        int i8442222 = -(-((((((~(r0 | 1047903798)) | (~(i8432222 | (-537920005)))) * 210) + ((((~(609327636 | i8432222)) | (~((-976496167) | r0))) * 210) - 1817097725)) - (~((((r4 & i8422222) | (r4 ^ i8422222)) >> 31) & 16))) - 1));
                        int i8452222 = (i27 ^ i8442222) + ((i27 & i8442222) << 1);
                        int i8462222 = (i8452222 << 13) ^ i8452222;
                        int i8472222 = i8462222 ^ (i8462222 >>> 17);
                        int i8482222 = i8472222 << 5;
                        ((int[]) objArr1912222[2])[0] = ((~i8472222) & i8482222) | ((~i8482222) & i8472222);
                        return objArr1912222;
                    }

                    @Nullable
                    public final Location hotel(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
                        Object obj;
                        Location location;
                        int i25 = silver;
                        teal = (((i25 | 109) << 1) - (i25 ^ 109)) % 128;
                        getAutofillType getautofilltype = (getAutofillType) g3.charlie(new Object[]{g3.this}, 213583762, C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), -213583761, C1203e1.Companion.bravo());
                        getautofilltype.getClass();
                        int i26 = getAutofillType.foxtrot + 5;
                        getAutofillType.golf = i26 % 128;
                        if (i26 % 2 != 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 68) {
                            ArrayList charlie = getautofilltype.charlie();
                            Iterator it = getAutofillType.echo.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (charlie.contains((String) obj)) {
                                        int i27 = (getAutofillType.golf + 53) % 128;
                                        getAutofillType.foxtrot = i27;
                                        getAutofillType.golf = (i27 + 9) % 128;
                                        break;
                                    }
                                } else {
                                    getAutofillType.golf = (getAutofillType.foxtrot + 89) % 128;
                                    obj = null;
                                    break;
                                }
                            }
                            String str = (String) obj;
                            int i28 = getAutofillType.golf;
                            if (str != null) {
                                int i29 = i28 + 107;
                                getAutofillType.foxtrot = i29 % 128;
                                if (i29 % 2 == 0) {
                                    location = getautofilltype.bravo(str);
                                } else {
                                    getautofilltype.bravo(str);
                                    throw null;
                                }
                            } else {
                                int i30 = (i28 & 99) + (i28 | 99);
                                getAutofillType.foxtrot = i30 % 128;
                                if (i30 % 2 == 0) {
                                    location = null;
                                } else {
                                    throw null;
                                }
                            }
                            getAutofillType.golf = (getAutofillType.foxtrot + 105) % 128;
                        } else {
                            location = (Location) getAutofillType.delta(new Object[]{getautofilltype}, ak.alpha(), -1371921480, ak.alpha(), 1371921485, ak.alpha(), ak.alpha());
                            getAutofillType.foxtrot = (getAutofillType.golf + 37) % 128;
                        }
                        safeWithTimeoutProContext.getClass();
                        SafeWithTimeoutProContext.alpha();
                        int i31 = ~W0.alpha();
                        int i32 = ~((i31 & (-1800249921)) | (i31 ^ (-1800249921)));
                        int i33 = (69227657 | i32) * (-970);
                        int i34 = (((-198217869) | i33) << 1) - (i33 ^ (-198217869));
                        int i35 = (i34 ^ 1396867072) + ((1396867072 & i34) << 1);
                        int i36 = -(-(((i32 & (-1869477578)) | ((-1869477578) ^ i32)) * 970));
                        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                        int alpha = W0.alpha();
                        int i38 = ~alpha;
                        int i39 = (-673237946) - (~(((~(((-1529742001) & i38) | ((-1529742001) ^ i38))) | (~(((-901312454) & alpha) | ((-901312454) ^ alpha)))) * 1900));
                        int i40 = ~((i38 ^ 901312453) | (i38 & 901312453));
                        int i41 = ~(1529742000 | alpha);
                        int i42 = ((i40 & i41) | (i40 ^ i41)) * (-950);
                        int i43 = ((i39 | i42) << 1) - (i39 ^ i42);
                        int i44 = -(-(((~(alpha | 901312453)) | (~((i38 & 1529742000) | (i38 ^ 1529742000)))) * 950));
                        if (i37 > (i43 ^ i44) + ((i44 & i43) << 1)) {
                            return location;
                        }
                        throw null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
                        int i25 = teal;
                        int i26 = (i25 ^ 47) + ((i25 & 47) << 1);
                        silver = i26 % 128;
                        SafeWithTimeoutProContext safeWithTimeoutProContext2 = safeWithTimeoutProContext;
                        if (i26 % 2 == 0) {
                            return hotel(safeWithTimeoutProContext2);
                        }
                        hotel(safeWithTimeoutProContext2);
                        throw null;
                    }
                }, 6, null};
                Boolean bool = Boolean.FALSE;
                Object echo2 = am.echo(-1815327613);
                if (echo2 == null) {
                    char alpha = (char) (40619 - Color.alpha(0));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                    int doubleTapTimeout = 222 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Class cls = Boolean.TYPE;
                    echo2 = am.charlie(alpha, keyRepeatDelay, doubleTapTimeout, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
                }
                Location location = (Location) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr2), null);
                int i25 = hotel + 103;
                golf = i25 % 128;
                if (i25 % 2 == 0) {
                    return location;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        g3 g3Var2 = (g3) objArr[0];
        int i26 = golf;
        hotel = (i26 + 45) % 128;
        getAutofillType getautofilltype = g3Var2.alpha;
        int i27 = (i26 ^ 69) + ((i26 & 69) << 1);
        hotel = i27 % 128;
        if (i27 % 2 != 0) {
            return getautofilltype;
        }
        throw null;
    }

    public final Location bravo(long j5) {
        try {
            Object[] objArr = {Long.valueOf(j5), r7, r7, new f3(this, j5), 6, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(-1815327613);
            if (echo2 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40619);
                int tapTimeout = 52 - (ViewConfiguration.getTapTimeout() >> 16);
                int resolveSizeAndState = 222 - View.resolveSizeAndState(0, 0, 0);
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(minimumFlingVelocity, tapTimeout, resolveSizeAndState, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
            }
            Location location = (Location) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr), null);
            int i4 = hotel + 17;
            golf = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return location;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final N14263A23323 delta() {
        Object m206constructorimpl;
        List charlie;
        J1 j12;
        Location location;
        long j5 = this.delta;
        hotel = (golf + 107) % 128;
        try {
            Result.Companion companion = Result.INSTANCE;
            charlie = this.bravo.charlie();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!charlie.isEmpty()) {
            hotel = (golf + 85) % 128;
            if (this.charlie) {
                long currentTimeMillis = System.currentTimeMillis();
                Location bravo = bravo(j5);
                if (bravo != null) {
                    j12 = new J1(bravo, this.charlie, charlie, this.delta, new C1233m(currentTimeMillis, System.currentTimeMillis()));
                } else {
                    long currentTimeMillis2 = (j5 + currentTimeMillis) - System.currentTimeMillis();
                    if (currentTimeMillis2 > 0) {
                        int i4 = golf;
                        int i5 = ((i4 | 27) << 1) - (i4 ^ 27);
                        hotel = i5 % 128;
                        if (i5 % 2 == 0) {
                            location = (Location) charlie(new Object[]{this, Long.valueOf(currentTimeMillis2)}, 634834186, C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), -634834186, C1203e1.Companion.bravo());
                            int i10 = 26 / 0;
                        } else {
                            location = (Location) charlie(new Object[]{this, Long.valueOf(currentTimeMillis2)}, 634834186, C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), -634834186, C1203e1.Companion.bravo());
                        }
                    } else {
                        int i11 = hotel;
                        golf = ((i11 ^ 103) + ((i11 & 103) << 1)) % 128;
                        location = null;
                    }
                    j12 = new J1(location, this.charlie, charlie, this.delta, new C1233m(currentTimeMillis, System.currentTimeMillis()));
                }
                m206constructorimpl = Result.m206constructorimpl(new component8(j12));
                return bk.D8871(bk.component5(m206constructorimpl));
            }
        }
        j12 = new J1(null, this.charlie, charlie, this.delta, new C1233m(0L, 0L));
        int i12 = hotel;
        golf = ((i12 ^ 43) + ((i12 & 43) << 1)) % 128;
        m206constructorimpl = Result.m206constructorimpl(new component8(j12));
        return bk.D8871(bk.component5(m206constructorimpl));
    }
}
