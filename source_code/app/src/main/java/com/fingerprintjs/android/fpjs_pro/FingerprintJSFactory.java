package com.fingerprintjs.android.fpjs_pro;

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
import ao.ad;
import com.fingerprintjs.android.fpjs_pro_internal.C1211g1;
import com.fingerprintjs.android.fpjs_pro_internal.cy;
import com.fingerprintjs.android.fpjs_pro_internal.fO27287;
import com.fingerprintjs.android.fpjs_pro_internal.uH18377;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;
import kotlin.Metadata;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/FingerprintJSFactory;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintJSFactory {
    public static final char[] bravo;
    public static final long charlie;
    public static int delta;
    public static int echo;
    public static final byte[] foxtrot = null;
    public static final byte[] golf = null;
    public final fO27287 alpha;

    static {
        echo();
        delta();
        delta = 0;
        echo = 1;
        char[] cArr = new char[2156];
        ByteBuffer.wrap("¢Î°#\u0087È\u0095eèVÿ¸Íj \u00077µ\u0005Q\u0018ôo°}APÐ§\u0094µ?\u0088å\u009f\u0095í(ÀÀÖj% 8Ö\u000e{\u001d\u0010p´FX\u007f\nmçZ\fH¡5\u0092\"|\u0010®ýÃêqØ\u0095Å0²t \u0085\u008d\u0014zAhöU5BF0Ö\u001d\u0013\u000b\u00adøÉå\u0002Ó»ÀÑ\u0001Ö\u0013;$Ð6}KN\\ nr\u0083\u001f\u0094\u00ad¦I»ìÌ¨ÞYóÈ\u0004\u009e\u0016:+÷<\u009c\u007f\nmðZ\u0010H¤5\u0092\"v\u0010®ýËê`Ø\u009fÅ<²( \u008a\u008d$z]hûU#BJ0ú\u001d\u001f\u000b\u0082øÙå\u0000Ó»ÀÁ\u00adv\u009b\u008b\u0088Þ\u007f\nmæZ\u001dH´5\u0092\"\u007f\u0010¦ý\u0081êeØ\u0081Å6²wdÎv\"AÙSp.V9¬\u000blæ\u0006ñÿÃGÞï©¬»Yn\u0010|êK\u0017Y®$Æ3s\u0001¿ì\u009aû]É¯Ô\u000e£r±\u0081\u009c4koyäD+SX\u0019]\u000b°<_.ôS\u008bDcv¸\u009b\u009b\u008c2¾Ñ£gÔ>ÆÜës\u007fWmìZGHµ5Ò\"t\u0010µý\u0081êgØ\u0096Å=²u \u0082\u008d\"zUhÀU+BF0ý\u001d(\u000b¹øÕå\u0012Óþ\u007fWmìZGHµ5Ò\"t\u0010µý\u0081êgØ\u0096Å=²u \u0082\u008d\"zUhÀU+BF0ý\u001d(\u000b¹øÕå\u0012Óýîgü\u009dË}ÙÉ¤¤³\u0013\u0081Álí{\u0014I÷TV#E1ì\u001cOë>ù\u009cÄJÓ`¡\u0097\u008cu\u007fGmêZ\u000eH¹5Ò\"c\u007f\nmðZ\u0010H¤5É\"~\u0010¬ý\u0080êwØ\u009aÅ7²( \u0083\u008d.z\\hêU\u0013Bn0¤\u001d\u0019\u000b¸øÖå\u0014ÓâÀÖ\u00ad|\u009b\u0097\u0088Óu\u007fc\u0084P=\u007f\nmðZ\u0010H¤5É\"~\u0010¬ý\u0080êwØ\u009aÅ7²( \u0083\u008d.z\\hêU\u0013Bn0¤\u001d\u0007\u000b¯øÔå\u0011N\u0089\\sk\u0093y'\u0004J\u0013ý!/Ì\u0003Ûúé\u0019ô¸\u0083«\u0091\u0002¼¡KÐYrd£sÍ\u0001\u007f,¢:\u0013ÉHÔ\u0090â#ñF\u009c¾ª\t¹Kh*zÇM,_\u0081\"²5U\u0007\u0084êâý@Ï´Ò\f¥B·¾\u009a\u001fi-{\u0096L=^Ï#²4\b\u0006×ë±üAÎáÓL¤\u000e¶ã\u0087²\u0095\u001f¢ñ°]Í!ÚÌèV\u00053\u0012\u0098a\u0000sùD\u0011V²+Ô<>\u000e\u00adãÌôsÆ\u009cÛ ¬t¾\u0094\u00935d^vøK<z¦h\u000b_éMO0#'\u0090\u007fWmìZGH§5Ï\"t\u0010¥ýÚêvØ\u0087Åw²j \u008c\u008d%zDhùU$B@0ý\u001d\u0002\u000b¯øÞå\u0013\u007fBmæZ\u0007H®)Ë;x\f\u0085\u001e:cJtöF+«\u001f¼ø\u008e\u0014\u0093´ä·ö\u0011Û±,\u0081>e\u0003¾\u0014ßfbK\u008e]m®B³\u008f\u0085$\u0096\u0005ûëÍ\u0006ÞR#ö5*\u0006¨kÑ}\u000eN\u0082SÅ¥l¶\u008d\u0098!ízþ\u0083À.Õ_\u001f)\r\u009a:g(ØU¨B\u0014pÉ\u009dý\u008a\u001a¸ö¥VÒUÀóíS\u001ac\b\u00875\\\"=P\u0080}lk\u008f\u0098 \u0085m³Æ çÍ\tûäè°\u0015\u0014\u0003È0J]3Kìx`e#\u0093\u008e\u0080o®ÃÛ\u0092ÈaBâPQg¬u\u0013\bc\u001fß-\u0002À6×Ñå=ø\u009d\u008f\u009e\u009d8°\u0098G¨ULh\u0097\u007fö\rK §6DÅ~Ø¹îVýa\u0090Õ¦'ÎeÜÖë+ù\u0094\u0084ä\u0093X¡\u0085L±[Viºt\u001a\u0003\u0019\u0011¿<\u001fË/ÙËä\u0010óq\u0081Ì¬ ºÃIùT>bÑqé\u001cB*ªæJôùÃ\u0004Ñ»¬Ë»w\u0089ªd\u009esyA\u0095\\5+69\u0090\u00140ã\u0000ñäÌ?Û^©ã\u0084\u000f\u0092ìaÖ|\u0011JþYÇ4o\u0002\u0085\u007fUmæZ\u001bH¤5Ô\"h\u0010µý\u0081êfØ\u008aÅ*²) \u008f\u008d/z\u001fhûU BA0ü\u001d\u0010\u000bóøÉå\u000eÓáÀØ\u00ad}\u009b\u009a±8£\u008a\u0094m\u0086Äû¥ì\u0016\u007fymÂ\u007f\nmóZ\u001bH¸5Þ\"4\u0010¬ýÀêqØ\u0086Å5²b \u009e\u007fSmáZ\u0006H¯5Ú\"n\u0010¤ýÜêam\u0099\u007fcH\u0083Z7'Z0í\u0002?ï\u0013øàÊ\u0012×« ù²\u001b\u009f¯hÍz~G½P\u009f\"m\u000f\u008d\u0019 êL÷\u009dÁ+ÒU¿\u00ad\u0089\u0019\u009aMgíq\fB§/Á9)\n£\u0017ßávò\u0098Ü-©`ºÒ\u0084,\u0091Abø÷Èå7ÒÎÀ{½\u001bª¶\u0098quBb»PXMù:ó(\u001b\u0005¦ò\u009bà*Ý¨Ê\u0080¸>\u0095Ñ\u0083vp\u0016m\u008d[}H\u0005%¸\u0013V\u0000\u0004ý½ëPØ½µ\u008a£N\u0090ï\u008d\u008f{:hÈFj3m Þ\u001ex\u007f\nmõZ\fH¹5Ù\"t\u0010³ý\u0080êyØ\u009aÅ;²1 Ù\u008ddzYhèUjBK0þ\u001d\u0014\u000b²øÖå\u0011Ó ÀÆ\u00adv\u009b\u008b\u0088\u0089uzc\u0082P?=[+\u008a\u00184\u0005Zó¹à\u000eÎ´\u007f\nmðZ\u0010H¤5É\"~\u0010¬ý\u0080êyØ\u009aÅ;²1 Ù\u008ddzRhóU*BV0í\u001d(\u000b¼øÒå\u0005Ó£Àê\u00adz\u009b\u0097\u0088Óuhc\u0099P7=^+\u0086\u0018&\u0005\u0004óôà\rÎ«»¯¨\u001c\u0096ºló~\u001fIä[M&k1\u008b\u0003Vî?ù\u0098Ë%ÖÉ¡\u0090³}\u009eÆiæ{\u0005FÐQµ#\u0005\u000eê\u0018Wë'öêÀ@Ó%¾\u0089\u0088e\u009bpf\u0086pqú'è£ßBÍë°\u0095§1\u0095ðx\u0083o?]Øé©û\u0014ÌûÞ@£+´\u0095\u0086V\u007fFmëZ\u001bH¸5Ð\"r\u0010´ýÂ\u007fWmìZGH§5Ï\"t\u0010¥ýÚêvØ\u0087Åw²c \u0088\u008d=zXhüU «¶¹\u0004\u008eã\u009cJá`öÈÄT\u007fBmæZ\u0007H²5Ï\"r\u0010¢ó>á\u009aÖ{ÄÎ¹³®\u000e\u009cÞq\u008cf\u0011T·I\u0013\u0018Q\nõ=\u0014/¡RÜEaw±\u009aã\u008d~¿Ø¢|ÕKÇÈêl\u007fWmìZGH§5Ï\"t\u0010¥ýÚêvØ\u0087Åw²j \u0082\u008d/zThó\u0006d\u0014Õ#00Ñ\"\u007f\u0015\u008d\u0007*zMmþ_?²L\u007fdmóZ\u0019H÷5ï\"n\u0010¯ýÛê|Ø\u009eÅ<²' \u008b\u008d$zCh¿U\u0006BK0û\u001d\u0018\u000b°øÞ\u007fdmíZ\rH¥5Ò\"r\u0010¥ý\u008fêFØ·Å\u0012²' \u008f\u008d>zXhóU1B\u00030ï\u001d\u0018\u000b¯ø\u009bå\u0019Ó÷À\u0083\u0091Ë\u0083B´¢¦\nÛ}ÌÝþ\n\u0013 \u0004é6\u0018+½\\\u0088N c\u0091\u0094÷\u0086\\»\u009e¬¬Þ@ó·å\u0000\u00164\u000b¶=X.,Cãu`f<\u007fWmìZGH¿5Ü\"i\u0010¥ýØêtØ\u0081Å<\u007fBmìZ\u0005H³5Û\"r\u0010²ýÇ,\u0017>¥\tB\u001bëfÁqi\u0003ý\u0011H&\u00ad4\u001eI\u007f^Ä\u007fWmìZGH§5Ï\"t\u0010¥ýÚêvØ\u0087Åw²e \u009f\u008d*z_hû\fæ\u001e])ö;\rFiQØc\u001e\u008e{\u0099È«l¶\u0099ÁÓÓ1þ\u008f\u007f\u0014\u007fWmìZGH¤5Ø\"x\u0010´ýÝêp\u007f\u0015\u007fWmìZGHµ5È\"r\u0010\u00adýËê;Ø\u0083Å+²h \u0089\u008d>zRhë¡q³Ä\u00847\u0096\u0089ëÐüQÎË#«\u007fWmìZGHµ5È\"r\u0010\u00adýËê;Ø\u0095Å0²i \u008a\u008d.zChïU7BJ0ç\u001d\u0003\u007fBmæZ\u0007H²5Ï\"r\u0010¢ý\u0080êfØ\u0097Å2²( \u008a\u008d.z_húU7BJ0êýÔïpØ\u0091Ê$·Y ä\u00924\u007ffhûZ]Gù0¾\"\b\u000f¹øÌêV×«À\u008d²)\u009fÎ\u0089,zHg\u0099Q<BQ/ì\u0019\f\nn÷ãáEÒñ\u007fBmæZ\u0007H²5Ï\"r\u0010¢ý\u0080êrØ\u009cÅ6²` \u0081\u008d.znhìU!BH0¦\u001d\u0010\u000b¸øÕå\u0004Ó½ÀÜ\u00adp2e Á\u0017 \u0005\u0095xèoU]\u0085°§§D\u0095¶\u0088\u0011ÿXíòÀZ7f%\u0097\u0018\u0014\u000ff}ÁP(FÂµª¨6\u007fBmìZ\u0006H°5Ñ\"~\u0010îýÜêqØ\u0098Å\u0006²` \u009d\u008d#z^hñU B|0ñ\u001dO\u000bëø\u0094å\u0006ÓªÀÛ\u00adv\u009b\u008b\u0088Îunc´P)=\u0007+Ó¼Q®ê\u0099A\u008b³öÔárÓ³>Å)|\u001b\u0094\u0006;qdc\u0099¡\u0018³£\u0084\b\u0096úë\u009dü;Îú#\u008947\u0006Ý\u001bql-~\u008cSf¤\u000b¶¹\u008bf\u009c\bîèÃ^Õû&\u009a;I\rå\u001e\u0088s,EÄV\u0081«,½Ð\u009c©\u008e ¹À«hÖ\u001fÁ¿óh\u001eO\t ;\u0006&¢ª:¸\u0081\u008f*\u009dØà¥÷\u001fÅÀ(¦?V\rú\u0010]g\u0019uðXJ¯=½\u008b\u0080\u0006\u0097'å\u0080\u007fQmæZ\u001aH£5\u0090\u0004o\u0016Î!#3\u0080N°YKk\u0094\u0086ï\u0091\u0018£¡¾\u001fÉIÛ»öE\u0001b\u0013Î.\t9pKÙ\u007fTmæZ\u0004H¢5\u0093\"s\u0010¶ý\u0081êxØ\u0092Å0²i \u0086\u008d.zHhì\u007fTmæZ\u0004H¢5\u0093\"h\u0010§ý\u0081êsØ\u0092Å2²b ²\u008d(zPhòU BQ0è¿ò\u00ad@\u009a¢\u0088\u0004õ5âÎÐ\u0001='*ß\u00186\u0005\u009brþ`/M\u0088ºù¨J\u0095\u008a\u0082ñðV\u007fWmìZGH¼5Ø\"i\u0010¯ýÊêyØÝÅ8²i \u0089\u008d9z^höU!B\r0ø\u001d\u0012\u000b°øÎå\u0005\u007fWmìZGHµ5Ò\"t\u0010µý\u0081êdØ\u0096Å4²r Ã\u008d*zGhûU\u001aBM0è\u001d\u001a\u000b¸Þ\u008aÌ1û\u009aée\u0094\u0004\u0083«±2\\\u0010K½yGdè\u0013¾\u0001\u001e,ðÛ\u0085É,ôÿã\u009b\u0091&¼ÚªrY\u000fDÒrf\u007fWmìZGH§5Ï\"t\u0010¥ýÚêvØ\u0087Åw²e \u0098\u008d\"z]hûUkBE0à\u001d\u0019\u000bºøÞå\u0013Ó¿ÀÇ\u00adz\u009b\u0097\u0088Ó\u008aY\u0098â¯I½ªÀÊ×få»\bÄ\u001fv-Ó05G|U\u008ax)\u008f[\u009d¿ -·DÅéè\u001eþ¶\rÇ\u0010\u001f&³5ÒXsn\u0083©\u001e»¥\u008c\u000e\u009eíã\u008dô!Æü+\u0083<1\u000eå\u0013ud6vÐ[,¬\u001a¾£\u0083e\u0094\u0006æ¤Ë\u0010Ýò.\u009b3F\u0005á\u0016\u0099{(MÀ^\u009c£-µÌ\u0086l\u0094¼\u0086\u0007±¬£JÞ3É\u009eûN\u0016+\u0001\u008c36.ÐY\u0099KofÌ\u0091¾\u0083Z¾È©¡Û\föûàS\u0013\"\u000eú8V+7F\u0096pfN[\\àkKy\u00ad\u0004Ô\u0013y!©ÌÌÛké ô1\u0083g\u0091\u008a¼*K\u0013Yñd<sF\u0001é,\u001f:ÿÉÑÔ\u0004â\u00adñÞ\u009czª\u0087¹ÛDsR\u008ea3\fG\u007f\rÕ»Ç\u0011\u007f\u001f\u007f\f\u007f\nmçZ\fH¡5\u0092\"j\u0010¤ýÂê`Ø¬Å)²n \u009d\u008d.ÐÒÂ?õÔçy\u009aJ\u008d°¿vR\u0014E¦wNjõ\u001dð\u000fW\"òÕ\u009aÇ\"úÿí\u009a\u009f?²Ë¤ZW\u0004JÜ|yo\u0014\u0002¯\u007f\nmçZ\fH¡5\u0092\"h\u0010®ýÌê~Ø\u0096Å-²( \u008a\u008d.z_hæU!\u0094Ð\u0086=±Ö£{ÞHÉ²ût\u0016\u0016\u0001¤3L.÷YòKFfô\u0091\u0086\u00830¾û\u007f\nmðZ\u0010H¤5\u0092\"j\u0010¤ýÂê`Ø¬Å-²u \u008c\u008d(zTÎ8ÜÂë\"ù\u0096\u0084û\u0093L¡\u009eL²[Ki¨t\t\u0003\u001a\u0011³<\u0010ËaÙÎä(ó|\u0081Ú¬)º\u0083IæT0b¢qã\u001cD*©9àÄXÒ\u0086á\u0012\u008ch\u009aº©\u0004´5BÖQ \u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêJØ\u0094Å)²t\u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêJØ\u0087Å0²j \u0088\u007f\nmçZ\fH¡5\u0092\"h\u0010®ýÌê~Ø\u0096Å-²( \u008f\u008d8zEhùU*BO0í\u001d\u0012\u000b¯øß£\u0011±ë\u0086\u000b\u0094¿éÒþeÌ·!\u009b6b\u0004\u0081\u0019 n3|\u009aQ9¦H´æ\u0089-\u009eLìôÁ\u0003×ª$Ä9\u001f\u000f¦\u001cñqbG\u008cTÕ©8¿\u0083\u008c%\u0011Ë\u0003&4Í&`[SL¸~s\u0093\u001a\u0084µ¶Q«ûÜ£5\u0018'õ\u0010\u001e\u0002³\u007f\u0080hkZ ·É `\u0092\u0098\u008f9øz\u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêxØ\u0096Å>²i\u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêzØ\u0081Å0²b\u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêcØ\u009eÅ*²`\u007f\nmçZ\fH¡5\u0092\"y\u0010²ýÛêeØ\u0094Å8²n \u009d\u008d(¿\f\u00adá\u009a\n\u0088§õ\u0094â\u007fÐ´=Ý*L\u0018\u009c\u00052rd¯Ò½?\u008aÐ\u0098{å\u0004òìÀ}-\u0018:º\bE\u0015íb°pT]÷ª\u009a¸h\u0085³\u0092\u0083à3Í\u0080Ûg(\u00105Í\u0003|\u007f\nmîZ\u0007H£5\u0092\"l\u0010¨ýÁêqØ\u009cÅ.²t Â\u008d\tzBhëU\u0016BK0è\u001d\u0005\u000b¸øßå'Ó ÀÙ\u00adw\u009b\u009c\u0088Õ\u007f\nmóZ\u001bH¸5Þ\"4\u0010¨ýÀêeØ\u009cÅ+²s \u009e\u008dù\u009f\t¨ãº\u001bÇk\u007f\nmóZ\u001bH¸5Þ\"4\u0010²ýÊêyØ\u0095Åv²j \u008c\u008d;zB\u007fBmñZ\bH»5Ñ\"t\u0010¢ý\u0081êrØ\u009cÅ5²c \u008b\u008d\"zBh÷UkBP0æRÂ@aw\u0080e\u001b\u0018z\u000fÕ=\u0019Ð{Çüõ\u000bè¦\u009f¢\u008d\u0015 ¯ç\u0005õéÂ\u0012Ð»\u00ad\u009dºy\u0088«eÄrs@\u009d]\t*k8\u008d\u0015 â[ðóÍ9Ú\u0002¨þ\u0085\u0015\u0093¾\u009eH\u008cà»\u0013©½ÔÁÃ`ñ¯\u001cÃ\u000bq9\u008f\u007f\nmæZ\u001dH´5\u0092\"v\u0010®ýÚê{Ø\u0087Å*\nº\u0018W/¸=\u0013@lW\u0084e\u0015\u0088p\u009fÒ\u00ad-°\u0085ÇØÕ<ø\u009f\u000fò\u001d\u0000 Û7÷EIhè~\f\u008d{\u0090¡¦\fµ+ØÛî$ý{É\u0001Ûøì\u0010þ³\u0083Õ\u0094?¦©KÔ\\kn\u0091s<\u0004j\u0016\u0089\u007fbmìZ\u0005H³5Û\"r\u0010²ýÇ\u007f\nmçZ\bH£5Ü\"4\u0010¬ýÆêfØ\u0090Åv²w \u009f\u008d$zWhöU)BF0ú\u001dX\u000b¾øÎå\u0013ÓàÀ\u0085\u00ad<\u009b\u009a\u0088Èu`cÅP<=V+\u0086\u00181\u0005Fóáà\u0014Î©»õ¨A\u0096¸\u0083Öpt^²KÄ8f&\u0094".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
        bravo = cArr;
        charlie = 8283849611639352707L;
    }

    public FingerprintJSFactory(Context context) {
        this.alpha = new fO27287(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, short s3, byte b4) {
        int i4;
        int i5;
        int i10 = 1 - (s3 * 3);
        int i11 = 106 - b2;
        int i12 = 3 - (b4 * 4);
        byte[] bArr = new byte[i10];
        byte[] bArr2 = golf;
        if (bArr2 == null) {
            int i13 = i11;
            i11 = i10;
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(char c3, int i4, int i5, Object[] objArr) {
        Throwable cause;
        int i10;
        int i11;
        int i12;
        int i13;
        long j5;
        int i14 = 1;
        cy cyVar = new cy();
        long[] jArr = new long[i5];
        cyVar.component5 = 0;
        while (true) {
            int i15 = cyVar.component5;
            if (i15 >= i5) {
                break;
            }
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[0] = Integer.valueOf(bravo[i4 + i15]);
                Object D8871 = uH18377.D8871(-31669226);
                Class cls = Integer.TYPE;
                if (D8871 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 2123;
                    i10 = 359345605;
                    char green = (char) Color.green(0);
                    byte b2 = (byte) 0;
                    i11 = 2;
                    byte b4 = b2;
                    i12 = 3;
                    String alpha = alpha(b2, b4, b4);
                    Class[] clsArr = new Class[i14];
                    clsArr[0] = cls;
                    D8871 = uH18377.setPivotYN16904(minimumFlingVelocity, resolveOpacity, green, 564618947, false, alpha, clsArr);
                } else {
                    i10 = 359345605;
                    i11 = 2;
                    i12 = 3;
                }
                Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                l10.getClass();
                long j6 = i15;
                long j7 = charlie;
                Object[] objArr3 = new Object[4];
                objArr3[i12] = Integer.valueOf(c3);
                objArr3[i11] = Long.valueOf(j7);
                objArr3[i14] = Long.valueOf(j6);
                objArr3[0] = l10;
                Object D88712 = uH18377.D8871(-897540670);
                if (D88712 == null) {
                    int rgb = Color.rgb(0, 0, 0) + 16777267;
                    int trimmedLength = TextUtils.getTrimmedLength("") + 2796;
                    char c4 = (char) (32780 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    i13 = i14;
                    byte b6 = (byte) i12;
                    j5 = 0;
                    byte b10 = (byte) (b6 - 3);
                    String alpha2 = alpha(b6, b10, b10);
                    Class[] clsArr2 = new Class[4];
                    Class cls2 = Long.TYPE;
                    clsArr2[0] = cls2;
                    clsArr2[i13] = cls2;
                    clsArr2[i11] = cls2;
                    clsArr2[3] = cls;
                    D88712 = uH18377.setPivotYN16904(rgb, trimmedLength, c4, 356204311, false, alpha2, clsArr2);
                } else {
                    i13 = i14;
                    j5 = 0;
                }
                jArr[i15] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                Object[] objArr4 = new Object[i11];
                objArr4[i13] = cyVar;
                objArr4[0] = cyVar;
                Object D88713 = uH18377.D8871(i10);
                if (D88713 == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j5) + 53;
                    int i16 = 2175 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    byte b11 = (byte) 2;
                    byte b12 = (byte) (b11 - 2);
                    String alpha3 = alpha(b11, b12, b12);
                    Class[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    clsArr3[i13] = Object.class;
                    D88713 = uH18377.setPivotYN16904(packedPositionChild, i16, lastIndexOf, -892301552, false, alpha3, clsArr3);
                }
                ((Method) D88713).invoke(null, objArr4);
                i14 = i13;
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
        int i17 = i14;
        char[] cArr = new char[i5];
        cyVar.component5 = 0;
        while (true) {
            int i18 = cyVar.component5;
            if (i18 < i5) {
                cArr[i18] = (char) jArr[i18];
                Object[] objArr5 = new Object[2];
                objArr5[i17] = cyVar;
                objArr5[0] = cyVar;
                Object D88714 = uH18377.D8871(359345605);
                if (D88714 == null) {
                    int indexOf = TextUtils.indexOf("", "") + 52;
                    int longPressTimeout = 2175 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char indexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b13 = (byte) 2;
                    byte b14 = (byte) (b13 - 2);
                    String alpha4 = alpha(b13, b14, b14);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[0] = Object.class;
                    clsArr4[i17] = Object.class;
                    D88714 = uH18377.setPivotYN16904(indexOf, longPressTimeout, indexOf2, -892301552, false, alpha4, clsArr4);
                }
                ((Method) D88714).invoke(null, objArr5);
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(int i4, short s3, short s9, Object[] objArr) {
        int i5;
        int i10;
        int i11 = s9 + 97;
        int i12 = 7 - (s3 * 3);
        int i13 = i4 * 3;
        byte[] bArr = new byte[4 - i13];
        int i14 = 3 - i13;
        byte[] bArr2 = foxtrot;
        if (bArr2 == null) {
            i11 = i14;
            int i15 = i12;
            i5 = 0;
            int i16 = i12;
            i11 = i11 + (-i15) + 6;
            i10 = i16 + 1;
            bArr[i5] = (byte) i11;
            if (i5 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i5++;
            i15 = bArr2[i10];
            i16 = i10;
            i11 = i11 + (-i15) + 6;
            i10 = i16 + 1;
            bArr[i5] = (byte) i11;
            if (i5 == i14) {
            }
        } else {
            i5 = 0;
            i10 = i12;
            bArr[i5] = (byte) i11;
            if (i5 == i14) {
            }
        }
    }

    public static void delta() {
        foxtrot = new byte[]{40, 51, 123, -41, -6, 5, -3};
    }

    public static void echo() {
        golf = new byte[]{46, -61, 83, 91};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:152|(1:154)|155|156|(1:158)(1:363)|159|160|(1:162)|163|(5:165|(1:167)|168|169|(22:171|172|173|(1:175)|176|(3:178|(1:180)(1:311)|181)(5:312|313|(1:315)|316|317)|182|(2:184|(2:186|(18:188|(7:190|191|(1:193)|194|195|(1:305)(3:197|(6:199|200|(1:202)|203|204|(1:206)(1:302))(1:304)|303)|207)|306|307|208|209|210|(2:211|(4:213|(6:215|(11:223|224|225|226|227|228|229|230|(2:232|233)(1:291)|234|(3:236|237|(1:239)(1:289))(2:290|220))|217|218|219|220)|298|299)(2:300|301))|240|241|242|(7:244|(4:246|247|248|249)(1:285)|251|252|(2:254|(4:256|257|258|259)(1:279))(1:280)|260|(2:262|(7:264|265|266|267|(1:269)|270|271)))|287|266|267|(0)|270|271))(2:308|309))|310|209|210|(3:211|(0)(0)|299)|240|241|242|(0)|287|266|267|(0)|270|271))|318|(11:321|322|(1:324)(1:356)|325|326|(7:330|(3:332|(1:(1:342)(2:334|(3:337|338|(1:341)(0))(1:336)))|340)|343|(2:345|(1:347)(1:351))(1:352)|348|349|350)|353|354|355|350|319)|357|358|(1:360)(1:362)|361|172|173|(0)|176|(0)(0)|182|(0)|310|209|210|(3:211|(0)(0)|299)|240|241|242|(0)|287|266|267|(0)|270|271) */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x35df, code lost:
    
        if (r7.isFile() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x35e8, code lost:
    
        if (r7.isFile() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x367b, code lost:
    
        r2 = r74 & (-152);
        r3 = r10 & 151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0688, code lost:
    
        if (r1 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x068b, code lost:
    
        if (r1 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x119b A[Catch: IOException -> 0x11b2, TryCatch #4 {IOException -> 0x11b2, blocks: (B:108:0x115f, B:110:0x119b, B:111:0x11a1), top: B:107:0x115f }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x129c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1564  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x168a A[Catch: all -> 0x383d, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x1792 A[Catch: all -> 0x383d, TRY_ENTER, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x29f5 A[Catch: all -> 0x383d, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x2a3b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x2b72  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x3471  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x35c2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x36c3 A[Catch: all -> 0x383d, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x355b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x2a53  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x37b1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1670 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x14d3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x11a0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x1265 A[Catch: IOException -> 0x127e, TRY_LEAVE, TryCatch #7 {IOException -> 0x127e, blocks: (B:381:0x121f, B:383:0x1265, B:385:0x1273), top: B:380:0x121f }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x127c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x1281  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x1287  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1272  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0cc7 A[Catch: all -> 0x383d, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0e03 A[Catch: all -> 0x383d, TryCatch #8 {all -> 0x383d, blocks: (B:6:0x00f5, B:8:0x0102, B:9:0x0147, B:19:0x02f3, B:21:0x0300, B:22:0x033a, B:29:0x0426, B:31:0x0433, B:32:0x0473, B:37:0x06a7, B:39:0x06ad, B:40:0x06eb, B:42:0x083a, B:44:0x0849, B:45:0x0890, B:50:0x0a5b, B:52:0x0a68, B:53:0x0ab3, B:60:0x0ba9, B:62:0x0bb3, B:63:0x0bf2, B:69:0x0cb8, B:71:0x0cc7, B:72:0x0d0a, B:80:0x0df9, B:82:0x0e03, B:83:0x0e43, B:402:0x0fe1, B:404:0x0fec, B:405:0x102d, B:92:0x103a, B:94:0x1045, B:95:0x1091, B:120:0x1371, B:122:0x137e, B:123:0x13c4, B:136:0x1566, B:138:0x1573, B:139:0x15ba, B:146:0x1684, B:148:0x168a, B:149:0x16c4, B:152:0x1792, B:154:0x17a4, B:155:0x17e3, B:160:0x18ca, B:162:0x18d4, B:163:0x1913, B:165:0x191c, B:167:0x1935, B:168:0x197b, B:173:0x29eb, B:175:0x29f5, B:176:0x2a32, B:191:0x2faa, B:193:0x2fb7, B:194:0x2fef, B:200:0x30da, B:202:0x30e8, B:203:0x3123, B:267:0x36b6, B:269:0x36c3, B:270:0x36fc, B:313:0x2a54, B:315:0x2a6c, B:316:0x2ab2, B:322:0x270f, B:324:0x2719, B:325:0x276d, B:418:0x0594, B:420:0x059e, B:421:0x05d9, B:427:0x061f, B:429:0x0629, B:430:0x0667), top: B:5:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0fcd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] setPivotYN16904(Context context, int i4, int i5, int i10) {
        Class<String> cls;
        int i11;
        int i12;
        char c3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Object D8871;
        long j6;
        int i24;
        int i25;
        int i26;
        Object D88712;
        int i27;
        int i28;
        int i29;
        char c4;
        int i30;
        String str;
        File file;
        String str2;
        File file2;
        boolean z2;
        int i31;
        Scanner useDelimiter;
        String str3;
        int i32;
        int i33;
        char c10;
        String[] strArr;
        int i34;
        int i35;
        int i36;
        Object D88713;
        long j7;
        int i37;
        int myUid;
        int i38;
        int i39;
        int i40;
        String[] strArr2;
        long j10;
        int i41;
        Class<String> cls2;
        int i42;
        String[] strArr3;
        int i43;
        int i44;
        int i45;
        Class<String> cls3;
        int i46;
        Object D88714;
        Object invoke;
        int i47;
        int i48;
        int i49;
        char c11;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        Object D88715;
        File file3;
        String str4;
        int i56;
        String[] strArr4;
        String str5;
        int i57;
        String[] strArr5;
        int i58;
        int i59;
        String[] strArr6;
        String next;
        String[] strArr7;
        int i60;
        int i61;
        String[] strArr8;
        int i62 = 24;
        int i63 = 0;
        int i64 = 1;
        delta = (echo + 41) % 128;
        Object[] objArr = new Object[1];
        bravo((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20369), 908 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), 7 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr);
        String str6 = (String) objArr[0];
        char resolveSizeAndState = (char) (56772 - View.resolveSizeAndState(0, 0, 0));
        int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
        int i65 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
        int i66 = (i65 ^ 27) + ((i65 & 27) << 1);
        Object[] objArr2 = new Object[1];
        bravo(resolveSizeAndState, edgeSlop, i66, objArr2);
        String str7 = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        bravo((char) ((-1) - MotionEvent.axisFromString("")), 28 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), objArr3);
        String str8 = (String) objArr3[0];
        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 32476);
        int i67 = 51 - (~(-Gravity.getAbsoluteGravity(0, 0)));
        int i68 = -(-TextUtils.indexOf("", ""));
        Object[] objArr4 = new Object[1];
        bravo(capsMode, i67, (i68 ^ 18) + ((i68 & 18) << 1), objArr4);
        String str9 = (String) objArr4[0];
        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
        int i69 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 69;
        int i70 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
        Object[] objArr5 = new Object[1];
        bravo(pressedStateDuration, i69, (i70 & 29) + (i70 | 29), objArr5);
        String[] strArr9 = {str7, str8, str9, (String) objArr5[0]};
        int i71 = 0;
        while (true) {
            cls = String.class;
            if (i71 >= 4) {
                i11 = i64;
                i12 = i62;
                c3 = ' ';
                i13 = 19;
                i14 = 2;
                i15 = i63;
                i16 = i4;
                break;
            }
            c3 = ' ';
            try {
                Object[] objArr6 = new Object[i64];
                objArr6[i63] = strArr9[i71];
                Object D88716 = uH18377.D8871(1565484532);
                if (D88716 == null) {
                    int offsetBefore = TextUtils.getOffsetBefore("", i63) + 52;
                    int absoluteGravity = 2951 - Gravity.getAbsoluteGravity(i63, i63);
                    i13 = 19;
                    char c12 = (char) (TypedValue.complexToFloat(i63) > 0.0f ? 1 : (TypedValue.complexToFloat(i63) == 0.0f ? 0 : -1));
                    i12 = i62;
                    byte b2 = (byte) i63;
                    i14 = 2;
                    byte b4 = (byte) (b2 + 1);
                    Object[] objArr7 = new Object[i64];
                    charlie(b2, b4, (byte) (b4 + 1), objArr7);
                    String str10 = (String) objArr7[i63];
                    Class[] clsArr = new Class[i64];
                    clsArr[i63] = cls;
                    D88716 = uH18377.setPivotYN16904(offsetBefore, absoluteGravity, c12, -2097887455, false, str10, clsArr);
                } else {
                    i12 = i62;
                    i13 = 19;
                    i14 = 2;
                }
                long longValue = ((Long) ((Method) D88716).invoke(null, objArr6)).longValue();
                long j11 = -340995275;
                String[] strArr10 = strArr9;
                long j12 = 988;
                i11 = i64;
                long myTid = Process.myTid();
                long j13 = -1;
                long j14 = ((j11 ^ j13) | longValue) ^ j13;
                long j15 = longValue ^ j13;
                long j16 = myTid ^ j13;
                long j17 = (j12 * (j14 | ((j15 | myTid) ^ j13) | ((j16 | longValue) ^ j13))) + ((-1976) * (((j15 | j11) ^ j13) | ((j16 | j11) ^ j13))) + ((myTid | j14) * j12) + (989 * longValue) + ((-1975) * j11) + 1296149177;
                int i72 = ((int) (j17 >> 32)) & ((((-1375732033) | i4) * 668) + (((-2115633607) | (~(742107278 | i4))) * 1336) + ((((~((-2115633607) | i4)) | 742107278) * (-668)) - 653299370));
                int i73 = ~i4;
                int i74 = ((int) j17) & ((((~(i73 | (-143282407))) | (~((-1293944004) | i4))) * 950) + (((~(i73 | (-1293944004))) | (~((-143282407) | i4))) * (-950)) + ((((~(143282406 | i73)) | (~(1293944003 | i4))) * 1900) - 1871736089));
                if (((i72 & i74) | (i72 ^ i74)) != 0) {
                    i16 = i4 ^ (i71 + 190);
                    i15 = 0;
                    break;
                }
                i71 = (i71 & 1) + (i71 | 1);
                strArr9 = strArr10;
                i64 = i11;
                i62 = i12;
                i63 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Object[] objArr8 = new Object[i11];
        bravo((char) TextUtils.getOffsetBefore("", i15), 97 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
        String str11 = (String) objArr8[0];
        int i75 = -(-(Process.myTid() >> 22));
        int defaultSize = 110 - View.getDefaultSize(0, 0);
        int i76 = -View.MeasureSpec.getMode(0);
        int i77 = i76 * 46;
        int i78 = (i77 & 598) + (i77 | 598);
        int i79 = ~i4;
        int i80 = ~(((-14) ^ i79) | ((-14) & i79));
        int i81 = ((i76 ^ i80) | (i80 & i76)) * (-90);
        int i82 = (i78 ^ i81) + ((i78 & i81) << 1);
        int i83 = ~(((-14) ^ i4) | ((-14) & i4));
        int i84 = ~((i76 ^ 13) | (i76 & 13));
        int i85 = ((i83 ^ i84) | (i83 & i84)) * (-45);
        int i86 = (i82 & i85) + (i82 | i85);
        int i87 = ~i76;
        int i88 = ~((i87 ^ i4) | (i87 & i4));
        int i89 = ((-14) ^ i88) | (i88 & (-14));
        int i90 = ~((i76 & i79) | (i79 ^ i76));
        int i91 = ((i90 & i89) | (i89 ^ i90)) * 45;
        int i92 = (i86 & i91) + (i91 | i86);
        Object[] objArr9 = new Object[1];
        bravo((char) ((i75 ^ 7108) + ((i75 & 7108) << 1)), defaultSize, i92, objArr9);
        String str12 = (String) objArr9[0];
        int i93 = -Color.red(0);
        int i94 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
        int i95 = 1;
        int i96 = ((i94 | 123) << 1) - (i94 ^ 123);
        char c13 = 0;
        int i97 = -(-TextUtils.getCapsMode("", 0, 0));
        int i98 = (i97 ^ 18) + ((i97 & 18) << 1);
        Object[] objArr10 = new Object[1];
        bravo((char) ((i93 & 4378) + (i93 | 4378)), i96, i98, objArr10);
        String[] strArr11 = {str11, str12, (String) objArr10[0]};
        int i99 = 0;
        while (true) {
            if (i99 >= 3) {
                i17 = i16;
                i18 = i4;
                break;
            }
            Object[] objArr11 = new Object[i95];
            objArr11[c13] = strArr11[i99];
            Object D88717 = uH18377.D8871(1979478258);
            if (D88717 == null) {
                int i100 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                int indexOf = TextUtils.indexOf("", "") + 2951;
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b6 = (byte) 1;
                byte b10 = (byte) (b6 - 1);
                Object[] objArr12 = new Object[1];
                charlie(b6, b10, b10, objArr12);
                D88717 = uH18377.setPivotYN16904(i100, indexOf, maximumDrawingCacheSize, -1438133721, false, (String) objArr12[0], new Class[]{cls});
            }
            long longValue2 = ((Long) ((Method) D88717).invoke(null, objArr11)).longValue();
            i17 = i16;
            long j18 = -1283028898;
            long j19 = 367;
            long j20 = -366;
            long j21 = ((j18 | longValue2) * j20) + (j19 * longValue2) + (j19 * j18);
            long j22 = -1;
            long j23 = longValue2 ^ j22;
            long myUid2 = Process.myUid();
            long j24 = (366 * ((((j18 ^ j22) | longValue2) ^ j22) | (((j23 | j18) | myUid2) ^ j22))) + (j20 * (j18 | ((j23 | myUid2) ^ j22))) + j21 + 2057850204;
            int i101 = ((int) (j24 >> c3)) & ((((~((-1222383685) | i4)) | (-1289633127)) * 49) + (((~((-214842727) | i79)) | (-1222383685) | (~(214842726 | i4))) * (-49)) + ((((~((-1222383685) | i79)) | 1074790400) * 98) - 454898648));
            int i102 = ((int) j24) & ((((~(1838488304 | i79)) | (-1364563350)) * 494) + ((((-272663814) | i79) * 494) - 1652796489));
            if (((i102 & i101) | (i101 ^ i102)) != 0) {
                int i103 = ((i99 | 270) << 1) - (i99 ^ 270);
                i18 = (i103 | i4) & (~(i4 & i103));
                break;
            }
            i99++;
            i16 = i17;
            c13 = 0;
            i95 = 1;
        }
        int i104 = i4 ^ i17;
        int i105 = -i104;
        int i106 = ((i104 & i105) | (i104 ^ i105)) >> 31;
        int i107 = i18 & (~i106);
        int i108 = i106 & i17;
        int i109 = (i107 ^ i108) | (i107 & i108);
        char c14 = (char) (26198 - (~(-Color.argb(0, 0, 0, 0))));
        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
        Object[] objArr13 = new Object[1];
        bravo(c14, (absoluteGravity2 & ModuleDescriptor.MODULE_VERSION) + (absoluteGravity2 | ModuleDescriptor.MODULE_VERSION), 61 - (~(-AndroidCharacter.getMirror('0'))), objArr13);
        Object[] objArr14 = {(String) objArr13[0]};
        Object D88718 = uH18377.D8871(-2104138125);
        if (D88718 == null) {
            int i110 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
            int i111 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2951;
            char c15 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b11 = (byte) 1;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr15 = new Object[1];
            charlie(b11, b12, (byte) (b12 + 1), objArr15);
            D88718 = uH18377.setPivotYN16904(i110, i111, c15, 1563346086, false, (String) objArr15[0], new Class[]{cls});
        }
        long longValue3 = ((Long) ((Method) D88718).invoke(null, objArr14)).longValue();
        long j25 = 667942256;
        long j26 = i4;
        long j27 = ((-859) * (j25 | j26)) + ((-858) * longValue3) + (860 * j25);
        long j28 = 859;
        long j29 = -1;
        long j30 = j26 ^ j29;
        long j31 = longValue3 ^ j29;
        long j32 = ((j28 * (((j31 | j30) ^ j29) | ((j31 | j25) ^ j29))) + (((((j30 | j25) ^ j29) | ((((j25 ^ j29) | j31) | j26) ^ j29)) * j28) + j27)) - 1897562786;
        int i112 = ((int) (j32 >> c3)) & ((((~((-365201589) | i79)) | (~((-167855107) | i4)) | (~((-538968129) | i4))) * 920) + (((~((-533056695) | i79)) | 365201588) * 920) + (((~((-365201589) | i4)) | (~((-538968129) | i79))) * 920) + 2038856378);
        int i113 = ((int) j32) & ((((~((-1255520372) | i79)) | (-1073816902)) * 184) + ((((-1073815618) | i79) * 184) - 1423411875));
        if (((i112 & i113) | (i112 ^ i113)) != 0) {
            i19 = i4 ^ 266;
            j5 = j29;
        } else {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i114 = 154 - (~(-Color.argb(0, 0, 0, 0)));
            int i115 = -Drawable.resolveOpacity(0, 0);
            int alpha = C1211g1.alpha();
            int i116 = i115 * 69;
            int i117 = (i116 ^ (-1608)) + ((i116 & (-1608)) << 1);
            int i118 = ~i115;
            int i119 = (i118 ^ (-25)) | (i118 & (-25));
            int i120 = ~alpha;
            j5 = j29;
            int i121 = ~((i119 ^ i120) | (i119 & i120));
            int i122 = ~((i115 ^ 24) | (i115 & 24));
            int i123 = (i121 & i122) | (i121 ^ i122);
            int i124 = ~((alpha ^ 24) | (alpha & 24));
            int i125 = -(-(((i123 & i124) | (i123 ^ i124)) * (-68)));
            int i126 = (i117 & i125) + (i125 | i117);
            int i127 = ~alpha;
            int i128 = (~((i127 & i118) | (i118 ^ i127) | 24)) * (-68);
            int i129 = (i126 & i128) + (i128 | i126);
            int i130 = ~((-25) | i120);
            int i131 = -(-(((i130 & i118) | (i118 ^ i130)) * 68));
            int i132 = (i129 ^ i131) + ((i131 & i129) << 1);
            Object[] objArr16 = new Object[1];
            bravo(windowTouchSlop, i114, i132, objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            Object D88719 = uH18377.D8871(-957097391);
            if (D88719 == null) {
                int packedPositionType = 52 - ExpandableListView.getPackedPositionType(0L);
                int resolveOpacity = 3158 - Drawable.resolveOpacity(0, 0);
                char green = (char) (Color.green(0) + 58074);
                byte b13 = (byte) 1;
                byte b14 = (byte) (b13 - 1);
                Object[] objArr18 = new Object[1];
                charlie(b13, b14, (byte) (b14 + 2), objArr18);
                D88719 = uH18377.setPivotYN16904(packedPositionType, resolveOpacity, green, 424179844, false, (String) objArr18[0], new Class[]{cls});
            }
            String str13 = (String) ((Method) D88719).invoke(null, objArr17);
            if (str13 == null || str13.isEmpty()) {
                int i133 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                Object[] objArr19 = new Object[1];
                bravo((char) ((i133 ^ 1) + ((i133 & 1) << 1)), (windowTouchSlop2 ^ 179) + ((windowTouchSlop2 & 179) << 1), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr19);
                Object[] objArr20 = {(String) objArr19[0]};
                Object D887110 = uH18377.D8871(-957097391);
                if (D887110 == null) {
                    int packedPositionChild = 51 - ExpandableListView.getPackedPositionChild(0L);
                    int modifierMetaStateMask = 3157 - ((byte) KeyEvent.getModifierMetaStateMask());
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 58074);
                    byte b15 = (byte) 1;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr21 = new Object[1];
                    charlie(b15, b16, (byte) (b16 + 2), objArr21);
                    D887110 = uH18377.setPivotYN16904(packedPositionChild, modifierMetaStateMask, keyRepeatDelay, 424179844, false, (String) objArr21[0], new Class[]{cls});
                }
                String str14 = (String) ((Method) D887110).invoke(null, objArr20);
                if (str14 != null) {
                    int i134 = delta + 95;
                    echo = i134 % 128;
                    int i135 = i134 % 2;
                    boolean isEmpty = str14.isEmpty();
                    if (i135 == 0) {
                        int i136 = 29 / 0;
                    }
                }
                i19 = i4;
            }
            i19 = (~(i4 & 267)) & (i4 | 267);
        }
        int i137 = (~(i4 & i109)) & (i4 | i109);
        int i138 = -i137;
        int i139 = ((i137 & i138) | (i137 ^ i138)) >> 31;
        int i140 = (~i139) & i19;
        int i141 = i139 & i109;
        int i142 = (i141 & i140) | (i140 ^ i141);
        Object D887111 = uH18377.D8871(1074526551);
        if (D887111 == null) {
            int keyRepeatDelay2 = 51 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int indexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1056;
            char c16 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b17 = (byte) 0;
            byte b18 = (byte) (b17 + 1);
            Object[] objArr22 = new Object[1];
            charlie(b17, b18, (byte) (b18 + 1), objArr22);
            D887111 = uH18377.setPivotYN16904(keyRepeatDelay2, indexOf2, c16, -1615832190, false, (String) objArr22[0], new Class[0]);
        }
        long longValue4 = ((Long) ((Method) D887111).invoke(null, null)).longValue();
        long j33 = 77098226;
        long j34 = 371;
        long j35 = -370;
        long j36 = longValue4 ^ j5;
        long j37 = j33 ^ j5;
        long j38 = ((((j36 | j30) ^ j5) | ((j37 | j26) ^ j5)) * j35) + (j34 * longValue4) + (j34 * j33);
        long j39 = (longValue4 | j33) ^ j5;
        long j40 = (370 * j39) + (j35 * (((j37 | j30) ^ j5) | ((j36 | j26) ^ j5) | j39)) + j38 + 102467491;
        int i143 = (((int) (j40 >> c3)) & ((((~((-1240125846) | i79)) | 159383808 | (~((-536873003) | i4))) * 140) + (((~((-1617615040) | i79)) | 536873002) * (-280)) + (((-1617615040) | i4) * 140) + 1578944930)) | (((int) j40) & ((((~(((int) Runtime.getRuntime().totalMemory()) | 634396976)) | 2071623386) * 529) + ((((~((~r7) | 634396976)) | 1512724170) * 529) - 1520785380)));
        int i144 = -(-(i143 * 971));
        int i145 = (1939 ^ i144) + ((i144 & 1939) << 1);
        int i146 = ~i4;
        int i147 = -(-((~(i146 | i143)) * (-970)));
        int i148 = (((i145 ^ i147) + ((i147 & i145) << 1)) - (~(-(-((~i143) * 1940))))) - 1;
        int i149 = ~(~i143);
        int i150 = ~((i79 ^ i143) | (i79 & i143));
        int i151 = -(-(((i149 & i150) | (i149 ^ i150)) * 970));
        int i152 = 199 - (~(-(-(((i148 | i151) << 1) - (i151 ^ i148)))));
        int i153 = -i143;
        int i154 = ((i143 & i153) | (i143 ^ i153)) >> 31;
        int i155 = (i154 & (i152 | i4) & (~(i4 & i152))) | ((~i154) & i4);
        int i156 = i4 ^ i142;
        int i157 = (i156 | (-i156)) >> 31;
        int i158 = i155 & (~i157);
        int i159 = i142 & i157;
        int i160 = (i159 & i158) | (i158 ^ i159);
        int rgb = Color.rgb(0, 0, 0);
        char c17 = (char) ((rgb & 16814445) + (16814445 | rgb));
        int myTid2 = Process.myTid() >> 22;
        Object[] objArr23 = new Object[1];
        bravo(c17, (myTid2 & 203) + (myTid2 | 203), 19 - (~(Process.myTid() >> 22)), objArr23);
        String str15 = (String) objArr23[0];
        char c18 = (char) ((-2) - (~(-((byte) KeyEvent.getModifierMetaStateMask()))));
        int i161 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        Object[] objArr24 = new Object[1];
        bravo(c18, ((i161 | 223) << 1) - (i161 ^ 223), 6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr24);
        Object[] objArr25 = new Object[i14];
        objArr25[1] = (String) objArr24[0];
        objArr25[0] = str15;
        Object D887112 = uH18377.D8871(1214576837);
        if (D887112 == null) {
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52;
            int maxKeyCode = 3314 - (KeyEvent.getMaxKeyCode() >> 16);
            char green2 = (char) Color.green(0);
            byte b19 = (byte) 0;
            byte b20 = (byte) (b19 + 1);
            i20 = 6;
            Object[] objArr26 = new Object[1];
            charlie(b19, b20, (byte) (b20 + 1), objArr26);
            D887112 = uH18377.setPivotYN16904(doubleTapTimeout, maxKeyCode, green2, -1746970096, false, (String) objArr26[0], new Class[]{cls, cls});
        } else {
            i20 = 6;
        }
        long longValue5 = ((Long) ((Method) D887112).invoke(null, objArr25)).longValue();
        long j41 = -687115984;
        long j42 = (HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST * longValue5) + ((-419) * j41);
        long j43 = 420;
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j44 = j41 ^ j5;
        long j45 = ((j43 * (((j44 | (longValue5 ^ j5)) ^ j5) | (((elapsedCpuTime ^ j5) | longValue5) ^ j5))) + (((-420) * (longValue5 | j44)) + ((((longValue5 | elapsedCpuTime) ^ j5) * j43) + j42))) - 860522354;
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        int i162 = ((int) (j45 >> c3)) & ((((~(uptimeMillis | 975298474)) | (-2050219947)) * 116) + (((-1882442411) | uptimeMillis) * 116) + (((~((~uptimeMillis) | (-807520939))) * (-116)) - 2072279902));
        int i163 = ((int) j45) & ((((~((~Process.myPid()) | (-120425137))) | 1316801273) * HttpConstants.HTTP_USE_PROXY) + ((((~((-120425137) | r3)) | 103582384) * HttpConstants.HTTP_USE_PROXY) - 1704616964));
        int i164 = (i162 & i163) | (i162 ^ i163);
        int i165 = -i164;
        int i166 = ((i164 & i165) | (i164 ^ i165)) >> 31;
        int i167 = (~i166) & i4;
        int i168 = i166 & ((i4 & (-263)) | (i79 & 262));
        int i169 = (i168 & i167) | (i167 ^ i168);
        int i170 = (~(i4 & i160)) & (i4 | i160);
        int i171 = -i170;
        int i172 = ((i170 & i171) | (i170 ^ i171)) >> 31;
        int i173 = (i169 & (~i172)) | (i160 & i172);
        Object[] objArr27 = new Object[1];
        bravo((char) Drawable.resolveOpacity(0, 0), 228 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16)), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr27);
        String str16 = (String) objArr27[0];
        char indexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
        int alpha2 = C1211g1.alpha();
        int i174 = scrollBarSize * (-445);
        int i175 = (i174 & (-115700)) + (i174 | (-115700));
        int i176 = ~scrollBarSize;
        int i177 = ~((i176 & (-261)) | (i176 ^ (-261)));
        int i178 = ~alpha2;
        int i179 = ~(((-261) ^ i178) | (i178 & (-261)));
        int i180 = (i175 - (~(((i177 ^ i179) | (i177 & i179)) * 446))) - 1;
        int i181 = ~((i176 ^ 260) | (i176 & 260));
        int i182 = (scrollBarSize & (-261)) | ((-261) ^ scrollBarSize);
        int i183 = ~((i182 & alpha2) | (i182 ^ alpha2));
        int i184 = ((i181 & i183) | (i181 ^ i183)) * 446;
        int i185 = ((((i180 | i184) << 1) - (i180 ^ i184)) - (~((~((i176 ^ (-261)) | (i176 & (-261)))) * 446))) - 1;
        int i186 = -(ViewConfiguration.getTapTimeout() >> 16);
        int i187 = (i186 & 23) + (i186 | 23);
        Object[] objArr28 = new Object[1];
        bravo(indexOf3, i185, i187, objArr28);
        String str17 = (String) objArr28[0];
        int i188 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
        int i189 = 281 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
        int i190 = -AndroidCharacter.getMirror('0');
        int i191 = (i190 & 76) + (i190 | 76);
        Object[] objArr29 = new Object[1];
        bravo((char) ((i188 & 12674) + (i188 | 12674)), i189, i191, objArr29);
        String str18 = (String) objArr29[0];
        int i192 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        int argb = Color.argb(0, 0, 0, 0);
        int i193 = (argb & 311) + (argb | 311);
        int i194 = -TextUtils.indexOf("", "");
        int i195 = 1;
        Object[] objArr30 = new Object[1];
        bravo((char) ((i192 & 5920) + (i192 | 5920)), i193, (i194 ^ 14) + ((i194 & 14) << 1), objArr30);
        char c19 = 0;
        String[] strArr12 = {str16, str17, str18, (String) objArr30[0]};
        int i196 = 0;
        while (true) {
            if (i196 >= 4) {
                i21 = i173;
                i22 = i4;
                break;
            }
            Object[] objArr31 = new Object[i195];
            objArr31[c19] = strArr12[i196];
            Object D887113 = uH18377.D8871(1565484532);
            if (D887113 == null) {
                int i197 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                int i198 = 2952 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b21 = (byte) 0;
                byte b22 = (byte) (b21 + 1);
                i21 = i173;
                strArr8 = strArr12;
                Object[] objArr32 = new Object[1];
                charlie(b21, b22, (byte) (b22 + 1), objArr32);
                D887113 = uH18377.setPivotYN16904(i197, i198, scrollBarFadeDuration, -2097887455, false, (String) objArr32[0], new Class[]{cls});
            } else {
                i21 = i173;
                strArr8 = strArr12;
            }
            long longValue6 = ((Long) ((Method) D887113).invoke(null, objArr31)).longValue();
            long j46 = -1185108611;
            long j47 = 530;
            long j48 = (j47 * longValue6) + (j47 * j46) + 1058;
            long j49 = 529;
            long elapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j50 = (j49 * ((longValue6 ^ j5) | ((elapsedRealtime | j46) ^ j5))) + (((((elapsedRealtime ^ j5) | j46) ^ j5) | ((j46 | longValue6) ^ j5)) * j49) + j48 + 2140262513;
            int freeMemory = (int) Runtime.getRuntime().freeMemory();
            int i199 = ~freeMemory;
            if (((((int) (j50 >> c3)) & (((~(i199 | 1648326114)) * 301) + (((~(freeMemory | 211099703)) | 1646941632 | (~((-209715222) | i199))) * (-301)) + ((((~(211099703 | i199)) | 1648326114) * (-602)) - 1819367098))) | (((int) j50) & A0.z.foxtrot((~Process.myUid()) | 1740633685, -828, (((~(1740633685 | r8)) | 1117107200) * (-828)) - 1754753727, 1864319448))) != 0) {
                int i200 = i196 + 252;
                i22 = ((~i200) & i4) | (i200 & i79);
                break;
            }
            i196++;
            i173 = i21;
            strArr12 = strArr8;
            i195 = 1;
            c19 = 0;
        }
        int i201 = (~(i4 & i21)) & (i4 | i21);
        int i202 = -i201;
        int i203 = ((i201 & i202) | (i201 ^ i202)) >> 31;
        int i204 = i22 & (~i203);
        int i205 = i21 & i203;
        int i206 = (i204 & i205) | (i204 ^ i205);
        Object[] objArr33 = new Object[1];
        bravo((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5754), 324 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), 11 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), objArr33);
        Object[] objArr34 = {(String) objArr33[0]};
        Object D887114 = uH18377.D8871(-957097391);
        if (D887114 == null) {
            int indexOf4 = TextUtils.indexOf("", "", 0, 0) + 52;
            int trimmedLength = TextUtils.getTrimmedLength("") + 3158;
            char rgb2 = (char) (Color.rgb(0, 0, 0) + 16835290);
            byte b23 = (byte) 1;
            byte b24 = (byte) (b23 - 1);
            Object[] objArr35 = new Object[1];
            charlie(b23, b24, (byte) (b24 + 2), objArr35);
            D887114 = uH18377.setPivotYN16904(indexOf4, trimmedLength, rgb2, 424179844, false, (String) objArr35[0], new Class[]{cls});
        }
        String str19 = (String) ((Method) D887114).invoke(null, objArr34);
        if (str19 != null) {
            int i207 = echo;
            delta = ((i207 ^ 45) + ((i207 & 45) << 1)) % 128;
            char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 63738);
            int i208 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int i209 = ((i208 | 337) << 1) - (i208 ^ 337);
            int i210 = -TextUtils.getCapsMode("", 0, 0);
            Object[] objArr36 = new Object[1];
            bravo(lastIndexOf, i209, (i210 ^ 9) + ((i210 & 9) << 1), objArr36);
            if (str19.contains((String) objArr36[0])) {
                i23 = i4 ^ 250;
                int i211 = echo;
                delta = (((i211 | 13) << 1) - (i211 ^ 13)) % 128;
                int i212 = (~(i4 & i206)) & (i4 | i206);
                int i213 = -i212;
                int i214 = ((i212 & i213) | (i212 ^ i213)) >> 31;
                int i215 = (i206 & i214) | (i23 & (~i214));
                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                Object[] objArr37 = new Object[1];
                bravo((char) ((maximumFlingVelocity & 7690) + (maximumFlingVelocity | 7690)), 346 - (~KeyEvent.keyCodeFromString("")), 16 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), objArr37);
                String str20 = (String) objArr37[0];
                int i216 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i217 = 363 - (~(-TextUtils.indexOf("", "")));
                int size = View.MeasureSpec.getSize(0);
                int i218 = (size ^ 6) + ((size & 6) << 1);
                Object[] objArr38 = new Object[1];
                bravo((char) ((i216 & 1517) + (i216 | 1517)), i217, i218, objArr38);
                Object[] objArr39 = {str20, (String) objArr38[0]};
                D8871 = uH18377.D8871(1214576837);
                if (D8871 == null) {
                    int indexOf5 = 51 - TextUtils.indexOf((CharSequence) "", '0');
                    int i219 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3315;
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b25 = (byte) 0;
                    byte b26 = (byte) (b25 + 1);
                    Object[] objArr40 = new Object[1];
                    charlie(b25, b26, (byte) (b26 + 1), objArr40);
                    D8871 = uH18377.setPivotYN16904(indexOf5, i219, jumpTapTimeout, -1746970096, false, (String) objArr40[0], new Class[]{cls, cls});
                }
                long longValue7 = ((Long) ((Method) D8871).invoke(null, objArr39)).longValue();
                long j51 = -846922567;
                long j52 = -103;
                long j53 = (j52 * longValue7) + (j52 * j51);
                long j54 = 104;
                long j55 = longValue7 ^ j5;
                j6 = ((j54 * (j51 | j26)) + (((-104) * (((j30 | j51) | longValue7) ^ j5)) + ((((((j51 ^ j5) | j55) ^ j5) | ((j55 | j26) ^ j5)) * j54) + j53))) - 700715771;
                i24 = ((int) (j6 >> c3)) & ((((~((~Process.myPid()) | 135016574)) | (-1438299736)) * 398) + ((((~(135016574 | r9)) | (-1438299736)) * 398) - 1431504452));
                i25 = ~Process.myUid();
                if (((((int) j6) & ((((~((-2002498796) | i25)) | (-855242091)) * 68) + ((~((-10502401) | i25)) * (-68)) + ((((~(r3 | 2002498795)) | ((~((-844739691) | i25)) | (-2013001196))) * (-68)) - 2141271023))) | i24) == 0) {
                    int i220 = delta + 93;
                    echo = i220 % 128;
                    if (i220 % 2 == 0) {
                        i60 = ~(i4 & 31361);
                        i61 = i4 | 31361;
                    } else {
                        i60 = ~(i4 & 251);
                        i61 = i4 | 251;
                    }
                    i26 = i60 & i61;
                } else {
                    i26 = i4;
                }
                int i221 = ((~i215) & i4) | (i215 & i79);
                int i222 = -i221;
                int i223 = ((i221 & i222) | (i221 ^ i222)) >> 31;
                int i224 = i26 & (~i223);
                int i225 = i215 & i223;
                int i226 = (i225 & i224) | (i224 ^ i225);
                char indexOf6 = (char) TextUtils.indexOf("", "");
                int i227 = -(-View.MeasureSpec.getMode(0));
                int i228 = (i227 ^ 370) + ((i227 & 370) << 1);
                int indexOf7 = TextUtils.indexOf("", "", 0);
                int i229 = ((indexOf7 | 23) << 1) - (indexOf7 ^ 23);
                Object[] objArr41 = new Object[1];
                bravo(indexOf6, i228, i229, objArr41);
                Object[] objArr42 = {(String) objArr41[0]};
                D88712 = uH18377.D8871(-957097391);
                if (D88712 == null) {
                    int i230 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51;
                    int rgb3 = Color.rgb(0, 0, 0) + 16780374;
                    char indexOf8 = (char) (58074 - TextUtils.indexOf("", "", 0));
                    byte b27 = (byte) 1;
                    byte b28 = (byte) (b27 - 1);
                    Object[] objArr43 = new Object[1];
                    charlie(b27, b28, (byte) (b28 + 2), objArr43);
                    D88712 = uH18377.setPivotYN16904(i230, rgb3, indexOf8, 424179844, false, (String) objArr43[0], new Class[]{cls});
                }
                String lowerCase = ((String) ((Method) D88712).invoke(null, objArr42)).toLowerCase();
                int threadPriority = Process.getThreadPriority(0);
                char c20 = 20;
                char c21 = (char) ((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6);
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                int i231 = -(-AndroidCharacter.getMirror('0'));
                Object[] objArr44 = new Object[1];
                bravo(c21, (offsetBefore2 ^ 393) + ((offsetBefore2 & 393) << 1), ((i231 | (-44)) << 1) - (i231 ^ (-44)), objArr44);
                int i232 = !lowerCase.contains((String) objArr44[0]) ? (~(i4 & 264)) & (i4 | 264) : i4;
                int i233 = (~(i4 & i226)) & (i4 | i226);
                int i234 = -i233;
                int i235 = ((i233 & i234) | (i233 ^ i234)) >> 31;
                int i236 = i232 & (~i235);
                int i237 = i226 & i235;
                int i238 = (i237 & i236) | (i236 ^ i237);
                char mirror = (char) (22222 - AndroidCharacter.getMirror('0'));
                int i239 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 397;
                int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
                Object[] objArr45 = new Object[1];
                bravo(mirror, i239, (resolveOpacity2 ^ 42) + ((resolveOpacity2 & 42) << 1), objArr45);
                String str21 = (String) objArr45[0];
                int i240 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i241 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                char mirror2 = AndroidCharacter.getMirror('0');
                int i242 = (mirror2 & 65528) + (mirror2 | 65528);
                Object[] objArr46 = new Object[1];
                bravo((char) ((i240 & 24700) + (i240 | 24700)), ((i241 | 438) << 1) - (i241 ^ 438), i242, objArr46);
                String str22 = (String) objArr46[0];
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                int i243 = 478 - (~(-Color.green(0)));
                int i244 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i245 = (i244 & 27) + (i244 | 27);
                Object[] objArr47 = new Object[1];
                bravo((char) ((bitsPerPixel & 15800) + (bitsPerPixel | 15800)), i243, i245, objArr47);
                String str23 = (String) objArr47[0];
                int i246 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr48 = new Object[1];
                bravo((char) ((i246 ^ 45360) + ((i246 & 45360) << 1)), Color.rgb(0, 0, 0) + 16777722, 26 - (~(ViewConfiguration.getScrollBarSize() >> 8)), objArr48);
                String str24 = (String) objArr48[0];
                int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                int i247 = -Color.rgb(0, 0, 0);
                int i248 = ((i247 | (-16776683)) << 1) - (i247 ^ (-16776683));
                int i249 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i250 = ((i249 | 27) << 1) - (i249 ^ 27);
                Object[] objArr49 = new Object[1];
                bravo((char) ((capsMode2 ^ 39199) + ((capsMode2 & 39199) << 1)), i248, i250, objArr49);
                String str25 = (String) objArr49[0];
                int i251 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                int i252 = (scrollBarFadeDuration2 & 560) + (scrollBarFadeDuration2 | 560);
                int i253 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i254 = 1;
                int i255 = (i253 ^ 27) + ((i253 & 27) << 1);
                Object[] objArr50 = new Object[1];
                bravo((char) ((i251 ^ 1) + ((i251 & 1) << 1)), i252, i255, objArr50);
                String[] strArr13 = {str21, str22, str23, str24, str25, (String) objArr50[0]};
                i27 = i20;
                i28 = 0;
                while (i28 < i27) {
                    int i256 = echo;
                    int i257 = ((i256 | 23) << i254) - (i256 ^ 23);
                    delta = i257 % 128;
                    if (i257 % 2 != 0) {
                        String str26 = strArr13[i28];
                        Object[] objArr51 = new Object[i254];
                        objArr51[0] = str26;
                        Object D887115 = uH18377.D8871(-957097391);
                        if (D887115 == null) {
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 52;
                            int indexOf9 = 3157 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            char makeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 58074);
                            byte b29 = (byte) 1;
                            byte b30 = (byte) (b29 - 1);
                            Object[] objArr52 = new Object[1];
                            charlie(b29, b30, (byte) (b30 + 2), objArr52);
                            D887115 = uH18377.setPivotYN16904(scrollDefaultDelay, indexOf9, makeMeasureSpec, 424179844, false, (String) objArr52[0], new Class[]{cls});
                        }
                        throw null;
                    }
                    Object[] objArr53 = {strArr13[i28]};
                    Object D887116 = uH18377.D8871(-957097391);
                    if (D887116 == null) {
                        int combineMeasuredStates = 52 - View.combineMeasuredStates(0, 0);
                        c4 = c20;
                        int lastIndexOf2 = 3157 - TextUtils.lastIndexOf("", '0', 0);
                        char argb2 = (char) (Color.argb(0, 0, 0, 0) + 58074);
                        byte b31 = (byte) 1;
                        byte b32 = (byte) (b31 - 1);
                        i29 = i238;
                        strArr7 = strArr13;
                        Object[] objArr54 = new Object[1];
                        charlie(b31, b32, (byte) (b32 + 2), objArr54);
                        D887116 = uH18377.setPivotYN16904(combineMeasuredStates, lastIndexOf2, argb2, 424179844, false, (String) objArr54[0], new Class[]{cls});
                    } else {
                        i29 = i238;
                        strArr7 = strArr13;
                        c4 = c20;
                    }
                    String str27 = (String) ((Method) D887116).invoke(null, objArr53);
                    if (str27 != null) {
                        int i258 = delta;
                        int i259 = (i258 & 43) + (i258 | 43);
                        echo = i259 % 128;
                        int i260 = i259 % 2;
                        boolean isEmpty2 = str27.isEmpty();
                        if (i260 != 0) {
                            if (!isEmpty2) {
                                i30 = (~(i4 & 265)) & (i4 | 265);
                                break;
                            }
                        } else {
                            int i261 = 22 / 0;
                            if (!isEmpty2) {
                                i30 = (~(i4 & 265)) & (i4 | 265);
                                break;
                            }
                        }
                    }
                    i28 = (i28 ^ 1) + ((i28 & 1) << 1);
                    i238 = i29;
                    strArr13 = strArr7;
                    c20 = c4;
                    i27 = 6;
                    i254 = 1;
                }
                i29 = i238;
                c4 = c20;
                i30 = i4;
                int i262 = (~(i4 & i29)) & (i4 | i29);
                int i263 = -i262;
                int i264 = ((i262 & i263) | (i262 ^ i263)) >> 31;
                int i265 = (i30 & (~i264)) | (i29 & i264);
                char myPid = (char) ((Process.myPid() >> 22) + 7690);
                int i266 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i267 = (i266 ^ 347) + ((i266 & 347) << 1);
                int deadChar = KeyEvent.getDeadChar(0, 0);
                int i268 = ((deadChar | 17) << 1) - (deadChar ^ 17);
                Object[] objArr55 = new Object[1];
                bravo(myPid, i267, i268, objArr55);
                String str28 = (String) objArr55[0];
                char c22 = (char) (52842 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                int i269 = -ExpandableListView.getPackedPositionChild(0L);
                int i270 = ((i269 | 586) << 1) - (i269 ^ 586);
                int i271 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i272 = (i271 ^ 6) + ((i271 & 6) << 1);
                Object[] objArr56 = new Object[1];
                bravo(c22, i270, i272, objArr56);
                str = (String) objArr56[0];
                file = new File(str28);
                if (file.exists() && file.isFile()) {
                    try {
                        Scanner scanner = new Scanner(new FileInputStream(file));
                        Object[] objArr57 = new Object[1];
                        bravo((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 592 - (~(-TextUtils.getTrimmedLength(""))), 1 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), objArr57);
                        Scanner useDelimiter2 = scanner.useDelimiter((String) objArr57[0]);
                        next = !useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                        useDelimiter2.close();
                    } catch (IOException unused) {
                    }
                    if (next.contains(str)) {
                        i31 = (~(i4 & 260)) & (i4 | 260);
                        int i273 = ((~i265) & i4) | (i265 & i79);
                        int i274 = -i273;
                        int i275 = ((i273 & i274) | (i273 ^ i274)) >> 31;
                        i32 = (i265 & i275) | (i31 & (~i275));
                        if ((i5 & 8) != 0) {
                            int i276 = echo;
                            delta = ((i276 & 107) + (i276 | 107)) % 128;
                            int i277 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i278 = (i277 ^ 4755) | (i277 & 4755);
                            int i279 = (((i277 * HttpConstants.HTTP_UNAVAILABLE) - (-2391765)) - (~(i278 * (-502)))) - 1;
                            int i280 = ~i277;
                            int i281 = ~((i280 & (-4756)) | (i280 ^ (-4756)));
                            int i282 = ~i277;
                            int i283 = ~((i282 ^ i146) | (i282 & i146));
                            int i284 = ((~(i277 | 4755 | i4)) | (i281 ^ i283) | (i281 & i283)) * (-502);
                            int i285 = (i279 & i284) + (i284 | i279);
                            int i286 = (i282 ^ i79) | (i282 & i79);
                            int i287 = ~((i286 & 4755) | (i286 ^ 4755));
                            int i288 = ~(i278 | i4);
                            char c23 = (char) ((((i287 & i288) | (i287 ^ i288)) * HttpConstants.HTTP_BAD_GATEWAY) + i285);
                            int i289 = -Color.blue(0);
                            Object[] objArr58 = new Object[1];
                            bravo(c23, (i289 & 617) + (i289 | 617), 42 - (~(-View.resolveSize(0, 0))), objArr58);
                            String str29 = (String) objArr58[0];
                            char c24 = (char) (35010 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))));
                            int scrollBarFadeDuration3 = 660 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i290 = -TextUtils.indexOf("", "");
                            int i291 = ((i290 | 41) << 1) - (i290 ^ 41);
                            Object[] objArr59 = new Object[1];
                            bravo(c24, scrollBarFadeDuration3, i291, objArr59);
                            String str30 = (String) objArr59[0];
                            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                            int scrollBarFadeDuration4 = 701 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i292 = -(-TextUtils.getOffsetAfter("", 0));
                            int i293 = 1;
                            char c25 = 0;
                            Object[] objArr60 = new Object[1];
                            bravo(packedPositionType2, scrollBarFadeDuration4, (i292 ^ 38) + ((i292 & 38) << 1), objArr60);
                            String[] strArr14 = {str29, str30, (String) objArr60[0]};
                            int i294 = 0;
                            while (true) {
                                if (i294 >= 3) {
                                    i58 = i32;
                                    i59 = i4;
                                    break;
                                }
                                Object[] objArr61 = new Object[i293];
                                objArr61[c25] = strArr14[i294];
                                Object D887117 = uH18377.D8871(1979478258);
                                if (D887117 == null) {
                                    int touchSlop = 52 - (ViewConfiguration.getTouchSlop() >> 8);
                                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 2951;
                                    char c26 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    byte b33 = (byte) 1;
                                    byte b34 = (byte) (b33 - 1);
                                    i58 = i32;
                                    strArr6 = strArr14;
                                    Object[] objArr62 = new Object[1];
                                    charlie(b33, b34, b34, objArr62);
                                    D887117 = uH18377.setPivotYN16904(touchSlop, trimmedLength2, c26, -1438133721, false, (String) objArr62[0], new Class[]{cls});
                                } else {
                                    i58 = i32;
                                    strArr6 = strArr14;
                                }
                                long longValue8 = ((Long) ((Method) D887117).invoke(null, objArr61)).longValue();
                                long j56 = -137241629;
                                long j57 = 868;
                                long j58 = j56 ^ j5;
                                long tango = ad.tango(1504398301);
                                long j59 = tango ^ j5;
                                long j60 = longValue8 ^ j5;
                                long j61 = j58 | j60;
                                long j62 = (867 * (((j61 | j59) ^ j5) | (((j58 | longValue8) | tango) ^ j5) | (((j60 | j56) | tango) ^ j5))) + ((-1734) * ((j61 ^ j5) | ((j58 | tango) ^ j5) | ((j60 | tango) ^ j5))) + ((-867) * (((j58 | j59) ^ j5) | ((j60 | j59) ^ j5))) + (j57 * longValue8) + (j57 * j56) + 912062935;
                                int myUid3 = Process.myUid();
                                int i295 = ~myUid3;
                                int i296 = ((int) (j62 >> c3)) & ((((~(i295 | (-39508507))) | 1397717904) * 217) + (((~((-1397717905) | myUid3)) | 38427152) * 217) + (((~((-39508507) | myUid3)) | (~((-1397717905) | i295))) * 217) + 434633600);
                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                int i297 = ~elapsedCpuTime2;
                                int i298 = ((int) j62) & (((1325077948 | (~((-112148462) | i297))) * 712) + (((~(elapsedCpuTime2 | (-111875501))) | (~(i297 | (-272962)))) * (-712)) + (((272961 | r12) * (-712)) - 1754594659));
                                if (((i298 & i296) | (i296 ^ i298)) != 0) {
                                    int i299 = echo + 89;
                                    delta = i299 % 128;
                                    if (i299 % 2 != 0) {
                                        int i300 = i294 >> 17759;
                                        i59 = (i300 & i79) | ((~i300) & i4);
                                    } else {
                                        int i301 = i294 + 280;
                                        i59 = ((~i301) & i4) | (i301 & i79);
                                    }
                                } else {
                                    i294++;
                                    strArr14 = strArr6;
                                    i32 = i58;
                                    i293 = 1;
                                    c25 = 0;
                                }
                            }
                            int i302 = (~(i4 & i58)) & (i4 | i58);
                            int i303 = -i302;
                            int i304 = ((i302 & i303) | (i302 ^ i303)) >> 31;
                            i32 = (i59 & (~i304)) | (i58 & i304);
                        }
                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i305 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int i306 = (i305 & 739) + (i305 | 739);
                        int i307 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int alpha3 = C1211g1.alpha();
                        int i308 = i307 * 980;
                        int i309 = (i308 & (-41076)) + (i308 | (-41076));
                        int i310 = ~alpha3;
                        int i311 = (~((-43) | i310)) * 979;
                        int i312 = (i309 & i311) + (i311 | i309);
                        int i313 = (i307 | alpha3) * (-979);
                        int i314 = ~(((-43) & alpha3) | ((-43) ^ alpha3));
                        int i315 = ~((i307 & i310) | (i310 ^ i307));
                        int i316 = (((i312 & i313) + (i312 | i313)) - (~(-(-(((i315 & i314) | (i314 ^ i315)) * 979))))) - 1;
                        Object[] objArr63 = new Object[1];
                        bravo(jumpTapTimeout2, i306, i316, objArr63);
                        String str31 = (String) objArr63[0];
                        i33 = 1;
                        Object[] objArr64 = new Object[1];
                        bravo((char) (5113 - View.getDefaultSize(0, 0)), 780 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), 29 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), objArr64);
                        c10 = 0;
                        strArr = new String[]{str31, (String) objArr64[0]};
                        i34 = 0;
                        while (true) {
                            if (i34 < 2) {
                                i35 = i32;
                                i36 = i4;
                                break;
                            }
                            Object[] objArr65 = new Object[i33];
                            objArr65[c10] = strArr[i34];
                            Object D887118 = uH18377.D8871(1565484532);
                            if (D887118 == null) {
                                int windowTouchSlop3 = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2951;
                                char alpha4 = (char) Color.alpha(0);
                                byte b35 = (byte) 0;
                                byte b36 = (byte) (b35 + 1);
                                i35 = i32;
                                strArr5 = strArr;
                                Object[] objArr66 = new Object[1];
                                charlie(b35, b36, (byte) (b36 + 1), objArr66);
                                D887118 = uH18377.setPivotYN16904(windowTouchSlop3, keyRepeatTimeout, alpha4, -2097887455, false, (String) objArr66[0], new Class[]{cls});
                            } else {
                                i35 = i32;
                                strArr5 = strArr;
                            }
                            long longValue9 = ((Long) ((Method) D887118).invoke(null, objArr65)).longValue();
                            long j63 = 341951675;
                            long j64 = longValue9 ^ j5;
                            long j65 = ((-988) * (j63 | j64)) + ((-493) * longValue9) + (495 * j63);
                            long j66 = 494;
                            long j67 = j63 ^ j5;
                            long j68 = (j66 * (((j63 | longValue9) ^ j5) | ((j67 | j64) ^ j5) | ((j30 | longValue9) ^ j5))) + ((longValue9 | j67 | j30) * j66) + j65 + 613202227;
                            int tango2 = ad.tango(1854060866);
                            int i317 = ~tango2;
                            int i318 = (~(575958605 | i317)) | 1437237680;
                            int i319 = ~(tango2 | (-11270));
                            int i320 = ((int) (j68 >> c3)) & (((i319 | (~(i317 | 2013196285))) * HttpConstants.HTTP_BAD_GATEWAY) + ((i318 | i319) * (-502)) + 1376036042);
                            int myPid2 = Process.myPid();
                            int i321 = ((int) j68) & ((((~(myPid2 | 116570621)) | (~((~myPid2) | (-1553797032)))) * 627) + (((~(1553797031 | myPid2)) | 116570621) * (-627)) + ((((-76548518) | myPid2) * (-627)) - 635053948));
                            if (((i321 & i320) | (i320 ^ i321)) != 0) {
                                int i322 = i34 + 288;
                                i36 = (~(i4 & i322)) & (i4 | i322);
                                break;
                            }
                            i34++;
                            i32 = i35;
                            strArr = strArr5;
                            i33 = 1;
                            c10 = 0;
                        }
                        int i323 = i4 ^ i35;
                        int i324 = -i323;
                        int i325 = ((i323 & i324) | (i323 ^ i324)) >> 31;
                        int i326 = (i36 & (~i325)) | (i35 & i325);
                        D88713 = uH18377.D8871(-344556366);
                        if (D88713 == null) {
                            int gidForName = Process.getGidForName("") + 53;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3106;
                            char gidForName2 = (char) (Process.getGidForName("") + 15992);
                            byte b37 = (byte) 0;
                            byte b38 = (byte) (b37 + 1);
                            Object[] objArr67 = new Object[1];
                            charlie(b37, b38, (byte) (b38 + 1), objArr67);
                            D88713 = uH18377.setPivotYN16904(gidForName, tapTimeout, gidForName2, 885907047, false, (String) objArr67[0], new Class[0]);
                        }
                        long longValue10 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                        long j69 = 1204245118;
                        long j70 = 614;
                        long elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                        long j71 = j69 ^ j5;
                        long j72 = (j71 | longValue10) ^ j5;
                        long j73 = longValue10 ^ j5;
                        long j74 = elapsedRealtime2 ^ j5;
                        j7 = ((j70 * ((((j71 | j73) | j74) ^ j5) | (((j74 | j69) | longValue10) ^ j5))) + (((-1228) * ((((j71 | j74) ^ j5) | j72) | ((j74 | longValue10) ^ j5))) + ((((elapsedRealtime2 | j72) | ((j73 | j69) ^ j5)) * j70) + (((-613) * longValue10) + (615 * j69))))) - 1356498216;
                        int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                        int i327 = ~elapsedRealtime3;
                        i37 = ((int) (j7 >> c3)) & ((((~(elapsedRealtime3 | 259329497)) | 1073758720 | (~(i327 | (-155191305)))) * 369) + (((~((-259329498) | i327)) | 1177896913) * (-369)) + (((1333088217 | i327) * (-369)) - 802173004));
                        myUid = Process.myUid();
                        i38 = ~(810457777 | myUid);
                        i39 = ~myUid;
                        if ((i37 | (((int) j7) & ((((~(myUid | 626768632)) | (~((-810457778) | i39))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~((-85008457) | i39)) * (-406)) + ((i38 | (~((-541760177) | i39))) * (-406)) + 1294392047))) == 1) {
                            Object[] objArr68 = {1};
                            Object D887119 = uH18377.D8871(-38624464);
                            if (D887119 == null) {
                                int myPid3 = (Process.myPid() >> 22) + 52;
                                int indexOf10 = TextUtils.indexOf("", "", 0, 0) + 2847;
                                char resolveSizeAndState2 = (char) (View.resolveSizeAndState(0, 0, 0) + 62567);
                                byte b39 = (byte) 0;
                                byte b40 = (byte) (b39 + 1);
                                Object[] objArr69 = new Object[1];
                                charlie(b39, b40, (byte) (b40 + 1), objArr69);
                                D887119 = uH18377.setPivotYN16904(myPid3, indexOf10, resolveSizeAndState2, 571015653, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                            }
                            long longValue11 = ((Long) ((Method) D887119).invoke(null, objArr68)).longValue();
                            long j75 = 243175723;
                            long j76 = (949 * longValue11) + ((-947) * j75);
                            long j77 = -948;
                            long j78 = j75 ^ j5;
                            long j79 = longValue11 ^ j5;
                            long freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                            long j80 = (948 * (j75 | j79)) + (j77 * (((j78 | j79) | (freeMemory2 ^ j5)) ^ j5)) + ((j78 | ((j79 | freeMemory2) ^ j5)) * j77) + j76 + 1748951043;
                            int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                            int i328 = ((int) (j80 >> c3)) & (((uptimeMillis2 | (-1247915169)) * 744) + (((~uptimeMillis2) | (-1609825717)) * 744) + (((~((-1340341413) | uptimeMillis2)) | 1247915168 | (~((-1517399473) | uptimeMillis2))) * (-744)) + 1587634074);
                            int i329 = ((int) j80) & ((((-1523353601) | i4) * 744) + ((86127190 | i79) * 744) + (((((~((-2061273090) | i4)) | 1523353600) | (~(624046679 | i4))) * (-744)) - 1587633331));
                            int i330 = ((i329 & i328) | (i328 ^ i329)) != 0 ? (i4 & (-221)) | (i79 & 220) : i4;
                            int i331 = i4 ^ i326;
                            int i332 = -i331;
                            int i333 = ((i331 & i332) | (i331 ^ i332)) >> 31;
                            int i334 = i330 & (~i333);
                            int i335 = i326 & i333;
                            int i336 = (i334 & i335) | (i334 ^ i335);
                            char c27 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i337 = 371 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int resolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0);
                            int i338 = (resolveSizeAndState3 ^ 23) + ((resolveSizeAndState3 & 23) << 1);
                            Object[] objArr70 = new Object[1];
                            bravo(c27, i337, i338, objArr70);
                            Object[] objArr71 = {(String) objArr70[0]};
                            Object D887120 = uH18377.D8871(-957097391);
                            if (D887120 == null) {
                                int lastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 53;
                                int alpha5 = Color.alpha(0) + 3158;
                                char offsetBefore3 = (char) (58074 - TextUtils.getOffsetBefore("", 0));
                                byte b41 = (byte) 1;
                                byte b42 = (byte) (b41 - 1);
                                Object[] objArr72 = new Object[1];
                                charlie(b41, b42, (byte) (b42 + 2), objArr72);
                                D887120 = uH18377.setPivotYN16904(lastIndexOf3, alpha5, offsetBefore3, 424179844, false, (String) objArr72[0], new Class[]{cls});
                            }
                            Object invoke2 = ((Method) D887120).invoke(null, objArr71);
                            if (invoke2 != null) {
                                Object[] objArr73 = {invoke2, 42};
                                Object D887121 = uH18377.D8871(2072770498);
                                if (D887121 == null) {
                                    int packedPositionType3 = 51 - ExpandableListView.getPackedPositionType(0L);
                                    int i339 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1208;
                                    char axisFromString = (char) (44355 - MotionEvent.axisFromString(""));
                                    byte b43 = (byte) 0;
                                    byte b44 = (byte) (b43 + 1);
                                    Object[] objArr74 = new Object[1];
                                    charlie(b43, b44, (byte) (b44 + 1), objArr74);
                                    D887121 = uH18377.setPivotYN16904(packedPositionType3, i339, axisFromString, -1540336361, false, (String) objArr74[0], new Class[]{cls, Integer.TYPE});
                                }
                                long longValue12 = ((Long) ((Method) D887121).invoke(null, objArr73)).longValue();
                                long j81 = 728989047;
                                long j82 = (111 * longValue12) + ((-109) * j81);
                                long j83 = j81 ^ j5;
                                long myPid4 = (longValue12 | Process.myPid()) ^ j5;
                                long j84 = ((110 * ((((longValue12 ^ j5) | j81) ^ j5) | ((j83 | longValue12) ^ j5))) + ((220 * (((j81 | longValue12) ^ j5) | myPid4)) + (((-220) * (j83 | myPid4)) + j82))) - 736434077;
                                int foxtrot2 = ((int) (j84 >> c3)) & A0.z.foxtrot((~((-1792431151) | i4)) | (~((-1065309735) | i4)), -1324, (((-2147440175) | i79) * 1324) - 818884594, -2096414544);
                                int i340 = (int) j84;
                                int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                if ((foxtrot2 | (i340 & ((((~(uptimeMillis3 | 1783988157)) | (~((-1213542041) | (~uptimeMillis3)))) * 338) + ((((570446117 | r9) | (~(1213542040 | uptimeMillis3))) * (-338)) - 1899967185)))) == 1986687685) {
                                    j10 = j26;
                                    i41 = i146;
                                    cls2 = cls;
                                    strArr3 = null;
                                    i42 = -1;
                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                    int i341 = (packedPositionChild2 ^ 892) + ((packedPositionChild2 & 892) << 1);
                                    int i342 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                    int i343 = ((i342 | 17) << 1) - (i342 ^ 17);
                                    Object[] objArr75 = new Object[1];
                                    bravo(longPressTimeout, i341, i343, objArr75);
                                    Object[] objArr76 = {(String) objArr75[0]};
                                    D88714 = uH18377.D8871(-957097391);
                                    if (D88714 == null) {
                                        int axisFromString2 = MotionEvent.axisFromString("") + 53;
                                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3158;
                                        char indexOf11 = (char) (TextUtils.indexOf("", "", 0) + 58074);
                                        byte b45 = (byte) 1;
                                        byte b46 = (byte) (b45 - 1);
                                        Object[] objArr77 = new Object[1];
                                        charlie(b45, b46, (byte) (b46 + 2), objArr77);
                                        D88714 = uH18377.setPivotYN16904(axisFromString2, offsetAfter, indexOf11, 424179844, false, (String) objArr77[0], new Class[]{cls2});
                                    }
                                    invoke = ((Method) D88714).invoke(null, objArr76);
                                    if (invoke != null) {
                                        int i344 = echo;
                                        int i345 = ((i344 | 81) << 1) - (i344 ^ 81);
                                        delta = i345 % 128;
                                        i48 = i345 % 2 != 0 ? 1 : 0;
                                        i47 = i336;
                                    } else {
                                        Object[] objArr78 = {invoke, 42};
                                        Object D887122 = uH18377.D8871(2072770498);
                                        if (D887122 == null) {
                                            int fadingEdgeLength = 51 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int doubleTapTimeout2 = 1209 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            char packedPositionChild3 = (char) (44355 - ExpandableListView.getPackedPositionChild(0L));
                                            byte b47 = (byte) 0;
                                            byte b48 = (byte) (b47 + 1);
                                            Object[] objArr79 = new Object[1];
                                            charlie(b47, b48, (byte) (b48 + 1), objArr79);
                                            D887122 = uH18377.setPivotYN16904(fadingEdgeLength, doubleTapTimeout2, packedPositionChild3, -1540336361, false, (String) objArr79[0], new Class[]{cls2, Integer.TYPE});
                                        }
                                        long longValue13 = ((Long) ((Method) D887122).invoke(null, objArr78)).longValue();
                                        long j85 = 250941903;
                                        long j86 = 988;
                                        long j87 = longValue13 ^ j5;
                                        long myUid4 = Process.myUid();
                                        long j88 = myUid4 ^ j5;
                                        i47 = i336;
                                        long j89 = ((j86 * (((((j85 ^ j5) | j87) ^ j5) | ((j87 | myUid4) ^ j5)) | (((j88 | j85) | longValue13) ^ j5))) + (((-988) * (j85 | j87)) + ((((((j87 | j88) | j85) ^ j5) | (((j85 | longValue13) | myUid4) ^ j5)) * j86) + (((-987) * longValue13) + (989 * j85))))) - 258386933;
                                        int i346 = ((int) (j89 >> c3)) & ((((~((-573899436) | i79)) | (~((-4194369) | i4)) | (~((-285233173) | i4))) * 867) + (((~((-578093804) | i4)) | 573899435 | (~((-859132608) | i4))) * (-1734)) + (((~((-578093804) | i79)) | (~((-859132608) | i79))) * (-867)) + 1972008040);
                                        int i347 = ((int) j89) & ((((~((~Process.myPid()) | (-2112663646))) | 675287057) * 191) + ((((~((-2112663646) | r3)) | 675437235) * 191) - 1388549787));
                                        i48 = (i346 ^ i347) | (i346 & i347);
                                    }
                                    if (i48 != 1986687685) {
                                        int i348 = ~((1023655418 & i4) | (1023655418 ^ i4));
                                        int i349 = ((i348 & (-2138570235)) | ((-2138570235) ^ i348) | (~(1249312008 | i4))) * (-754);
                                        int i350 = (100167735 ^ i349) + ((i349 & 100167735) << 1);
                                        int i351 = ~((2138570234 & i4) | (2138570234 ^ i4));
                                        int i352 = (i41 & (-1023655419)) | (i41 ^ (-1023655419));
                                        int i353 = ~((1249312008 & i352) | (i352 ^ 1249312008));
                                        int i354 = ((i351 & i353) | (i351 ^ i353)) * (-754);
                                        int i355 = (((1023655418 & i41) | (1023655418 ^ i41)) * 754) + (((i350 | i354) << 1) - (i354 ^ i350));
                                        int alpha6 = C1211g1.alpha();
                                        int i356 = ~alpha6;
                                        int i357 = ~((i356 & 122552455) | (122552455 ^ i356));
                                        int i358 = ~alpha6;
                                        int i359 = ~(((-1507087046) ^ i358) | ((-1507087046) & i358));
                                        int i360 = -(-(((i357 & i359) | (i357 ^ i359)) * (-867)));
                                        int i361 = ((-814819628) ^ i360) + ((i360 & (-814819628)) << 1);
                                        int i362 = ~(122552455 | alpha6);
                                        int i363 = (i362 & 1485853248) | (1485853248 ^ i362);
                                        int i364 = ~(((-1507087046) ^ alpha6) | ((-1507087046) & alpha6));
                                        int i365 = ((i363 & i364) | (i363 ^ i364)) * (-1734);
                                        if (i355 > (((~((alpha6 & (-21233798)) | ((-21233798) ^ alpha6))) | (~((-1485853249) | i358)) | (~(1608405703 | alpha6))) * 867) + (i361 & i365) + (i365 | i361)) {
                                            throw null;
                                        }
                                        if (i48 != -1514516938) {
                                            int i366 = echo;
                                            delta = ((i366 & 81) + (i366 | 81)) % 128;
                                            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                            int indexOf12 = TextUtils.indexOf((CharSequence) "", '0') + 1611;
                                            int i367 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                            int i368 = ((i367 | 13) << 1) - (i367 ^ 13);
                                            Object[] objArr80 = new Object[1];
                                            bravo(scrollBarSize2, indexOf12, i368, objArr80);
                                            String str32 = (String) objArr80[0];
                                            int i369 = -(-MotionEvent.axisFromString(""));
                                            int i370 = 1624 - (~(-(-TextUtils.lastIndexOf("", '0', 0))));
                                            int i371 = -(Process.myPid() >> 22);
                                            int i372 = (i371 ^ 26) + ((i371 & 26) << 1);
                                            Object[] objArr81 = new Object[1];
                                            bravo((char) (((i369 | 45017) << 1) - (i369 ^ 45017)), i370, i372, objArr81);
                                            String str33 = (String) objArr81[0];
                                            char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i373 = -Color.rgb(0, 0, 0);
                                            int i374 = (i373 & (-16775566)) + (i373 | (-16775566));
                                            int i375 = -TextUtils.indexOf("", "");
                                            int i376 = (i375 & 17) + (i375 | 17);
                                            Object[] objArr82 = new Object[1];
                                            bravo(maximumDrawingCacheSize2, i374, i376, objArr82);
                                            String str34 = (String) objArr82[0];
                                            char c28 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 60377);
                                            int i377 = 1666 - (~(-View.MeasureSpec.getMode(0)));
                                            int i378 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i379 = (i378 ^ 16) + ((i378 & 16) << 1);
                                            Object[] objArr83 = new Object[1];
                                            bravo(c28, i377, i379, objArr83);
                                            String str35 = (String) objArr83[0];
                                            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int myTid3 = 1684 - (Process.myTid() >> 22);
                                            int i380 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int i381 = (i380 & 16) + (i380 | 16);
                                            Object[] objArr84 = new Object[1];
                                            bravo(scrollDefaultDelay2, myTid3, i381, objArr84);
                                            String str36 = (String) objArr84[0];
                                            char c29 = (char) (45362 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                                            int i382 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            Object[] objArr85 = new Object[1];
                                            bravo(c29, (i382 & 1699) + (i382 | 1699), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr85);
                                            String str37 = (String) objArr85[0];
                                            char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                                            int i383 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int i384 = (i383 & 1737) + (i383 | 1737);
                                            int i385 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                            int i386 = (i385 & 12) + (i385 | 12);
                                            Object[] objArr86 = new Object[1];
                                            bravo(trimmedLength3, i384, i386, objArr86);
                                            String str38 = (String) objArr86[0];
                                            char packedPositionType4 = (char) ExpandableListView.getPackedPositionType(0L);
                                            int i387 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                            Object[] objArr87 = new Object[1];
                                            bravo(packedPositionType4, (i387 ^ 1748) + ((i387 & 1748) << 1), 12 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr87);
                                            String str39 = (String) objArr87[0];
                                            int i388 = -Process.getGidForName("");
                                            int i389 = -(ViewConfiguration.getTapTimeout() >> 16);
                                            int i390 = (i389 * HttpConstants.HTTP_BLOCKED) - 788928;
                                            int i391 = ~i389;
                                            int i392 = (i391 & 1761) | (i391 ^ 1761);
                                            int i393 = ~i392;
                                            int i394 = (-1762) | i389;
                                            int i395 = ~((i394 & i4) | (i394 ^ i4));
                                            int i396 = (((i393 & i395) | (i393 ^ i395)) * 449) + i390;
                                            int i397 = ~i389;
                                            int i398 = (~((i397 & 1761) | (i397 ^ 1761))) * (-1347);
                                            int i399 = (i396 ^ i398) + ((i398 & i396) << 1);
                                            int i400 = ~i392;
                                            int i401 = ((-1762) ^ i79) | ((-1762) & i79);
                                            int i402 = ~((i389 & i401) | (i401 ^ i389));
                                            Object[] objArr88 = new Object[1];
                                            bravo((char) ((i388 ^ (-1)) + (i388 << 1)), (((i402 & i400) | (i400 ^ i402)) * 449) + i399, 20 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr88);
                                            String str40 = (String) objArr88[0];
                                            int i403 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                            int i404 = 1782 - (~(-View.getDefaultSize(0, 0)));
                                            int i405 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int i406 = (i405 ^ 31) + ((i405 & 31) << 1);
                                            Object[] objArr89 = new Object[1];
                                            bravo((char) ((i403 ^ 56347) + ((i403 & 56347) << 1)), i404, i406, objArr89);
                                            String str41 = (String) objArr89[0];
                                            char combineMeasuredStates2 = (char) (28353 - View.combineMeasuredStates(0, 0));
                                            int i407 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i408 = (i407 & 1814) + (i407 | 1814);
                                            int i409 = -TextUtils.getTrimmedLength("");
                                            int i410 = ((i409 | 12) << 1) - (i409 ^ 12);
                                            Object[] objArr90 = new Object[1];
                                            bravo(combineMeasuredStates2, i408, i410, objArr90);
                                            String str42 = (String) objArr90[0];
                                            Object[] objArr91 = new Object[1];
                                            bravo((char) (18913 - (~AndroidCharacter.getMirror('0'))), 1825 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), 10 - (~(-TextUtils.lastIndexOf("", '0', 0))), objArr91);
                                            String str43 = (String) objArr91[0];
                                            Object[] objArr92 = new Object[1];
                                            bravo((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1837 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), MotionEvent.axisFromString("") + 13, objArr92);
                                            String str44 = (String) objArr92[0];
                                            char mode = (char) View.MeasureSpec.getMode(0);
                                            int i411 = 1851 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            int i412 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                            int i413 = (i412 & 12) + (i412 | 12);
                                            Object[] objArr93 = new Object[1];
                                            bravo(mode, i411, i413, objArr93);
                                            String str45 = (String) objArr93[0];
                                            char c30 = (char) (0 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                                            int i414 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            int i415 = (i414 & 1862) + (i414 | 1862);
                                            int i416 = -(-Color.green(0));
                                            int i417 = (i416 ^ 12) + ((i416 & 12) << 1);
                                            Object[] objArr94 = new Object[1];
                                            bravo(c30, i415, i417, objArr94);
                                            String str46 = (String) objArr94[0];
                                            char c31 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i418 = -AndroidCharacter.getMirror('0');
                                            Object[] objArr95 = new Object[1];
                                            bravo(c31, (i418 ^ 1922) + ((i418 & 1922) << 1), 13 - ExpandableListView.getPackedPositionChild(0L), objArr95);
                                            String str47 = (String) objArr95[0];
                                            int deadChar2 = KeyEvent.getDeadChar(0, 0);
                                            int i419 = -(-View.combineMeasuredStates(0, 0));
                                            int i420 = (i419 & 1888) + (i419 | 1888);
                                            int i421 = -TextUtils.indexOf("", "", 0);
                                            int i422 = (i421 ^ 12) + ((i421 & 12) << 1);
                                            Object[] objArr96 = new Object[1];
                                            bravo((char) ((deadChar2 & 49158) + (deadChar2 | 49158)), i420, i422, objArr96);
                                            String str48 = (String) objArr96[0];
                                            Object[] objArr97 = new Object[1];
                                            bravo((char) (53463 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1900 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr97);
                                            int i423 = 0;
                                            String str49 = (String) objArr97[0];
                                            int i424 = 1;
                                            Object[] objArr98 = new Object[1];
                                            bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1924 - Color.red(0), 28 - ExpandableListView.getPackedPositionGroup(0L), objArr98);
                                            String[] strArr15 = {str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, (String) objArr98[0]};
                                            int i425 = 0;
                                            int i426 = i13;
                                            while (i425 < i426) {
                                                String str50 = strArr15[i425];
                                                Object[] objArr99 = new Object[i424];
                                                objArr99[i423] = str50;
                                                Object D887123 = uH18377.D8871(1565484532);
                                                if (D887123 == null) {
                                                    int size2 = View.MeasureSpec.getSize(i423) + 52;
                                                    int mode2 = 2951 - View.MeasureSpec.getMode(i423);
                                                    char gidForName3 = (char) (Process.getGidForName("") + 1);
                                                    byte b49 = (byte) i423;
                                                    byte b50 = (byte) (b49 + 1);
                                                    Object[] objArr100 = new Object[1];
                                                    charlie(b49, b50, (byte) (b50 + 1), objArr100);
                                                    String str51 = (String) objArr100[i423];
                                                    Class[] clsArr2 = new Class[1];
                                                    clsArr2[i423] = cls2;
                                                    D887123 = uH18377.setPivotYN16904(size2, mode2, gidForName3, -2097887455, false, str51, clsArr2);
                                                }
                                                long longValue14 = ((Long) ((Method) D887123).invoke(null, objArr99)).longValue();
                                                long j90 = -908108140;
                                                String[] strArr16 = strArr15;
                                                int i427 = i425;
                                                long j91 = (int) Runtime.getRuntime().totalMemory();
                                                long j92 = j90 ^ j5;
                                                long j93 = ((-381) * (longValue14 | j91 | j92)) + (382 * longValue14) + ((-380) * j90);
                                                long j94 = 381;
                                                long j95 = (j94 * ((j92 | longValue14) ^ j5)) + ((((j92 | (longValue14 ^ j5)) ^ j5) | (((j91 ^ j5) | longValue14) ^ j5) | ((j90 | longValue14) ^ j5)) * j94) + j93 + 1863262042;
                                                int foxtrot3 = ((int) (j95 >> c3)) & A0.z.foxtrot(761262938 | i79, -828, (((~(761262938 | i79)) | 675963472) * (-828)) + 1754752898, 1034479020);
                                                int i428 = ((int) j95) & ((((~(i79 | 1402861539)) | (~(1454879346 | i4))) * 950) + (((~(i79 | 1454879346)) | (~(1402861539 | i4))) * (-950)) + ((((~((-1402861540) | i79)) | (~((-1454879347) | i4))) * 1900) - 1871736089));
                                                if (((i428 & foxtrot3) | (foxtrot3 ^ i428)) == 0) {
                                                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                    int i429 = 1873 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    int scrollBarFadeDuration5 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                    int i430 = (scrollBarFadeDuration5 ^ 14) + ((scrollBarFadeDuration5 & 14) << 1);
                                                    Object[] objArr101 = new Object[1];
                                                    bravo(maxKeyCode2, i429, i430, objArr101);
                                                    if (str50.equals((String) objArr101[0])) {
                                                        int i431 = delta;
                                                        echo = ((i431 & 55) + (i431 | 55)) % 128;
                                                        Object[] objArr102 = {str50};
                                                        Object D887124 = uH18377.D8871(1979478258);
                                                        if (D887124 == null) {
                                                            int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 52;
                                                            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2951;
                                                            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                            byte b51 = (byte) 1;
                                                            byte b52 = (byte) (b51 - 1);
                                                            Object[] objArr103 = new Object[1];
                                                            charlie(b51, b52, b52, objArr103);
                                                            D887124 = uH18377.setPivotYN16904(absoluteGravity3, windowTouchSlop4, tapTimeout2, -1438133721, false, (String) objArr103[0], new Class[]{cls2});
                                                        }
                                                        long longValue15 = ((Long) ((Method) D887124).invoke(null, objArr102)).longValue();
                                                        long j96 = -39618158;
                                                        long j97 = (334 * longValue15) + ((-665) * j96);
                                                        long j98 = j96 ^ j5;
                                                        long j99 = ((-333) * j98) + j97;
                                                        long j100 = 333;
                                                        long j101 = (j100 * (((j30 | longValue15) ^ j5) | ((j98 | j10) ^ j5))) + ((((j98 | j30) ^ j5) | ((longValue15 | j10) ^ j5)) * j100) + j99 + 814439464;
                                                        if (((((int) (j101 >> c3)) & ((((~((~ad.romeo()) | (-1073763361))) | 285868036) * 241) + ((((~(1034922780 | r2)) | (-2108686141)) * (-241)) - 124712583))) | (((int) j101) & ((((-1456111681) | i4) * 744) + ((18885270 | i79) * 744) + (((((~((-2127287618) | i4)) | 1456111680) | (~(690061207 | i4))) * (-744)) - 1587633331)))) != 0) {
                                                        }
                                                    }
                                                    i425 = ((i427 | 1) << 1) - (i427 ^ 1);
                                                    strArr15 = strArr16;
                                                    i426 = 19;
                                                    i423 = 0;
                                                    i424 = 1;
                                                }
                                                i57 = i427;
                                                break;
                                            }
                                            i57 = i42;
                                            int i432 = ((i57 ^ 130) + ((i57 & 130) << 1)) ^ i4;
                                            int i433 = ~i57;
                                            int i434 = -i433;
                                            int i435 = ((i433 & i434) | (i433 ^ i434)) >> 31;
                                            int i436 = (i435 & i432) | ((~i435) & i4);
                                            int i437 = (~(i4 & i47)) & (i4 | i47);
                                            int i438 = -i437;
                                            int i439 = ((i437 & i438) | (i437 ^ i438)) >> 31;
                                            i49 = (i436 & (~i439)) | (i47 & i439);
                                            char c32 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i440 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            Object[] objArr104 = new Object[1];
                                            bravo(c32, (i440 ^ 1952) + ((i440 & 1952) << 1), Process.getGidForName("") + 14, objArr104);
                                            String str52 = (String) objArr104[0];
                                            int green3 = Color.green(0);
                                            int i441 = -(KeyEvent.getMaxKeyCode() >> 16);
                                            Object[] objArr105 = new Object[1];
                                            bravo((char) (((green3 | 62188) << 1) - (green3 ^ 62188)), ((i441 | 1965) << 1) - (i441 ^ 1965), 4 - (~(-Color.blue(0))), objArr105);
                                            String[] strArr17 = {str52, (String) objArr105[0]};
                                            char c33 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i442 = -(-TextUtils.getTrimmedLength(""));
                                            Object[] objArr106 = new Object[1];
                                            bravo(c33, (i442 & 1970) + (i442 | 1970), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr106);
                                            String str53 = (String) objArr106[0];
                                            Object[] objArr107 = new Object[1];
                                            bravo((char) Color.red(0), 1985 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr107);
                                            String str54 = (String) objArr107[0];
                                            char c34 = (char) (11659 - (~TextUtils.indexOf((CharSequence) "", '0')));
                                            int i443 = -AndroidCharacter.getMirror('0');
                                            int i444 = (i443 & 2052) + (i443 | 2052);
                                            int i445 = -(-View.MeasureSpec.getMode(0));
                                            int i446 = ((i445 | 14) << 1) - (i445 ^ 14);
                                            Object[] objArr108 = new Object[1];
                                            bravo(c34, i444, i446, objArr108);
                                            String[] strArr18 = {str53, str54, (String) objArr108[0]};
                                            char rgb4 = (char) ((-16738289) - Color.rgb(0, 0, 0));
                                            int resolveSize = 2018 - View.resolveSize(0, 0);
                                            int i447 = -TextUtils.lastIndexOf("", '0');
                                            int i448 = ((i447 | 20) << 1) - (i447 ^ 20);
                                            Object[] objArr109 = new Object[1];
                                            bravo(rgb4, resolveSize, i448, objArr109);
                                            String str55 = (String) objArr109[0];
                                            int i449 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int i450 = -(-AndroidCharacter.getMirror('0'));
                                            Object[] objArr110 = new Object[1];
                                            bravo((char) ((i449 ^ 57614) + ((i449 & 57614) << 1)), (i450 & 1991) + (i450 | 1991), 10 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr110);
                                            String[] strArr19 = {str55, (String) objArr110[0]};
                                            char c35 = (char) (47 - (~(-AndroidCharacter.getMirror('0'))));
                                            int i451 = -(ViewConfiguration.getTouchSlop() >> 8);
                                            int alpha7 = C1211g1.alpha();
                                            int i452 = i451 * 46;
                                            int i453 = (i452 ^ 94254) + ((i452 & 94254) << 1);
                                            int i454 = ~alpha7;
                                            int i455 = ~(((-2050) ^ i454) | ((-2050) & i454));
                                            int i456 = -(-(((i451 ^ i455) | (i455 & i451)) * (-90)));
                                            int i457 = (i453 & i456) + (i453 | i456);
                                            int i458 = ((~(((-2050) ^ alpha7) | ((-2050) & alpha7))) | (~((i451 ^ 2049) | (i451 & 2049)))) * (-45);
                                            int i459 = (i457 ^ i458) + ((i457 & i458) << 1);
                                            int i460 = ~i451;
                                            int i461 = ~((i460 ^ alpha7) | (i460 & alpha7));
                                            int i462 = ((-2050) ^ i461) | (i461 & (-2050));
                                            int i463 = ~((i451 & i454) | (i454 ^ i451));
                                            int i464 = ((i462 & i463) | (i462 ^ i463)) * 45;
                                            Object[] objArr111 = new Object[1];
                                            bravo(c35, (i459 & i464) + (i464 | i459), 11 - View.MeasureSpec.getSize(0), objArr111);
                                            String str56 = (String) objArr111[0];
                                            int i465 = -(-TextUtils.indexOf("", ""));
                                            int i466 = -KeyEvent.getDeadChar(0, 0);
                                            int i467 = ((i466 | 587) << 1) - (i466 ^ 587);
                                            int i468 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            int i469 = (i468 & 7) + (i468 | 7);
                                            Object[] objArr112 = new Object[1];
                                            bravo((char) (((i465 | 52843) << 1) - (i465 ^ 52843)), i467, i469, objArr112);
                                            String[] strArr20 = {str56, (String) objArr112[0]};
                                            char c36 = (char) (30127 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                            int green4 = Color.green(0);
                                            int alpha8 = C1211g1.alpha();
                                            int i470 = green4 * 491;
                                            int i471 = (i470 & (-1007340)) + (i470 | (-1007340));
                                            int i472 = ~green4;
                                            int i473 = (i472 ^ (-2061)) | (i472 & (-2061));
                                            int i474 = ~alpha8;
                                            int i475 = (i472 * 490) + ((((((i473 ^ i474) | (i473 & i474)) * (-490)) + i471) - (~(((~(((-2061) ^ green4) | (green4 & (-2061)))) | (~(((-2061) ^ alpha8) | (alpha8 & (-2061))))) * 490))) - 1);
                                            int i476 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                            int i477 = (i476 ^ 28) + ((i476 & 28) << 1);
                                            Object[] objArr113 = new Object[1];
                                            bravo(c36, i475, i477, objArr113);
                                            String str57 = (String) objArr113[0];
                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                            int resolveSizeAndState4 = View.resolveSizeAndState(0, 0, 0) + 2039;
                                            int i478 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                            c11 = 0;
                                            i50 = 1;
                                            Object[] objArr114 = new Object[1];
                                            bravo((char) (((packedPositionGroup | 57615) << 1) - (packedPositionGroup ^ 57615)), resolveSizeAndState4, (i478 & 10) + (i478 | 10), objArr114);
                                            String[][] strArr21 = {strArr17, strArr18, strArr19, strArr20, new String[]{str57, (String) objArr114[0]}};
                                            i51 = 0;
                                            i52 = i42;
                                            while (true) {
                                                if (i51 >= 5) {
                                                    i53 = i49;
                                                    i54 = i4;
                                                    break;
                                                }
                                                String[] strArr22 = strArr21[i51];
                                                String str58 = strArr22[c11];
                                                String[] strArr23 = (String[]) Arrays.copyOfRange(strArr22, i50, strArr22.length);
                                                int length = strArr23.length;
                                                int i479 = i52;
                                                int i480 = 0;
                                                while (i480 < length) {
                                                    String str59 = strArr23[i480];
                                                    int i481 = i479 + 1;
                                                    File file4 = new File(str58);
                                                    i53 = i49;
                                                    if (file4.exists() == i50 && file4.isFile()) {
                                                        try {
                                                            Scanner scanner2 = new Scanner(new FileInputStream(file4));
                                                            char keyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                            int i482 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            i56 = i51;
                                                            int i483 = ((i482 | 594) << 1) - (i482 ^ 594);
                                                            try {
                                                                int i484 = -KeyEvent.keyCodeFromString("");
                                                                int i485 = ((i484 | 2) << 1) - (i484 ^ 2);
                                                                Object[] objArr115 = new Object[1];
                                                                strArr4 = strArr23;
                                                                try {
                                                                    bravo(keyCodeFromString, i483, i485, objArr115);
                                                                    Scanner useDelimiter3 = scanner2.useDelimiter((String) objArr115[0]);
                                                                    if (useDelimiter3.hasNext()) {
                                                                        str5 = useDelimiter3.next();
                                                                        C1211g1.alpha();
                                                                    } else {
                                                                        str5 = "";
                                                                    }
                                                                    useDelimiter3.close();
                                                                } catch (IOException unused2) {
                                                                    continue;
                                                                }
                                                            } catch (IOException unused3) {
                                                            }
                                                        } catch (IOException unused4) {
                                                        }
                                                        if (str5.contains(str59)) {
                                                            int i486 = echo;
                                                            int i487 = (((i486 | 95) << 1) - (i486 ^ 95)) % 128;
                                                            delta = i487;
                                                            int i488 = (i487 ^ 87) + ((i487 & 87) << 1);
                                                            echo = i488 % 128;
                                                            if (i488 % 2 == 0) {
                                                                int i489 = i481 * 13041;
                                                                i54 = (~(i4 & i489)) & (i4 | i489);
                                                            } else {
                                                                int i490 = i479 + 171;
                                                                i54 = ((~i490) & i4) | (i490 & i79);
                                                            }
                                                        } else {
                                                            int i491 = delta;
                                                            i50 = 1;
                                                            echo = ((i491 ^ 97) + ((i491 & 97) << 1)) % 128;
                                                            i480 = (i480 ^ 1) + ((i480 & 1) << 1);
                                                            i49 = i53;
                                                            strArr23 = strArr4;
                                                            i479 = i481;
                                                            i51 = i56;
                                                        }
                                                    }
                                                    i56 = i51;
                                                    strArr4 = strArr23;
                                                    int i4912 = delta;
                                                    i50 = 1;
                                                    echo = ((i4912 ^ 97) + ((i4912 & 97) << 1)) % 128;
                                                    i480 = (i480 ^ 1) + ((i480 & 1) << 1);
                                                    i49 = i53;
                                                    strArr23 = strArr4;
                                                    i479 = i481;
                                                    i51 = i56;
                                                }
                                                int i492 = i51;
                                                i51 = ((i492 & 1) << i50) + (i492 ^ 1);
                                                i49 = i49;
                                                i52 = i479;
                                                i50 = 1;
                                                c11 = 0;
                                            }
                                            int i493 = (~(i4 & i53)) & (i4 | i53);
                                            int i494 = (i493 | (-i493)) >> 31;
                                            int i495 = i54 & (~i494);
                                            int i496 = i53 & i494;
                                            int i497 = (i495 & i496) | (i495 ^ i496);
                                            char indexOf13 = (char) (46603 - TextUtils.indexOf("", "", 0));
                                            int i498 = 2087 - (~(-Color.argb(0, 0, 0, 0)));
                                            int resolveSize2 = View.resolveSize(0, 0);
                                            int i499 = (resolveSize2 ^ 13) + ((resolveSize2 & 13) << 1);
                                            Object[] objArr116 = new Object[1];
                                            bravo(indexOf13, i498, i499, objArr116);
                                            String str60 = (String) objArr116[0];
                                            char indexOf14 = (char) TextUtils.indexOf("", "", 0);
                                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2101;
                                            int indexOf15 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                            int i500 = (indexOf15 ^ 9) + ((indexOf15 & 9) << 1);
                                            Object[] objArr117 = new Object[1];
                                            bravo(indexOf14, offsetAfter2, i500, objArr117);
                                            String str61 = (String) objArr117[0];
                                            file3 = new File(str60);
                                            if (file3.exists()) {
                                                int i501 = delta;
                                                int i502 = (i501 ^ 39) + ((i501 & 39) << 1);
                                                echo = i502 % 128;
                                                if (i502 % 2 == 0) {
                                                    int i503 = 40 / 0;
                                                }
                                                try {
                                                    Scanner scanner3 = new Scanner(new FileInputStream(file3));
                                                    char alpha9 = (char) Color.alpha(0);
                                                    int i504 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int i505 = (i504 & 593) + (i504 | 593);
                                                    int i506 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                                    int i507 = ((i506 | 3) << 1) - (i506 ^ 3);
                                                    Object[] objArr118 = new Object[1];
                                                    bravo(alpha9, i505, i507, objArr118);
                                                    Scanner useDelimiter4 = scanner3.useDelimiter((String) objArr118[0]);
                                                    if (useDelimiter4.hasNext()) {
                                                        int i508 = delta;
                                                        int i509 = (i508 & 99) + (i508 | 99);
                                                        echo = i509 % 128;
                                                        if (i509 % 2 == 0) {
                                                            str4 = useDelimiter4.next();
                                                            int i510 = 79 / 0;
                                                        } else {
                                                            str4 = useDelimiter4.next();
                                                        }
                                                    } else {
                                                        str4 = "";
                                                    }
                                                    useDelimiter4.close();
                                                } catch (IOException unused5) {
                                                }
                                                if (str4.contains(str61)) {
                                                    int i511 = echo;
                                                    int i512 = i511 + 43;
                                                    delta = i512 % 128;
                                                    if (i512 % 2 == 0) {
                                                        delta = ((i511 & 39) + (i511 | 39)) % 128;
                                                        int i513 = i4 & (-151);
                                                        int i514 = i79 & 150;
                                                        i55 = i513 | i514;
                                                        int i515 = ((~i497) & i4) | (i497 & i79);
                                                        int i516 = -i515;
                                                        int i517 = ((i515 & i516) | (i515 ^ i516)) >> 31;
                                                        int i518 = i55 & (~i517);
                                                        int i519 = i497 & i517;
                                                        int i520 = (i519 & i518) | (i518 ^ i519);
                                                        Object[] objArr119 = new Object[1];
                                                        bravo((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2109 - (ViewConfiguration.getScrollBarSize() >> 8), 47 - (ViewConfiguration.getTouchSlop() >> 8), objArr119);
                                                        Object[] objArr120 = {(String) objArr119[0]};
                                                        D88715 = uH18377.D8871(1979478258);
                                                        if (D88715 == null) {
                                                            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 52;
                                                            int indexOf16 = 2951 - TextUtils.indexOf("", "");
                                                            char blue = (char) Color.blue(0);
                                                            byte b53 = (byte) 1;
                                                            byte b54 = (byte) (b53 - 1);
                                                            Object[] objArr121 = new Object[1];
                                                            charlie(b53, b54, b54, objArr121);
                                                            D88715 = uH18377.setPivotYN16904(touchSlop2, indexOf16, blue, -1438133721, false, (String) objArr121[0], new Class[]{cls2});
                                                        }
                                                        long longValue16 = ((Long) ((Method) D88715).invoke(null, objArr120)).longValue();
                                                        long j102 = 54083668;
                                                        long j103 = 988;
                                                        long j104 = longValue16 ^ j5;
                                                        long myPid5 = Process.myPid();
                                                        long j105 = myPid5 ^ j5;
                                                        long j106 = (j103 * (((longValue16 | (j105 | j102)) ^ j5) | (((j102 ^ j5) | j104) ^ j5) | ((j104 | myPid5) ^ j5))) + ((-988) * (j102 | j104)) + (((((j104 | j105) | j102) ^ j5) | (((j102 | longValue16) | myPid5) ^ j5)) * j103) + ((-987) * longValue16) + (989 * j102) + 720737638;
                                                        int tango3 = ad.tango(212722897);
                                                        int i521 = ((((int) (j106 >> c3)) & ((((~(tango3 | (-135287049))) | 574881824) * 366) + (((~((-498815818) | tango3)) | 938410593) * (-366)) + 1344769688)) | (((int) j106) & (((~((-710544391) | i4)) * 283) + ((((~((-786041864) | i4)) | 75497473) * (-283)) - 1546278032)))) * 263;
                                                        int i522 = i4 ^ i520;
                                                        int i523 = -i522;
                                                        int i524 = ((i522 & i523) | (i522 ^ i523)) >> 31;
                                                        int i525 = ((i521 & i79) | ((~i521) & i4)) & (~i524);
                                                        int i526 = i520 & i524;
                                                        i40 = (i526 & i525) | (i525 ^ i526);
                                                        strArr2 = strArr3;
                                                    }
                                                }
                                            }
                                            i55 = i4;
                                            int i5152 = ((~i497) & i4) | (i497 & i79);
                                            int i5162 = -i5152;
                                            int i5172 = ((i5152 & i5162) | (i5152 ^ i5162)) >> 31;
                                            int i5182 = i55 & (~i5172);
                                            int i5192 = i497 & i5172;
                                            int i5202 = (i5192 & i5182) | (i5182 ^ i5192);
                                            Object[] objArr1192 = new Object[1];
                                            bravo((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2109 - (ViewConfiguration.getScrollBarSize() >> 8), 47 - (ViewConfiguration.getTouchSlop() >> 8), objArr1192);
                                            Object[] objArr1202 = {(String) objArr1192[0]};
                                            D88715 = uH18377.D8871(1979478258);
                                            if (D88715 == null) {
                                            }
                                            long longValue162 = ((Long) ((Method) D88715).invoke(null, objArr1202)).longValue();
                                            long j1022 = 54083668;
                                            long j1032 = 988;
                                            long j1042 = longValue162 ^ j5;
                                            long myPid52 = Process.myPid();
                                            long j1052 = myPid52 ^ j5;
                                            long j1062 = (j1032 * (((longValue162 | (j1052 | j1022)) ^ j5) | (((j1022 ^ j5) | j1042) ^ j5) | ((j1042 | myPid52) ^ j5))) + ((-988) * (j1022 | j1042)) + (((((j1042 | j1052) | j1022) ^ j5) | (((j1022 | longValue162) | myPid52) ^ j5)) * j1032) + ((-987) * longValue162) + (989 * j1022) + 720737638;
                                            int tango32 = ad.tango(212722897);
                                            int i5212 = ((((int) (j1062 >> c3)) & ((((~(tango32 | (-135287049))) | 574881824) * 366) + (((~((-498815818) | tango32)) | 938410593) * (-366)) + 1344769688)) | (((int) j1062) & (((~((-710544391) | i4)) * 283) + ((((~((-786041864) | i4)) | 75497473) * (-283)) - 1546278032)))) * 263;
                                            int i5222 = i4 ^ i5202;
                                            int i5232 = -i5222;
                                            int i5242 = ((i5222 & i5232) | (i5222 ^ i5232)) >> 31;
                                            int i5252 = ((i5212 & i79) | ((~i5212) & i4)) & (~i5242);
                                            int i5262 = i5202 & i5242;
                                            i40 = (i5262 & i5252) | (i5252 ^ i5262);
                                            strArr2 = strArr3;
                                        }
                                    }
                                    i49 = i47;
                                    char c322 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i4402 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    Object[] objArr1042 = new Object[1];
                                    bravo(c322, (i4402 ^ 1952) + ((i4402 & 1952) << 1), Process.getGidForName("") + 14, objArr1042);
                                    String str522 = (String) objArr1042[0];
                                    int green32 = Color.green(0);
                                    int i4412 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    Object[] objArr1052 = new Object[1];
                                    bravo((char) (((green32 | 62188) << 1) - (green32 ^ 62188)), ((i4412 | 1965) << 1) - (i4412 ^ 1965), 4 - (~(-Color.blue(0))), objArr1052);
                                    String[] strArr172 = {str522, (String) objArr1052[0]};
                                    char c332 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i4422 = -(-TextUtils.getTrimmedLength(""));
                                    Object[] objArr1062 = new Object[1];
                                    bravo(c332, (i4422 & 1970) + (i4422 | 1970), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr1062);
                                    String str532 = (String) objArr1062[0];
                                    Object[] objArr1072 = new Object[1];
                                    bravo((char) Color.red(0), 1985 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr1072);
                                    String str542 = (String) objArr1072[0];
                                    char c342 = (char) (11659 - (~TextUtils.indexOf((CharSequence) "", '0')));
                                    int i4432 = -AndroidCharacter.getMirror('0');
                                    int i4442 = (i4432 & 2052) + (i4432 | 2052);
                                    int i4452 = -(-View.MeasureSpec.getMode(0));
                                    int i4462 = ((i4452 | 14) << 1) - (i4452 ^ 14);
                                    Object[] objArr1082 = new Object[1];
                                    bravo(c342, i4442, i4462, objArr1082);
                                    String[] strArr182 = {str532, str542, (String) objArr1082[0]};
                                    char rgb42 = (char) ((-16738289) - Color.rgb(0, 0, 0));
                                    int resolveSize3 = 2018 - View.resolveSize(0, 0);
                                    int i4472 = -TextUtils.lastIndexOf("", '0');
                                    int i4482 = ((i4472 | 20) << 1) - (i4472 ^ 20);
                                    Object[] objArr1092 = new Object[1];
                                    bravo(rgb42, resolveSize3, i4482, objArr1092);
                                    String str552 = (String) objArr1092[0];
                                    int i4492 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int i4502 = -(-AndroidCharacter.getMirror('0'));
                                    Object[] objArr1102 = new Object[1];
                                    bravo((char) ((i4492 ^ 57614) + ((i4492 & 57614) << 1)), (i4502 & 1991) + (i4502 | 1991), 10 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr1102);
                                    String[] strArr192 = {str552, (String) objArr1102[0]};
                                    char c352 = (char) (47 - (~(-AndroidCharacter.getMirror('0'))));
                                    int i4512 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    int alpha72 = C1211g1.alpha();
                                    int i4522 = i4512 * 46;
                                    int i4532 = (i4522 ^ 94254) + ((i4522 & 94254) << 1);
                                    int i4542 = ~alpha72;
                                    int i4552 = ~(((-2050) ^ i4542) | ((-2050) & i4542));
                                    int i4562 = -(-(((i4512 ^ i4552) | (i4552 & i4512)) * (-90)));
                                    int i4572 = (i4532 & i4562) + (i4532 | i4562);
                                    int i4582 = ((~(((-2050) ^ alpha72) | ((-2050) & alpha72))) | (~((i4512 ^ 2049) | (i4512 & 2049)))) * (-45);
                                    int i4592 = (i4572 ^ i4582) + ((i4572 & i4582) << 1);
                                    int i4602 = ~i4512;
                                    int i4612 = ~((i4602 ^ alpha72) | (i4602 & alpha72));
                                    int i4622 = ((-2050) ^ i4612) | (i4612 & (-2050));
                                    int i4632 = ~((i4512 & i4542) | (i4542 ^ i4512));
                                    int i4642 = ((i4622 & i4632) | (i4622 ^ i4632)) * 45;
                                    Object[] objArr1112 = new Object[1];
                                    bravo(c352, (i4592 & i4642) + (i4642 | i4592), 11 - View.MeasureSpec.getSize(0), objArr1112);
                                    String str562 = (String) objArr1112[0];
                                    int i4652 = -(-TextUtils.indexOf("", ""));
                                    int i4662 = -KeyEvent.getDeadChar(0, 0);
                                    int i4672 = ((i4662 | 587) << 1) - (i4662 ^ 587);
                                    int i4682 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i4692 = (i4682 & 7) + (i4682 | 7);
                                    Object[] objArr1122 = new Object[1];
                                    bravo((char) (((i4652 | 52843) << 1) - (i4652 ^ 52843)), i4672, i4692, objArr1122);
                                    String[] strArr202 = {str562, (String) objArr1122[0]};
                                    char c362 = (char) (30127 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                    int green42 = Color.green(0);
                                    int alpha82 = C1211g1.alpha();
                                    int i4702 = green42 * 491;
                                    int i4712 = (i4702 & (-1007340)) + (i4702 | (-1007340));
                                    int i4722 = ~green42;
                                    int i4732 = (i4722 ^ (-2061)) | (i4722 & (-2061));
                                    int i4742 = ~alpha82;
                                    int i4752 = (i4722 * 490) + ((((((i4732 ^ i4742) | (i4732 & i4742)) * (-490)) + i4712) - (~(((~(((-2061) ^ green42) | (green42 & (-2061)))) | (~(((-2061) ^ alpha82) | (alpha82 & (-2061))))) * 490))) - 1);
                                    int i4762 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                    int i4772 = (i4762 ^ 28) + ((i4762 & 28) << 1);
                                    Object[] objArr1132 = new Object[1];
                                    bravo(c362, i4752, i4772, objArr1132);
                                    String str572 = (String) objArr1132[0];
                                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                    int resolveSizeAndState42 = View.resolveSizeAndState(0, 0, 0) + 2039;
                                    int i4782 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                    c11 = 0;
                                    i50 = 1;
                                    Object[] objArr1142 = new Object[1];
                                    bravo((char) (((packedPositionGroup2 | 57615) << 1) - (packedPositionGroup2 ^ 57615)), resolveSizeAndState42, (i4782 & 10) + (i4782 | 10), objArr1142);
                                    String[][] strArr212 = {strArr172, strArr182, strArr192, strArr202, new String[]{str572, (String) objArr1142[0]}};
                                    i51 = 0;
                                    i52 = i42;
                                    while (true) {
                                        if (i51 >= 5) {
                                        }
                                        int i4922 = i51;
                                        i51 = ((i4922 & 1) << i50) + (i4922 ^ 1);
                                        i49 = i49;
                                        i52 = i479;
                                        i50 = 1;
                                        c11 = 0;
                                    }
                                    int i4932 = (~(i4 & i53)) & (i4 | i53);
                                    int i4942 = (i4932 | (-i4932)) >> 31;
                                    int i4952 = i54 & (~i4942);
                                    int i4962 = i53 & i4942;
                                    int i4972 = (i4952 & i4962) | (i4952 ^ i4962);
                                    char indexOf132 = (char) (46603 - TextUtils.indexOf("", "", 0));
                                    int i4982 = 2087 - (~(-Color.argb(0, 0, 0, 0)));
                                    int resolveSize22 = View.resolveSize(0, 0);
                                    int i4992 = (resolveSize22 ^ 13) + ((resolveSize22 & 13) << 1);
                                    Object[] objArr1162 = new Object[1];
                                    bravo(indexOf132, i4982, i4992, objArr1162);
                                    String str602 = (String) objArr1162[0];
                                    char indexOf142 = (char) TextUtils.indexOf("", "", 0);
                                    int offsetAfter22 = TextUtils.getOffsetAfter("", 0) + 2101;
                                    int indexOf152 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                    int i5002 = (indexOf152 ^ 9) + ((indexOf152 & 9) << 1);
                                    Object[] objArr1172 = new Object[1];
                                    bravo(indexOf142, offsetAfter22, i5002, objArr1172);
                                    String str612 = (String) objArr1172[0];
                                    file3 = new File(str602);
                                    if (file3.exists()) {
                                    }
                                    i55 = i4;
                                    int i51522 = ((~i4972) & i4) | (i4972 & i79);
                                    int i51622 = -i51522;
                                    int i51722 = ((i51522 & i51622) | (i51522 ^ i51622)) >> 31;
                                    int i51822 = i55 & (~i51722);
                                    int i51922 = i4972 & i51722;
                                    int i52022 = (i51922 & i51822) | (i51822 ^ i51922);
                                    Object[] objArr11922 = new Object[1];
                                    bravo((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2109 - (ViewConfiguration.getScrollBarSize() >> 8), 47 - (ViewConfiguration.getTouchSlop() >> 8), objArr11922);
                                    Object[] objArr12022 = {(String) objArr11922[0]};
                                    D88715 = uH18377.D8871(1979478258);
                                    if (D88715 == null) {
                                    }
                                    long longValue1622 = ((Long) ((Method) D88715).invoke(null, objArr12022)).longValue();
                                    long j10222 = 54083668;
                                    long j10322 = 988;
                                    long j10422 = longValue1622 ^ j5;
                                    long myPid522 = Process.myPid();
                                    long j10522 = myPid522 ^ j5;
                                    long j10622 = (j10322 * (((longValue1622 | (j10522 | j10222)) ^ j5) | (((j10222 ^ j5) | j10422) ^ j5) | ((j10422 | myPid522) ^ j5))) + ((-988) * (j10222 | j10422)) + (((((j10422 | j10522) | j10222) ^ j5) | (((j10222 | longValue1622) | myPid522) ^ j5)) * j10322) + ((-987) * longValue1622) + (989 * j10222) + 720737638;
                                    int tango322 = ad.tango(212722897);
                                    int i52122 = ((((int) (j10622 >> c3)) & ((((~(tango322 | (-135287049))) | 574881824) * 366) + (((~((-498815818) | tango322)) | 938410593) * (-366)) + 1344769688)) | (((int) j10622) & (((~((-710544391) | i4)) * 283) + ((((~((-786041864) | i4)) | 75497473) * (-283)) - 1546278032)))) * 263;
                                    int i52222 = i4 ^ i52022;
                                    int i52322 = -i52222;
                                    int i52422 = ((i52222 & i52322) | (i52222 ^ i52322)) >> 31;
                                    int i52522 = ((i52122 & i79) | ((~i52122) & i4)) & (~i52422);
                                    int i52622 = i52022 & i52422;
                                    i40 = (i52622 & i52522) | (i52522 ^ i52622);
                                    strArr2 = strArr3;
                                }
                            }
                            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int keyRepeatTimeout2 = 370 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i527 = -(-TextUtils.getCapsMode("", 0, 0));
                            int i528 = (i527 ^ 23) + ((i527 & 23) << 1);
                            Object[] objArr122 = new Object[1];
                            bravo(maximumFlingVelocity2, keyRepeatTimeout2, i528, objArr122);
                            String str62 = (String) objArr122[0];
                            int i529 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            Object[] objArr123 = new Object[1];
                            bravo((char) (((34116 | i529) << 1) - (i529 ^ 34116)), 810 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.combineMeasuredStates(0, 0) + 10, objArr123);
                            String str63 = (String) objArr123[0];
                            int i530 = -View.combineMeasuredStates(0, 0);
                            int i531 = -AndroidCharacter.getMirror('0');
                            int alpha10 = C1211g1.alpha();
                            int i532 = i531 * (-559);
                            int i533 = ((i532 | 486948) << 1) - (i532 ^ 486948);
                            int i534 = ~alpha10;
                            int i535 = (~((i534 ^ i531) | (i534 & i531))) * (-560);
                            int i536 = (i533 & i535) + (i533 | i535);
                            int i537 = (-869) | i531;
                            int i538 = (i536 - (~(-(-((~((i537 ^ alpha10) | (i537 & alpha10))) * (-560)))))) - 1;
                            int i539 = ~i531;
                            int i540 = ~((i539 & 868) | (i539 ^ 868));
                            int i541 = ~alpha10;
                            int i542 = -(-((i540 | (~((i541 & 868) | (i541 ^ 868)))) * 560));
                            int i543 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            Object[] objArr124 = new Object[1];
                            bravo((char) ((38649 & i530) + (i530 | 38649)), (i538 ^ i542) + ((i538 & i542) << 1), (i543 ^ 8) + ((i543 & 8) << 1), objArr124);
                            String str64 = (String) objArr124[0];
                            char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0);
                            Object[] objArr125 = new Object[1];
                            bravo(longPressTimeout2, ((absoluteGravity4 | 827) << 1) - (absoluteGravity4 ^ 827), 7 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), objArr125);
                            String[] strArr24 = {str62, str63, str64, (String) objArr125[0]};
                            char c37 = (char) (0 - (~Process.getGidForName("")));
                            int i544 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                            Object[] objArr126 = new Object[1];
                            bravo(c37, (i544 ^ 835) + ((i544 & 835) << 1), 16 - (~Color.alpha(0)), objArr126);
                            String str65 = (String) objArr126[0];
                            int i545 = -(-KeyEvent.normalizeMetaState(0));
                            Object[] objArr127 = new Object[1];
                            bravo((char) (((54501 | i545) << 1) - (i545 ^ 54501)), 851 - (~(-View.getDefaultSize(0, 0))), 7 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr127);
                            String str66 = (String) objArr127[0];
                            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i546 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int i547 = ((i546 | 858) << 1) - (i546 ^ 858);
                            int i548 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr128 = new Object[1];
                            bravo(fadingEdgeLength2, i547, (i548 ^ 8) + ((i548 & 8) << 1), objArr128);
                            String str67 = (String) objArr128[0];
                            int i549 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i550 = -(-View.MeasureSpec.getMode(0));
                            int i551 = -View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr129 = new Object[1];
                            bravo((char) ((35963 & i549) + (i549 | 35963)), ((i550 | 866) << 1) - (i550 ^ 866), (i551 & 11) + (i551 | 11), objArr129);
                            String str68 = (String) objArr129[0];
                            char c38 = (char) (26386 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                            int i552 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            j10 = j26;
                            Object[] objArr130 = new Object[1];
                            bravo(c38, (i552 ^ 877) + ((i552 & 877) << 1), 13 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr130);
                            String[] strArr25 = {str65, str66, str67, str68, (String) objArr130[0]};
                            char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                            int i553 = 890 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                            int i554 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i555 = (i554 ^ 15) + ((i554 & 15) << 1);
                            Object[] objArr131 = new Object[1];
                            bravo(capsMode3, i553, i555, objArr131);
                            String str69 = (String) objArr131[0];
                            int i556 = -(-TextUtils.indexOf("", ""));
                            int i557 = 906 - (~(-TextUtils.indexOf("", "", 0)));
                            int i558 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i559 = ((i558 | 2) << 1) - (i558 ^ 2);
                            Object[] objArr132 = new Object[1];
                            bravo((char) ((i556 ^ 31026) + ((i556 & 31026) << 1)), i557, i559, objArr132);
                            String str70 = (String) objArr132[0];
                            char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                            int i560 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 917;
                            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                            int i561 = (minimumFlingVelocity ^ 22) + ((minimumFlingVelocity & 22) << 1);
                            Object[] objArr133 = new Object[1];
                            bravo(offsetAfter3, i560, i561, objArr133);
                            String str71 = (String) objArr133[0];
                            char c39 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i562 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i563 = ((i562 | 941) << 1) - (i562 ^ 941);
                            int i564 = -KeyEvent.normalizeMetaState(0);
                            int i565 = (i564 ^ 25) + ((i564 & 25) << 1);
                            Object[] objArr134 = new Object[1];
                            bravo(c39, i563, i565, objArr134);
                            String str72 = (String) objArr134[0];
                            char c40 = (char) (61102 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))));
                            int i566 = -ExpandableListView.getPackedPositionGroup(0L);
                            int i567 = (i566 ^ 965) + ((i566 & 965) << 1);
                            int i568 = -(KeyEvent.getMaxKeyCode() >> 16);
                            int i569 = (i568 & 28) + (i568 | 28);
                            Object[] objArr135 = new Object[1];
                            bravo(c40, i567, i569, objArr135);
                            String[] strArr26 = {str69, str70, str6, str71, str72, (String) objArr135[0]};
                            int i570 = 993 - (~ImageFormat.getBitsPerPixel(0));
                            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
                            int i571 = ((normalizeMetaState | 11) << 1) - (normalizeMetaState ^ 11);
                            Object[] objArr136 = new Object[1];
                            bravo((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), i570, i571, objArr136);
                            String str73 = (String) objArr136[0];
                            char indexOf17 = (char) TextUtils.indexOf("", "");
                            int i572 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i573 = i572 * (-919);
                            int i574 = (((-923595) | i573) << 1) - (i573 ^ (-923595));
                            int i575 = ~i572;
                            int i576 = i575 | (-1006);
                            int i577 = ((~(((-1006) ^ i79) | ((-1006) & i79) | i572)) | (~((i576 ^ i4) | (i576 & i4)))) * 920;
                            int i578 = (i574 & i577) + (i574 | i577);
                            int i579 = ~i576;
                            int i580 = ~((i575 & i79) | (i575 ^ i79));
                            int i581 = (((i580 & i579) | (i579 ^ i580)) * 920) + i578;
                            int i582 = ~((i576 ^ i146) | (i576 & i146));
                            int i583 = ~i572;
                            int i584 = (i583 & WebSocketProtocol.CLOSE_NO_STATUS_CODE) | (i583 ^ WebSocketProtocol.CLOSE_NO_STATUS_CODE);
                            int i585 = (i581 - (~(-(-(((~(((i572 & (-1006)) | ((-1006) ^ i572)) | i4)) | (i582 | (~((i584 & i4) | (i584 ^ i4))))) * 920))))) - 1;
                            int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                            int i586 = (tapTimeout3 ^ 8) + ((tapTimeout3 & 8) << 1);
                            Object[] objArr137 = new Object[1];
                            bravo(indexOf17, i585, i586, objArr137);
                            String str74 = (String) objArr137[0];
                            int i587 = -TextUtils.getCapsMode("", 0, 0);
                            int i588 = -Color.alpha(0);
                            Object[] objArr138 = new Object[1];
                            bravo((char) ((i587 & 21316) + (i587 | 21316)), (i588 ^ 1012) + ((i588 & 1012) << 1), 5 - (~(-Color.alpha(0))), objArr138);
                            String str75 = (String) objArr138[0];
                            char keyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 31914);
                            int i589 = 1016 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
                            int i590 = -(Process.myTid() >> 22);
                            int i591 = ((i590 | 6) << 1) - (i590 ^ 6);
                            Object[] objArr139 = new Object[1];
                            bravo(keyCodeFromString2, i589, i591, objArr139);
                            String[] strArr27 = {str73, str74, str75, (String) objArr139[0]};
                            char normalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                            int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                            int alpha11 = C1211g1.alpha();
                            int i592 = touchSlop3 * (-183);
                            int i593 = (189440 & i592) + (i592 | 189440);
                            int i594 = ((~touchSlop3) | Barcode.FORMAT_UPC_E) * (-368);
                            int i595 = (i593 ^ i594) + ((i594 & i593) << 1);
                            int i596 = (touchSlop3 ^ (-1025)) | (touchSlop3 & (-1025));
                            int i597 = ~alpha11;
                            int i598 = (i595 - (~(((i596 ^ i597) | (i596 & i597)) * 184))) - 1;
                            int i599 = ~touchSlop3;
                            int i600 = ~((i599 & (-1025)) | (i599 ^ (-1025)));
                            int i601 = ~alpha11;
                            int i602 = (~((i601 & touchSlop3) | (i601 ^ touchSlop3))) | i600;
                            int i603 = ~((touchSlop3 & Barcode.FORMAT_UPC_E) | (touchSlop3 ^ Barcode.FORMAT_UPC_E));
                            int i604 = ((i603 & i602) | (i602 ^ i603)) * 184;
                            Object[] objArr140 = new Object[1];
                            bravo(normalizeMetaState2, (i598 ^ i604) + ((i604 & i598) << 1), Color.green(0) + 16, objArr140);
                            String str76 = (String) objArr140[0];
                            int i605 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i606 = -(-View.MeasureSpec.getMode(0));
                            Object[] objArr141 = new Object[1];
                            bravo((char) ((i605 ^ 1) + ((i605 & 1) << 1)), (i606 ^ 859) + ((i606 & 859) << 1), 6 - (~(-(ViewConfiguration.getTapTimeout() >> 16))), objArr141);
                            String str77 = (String) objArr141[0];
                            char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                            int i607 = 828 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i608 = -MotionEvent.axisFromString("");
                            int i609 = (i608 & 7) + (i608 | 7);
                            Object[] objArr142 = new Object[1];
                            bravo(deadChar3, i607, i609, objArr142);
                            String[] strArr28 = {str76, str77, (String) objArr142[0]};
                            char mirror3 = (char) (AndroidCharacter.getMirror('0') + 29569);
                            int i610 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            int i611 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            Object[] objArr143 = new Object[1];
                            bravo(mirror3, ((i610 | 1040) << 1) - (i610 ^ 1040), (i611 & 13) + (i611 | 13), objArr143);
                            String str78 = (String) objArr143[0];
                            int i612 = -ImageFormat.getBitsPerPixel(0);
                            int i613 = -(-View.resolveSize(0, 0));
                            Object[] objArr144 = new Object[1];
                            bravo((char) ((i612 ^ (-1)) + (i612 << 1)), ((i613 | 1054) << 1) - (i613 ^ 1054), 0 - (~(-(-Color.alpha(0)))), objArr144);
                            String[] strArr29 = {str78, (String) objArr144[0]};
                            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i614 = -(-KeyEvent.normalizeMetaState(0));
                            int i615 = (i614 & 1055) + (i614 | 1055);
                            int i616 = -View.MeasureSpec.getMode(0);
                            int i617 = (i616 ^ 9) + ((i616 & 9) << 1);
                            Object[] objArr145 = new Object[1];
                            bravo(edgeSlop2, i615, i617, objArr145);
                            String str79 = (String) objArr145[0];
                            Object[] objArr146 = new Object[1];
                            bravo((char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0) + 1064, -ImageFormat.getBitsPerPixel(0), objArr146);
                            String[] strArr30 = {str79, (String) objArr146[0]};
                            char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int i618 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i619 = (i618 ^ 1065) + ((i618 & 1065) << 1);
                            int threadPriority2 = (Process.getThreadPriority(0) + 20) >> 6;
                            int i620 = (threadPriority2 ^ 16) + ((threadPriority2 & 16) << 1);
                            Object[] objArr147 = new Object[1];
                            bravo(tapTimeout4, i619, i620, objArr147);
                            String str80 = (String) objArr147[0];
                            int i621 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i622 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i623 = ((i622 | 907) << 1) - (i622 ^ 907);
                            int i624 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                            int i625 = ((i624 | 3) << 1) - (i624 ^ 3);
                            Object[] objArr148 = new Object[1];
                            bravo((char) (((i621 | 31025) << 1) - (i621 ^ 31025)), i623, i625, objArr148);
                            String str81 = (String) objArr148[0];
                            int i626 = -TextUtils.getOffsetBefore("", 0);
                            int i627 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                            Object[] objArr149 = new Object[1];
                            bravo((char) ((54501 ^ i626) + ((i626 & 54501) << 1)), (i627 & 852) + (i627 | 852), 6 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr149);
                            String str82 = (String) objArr149[0];
                            char c41 = (char) (56881 - (~(-(-View.MeasureSpec.getMode(0)))));
                            int i628 = -AndroidCharacter.getMirror('0');
                            int i629 = ((i628 | 1129) << 1) - (i628 ^ 1129);
                            int i630 = -KeyEvent.keyCodeFromString("");
                            Object[] objArr150 = new Object[1];
                            bravo(c41, i629, ((i630 | 8) << 1) - (i630 ^ 8), objArr150);
                            String str83 = (String) objArr150[0];
                            char c42 = (char) (35963 - (~(-View.resolveSize(0, 0))));
                            int i631 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            Object[] objArr151 = new Object[1];
                            bravo(c42, (i631 ^ 866) + ((i631 & 866) << 1), 10 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), objArr151);
                            String str84 = (String) objArr151[0];
                            int i632 = -TextUtils.indexOf("", "", 0);
                            int normalizeMetaState3 = 877 - KeyEvent.normalizeMetaState(0);
                            int i633 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i634 = (i633 & 13) + (i633 | 13);
                            Object[] objArr152 = new Object[1];
                            bravo((char) ((i632 ^ 26387) + ((i632 & 26387) << 1)), normalizeMetaState3, i634, objArr152);
                            String[] strArr31 = {str80, str81, str82, str83, str84, (String) objArr152[0]};
                            char indexOf18 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int i635 = -TextUtils.indexOf("", "");
                            int alpha12 = C1211g1.alpha();
                            int i636 = i635 * (-432);
                            int i637 = ((i636 | 472626) << 1) - (i636 ^ 472626);
                            int i638 = ~i635;
                            int i639 = ~alpha12;
                            int i640 = (i638 ^ i639) | (i639 & i638);
                            int i641 = (i637 - (~(-(-((~((i640 & 1089) | (i640 ^ 1089))) * 433))))) - 1;
                            int i642 = ~i635;
                            int i643 = ~(((-1090) ^ alpha12) | ((-1090) & alpha12));
                            int i644 = ((i642 ^ i643) | (i642 & i643)) * (-433);
                            int i645 = (i641 & i644) + (i641 | i644);
                            int i646 = ~((i638 & alpha12) | (i638 ^ alpha12));
                            int i647 = ~((i635 ^ 1089) | (i635 & 1089));
                            Object[] objArr153 = new Object[1];
                            bravo(indexOf18, (((i646 & i647) | (i646 ^ i647)) * 433) + i645, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20, objArr153);
                            String str85 = (String) objArr153[0];
                            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i648 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1109;
                            int i649 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i650 = (i649 ^ 19) + ((i649 & 19) << 1);
                            Object[] objArr154 = new Object[1];
                            bravo(pressedStateDuration2, i648, i650, objArr154);
                            String str86 = (String) objArr154[0];
                            int i651 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            char c43 = (char) ((33430 & i651) + (i651 | 33430));
                            int i652 = -(-AndroidCharacter.getMirror('0'));
                            int i653 = (i652 ^ 1080) + ((i652 & 1080) << 1);
                            int i654 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            Object[] objArr155 = new Object[1];
                            bravo(c43, i653, (i654 & 30) + (i654 | 30), objArr155);
                            String str87 = (String) objArr155[0];
                            int rgb5 = Color.rgb(0, 0, 0);
                            char c44 = (char) ((16777216 ^ rgb5) + ((rgb5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) << 1));
                            int keyRepeatTimeout3 = 1159 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i655 = -(-KeyEvent.normalizeMetaState(0));
                            Object[] objArr156 = new Object[1];
                            bravo(c44, keyRepeatTimeout3, (i655 ^ 26) + ((i655 & 26) << 1), objArr156);
                            String str88 = (String) objArr156[0];
                            char c45 = (char) (19750 - (~(-Gravity.getAbsoluteGravity(0, 0))));
                            int threadPriority3 = Process.getThreadPriority(0);
                            int i656 = ((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6;
                            int i657 = (i656 ^ 1185) + ((i656 & 1185) << 1);
                            int i658 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i659 = (i658 ^ 23) + ((i658 & 23) << 1);
                            Object[] objArr157 = new Object[1];
                            bravo(c45, i657, i659, objArr157);
                            String str89 = (String) objArr157[0];
                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i660 = -TextUtils.getOffsetAfter("", 0);
                            Object[] objArr158 = new Object[1];
                            bravo(fadingEdgeLength3, ((i660 | 1208) << 1) - (i660 ^ 1208), 33 - (ViewConfiguration.getTouchSlop() >> 8), objArr158);
                            String[] strArr32 = {str85, str86, str87, str88, str89, (String) objArr158[0], str6};
                            int i661 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i662 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                            int i663 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i664 = (i663 & 13) + (i663 | 13);
                            Object[] objArr159 = new Object[1];
                            bravo((char) ((i661 & 49925) + (i661 | 49925)), ((i662 & 1241) << 1) + (i662 ^ 1241), i664, objArr159);
                            String str90 = (String) objArr159[0];
                            char c46 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38649);
                            int i665 = -(-View.resolveSize(0, 0));
                            int i666 = ((i665 | 820) << 1) - (i665 ^ 820);
                            int threadPriority4 = (Process.getThreadPriority(0) + 20) >> 6;
                            int i667 = ((threadPriority4 | 7) << 1) - (threadPriority4 ^ 7);
                            Object[] objArr160 = new Object[1];
                            bravo(c46, i666, i667, objArr160);
                            String[] strArr33 = {str90, (String) objArr160[0]};
                            int i668 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                            char c47 = (char) ((56911 & i668) + (i668 | 56911));
                            int i669 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int alpha13 = C1211g1.alpha();
                            int i670 = (i669 * (-563)) - (-709075);
                            int i671 = ~i669;
                            int i672 = ~((-1256) | (~alpha13));
                            int i673 = (i671 ^ i672) | (i672 & i671);
                            int i674 = ~((alpha13 ^ 1255) | (alpha13 & 1255));
                            int i675 = -(-(((i673 ^ i674) | (i673 & i674)) * (-564)));
                            int i676 = (i670 ^ i675) + ((i675 & i670) << 1);
                            int i677 = i671 | 1255;
                            int i678 = -(-((~((i677 & alpha13) | (i677 ^ alpha13))) * 1128));
                            int i679 = (i676 & i678) + (i676 | i678);
                            int i680 = ~i669;
                            int i681 = ~alpha13;
                            int i682 = (((~((i680 ^ i681) | (i680 & i681))) | (~((i669 & 1255) | (i669 ^ 1255)))) * 564) + i679;
                            int i683 = -TextUtils.lastIndexOf("", '0', 0);
                            Object[] objArr161 = new Object[1];
                            bravo(c47, i682, ((i683 | 29) << 1) - (i683 ^ 29), objArr161);
                            String str91 = (String) objArr161[0];
                            int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                            Object[] objArr162 = new Object[1];
                            bravo((char) (((58317 | longPressTimeout3) << 1) - (longPressTimeout3 ^ 58317)), 1282 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 10 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr162);
                            String[] strArr34 = {str91, (String) objArr162[0]};
                            Object[] objArr163 = new Object[1];
                            bravo((char) (54635 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), 1295 - TextUtils.getCapsMode("", 0, 0), 18 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), objArr163);
                            String str92 = (String) objArr163[0];
                            char mode3 = (char) View.MeasureSpec.getMode(0);
                            int i684 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i685 = -View.resolveSize(0, 0);
                            Object[] objArr164 = new Object[1];
                            bravo(mode3, (i684 ^ 1315) + ((i684 & 1315) << 1), (i685 & 5) + (i685 | 5), objArr164);
                            String[] strArr35 = {str92, (String) objArr164[0]};
                            Object[] objArr165 = new Object[1];
                            bravo((char) (KeyEvent.getDeadChar(0, 0) + 31523), 1317 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 18 - (~(-View.resolveSizeAndState(0, 0, 0))), objArr165);
                            String[] strArr36 = {(String) objArr165[0]};
                            char indexOf19 = (char) TextUtils.indexOf("", "", 0, 0);
                            int i686 = 1337 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int maxKeyCode3 = KeyEvent.getMaxKeyCode() >> 16;
                            Object[] objArr166 = new Object[1];
                            bravo(indexOf19, i686, (maxKeyCode3 & 16) + (maxKeyCode3 | 16), objArr166);
                            String[] strArr37 = {(String) objArr166[0]};
                            int i687 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i688 = -TextUtils.getOffsetBefore("", 0);
                            int indexOf20 = TextUtils.indexOf((CharSequence) "", '0');
                            Object[] objArr167 = new Object[1];
                            bravo((char) (((i687 | 1) << 1) - (i687 ^ 1)), ((i688 | 1354) << 1) - (i688 ^ 1354), (indexOf20 ^ 20) + ((indexOf20 & 20) << 1), objArr167);
                            String[] strArr38 = {(String) objArr167[0]};
                            int edgeSlop3 = ViewConfiguration.getEdgeSlop() >> 16;
                            int i689 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i690 = ~((i689 & 1374) | (i689 ^ 1374));
                            int i691 = ~(i689 | i4);
                            int i692 = (((i690 ^ i691) | (i690 & i691)) * HttpConstants.HTTP_USE_PROXY) + (i689 * 306) + 421054;
                            int i693 = ~(i689 | i79);
                            int i694 = (((i693 & (-1375)) | ((-1375) ^ i693)) * HttpConstants.HTTP_USE_PROXY) + i692;
                            int i695 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                            int i696 = (i695 & 19) + (i695 | 19);
                            Object[] objArr168 = new Object[1];
                            bravo((char) ((49318 & edgeSlop3) + (edgeSlop3 | 49318)), i694, i696, objArr168);
                            String[] strArr39 = {(String) objArr168[0]};
                            Object[] objArr169 = new Object[1];
                            bravo((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1391 - (~(-Color.argb(0, 0, 0, 0))), 23 - TextUtils.indexOf("", "", 0), objArr169);
                            String[] strArr40 = {(String) objArr169[0]};
                            int i697 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i698 = (i697 * (-300)) + HttpConstants.HTTP_MOVED_TEMP;
                            int i699 = -(-((~((i697 ^ 1) | (i697 & 1) | i4)) * (-301)));
                            int i700 = (i698 ^ i699) + ((i698 & i699) << 1);
                            int i701 = -(-(((~(((-2) ^ i4) | ((-2) & i4))) | (~(i146 | i697))) * (-301)));
                            int i702 = ((i700 | i701) << 1) - (i700 ^ i701);
                            int i703 = ~i697;
                            int i704 = ~((i703 & i4) | (i703 ^ i4));
                            int i705 = (((-2) & i704) | ((-2) ^ i704)) * 301;
                            char c48 = (char) ((i702 ^ i705) + ((i705 & i702) << 1));
                            int i706 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i707 = (i706 & 1415) + (i706 | 1415);
                            int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                            Object[] objArr170 = new Object[1];
                            bravo(c48, i707, ((packedPositionChild4 | 22) << 1) - (packedPositionChild4 ^ 22), objArr170);
                            String[] strArr41 = {(String) objArr170[0]};
                            int i708 = -(-AndroidCharacter.getMirror('0'));
                            int i709 = -Color.alpha(0);
                            int i710 = (i709 & 1436) + (i709 | 1436);
                            int i711 = -(-MotionEvent.axisFromString(""));
                            Object[] objArr171 = new Object[1];
                            bravo((char) ((i708 & 41389) + (i708 | 41389)), i710, (i711 ^ 25) + ((i711 & 25) << 1), objArr171);
                            String[] strArr42 = {(String) objArr171[0], str6};
                            char c49 = (char) ((-2) - ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) ^ (-1)));
                            int offsetAfter4 = TextUtils.getOffsetAfter("", 0) + 1460;
                            int i712 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            Object[] objArr172 = new Object[1];
                            bravo(c49, offsetAfter4, (i712 & 27) + (i712 | 27), objArr172);
                            String[] strArr43 = {(String) objArr172[0], str6};
                            int i713 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            char c50 = (char) (((62734 | i713) << 1) - (62734 ^ i713));
                            int i714 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                            int i715 = -Gravity.getAbsoluteGravity(0, 0);
                            Object[] objArr173 = new Object[1];
                            bravo(c50, (i714 ^ 1488) + ((i714 & 1488) << 1), (i715 & 27) + (i715 | 27), objArr173);
                            String[] strArr44 = {(String) objArr173[0], str6};
                            int i716 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i717 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                            Object[] objArr174 = new Object[1];
                            bravo((char) ((54858 & i716) + (i716 | 54858)), ((i717 | 1515) << 1) - (i717 ^ 1515), 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr174);
                            String[] strArr45 = {(String) objArr174[0], str6};
                            int i718 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int normalizeMetaState4 = KeyEvent.normalizeMetaState(0);
                            int i719 = (normalizeMetaState4 ^ 1546) + ((normalizeMetaState4 & 1546) << 1);
                            int i720 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i721 = (i720 ^ 27) + ((i720 & 27) << 1);
                            Object[] objArr175 = new Object[1];
                            bravo((char) ((60394 ^ i718) + ((i718 & 60394) << 1)), i719, i721, objArr175);
                            String[] strArr46 = {(String) objArr175[0], str6};
                            int capsMode4 = TextUtils.getCapsMode("", 0, 0);
                            int i722 = -Color.green(0);
                            int i723 = (i722 & 1573) + (i722 | 1573);
                            int i724 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr176 = new Object[1];
                            bravo((char) ((capsMode4 & 12556) + (capsMode4 | 12556)), i723, (i724 ^ 33) + ((i724 & 33) << 1), objArr176);
                            String[] strArr47 = {(String) objArr176[0], str6};
                            String[][] strArr48 = new String[i12];
                            strArr48[0] = strArr24;
                            strArr48[1] = strArr25;
                            strArr48[2] = strArr26;
                            strArr48[3] = strArr27;
                            strArr48[4] = strArr28;
                            strArr48[5] = strArr29;
                            strArr48[6] = strArr30;
                            strArr48[7] = strArr31;
                            strArr48[8] = strArr32;
                            strArr48[9] = strArr33;
                            strArr48[10] = strArr34;
                            strArr48[11] = strArr35;
                            strArr48[12] = strArr36;
                            strArr48[13] = strArr37;
                            strArr48[14] = strArr38;
                            strArr48[15] = strArr39;
                            strArr48[16] = strArr40;
                            strArr48[17] = strArr41;
                            strArr48[18] = strArr42;
                            strArr48[i13] = strArr43;
                            strArr48[20] = strArr44;
                            strArr48[21] = strArr45;
                            strArr48[22] = strArr46;
                            strArr48[23] = strArr47;
                            int i725 = 0;
                            int i726 = 1;
                            Object[] objArr177 = new Object[1];
                            bravo((char) TextUtils.indexOf("", ""), 1603 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), -TextUtils.lastIndexOf("", '0', 0), objArr177);
                            StringBuilder sb2 = new StringBuilder((String) objArr177[0]);
                            int i727 = i4;
                            int i728 = 0;
                            int i729 = 0;
                            while (i728 < 24) {
                                String[] strArr49 = strArr48[i728];
                                Object[] objArr178 = new Object[i726];
                                objArr178[i725] = strArr49[i725];
                                Object D887125 = uH18377.D8871(-957097391);
                                if (D887125 == null) {
                                    int lastIndexOf4 = TextUtils.lastIndexOf("", '0', i725) + 53;
                                    int absoluteGravity5 = Gravity.getAbsoluteGravity(i725, i725) + 3158;
                                    char absoluteGravity6 = (char) (Gravity.getAbsoluteGravity(i725, i725) + 58074);
                                    i43 = i728;
                                    byte b55 = (byte) 1;
                                    byte b56 = (byte) (b55 - 1);
                                    i44 = i146;
                                    i45 = i727;
                                    cls3 = cls;
                                    Object[] objArr179 = new Object[1];
                                    charlie(b55, b56, (byte) (b56 + 2), objArr179);
                                    D887125 = uH18377.setPivotYN16904(lastIndexOf4, absoluteGravity5, absoluteGravity6, 424179844, false, (String) objArr179[0], new Class[]{cls3});
                                } else {
                                    i43 = i728;
                                    i44 = i146;
                                    i45 = i727;
                                    cls3 = cls;
                                }
                                String[][] strArr50 = strArr48;
                                String str93 = (String) ((Method) D887125).invoke(null, objArr178);
                                int i730 = 1;
                                String[] strArr51 = (String[]) Arrays.copyOfRange(strArr49, 1, strArr49.length);
                                if (str93 != null && !str93.isEmpty()) {
                                    if (strArr49.length != 1) {
                                        int i731 = echo;
                                        delta = ((i731 & 57) + (i731 | 57)) % 128;
                                        int length2 = strArr51.length;
                                        int i732 = 0;
                                        while (true) {
                                            if (i732 >= length2) {
                                                break;
                                            }
                                            if (str93.contains(strArr51[i732])) {
                                                int i733 = echo + 1;
                                                delta = i733 % 128;
                                                if (i733 % 2 == 0) {
                                                    i730 = 1;
                                                }
                                            } else {
                                                int i734 = (i732 ^ 49) + ((i732 & 49) << 1);
                                                i732 = ((i734 | (-48)) << 1) - (i734 ^ (-48));
                                            }
                                        }
                                    }
                                    int i735 = (i43 ^ 10) + ((i43 & 10) << i730);
                                    i727 = ((~i735) & i4) | (i735 & i79);
                                    i729 = ((i729 | 1) << i730) - (i729 ^ i730);
                                    if (i729 > i730) {
                                        int i736 = delta + 1;
                                        echo = i736 % 128;
                                        if (i736 % 2 == 0) {
                                            char c51 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) * 43699);
                                            int i737 = 4733 - (~(-AndroidCharacter.getMirror(c4)));
                                            int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize();
                                            Object[] objArr180 = new Object[1];
                                            bravo(c51, i737, 2 % ((maximumDrawingCacheSize3 ^ 112) + ((maximumDrawingCacheSize3 & 112) << 1)), objArr180);
                                            sb2.append((String) objArr180[0]);
                                            i46 = 0;
                                        } else {
                                            int i738 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            char c52 = (char) (((i738 | 43699) << 1) - (i738 ^ 43699));
                                            int i739 = -AndroidCharacter.getMirror('0');
                                            int i740 = (i739 ^ 1654) + ((i739 & 1654) << 1);
                                            int i741 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            Object[] objArr181 = new Object[1];
                                            bravo(c52, i740, (i741 & 2) + (i741 | 2), objArr181);
                                            i46 = 0;
                                            sb2.append((String) objArr181[0]);
                                        }
                                    } else {
                                        i46 = 0;
                                    }
                                    sb2.append(strArr49[i46]);
                                    char rgb6 = (char) (Color.rgb(i46, i46, i46) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                    int resolveOpacity3 = Drawable.resolveOpacity(i46, i46);
                                    int alpha14 = C1211g1.alpha();
                                    int i742 = resolveOpacity3 * (-380);
                                    int i743 = (i742 & 614256) + (i742 | 614256);
                                    int i744 = (alpha14 ^ 1608) | (alpha14 & 1608);
                                    int i745 = ~resolveOpacity3;
                                    int i746 = ((i744 ^ i745) | (i744 & i745)) * (-381);
                                    int i747 = (i743 ^ i746) + ((i743 & i746) << 1);
                                    int i748 = ~((i745 ^ (-1609)) | (i745 & (-1609)));
                                    int i749 = ~alpha14;
                                    int i750 = ~((i749 & 1608) | (i749 ^ 1608));
                                    int i751 = (i750 & i748) | (i748 ^ i750);
                                    int i752 = ~((resolveOpacity3 ^ 1608) | (resolveOpacity3 & 1608));
                                    int i753 = (i747 - (~(-(-(((i751 & i752) | (i751 ^ i752)) * 381))))) - 1;
                                    int i754 = ~resolveOpacity3;
                                    Object[] objArr182 = new Object[1];
                                    bravo(rgb6, ((~((i754 & 1608) | (i754 ^ 1608))) * 381) + i753, 0 - (~(-(-TextUtils.getCapsMode("", 0, 0)))), objArr182);
                                    sb2.append((String) objArr182[0]);
                                    sb2.append(str93);
                                    strArr48 = strArr50;
                                    i146 = i44;
                                    cls = cls3;
                                    i725 = 0;
                                    i726 = 1;
                                    i728 = i43 + 1;
                                }
                                i727 = i45;
                                strArr48 = strArr50;
                                i146 = i44;
                                cls = cls3;
                                i725 = 0;
                                i726 = 1;
                                i728 = i43 + 1;
                            }
                            i41 = i146;
                            int i755 = i727;
                            cls2 = cls;
                            int i756 = i725;
                            i42 = -1;
                            char normalizeMetaState5 = (char) KeyEvent.normalizeMetaState(i756);
                            int i757 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            int i758 = (i757 & 1609) + (i757 | 1609);
                            int green5 = Color.green(i756);
                            int alpha15 = C1211g1.alpha();
                            int i759 = green5 * (-919);
                            int i760 = (i759 ^ (-919)) + ((i759 & (-919)) << 1);
                            int i761 = ~green5;
                            int i762 = (i761 ^ (-2)) | (i761 & (-2));
                            int i763 = ~((i762 & alpha15) | (i762 ^ alpha15));
                            int i764 = ~alpha15;
                            int i765 = ((i763 | (~((-2) | i764 | green5))) * 920) + i760;
                            int i766 = ~((i761 ^ (-2)) | (i761 & (-2)));
                            int i767 = ~((i764 & i761) | (i761 ^ i764));
                            int i768 = -(-(((i766 & i767) | (i766 ^ i767)) * 920));
                            int i769 = (i765 ^ i768) + ((i768 & i765) << 1);
                            int i770 = ~green5;
                            int i771 = ~((i770 & (-2)) | (i770 ^ (-2)) | (~alpha15));
                            int i772 = (i761 & 1) | (i761 ^ 1);
                            int i773 = ~((i772 & alpha15) | (i772 ^ alpha15));
                            int i774 = ((-2) & green5) | ((-2) ^ green5);
                            int i775 = -(-(((~((i774 & alpha15) | (i774 ^ alpha15))) | (i773 & i771) | (i771 ^ i773)) * 920));
                            int i776 = (i769 ^ i775) + ((i775 & i769) << 1);
                            Object[] objArr183 = new Object[1];
                            bravo(normalizeMetaState5, i758, i776, objArr183);
                            sb2.append((String) objArr183[0]);
                            Object[] objArr184 = new Object[2];
                            if (i729 > 2) {
                                objArr184[1] = new int[1];
                                String[] strArr52 = {sb2.toString()};
                                ((int[]) objArr184[1])[0] = i755;
                                objArr184[0] = strArr52;
                            } else {
                                int[] iArr = new int[1];
                                objArr184[1] = iArr;
                                iArr[0] = i4;
                                objArr184[0] = new String[0];
                            }
                            int i777 = ((int[]) objArr184[1])[0];
                            int i778 = ((~i336) & i4) | (i336 & i79);
                            int i779 = -i778;
                            int i780 = ((i778 & i779) | (i778 ^ i779)) >> 31;
                            i336 = (i336 & i780) | (i777 & (~i780));
                            strArr3 = (String[]) objArr184[0];
                            char longPressTimeout4 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int packedPositionChild22 = ExpandableListView.getPackedPositionChild(0L);
                            int i3412 = (packedPositionChild22 ^ 892) + ((packedPositionChild22 & 892) << 1);
                            int i3422 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i3432 = ((i3422 | 17) << 1) - (i3422 ^ 17);
                            Object[] objArr752 = new Object[1];
                            bravo(longPressTimeout4, i3412, i3432, objArr752);
                            Object[] objArr762 = {(String) objArr752[0]};
                            D88714 = uH18377.D8871(-957097391);
                            if (D88714 == null) {
                            }
                            invoke = ((Method) D88714).invoke(null, objArr762);
                            if (invoke != null) {
                            }
                            if (i48 != 1986687685) {
                            }
                            i49 = i47;
                            char c3222 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i44022 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            Object[] objArr10422 = new Object[1];
                            bravo(c3222, (i44022 ^ 1952) + ((i44022 & 1952) << 1), Process.getGidForName("") + 14, objArr10422);
                            String str5222 = (String) objArr10422[0];
                            int green322 = Color.green(0);
                            int i44122 = -(KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr10522 = new Object[1];
                            bravo((char) (((green322 | 62188) << 1) - (green322 ^ 62188)), ((i44122 | 1965) << 1) - (i44122 ^ 1965), 4 - (~(-Color.blue(0))), objArr10522);
                            String[] strArr1722 = {str5222, (String) objArr10522[0]};
                            char c3322 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i44222 = -(-TextUtils.getTrimmedLength(""));
                            Object[] objArr10622 = new Object[1];
                            bravo(c3322, (i44222 & 1970) + (i44222 | 1970), 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10622);
                            String str5322 = (String) objArr10622[0];
                            Object[] objArr10722 = new Object[1];
                            bravo((char) Color.red(0), 1985 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr10722);
                            String str5422 = (String) objArr10722[0];
                            char c3422 = (char) (11659 - (~TextUtils.indexOf((CharSequence) "", '0')));
                            int i44322 = -AndroidCharacter.getMirror('0');
                            int i44422 = (i44322 & 2052) + (i44322 | 2052);
                            int i44522 = -(-View.MeasureSpec.getMode(0));
                            int i44622 = ((i44522 | 14) << 1) - (i44522 ^ 14);
                            Object[] objArr10822 = new Object[1];
                            bravo(c3422, i44422, i44622, objArr10822);
                            String[] strArr1822 = {str5322, str5422, (String) objArr10822[0]};
                            char rgb422 = (char) ((-16738289) - Color.rgb(0, 0, 0));
                            int resolveSize32 = 2018 - View.resolveSize(0, 0);
                            int i44722 = -TextUtils.lastIndexOf("", '0');
                            int i44822 = ((i44722 | 20) << 1) - (i44722 ^ 20);
                            Object[] objArr10922 = new Object[1];
                            bravo(rgb422, resolveSize32, i44822, objArr10922);
                            String str5522 = (String) objArr10922[0];
                            int i44922 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i45022 = -(-AndroidCharacter.getMirror('0'));
                            Object[] objArr11022 = new Object[1];
                            bravo((char) ((i44922 ^ 57614) + ((i44922 & 57614) << 1)), (i45022 & 1991) + (i45022 | 1991), 10 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr11022);
                            String[] strArr1922 = {str5522, (String) objArr11022[0]};
                            char c3522 = (char) (47 - (~(-AndroidCharacter.getMirror('0'))));
                            int i45122 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int alpha722 = C1211g1.alpha();
                            int i45222 = i45122 * 46;
                            int i45322 = (i45222 ^ 94254) + ((i45222 & 94254) << 1);
                            int i45422 = ~alpha722;
                            int i45522 = ~(((-2050) ^ i45422) | ((-2050) & i45422));
                            int i45622 = -(-(((i45122 ^ i45522) | (i45522 & i45122)) * (-90)));
                            int i45722 = (i45322 & i45622) + (i45322 | i45622);
                            int i45822 = ((~(((-2050) ^ alpha722) | ((-2050) & alpha722))) | (~((i45122 ^ 2049) | (i45122 & 2049)))) * (-45);
                            int i45922 = (i45722 ^ i45822) + ((i45722 & i45822) << 1);
                            int i46022 = ~i45122;
                            int i46122 = ~((i46022 ^ alpha722) | (i46022 & alpha722));
                            int i46222 = ((-2050) ^ i46122) | (i46122 & (-2050));
                            int i46322 = ~((i45122 & i45422) | (i45422 ^ i45122));
                            int i46422 = ((i46222 & i46322) | (i46222 ^ i46322)) * 45;
                            Object[] objArr11122 = new Object[1];
                            bravo(c3522, (i45922 & i46422) + (i46422 | i45922), 11 - View.MeasureSpec.getSize(0), objArr11122);
                            String str5622 = (String) objArr11122[0];
                            int i46522 = -(-TextUtils.indexOf("", ""));
                            int i46622 = -KeyEvent.getDeadChar(0, 0);
                            int i46722 = ((i46622 | 587) << 1) - (i46622 ^ 587);
                            int i46822 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i46922 = (i46822 & 7) + (i46822 | 7);
                            Object[] objArr11222 = new Object[1];
                            bravo((char) (((i46522 | 52843) << 1) - (i46522 ^ 52843)), i46722, i46922, objArr11222);
                            String[] strArr2022 = {str5622, (String) objArr11222[0]};
                            char c3622 = (char) (30127 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            int green422 = Color.green(0);
                            int alpha822 = C1211g1.alpha();
                            int i47022 = green422 * 491;
                            int i47122 = (i47022 & (-1007340)) + (i47022 | (-1007340));
                            int i47222 = ~green422;
                            int i47322 = (i47222 ^ (-2061)) | (i47222 & (-2061));
                            int i47422 = ~alpha822;
                            int i47522 = (i47222 * 490) + ((((((i47322 ^ i47422) | (i47322 & i47422)) * (-490)) + i47122) - (~(((~(((-2061) ^ green422) | (green422 & (-2061)))) | (~(((-2061) ^ alpha822) | (alpha822 & (-2061))))) * 490))) - 1);
                            int i47622 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                            int i47722 = (i47622 ^ 28) + ((i47622 & 28) << 1);
                            Object[] objArr11322 = new Object[1];
                            bravo(c3622, i47522, i47722, objArr11322);
                            String str5722 = (String) objArr11322[0];
                            int packedPositionGroup22 = ExpandableListView.getPackedPositionGroup(0L);
                            int resolveSizeAndState422 = View.resolveSizeAndState(0, 0, 0) + 2039;
                            int i47822 = -(ViewConfiguration.getScrollBarSize() >> 8);
                            c11 = 0;
                            i50 = 1;
                            Object[] objArr11422 = new Object[1];
                            bravo((char) (((packedPositionGroup22 | 57615) << 1) - (packedPositionGroup22 ^ 57615)), resolveSizeAndState422, (i47822 & 10) + (i47822 | 10), objArr11422);
                            String[][] strArr2122 = {strArr1722, strArr1822, strArr1922, strArr2022, new String[]{str5722, (String) objArr11422[0]}};
                            i51 = 0;
                            i52 = i42;
                            while (true) {
                                if (i51 >= 5) {
                                }
                                int i49222 = i51;
                                i51 = ((i49222 & 1) << i50) + (i49222 ^ 1);
                                i49 = i49;
                                i52 = i479;
                                i50 = 1;
                                c11 = 0;
                            }
                            int i49322 = (~(i4 & i53)) & (i4 | i53);
                            int i49422 = (i49322 | (-i49322)) >> 31;
                            int i49522 = i54 & (~i49422);
                            int i49622 = i53 & i49422;
                            int i49722 = (i49522 & i49622) | (i49522 ^ i49622);
                            char indexOf1322 = (char) (46603 - TextUtils.indexOf("", "", 0));
                            int i49822 = 2087 - (~(-Color.argb(0, 0, 0, 0)));
                            int resolveSize222 = View.resolveSize(0, 0);
                            int i49922 = (resolveSize222 ^ 13) + ((resolveSize222 & 13) << 1);
                            Object[] objArr11622 = new Object[1];
                            bravo(indexOf1322, i49822, i49922, objArr11622);
                            String str6022 = (String) objArr11622[0];
                            char indexOf1422 = (char) TextUtils.indexOf("", "", 0);
                            int offsetAfter222 = TextUtils.getOffsetAfter("", 0) + 2101;
                            int indexOf1522 = TextUtils.indexOf((CharSequence) "", '0', 0);
                            int i50022 = (indexOf1522 ^ 9) + ((indexOf1522 & 9) << 1);
                            Object[] objArr11722 = new Object[1];
                            bravo(indexOf1422, offsetAfter222, i50022, objArr11722);
                            String str6122 = (String) objArr11722[0];
                            file3 = new File(str6022);
                            if (file3.exists()) {
                            }
                            i55 = i4;
                            int i515222 = ((~i49722) & i4) | (i49722 & i79);
                            int i516222 = -i515222;
                            int i517222 = ((i515222 & i516222) | (i515222 ^ i516222)) >> 31;
                            int i518222 = i55 & (~i517222);
                            int i519222 = i49722 & i517222;
                            int i520222 = (i519222 & i518222) | (i518222 ^ i519222);
                            Object[] objArr119222 = new Object[1];
                            bravo((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2109 - (ViewConfiguration.getScrollBarSize() >> 8), 47 - (ViewConfiguration.getTouchSlop() >> 8), objArr119222);
                            Object[] objArr120222 = {(String) objArr119222[0]};
                            D88715 = uH18377.D8871(1979478258);
                            if (D88715 == null) {
                            }
                            long longValue16222 = ((Long) ((Method) D88715).invoke(null, objArr120222)).longValue();
                            long j102222 = 54083668;
                            long j103222 = 988;
                            long j104222 = longValue16222 ^ j5;
                            long myPid5222 = Process.myPid();
                            long j105222 = myPid5222 ^ j5;
                            long j106222 = (j103222 * (((longValue16222 | (j105222 | j102222)) ^ j5) | (((j102222 ^ j5) | j104222) ^ j5) | ((j104222 | myPid5222) ^ j5))) + ((-988) * (j102222 | j104222)) + (((((j104222 | j105222) | j102222) ^ j5) | (((j102222 | longValue16222) | myPid5222) ^ j5)) * j103222) + ((-987) * longValue16222) + (989 * j102222) + 720737638;
                            int tango3222 = ad.tango(212722897);
                            int i521222 = ((((int) (j106222 >> c3)) & ((((~(tango3222 | (-135287049))) | 574881824) * 366) + (((~((-498815818) | tango3222)) | 938410593) * (-366)) + 1344769688)) | (((int) j106222) & (((~((-710544391) | i4)) * 283) + ((((~((-786041864) | i4)) | 75497473) * (-283)) - 1546278032)))) * 263;
                            int i522222 = i4 ^ i520222;
                            int i523222 = -i522222;
                            int i524222 = ((i522222 & i523222) | (i522222 ^ i523222)) >> 31;
                            int i525222 = ((i521222 & i79) | ((~i521222) & i4)) & (~i524222);
                            int i526222 = i520222 & i524222;
                            i40 = (i526222 & i525222) | (i525222 ^ i526222);
                            strArr2 = strArr3;
                        } else {
                            i40 = i326;
                            strArr2 = null;
                        }
                        int i781 = ((~i40) & i4) | (i40 & i79);
                        int i782 = -i781;
                        Object[] objArr185 = {new int[]{i40}, new int[]{i4}, new int[1], strArr2};
                        int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                        int i783 = ~freeMemory3;
                        int i784 = ((314922210 | (~(682090740 | i783))) * 712) + (((~(freeMemory3 | (-306189315))) | (~(i783 | 988280054))) * (-712)) + ((((-988280055) | r4) * (-712)) - 836448743);
                        int i785 = -(-((((i781 & i782) | (i781 ^ i782)) >> 31) & 16));
                        int i786 = (i784 ^ i785) + ((i785 & i784) << 1) + i10;
                        int i787 = i786 << 13;
                        int i788 = (i787 & (~i786)) | ((~i787) & i786);
                        int i789 = i788 >>> 17;
                        int i790 = (i788 | i789) & (~(i788 & i789));
                        int i791 = i790 << 5;
                        ((int[]) objArr185[2])[0] = (i790 | i791) & (~(i790 & i791));
                        return objArr185;
                    }
                }
                int threadPriority5 = Process.getThreadPriority(0);
                int i792 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr186 = new Object[1];
                bravo((char) (((threadPriority5 ^ 20) + ((threadPriority5 & 20) << 1)) >> 6), (i792 ^ 595) + ((i792 & 595) << 1), 13 - (~TextUtils.lastIndexOf("", '0', 0, 0)), objArr186);
                String str94 = (String) objArr186[0];
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                int i793 = ((bitsPerPixel2 | 609) << 1) - (bitsPerPixel2 ^ 609);
                int i794 = -ExpandableListView.getPackedPositionGroup(0L);
                int i795 = (i794 ^ 9) + ((i794 & 9) << 1);
                Object[] objArr187 = new Object[1];
                bravo((char) ((-Process.getGidForName("")) - 1), i793, i795, objArr187);
                str2 = (String) objArr187[0];
                file2 = new File(str94);
                if (file2.exists() && file2.isFile()) {
                    try {
                        Scanner scanner4 = new Scanner(new FileInputStream(file2));
                        int i796 = -AndroidCharacter.getMirror('0');
                        int i797 = 591 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        Object[] objArr188 = new Object[1];
                        bravo((char) ((i796 ^ 48) + ((i796 & 48) << 1)), i797, (makeMeasureSpec2 & 2) + (makeMeasureSpec2 | 2), objArr188);
                        useDelimiter = scanner4.useDelimiter((String) objArr188[0]);
                        if (useDelimiter.hasNext()) {
                            str3 = "";
                        } else {
                            str3 = useDelimiter.next();
                            echo = (delta + 49) % 128;
                        }
                        useDelimiter.close();
                    } catch (IOException unused6) {
                    }
                    if (str3.contains(str2)) {
                        z2 = true;
                        i31 = z2 ? (i4 & (-262)) | (i79 & 261) : i4;
                        int i2732 = ((~i265) & i4) | (i265 & i79);
                        int i2742 = -i2732;
                        int i2752 = ((i2732 & i2742) | (i2732 ^ i2742)) >> 31;
                        i32 = (i265 & i2752) | (i31 & (~i2752));
                        if ((i5 & 8) != 0) {
                        }
                        char jumpTapTimeout22 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i3052 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int i3062 = (i3052 & 739) + (i3052 | 739);
                        int i3072 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int alpha32 = C1211g1.alpha();
                        int i3082 = i3072 * 980;
                        int i3092 = (i3082 & (-41076)) + (i3082 | (-41076));
                        int i3102 = ~alpha32;
                        int i3112 = (~((-43) | i3102)) * 979;
                        int i3122 = (i3092 & i3112) + (i3112 | i3092);
                        int i3132 = (i3072 | alpha32) * (-979);
                        int i3142 = ~(((-43) & alpha32) | ((-43) ^ alpha32));
                        int i3152 = ~((i3072 & i3102) | (i3102 ^ i3072));
                        int i3162 = (((i3122 & i3132) + (i3122 | i3132)) - (~(-(-(((i3152 & i3142) | (i3142 ^ i3152)) * 979))))) - 1;
                        Object[] objArr632 = new Object[1];
                        bravo(jumpTapTimeout22, i3062, i3162, objArr632);
                        String str312 = (String) objArr632[0];
                        i33 = 1;
                        Object[] objArr642 = new Object[1];
                        bravo((char) (5113 - View.getDefaultSize(0, 0)), 780 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), 29 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), objArr642);
                        c10 = 0;
                        strArr = new String[]{str312, (String) objArr642[0]};
                        i34 = 0;
                        while (true) {
                            if (i34 < 2) {
                            }
                            i34++;
                            i32 = i35;
                            strArr = strArr5;
                            i33 = 1;
                            c10 = 0;
                        }
                        int i3232 = i4 ^ i35;
                        int i3242 = -i3232;
                        int i3252 = ((i3232 & i3242) | (i3232 ^ i3242)) >> 31;
                        int i3262 = (i36 & (~i3252)) | (i35 & i3252);
                        D88713 = uH18377.D8871(-344556366);
                        if (D88713 == null) {
                        }
                        long longValue102 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                        long j692 = 1204245118;
                        long j702 = 614;
                        long elapsedRealtime22 = (int) SystemClock.elapsedRealtime();
                        long j712 = j692 ^ j5;
                        long j722 = (j712 | longValue102) ^ j5;
                        long j732 = longValue102 ^ j5;
                        long j742 = elapsedRealtime22 ^ j5;
                        j7 = ((j702 * ((((j712 | j732) | j742) ^ j5) | (((j742 | j692) | longValue102) ^ j5))) + (((-1228) * ((((j712 | j742) ^ j5) | j722) | ((j742 | longValue102) ^ j5))) + ((((elapsedRealtime22 | j722) | ((j732 | j692) ^ j5)) * j702) + (((-613) * longValue102) + (615 * j692))))) - 1356498216;
                        int elapsedRealtime32 = (int) SystemClock.elapsedRealtime();
                        int i3272 = ~elapsedRealtime32;
                        i37 = ((int) (j7 >> c3)) & ((((~(elapsedRealtime32 | 259329497)) | 1073758720 | (~(i3272 | (-155191305)))) * 369) + (((~((-259329498) | i3272)) | 1177896913) * (-369)) + (((1333088217 | i3272) * (-369)) - 802173004));
                        myUid = Process.myUid();
                        i38 = ~(810457777 | myUid);
                        i39 = ~myUid;
                        if ((i37 | (((int) j7) & ((((~(myUid | 626768632)) | (~((-810457778) | i39))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~((-85008457) | i39)) * (-406)) + ((i38 | (~((-541760177) | i39))) * (-406)) + 1294392047))) == 1) {
                        }
                        int i7812 = ((~i40) & i4) | (i40 & i79);
                        int i7822 = -i7812;
                        Object[] objArr1852 = {new int[]{i40}, new int[]{i4}, new int[1], strArr2};
                        int freeMemory32 = (int) Runtime.getRuntime().freeMemory();
                        int i7832 = ~freeMemory32;
                        int i7842 = ((314922210 | (~(682090740 | i7832))) * 712) + (((~(freeMemory32 | (-306189315))) | (~(i7832 | 988280054))) * (-712)) + ((((-988280055) | r4) * (-712)) - 836448743);
                        int i7852 = -(-((((i7812 & i7822) | (i7812 ^ i7822)) >> 31) & 16));
                        int i7862 = (i7842 ^ i7852) + ((i7852 & i7842) << 1) + i10;
                        int i7872 = i7862 << 13;
                        int i7882 = (i7872 & (~i7862)) | ((~i7872) & i7862);
                        int i7892 = i7882 >>> 17;
                        int i7902 = (i7882 | i7892) & (~(i7882 & i7892));
                        int i7912 = i7902 << 5;
                        ((int[]) objArr1852[2])[0] = (i7902 | i7912) & (~(i7902 & i7912));
                        return objArr1852;
                    }
                }
                z2 = false;
                if (z2) {
                }
                int i27322 = ((~i265) & i4) | (i265 & i79);
                int i27422 = -i27322;
                int i27522 = ((i27322 & i27422) | (i27322 ^ i27422)) >> 31;
                i32 = (i265 & i27522) | (i31 & (~i27522));
                if ((i5 & 8) != 0) {
                }
                char jumpTapTimeout222 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i30522 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i30622 = (i30522 & 739) + (i30522 | 739);
                int i30722 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int alpha322 = C1211g1.alpha();
                int i30822 = i30722 * 980;
                int i30922 = (i30822 & (-41076)) + (i30822 | (-41076));
                int i31022 = ~alpha322;
                int i31122 = (~((-43) | i31022)) * 979;
                int i31222 = (i30922 & i31122) + (i31122 | i30922);
                int i31322 = (i30722 | alpha322) * (-979);
                int i31422 = ~(((-43) & alpha322) | ((-43) ^ alpha322));
                int i31522 = ~((i30722 & i31022) | (i31022 ^ i30722));
                int i31622 = (((i31222 & i31322) + (i31222 | i31322)) - (~(-(-(((i31522 & i31422) | (i31422 ^ i31522)) * 979))))) - 1;
                Object[] objArr6322 = new Object[1];
                bravo(jumpTapTimeout222, i30622, i31622, objArr6322);
                String str3122 = (String) objArr6322[0];
                i33 = 1;
                Object[] objArr6422 = new Object[1];
                bravo((char) (5113 - View.getDefaultSize(0, 0)), 780 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), 29 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), objArr6422);
                c10 = 0;
                strArr = new String[]{str3122, (String) objArr6422[0]};
                i34 = 0;
                while (true) {
                    if (i34 < 2) {
                    }
                    i34++;
                    i32 = i35;
                    strArr = strArr5;
                    i33 = 1;
                    c10 = 0;
                }
                int i32322 = i4 ^ i35;
                int i32422 = -i32322;
                int i32522 = ((i32322 & i32422) | (i32322 ^ i32422)) >> 31;
                int i32622 = (i36 & (~i32522)) | (i35 & i32522);
                D88713 = uH18377.D8871(-344556366);
                if (D88713 == null) {
                }
                long longValue1022 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                long j6922 = 1204245118;
                long j7022 = 614;
                long elapsedRealtime222 = (int) SystemClock.elapsedRealtime();
                long j7122 = j6922 ^ j5;
                long j7222 = (j7122 | longValue1022) ^ j5;
                long j7322 = longValue1022 ^ j5;
                long j7422 = elapsedRealtime222 ^ j5;
                j7 = ((j7022 * ((((j7122 | j7322) | j7422) ^ j5) | (((j7422 | j6922) | longValue1022) ^ j5))) + (((-1228) * ((((j7122 | j7422) ^ j5) | j7222) | ((j7422 | longValue1022) ^ j5))) + ((((elapsedRealtime222 | j7222) | ((j7322 | j6922) ^ j5)) * j7022) + (((-613) * longValue1022) + (615 * j6922))))) - 1356498216;
                int elapsedRealtime322 = (int) SystemClock.elapsedRealtime();
                int i32722 = ~elapsedRealtime322;
                i37 = ((int) (j7 >> c3)) & ((((~(elapsedRealtime322 | 259329497)) | 1073758720 | (~(i32722 | (-155191305)))) * 369) + (((~((-259329498) | i32722)) | 1177896913) * (-369)) + (((1333088217 | i32722) * (-369)) - 802173004));
                myUid = Process.myUid();
                i38 = ~(810457777 | myUid);
                i39 = ~myUid;
                if ((i37 | (((int) j7) & ((((~(myUid | 626768632)) | (~((-810457778) | i39))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~((-85008457) | i39)) * (-406)) + ((i38 | (~((-541760177) | i39))) * (-406)) + 1294392047))) == 1) {
                }
                int i78122 = ((~i40) & i4) | (i40 & i79);
                int i78222 = -i78122;
                Object[] objArr18522 = {new int[]{i40}, new int[]{i4}, new int[1], strArr2};
                int freeMemory322 = (int) Runtime.getRuntime().freeMemory();
                int i78322 = ~freeMemory322;
                int i78422 = ((314922210 | (~(682090740 | i78322))) * 712) + (((~(freeMemory322 | (-306189315))) | (~(i78322 | 988280054))) * (-712)) + ((((-988280055) | r4) * (-712)) - 836448743);
                int i78522 = -(-((((i78122 & i78222) | (i78122 ^ i78222)) >> 31) & 16));
                int i78622 = (i78422 ^ i78522) + ((i78522 & i78422) << 1) + i10;
                int i78722 = i78622 << 13;
                int i78822 = (i78722 & (~i78622)) | ((~i78722) & i78622);
                int i78922 = i78822 >>> 17;
                int i79022 = (i78822 | i78922) & (~(i78822 & i78922));
                int i79122 = i79022 << 5;
                ((int[]) objArr18522[2])[0] = (i79022 | i79122) & (~(i79022 & i79122));
                return objArr18522;
            }
        }
        i23 = i4;
        int i2122 = (~(i4 & i206)) & (i4 | i206);
        int i2132 = -i2122;
        int i2142 = ((i2122 & i2132) | (i2122 ^ i2132)) >> 31;
        int i2152 = (i206 & i2142) | (i23 & (~i2142));
        int maximumFlingVelocity3 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
        Object[] objArr372 = new Object[1];
        bravo((char) ((maximumFlingVelocity3 & 7690) + (maximumFlingVelocity3 | 7690)), 346 - (~KeyEvent.keyCodeFromString("")), 16 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))), objArr372);
        String str202 = (String) objArr372[0];
        int i2162 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
        int i2172 = 363 - (~(-TextUtils.indexOf("", "")));
        int size3 = View.MeasureSpec.getSize(0);
        int i2182 = (size3 ^ 6) + ((size3 & 6) << 1);
        Object[] objArr382 = new Object[1];
        bravo((char) ((i2162 & 1517) + (i2162 | 1517)), i2172, i2182, objArr382);
        Object[] objArr392 = {str202, (String) objArr382[0]};
        D8871 = uH18377.D8871(1214576837);
        if (D8871 == null) {
        }
        long longValue72 = ((Long) ((Method) D8871).invoke(null, objArr392)).longValue();
        long j512 = -846922567;
        long j522 = -103;
        long j532 = (j522 * longValue72) + (j522 * j512);
        long j542 = 104;
        long j552 = longValue72 ^ j5;
        j6 = ((j542 * (j512 | j26)) + (((-104) * (((j30 | j512) | longValue72) ^ j5)) + ((((((j512 ^ j5) | j552) ^ j5) | ((j552 | j26) ^ j5)) * j542) + j532))) - 700715771;
        i24 = ((int) (j6 >> c3)) & ((((~((~Process.myPid()) | 135016574)) | (-1438299736)) * 398) + ((((~(135016574 | r9)) | (-1438299736)) * 398) - 1431504452));
        i25 = ~Process.myUid();
        if (((((int) j6) & ((((~((-2002498796) | i25)) | (-855242091)) * 68) + ((~((-10502401) | i25)) * (-68)) + ((((~(r3 | 2002498795)) | ((~((-844739691) | i25)) | (-2013001196))) * (-68)) - 2141271023))) | i24) == 0) {
        }
        int i2212 = ((~i2152) & i4) | (i2152 & i79);
        int i2222 = -i2212;
        int i2232 = ((i2212 & i2222) | (i2212 ^ i2222)) >> 31;
        int i2242 = i26 & (~i2232);
        int i2252 = i2152 & i2232;
        int i2262 = (i2252 & i2242) | (i2242 ^ i2252);
        char indexOf62 = (char) TextUtils.indexOf("", "");
        int i2272 = -(-View.MeasureSpec.getMode(0));
        int i2282 = (i2272 ^ 370) + ((i2272 & 370) << 1);
        int indexOf72 = TextUtils.indexOf("", "", 0);
        int i2292 = ((indexOf72 | 23) << 1) - (indexOf72 ^ 23);
        Object[] objArr412 = new Object[1];
        bravo(indexOf62, i2282, i2292, objArr412);
        Object[] objArr422 = {(String) objArr412[0]};
        D88712 = uH18377.D8871(-957097391);
        if (D88712 == null) {
        }
        String lowerCase2 = ((String) ((Method) D88712).invoke(null, objArr422)).toLowerCase();
        int threadPriority6 = Process.getThreadPriority(0);
        char c202 = 20;
        char c212 = (char) ((((threadPriority6 | 20) << 1) - (threadPriority6 ^ 20)) >> 6);
        int offsetBefore22 = TextUtils.getOffsetBefore("", 0);
        int i2312 = -(-AndroidCharacter.getMirror('0'));
        Object[] objArr442 = new Object[1];
        bravo(c212, (offsetBefore22 ^ 393) + ((offsetBefore22 & 393) << 1), ((i2312 | (-44)) << 1) - (i2312 ^ (-44)), objArr442);
        if (!lowerCase2.contains((String) objArr442[0])) {
        }
        int i2332 = (~(i4 & i2262)) & (i4 | i2262);
        int i2342 = -i2332;
        int i2352 = ((i2332 & i2342) | (i2332 ^ i2342)) >> 31;
        int i2362 = i232 & (~i2352);
        int i2372 = i2262 & i2352;
        int i2382 = (i2372 & i2362) | (i2362 ^ i2372);
        char mirror4 = (char) (22222 - AndroidCharacter.getMirror('0'));
        int i2392 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 397;
        int resolveOpacity22 = Drawable.resolveOpacity(0, 0);
        Object[] objArr452 = new Object[1];
        bravo(mirror4, i2392, (resolveOpacity22 ^ 42) + ((resolveOpacity22 & 42) << 1), objArr452);
        String str212 = (String) objArr452[0];
        int i2402 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        int i2412 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        char mirror22 = AndroidCharacter.getMirror('0');
        int i2422 = (mirror22 & 65528) + (mirror22 | 65528);
        Object[] objArr462 = new Object[1];
        bravo((char) ((i2402 & 24700) + (i2402 | 24700)), ((i2412 | 438) << 1) - (i2412 ^ 438), i2422, objArr462);
        String str222 = (String) objArr462[0];
        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0);
        int i2432 = 478 - (~(-Color.green(0)));
        int i2442 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
        int i2452 = (i2442 & 27) + (i2442 | 27);
        Object[] objArr472 = new Object[1];
        bravo((char) ((bitsPerPixel3 & 15800) + (bitsPerPixel3 | 15800)), i2432, i2452, objArr472);
        String str232 = (String) objArr472[0];
        int i2462 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        Object[] objArr482 = new Object[1];
        bravo((char) ((i2462 ^ 45360) + ((i2462 & 45360) << 1)), Color.rgb(0, 0, 0) + 16777722, 26 - (~(ViewConfiguration.getScrollBarSize() >> 8)), objArr482);
        String str242 = (String) objArr482[0];
        int capsMode22 = TextUtils.getCapsMode("", 0, 0);
        int i2472 = -Color.rgb(0, 0, 0);
        int i2482 = ((i2472 | (-16776683)) << 1) - (i2472 ^ (-16776683));
        int i2492 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i2502 = ((i2492 | 27) << 1) - (i2492 ^ 27);
        Object[] objArr492 = new Object[1];
        bravo((char) ((capsMode22 ^ 39199) + ((capsMode22 & 39199) << 1)), i2482, i2502, objArr492);
        String str252 = (String) objArr492[0];
        int i2512 = -(-TextUtils.indexOf((CharSequence) "", '0'));
        int scrollBarFadeDuration22 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
        int i2522 = (scrollBarFadeDuration22 & 560) + (scrollBarFadeDuration22 | 560);
        int i2532 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i2542 = 1;
        int i2552 = (i2532 ^ 27) + ((i2532 & 27) << 1);
        Object[] objArr502 = new Object[1];
        bravo((char) ((i2512 ^ 1) + ((i2512 & 1) << 1)), i2522, i2552, objArr502);
        String[] strArr132 = {str212, str222, str232, str242, str252, (String) objArr502[0]};
        i27 = i20;
        i28 = 0;
        while (i28 < i27) {
        }
        i29 = i2382;
        c4 = c202;
        i30 = i4;
        int i2622 = (~(i4 & i29)) & (i4 | i29);
        int i2632 = -i2622;
        int i2642 = ((i2622 & i2632) | (i2622 ^ i2632)) >> 31;
        int i2652 = (i30 & (~i2642)) | (i29 & i2642);
        char myPid6 = (char) ((Process.myPid() >> 22) + 7690);
        int i2662 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
        int i2672 = (i2662 ^ 347) + ((i2662 & 347) << 1);
        int deadChar4 = KeyEvent.getDeadChar(0, 0);
        int i2682 = ((deadChar4 | 17) << 1) - (deadChar4 ^ 17);
        Object[] objArr552 = new Object[1];
        bravo(myPid6, i2672, i2682, objArr552);
        String str282 = (String) objArr552[0];
        char c222 = (char) (52842 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
        int i2692 = -ExpandableListView.getPackedPositionChild(0L);
        int i2702 = ((i2692 | 586) << 1) - (i2692 ^ 586);
        int i2712 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i2722 = (i2712 ^ 6) + ((i2712 & 6) << 1);
        Object[] objArr562 = new Object[1];
        bravo(c222, i2702, i2722, objArr562);
        str = (String) objArr562[0];
        file = new File(str282);
        if (file.exists()) {
            Scanner scanner5 = new Scanner(new FileInputStream(file));
            Object[] objArr572 = new Object[1];
            bravo((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 592 - (~(-TextUtils.getTrimmedLength(""))), 1 - (~(ViewConfiguration.getWindowTouchSlop() >> 8)), objArr572);
            Scanner useDelimiter22 = scanner5.useDelimiter((String) objArr572[0]);
            if (!useDelimiter22.hasNext()) {
            }
            useDelimiter22.close();
            if (next.contains(str)) {
            }
        }
        int threadPriority52 = Process.getThreadPriority(0);
        int i7922 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
        Object[] objArr1862 = new Object[1];
        bravo((char) (((threadPriority52 ^ 20) + ((threadPriority52 & 20) << 1)) >> 6), (i7922 ^ 595) + ((i7922 & 595) << 1), 13 - (~TextUtils.lastIndexOf("", '0', 0, 0)), objArr1862);
        String str942 = (String) objArr1862[0];
        int bitsPerPixel22 = ImageFormat.getBitsPerPixel(0);
        int i7932 = ((bitsPerPixel22 | 609) << 1) - (bitsPerPixel22 ^ 609);
        int i7942 = -ExpandableListView.getPackedPositionGroup(0L);
        int i7952 = (i7942 ^ 9) + ((i7942 & 9) << 1);
        Object[] objArr1872 = new Object[1];
        bravo((char) ((-Process.getGidForName("")) - 1), i7932, i7952, objArr1872);
        str2 = (String) objArr1872[0];
        file2 = new File(str942);
        if (file2.exists()) {
            Scanner scanner42 = new Scanner(new FileInputStream(file2));
            int i7962 = -AndroidCharacter.getMirror('0');
            int i7972 = 591 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr1882 = new Object[1];
            bravo((char) ((i7962 ^ 48) + ((i7962 & 48) << 1)), i7972, (makeMeasureSpec22 & 2) + (makeMeasureSpec22 | 2), objArr1882);
            useDelimiter = scanner42.useDelimiter((String) objArr1882[0]);
            if (useDelimiter.hasNext()) {
            }
            useDelimiter.close();
            if (str3.contains(str2)) {
            }
        }
        z2 = false;
        if (z2) {
        }
        int i273222 = ((~i2652) & i4) | (i2652 & i79);
        int i274222 = -i273222;
        int i275222 = ((i273222 & i274222) | (i273222 ^ i274222)) >> 31;
        i32 = (i2652 & i275222) | (i31 & (~i275222));
        if ((i5 & 8) != 0) {
        }
        char jumpTapTimeout2222 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
        int i305222 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        int i306222 = (i305222 & 739) + (i305222 | 739);
        int i307222 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int alpha3222 = C1211g1.alpha();
        int i308222 = i307222 * 980;
        int i309222 = (i308222 & (-41076)) + (i308222 | (-41076));
        int i310222 = ~alpha3222;
        int i311222 = (~((-43) | i310222)) * 979;
        int i312222 = (i309222 & i311222) + (i311222 | i309222);
        int i313222 = (i307222 | alpha3222) * (-979);
        int i314222 = ~(((-43) & alpha3222) | ((-43) ^ alpha3222));
        int i315222 = ~((i307222 & i310222) | (i310222 ^ i307222));
        int i316222 = (((i312222 & i313222) + (i312222 | i313222)) - (~(-(-(((i315222 & i314222) | (i314222 ^ i315222)) * 979))))) - 1;
        Object[] objArr63222 = new Object[1];
        bravo(jumpTapTimeout2222, i306222, i316222, objArr63222);
        String str31222 = (String) objArr63222[0];
        i33 = 1;
        Object[] objArr64222 = new Object[1];
        bravo((char) (5113 - View.getDefaultSize(0, 0)), 780 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), 29 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16)))), objArr64222);
        c10 = 0;
        strArr = new String[]{str31222, (String) objArr64222[0]};
        i34 = 0;
        while (true) {
            if (i34 < 2) {
            }
            i34++;
            i32 = i35;
            strArr = strArr5;
            i33 = 1;
            c10 = 0;
        }
        int i323222 = i4 ^ i35;
        int i324222 = -i323222;
        int i325222 = ((i323222 & i324222) | (i323222 ^ i324222)) >> 31;
        int i326222 = (i36 & (~i325222)) | (i35 & i325222);
        D88713 = uH18377.D8871(-344556366);
        if (D88713 == null) {
        }
        long longValue10222 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
        long j69222 = 1204245118;
        long j70222 = 614;
        long elapsedRealtime2222 = (int) SystemClock.elapsedRealtime();
        long j71222 = j69222 ^ j5;
        long j72222 = (j71222 | longValue10222) ^ j5;
        long j73222 = longValue10222 ^ j5;
        long j74222 = elapsedRealtime2222 ^ j5;
        j7 = ((j70222 * ((((j71222 | j73222) | j74222) ^ j5) | (((j74222 | j69222) | longValue10222) ^ j5))) + (((-1228) * ((((j71222 | j74222) ^ j5) | j72222) | ((j74222 | longValue10222) ^ j5))) + ((((elapsedRealtime2222 | j72222) | ((j73222 | j69222) ^ j5)) * j70222) + (((-613) * longValue10222) + (615 * j69222))))) - 1356498216;
        int elapsedRealtime3222 = (int) SystemClock.elapsedRealtime();
        int i327222 = ~elapsedRealtime3222;
        i37 = ((int) (j7 >> c3)) & ((((~(elapsedRealtime3222 | 259329497)) | 1073758720 | (~(i327222 | (-155191305)))) * 369) + (((~((-259329498) | i327222)) | 1177896913) * (-369)) + (((1333088217 | i327222) * (-369)) - 802173004));
        myUid = Process.myUid();
        i38 = ~(810457777 | myUid);
        i39 = ~myUid;
        if ((i37 | (((int) j7) & ((((~(myUid | 626768632)) | (~((-810457778) | i39))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~((-85008457) | i39)) * (-406)) + ((i38 | (~((-541760177) | i39))) * (-406)) + 1294392047))) == 1) {
        }
        int i781222 = ((~i40) & i4) | (i40 & i79);
        int i782222 = -i781222;
        Object[] objArr185222 = {new int[]{i40}, new int[]{i4}, new int[1], strArr2};
        int freeMemory3222 = (int) Runtime.getRuntime().freeMemory();
        int i783222 = ~freeMemory3222;
        int i784222 = ((314922210 | (~(682090740 | i783222))) * 712) + (((~(freeMemory3222 | (-306189315))) | (~(i783222 | 988280054))) * (-712)) + ((((-988280055) | r4) * (-712)) - 836448743);
        int i785222 = -(-((((i781222 & i782222) | (i781222 ^ i782222)) >> 31) & 16));
        int i786222 = (i784222 ^ i785222) + ((i785222 & i784222) << 1) + i10;
        int i787222 = i786222 << 13;
        int i788222 = (i787222 & (~i786222)) | ((~i787222) & i786222);
        int i789222 = i788222 >>> 17;
        int i790222 = (i788222 | i789222) & (~(i788222 & i789222));
        int i791222 = i790222 << 5;
        ((int[]) objArr185222[2])[0] = (i790222 | i791222) & (~(i790222 & i791222));
        return objArr185222;
    }
}
