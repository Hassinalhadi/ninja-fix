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
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public interface bz {

    /* loaded from: classes3.dex */
    public static final class component5 {
        public static final char[] alpha;
        public static final long bravo;
        public static int charlie;
        public static int delta;
        public static final byte[] echo = null;
        public static int foxtrot;
        public static int golf;
        public static final byte[] hotel = null;
        public static final int india = 0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a alpha = new Lambda(0);

            public a() {
                super(0);
            }

            public final void alpha() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                alpha();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class b extends Lambda implements Function0<Unit> {
            public static final b alpha = new Lambda(0);

            public b() {
                super(0);
            }

            public final void alpha() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                alpha();
                return Unit.INSTANCE;
            }
        }

        static {
            echo();
            foxtrot = 0;
            golf = 1;
            delta();
            charlie = 0;
            delta = 1;
            char[] cArr = new char[2156];
            ByteBuffer.wrap("\u007f\n}\u0088zÒw\bt.r¯oül6i\tfRd\u0096aõ^![OYºV\u0086SÑP\u000eMbK½HâE\u0007B\u0010?Z=\u009c:ç7*gêehb2oèlÎjOw\u001ctÖqé~²|vy\u0015FÁC¯AKNkK%HùU¸SJP\u0001]ÊZà'¾%y\u000b_\tÝ\u000e\u0087\u0003]\u0000{\u0006ú\u001b©\u0018c\u001d\\\u0012\u0007\u0010Ã\u0015 *t/\u001a-ý\"Î'\u008e$J\u007f\n}\u009fzÎw\rt.r¥oül>i\u0018fXd\u009aa©^.[\u007fY·V\u0086SÓP\u0015MtK¦HÎE:B\u0002?^=\u0089:á7=4o\u007f\n}\u0089zÃw\u001dt.r¬oôlti\u001dfFd\u0090aöo\u008fm\fjFg\u0098d«b>\u007f\u007f|²yÆvÁt\bqlN¼!Ú#O$\u0003)Í*°,j1'2¥7ï8¢:b?9\u0000ï\u0005¥\u0007O\bS\r\u0011\u000eÍ\u007f\n}\u0088zÖw\nt`rço½l9i\u001dfAd\u0096aè^/[\u007feQg\u0085`\u009fm\u001anhh¡uávrs\u0019|W~\u009d{òD A\u007fC¹L»IÝJ\u001fWuQ\u0097Ró_0X\u0016%\u001d\u007fW}\u0083z\u0099w\u001ctnr§oçlti\u001ffQd\u009baô^&[yY¿V½SÛP\u0019MsK\u0091HõE6B\u0010?\u0018§\u0097¥\u0002¢S¯\u0090¬èª0·c´è±\u009c¾À¼\u0000¹4\u0086¸\u0083ä\u0081$\u008e\u0011\u008bJ\u0088Ï\u0095é\u0093<\u007fG}\u0085zÐw\u0010tnr°\u007f\n}\u009fzÎw\rtur\u00adoþlui\u000ff]d\u0091a©^'[uY¶V\u0097SãP1M*K HôE5B\u0016?\u0007=\u009e:ë7!4b2«/\u008f,Ç\u007f\n}\u009fzÎw\rtur\u00adoþlui\u000ff]d\u0091a©^'[uY¶V\u0097SãP1M*K¾HãE7B\u0013\u007f\n}\u009fzÎw\rtur\u00adoþlui\u0001f]d\u009da©^%[yY¹V\u008cSÐP\u0011MrK\u0098HÜE(B\u0011?E=\u008d:ª7<4y\u007f\n}\u0088zÒw\bt.r¦oöl7i\u0018fSd\u008aaã^:[d\u007fW}\u0083z\u0099w\u001cttr¡oÿl>iCf\\d\u0090aõ^=ÊúÈ8ÏgÂ¼ÁÕÇWÚLÙ\u008eÜ¨\u007f\n}\u009czÅw\u0011tbrçoõl3i\u0001fQd\u008caÿ^:[dY¾V\u008fSÆÄDÆ\u0086ÁÕÌ\u0004Ï}É¡\u007fW}\u0083z\u0099w\u000etsr§o÷l/i\u000ef@dÑaë^([~Y®V\u0084SÔP\u001fMsK»HãE=B\u0011s qëv»{e\u007fU}\u0089zÅw\rthr»oçlti\u001efMd\u008ca¨^+[tYõV\u0086SÐP\u001eMrK©H¿E?B\u0013?_=Ó:â7.4}2¼/¿,Ì)\u0002&p$\u0093!å\u001e;\u001b\u000f\u0018L\u0016\u0096\u0013È\u0010(\rf\u007fU}\u0089zÅw\rthr»oçlti\u001efMd\u008ca¨^+[tYõV\u0086SÐP\u001eMrK©H¿E?B\u0013?_=Ó:â7.4}2¼/¿,Ì)\u0002&p$\u0093!á\u001e;\u001b\u000f\u0018L\u0016\u009c\u0013È\u007fU}\u0089zÅw\rthr»oçlti\u001efMd\u008ca¨^+[tYõV\u0086SÐP\u001eMrK©H¿E*B\f?\u0004=\u009e:õ7&FªDvC:NòM\u0097KDV\u0018U\u008bPá_²]sXWgÔb\u008b`\noyj/iát\u008drVq@|Õ{ó\u0006û\u0004n\u0003\u001a\u000eÓhbj¾mò`:c_e\u008cxÐ{C~)qzs»v\u009fI\u001cLCNÂA±DçG)ZE\\\u009e_\u0088R\u001dU;(3*§-Ð \u001bïyí¥êéç!äDâ\u0097ÿËüXù2öaô ñ\u0084Î\u0007ËXÉÙÆªÃüÀ2Ý^Û\u0085Ø\u0093Õ\u0006Ò ¯(\u00ad¼ªÆ§\u0000\u007fS}\u008ezØw\u0006trr®ÈÑÊ\u0005\u007f\n}\u009czÅw\u0011tbrçoþl5i\tfAd\u0093aã^:\u000f+\rö\n \u0007~\u0004\u001e\u0002Å\u001f\u008e\u001cQ\u0019a\u007f\n}\u009fzÎw\rtur\u00adoþlui\u000bfFd\u009eaë^,[gY´V\u0090SÞPSMpK§HÿE<B\f?]=\u008e:©7<4o2ª/\u0094,Î)\u001f&Z$¿!ò\u001e,\u001b\u0017\u0018M\u0016\u0081\u0013\u0094\u0010'\ru\u000b\u00ad\u007f\n}\u009azÒw\u0010ter§oálui\u0001f]d\u009da°^}[?Y³V\u0095S\u009aP\u001dMrKªHøE7BM?Z=\u008f:í7\"4w2«/\u0099,\u0085)\u0005&l$¢!ó\u001e1\u001b\u0016\u0018[\u0016Ý\u0013É\u0010\"\u007f\n}\u009azÒw\u0010ter§oálui\u0001f]d\u009da°^}[?Y³V\u0095S\u009aP\u0014MpK\u00adHþE5B\u0013?E=\u008e:á7=482®/\u0089,Å)\u0016&j$»!ä\u001ep\u001b\u0012\u0018GèÏêZí\u000bàÈã°åhø;û°þÄñ\u0098óXöuÉ¸ÌúÎ}ÁKÄ\u001fÇÌÚ¦ÜTß5ÒôÕÂ¨\u0083ªg\u00ad( ä£§¥y¸W»\b¾Ö±£³l¶\u007f\u0089ø\u008cÔ\u008f\u009d\u0081\u0018\u0084\f\u0087ç\u007f\n}\u0089zÃw\u001dt.r¡oýl3i\u0019f\u001bd\u0096aè^ [dYõV\u0081SÙP\u0013MrKªHâE=B\u0011?\\=\u0094:ç7*482«/\u0083\u007fb}\u0089zÙw\u0007tlr§oçl3i\u0002fZÒÕÐ\u0007×YÚ\u0095Ùëß:Âx½\u0010¿Ò¸\u0093µG¶:°÷\u00ad°®a\u007fW}\u0083z\u0099w\u000etsr§o÷l/i\u000ef@dÑaâ^,[fY²V\u0081SÐ1ö3+4}9£:\u009c<[!F\u007fB}\u0089zÙw\u001btsr¡oð\u007fB}\u0089zÙw\u001btsr¡oðl\u0005i\u0015f\fdÉ\"\u00ad f'6*ô)\u009c/N2\u001f1ê4ú;ã9&<6\u0003\u0090\u0006Ë$Ý&\t!\u0013,\u0084/ù)-4}7¥2\u0084=Ê?[:a\u0005¬\u0000þ\u00024\r\u0004\u007fV}\u0088zÜ\u007f@}\u0081zÂw\u0012t`r¼oül(\u0097\u0081\u0095y\u0092\"\u009f»\u009c¶\u009aX\u0087\u0018\u0084Ë\u0081á\u008e¼\u008c\u007f\u0089C¶Ê³\u009a±L¾'»\u0013¸ñ¥\u0090£D \u0019\u00adØ\u007fd}\u0082zÓw\ftnr¡o÷lzi>fpd´a¦^+[eY²V\u008eSÁP\\MaK¡HãExB\u001b?\u0012=Ëz³xU\u007f\u0004rÛq¹wvj i\u00adléc§acdq[ü^²\\eSYV\u0016U\u008bH¶NvM4@¯GÌ:Å8\u001c?\f2®1õT\u001eVÊQÐ\\__)YóD¾GdBEM\u000fOÓ\u007fB}\u0083zÛw\u001atgr¡oàl2L\u0098NEI\u0013DÍGòA5\u007fW}\u008dzÙw\u001dtir½³Ø±\f¶\u0016»\u0081¸ü¾(£x  ¥\u0081ªÏ¨^\u00adk\u0092´\u0097þ\u0095:\u009a\t\u007fW}\u0083z\u0099w\u0015tdrºoýl?i\u0001f\u001ad\u008eaã^$[e\u007f\u0014\u007fW}\u0083z\u0099w\rtdr«oæl(i\b\u007f\u0015\u007fW}\u0083z\u0099w\u001cttr¡oÿl>iCfDd\u008daé^-[eY¸V\u0096ÚUØ\u008fßÍÒ\u0004ÑH×¦Ê½Éz\u007fW}\u0083z\u0099w\u001cttr¡oÿl>iCfRd\u0096aè^.[uY©V\u0092SÇP\u0015MiKº\u009f_\u009d\u0094\u009aÄ\u0097\u0006\u0094n\u0092¼\u008fí\u008ch\u0089\u0003\u0086M\u0084\u0089\u0081´¾3»h¹¨¶\u009a³Ú°\b\u00adyihk£lóa1bYd\u008byÚz/\u007f?p&rãw\u0083H\u0010M^O\u009a@\u0097EçFn[\u001b]Ë^ÜS\u0017T')e+¥,Ç!\u0006\"c$\u008b9ò:·È\u000eÊÅÍ\u0095ÀWÃ?ÅíØ¼Û9ÞFÑ\u0017ÓÜÖ\u00adéiì9îÈáÝä\u009dç[údüåÿ¸òzõJ\u0088\u0014\u008aØ\u008d«Ã&ÁíÆ½Ë\u007fÈ\u0017ÎÅÓ\u0094Ð\u0011Õ\u007fÚ2ØôÝ\u009aâ\u0015çBåÏê©ï§ìzñ\f÷ÒôÍù\nþw\u007fB}\u0083zØw\u0019tmr\u00ado¼l)i\tf_d aá^9[xY´V\u008cSÐP#M\u007fKöH§EwB\u0004?O=\u0093:á7=4\u007f2º/¿,Ó)J&3\u007fW}\u0083z\u0099w\u001ctnr§oçl6i\u0002fUd\u009baã^;a\u000bcßdÅi@j2lûq»row\\x\tzÄ\u007f¿@;E.GòH×M\u0085NDSuUôV¤[j\\X!\u0013#Ó$¨)a*#,ë1È\u007fd}\u0082zÓw\ftnr¡o÷lwi\u0015f\fdÉB\u0099@MGWJÒIºOoR1QðT\u008d[\u009eYX\\;c÷f²dtkUnUmÛp\u00ad\u007fQ}\u0089zÄw\nt,\u007fL}\u0082zÞw\nt/r»oål9iCfEd\u009aaë^<[=Y«V\u0090SÚP\fMtz\fxÑ\u007f\u0082rSqwwøj¼i,lXc\raÎd°[z^-\\úSÉÐÒÒ\u000fÕ\\Ø\u008dÛ©Ý=ÀsÃòÆ\u008dÉÓË\u0012Îeñ\u0090ôõö<ù\tüVÿ\u0088âàùeû¸üëñ:ò\u001eô\u008aéÄêEï0àfâªçèØ\u001cÝDß\u0084Ð ÕíÖ9ËOnül(k2f¾eÏc\u0011~V}\u0094xªw±u5pCO\u0086JÉH\u001fG BzAù\\ÝZ\u0000YWT\u0086S¬\u0015\u0096\u0017B\u0010X\u001dÝ\u001e¯\u0018f\u0005&\u0006µ\u0003Ý\f\u0090\u000eS\u000b24¦1°3l<G9+:Ó'§!b\"5\u007fW}\u0083z\u0099w\u0011ter¥o½l8i\u0018f]d\u0093aâ^g[vY²V\u008cSÒP\u0019MuK¾HãE1B\r?^¬û®/©5¤¢§ß¡\u000b¼[¿\u0083º¢µì·}²H\u008d\u0090\u0088Õ\u008a\u001b\u0085*\u00807\u0083¶\u009eÂ\u0098\f\u009bZ\u0096\u0091\u0091½ìöî#éAä\u008dçÎ\u007fW}\u0083z\u0099w\rtxr»oçl?i\u0000f\u001ad\u009daó^ [|Y¿VÌSÓP\u0015MiK©HôE*B\u0013?X=\u0094:ê7;\u007fW}\u0083z\u0099w\rtxr»oçl?i\u0000fkd\u009aaþ^=[>Y¹V\u0097SÜP\u0010McKàH÷E1B\r?M=\u0098:ö7?4d2°/\u008e,ßLúN.I4D¥GÉA\u000b\\Z_\u0098Z²U·W0R^m\u008dhÑj\u0012ea`~c¸~Äx\u0004{Yv\u0087q¾\fõ\u000e9\tG\u0004\u0096&\u0080$T#N.ß-³+q6 5â0È?¼=L8=\u0007õ\u0002ª\u0000\"\u000fW\n\u0017\tÂ\u0014¼\u0012}\u0011h\u001cé\u001bÝf\u0093dMc6nêm±k|v^u\u0012pÑ\u007f\r\u007f\t}ÌÅ\u000b\\\u001c\u007f\n}\u0088zÒw\bt.r¹oöl7i\u0018fkd\u008faï^9[u\u007f\n}\u0088zÒw\bt.r»oül9i\u0006fQd\u008ba©^+[qY¨V\u0087S×P\u001dMiKªHÎE?B\u0006?D=\u0084:à\u007f\n}\u0088zÒw\bt.r»oül9i\u0006fQd\u008ba©^.[uYµV\u009bSÑ\u008b\u009a\u0089\u0018\u008eB\u0083\u0098\u0080¾\u0086+\u009bl\u0098©\u009d\u0096\u0092Á\u0090\u001b\u00959ª¨¯å\u00ad&¢\u0007§A\u007f\n}\u009fzÎw\rt.r¹oöl7i\u0018fkd\u008baô^([sY¾\u007f\n}\u009fzÎw\rtur\u00adoþlui\u0001f]d\u009da©^%[yY¹V\u0081SêP\u0011MfK¢HýE7B\u0000?u=\u0099:á7-4c2¾/¿,Ú)\u0017&h$¹!¹\u001e-\u001b\u000e,3.±)ë$1'\u0017!\u0093<Ù?\u0017:\u000b5j7¶2Ì\u007f\n}\u0088zÒw\bt.rªoàl.i2f@d\u0096aë^,\u007f\n}\u0088zÒw\bt.r»oül9i\u0006fQd\u008ba©^+[cY¯V\u0084SÚP\u0010McK«HãE<Ö«Ô>ÓoÞ¬ÝÔÛ\fÆ_ÅÔÀ ÏüÍ<È\b÷\u0084òØð\u0018ÿ!úgù©äÀâ\u0000á\\ì\u009dë§\u0096ù\u0094\u0003\u0093O\u009e\u0080\u009dÞ\u009bV\u00862\u0085e\u0099^\u009bÜ\u009c\u0086\u0091\\\u0092z\u0094þ\u0089´\u008az\u008fX\u0080\u0003\u0082È\u0087·\u007f\n}\u0088zÒw\bt.rªoàl.i\nfMd\u008daéÖäÔfÓ<ÞæÝÀÛDÆ\u000eÅÀÀîÏ¿ÍvÈ\u0006\u0010\u008c\u0012\u000e\u0015T\u0018\u008e\u001b¨\u001d,\u0000f\u0003¨\u0006\u0084\tÀ\u000b\u0010\u000ee\u007f\n}\u0088zÒw\bt.rªoàl.i\u001bfYd\u008caá\u007f\n}\u0088zÒw\bt.rªoàl.i\u001dfSd\u009eaï^9[s\u007f\n}\u0088zÒw\bt.rªoàl.i2f]d\u0092aã\u007f\n}\u0088zÖw\nt`rço÷l5i\u001afZd\u0093aé^([tY¨VÍS\u009bP\u0004MeKáHóE+B\u0017?A\u007f\n}\u0081zÙw\nt.r¿oúl4i\tf[d\u0088aõ^f[RY¨V\u0096SæP\u0014MfK¼HôE<B%?E=\u0091:à7*4d\u007f\n}\u009czÅw\u0011tbrçoúl5i\u001df[d\u008daò^:\u007f\u0015}\u008azÑw^t;\u007f\n}\u009czÅw\u0011tbrçoàl?i\u0001fRdÐaë^([`Y¨»l¹°¾ø³<°C¶\u0089«Þ¨Z\u00ad$¢u ½¥Ì\u009a\u0001\u009fW\u009d\u0086\u0092¤\u0097µ\u0094!\u0089F»¡¹m¾=³Ñ°¥¶e«(¨í\u00adç¢¯ c¥@\u009aÒ\u009f\u0097á\u0019ã\u009aäÐé\u000eê=ì¶ñåò-÷\u0017øFú³ÿöÀ5ÅgÇ\u00adÈ\u0092ÍÕÎAÓlÕ°Öî µ¢r¥0¨é«\u0080\u00adN°\u0000³Ë¶ô¹µ\u007f\n}\u0089zÃw\u001dt.r¥oül/i\u0003f@d\u008c\u007f\n}\u0088zÖw\nt`rço÷l5i\u001afZd\u0093aé^([tY¨VÍS\u009bP\u0018MwKáHðE(B\u0013?Y=Ó:ü7\"4z\u007f\n}\u009czÅw\u0011tbrçoðl*i\u0018f]d\u0091aà^&\u007fb}\u0083zÛw\u001atgr¡oàl2\f8\u000eº\tä\u00048\u0007R\u0001Õ\u001cÌ\u001f\u0001\u001a,\u0015e\u0017â\u0012Ä-\t(M*\u008f%¹ ë#+>F8Ó;À6\u001f1#L7NÿI\u0099D\u001eGKA\u0086\\ü_ôZ)UTW\u008cRÊm\u001ah:kheµ`¦c\u0012~Cx\u0080{¡vòq/\u008cl".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
            alpha = cArr;
            bravo = -82588497401578004L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String alpha(int i4, short s3, int i5) {
            int i10;
            int i11;
            int i12 = (s3 * 4) + 1;
            int i13 = 3 - (i5 * 3);
            int i14 = i4 + 103;
            byte[] bArr = new byte[i12];
            byte[] bArr2 = hotel;
            if (bArr2 == null) {
                i14 = i12;
                byte[] bArr3 = bArr2;
                i11 = 0;
                int i15 = i13;
                i14 += i13;
                i13 = i15;
                bArr2 = bArr3;
                i10 = i11;
                i11 = i10 + 1;
                bArr[i10] = (byte) i14;
                int i16 = i13 + 1;
                if (i11 == i12) {
                    return new String(bArr, 0);
                }
                byte b2 = bArr2[i16];
                byte[] bArr4 = bArr2;
                i15 = i16;
                i13 = b2;
                bArr3 = bArr4;
                i14 += i13;
                i13 = i15;
                bArr2 = bArr3;
                i10 = i11;
                i11 = i10 + 1;
                bArr[i10] = (byte) i14;
                int i162 = i13 + 1;
                if (i11 == i12) {
                }
            } else {
                i10 = 0;
                i11 = i10 + 1;
                bArr[i10] = (byte) i14;
                int i1622 = i13 + 1;
                if (i11 == i12) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x02ca  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x02cb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void bravo(char c3, int i4, int i5, Object[] objArr) {
            int i10;
            Throwable cause;
            int i11;
            long j5;
            int i12;
            int i13 = 2;
            cy cyVar = new cy();
            long[] jArr = new long[i5];
            cyVar.component5 = 0;
            while (true) {
                int i14 = cyVar.component5;
                i10 = india;
                if (i14 >= i5) {
                    break;
                }
                int i15 = foxtrot + 43;
                golf = i15 % 128;
                int i16 = i15 % i13;
                long j6 = bravo;
                char[] cArr = alpha;
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                if (i16 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i4 >> i14])};
                        Object D8871 = uH18377.D8871(-31669226);
                        if (D8871 == null) {
                            i12 = 359345605;
                            j5 = 0;
                            byte b2 = (byte) (i10 & 11);
                            byte b4 = (byte) (b2 - 3);
                            i11 = i13;
                            D8871 = uH18377.setPivotYN16904(ExpandableListView.getPackedPositionChild(0L) + 53, TextUtils.getOffsetAfter("", 0) + 2123, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 564618947, false, alpha(b2, b4, b4), new Class[]{cls2});
                        } else {
                            i11 = i13;
                            j5 = 0;
                            i12 = 359345605;
                        }
                        Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                        l10.getClass();
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(c3);
                        objArr3[i11] = Long.valueOf(j6);
                        objArr3[1] = Long.valueOf(i14);
                        objArr3[0] = l10;
                        Object D88712 = uH18377.D8871(-897540670);
                        if (D88712 == null) {
                            int edgeSlop = 51 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int i17 = 2797 - (SystemClock.uptimeMillis() > j5 ? 1 : (SystemClock.uptimeMillis() == j5 ? 0 : -1));
                            char myTid = (char) ((Process.myTid() >> 22) + 32779);
                            byte b6 = (byte) 0;
                            byte b10 = b6;
                            String alpha2 = alpha(b6, b10, b10);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = cls;
                            clsArr[1] = cls;
                            clsArr[i11] = cls;
                            clsArr[3] = cls2;
                            D88712 = uH18377.setPivotYN16904(edgeSlop, i17, myTid, 356204311, false, alpha2, clsArr);
                        }
                        jArr[i14] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = new Object[i11];
                        objArr4[1] = cyVar;
                        objArr4[0] = cyVar;
                        Object D88713 = uH18377.D8871(i12);
                        if (D88713 == null) {
                            byte b11 = (byte) (i10 & 1);
                            byte b12 = (byte) (b11 - 1);
                            D88713 = uH18377.setPivotYN16904(51 - (ExpandableListView.getPackedPositionForChild(0, 0) > j5 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j5 ? 0 : -1)), 2175 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > j5 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j5 ? 0 : -1)), -892301552, false, alpha(b11, b12, b12), new Class[]{Object.class, Object.class});
                        }
                        ((Method) D88713).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause == null) {
                        }
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(cArr[i4 + i14])};
                    Object D88714 = uH18377.D8871(-31669226);
                    if (D88714 == null) {
                        byte b13 = (byte) (i10 & 11);
                        byte b14 = (byte) (b13 - 3);
                        D88714 = uH18377.setPivotYN16904(View.resolveSizeAndState(0, 0, 0) + 52, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2122, (char) (AndroidCharacter.getMirror('0') - '0'), 564618947, false, alpha(b13, b14, b14), new Class[]{cls2});
                    }
                    Long l11 = (Long) ((Method) D88714).invoke(null, objArr5);
                    l11.getClass();
                    Object[] objArr6 = {l11, Long.valueOf(i14), Long.valueOf(j6), Integer.valueOf(c3)};
                    Object D88715 = uH18377.D8871(-897540670);
                    if (D88715 == null) {
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        D88715 = uH18377.setPivotYN16904(51 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2796 - View.getDefaultSize(0, 0), (char) (32780 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 356204311, false, alpha(b15, b16, b16), new Class[]{cls, cls, cls, cls2});
                    }
                    jArr[i14] = ((Long) ((Method) D88715).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {cyVar, cyVar};
                    Object D88716 = uH18377.D8871(359345605);
                    if (D88716 == null) {
                        byte b17 = (byte) (i10 & 1);
                        byte b18 = (byte) (b17 - 1);
                        D88716 = uH18377.setPivotYN16904(53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 2175, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -892301552, false, alpha(b17, b18, b18), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88716).invoke(null, objArr7);
                }
                i13 = 2;
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            char[] cArr2 = new char[i5];
            cyVar.component5 = 0;
            foxtrot = (golf + 87) % 128;
            while (true) {
                int i18 = cyVar.component5;
                if (i18 < i5) {
                    golf = (foxtrot + 21) % 128;
                    cArr2[i18] = (char) jArr[i18];
                    Object[] objArr8 = {cyVar, cyVar};
                    Object D88717 = uH18377.D8871(359345605);
                    if (D88717 == null) {
                        byte b19 = (byte) (i10 & 1);
                        byte b20 = (byte) (b19 - 1);
                        D88717 = uH18377.setPivotYN16904((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 52, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2174, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -892301552, false, alpha(b19, b20, b20), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88717).invoke(null, objArr8);
                } else {
                    objArr[0] = new String(cArr2);
                    return;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void charlie(int i4, short s3, short s9, Object[] objArr) {
            int i5;
            int i10;
            int i11;
            int i12 = 7 - (i4 * 3);
            int i13 = s3 * 3;
            int i14 = s9 + 97;
            byte[] bArr = new byte[i13 + 1];
            byte[] bArr2 = echo;
            if (bArr2 == null) {
                int i15 = i14;
                i11 = 0;
                int i16 = i12;
                int i17 = i16 + (-i15) + 6;
                i5 = i12 + 1;
                i10 = i17;
                bArr[i11] = (byte) i10;
                if (i11 == i13) {
                    objArr[0] = new String(bArr, 0);
                    return;
                }
                i11++;
                i15 = bArr2[i5];
                int i18 = i5;
                i16 = i10;
                i12 = i18;
                int i172 = i16 + (-i15) + 6;
                i5 = i12 + 1;
                i10 = i172;
                bArr[i11] = (byte) i10;
                if (i11 == i13) {
                }
            } else {
                i5 = i12;
                i10 = i14;
                i11 = 0;
                bArr[i11] = (byte) i10;
                if (i11 == i13) {
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(31:155|(1:157)|158|159|(1:161)(1:323)|162|163|(1:165)|166|(6:168|169|(1:171)|172|173|(16:175|176|177|(1:179)|180|(1:182)(5:267|268|(1:270)|271|272)|183|(3:187|(1:(6:189|190|(1:192)(1:211)|193|194|(1:210)(3:196|(5:198|(1:200)|201|202|(1:207)(2:204|205))(1:209)|206))(2:212|213))|208)|214|(2:215|(4:217|(6:219|220|(1:222)(1:262)|223|224|(2:227|228)(1:226))|263|264)(2:265|266))|229|230|231|(5:235|236|(2:238|239)(1:254)|240|(6:242|243|244|(1:246)|247|248))|256|(6:258|243|244|(0)|247|248)(2:259|260)))(1:322)|273|(11:276|277|(1:279)(1:315)|280|281|(2:283|(2:285|(7:287|(4:289|(2:291|(2:293|(1:296)(1:295))(3:297|298|299))|300|301)|302|(1:304)(1:308)|305|306|307))(3:309|310|311))|312|313|314|307|274)|316|317|(1:319)(1:321)|320|176|177|(0)|180|(0)(0)|183|(4:185|187|(2:(0)(0)|206)|208)|214|(3:215|(0)(0)|264)|229|230|231|(6:233|235|236|(0)(0)|240|(0))|256|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:261:0x36f3, code lost:
        
            r2 = (~(r73 & 151)) & (r73 | 151);
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x12ea  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x12fc  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x151d  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x177c  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x18d8 A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x19be A[Catch: all -> 0x38f0, TRY_ENTER, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x2b02 A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x2b4a  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x2fcb  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x31d2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:217:0x34ae  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x36b4  */
        /* JADX WARN: Removed duplicated region for block: B:242:0x36d1  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x377c A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:254:0x36c6  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x36ef  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x36f1  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x3601 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:267:0x2b55  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x3879  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x18b9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:331:0x16e8  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x12f2  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x1405 A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:343:0x14e6  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x1508  */
        /* JADX WARN: Removed duplicated region for block: B:354:0x11f0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:356:0x1034  */
        /* JADX WARN: Removed duplicated region for block: B:357:0x0f6b  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0e6f A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0f62  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0fae A[Catch: all -> 0x38f0, TryCatch #0 {all -> 0x38f0, blocks: (B:6:0x017d, B:8:0x018a, B:9:0x01c9, B:19:0x0369, B:21:0x0377, B:22:0x03b0, B:29:0x04d9, B:31:0x04e6, B:32:0x051c, B:37:0x0730, B:39:0x0736, B:40:0x0772, B:42:0x08a1, B:44:0x08b0, B:45:0x08f1, B:52:0x0a72, B:54:0x0a80, B:55:0x0ac4, B:63:0x0d17, B:65:0x0d21, B:66:0x0d62, B:72:0x0e60, B:74:0x0e6f, B:75:0x0ead, B:80:0x0fa4, B:82:0x0fae, B:83:0x0ff0, B:91:0x1154, B:93:0x115e, B:94:0x11ab, B:123:0x15b8, B:125:0x15c5, B:126:0x160a, B:137:0x177e, B:139:0x178b, B:140:0x17ca, B:149:0x18d2, B:151:0x18d8, B:152:0x1913, B:155:0x19be, B:157:0x19d1, B:158:0x1a16, B:163:0x1aed, B:165:0x1af7, B:166:0x1b37, B:169:0x1b50, B:171:0x1b66, B:172:0x1bae, B:177:0x2af8, B:179:0x2b02, B:180:0x2b41, B:190:0x2fcd, B:192:0x2fda, B:193:0x3023, B:198:0x30dd, B:200:0x30ea, B:201:0x3122, B:220:0x34ce, B:222:0x34de, B:223:0x3537, B:244:0x376f, B:246:0x377c, B:247:0x37bb, B:268:0x2b56, B:270:0x2b6d, B:271:0x2bb1, B:277:0x2926, B:279:0x2930, B:280:0x297a, B:337:0x13f6, B:339:0x1405, B:340:0x1442, B:361:0x0bb2, B:363:0x0bc0, B:364:0x0c00, B:371:0x0613, B:373:0x061d, B:374:0x0660, B:383:0x06b9, B:385:0x06c3, B:386:0x0705), top: B:5:0x017d }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x1031  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x1152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] component5(Context context, int i4, int i5, int i10) {
            int i11;
            int i12;
            String str;
            char c3;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            Object D8871;
            long j5;
            int uptimeMillis;
            int i21;
            int i22;
            Object D88712;
            char c4;
            int i23;
            String[] strArr;
            int i24;
            int i25;
            String str2;
            File file;
            Object D88713;
            long j6;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            long j7;
            int i31;
            char c10;
            String[] strArr2;
            int i32;
            int i33;
            int i34;
            Object D88714;
            int foxtrot2;
            int i35;
            String[] strArr3;
            int i36;
            int i37;
            String[] strArr4;
            int i38;
            int i39;
            char c11;
            Object D88715;
            Object invoke;
            int i40;
            int i41;
            int i42;
            String[] strArr5;
            int i43;
            int i44;
            Object D88716;
            String str3;
            File file2;
            int i45;
            Scanner useDelimiter;
            String str4;
            int i46;
            String[] strArr6;
            String str5;
            char c12;
            int i47;
            String[] strArr7;
            int i48;
            int i49;
            int i50;
            String[] strArr8;
            String[] strArr9;
            int i51;
            String[] strArr10;
            Scanner useDelimiter2;
            String str6;
            String[] strArr11;
            int i52;
            int i53;
            int i54;
            String[] strArr12;
            int i55;
            int i56 = 0;
            int i57 = 1;
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i58 = -Color.green(0);
            Object[] objArr = new Object[1];
            bravo(pressedStateDuration, (i58 & 910) + (i58 | 910), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, objArr);
            String str7 = (String) objArr[0];
            int deadChar = KeyEvent.getDeadChar(0, 0);
            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
            int alpha2 = M2.alpha();
            int i59 = (maxKeyCode * 273) - 7317;
            int i60 = ~maxKeyCode;
            int i61 = (i60 ^ (-28)) | (i60 & (-28));
            int i62 = ~alpha2;
            int i63 = ~((i61 ^ i62) | (i61 & i62));
            int i64 = (maxKeyCode ^ 27) | (maxKeyCode & 27);
            int i65 = ~((i64 ^ alpha2) | (i64 & alpha2));
            int i66 = -(-(((i63 ^ i65) | (i65 & i63)) * (-272)));
            int i67 = ((i59 | i66) << 1) - (i66 ^ i59);
            int i68 = ~maxKeyCode;
            int i69 = ~((i68 & 27) | (i68 ^ 27));
            int i70 = ~(i60 | alpha2);
            int i71 = -(-(((i69 & i70) | (i69 ^ i70)) * (-272)));
            int i72 = (((~((maxKeyCode & alpha2) | (maxKeyCode ^ alpha2))) | 27) * 272) + (((i67 | i71) << 1) - (i71 ^ i67));
            Object[] objArr2 = new Object[1];
            bravo((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), deadChar, i72, objArr2);
            String str8 = (String) objArr2[0];
            char c13 = (char) (6367 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i73 = ((keyRepeatTimeout | 27) << 1) - (keyRepeatTimeout ^ 27);
            int i74 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i75 = (i74 & 26) + (i74 | 26);
            Object[] objArr3 = new Object[1];
            bravo(c13, i73, i75, objArr3);
            String str9 = (String) objArr3[0];
            String str10 = "";
            int i76 = -(-KeyEvent.keyCodeFromString(""));
            int i77 = -(-TextUtils.indexOf((CharSequence) "", '0'));
            int i78 = ((i77 | 53) << 1) - (i77 ^ 53);
            int i79 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr4 = new Object[1];
            bravo((char) (((i76 | 29781) << 1) - (i76 ^ 29781)), i78, (i79 & 18) + (i79 | 18), objArr4);
            String str11 = (String) objArr4[0];
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i80 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i81 = (i80 ^ 71) + ((i80 & 71) << 1);
            int i82 = -ImageFormat.getBitsPerPixel(0);
            int alpha3 = M2.alpha();
            int i83 = ~i82;
            int i84 = ((~((i83 ^ (-28)) | (i83 & (-28)))) * 1512) + ((i82 * (-755)) - 20385);
            int i85 = ~((i83 & (-28)) | (i83 ^ (-28)));
            int i86 = (i82 & 27) | (i82 ^ 27);
            int i87 = ~((i86 ^ alpha3) | (i86 & alpha3));
            int i88 = ~alpha3;
            int i89 = (((i88 & i86) | (i86 ^ i88)) * 756) + (((i85 ^ i87) | (i85 & i87)) * (-756)) + i84;
            Object[] objArr5 = new Object[1];
            bravo(scrollDefaultDelay, i81, i89, objArr5);
            String[] strArr13 = {str8, str9, str11, (String) objArr5[0]};
            int i90 = 0;
            while (true) {
                if (i90 >= 4) {
                    i11 = i56;
                    i12 = i57;
                    str = str10;
                    c3 = ' ';
                    i13 = i4;
                    break;
                }
                try {
                    Object[] objArr6 = new Object[i57];
                    objArr6[i56] = strArr13[i90];
                    Object D88717 = uH18377.D8871(1565484532);
                    if (D88717 == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                        int absoluteGravity = Gravity.getAbsoluteGravity(i56, i56) + 2951;
                        char mode = (char) View.MeasureSpec.getMode(i56);
                        byte b2 = (byte) i57;
                        byte b4 = b2;
                        c3 = ' ';
                        i11 = i56;
                        Object[] objArr7 = new Object[i57];
                        charlie(b2, b4, (byte) (b4 + 1), objArr7);
                        String str12 = (String) objArr7[i11];
                        Class[] clsArr = new Class[i57];
                        clsArr[i11] = String.class;
                        D88717 = uH18377.setPivotYN16904(keyRepeatDelay, absoluteGravity, mode, -2097887455, false, str12, clsArr);
                    } else {
                        i11 = i56;
                        c3 = ' ';
                    }
                    long longValue = ((Long) ((Method) D88717).invoke(null, objArr6)).longValue();
                    long j10 = -1074281783;
                    str = str10;
                    long j11 = 520;
                    int i91 = i57;
                    int i92 = i90;
                    long j12 = -1;
                    long j13 = j10 ^ j12;
                    long j14 = longValue ^ j12;
                    i12 = i91;
                    long j15 = i4;
                    long j16 = j15 ^ j12;
                    long j17 = (((((j13 | j14) | j16) ^ j12) | ((longValue | j15) ^ j12)) * j11) + (521 * longValue) + ((-519) * j10);
                    long j18 = (j15 | j10) ^ j12;
                    long j19 = (j11 * (j18 | ((j13 | j16) ^ j12) | ((j14 | j10) ^ j12))) + ((-1040) * (((j14 | j16) ^ j12) | j18)) + j17 + 2029435685;
                    int foxtrot3 = ((int) (j19 >> c3)) & A0.z.foxtrot((~(((int) SystemClock.elapsedRealtime()) | 376781234)) | (-1064647675), 220, (((-1060445177) | r3) * (-220)) - 751363178, -1181828148);
                    int i93 = ~i4;
                    int i94 = ((int) j19) & ((((~((-22095109) | i93)) | 1074036753) * 241) + (((~(1244584027 | i93)) | (-1266679136)) * (-241)) + 1385927412);
                    if (((foxtrot3 & i94) | (foxtrot3 ^ i94)) != 0) {
                        int i95 = (i92 ^ 190) + ((i92 & 190) << 1);
                        i13 = (i95 & i93) | ((~i95) & i4);
                        break;
                    }
                    i90 = i92 + 1;
                    str10 = str;
                    i57 = i12;
                    i56 = i11;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
            char c14 = (char) (((modifierMetaStateMask | 1) << 1) - (modifierMetaStateMask ^ 1));
            int i96 = 97 - (~(-KeyEvent.keyCodeFromString(str)));
            int i97 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr8 = new Object[i12];
            bravo(c14, i96, ((i97 | 12) << 1) - (i97 ^ 12), objArr8);
            String str13 = (String) objArr8[i11];
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
            int i98 = ~packedPositionGroup;
            int i99 = (((i98 ^ 4229) | (i98 & 4229)) * (-1434)) + ((packedPositionGroup * (-716)) - (-6068615));
            int i100 = ~i4;
            int i101 = ~(i100 | 4229);
            int i102 = ~((packedPositionGroup ^ 4229) | (packedPositionGroup & 4229));
            int i103 = (i101 & i102) | (i101 ^ i102);
            int i104 = ~((i98 & (-4230)) | (i98 ^ (-4230)) | i4);
            int i105 = (((i103 & i104) | (i103 ^ i104)) * 717) + i99;
            int i106 = ~packedPositionGroup;
            int i107 = (i106 & (-4230)) | (i106 ^ (-4230));
            int i108 = ~i4;
            int i109 = ~((i107 & i108) | (i107 ^ i108));
            int i110 = (i109 & i102) | (i109 ^ i102);
            int i111 = ~(i4 | 4229);
            char c15 = (char) ((i105 - (~(-(-(((i110 & i111) | (i110 ^ i111)) * 717))))) - 1);
            int i112 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr9 = new Object[1];
            bravo(c15, (i112 ^ 109) + ((i112 & 109) << 1), TextUtils.lastIndexOf(str, '0') + 14, objArr9);
            String str14 = (String) objArr9[i11];
            int i113 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i114 = -Color.red(i11);
            int i115 = (i114 ^ 123) + ((i114 & 123) << 1);
            int i116 = i11;
            Object[] objArr10 = new Object[1];
            bravo((char) ((i113 & 24271) + (i113 | 24271)), i115, Color.argb(i116, i116, i116, i116) + 18, objArr10);
            String[] strArr14 = {str13, str14, (String) objArr10[i116]};
            int i117 = 0;
            while (true) {
                if (i117 >= 3) {
                    i14 = i108;
                    i15 = i4;
                    break;
                }
                delta = (charlie + 93) % 128;
                Object[] objArr11 = {strArr14[i117]};
                Object D88718 = uH18377.D8871(1979478258);
                if (D88718 == null) {
                    int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 52;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2951;
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b6 = (byte) 0;
                    byte b10 = b6;
                    Object[] objArr12 = new Object[1];
                    charlie(b6, b10, b10, objArr12);
                    D88718 = uH18377.setPivotYN16904(combineMeasuredStates, tapTimeout, jumpTapTimeout, -1438133721, false, (String) objArr12[0], new Class[]{String.class});
                }
                long longValue2 = ((Long) ((Method) D88718).invoke(null, objArr11)).longValue();
                long j20 = 601311055;
                String[] strArr15 = strArr14;
                i14 = i108;
                long j21 = -575;
                long j22 = (j21 * longValue2) + (j21 * j20);
                long j23 = 576;
                long j24 = -1;
                long j25 = j20 ^ j24;
                long j26 = longValue2 ^ j24;
                long j27 = (j25 | j26) ^ j24;
                long freeMemory = (int) Runtime.getRuntime().freeMemory();
                long j28 = (j23 * j27) + (j23 * ((((j26 | (freeMemory ^ j24)) | j20) ^ j24) | ((j25 | longValue2) ^ j24))) + ((j27 | ((j26 | freeMemory) ^ j24)) * j23) + j22 + 173510251;
                int i118 = ~((-595647449) | i4);
                int foxtrot4 = ((int) (j28 >> c3)) & A0.z.foxtrot(i118 | 41994840, 220, (((-2032873860) | i118) * (-220)) + 62691362, 169954424);
                int i119 = (~((-776475801) | i4)) | (~(2081265085 | i14));
                int i120 = ((int) j28) & (((1342538021 | (~(776475800 | i14))) * 516) + (((~((-738727065) | i4)) | (~((-1342538022) | i14))) * 516) + (((i119 | r6) * (-516)) - 398631999));
                if (((i120 & foxtrot4) | (foxtrot4 ^ i120)) != 0) {
                    i15 = i4 ^ (i117 + 270);
                    delta = (charlie + 1) % 128;
                    break;
                }
                int i121 = (i117 & 104) + (i117 | 104);
                i117 = (i121 ^ (-103)) + ((i121 & (-103)) << 1);
                i108 = i14;
                strArr14 = strArr15;
            }
            int i122 = i4 ^ i13;
            int i123 = (i122 | (-i122)) >> 31;
            int i124 = (i13 & i123) | (i15 & (~i123));
            char indexOf = (char) TextUtils.indexOf(str, str);
            int i125 = -View.MeasureSpec.getMode(0);
            int i126 = (i125 ^ ModuleDescriptor.MODULE_VERSION) + ((i125 & ModuleDescriptor.MODULE_VERSION) << 1);
            int i127 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i128 = i127 * (-115);
            int i129 = (((i127 ^ i4) | (i127 & i4)) * 116) + ((~((i14 ^ i127) | (i14 & i127) | 13)) * (-116)) + (i128 & (-1495)) + (i128 | (-1495));
            int i130 = ~((~i127) | (-14));
            int i131 = ~(((-14) & i4) | ((-14) ^ i4));
            int i132 = ((i130 & i131) | (i130 ^ i131)) * 116;
            int i133 = ((i129 | i132) << 1) - (i132 ^ i129);
            Object[] objArr13 = new Object[1];
            bravo(indexOf, i126, i133, objArr13);
            Object[] objArr14 = {(String) objArr13[0]};
            Object D88719 = uH18377.D8871(-2104138125);
            if (D88719 == null) {
                int mode2 = View.MeasureSpec.getMode(0) + 52;
                int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2951;
                char gidForName = (char) (Process.getGidForName(str) + 1);
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr15 = new Object[1];
                charlie(b11, b12, (byte) (b12 + 1), objArr15);
                D88719 = uH18377.setPivotYN16904(mode2, combineMeasuredStates2, gidForName, 1563346086, false, (String) objArr15[0], new Class[]{String.class});
            }
            long longValue3 = ((Long) ((Method) D88719).invoke(null, objArr14)).longValue();
            long j29 = 687200968;
            long j30 = 614;
            long elapsedCpuTime = (int) Process.getElapsedCpuTime();
            long j31 = -1;
            long j32 = j29 ^ j31;
            long j33 = (j32 | longValue3) ^ j31;
            long j34 = longValue3 ^ j31;
            long j35 = elapsedCpuTime ^ j31;
            long j36 = ((j30 * ((((j32 | j34) | j35) ^ j31) | (((j35 | j29) | longValue3) ^ j31))) + (((-1228) * ((((j32 | j35) ^ j31) | j33) | ((j35 | longValue3) ^ j31))) + ((((elapsedCpuTime | j33) | ((j34 | j29) ^ j31)) * j30) + (((-613) * longValue3) + (615 * j29))))) - 1916821498;
            int i134 = ~((-116477467) | i14);
            int i135 = ((int) (j36 >> c3)) & (((i134 | (-1553703878)) * 712) + (((~((-76612097) | i14)) | (~((-39865371) | i4))) * (-712)) + ((76612096 | i134) * (-712)) + 900402346);
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            int i136 = ~maxMemory;
            int i137 = (~(647330531 | i136)) | (-798358248);
            int i138 = ((int) j36) & ((((~(maxMemory | (-638868163))) | (~(i136 | (-151027717)))) * 252) + (((i137 | r6) * (-252)) - 760041995));
            if (((i135 & i138) | (i135 ^ i138)) != 0) {
                i16 = -957097391;
                i17 = (~(i4 & 266)) & (i4 | 266);
            } else {
                char keyCodeFromString = (char) (6662 - KeyEvent.keyCodeFromString(str));
                int i139 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i140 = (i139 ^ 156) + ((i139 & 156) << 1);
                int i141 = -KeyEvent.normalizeMetaState(0);
                int i142 = (i141 & 24) + (i141 | 24);
                Object[] objArr16 = new Object[1];
                bravo(keyCodeFromString, i140, i142, objArr16);
                Object[] objArr17 = {(String) objArr16[0]};
                Object D887110 = uH18377.D8871(-957097391);
                if (D887110 == null) {
                    int combineMeasuredStates3 = 52 - View.combineMeasuredStates(0, 0);
                    int i143 = 3159 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 58075);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    i16 = -957097391;
                    Object[] objArr18 = new Object[1];
                    charlie(b13, b14, (byte) (b14 + 2), objArr18);
                    D887110 = uH18377.setPivotYN16904(combineMeasuredStates3, i143, packedPositionChild, 424179844, false, (String) objArr18[0], new Class[]{String.class});
                } else {
                    i16 = -957097391;
                }
                String str15 = (String) ((Method) D887110).invoke(null, objArr17);
                if (str15 == null || str15.isEmpty()) {
                    char myPid = (char) (Process.myPid() >> 22);
                    int i144 = -(-(Process.myPid() >> 22));
                    int i145 = ((i144 | 179) << 1) - (i144 ^ 179);
                    int i146 = -(-ImageFormat.getBitsPerPixel(0));
                    int i147 = (i146 & 25) + (i146 | 25);
                    Object[] objArr19 = new Object[1];
                    bravo(myPid, i145, i147, objArr19);
                    Object[] objArr20 = {(String) objArr19[0]};
                    Object D887111 = uH18377.D8871(i16);
                    if (D887111 == null) {
                        int argb = 52 - Color.argb(0, 0, 0, 0);
                        int edgeSlop = 3158 - (ViewConfiguration.getEdgeSlop() >> 16);
                        char c16 = (char) (58074 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr21 = new Object[1];
                        charlie(b15, b16, (byte) (b16 + 2), objArr21);
                        D887111 = uH18377.setPivotYN16904(argb, edgeSlop, c16, 424179844, false, (String) objArr21[0], new Class[]{String.class});
                    }
                    String str16 = (String) ((Method) D887111).invoke(null, objArr20);
                    if (str16 != null) {
                        M2.alpha();
                        if (!str16.isEmpty()) {
                            i17 = i4 ^ 267;
                        }
                    }
                    i17 = i4;
                } else {
                    int i148 = delta;
                    int i149 = ((i148 | 79) << 1) - (i148 ^ 79);
                    charlie = i149 % 128;
                    i17 = i149 % 2 != 0 ? i4 ^ 11990 : (~(i4 & 267)) & (i4 | 267);
                }
            }
            int i150 = i4 ^ i124;
            int i151 = -i150;
            int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
            int i153 = i17 & (~i152);
            int i154 = i124 & i152;
            int i155 = (i154 & i153) | (i153 ^ i154);
            Object D887112 = uH18377.D8871(1074526551);
            if (D887112 == null) {
                int size = View.MeasureSpec.getSize(0) + 51;
                int keyCodeFromString2 = 1055 - KeyEvent.keyCodeFromString(str);
                char c17 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte b17 = (byte) 1;
                byte b18 = b17;
                Object[] objArr22 = new Object[1];
                charlie(b17, b18, (byte) (b18 + 1), objArr22);
                D887112 = uH18377.setPivotYN16904(size, keyCodeFromString2, c17, -1615832190, false, (String) objArr22[0], new Class[0]);
            }
            long longValue4 = ((Long) ((Method) D887112).invoke(null, null)).longValue();
            long j37 = -126804361;
            long j38 = ((-747) * longValue4) + (375 * j37);
            long j39 = j37 ^ j31;
            long uptimeMillis2 = ((((int) SystemClock.uptimeMillis()) ^ j31) | j37) ^ j31;
            long j40 = ((j39 | longValue4) ^ j31) | uptimeMillis2;
            long j41 = longValue4 ^ j31;
            long j42 = (374 * (((j39 | j41) ^ j31) | uptimeMillis2)) + (748 * ((j41 | j37) ^ j31)) + (j40 * (-374)) + j38 + 306370078;
            int i156 = ((int) (j42 >> c3)) & (((~(2133826111 | i4)) * 345) + (((~(2133201461 | i14)) | 1409286688) * 345) + ((((~(2133201461 | i4)) | (-2133826112)) * 345) - 484646000));
            int foxtrot5 = ((int) j42) & A0.z.foxtrot((~((-34603282) | i14)) | 671192128, 576, (((~(1036907628 | i4)) | (-1071510910)) * 576) + 1771465493, 1285006464);
            int i157 = (foxtrot5 & i156) | (i156 ^ foxtrot5);
            int i158 = (((i157 ^ (-1)) + (i157 << 1)) + 200) ^ i4;
            int i159 = -i157;
            int i160 = ((i157 & i159) | (i157 ^ i159)) >> 31;
            int i161 = (i160 & i158) | ((~i160) & i4);
            int i162 = i4 ^ i155;
            int i163 = (i162 | (-i162)) >> 31;
            int i164 = i161 & (~i163);
            int i165 = i163 & i155;
            int i166 = (i164 & i165) | (i164 ^ i165);
            int i167 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i168 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i169 = (i168 ^ 203) + ((i168 & 203) << 1);
            int i170 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i171 = (i170 ^ 19) + ((i170 & 19) << 1);
            Object[] objArr23 = new Object[1];
            bravo((char) ((i167 ^ 55453) + ((i167 & 55453) << 1)), i169, i171, objArr23);
            String str17 = (String) objArr23[0];
            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i172 = -View.resolveSize(0, 0);
            int i173 = ((i172 | 223) << 1) - (i172 ^ 223);
            int i174 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i175 = ((i174 | 5) << 1) - (i174 ^ 5);
            Object[] objArr24 = new Object[1];
            bravo(packedPositionGroup2, i173, i175, objArr24);
            Object[] objArr25 = {str17, (String) objArr24[0]};
            Object D887113 = uH18377.D8871(1214576837);
            if (D887113 == null) {
                int i176 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i177 = 3315 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b19 = (byte) 1;
                byte b20 = b19;
                Object[] objArr26 = new Object[1];
                charlie(b19, b20, (byte) (b20 + 1), objArr26);
                D887113 = uH18377.setPivotYN16904(i176, i177, longPressTimeout, -1746970096, false, (String) objArr26[0], new Class[]{String.class, String.class});
            }
            long longValue5 = ((Long) ((Method) D887113).invoke(null, objArr25)).longValue();
            long j43 = -534178723;
            long j44 = HttpConstants.HTTP_UNAVAILABLE;
            long j45 = (j44 * longValue5) + (j44 * j43);
            long j46 = -502;
            long j47 = j43 | longValue5;
            long j48 = (j46 * j47) + j45;
            long j49 = j43 ^ j31;
            long j50 = (j49 | (longValue5 ^ j31)) ^ j31;
            long j51 = i4;
            long j52 = j51 ^ j31;
            long j53 = j49 | j52;
            long j54 = (j47 | j51) ^ j31;
            long j55 = ((HttpConstants.HTTP_BAD_GATEWAY * (((j53 | longValue5) ^ j31) | j54)) + ((((j50 | (j53 ^ j31)) | j54) * j46) + j48)) - 1013459615;
            int i178 = ((int) (j55 >> c3)) & ((((~((-466950304) | i14)) | (~(1003830687 | i4))) * 338) + ((((536880384 | r10) | (~(466950303 | i4))) * (-338)) - 1780797526));
            int foxtrot6 = ((int) j55) & A0.z.foxtrot((-1454645825) | i14, -828, (((~((-1454645825) | i14)) | 17419414) * (-828)) - 1754753727, 1855899392);
            int i179 = (foxtrot6 & i178) | (i178 ^ foxtrot6);
            int i180 = -i179;
            int i181 = ((i179 & i180) | (i179 ^ i180)) >> 31;
            int i182 = (i181 & ((i4 & (-263)) | (i14 & 262))) | ((~i181) & i4);
            int i183 = ((~i166) & i4) | (i166 & i14);
            int i184 = -i183;
            int i185 = ((i183 & i184) | (i183 ^ i184)) >> 31;
            int i186 = i182 & (~i185);
            int i187 = i166 & i185;
            int i188 = (i187 & i186) | (i186 ^ i187);
            int i189 = -(-MotionEvent.axisFromString(str));
            int i190 = -TextUtils.indexOf(str, str, 0);
            int i191 = ((i190 | 229) << 1) - (i190 ^ 229);
            int i192 = -KeyEvent.getDeadChar(0, 0);
            int i193 = (i192 & 31) + (i192 | 31);
            Object[] objArr27 = new Object[1];
            bravo((char) (((i189 | 1) << 1) - (i189 ^ 1)), i191, i193, objArr27);
            String str18 = (String) objArr27[0];
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i194 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            int i195 = ((i194 | 260) << 1) - (i194 ^ 260);
            int i196 = -(-View.getDefaultSize(0, 0));
            Object[] objArr28 = new Object[1];
            bravo(keyRepeatTimeout2, i195, (i196 & 23) + (i196 | 23), objArr28);
            String str19 = (String) objArr28[0];
            char c18 = (char) ((-2) - (~(-TextUtils.lastIndexOf(str, '0'))));
            int i197 = -(-Color.green(0));
            Object[] objArr29 = new Object[1];
            bravo(c18, ((i197 | 283) << 1) - (i197 ^ 283), 28 - Color.argb(0, 0, 0, 0), objArr29);
            String str20 = (String) objArr29[0];
            char myPid2 = (char) (Process.myPid() >> 22);
            int indexOf2 = TextUtils.indexOf((CharSequence) str, '0', 0, 0);
            int i198 = (indexOf2 & 312) + (indexOf2 | 312);
            int i199 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i200 = (i199 & 13) + (i199 | 13);
            Object[] objArr30 = new Object[1];
            bravo(myPid2, i198, i200, objArr30);
            String[] strArr16 = {str18, str19, str20, (String) objArr30[0]};
            int i201 = 0;
            while (i201 < 4) {
                int i202 = charlie;
                int i203 = (i202 & 15) + (i202 | 15);
                delta = i203 % 128;
                if (i203 % 2 == 0) {
                    Object[] objArr31 = {strArr16[i201]};
                    Object D887114 = uH18377.D8871(1565484532);
                    if (D887114 == null) {
                        int i204 = 52 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int red = 2951 - Color.red(0);
                        char offsetAfter = (char) TextUtils.getOffsetAfter(str, 0);
                        byte b21 = (byte) 1;
                        byte b22 = b21;
                        i18 = i188;
                        strArr12 = strArr16;
                        Object[] objArr32 = new Object[1];
                        charlie(b21, b22, (byte) (b22 + 1), objArr32);
                        D887114 = uH18377.setPivotYN16904(i204, red, offsetAfter, -2097887455, false, (String) objArr32[0], new Class[]{String.class});
                    } else {
                        i18 = i188;
                        strArr12 = strArr16;
                    }
                    long longValue6 = ((Long) ((Method) D887114).invoke(null, objArr31)).longValue();
                    i55 = i201;
                    long j56 = -543496643;
                    long j57 = j56 ^ j31;
                    long myPid3 = Process.myPid();
                    long j58 = myPid3 ^ j31;
                    long j59 = ((-1808) * (((j57 | myPid3) ^ j31) | ((j58 | longValue6) ^ j31))) + ((-903) * longValue6) + (905 * j56);
                    long j60 = 904;
                    long j61 = longValue6 ^ j31;
                    long j62 = j58 | j56;
                    long j63 = (j60 * (((j57 | longValue6) ^ j31) | ((j61 | myPid3) ^ j31) | (j62 ^ j31))) + (((((j57 | j61) | myPid3) ^ j31) | ((j62 | longValue6) ^ j31)) * j60) + j59 + 1498650545;
                    int i205 = ((int) (j63 >> 55)) & ((((~(i14 | (-2094859889))) | (~((-762880997) | i4))) * 950) + (((~((-2094859889) | i4)) | (~(i14 | (-762880997)))) * (-950)) + (((~(2094859888 | i14)) | (~(762880996 | i4))) * 1900) + 1871737038);
                    int i206 = ((int) j63) & ((((~((-212702678) | i14)) | (~((-1224523733) | i14)) | (~(1291698133 | i4))) * Smooth$Close.expectedVersionCode) + (((~(212702677 | i4)) | (~(1224523732 | i4)) | (~((-145528277) | i14))) * (-568)) + (((((~(212702677 | i14)) | (-1291698134)) | (~(1224523732 | i14))) * (-1136)) - 1738041619));
                    if (((i206 & i205) | (i205 ^ i206)) != 0) {
                        int i207 = i55 + 252;
                        i19 = (~(i4 & i207)) & (i4 | i207);
                        break;
                    }
                    i201 = (i55 | 1) + (i55 & 1);
                    i188 = i18;
                    strArr16 = strArr12;
                } else {
                    i18 = i188;
                    strArr12 = strArr16;
                    i55 = i201;
                    Object[] objArr33 = {strArr12[i55]};
                    Object D887115 = uH18377.D8871(1565484532);
                    if (D887115 == null) {
                        int i208 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                        int resolveSize = 2951 - View.resolveSize(0, 0);
                        char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(str, '0'));
                        byte b23 = (byte) 1;
                        byte b24 = b23;
                        Object[] objArr34 = new Object[1];
                        charlie(b23, b24, (byte) (b24 + 1), objArr34);
                        D887115 = uH18377.setPivotYN16904(i208, resolveSize, lastIndexOf, -2097887455, false, (String) objArr34[0], new Class[]{String.class});
                    }
                    long longValue7 = ((Long) ((Method) D887115).invoke(null, objArr33)).longValue();
                    long j64 = -798548387;
                    long j65 = longValue7 ^ j31;
                    long j66 = (j64 | j51) ^ j31;
                    long j67 = HttpConstants.HTTP_PROXY_AUTH;
                    long j68 = j64 ^ j31;
                    long j69 = (j68 | longValue7) ^ j31;
                    long j70 = (j67 * (j69 | ((j68 | j51) ^ j31) | ((longValue7 | j51) ^ j31))) + ((((j65 | j52) ^ j31) | j69 | j66) * j67) + ((-814) * (((j65 | j64) ^ j31) | j66)) + (HttpConstants.HTTP_CLIENT_TIMEOUT * longValue7) + ((-813) * j64) + 1753702289;
                    int tango = ao.ad.tango(2135747770);
                    int i209 = ~tango;
                    if (((((int) j70) & ((((~((-1026354689) | i14)) | 268714496) * 52) + (((~(1026354688 | i14)) | (~((-1831386198) | i14)) | 1073746005) * (-52)) + ((~(2100100693 | i14)) * 52) + 1769706393)) | (((int) (j70 >> c3)) & ((((~(tango | (-72419747))) | (~(i209 | 1322469883)) | 285220864) * 168) + ((~(1607690747 | tango)) * 168) + (((~(1535271001 | i209)) | (-1607690748)) * 168) + 501358106))) != 0) {
                        int i2072 = i55 + 252;
                        i19 = (~(i4 & i2072)) & (i4 | i2072);
                        break;
                    }
                    i201 = (i55 | 1) + (i55 & 1);
                    i188 = i18;
                    strArr16 = strArr12;
                }
            }
            i18 = i188;
            i19 = i4;
            int i210 = (~(i4 & i18)) & (i4 | i18);
            int i211 = -i210;
            int i212 = ((i210 & i211) | (i210 ^ i211)) >> 31;
            int i213 = (i19 & (~i212)) | (i18 & i212);
            int i214 = -Color.blue(0);
            Object[] objArr35 = new Object[1];
            bravo((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), ((i214 | 325) << 1) - (i214 ^ 325), 12 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr35);
            Object[] objArr36 = {(String) objArr35[0]};
            Object D887116 = uH18377.D8871(i16);
            if (D887116 == null) {
                int jumpTapTimeout2 = 52 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int indexOf3 = TextUtils.indexOf((CharSequence) str, '0', 0) + 3159;
                char resolveSize2 = (char) (58074 - View.resolveSize(0, 0));
                byte b25 = (byte) 0;
                byte b26 = b25;
                Object[] objArr37 = new Object[1];
                charlie(b25, b26, (byte) (b26 + 2), objArr37);
                D887116 = uH18377.setPivotYN16904(jumpTapTimeout2, indexOf3, resolveSize2, 424179844, false, (String) objArr37[0], new Class[]{String.class});
            }
            String str21 = (String) ((Method) D887116).invoke(null, objArr36);
            if (str21 != null) {
                int i215 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr38 = new Object[1];
                bravo((char) (((i215 | 46513) << 1) - (i215 ^ 46513)), ((byte) KeyEvent.getModifierMetaStateMask()) + 339, 8 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr38);
                if (str21.contains((String) objArr38[0])) {
                    int i216 = delta;
                    charlie = ((i216 & 47) + (i216 | 47)) % 128;
                    i20 = (i4 & (-251)) | (i14 & 250);
                    int i217 = i4 ^ i213;
                    int i218 = (i217 | (-i217)) >> 31;
                    int i219 = (i213 & i218) | (i20 & (~i218));
                    char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int i220 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    int i221 = (i220 & 347) + (i220 | 347);
                    int axisFromString = MotionEvent.axisFromString(str);
                    int alpha4 = M2.alpha();
                    int i222 = axisFromString * (-344);
                    int i223 = (i222 ^ (-6192)) + ((i222 & (-6192)) << 1);
                    int i224 = ~axisFromString;
                    int i225 = ~((i224 ^ (-19)) | (i224 & (-19)));
                    int i226 = ~((i224 ^ alpha4) | (i224 & alpha4));
                    int i227 = ((i225 ^ i226) | (i225 & i226)) * 345;
                    int i228 = (((~(i224 | (~alpha4))) | (~(((-19) ^ axisFromString) | ((-19) & axisFromString)))) * 345) + (((i223 | i227) << 1) - (i223 ^ i227));
                    int i229 = ~axisFromString;
                    int i230 = (i229 & (-19)) | (i229 ^ (-19));
                    int i231 = (~((i230 & alpha4) | (i230 ^ alpha4))) * 345;
                    int i232 = (i228 & i231) + (i231 | i228);
                    Object[] objArr39 = new Object[1];
                    bravo(modifierMetaStateMask2, i221, i232, objArr39);
                    String str22 = (String) objArr39[0];
                    char myTid = (char) (47887 - (Process.myTid() >> 22));
                    int i233 = 364 - (~(-(-TextUtils.lastIndexOf(str, '0', 0, 0))));
                    int i234 = -AndroidCharacter.getMirror('0');
                    int i235 = ((i234 | 54) << 1) - (i234 ^ 54);
                    Object[] objArr40 = new Object[1];
                    bravo(myTid, i233, i235, objArr40);
                    Object[] objArr41 = {str22, (String) objArr40[0]};
                    D8871 = uH18377.D8871(1214576837);
                    if (D8871 == null) {
                        int scrollBarSize = 52 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int blue = Color.blue(0) + 3314;
                        char trimmedLength = (char) TextUtils.getTrimmedLength(str);
                        byte b27 = (byte) 1;
                        byte b28 = b27;
                        Object[] objArr42 = new Object[1];
                        charlie(b27, b28, (byte) (b28 + 1), objArr42);
                        D8871 = uH18377.setPivotYN16904(scrollBarSize, blue, trimmedLength, -1746970096, false, (String) objArr42[0], new Class[]{String.class, String.class});
                    }
                    long longValue8 = ((Long) ((Method) D8871).invoke(null, objArr41)).longValue();
                    long j71 = -853065835;
                    long j72 = longValue8 ^ j31;
                    long j73 = ((-865) * (j72 | (((j71 ^ j31) | j52) ^ j31))) + ((-864) * longValue8) + (866 * j71);
                    long j74 = 865;
                    j5 = ((j74 * (((j72 | j52) ^ j31) | ((j52 | j71) ^ j31))) + ((((j71 | j51) ^ j31) * j74) + j73)) - 694572503;
                    uptimeMillis = (int) SystemClock.uptimeMillis();
                    i21 = ~uptimeMillis;
                    if (((((int) j5) & ((((~(1332100511 | i4)) | (~((-136323333) | i14)) | (~((-1090651282) | i14))) * 140) + (((~(1195777179 | i4)) | (~(241449230 | i4))) * 140) + (((136323332 | r3) * (-280)) - 1899153095))) | (((int) (j5 >> c3)) & A0.z.foxtrot((~((-890153735) | uptimeMillis)) | (~((-547072677) | i21)) | (-899656615), -370, (((~((-547072677) | uptimeMillis)) | (~((-890153735) | i21))) * (-370)) + 635053406, 2134501538))) == 0) {
                        i22 = (i4 & (-252)) | (i14 & 251);
                        M2.alpha();
                    } else {
                        i22 = i4;
                    }
                    int i236 = ((~i219) & i4) | (i219 & i14);
                    int i237 = -i236;
                    int i238 = ((i236 & i237) | (i236 ^ i237)) >> 31;
                    int i239 = (i219 & i238) | (i22 & (~i238));
                    Object[] objArr43 = new Object[1];
                    bravo((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 370, (-16777194) - (~(-Color.rgb(0, 0, 0))), objArr43);
                    Object[] objArr44 = {(String) objArr43[0]};
                    D88712 = uH18377.D8871(i16);
                    if (D88712 == null) {
                        int i240 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51;
                        int mirror = 3206 - AndroidCharacter.getMirror('0');
                        char green = (char) (Color.green(0) + 58074);
                        byte b29 = (byte) 0;
                        byte b30 = b29;
                        Object[] objArr45 = new Object[1];
                        charlie(b29, b30, (byte) (b30 + 2), objArr45);
                        D88712 = uH18377.setPivotYN16904(i240, mirror, green, 424179844, false, (String) objArr45[0], new Class[]{String.class});
                    }
                    String lowerCase = ((String) ((Method) D88712).invoke(null, objArr44)).toLowerCase();
                    char c19 = (char) (3169 - (~(-KeyEvent.keyCodeFromString(str))));
                    int i241 = -(Process.myTid() >> 22);
                    int i242 = (i241 ^ 393) + ((i241 & 393) << 1);
                    int i243 = -(-Process.getGidForName(str));
                    int i244 = ((i243 | 5) << 1) - (i243 ^ 5);
                    Object[] objArr46 = new Object[1];
                    bravo(c19, i242, i244, objArr46);
                    int i245 = !lowerCase.contains((String) objArr46[0]) ? i4 ^ 264 : i4;
                    int i246 = i4 ^ i239;
                    int i247 = -i246;
                    int i248 = ((i246 & i247) | (i246 ^ i247)) >> 31;
                    int i249 = (i239 & i248) | (i245 & (~i248));
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i250 = -(ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr47 = new Object[1];
                    bravo(windowTouchSlop, ((i250 | 397) << 1) - (i250 ^ 397), 40 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr47);
                    String str23 = (String) objArr47[0];
                    char c20 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i251 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr48 = new Object[1];
                    bravo(c20, (i251 & 440) + (i251 | 440), 40 - Drawable.resolveOpacity(0, 0), objArr48);
                    String str24 = (String) objArr48[0];
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i252 = 479 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i253 = -TextUtils.getOffsetBefore(str, 0);
                    int i254 = (i253 ^ 27) + ((i253 & 27) << 1);
                    Object[] objArr49 = new Object[1];
                    bravo(keyRepeatDelay2, i252, i254, objArr49);
                    String str25 = (String) objArr49[0];
                    int i255 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr50 = new Object[1];
                    bravo((char) ((i255 & 14847) + (i255 | 14847)), (ViewConfiguration.getPressedStateDuration() >> 16) + 506, 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr50);
                    String str26 = (String) objArr50[0];
                    int i256 = -(Process.myPid() >> 22);
                    int i257 = -View.combineMeasuredStates(0, 0);
                    Object[] objArr51 = new Object[1];
                    bravo((char) ((i256 ^ 5943) + ((i256 & 5943) << 1)), (i257 & 533) + (i257 | 533), 26 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr51);
                    String str27 = (String) objArr51[0];
                    int rgb = Color.rgb(0, 0, 0);
                    int i258 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int i259 = (i258 & 559) + (i258 | 559);
                    c4 = 0;
                    int resolveSize3 = View.resolveSize(0, 0);
                    i23 = 1;
                    int i260 = ((resolveSize3 | 27) << 1) - (resolveSize3 ^ 27);
                    Object[] objArr52 = new Object[1];
                    bravo((char) ((rgb & 16814124) + (rgb | 16814124)), i259, i260, objArr52);
                    strArr = new String[]{str23, str24, str25, str26, str27, (String) objArr52[0]};
                    i24 = 0;
                    while (true) {
                        if (i24 < 6) {
                            i25 = i4;
                            break;
                        }
                        Object[] objArr53 = new Object[i23];
                        objArr53[c4] = strArr[i24];
                        Object D887117 = uH18377.D8871(i16);
                        if (D887117 == null) {
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3158;
                            char indexOf4 = (char) (TextUtils.indexOf((CharSequence) str, '0') + 58075);
                            byte b31 = (byte) 0;
                            byte b32 = b31;
                            strArr11 = strArr;
                            i52 = i24;
                            Object[] objArr54 = new Object[1];
                            charlie(b31, b32, (byte) (b32 + 2), objArr54);
                            D887117 = uH18377.setPivotYN16904(maximumFlingVelocity, scrollBarFadeDuration, indexOf4, 424179844, false, (String) objArr54[0], new Class[]{String.class});
                        } else {
                            strArr11 = strArr;
                            i52 = i24;
                        }
                        String str28 = (String) ((Method) D887117).invoke(null, objArr53);
                        if (str28 != null) {
                            int i261 = delta;
                            charlie = ((i261 ^ 93) + ((i261 & 93) << 1)) % 128;
                            if (!str28.isEmpty()) {
                                int i262 = delta;
                                int i263 = (i262 & 47) + (i262 | 47);
                                charlie = i263 % 128;
                                if (i263 % 2 != 0) {
                                    i53 = ~(i4 & 198);
                                    i54 = i4 | 198;
                                } else {
                                    i53 = ~(i4 & 265);
                                    i54 = i4 | 265;
                                }
                                i25 = i53 & i54;
                            }
                        }
                        i24 = i52 + 1;
                        strArr = strArr11;
                        c4 = 0;
                        i23 = 1;
                    }
                    int i264 = ((~i249) & i4) | (i249 & i14);
                    int i265 = (i264 | (-i264)) >> 31;
                    int i266 = i25 & (~i265);
                    int i267 = i249 & i265;
                    int i268 = (i267 & i266) | (i266 ^ i267);
                    Object[] objArr55 = new Object[1];
                    bravo((char) KeyEvent.keyCodeFromString(str), 346 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), 16 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr55);
                    String str29 = (String) objArr55[0];
                    char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i269 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    Object[] objArr56 = new Object[1];
                    bravo(windowTouchSlop2, (i269 & 587) + (i269 | 587), 6 - KeyEvent.normalizeMetaState(0), objArr56);
                    str2 = (String) objArr56[0];
                    file = new File(str29);
                    if (file.exists() && file.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file));
                            int i270 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            int alpha5 = M2.alpha();
                            int i271 = i270 * 628;
                            int i272 = (i271 ^ 29526048) + ((i271 & 29526048) << 1);
                            int i273 = (alpha5 ^ 47016) | (alpha5 & 47016);
                            int i274 = ~i270;
                            int i275 = -(-(((i273 ^ i274) | (i274 & i273)) * (-627)));
                            int i276 = (i272 ^ i275) + ((i272 & i275) << 1);
                            int i277 = ~(((-47017) ^ alpha5) | ((-47017) & alpha5));
                            int i278 = (i276 - (~(((i270 ^ i277) | (i277 & i270)) * (-627)))) - 1;
                            int i279 = ~alpha5;
                            int i280 = ~((i279 ^ 47016) | (i279 & 47016));
                            int i281 = ~((i270 & alpha5) | (i270 ^ alpha5));
                            int i282 = ((i280 & i281) | (i280 ^ i281)) * 627;
                            Object[] objArr57 = new Object[1];
                            bravo((char) ((i278 & i282) + (i282 | i278)), 593 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionChild(0L) + 3, objArr57);
                            useDelimiter2 = scanner.useDelimiter((String) objArr57[0]);
                            if (useDelimiter2.hasNext()) {
                                str6 = str;
                            } else {
                                M2.alpha();
                                str6 = useDelimiter2.next();
                            }
                            useDelimiter2.close();
                        } catch (IOException unused) {
                        }
                        if (str6.contains(str2)) {
                            int i283 = delta;
                            charlie = ((i283 ^ 3) + ((i283 & 3) << 1)) % 128;
                            int i284 = ~(i14 | 1793067439);
                            int i285 = ((i284 & 353374288) | (353374288 ^ i284)) * (-712);
                            int i286 = (899504231 ^ i285) + ((i285 & 899504231) << 1);
                            int i287 = ~(((-1963989489) & i100) | ((-1963989489) ^ i100) | 1793067439);
                            int i288 = ~((2146441727 & i4) | (2146441727 ^ i4));
                            int i289 = -(-(((i287 & i288) | (i287 ^ i288)) * (-712)));
                            int i290 = (((i286 & i289) + (i289 | i286)) - (~(-(-(((~((1793067439 & i100) | (i100 ^ 1793067439))) | (-1963989489)) * 712))))) - 1;
                            int i291 = ~((1069053805 & i14) | (i14 ^ 1069053805));
                            int i292 = ((i291 & 1077970960) | (1077970960 ^ i291)) * (-108);
                            int i293 = ((1373778640 | i292) << 1) - (i292 ^ 1373778640);
                            int i294 = (~((-1323870234) | i4)) | 823154532;
                            int i295 = ~((1323870233 & i14) | (i14 ^ 1323870233));
                            int i296 = (((i294 & i295) | (i294 ^ i295)) * 54) + i293;
                            int i297 = ((823154532 & i4) | (i4 ^ 823154532)) * 54;
                            i27 = i290 <= ((i296 | i297) << 1) - (i296 ^ i297) ? (~(i4 & 2171)) & (i4 | 2171) : (i4 & (-261)) | (i14 & 260);
                            int i298 = ((~i268) & i4) | (i268 & i14);
                            int i299 = -i298;
                            int i300 = ((i298 & i299) | (i298 ^ i299)) >> 31;
                            i30 = (i268 & i300) | (i27 & (~i300));
                            if ((i5 & 8) == 0) {
                                delta = (charlie + 71) % 128;
                                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int i301 = -Gravity.getAbsoluteGravity(0, 0);
                                Object[] objArr58 = new Object[1];
                                bravo(longPressTimeout2, (i301 ^ 617) + ((i301 & 617) << 1), 43 - (ViewConfiguration.getTapTimeout() >> 16), objArr58);
                                String str30 = (String) objArr58[0];
                                int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int i302 = ((pressedStateDuration2 | 660) << 1) - (pressedStateDuration2 ^ 660);
                                int i303 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i304 = (i303 & 41) + (i303 | 41);
                                int i305 = 1;
                                Object[] objArr59 = new Object[1];
                                bravo((char) ((-MotionEvent.axisFromString(str)) - 1), i302, i304, objArr59);
                                String str31 = (String) objArr59[0];
                                int i306 = -AndroidCharacter.getMirror('0');
                                int i307 = -(-View.resolveSize(0, 0));
                                int i308 = (i307 ^ 701) + ((i307 & 701) << 1);
                                int i309 = -TextUtils.indexOf((CharSequence) str, '0');
                                int i310 = (i309 & 37) + (i309 | 37);
                                Object[] objArr60 = new Object[1];
                                bravo((char) ((i306 ^ 48) + ((i306 & 48) << 1)), i308, i310, objArr60);
                                char c21 = 0;
                                String[] strArr17 = {str30, str31, (String) objArr60[0]};
                                int i311 = 0;
                                while (true) {
                                    if (i311 >= 3) {
                                        j7 = j31;
                                        i51 = i4;
                                        break;
                                    }
                                    Object[] objArr61 = new Object[i305];
                                    objArr61[c21] = strArr17[i311];
                                    Object D887118 = uH18377.D8871(1979478258);
                                    if (D887118 == null) {
                                        int i312 = 53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2951;
                                        char argb2 = (char) Color.argb(0, 0, 0, 0);
                                        byte b33 = (byte) 0;
                                        byte b34 = b33;
                                        strArr10 = strArr17;
                                        j7 = j31;
                                        Object[] objArr62 = new Object[1];
                                        charlie(b33, b34, b34, objArr62);
                                        D887118 = uH18377.setPivotYN16904(i312, fadingEdgeLength, argb2, -1438133721, false, (String) objArr62[0], new Class[]{String.class});
                                    } else {
                                        strArr10 = strArr17;
                                        j7 = j31;
                                    }
                                    long longValue9 = ((Long) ((Method) D887118).invoke(null, objArr61)).longValue();
                                    long j75 = -1238128314;
                                    int i313 = i311;
                                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    long j76 = 306;
                                    long j77 = (j76 * longValue9) + (j76 * j75) + 610;
                                    long j78 = HttpConstants.HTTP_USE_PROXY;
                                    long j79 = elapsedRealtime;
                                    long j80 = (((longValue9 ^ j7) | (((j79 ^ j7) | j75) ^ j7)) * j78) + ((((j75 | longValue9) ^ j7) | ((j75 | j79) ^ j7)) * j78) + j77 + 2012949620;
                                    int i314 = ((int) (j80 >> c3)) & ((((~(1981220938 | i4)) | 6861461 | (~((-1444087873) | i14))) * 717) + (((((~(i14 | 1981220938)) | 6861461) | (~((-1444087873) | i4))) * 717) - 610121432));
                                    int i315 = (int) Runtime.getRuntime().totalMemory();
                                    int i316 = ~i315;
                                    int i317 = (~((-855670056) | i316)) | 20481;
                                    int i318 = ~(i315 | (-1146421257));
                                    int i319 = ((int) j80) & (((~(i316 | (-2002070831))) * 713) + (i318 * 1426) + ((i317 | i318) * (-713)) + 1517774550);
                                    if (((i319 & i314) | (i314 ^ i319)) != 0) {
                                        delta = (charlie + 39) % 128;
                                        int i320 = ((i313 | 280) << 1) - (i313 ^ 280);
                                        i51 = (i320 & i14) | ((~i320) & i4);
                                        break;
                                    }
                                    i311 = ((i313 | 1) << 1) - (i313 ^ 1);
                                    strArr17 = strArr10;
                                    j31 = j7;
                                    i305 = 1;
                                    c21 = 0;
                                }
                                int i321 = ((~i30) & i4) | (i30 & i14);
                                int i322 = (i321 | (-i321)) >> 31;
                                i30 = (i30 & i322) | (i51 & (~i322));
                            } else {
                                j7 = j31;
                            }
                            int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int i323 = scrollBarFadeDuration2 * (-494);
                            int i324 = ((~((38853 & scrollBarFadeDuration2) | (scrollBarFadeDuration2 ^ 38853))) * (-495)) + (i323 & (-19193382)) + (i323 | (-19193382));
                            int i325 = -(-(((scrollBarFadeDuration2 ^ i14) | (scrollBarFadeDuration2 & i14)) * 495));
                            int i326 = (i324 ^ i325) + ((i324 & i325) << 1);
                            int i327 = ~scrollBarFadeDuration2;
                            int i328 = ~((i327 & (-38854)) | (i327 ^ (-38854)));
                            int i329 = ~((scrollBarFadeDuration2 & i100) | (i100 ^ scrollBarFadeDuration2));
                            Object[] objArr63 = new Object[1];
                            bravo((char) ((i326 - (~(-(-(((i329 & i328) | (i328 ^ i329)) * 495))))) - 1), 737 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr63);
                            String str32 = (String) objArr63[0];
                            i31 = 1;
                            Object[] objArr64 = new Object[1];
                            bravo((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 780, 29 - (~(-(-KeyEvent.keyCodeFromString(str)))), objArr64);
                            c10 = 0;
                            strArr2 = new String[]{str32, (String) objArr64[0]};
                            i32 = 0;
                            while (true) {
                                if (i32 >= 2) {
                                    i33 = i30;
                                    i34 = i4;
                                    break;
                                }
                                Object[] objArr65 = new Object[i31];
                                objArr65[c10] = strArr2[i32];
                                Object D887119 = uH18377.D8871(1565484532);
                                if (D887119 == null) {
                                    int lastIndexOf2 = 51 - TextUtils.lastIndexOf(str, '0');
                                    int i330 = 2952 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                    byte b35 = (byte) 1;
                                    byte b36 = b35;
                                    Object[] objArr66 = new Object[1];
                                    charlie(b35, b36, (byte) (b36 + 1), objArr66);
                                    D887119 = uH18377.setPivotYN16904(lastIndexOf2, i330, pressedStateDuration3, -2097887455, false, (String) objArr66[0], new Class[]{String.class});
                                }
                                long longValue10 = ((Long) ((Method) D887119).invoke(null, objArr65)).longValue();
                                long j81 = 365326603;
                                strArr9 = strArr2;
                                i33 = i30;
                                long j82 = 988;
                                long j83 = ((j81 ^ j7) | longValue10) ^ j7;
                                long j84 = longValue10 ^ j7;
                                long j85 = ((((j52 | longValue10) ^ j7) | j83 | ((j84 | j51) ^ j7)) * j82) + ((-1976) * (((j84 | j81) ^ j7) | ((j52 | j81) ^ j7))) + ((j51 | j83) * j82) + (989 * longValue10) + ((-1975) * j81) + 589827299;
                                int myPid4 = Process.myPid();
                                int i331 = ~myPid4;
                                if (((((int) (j85 >> c3)) & ((((~(myPid4 | (-210882286))) | 135300781 | (~(i331 | 1301925629))) * 988) + (((~((-75581505) | i331)) | (~(1301925629 | myPid4))) * 988) + 1351259974)) | (((int) j85) & (((~(i14 | (-1798163889))) * 886) + (((-1798163889) | (~(360937478 | i14))) * (-1772)) + (((~((-360937479) | i4)) | 344076294 | (~((-1781302705) | i14))) * 886) + 1414037605))) != 0) {
                                    int i332 = delta;
                                    int i333 = ((i332 | 111) << 1) - (i332 ^ 111);
                                    charlie = i333 % 128;
                                    if (i333 % 2 != 0) {
                                        int i334 = i32 << 29416;
                                        i34 = (i334 & i14) | ((~i334) & i4);
                                    } else {
                                        int i335 = (i32 & 288) + (i32 | 288);
                                        i34 = (i335 | i4) & (~(i4 & i335));
                                    }
                                } else {
                                    int i336 = ((i32 | (-88)) << 1) - (i32 ^ (-88));
                                    i32 = (i336 ^ 89) + ((i336 & 89) << 1);
                                    strArr2 = strArr9;
                                    i30 = i33;
                                    i31 = 1;
                                    c10 = 0;
                                }
                            }
                            int i337 = (~(i4 & i33)) & (i4 | i33);
                            int i338 = -i337;
                            int i339 = ((i337 & i338) | (i337 ^ i338)) >> 31;
                            int i340 = i34 & (~i339);
                            int i341 = i339 & i33;
                            int i342 = (i340 & i341) | (i340 ^ i341);
                            D88714 = uH18377.D8871(-344556366);
                            if (D88714 == null) {
                                int offsetBefore = TextUtils.getOffsetBefore(str, 0) + 52;
                                int maxKeyCode2 = 3106 - (KeyEvent.getMaxKeyCode() >> 16);
                                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 15991);
                                byte b37 = (byte) 1;
                                byte b38 = b37;
                                Object[] objArr67 = new Object[1];
                                charlie(b37, b38, (byte) (b38 + 1), objArr67);
                                D88714 = uH18377.setPivotYN16904(offsetBefore, maxKeyCode2, scrollDefaultDelay2, 885907047, false, (String) objArr67[0], new Class[0]);
                            }
                            long longValue11 = ((Long) ((Method) D88714).invoke(null, null)).longValue();
                            long j86 = 1853319230;
                            long j87 = -112;
                            long j88 = longValue11 ^ j7;
                            long j89 = j88 | j52;
                            long j90 = j86 ^ j7;
                            long j91 = ((113 * ((j88 | j51) ^ j7)) + (((-113) * ((((j90 | longValue11) ^ j7) | ((j90 | j51) ^ j7)) | ((j89 | j86) ^ j7))) + ((226 * (j86 | (j89 ^ j7))) + ((j87 * longValue11) + (j87 * j86))))) - 2005572328;
                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                            foxtrot2 = ((int) (j91 >> c3)) & A0.z.foxtrot((~(elapsedCpuTime2 | 1399392832)) | (~(37833578 | elapsedCpuTime2)) | (-1399409515), -1444, (((~elapsedCpuTime2) | (-1361592619)) * 1444) - 1153123274, -477640588);
                            i35 = ((int) j91) & ((((~((-1573401210) | i4)) | (-1573746686)) * 49) + (((~((-1284339677) | i14)) | (-1573401210) | (~(1284339676 | i4))) * (-49)) + (((~((-1573401210) | i14)) | 289407009) * 98) + 1791379743);
                            if (((i35 & foxtrot2) | (foxtrot2 ^ i35)) != 1) {
                                Object[] objArr68 = {1};
                                Object D887120 = uH18377.D8871(-38624464);
                                if (D887120 == null) {
                                    int bitsPerPixel = 51 - ImageFormat.getBitsPerPixel(0);
                                    int i343 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2847;
                                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 62567);
                                    byte b39 = (byte) 1;
                                    byte b40 = b39;
                                    Object[] objArr69 = new Object[1];
                                    charlie(b39, b40, (byte) (b40 + 1), objArr69);
                                    D887120 = uH18377.setPivotYN16904(bitsPerPixel, i343, touchSlop, 571015653, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                                }
                                long longValue12 = ((Long) ((Method) D887120).invoke(null, objArr68)).longValue();
                                long j92 = 1251973933;
                                long j93 = j92 ^ j7;
                                long j94 = ((-368) * (longValue12 | j93)) + (185 * longValue12) + ((-183) * j92);
                                long j95 = 184;
                                long j96 = longValue12 ^ j7;
                                long elapsedCpuTime3 = ((int) Process.getElapsedCpuTime()) ^ j7;
                                long j97 = ((((elapsedCpuTime3 | j92) ^ j7) | ((j93 | j96) ^ j7) | ((j92 | longValue12) ^ j7)) * j95) + ((j92 | j96 | elapsedCpuTime3) * j95) + j94 + 740152833;
                                int i344 = ((int) (j97 >> c3)) & ((((-387258808) | (~((-1049967604) | i4))) * HttpConstants.HTTP_BAD_GATEWAY) + ((~((-16777221) | i14)) * (-502)) + ((((~((-387258808) | i4)) | (-1066744824)) * (-502)) - 530107390));
                                int i345 = ((int) j97) & ((((~(2145376219 | i14)) | 134808065) * 241) + (((~(1858705347 | i14)) | 286670872) * (-241)) + 801971708);
                                int i346 = ((i345 & i344) | (i344 ^ i345)) != 0 ? (i4 & (-221)) | (i14 & 220) : i4;
                                int i347 = ((~i342) & i4) | (i342 & i14);
                                int i348 = -i347;
                                int i349 = ((i347 & i348) | (i347 ^ i348)) >> 31;
                                int i350 = i346 & (~i349);
                                int i351 = i342 & i349;
                                int i352 = (i351 & i350) | (i350 ^ i351);
                                Object[] objArr70 = new Object[1];
                                bravo((char) View.resolveSizeAndState(0, 0, 0), Color.alpha(0) + 370, 22 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), objArr70);
                                Object[] objArr71 = {(String) objArr70[0]};
                                Object D887121 = uH18377.D8871(i16);
                                if (D887121 == null) {
                                    int mode3 = View.MeasureSpec.getMode(0) + 52;
                                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3158;
                                    char scrollBarFadeDuration3 = (char) (58074 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    byte b41 = (byte) 0;
                                    byte b42 = b41;
                                    Object[] objArr72 = new Object[1];
                                    charlie(b41, b42, (byte) (b42 + 2), objArr72);
                                    D887121 = uH18377.setPivotYN16904(mode3, jumpTapTimeout3, scrollBarFadeDuration3, 424179844, false, (String) objArr72[0], new Class[]{String.class});
                                }
                                Object invoke2 = ((Method) D887121).invoke(null, objArr71);
                                if (invoke2 != null) {
                                    int i353 = charlie;
                                    delta = ((i353 ^ 83) + ((i353 & 83) << 1)) % 128;
                                    Object[] objArr73 = {invoke2, 42};
                                    Object D887122 = uH18377.D8871(2072770498);
                                    if (D887122 == null) {
                                        int maximumFlingVelocity2 = 51 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int makeMeasureSpec = 1209 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        char c22 = (char) (44357 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                        byte b43 = (byte) 1;
                                        byte b44 = b43;
                                        Object[] objArr74 = new Object[1];
                                        charlie(b43, b44, (byte) (b44 + 1), objArr74);
                                        D887122 = uH18377.setPivotYN16904(maximumFlingVelocity2, makeMeasureSpec, c22, -1540336361, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long longValue13 = ((Long) ((Method) D887122).invoke(null, objArr73)).longValue();
                                    long j98 = 1453152060;
                                    long j99 = -494;
                                    i36 = i352;
                                    long j100 = ((-495) * ((j98 | longValue13) ^ j7)) + (j99 * longValue13) + (j99 * j98);
                                    long j101 = 495;
                                    long j102 = j98 | j52;
                                    long j103 = ((j101 * ((((j98 ^ j7) | (longValue13 ^ j7)) ^ j7) | (j102 ^ j7))) + ((j101 * j102) + j100)) - 1460597090;
                                    int i354 = (int) Runtime.getRuntime().totalMemory();
                                    int i355 = ((int) (j103 >> c3)) & ((((~(i354 | 1458287600)) | (-21061190)) * 519) + (((~((~i354) | 1475084277)) | (~((-16796678) | i354))) * (-519)) + ((((~(21061189 | r3)) | 1458287600) * 519) - 1453938172));
                                    int tango2 = ao.ad.tango(917763685);
                                    int i356 = ~tango2;
                                    int i357 = (~(2124649843 | i356)) | (-2130427900) | (~(687423433 | i356));
                                    int i358 = ((int) j103) & ((((~((-687423434) | i356)) | (~(i356 | (-2124649844)))) * 590) + (i357 * (-1180)) + (((~(tango2 | (-681645378))) | i357) * 590) + 1591883711);
                                    if (((i355 & i358) | (i355 ^ i358)) == 1986687685) {
                                        i37 = i36;
                                        strArr4 = null;
                                        int i359 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                        int alpha6 = Color.alpha(0);
                                        int i360 = (alpha6 ^ 891) + ((alpha6 & 891) << 1);
                                        int i361 = -Color.blue(0);
                                        int i362 = (i361 ^ 16) + ((i361 & 16) << 1);
                                        Object[] objArr75 = new Object[1];
                                        bravo((char) ((i359 ^ 23434) + ((i359 & 23434) << 1)), i360, i362, objArr75);
                                        Object[] objArr76 = {(String) objArr75[0]};
                                        D88715 = uH18377.D8871(i16);
                                        if (D88715 == null) {
                                            int indexOf5 = 51 - TextUtils.indexOf((CharSequence) str, '0', 0);
                                            int red2 = 3158 - Color.red(0);
                                            char resolveSize4 = (char) (58074 - View.resolveSize(0, 0));
                                            byte b45 = (byte) 0;
                                            byte b46 = b45;
                                            Object[] objArr77 = new Object[1];
                                            charlie(b45, b46, (byte) (b46 + 2), objArr77);
                                            D88715 = uH18377.setPivotYN16904(indexOf5, red2, resolveSize4, 424179844, false, (String) objArr77[0], new Class[]{String.class});
                                        }
                                        invoke = ((Method) D88715).invoke(null, objArr76);
                                        if (invoke != null) {
                                            delta = (charlie + 101) % 128;
                                            i40 = 0;
                                        } else {
                                            Object[] objArr78 = {invoke, 42};
                                            Object D887123 = uH18377.D8871(2072770498);
                                            if (D887123 == null) {
                                                int rgb2 = Color.rgb(0, 0, 0) + 16777267;
                                                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1209;
                                                char resolveSizeAndState = (char) (44356 - View.resolveSizeAndState(0, 0, 0));
                                                byte b47 = (byte) 1;
                                                byte b48 = b47;
                                                Object[] objArr79 = new Object[1];
                                                charlie(b47, b48, (byte) (b48 + 1), objArr79);
                                                D887123 = uH18377.setPivotYN16904(rgb2, absoluteGravity2, resolveSizeAndState, -1540336361, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long longValue14 = ((Long) ((Method) D887123).invoke(null, objArr78)).longValue();
                                            long j104 = 1632300203;
                                            long j105 = ((-216) * longValue14) + ((-433) * j104);
                                            long j106 = 217;
                                            long j107 = j104 ^ j7;
                                            long j108 = longValue14 ^ j7;
                                            long j109 = ((j106 * (((j108 | j52) ^ j7) | j104)) + (((((j107 | j108) ^ j7) | ((j107 | j51) ^ j7)) * j106) + (((((j107 | j52) ^ j7) | ((j108 | j51) ^ j7)) * j106) + j105))) - 1639745233;
                                            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                            int i363 = ((int) (j109 >> c3)) & ((((~(elapsedRealtime2 | 256845128)) | 151258376) * HttpConstants.HTTP_MOVED_TEMP) + ((~((-1074794531) | elapsedRealtime2)) * (-604)) + (((~((~elapsedRealtime2) | (-1074794531))) | (~(1331639658 | elapsedRealtime2))) * (-302)) + 1172270678);
                                            int foxtrot7 = ((int) j109) & A0.z.foxtrot((~((~((int) SystemClock.uptimeMillis())) | 60000751)) | 1342456336, 933, (((~(1377225658 | r4)) | 60000751) * (-933)) - 2047417986, -1919960942);
                                            i40 = (i363 & foxtrot7) | (i363 ^ foxtrot7);
                                        }
                                        if (i40 != 1986687685 && i40 != -1514516938) {
                                            char trimmedLength2 = (char) TextUtils.getTrimmedLength(str);
                                            int i364 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                            Object[] objArr80 = new Object[1];
                                            bravo(trimmedLength2, (i364 ^ 1610) + ((i364 & 1610) << 1), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr80);
                                            String str33 = (String) objArr80[0];
                                            char c23 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                            int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                            int i365 = (tapTimeout2 & 1624) + (tapTimeout2 | 1624);
                                            int i366 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i367 = (i366 ^ 25) + ((i366 & 25) << 1);
                                            Object[] objArr81 = new Object[1];
                                            bravo(c23, i365, i367, objArr81);
                                            String str34 = (String) objArr81[0];
                                            int i368 = -(-View.MeasureSpec.getSize(0));
                                            int i369 = ((i368 | 1650) << 1) - (i368 ^ 1650);
                                            int i370 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i371 = (i370 ^ 17) + ((i370 & 17) << 1);
                                            Object[] objArr82 = new Object[1];
                                            bravo((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), i369, i371, objArr82);
                                            String str35 = (String) objArr82[0];
                                            int i372 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int i373 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            Object[] objArr83 = new Object[1];
                                            bravo((char) (((i372 | 62609) << 1) - (i372 ^ 62609)), ((i373 | 1667) << 1) - (i373 ^ 1667), 15 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr83);
                                            String str36 = (String) objArr83[0];
                                            char indexOf6 = (char) TextUtils.indexOf(str, str, 0, 0);
                                            int i374 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i375 = (i374 ^ 1683) + ((i374 & 1683) << 1);
                                            int i376 = -AndroidCharacter.getMirror('0');
                                            int i377 = (i376 & 63) + (i376 | 63);
                                            Object[] objArr84 = new Object[1];
                                            bravo(indexOf6, i375, i377, objArr84);
                                            String str37 = (String) objArr84[0];
                                            char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                            int i378 = ((packedPositionGroup3 | 1699) << 1) - (packedPositionGroup3 ^ 1699);
                                            int i379 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                            int i380 = ((i379 | 37) << 1) - (i379 ^ 37);
                                            Object[] objArr85 = new Object[1];
                                            bravo(keyRepeatDelay3, i378, i380, objArr85);
                                            String str38 = (String) objArr85[0];
                                            int i381 = -Color.alpha(0);
                                            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 1736;
                                            int i382 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i383 = (i382 ^ 12) + ((i382 & 12) << 1);
                                            Object[] objArr86 = new Object[1];
                                            bravo((char) ((i381 ^ 21305) + ((i381 & 21305) << 1)), packedPositionGroup4, i383, objArr86);
                                            String str39 = (String) objArr86[0];
                                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int i384 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                            int i385 = ((i384 | 1747) << 1) - (i384 ^ 1747);
                                            int i386 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                            int i387 = ((i386 | 14) << 1) - (i386 ^ 14);
                                            Object[] objArr87 = new Object[1];
                                            bravo(doubleTapTimeout, i385, i387, objArr87);
                                            String str40 = (String) objArr87[0];
                                            char c24 = (char) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1)));
                                            int i388 = -((byte) KeyEvent.getModifierMetaStateMask());
                                            int i389 = ((i388 | 1760) << 1) - (i388 ^ 1760);
                                            int i390 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int i391 = (i390 & 22) + (i390 | 22);
                                            Object[] objArr88 = new Object[1];
                                            bravo(c24, i389, i391, objArr88);
                                            String str41 = (String) objArr88[0];
                                            char c25 = (char) (43426 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            int i392 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                            int i393 = (i392 ^ 1783) + ((i392 & 1783) << 1);
                                            int i394 = -Color.argb(0, 0, 0, 0);
                                            int i395 = (i394 & 31) + (i394 | 31);
                                            Object[] objArr89 = new Object[1];
                                            bravo(c25, i393, i395, objArr89);
                                            String str42 = (String) objArr89[0];
                                            int keyCodeFromString3 = KeyEvent.keyCodeFromString(str);
                                            int i396 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i397 = (i396 & 1815) + (i396 | 1815);
                                            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                            int i398 = (maximumDrawingCacheSize & 12) + (maximumDrawingCacheSize | 12);
                                            Object[] objArr90 = new Object[1];
                                            bravo((char) ((keyCodeFromString3 ^ 58964) + ((keyCodeFromString3 & 58964) << 1)), i397, i398, objArr90);
                                            String str43 = (String) objArr90[0];
                                            char c26 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i399 = -View.resolveSize(0, 0);
                                            Object[] objArr91 = new Object[1];
                                            bravo(c26, ((i399 | 1826) << 1) - (i399 ^ 1826), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr91);
                                            String str44 = (String) objArr91[0];
                                            int i400 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int i401 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                            Object[] objArr92 = new Object[1];
                                            bravo((char) ((i400 ^ 43501) + ((i400 & 43501) << 1)), (i401 ^ 1838) + ((i401 & 1838) << 1), 11 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr92);
                                            String str45 = (String) objArr92[0];
                                            char c27 = (char) (28549 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))));
                                            int i402 = -TextUtils.getCapsMode(str, 0, 0);
                                            int i403 = (i402 ^ 1850) + ((i402 & 1850) << 1);
                                            int i404 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i405 = (i404 ^ 13) + ((i404 & 13) << 1);
                                            Object[] objArr93 = new Object[1];
                                            bravo(c27, i403, i405, objArr93);
                                            String str46 = (String) objArr93[0];
                                            char red3 = (char) Color.red(0);
                                            int i406 = 1861 - (~Drawable.resolveOpacity(0, 0));
                                            int i407 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i408 = (i407 & 12) + (i407 | 12);
                                            Object[] objArr94 = new Object[1];
                                            bravo(red3, i406, i408, objArr94);
                                            String str47 = (String) objArr94[0];
                                            char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int keyCodeFromString4 = KeyEvent.keyCodeFromString(str);
                                            Object[] objArr95 = new Object[1];
                                            bravo(longPressTimeout3, (keyCodeFromString4 ^ 1874) + ((keyCodeFromString4 & 1874) << 1), 13 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr95);
                                            String str48 = (String) objArr95[0];
                                            char indexOf7 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                            int i409 = -(-View.resolveSize(0, 0));
                                            int i410 = ((i409 | 1888) << 1) - (i409 ^ 1888);
                                            int keyCodeFromString5 = KeyEvent.keyCodeFromString(str);
                                            int i411 = (keyCodeFromString5 & 12) + (keyCodeFromString5 | 12);
                                            Object[] objArr96 = new Object[1];
                                            bravo(indexOf7, i410, i411, objArr96);
                                            c12 = 0;
                                            String str49 = (String) objArr96[0];
                                            char c28 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i412 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1900;
                                            int i413 = -TextUtils.getCapsMode(str, 0, 0);
                                            int i414 = ((i413 | 24) << 1) - (i413 ^ 24);
                                            Object[] objArr97 = new Object[1];
                                            bravo(c28, i412, i414, objArr97);
                                            String str50 = (String) objArr97[0];
                                            char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i415 = -TextUtils.indexOf(str, str, 0);
                                            i47 = 1;
                                            Object[] objArr98 = new Object[1];
                                            bravo(maximumDrawingCacheSize2, (i415 ^ 1924) + ((i415 & 1924) << 1), 28 - KeyEvent.normalizeMetaState(0), objArr98);
                                            strArr7 = new String[]{str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, (String) objArr98[0]};
                                            i48 = 0;
                                            i49 = 19;
                                            while (true) {
                                                if (i48 < i49) {
                                                    i50 = -1;
                                                    break;
                                                }
                                                String str51 = strArr7[i48];
                                                Object[] objArr99 = new Object[i47];
                                                objArr99[c12] = str51;
                                                Object D887124 = uH18377.D8871(-2104138125);
                                                if (D887124 == null) {
                                                    byte b49 = (byte) 0;
                                                    byte b50 = b49;
                                                    strArr8 = strArr7;
                                                    Object[] objArr100 = new Object[1];
                                                    charlie(b49, b50, (byte) (b50 + 1), objArr100);
                                                    D887124 = uH18377.setPivotYN16904(52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2951, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 1563346086, false, (String) objArr100[0], new Class[]{String.class});
                                                } else {
                                                    strArr8 = strArr7;
                                                }
                                                long longValue15 = ((Long) ((Method) D887124).invoke(null, objArr99)).longValue();
                                                long j110 = -957063412;
                                                i50 = i48;
                                                long j111 = 983;
                                                long j112 = longValue15 ^ j7;
                                                long j113 = ((j110 | j112) * j111) + (984 * longValue15) + ((-1965) * j110);
                                                long j114 = j110 ^ j7;
                                                long j115 = ((j111 * (((j114 | j52) ^ j7) | ((longValue15 | j114) ^ j7))) + (((-983) * (j114 | ((j112 | j52) ^ j7))) + j113)) - 272557118;
                                                int i416 = ((int) (j115 >> c3)) & (((~((-1714757708) | i4)) * 566) + (((~((-1714762080) | i4)) | 4372) * (-566)) + 1439700962);
                                                int i417 = ((int) j115) & ((((~(1309262435 | i14)) | 306324881) * 764) + (((~(1548478450 | i14)) | 33554433) * (-1528)) + (((1548478450 | r9) * 764) - 1436197543));
                                                if (((i416 & i417) | (i416 ^ i417)) != 0) {
                                                    break;
                                                }
                                                char trimmedLength3 = (char) TextUtils.getTrimmedLength(str);
                                                int green2 = Color.green(0);
                                                int i418 = 1;
                                                int i419 = (green2 ^ 1874) + ((green2 & 1874) << 1);
                                                int i420 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                bravo(trimmedLength3, i419, (i420 ^ 15) + ((i420 & 15) << 1), new Object[1]);
                                                if (!(!str51.equals((String) r3[0]))) {
                                                    Object[] objArr101 = {str51};
                                                    Object D887125 = uH18377.D8871(1979478258);
                                                    if (D887125 == null) {
                                                        int packedPositionGroup5 = 52 - ExpandableListView.getPackedPositionGroup(0L);
                                                        int scrollDefaultDelay3 = 2951 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        byte b51 = (byte) 0;
                                                        byte b52 = b51;
                                                        Object[] objArr102 = new Object[1];
                                                        charlie(b51, b52, b52, objArr102);
                                                        D887125 = uH18377.setPivotYN16904(packedPositionGroup5, scrollDefaultDelay3, maximumFlingVelocity3, -1438133721, false, (String) objArr102[0], new Class[]{String.class});
                                                    }
                                                    long longValue16 = ((Long) ((Method) D887125).invoke(null, objArr101)).longValue();
                                                    long j116 = -466833216;
                                                    long j117 = ((-489) * longValue16) + (491 * j116);
                                                    long j118 = j116 ^ j7;
                                                    long j119 = longValue16 ^ j7;
                                                    long j120 = ((-490) * (j118 | j119 | j52)) + j117;
                                                    long j121 = 490;
                                                    long j122 = (j121 * j118) + ((((j119 | j51) ^ j7) | ((j116 | j119) ^ j7)) * j121) + j120 + 1241654522;
                                                    int i421 = ((int) (j122 >> c3)) & ((((~((-1237785766) | i4)) | (-1273445798)) * 49) + (((~((-199440646) | i14)) | (-1237785766) | (~(199440645 | i4))) * (-49)) + (((~((-1237785766) | i14)) | 1074005152) * 98) + 1575962741);
                                                    int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                                    int i422 = (((~((-563923198) | elapsedCpuTime4)) | 2001149607) * (-318)) - 1787860661;
                                                    int i423 = ~(2001149607 | elapsedCpuTime4);
                                                    int i424 = ~elapsedCpuTime4;
                                                    int i425 = ((int) j122) & ((((~(elapsedCpuTime4 | (-1447237123))) | (~(2011160319 | i424))) * 318) + ((i423 | (~((-1447237123) | i424))) * 318) + i422);
                                                    if (((i421 & i425) | (i421 ^ i425)) != 0) {
                                                        break;
                                                    }
                                                    i418 = 1;
                                                }
                                                i48 = ((i50 | 1) << i418) - (i50 ^ 1);
                                                strArr7 = strArr8;
                                                i49 = 19;
                                                c12 = 0;
                                                i47 = 1;
                                            }
                                            int i426 = (i50 & 130) + (i50 | 130);
                                            int i427 = (i426 | i4) & (~(i4 & i426));
                                            int i428 = ~i50;
                                            int i429 = -i428;
                                            int i430 = ((i428 & i429) | (i428 ^ i429)) >> 31;
                                            int i431 = (~i430) & i4;
                                            int i432 = i427 & i430;
                                            int i433 = (i432 & i431) | (i431 ^ i432);
                                            int i434 = ((~i37) & i4) | (i37 & i14);
                                            int i435 = -i434;
                                            int i436 = ((i434 & i435) | (i434 ^ i435)) >> 31;
                                            int i437 = i433 & (~i436);
                                            int i438 = i37 & i436;
                                            i37 = (i438 & i437) | (i437 ^ i438);
                                        }
                                        char myPid5 = (char) (Process.myPid() >> 22);
                                        int offsetAfter2 = TextUtils.getOffsetAfter(str, 0);
                                        Object[] objArr103 = new Object[1];
                                        bravo(myPid5, (offsetAfter2 & 1952) + (offsetAfter2 | 1952), 12 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr103);
                                        String str52 = (String) objArr103[0];
                                        char resolveSize5 = (char) View.resolveSize(0, 0);
                                        int i439 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i440 = (i439 & 1966) + (i439 | 1966);
                                        int i441 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i442 = (i441 ^ 5) + ((i441 & 5) << 1);
                                        Object[] objArr104 = new Object[1];
                                        bravo(resolveSize5, i440, i442, objArr104);
                                        String[] strArr18 = {str52, (String) objArr104[0]};
                                        char c29 = (char) ((-2) - ((-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))) ^ (-1)));
                                        int blue2 = Color.blue(0);
                                        int i443 = (blue2 ^ 1970) + ((blue2 & 1970) << 1);
                                        int i444 = -KeyEvent.normalizeMetaState(0);
                                        int i445 = (i444 ^ 15) + ((i444 & 15) << 1);
                                        Object[] objArr105 = new Object[1];
                                        bravo(c29, i443, i445, objArr105);
                                        String str53 = (String) objArr105[0];
                                        int i446 = -TextUtils.getOffsetBefore(str, 0);
                                        Object[] objArr106 = new Object[1];
                                        bravo((char) (((i446 | 50222) << 1) - (i446 ^ 50222)), 1985 - TextUtils.indexOf(str, str), Color.red(0) + 19, objArr106);
                                        String str54 = (String) objArr106[0];
                                        int i447 = -TextUtils.indexOf(str, str, 0);
                                        int alpha7 = M2.alpha();
                                        int i448 = i447 * 46;
                                        int i449 = (i448 & 2318768) + (i448 | 2318768);
                                        int i450 = ~((~alpha7) | (-50409));
                                        int i451 = (i449 - (~(((i450 & i447) | (i447 ^ i450)) * (-90)))) - 1;
                                        int i452 = -(-(((~(((-50409) & alpha7) | ((-50409) ^ alpha7))) | (~((i447 ^ 50408) | (50408 & i447)))) * (-45)));
                                        int i453 = ((i451 | i452) << 1) - (i452 ^ i451);
                                        int i454 = ~i447;
                                        int i455 = ~((i454 & alpha7) | (i454 ^ alpha7));
                                        int i456 = (i455 & (-50409)) | ((-50409) ^ i455);
                                        int i457 = ~alpha7;
                                        int i458 = ~((i447 & i457) | (i457 ^ i447));
                                        int i459 = -(-(((i458 & i456) | (i456 ^ i458)) * 45));
                                        int i460 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int i461 = (i460 & 2004) + (i460 | 2004);
                                        int i462 = -(KeyEvent.getMaxKeyCode() >> 16);
                                        int i463 = ((i462 | 14) << 1) - (i462 ^ 14);
                                        Object[] objArr107 = new Object[1];
                                        bravo((char) ((i453 ^ i459) + ((i459 & i453) << 1)), i461, i463, objArr107);
                                        String[] strArr19 = {str53, str54, (String) objArr107[0]};
                                        int i464 = -Color.alpha(0);
                                        int i465 = -(-KeyEvent.normalizeMetaState(0));
                                        int i466 = (i465 & 2018) + (i465 | 2018);
                                        int pressedStateDuration4 = ViewConfiguration.getPressedStateDuration() >> 16;
                                        int alpha8 = M2.alpha();
                                        int i467 = pressedStateDuration4 * (-813);
                                        int i468 = (i467 & 8568) + (i467 | 8568);
                                        int i469 = ~((-22) | pressedStateDuration4);
                                        int i470 = ~((pressedStateDuration4 ^ alpha8) | (pressedStateDuration4 & alpha8));
                                        int i471 = (((i469 ^ i470) | (i469 & i470)) * (-814)) + i468;
                                        int i472 = ~alpha8;
                                        int i473 = ~(((-22) ^ i472) | ((-22) & i472));
                                        int i474 = ~pressedStateDuration4;
                                        int i475 = ~((i474 ^ 21) | (i474 & 21));
                                        int i476 = (i473 ^ i475) | (i473 & i475);
                                        int i477 = ((i470 & i476) | (i476 ^ i470)) * HttpConstants.HTTP_PROXY_AUTH;
                                        int i478 = (i471 ^ i477) + ((i477 & i471) << 1);
                                        int i479 = ~pressedStateDuration4;
                                        int i480 = (~((i479 & alpha8) | (i479 ^ alpha8))) | (~((i479 ^ 21) | (i479 & 21)));
                                        int i481 = ~((alpha8 & 21) | (alpha8 ^ 21));
                                        int i482 = -(-(((i480 & i481) | (i480 ^ i481)) * HttpConstants.HTTP_PROXY_AUTH));
                                        int i483 = (i478 & i482) + (i482 | i478);
                                        Object[] objArr108 = new Object[1];
                                        bravo((char) ((i464 & 40467) + (i464 | 40467)), i466, i483, objArr108);
                                        String str55 = (String) objArr108[0];
                                        char c30 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57329);
                                        int i484 = 2038 - (~(-View.getDefaultSize(0, 0)));
                                        int i485 = -(-View.MeasureSpec.getMode(0));
                                        int i486 = (i485 & 10) + (i485 | 10);
                                        Object[] objArr109 = new Object[1];
                                        bravo(c30, i484, i486, objArr109);
                                        String[] strArr20 = {str55, (String) objArr109[0]};
                                        char combineMeasuredStates4 = (char) View.combineMeasuredStates(0, 0);
                                        int i487 = -View.resolveSize(0, 0);
                                        int i488 = ((i487 | 2049) << 1) - (i487 ^ 2049);
                                        int i489 = -Color.blue(0);
                                        int i490 = (i489 & 11) + (i489 | 11);
                                        Object[] objArr110 = new Object[1];
                                        bravo(combineMeasuredStates4, i488, i490, objArr110);
                                        String str56 = (String) objArr110[0];
                                        char mode4 = (char) View.MeasureSpec.getMode(0);
                                        int i491 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                        Object[] objArr111 = new Object[1];
                                        bravo(mode4, ((i491 | 587) << 1) - (i491 ^ 587), 4 - (~(-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), objArr111);
                                        String[] strArr21 = {str56, (String) objArr111[0]};
                                        char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i492 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                        Object[] objArr112 = new Object[1];
                                        bravo(keyRepeatDelay4, (i492 & 2060) + (i492 | 2060), 28 - View.MeasureSpec.getMode(0), objArr112);
                                        String str57 = (String) objArr112[0];
                                        int i493 = -KeyEvent.normalizeMetaState(0);
                                        int i494 = -(-Drawable.resolveOpacity(0, 0));
                                        int i495 = (i494 ^ 2039) + ((i494 & 2039) << 1);
                                        int i496 = -(-TextUtils.lastIndexOf(str, '0', 0, 0));
                                        Object[] objArr113 = new Object[1];
                                        bravo((char) ((i493 & 57330) + (i493 | 57330)), i495, (i496 ^ 11) + ((i496 & 11) << 1), objArr113);
                                        String[][] strArr22 = {strArr18, strArr19, strArr20, strArr21, new String[]{str57, (String) objArr113[0]}};
                                        charlie = (delta + 103) % 128;
                                        i41 = 0;
                                        int i497 = -1;
                                        loop7: while (true) {
                                            if (i41 < 5) {
                                                i42 = i37;
                                                strArr5 = strArr4;
                                                i43 = i4;
                                                break;
                                            }
                                            String[] strArr23 = strArr22[i41];
                                            String str58 = strArr23[0];
                                            int i498 = 1;
                                            String[] strArr24 = (String[]) Arrays.copyOfRange(strArr23, 1, strArr23.length);
                                            int length = strArr24.length;
                                            int i499 = 0;
                                            while (i499 < length) {
                                                int i500 = i497 + 12;
                                                i497 = ((i500 | (-11)) << i498) - (i500 ^ (-11));
                                                int i501 = i498;
                                                Object[] objArr114 = new Object[2];
                                                objArr114[i501] = strArr24[i499];
                                                objArr114[0] = str58;
                                                Object D887126 = uH18377.D8871(1214576837);
                                                if (D887126 == null) {
                                                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 52;
                                                    int resolveOpacity = 3314 - Drawable.resolveOpacity(0, 0);
                                                    i42 = i37;
                                                    char c31 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                    i46 = i41;
                                                    byte b53 = (byte) 1;
                                                    byte b54 = b53;
                                                    strArr6 = strArr24;
                                                    strArr5 = strArr4;
                                                    str5 = str58;
                                                    Object[] objArr115 = new Object[1];
                                                    charlie(b53, b54, (byte) (b54 + 1), objArr115);
                                                    D887126 = uH18377.setPivotYN16904(deadChar2, resolveOpacity, c31, -1746970096, false, (String) objArr115[0], new Class[]{String.class, String.class});
                                                } else {
                                                    i42 = i37;
                                                    i46 = i41;
                                                    strArr6 = strArr24;
                                                    strArr5 = strArr4;
                                                    str5 = str58;
                                                }
                                                long longValue17 = ((Long) ((Method) D887126).invoke(null, objArr114)).longValue();
                                                long j123 = -569165176;
                                                long j124 = (HttpConstants.HTTP_PROXY_AUTH * longValue17) + ((-405) * j123);
                                                long j125 = -406;
                                                long j126 = longValue17 ^ j7;
                                                long j127 = ((HttpConstants.HTTP_NOT_ACCEPTABLE * ((((j123 ^ j7) | j51) ^ j7) | ((j52 | longValue17) ^ j7))) + ((j125 * (((j126 | j52) | j123) ^ j7)) + (((((j126 | j51) ^ j7) | (((j52 | j123) | longValue17) ^ j7)) * j125) + j124))) - 978473162;
                                                int i502 = ~((int) SystemClock.uptimeMillis());
                                                if (((((int) j127) & (((i4 | 147712) * 54) + (((~(1454524736 | i4)) | 147712 | (~((-1454524737) | i14))) * 54) + ((((~(17298326 | i14)) | (-1471675351)) * (-108)) - 245402793))) | (((int) (j127 >> c3)) & ((((~(i502 | 974838823)) | (-563455397)) * 494) + (((-25502081) | i502) * 494) + 611318782))) != 0) {
                                                    i43 = ((i497 & 170) + (i497 | 170)) ^ i4;
                                                    break loop7;
                                                }
                                                i499 = (i499 & 1) + (i499 | 1);
                                                i37 = i42;
                                                i41 = i46;
                                                strArr24 = strArr6;
                                                strArr4 = strArr5;
                                                str58 = str5;
                                                i498 = 1;
                                            }
                                            i41++;
                                        }
                                        int i503 = (~(i4 & i42)) & (i4 | i42);
                                        int i504 = -i503;
                                        int i505 = ((i503 & i504) | (i503 ^ i504)) >> 31;
                                        int i506 = i43 & (~i505);
                                        int i507 = i42 & i505;
                                        int i508 = (i506 & i507) | (i506 ^ i507);
                                        Object[] objArr116 = new Object[1];
                                        bravo((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode(str, 0, 0) + 2088, TextUtils.getOffsetAfter(str, 0) + 13, objArr116);
                                        String str59 = (String) objArr116[0];
                                        char c32 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                                        Object[] objArr117 = new Object[1];
                                        bravo(c32, ((modifierMetaStateMask3 | 2102) << 1) - (modifierMetaStateMask3 ^ 2102), 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr117);
                                        str3 = (String) objArr117[0];
                                        file2 = new File(str59);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                                Object[] objArr118 = new Object[1];
                                                bravo((char) (47016 - TextUtils.getCapsMode(str, 0, 0)), 592 - (~(-(-((Process.getThreadPriority(0) + 20) >> 6)))), 1 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr118);
                                                useDelimiter = scanner2.useDelimiter((String) objArr118[0]);
                                                if (useDelimiter.hasNext()) {
                                                    str4 = str;
                                                } else {
                                                    int i509 = delta;
                                                    charlie = (((i509 | 115) << 1) - (i509 ^ 115)) % 128;
                                                    str4 = useDelimiter.next();
                                                }
                                                useDelimiter.close();
                                            } catch (IOException unused2) {
                                            }
                                            if (str4.contains(str3)) {
                                                int i510 = charlie;
                                                delta = (((i510 | 103) << 1) - (i510 ^ 103)) % 128;
                                                i44 = i4 ^ 150;
                                                int i511 = (~(i4 & i508)) & (i4 | i508);
                                                int i512 = (i511 | (-i511)) >> 31;
                                                int i513 = i44 & (~i512);
                                                int i514 = i508 & i512;
                                                int i515 = (i514 & i513) | (i513 ^ i514);
                                                int i516 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int alpha9 = M2.alpha();
                                                int i517 = i516 * 628;
                                                int i518 = (((alpha9 ^ 29491) | (alpha9 & 29491) | (~i516)) * (-627)) + (i517 & 18520348) + (i517 | 18520348);
                                                int i519 = ~(((-29492) & alpha9) | ((-29492) ^ alpha9));
                                                int i520 = (i518 - (~(-(-(((i519 & i516) | (i516 ^ i519)) * (-627)))))) - 1;
                                                int i521 = ~((~alpha9) | 29491);
                                                int i522 = ~((i516 & alpha9) | (i516 ^ alpha9));
                                                char c33 = (char) ((i520 - (~(((i522 & i521) | (i521 ^ i522)) * 627))) - 1);
                                                int keyCodeFromString6 = 2109 - KeyEvent.keyCodeFromString(str);
                                                int i523 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                int i524 = (i523 ^ 46) + ((i523 & 46) << 1);
                                                Object[] objArr119 = new Object[1];
                                                bravo(c33, keyCodeFromString6, i524, objArr119);
                                                Object[] objArr120 = {(String) objArr119[0]};
                                                D88716 = uH18377.D8871(1565484532);
                                                if (D88716 == null) {
                                                    int packedPositionGroup6 = 52 - ExpandableListView.getPackedPositionGroup(0L);
                                                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 2951;
                                                    char lastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str, '0'));
                                                    byte b55 = (byte) 1;
                                                    byte b56 = b55;
                                                    Object[] objArr121 = new Object[1];
                                                    charlie(b55, b56, (byte) (b56 + 1), objArr121);
                                                    D88716 = uH18377.setPivotYN16904(packedPositionGroup6, tapTimeout3, lastIndexOf3, -2097887455, false, (String) objArr121[0], new Class[]{String.class});
                                                }
                                                long longValue18 = ((Long) ((Method) D88716).invoke(null, objArr120)).longValue();
                                                long j128 = 457625458;
                                                long j129 = 569;
                                                long j130 = j128 ^ j7;
                                                long j131 = longValue18 ^ j7;
                                                long j132 = j130 | j131;
                                                long j133 = ((-1136) * ((j132 ^ j7) | ((j130 | j52) ^ j7) | ((j131 | j52) ^ j7))) + (j129 * longValue18) + (j129 * j128);
                                                long j134 = j52 | j128;
                                                long j135 = (Smooth$Close.expectedVersionCode * (((j52 | longValue18) ^ j7) | (j134 ^ j7) | ((j132 | j51) ^ j7))) + ((-568) * (((j130 | j51) ^ j7) | ((j131 | j51) ^ j7) | ((j134 | longValue18) ^ j7))) + j133 + 497528444;
                                                int i525 = ((int) (j135 >> c3)) & ((((~((-1085065166) | i14)) | 11306445 | (~(1425919965 | i4))) * 676) + (((~(352161245 | i14)) | 1073758720) * 676) + ((((-1073758721) | i4) * (-676)) - 84584470));
                                                int i526 = ((int) j135) & ((((~((-1879702885) | i14)) | 173408922) * 420) + (((~((-1879702885) | i4)) * 420) - 455758435));
                                                int i527 = ((i525 & i526) | (i525 ^ i526)) * 263;
                                                int i528 = (i527 & i14) | ((~i527) & i4);
                                                int i529 = (~(i4 & i515)) & (i4 | i515);
                                                int i530 = (i529 | (-i529)) >> 31;
                                                int i531 = i528 & (~i530);
                                                int i532 = i515 & i530;
                                                i342 = (i532 & i531) | (i531 ^ i532);
                                                strArr3 = strArr5;
                                            }
                                        }
                                        i45 = delta + 117;
                                        charlie = i45 % 128;
                                        if (i45 % 2 == 0) {
                                            throw null;
                                        }
                                        i44 = i4;
                                        int i5112 = (~(i4 & i508)) & (i4 | i508);
                                        int i5122 = (i5112 | (-i5112)) >> 31;
                                        int i5132 = i44 & (~i5122);
                                        int i5142 = i508 & i5122;
                                        int i5152 = (i5142 & i5132) | (i5132 ^ i5142);
                                        int i5162 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int alpha92 = M2.alpha();
                                        int i5172 = i5162 * 628;
                                        int i5182 = (((alpha92 ^ 29491) | (alpha92 & 29491) | (~i5162)) * (-627)) + (i5172 & 18520348) + (i5172 | 18520348);
                                        int i5192 = ~(((-29492) & alpha92) | ((-29492) ^ alpha92));
                                        int i5202 = (i5182 - (~(-(-(((i5192 & i5162) | (i5162 ^ i5192)) * (-627)))))) - 1;
                                        int i5212 = ~((~alpha92) | 29491);
                                        int i5222 = ~((i5162 & alpha92) | (i5162 ^ alpha92));
                                        char c332 = (char) ((i5202 - (~(((i5222 & i5212) | (i5212 ^ i5222)) * 627))) - 1);
                                        int keyCodeFromString62 = 2109 - KeyEvent.keyCodeFromString(str);
                                        int i5232 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        int i5242 = (i5232 ^ 46) + ((i5232 & 46) << 1);
                                        Object[] objArr1192 = new Object[1];
                                        bravo(c332, keyCodeFromString62, i5242, objArr1192);
                                        Object[] objArr1202 = {(String) objArr1192[0]};
                                        D88716 = uH18377.D8871(1565484532);
                                        if (D88716 == null) {
                                        }
                                        long longValue182 = ((Long) ((Method) D88716).invoke(null, objArr1202)).longValue();
                                        long j1282 = 457625458;
                                        long j1292 = 569;
                                        long j1302 = j1282 ^ j7;
                                        long j1312 = longValue182 ^ j7;
                                        long j1322 = j1302 | j1312;
                                        long j1332 = ((-1136) * ((j1322 ^ j7) | ((j1302 | j52) ^ j7) | ((j1312 | j52) ^ j7))) + (j1292 * longValue182) + (j1292 * j1282);
                                        long j1342 = j52 | j1282;
                                        long j1352 = (Smooth$Close.expectedVersionCode * (((j52 | longValue182) ^ j7) | (j1342 ^ j7) | ((j1322 | j51) ^ j7))) + ((-568) * (((j1302 | j51) ^ j7) | ((j1312 | j51) ^ j7) | ((j1342 | longValue182) ^ j7))) + j1332 + 497528444;
                                        int i5252 = ((int) (j1352 >> c3)) & ((((~((-1085065166) | i14)) | 11306445 | (~(1425919965 | i4))) * 676) + (((~(352161245 | i14)) | 1073758720) * 676) + ((((-1073758721) | i4) * (-676)) - 84584470));
                                        int i5262 = ((int) j1352) & ((((~((-1879702885) | i14)) | 173408922) * 420) + (((~((-1879702885) | i4)) * 420) - 455758435));
                                        int i5272 = ((i5252 & i5262) | (i5252 ^ i5262)) * 263;
                                        int i5282 = (i5272 & i14) | ((~i5272) & i4);
                                        int i5292 = (~(i4 & i5152)) & (i4 | i5152);
                                        int i5302 = (i5292 | (-i5292)) >> 31;
                                        int i5312 = i5282 & (~i5302);
                                        int i5322 = i5152 & i5302;
                                        i342 = (i5322 & i5312) | (i5312 ^ i5322);
                                        strArr3 = strArr5;
                                    }
                                } else {
                                    i36 = i352;
                                }
                                Object[] objArr122 = new Object[1];
                                bravo((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 370 - (ViewConfiguration.getTapTimeout() >> 16), 22 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), objArr122);
                                String str60 = (String) objArr122[0];
                                char c34 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int green3 = Color.green(0) + 810;
                                int i533 = -MotionEvent.axisFromString(str);
                                int i534 = (i533 & 9) + (i533 | 9);
                                Object[] objArr123 = new Object[1];
                                bravo(c34, green3, i534, objArr123);
                                String str61 = (String) objArr123[0];
                                Object[] objArr124 = new Object[1];
                                bravo((char) (44420 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))))), Gravity.getAbsoluteGravity(0, 0) + 820, 7 - Color.argb(0, 0, 0, 0), objArr124);
                                String str62 = (String) objArr124[0];
                                int i535 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int i536 = -(-Color.green(0));
                                int i537 = (i536 & 827) + (i536 | 827);
                                int i538 = -TextUtils.lastIndexOf(str, '0');
                                int i539 = ((i538 | 7) << 1) - (i538 ^ 7);
                                Object[] objArr125 = new Object[1];
                                bravo((char) ((49750 ^ i535) + ((i535 & 49750) << 1)), i537, i539, objArr125);
                                String[] strArr25 = {str60, str61, str62, (String) objArr125[0]};
                                char combineMeasuredStates5 = (char) View.combineMeasuredStates(0, 0);
                                int i540 = 836 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i541 = -View.resolveSize(0, 0);
                                int i542 = (i541 ^ 17) + ((i541 & 17) << 1);
                                Object[] objArr126 = new Object[1];
                                bravo(combineMeasuredStates5, i540, i542, objArr126);
                                String str63 = (String) objArr126[0];
                                char c35 = (char) (20132 - (~(-ExpandableListView.getPackedPositionType(0L))));
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i543 = (makeMeasureSpec2 ^ 852) + ((makeMeasureSpec2 & 852) << 1);
                                int capsMode = TextUtils.getCapsMode(str, 0, 0);
                                int i544 = (capsMode & 7) + (capsMode | 7);
                                Object[] objArr127 = new Object[1];
                                bravo(c35, i543, i544, objArr127);
                                String str64 = (String) objArr127[0];
                                int i545 = -TextUtils.lastIndexOf(str, '0');
                                int i546 = 858 - (~(-Color.alpha(0)));
                                int i547 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int i548 = (i547 & 7) + (i547 | 7);
                                Object[] objArr128 = new Object[1];
                                bravo((char) ((i545 ^ (-1)) + (i545 << 1)), i546, i548, objArr128);
                                String str65 = (String) objArr128[0];
                                char c36 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i549 = -View.getDefaultSize(0, 0);
                                int i550 = (i549 & 866) + (i549 | 866);
                                int i551 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int i552 = i551 * 55;
                                int i553 = (((~((~i551) | 11)) | (~((i14 ^ 11) | (i14 & 11)))) * (-108)) + (i552 ^ (-1177)) + ((i552 & (-1177)) << 1);
                                int i554 = ~i551;
                                int i555 = ~((i554 & i4) | (i554 ^ i4));
                                int i556 = ~(((-12) ^ i551) | ((-12) & i551));
                                int i557 = (i555 ^ i556) | (i555 & i556);
                                int i558 = ~((i14 ^ i551) | (i551 & i14));
                                int i559 = -(-(((i557 ^ i558) | (i558 & i557)) * 54));
                                int i560 = (i553 & i559) + (i559 | i553);
                                int i561 = -(-((i4 | i556) * 54));
                                int i562 = (i560 ^ i561) + ((i561 & i560) << 1);
                                Object[] objArr129 = new Object[1];
                                bravo(c36, i550, i562, objArr129);
                                String str66 = (String) objArr129[0];
                                int i563 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr130 = new Object[1];
                                bravo((char) (((i563 | 24048) << 1) - (i563 ^ 24048)), Color.alpha(0) + 877, (ViewConfiguration.getScrollBarSize() >> 8) + 14, objArr130);
                                String[] strArr26 = {str63, str64, str65, str66, (String) objArr130[0]};
                                char keyRepeatTimeout3 = (char) (23434 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int i564 = 890 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                                int i565 = -TextUtils.indexOf(str, str, 0, 0);
                                int i566 = ((i565 | 16) << 1) - (i565 ^ 16);
                                Object[] objArr131 = new Object[1];
                                bravo(keyRepeatTimeout3, i564, i566, objArr131);
                                String str67 = (String) objArr131[0];
                                int i567 = 954 - (~(-AndroidCharacter.getMirror('0')));
                                int indexOf8 = TextUtils.indexOf(str, str);
                                int i568 = (indexOf8 & 3) + (indexOf8 | 3);
                                Object[] objArr132 = new Object[1];
                                bravo((char) ((-TextUtils.lastIndexOf(str, '0')) - 1), i567, i568, objArr132);
                                String str68 = (String) objArr132[0];
                                char indexOf9 = (char) (59620 - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                int i569 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i570 = (i569 & 918) + (i569 | 918);
                                int i571 = -TextUtils.indexOf((CharSequence) str, '0', 0);
                                int i572 = (i571 ^ 21) + ((i571 & 21) << 1);
                                Object[] objArr133 = new Object[1];
                                bravo(indexOf9, i570, i572, objArr133);
                                String str69 = (String) objArr133[0];
                                char makeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i573 = 940 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                int i574 = -(-View.MeasureSpec.getMode(0));
                                int i575 = (i574 ^ 25) + ((i574 & 25) << 1);
                                Object[] objArr134 = new Object[1];
                                bravo(makeMeasureSpec3, i573, i575, objArr134);
                                String str70 = (String) objArr134[0];
                                char longPressTimeout4 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 1495);
                                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 965;
                                int i576 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int i577 = ((i576 | 28) << 1) - (i576 ^ 28);
                                Object[] objArr135 = new Object[1];
                                bravo(longPressTimeout4, maxKeyCode3, i577, objArr135);
                                String[] strArr27 = {str67, str68, str7, str69, str70, (String) objArr135[0]};
                                char c37 = (char) (11080 - (~View.MeasureSpec.getMode(0)));
                                int i578 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i579 = ((i578 | 993) << 1) - (i578 ^ 993);
                                int i580 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                int i581 = (i580 & 11) + (i580 | 11);
                                Object[] objArr136 = new Object[1];
                                bravo(c37, i579, i581, objArr136);
                                String str71 = (String) objArr136[0];
                                int i582 = -AndroidCharacter.getMirror('0');
                                int indexOf10 = TextUtils.indexOf((CharSequence) str, '0', 0);
                                int i583 = (indexOf10 & WebSocketProtocol.CLOSE_NO_STATUS_CODE) + (indexOf10 | WebSocketProtocol.CLOSE_NO_STATUS_CODE);
                                int i584 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int i585 = (i584 & 7) + (i584 | 7);
                                Object[] objArr137 = new Object[1];
                                bravo((char) ((i582 & 48) + (i582 | 48)), i583, i585, objArr137);
                                String str72 = (String) objArr137[0];
                                int i586 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i587 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                Object[] objArr138 = new Object[1];
                                bravo((char) ((i586 ^ 13259) + ((i586 & 13259) << 1)), (i587 ^ 1012) + ((i587 & 1012) << 1), 5 - (~(-View.resolveSizeAndState(0, 0, 0))), objArr138);
                                String str73 = (String) objArr138[0];
                                char offsetAfter3 = (char) TextUtils.getOffsetAfter(str, 0);
                                int alpha10 = 1018 - Color.alpha(0);
                                int i588 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int i589 = ((i588 | 5) << 1) - (i588 ^ 5);
                                Object[] objArr139 = new Object[1];
                                bravo(offsetAfter3, alpha10, i589, objArr139);
                                String[] strArr28 = {str71, str72, str73, (String) objArr139[0]};
                                int i590 = -(-TextUtils.lastIndexOf(str, '0'));
                                int i591 = -View.MeasureSpec.getMode(0);
                                int i592 = (i591 ^ Barcode.FORMAT_UPC_E) + ((i591 & Barcode.FORMAT_UPC_E) << 1);
                                int i593 = -(-Color.green(0));
                                int i594 = ((i593 | 16) << 1) - (i593 ^ 16);
                                Object[] objArr140 = new Object[1];
                                bravo((char) (((52368 | i590) << 1) - (i590 ^ 52368)), i592, i594, objArr140);
                                String str74 = (String) objArr140[0];
                                Object[] objArr141 = new Object[1];
                                bravo((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 858 - (~(-(-Drawable.resolveOpacity(0, 0)))), 6 - (~(-ExpandableListView.getPackedPositionGroup(0L))), objArr141);
                                String str75 = (String) objArr141[0];
                                char c38 = (char) (49749 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i595 = -(-Color.alpha(0));
                                int i596 = (i595 ^ 827) + ((i595 & 827) << 1);
                                int i597 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                Object[] objArr142 = new Object[1];
                                bravo(c38, i596, (i597 ^ 8) + ((i597 & 8) << 1), objArr142);
                                String[] strArr29 = {str74, str75, (String) objArr142[0]};
                                Object[] objArr143 = new Object[1];
                                bravo((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 1041, 13 - (~TextUtils.getOffsetAfter(str, 0)), objArr143);
                                String str76 = (String) objArr143[0];
                                char offsetBefore2 = (char) TextUtils.getOffsetBefore(str, 0);
                                int i598 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                Object[] objArr144 = new Object[1];
                                bravo(offsetBefore2, ((i598 | 1055) << 1) - (i598 ^ 1055), -((byte) KeyEvent.getModifierMetaStateMask()), objArr144);
                                String[] strArr30 = {str76, (String) objArr144[0]};
                                Object[] objArr145 = new Object[1];
                                bravo((char) (KeyEvent.getMaxKeyCode() >> 16), 1055 - (ViewConfiguration.getPressedStateDuration() >> 16), 8 - (~(-(-(ViewConfiguration.getEdgeSlop() >> 16)))), objArr145);
                                String str77 = (String) objArr145[0];
                                Object[] objArr146 = new Object[1];
                                bravo((char) TextUtils.getOffsetBefore(str, 0), 1063 - (~(-KeyEvent.getDeadChar(0, 0))), -TextUtils.lastIndexOf(str, '0', 0), objArr146);
                                String[] strArr31 = {str77, (String) objArr146[0]};
                                int rgb3 = Color.rgb(0, 0, 0);
                                char c39 = (char) ((16777216 & rgb3) + (rgb3 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE));
                                int i599 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i600 = (i599 ^ 1066) + ((i599 & 1066) << 1);
                                int i601 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i602 = ((i601 | 16) << 1) - (i601 ^ 16);
                                Object[] objArr147 = new Object[1];
                                bravo(c39, i600, i602, objArr147);
                                String str78 = (String) objArr147[0];
                                char c40 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i603 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                Object[] objArr148 = new Object[1];
                                bravo(c40, (i603 ^ 907) + ((i603 & 907) << 1), Color.blue(0) + 3, objArr148);
                                String str79 = (String) objArr148[0];
                                int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0);
                                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                                int i604 = (bitsPerPixel2 ^ 853) + ((bitsPerPixel2 & 853) << 1);
                                int i605 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i606 = ((i605 | 7) << 1) - (i605 ^ 7);
                                Object[] objArr149 = new Object[1];
                                bravo((char) ((absoluteGravity3 ^ 20133) + ((absoluteGravity3 & 20133) << 1)), i604, i606, objArr149);
                                String str80 = (String) objArr149[0];
                                char c41 = (char) (42261 - (~(-(-View.MeasureSpec.getMode(0)))));
                                int combineMeasuredStates6 = 1081 - View.combineMeasuredStates(0, 0);
                                int i607 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i608 = i607 * (-317);
                                int i609 = (i608 ^ 2552) + ((i608 & 2552) << 1);
                                int i610 = ~i607;
                                int i611 = ~((i610 ^ (-9)) | (i610 & (-9)) | i4);
                                int i612 = (i14 ^ i607) | (i14 & i607);
                                int i613 = ~((i612 ^ 8) | (i612 & 8));
                                int i614 = -(-(((i611 ^ i613) | (i611 & i613)) * (-318)));
                                int i615 = (i609 & i614) + (i614 | i609);
                                int i616 = ~(((-9) ^ i607) | ((-9) & i607));
                                int i617 = ~((i607 & i4) | (i607 ^ i4));
                                int i618 = (i615 - (~(((i616 & i617) | (i616 ^ i617)) * (-318)))) - 1;
                                int i619 = ~((i610 ^ i4) | (i610 & i4));
                                int i620 = ((i619 & (-9)) | ((-9) ^ i619)) * 318;
                                int i621 = (i618 & i620) + (i618 | i620);
                                Object[] objArr150 = new Object[1];
                                bravo(c41, combineMeasuredStates6, i621, objArr150);
                                String str81 = (String) objArr150[0];
                                char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i622 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr151 = new Object[1];
                                bravo(jumpTapTimeout4, (i622 & 866) + (i622 | 866), View.getDefaultSize(0, 0) + 11, objArr151);
                                String str82 = (String) objArr151[0];
                                int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                int alpha11 = M2.alpha();
                                int i623 = windowTouchSlop3 * (-375);
                                int i624 = ((-9017625) & i623) + (i623 | (-9017625));
                                int i625 = ~windowTouchSlop3;
                                int i626 = ~((i625 & (-24048)) | (i625 ^ (-24048)));
                                int i627 = (i626 & alpha11) | (alpha11 ^ i626);
                                int i628 = ~((windowTouchSlop3 & 24047) | (windowTouchSlop3 ^ 24047));
                                int i629 = (i624 - (~(-(-(((i627 & i628) | (i627 ^ i628)) * 376))))) - 1;
                                int i630 = ~alpha11;
                                int i631 = (i628 | (~((i630 ^ windowTouchSlop3) | (i630 & windowTouchSlop3)))) * (-376);
                                int i632 = ((i629 | i631) << 1) - (i629 ^ i631);
                                int i633 = ~windowTouchSlop3;
                                int i634 = -(-(((~((i633 & alpha11) | (i633 ^ alpha11))) | 24047) * 376));
                                int i635 = -(ViewConfiguration.getTouchSlop() >> 8);
                                Object[] objArr152 = new Object[1];
                                bravo((char) ((i632 ^ i634) + ((i634 & i632) << 1)), (i635 ^ 877) + ((i635 & 877) << 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, objArr152);
                                String[] strArr32 = {str78, str79, str80, str81, str82, (String) objArr152[0]};
                                char trimmedLength4 = (char) TextUtils.getTrimmedLength(str);
                                int i636 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                Object[] objArr153 = new Object[1];
                                bravo(trimmedLength4, ((i636 | 1089) << 1) - (i636 ^ 1089), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, objArr153);
                                String str83 = (String) objArr153[0];
                                int i637 = -View.combineMeasuredStates(0, 0);
                                int i638 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1109;
                                int i639 = -(-TextUtils.getOffsetBefore(str, 0));
                                Object[] objArr154 = new Object[1];
                                bravo((char) ((57373 & i637) + (i637 | 57373)), i638, (i639 & 19) + (i639 | 19), objArr154);
                                String str84 = (String) objArr154[0];
                                int i640 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int lastIndexOf4 = TextUtils.lastIndexOf(str, '0', 0, 0);
                                Object[] objArr155 = new Object[1];
                                bravo((char) (((i640 | 5675) << 1) - (i640 ^ 5675)), (lastIndexOf4 ^ 1129) + ((lastIndexOf4 & 1129) << 1), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr155);
                                String str85 = (String) objArr155[0];
                                int i641 = -KeyEvent.keyCodeFromString(str);
                                int keyCodeFromString7 = KeyEvent.keyCodeFromString(str);
                                int i642 = (keyCodeFromString7 & 1159) + (keyCodeFromString7 | 1159);
                                int i643 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i644 = ~i643;
                                int i645 = ~((i644 ^ (-28)) | (i644 & (-28)));
                                int i646 = (((i643 * (-445)) - 12015) - (~(-(-(((~((-28) | i14)) | i645) * 446))))) - 1;
                                int i647 = ~((i644 ^ 27) | (i644 & 27));
                                int i648 = ((-28) ^ i643) | ((-28) & i643);
                                int i649 = ~((i648 ^ i4) | (i648 & i4));
                                int i650 = (((((i647 ^ i649) | (i647 & i649)) * 446) + i646) - (~(i645 * 446))) - 1;
                                Object[] objArr156 = new Object[1];
                                bravo((char) (((46924 | i641) << 1) - (i641 ^ 46924)), i642, i650, objArr156);
                                String str86 = (String) objArr156[0];
                                int tapTimeout4 = ViewConfiguration.getTapTimeout() >> 16;
                                int i651 = tapTimeout4 * ModuleDescriptor.MODULE_VERSION;
                                int i652 = ((-6703692) & i651) + (i651 | (-6703692));
                                int i653 = ~tapTimeout4;
                                int i654 = ~((48228 ^ i653) | (48228 & i653));
                                int i655 = ~tapTimeout4;
                                int i656 = ~((i655 ^ i4) | (i655 & i4));
                                int i657 = ((i654 | i656) * (-280)) + i652;
                                int i658 = ~(((-48229) ^ i4) | ((-48229) & i4));
                                int i659 = (i657 - (~(-(-(((i656 ^ i658) | (i658 & i656)) * 140))))) - 1;
                                int i660 = ~((-48229) | i653 | i4);
                                int i661 = ~(i653 | i100 | 48228);
                                int i662 = (i661 & i660) | (i660 ^ i661);
                                int i663 = ((-48229) ^ i100) | ((-48229) & i100);
                                int i664 = ~((tapTimeout4 & i663) | (i663 ^ tapTimeout4));
                                int i665 = ((i664 & i662) | (i662 ^ i664)) * 140;
                                Object[] objArr157 = new Object[1];
                                bravo((char) (((i659 | i665) << 1) - (i665 ^ i659)), 1184 - (~(-(-TextUtils.indexOf(str, str)))), 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr157);
                                String str87 = (String) objArr157[0];
                                char myTid2 = (char) (Process.myTid() >> 22);
                                int i666 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                int i667 = (i666 & 1208) + (i666 | 1208);
                                int i668 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i669 = ((i668 | 32) << 1) - (i668 ^ 32);
                                Object[] objArr158 = new Object[1];
                                bravo(myTid2, i667, i669, objArr158);
                                String[] strArr33 = {str83, str84, str85, str86, str87, (String) objArr158[0], str7};
                                Object[] objArr159 = new Object[1];
                                bravo((char) (ViewConfiguration.getTouchSlop() >> 8), 1241 - TextUtils.getOffsetAfter(str, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, objArr159);
                                String str88 = (String) objArr159[0];
                                char c42 = (char) (44420 - (~(-Drawable.resolveOpacity(0, 0))));
                                int i670 = -(-Drawable.resolveOpacity(0, 0));
                                int i671 = ((i670 | 820) << 1) - (i670 ^ 820);
                                int i672 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                Object[] objArr160 = new Object[1];
                                bravo(c42, i671, ((i672 | 7) << 1) - (i672 ^ 7), objArr160);
                                String[] strArr34 = {str88, (String) objArr160[0]};
                                char size2 = (char) (7772 - View.MeasureSpec.getSize(0));
                                int i673 = 1254 - (~(-(-TextUtils.lastIndexOf(str, '0', 0))));
                                int i674 = -(-ImageFormat.getBitsPerPixel(0));
                                Object[] objArr161 = new Object[1];
                                bravo(size2, i673, ((i674 | 31) << 1) - (i674 ^ 31), objArr161);
                                String str89 = (String) objArr161[0];
                                char packedPositionGroup7 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int i675 = -KeyEvent.keyCodeFromString(str);
                                Object[] objArr162 = new Object[1];
                                bravo(packedPositionGroup7, (i675 ^ 1284) + ((i675 & 1284) << 1), 9 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0))), objArr162);
                                String[] strArr35 = {str89, (String) objArr162[0]};
                                char indexOf11 = (char) (TextUtils.indexOf(str, str) + 15822);
                                int i676 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                Object[] objArr163 = new Object[1];
                                bravo(indexOf11, ((i676 | 1296) << 1) - (i676 ^ 1296), 17 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr163);
                                String str90 = (String) objArr163[0];
                                char red4 = (char) Color.red(0);
                                int jumpTapTimeout5 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int alpha12 = M2.alpha();
                                int i677 = jumpTapTimeout5 * HttpConstants.HTTP_UNAVAILABLE;
                                int i678 = (i677 ^ 660942) + ((i677 & 660942) << 1);
                                int i679 = (jumpTapTimeout5 & 1314) | (jumpTapTimeout5 ^ 1314);
                                int i680 = i679 * (-502);
                                int i681 = (i678 & i680) + (i678 | i680);
                                int i682 = ~jumpTapTimeout5;
                                int i683 = ~((i682 & (-1315)) | (i682 ^ (-1315)));
                                int i684 = ~((~alpha12) | i682);
                                int i685 = (i683 ^ i684) | (i683 & i684);
                                int i686 = ~(i679 | alpha12);
                                int i687 = (i681 - (~(((i685 ^ i686) | (i685 & i686)) * (-502)))) - 1;
                                int i688 = ~alpha12;
                                int i689 = (i682 ^ i688) | (i688 & i682);
                                int i690 = ((~((i689 & 1314) | (i689 ^ 1314))) | (~((i679 ^ alpha12) | (i679 & alpha12)))) * HttpConstants.HTTP_BAD_GATEWAY;
                                Object[] objArr164 = new Object[1];
                                bravo(red4, ((i687 | i690) << 1) - (i687 ^ i690), TextUtils.getOffsetBefore(str, 0) + 5, objArr164);
                                String[] strArr36 = {str90, (String) objArr164[0]};
                                char indexOf12 = (char) TextUtils.indexOf(str, str, 0);
                                int offsetBefore3 = TextUtils.getOffsetBefore(str, 0) + 1319;
                                int i691 = -(-Process.getGidForName(str));
                                int i692 = (i691 & 20) + (i691 | 20);
                                Object[] objArr165 = new Object[1];
                                bravo(indexOf12, offsetBefore3, i692, objArr165);
                                String[] strArr37 = {(String) objArr165[0]};
                                int pressedStateDuration5 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int i693 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i694 = (i693 ^ 1338) + ((i693 & 1338) << 1);
                                int i695 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                Object[] objArr166 = new Object[1];
                                bravo((char) ((pressedStateDuration5 ^ 1368) + ((pressedStateDuration5 & 1368) << 1)), i694, (i695 ^ 16) + ((i695 & 16) << 1), objArr166);
                                String[] strArr38 = {(String) objArr166[0]};
                                char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 44935);
                                int i696 = -(ViewConfiguration.getTouchSlop() >> 8);
                                Object[] objArr167 = new Object[1];
                                bravo(bitsPerPixel3, (i696 & 1354) + (i696 | 1354), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, objArr167);
                                String[] strArr39 = {(String) objArr167[0]};
                                char c43 = (char) (34351 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                int i697 = 1372 - (~(-(Process.myPid() >> 22)));
                                int maximumFlingVelocity4 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                Object[] objArr168 = new Object[1];
                                bravo(c43, i697, (maximumFlingVelocity4 ^ 19) + ((maximumFlingVelocity4 & 19) << 1), objArr168);
                                String[] strArr40 = {(String) objArr168[0]};
                                Object[] objArr169 = new Object[1];
                                bravo((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4523), (ViewConfiguration.getPressedStateDuration() >> 16) + 1392, 22 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr169);
                                String[] strArr41 = {(String) objArr169[0]};
                                char normalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 27329);
                                int i698 = 1414 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8))));
                                int indexOf13 = TextUtils.indexOf(str, str, 0);
                                Object[] objArr170 = new Object[1];
                                bravo(normalizeMetaState, i698, (indexOf13 ^ 21) + ((indexOf13 & 21) << 1), objArr170);
                                String[] strArr42 = {(String) objArr170[0]};
                                int i699 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int threadPriority = Process.getThreadPriority(0);
                                Object[] objArr171 = new Object[1];
                                bravo((char) ((i699 & 1) + (i699 | 1)), 1435 - (~(((threadPriority & 20) + (threadPriority | 20)) >> 6)), 23 - (~(-Color.alpha(0))), objArr171);
                                String[] strArr43 = {(String) objArr171[0], str7};
                                int indexOf14 = TextUtils.indexOf(str, str);
                                Object[] objArr172 = new Object[1];
                                bravo((char) ((54188 ^ indexOf14) + ((indexOf14 & 54188) << 1)), 1460 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28, objArr172);
                                String[] strArr44 = {(String) objArr172[0], str7};
                                char alpha13 = (char) Color.alpha(0);
                                int i700 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i701 = -(-View.combineMeasuredStates(0, 0));
                                Object[] objArr173 = new Object[1];
                                bravo(alpha13, (i700 ^ 1489) + ((i700 & 1489) << 1), ((i701 | 27) << 1) - (i701 ^ 27), objArr173);
                                String[] strArr45 = {(String) objArr173[0], str7};
                                int i702 = -Color.rgb(0, 0, 0);
                                int i703 = i702 * 989;
                                int i704 = ((-620756992) & i703) + (i703 | (-620756992));
                                int i705 = (16777215 ^ i14) | (16777215 & i14);
                                int i706 = ~((i705 ^ i702) | (i705 & i702));
                                int i707 = (i702 ^ ShapeBuilder.DEFAULT_SHAPE_COLOR) | (i702 & ShapeBuilder.DEFAULT_SHAPE_COLOR);
                                int i708 = ~((i707 ^ i4) | (i707 & i4));
                                int i709 = -(-(((i706 ^ i708) | (i706 & i708)) * 988));
                                int i710 = (((i702 ^ 16777215) | (i702 & 16777215)) * (-988)) + (i704 & i709) + (i709 | i704);
                                int i711 = ~i702;
                                int i712 = ~((i711 & 16777215) | (i711 ^ 16777215));
                                int i713 = ~((16777215 ^ i4) | (16777215 & i4));
                                int i714 = (i100 & i702) | (i100 ^ i702);
                                int i715 = -(-(((~((i714 & ShapeBuilder.DEFAULT_SHAPE_COLOR) | ((-16777216) ^ i714))) | (i712 ^ i713) | (i712 & i713)) * 988));
                                Object[] objArr174 = new Object[1];
                                bravo((char) ((i710 ^ i715) + ((i715 & i710) << 1)), 1515 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 30 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr174);
                                String[] strArr46 = {(String) objArr174[0], str7};
                                char c44 = (char) (13230 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int i716 = 1545 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
                                int i717 = -(-Gravity.getAbsoluteGravity(0, 0));
                                Object[] objArr175 = new Object[1];
                                bravo(c44, i716, (i717 ^ 27) + ((i717 & 27) << 1), objArr175);
                                String[] strArr47 = {(String) objArr175[0], str7};
                                int indexOf15 = TextUtils.indexOf(str, str, 0, 0);
                                char c45 = (char) ((indexOf15 ^ 22999) + ((indexOf15 & 22999) << 1));
                                int i718 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                int i719 = (i718 ^ 1573) + ((i718 & 1573) << 1);
                                int i720 = -(-Color.blue(0));
                                Object[] objArr176 = new Object[1];
                                bravo(c45, i719, ((i720 | 32) << 1) - (i720 ^ 32), objArr176);
                                String[][] strArr48 = {strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, new String[]{(String) objArr176[0], str7}};
                                char c46 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i721 = -(Process.myTid() >> 22);
                                int alpha14 = M2.alpha();
                                int i722 = (i721 * (-344)) - 552120;
                                int i723 = ~i721;
                                int i724 = ~((i723 ^ (-1606)) | (i723 & (-1606)));
                                int i725 = ~(i723 | alpha14);
                                int i726 = ((i724 & i725) | (i724 ^ i725)) * 345;
                                int i727 = (i722 & i726) + (i722 | i726);
                                int i728 = -(-(((~((i721 & (-1606)) | ((-1606) ^ i721))) | (~((~alpha14) | i723))) * 345));
                                int i729 = (i727 ^ i728) + ((i728 & i727) << 1);
                                int i730 = (~(i723 | (-1606) | alpha14)) * 345;
                                int i731 = (i729 & i730) + (i730 | i729);
                                int i732 = 0;
                                int i733 = -Color.red(0);
                                int i734 = 1;
                                int i735 = ((i733 | 1) << 1) - (i733 ^ 1);
                                Object[] objArr177 = new Object[1];
                                bravo(c46, i731, i735, objArr177);
                                StringBuilder sb2 = new StringBuilder((String) objArr177[0]);
                                int i736 = i4;
                                int i737 = 0;
                                int i738 = 0;
                                while (i737 < 24) {
                                    String[] strArr49 = strArr48[i737];
                                    Object[] objArr178 = new Object[i734];
                                    objArr178[i732] = strArr49[i732];
                                    Object D887127 = uH18377.D8871(i16);
                                    if (D887127 == null) {
                                        int alpha15 = 52 - Color.alpha(i732);
                                        int lastIndexOf5 = 3157 - TextUtils.lastIndexOf(str, '0', i732, i732);
                                        char c47 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58073);
                                        byte b57 = (byte) i732;
                                        int i739 = i732;
                                        byte b58 = b57;
                                        i38 = i737;
                                        i39 = i736;
                                        Object[] objArr179 = new Object[1];
                                        charlie(b57, b58, (byte) (b58 + 2), objArr179);
                                        String str91 = (String) objArr179[i739];
                                        Class[] clsArr2 = new Class[1];
                                        clsArr2[i739] = String.class;
                                        D887127 = uH18377.setPivotYN16904(alpha15, lastIndexOf5, c47, 424179844, false, str91, clsArr2);
                                    } else {
                                        i38 = i737;
                                        i39 = i736;
                                    }
                                    String str92 = (String) ((Method) D887127).invoke(null, objArr178);
                                    String[] strArr50 = (String[]) Arrays.copyOfRange(strArr49, 1, strArr49.length);
                                    if (str92 != null) {
                                        int i740 = charlie + 55;
                                        delta = i740 % 128;
                                        if (i740 % 2 == 0) {
                                            throw null;
                                        }
                                        if (!str92.isEmpty()) {
                                            if (strArr49.length != 1) {
                                                int length2 = strArr50.length;
                                                for (int i741 = 0; i741 < length2; i741 = (i741 | 1) + (i741 & 1)) {
                                                    int i742 = charlie + 25;
                                                    delta = i742 % 128;
                                                    if (i742 % 2 == 0) {
                                                        str92.contains(strArr50[i741]);
                                                        throw null;
                                                    }
                                                    if (!str92.contains(strArr50[i741])) {
                                                    }
                                                }
                                                int i743 = charlie;
                                                delta = (((i743 | 47) << 1) - (i743 ^ 47)) % 128;
                                            }
                                            int i744 = i38 + 10;
                                            i736 = (i744 & i14) | ((~i744) & i4);
                                            int i745 = (i738 ^ (-125)) + ((i738 & (-125)) << 1);
                                            i738 = (i745 & 126) + (i745 | 126);
                                            if (i738 > 1) {
                                                int i746 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i747 = -TextUtils.indexOf(str, str, 0, 0);
                                                c11 = 0;
                                                Object[] objArr180 = new Object[1];
                                                bravo((char) ((i746 & 1) + (i746 | 1)), (i747 ^ 1606) + ((i747 & 1606) << 1), 0 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr180);
                                                sb2.append((String) objArr180[0]);
                                            } else {
                                                c11 = 0;
                                            }
                                            sb2.append(strArr49[c11]);
                                            Object[] objArr181 = new Object[1];
                                            bravo((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47636), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1607, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr181);
                                            sb2.append((String) objArr181[0]);
                                            sb2.append(str92);
                                            i737 = i38 + 1;
                                            i732 = 0;
                                            i734 = 1;
                                        }
                                    }
                                    i736 = i39;
                                    i737 = i38 + 1;
                                    i732 = 0;
                                    i734 = 1;
                                }
                                int i748 = i736;
                                Object[] objArr182 = new Object[1];
                                bravo((char) (8976 - View.MeasureSpec.getMode(0)), 1608 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), -Process.getGidForName(str), objArr182);
                                sb2.append((String) objArr182[0]);
                                Object[] objArr183 = new Object[2];
                                if (i738 > 2) {
                                    objArr183[1] = new int[1];
                                    String[] strArr51 = {sb2.toString()};
                                    ((int[]) objArr183[1])[0] = i748;
                                    objArr183[0] = strArr51;
                                } else {
                                    int[] iArr = new int[1];
                                    objArr183[1] = iArr;
                                    iArr[0] = i4;
                                    objArr183[0] = new String[0];
                                }
                                int i749 = ((int[]) objArr183[1])[0];
                                int i750 = (~(i4 & i36)) & (i4 | i36);
                                int i751 = (i750 | (-i750)) >> 31;
                                i37 = (i749 & (~i751)) | (i36 & i751);
                                strArr4 = (String[]) objArr183[0];
                                int i3592 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int alpha62 = Color.alpha(0);
                                int i3602 = (alpha62 ^ 891) + ((alpha62 & 891) << 1);
                                int i3612 = -Color.blue(0);
                                int i3622 = (i3612 ^ 16) + ((i3612 & 16) << 1);
                                Object[] objArr752 = new Object[1];
                                bravo((char) ((i3592 ^ 23434) + ((i3592 & 23434) << 1)), i3602, i3622, objArr752);
                                Object[] objArr762 = {(String) objArr752[0]};
                                D88715 = uH18377.D8871(i16);
                                if (D88715 == null) {
                                }
                                invoke = ((Method) D88715).invoke(null, objArr762);
                                if (invoke != null) {
                                }
                                if (i40 != 1986687685) {
                                    char trimmedLength22 = (char) TextUtils.getTrimmedLength(str);
                                    int i3642 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    Object[] objArr802 = new Object[1];
                                    bravo(trimmedLength22, (i3642 ^ 1610) + ((i3642 & 1610) << 1), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr802);
                                    String str332 = (String) objArr802[0];
                                    char c232 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                    int tapTimeout22 = ViewConfiguration.getTapTimeout() >> 16;
                                    int i3652 = (tapTimeout22 & 1624) + (tapTimeout22 | 1624);
                                    int i3662 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                    int i3672 = (i3662 ^ 25) + ((i3662 & 25) << 1);
                                    Object[] objArr812 = new Object[1];
                                    bravo(c232, i3652, i3672, objArr812);
                                    String str342 = (String) objArr812[0];
                                    int i3682 = -(-View.MeasureSpec.getSize(0));
                                    int i3692 = ((i3682 | 1650) << 1) - (i3682 ^ 1650);
                                    int i3702 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int i3712 = (i3702 ^ 17) + ((i3702 & 17) << 1);
                                    Object[] objArr822 = new Object[1];
                                    bravo((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), i3692, i3712, objArr822);
                                    String str352 = (String) objArr822[0];
                                    int i3722 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i3732 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    Object[] objArr832 = new Object[1];
                                    bravo((char) (((i3722 | 62609) << 1) - (i3722 ^ 62609)), ((i3732 | 1667) << 1) - (i3732 ^ 1667), 15 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr832);
                                    String str362 = (String) objArr832[0];
                                    char indexOf62 = (char) TextUtils.indexOf(str, str, 0, 0);
                                    int i3742 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                    int i3752 = (i3742 ^ 1683) + ((i3742 & 1683) << 1);
                                    int i3762 = -AndroidCharacter.getMirror('0');
                                    int i3772 = (i3762 & 63) + (i3762 | 63);
                                    Object[] objArr842 = new Object[1];
                                    bravo(indexOf62, i3752, i3772, objArr842);
                                    String str372 = (String) objArr842[0];
                                    char keyRepeatDelay32 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int packedPositionGroup32 = ExpandableListView.getPackedPositionGroup(0L);
                                    int i3782 = ((packedPositionGroup32 | 1699) << 1) - (packedPositionGroup32 ^ 1699);
                                    int i3792 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                    int i3802 = ((i3792 | 37) << 1) - (i3792 ^ 37);
                                    Object[] objArr852 = new Object[1];
                                    bravo(keyRepeatDelay32, i3782, i3802, objArr852);
                                    String str382 = (String) objArr852[0];
                                    int i3812 = -Color.alpha(0);
                                    int packedPositionGroup42 = ExpandableListView.getPackedPositionGroup(0L) + 1736;
                                    int i3822 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i3832 = (i3822 ^ 12) + ((i3822 & 12) << 1);
                                    Object[] objArr862 = new Object[1];
                                    bravo((char) ((i3812 ^ 21305) + ((i3812 & 21305) << 1)), packedPositionGroup42, i3832, objArr862);
                                    String str392 = (String) objArr862[0];
                                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int i3842 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                    int i3852 = ((i3842 | 1747) << 1) - (i3842 ^ 1747);
                                    int i3862 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                    int i3872 = ((i3862 | 14) << 1) - (i3862 ^ 14);
                                    Object[] objArr872 = new Object[1];
                                    bravo(doubleTapTimeout2, i3852, i3872, objArr872);
                                    String str402 = (String) objArr872[0];
                                    char c242 = (char) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1)));
                                    int i3882 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i3892 = ((i3882 | 1760) << 1) - (i3882 ^ 1760);
                                    int i3902 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int i3912 = (i3902 & 22) + (i3902 | 22);
                                    Object[] objArr882 = new Object[1];
                                    bravo(c242, i3892, i3912, objArr882);
                                    String str412 = (String) objArr882[0];
                                    char c252 = (char) (43426 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int i3922 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    int i3932 = (i3922 ^ 1783) + ((i3922 & 1783) << 1);
                                    int i3942 = -Color.argb(0, 0, 0, 0);
                                    int i3952 = (i3942 & 31) + (i3942 | 31);
                                    Object[] objArr892 = new Object[1];
                                    bravo(c252, i3932, i3952, objArr892);
                                    String str422 = (String) objArr892[0];
                                    int keyCodeFromString32 = KeyEvent.keyCodeFromString(str);
                                    int i3962 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i3972 = (i3962 & 1815) + (i3962 | 1815);
                                    int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                    int i3982 = (maximumDrawingCacheSize3 & 12) + (maximumDrawingCacheSize3 | 12);
                                    Object[] objArr902 = new Object[1];
                                    bravo((char) ((keyCodeFromString32 ^ 58964) + ((keyCodeFromString32 & 58964) << 1)), i3972, i3982, objArr902);
                                    String str432 = (String) objArr902[0];
                                    char c262 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i3992 = -View.resolveSize(0, 0);
                                    Object[] objArr912 = new Object[1];
                                    bravo(c262, ((i3992 | 1826) << 1) - (i3992 ^ 1826), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr912);
                                    String str442 = (String) objArr912[0];
                                    int i4002 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int i4012 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                    Object[] objArr922 = new Object[1];
                                    bravo((char) ((i4002 ^ 43501) + ((i4002 & 43501) << 1)), (i4012 ^ 1838) + ((i4012 & 1838) << 1), 11 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr922);
                                    String str452 = (String) objArr922[0];
                                    char c272 = (char) (28549 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))));
                                    int i4022 = -TextUtils.getCapsMode(str, 0, 0);
                                    int i4032 = (i4022 ^ 1850) + ((i4022 & 1850) << 1);
                                    int i4042 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i4052 = (i4042 ^ 13) + ((i4042 & 13) << 1);
                                    Object[] objArr932 = new Object[1];
                                    bravo(c272, i4032, i4052, objArr932);
                                    String str462 = (String) objArr932[0];
                                    char red32 = (char) Color.red(0);
                                    int i4062 = 1861 - (~Drawable.resolveOpacity(0, 0));
                                    int i4072 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int i4082 = (i4072 & 12) + (i4072 | 12);
                                    Object[] objArr942 = new Object[1];
                                    bravo(red32, i4062, i4082, objArr942);
                                    String str472 = (String) objArr942[0];
                                    char longPressTimeout32 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int keyCodeFromString42 = KeyEvent.keyCodeFromString(str);
                                    Object[] objArr952 = new Object[1];
                                    bravo(longPressTimeout32, (keyCodeFromString42 ^ 1874) + ((keyCodeFromString42 & 1874) << 1), 13 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr952);
                                    String str482 = (String) objArr952[0];
                                    char indexOf72 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                    int i4092 = -(-View.resolveSize(0, 0));
                                    int i4102 = ((i4092 | 1888) << 1) - (i4092 ^ 1888);
                                    int keyCodeFromString52 = KeyEvent.keyCodeFromString(str);
                                    int i4112 = (keyCodeFromString52 & 12) + (keyCodeFromString52 | 12);
                                    Object[] objArr962 = new Object[1];
                                    bravo(indexOf72, i4102, i4112, objArr962);
                                    c12 = 0;
                                    String str492 = (String) objArr962[0];
                                    char c282 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i4122 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1900;
                                    int i4132 = -TextUtils.getCapsMode(str, 0, 0);
                                    int i4142 = ((i4132 | 24) << 1) - (i4132 ^ 24);
                                    Object[] objArr972 = new Object[1];
                                    bravo(c282, i4122, i4142, objArr972);
                                    String str502 = (String) objArr972[0];
                                    char maximumDrawingCacheSize22 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i4152 = -TextUtils.indexOf(str, str, 0);
                                    i47 = 1;
                                    Object[] objArr982 = new Object[1];
                                    bravo(maximumDrawingCacheSize22, (i4152 ^ 1924) + ((i4152 & 1924) << 1), 28 - KeyEvent.normalizeMetaState(0), objArr982);
                                    strArr7 = new String[]{str332, str342, str352, str362, str372, str382, str392, str402, str412, str422, str432, str442, str452, str462, str472, str482, str492, str502, (String) objArr982[0]};
                                    i48 = 0;
                                    i49 = 19;
                                    while (true) {
                                        if (i48 < i49) {
                                        }
                                        i48 = ((i50 | 1) << i418) - (i50 ^ 1);
                                        strArr7 = strArr8;
                                        i49 = 19;
                                        c12 = 0;
                                        i47 = 1;
                                    }
                                    int i4262 = (i50 & 130) + (i50 | 130);
                                    int i4272 = (i4262 | i4) & (~(i4 & i4262));
                                    int i4282 = ~i50;
                                    int i4292 = -i4282;
                                    int i4302 = ((i4282 & i4292) | (i4282 ^ i4292)) >> 31;
                                    int i4312 = (~i4302) & i4;
                                    int i4322 = i4272 & i4302;
                                    int i4332 = (i4322 & i4312) | (i4312 ^ i4322);
                                    int i4342 = ((~i37) & i4) | (i37 & i14);
                                    int i4352 = -i4342;
                                    int i4362 = ((i4342 & i4352) | (i4342 ^ i4352)) >> 31;
                                    int i4372 = i4332 & (~i4362);
                                    int i4382 = i37 & i4362;
                                    i37 = (i4382 & i4372) | (i4372 ^ i4382);
                                }
                                char myPid52 = (char) (Process.myPid() >> 22);
                                int offsetAfter22 = TextUtils.getOffsetAfter(str, 0);
                                Object[] objArr1032 = new Object[1];
                                bravo(myPid52, (offsetAfter22 & 1952) + (offsetAfter22 | 1952), 12 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr1032);
                                String str522 = (String) objArr1032[0];
                                char resolveSize52 = (char) View.resolveSize(0, 0);
                                int i4392 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i4402 = (i4392 & 1966) + (i4392 | 1966);
                                int i4412 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i4422 = (i4412 ^ 5) + ((i4412 & 5) << 1);
                                Object[] objArr1042 = new Object[1];
                                bravo(resolveSize52, i4402, i4422, objArr1042);
                                String[] strArr182 = {str522, (String) objArr1042[0]};
                                char c292 = (char) ((-2) - ((-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))) ^ (-1)));
                                int blue22 = Color.blue(0);
                                int i4432 = (blue22 ^ 1970) + ((blue22 & 1970) << 1);
                                int i4442 = -KeyEvent.normalizeMetaState(0);
                                int i4452 = (i4442 ^ 15) + ((i4442 & 15) << 1);
                                Object[] objArr1052 = new Object[1];
                                bravo(c292, i4432, i4452, objArr1052);
                                String str532 = (String) objArr1052[0];
                                int i4462 = -TextUtils.getOffsetBefore(str, 0);
                                Object[] objArr1062 = new Object[1];
                                bravo((char) (((i4462 | 50222) << 1) - (i4462 ^ 50222)), 1985 - TextUtils.indexOf(str, str), Color.red(0) + 19, objArr1062);
                                String str542 = (String) objArr1062[0];
                                int i4472 = -TextUtils.indexOf(str, str, 0);
                                int alpha72 = M2.alpha();
                                int i4482 = i4472 * 46;
                                int i4492 = (i4482 & 2318768) + (i4482 | 2318768);
                                int i4502 = ~((~alpha72) | (-50409));
                                int i4512 = (i4492 - (~(((i4502 & i4472) | (i4472 ^ i4502)) * (-90)))) - 1;
                                int i4522 = -(-(((~(((-50409) & alpha72) | ((-50409) ^ alpha72))) | (~((i4472 ^ 50408) | (50408 & i4472)))) * (-45)));
                                int i4532 = ((i4512 | i4522) << 1) - (i4522 ^ i4512);
                                int i4542 = ~i4472;
                                int i4552 = ~((i4542 & alpha72) | (i4542 ^ alpha72));
                                int i4562 = (i4552 & (-50409)) | ((-50409) ^ i4552);
                                int i4572 = ~alpha72;
                                int i4582 = ~((i4472 & i4572) | (i4572 ^ i4472));
                                int i4592 = -(-(((i4582 & i4562) | (i4562 ^ i4582)) * 45));
                                int i4602 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int i4612 = (i4602 & 2004) + (i4602 | 2004);
                                int i4622 = -(KeyEvent.getMaxKeyCode() >> 16);
                                int i4632 = ((i4622 | 14) << 1) - (i4622 ^ 14);
                                Object[] objArr1072 = new Object[1];
                                bravo((char) ((i4532 ^ i4592) + ((i4592 & i4532) << 1)), i4612, i4632, objArr1072);
                                String[] strArr192 = {str532, str542, (String) objArr1072[0]};
                                int i4642 = -Color.alpha(0);
                                int i4652 = -(-KeyEvent.normalizeMetaState(0));
                                int i4662 = (i4652 & 2018) + (i4652 | 2018);
                                int pressedStateDuration42 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int alpha82 = M2.alpha();
                                int i4672 = pressedStateDuration42 * (-813);
                                int i4682 = (i4672 & 8568) + (i4672 | 8568);
                                int i4692 = ~((-22) | pressedStateDuration42);
                                int i4702 = ~((pressedStateDuration42 ^ alpha82) | (pressedStateDuration42 & alpha82));
                                int i4712 = (((i4692 ^ i4702) | (i4692 & i4702)) * (-814)) + i4682;
                                int i4722 = ~alpha82;
                                int i4732 = ~(((-22) ^ i4722) | ((-22) & i4722));
                                int i4742 = ~pressedStateDuration42;
                                int i4752 = ~((i4742 ^ 21) | (i4742 & 21));
                                int i4762 = (i4732 ^ i4752) | (i4732 & i4752);
                                int i4772 = ((i4702 & i4762) | (i4762 ^ i4702)) * HttpConstants.HTTP_PROXY_AUTH;
                                int i4782 = (i4712 ^ i4772) + ((i4772 & i4712) << 1);
                                int i4792 = ~pressedStateDuration42;
                                int i4802 = (~((i4792 & alpha82) | (i4792 ^ alpha82))) | (~((i4792 ^ 21) | (i4792 & 21)));
                                int i4812 = ~((alpha82 & 21) | (alpha82 ^ 21));
                                int i4822 = -(-(((i4802 & i4812) | (i4802 ^ i4812)) * HttpConstants.HTTP_PROXY_AUTH));
                                int i4832 = (i4782 & i4822) + (i4822 | i4782);
                                Object[] objArr1082 = new Object[1];
                                bravo((char) ((i4642 & 40467) + (i4642 | 40467)), i4662, i4832, objArr1082);
                                String str552 = (String) objArr1082[0];
                                char c302 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57329);
                                int i4842 = 2038 - (~(-View.getDefaultSize(0, 0)));
                                int i4852 = -(-View.MeasureSpec.getMode(0));
                                int i4862 = (i4852 & 10) + (i4852 | 10);
                                Object[] objArr1092 = new Object[1];
                                bravo(c302, i4842, i4862, objArr1092);
                                String[] strArr202 = {str552, (String) objArr1092[0]};
                                char combineMeasuredStates42 = (char) View.combineMeasuredStates(0, 0);
                                int i4872 = -View.resolveSize(0, 0);
                                int i4882 = ((i4872 | 2049) << 1) - (i4872 ^ 2049);
                                int i4892 = -Color.blue(0);
                                int i4902 = (i4892 & 11) + (i4892 | 11);
                                Object[] objArr1102 = new Object[1];
                                bravo(combineMeasuredStates42, i4882, i4902, objArr1102);
                                String str562 = (String) objArr1102[0];
                                char mode42 = (char) View.MeasureSpec.getMode(0);
                                int i4912 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                Object[] objArr1112 = new Object[1];
                                bravo(mode42, ((i4912 | 587) << 1) - (i4912 ^ 587), 4 - (~(-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), objArr1112);
                                String[] strArr212 = {str562, (String) objArr1112[0]};
                                char keyRepeatDelay42 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i4922 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                Object[] objArr1122 = new Object[1];
                                bravo(keyRepeatDelay42, (i4922 & 2060) + (i4922 | 2060), 28 - View.MeasureSpec.getMode(0), objArr1122);
                                String str572 = (String) objArr1122[0];
                                int i4932 = -KeyEvent.normalizeMetaState(0);
                                int i4942 = -(-Drawable.resolveOpacity(0, 0));
                                int i4952 = (i4942 ^ 2039) + ((i4942 & 2039) << 1);
                                int i4962 = -(-TextUtils.lastIndexOf(str, '0', 0, 0));
                                Object[] objArr1132 = new Object[1];
                                bravo((char) ((i4932 & 57330) + (i4932 | 57330)), i4952, (i4962 ^ 11) + ((i4962 & 11) << 1), objArr1132);
                                String[][] strArr222 = {strArr182, strArr192, strArr202, strArr212, new String[]{str572, (String) objArr1132[0]}};
                                charlie = (delta + 103) % 128;
                                i41 = 0;
                                int i4972 = -1;
                                loop7: while (true) {
                                    if (i41 < 5) {
                                    }
                                    i41++;
                                }
                                int i5032 = (~(i4 & i42)) & (i4 | i42);
                                int i5042 = -i5032;
                                int i5052 = ((i5032 & i5042) | (i5032 ^ i5042)) >> 31;
                                int i5062 = i43 & (~i5052);
                                int i5072 = i42 & i5052;
                                int i5082 = (i5062 & i5072) | (i5062 ^ i5072);
                                Object[] objArr1162 = new Object[1];
                                bravo((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode(str, 0, 0) + 2088, TextUtils.getOffsetAfter(str, 0) + 13, objArr1162);
                                String str592 = (String) objArr1162[0];
                                char c322 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                byte modifierMetaStateMask32 = (byte) KeyEvent.getModifierMetaStateMask();
                                Object[] objArr1172 = new Object[1];
                                bravo(c322, ((modifierMetaStateMask32 | 2102) << 1) - (modifierMetaStateMask32 ^ 2102), 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr1172);
                                str3 = (String) objArr1172[0];
                                file2 = new File(str592);
                                if (file2.exists()) {
                                    Scanner scanner22 = new Scanner(new FileInputStream(file2));
                                    Object[] objArr1182 = new Object[1];
                                    bravo((char) (47016 - TextUtils.getCapsMode(str, 0, 0)), 592 - (~(-(-((Process.getThreadPriority(0) + 20) >> 6)))), 1 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr1182);
                                    useDelimiter = scanner22.useDelimiter((String) objArr1182[0]);
                                    if (useDelimiter.hasNext()) {
                                    }
                                    useDelimiter.close();
                                    if (str4.contains(str3)) {
                                    }
                                }
                                i45 = delta + 117;
                                charlie = i45 % 128;
                                if (i45 % 2 == 0) {
                                }
                            } else {
                                strArr3 = null;
                            }
                            int[] iArr2 = new int[1];
                            int i752 = (~(i4 & i342)) & (i4 | i342);
                            int i753 = -i752;
                            int i754 = (((i752 & i753) | (i752 ^ i753)) >> 31) & 16;
                            Object[] objArr184 = {new int[]{i342}, new int[]{i4}, iArr2, strArr3};
                            int i755 = ((i4 | 342176621) * 104) + ((~(360545261 | i14)) * (-104)) + (((~((-24991909) | i4)) | 6623268) * 104) + 836347177;
                            int i756 = -(-((i755 ^ i754) + ((i755 & i754) << 1)));
                            int i757 = (i10 & i756) + (i10 | i756);
                            int i758 = i757 << 13;
                            int i759 = (i758 | i757) & (~(i757 & i758));
                            int i760 = i759 ^ (i759 >>> 17);
                            int i761 = i760 << 5;
                            iArr2[0] = ((~i760) & i761) | ((~i761) & i760);
                            return objArr184;
                        }
                    }
                    char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i762 = -(-TextUtils.indexOf(str, str, 0, 0));
                    int i763 = ((i762 | 595) << 1) - (i762 ^ 595);
                    int alpha16 = Color.alpha(0);
                    int i764 = (alpha16 & 13) + (alpha16 | 13);
                    Object[] objArr185 = new Object[1];
                    bravo(doubleTapTimeout3, i763, i764, objArr185);
                    String str93 = (String) objArr185[0];
                    int scrollBarFadeDuration4 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    Object[] objArr186 = new Object[1];
                    bravo((char) ((scrollBarFadeDuration4 & 28792) + (scrollBarFadeDuration4 | 28792)), 607 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 9 - View.getDefaultSize(0, 0), objArr186);
                    Object[] objArr187 = {str93, (String) objArr186[0]};
                    D88713 = uH18377.D8871(1214576837);
                    if (D88713 == null) {
                        int offsetAfter4 = TextUtils.getOffsetAfter(str, 0) + 52;
                        int normalizeMetaState2 = 3314 - KeyEvent.normalizeMetaState(0);
                        char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        byte b59 = (byte) 1;
                        byte b60 = b59;
                        Object[] objArr188 = new Object[1];
                        charlie(b59, b60, (byte) (b60 + 1), objArr188);
                        D88713 = uH18377.setPivotYN16904(offsetAfter4, normalizeMetaState2, tapTimeout5, -1746970096, false, (String) objArr188[0], new Class[]{String.class, String.class});
                    }
                    long longValue19 = ((Long) ((Method) D88713).invoke(null, objArr187)).longValue();
                    long j136 = -388230216;
                    long j137 = ((-50) * (j136 | j51)) + ((-49) * longValue19) + (51 * j136);
                    long j138 = 50;
                    long j139 = longValue19 ^ j31;
                    long j140 = j139 | j52;
                    j6 = ((j138 * (((j140 ^ j31) | ((j139 | j136) ^ j31)) | ((j52 | j136) ^ j31))) + (((((((j136 ^ j31) | j139) | j51) ^ j31) | ((j140 | j136) ^ j31)) * j138) + j137)) - 1159408122;
                    i26 = ~((int) Runtime.getRuntime().maxMemory());
                    if (((((int) j6) & ((((-1991511970) | i4) * 496) + (((~((-554285560) | i4)) | 17412182 | (~((-1454638593) | i14))) * (-496)) + ((r3 * 992) - 1537497691))) | (((int) (j6 >> c3)) & ((((~(i26 | (-1385317376))) | 1350713940) * 983) + (((~((-51909036) | i26)) | (-1385317376)) * (-983)) + 567970078))) == 0) {
                        int i765 = delta;
                        int i766 = (i765 ^ 113) + ((i765 & 113) << 1);
                        charlie = i766 % 128;
                        if (i766 % 2 != 0) {
                            i28 = ~(i4 & 4593);
                            i29 = i4 | 4593;
                        } else {
                            i28 = ~(i4 & 261);
                            i29 = i4 | 261;
                        }
                        i27 = i29 & i28;
                    } else {
                        i27 = i4;
                    }
                    int i2982 = ((~i268) & i4) | (i268 & i14);
                    int i2992 = -i2982;
                    int i3002 = ((i2982 & i2992) | (i2982 ^ i2992)) >> 31;
                    i30 = (i268 & i3002) | (i27 & (~i3002));
                    if ((i5 & 8) == 0) {
                    }
                    int scrollBarFadeDuration22 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    int i3232 = scrollBarFadeDuration22 * (-494);
                    int i3242 = ((~((38853 & scrollBarFadeDuration22) | (scrollBarFadeDuration22 ^ 38853))) * (-495)) + (i3232 & (-19193382)) + (i3232 | (-19193382));
                    int i3252 = -(-(((scrollBarFadeDuration22 ^ i14) | (scrollBarFadeDuration22 & i14)) * 495));
                    int i3262 = (i3242 ^ i3252) + ((i3242 & i3252) << 1);
                    int i3272 = ~scrollBarFadeDuration22;
                    int i3282 = ~((i3272 & (-38854)) | (i3272 ^ (-38854)));
                    int i3292 = ~((scrollBarFadeDuration22 & i100) | (i100 ^ scrollBarFadeDuration22));
                    Object[] objArr632 = new Object[1];
                    bravo((char) ((i3262 - (~(-(-(((i3292 & i3282) | (i3282 ^ i3292)) * 495))))) - 1), 737 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr632);
                    String str322 = (String) objArr632[0];
                    i31 = 1;
                    Object[] objArr642 = new Object[1];
                    bravo((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 780, 29 - (~(-(-KeyEvent.keyCodeFromString(str)))), objArr642);
                    c10 = 0;
                    strArr2 = new String[]{str322, (String) objArr642[0]};
                    i32 = 0;
                    while (true) {
                        if (i32 >= 2) {
                        }
                        int i3362 = ((i32 | (-88)) << 1) - (i32 ^ (-88));
                        i32 = (i3362 ^ 89) + ((i3362 & 89) << 1);
                        strArr2 = strArr9;
                        i30 = i33;
                        i31 = 1;
                        c10 = 0;
                    }
                    int i3372 = (~(i4 & i33)) & (i4 | i33);
                    int i3382 = -i3372;
                    int i3392 = ((i3372 & i3382) | (i3372 ^ i3382)) >> 31;
                    int i3402 = i34 & (~i3392);
                    int i3412 = i3392 & i33;
                    int i3422 = (i3402 & i3412) | (i3402 ^ i3412);
                    D88714 = uH18377.D8871(-344556366);
                    if (D88714 == null) {
                    }
                    long longValue112 = ((Long) ((Method) D88714).invoke(null, null)).longValue();
                    long j862 = 1853319230;
                    long j872 = -112;
                    long j882 = longValue112 ^ j7;
                    long j892 = j882 | j52;
                    long j902 = j862 ^ j7;
                    long j912 = ((113 * ((j882 | j51) ^ j7)) + (((-113) * ((((j902 | longValue112) ^ j7) | ((j902 | j51) ^ j7)) | ((j892 | j862) ^ j7))) + ((226 * (j862 | (j892 ^ j7))) + ((j872 * longValue112) + (j872 * j862))))) - 2005572328;
                    int elapsedCpuTime22 = (int) Process.getElapsedCpuTime();
                    foxtrot2 = ((int) (j912 >> c3)) & A0.z.foxtrot((~(elapsedCpuTime22 | 1399392832)) | (~(37833578 | elapsedCpuTime22)) | (-1399409515), -1444, (((~elapsedCpuTime22) | (-1361592619)) * 1444) - 1153123274, -477640588);
                    i35 = ((int) j912) & ((((~((-1573401210) | i4)) | (-1573746686)) * 49) + (((~((-1284339677) | i14)) | (-1573401210) | (~(1284339676 | i4))) * (-49)) + (((~((-1573401210) | i14)) | 289407009) * 98) + 1791379743);
                    if (((i35 & foxtrot2) | (foxtrot2 ^ i35)) != 1) {
                    }
                    int[] iArr22 = new int[1];
                    int i7522 = (~(i4 & i3422)) & (i4 | i3422);
                    int i7532 = -i7522;
                    int i7542 = (((i7522 & i7532) | (i7522 ^ i7532)) >> 31) & 16;
                    Object[] objArr1842 = {new int[]{i3422}, new int[]{i4}, iArr22, strArr3};
                    int i7552 = ((i4 | 342176621) * 104) + ((~(360545261 | i14)) * (-104)) + (((~((-24991909) | i4)) | 6623268) * 104) + 836347177;
                    int i7562 = -(-((i7552 ^ i7542) + ((i7552 & i7542) << 1)));
                    int i7572 = (i10 & i7562) + (i10 | i7562);
                    int i7582 = i7572 << 13;
                    int i7592 = (i7582 | i7572) & (~(i7572 & i7582));
                    int i7602 = i7592 ^ (i7592 >>> 17);
                    int i7612 = i7602 << 5;
                    iArr22[0] = ((~i7602) & i7612) | ((~i7612) & i7602);
                    return objArr1842;
                }
            }
            i20 = i4;
            int i2172 = i4 ^ i213;
            int i2182 = (i2172 | (-i2172)) >> 31;
            int i2192 = (i213 & i2182) | (i20 & (~i2182));
            char modifierMetaStateMask22 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int i2202 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i2212 = (i2202 & 347) + (i2202 | 347);
            int axisFromString2 = MotionEvent.axisFromString(str);
            int alpha42 = M2.alpha();
            int i2222 = axisFromString2 * (-344);
            int i2232 = (i2222 ^ (-6192)) + ((i2222 & (-6192)) << 1);
            int i2242 = ~axisFromString2;
            int i2252 = ~((i2242 ^ (-19)) | (i2242 & (-19)));
            int i2262 = ~((i2242 ^ alpha42) | (i2242 & alpha42));
            int i2272 = ((i2252 ^ i2262) | (i2252 & i2262)) * 345;
            int i2282 = (((~(i2242 | (~alpha42))) | (~(((-19) ^ axisFromString2) | ((-19) & axisFromString2)))) * 345) + (((i2232 | i2272) << 1) - (i2232 ^ i2272));
            int i2292 = ~axisFromString2;
            int i2302 = (i2292 & (-19)) | (i2292 ^ (-19));
            int i2312 = (~((i2302 & alpha42) | (i2302 ^ alpha42))) * 345;
            int i2322 = (i2282 & i2312) + (i2312 | i2282);
            Object[] objArr392 = new Object[1];
            bravo(modifierMetaStateMask22, i2212, i2322, objArr392);
            String str222 = (String) objArr392[0];
            char myTid3 = (char) (47887 - (Process.myTid() >> 22));
            int i2332 = 364 - (~(-(-TextUtils.lastIndexOf(str, '0', 0, 0))));
            int i2342 = -AndroidCharacter.getMirror('0');
            int i2352 = ((i2342 | 54) << 1) - (i2342 ^ 54);
            Object[] objArr402 = new Object[1];
            bravo(myTid3, i2332, i2352, objArr402);
            Object[] objArr412 = {str222, (String) objArr402[0]};
            D8871 = uH18377.D8871(1214576837);
            if (D8871 == null) {
            }
            long longValue82 = ((Long) ((Method) D8871).invoke(null, objArr412)).longValue();
            long j712 = -853065835;
            long j722 = longValue82 ^ j31;
            long j732 = ((-865) * (j722 | (((j712 ^ j31) | j52) ^ j31))) + ((-864) * longValue82) + (866 * j712);
            long j742 = 865;
            j5 = ((j742 * (((j722 | j52) ^ j31) | ((j52 | j712) ^ j31))) + ((((j712 | j51) ^ j31) * j742) + j732)) - 694572503;
            uptimeMillis = (int) SystemClock.uptimeMillis();
            i21 = ~uptimeMillis;
            if (((((int) j5) & ((((~(1332100511 | i4)) | (~((-136323333) | i14)) | (~((-1090651282) | i14))) * 140) + (((~(1195777179 | i4)) | (~(241449230 | i4))) * 140) + (((136323332 | r3) * (-280)) - 1899153095))) | (((int) (j5 >> c3)) & A0.z.foxtrot((~((-890153735) | uptimeMillis)) | (~((-547072677) | i21)) | (-899656615), -370, (((~((-547072677) | uptimeMillis)) | (~((-890153735) | i21))) * (-370)) + 635053406, 2134501538))) == 0) {
            }
            int i2362 = ((~i2192) & i4) | (i2192 & i14);
            int i2372 = -i2362;
            int i2382 = ((i2362 & i2372) | (i2362 ^ i2372)) >> 31;
            int i2392 = (i2192 & i2382) | (i22 & (~i2382));
            Object[] objArr432 = new Object[1];
            bravo((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 370, (-16777194) - (~(-Color.rgb(0, 0, 0))), objArr432);
            Object[] objArr442 = {(String) objArr432[0]};
            D88712 = uH18377.D8871(i16);
            if (D88712 == null) {
            }
            String lowerCase2 = ((String) ((Method) D88712).invoke(null, objArr442)).toLowerCase();
            char c192 = (char) (3169 - (~(-KeyEvent.keyCodeFromString(str))));
            int i2412 = -(Process.myTid() >> 22);
            int i2422 = (i2412 ^ 393) + ((i2412 & 393) << 1);
            int i2432 = -(-Process.getGidForName(str));
            int i2442 = ((i2432 | 5) << 1) - (i2432 ^ 5);
            Object[] objArr462 = new Object[1];
            bravo(c192, i2422, i2442, objArr462);
            if (!lowerCase2.contains((String) objArr462[0])) {
            }
            int i2462 = i4 ^ i2392;
            int i2472 = -i2462;
            int i2482 = ((i2462 & i2472) | (i2462 ^ i2472)) >> 31;
            int i2492 = (i2392 & i2482) | (i245 & (~i2482));
            char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i2502 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr472 = new Object[1];
            bravo(windowTouchSlop4, ((i2502 | 397) << 1) - (i2502 ^ 397), 40 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr472);
            String str232 = (String) objArr472[0];
            char c202 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i2512 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr482 = new Object[1];
            bravo(c202, (i2512 & 440) + (i2512 | 440), 40 - Drawable.resolveOpacity(0, 0), objArr482);
            String str242 = (String) objArr482[0];
            char keyRepeatDelay22 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i2522 = 479 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i2532 = -TextUtils.getOffsetBefore(str, 0);
            int i2542 = (i2532 ^ 27) + ((i2532 & 27) << 1);
            Object[] objArr492 = new Object[1];
            bravo(keyRepeatDelay22, i2522, i2542, objArr492);
            String str252 = (String) objArr492[0];
            int i2552 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr502 = new Object[1];
            bravo((char) ((i2552 & 14847) + (i2552 | 14847)), (ViewConfiguration.getPressedStateDuration() >> 16) + 506, 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr502);
            String str262 = (String) objArr502[0];
            int i2562 = -(Process.myPid() >> 22);
            int i2572 = -View.combineMeasuredStates(0, 0);
            Object[] objArr512 = new Object[1];
            bravo((char) ((i2562 ^ 5943) + ((i2562 & 5943) << 1)), (i2572 & 533) + (i2572 | 533), 26 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr512);
            String str272 = (String) objArr512[0];
            int rgb4 = Color.rgb(0, 0, 0);
            int i2582 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i2592 = (i2582 & 559) + (i2582 | 559);
            c4 = 0;
            int resolveSize32 = View.resolveSize(0, 0);
            i23 = 1;
            int i2602 = ((resolveSize32 | 27) << 1) - (resolveSize32 ^ 27);
            Object[] objArr522 = new Object[1];
            bravo((char) ((rgb4 & 16814124) + (rgb4 | 16814124)), i2592, i2602, objArr522);
            strArr = new String[]{str232, str242, str252, str262, str272, (String) objArr522[0]};
            i24 = 0;
            while (true) {
                if (i24 < 6) {
                }
                i24 = i52 + 1;
                strArr = strArr11;
                c4 = 0;
                i23 = 1;
            }
            int i2642 = ((~i2492) & i4) | (i2492 & i14);
            int i2652 = (i2642 | (-i2642)) >> 31;
            int i2662 = i25 & (~i2652);
            int i2672 = i2492 & i2652;
            int i2682 = (i2672 & i2662) | (i2662 ^ i2672);
            Object[] objArr552 = new Object[1];
            bravo((char) KeyEvent.keyCodeFromString(str), 346 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), 16 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr552);
            String str292 = (String) objArr552[0];
            char windowTouchSlop22 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i2692 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            Object[] objArr562 = new Object[1];
            bravo(windowTouchSlop22, (i2692 & 587) + (i2692 | 587), 6 - KeyEvent.normalizeMetaState(0), objArr562);
            str2 = (String) objArr562[0];
            file = new File(str292);
            if (file.exists()) {
                Scanner scanner3 = new Scanner(new FileInputStream(file));
                int i2702 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                int alpha52 = M2.alpha();
                int i2712 = i2702 * 628;
                int i2722 = (i2712 ^ 29526048) + ((i2712 & 29526048) << 1);
                int i2732 = (alpha52 ^ 47016) | (alpha52 & 47016);
                int i2742 = ~i2702;
                int i2752 = -(-(((i2732 ^ i2742) | (i2742 & i2732)) * (-627)));
                int i2762 = (i2722 ^ i2752) + ((i2722 & i2752) << 1);
                int i2772 = ~(((-47017) ^ alpha52) | ((-47017) & alpha52));
                int i2782 = (i2762 - (~(((i2702 ^ i2772) | (i2772 & i2702)) * (-627)))) - 1;
                int i2792 = ~alpha52;
                int i2802 = ~((i2792 ^ 47016) | (i2792 & 47016));
                int i2812 = ~((i2702 & alpha52) | (i2702 ^ alpha52));
                int i2822 = ((i2802 & i2812) | (i2802 ^ i2812)) * 627;
                Object[] objArr572 = new Object[1];
                bravo((char) ((i2782 & i2822) + (i2822 | i2782)), 593 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionChild(0L) + 3, objArr572);
                useDelimiter2 = scanner3.useDelimiter((String) objArr572[0]);
                if (useDelimiter2.hasNext()) {
                }
                useDelimiter2.close();
                if (str6.contains(str2)) {
                }
            }
            char doubleTapTimeout32 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i7622 = -(-TextUtils.indexOf(str, str, 0, 0));
            int i7632 = ((i7622 | 595) << 1) - (i7622 ^ 595);
            int alpha162 = Color.alpha(0);
            int i7642 = (alpha162 & 13) + (alpha162 | 13);
            Object[] objArr1852 = new Object[1];
            bravo(doubleTapTimeout32, i7632, i7642, objArr1852);
            String str932 = (String) objArr1852[0];
            int scrollBarFadeDuration42 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
            Object[] objArr1862 = new Object[1];
            bravo((char) ((scrollBarFadeDuration42 & 28792) + (scrollBarFadeDuration42 | 28792)), 607 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 9 - View.getDefaultSize(0, 0), objArr1862);
            Object[] objArr1872 = {str932, (String) objArr1862[0]};
            D88713 = uH18377.D8871(1214576837);
            if (D88713 == null) {
            }
            long longValue192 = ((Long) ((Method) D88713).invoke(null, objArr1872)).longValue();
            long j1362 = -388230216;
            long j1372 = ((-50) * (j1362 | j51)) + ((-49) * longValue192) + (51 * j1362);
            long j1382 = 50;
            long j1392 = longValue192 ^ j31;
            long j1402 = j1392 | j52;
            j6 = ((j1382 * (((j1402 ^ j31) | ((j1392 | j1362) ^ j31)) | ((j52 | j1362) ^ j31))) + (((((((j1362 ^ j31) | j1392) | j51) ^ j31) | ((j1402 | j1362) ^ j31)) * j1382) + j1372)) - 1159408122;
            i26 = ~((int) Runtime.getRuntime().maxMemory());
            if (((((int) j6) & ((((-1991511970) | i4) * 496) + (((~((-554285560) | i4)) | 17412182 | (~((-1454638593) | i14))) * (-496)) + ((r3 * 992) - 1537497691))) | (((int) (j6 >> c3)) & ((((~(i26 | (-1385317376))) | 1350713940) * 983) + (((~((-51909036) | i26)) | (-1385317376)) * (-983)) + 567970078))) == 0) {
            }
            int i29822 = ((~i2682) & i4) | (i2682 & i14);
            int i29922 = -i29822;
            int i30022 = ((i29822 & i29922) | (i29822 ^ i29922)) >> 31;
            i30 = (i2682 & i30022) | (i27 & (~i30022));
            if ((i5 & 8) == 0) {
            }
            int scrollBarFadeDuration222 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
            int i32322 = scrollBarFadeDuration222 * (-494);
            int i32422 = ((~((38853 & scrollBarFadeDuration222) | (scrollBarFadeDuration222 ^ 38853))) * (-495)) + (i32322 & (-19193382)) + (i32322 | (-19193382));
            int i32522 = -(-(((scrollBarFadeDuration222 ^ i14) | (scrollBarFadeDuration222 & i14)) * 495));
            int i32622 = (i32422 ^ i32522) + ((i32422 & i32522) << 1);
            int i32722 = ~scrollBarFadeDuration222;
            int i32822 = ~((i32722 & (-38854)) | (i32722 ^ (-38854)));
            int i32922 = ~((scrollBarFadeDuration222 & i100) | (i100 ^ scrollBarFadeDuration222));
            Object[] objArr6322 = new Object[1];
            bravo((char) ((i32622 - (~(-(-(((i32922 & i32822) | (i32822 ^ i32922)) * 495))))) - 1), 737 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr6322);
            String str3222 = (String) objArr6322[0];
            i31 = 1;
            Object[] objArr6422 = new Object[1];
            bravo((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 780, 29 - (~(-(-KeyEvent.keyCodeFromString(str)))), objArr6422);
            c10 = 0;
            strArr2 = new String[]{str3222, (String) objArr6422[0]};
            i32 = 0;
            while (true) {
                if (i32 >= 2) {
                }
                int i33622 = ((i32 | (-88)) << 1) - (i32 ^ (-88));
                i32 = (i33622 ^ 89) + ((i33622 & 89) << 1);
                strArr2 = strArr9;
                i30 = i33;
                i31 = 1;
                c10 = 0;
            }
            int i33722 = (~(i4 & i33)) & (i4 | i33);
            int i33822 = -i33722;
            int i33922 = ((i33722 & i33822) | (i33722 ^ i33822)) >> 31;
            int i34022 = i34 & (~i33922);
            int i34122 = i33922 & i33;
            int i34222 = (i34022 & i34122) | (i34022 ^ i34122);
            D88714 = uH18377.D8871(-344556366);
            if (D88714 == null) {
            }
            long longValue1122 = ((Long) ((Method) D88714).invoke(null, null)).longValue();
            long j8622 = 1853319230;
            long j8722 = -112;
            long j8822 = longValue1122 ^ j7;
            long j8922 = j8822 | j52;
            long j9022 = j8622 ^ j7;
            long j9122 = ((113 * ((j8822 | j51) ^ j7)) + (((-113) * ((((j9022 | longValue1122) ^ j7) | ((j9022 | j51) ^ j7)) | ((j8922 | j8622) ^ j7))) + ((226 * (j8622 | (j8922 ^ j7))) + ((j8722 * longValue1122) + (j8722 * j8622))))) - 2005572328;
            int elapsedCpuTime222 = (int) Process.getElapsedCpuTime();
            foxtrot2 = ((int) (j9122 >> c3)) & A0.z.foxtrot((~(elapsedCpuTime222 | 1399392832)) | (~(37833578 | elapsedCpuTime222)) | (-1399409515), -1444, (((~elapsedCpuTime222) | (-1361592619)) * 1444) - 1153123274, -477640588);
            i35 = ((int) j9122) & ((((~((-1573401210) | i4)) | (-1573746686)) * 49) + (((~((-1284339677) | i14)) | (-1573401210) | (~(1284339676 | i4))) * (-49)) + (((~((-1573401210) | i14)) | 289407009) * 98) + 1791379743);
            if (((i35 & foxtrot2) | (foxtrot2 ^ i35)) != 1) {
            }
            int[] iArr222 = new int[1];
            int i75222 = (~(i4 & i34222)) & (i4 | i34222);
            int i75322 = -i75222;
            int i75422 = (((i75222 & i75322) | (i75222 ^ i75322)) >> 31) & 16;
            Object[] objArr18422 = {new int[]{i34222}, new int[]{i4}, iArr222, strArr3};
            int i75522 = ((i4 | 342176621) * 104) + ((~(360545261 | i14)) * (-104)) + (((~((-24991909) | i4)) | 6623268) * 104) + 836347177;
            int i75622 = -(-((i75522 ^ i75422) + ((i75522 & i75422) << 1)));
            int i75722 = (i10 & i75622) + (i10 | i75622);
            int i75822 = i75722 << 13;
            int i75922 = (i75822 | i75722) & (~(i75722 & i75822));
            int i76022 = i75922 ^ (i75922 >>> 17);
            int i76122 = i76022 << 5;
            iArr222[0] = ((~i76022) & i76122) | ((~i76122) & i76022);
            return objArr18422;
        }

        public static /* synthetic */ bx component9(bz bzVar, cf cfVar) {
            int i4 = delta + 119;
            charlie = i4 % 128;
            if (i4 % 2 != 0) {
                bx alpha2 = bzVar.alpha(cfVar, null, null, a.alpha, b.alpha);
                int i5 = 43 / 0;
                return alpha2;
            }
            return bzVar.alpha(cfVar, null, null, a.alpha, b.alpha);
        }

        public static void delta() {
            echo = new byte[]{67, 123, 22, 78, -6, 5, -3};
        }

        public static void echo() {
            hotel = new byte[]{51, -107, -126, 108};
            india = 103;
        }
    }

    bx alpha(cf cfVar, Integer num, Integer num2, Function0 function0, Function0 function02);
}
