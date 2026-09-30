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
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class getContextMenuInfoA21117 {
    public static final char[] alpha;
    public static final long bravo;
    public static int charlie;
    public static int delta;
    public static final byte[] echo = null;
    public static final int foxtrot = 0;
    public static final int golf;
    public static final byte[] hotel = null;

    static {
        echo();
        golf = 1;
        delta();
        charlie = 0;
        delta = 1;
        char[] cArr = new char[2156];
        ByteBuffer.wrap("\u007f\nwÌnZfô]>U\u0083L\u0004D\u0092;)3¶*Î!Y\u0019Ñ\u0010S\bòÿ\u0002÷\u0091î\næªÝ!ÔRÌëÃH»þ²|ª\u0083¡\u0012\u007f\nwÌnZfô]>U\u0083L\u0004D\u0092;)3¶*Î!Y\u0019Ñ\u0010S\bãÿ\u000f÷\u0085î\u001dæ\u0090Ý6ÔQÌÆÃX»ú²yÓ\u0089ÛOÂÙÊwñ½ù\u0000à\u0087è\u0011\u0097ª\u009f5\u0086M\u008dÚµR¼Ð¤cS\u009c[\u0018B\u0098\u007f\nwÛnFfñ]>U\u0089L\u0004D\u009a;83¼*Â!\u0005\u0019Þ\u0010c\bÿÿ\u0002÷\u0093î\u0011æ¼Ý:Ô~ÌÖÃZ»ú²iª\u0085¡\u0005\u0099\u0083\u007f\nwÍnKfá]>U\u0080L\fDÐ;=3¢*È!Z\u0000ª\bm\u0011ë\u0019A\"\u009e*73¢;3DÃL\u0000Uu^åfi»E³\u0094ª\u0014¢®\u0099?\u0091Ù\u0088@\u0080\u009eÿP÷Ùî¥å\nÝ\u0080Ô&Ì\u0098;H3Î*VZúR<K®C\u0006x\u0080p;iµam\u001eÍ\u0016U\u000f>\u0004´</5\u0093ÆûÎk×½ßLäÒì'õ³ý|\u0082\u0093\u008a\u0019\u0093o\u0098ô z©É±[F\u0095N7W±_\u0017d¡méuvzä\u0002\u0013\u007fWwÇn\u0011fà]~U\u008bL\u001fDÐ;?3µ*Ã!X\u0019Ö\u0010e\b÷ÿ9÷\u009bî\u001dæ»Ý\rÔEÌÚÃH»¼\u007f\nwÛnFfñ]eU\u0081L\u0006DÑ;!3¹*Å!\u0005\u0019Õ\u0010e\bñÿ\b÷\u0097îVæ¼Ý=QÖYP@ÉH}sï{\r\u007fywéªF¢\u0097»\n³½\u0088)\u0080Í\u0099J\u0091\u009dîcæõÿ\u0085ôIÌ\u009bÅ%Ý²*_\"ï;y3®\bp\u0001\b\u0019\u0095\u0016\u0002nïg2\u007fÃtULÂEw]ÿª\u0083\u007f\nwÛnFfñ]eU\u0081L\u0006DÑ;/3¹*É!\u0005\u0019×\u0010i\bþÿ\u0013÷£î5æâÝ\"ÔSÌÛÃK\u007f\nwÛnFfñ]eU\u0081L\u0006DÑ;!3¹*Å!\u0005\u0019Õ\u0010e\bñÿ\b÷\u0090î\u0015æºÝ\u0004ÔlÌÄÃI»á²mªÎ¡\u0004\u0099\u0095\u007f\nwÌnZfô]>U\u008aL\u000eD\u0093;83·*Ò!O\u0019Ê\u0010x\u007fWwÇn\u0011fà]dU\u008dL\u0007D\u009a;c3¸*È!Y\u0019ÍN®F(_»W\u0014l\u0091d/}àu~\nÜv\u0098~Jgßo\u007fTà\\YE\u009fM\u00052³:'#F(Á\u0010X\u0019ê\u0001dö\u0099þ\u0014\u007fKwÍnRf÷]bU\u0082\u007fWwÇn\u0011fò]cU\u008bL\u000fD\u008b;.3¤*\u0089!G\u0019Ø\u0010b\bæÿ\u0000÷\u0094î\u001bæ»Ý'ÔSÌÑÃI\u007fBwÍnQfû\u007fUwÍnMfñ]xU\u0097L\u001fDÐ;>3©*Ô!\u0004\u0019Û\u0010h\b½ÿ\u0002÷\u0090î\u001aæºÝ5Ô\u000fÌÓÃK»û²3ª\u0086¡\u0016\u0099\u0091\u0090,\u0088\u0083\u007fÄvFnðeW]íT\u0007L\u009fC ;®2,)H!Â\u007fUwÍnMfñ]xU\u0097L\u001fDÐ;>3©*Ô!\u0004\u0019Û\u0010h\b½ÿ\u0002÷\u0090î\u001aæºÝ5Ô\u000fÌÓÃK»û²3ª\u0086¡\u0016\u0099\u0091\u0090,\u0088\u0083\u007fÄvFnðeW]éT\u0007L\u009fC ;¤2,)&!¾8>0\u0082\u000b\u000b\u0003ä\u001al\u0012£mMeÚ|§wwO¨F\u001b^Î©q¡ã¸i°É\u008bF\u0082|\u009aµ\u0095'íÓä\rüâ÷m\u0000\u0098\b\u0000\u0011\u0080\u0019<\"µ*Z3Ò;\u001dDóLdU\u0019^Éf\u0016o¥wp\u0080Ï\u0088]\u0091×\u0099w¢ø«Â³\u000b¼\u0099ÄmÍ¼ÕLÞÙ\u007fUwÍnMfñ]xU\u0097L\u001fDÐ;>3©*Ô!\u0004\u0019Û\u0010h\b½ÿ\u0002÷\u0090î\u001aæºÝ5Ô\u000fÌÆÃT» ²pª\u0083¡\u0014L6D®].U\u0092n\u001bfô\u007f|w³\b]\u0000Ê\u0019·\u0012g*¸#\u000b;ÞÌaÄóÝyÕÙîVçlÿ¥ð7\u0088Ã\u0081\u0013\u0099í\u0092w\u0014Õ\u001cL\u0005Ö\r|6ä>\u0004\u007f\nwØnMfí]rUËL\u0006D\u0091;)3¥*Ë!O\u0019Ê\u0080Ø\u0088A\u0091Û\u0099q¢ýª\u001a³\u0085»\u0006Ä²&Ó.\u00027\u009f?(\u0004¼\fX\u0015ß\u001d\bbòj{s\u001fx\u009e@\u0005I¢Q%¦Í®G·\u008e¿a\u0084â\u008d\u0096\u0095\t\u009a\u008dâ ë·ó\u0014øÝÀZÉãÑq&\u001f/\u00827\u0003<¢\u0004#\rÉ\u0015^\u001aøb`k©p\u009ex\bA¬ù|ñ¨è,à\u009aÛ\u0003ÓýÊoÂ§½WµÏ¬³§j\u009fû\u0096U\u008e\u008dygq¬ho`Ì[@R>J\u00adEc=\u00884\u0019,ÿ'l\u001fí\u0016M\u000eÓùûð7è\u009aã\u0010Û\u008dÒ{ÊðÅA½\u0093´[¯4U\u008f][DßLiwð\u007f\u000ef\u009cnT\u0011¤\u0019<\u0000@\u000b\u00993\b:¦\"~Õ\u0094Ý_Ä\u0095Ì=÷´þËæ\\éÎ\u0091d\u0098ë\u0080\u0000\u008b\u0080³Qº»¢0UH\\×DoOúwi~Éf\u0007i®\u007f\nwÛnFfñ]eU\u0081L\u0006DÑ;!3¹*Å!\u001c\u0019\u008d\u0010#\bðÿ\n÷\u009aî\ræ«Ý\rÔ@ÌÝÃ_»â²Bª\u0089¡\u0019\u0099\u008e\u0090,\u0088®\u007fÅvWnæem]²T\u0001L\u0081C4;å2-)B\u007f\nwÍnKfá]>U\u008dL\u0005D\u0097;93ÿ*Î!D\u0019Ð\u0010x\b½ÿ\u0005÷\u0099î\u0017æºÝ6ÔRÌÑÃI»ø²tª\u0083¡\u0012\u0099Ô\u0090;\u0088¿\u007fbwÍnQfû]|U\u008bL\u001fD\u0097;\"3¾\u0081ÿ\u0089i\u0090û\u0098C£Ñ«<²ª\u007fFwÀnMfí]|U\u008dL\u001eD\u0093Æ Î°×fß\u0085ä\u0014ìüõxýü\u0082Y\u008aÓ\u0093þ\u00989 «©\r±\u008dFrNç\u007fSwÊnPfú])UÒL\u001bª6¢¹»%³\u0093\u0088\u0017\u0080ù\u0099|g:oµv)~\u009fE\u001bMõTp\\Ù#M+\u00902é\u007fBwÍnQfç]cU\u008dL\bD¡;53è*\u0091!u\u0019\u008f\u00108\u007fWwÇn\u0011fò]cU\u008bL\u000fD\u008b;.3¤*\u0089!G\u0019Ö\u0010h\böÿ\n\u007fVwÌnT\u007f@wÅnJfî]pU\u0090L\u0004D\u008c\u007fdwØnOf¢]CU\u0091L\u0005D\u008a;$3½*Â!\n\u0019ß\u0010c\báÿF÷¶î\u0010æ½Ý=ÔLÌÑ\u007fdwÆn[fð]~U\u008dL\u000fDÞ;\u001e3\u0094*ì!\n\u0019Û\u0010y\búÿ\n÷\u0081îXæ©Ý=ÔSÌ\u0094ÃC»¶²+¨· \u0015¹\u0088±#\u008a\u00ad\u0082^\u009bÜ\u0093\rìÍäGý?öÙÎ\bÇªß)(Ù R9\u008b1z\nî\u0003\u0080\u001bG\u0014\u0090leeø}lv\u0092N\u001d\f\u009c\u0004\f\u001dÚ\u0015!.»&]?Ä7BHç@iY\tÊ÷ÂrÛæÓSèÂà8ù\u00adñ#òÈúQãËëaÐ²ØIa\u001bi\u0085p\u001dx\u00adC5KÝ'l/ü6*>É\u0005X\r°\u00144\u001c°c\u0015k\u009fr²ysAðHVPÆ§9á2é¢ðtø\u008cÃ\u0011ËóÒ`Úþ¥D\u00ad\u009b´³¿*\u0087±\u008e\u001c\u007f\u0014ø»ð+éýá\u001dÚ\u0098ÒkËòÃ`¼Ä\u007f\u0015\u007fWwÇn\u0011fà]dU\u008dL\u0007D\u009a;c3 *Õ!E\u0019Ý\u0010y\bðÿ\u0012\u007fCwÝnSfî]NU\u009cLSDÈ\u008b.\u0083¾\u009ah\u0092\u0099©\u001d¡ô¸~°ãÏ\u001aÇÏÞ·Õ=í§ä\u0010ü\u0098\u000bo\u0003þ\u001ah\u0012Ø)_N¡F._²W\u0004l\u0080dn}ëu2\nÝ\u0002W\u001b/\u0010æ(=!\u008a9\u001eÎàÆdßò×OÁRÉÝÐAØ÷ãsë\u009dò\u0018ú±\u0085%\u008dø\u0094\u0081\u009f\u0015§Ú®x¶èA)I\u009dPPXécmjVrÁ}E\u0005û\f\u007f\u0014\u0099\u001f\u0004'µ.!6ôÁ\u0085\u007fBwÍnQfç]cU\u008dL\bDÑ;*3¿*È!M\u0019Õ\u0010i\bÌÿ\u0015÷\u0091î\u0013æàÝ5ÔDÌÚÃ^»ü²tª\u0083ÄÒÌ]ÕÁÝwæóî\u001d÷\u0098ÿA\u0080«\u0088\"\u0091X\u009aÂ¢\u0011«ª³sDÙL\u0013U\u008a]0fºo\u0089w\u0012xÛ\u007fBwÇnPfå]}U\u0081LDD\u008d;)3»*ø!M\u0019É\u0010d\büÿ\b÷\u0090î'æ·ÝjÔ\u0017Ì\u009bÃ\\»ë²sª\u0085¡\u0005\u0099\u0093\u0090*\u0088\u0083\u007fÛv\u000en³}ÊuZl\u008cd}_ãW\u0016N\u0082F\u000f9¿1,(^#Ò\u001bVÞnÖþÏ(ÇÙüGô²í&å®\u009a\u0019\u0092\u0088\u008bù\u0080v¸®±W©ß^6V O%GØ|\ruqmãbe\u001aÒ\u0013V\u000b©\u0000<8ª1\u001e)\u0091\u007fdwÆn[fð]~U\u008dL\u000fDÓ;53è*\u0091\u007fWwÇn\u0011fà]dU\u008dL\u0007D\u009a;c3´*Î!Y\u0019É\u0010`\bòÿ\u001f÷Ûî\u0011æ«\u007fQwÍnLfö]<\u007fLwÆnVfö]?U\u0097L\u001dD\u009d;c3¡*Â!G\u0019Ì\u0010!\bãÿ\u0014÷\u009aî\bæ¼e-m´t+|\u008eGFOõVe^©!Y)È0·;=\u0003«\n\u0010\u0012\u0093ål\u009bn\u0093÷\u008ah\u0082Í¹\u0005±\u00ad¨7 êß\u0011×\u008bÎöÅuýÜôUìÈ\u001b1\u0013ª\n0\u0002\u0094\u007fTwÍnRf÷]?U\u0097L\rDÐ;!3³*Ã!u\u0019Ý\u0010i\býÿ\u0015÷\u009cî\fæ¶ª\u0094¢\u0004»Ò³*\u0088·\u0080U\u0099Æ\u0091Xîâæ=ÿ\u0005ô\u0087Ì\u001eÅ½Ý?*Ì\"R;\u00953}\bô\u0001\u008f\u0019\u0002\u0016\u009c\u0019È\u0011X\b\u008e\u0000\u007f;á3\u0014*\u0080\"O]£U*LUGÀ\u007f\bvònz\u0099\u009d\u00915\u0088\u0089\u00801» ²Û\u007fWwÇn\u0011fí]uU\u0089LED\u009c;83¹*Ë!N\u0019\u0097\u0010j\búÿ\b÷\u0092î\u001dæ½Ý\"ÔSÌÝÃU»ú\u007fWwÇn\u0011fò]cU\u008bL\u000fD\u008b;.3¤*\u0089!H\u0019Ì\u0010e\bÿÿ\u0002÷Ûî\u001eæ¦Ý<ÔFÌÑÃI»þ²oª\u0089¡\u0019\u0099\u008e\nS\u0002Ã\u001b\u0015\u0013õ(l \u00939\u001b1\u009fN$Fú_ÁT[lÔed}ó\u008aL\u0082\u0097\u009b\u0015\u0093¥¨1¡@¹Â¶OÎøÇpß\u008aÔ\u0007\u001cL\u0014Ü\r\n\u0005ê>s6\u008c/\u0004'\u0080X;P\u0094IÙBIzÖs9kê\u009c\b\u0094\u0087\u008d\u000f\u0085°¾g·\\¯Æ NØòÑcÉ\u0089Â\u001cú\u0093ó;ë©\u001cÌDkLûU-]ÈfHn¶w3\u007f\u00ad\u0000\u0003\bÂ\u0011ù\u001ac\"ì+\\3ËÄtÌ¯Õ-Ý\u009dæ\tïx÷úøw\u0080À\u0089H\u0091²\u009a?Æ\u0080Î\u0010×Æß#ä£ì]õØýF\u0082è\u008aX\u0093\u0014\u0098\u0091 \u0005©¶±jFÓNWWÆ_tdámØu\u0005z\u0085\u00027\u000b\u00ad\u0013R\u0018Ò ])ì1bÆ\u001aÏ\u0095\u007f\r\u007f\tw\u0088#RQV¢Þª\u0018³\u008e» \u0080ê\u0088A\u0091Ú\u0099Gæìî[÷\u0003ü\u0097Ä\u001dÍ½\u007f\nwÌnZfô]>U\u0097L\u0004D\u009d;&3µ*Ó!\u0005\u0019Û\u0010m\bàÿ\u0003÷\u0097î\u0019æ¡Ý6Ô~ÌÓÃ^»à²dª\u0084³E»\u0083¢\u0015ª»\u0091q\u0099Ø\u0080K\u0088Ò÷iÿúæ\u009cíJÕ\u0091Ü&Ä²3P;Þ\u007f\nwÌnZfô]>U\u0097L\u0004D\u009d;&3µ*Ó!\u0005\u0019È\u0010i\bþÿ\u0013÷\u0091\u007f\nwÛnFfñ]>U\u0095L\u000eD\u0093;83\u008f*Ó!X\u0019Ø\u0010o\bö\u009ct\u0094¥\u008d8\u0085\u008f¾\u001b¶ÿ¯x§¯Ø_ÐÇÉ»Â{ú«ó\u001bë\u008f\u001c{\u0014Ô\rk\u0005Ð>@73/¥ &X¯Q\u0007IûBkzñsPký\u009c¬\u0095-\u008d\u0096\u0086\u0003¾Ï·o¯à\u007f\nwÌnZfô]>U\u0086L\u0018D\u008a;\u00123·*×!Y_mW«N=F\u0093}Yuál\u007fdí\u001bu\u0013Ã\n©\u0001 9»\u009dm\u0095«\u008c=\u0084\u0093¿Y·ð®c¦úÙAÑÒÈ´Ãbû¼ò\u0018ê\u0080\u001dg\u0015ý\fs\u0004Ì?P64.·\u007f\nwÛnFfñ]eU\u0081L\u0006DÑ;!3¹*Å!\u0005\u0019Õ\u0010e\bñÿ\u0004÷\u0086î\fæ©Ý=ÔMÌÐÃ^»ü²Bª\u008a¡\u0019\u0099\u0093\u0090g\u0088¯\u007fÌ\u007f\nwÌnZfô]>U\u0086L\u0018D\u008a;,3³*Ä!OA\u001aIÜPJXäc.k\u0096r\bz\u009a\u0005:\r¹\u0014Å\u001fU|\"tämreÜ^\u0016V®O0G¢8\b0\u009d)è\"lÞçÖ!Ï·Ç\u0019üÓôkíõåg\u009aÏ\u0092O\u008b#\u0080¢\u007f\nwÌnZfô]>U\u0086L\u0018D\u008a;;3½*Ô!M\u007f\nwÌnZfô]>U\u0086L\u0018D\u008a;=3·*Æ!C\u0019É\u0010oï\u009bç]þËöeÍ¯Å\u0017Ü\u0089Ô\u001b«\u0083£(º[±Þý\u0083õEì×ä\u007fßù×BÎ\u0086Æ\u0018¹³±7¨B£Ì\u009bQ\u0092á\u008ai}ÀuRl\u0089d$_ôVÊNNAÆ9l\u007f\nwÅnQfö]>U\u0093L\u0002D\u0090;)3¿*Ð!Y\u0019\u0096\u0010N\bàÿ\u0012÷¦î\u0010æ®Ý ÔDÌÐÃ}»á²qª\u0084¡\u0012\u0099\u0088\u007f\nwØnMfí]rUËL\u0002D\u0091;=3¿*Õ!^\u0019Ê|Zt\u0081m\u0016eí^dí\u0097åEüÐôpÏïÇVÞ\u0085Ö\u0006©¼¡+¸\u0015³Ú\u008bE\u0082á\u009a}¶4¾¬§(¯\u0098\u0094\u000b\u009cý\u0085~\u008d¦ò\\úÉã½è8Ð©Ù\u0013Á\u00966x>\u00ad'}/Öü\u001cô\u0094í\bå\u0090Þ\bÖôÏmÇô¸z°ö©\u0086¢Q\u009a\u009f\u00936\u007f\nwÍnKfá]>U\u0089L\u000eD\u009a;$3±*ø!I\u0019Ö\u0010h\böÿ\u0005÷\u0086îVæ·Ý?ÔMLSDÐ]^Uónvf\u0084\u007f\u001ew\u0089\b2\u0000·\u007f\nwÍnKfá]>U\u0089L\u0004D\u008b;#3¤*Ô\u007f\nwÌn^fö]pUËL\u000fD\u0091;:3¾*Ë!E\u0019Ø\u0010h\bàÿI÷Ûî\u001cæ¿Ý}Ô@ÌÄÃK»ý²3ª\u0098¡\u001a\u0099\u0096\u007f\nwØnMfí]rUËL\bD\u008e;83¹*É!L\u0019Öt\f|©e=m\u0088V\u0019^ãGvOø\u0097\u0001\u009fÇ\u0086U\u008eýµ{½À¤\r¬\u009cÓ5Û¸Â\u0083ÉQñÀøhàþ\u0017\u0004\u001f\u0092\u0006\u0016\u000e·5v<I$Ê+BSªZ&BÄI\u001fq\u009ex/`ù\u0097Å\u009eT\u0086í\u008dqµû¼\u001f¤\u0093«=Ó´Ú{ÁKÉÞðaøôï{\u0017\u008a\u001e\u001d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        alpha = cArr;
        bravo = 4278292314605844392L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, int i4, short s3) {
        int i5;
        int i10 = i4 * 3;
        int i11 = b2 + 103;
        int i12 = 4 - (s3 * 2);
        byte[] bArr = new byte[1 - i10];
        int i13 = 0 - i10;
        byte[] bArr2 = hotel;
        if (bArr2 == null) {
            int i14 = 0;
            byte[] bArr3 = bArr2;
            int i15 = i12;
            int i16 = i13;
            i11 = (-i11) + i16;
            i12 = i15 + 1;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i11;
            if (i5 == i13) {
                return new String(bArr, 0);
            }
            byte b4 = bArr2[i12];
            int i17 = i12;
            i16 = i11;
            i11 = b4;
            i14 = i5 + 1;
            bArr3 = bArr2;
            i15 = i17;
            i11 = (-i11) + i16;
            i12 = i15 + 1;
            bArr2 = bArr3;
            i5 = i14;
            bArr[i5] = (byte) i11;
            if (i5 == i13) {
            }
        } else {
            i5 = 0;
            bArr[i5] = (byte) i11;
            if (i5 == i13) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0268, code lost:
    
        r1[r2] = (char) r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
    
        r0 = new java.lang.Object[]{r6, r6};
        r1 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(359345605);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        r1 = (byte) 0;
        r2 = (byte) (r1 + 1);
        r1 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(52 - android.view.View.combineMeasuredStates(0, 0), 2175 - android.view.View.getDefaultSize(0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0), -892301552, false, alpha(r2, (byte) (r2 - 1), r1), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a6, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(char c3, int i4, int i5, Object[] objArr) {
        int i10;
        Throwable cause;
        float f5;
        int i11;
        int i12;
        int i13;
        int i14 = 2;
        int i15 = 0;
        cy cyVar = new cy();
        long[] jArr = new long[i5];
        cyVar.component5 = 0;
        while (true) {
            int i16 = cyVar.component5;
            i10 = golf;
            if (i16 >= i5) {
                break;
            }
            int i17 = (i10 + 7) % i14;
            long j5 = bravo;
            char[] cArr = alpha;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i17 != 0) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr[i4 >>> i16]);
                    Object D8871 = uH18377.D8871(-31669226);
                    if (D8871 == null) {
                        int i18 = 53 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int indexOf = 2123 - TextUtils.indexOf("", "", i15);
                        i13 = 359345605;
                        char myTid = (char) (Process.myTid() >> 22);
                        byte b2 = (byte) i15;
                        i11 = i14;
                        byte b4 = (byte) (b2 + 3);
                        i12 = i15;
                        String alpha2 = alpha(b4, (byte) (b4 - 3), b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i12] = cls2;
                        D8871 = uH18377.setPivotYN16904(i18, indexOf, myTid, 564618947, false, alpha2, clsArr);
                    } else {
                        i11 = i14;
                        i12 = i15;
                        i13 = 359345605;
                    }
                    Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                    l10.getClass();
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(c3);
                    objArr3[i11] = Long.valueOf(j5);
                    objArr3[1] = Long.valueOf(i16);
                    objArr3[i12] = l10;
                    Object D88712 = uH18377.D8871(-897540670);
                    if (D88712 == null) {
                        int i19 = i12;
                        int resolveSize = View.resolveSize(i19, i19) + 51;
                        int alpha3 = 2796 - Color.alpha(i19);
                        char myTid2 = (char) ((Process.myTid() >> 22) + 32779);
                        byte b6 = (byte) i19;
                        byte b10 = b6;
                        String alpha4 = alpha(b10, b10, b6);
                        Class[] clsArr2 = new Class[4];
                        clsArr2[i19] = cls;
                        clsArr2[1] = cls;
                        clsArr2[i11] = cls;
                        clsArr2[3] = cls2;
                        D88712 = uH18377.setPivotYN16904(resolveSize, alpha3, myTid2, 356204311, false, alpha4, clsArr2);
                    }
                    jArr[i16] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[i11];
                    objArr4[1] = cyVar;
                    objArr4[0] = cyVar;
                    Object D88713 = uH18377.D8871(i13);
                    if (D88713 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 1);
                        D88713 = uH18377.setPivotYN16904(TextUtils.indexOf((CharSequence) "", '0', 0) + 53, ExpandableListView.getPackedPositionChild(0L) + 2176, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), -892301552, false, alpha(b12, (byte) (b12 - 1), b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88713).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr[i4 + i16])};
                Object D88714 = uH18377.D8871(-31669226);
                if (D88714 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    f5 = 0.0f;
                    D88714 = uH18377.setPivotYN16904(View.MeasureSpec.getSize(0) + 52, 2122 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 564618947, false, alpha(b14, (byte) (b14 - 3), b13), new Class[]{cls2});
                } else {
                    f5 = 0.0f;
                }
                Long l11 = (Long) ((Method) D88714).invoke(null, objArr5);
                l11.getClass();
                Object[] objArr6 = {l11, Long.valueOf(i16), Long.valueOf(j5), Integer.valueOf(c3)};
                Object D88715 = uH18377.D8871(-897540670);
                if (D88715 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    D88715 = uH18377.setPivotYN16904(TextUtils.indexOf("", "") + 51, 2796 - (TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32778), 356204311, false, alpha(b16, b16, b15), new Class[]{cls, cls, cls, cls2});
                }
                jArr[i16] = ((Long) ((Method) D88715).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cyVar, cyVar};
                Object D88716 = uH18377.D8871(359345605);
                if (D88716 == null) {
                    float f10 = f5;
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 1);
                    D88716 = uH18377.setPivotYN16904(((byte) KeyEvent.getModifierMetaStateMask()) + 53, 2175 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (PointF.length(f10, f10) > f10 ? 1 : (PointF.length(f10, f10) == f10 ? 0 : -1)), -892301552, false, alpha(b18, (byte) (b18 - 1), b17), new Class[]{Object.class, Object.class});
                }
                ((Method) D88716).invoke(null, objArr7);
            }
            i14 = 2;
            i15 = 0;
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
                if ((i10 + 63) % 2 != 0) {
                    break;
                }
                cArr2[i20] = (char) jArr[i20];
                Object[] objArr8 = {cyVar, cyVar};
                Object D88717 = uH18377.D8871(359345605);
                if (D88717 == null) {
                    byte b19 = (byte) 0;
                    byte b20 = (byte) (b19 + 1);
                    D88717 = uH18377.setPivotYN16904((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52, TextUtils.getOffsetBefore("", 0) + 2175, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), -892301552, false, alpha(b20, (byte) (b20 - 1), b19), new Class[]{Object.class, Object.class});
                }
                ((Method) D88717).invoke(null, objArr8);
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    public static void charlie(int i4, byte b2, byte b4, Object[] objArr) {
        ?? r72 = 99 - b4;
        int i5 = b2 + 4;
        int i10 = i4 * 3;
        byte[] bArr = new byte[4 - i10];
        int i11 = 3 - i10;
        int i12 = -1;
        byte[] bArr2 = echo;
        byte b6 = r72;
        if (bArr2 == null) {
            b6 = r72 + i5 + 6;
            i5 = i5;
            i12 = -1;
            bArr2 = bArr2;
        }
        while (true) {
            int i13 = i12 + 1;
            int i14 = i5 + 1;
            bArr[i13] = b6;
            if (i13 == i11) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte[] bArr3 = bArr2;
            b6 = b6 + bArr2[i14] + 6;
            i5 = i14;
            i12 = i13;
            bArr2 = bArr3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:158|(1:160)|161|162|(1:164)(1:373)|165|166|(1:168)|169|(5:171|(1:173)|174|175|(22:177|178|179|(1:181)|182|(1:184)(5:316|317|(1:319)|320|321)|185|(2:187|(17:189|(2:191|(9:193|194|(1:196)(1:303)|197|198|(2:302|209)|200|(5:202|(1:204)|205|206|(2:208|209)(1:299))(1:301)|300)(9:304|305|(1:307)|308|309|(2:311|209)|200|(0)(0)|300))|312|313|210|211|(1:(4:213|(5:215|(1:294)(19:219|220|221|222|223|224|225|226|227|228|229|230|231|232|(2:234|235)(1:280)|236|(2:240|241)|238|239)|285|238|239)|295|296)(2:297|298))|242|243|244|(2:246|(2:248|(5:250|251|(1:253)|254|(6:256|257|258|(1:260)|261|262)(1:268)))(4:271|272|273|274))|278|257|258|(0)|261|262))|314|315|211|(2:(0)(0)|296)|242|243|244|(0)|278|257|258|(0)|261|262))|322|(2:324|(5:326|327|(1:329)(1:359)|330|331)(5:360|361|(1:363)|364|365))|367|368|(1:370)(1:372)|371|178|179|(0)|182|(0)(0)|185|(0)|314|315|211|(2:(0)(0)|296)|242|243|244|(0)|278|257|258|(0)|261|262) */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x38ba, code lost:
    
        r2 = (~(r82 & 151)) & (r82 | 151);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x28dd, code lost:
    
        if (r2 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x28e0, code lost:
    
        r81 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x2b26, code lost:
    
        r9 = r81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x2b28, code lost:
    
        r2 = ((r56 | 49) << 1) - (r56 ^ 49);
        r2 = ((r2 | (-48)) << 1) - (r2 ^ (-48));
        r3 = r58;
        r4 = r59;
        r7 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x294e, code lost:
    
        r4 = com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.delta + 19;
        com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.charlie = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x295a, code lost:
    
        if ((r4 % 2) != 0) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x2960, code lost:
    
        if (r2.isEmpty() != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x2964, code lost:
    
        if (r7.length == 1) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x2966, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.delta = (com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.charlie + 93) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x296f, code lost:
    
        r11 = new java.lang.Object[]{r2, r3};
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(-1363379003);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x297e, code lost:
    
        if (r3 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x2980, code lost:
    
        r26 = 52 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
        r3 = android.view.MotionEvent.axisFromString(r12) + 1416;
        r4 = (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3047);
        r15 = (byte) 0;
        r8 = (byte) (r15 - 1);
        r3 = new java.lang.Object[1];
        charlie(r15, r8, (byte) (r8 + 1), r3);
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r26, r3, r4, 1896341008, false, (java.lang.String) r3[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x29ca, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r11)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x29d7, code lost:
    
        r14 = 731524980;
        r81 = r9;
        r3 = ((-448) * r3) + (com.zendesk.service.HttpConstants.HTTP_BLOCKED * r14);
        r9 = 449;
        r29 = ((r14 ^ r2) | r3) ^ r2;
        r27 = r3 ^ r2;
        r3 = (int) android.os.SystemClock.elapsedRealtime();
        r9 = ((r9 * (r29 | (((r27 | (r3 ^ r2)) | r14) ^ r2))) + (((-1347) * r29) + (((r29 | (((r27 | r14) | r3) ^ r2)) * r9) + r3))) + 58602643;
        r4 = ~(r59 | (-1662598845));
        r3 = ((int) (r9 >> r38)) & (((r4 | (-1732083645)) * 374) + (((69484800 | r4) * (-374)) + 913959368));
        r4 = ((int) r9) & ((((~((~ao.ad.romeo()) | (-1656641052))) | 539492865) * (-964)) + ((((~((-1656641052) | r8)) | (-1201099835)) * (-964)) - 382158379));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x2a61, code lost:
    
        if (((r3 & r4) | (r3 ^ r4)) == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x2a63, code lost:
    
        r3 = (r56 & 10) + (r56 | 10);
        r9 = ((~r3) & r82) | (r3 & r59);
        r3 = (r5 ^ 1) + ((r5 & 1) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x2a75, code lost:
    
        if (r3 <= 1) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x2a77, code lost:
    
        r4 = com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.delta;
        com.fingerprintjs.android.fpjs_pro_internal.getContextMenuInfoA21117.charlie = ((r4 ^ 87) + ((r4 & 87) << 1)) % 128;
        r4 = (char) android.view.View.MeasureSpec.getSize(0);
        r5 = -android.graphics.Color.red(0);
        r8 = (r5 * (-445)) - 714670;
        r11 = ~r5;
        r10 = ((~(((-1607) ^ r59) | ((-1607) & r59))) | (~(r11 | (-1607)))) * 446;
        r14 = (r8 & r10) + (r8 | r10);
        r8 = ~r5;
        r8 = ~((r8 & 1606) | (r8 ^ 1606));
        r5 = (r5 & (-1607)) | ((-1607) ^ r5);
        r5 = ~((r5 & r82) | (r5 ^ r82));
        r5 = (((r5 & r8) | (r8 ^ r5)) * 446) + r14;
        r8 = (~(r11 | (-1607))) * 446;
        r39 = 0;
        r11 = new java.lang.Object[1];
        bravo(r4, (r5 | r8) + (r5 & r8), 0 - (~(-android.view.MotionEvent.axisFromString(r12))), r11);
        r1.append((java.lang.String) r11[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x2ae3, code lost:
    
        r1.append(r7[r39]);
        r4 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        r5 = android.text.TextUtils.getOffsetAfter(r12, 0);
        r7 = ((r5 | 1608) << 1) - (r5 ^ 1608);
        r5 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
        r8 = (r5 & 1) + (r5 | 1);
        r5 = new java.lang.Object[1];
        bravo((char) (((r4 | 23629) << 1) - (r4 ^ 23629)), r7, r8, r5);
        r1.append((java.lang.String) r5[0]);
        r1.append(r2);
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x2ae1, code lost:
    
        r39 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x2b21, code lost:
    
        r2.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x2b25, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x294c, code lost:
    
        if (r2 != null) goto L245;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x11d3 A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x12cc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1463  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1703  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1836 A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x1909 A[Catch: all -> 0x3ad9, TRY_ENTER, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x2c2e A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x2c7c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x2d79  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x3378 A[Catch: all -> 0x3ad9, TRY_ENTER, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x370c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x3840  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x395b A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x37cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x345a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x2c87  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x3a51  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1815 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x12d3  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0ed2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0dfa  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0b9b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0bdc A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0cdf A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0e41 A[Catch: all -> 0x3ad9, TryCatch #6 {all -> 0x3ad9, blocks: (B:6:0x00ff, B:8:0x010c, B:9:0x014b, B:19:0x02aa, B:21:0x02b7, B:22:0x02fb, B:29:0x042b, B:32:0x043a, B:33:0x047d, B:38:0x0717, B:40:0x071e, B:41:0x0760, B:59:0x0a09, B:61:0x0a16, B:62:0x0a53, B:71:0x0bd2, B:73:0x0bdc, B:74:0x0c1e, B:80:0x0cd0, B:82:0x0cdf, B:83:0x0d1c, B:91:0x0e37, B:93:0x0e41, B:94:0x0e8f, B:102:0x1076, B:104:0x1080, B:105:0x10d8, B:112:0x11c4, B:114:0x11d3, B:115:0x121a, B:125:0x15ab, B:127:0x15b8, B:128:0x15f6, B:142:0x170e, B:144:0x171d, B:145:0x175d, B:152:0x1830, B:154:0x1836, B:155:0x1872, B:158:0x1909, B:160:0x191b, B:161:0x1962, B:166:0x1a45, B:168:0x1a4f, B:169:0x1a95, B:171:0x1a9e, B:173:0x1ab7, B:174:0x1aff, B:179:0x2c24, B:181:0x2c2e, B:182:0x2c73, B:194:0x313c, B:196:0x314b, B:197:0x3195, B:202:0x3378, B:204:0x3385, B:205:0x33c6, B:258:0x394e, B:260:0x395b, B:261:0x3996, B:305:0x323f, B:307:0x324e, B:308:0x328f, B:317:0x2c88, B:319:0x2c9f, B:320:0x2ce2, B:327:0x2867, B:329:0x2873, B:330:0x28cc, B:344:0x296f, B:346:0x2980, B:347:0x29ca, B:361:0x28f0, B:363:0x28fa, B:364:0x293b, B:378:0x132a, B:380:0x1339, B:381:0x137d, B:408:0x054f, B:410:0x0559, B:411:0x05a0, B:421:0x068d, B:423:0x0697, B:424:0x06dc), top: B:5:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0ecb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] component5(Context context, int i4, int i5, int i10) {
        int i11;
        String str;
        int i12;
        char c3;
        int i13;
        int i14;
        float f5;
        double d4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String[] strArr;
        int i23;
        int i24;
        int i25;
        Object[] objArr;
        Object D8871;
        int i26;
        Object D88712;
        long j5;
        int i27;
        Object D88713;
        long j6;
        int i28;
        int i29;
        char c4;
        String[] strArr2;
        int i30;
        int i31;
        int i32;
        Object D88714;
        int i33;
        int i34;
        int i35;
        int i36;
        String[] strArr3;
        int i37;
        int i38;
        int i39;
        Object D88715;
        int i40;
        int i41;
        int i42;
        String[] strArr4;
        char c10;
        char c11;
        Object[] objArr2;
        String[] strArr5;
        int i43;
        String[][] strArr6;
        int i44;
        String[] strArr7;
        String str2;
        String[] strArr8;
        Object D88716;
        Object invoke;
        int i45;
        int i46;
        int i47;
        char c12;
        int i48;
        int i49;
        int i50;
        int i51;
        Object D88717;
        File file;
        int i52;
        String[] strArr9;
        String str3;
        int i53;
        String str4;
        int i54;
        int i55;
        String[] strArr10;
        String str5;
        Object[] objArr3;
        String[] strArr11;
        int i56;
        String[] strArr12;
        String[] strArr13;
        int i57;
        String[] strArr14;
        String next;
        int i58 = 4;
        int i59 = 0;
        int i60 = 1;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
        int i61 = -(-ExpandableListView.getPackedPositionType(0L));
        Object[] objArr4 = new Object[1];
        bravo((char) ((bitsPerPixel ^ 1) + ((bitsPerPixel & 1) << 1)), (i61 ^ 910) + ((i61 & 910) << 1), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        String str6 = (String) objArr4[0];
        String str7 = "";
        char c13 = '0';
        char indexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        int i62 = -TextUtils.getTrimmedLength("");
        Object[] objArr5 = new Object[1];
        bravo(indexOf, maxKeyCode, (i62 ^ 27) + ((i62 & 27) << 1), objArr5);
        String str8 = (String) objArr5[0];
        char alpha2 = (char) Color.alpha(0);
        int i63 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i64 = ((i63 | 26) << 1) - (i63 ^ 26);
        int i65 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
        Object[] objArr6 = new Object[1];
        bravo(alpha2, i64, (i65 ^ 25) + ((i65 & 25) << 1), objArr6);
        String str9 = (String) objArr6[0];
        int i66 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
        Object[] objArr7 = new Object[1];
        bravo((char) ((i66 ^ 44163) + ((i66 & 44163) << 1)), 52 - (Process.myTid() >> 22), 17 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr7);
        String str10 = (String) objArr7[0];
        char defaultSize = (char) View.getDefaultSize(0, 0);
        int i67 = 69 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
        int i68 = -(-TextUtils.indexOf((CharSequence) "", '0'));
        Object[] objArr8 = new Object[1];
        bravo(defaultSize, i67, (i68 ^ 29) + ((i68 & 29) << 1), objArr8);
        String[] strArr15 = {str8, str9, str10, (String) objArr8[0]};
        int i69 = 0;
        while (true) {
            if (i69 >= i58) {
                i11 = i60;
                str = str7;
                i12 = -1;
                c3 = ' ';
                i13 = 2;
                i14 = i4;
                break;
            }
            delta = (charlie + 31) % 128;
            c3 = ' ';
            try {
                Object[] objArr9 = new Object[i60];
                objArr9[i59] = strArr15[i69];
                Object D88718 = uH18377.D8871(1565484532);
                if (D88718 == null) {
                    i13 = 2;
                    byte b2 = (byte) i59;
                    byte b4 = (byte) (b2 - 1);
                    Object[] objArr10 = new Object[i60];
                    charlie(b2, b4, (byte) (b4 + 1), objArr10);
                    String str11 = (String) objArr10[i59];
                    Class[] clsArr = new Class[i60];
                    clsArr[i59] = String.class;
                    D88718 = uH18377.setPivotYN16904(52 - View.combineMeasuredStates(i59, i59), TextUtils.indexOf(str7, c13, i59, i59) + 2952, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), -2097887455, false, str11, clsArr);
                } else {
                    i13 = 2;
                }
                long longValue = ((Long) ((Method) D88718).invoke(null, objArr9)).longValue();
                long j7 = 306259755;
                int i70 = i60;
                str = str7;
                long j10 = -112;
                int i71 = i69;
                long j11 = -1;
                long j12 = longValue ^ j11;
                long j13 = i4;
                long j14 = j12 | (j13 ^ j11);
                i11 = i70;
                i12 = -1;
                long j15 = j7 ^ j11;
                long j16 = (113 * ((j12 | j13) ^ j11)) + ((-113) * (((j15 | longValue) ^ j11) | ((j15 | j13) ^ j11) | ((j14 | j7) ^ j11))) + (226 * (j7 | (j14 ^ j11))) + (j10 * longValue) + (j10 * j7) + 648894147;
                int i72 = ~i4;
                int i73 = (~((-2059873519) | i72)) | 1522739372;
                int i74 = ~((-85512962) | i4);
                int i75 = ((int) (j16 >> 32)) & (((i74 | (~((-537134147) | i72))) * HttpConstants.HTTP_BAD_GATEWAY) + ((i73 | i74) * (-502)) + 1348212466);
                int i76 = ((int) j16) & ((((~((-115212022) | i72)) | 1552438431) * 68) + ((~(1591607039 | i72)) * (-68)) + (((~((-39168609) | i72)) | 1476395018 | (~(115212021 | i4))) * (-68)) + 1126659777);
                if (((i76 & i75) | (i75 ^ i76)) != 0) {
                    int i77 = delta;
                    charlie = (((i77 | 89) << 1) - (i77 ^ 89)) % 128;
                    i14 = i4 ^ ((i71 ^ 190) + ((i71 & 190) << 1));
                    break;
                }
                i69 = i71 + 1;
                str7 = str;
                i60 = i11;
                i59 = 0;
                c13 = '0';
                i58 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        float f10 = 0.0f;
        char c14 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int argb = Color.argb(0, 0, 0, 0);
        Object[] objArr11 = new Object[i11];
        bravo(c14, (argb & 98) + (argb | 98), 11 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr11);
        String str12 = (String) objArr11[0];
        char c15 = (char) (32671 - (~(-Color.red(0))));
        int i78 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        Object[] objArr12 = new Object[1];
        bravo(c15, ((i78 | 109) << 1) - (i78 ^ 109), 12 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), objArr12);
        String str13 = (String) objArr12[0];
        int i79 = -ExpandableListView.getPackedPositionGroup(0L);
        int i80 = 0;
        double d9 = 0.0d;
        int i81 = 1;
        Object[] objArr13 = new Object[1];
        bravo((char) ((i79 & 50255) + (i79 | 50255)), 123 - TextUtils.indexOf(str, str), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, objArr13);
        String[] strArr16 = {str12, str13, (String) objArr13[0]};
        int i82 = 0;
        while (true) {
            if (i82 >= 3) {
                f5 = f10;
                d4 = d9;
                i15 = i4;
                break;
            }
            Object[] objArr14 = new Object[i81];
            objArr14[i80] = strArr16[i82];
            Object D88719 = uH18377.D8871(1565484532);
            if (D88719 == null) {
                byte b6 = (byte) i80;
                byte b10 = (byte) (b6 - 1);
                int i83 = i80;
                d4 = d9;
                Object[] objArr15 = new Object[1];
                charlie(b6, b10, (byte) (b10 + 1), objArr15);
                String str14 = (String) objArr15[i83];
                Class[] clsArr2 = new Class[1];
                clsArr2[i83] = String.class;
                D88719 = uH18377.setPivotYN16904(52 - View.MeasureSpec.makeMeasureSpec(i80, i80), 2951 - (TypedValue.complexToFraction(i80, f10, f10) > f10 ? 1 : (TypedValue.complexToFraction(i80, f10, f10) == f10 ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -2097887455, false, str14, clsArr2);
            } else {
                d4 = d9;
            }
            long longValue2 = ((Long) ((Method) D88719).invoke(null, objArr14)).longValue();
            long j17 = -1090583944;
            f5 = f10;
            int i84 = i82;
            long j18 = i12;
            long j19 = j17 ^ j18;
            long j20 = ((-1434) * (longValue2 | j19)) + (1435 * longValue2) + ((-716) * j17);
            long j21 = 717;
            String[] strArr17 = strArr16;
            long j22 = i4;
            long j23 = j22 ^ j18;
            long j24 = (j17 | longValue2) ^ j18;
            long j25 = j19 | (longValue2 ^ j18);
            long j26 = (j21 * (((j22 | longValue2) ^ j18) | ((j25 | j23) ^ j18) | j24)) + ((((j23 | longValue2) ^ j18) | j24 | ((j25 | j22) ^ j18)) * j21) + j20 + 2045737846;
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            int i85 = ~((-1581026642) | freeMemory);
            int i86 = ~freeMemory;
            int i87 = ((int) (j26 >> c3)) & ((((~(freeMemory | 143800230)) | 135267584 | (~(1581026641 | i86))) * 904) + (((~(i86 | (-8532647))) | (~((-1445759058) | freeMemory))) * 904) + ((i85 | (~((-143800231) | i86))) * (-1808)) + 1607590250);
            int i88 = ~Process.myPid();
            int foxtrot2 = ((int) j26) & A0.z.foxtrot((~((-370001758) | i88)) | 335921752 | (~(1807228167 | i88)), 184, (((~(i88 | 2143149919)) | (~((-34080006) | i88))) * (-184)) + 1019428157, 158252504);
            if (((i87 & foxtrot2) | (i87 ^ foxtrot2)) != 0) {
                int i89 = i84 + 270;
                i15 = (~(i4 & i89)) & (i4 | i89);
                break;
            }
            i82 = i84 + 1;
            strArr16 = strArr17;
            d9 = d4;
            f10 = f5;
            i80 = 0;
            i81 = 1;
            i12 = -1;
        }
        int i90 = (~i14) & i4;
        int i91 = ~i4;
        int i92 = i90 | (i14 & i91);
        int i93 = -i92;
        int i94 = ((i92 & i93) | (i92 ^ i93)) >> 31;
        int i95 = i15 & (~i94);
        int i96 = i14 & i94;
        int i97 = (i96 & i95) | (i95 ^ i96);
        char c16 = (char) (9711 - (~(-(-Color.alpha(0)))));
        int i98 = -View.MeasureSpec.getMode(0);
        int i99 = (i98 & ModuleDescriptor.MODULE_VERSION) + (i98 | ModuleDescriptor.MODULE_VERSION);
        int i100 = -(-TextUtils.getCapsMode(str, 0, 0));
        int i101 = (i100 ^ 14) + ((i100 & 14) << 1);
        Object[] objArr16 = new Object[1];
        bravo(c16, i99, i101, objArr16);
        Object[] objArr17 = {(String) objArr16[0]};
        Object D887110 = uH18377.D8871(-2104138125);
        int i102 = foxtrot;
        if (D887110 == null) {
            int i103 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 51;
            int i104 = (TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)) + 2951;
            char c17 = (char) (TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1));
            byte b11 = (byte) (i102 & 1);
            byte b12 = (byte) (b11 + 1);
            Object[] objArr18 = new Object[1];
            charlie(b11, b12, (byte) (b12 - 1), objArr18);
            D887110 = uH18377.setPivotYN16904(i103, i104, c17, 1563346086, false, (String) objArr18[0], new Class[]{String.class});
        }
        long longValue3 = ((Long) ((Method) D887110).invoke(null, objArr17)).longValue();
        long j27 = -458126246;
        long j28 = -115;
        long j29 = (j28 * longValue3) + (j28 * j27);
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j30 = -1;
        long j31 = ((-116) * ((((elapsedCpuTime ^ j30) | j27) | longValue3) ^ j30)) + j29;
        long j32 = 116;
        long j33 = ((j27 | elapsedCpuTime) * j32) + j31;
        long j34 = longValue3 ^ j30;
        long j35 = ((j32 * ((((j27 ^ j30) | j34) ^ j30) | ((elapsedCpuTime | j34) ^ j30))) + j33) - 771494284;
        int myUid = Process.myUid();
        int i105 = ((int) (j35 >> c3)) & ((((~(myUid | 12495231)) | (~((~myUid) | 1449721642))) * 979) + ((1449721642 | myUid) * (-979)) + (((~(12495231 | r7)) * 979) - 1571530808));
        int i106 = (~((-69330039) | i4)) | 69321814;
        int i107 = ~((-1506548225) | i91);
        int i108 = ((int) j35) & (((i107 | (~((-8225) | i4))) * 470) + ((i106 | i107) * (-470)) + 1079255097);
        if (((i105 & i108) | (i105 ^ i108)) != 0) {
            i17 = (i4 & (-267)) | (i91 & 266);
            i16 = -957097391;
        } else {
            char c18 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47531);
            int i109 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i110 = (i109 & 156) + (i109 | 156);
            int i111 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            Object[] objArr19 = new Object[1];
            bravo(c18, i110, (i111 & 24) + (i111 | 24), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object D887111 = uH18377.D8871(-957097391);
            if (D887111 == null) {
                int keyCodeFromString = KeyEvent.keyCodeFromString(str) + 52;
                int modifierMetaStateMask = 3157 - ((byte) KeyEvent.getModifierMetaStateMask());
                char c19 = (char) (58075 - (AudioTrack.getMaxVolume() > f5 ? 1 : (AudioTrack.getMaxVolume() == f5 ? 0 : -1)));
                byte b13 = (byte) (i102 & 1);
                byte b14 = (byte) (b13 + 1);
                i16 = -957097391;
                Object[] objArr21 = new Object[1];
                charlie(b13, b14, (byte) (b14 - 2), objArr21);
                D887111 = uH18377.setPivotYN16904(keyCodeFromString, modifierMetaStateMask, c19, 424179844, false, (String) objArr21[0], new Class[]{String.class});
            } else {
                i16 = -957097391;
            }
            String str15 = (String) ((Method) D887111).invoke(null, objArr20);
            if (str15 != null) {
                int bravo2 = al.bravo();
                int i112 = ~bravo2;
                int i113 = ~(i112 | (-1796194204));
                int i114 = ((134807816 ^ i113) | (i113 & 134807816)) * (-712);
                int i115 = ((-688653364) ^ i114) + ((i114 & (-688653364)) << 1);
                int i116 = (i112 & 1996930743) | (1996930743 ^ i112);
                int i117 = ~((i116 & (-1796194204)) | (i116 ^ (-1796194204)));
                int i118 = ~(((-1661386388) & bravo2) | ((-1661386388) ^ bravo2));
                int i119 = (i115 - (~(-(-(((i117 & i118) | (i117 ^ i118)) * (-712)))))) - 1;
                int i120 = ~bravo2;
                int i121 = ~((i120 & (-1796194204)) | (i120 ^ (-1796194204)));
                int i122 = (((i121 & 1996930743) | (1996930743 ^ i121)) * 712) + i119;
                int i123 = (558286445 ^ i4) | (558286445 & i4);
                int i124 = -(-(((i123 & (-1997986558)) | (i123 ^ (-1997986558))) * (-676)));
                int i125 = (((-18393814) | i124) << 1) - (i124 ^ (-18393814));
                int i126 = ~i4;
                int i127 = ~((558286445 & i126) | (i126 ^ 558286445));
                int i128 = -(-(((1443895440 ^ i127) | (i127 & 1443895440)) * 676));
                int i129 = (i125 ^ i128) + ((i128 & i125) << 1);
                int i130 = ~((-1997986558) | i126);
                int i131 = (i130 & 554091117) | (554091117 ^ i130);
                int i132 = ~((2002181885 & i4) | (2002181885 ^ i4));
                int i133 = ((i131 & i132) | (i131 ^ i132)) * 676;
                if (i122 <= ((i129 | i133) << 1) - (i133 ^ i129)) {
                    str15.isEmpty();
                    throw null;
                }
                if (!str15.isEmpty()) {
                    i17 = (~(i4 & 267)) & (i4 | 267);
                }
            }
            char myPid = (char) (Process.myPid() >> 22);
            int i134 = -(AudioTrack.getMinVolume() > f5 ? 1 : (AudioTrack.getMinVolume() == f5 ? 0 : -1));
            Object[] objArr22 = new Object[1];
            bravo(myPid, (i134 ^ 179) + ((i134 & 179) << 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, objArr22);
            Object[] objArr23 = {(String) objArr22[0]};
            Object D887112 = uH18377.D8871(i16);
            if (D887112 == null) {
                float f11 = f5;
                int i135 = 52 - (PointF.length(f11, f11) > f11 ? 1 : (PointF.length(f11, f11) == f11 ? 0 : -1));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3158;
                char gidForName = (char) (58073 - Process.getGidForName(str));
                byte b15 = (byte) (i102 & 1);
                byte b16 = (byte) (b15 + 1);
                Object[] objArr24 = new Object[1];
                charlie(b15, b16, (byte) (b16 - 2), objArr24);
                D887112 = uH18377.setPivotYN16904(i135, fadingEdgeLength, gidForName, 424179844, false, (String) objArr24[0], new Class[]{String.class});
            }
            String str16 = (String) ((Method) D887112).invoke(null, objArr23);
            if (str16 != null) {
                int i136 = charlie;
                delta = ((i136 & 99) + (i136 | 99)) % 128;
                if (!str16.isEmpty()) {
                    i17 = (i4 & (-268)) | (i91 & 267);
                }
            }
            i17 = i4;
        }
        int i137 = (~(i4 & i97)) & (i4 | i97);
        int i138 = -i137;
        int i139 = ((i137 & i138) | (i137 ^ i138)) >> 31;
        int i140 = i17 & (~i139);
        int i141 = i97 & i139;
        int i142 = (i140 & i141) | (i140 ^ i141);
        Object D887113 = uH18377.D8871(1074526551);
        if (D887113 == null) {
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 51;
            int scrollBarSize = 1055 - (ViewConfiguration.getScrollBarSize() >> 8);
            char indexOf2 = (char) TextUtils.indexOf(str, str, 0);
            byte b17 = (byte) 0;
            byte b18 = (byte) (b17 - 1);
            i18 = 24;
            Object[] objArr25 = new Object[1];
            charlie(b17, b18, (byte) (b18 + 1), objArr25);
            D887113 = uH18377.setPivotYN16904(threadPriority, scrollBarSize, indexOf2, -1615832190, false, (String) objArr25[0], new Class[0]);
        } else {
            i18 = 24;
        }
        long longValue4 = ((Long) ((Method) D887113).invoke(null, null)).longValue();
        long j36 = -1624090900;
        long romeo = ao.ad.romeo();
        long j37 = j36 ^ j30;
        long j38 = 381;
        long j39 = (j38 * ((j37 | longValue4) ^ j30)) + ((((j37 | (longValue4 ^ j30)) ^ j30) | (((romeo ^ j30) | longValue4) ^ j30) | ((j36 | longValue4) ^ j30)) * j38) + ((-381) * (longValue4 | romeo | j37)) + (382 * longValue4) + ((-380) * j36) + 1803656617;
        int i143 = (((int) j39) & ((((~((-1849391692) | i91)) | 739913738 | (~(2117827147 | i4))) * 676) + (((~(1008349194 | i91)) | 1109477953) * 676) + (((-1109477954) | i4) * (-676)) + 1248695985)) | (((int) (j39 >> c3)) & ((((~(914659433 | i91)) | (-1943081452)) * 217) + (((~(1943081451 | i4)) | (-2010487276)) * 217) + ((((~(1943081451 | i91)) | (~(914659433 | i4))) * 217) - 461379172)));
        int i144 = 198 - (i143 ^ (-1));
        int i145 = (i144 | i4) & (~(i4 & i144));
        int i146 = -i143;
        int i147 = ((i143 & i146) | (i143 ^ i146)) >> 31;
        int i148 = (~i147) & i4;
        int i149 = i147 & i145;
        int i150 = (i149 & i148) | (i148 ^ i149);
        int i151 = (~(i4 & i142)) & (i4 | i142);
        int i152 = -i151;
        int i153 = ((i151 & i152) | (i151 ^ i152)) >> 31;
        int i154 = (i150 & (~i153)) | (i153 & i142);
        int argb2 = 203 - Color.argb(0, 0, 0, 0);
        int i155 = -TextUtils.getOffsetBefore(str, 0);
        int i156 = (i155 & 20) + (i155 | 20);
        Object[] objArr26 = new Object[1];
        bravo((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), argb2, i156, objArr26);
        String str17 = (String) objArr26[0];
        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11921);
        int i157 = 223 - (~TextUtils.lastIndexOf(str, '0'));
        int i158 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
        int i159 = (i158 & 5) + (i158 | 5);
        Object[] objArr27 = new Object[1];
        bravo(maximumFlingVelocity, i157, i159, objArr27);
        String str18 = (String) objArr27[0];
        File file2 = new File(str17);
        if (file2.exists()) {
            int i160 = charlie + 119;
            delta = i160 % 128;
            if (i160 % 2 == 0) {
                file2.isFile();
                throw null;
            }
            if (file2.isFile()) {
                try {
                    Scanner scanner = new Scanner(new FileInputStream(file2));
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int i161 = -ImageFormat.getBitsPerPixel(0);
                    Object[] objArr28 = new Object[1];
                    bravo(packedPositionGroup, ((i161 | 228) << 1) - (i161 ^ 228), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, objArr28);
                    Scanner useDelimiter = scanner.useDelimiter((String) objArr28[0]);
                    next = useDelimiter.hasNext() ? useDelimiter.next() : str;
                    useDelimiter.close();
                } catch (IOException unused) {
                }
                if (next.contains(str18)) {
                    charlie = (delta + 105) % 128;
                    i19 = 1;
                    int i162 = -i19;
                    int i163 = ((i19 & i162) | (i19 ^ i162)) >> 31;
                    int i164 = (~i163) & i4;
                    int i165 = i163 & ((i4 & (-263)) | (i91 & 262));
                    int i166 = (i165 & i164) | (i164 ^ i165);
                    int i167 = ((~i154) & i4) | (i154 & i91);
                    int i168 = -i167;
                    int i169 = ((i167 & i168) | (i167 ^ i168)) >> 31;
                    int i170 = i166 & (~i169);
                    int i171 = i154 & i169;
                    i20 = (i171 & i170) | (i170 ^ i171);
                    int i172 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    int i173 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 230;
                    int i174 = -(-TextUtils.indexOf(str, str));
                    int i175 = (i174 ^ 31) + ((i174 & 31) << 1);
                    Object[] objArr29 = new Object[1];
                    bravo((char) ((i172 & 54604) + (i172 | 54604)), i173, i175, objArr29);
                    String str19 = (String) objArr29[0];
                    int i176 = -Process.getGidForName(str);
                    int bravo3 = al.bravo();
                    int i177 = ~i176;
                    int i178 = ~((i177 ^ (-262)) | (i177 & (-262)));
                    int i179 = ~((-262) | bravo3);
                    int i180 = (((i178 ^ i179) | (i179 & i178)) * 576) + ((i176 * (-575)) - 150075);
                    int i181 = ~((i177 ^ 261) | (i177 & 261));
                    int i182 = (~bravo3) | (-262);
                    int i183 = ~((i176 & i182) | (i182 ^ i176));
                    int i184 = ((i183 & i181) | (i181 ^ i183)) * 576;
                    int i185 = (i180 & i184) + (i184 | i180);
                    int i186 = (~(i177 | (-262))) * 576;
                    int i187 = (i185 & i186) + (i186 | i185);
                    int i188 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i189 = ((i188 | 22) << 1) - (i188 ^ 22);
                    Object[] objArr30 = new Object[1];
                    bravo((char) ((-ImageFormat.getBitsPerPixel(0)) - 1), i187, i189, objArr30);
                    String str20 = (String) objArr30[0];
                    char trimmedLength = (char) TextUtils.getTrimmedLength(str);
                    int i190 = -(-Gravity.getAbsoluteGravity(0, 0));
                    int i191 = ((i190 | 285) << 1) - (i190 ^ 285);
                    int i192 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i193 = (i192 ^ 28) + ((i192 & 28) << 1);
                    Object[] objArr31 = new Object[1];
                    bravo(trimmedLength, i191, i193, objArr31);
                    String str21 = (String) objArr31[0];
                    char c20 = (char) ((-2) - ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) ^ (-1)));
                    int keyRepeatTimeout = 313 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i194 = -MotionEvent.axisFromString(str);
                    i21 = 1;
                    int i195 = (i194 ^ 13) + ((i194 & 13) << 1);
                    Object[] objArr32 = new Object[1];
                    bravo(c20, keyRepeatTimeout, i195, objArr32);
                    i22 = 0;
                    strArr = new String[]{str19, str20, str21, (String) objArr32[0]};
                    i23 = 0;
                    while (true) {
                        if (i23 < 4) {
                            i24 = i20;
                            i25 = i4;
                            break;
                        }
                        Object[] objArr33 = new Object[i21];
                        objArr33[i22] = strArr[i23];
                        Object D887114 = uH18377.D8871(-2104138125);
                        if (D887114 == null) {
                            int alpha3 = Color.alpha(i22) + 52;
                            int i196 = (ExpandableListView.getPackedPositionForChild(i22, i22) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i22, i22) == 0L ? 0 : -1)) + 2952;
                            char combineMeasuredStates = (char) View.combineMeasuredStates(i22, i22);
                            byte b19 = (byte) (i102 & 1);
                            byte b20 = (byte) (b19 + 1);
                            Object[] objArr34 = new Object[1];
                            charlie(b19, b20, (byte) (b20 - 1), objArr34);
                            D887114 = uH18377.setPivotYN16904(alpha3, i196, combineMeasuredStates, 1563346086, false, (String) objArr34[0], new Class[]{String.class});
                        }
                        long longValue5 = ((Long) ((Method) D887114).invoke(null, objArr33)).longValue();
                        long j40 = -251847028;
                        long j41 = (591 * longValue5) + ((-589) * j40);
                        i24 = i20;
                        strArr14 = strArr;
                        long j42 = 590;
                        long j43 = longValue5 ^ j30;
                        long j44 = i4;
                        long j45 = j44 ^ j30;
                        long j46 = ((j43 | j45) ^ j30) | ((j43 | j40) ^ j30) | ((j45 | j40) ^ j30);
                        long j47 = j40 ^ j30;
                        long j48 = (((((j47 | j45) ^ j30) | ((j45 | longValue5) ^ j30)) * j42) + (((-1180) * j46) + (((j46 | (((j47 | longValue5) | j44) ^ j30)) * j42) + j41))) - 977773502;
                        int i197 = (~((-2057641613) | i4)) | (~((-620415202) | i91));
                        int i198 = ~(2057641612 | i91);
                        if (((((int) j48) & ((((~((-1364617562) | i91)) | (~(1364617561 | i4)) | (~(1493123324 | i4))) * 831) + ((~((-145293477) | i4)) * (-1662)) + ((((~((-1493123325) | i91)) | (~(1509911037 | i4))) * (-831)) - 2023119758))) | (((int) (j48 >> c3)) & ((((-2130697966) | i198) * 516) + (((~((-1510282765) | i4)) | (~(2130697965 | i91))) * 516) + ((i197 | i198) * (-516)) + 335073122))) != 0) {
                            int bravo4 = al.bravo();
                            int i199 = ~(((-232348637) & bravo4) | ((-232348637) ^ bravo4));
                            int i200 = (i199 & 202391936) | (202391936 ^ i199);
                            int i201 = ~bravo4;
                            int i202 = ~((i201 & 1846567330) | (i201 ^ 1846567330) | 232348636);
                            int i203 = 1728683885 - (~(((i200 & i202) | (i200 ^ i202)) * 886));
                            int i204 = ~bravo4;
                            int i205 = ~((i204 ^ 232348636) | (232348636 & i204));
                            int i206 = ((i205 & 1846567330) | (1846567330 ^ i205)) * (-1772);
                            int i207 = ((~(i204 | 1846567330)) * 886) + (((i203 | i206) << 1) - (i206 ^ i203));
                            int bravo5 = al.bravo();
                            int i208 = ~(((-1800996989) & bravo5) | ((-1800996989) ^ bravo5));
                            int i209 = -(-(((i208 & (-1543106257)) | ((-1543106257) ^ i208)) * (-948)));
                            if (i207 <= (((~((~bravo5) | (-1264126033))) * (-948)) + (((-1283585988) ^ i209) + ((i209 & (-1283585988)) << 1))) - (-2147440988)) {
                                int i210 = i23 >> 16274;
                                i25 = (i210 & i91) | ((~i210) & i4);
                            } else {
                                int i211 = i23 + 252;
                                i25 = ((~i211) & i4) | (i211 & i91);
                            }
                        } else {
                            i23++;
                            i20 = i24;
                            strArr = strArr14;
                            i22 = 0;
                            i21 = 1;
                        }
                    }
                    int i212 = i4 ^ i24;
                    int i213 = -i212;
                    int i214 = ((i212 & i213) | (i212 ^ i213)) >> 31;
                    int i215 = i25 & (~i214);
                    int i216 = i214 & i24;
                    int i217 = (i215 & i216) | (i215 ^ i216);
                    Object[] objArr35 = new Object[1];
                    bravo((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 327, 11 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0))), objArr35);
                    objArr = new Object[]{(String) objArr35[0]};
                    D8871 = uH18377.D8871(i16);
                    if (D8871 == null) {
                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 52;
                        int gidForName2 = Process.getGidForName(str) + 3159;
                        char offsetAfter = (char) (TextUtils.getOffsetAfter(str, 0) + 58074);
                        byte b21 = (byte) (i102 & 1);
                        byte b22 = (byte) (b21 + 1);
                        Object[] objArr36 = new Object[1];
                        charlie(b21, b22, (byte) (b22 - 2), objArr36);
                        D8871 = uH18377.setPivotYN16904(fadingEdgeLength2, gidForName2, offsetAfter, 424179844, false, (String) objArr36[0], new Class[]{String.class});
                    }
                    if (((String) ((Method) D8871).invoke(null, objArr)) != null) {
                        al.bravo();
                        al.bravo();
                        int i218 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i219 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                        int i220 = (i219 ^ 340) + ((i219 & 340) << 1);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                        bravo((char) ((i218 & 12773) + (i218 | 12773)), i220, (bitsPerPixel2 & 10) + (bitsPerPixel2 | 10), new Object[1]);
                        if (!(!r2.contains((String) r6[0]))) {
                            i26 = (~(i4 & 250)) & (i4 | 250);
                            int i221 = (~(i4 & i217)) & (i4 | i217);
                            int i222 = (i221 | (-i221)) >> 31;
                            int i223 = (i217 & i222) | (i26 & (~i222));
                            int size = View.MeasureSpec.getSize(0);
                            int i224 = 348 - (~TextUtils.getOffsetAfter(str, 0));
                            int i225 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i226 = ((i225 | 18) << 1) - (i225 ^ 18);
                            Object[] objArr37 = new Object[1];
                            bravo((char) ((size & 2450) + (size | 2450)), i224, i226, objArr37);
                            String str22 = (String) objArr37[0];
                            char c21 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i227 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                            Object[] objArr38 = new Object[1];
                            bravo(c21, (i227 ^ 365) + ((i227 & 365) << 1), 5 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr38);
                            Object[] objArr39 = new Object[i13];
                            objArr39[1] = (String) objArr38[0];
                            objArr39[0] = str22;
                            D88712 = uH18377.D8871(1214576837);
                            if (D88712 == null) {
                                int indexOf3 = 52 - TextUtils.indexOf(str, str, 0, 0);
                                int offsetAfter2 = TextUtils.getOffsetAfter(str, 0) + 3314;
                                char c22 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                byte b23 = (byte) 0;
                                byte b24 = (byte) (b23 - 1);
                                Object[] objArr40 = new Object[1];
                                charlie(b23, b24, (byte) (b24 + 1), objArr40);
                                D88712 = uH18377.setPivotYN16904(indexOf3, offsetAfter2, c22, -1746970096, false, (String) objArr40[0], new Class[]{String.class, String.class});
                            }
                            long longValue6 = ((Long) ((Method) D88712).invoke(null, objArr39)).longValue();
                            long j49 = -309595782;
                            long j50 = 71;
                            long j51 = -69;
                            long j52 = j51 * longValue6;
                            long j53 = -140;
                            long j54 = ((j49 ^ j30) | longValue6) ^ j30;
                            long j55 = i4;
                            long j56 = ((j54 | ((longValue6 | j55) ^ j30)) * j53) + j52 + (j50 * j49);
                            long j57 = 70;
                            j5 = ((((j54 | (((longValue6 ^ j30) | j49) ^ j30)) | ((j49 | j55) ^ j30)) * j57) + (((((j49 | longValue6) | j55) ^ j30) * j57) + j56)) - 1238042556;
                            if (((((int) (j5 >> c3)) & ((((~(920418784 | i4)) | 844640352) * 433) + ((920418784 | (~(1937322100 | i4))) * (-433)) + (((~((-1092681749) | i91)) * 433) - 795245226))) | (((int) j5) & (((1091419110 | (~(1766321775 | i4))) * 272) + ((675431433 | (~((-1766321776) | i4))) * (-272)) + (((~((-1090890343) | i91)) | (~(1766850543 | i4))) * (-272)) + 1747672037))) != 0) {
                                int i228 = charlie;
                                int i229 = ((i228 | 19) << 1) - (i228 ^ 19);
                                int i230 = i229 % 128;
                                delta = i230;
                                i27 = i229 % 2 == 0 ? (~(i4 & 12774)) & (i4 | 12774) : (i4 & (-252)) | (i91 & 251);
                                charlie = (i230 + 115) % 128;
                            } else {
                                i27 = i4;
                            }
                            int i231 = ((~i223) & i4) | (i223 & i91);
                            int i232 = -i231;
                            int i233 = ((i231 & i232) | (i231 ^ i232)) >> 31;
                            int i234 = (i223 & i233) | (i27 & (~i233));
                            char c23 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
                            int i235 = -ImageFormat.getBitsPerPixel(0);
                            int i236 = (i235 ^ 371) + ((i235 & 371) << 1);
                            int i237 = -Color.alpha(0);
                            Object[] objArr41 = new Object[1];
                            bravo(c23, i236, (i237 ^ 23) + ((i237 & 23) << 1), objArr41);
                            Object[] objArr42 = {(String) objArr41[0]};
                            D88713 = uH18377.D8871(i16);
                            if (D88713 == null) {
                                int i238 = 53 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int packedPositionChild = 3157 - ExpandableListView.getPackedPositionChild(0L);
                                char bitsPerPixel3 = (char) (58073 - ImageFormat.getBitsPerPixel(0));
                                byte b25 = (byte) (i102 & 1);
                                byte b26 = (byte) (b25 + 1);
                                j6 = j51;
                                Object[] objArr43 = new Object[1];
                                charlie(b25, b26, (byte) (b26 - 2), objArr43);
                                D88713 = uH18377.setPivotYN16904(i238, packedPositionChild, bitsPerPixel3, 424179844, false, (String) objArr43[0], new Class[]{String.class});
                            } else {
                                j6 = j51;
                            }
                            String lowerCase = ((String) ((Method) D88713).invoke(null, objArr42)).toLowerCase();
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i239 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 394;
                            int i240 = -TextUtils.indexOf(str, str);
                            int i241 = (i240 & 4) + (i240 | 4);
                            Object[] objArr44 = new Object[1];
                            bravo(longPressTimeout, i239, i241, objArr44);
                            int i242 = lowerCase.contains((String) objArr44[0]) ? (~(i4 & 264)) & (i4 | 264) : i4;
                            int i243 = ((~i234) & i4) | (i234 & i91);
                            int i244 = (i243 | (-i243)) >> 31;
                            int i245 = i242 & (~i244);
                            int i246 = i234 & i244;
                            i28 = (i246 & i245) | (i245 ^ i246);
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i247 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int i248 = (i247 ^ 399) + ((i247 & 399) << 1);
                            int i249 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i250 = ((i249 | 41) << 1) - (i249 ^ 41);
                            Object[] objArr45 = new Object[1];
                            bravo(edgeSlop, i248, i250, objArr45);
                            String str23 = (String) objArr45[0];
                            int rgb = Color.rgb(0, 0, 0);
                            char c24 = (char) (((rgb | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) << 1) - (16777216 ^ rgb));
                            int i251 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                            Object[] objArr46 = new Object[1];
                            bravo(c24, (i251 ^ 441) + ((i251 & 441) << 1), 39 - (~(-Drawable.resolveOpacity(0, 0))), objArr46);
                            String str24 = (String) objArr46[0];
                            char c25 = (char) (22131 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int i252 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Object[] objArr47 = new Object[1];
                            bravo(c25, ((i252 | 481) << 1) - (i252 ^ 481), 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr47);
                            String str25 = (String) objArr47[0];
                            int i253 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int bravo6 = al.bravo();
                            int i254 = i253 * (-183);
                            int i255 = (i254 & 6052645) + (i254 | 6052645);
                            int i256 = ~i253;
                            int i257 = ~((i256 & 32717) | (i256 ^ 32717));
                            int i258 = ~bravo6;
                            int i259 = -(-((i257 | (~((i258 & 32717) | (i258 ^ 32717)))) * 184));
                            int i260 = ((i255 | i259) << 1) - (i259 ^ i255);
                            int i261 = ~((-32718) | i253);
                            int i262 = (i260 - (~(((i261 & bravo6) | (bravo6 ^ i261)) * (-184)))) - 1;
                            int i263 = ~i253;
                            int i264 = ~bravo6;
                            int i265 = -(-((~((i263 & i264) | (i263 ^ i264))) * 184));
                            Object[] objArr48 = new Object[1];
                            bravo((char) ((i262 ^ i265) + ((i265 & i262) << 1)), 509 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), objArr48);
                            String str26 = (String) objArr48[0];
                            Object[] objArr49 = new Object[1];
                            bravo((char) Gravity.getAbsoluteGravity(0, 0), 535 - Gravity.getAbsoluteGravity(0, 0), 26 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16)))), objArr49);
                            String str27 = (String) objArr49[0];
                            int i266 = -Color.blue(0);
                            int i267 = ~((-13156) | i266);
                            int i268 = ~((i266 ^ i4) | (i266 & i4));
                            int i269 = (((i267 & i268) | (i267 ^ i268)) * (-814)) + (i266 * (-813)) + 5367240;
                            int i270 = ~(((-13156) & i91) | ((-13156) ^ i91));
                            int i271 = ~i266;
                            int i272 = ~((i271 & 13155) | (i271 ^ 13155));
                            int i273 = (i270 & i272) | (i270 ^ i272);
                            int i274 = -(-(((i273 & i268) | (i273 ^ i268)) * HttpConstants.HTTP_PROXY_AUTH));
                            int i275 = (i269 & i274) + (i274 | i269);
                            int i276 = ~(i271 | i4);
                            int i277 = (i276 & i272) | (i272 ^ i276);
                            int i278 = ~(i4 | 13155);
                            int i279 = ((i277 & i278) | (i277 ^ i278)) * HttpConstants.HTTP_PROXY_AUTH;
                            char c26 = (char) (((i275 | i279) << 1) - (i279 ^ i275));
                            int i280 = -ExpandableListView.getPackedPositionGroup(0L);
                            int i281 = (i280 & 562) + (i280 | 562);
                            int i282 = -(-ExpandableListView.getPackedPositionGroup(0L));
                            int i283 = (i282 & 27) + (i282 | 27);
                            i29 = 1;
                            Object[] objArr50 = new Object[1];
                            bravo(c26, i281, i283, objArr50);
                            c4 = 0;
                            strArr2 = new String[]{str23, str24, str25, str26, str27, (String) objArr50[0]};
                            i30 = 0;
                            while (true) {
                                if (i30 >= 6) {
                                    i31 = i28;
                                    i32 = i4;
                                    break;
                                }
                                Object[] objArr51 = new Object[i29];
                                objArr51[c4] = strArr2[i30];
                                Object D887115 = uH18377.D8871(i16);
                                if (D887115 == null) {
                                    int touchSlop = 52 - (ViewConfiguration.getTouchSlop() >> 8);
                                    int keyRepeatDelay = 3158 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    char indexOf4 = (char) (TextUtils.indexOf(str, str, 0) + 58074);
                                    byte b27 = (byte) (i102 & 1);
                                    byte b28 = (byte) (b27 + 1);
                                    i31 = i28;
                                    strArr13 = strArr2;
                                    i57 = i30;
                                    Object[] objArr52 = new Object[1];
                                    charlie(b27, b28, (byte) (b28 - 2), objArr52);
                                    D887115 = uH18377.setPivotYN16904(touchSlop, keyRepeatDelay, indexOf4, 424179844, false, (String) objArr52[0], new Class[]{String.class});
                                } else {
                                    i31 = i28;
                                    strArr13 = strArr2;
                                    i57 = i30;
                                }
                                String str28 = (String) ((Method) D887115).invoke(null, objArr51);
                                if (str28 != null) {
                                    int i284 = charlie;
                                    delta = ((i284 & 49) + (i284 | 49)) % 128;
                                    if (!str28.isEmpty()) {
                                        i32 = (i4 & (-266)) | (i91 & 265);
                                        break;
                                    }
                                }
                                int i285 = (i57 ^ 79) + ((i57 & 79) << 1);
                                i30 = (i285 & (-78)) + (i285 | (-78));
                                i28 = i31;
                                strArr2 = strArr13;
                                i29 = 1;
                                c4 = 0;
                            }
                            int i286 = (~(i4 & i31)) & (i4 | i31);
                            int i287 = -i286;
                            int i288 = ((i286 & i287) | (i286 ^ i287)) >> 31;
                            int i289 = i32 & (~i288);
                            int i290 = i31 & i288;
                            int i291 = (i289 & i290) | (i289 ^ i290);
                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            Object[] objArr53 = new Object[1];
                            bravo((char) (((scrollBarFadeDuration | 2450) << 1) - (scrollBarFadeDuration ^ 2450)), Gravity.getAbsoluteGravity(0, 0) + 349, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr53);
                            String str29 = (String) objArr53[0];
                            int i292 = -(-Color.red(0));
                            int i293 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i294 = i293 * (-500);
                            int i295 = (i294 ^ (-295000)) + ((i294 & (-295000)) << 1);
                            int i296 = ~(((-591) & i293) | ((-591) ^ i293));
                            int i297 = ~i293;
                            int i298 = (i297 ^ 590) | (i297 & 590);
                            int i299 = ~((i298 & i4) | (i298 ^ i4));
                            int i300 = -(-(((i296 & i299) | (i296 ^ i299)) * HttpConstants.HTTP_NOT_IMPLEMENTED));
                            int i301 = (i295 & i300) + (i295 | i300);
                            int i302 = ~i293;
                            int i303 = -(-((~((i302 ^ (-591)) | (i302 & (-591)))) * 1002));
                            int i304 = (i301 & i303) + (i303 | i301);
                            int i305 = ~i4;
                            int i306 = (i302 & i305) | (i302 ^ i305);
                            int i307 = i306 ^ 590;
                            Object[] objArr54 = new Object[1];
                            bravo((char) ((i292 ^ 27526) + ((i292 & 27526) << 1)), (i304 - (~((~((i306 & 590) | i307)) * HttpConstants.HTTP_NOT_IMPLEMENTED))) - 1, Drawable.resolveOpacity(0, 0) + 6, objArr54);
                            Object[] objArr55 = {str29, (String) objArr54[0]};
                            D88714 = uH18377.D8871(1214576837);
                            if (D88714 == null) {
                                byte b29 = (byte) 0;
                                byte b30 = (byte) (b29 - 1);
                                Object[] objArr56 = new Object[1];
                                charlie(b29, b30, (byte) (b30 + 1), objArr56);
                                D88714 = uH18377.setPivotYN16904((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52, View.combineMeasuredStates(0, 0) + 3314, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), -1746970096, false, (String) objArr56[0], new Class[]{String.class, String.class});
                            }
                            long longValue7 = ((Long) ((Method) D88714).invoke(null, objArr55)).longValue();
                            long j58 = -21590991;
                            long j59 = ((-463) * longValue7) + (465 * j58);
                            long j60 = 464;
                            long j61 = longValue7 ^ j30;
                            long j62 = (int) Runtime.getRuntime().totalMemory();
                            long j63 = j62 ^ j30;
                            long j64 = (j61 | j58) ^ j30;
                            long j65 = ((j60 * (j64 | ((j58 | j62) ^ j30))) + (((-464) * ((j62 | (j58 ^ j30)) | j61)) + ((((((j61 | j63) ^ j30) | j64) | ((j63 | j58) ^ j30)) * j60) + j59))) - 1526047347;
                            i33 = ((int) (j65 >> c3)) & ((((~((-1610647617) | i91)) | 173421205 | (~(1973454946 | i4))) * 717) + ((((~((-1610647617) | i4)) | ((~(i91 | 1973454946)) | 173421205)) * 717) - 211874720));
                            i34 = ((int) j65) & ((((~((-675372788) | i4)) | (~((-2112599198) | i91))) * 333) + ((((~((-675372788) | i91)) | (~((-2112599198) | i4))) * 333) - 2118961147));
                            if (((i33 & i34) | (i33 ^ i34)) != 0) {
                                i35 = (i4 & (-261)) | (i91 & 260);
                            } else {
                                Object[] objArr57 = new Object[1];
                                bravo((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 595 - (~TextUtils.indexOf((CharSequence) str, '0')), 12 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr57);
                                String str30 = (String) objArr57[0];
                                char c27 = (char) (65419 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                                int i308 = -Drawable.resolveOpacity(0, 0);
                                int i309 = -TextUtils.lastIndexOf(str, '0', 0);
                                Object[] objArr58 = new Object[1];
                                bravo(c27, ((i308 | 608) << 1) - (i308 ^ 608), (i309 & 8) + (i309 | 8), objArr58);
                                Object[] objArr59 = {str30, (String) objArr58[0]};
                                Object D887116 = uH18377.D8871(1214576837);
                                if (D887116 == null) {
                                    int offsetAfter3 = TextUtils.getOffsetAfter(str, 0) + 52;
                                    int indexOf5 = TextUtils.indexOf((CharSequence) str, '0') + 3315;
                                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                    byte b31 = (byte) 0;
                                    byte b32 = (byte) (b31 - 1);
                                    Object[] objArr60 = new Object[1];
                                    charlie(b31, b32, (byte) (b32 + 1), objArr60);
                                    D887116 = uH18377.setPivotYN16904(offsetAfter3, indexOf5, scrollBarSize2, -1746970096, false, (String) objArr60[0], new Class[]{String.class, String.class});
                                }
                                long longValue8 = ((Long) ((Method) D887116).invoke(null, objArr59)).longValue();
                                long j66 = 231707290;
                                long j67 = -495;
                                long j68 = j66 ^ j30;
                                long j69 = ((j68 | (longValue8 ^ j30)) ^ j30) | ((j68 | j55) ^ j30);
                                long j70 = ((496 * (longValue8 | j55)) + (((-496) * (j69 | ((((j55 ^ j30) | j66) | longValue8) ^ j30))) + ((992 * j69) + ((j67 * longValue8) + (j67 * j66))))) - 1779345628;
                                int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                int i310 = ~freeMemory2;
                                int i311 = (~(i310 | 1245987744)) | (~((-191238667) | i310)) | 19009546;
                                int i312 = ((int) (j70 >> c3)) & ((((~((-1245987745) | i310)) | (~(i310 | 191238666))) * 590) + (i311 * (-1180)) + (((~((-1073758625) | freeMemory2)) | i311) * 590) + 1905528310);
                                int foxtrot3 = ((int) j70) & A0.z.foxtrot(~((-2149473) | i91), -948, (((~(2111775518 | i4)) | (-674549109)) * (-948)) - 1468085767, -1748836712);
                                if (((i312 & foxtrot3) | (i312 ^ foxtrot3)) != 0) {
                                    i35 = i4 ^ 261;
                                    int i313 = charlie;
                                    delta = (((i313 | 113) << 1) - (i313 ^ 113)) % 128;
                                } else {
                                    i35 = i4;
                                }
                            }
                            int i314 = ((~i291) & i4) | (i291 & i91);
                            int i315 = -i314;
                            int i316 = ((i314 & i315) | (i314 ^ i315)) >> 31;
                            int i317 = i35 & (~i316);
                            int i318 = i291 & i316;
                            i36 = (i318 & i317) | (i317 ^ i318);
                            if ((i5 & 8) == 0) {
                                int i319 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                Object[] objArr61 = new Object[1];
                                bravo((char) ((i319 ^ 23000) + ((i319 & 23000) << 1)), 615 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0, 0))), 43 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), objArr61);
                                String str31 = (String) objArr61[0];
                                char maximumDrawingCacheSize = (char) (34422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i320 = 658 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                                int i321 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i322 = (i321 & 42) + (i321 | 42);
                                Object[] objArr62 = new Object[1];
                                bravo(maximumDrawingCacheSize, i320, i322, objArr62);
                                String str32 = (String) objArr62[0];
                                int i323 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int bravo7 = al.bravo();
                                int i324 = i323 * 905;
                                int i325 = (i324 & (-9829155)) + (i324 | (-9829155));
                                int i326 = ~i323;
                                int i327 = ~((i326 ^ bravo7) | (i326 & bravo7));
                                int i328 = ~bravo7;
                                int i329 = ~((i328 & 10885) | (i328 ^ 10885));
                                int i330 = -(-(((i327 & i329) | (i327 ^ i329)) * (-1808)));
                                int i331 = (i325 ^ i330) + ((i325 & i330) << 1);
                                int i332 = (i326 ^ (-10886)) | (i326 & (-10886));
                                int i333 = ~((i332 & bravo7) | (i332 ^ bravo7));
                                int i334 = ~bravo7;
                                int i335 = -(-((i333 | (~((i334 ^ i323) | (i334 & i323) | 10885))) * 904));
                                int i336 = ((i331 | i335) << 1) - (i335 ^ i331);
                                int i337 = ~i323;
                                int i338 = (~((i337 & 10885) | (i337 ^ 10885))) | (~(((-10886) & bravo7) | ((-10886) ^ bravo7)));
                                int i339 = ~(i323 | i334);
                                int i340 = -(-(((i339 & i338) | (i338 ^ i339)) * 904));
                                char c28 = (char) ((i336 & i340) + (i340 | i336));
                                int i341 = -(ViewConfiguration.getTouchSlop() >> 8);
                                int bravo8 = al.bravo();
                                int i342 = i341 * (-1335);
                                int i343 = (i342 ^ (-467567)) + ((i342 & (-467567)) << 1);
                                int i344 = ~((i341 ^ bravo8) | (i341 & bravo8));
                                int i345 = -(-((((-702) ^ i344) | (i344 & (-702))) * (-668)));
                                int i346 = ~((bravo8 & (-702)) | ((-702) ^ bravo8));
                                int i347 = ((i343 & i345) + (i345 | i343)) - (~(-(-(((i341 & i346) | (i341 ^ i346)) * 1336))));
                                int i348 = 1;
                                Object[] objArr63 = new Object[1];
                                bravo(c28, ((i347 - 1) - (~(-(-(((-702) | r9) * 668))))) - 1, 36 - (~(-MotionEvent.axisFromString(str))), objArr63);
                                int i349 = 0;
                                String[] strArr18 = {str31, str32, (String) objArr63[0]};
                                int i350 = 0;
                                while (true) {
                                    if (i350 >= 3) {
                                        i56 = i4;
                                        break;
                                    }
                                    Object[] objArr64 = new Object[i348];
                                    objArr64[i349] = strArr18[i350];
                                    Object D887117 = uH18377.D8871(1979478258);
                                    if (D887117 == null) {
                                        int defaultSize2 = View.getDefaultSize(i349, i349) + 52;
                                        int red = Color.red(i349) + 2951;
                                        char capsMode = (char) TextUtils.getCapsMode(str, i349, i349);
                                        byte b33 = (byte) (i102 & 1);
                                        byte b34 = (byte) (b33 + 1);
                                        strArr12 = strArr18;
                                        Object[] objArr65 = new Object[1];
                                        charlie(b33, b34, b34, objArr65);
                                        D887117 = uH18377.setPivotYN16904(defaultSize2, red, capsMode, -1438133721, false, (String) objArr65[0], new Class[]{String.class});
                                    } else {
                                        strArr12 = strArr18;
                                    }
                                    long longValue9 = ((Long) ((Method) D887117).invoke(null, objArr64)).longValue();
                                    long j71 = 281498052;
                                    long j72 = ((j71 ^ j30) | longValue9) ^ j30;
                                    long j73 = ((j72 | (((longValue9 ^ j30) | j71) ^ j30) | ((j71 | j55) ^ j30)) * j57) + ((((j71 | longValue9) | j55) ^ j30) * j57) + ((j72 | ((longValue9 | j55) ^ j30)) * j53) + (j6 * longValue9) + (j50 * j71) + 493323254;
                                    int i351 = ~((int) SystemClock.elapsedRealtime());
                                    int i352 = ((int) (j73 >> c3)) & ((((~(i351 | (-300057344))) | (-1737283755)) * 783) + ((~((-25198763) | i351)) * (-783)) + 225773743);
                                    int i353 = ~(65853223 | i91);
                                    int i354 = ((int) j73) & (((i353 | 40424230) * 970) + ((25428993 | i353) * (-970)) + 1197262883);
                                    if (((i352 & i354) | (i352 ^ i354)) != 0) {
                                        i56 = (((i350 | 280) << 1) - (i350 ^ 280)) ^ i4;
                                        break;
                                    }
                                    i350 = ((i350 & 1) << 1) + (i350 ^ 1);
                                    strArr18 = strArr12;
                                    i349 = 0;
                                    i348 = 1;
                                }
                                int i355 = ((~i36) & i4) | (i36 & i91);
                                int i356 = -i355;
                                int i357 = ((i355 & i356) | (i355 ^ i356)) >> 31;
                                int i358 = i56 & (~i357);
                                int i359 = i36 & i357;
                                i36 = (i359 & i358) | (i358 ^ i359);
                            }
                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                            int i360 = -(KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr66 = new Object[1];
                            bravo(absoluteGravity, (i360 ^ 739) + ((i360 & 739) << 1), 40 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr66);
                            String str33 = (String) objArr66[0];
                            char c29 = (char) ((-2) - (~(-ExpandableListView.getPackedPositionChild(0L))));
                            int i361 = -Color.blue(0);
                            Object[] objArr67 = new Object[1];
                            bravo(c29, (i361 ^ 780) + ((i361 & 780) << 1), 30 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr67);
                            strArr3 = new String[]{str33, (String) objArr67[0]};
                            i37 = 0;
                            while (true) {
                                if (i37 >= 2) {
                                    i38 = i36;
                                    i39 = i4;
                                    break;
                                }
                                charlie = (delta + 79) % 128;
                                Object[] objArr68 = {strArr3[i37]};
                                Object D887118 = uH18377.D8871(-2104138125);
                                if (D887118 == null) {
                                    int i362 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51;
                                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 2951;
                                    char offsetBefore = (char) TextUtils.getOffsetBefore(str, 0);
                                    byte b35 = (byte) (i102 & 1);
                                    byte b36 = (byte) (b35 + 1);
                                    Object[] objArr69 = new Object[1];
                                    charlie(b35, b36, (byte) (b36 - 1), objArr69);
                                    D887118 = uH18377.setPivotYN16904(i362, touchSlop2, offsetBefore, 1563346086, false, (String) objArr69[0], new Class[]{String.class});
                                }
                                long longValue10 = ((Long) ((Method) D887118).invoke(null, objArr68)).longValue();
                                long j74 = -513260148;
                                long j75 = j74 ^ j30;
                                i38 = i36;
                                strArr11 = strArr3;
                                long uptimeMillis = (int) SystemClock.uptimeMillis();
                                long j76 = ((235 * ((((longValue10 ^ j30) | j74) ^ j30) | ((uptimeMillis | (j75 | longValue10)) ^ j30))) + (((-470) * (longValue10 | ((j75 | uptimeMillis) ^ j30))) + (((-235) * (longValue10 | ((j75 | (uptimeMillis ^ j30)) ^ j30))) + ((471 * longValue10) + (236 * j74))))) - 716360382;
                                int i363 = ((int) (j76 >> c3)) & (((~(((int) Process.getElapsedCpuTime()) | 2033146367)) * 566) + ((((~(958812637 | r2)) | 1074333730) * (-566)) - 375238442));
                                int foxtrot4 = ((int) j76) & A0.z.foxtrot((~(300933593 | i91)) | 1987434074, 381, ((2013263835 | i4) * (-381)) - 1931646530, 1745624468);
                                if (((i363 & foxtrot4) | (i363 ^ foxtrot4)) != 0) {
                                    int i364 = i37 + 288;
                                    i39 = ((~i364) & i4) | (i364 & i91);
                                    break;
                                }
                                int i365 = (i37 ^ (-72)) + ((i37 & (-72)) << 1);
                                i37 = ((i365 | 73) << 1) - (i365 ^ 73);
                                i36 = i38;
                                strArr3 = strArr11;
                            }
                            int i366 = (~(i4 & i38)) & (i4 | i38);
                            int i367 = -i366;
                            int i368 = ((i366 & i367) | (i366 ^ i367)) >> 31;
                            int i369 = i39 & (~i368);
                            int i370 = i38 & i368;
                            int i371 = (i369 & i370) | (i369 ^ i370);
                            D88715 = uH18377.D8871(-344556366);
                            if (D88715 == null) {
                                int alpha4 = 52 - Color.alpha(0);
                                int indexOf6 = 3105 - TextUtils.indexOf((CharSequence) str, '0', 0);
                                char c30 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15991);
                                byte b37 = (byte) 0;
                                byte b38 = (byte) (b37 - 1);
                                Object[] objArr70 = new Object[1];
                                charlie(b37, b38, (byte) (b38 + 1), objArr70);
                                D88715 = uH18377.setPivotYN16904(alpha4, indexOf6, c30, 885907047, false, (String) objArr70[0], new Class[0]);
                            }
                            long longValue11 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                            long j77 = -5393951;
                            long j78 = 829;
                            long j79 = -828;
                            long j80 = j55 ^ j30;
                            long j81 = (((((j77 ^ j30) | (longValue11 ^ j30)) ^ j30) | (((j80 | j77) | longValue11) ^ j30)) * j79) + (j78 * longValue11) + (j78 * j77);
                            long j82 = longValue11 | j77;
                            long j83 = ((828 * (j82 ^ j30)) + ((j79 * (j82 | j80)) + j81)) - 146859147;
                            i40 = ((int) (j83 >> c3)) & ((((~((~((int) SystemClock.elapsedRealtime())) | (-1897101270))) | 285286912) * 983) + ((((~(459874858 | r3)) | (-1897101270)) * (-983)) - 661675792));
                            int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                            int i372 = ((~((-1765393432) | freeMemory3)) * 216) + 1620249117;
                            int i373 = ~freeMemory3;
                            i41 = ((int) j83) & ((((~(i373 | (-1765393432))) | 328167021) * 216) + (((-17384454) | i373) * (-216)) + i372);
                            if (((i40 & i41) | (i40 ^ i41)) != 1) {
                                Object[] objArr71 = {1};
                                Object D887119 = uH18377.D8871(-38624464);
                                if (D887119 == null) {
                                    int i374 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51;
                                    int i375 = 2847 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    char threadPriority2 = (char) (62567 - ((Process.getThreadPriority(0) + 20) >> 6));
                                    byte b39 = (byte) 0;
                                    byte b40 = (byte) (b39 - 1);
                                    Object[] objArr72 = new Object[1];
                                    charlie(b39, b40, (byte) (b40 + 1), objArr72);
                                    D887119 = uH18377.setPivotYN16904(i374, i375, threadPriority2, 571015653, false, (String) objArr72[0], new Class[]{Integer.TYPE});
                                }
                                long longValue12 = ((Long) ((Method) D887119).invoke(null, objArr71)).longValue();
                                long j84 = 1428768577;
                                long j85 = -397;
                                long j86 = j84 ^ j30;
                                long j87 = (j86 | j80) ^ j30;
                                long j88 = (j86 | longValue12) ^ j30;
                                long j89 = (397 * (j55 | j88 | (((longValue12 ^ j30) | j84) ^ j30))) + (j85 * j88) + ((j87 | j88 | ((j80 | longValue12) ^ j30)) * j85) + ((-396) * longValue12) + (398 * j84) + 563358189;
                                int myTid = Process.myTid();
                                int i376 = ((int) (j89 >> c3)) & ((((~(myTid | 201846085)) | 1638924976 | (~((~myTid) | (-201698566)))) * 164) + ((1639072496 | myTid) * 164) + ((((~((-201846086) | r5)) | 1639072496) * (-328)) - 1594804158));
                                int i377 = ((int) j89) & (((~((-1216380929) | i91)) * 476) + ((~((-1216380929) | i4)) * 952) + (((16847169 | r5) * (-476)) - 1184645327));
                                int i378 = ((i376 & i377) | (i376 ^ i377)) != 0 ? (i4 & (-221)) | (i91 & 220) : i4;
                                int i379 = ((~i371) & i4) | (i371 & i91);
                                int i380 = -i379;
                                int i381 = ((i379 & i380) | (i379 ^ i380)) >> 31;
                                int i382 = i378 & (~i381);
                                int i383 = i371 & i381;
                                int i384 = (i383 & i382) | (i382 ^ i383);
                                int i385 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i386 = 371 - (~(-TextUtils.getOffsetBefore(str, 0)));
                                int i387 = -View.resolveSizeAndState(0, 0, 0);
                                int i388 = (i387 ^ 23) + ((i387 & 23) << 1);
                                Object[] objArr73 = new Object[1];
                                bravo((char) ((i385 & 1) + (i385 | 1)), i386, i388, objArr73);
                                Object[] objArr74 = {(String) objArr73[0]};
                                Object D887120 = uH18377.D8871(i16);
                                if (D887120 == null) {
                                    int modifierMetaStateMask2 = 51 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    int indexOf7 = 3157 - TextUtils.indexOf((CharSequence) str, '0', 0);
                                    char c31 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1)) + 58074);
                                    byte b41 = (byte) (i102 & 1);
                                    byte b42 = (byte) (b41 + 1);
                                    Object[] objArr75 = new Object[1];
                                    charlie(b41, b42, (byte) (b42 - 2), objArr75);
                                    D887120 = uH18377.setPivotYN16904(modifierMetaStateMask2, indexOf7, c31, 424179844, false, (String) objArr75[0], new Class[]{String.class});
                                }
                                Object invoke2 = ((Method) D887120).invoke(null, objArr74);
                                if (invoke2 != null) {
                                    Object[] objArr76 = {invoke2, 42};
                                    Object D887121 = uH18377.D8871(2072770498);
                                    if (D887121 == null) {
                                        int myPid2 = 51 - (Process.myPid() >> 22);
                                        int maximumDrawingCacheSize2 = 1209 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44356);
                                        byte b43 = (byte) 0;
                                        byte b44 = (byte) (b43 - 1);
                                        Object[] objArr77 = new Object[1];
                                        charlie(b43, b44, (byte) (b44 + 1), objArr77);
                                        D887121 = uH18377.setPivotYN16904(myPid2, maximumDrawingCacheSize2, scrollBarFadeDuration2, -1540336361, false, (String) objArr77[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long longValue13 = ((Long) ((Method) D887121).invoke(null, objArr76)).longValue();
                                    long j90 = 1365713120;
                                    long j91 = (-1917) * longValue13;
                                    long j92 = 959;
                                    long j93 = longValue13 ^ j30;
                                    long j94 = ((j92 * (((j93 | j55) ^ j30) | ((j80 | j90) ^ j30))) + (((-959) * j93) + (((((j93 | j80) ^ j30) | ((j90 | j55) ^ j30)) * j92) + (j91 + (960 * j90))))) - 1373158150;
                                    int i389 = ((int) (j94 >> c3)) & ((((-1886778184) | (~(449551772 | i4)) | (~(i91 | (-449551773)))) * 45) + (((~((-1886778184) | i4)) | 176819352) * (-45)) + (((~((-1886778184) | i91)) | (-449551773)) * (-90)) + 1687905420);
                                    int i390 = ((int) j94) & ((((~(1076592205 | i91)) | (~(1781148680 | i4))) * 627) + (((~((-1076592206) | i4)) | 1781148680) * (-627)) + ((((-704643073) | i4) * (-627)) - 635053948));
                                    if (((i389 & i390) | (i389 ^ i390)) == 1986687685) {
                                        i42 = i91;
                                        strArr5 = null;
                                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i391 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i392 = (i391 & 891) + (i391 | 891);
                                        int size2 = View.MeasureSpec.getSize(0);
                                        int i393 = (size2 & 16) + (size2 | 16);
                                        Object[] objArr78 = new Object[1];
                                        bravo(jumpTapTimeout, i392, i393, objArr78);
                                        Object[] objArr79 = {(String) objArr78[0]};
                                        D88716 = uH18377.D8871(i16);
                                        if (D88716 == null) {
                                            int trimmedLength2 = TextUtils.getTrimmedLength(str) + 52;
                                            int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3158;
                                            char jumpTapTimeout2 = (char) (58074 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                            byte b45 = (byte) (i102 & 1);
                                            byte b46 = (byte) (b45 + 1);
                                            Object[] objArr80 = new Object[1];
                                            charlie(b45, b46, (byte) (b46 - 2), objArr80);
                                            D88716 = uH18377.setPivotYN16904(trimmedLength2, fadingEdgeLength3, jumpTapTimeout2, 424179844, false, (String) objArr80[0], new Class[]{String.class});
                                        }
                                        invoke = ((Method) D88716).invoke(null, objArr79);
                                        if (invoke != null) {
                                            delta = (charlie + 41) % 128;
                                            i45 = 0;
                                        } else {
                                            Object[] objArr81 = {invoke, 42};
                                            Object D887122 = uH18377.D8871(2072770498);
                                            if (D887122 == null) {
                                                int gidForName3 = Process.getGidForName(str) + 52;
                                                int resolveSize = View.resolveSize(0, 0) + 1209;
                                                char scrollBarSize3 = (char) (44356 - (ViewConfiguration.getScrollBarSize() >> 8));
                                                byte b47 = (byte) 0;
                                                byte b48 = (byte) (b47 - 1);
                                                Object[] objArr82 = new Object[1];
                                                charlie(b47, b48, (byte) (b48 + 1), objArr82);
                                                D887122 = uH18377.setPivotYN16904(gidForName3, resolveSize, scrollBarSize3, -1540336361, false, (String) objArr82[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long longValue14 = ((Long) ((Method) D887122).invoke(null, objArr81)).longValue();
                                            long j95 = 133233255;
                                            long j96 = -502;
                                            long j97 = longValue14 ^ j30;
                                            long j98 = ((HttpConstants.HTTP_BAD_GATEWAY * (j97 | (((j95 ^ j30) | j55) ^ j30))) + ((j96 * (((j97 | j80) | j95) ^ j30)) + (((((j97 | j55) ^ j30) | ((longValue14 | j95) ^ j30)) * j96) + ((HttpConstants.HTTP_UNAVAILABLE * longValue14) + ((-501) * j95))))) - 140678285;
                                            int myUid2 = Process.myUid();
                                            int i394 = ((int) (j98 >> c3)) & ((((~((~myUid2) | (-554763273))) | 138711330) * 449) + (((~((-554763273) | myUid2)) | 138711330) * 449) + 1447897694);
                                            int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                            int i395 = ~freeMemory4;
                                            int i396 = (~((-1433716772) | i395)) | 1415626786;
                                            int i397 = ~(freeMemory4 | 1442114099);
                                            int i398 = ((int) j98) & (((i397 | (~(i395 | (-18089986)))) * HttpConstants.HTTP_BAD_GATEWAY) + ((i396 | i397) * (-502)) + 537816321);
                                            i45 = (i398 & i394) | (i394 ^ i398);
                                        }
                                        if (i45 != 1986687685) {
                                            int i399 = charlie;
                                            delta = (((i399 | 119) << 1) - (i399 ^ 119)) % 128;
                                            if (i45 != -1514516938) {
                                                int i400 = -View.resolveSize(0, 0);
                                                int green = 1610 - Color.green(0);
                                                int i401 = -(-MotionEvent.axisFromString(str));
                                                int i402 = (i401 & 15) + (i401 | 15);
                                                Object[] objArr83 = new Object[1];
                                                bravo((char) ((i400 & 56788) + (i400 | 56788)), green, i402, objArr83);
                                                String str34 = (String) objArr83[0];
                                                int threadPriority3 = Process.getThreadPriority(0);
                                                int i403 = 1623 - (~(-TextUtils.indexOf(str, str)));
                                                int green2 = Color.green(0);
                                                int i404 = ((green2 | 26) << 1) - (green2 ^ 26);
                                                Object[] objArr84 = new Object[1];
                                                bravo((char) (((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6), i403, i404, objArr84);
                                                String str35 = (String) objArr84[0];
                                                int i405 = -(Process.myTid() >> 22);
                                                int i406 = 1649 - (~(-TextUtils.getOffsetBefore(str, 0)));
                                                int i407 = -KeyEvent.keyCodeFromString(str);
                                                int i408 = (i407 & 17) + (i407 | 17);
                                                Object[] objArr85 = new Object[1];
                                                bravo((char) ((i405 & 52303) + (i405 | 52303)), i406, i408, objArr85);
                                                String str36 = (String) objArr85[0];
                                                char mode = (char) View.MeasureSpec.getMode(0);
                                                int i409 = -(-KeyEvent.getDeadChar(0, 0));
                                                Object[] objArr86 = new Object[1];
                                                bravo(mode, (i409 ^ 1667) + ((i409 & 1667) << 1), 16 - (~View.MeasureSpec.getMode(0)), objArr86);
                                                String str37 = (String) objArr86[0];
                                                char myPid3 = (char) (Process.myPid() >> 22);
                                                int i410 = 1683 - (~(-View.MeasureSpec.getSize(0)));
                                                int i411 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                int i412 = (i411 & 16) + (i411 | 16);
                                                Object[] objArr87 = new Object[1];
                                                bravo(myPid3, i410, i412, objArr87);
                                                String str38 = (String) objArr87[0];
                                                int i413 = -Color.green(0);
                                                Object[] objArr88 = new Object[1];
                                                bravo((char) (((i413 | 58238) << 1) - (i413 ^ 58238)), TextUtils.getTrimmedLength(str) + 1699, 37 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr88);
                                                String str39 = (String) objArr88[0];
                                                Object[] objArr89 = new Object[1];
                                                bravo((char) (ViewConfiguration.getTouchSlop() >> 8), 1734 - (~(-ImageFormat.getBitsPerPixel(0))), 10 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr89);
                                                String str40 = (String) objArr89[0];
                                                int i414 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i415 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1)) + 1748;
                                                int i416 = -TextUtils.getOffsetAfter(str, 0);
                                                int i417 = (i416 & 13) + (i416 | 13);
                                                Object[] objArr90 = new Object[1];
                                                bravo((char) ((i414 & 8295) + (i414 | 8295)), i415, i417, objArr90);
                                                String str41 = (String) objArr90[0];
                                                int i418 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                int i419 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                Object[] objArr91 = new Object[1];
                                                bravo((char) (((i418 | 57960) << 1) - (i418 ^ 57960)), (i419 ^ 1761) + ((i419 & 1761) << 1), 22 - (Process.myTid() >> 22), objArr91);
                                                String str42 = (String) objArr91[0];
                                                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int threadPriority4 = Process.getThreadPriority(0);
                                                Object[] objArr92 = new Object[1];
                                                bravo(longPressTimeout2, 1783 - (((threadPriority4 ^ 20) + ((threadPriority4 & 20) << 1)) >> 6), KeyEvent.keyCodeFromString(str) + 31, objArr92);
                                                String str43 = (String) objArr92[0];
                                                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                int i420 = -MotionEvent.axisFromString(str);
                                                Object[] objArr93 = new Object[1];
                                                bravo(absoluteGravity2, (i420 ^ 1813) + ((i420 & 1813) << 1), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr93);
                                                String str44 = (String) objArr93[0];
                                                int i421 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1)));
                                                int scrollBarFadeDuration3 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                int i422 = ((scrollBarFadeDuration3 | 1826) << 1) - (scrollBarFadeDuration3 ^ 1826);
                                                int red2 = Color.red(0);
                                                int i423 = (red2 & 12) + (red2 | 12);
                                                Object[] objArr94 = new Object[1];
                                                bravo((char) ((i421 ^ 15888) + ((i421 & 15888) << 1)), i422, i423, objArr94);
                                                String str45 = (String) objArr94[0];
                                                char mirror = (char) (856 - AndroidCharacter.getMirror('0'));
                                                int i424 = -ExpandableListView.getPackedPositionType(0L);
                                                int i425 = (i424 & 1838) + (i424 | 1838);
                                                int capsMode2 = TextUtils.getCapsMode(str, 0, 0);
                                                int i426 = (capsMode2 & 12) + (capsMode2 | 12);
                                                Object[] objArr95 = new Object[1];
                                                bravo(mirror, i425, i426, objArr95);
                                                String str46 = (String) objArr95[0];
                                                char c32 = (char) (41452 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                                                int i427 = -ExpandableListView.getPackedPositionChild(0L);
                                                int i428 = (i427 & 1849) + (i427 | 1849);
                                                int i429 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                int i430 = ((i429 | 12) << 1) - (i429 ^ 12);
                                                Object[] objArr96 = new Object[1];
                                                bravo(c32, i428, i430, objArr96);
                                                String str47 = (String) objArr96[0];
                                                char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                int i431 = -KeyEvent.normalizeMetaState(0);
                                                Object[] objArr97 = new Object[1];
                                                bravo(maxKeyCode2, (i431 ^ 1862) + ((i431 & 1862) << 1), 11 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr97);
                                                String str48 = (String) objArr97[0];
                                                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int i432 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                int i433 = ((i432 | 1874) << 1) - (i432 ^ 1874);
                                                int i434 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i435 = (i434 & 14) + (i434 | 14);
                                                Object[] objArr98 = new Object[1];
                                                bravo(scrollDefaultDelay, i433, i435, objArr98);
                                                String str49 = (String) objArr98[0];
                                                Object[] objArr99 = new Object[1];
                                                bravo((char) (Gravity.getAbsoluteGravity(0, 0) + 37009), 1888 - View.MeasureSpec.getMode(0), 12 - TextUtils.indexOf(str, str, 0, 0), objArr99);
                                                String str50 = (String) objArr99[0];
                                                int maxKeyCode3 = KeyEvent.getMaxKeyCode() >> 16;
                                                int i436 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                Object[] objArr100 = new Object[1];
                                                bravo((char) ((maxKeyCode3 ^ 33417) + ((maxKeyCode3 & 33417) << 1)), (i436 & 1900) + (i436 | 1900), 23 - (~(-Color.alpha(0))), objArr100);
                                                String str51 = (String) objArr100[0];
                                                int i437 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int i438 = -(-TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                                Object[] objArr101 = new Object[1];
                                                bravo((char) ((i437 ^ 1) + ((i437 & 1) << 1)), ((i438 | 1925) << 1) - (i438 ^ 1925), Color.argb(0, 0, 0, 0) + 28, objArr101);
                                                String[] strArr19 = {str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, (String) objArr101[0]};
                                                int i439 = 0;
                                                for (int i440 = 19; i439 < i440; i440 = 19) {
                                                    int bravo9 = al.bravo();
                                                    int i441 = -(-(((~(((-1285751813) ^ bravo9) | ((-1285751813) & bravo9))) | (-2147462512)) * (-476)));
                                                    int i442 = ((-1370315992) ^ i441) + ((i441 & (-1370315992)) << 1);
                                                    int i443 = -(-((~((-1285751813) | bravo9)) * 952));
                                                    int i444 = ((i442 | i443) << 1) - (i443 ^ i442);
                                                    int i445 = ~bravo9;
                                                    int i446 = (~((i445 & (-2092672039)) | ((-2092672039) ^ i445) | (-1340542286))) * 476;
                                                    int i447 = (i444 ^ i446) + ((i446 & i444) << 1);
                                                    int i448 = (((~(((-408519517) & i42) | ((-408519517) ^ i42))) | (~((1441140908 ^ i4) | (1441140908 & i4)))) * 333) + 2115200613;
                                                    int i449 = ~(((-408519517) & i4) | ((-408519517) ^ i4));
                                                    int i450 = ~((i42 & 1441140908) | (i42 ^ 1441140908));
                                                    if (i447 > (i448 - (~(((i450 & i449) | (i449 ^ i450)) * 333))) - 1) {
                                                        str5 = strArr19[i439];
                                                        Object[] objArr102 = {str5};
                                                        Object D887123 = uH18377.D8871(-2104138125);
                                                        if (D887123 == null) {
                                                            byte b49 = (byte) (i102 & 1);
                                                            byte b50 = (byte) (b49 + 1);
                                                            i54 = i384;
                                                            Object[] objArr103 = new Object[1];
                                                            charlie(b49, b50, (byte) (b50 - 1), objArr103);
                                                            D887123 = uH18377.setPivotYN16904(52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.blue(0) + 2951, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1563346086, false, (String) objArr103[0], new Class[]{String.class});
                                                        } else {
                                                            i54 = i384;
                                                        }
                                                        long longValue15 = ((Long) ((Method) D887123).invoke(null, objArr102)).longValue();
                                                        long j99 = -1014208853;
                                                        strArr10 = strArr19;
                                                        long j100 = j99 ^ j30;
                                                        long j101 = ((-283) * (((j100 | longValue15) ^ j30) | ((j100 | j55) ^ j30))) + ((-282) * longValue15) + (284 * j99);
                                                        long j102 = 283;
                                                        long j103 = longValue15 ^ j30;
                                                        long j104 = ((j102 * (((j100 | j103) | j55) ^ j30)) + ((((j99 | j103) ^ j30) * j102) + j101)) - 215411677;
                                                        int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                        int i451 = (((~((-1185096317) | uptimeMillis2)) | 1084227664 | (~(252130094 | uptimeMillis2))) * (-754)) + 519121254;
                                                        int i452 = ~((-1084227665) | uptimeMillis2);
                                                        int i453 = ~uptimeMillis2;
                                                        if (((((int) j104) & ((((~((-1949858815) | i4)) | 907882071) * 376) + (((~(i42 | 1949858814)) | (-1983741952)) * (-376)) + (((-1109743018) | i4) * 376) + 2088992125)) | (((int) (j104 >>> 125)) & (((i453 | (-1185096317)) * 754) + ((i452 | (~(1336357758 | i453))) * (-754)) + i451))) != 0) {
                                                            i55 = i439;
                                                            break;
                                                        }
                                                        char indexOf8 = (char) TextUtils.indexOf(str, str);
                                                        int i454 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int i455 = (i454 ^ 1873) + ((i454 & 1873) << 1);
                                                        int i456 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i457 = ((i456 | 14) << 1) - (i456 ^ 14);
                                                        objArr3 = new Object[1];
                                                        bravo(indexOf8, i455, i457, objArr3);
                                                        if (!str5.equals((String) objArr3[0])) {
                                                            Object[] objArr104 = {str5};
                                                            Object D887124 = uH18377.D8871(1979478258);
                                                            if (D887124 == null) {
                                                                int i458 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                int i459 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2950;
                                                                char green3 = (char) Color.green(0);
                                                                byte b51 = (byte) (i102 & 1);
                                                                byte b52 = (byte) (b51 + 1);
                                                                Object[] objArr105 = new Object[1];
                                                                charlie(b51, b52, b52, objArr105);
                                                                D887124 = uH18377.setPivotYN16904(i458, i459, green3, -1438133721, false, (String) objArr105[0], new Class[]{String.class});
                                                            }
                                                            long longValue16 = ((Long) ((Method) D887124).invoke(null, objArr104)).longValue();
                                                            long j105 = -1150553981;
                                                            long j106 = 521;
                                                            long j107 = j105 ^ j30;
                                                            long j108 = (j106 * (((longValue16 | (j80 | j105)) ^ j30) | ((j107 | (longValue16 ^ j30)) ^ j30) | ((j107 | j55) ^ j30))) + ((longValue16 | j55) * j106) + ((-1042) * (j105 | ((j80 | longValue16) ^ j30))) + ((-520) * longValue16) + (522 * j105) + 1925375287;
                                                            int i460 = ((int) (j108 >> c3)) & ((((-545325057) | i4) * 668) + ((454885206 | (~((-982341205) | i4))) * 1336) + (((~(454885206 | i4)) | (-982341205)) * (-668)) + 227051946);
                                                            int myTid2 = Process.myTid();
                                                            int i461 = ((int) j108) & ((((~((~myTid2) | 171360765)) | 1095062097) * 398) + (((~(171360765 | myTid2)) | 1095062097) * 398) + 185944925);
                                                            if (((i460 & i461) | (i460 ^ i461)) != 0) {
                                                                i55 = i439;
                                                                break;
                                                            }
                                                        }
                                                        i439 = ((i439 & 48) + (i439 | 48)) - 47;
                                                        i384 = i54;
                                                        strArr19 = strArr10;
                                                    } else {
                                                        i54 = i384;
                                                        strArr10 = strArr19;
                                                        str5 = strArr10[i439];
                                                        Object[] objArr106 = {str5};
                                                        Object D887125 = uH18377.D8871(-2104138125);
                                                        if (D887125 == null) {
                                                            int minimumFlingVelocity = 52 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                            int i462 = 2952 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(str);
                                                            byte b53 = (byte) (i102 & 1);
                                                            byte b54 = (byte) (b53 + 1);
                                                            Object[] objArr107 = new Object[1];
                                                            charlie(b53, b54, (byte) (b54 - 1), objArr107);
                                                            D887125 = uH18377.setPivotYN16904(minimumFlingVelocity, i462, keyCodeFromString2, 1563346086, false, (String) objArr107[0], new Class[]{String.class});
                                                        }
                                                        long longValue17 = ((Long) ((Method) D887125).invoke(null, objArr106)).longValue();
                                                        long j109 = 831605721;
                                                        long j110 = ((-903) * longValue17) + (905 * j109);
                                                        long j111 = j109 ^ j30;
                                                        long romeo2 = ao.ad.romeo();
                                                        long j112 = romeo2 ^ j30;
                                                        long j113 = ((-1808) * (((j111 | romeo2) ^ j30) | ((j112 | longValue17) ^ j30))) + j110;
                                                        long j114 = 904;
                                                        long j115 = longValue17 ^ j30;
                                                        long j116 = j112 | j109;
                                                        long j117 = ((j114 * ((((j115 | romeo2) ^ j30) | ((j111 | longValue17) ^ j30)) | (j116 ^ j30))) + ((((((j111 | j115) | romeo2) ^ j30) | ((j116 | longValue17) ^ j30)) * j114) + j113)) - 2061226251;
                                                        int myPid4 = Process.myPid();
                                                        int i463 = ~myPid4;
                                                        int i464 = (((~(1599448658 | i463)) | (~((-1528071683) | myPid4))) * 520) + 1347151914;
                                                        int i465 = ~(1528071682 | i463);
                                                        int i466 = ~(myPid4 | (-1329669203));
                                                        int i467 = ((int) (j117 >> c3)) & (((i466 | (~(i463 | 1329669202)) | 71376976) * 520) + ((i465 | i466) * (-1040)) + i464);
                                                        int i468 = ((int) j117) & ((((~((-396407396) | i42)) | 83886081) * (-964)) + (((~((-396407396) | i4)) | 1833633805) * (-964)) + 838842389);
                                                        if (((i467 & i468) | (i467 ^ i468)) != 0) {
                                                            i55 = i439;
                                                            break;
                                                        }
                                                        char indexOf82 = (char) TextUtils.indexOf(str, str);
                                                        int i4542 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int i4552 = (i4542 ^ 1873) + ((i4542 & 1873) << 1);
                                                        int i4562 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i4572 = ((i4562 | 14) << 1) - (i4562 ^ 14);
                                                        objArr3 = new Object[1];
                                                        bravo(indexOf82, i4552, i4572, objArr3);
                                                        if (!str5.equals((String) objArr3[0])) {
                                                        }
                                                        i439 = ((i439 & 48) + (i439 | 48)) - 47;
                                                        i384 = i54;
                                                        strArr19 = strArr10;
                                                    }
                                                }
                                                i54 = i384;
                                                i55 = -1;
                                                int i469 = i55 + 130;
                                                int i470 = (i469 & i42) | ((~i469) & i4);
                                                int i471 = ~i55;
                                                int i472 = -i471;
                                                int i473 = ((i471 & i472) | (i471 ^ i472)) >> 31;
                                                int i474 = (~i473) & i4;
                                                int i475 = i470 & i473;
                                                int i476 = (~(i4 & i54)) & (i4 | i54);
                                                int i477 = (i476 | (-i476)) >> 31;
                                                int i478 = ((i475 & i474) | (i474 ^ i475)) & (~i477);
                                                int i479 = i54 & i477;
                                                i46 = (i478 & i479) | (i478 ^ i479);
                                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int i480 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                Object[] objArr108 = new Object[1];
                                                bravo(doubleTapTimeout, (i480 ^ 1951) + ((i480 & 1951) << 1), AndroidCharacter.getMirror('0') - '#', objArr108);
                                                String str52 = (String) objArr108[0];
                                                int i481 = -(-Color.blue(0));
                                                int i482 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                Object[] objArr109 = new Object[1];
                                                bravo((char) (((i481 | 847) << 1) - (i481 ^ 847)), (i482 & 1964) + (i482 | 1964), 4 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr109);
                                                String[] strArr20 = {str52, (String) objArr109[0]};
                                                int i483 = -TextUtils.getCapsMode(str, 0, 0);
                                                int i484 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                int i485 = (i484 & 1970) + (i484 | 1970);
                                                int i486 = -(-TextUtils.indexOf((CharSequence) str, '0', 0));
                                                int i487 = ((i486 | 16) << 1) - (i486 ^ 16);
                                                Object[] objArr110 = new Object[1];
                                                bravo((char) ((i483 ^ 37533) + ((i483 & 37533) << 1)), i485, i487, objArr110);
                                                String str53 = (String) objArr110[0];
                                                char c33 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51573);
                                                int i488 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
                                                int i489 = (i488 ^ 1985) + ((i488 & 1985) << 1);
                                                int i490 = -Gravity.getAbsoluteGravity(0, 0);
                                                int i491 = ((i490 | 19) << 1) - (i490 ^ 19);
                                                Object[] objArr111 = new Object[1];
                                                bravo(c33, i489, i491, objArr111);
                                                String str54 = (String) objArr111[0];
                                                char c34 = (char) (33619 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))));
                                                int i492 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int bravo10 = al.bravo();
                                                int i493 = i492 * (-501);
                                                int i494 = ~(((-2005) ^ bravo10) | ((-2005) & bravo10));
                                                int i495 = ~(i492 | 2004);
                                                int i496 = (((i493 & 1008012) + (i493 | 1008012)) - (~(-(-(((i494 ^ i495) | (i495 & i494)) * (-502)))))) - 1;
                                                int i497 = (-2005) | (~bravo10);
                                                int i498 = -(-((~((i497 ^ i492) | (i497 & i492))) * (-502)));
                                                int i499 = (i496 ^ i498) + ((i498 & i496) << 1);
                                                int i500 = ~i492;
                                                int i501 = ((~((i500 & bravo10) | (i500 ^ bravo10))) | (-2005)) * HttpConstants.HTTP_BAD_GATEWAY;
                                                Object[] objArr112 = new Object[1];
                                                bravo(c34, (i499 & i501) + (i499 | i501), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr112);
                                                String[] strArr21 = {str53, str54, (String) objArr112[0]};
                                                int i502 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2018;
                                                int blue = Color.blue(0);
                                                int i503 = (blue ^ 21) + ((blue & 21) << 1);
                                                Object[] objArr113 = new Object[1];
                                                bravo((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), i502, i503, objArr113);
                                                String str55 = (String) objArr113[0];
                                                int i504 = -Color.alpha(0);
                                                int i505 = 2038 - (~(-(-Color.green(0))));
                                                int i506 = -(-AndroidCharacter.getMirror('0'));
                                                int i507 = (i506 & (-38)) + (i506 | (-38));
                                                Object[] objArr114 = new Object[1];
                                                bravo((char) ((i504 ^ 13076) + ((i504 & 13076) << 1)), i505, i507, objArr114);
                                                String[] strArr22 = {str55, (String) objArr114[0]};
                                                Object[] objArr115 = new Object[1];
                                                bravo((char) TextUtils.getOffsetAfter(str, 0), 2048 - (~(-(-Color.argb(0, 0, 0, 0)))), 10 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr115);
                                                String str56 = (String) objArr115[0];
                                                int i508 = -ImageFormat.getBitsPerPixel(0);
                                                Object[] objArr116 = new Object[1];
                                                bravo((char) (((i508 | 27525) << 1) - (i508 ^ 27525)), 588 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), 5 - (~(-(-TextUtils.getTrimmedLength(str)))), objArr116);
                                                String[] strArr23 = {str56, (String) objArr116[0]};
                                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                int keyCodeFromString3 = KeyEvent.keyCodeFromString(str);
                                                int i509 = keyCodeFromString3 * 784;
                                                int i510 = (i509 & (-1610920)) + (i509 | (-1610920));
                                                int i511 = ~keyCodeFromString3;
                                                int i512 = (i511 & i305) | (i511 ^ i305);
                                                int i513 = ((~((i512 & 2060) | (i512 ^ 2060))) * (-783)) + (i510 ^ 1613763) + ((1613763 & i510) << 1);
                                                int i514 = ((~(i305 | 2060)) | (~keyCodeFromString3)) * 783;
                                                Object[] objArr117 = new Object[1];
                                                bravo(tapTimeout, (i513 & i514) + (i514 | i513), 28 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr117);
                                                String str57 = (String) objArr117[0];
                                                char c35 = (char) (13075 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                                int i515 = 2040 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                int i516 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                i47 = 1;
                                                int i517 = ((i516 | 10) << 1) - (i516 ^ 10);
                                                Object[] objArr118 = new Object[1];
                                                bravo(c35, i515, i517, objArr118);
                                                c12 = 0;
                                                i48 = 5;
                                                String[][] strArr24 = {strArr20, strArr21, strArr22, strArr23, new String[]{str57, (String) objArr118[0]}};
                                                i49 = 0;
                                                int i518 = -1;
                                                loop7: while (true) {
                                                    if (i49 >= i48) {
                                                        i50 = i4;
                                                        break;
                                                    }
                                                    String[] strArr25 = strArr24[i49];
                                                    String str58 = strArr25[c12];
                                                    String[] strArr26 = (String[]) Arrays.copyOfRange(strArr25, i47, strArr25.length);
                                                    int length = strArr26.length;
                                                    int i519 = 0;
                                                    while (i519 < length) {
                                                        String str59 = strArr26[i519];
                                                        int i520 = i518 + 1;
                                                        File file3 = new File(str58);
                                                        if (file3.exists() && file3.isFile()) {
                                                            try {
                                                                i52 = i49;
                                                            } catch (IOException unused2) {
                                                                i52 = i49;
                                                            }
                                                            try {
                                                                Scanner scanner2 = new Scanner(new FileInputStream(file3));
                                                                char red3 = (char) Color.red(0);
                                                                strArr9 = strArr26;
                                                                try {
                                                                    int i521 = -TextUtils.lastIndexOf(str, '0');
                                                                    str3 = str58;
                                                                    try {
                                                                        i53 = length;
                                                                        try {
                                                                            Object[] objArr119 = new Object[1];
                                                                            bravo(red3, ((i521 | 228) << 1) - (i521 ^ 228), 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr119);
                                                                            Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr119[0]);
                                                                            if (useDelimiter2.hasNext()) {
                                                                                int i522 = charlie;
                                                                                delta = ((i522 ^ 11) + ((i522 & 11) << 1)) % 128;
                                                                                str4 = useDelimiter2.next();
                                                                            } else {
                                                                                str4 = str;
                                                                            }
                                                                            useDelimiter2.close();
                                                                            if (str4.contains(str59)) {
                                                                                i50 = i4 ^ (i518 + 171);
                                                                                break loop7;
                                                                            }
                                                                        } catch (IOException unused3) {
                                                                        }
                                                                    } catch (IOException unused4) {
                                                                    }
                                                                } catch (IOException unused5) {
                                                                    str3 = str58;
                                                                    i53 = length;
                                                                    i47 = 1;
                                                                    i519++;
                                                                    strArr26 = strArr9;
                                                                    str58 = str3;
                                                                    i518 = i520;
                                                                    i49 = i52;
                                                                    length = i53;
                                                                }
                                                            } catch (IOException unused6) {
                                                                strArr9 = strArr26;
                                                                str3 = str58;
                                                                i53 = length;
                                                                i47 = 1;
                                                                i519++;
                                                                strArr26 = strArr9;
                                                                str58 = str3;
                                                                i518 = i520;
                                                                i49 = i52;
                                                                length = i53;
                                                            }
                                                            i47 = 1;
                                                            i519++;
                                                            strArr26 = strArr9;
                                                            str58 = str3;
                                                            i518 = i520;
                                                            i49 = i52;
                                                            length = i53;
                                                        } else {
                                                            i52 = i49;
                                                            strArr9 = strArr26;
                                                            str3 = str58;
                                                        }
                                                        i53 = length;
                                                        i47 = 1;
                                                        i519++;
                                                        strArr26 = strArr9;
                                                        str58 = str3;
                                                        i518 = i520;
                                                        i49 = i52;
                                                        length = i53;
                                                    }
                                                    i49++;
                                                    int i523 = delta;
                                                    charlie = (((i523 | 111) << i47) - (i523 ^ 111)) % 128;
                                                    i48 = 5;
                                                    i47 = 1;
                                                    c12 = 0;
                                                }
                                                int i524 = ((~i46) & i4) | (i46 & i42);
                                                int i525 = -i524;
                                                int i526 = ((i524 & i525) | (i524 ^ i525)) >> 31;
                                                int i527 = i50 & (~i526);
                                                int i528 = i46 & i526;
                                                int i529 = (i528 & i527) | (i527 ^ i528);
                                                char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2088;
                                                int lastIndexOf = TextUtils.lastIndexOf(str, '0');
                                                int i530 = (lastIndexOf ^ 14) + ((lastIndexOf & 14) << 1);
                                                Object[] objArr120 = new Object[1];
                                                bravo(longPressTimeout3, maximumFlingVelocity2, i530, objArr120);
                                                String str60 = (String) objArr120[0];
                                                int i531 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                Object[] objArr121 = new Object[1];
                                                bravo((char) ((i531 ^ 2927) + ((i531 & 2927) << 1)), 2101 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr121);
                                                String str61 = (String) objArr121[0];
                                                file = new File(str60);
                                                if (file.exists()) {
                                                    int i532 = delta;
                                                    int i533 = ((i532 | 111) << 1) - (i532 ^ 111);
                                                    charlie = i533 % 128;
                                                    if (i533 % 2 != 0) {
                                                        file.isFile();
                                                        throw null;
                                                    }
                                                    if (file.isFile()) {
                                                        try {
                                                            Scanner scanner3 = new Scanner(new FileInputStream(file));
                                                            char resolveSize2 = (char) View.resolveSize(0, 0);
                                                            int i534 = 229 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                            int i535 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int i536 = (i535 & 2) + (i535 | 2);
                                                            Object[] objArr122 = new Object[1];
                                                            bravo(resolveSize2, i534, i536, objArr122);
                                                            Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr122[0]);
                                                            if (useDelimiter3.hasNext()) {
                                                                str = useDelimiter3.next();
                                                            }
                                                            useDelimiter3.close();
                                                        } catch (IOException unused7) {
                                                        }
                                                        if (str.contains(str61)) {
                                                            i51 = i4 ^ 150;
                                                            int i537 = ((~i529) & i4) | (i529 & i42);
                                                            int i538 = -i537;
                                                            int i539 = ((i537 & i538) | (i537 ^ i538)) >> 31;
                                                            int i540 = i51 & (~i539);
                                                            int i541 = i529 & i539;
                                                            int i542 = (i541 & i540) | (i540 ^ i541);
                                                            int i543 = -View.MeasureSpec.getMode(0);
                                                            int bravo11 = al.bravo();
                                                            int i544 = i543 * 51;
                                                            int i545 = (i544 & (-2910747)) + (i544 | (-2910747));
                                                            int i546 = (i543 | bravo11) * (-50);
                                                            int i547 = ((i545 | i546) << 1) - (i546 ^ i545);
                                                            int i548 = ~i543;
                                                            int i549 = (i548 & (-59404)) | (i548 ^ (-59404));
                                                            int i550 = ~((i549 & bravo11) | (i549 ^ bravo11));
                                                            int i551 = ~bravo11;
                                                            int i552 = ~(((-59404) & i551) | ((-59404) ^ i551) | i543);
                                                            int i553 = (((i550 & i552) | (i550 ^ i552)) * 50) + i547;
                                                            int i554 = ~((~bravo11) | (-59404));
                                                            int i555 = ~(((-59404) ^ i543) | ((-59404) & i543));
                                                            int i556 = ((~((i543 & i551) | (i551 ^ i543))) | (i554 & i555) | (i554 ^ i555)) * 50;
                                                            char c36 = (char) ((i553 & i556) + (i556 | i553));
                                                            int i557 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            int i558 = ((i557 | 2109) << 1) - (i557 ^ 2109);
                                                            int i559 = -(Process.myPid() >> 22);
                                                            int i560 = ((i559 | 47) << 1) - (i559 ^ 47);
                                                            Object[] objArr123 = new Object[1];
                                                            bravo(c36, i558, i560, objArr123);
                                                            Object[] objArr124 = {(String) objArr123[0]};
                                                            D88717 = uH18377.D8871(1979478258);
                                                            if (D88717 == null) {
                                                                int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                                                                int resolveOpacity = Drawable.resolveOpacity(0, 0) + 2951;
                                                                char resolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                                                byte b55 = (byte) (i102 & 1);
                                                                byte b56 = (byte) (b55 + 1);
                                                                Object[] objArr125 = new Object[1];
                                                                charlie(b55, b56, b56, objArr125);
                                                                D88717 = uH18377.setPivotYN16904(jumpTapTimeout3, resolveOpacity, resolveSizeAndState, -1438133721, false, (String) objArr125[0], new Class[]{String.class});
                                                            }
                                                            long longValue18 = ((Long) ((Method) D88717).invoke(null, objArr124)).longValue();
                                                            long j118 = -1345399979;
                                                            long j119 = 367;
                                                            long j120 = -366;
                                                            long j121 = ((j118 | longValue18) * j120) + (j119 * longValue18) + (j119 * j118);
                                                            long j122 = longValue18 ^ j30;
                                                            long tango = ao.ad.tango(1981048993);
                                                            long j123 = (366 * ((((j118 ^ j30) | longValue18) ^ j30) | (((j118 | j122) | tango) ^ j30))) + (j120 * (j118 | ((j122 | tango) ^ j30))) + j121 + 2120221285;
                                                            int myTid3 = Process.myTid();
                                                            int i561 = ~myTid3;
                                                            int i562 = ((int) (j123 >> c3)) & ((((~(myTid3 | (-908696687))) | (~(i561 | (-159392017)))) * 765) + (((~((-908696687) | i561)) | 369137708) * 1530) + (((~((-369137709) | i561)) | (~((-539558979) | myTid3)) | (~((-159392017) | myTid3))) * 765) + 2102387698);
                                                            int i563 = ((int) j123) & ((((~(i42 | (-536870918))) | (-2130046560)) * 521) + (((~((-536870918) | i4)) * 521) - 321404536));
                                                            int i564 = ((i562 & i563) | (i562 ^ i563)) * 263;
                                                            int i565 = (i564 & i42) | ((~i564) & i4);
                                                            int i566 = ((~i542) & i4) | (i542 & i42);
                                                            int i567 = -i566;
                                                            int i568 = ((i566 & i567) | (i566 ^ i567)) >> 31;
                                                            int i569 = i565 & (~i568);
                                                            int i570 = i542 & i568;
                                                            i371 = (i570 & i569) | (i569 ^ i570);
                                                            strArr4 = strArr5;
                                                        } else {
                                                            delta = (charlie + 125) % 128;
                                                        }
                                                    }
                                                }
                                                i51 = i4;
                                                int i5372 = ((~i529) & i4) | (i529 & i42);
                                                int i5382 = -i5372;
                                                int i5392 = ((i5372 & i5382) | (i5372 ^ i5382)) >> 31;
                                                int i5402 = i51 & (~i5392);
                                                int i5412 = i529 & i5392;
                                                int i5422 = (i5412 & i5402) | (i5402 ^ i5412);
                                                int i5432 = -View.MeasureSpec.getMode(0);
                                                int bravo112 = al.bravo();
                                                int i5442 = i5432 * 51;
                                                int i5452 = (i5442 & (-2910747)) + (i5442 | (-2910747));
                                                int i5462 = (i5432 | bravo112) * (-50);
                                                int i5472 = ((i5452 | i5462) << 1) - (i5462 ^ i5452);
                                                int i5482 = ~i5432;
                                                int i5492 = (i5482 & (-59404)) | (i5482 ^ (-59404));
                                                int i5502 = ~((i5492 & bravo112) | (i5492 ^ bravo112));
                                                int i5512 = ~bravo112;
                                                int i5522 = ~(((-59404) & i5512) | ((-59404) ^ i5512) | i5432);
                                                int i5532 = (((i5502 & i5522) | (i5502 ^ i5522)) * 50) + i5472;
                                                int i5542 = ~((~bravo112) | (-59404));
                                                int i5552 = ~(((-59404) ^ i5432) | ((-59404) & i5432));
                                                int i5562 = ((~((i5432 & i5512) | (i5512 ^ i5432))) | (i5542 & i5552) | (i5542 ^ i5552)) * 50;
                                                char c362 = (char) ((i5532 & i5562) + (i5562 | i5532));
                                                int i5572 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                int i5582 = ((i5572 | 2109) << 1) - (i5572 ^ 2109);
                                                int i5592 = -(Process.myPid() >> 22);
                                                int i5602 = ((i5592 | 47) << 1) - (i5592 ^ 47);
                                                Object[] objArr1232 = new Object[1];
                                                bravo(c362, i5582, i5602, objArr1232);
                                                Object[] objArr1242 = {(String) objArr1232[0]};
                                                D88717 = uH18377.D8871(1979478258);
                                                if (D88717 == null) {
                                                }
                                                long longValue182 = ((Long) ((Method) D88717).invoke(null, objArr1242)).longValue();
                                                long j1182 = -1345399979;
                                                long j1192 = 367;
                                                long j1202 = -366;
                                                long j1212 = ((j1182 | longValue182) * j1202) + (j1192 * longValue182) + (j1192 * j1182);
                                                long j1222 = longValue182 ^ j30;
                                                long tango2 = ao.ad.tango(1981048993);
                                                long j1232 = (366 * ((((j1182 ^ j30) | longValue182) ^ j30) | (((j1182 | j1222) | tango2) ^ j30))) + (j1202 * (j1182 | ((j1222 | tango2) ^ j30))) + j1212 + 2120221285;
                                                int myTid32 = Process.myTid();
                                                int i5612 = ~myTid32;
                                                int i5622 = ((int) (j1232 >> c3)) & ((((~(myTid32 | (-908696687))) | (~(i5612 | (-159392017)))) * 765) + (((~((-908696687) | i5612)) | 369137708) * 1530) + (((~((-369137709) | i5612)) | (~((-539558979) | myTid32)) | (~((-159392017) | myTid32))) * 765) + 2102387698);
                                                int i5632 = ((int) j1232) & ((((~(i42 | (-536870918))) | (-2130046560)) * 521) + (((~((-536870918) | i4)) * 521) - 321404536));
                                                int i5642 = ((i5622 & i5632) | (i5622 ^ i5632)) * 263;
                                                int i5652 = (i5642 & i42) | ((~i5642) & i4);
                                                int i5662 = ((~i5422) & i4) | (i5422 & i42);
                                                int i5672 = -i5662;
                                                int i5682 = ((i5662 & i5672) | (i5662 ^ i5672)) >> 31;
                                                int i5692 = i5652 & (~i5682);
                                                int i5702 = i5422 & i5682;
                                                i371 = (i5702 & i5692) | (i5692 ^ i5702);
                                                strArr4 = strArr5;
                                            }
                                        }
                                        i46 = i384;
                                        char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int i4802 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        Object[] objArr1082 = new Object[1];
                                        bravo(doubleTapTimeout2, (i4802 ^ 1951) + ((i4802 & 1951) << 1), AndroidCharacter.getMirror('0') - '#', objArr1082);
                                        String str522 = (String) objArr1082[0];
                                        int i4812 = -(-Color.blue(0));
                                        int i4822 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                        Object[] objArr1092 = new Object[1];
                                        bravo((char) (((i4812 | 847) << 1) - (i4812 ^ 847)), (i4822 & 1964) + (i4822 | 1964), 4 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr1092);
                                        String[] strArr202 = {str522, (String) objArr1092[0]};
                                        int i4832 = -TextUtils.getCapsMode(str, 0, 0);
                                        int i4842 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        int i4852 = (i4842 & 1970) + (i4842 | 1970);
                                        int i4862 = -(-TextUtils.indexOf((CharSequence) str, '0', 0));
                                        int i4872 = ((i4862 | 16) << 1) - (i4862 ^ 16);
                                        Object[] objArr1102 = new Object[1];
                                        bravo((char) ((i4832 ^ 37533) + ((i4832 & 37533) << 1)), i4852, i4872, objArr1102);
                                        String str532 = (String) objArr1102[0];
                                        char c332 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51573);
                                        int i4882 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
                                        int i4892 = (i4882 ^ 1985) + ((i4882 & 1985) << 1);
                                        int i4902 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i4912 = ((i4902 | 19) << 1) - (i4902 ^ 19);
                                        Object[] objArr1112 = new Object[1];
                                        bravo(c332, i4892, i4912, objArr1112);
                                        String str542 = (String) objArr1112[0];
                                        char c342 = (char) (33619 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))));
                                        int i4922 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int bravo102 = al.bravo();
                                        int i4932 = i4922 * (-501);
                                        int i4942 = ~(((-2005) ^ bravo102) | ((-2005) & bravo102));
                                        int i4952 = ~(i4922 | 2004);
                                        int i4962 = (((i4932 & 1008012) + (i4932 | 1008012)) - (~(-(-(((i4942 ^ i4952) | (i4952 & i4942)) * (-502)))))) - 1;
                                        int i4972 = (-2005) | (~bravo102);
                                        int i4982 = -(-((~((i4972 ^ i4922) | (i4972 & i4922))) * (-502)));
                                        int i4992 = (i4962 ^ i4982) + ((i4982 & i4962) << 1);
                                        int i5002 = ~i4922;
                                        int i5012 = ((~((i5002 & bravo102) | (i5002 ^ bravo102))) | (-2005)) * HttpConstants.HTTP_BAD_GATEWAY;
                                        Object[] objArr1122 = new Object[1];
                                        bravo(c342, (i4992 & i5012) + (i4992 | i5012), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr1122);
                                        String[] strArr212 = {str532, str542, (String) objArr1122[0]};
                                        int i5022 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2018;
                                        int blue2 = Color.blue(0);
                                        int i5032 = (blue2 ^ 21) + ((blue2 & 21) << 1);
                                        Object[] objArr1132 = new Object[1];
                                        bravo((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), i5022, i5032, objArr1132);
                                        String str552 = (String) objArr1132[0];
                                        int i5042 = -Color.alpha(0);
                                        int i5052 = 2038 - (~(-(-Color.green(0))));
                                        int i5062 = -(-AndroidCharacter.getMirror('0'));
                                        int i5072 = (i5062 & (-38)) + (i5062 | (-38));
                                        Object[] objArr1142 = new Object[1];
                                        bravo((char) ((i5042 ^ 13076) + ((i5042 & 13076) << 1)), i5052, i5072, objArr1142);
                                        String[] strArr222 = {str552, (String) objArr1142[0]};
                                        Object[] objArr1152 = new Object[1];
                                        bravo((char) TextUtils.getOffsetAfter(str, 0), 2048 - (~(-(-Color.argb(0, 0, 0, 0)))), 10 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr1152);
                                        String str562 = (String) objArr1152[0];
                                        int i5082 = -ImageFormat.getBitsPerPixel(0);
                                        Object[] objArr1162 = new Object[1];
                                        bravo((char) (((i5082 | 27525) << 1) - (i5082 ^ 27525)), 588 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), 5 - (~(-(-TextUtils.getTrimmedLength(str)))), objArr1162);
                                        String[] strArr232 = {str562, (String) objArr1162[0]};
                                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                        int keyCodeFromString32 = KeyEvent.keyCodeFromString(str);
                                        int i5092 = keyCodeFromString32 * 784;
                                        int i5102 = (i5092 & (-1610920)) + (i5092 | (-1610920));
                                        int i5112 = ~keyCodeFromString32;
                                        int i5122 = (i5112 & i305) | (i5112 ^ i305);
                                        int i5132 = ((~((i5122 & 2060) | (i5122 ^ 2060))) * (-783)) + (i5102 ^ 1613763) + ((1613763 & i5102) << 1);
                                        int i5142 = ((~(i305 | 2060)) | (~keyCodeFromString32)) * 783;
                                        Object[] objArr1172 = new Object[1];
                                        bravo(tapTimeout2, (i5132 & i5142) + (i5142 | i5132), 28 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr1172);
                                        String str572 = (String) objArr1172[0];
                                        char c352 = (char) (13075 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                        int i5152 = 2040 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        int i5162 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        i47 = 1;
                                        int i5172 = ((i5162 | 10) << 1) - (i5162 ^ 10);
                                        Object[] objArr1182 = new Object[1];
                                        bravo(c352, i5152, i5172, objArr1182);
                                        c12 = 0;
                                        i48 = 5;
                                        String[][] strArr242 = {strArr202, strArr212, strArr222, strArr232, new String[]{str572, (String) objArr1182[0]}};
                                        i49 = 0;
                                        int i5182 = -1;
                                        loop7: while (true) {
                                            if (i49 >= i48) {
                                            }
                                            i49++;
                                            int i5232 = delta;
                                            charlie = (((i5232 | 111) << i47) - (i5232 ^ 111)) % 128;
                                            i48 = 5;
                                            i47 = 1;
                                            c12 = 0;
                                        }
                                        int i5242 = ((~i46) & i4) | (i46 & i42);
                                        int i5252 = -i5242;
                                        int i5262 = ((i5242 & i5252) | (i5242 ^ i5252)) >> 31;
                                        int i5272 = i50 & (~i5262);
                                        int i5282 = i46 & i5262;
                                        int i5292 = (i5282 & i5272) | (i5272 ^ i5282);
                                        char longPressTimeout32 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                        int maximumFlingVelocity22 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2088;
                                        int lastIndexOf2 = TextUtils.lastIndexOf(str, '0');
                                        int i5302 = (lastIndexOf2 ^ 14) + ((lastIndexOf2 & 14) << 1);
                                        Object[] objArr1202 = new Object[1];
                                        bravo(longPressTimeout32, maximumFlingVelocity22, i5302, objArr1202);
                                        String str602 = (String) objArr1202[0];
                                        int i5312 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        Object[] objArr1212 = new Object[1];
                                        bravo((char) ((i5312 ^ 2927) + ((i5312 & 2927) << 1)), 2101 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr1212);
                                        String str612 = (String) objArr1212[0];
                                        file = new File(str602);
                                        if (file.exists()) {
                                        }
                                        i51 = i4;
                                        int i53722 = ((~i5292) & i4) | (i5292 & i42);
                                        int i53822 = -i53722;
                                        int i53922 = ((i53722 & i53822) | (i53722 ^ i53822)) >> 31;
                                        int i54022 = i51 & (~i53922);
                                        int i54122 = i5292 & i53922;
                                        int i54222 = (i54122 & i54022) | (i54022 ^ i54122);
                                        int i54322 = -View.MeasureSpec.getMode(0);
                                        int bravo1122 = al.bravo();
                                        int i54422 = i54322 * 51;
                                        int i54522 = (i54422 & (-2910747)) + (i54422 | (-2910747));
                                        int i54622 = (i54322 | bravo1122) * (-50);
                                        int i54722 = ((i54522 | i54622) << 1) - (i54622 ^ i54522);
                                        int i54822 = ~i54322;
                                        int i54922 = (i54822 & (-59404)) | (i54822 ^ (-59404));
                                        int i55022 = ~((i54922 & bravo1122) | (i54922 ^ bravo1122));
                                        int i55122 = ~bravo1122;
                                        int i55222 = ~(((-59404) & i55122) | ((-59404) ^ i55122) | i54322);
                                        int i55322 = (((i55022 & i55222) | (i55022 ^ i55222)) * 50) + i54722;
                                        int i55422 = ~((~bravo1122) | (-59404));
                                        int i55522 = ~(((-59404) ^ i54322) | ((-59404) & i54322));
                                        int i55622 = ((~((i54322 & i55122) | (i55122 ^ i54322))) | (i55422 & i55522) | (i55422 ^ i55522)) * 50;
                                        char c3622 = (char) ((i55322 & i55622) + (i55622 | i55322));
                                        int i55722 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        int i55822 = ((i55722 | 2109) << 1) - (i55722 ^ 2109);
                                        int i55922 = -(Process.myPid() >> 22);
                                        int i56022 = ((i55922 | 47) << 1) - (i55922 ^ 47);
                                        Object[] objArr12322 = new Object[1];
                                        bravo(c3622, i55822, i56022, objArr12322);
                                        Object[] objArr12422 = {(String) objArr12322[0]};
                                        D88717 = uH18377.D8871(1979478258);
                                        if (D88717 == null) {
                                        }
                                        long longValue1822 = ((Long) ((Method) D88717).invoke(null, objArr12422)).longValue();
                                        long j11822 = -1345399979;
                                        long j11922 = 367;
                                        long j12022 = -366;
                                        long j12122 = ((j11822 | longValue1822) * j12022) + (j11922 * longValue1822) + (j11922 * j11822);
                                        long j12222 = longValue1822 ^ j30;
                                        long tango22 = ao.ad.tango(1981048993);
                                        long j12322 = (366 * ((((j11822 ^ j30) | longValue1822) ^ j30) | (((j11822 | j12222) | tango22) ^ j30))) + (j12022 * (j11822 | ((j12222 | tango22) ^ j30))) + j12122 + 2120221285;
                                        int myTid322 = Process.myTid();
                                        int i56122 = ~myTid322;
                                        int i56222 = ((int) (j12322 >> c3)) & ((((~(myTid322 | (-908696687))) | (~(i56122 | (-159392017)))) * 765) + (((~((-908696687) | i56122)) | 369137708) * 1530) + (((~((-369137709) | i56122)) | (~((-539558979) | myTid322)) | (~((-159392017) | myTid322))) * 765) + 2102387698);
                                        int i56322 = ((int) j12322) & ((((~(i42 | (-536870918))) | (-2130046560)) * 521) + (((~((-536870918) | i4)) * 521) - 321404536));
                                        int i56422 = ((i56222 & i56322) | (i56222 ^ i56322)) * 263;
                                        int i56522 = (i56422 & i42) | ((~i56422) & i4);
                                        int i56622 = ((~i54222) & i4) | (i54222 & i42);
                                        int i56722 = -i56622;
                                        int i56822 = ((i56622 & i56722) | (i56622 ^ i56722)) >> 31;
                                        int i56922 = i56522 & (~i56822);
                                        int i57022 = i54222 & i56822;
                                        i371 = (i57022 & i56922) | (i56922 ^ i57022);
                                        strArr4 = strArr5;
                                    }
                                }
                                Object[] objArr126 = new Object[1];
                                bravo((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 371 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), 22 - Process.getGidForName(str), objArr126);
                                String str62 = (String) objArr126[0];
                                char c37 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i571 = -((Process.getThreadPriority(0) + 20) >> 6);
                                int i572 = (i571 & 810) + (i571 | 810);
                                int i573 = -((Process.getThreadPriority(0) + 20) >> 6);
                                int i574 = ~i573;
                                int i575 = (i574 * (-333)) + (i573 * (-665)) + 3340;
                                int i576 = ~(i574 | i91);
                                int i577 = ~((i4 ^ 10) | (i4 & 10));
                                int i578 = (i575 - (~(((i576 & i577) | (i576 ^ i577)) * 333))) - 1;
                                int i579 = ~i573;
                                int i580 = ~((i579 & i4) | (i579 ^ i4));
                                int i581 = ~((i91 ^ 10) | (i91 & 10));
                                int i582 = (((i580 & i581) | (i580 ^ i581)) * 333) + i578;
                                Object[] objArr127 = new Object[1];
                                bravo(c37, i572, i582, objArr127);
                                String str63 = (String) objArr127[0];
                                int i583 = -(-TextUtils.getOffsetAfter(str, 0));
                                Object[] objArr128 = new Object[1];
                                bravo((char) ((65199 & i583) + (i583 | 65199)), 820 - (~TextUtils.indexOf((CharSequence) str, '0', 0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 7, objArr128);
                                String str64 = (String) objArr128[0];
                                char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int i584 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                int i585 = ((i584 | 827) << 1) - (i584 ^ 827);
                                int i586 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int i587 = (i586 & 8) + (i586 | 8);
                                Object[] objArr129 = new Object[1];
                                bravo(packedPositionGroup2, i585, i587, objArr129);
                                String[] strArr27 = {str62, str63, str64, (String) objArr129[0]};
                                char packedPositionType = (char) (47479 - ExpandableListView.getPackedPositionType(0L));
                                int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int i588 = doubleTapTimeout3 * (-519);
                                int i589 = ((435035 | i588) << 1) - (i588 ^ 435035);
                                int i590 = ~doubleTapTimeout3;
                                int i591 = (i590 ^ (-836)) | (i590 & (-836));
                                int i592 = ~((i591 & i91) | (i591 ^ i91));
                                int i593 = ~((i4 ^ 835) | (i4 & 835));
                                int i594 = -(-(((i592 & i593) | (i592 ^ i593)) * 520));
                                int i595 = (((~((-836) | i91)) | (~(doubleTapTimeout3 | i4))) * (-1040)) + (i589 & i594) + (i589 | i594);
                                int i596 = (~((i590 & i305) | (i590 ^ i305))) | (~(((-836) ^ doubleTapTimeout3) | ((-836) & doubleTapTimeout3)));
                                int i597 = ~((doubleTapTimeout3 & i4) | (doubleTapTimeout3 ^ i4));
                                Object[] objArr130 = new Object[1];
                                bravo(packedPositionType, (((i597 & i596) | (i596 ^ i597)) * 520) + i595, 15 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr130);
                                String str65 = (String) objArr130[0];
                                char indexOf9 = (char) TextUtils.indexOf(str, str);
                                int i598 = -View.MeasureSpec.getSize(0);
                                Object[] objArr131 = new Object[1];
                                bravo(indexOf9, (i598 ^ 852) + ((i598 & 852) << 1), TextUtils.lastIndexOf(str, '0') + 8, objArr131);
                                String str66 = (String) objArr131[0];
                                char c38 = (char) (54643 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1)))));
                                int i599 = -Color.green(0);
                                int i600 = (i599 * (-751)) - 645109;
                                int i601 = ~((~i599) | (-860));
                                int i602 = ~i599;
                                int i603 = ~((i602 ^ i4) | (i602 & i4));
                                int i604 = -(-(((i601 ^ i603) | (i601 & i603)) * 1504));
                                int i605 = ((i600 | i604) << 1) - (i600 ^ i604);
                                int i606 = (i602 ^ 859) | (i602 & 859);
                                int i607 = (i605 - (~(-(-((~((i606 ^ i4) | (i606 & i4))) * (-1504)))))) - 1;
                                int i608 = ~i606;
                                int i609 = ~((i599 & (-860)) | ((-860) ^ i599));
                                int alpha5 = Color.alpha(0);
                                int i610 = (alpha5 ^ 7) + ((alpha5 & 7) << 1);
                                Object[] objArr132 = new Object[1];
                                bravo(c38, (((i609 & i608) | (i608 ^ i609)) * 752) + i607, i610, objArr132);
                                String str67 = (String) objArr132[0];
                                char c39 = (char) (6263 - (~Drawable.resolveOpacity(0, 0)));
                                int lastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0) + 867;
                                int resolveSize3 = View.resolveSize(0, 0);
                                int i611 = ((resolveSize3 | 11) << 1) - (resolveSize3 ^ 11);
                                Object[] objArr133 = new Object[1];
                                bravo(c39, lastIndexOf3, i611, objArr133);
                                String str68 = (String) objArr133[0];
                                char c40 = (char) ((-2) - (~(-MotionEvent.axisFromString(str))));
                                int trimmedLength3 = 877 - TextUtils.getTrimmedLength(str);
                                int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i612 = (jumpTapTimeout4 ^ 14) + ((jumpTapTimeout4 & 14) << 1);
                                Object[] objArr134 = new Object[1];
                                bravo(c40, trimmedLength3, i612, objArr134);
                                String[] strArr28 = {str65, str66, str67, str68, (String) objArr134[0]};
                                char resolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                                int i613 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                Object[] objArr135 = new Object[1];
                                bravo(resolveSizeAndState2, (i613 ^ 891) + ((i613 & 891) << 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, objArr135);
                                String str69 = (String) objArr135[0];
                                char mode2 = (char) View.MeasureSpec.getMode(0);
                                int i614 = -View.getDefaultSize(0, 0);
                                int i615 = (i614 & 907) + (i614 | 907);
                                int i616 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i617 = (i616 & 4) + (i616 | 4);
                                Object[] objArr136 = new Object[1];
                                bravo(mode2, i615, i617, objArr136);
                                String str70 = (String) objArr136[0];
                                char offsetAfter4 = (char) TextUtils.getOffsetAfter(str, 0);
                                int i618 = -Color.rgb(0, 0, 0);
                                int i619 = ((-16776298) & i618) + (i618 | (-16776298));
                                int i620 = -TextUtils.lastIndexOf(str, '0');
                                int i621 = (i620 & 21) + (i620 | 21);
                                Object[] objArr137 = new Object[1];
                                bravo(offsetAfter4, i619, i621, objArr137);
                                String str71 = (String) objArr137[0];
                                Object[] objArr138 = new Object[1];
                                bravo((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 940 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), 25 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr138);
                                String str72 = (String) objArr138[0];
                                int i622 = -KeyEvent.normalizeMetaState(0);
                                int i623 = -TextUtils.getOffsetAfter(str, 0);
                                int i624 = (i623 & 965) + (i623 | 965);
                                int i625 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i626 = (i625 & 28) + (i625 | 28);
                                Object[] objArr139 = new Object[1];
                                bravo((char) ((55251 ^ i622) + ((i622 & 55251) << 1)), i624, i626, objArr139);
                                String[] strArr29 = {str69, str70, str6, str71, str72, (String) objArr139[0]};
                                int i627 = -KeyEvent.normalizeMetaState(0);
                                int i628 = -TextUtils.lastIndexOf(str, '0');
                                int i629 = (i628 ^ 992) + ((i628 & 992) << 1);
                                int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                                int i630 = ~((-12) | i91);
                                int i631 = ~((-12) | tapTimeout3);
                                int i632 = (i630 ^ i631) | (i630 & i631) | (~((i91 ^ tapTimeout3) | (i91 & tapTimeout3)));
                                int i633 = ~tapTimeout3;
                                int i634 = (i633 ^ 11) | (i633 & 11);
                                int i635 = ~((i634 ^ i4) | (i634 & i4));
                                int i636 = (((tapTimeout3 * (-589)) + 6501) - (~(((i632 ^ i635) | (i635 & i632)) * 590))) - 1;
                                int i637 = ~(((-12) ^ i91) | ((-12) & i91));
                                int i638 = ~(((-12) ^ tapTimeout3) | ((-12) & tapTimeout3));
                                int i639 = (i637 ^ i638) | (i638 & i637);
                                int i640 = ~((tapTimeout3 & i305) | (i305 ^ tapTimeout3));
                                int i641 = (i636 - (~(-(-(((i640 & i639) | (i639 ^ i640)) * (-1180)))))) - 1;
                                int i642 = ~((i633 ^ i91) | (i633 & i91));
                                int i643 = ~(i91 | 11);
                                int i644 = -(-(((i642 & i643) | (i642 ^ i643)) * 590));
                                int i645 = (i641 & i644) + (i644 | i641);
                                Object[] objArr140 = new Object[1];
                                bravo((char) (((i627 | 29643) << 1) - (i627 ^ 29643)), i629, i645, objArr140);
                                String str73 = (String) objArr140[0];
                                int i646 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr141 = new Object[1];
                                bravo((char) ((46517 & i646) + (i646 | 46517)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1004, 6 - (~(-MotionEvent.axisFromString(str))), objArr141);
                                String str74 = (String) objArr141[0];
                                int doubleTapTimeout4 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                int i647 = -(-TextUtils.getCapsMode(str, 0, 0));
                                int i648 = (i647 & 1012) + (i647 | 1012);
                                int i649 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int bravo12 = al.bravo();
                                int i650 = ~i649;
                                int i651 = ~bravo12;
                                int i652 = (((~(i650 | i651)) | (~(((-7) ^ bravo12) | ((-7) & bravo12)))) * 217) + ((i649 * (-433)) - 1296);
                                int i653 = ~((i650 ^ (-7)) | (i650 & (-7)));
                                int i654 = ~((i650 ^ bravo12) | (i650 & bravo12));
                                int i655 = ((i653 ^ i654) | (i653 & i654)) * 217;
                                int i656 = (i652 ^ i655) + ((i652 & i655) << 1);
                                int i657 = ~(((-7) ^ i651) | ((-7) & i651));
                                int i658 = ((i649 ^ i657) | (i657 & i649)) * 217;
                                int i659 = (i656 & i658) + (i658 | i656);
                                Object[] objArr142 = new Object[1];
                                bravo((char) (((36251 | doubleTapTimeout4) << 1) - (doubleTapTimeout4 ^ 36251)), i648, i659, objArr142);
                                String str75 = (String) objArr142[0];
                                int i660 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                Object[] objArr143 = new Object[1];
                                bravo((char) ((i660 ^ 7756) + ((i660 & 7756) << 1)), 1017 - (~(-(-Color.red(0)))), 6 - (ViewConfiguration.getTapTimeout() >> 16), objArr143);
                                String[] strArr30 = {str73, str74, str75, (String) objArr143[0]};
                                char maximumFlingVelocity3 = (char) (22587 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0);
                                int i661 = (absoluteGravity3 & Barcode.FORMAT_UPC_E) + (absoluteGravity3 | Barcode.FORMAT_UPC_E);
                                int i662 = -View.MeasureSpec.getSize(0);
                                int i663 = (i662 & 16) + (i662 | 16);
                                Object[] objArr144 = new Object[1];
                                bravo(maximumFlingVelocity3, i661, i663, objArr144);
                                String str76 = (String) objArr144[0];
                                int i664 = -TextUtils.indexOf((CharSequence) str, '0', 0);
                                int blue3 = 859 - Color.blue(0);
                                int i665 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i666 = (i665 ^ 7) + ((i665 & 7) << 1);
                                Object[] objArr145 = new Object[1];
                                bravo((char) ((54643 & i664) + (i664 | 54643)), blue3, i666, objArr145);
                                String str77 = (String) objArr145[0];
                                char c41 = (char) ((-2) - ((-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))) ^ (-1)));
                                int keyCodeFromString4 = KeyEvent.keyCodeFromString(str) + 827;
                                int i667 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                int i668 = (i667 & 8) + (i667 | 8);
                                Object[] objArr146 = new Object[1];
                                bravo(c41, keyCodeFromString4, i668, objArr146);
                                String[] strArr31 = {str76, str77, (String) objArr146[0]};
                                char c42 = (char) ((-16736668) - (~(-Color.rgb(0, 0, 0))));
                                int i669 = -View.resolveSize(0, 0);
                                Object[] objArr147 = new Object[1];
                                bravo(c42, (i669 & 1040) + (i669 | 1040), 13 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr147);
                                String str78 = (String) objArr147[0];
                                Object[] objArr148 = new Object[1];
                                bravo((char) Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1)) + 1054, 0 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr148);
                                String[] strArr32 = {str78, (String) objArr148[0]};
                                int i670 = -(-Color.rgb(0, 0, 0));
                                int i671 = -TextUtils.indexOf((CharSequence) str, '0', 0);
                                int i672 = (i671 ^ 1054) + ((i671 & 1054) << 1);
                                int i673 = -KeyEvent.keyCodeFromString(str);
                                int i674 = (i673 & 9) + (i673 | 9);
                                Object[] objArr149 = new Object[1];
                                bravo((char) ((16812012 & i670) + (i670 | 16812012)), i672, i674, objArr149);
                                String str79 = (String) objArr149[0];
                                char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int i675 = 1064 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                int i676 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                Object[] objArr150 = new Object[1];
                                bravo(touchSlop3, i675, (i676 ^ 1) + ((i676 & 1) << 1), objArr150);
                                String[] strArr33 = {str79, (String) objArr150[0]};
                                int i677 = -(-MotionEvent.axisFromString(str));
                                int i678 = -KeyEvent.normalizeMetaState(0);
                                int i679 = (i678 & 1065) + (i678 | 1065);
                                int i680 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int i681 = (i680 ^ 16) + ((i680 & 16) << 1);
                                Object[] objArr151 = new Object[1];
                                bravo((char) ((i677 ^ 1) + ((i677 & 1) << 1)), i679, i681, objArr151);
                                String str80 = (String) objArr151[0];
                                Object[] objArr152 = new Object[1];
                                bravo((char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), 905 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0, 0))), 3 - Drawable.resolveOpacity(0, 0), objArr152);
                                String str81 = (String) objArr152[0];
                                Object[] objArr153 = new Object[1];
                                bravo((char) TextUtils.indexOf(str, str), 852 - TextUtils.indexOf(str, str, 0), 5 - (~(-ExpandableListView.getPackedPositionChild(0L))), objArr153);
                                String str82 = (String) objArr153[0];
                                int i682 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i683 = 1080 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)));
                                int i684 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                Object[] objArr154 = new Object[1];
                                bravo((char) ((i682 ^ 1) + ((i682 & 1) << 1)), i683, (i684 ^ 8) + ((i684 & 8) << 1), objArr154);
                                String str83 = (String) objArr154[0];
                                int i685 = -KeyEvent.getDeadChar(0, 0);
                                int i686 = 865 - (~(-TextUtils.getOffsetAfter(str, 0)));
                                int i687 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                int i688 = ((i687 | 10) << 1) - (i687 ^ 10);
                                Object[] objArr155 = new Object[1];
                                bravo((char) (((i685 | 6264) << 1) - (i685 ^ 6264)), i686, i688, objArr155);
                                String str84 = (String) objArr155[0];
                                char rgb2 = (char) (ShapeBuilder.DEFAULT_SHAPE_COLOR - Color.rgb(0, 0, 0));
                                int i689 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i690 = -TextUtils.lastIndexOf(str, '0', 0);
                                Object[] objArr156 = new Object[1];
                                bravo(rgb2, ((i689 | 878) << 1) - (i689 ^ 878), (i690 & 13) + (i690 | 13), objArr156);
                                String[] strArr34 = {str80, str81, str82, str83, str84, (String) objArr156[0]};
                                char indexOf10 = (char) (62585 - TextUtils.indexOf(str, str, 0));
                                int i691 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                Object[] objArr157 = new Object[1];
                                bravo(indexOf10, (i691 | 1089) + (i691 & 1089), 19 - (~(-(-View.resolveSize(0, 0)))), objArr157);
                                String str85 = (String) objArr157[0];
                                int i692 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int i693 = -TextUtils.indexOf((CharSequence) str, '0', 0);
                                int i694 = (i693 & 1108) + (i693 | 1108);
                                int i695 = -TextUtils.getTrimmedLength(str);
                                int i696 = (i695 ^ 19) + ((i695 & 19) << 1);
                                Object[] objArr158 = new Object[1];
                                bravo((char) ((i692 ^ 12771) + ((i692 & 12771) << 1)), i694, i696, objArr158);
                                String str86 = (String) objArr158[0];
                                int i697 = -(-View.resolveSizeAndState(0, 0, 0));
                                int i698 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i699 = (i698 & 1129) + (i698 | 1129);
                                int i700 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int i701 = ((i700 | 31) << 1) - (i700 ^ 31);
                                Object[] objArr159 = new Object[1];
                                bravo((char) ((48656 ^ i697) + ((i697 & 48656) << 1)), i699, i701, objArr159);
                                String str87 = (String) objArr159[0];
                                int i702 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                Object[] objArr160 = new Object[1];
                                bravo((char) ((i702 & 1) + (i702 | 1)), 1158 - MotionEvent.axisFromString(str), 25 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr160);
                                String str88 = (String) objArr160[0];
                                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                Object[] objArr161 = new Object[1];
                                bravo((char) ((48016 & keyRepeatTimeout2) + (keyRepeatTimeout2 | 48016)), 1184 - (~(-(-(Process.myTid() >> 22)))), 23 - TextUtils.getTrimmedLength(str), objArr161);
                                String str89 = (String) objArr161[0];
                                char size3 = (char) View.MeasureSpec.getSize(0);
                                int i703 = -TextUtils.getOffsetAfter(str, 0);
                                int i704 = ((i703 | 1208) << 1) - (i703 ^ 1208);
                                int i705 = -(ViewConfiguration.getTapTimeout() >> 16);
                                Object[] objArr162 = new Object[1];
                                bravo(size3, i704, (i705 & 33) + (i705 | 33), objArr162);
                                String[] strArr35 = {str85, str86, str87, str88, str89, (String) objArr162[0], str6};
                                int indexOf11 = TextUtils.indexOf(str, str, 0, 0);
                                char c43 = (char) ((indexOf11 & 669) + (indexOf11 | 669));
                                int argb3 = 1241 - Color.argb(0, 0, 0, 0);
                                int i706 = -Color.blue(0);
                                Object[] objArr163 = new Object[1];
                                bravo(c43, argb3, ((i706 | 13) << 1) - (i706 ^ 13), objArr163);
                                String str90 = (String) objArr163[0];
                                int i707 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                char c44 = (char) (((65198 | i707) << 1) - (65198 ^ i707));
                                int i708 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 819;
                                int i709 = -Color.alpha(0);
                                Object[] objArr164 = new Object[1];
                                bravo(c44, i708, (i709 ^ 7) + ((i709 & 7) << 1), objArr164);
                                String[] strArr36 = {str90, (String) objArr164[0]};
                                int i710 = -(-ExpandableListView.getPackedPositionType(0L));
                                int i711 = -(-TextUtils.getOffsetAfter(str, 0));
                                int i712 = ((i711 | 1254) << 1) - (i711 ^ 1254);
                                int i713 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i714 = (i713 & 29) + (i713 | 29);
                                Object[] objArr165 = new Object[1];
                                bravo((char) ((41273 & i710) + (i710 | 41273)), i712, i714, objArr165);
                                String str91 = (String) objArr165[0];
                                char capsMode3 = (char) TextUtils.getCapsMode(str, 0, 0);
                                int i715 = -Color.green(0);
                                Object[] objArr166 = new Object[1];
                                bravo(capsMode3, ((i715 & 1284) << 1) + (i715 ^ 1284), 10 - (~(-View.MeasureSpec.getMode(0))), objArr166);
                                String[] strArr37 = {str91, (String) objArr166[0]};
                                char c45 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i716 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i717 = (i716 ^ 1295) + ((i716 & 1295) << 1);
                                int i718 = -(-ExpandableListView.getPackedPositionType(0L));
                                int i719 = (i718 ^ 19) + ((i718 & 19) << 1);
                                Object[] objArr167 = new Object[1];
                                bravo(c45, i717, i719, objArr167);
                                String str92 = (String) objArr167[0];
                                int i720 = -TextUtils.lastIndexOf(str, '0', 0);
                                int i721 = -(-AndroidCharacter.getMirror('0'));
                                Object[] objArr168 = new Object[1];
                                bravo((char) ((i720 ^ (-1)) + (i720 << 1)), (i721 | 1266) + (i721 & 1266), 3 - (~(-TextUtils.lastIndexOf(str, '0'))), objArr168);
                                String[] strArr38 = {str92, (String) objArr168[0]};
                                char c46 = (char) (0 - (~(-(-ImageFormat.getBitsPerPixel(0)))));
                                int i722 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int i723 = ((i722 | 1319) << 1) - (i722 ^ 1319);
                                int i724 = -ExpandableListView.getPackedPositionChild(0L);
                                int i725 = (i724 ^ 18) + ((i724 & 18) << 1);
                                Object[] objArr169 = new Object[1];
                                bravo(c46, i723, i725, objArr169);
                                String[] strArr39 = {(String) objArr169[0]};
                                int i726 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                int i727 = 1337 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int i728 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                Object[] objArr170 = new Object[1];
                                bravo((char) (((i726 | 6777) << 1) - (i726 ^ 6777)), i727, (i728 ^ 15) + ((i728 & 15) << 1), objArr170);
                                String[] strArr40 = {(String) objArr170[0]};
                                char c47 = (char) (58425 - (~(-(-(ViewConfiguration.getPressedStateDuration() >> 16)))));
                                int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0);
                                int bravo13 = al.bravo();
                                int i729 = bitsPerPixel4 * 881;
                                int i730 = ((i729 | 1193755) << 1) - (i729 ^ 1193755);
                                int i731 = ~bitsPerPixel4;
                                int i732 = ~((i731 ^ (-1356)) | (i731 & (-1356)));
                                int i733 = ~bitsPerPixel4;
                                int i734 = ~((i733 ^ bravo13) | (i733 & bravo13));
                                int i735 = (i732 ^ i734) | (i732 & i734);
                                int i736 = ~(((-1356) ^ bravo13) | ((-1356) & bravo13));
                                int i737 = ((i735 ^ i736) | (i735 & i736)) * (-880);
                                int i738 = (i730 & i737) + (i730 | i737);
                                int i739 = ~bravo13;
                                int i740 = ~((i731 ^ i739) | (i739 & i731));
                                int i741 = (bitsPerPixel4 ^ bravo13) | (bitsPerPixel4 & bravo13);
                                int i742 = ((i740 & 1355) | (i740 ^ 1355) | (~i741)) * (-880);
                                int i743 = ((i738 | i742) << 1) - (i738 ^ i742);
                                int i744 = -(-((~i741) * 880));
                                int i745 = -View.combineMeasuredStates(0, 0);
                                int i746 = (i745 ^ 19) + ((i745 & 19) << 1);
                                Object[] objArr171 = new Object[1];
                                bravo(c47, ((i744 & i743) << 1) + (i743 ^ i744), i746, objArr171);
                                String[] strArr41 = {(String) objArr171[0]};
                                char c48 = (char) (0 - (~(-(-ImageFormat.getBitsPerPixel(0)))));
                                int i747 = 1372 - (~(-(-View.resolveSize(0, 0))));
                                int i748 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                int i749 = ((i748 | 20) << 1) - (i748 ^ 20);
                                Object[] objArr172 = new Object[1];
                                bravo(c48, i747, i749, objArr172);
                                String[] strArr42 = {(String) objArr172[0]};
                                int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
                                int i750 = 1391 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                                int capsMode4 = TextUtils.getCapsMode(str, 0, 0);
                                Object[] objArr173 = new Object[1];
                                bravo((char) ((54723 & scrollBarSize4) + (scrollBarSize4 | 54723)), i750, (capsMode4 & 23) + (capsMode4 | 23), objArr173);
                                String[] strArr43 = {(String) objArr173[0]};
                                char c49 = (char) (26269 - (~(-(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))));
                                int jumpTapTimeout5 = 1415 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i751 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                Object[] objArr174 = new Object[1];
                                bravo(c49, jumpTapTimeout5, (i751 & 21) + (i751 | 21), objArr174);
                                String[] strArr44 = {(String) objArr174[0]};
                                char green4 = (char) Color.green(0);
                                int i752 = 1436 - (~TextUtils.lastIndexOf(str, '0'));
                                int i753 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int bravo14 = al.bravo();
                                int i754 = i753 * (-500);
                                int i755 = ((i754 | (-12000)) << 1) - (i754 ^ (-12000));
                                int i756 = ~(((-25) ^ i753) | ((-25) & i753));
                                int i757 = ~i753;
                                int i758 = ~((i757 ^ 24) | (i757 & 24) | bravo14);
                                int i759 = (((i756 ^ i758) | (i756 & i758)) * HttpConstants.HTTP_NOT_IMPLEMENTED) + i755;
                                int i760 = ~i753;
                                int i761 = ((~(i757 | (~bravo14) | 24)) * HttpConstants.HTTP_NOT_IMPLEMENTED) + ((i759 - (~(-(-((~((i760 & (-25)) | (i760 ^ (-25)))) * 1002))))) - 1);
                                Object[] objArr175 = new Object[1];
                                bravo(green4, i752, i761, objArr175);
                                String[] strArr45 = {(String) objArr175[0], str6};
                                char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int i762 = -TextUtils.indexOf(str, str);
                                Object[] objArr176 = new Object[1];
                                bravo(packedPositionGroup3, ((i762 | 1460) << 1) - (i762 ^ 1460), 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr176);
                                String[] strArr46 = {(String) objArr176[0], str6};
                                char green5 = (char) (Color.green(0) + 29956);
                                int jumpTapTimeout6 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                Object[] objArr177 = new Object[1];
                                bravo(green5, (jumpTapTimeout6 | 1488) + (jumpTapTimeout6 & 1488), 26 - (~(-(-View.combineMeasuredStates(0, 0)))), objArr177);
                                String[] strArr47 = {(String) objArr177[0], str6};
                                char resolveSize4 = (char) (25371 - View.resolveSize(0, 0));
                                int i763 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i764 = (i763 ^ 1515) + ((i763 & 1515) << 1);
                                int i765 = -ExpandableListView.getPackedPositionType(0L);
                                Object[] objArr178 = new Object[1];
                                bravo(resolveSize4, i764, (i765 & 31) + (i765 | 31), objArr178);
                                String[] strArr48 = {(String) objArr178[0], str6};
                                char c50 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15163);
                                int i766 = -(-TextUtils.indexOf(str, str, 0, 0));
                                Object[] objArr179 = new Object[1];
                                bravo(c50, (i766 | 1546) + (i766 & 1546), 26 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1))), objArr179);
                                String[] strArr49 = {(String) objArr179[0], str6};
                                char c51 = (char) (47574 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                                int i767 = 1572 - (~(-(-TextUtils.indexOf(str, str, 0))));
                                int i768 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr180 = new Object[1];
                                bravo(c51, i767, (i768 ^ 33) + ((i768 & 33) << 1), objArr180);
                                String[][] strArr50 = {strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, strArr49, new String[]{(String) objArr180[0], str6}};
                                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int i769 = 1604 - (~TextUtils.getOffsetBefore(str, 0));
                                int i770 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i771 = (i770 & 1) + (i770 | 1);
                                Object[] objArr181 = new Object[1];
                                bravo(edgeSlop2, i769, i771, objArr181);
                                StringBuilder sb2 = new StringBuilder((String) objArr181[0]);
                                int i772 = i4;
                                int i773 = 0;
                                int i774 = 0;
                                for (int i775 = i18; i773 < i775; i775 = 24) {
                                    int i776 = delta + 119;
                                    charlie = i776 % 128;
                                    if (i776 % 2 != 0) {
                                        strArr7 = strArr50[i773];
                                        Object[] objArr182 = {strArr7[1]};
                                        Object D887126 = uH18377.D8871(i16);
                                        if (D887126 == null) {
                                            int i777 = 52 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int scrollBarSize5 = (ViewConfiguration.getScrollBarSize() >> 8) + 3158;
                                            char maximumFlingVelocity4 = (char) (58074 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                            byte b57 = (byte) (i102 & 1);
                                            byte b58 = (byte) (b57 + 1);
                                            i43 = i773;
                                            strArr6 = strArr50;
                                            i44 = i91;
                                            Object[] objArr183 = new Object[1];
                                            charlie(b57, b58, (byte) (b58 - 2), objArr183);
                                            D887126 = uH18377.setPivotYN16904(i777, scrollBarSize5, maximumFlingVelocity4, 424179844, false, (String) objArr183[0], new Class[]{String.class});
                                        } else {
                                            i43 = i773;
                                            strArr6 = strArr50;
                                            i44 = i91;
                                        }
                                        str2 = (String) ((Method) D887126).invoke(null, objArr182);
                                        strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                    } else {
                                        i43 = i773;
                                        strArr6 = strArr50;
                                        i44 = i91;
                                        strArr7 = strArr6[i43];
                                        Object[] objArr184 = {strArr7[0]};
                                        Object D887127 = uH18377.D8871(i16);
                                        if (D887127 == null) {
                                            int offsetAfter5 = TextUtils.getOffsetAfter(str, 0) + 52;
                                            int offsetBefore2 = 3158 - TextUtils.getOffsetBefore(str, 0);
                                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 58074);
                                            byte b59 = (byte) (i102 & 1);
                                            byte b60 = (byte) (b59 + 1);
                                            Object[] objArr185 = new Object[1];
                                            charlie(b59, b60, (byte) (b60 - 2), objArr185);
                                            D887127 = uH18377.setPivotYN16904(offsetAfter5, offsetBefore2, deadChar, 424179844, false, (String) objArr185[0], new Class[]{String.class});
                                        }
                                        str2 = (String) ((Method) D887127).invoke(null, objArr184);
                                        strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                    }
                                }
                                i42 = i91;
                                int i778 = i772;
                                char c52 = (char) (11866 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                                int i779 = -Gravity.getAbsoluteGravity(0, 0);
                                int bravo15 = al.bravo();
                                int i780 = i779 * 217;
                                int i781 = ((i780 | (-345935)) << 1) - (i780 ^ (-345935));
                                int i782 = (~((i779 ^ bravo15) | (i779 & bravo15))) * 216;
                                int i783 = (i781 ^ i782) + ((i782 & i781) << 1);
                                int i784 = (i779 ^ (-1610)) | (i779 & (-1610));
                                int i785 = ~bravo15;
                                int i786 = ~((i779 & i785) | (i785 ^ i779));
                                int i787 = (((i786 & 1609) | (i786 ^ 1609)) * 216) + (((i784 & i785) | (i784 ^ i785)) * (-216)) + i783;
                                int i788 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int i789 = (i788 ^ 1) + ((i788 & 1) << 1);
                                Object[] objArr186 = new Object[1];
                                bravo(c52, i787, i789, objArr186);
                                sb2.append((String) objArr186[0]);
                                if (i774 > 2) {
                                    charlie = (delta + 63) % 128;
                                    c11 = 1;
                                    objArr2 = new Object[]{r1, new int[1]};
                                    String[] strArr51 = {sb2.toString()};
                                    c10 = 0;
                                    ((int[]) objArr2[1])[0] = i778;
                                } else {
                                    c10 = 0;
                                    c11 = 1;
                                    objArr2 = new Object[]{new String[0], r1};
                                    int[] iArr = {i4};
                                }
                                int i790 = ((int[]) objArr2[c11])[c10];
                                int i791 = (~(i4 & i384)) & (i4 | i384);
                                int i792 = -i791;
                                int i793 = ((i791 & i792) | (i791 ^ i792)) >> 31;
                                int i794 = i790 & (~i793);
                                int i795 = i384 & i793;
                                i384 = (i794 & i795) | (i794 ^ i795);
                                strArr5 = (String[]) objArr2[0];
                                char jumpTapTimeout7 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i3912 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i3922 = (i3912 & 891) + (i3912 | 891);
                                int size22 = View.MeasureSpec.getSize(0);
                                int i3932 = (size22 & 16) + (size22 | 16);
                                Object[] objArr782 = new Object[1];
                                bravo(jumpTapTimeout7, i3922, i3932, objArr782);
                                Object[] objArr792 = {(String) objArr782[0]};
                                D88716 = uH18377.D8871(i16);
                                if (D88716 == null) {
                                }
                                invoke = ((Method) D88716).invoke(null, objArr792);
                                if (invoke != null) {
                                }
                                if (i45 != 1986687685) {
                                }
                                i46 = i384;
                                char doubleTapTimeout22 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i48022 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                Object[] objArr10822 = new Object[1];
                                bravo(doubleTapTimeout22, (i48022 ^ 1951) + ((i48022 & 1951) << 1), AndroidCharacter.getMirror('0') - '#', objArr10822);
                                String str5222 = (String) objArr10822[0];
                                int i48122 = -(-Color.blue(0));
                                int i48222 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                Object[] objArr10922 = new Object[1];
                                bravo((char) (((i48122 | 847) << 1) - (i48122 ^ 847)), (i48222 & 1964) + (i48222 | 1964), 4 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr10922);
                                String[] strArr2022 = {str5222, (String) objArr10922[0]};
                                int i48322 = -TextUtils.getCapsMode(str, 0, 0);
                                int i48422 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                int i48522 = (i48422 & 1970) + (i48422 | 1970);
                                int i48622 = -(-TextUtils.indexOf((CharSequence) str, '0', 0));
                                int i48722 = ((i48622 | 16) << 1) - (i48622 ^ 16);
                                Object[] objArr11022 = new Object[1];
                                bravo((char) ((i48322 ^ 37533) + ((i48322 & 37533) << 1)), i48522, i48722, objArr11022);
                                String str5322 = (String) objArr11022[0];
                                char c3322 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51573);
                                int i48822 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
                                int i48922 = (i48822 ^ 1985) + ((i48822 & 1985) << 1);
                                int i49022 = -Gravity.getAbsoluteGravity(0, 0);
                                int i49122 = ((i49022 | 19) << 1) - (i49022 ^ 19);
                                Object[] objArr11122 = new Object[1];
                                bravo(c3322, i48922, i49122, objArr11122);
                                String str5422 = (String) objArr11122[0];
                                char c3422 = (char) (33619 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))));
                                int i49222 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int bravo1022 = al.bravo();
                                int i49322 = i49222 * (-501);
                                int i49422 = ~(((-2005) ^ bravo1022) | ((-2005) & bravo1022));
                                int i49522 = ~(i49222 | 2004);
                                int i49622 = (((i49322 & 1008012) + (i49322 | 1008012)) - (~(-(-(((i49422 ^ i49522) | (i49522 & i49422)) * (-502)))))) - 1;
                                int i49722 = (-2005) | (~bravo1022);
                                int i49822 = -(-((~((i49722 ^ i49222) | (i49722 & i49222))) * (-502)));
                                int i49922 = (i49622 ^ i49822) + ((i49822 & i49622) << 1);
                                int i50022 = ~i49222;
                                int i50122 = ((~((i50022 & bravo1022) | (i50022 ^ bravo1022))) | (-2005)) * HttpConstants.HTTP_BAD_GATEWAY;
                                Object[] objArr11222 = new Object[1];
                                bravo(c3422, (i49922 & i50122) + (i49922 | i50122), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr11222);
                                String[] strArr2122 = {str5322, str5422, (String) objArr11222[0]};
                                int i50222 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2018;
                                int blue22 = Color.blue(0);
                                int i50322 = (blue22 ^ 21) + ((blue22 & 21) << 1);
                                Object[] objArr11322 = new Object[1];
                                bravo((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), i50222, i50322, objArr11322);
                                String str5522 = (String) objArr11322[0];
                                int i50422 = -Color.alpha(0);
                                int i50522 = 2038 - (~(-(-Color.green(0))));
                                int i50622 = -(-AndroidCharacter.getMirror('0'));
                                int i50722 = (i50622 & (-38)) + (i50622 | (-38));
                                Object[] objArr11422 = new Object[1];
                                bravo((char) ((i50422 ^ 13076) + ((i50422 & 13076) << 1)), i50522, i50722, objArr11422);
                                String[] strArr2222 = {str5522, (String) objArr11422[0]};
                                Object[] objArr11522 = new Object[1];
                                bravo((char) TextUtils.getOffsetAfter(str, 0), 2048 - (~(-(-Color.argb(0, 0, 0, 0)))), 10 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr11522);
                                String str5622 = (String) objArr11522[0];
                                int i50822 = -ImageFormat.getBitsPerPixel(0);
                                Object[] objArr11622 = new Object[1];
                                bravo((char) (((i50822 | 27525) << 1) - (i50822 ^ 27525)), 588 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), 5 - (~(-(-TextUtils.getTrimmedLength(str)))), objArr11622);
                                String[] strArr2322 = {str5622, (String) objArr11622[0]};
                                char tapTimeout22 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int keyCodeFromString322 = KeyEvent.keyCodeFromString(str);
                                int i50922 = keyCodeFromString322 * 784;
                                int i51022 = (i50922 & (-1610920)) + (i50922 | (-1610920));
                                int i51122 = ~keyCodeFromString322;
                                int i51222 = (i51122 & i305) | (i51122 ^ i305);
                                int i51322 = ((~((i51222 & 2060) | (i51222 ^ 2060))) * (-783)) + (i51022 ^ 1613763) + ((1613763 & i51022) << 1);
                                int i51422 = ((~(i305 | 2060)) | (~keyCodeFromString322)) * 783;
                                Object[] objArr11722 = new Object[1];
                                bravo(tapTimeout22, (i51322 & i51422) + (i51422 | i51322), 28 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr11722);
                                String str5722 = (String) objArr11722[0];
                                char c3522 = (char) (13075 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                int i51522 = 2040 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i51622 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                i47 = 1;
                                int i51722 = ((i51622 | 10) << 1) - (i51622 ^ 10);
                                Object[] objArr11822 = new Object[1];
                                bravo(c3522, i51522, i51722, objArr11822);
                                c12 = 0;
                                i48 = 5;
                                String[][] strArr2422 = {strArr2022, strArr2122, strArr2222, strArr2322, new String[]{str5722, (String) objArr11822[0]}};
                                i49 = 0;
                                int i51822 = -1;
                                loop7: while (true) {
                                    if (i49 >= i48) {
                                    }
                                    i49++;
                                    int i52322 = delta;
                                    charlie = (((i52322 | 111) << i47) - (i52322 ^ 111)) % 128;
                                    i48 = 5;
                                    i47 = 1;
                                    c12 = 0;
                                }
                                int i52422 = ((~i46) & i4) | (i46 & i42);
                                int i52522 = -i52422;
                                int i52622 = ((i52422 & i52522) | (i52422 ^ i52522)) >> 31;
                                int i52722 = i50 & (~i52622);
                                int i52822 = i46 & i52622;
                                int i52922 = (i52822 & i52722) | (i52722 ^ i52822);
                                char longPressTimeout322 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int maximumFlingVelocity222 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2088;
                                int lastIndexOf22 = TextUtils.lastIndexOf(str, '0');
                                int i53022 = (lastIndexOf22 ^ 14) + ((lastIndexOf22 & 14) << 1);
                                Object[] objArr12022 = new Object[1];
                                bravo(longPressTimeout322, maximumFlingVelocity222, i53022, objArr12022);
                                String str6022 = (String) objArr12022[0];
                                int i53122 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                Object[] objArr12122 = new Object[1];
                                bravo((char) ((i53122 ^ 2927) + ((i53122 & 2927) << 1)), 2101 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr12122);
                                String str6122 = (String) objArr12122[0];
                                file = new File(str6022);
                                if (file.exists()) {
                                }
                                i51 = i4;
                                int i537222 = ((~i52922) & i4) | (i52922 & i42);
                                int i538222 = -i537222;
                                int i539222 = ((i537222 & i538222) | (i537222 ^ i538222)) >> 31;
                                int i540222 = i51 & (~i539222);
                                int i541222 = i52922 & i539222;
                                int i542222 = (i541222 & i540222) | (i540222 ^ i541222);
                                int i543222 = -View.MeasureSpec.getMode(0);
                                int bravo11222 = al.bravo();
                                int i544222 = i543222 * 51;
                                int i545222 = (i544222 & (-2910747)) + (i544222 | (-2910747));
                                int i546222 = (i543222 | bravo11222) * (-50);
                                int i547222 = ((i545222 | i546222) << 1) - (i546222 ^ i545222);
                                int i548222 = ~i543222;
                                int i549222 = (i548222 & (-59404)) | (i548222 ^ (-59404));
                                int i550222 = ~((i549222 & bravo11222) | (i549222 ^ bravo11222));
                                int i551222 = ~bravo11222;
                                int i552222 = ~(((-59404) & i551222) | ((-59404) ^ i551222) | i543222);
                                int i553222 = (((i550222 & i552222) | (i550222 ^ i552222)) * 50) + i547222;
                                int i554222 = ~((~bravo11222) | (-59404));
                                int i555222 = ~(((-59404) ^ i543222) | ((-59404) & i543222));
                                int i556222 = ((~((i543222 & i551222) | (i551222 ^ i543222))) | (i554222 & i555222) | (i554222 ^ i555222)) * 50;
                                char c36222 = (char) ((i553222 & i556222) + (i556222 | i553222));
                                int i557222 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int i558222 = ((i557222 | 2109) << 1) - (i557222 ^ 2109);
                                int i559222 = -(Process.myPid() >> 22);
                                int i560222 = ((i559222 | 47) << 1) - (i559222 ^ 47);
                                Object[] objArr123222 = new Object[1];
                                bravo(c36222, i558222, i560222, objArr123222);
                                Object[] objArr124222 = {(String) objArr123222[0]};
                                D88717 = uH18377.D8871(1979478258);
                                if (D88717 == null) {
                                }
                                long longValue18222 = ((Long) ((Method) D88717).invoke(null, objArr124222)).longValue();
                                long j118222 = -1345399979;
                                long j119222 = 367;
                                long j120222 = -366;
                                long j121222 = ((j118222 | longValue18222) * j120222) + (j119222 * longValue18222) + (j119222 * j118222);
                                long j122222 = longValue18222 ^ j30;
                                long tango222 = ao.ad.tango(1981048993);
                                long j123222 = (366 * ((((j118222 ^ j30) | longValue18222) ^ j30) | (((j118222 | j122222) | tango222) ^ j30))) + (j120222 * (j118222 | ((j122222 | tango222) ^ j30))) + j121222 + 2120221285;
                                int myTid3222 = Process.myTid();
                                int i561222 = ~myTid3222;
                                int i562222 = ((int) (j123222 >> c3)) & ((((~(myTid3222 | (-908696687))) | (~(i561222 | (-159392017)))) * 765) + (((~((-908696687) | i561222)) | 369137708) * 1530) + (((~((-369137709) | i561222)) | (~((-539558979) | myTid3222)) | (~((-159392017) | myTid3222))) * 765) + 2102387698);
                                int i563222 = ((int) j123222) & ((((~(i42 | (-536870918))) | (-2130046560)) * 521) + (((~((-536870918) | i4)) * 521) - 321404536));
                                int i564222 = ((i562222 & i563222) | (i562222 ^ i563222)) * 263;
                                int i565222 = (i564222 & i42) | ((~i564222) & i4);
                                int i566222 = ((~i542222) & i4) | (i542222 & i42);
                                int i567222 = -i566222;
                                int i568222 = ((i566222 & i567222) | (i566222 ^ i567222)) >> 31;
                                int i569222 = i565222 & (~i568222);
                                int i570222 = i542222 & i568222;
                                i371 = (i570222 & i569222) | (i569222 ^ i570222);
                                strArr4 = strArr5;
                            } else {
                                i42 = i91;
                                strArr4 = null;
                            }
                            int i796 = ((~i371) & i4) | (i371 & i42);
                            int i797 = -i796;
                            int i798 = (((i796 & i797) | (i796 ^ i797)) >> 31) & 16;
                            Object[] objArr187 = {new int[]{i371}, new int[]{i4}, new int[1], strArr4};
                            int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                            int i799 = ~uptimeMillis3;
                            int i800 = (((~(uptimeMillis3 | 251627503)) | (~(i799 | (-294914))) | (~((-115541027) | uptimeMillis3))) * 192) + (((~((-115835940) | i799)) | 115541026) * (-384)) + ((135791564 | i799) * (-192)) + 2144049361;
                            int i801 = (i800 & i798) + (i800 | i798) + i10;
                            int i802 = i801 << 13;
                            int i803 = (i802 & (~i801)) | ((~i802) & i801);
                            int i804 = i803 ^ (i803 >>> 17);
                            int i805 = i804 << 5;
                            ((int[]) objArr187[2])[0] = (i804 | i805) & (~(i804 & i805));
                            return objArr187;
                        }
                    }
                    i26 = i4;
                    int i2212 = (~(i4 & i217)) & (i4 | i217);
                    int i2222 = (i2212 | (-i2212)) >> 31;
                    int i2232 = (i217 & i2222) | (i26 & (~i2222));
                    int size4 = View.MeasureSpec.getSize(0);
                    int i2242 = 348 - (~TextUtils.getOffsetAfter(str, 0));
                    int i2252 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i2262 = ((i2252 | 18) << 1) - (i2252 ^ 18);
                    Object[] objArr372 = new Object[1];
                    bravo((char) ((size4 & 2450) + (size4 | 2450)), i2242, i2262, objArr372);
                    String str222 = (String) objArr372[0];
                    char c212 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i2272 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                    Object[] objArr382 = new Object[1];
                    bravo(c212, (i2272 ^ 365) + ((i2272 & 365) << 1), 5 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr382);
                    Object[] objArr392 = new Object[i13];
                    objArr392[1] = (String) objArr382[0];
                    objArr392[0] = str222;
                    D88712 = uH18377.D8871(1214576837);
                    if (D88712 == null) {
                    }
                    long longValue62 = ((Long) ((Method) D88712).invoke(null, objArr392)).longValue();
                    long j492 = -309595782;
                    long j502 = 71;
                    long j512 = -69;
                    long j522 = j512 * longValue62;
                    long j532 = -140;
                    long j542 = ((j492 ^ j30) | longValue62) ^ j30;
                    long j552 = i4;
                    long j562 = ((j542 | ((longValue62 | j552) ^ j30)) * j532) + j522 + (j502 * j492);
                    long j572 = 70;
                    j5 = ((((j542 | (((longValue62 ^ j30) | j492) ^ j30)) | ((j492 | j552) ^ j30)) * j572) + (((((j492 | longValue62) | j552) ^ j30) * j572) + j562)) - 1238042556;
                    if (((((int) (j5 >> c3)) & ((((~(920418784 | i4)) | 844640352) * 433) + ((920418784 | (~(1937322100 | i4))) * (-433)) + (((~((-1092681749) | i91)) * 433) - 795245226))) | (((int) j5) & (((1091419110 | (~(1766321775 | i4))) * 272) + ((675431433 | (~((-1766321776) | i4))) * (-272)) + (((~((-1090890343) | i91)) | (~(1766850543 | i4))) * (-272)) + 1747672037))) != 0) {
                    }
                    int i2312 = ((~i2232) & i4) | (i2232 & i91);
                    int i2322 = -i2312;
                    int i2332 = ((i2312 & i2322) | (i2312 ^ i2322)) >> 31;
                    int i2342 = (i2232 & i2332) | (i27 & (~i2332));
                    char c232 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
                    int i2352 = -ImageFormat.getBitsPerPixel(0);
                    int i2362 = (i2352 ^ 371) + ((i2352 & 371) << 1);
                    int i2372 = -Color.alpha(0);
                    Object[] objArr412 = new Object[1];
                    bravo(c232, i2362, (i2372 ^ 23) + ((i2372 & 23) << 1), objArr412);
                    Object[] objArr422 = {(String) objArr412[0]};
                    D88713 = uH18377.D8871(i16);
                    if (D88713 == null) {
                    }
                    String lowerCase2 = ((String) ((Method) D88713).invoke(null, objArr422)).toLowerCase();
                    char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i2392 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 394;
                    int i2402 = -TextUtils.indexOf(str, str);
                    int i2412 = (i2402 & 4) + (i2402 | 4);
                    Object[] objArr442 = new Object[1];
                    bravo(longPressTimeout4, i2392, i2412, objArr442);
                    if (lowerCase2.contains((String) objArr442[0])) {
                    }
                    int i2432 = ((~i2342) & i4) | (i2342 & i91);
                    int i2442 = (i2432 | (-i2432)) >> 31;
                    int i2452 = i242 & (~i2442);
                    int i2462 = i2342 & i2442;
                    i28 = (i2462 & i2452) | (i2452 ^ i2462);
                    char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int i2472 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int i2482 = (i2472 ^ 399) + ((i2472 & 399) << 1);
                    int i2492 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i2502 = ((i2492 | 41) << 1) - (i2492 ^ 41);
                    Object[] objArr452 = new Object[1];
                    bravo(edgeSlop3, i2482, i2502, objArr452);
                    String str232 = (String) objArr452[0];
                    int rgb3 = Color.rgb(0, 0, 0);
                    char c242 = (char) (((rgb3 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) << 1) - (16777216 ^ rgb3));
                    int i2512 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Object[] objArr462 = new Object[1];
                    bravo(c242, (i2512 ^ 441) + ((i2512 & 441) << 1), 39 - (~(-Drawable.resolveOpacity(0, 0))), objArr462);
                    String str242 = (String) objArr462[0];
                    char c252 = (char) (22131 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i2522 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr472 = new Object[1];
                    bravo(c252, ((i2522 | 481) << 1) - (i2522 ^ 481), 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr472);
                    String str252 = (String) objArr472[0];
                    int i2532 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int bravo62 = al.bravo();
                    int i2542 = i2532 * (-183);
                    int i2552 = (i2542 & 6052645) + (i2542 | 6052645);
                    int i2562 = ~i2532;
                    int i2572 = ~((i2562 & 32717) | (i2562 ^ 32717));
                    int i2582 = ~bravo62;
                    int i2592 = -(-((i2572 | (~((i2582 & 32717) | (i2582 ^ 32717)))) * 184));
                    int i2602 = ((i2552 | i2592) << 1) - (i2592 ^ i2552);
                    int i2612 = ~((-32718) | i2532);
                    int i2622 = (i2602 - (~(((i2612 & bravo62) | (bravo62 ^ i2612)) * (-184)))) - 1;
                    int i2632 = ~i2532;
                    int i2642 = ~bravo62;
                    int i2652 = -(-((~((i2632 & i2642) | (i2632 ^ i2642))) * 184));
                    Object[] objArr482 = new Object[1];
                    bravo((char) ((i2622 ^ i2652) + ((i2652 & i2622) << 1)), 509 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), objArr482);
                    String str262 = (String) objArr482[0];
                    Object[] objArr492 = new Object[1];
                    bravo((char) Gravity.getAbsoluteGravity(0, 0), 535 - Gravity.getAbsoluteGravity(0, 0), 26 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16)))), objArr492);
                    String str272 = (String) objArr492[0];
                    int i2662 = -Color.blue(0);
                    int i2672 = ~((-13156) | i2662);
                    int i2682 = ~((i2662 ^ i4) | (i2662 & i4));
                    int i2692 = (((i2672 & i2682) | (i2672 ^ i2682)) * (-814)) + (i2662 * (-813)) + 5367240;
                    int i2702 = ~(((-13156) & i91) | ((-13156) ^ i91));
                    int i2712 = ~i2662;
                    int i2722 = ~((i2712 & 13155) | (i2712 ^ 13155));
                    int i2732 = (i2702 & i2722) | (i2702 ^ i2722);
                    int i2742 = -(-(((i2732 & i2682) | (i2732 ^ i2682)) * HttpConstants.HTTP_PROXY_AUTH));
                    int i2752 = (i2692 & i2742) + (i2742 | i2692);
                    int i2762 = ~(i2712 | i4);
                    int i2772 = (i2762 & i2722) | (i2722 ^ i2762);
                    int i2782 = ~(i4 | 13155);
                    int i2792 = ((i2772 & i2782) | (i2772 ^ i2782)) * HttpConstants.HTTP_PROXY_AUTH;
                    char c262 = (char) (((i2752 | i2792) << 1) - (i2792 ^ i2752));
                    int i2802 = -ExpandableListView.getPackedPositionGroup(0L);
                    int i2812 = (i2802 & 562) + (i2802 | 562);
                    int i2822 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    int i2832 = (i2822 & 27) + (i2822 | 27);
                    i29 = 1;
                    Object[] objArr502 = new Object[1];
                    bravo(c262, i2812, i2832, objArr502);
                    c4 = 0;
                    strArr2 = new String[]{str232, str242, str252, str262, str272, (String) objArr502[0]};
                    i30 = 0;
                    while (true) {
                        if (i30 >= 6) {
                        }
                        int i2852 = (i57 ^ 79) + ((i57 & 79) << 1);
                        i30 = (i2852 & (-78)) + (i2852 | (-78));
                        i28 = i31;
                        strArr2 = strArr13;
                        i29 = 1;
                        c4 = 0;
                    }
                    int i2862 = (~(i4 & i31)) & (i4 | i31);
                    int i2872 = -i2862;
                    int i2882 = ((i2862 & i2872) | (i2862 ^ i2872)) >> 31;
                    int i2892 = i32 & (~i2882);
                    int i2902 = i31 & i2882;
                    int i2912 = (i2892 & i2902) | (i2892 ^ i2902);
                    int scrollBarFadeDuration4 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    Object[] objArr532 = new Object[1];
                    bravo((char) (((scrollBarFadeDuration4 | 2450) << 1) - (scrollBarFadeDuration4 ^ 2450)), Gravity.getAbsoluteGravity(0, 0) + 349, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr532);
                    String str292 = (String) objArr532[0];
                    int i2922 = -(-Color.red(0));
                    int i2932 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i2942 = i2932 * (-500);
                    int i2952 = (i2942 ^ (-295000)) + ((i2942 & (-295000)) << 1);
                    int i2962 = ~(((-591) & i2932) | ((-591) ^ i2932));
                    int i2972 = ~i2932;
                    int i2982 = (i2972 ^ 590) | (i2972 & 590);
                    int i2992 = ~((i2982 & i4) | (i2982 ^ i4));
                    int i3002 = -(-(((i2962 & i2992) | (i2962 ^ i2992)) * HttpConstants.HTTP_NOT_IMPLEMENTED));
                    int i3012 = (i2952 & i3002) + (i2952 | i3002);
                    int i3022 = ~i2932;
                    int i3032 = -(-((~((i3022 ^ (-591)) | (i3022 & (-591)))) * 1002));
                    int i3042 = (i3012 & i3032) + (i3032 | i3012);
                    int i3052 = ~i4;
                    int i3062 = (i3022 & i3052) | (i3022 ^ i3052);
                    int i3072 = i3062 ^ 590;
                    Object[] objArr542 = new Object[1];
                    bravo((char) ((i2922 ^ 27526) + ((i2922 & 27526) << 1)), (i3042 - (~((~((i3062 & 590) | i3072)) * HttpConstants.HTTP_NOT_IMPLEMENTED))) - 1, Drawable.resolveOpacity(0, 0) + 6, objArr542);
                    Object[] objArr552 = {str292, (String) objArr542[0]};
                    D88714 = uH18377.D8871(1214576837);
                    if (D88714 == null) {
                    }
                    long longValue72 = ((Long) ((Method) D88714).invoke(null, objArr552)).longValue();
                    long j582 = -21590991;
                    long j592 = ((-463) * longValue72) + (465 * j582);
                    long j602 = 464;
                    long j612 = longValue72 ^ j30;
                    long j622 = (int) Runtime.getRuntime().totalMemory();
                    long j632 = j622 ^ j30;
                    long j642 = (j612 | j582) ^ j30;
                    long j652 = ((j602 * (j642 | ((j582 | j622) ^ j30))) + (((-464) * ((j622 | (j582 ^ j30)) | j612)) + ((((((j612 | j632) ^ j30) | j642) | ((j632 | j582) ^ j30)) * j602) + j592))) - 1526047347;
                    i33 = ((int) (j652 >> c3)) & ((((~((-1610647617) | i91)) | 173421205 | (~(1973454946 | i4))) * 717) + ((((~((-1610647617) | i4)) | ((~(i91 | 1973454946)) | 173421205)) * 717) - 211874720));
                    i34 = ((int) j652) & ((((~((-675372788) | i4)) | (~((-2112599198) | i91))) * 333) + ((((~((-675372788) | i91)) | (~((-2112599198) | i4))) * 333) - 2118961147));
                    if (((i33 & i34) | (i33 ^ i34)) != 0) {
                    }
                    int i3142 = ((~i2912) & i4) | (i2912 & i91);
                    int i3152 = -i3142;
                    int i3162 = ((i3142 & i3152) | (i3142 ^ i3152)) >> 31;
                    int i3172 = i35 & (~i3162);
                    int i3182 = i2912 & i3162;
                    i36 = (i3182 & i3172) | (i3172 ^ i3182);
                    if ((i5 & 8) == 0) {
                    }
                    char absoluteGravity4 = (char) Gravity.getAbsoluteGravity(0, 0);
                    int i3602 = -(KeyEvent.getMaxKeyCode() >> 16);
                    Object[] objArr662 = new Object[1];
                    bravo(absoluteGravity4, (i3602 ^ 739) + ((i3602 & 739) << 1), 40 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr662);
                    String str332 = (String) objArr662[0];
                    char c292 = (char) ((-2) - (~(-ExpandableListView.getPackedPositionChild(0L))));
                    int i3612 = -Color.blue(0);
                    Object[] objArr672 = new Object[1];
                    bravo(c292, (i3612 ^ 780) + ((i3612 & 780) << 1), 30 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr672);
                    strArr3 = new String[]{str332, (String) objArr672[0]};
                    i37 = 0;
                    while (true) {
                        if (i37 >= 2) {
                        }
                        int i3652 = (i37 ^ (-72)) + ((i37 & (-72)) << 1);
                        i37 = ((i3652 | 73) << 1) - (i3652 ^ 73);
                        i36 = i38;
                        strArr3 = strArr11;
                    }
                    int i3662 = (~(i4 & i38)) & (i4 | i38);
                    int i3672 = -i3662;
                    int i3682 = ((i3662 & i3672) | (i3662 ^ i3672)) >> 31;
                    int i3692 = i39 & (~i3682);
                    int i3702 = i38 & i3682;
                    int i3712 = (i3692 & i3702) | (i3692 ^ i3702);
                    D88715 = uH18377.D8871(-344556366);
                    if (D88715 == null) {
                    }
                    long longValue112 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
                    long j772 = -5393951;
                    long j782 = 829;
                    long j792 = -828;
                    long j802 = j552 ^ j30;
                    long j812 = (((((j772 ^ j30) | (longValue112 ^ j30)) ^ j30) | (((j802 | j772) | longValue112) ^ j30)) * j792) + (j782 * longValue112) + (j782 * j772);
                    long j822 = longValue112 | j772;
                    long j832 = ((828 * (j822 ^ j30)) + ((j792 * (j822 | j802)) + j812)) - 146859147;
                    i40 = ((int) (j832 >> c3)) & ((((~((~((int) SystemClock.elapsedRealtime())) | (-1897101270))) | 285286912) * 983) + ((((~(459874858 | r3)) | (-1897101270)) * (-983)) - 661675792));
                    int freeMemory32 = (int) Runtime.getRuntime().freeMemory();
                    int i3722 = ((~((-1765393432) | freeMemory32)) * 216) + 1620249117;
                    int i3732 = ~freeMemory32;
                    i41 = ((int) j832) & ((((~(i3732 | (-1765393432))) | 328167021) * 216) + (((-17384454) | i3732) * (-216)) + i3722);
                    if (((i40 & i41) | (i40 ^ i41)) != 1) {
                    }
                    int i7962 = ((~i3712) & i4) | (i3712 & i42);
                    int i7972 = -i7962;
                    int i7982 = (((i7962 & i7972) | (i7962 ^ i7972)) >> 31) & 16;
                    Object[] objArr1872 = {new int[]{i3712}, new int[]{i4}, new int[1], strArr4};
                    int uptimeMillis32 = (int) SystemClock.uptimeMillis();
                    int i7992 = ~uptimeMillis32;
                    int i8002 = (((~(uptimeMillis32 | 251627503)) | (~(i7992 | (-294914))) | (~((-115541027) | uptimeMillis32))) * 192) + (((~((-115835940) | i7992)) | 115541026) * (-384)) + ((135791564 | i7992) * (-192)) + 2144049361;
                    int i8012 = (i8002 & i7982) + (i8002 | i7982) + i10;
                    int i8022 = i8012 << 13;
                    int i8032 = (i8022 & (~i8012)) | ((~i8022) & i8012);
                    int i8042 = i8032 ^ (i8032 >>> 17);
                    int i8052 = i8042 << 5;
                    ((int[]) objArr1872[2])[0] = (i8042 | i8052) & (~(i8042 & i8052));
                    return objArr1872;
                }
            }
        }
        i19 = 0;
        int i1622 = -i19;
        int i1632 = ((i19 & i1622) | (i19 ^ i1622)) >> 31;
        int i1642 = (~i1632) & i4;
        int i1652 = i1632 & ((i4 & (-263)) | (i91 & 262));
        int i1662 = (i1652 & i1642) | (i1642 ^ i1652);
        int i1672 = ((~i154) & i4) | (i154 & i91);
        int i1682 = -i1672;
        int i1692 = ((i1672 & i1682) | (i1672 ^ i1682)) >> 31;
        int i1702 = i1662 & (~i1692);
        int i1712 = i154 & i1692;
        i20 = (i1712 & i1702) | (i1702 ^ i1712);
        int i1722 = -(-(ViewConfiguration.getTouchSlop() >> 8));
        int i1732 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 230;
        int i1742 = -(-TextUtils.indexOf(str, str));
        int i1752 = (i1742 ^ 31) + ((i1742 & 31) << 1);
        Object[] objArr292 = new Object[1];
        bravo((char) ((i1722 & 54604) + (i1722 | 54604)), i1732, i1752, objArr292);
        String str192 = (String) objArr292[0];
        int i1762 = -Process.getGidForName(str);
        int bravo32 = al.bravo();
        int i1772 = ~i1762;
        int i1782 = ~((i1772 ^ (-262)) | (i1772 & (-262)));
        int i1792 = ~((-262) | bravo32);
        int i1802 = (((i1782 ^ i1792) | (i1792 & i1782)) * 576) + ((i1762 * (-575)) - 150075);
        int i1812 = ~((i1772 ^ 261) | (i1772 & 261));
        int i1822 = (~bravo32) | (-262);
        int i1832 = ~((i1762 & i1822) | (i1822 ^ i1762));
        int i1842 = ((i1832 & i1812) | (i1812 ^ i1832)) * 576;
        int i1852 = (i1802 & i1842) + (i1842 | i1802);
        int i1862 = (~(i1772 | (-262))) * 576;
        int i1872 = (i1852 & i1862) + (i1862 | i1852);
        int i1882 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        int i1892 = ((i1882 | 22) << 1) - (i1882 ^ 22);
        Object[] objArr302 = new Object[1];
        bravo((char) ((-ImageFormat.getBitsPerPixel(0)) - 1), i1872, i1892, objArr302);
        String str202 = (String) objArr302[0];
        char trimmedLength4 = (char) TextUtils.getTrimmedLength(str);
        int i1902 = -(-Gravity.getAbsoluteGravity(0, 0));
        int i1912 = ((i1902 | 285) << 1) - (i1902 ^ 285);
        int i1922 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i1932 = (i1922 ^ 28) + ((i1922 & 28) << 1);
        Object[] objArr312 = new Object[1];
        bravo(trimmedLength4, i1912, i1932, objArr312);
        String str212 = (String) objArr312[0];
        char c202 = (char) ((-2) - ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) ^ (-1)));
        int keyRepeatTimeout3 = 313 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i1942 = -MotionEvent.axisFromString(str);
        i21 = 1;
        int i1952 = (i1942 ^ 13) + ((i1942 & 13) << 1);
        Object[] objArr322 = new Object[1];
        bravo(c202, keyRepeatTimeout3, i1952, objArr322);
        i22 = 0;
        strArr = new String[]{str192, str202, str212, (String) objArr322[0]};
        i23 = 0;
        while (true) {
            if (i23 < 4) {
            }
            i23++;
            i20 = i24;
            strArr = strArr14;
            i22 = 0;
            i21 = 1;
        }
        int i2122 = i4 ^ i24;
        int i2132 = -i2122;
        int i2142 = ((i2122 & i2132) | (i2122 ^ i2132)) >> 31;
        int i2152 = i25 & (~i2142);
        int i2162 = i2142 & i24;
        int i2172 = (i2152 & i2162) | (i2152 ^ i2162);
        Object[] objArr352 = new Object[1];
        bravo((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 327, 11 - (~(-TextUtils.indexOf((CharSequence) str, '0', 0))), objArr352);
        objArr = new Object[]{(String) objArr352[0]};
        D8871 = uH18377.D8871(i16);
        if (D8871 == null) {
        }
        if (((String) ((Method) D8871).invoke(null, objArr)) != null) {
        }
        i26 = i4;
        int i22122 = (~(i4 & i2172)) & (i4 | i2172);
        int i22222 = (i22122 | (-i22122)) >> 31;
        int i22322 = (i2172 & i22222) | (i26 & (~i22222));
        int size42 = View.MeasureSpec.getSize(0);
        int i22422 = 348 - (~TextUtils.getOffsetAfter(str, 0));
        int i22522 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        int i22622 = ((i22522 | 18) << 1) - (i22522 ^ 18);
        Object[] objArr3722 = new Object[1];
        bravo((char) ((size42 & 2450) + (size42 | 2450)), i22422, i22622, objArr3722);
        String str2222 = (String) objArr3722[0];
        char c2122 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int i22722 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
        Object[] objArr3822 = new Object[1];
        bravo(c2122, (i22722 ^ 365) + ((i22722 & 365) << 1), 5 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr3822);
        Object[] objArr3922 = new Object[i13];
        objArr3922[1] = (String) objArr3822[0];
        objArr3922[0] = str2222;
        D88712 = uH18377.D8871(1214576837);
        if (D88712 == null) {
        }
        long longValue622 = ((Long) ((Method) D88712).invoke(null, objArr3922)).longValue();
        long j4922 = -309595782;
        long j5022 = 71;
        long j5122 = -69;
        long j5222 = j5122 * longValue622;
        long j5322 = -140;
        long j5422 = ((j4922 ^ j30) | longValue622) ^ j30;
        long j5522 = i4;
        long j5622 = ((j5422 | ((longValue622 | j5522) ^ j30)) * j5322) + j5222 + (j5022 * j4922);
        long j5722 = 70;
        j5 = ((((j5422 | (((longValue622 ^ j30) | j4922) ^ j30)) | ((j4922 | j5522) ^ j30)) * j5722) + (((((j4922 | longValue622) | j5522) ^ j30) * j5722) + j5622)) - 1238042556;
        if (((((int) (j5 >> c3)) & ((((~(920418784 | i4)) | 844640352) * 433) + ((920418784 | (~(1937322100 | i4))) * (-433)) + (((~((-1092681749) | i91)) * 433) - 795245226))) | (((int) j5) & (((1091419110 | (~(1766321775 | i4))) * 272) + ((675431433 | (~((-1766321776) | i4))) * (-272)) + (((~((-1090890343) | i91)) | (~(1766850543 | i4))) * (-272)) + 1747672037))) != 0) {
        }
        int i23122 = ((~i22322) & i4) | (i22322 & i91);
        int i23222 = -i23122;
        int i23322 = ((i23122 & i23222) | (i23122 ^ i23222)) >> 31;
        int i23422 = (i22322 & i23322) | (i27 & (~i23322));
        char c2322 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d4 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d4 ? 0 : -1));
        int i23522 = -ImageFormat.getBitsPerPixel(0);
        int i23622 = (i23522 ^ 371) + ((i23522 & 371) << 1);
        int i23722 = -Color.alpha(0);
        Object[] objArr4122 = new Object[1];
        bravo(c2322, i23622, (i23722 ^ 23) + ((i23722 & 23) << 1), objArr4122);
        Object[] objArr4222 = {(String) objArr4122[0]};
        D88713 = uH18377.D8871(i16);
        if (D88713 == null) {
        }
        String lowerCase22 = ((String) ((Method) D88713).invoke(null, objArr4222)).toLowerCase();
        char longPressTimeout42 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
        int i23922 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 394;
        int i24022 = -TextUtils.indexOf(str, str);
        int i24122 = (i24022 & 4) + (i24022 | 4);
        Object[] objArr4422 = new Object[1];
        bravo(longPressTimeout42, i23922, i24122, objArr4422);
        if (lowerCase22.contains((String) objArr4422[0])) {
        }
        int i24322 = ((~i23422) & i4) | (i23422 & i91);
        int i24422 = (i24322 | (-i24322)) >> 31;
        int i24522 = i242 & (~i24422);
        int i24622 = i23422 & i24422;
        i28 = (i24622 & i24522) | (i24522 ^ i24622);
        char edgeSlop32 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
        int i24722 = -(ViewConfiguration.getTouchSlop() >> 8);
        int i24822 = (i24722 ^ 399) + ((i24722 & 399) << 1);
        int i24922 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int i25022 = ((i24922 | 41) << 1) - (i24922 ^ 41);
        Object[] objArr4522 = new Object[1];
        bravo(edgeSlop32, i24822, i25022, objArr4522);
        String str2322 = (String) objArr4522[0];
        int rgb32 = Color.rgb(0, 0, 0);
        char c2422 = (char) (((rgb32 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) << 1) - (16777216 ^ rgb32));
        int i25122 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
        Object[] objArr4622 = new Object[1];
        bravo(c2422, (i25122 ^ 441) + ((i25122 & 441) << 1), 39 - (~(-Drawable.resolveOpacity(0, 0))), objArr4622);
        String str2422 = (String) objArr4622[0];
        char c2522 = (char) (22131 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
        int i25222 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        Object[] objArr4722 = new Object[1];
        bravo(c2522, ((i25222 | 481) << 1) - (i25222 ^ 481), 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4722);
        String str2522 = (String) objArr4722[0];
        int i25322 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        int bravo622 = al.bravo();
        int i25422 = i25322 * (-183);
        int i25522 = (i25422 & 6052645) + (i25422 | 6052645);
        int i25622 = ~i25322;
        int i25722 = ~((i25622 & 32717) | (i25622 ^ 32717));
        int i25822 = ~bravo622;
        int i25922 = -(-((i25722 | (~((i25822 & 32717) | (i25822 ^ 32717)))) * 184));
        int i26022 = ((i25522 | i25922) << 1) - (i25922 ^ i25522);
        int i26122 = ~((-32718) | i25322);
        int i26222 = (i26022 - (~(((i26122 & bravo622) | (bravo622 ^ i26122)) * (-184)))) - 1;
        int i26322 = ~i25322;
        int i26422 = ~bravo622;
        int i26522 = -(-((~((i26322 & i26422) | (i26322 ^ i26422))) * 184));
        Object[] objArr4822 = new Object[1];
        bravo((char) ((i26222 ^ i26522) + ((i26522 & i26222) << 1)), 509 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), objArr4822);
        String str2622 = (String) objArr4822[0];
        Object[] objArr4922 = new Object[1];
        bravo((char) Gravity.getAbsoluteGravity(0, 0), 535 - Gravity.getAbsoluteGravity(0, 0), 26 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16)))), objArr4922);
        String str2722 = (String) objArr4922[0];
        int i26622 = -Color.blue(0);
        int i26722 = ~((-13156) | i26622);
        int i26822 = ~((i26622 ^ i4) | (i26622 & i4));
        int i26922 = (((i26722 & i26822) | (i26722 ^ i26822)) * (-814)) + (i26622 * (-813)) + 5367240;
        int i27022 = ~(((-13156) & i91) | ((-13156) ^ i91));
        int i27122 = ~i26622;
        int i27222 = ~((i27122 & 13155) | (i27122 ^ 13155));
        int i27322 = (i27022 & i27222) | (i27022 ^ i27222);
        int i27422 = -(-(((i27322 & i26822) | (i27322 ^ i26822)) * HttpConstants.HTTP_PROXY_AUTH));
        int i27522 = (i26922 & i27422) + (i27422 | i26922);
        int i27622 = ~(i27122 | i4);
        int i27722 = (i27622 & i27222) | (i27222 ^ i27622);
        int i27822 = ~(i4 | 13155);
        int i27922 = ((i27722 & i27822) | (i27722 ^ i27822)) * HttpConstants.HTTP_PROXY_AUTH;
        char c2622 = (char) (((i27522 | i27922) << 1) - (i27922 ^ i27522));
        int i28022 = -ExpandableListView.getPackedPositionGroup(0L);
        int i28122 = (i28022 & 562) + (i28022 | 562);
        int i28222 = -(-ExpandableListView.getPackedPositionGroup(0L));
        int i28322 = (i28222 & 27) + (i28222 | 27);
        i29 = 1;
        Object[] objArr5022 = new Object[1];
        bravo(c2622, i28122, i28322, objArr5022);
        c4 = 0;
        strArr2 = new String[]{str2322, str2422, str2522, str2622, str2722, (String) objArr5022[0]};
        i30 = 0;
        while (true) {
            if (i30 >= 6) {
            }
            int i28522 = (i57 ^ 79) + ((i57 & 79) << 1);
            i30 = (i28522 & (-78)) + (i28522 | (-78));
            i28 = i31;
            strArr2 = strArr13;
            i29 = 1;
            c4 = 0;
        }
        int i28622 = (~(i4 & i31)) & (i4 | i31);
        int i28722 = -i28622;
        int i28822 = ((i28622 & i28722) | (i28622 ^ i28722)) >> 31;
        int i28922 = i32 & (~i28822);
        int i29022 = i31 & i28822;
        int i29122 = (i28922 & i29022) | (i28922 ^ i29022);
        int scrollBarFadeDuration42 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        Object[] objArr5322 = new Object[1];
        bravo((char) (((scrollBarFadeDuration42 | 2450) << 1) - (scrollBarFadeDuration42 ^ 2450)), Gravity.getAbsoluteGravity(0, 0) + 349, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5322);
        String str2922 = (String) objArr5322[0];
        int i29222 = -(-Color.red(0));
        int i29322 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i29422 = i29322 * (-500);
        int i29522 = (i29422 ^ (-295000)) + ((i29422 & (-295000)) << 1);
        int i29622 = ~(((-591) & i29322) | ((-591) ^ i29322));
        int i29722 = ~i29322;
        int i29822 = (i29722 ^ 590) | (i29722 & 590);
        int i29922 = ~((i29822 & i4) | (i29822 ^ i4));
        int i30022 = -(-(((i29622 & i29922) | (i29622 ^ i29922)) * HttpConstants.HTTP_NOT_IMPLEMENTED));
        int i30122 = (i29522 & i30022) + (i29522 | i30022);
        int i30222 = ~i29322;
        int i30322 = -(-((~((i30222 ^ (-591)) | (i30222 & (-591)))) * 1002));
        int i30422 = (i30122 & i30322) + (i30322 | i30122);
        int i30522 = ~i4;
        int i30622 = (i30222 & i30522) | (i30222 ^ i30522);
        int i30722 = i30622 ^ 590;
        Object[] objArr5422 = new Object[1];
        bravo((char) ((i29222 ^ 27526) + ((i29222 & 27526) << 1)), (i30422 - (~((~((i30622 & 590) | i30722)) * HttpConstants.HTTP_NOT_IMPLEMENTED))) - 1, Drawable.resolveOpacity(0, 0) + 6, objArr5422);
        Object[] objArr5522 = {str2922, (String) objArr5422[0]};
        D88714 = uH18377.D8871(1214576837);
        if (D88714 == null) {
        }
        long longValue722 = ((Long) ((Method) D88714).invoke(null, objArr5522)).longValue();
        long j5822 = -21590991;
        long j5922 = ((-463) * longValue722) + (465 * j5822);
        long j6022 = 464;
        long j6122 = longValue722 ^ j30;
        long j6222 = (int) Runtime.getRuntime().totalMemory();
        long j6322 = j6222 ^ j30;
        long j6422 = (j6122 | j5822) ^ j30;
        long j6522 = ((j6022 * (j6422 | ((j5822 | j6222) ^ j30))) + (((-464) * ((j6222 | (j5822 ^ j30)) | j6122)) + ((((((j6122 | j6322) ^ j30) | j6422) | ((j6322 | j5822) ^ j30)) * j6022) + j5922))) - 1526047347;
        i33 = ((int) (j6522 >> c3)) & ((((~((-1610647617) | i91)) | 173421205 | (~(1973454946 | i4))) * 717) + ((((~((-1610647617) | i4)) | ((~(i91 | 1973454946)) | 173421205)) * 717) - 211874720));
        i34 = ((int) j6522) & ((((~((-675372788) | i4)) | (~((-2112599198) | i91))) * 333) + ((((~((-675372788) | i91)) | (~((-2112599198) | i4))) * 333) - 2118961147));
        if (((i33 & i34) | (i33 ^ i34)) != 0) {
        }
        int i31422 = ((~i29122) & i4) | (i29122 & i91);
        int i31522 = -i31422;
        int i31622 = ((i31422 & i31522) | (i31422 ^ i31522)) >> 31;
        int i31722 = i35 & (~i31622);
        int i31822 = i29122 & i31622;
        i36 = (i31822 & i31722) | (i31722 ^ i31822);
        if ((i5 & 8) == 0) {
        }
        char absoluteGravity42 = (char) Gravity.getAbsoluteGravity(0, 0);
        int i36022 = -(KeyEvent.getMaxKeyCode() >> 16);
        Object[] objArr6622 = new Object[1];
        bravo(absoluteGravity42, (i36022 ^ 739) + ((i36022 & 739) << 1), 40 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr6622);
        String str3322 = (String) objArr6622[0];
        char c2922 = (char) ((-2) - (~(-ExpandableListView.getPackedPositionChild(0L))));
        int i36122 = -Color.blue(0);
        Object[] objArr6722 = new Object[1];
        bravo(c2922, (i36122 ^ 780) + ((i36122 & 780) << 1), 30 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), objArr6722);
        strArr3 = new String[]{str3322, (String) objArr6722[0]};
        i37 = 0;
        while (true) {
            if (i37 >= 2) {
            }
            int i36522 = (i37 ^ (-72)) + ((i37 & (-72)) << 1);
            i37 = ((i36522 | 73) << 1) - (i36522 ^ 73);
            i36 = i38;
            strArr3 = strArr11;
        }
        int i36622 = (~(i4 & i38)) & (i4 | i38);
        int i36722 = -i36622;
        int i36822 = ((i36622 & i36722) | (i36622 ^ i36722)) >> 31;
        int i36922 = i39 & (~i36822);
        int i37022 = i38 & i36822;
        int i37122 = (i36922 & i37022) | (i36922 ^ i37022);
        D88715 = uH18377.D8871(-344556366);
        if (D88715 == null) {
        }
        long longValue1122 = ((Long) ((Method) D88715).invoke(null, null)).longValue();
        long j7722 = -5393951;
        long j7822 = 829;
        long j7922 = -828;
        long j8022 = j5522 ^ j30;
        long j8122 = (((((j7722 ^ j30) | (longValue1122 ^ j30)) ^ j30) | (((j8022 | j7722) | longValue1122) ^ j30)) * j7922) + (j7822 * longValue1122) + (j7822 * j7722);
        long j8222 = longValue1122 | j7722;
        long j8322 = ((828 * (j8222 ^ j30)) + ((j7922 * (j8222 | j8022)) + j8122)) - 146859147;
        i40 = ((int) (j8322 >> c3)) & ((((~((~((int) SystemClock.elapsedRealtime())) | (-1897101270))) | 285286912) * 983) + ((((~(459874858 | r3)) | (-1897101270)) * (-983)) - 661675792));
        int freeMemory322 = (int) Runtime.getRuntime().freeMemory();
        int i37222 = ((~((-1765393432) | freeMemory322)) * 216) + 1620249117;
        int i37322 = ~freeMemory322;
        i41 = ((int) j8322) & ((((~(i37322 | (-1765393432))) | 328167021) * 216) + (((-17384454) | i37322) * (-216)) + i37222);
        if (((i40 & i41) | (i40 ^ i41)) != 1) {
        }
        int i79622 = ((~i37122) & i4) | (i37122 & i42);
        int i79722 = -i79622;
        int i79822 = (((i79622 & i79722) | (i79622 ^ i79722)) >> 31) & 16;
        Object[] objArr18722 = {new int[]{i37122}, new int[]{i4}, new int[1], strArr4};
        int uptimeMillis322 = (int) SystemClock.uptimeMillis();
        int i79922 = ~uptimeMillis322;
        int i80022 = (((~(uptimeMillis322 | 251627503)) | (~(i79922 | (-294914))) | (~((-115541027) | uptimeMillis322))) * 192) + (((~((-115835940) | i79922)) | 115541026) * (-384)) + ((135791564 | i79922) * (-192)) + 2144049361;
        int i80122 = (i80022 & i79822) + (i80022 | i79822) + i10;
        int i80222 = i80122 << 13;
        int i80322 = (i80222 & (~i80122)) | ((~i80222) & i80122);
        int i80422 = i80322 ^ (i80322 >>> 17);
        int i80522 = i80422 << 5;
        ((int[]) objArr18722[2])[0] = (i80422 | i80522) & (~(i80422 & i80522));
        return objArr18722;
    }

    public static void delta() {
        echo = new byte[]{43, -60, 94, -63, 6, -5, 3};
        foxtrot = 63;
    }

    public static void echo() {
        hotel = new byte[]{106, -82, -119, -112};
    }
}
