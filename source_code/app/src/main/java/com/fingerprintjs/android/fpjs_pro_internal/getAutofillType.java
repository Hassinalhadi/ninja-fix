package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.os.WorkSource;
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
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/getAutofillType;", "", "delta", "setPivotYN16904"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class getAutofillType {

    @NotNull
    private static final setPivotYN16904 delta = new setPivotYN16904(null);
    public static final List echo = CollectionsKt.listOf("gps", "network", "passive");
    public static int foxtrot = 0;
    public static int golf = 1;
    public final Context alpha;
    public final LocationManager bravo;
    public final Geocoder charlie;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/getAutofillType$setPivotYN16904;", "", "", "", "vD14832N6715", "Ljava/util/List;", "component9"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class setPivotYN16904 {
        public static final char[] alpha;
        public static final long bravo;
        public static int charlie;
        public static int delta;
        public static final byte[] echo = null;
        public static final byte[] foxtrot = null;

        static {
            echo();
            delta();
            charlie = 0;
            delta = 1;
            char[] cArr = new char[2156];
            ByteBuffer.wrap("Øñ¶a\u0005\r\u00949c\u009dòþA\u0093ßO®b=\u000b\u008c9\u001bÄêòy\u009e×E¦o5\n\u0084'\u0013Ýâìq±Ïv^\u007f-\u0003¼7\u000bÞ\u009a\u0085\u007f\n\u0011\u009a¢ö3ÂÄfU\u0005æhx´\t\u0099\u009að+Â¼?M\tÞep¯\u0001\u0099\u0092å#Ë´\u001cE\u0000ÖIh ù\u0094\u008aü\u001bÉuû\u001bk¨\u000793Î\u0097_ôì\u0099rE\u0003h\u0090\u0001!3¶ÎGøÔ\u0094z]\u000bx\u0098\n)<\u007f\n\u0011\u008d¢ê3ÇÄfU\u000fæhx¼\t\u0088\u009aú+Î¼cM\u0006ÞUp³\u0001\u0094\u0092ó#Ç´0E\fÖfh°ù\u0096\u008aü\u001bÙ¬#=iÎE(ûFjõ\u0016d&\u0093\u0097\u0002÷±\u0091/\u0007^|Í\u0015|5ëÍê\u0015\u0084\u00847ø¦ÈQyÀ\u000esqíª\u009cÌ\u000fù¾Æ)<Ø\u000e\u008aÄäCW9Æ\u00191æ Þ\u0013\u00ad\u008d9üao\u001eÞ(Ií¸Ù+\u0091\u0085Uô_g/Ö\u0001\u007f\n\u0011\u009a¢ò3ÀÄ(UMæ)x»\t\u008d\u009aã+Â¼\"M\u0007ÞU\u007fW\u0011\u0091¢½3ÖÄ&U\ræsxö\t\u008f\u009aó+Ï¼>M\u000eÞSp»\u0001¯\u0092û#Ë´7E;Ö]h¼ù\u0084\u008a¹\u0014,zêÉÆX\u00ad¯]>v\u008d\b\u0013\u008dbôñ\u0088@´×E&uµ(\u001bÀjÔù\u0080H°ßL.@½&\u0003Ç\u0092ÿáÁáf\u008fá<\u0086\u00ad«ZQËkx\u0006æ\u009b\u0097ý\u0004\u0093µ¥\"\u000fÓa@?îÑ\u009fò\f\u009b½ì*\\Ûg\u007fG\u0011\u0097¢ô3ÚÄ&U\u001a\u001d\u008bs\fÀkQF¦¼7\u0086\u0084ë\u001avk\u001eø~IDÞâ/\u008e¼Þ\u00123c\u0004ðBAbÖï'\u008b´Ý\n>\u009b\u0003è$yOÎ¨_ô¬É\u0002\"\u0093\u0004àbý \u0093§ À±íF\u0017×-d@úÝ\u008bµ\u0018Õ©ï>IÏ%\\uò\u0098\u0083¯\u0010é¡É6DÇ>Taê\u0097{\u00ad\u009dìók@\fÑ!&Û·á\u0004\u008c\u009a\u0011ëwx\u0019É/^\u0085¯ë<µ\u0092[ãxp\u0016Á%VÐ§Ô4\u0092\u008aD\u001bch\u0001ù;N\u008eß\u008e,µ\u007f\n\u0011\u009a¢ö3ÂÄfU\fæbxµ\t\u0088\u009añ+Þ¼)M\u0012ÞNUó;5\u0088\u0019\u0019rî\u0098\u007f¯ÌÏR\u0018#w°Z\u0001`\u0096\u009bg±\u007fK\u0011\u009b¢ò3ÇÄ,ULæix½\t\u0089\u007f\n\u0011\u008e¢á3ÛÄ*UMæax±\t\u0091\u009aó+Ø¼5M\u0012ÞNpº\u0001\u009d\u0092æ\u0007»ikÚ\u000eK1¼Ê-ô\u007fy\u0011¿rØ\u001c\u001e¯2>KÉ´X\u0082ëìu\"\u0004\u0011\u0097m&\n±®@\u008fÓÛ}%\f\u0019\u009f{.B¹¸H\u009eÛÄe8ô\n\rscªÐÌAü\u007fU\u0011\u009b¢á3ÇÄ U\u0011æsxö\t\u008e\u009aï+Ø¼bM\u0003Þ^pñ\u0001\u0094\u0092ð#Ì´6E\u0003Ö\u0017hµù\u0087\u008aý\u001b\u0083¬ =zÎW`´ñµ\u0082è\u0013Ð¤05AÆAX±é\u0087zæ\u000bÂ\u009c\n-x¾D\u0004^j\u0090ÙêHÌ¿+.\u001a\u009dx\u0003ýr\u0085áäPÓÇi6\b¥U\u000búz\u009féûXÇÏ=>\b\u00ad\u001c\u0013¾\u0082\u008cñö`\u0088×+Fqµ\\\u001b¿\u008a¾ùãhÛß;NJ½N#º\u0092\u008c\u0001ípÃç\u0001\u007fU\u0011\u009b¢á3ÇÄ U\u0011æsxö\t\u008e\u009aï+Ø¼bM\u0003Þ^pñ\u0001\u0094\u0092ð#Ì´6E\u0003Ö\u0017h ù\u0098\u008a¦\u001bÎ¬7=r\u0091Rÿ\u009cLæÝÀ*'»\u0016\bt\u0096ñç\u0089tèÅßRe£\u00040Y\u009eöï\u0093|÷ÍËZ1«\u00048\u0010\u0086§\u0017\u009fd¡õÆB Ó\u007f\u007fU\u0011\u009b¢á3ÇÄ U\u0011æsxö\t\u008e\u009aï+Ø¼bM\u0003Þ^pñ\u0001\u0094\u0092ð#Ì´6E\u0003Ö\u0017h ù\u0098\u008a¦\u001bÀ¬%=x2\u0015\\Ûï¡~\u0087\u0089`\u0018Q«35¶DÎ×¯f\u0098ñ\"\u0000C\u0093\u001e=±LÔß°n\u008cùv\bC\u009bW%à´ØÇæV\u0080áhp8¯>Áñr\u0091ã¡\u0014W\u0085iµ¯Û+hDù~\u000e\u008f\u009fè,Ï²\u0012Ã<PFábv\u008c\u0087·\u007fS\u0011\u009c¢ü3ÌÄ.U\u0017æbx«\t\u0089ê\n\u0084\u008d7ê¦ÇQ=À\u0007sjí÷\u009c\u009b\u000fä¾Ê)!Ø\u0004KMå°\u0094\u0082\u0007þ¶\u0081!4Ð\rCWý¶l\u0098\u001fÿ\u008eÞ9k¨h[Eõ¢d\u009e\u0017ê\u0086Í1\u001a mSVÍ¦|\u009fïç\u009eÕ\tV¸w+WÅ¹4AZÃé½x\u0091\u008ff\u001eF\u00ad>3¼BÚÑ´`\u0082÷1\u0006\u001e\u0095^;üJÌÙñh\u0084ÿ}\u000eK\u009d\u001b#ö²\u0092Á³P\u0094çdv=\u0085\u0016+èºØÉêX\u009cïg~;\u008d\u001c\u0013ð¢Õ1º@Â×@f9PS>Ñ\u008d¯\u001c\u0083ëtzTÉ,W®&Èµ¦\u0004\u0090\u0093#b\fñL_î.Þ½ã\f\u009f\u009bmj^ù\u000fGæÖÞ¥¾4\u0087\u0083z\u00120áKOÿÞÚ\u00ad¸<\u009d\u008bs\u001a0é\u0019w£ÆÃU´\u007f\n\u0011\u008d¢ê3ÇÄ=U\u0007æjx÷\t\u0091\u009aÿ+É¼zMUÞ\u0015p¼\u0001\u009c\u0092ú#Û´'E;ÖXh»ù\u0093\u008aä\u001bò¬/=uÎH`´ñ\u0098\u0082é\u0013Á¤&5{Æ\u001eX·é\u0099zò\u000b\u0089\u009c\u000b-r\u007f\n\u0011\u009b¢ç3×ÄfU\u000bæix±\t\u0089\u009a¹+Â¼\"M\bÞNpñ\u0001\u0093\u0092ù#Á´6E\u0000ÖJh·ù\u0085\u008aþ\u001bÄ¬%=~Î\u0012`£ñ\u0089ö\u009b\u0098b+\u0004º4MÝÜôo\u008añH\u0080k\u0013\u0001\u007fP\u0011\u0090¢ø3ÚÄ&U\u0015æi*³Dc÷\u0014f.\u0091Ñ\u0000þ³\u0087-@?¨QnâBs;\u0084Ä\u0015ò¦\u009c8RIaÚ\u001dkzü×\rû\u009e³0IAlÒ\u000f\u007fS\u0011\u009c¢ü3ÌÄqUTæw\u007fB\u0011\u009b¢ý3ÑÄ;U\u000bædÒ\u009b¼B\u000f$\u009e\biâøÒK½Õ^¤\\7w\u0086D\u007fB\u0011\u009b¢ý3ÑÄ;U\u000bædx\u0087\t\u0085\u009a®+\u009d¼\u0013MWÞ\u000e>°PvãZr#\u0085Ü\u0014ê§\u00849JHyÛ\u0005jbýÆ\fé\u009f¹1]@{·½Ùqj\u0013\u0089kç¸TÍÅó2\u0003£=\u0010C\u008e\u0081]c3\u0089\u0080ä\u0011\u0093æ\u001cw\u0010ÄnZ«+\u0093¸ü\tÉ\u009eko\u0000üRRª#×°Ñ\u0001Á\u00966g\fôSJ°\u0099\u008c÷xD\u001fÕ.\"Î³ã\u0000\u008b\u009e\u0010ïF|:Í\bZ\u0084«ë8§\u0096^çtt\tÅfRÍ£ã0£\u008e\u001a\u001fglXýs\u0096Úø.KIÚx-\u0098¼µ\u000fÝ\u0091Fà\u0010slÂ^UÒ¤½7ñ\u0099\bè\"{_Ê0]\u009b¬µ?õ\u0081L\u00101c\u000eò%E§Ô\u0093'¶\u007fW\u0011\u0091¢½3ÜÄ(U\u0010æcx¯\t\u009c\u009aä+Î\u007fB\u0011\u0091¢ÿ3ÐÄ/U\u000bætx°Éð§?\u0014_\u0085orÒã÷b©\fa¿\u0003.)ÙßHéØ5¶ó\u0005ß\u0094¦cYòoA\u0001ßÏ®ü=\u0080\u008cç\u001bLêqy9×Ó¦ö\u007fW\u0011\u0091¢½3ßÄ,U\u0010æix½\t\u0091\u009a¸+Ú¼)M\fÞO\u007f\u0014\u007fW\u0011\u0091¢½3ÇÄ,U\u0001ærxª\t\u0098és\u001c,rêÁÆP\u00ad§G6p\u0085\u0010\u001bÇj¨ù\u009dH¢ßX.~½4\u0013ÇbÿFò(:\u009bN\niý§l«ß\u008eA_\u007fW\u0011\u0091¢½3ÖÄ<U\u000bækx¼\tÓ\u009að+Â¼\"M\u0006Þ_p\u00ad\u0001\u0080\u0092ç#Ç´-E\u0010\u007fB\u0011\u009b¢ý3ÑÄ;U\u000bædx÷\t\u008e\u009aò+À¼cM\u0006Þ_p±\u0001\u0095\u0092ç#Ç´ \u007fB\u0011\u009b¢ý3ÑÄ;U\u000bædx\u0087\t\u0085\u009a®+\u009d¼cM\u0012Þ^p´\u0001¯\u0092í#\u0096´uEKÖ^h·ù\u0099\u008aí\u001bß¬/=xÎc`©ñÒ\u0082¹6nX·ëÑzý\u008d\u0017\u001c'¯H1Û@¶ÓÕbèõ\u0007\u0004!\u0097s9¬H¯ÛÝjéý@\f/\u009fp!\u0090°¾ÃÖRèå\t\u007fB\u0011\u009b¢ý3ÑÄ;U\u000bædx÷\t\u008b\u009aô+Ä¼4MYÞ\fp¯\u0001ß\u0092ã#Ì´,E\u001cÖ\u0001häù\u0087\u007fB\u0011\u0091¢ü3ÓÄ%U\u0007æ(x«\t\u0099\u009aý+ô¼+M\u0011ÞRp°\u0001\u009e\u0092ð#ñ´;E\\Ö\u000fhýù\u0090\u008aí\u001bÃ¬#=iÎU`²ñµ\u0082÷\u0013\u0098¤sßM±\u008b\u0002§\u0093Ìd<õ\u0017FiØ®©\u0088:í\u008bÕ\u001c3í\t\u007fW\u0011\u0091¢½3ÖÄ&U\ræsx±\t\u0090\u009a÷+Ì¼)MOÞXpª\u0001\u0099\u0092ù#Ê´mE\u0002ÖPh¼ù\u0090\u008aí\u001bß¬6=iÎU`¿ñ\u009e\u001bõu\u0001ÆfWW ·1\u009a\u0082ò\u001cdm\u0014þ?O\f\u007fW\u0011\u0091¢½3ÖÄ<U\u000bækx¼\tÓ\u009aò+Â¼?M\u0011ÞVp¾\u0001\u0089\u0092»#Ç´'\u007fQ\u0011\u009b¢à3ÀÄdBû,'\u009fM\u000ewùÐh¦ÛÆE\f4d§P\u0016y\u0081\u0096p£ã M\u0018<5¯M\u001ei\u0089\u0087\u007fT\u0011\u009b¢þ3ÁÄgU\næpxö\t\u0090\u009a÷+Â¼\"M\nÞ_p¦\u0001\u0083\u007fT\u0011\u009b¢þ3ÁÄgU\u0011æaxö\t\u009b\u009a÷+À¼)M>ÞYp¾\u0001\u009d\u0092ð#Ü´\"·qÙ¾jÛûä\fB\u009d4.D°ÓÁ´RÐãêt6\u0085 \u0016z¸\u0094É¦ZÙëÿ|\u001fÐf¾ \r\u008c\u009cîk\u001dú!IX×\u008c¦ 5\u0089\u0084û\u0013\u0013â4qyß\u0081®¨=À\u008c±\u001b\u0003ê0yeÇ\u0096V¢\u007fW\u0011\u0091¢½3ÖÄ&U\ræsxö\t\u008c\u009aó+Æ¼9MOÞ[p©\u0001\u0094\u0092Ê#À´\"E\tÖ\\\u007fW\u0011\u0091¢½3ÛÄ-U\u000fæ)xº\t\u0088\u009aÿ+Ç¼(MOÞ\\p¶\u0001\u009e\u0092ò#Ë´1E\u0014ÖKh»ù\u0099\u008aü\u007fW\u0011\u0091¢½3ÄÄ;U\ræcx\u00ad\t\u009e\u009aâ+\u0085¼.M\u0014ÞSp³\u0001\u0094\u0092»#È´*E\nÖ^h·ù\u0085\u008aø\u001bß¬/=uÎH\u007fW\u0011\u0091¢½3ÇÄ0U\u0011æsx½\t\u0090\u009a¸+É¼9M\bÞVp»\u0001Þ\u0092ó#Ç´-E\u0003Ö\\h ù\u0087\u008aú\u001bÄ¬(=o\u007fW\u0011\u0091¢½3ÇÄ0U\u0011æsx½\t\u0090\u009aÉ+Î¼4M\u0015Þ\u0014p½\u0001\u0085\u0092ü#Â´'EJÖ_h»ù\u0099\u008aï\u001bÈ¬4=kÎN`¸ñ\u0084\u0082ûø\u009c\u0096Z%v´\tCçÒÇa¨ÿ|\u008eD\u001ds¬\u0002;òÊÃY\u009d÷p\u0086\u0015\u00158¤\f3æÂÈQ\u0097ïk~L\r1\u009c\u000f+ãº¤ê±\u0084w7[¦$QÊÀês\u0085íQ\u009ci\u000f/¾))ÆØìK±å\u0017\u0094t\u0007\u0006¶!!ÉÐæCñýRlx\u001f\u0000\u008e,9Å¨\u008f[ªõEde\u0017\u0007\u00862\u007f\r\u007f\t\u0011Þ@4\u007f\fÊ\r¤\u009d\u0017ñ\u0086Åqaà\u0014SeÍ²¼\u008f/Î\u009eÜ\t\"ø\u0016kX\u00adðÃ`p\fá8\u0016\u009c\u0087ë4\u0092ªAÛlH\tù%n\u0099\u009fù\f¡¢VÓo@\rñ5f×\u0097ú\u0004\u009cºO+hX\u001cÉ.~Ø\u0084Ìê\\Y0È\u0004? ®×\u001d®\u0083}òPa5Ð\u0019G¥¶À%\u0099\u008bwúOi7\u0092ØüHO$Þ\u0010)´¸Ã\u000bº\u0095iäDw!Æ\rQ± Â3\u008d\u009d`ìW\u007f#\u007f\n\u0011\u008d¢ê3ÇÄfU\u0013æbxµ\t\u0088\u009aÉ+ß¼>M\u0000ÞYpº\u007f\n\u0011\u008d¢ê3ÇÄ=U\u0007æjx÷\t\u0091\u009aÿ+É¼cM\rÞSp½\u0001\u0093\u0092Ê#Ã´\"E\bÖUh½ù\u0094\u008a×\u001bÉ¬#=yÎI`¶ñµ\u0082þ\u0013Å¤(5kÆ\u001dX§é\u0086\u007f\n\u0011\u009a¢ö3ÂÄfU\u0000ætx¬\t¢\u009añ+Û¼?\u0013'}·ÎÛ_ï¨K9-\u008aY\u0014\u0081e\u008föÏGïÐ\f!)\u007f\n\u0011\u009a¢ö3ÂÄfU\u0011æhx»\t\u0096\u009aó+ß¼cM\u0003ÞIp«\u0001\u0096\u0092ú#Â´'E\u0001ÖKh¶\u0096\\øÛK¼Ú\u0091-k¼Q\u000f<\u0091¡àÇs©Â\u009fU5¤[7\u0005\u0099ëèÄ{°Ê\u008c]s¬]?\u0003\u0081à\u0010Äc¬ò¤EzÔ#'\u0003\u0089©\u0018Ïk¶\u0084\u0004ê\u0094YøÈÌ?h®\u000e\u001dz\u0083¢ò\u0092aûÐÆG'\u009bJõÚF¶×\u0082 &±@\u00024\u009cìíÚ~¯Ï\u0099Xc¨,Æ¼uÐää\u0013@\u0082&1R¯\u008aÞ¶MÕüêk\u0004f \b0»\\*hÝÌLªÿÞa\u0006\u00108\u0083N2h¥\u0083\u0002ÆlVß:N\u000e¹ª(Ì\u009b¸\u0005`tGç7V\u0014Áçøt\u0096ä%\u0088´¼C\u0018Ò~a\nÿÒ\u008eó\u001d\u008f¬´;[ÊoY'\u007f\n\u0011\u009a¢ö3ÂÄfU\u0000ætx¬\t¢\u009aÿ+Æ¼)\u0089\u0012ç\u0082TêÅØ20£U\u0010{\u008e¯ÿ\u0092làÝßJ;»\u0018(F\u0086´÷Çd£ÕÎB9³S C\u009e¹\u000f\u009b|ûÔ\u0080º\u0019\tw\u0098Joìþ\u009fMäÓ<¢\u00131s\u0080V\u0017µæÄuòÛ&ª\u000e9L\u0088L\u001f¨î\u009c}ÖÃ<R;!m°K\u0007¨\u0096ôeÄ\u007f\n\u0011\u008e¢á3ÛÄ*UMænx·\t\u008d\u009aù+Ù¼8M\u0012\u007f\u0015\u0011\u0098¢õ3\u0094Äss\u0003\u001d\u0087®è?ÒÈ#YDê}t´\u0005\u0098\u0096ù'\u008d°(A\tÒC|¥\u007fB\u0011\u008c¢ò3ØÄ%U\rædxö\t\u009a\u009aù+Ç¼(M\u0007ÞSp¬\u0001\u0098\u0092»#Ý´,\u007fI\u0011\u0097¢ñ3óÄ\u0005U'æTx\u0087\t\u009f\u009aå+ß¼bM\u0012ÞU\u007f\n\u0011\u009b¢ç3×ÄfU\u000fæbx¼\t\u0094\u009a÷+ô¼/M\u000eÞ^pº\u0001\u0093\u0092æ#\u0080´;E\tÖU\u007fG\u0011\u0092¢æ3ÑÄ:U\u0016æfx»\t\u0096\u009aåS*=»\u008eÇ\u001f÷èFy/ÊHT\u008d%³¶Â\u0007øQÛ?K\u008c#\u001d\u0011êù{\u009cÈ²Vf'[´)\u0005\u0016\u0092òcÑð\u008f^}/\u000e¼j\r\u001b\u009aâk\u009aø\u0089Fs×V¤*5R\u0082ï\u0013§à\u0081\u007f\n\u0011\u008e¢á3ÛÄ*UMædx¨\t\u0088\u009aÿ+Å¼*M\u000e\u007fb\u0011\u0091¢ÿ3ÐÄ/U\u000bætx°º&Ô¶gÞöì\u0001\u0004\u0090a#F½\u009dÌ¢_Ùî¨y\u0010\u0088?\u001byµ\u0095ÄµWÕæçq\u001c\u0080g\u0013v\u00ad\u008b<©O\u008bÞ±iEøT\u000b\u007f¥\u00904èGÎÖåa\nð@\u0003p\u009d\u008e,¬¿ÜÎÿYzè\\{\u007f\u0095\u008a$µ·ÄÆ\u001bQ6".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2156);
            alpha = cArr;
            bravo = -4952711666355072514L;
        }

        public setPivotYN16904(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String alpha(byte b2, int i4, int i5) {
            int i10;
            int i11 = 4 - (b2 * 2);
            int i12 = i5 * 3;
            int i13 = 106 - i4;
            byte[] bArr = new byte[1 - i12];
            int i14 = 0 - i12;
            byte[] bArr2 = foxtrot;
            if (bArr2 == null) {
                int i15 = i14;
                int i16 = 0;
                i13 += -i15;
                i11++;
                i10 = i16;
                bArr[i10] = (byte) i13;
                i16 = i10 + 1;
                if (i10 == i14) {
                    return new String(bArr, 0);
                }
                i15 = bArr2[i11];
                i13 += -i15;
                i11++;
                i10 = i16;
                bArr[i10] = (byte) i13;
                i16 = i10 + 1;
                if (i10 == i14) {
                }
            } else {
                i10 = 0;
                bArr[i10] = (byte) i13;
                i16 = i10 + 1;
                if (i10 == i14) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void bravo(char c3, int i4, int i5, Object[] objArr) {
            Throwable cause;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            cy cyVar = new cy();
            long[] jArr = new long[i5];
            cyVar.component5 = 0;
            while (true) {
                int i14 = cyVar.component5;
                if (i14 >= i5) {
                    break;
                }
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i13] = Integer.valueOf(alpha[i4 + i14]);
                    Object D8871 = uH18377.D8871(-31669226);
                    Class cls = Integer.TYPE;
                    if (D8871 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2123;
                        char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        i11 = 2;
                        byte b2 = (byte) i13;
                        i10 = i13;
                        byte b4 = b2;
                        i12 = 3;
                        String alpha2 = alpha(b4, b2, b4);
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = cls;
                        D8871 = uH18377.setPivotYN16904(maximumFlingVelocity, maxKeyCode, lastIndexOf, 564618947, false, alpha2, clsArr);
                    } else {
                        i10 = i13;
                        i11 = 2;
                        i12 = 3;
                    }
                    Long l10 = (Long) ((Method) D8871).invoke(null, objArr2);
                    l10.getClass();
                    long j5 = i14;
                    long j6 = bravo;
                    Object[] objArr3 = new Object[4];
                    objArr3[i12] = Integer.valueOf(c3);
                    objArr3[i11] = Long.valueOf(j6);
                    objArr3[1] = Long.valueOf(j5);
                    objArr3[i10] = l10;
                    Object D88712 = uH18377.D8871(-897540670);
                    if (D88712 == null) {
                        int lastIndexOf2 = TextUtils.lastIndexOf("", '0') + 52;
                        int scrollBarFadeDuration = 2796 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char alpha3 = (char) (32779 - Color.alpha(i10));
                        byte b6 = (byte) i12;
                        byte b10 = (byte) (b6 - 3);
                        String alpha4 = alpha(b10, b6, b10);
                        Class[] clsArr2 = new Class[4];
                        Class cls2 = Long.TYPE;
                        clsArr2[i10] = cls2;
                        clsArr2[1] = cls2;
                        clsArr2[i11] = cls2;
                        clsArr2[3] = cls;
                        D88712 = uH18377.setPivotYN16904(lastIndexOf2, scrollBarFadeDuration, alpha3, 356204311, false, alpha4, clsArr2);
                    }
                    jArr[i14] = ((Long) ((Method) D88712).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[i11];
                    objArr4[1] = cyVar;
                    objArr4[i10] = cyVar;
                    Object D88713 = uH18377.D8871(359345605);
                    if (D88713 == null) {
                        byte b11 = (byte) 2;
                        byte b12 = (byte) (b11 - 2);
                        D88713 = uH18377.setPivotYN16904(52 - Color.green(i10), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2174, (char) (TypedValue.complexToFraction(i10, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i10, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -892301552, false, alpha(b12, b11, b12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88713).invoke(null, objArr4);
                    i13 = 0;
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
            char[] cArr = new char[i5];
            cyVar.component5 = 0;
            while (true) {
                int i15 = cyVar.component5;
                if (i15 < i5) {
                    cArr[i15] = (char) jArr[i15];
                    Object[] objArr5 = {cyVar, cyVar};
                    Object D88714 = uH18377.D8871(359345605);
                    if (D88714 == null) {
                        byte b13 = (byte) 2;
                        byte b14 = (byte) (b13 - 2);
                        D88714 = uH18377.setPivotYN16904((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51, ImageFormat.getBitsPerPixel(0) + 2176, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -892301552, false, alpha(b14, b13, b14), new Class[]{Object.class, Object.class});
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void charlie(byte b2, byte b4, short s3, Object[] objArr) {
            int i4;
            int i5;
            int i10 = 4 - (s3 * 3);
            int i11 = 3 - (b4 * 4);
            int i12 = 99 - b2;
            byte[] bArr = new byte[i10];
            byte[] bArr2 = echo;
            if (bArr2 == null) {
                i5 = 0;
                byte[] bArr3 = bArr2;
                int i13 = i11;
                i12 = i12 + i11 + 6;
                i11 = i13;
                bArr2 = bArr3;
                i4 = i5;
                i5 = i4 + 1;
                bArr[i4] = (byte) i12;
                if (i5 == i10) {
                    objArr[0] = new String(bArr, 0);
                    return;
                }
                int i14 = i11 + 1;
                byte b6 = bArr2[i14];
                byte[] bArr4 = bArr2;
                i13 = i14;
                i11 = b6;
                bArr3 = bArr4;
                i12 = i12 + i11 + 6;
                i11 = i13;
                bArr2 = bArr3;
                i4 = i5;
                i5 = i4 + 1;
                bArr[i4] = (byte) i12;
                if (i5 == i10) {
                }
            } else {
                i4 = 0;
                i5 = i4 + 1;
                bArr[i4] = (byte) i12;
                if (i5 == i10) {
                }
            }
        }

        public static void delta() {
            echo = new byte[]{123, -74, 73, -20, 6, -5, 3};
        }

        public static void echo() {
            foxtrot = new byte[]{42, -37, -68, -127};
        }

        /* JADX WARN: Can't wrap try/catch for region: R(36:155|(1:157)|158|159|(2:161|(1:163)(1:362))(1:363)|164|165|(1:167)|168|(5:170|(1:172)|173|174|(20:176|177|178|(1:180)|181|(1:183)(5:302|303|(1:305)|306|307)|184|(5:188|(3:191|(6:193|194|(1:196)(1:218)|197|198|(2:217|214)(5:200|201|202|(2:204|205)(5:207|(1:209)|210|211|(2:213|214)(1:216))|206))(10:219|220|(1:222)(1:227)|223|224|(2:226|214)|201|202|(0)(0)|206)|189)|228|229|215)|230|(1:(4:232|(6:234|(2:236|(2:238|(13:244|245|246|247|248|249|250|251|(2:253|254)(1:287)|255|(2:257|258)|242|243))(3:294|295|296))(1:297)|240|241|242|243)|298|299)(2:300|301))|259|260|261|(5:265|266|(1:268)(1:283)|269|(6:271|272|273|(1:275)|276|277))|285|272|273|(0)|276|277))(1:361)|308|309|(3:312|(5:314|315|(1:317)(1:347)|318|319)(5:348|349|(1:351)|352|353)|310)|355|356|(1:358)(1:360)|359|177|178|(0)|181|(0)(0)|184|(6:186|188|(1:189)|228|229|215)|230|(2:(0)(0)|299)|259|260|261|(6:263|265|266|(0)(0)|269|(0))|285|272|273|(0)|276|277) */
        /* JADX WARN: Code restructure failed: missing block: B:286:0x3af1, code lost:
        
            r3 = (~(r71 & 151)) & (r71 | 151);
         */
        /* JADX WARN: Code restructure failed: missing block: B:320:0x2a59, code lost:
        
            if (r3 != null) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:322:0x2c52, code lost:
        
            r6 = r25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:324:0x2c54, code lost:
        
            r3 = r19 + 1;
            r7 = com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.setPivotYN16904.charlie;
            com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.setPivotYN16904.delta = ((r7 & 111) + (r7 | 111)) % 128;
            r10 = r27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:326:0x2ace, code lost:
        
            if (r3.isEmpty() != false) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:327:0x2ad0, code lost:
        
            r9 = com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.setPivotYN16904.charlie;
            r10 = (r9 & 93) + (r9 | 93);
            com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.setPivotYN16904.delta = r10 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:328:0x2add, code lost:
        
            if ((r10 % 2) != 0) goto L286;
         */
        /* JADX WARN: Code restructure failed: missing block: B:329:0x2adf, code lost:
        
            r15 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:330:0x2ae1, code lost:
        
            if (r7.length == 1) goto L285;
         */
        /* JADX WARN: Code restructure failed: missing block: B:331:0x2ae4, code lost:
        
            r28 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:332:0x2be7, code lost:
        
            r6 = r19 + 10;
            r6 = (r6 & r14) | ((~r6) & r71);
            r7 = ((r5 ^ 102) + ((r5 & 102) << 1)) - 101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:333:0x2bf6, code lost:
        
            if (r7 <= 1) goto L298;
         */
        /* JADX WARN: Code restructure failed: missing block: B:334:0x2bf8, code lost:
        
            r10 = 0;
            r11 = new java.lang.Object[1];
            bravo((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1606 - (~(-(android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)))), 0 - (~(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))), r11);
            r2.append((java.lang.String) r11[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:335:0x2c24, code lost:
        
            r2.append(r28[r10]);
            r5 = (char) (16170 - (~android.view.View.getDefaultSize(r10, r10)));
            r8 = android.view.View.resolveSize(r10, r10) + 1608;
            r9 = android.view.Gravity.getAbsoluteGravity(r10, r10);
            r11 = (r9 ^ 1) + ((r9 & 1) << 1);
            r9 = new java.lang.Object[1];
            bravo(r5, r8, r11, r9);
            r2.append((java.lang.String) r9[r10]);
            r2.append(r3);
            r5 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:337:0x2c23, code lost:
        
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:338:0x2aec, code lost:
        
            r10 = new java.lang.Object[2];
            r10[r15] = r8;
            r10[0] = r3;
            r9 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(-1363379003);
         */
        /* JADX WARN: Code restructure failed: missing block: B:339:0x2afa, code lost:
        
            if (r9 != null) goto L291;
         */
        /* JADX WARN: Code restructure failed: missing block: B:340:0x2afc, code lost:
        
            r51 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
            r9 = 1415 - android.view.KeyEvent.getDeadChar(0, 0);
            r11 = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 3047);
            r15 = (byte) 0;
            r6 = r15;
            r28 = r7;
            r9 = new java.lang.Object[1];
            charlie(r15, r6, r6, r9);
            r9 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r51, r9, r11, 1896341008, false, (java.lang.String) r9[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:341:0x2b45, code lost:
        
            r7 = ((java.lang.Long) ((java.lang.reflect.Method) r9).invoke(null, r10)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:342:0x2b52, code lost:
        
            r9 = 325386600;
            r51 = r9 ^ r5;
            r29 = r7 ^ r5;
            r6 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r53 = (r51 | r29) | (r6 ^ r5);
            r6 = 490;
            r6 = ((r6 * r51) + (((((r29 | r9) ^ r5) | ((r29 | r6) ^ r5)) * r6) + ((r53 * (-490)) + (((-489) * r7) + (491 * r9))))) + 464741023;
            r9 = (int) java.lang.Runtime.getRuntime().freeMemory();
         */
        /* JADX WARN: Code restructure failed: missing block: B:343:0x2be5, code lost:
        
            if (((((int) r6) & ((((~(1728956744 | r14)) | (-608839750)) * 494) + ((((-4333574) | r14) * 494) - 1318100137))) | (((int) (r6 >> r39)) & ((((~(r9 | (-839489680))) | (-866762144)) * 433) + ((((~((-597736732) | r9)) | (-839489680)) * (-433)) + (((~((~r9) | (-269025413))) * 433) - 162584970))))) == 0) goto L270;
         */
        /* JADX WARN: Code restructure failed: missing block: B:344:0x2b43, code lost:
        
            r28 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:345:0x2ae8, code lost:
        
            r15 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:346:0x2aea, code lost:
        
            if (r7.length == 1) goto L285;
         */
        /* JADX WARN: Code restructure failed: missing block: B:354:0x2ac8, code lost:
        
            if (r3 != null) goto L278;
         */
        /* JADX WARN: Removed duplicated region for block: B:111:0x1244 A[Catch: all -> 0x3d0f, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x130c  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x1413  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x164e  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x18c2 A[Catch: all -> 0x3d0f, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x19ae A[Catch: all -> 0x3d0f, TRY_ENTER, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x2cff A[Catch: all -> 0x3d0f, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x2d4a  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x32e3  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x3593  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x3597 A[Catch: all -> 0x3d0f, TRY_ENTER, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:232:0x392a  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x3ad2  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x3ae1  */
        /* JADX WARN: Removed duplicated region for block: B:275:0x3b43 A[Catch: all -> 0x3d0f, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:283:0x3ad4 A[Catch: IOException -> 0x3aef, Exception -> 0x3af1, TryCatch #0 {Exception -> 0x3af1, blocks: (B:261:0x3a28, B:263:0x3a8d, B:266:0x3a93, B:269:0x3ad8, B:283:0x3ad4), top: B:260:0x3a28 }] */
        /* JADX WARN: Removed duplicated region for block: B:300:0x3a18 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:302:0x2d5c  */
        /* JADX WARN: Removed duplicated region for block: B:364:0x3c3b  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x15ee  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x1326  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x13f4  */
        /* JADX WARN: Removed duplicated region for block: B:398:0x13fa  */
        /* JADX WARN: Removed duplicated region for block: B:407:0x11cc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:409:0x1034  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x0f2c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0f2a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0f47  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0fa8 A[Catch: all -> 0x3d0f, TryCatch #7 {all -> 0x3d0f, blocks: (B:6:0x0114, B:8:0x011e, B:9:0x0166, B:21:0x033d, B:23:0x0349, B:24:0x038c, B:32:0x0594, B:34:0x05a1, B:35:0x05da, B:40:0x07c4, B:42:0x07ca, B:43:0x0808, B:45:0x0933, B:47:0x0942, B:48:0x0981, B:55:0x0b0d, B:57:0x0b18, B:58:0x0b5f, B:66:0x0de5, B:68:0x0def, B:69:0x0e2c, B:87:0x0f9e, B:89:0x0fa8, B:90:0x0fe9, B:97:0x114c, B:99:0x1156, B:100:0x1198, B:109:0x1235, B:111:0x1244, B:112:0x1283, B:124:0x14a7, B:126:0x14b1, B:127:0x14fc, B:140:0x1660, B:142:0x166e, B:143:0x16af, B:149:0x18bc, B:151:0x18c2, B:152:0x18fc, B:155:0x19ae, B:157:0x19c0, B:158:0x1a00, B:165:0x1b53, B:167:0x1b5d, B:168:0x1b9b, B:170:0x1ba4, B:172:0x1bbd, B:173:0x1bfc, B:178:0x2cf5, B:180:0x2cff, B:181:0x2d41, B:194:0x32f4, B:196:0x3300, B:197:0x3351, B:207:0x3597, B:209:0x35a1, B:210:0x35e1, B:220:0x3411, B:222:0x341c, B:223:0x3465, B:273:0x3b39, B:275:0x3b43, B:276:0x3b85, B:303:0x2d5f, B:305:0x2d75, B:306:0x2db3, B:315:0x29e9, B:317:0x29f3, B:318:0x2a48, B:338:0x2aec, B:340:0x2afc, B:341:0x2b45, B:349:0x2a6b, B:351:0x2a75, B:352:0x2ab7, B:369:0x1773, B:371:0x1782, B:372:0x17c0, B:421:0x0c2a, B:423:0x0c35, B:424:0x0c77, B:431:0x06bf, B:433:0x06c9, B:434:0x070a, B:440:0x074c, B:442:0x0756, B:443:0x079e, B:449:0x0456, B:451:0x0461, B:452:0x04a3), top: B:5:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x1031  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x114a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] vD14832N6715(Context context, int i4, int i5, int i10) {
            int i11;
            String str;
            int i12;
            char c3;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            String str2;
            File file;
            int i21;
            Object D8871;
            int i22;
            char c4;
            int i23;
            int i24;
            int i25;
            Object D88712;
            int i26;
            int i27;
            boolean z2;
            int i28;
            String str3;
            int i29;
            int i30;
            Object D88713;
            int foxtrot2;
            int i31;
            String[] strArr;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            String[] strArr2;
            int i37;
            int i38;
            String[][] strArr3;
            String[] strArr4;
            String str4;
            String[] strArr5;
            Object D88714;
            Object invoke;
            int i39;
            char c10;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            Object D88715;
            String str5;
            File file2;
            String next;
            int i45;
            int i46;
            String str6;
            String[] strArr6;
            String str7;
            int i47;
            int i48;
            String[] strArr7;
            int i49;
            String str8;
            String str9;
            Object[] objArr;
            String[] strArr8;
            int i50;
            int i51;
            Scanner useDelimiter;
            String next2;
            String[] strArr9;
            String[] strArr10;
            int i52;
            byte[] bArr = echo;
            int i53 = 0;
            int i54 = 1;
            charlie = (delta + 97) % 128;
            String str10 = "";
            int i55 = -TextUtils.indexOf((CharSequence) "", '0');
            int i56 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i57 = (i56 & 910) + (i56 | 910);
            int i58 = -Color.red(0);
            Object[] objArr2 = new Object[1];
            bravo((char) (((i55 | 63018) << 1) - (i55 ^ 63018)), i57, ((i58 | 8) << 1) - (i58 ^ 8), objArr2);
            String str11 = (String) objArr2[0];
            int i59 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i60 = (-2) - ((-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))) ^ (-1));
            int i61 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr3 = new Object[1];
            bravo((char) ((i59 ^ 43003) + ((i59 & 43003) << 1)), i60, ((i61 | 28) << 1) - (i61 ^ 28), objArr3);
            String str12 = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            bravo((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 27, 25 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            String str13 = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            bravo((char) (2800 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51, View.MeasureSpec.getMode(0) + 18, objArr5);
            String str14 = (String) objArr5[0];
            int i62 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i63 = 69 - (~(-(-Gravity.getAbsoluteGravity(0, 0))));
            int i64 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            Object[] objArr6 = new Object[1];
            bravo((char) ((i62 ^ (-1)) + (i62 << 1)), i63, (i64 & 28) + (i64 | 28), objArr6);
            String[] strArr11 = {str12, str13, str14, (String) objArr6[0]};
            int i65 = 0;
            while (true) {
                if (i65 >= 4) {
                    i11 = i54;
                    str = str10;
                    i12 = 6;
                    c3 = ' ';
                    i13 = i4;
                    i14 = i53;
                    break;
                }
                c3 = ' ';
                try {
                    Object[] objArr7 = new Object[i54];
                    objArr7[i53] = strArr11[i65];
                    Object D88716 = uH18377.D8871(1979478258);
                    if (D88716 == null) {
                        int threadPriority = ((Process.getThreadPriority(i53) + 20) >> 6) + 52;
                        int deadChar = KeyEvent.getDeadChar(i53, i53) + 2951;
                        i12 = 6;
                        char myPid = (char) (Process.myPid() >> 22);
                        byte b2 = (byte) (bArr[6] - 1);
                        i52 = i53;
                        byte b4 = (byte) (b2 - 1);
                        Object[] objArr8 = new Object[i54];
                        charlie(b2, (byte) (b4 - 1), b4, objArr8);
                        String str15 = (String) objArr8[i52];
                        Class[] clsArr = new Class[i54];
                        clsArr[i52] = String.class;
                        D88716 = uH18377.setPivotYN16904(threadPriority, deadChar, myPid, -1438133721, false, str15, clsArr);
                    } else {
                        i52 = i53;
                        i12 = 6;
                    }
                    long longValue = ((Long) ((Method) D88716).invoke(null, objArr7)).longValue();
                    long j5 = 386163207;
                    long j6 = -375;
                    long j7 = (j6 * longValue) + (j6 * j5);
                    i11 = i54;
                    str = str10;
                    long j10 = 376;
                    long uptimeMillis = (int) SystemClock.uptimeMillis();
                    long j11 = -1;
                    long j12 = j5 ^ j11;
                    long j13 = (j5 | longValue) ^ j11;
                    long j14 = (j10 * (longValue | (j11 ^ (j12 | uptimeMillis)))) + ((-376) * ((((uptimeMillis ^ j11) | j5) ^ j11) | j13)) + ((uptimeMillis | ((j12 | (longValue ^ j11)) ^ j11) | j13) * j10) + j7 + 388658099;
                    int i66 = ((int) (j14 >> 32)) & (((~((~i4) | 405130720)) * 184) + ((134218112 | i4) * (-184)) + ((((~(1842357131 | r5)) | (-2113269740)) * 184) - 1636836534));
                    int i67 = ((int) j14) & ((((-136314961) | i4) * 668) + (((-1579227645) | (~((-142001235) | i4))) * 1336) + ((((~((-1579227645) | i4)) | (-142001235)) * (-668)) - 785578827));
                    if (((i66 & i67) | (i66 ^ i67)) != 0) {
                        i13 = ((i65 ^ 190) + ((i65 & 190) << 1)) ^ i4;
                        i14 = i52;
                        break;
                    }
                    int i68 = i65 + 7;
                    i65 = ((i68 | (-6)) << 1) - (i68 ^ (-6));
                    i54 = i11;
                    str10 = str;
                    i53 = i52;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            char c11 = (char) (22512 - (~(-View.resolveSize(i14, i14))));
            String str16 = str;
            int i69 = 98 - (~(-(-TextUtils.lastIndexOf(str16, '0'))));
            int i70 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i71 = ((i70 | 11) << 1) - (i70 ^ 11);
            int i72 = i11;
            Object[] objArr9 = new Object[i72];
            bravo(c11, i69, i71, objArr9);
            String str17 = (String) objArr9[0];
            int i73 = -TextUtils.getOffsetAfter(str16, 0);
            char c12 = (char) (((i73 | 38175) << i72) - (i73 ^ 38175));
            int capsMode = TextUtils.getCapsMode(str16, 0, 0);
            int i74 = (capsMode & 110) + (capsMode | 110);
            int i75 = -(-Drawable.resolveOpacity(0, 0));
            Object[] objArr10 = new Object[1];
            bravo(c12, i74, (i75 & 13) + (i75 | 13), objArr10);
            String str18 = (String) objArr10[0];
            char indexOf = (char) (TextUtils.indexOf(str16, str16, 0) + 62926);
            int i76 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr11 = new Object[1];
            bravo(indexOf, (i76 ^ 122) + ((i76 & 122) << 1), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
            String[] strArr12 = {str17, str18, (String) objArr11[0]};
            int i77 = 0;
            while (i77 < 3) {
                int vD14832N6715 = F2.vD14832N6715();
                int i78 = (1162374778 ^ vD14832N6715) | (1162374778 & vD14832N6715);
                int i79 = (((~((vD14832N6715 & (-1581474878)) | ((-1581474878) ^ vD14832N6715))) | 1162374778) * 1336) + (((~i78) | (-1581474878)) * (-668)) + 431077083;
                int i80 = (((-1581474878) & i78) | (i78 ^ (-1581474878))) * 668;
                int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                int vD14832N67152 = F2.vD14832N6715();
                int i82 = ~vD14832N67152;
                int i83 = ~((i82 & (-475407798)) | (i82 ^ (-475407798)));
                int i84 = ((((((-1593812982) & vD14832N67152) | (vD14832N67152 ^ (-1593812982))) * 988) - 1224297801) - (~(-(-(((i83 & 206577793) | (206577793 ^ i83)) * (-1976)))))) - 1;
                int i85 = ~(((-1324982978) & vD14832N67152) | ((-1324982978) ^ vD14832N67152));
                int i86 = (i85 & (-1593812982)) | ((-1593812982) ^ i85);
                int i87 = ~vD14832N67152;
                int i88 = ~((i87 & 1324982977) | (i87 ^ 1324982977));
                if (i81 > (((i88 & i86) | (i86 ^ i88)) * 988) + i84) {
                    Object[] objArr12 = {strArr12[i77]};
                    Object D88717 = uH18377.D8871(1979478258);
                    if (D88717 == null) {
                        int i89 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2951;
                        char axisFromString = (char) (MotionEvent.axisFromString(str16) + 1);
                        byte b6 = (byte) (bArr[i12] - 1);
                        byte b10 = (byte) (b6 - 1);
                        Object[] objArr13 = new Object[1];
                        charlie(b6, (byte) (b10 - 1), b10, objArr13);
                        D88717 = uH18377.setPivotYN16904(i89, minimumFlingVelocity, axisFromString, -1438133721, false, (String) objArr13[0], new Class[]{String.class});
                    }
                    long longValue2 = ((Long) ((Method) D88717).invoke(null, objArr12)).longValue();
                    long j15 = 610313867;
                    long j16 = 881;
                    long j17 = -880;
                    i15 = i13;
                    strArr10 = strArr12;
                    long j18 = -1;
                    long j19 = j15 ^ j18;
                    long j20 = longValue2 ^ j18;
                    long j21 = (j19 | j20) ^ j18;
                    long j22 = i4;
                    long j23 = ((j21 | ((j19 | j22) ^ j18) | ((j20 | j22) ^ j18)) * j17) + (j16 * longValue2) + (j16 * j15);
                    long j24 = longValue2 | ((j19 | (j22 ^ j18)) ^ j18);
                    long j25 = (j22 | j15) ^ j18;
                    long j26 = (880 * j25) + (j17 * (j24 | j25)) + j23 + 164507439;
                    int i90 = (int) Runtime.getRuntime().totalMemory();
                    int i91 = ((int) (j26 << 83)) & ((((~((~i90) | 1773997955)) | 336771544) * 168) + (((~(1773997955 | i90)) | 335720536) * (-168)) + (((~(336771544 | i90)) | 1772946947) * 336) + 501358106);
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i92 = ((int) j26) & ((((~(maxMemory | 1139598646)) | 297627763) * HttpConstants.HTTP_BAD_GATEWAY) + ((~((~maxMemory) | (-1111524613))) * (-502)) + (((~(297627763 | maxMemory)) | 28074034) * (-502)) + 325361847);
                    if (((i91 & i92) | (i91 ^ i92)) != 0) {
                        int i93 = delta;
                        charlie = ((i93 & 83) + (i93 | 83)) % 128;
                        i16 = (((i77 | 270) << 1) - (i77 ^ 270)) ^ i4;
                        break;
                    }
                    i77++;
                    i13 = i15;
                    strArr12 = strArr10;
                } else {
                    i15 = i13;
                    strArr10 = strArr12;
                    Object[] objArr14 = {strArr10[i77]};
                    Object D88718 = uH18377.D8871(1979478258);
                    if (D88718 == null) {
                        int i94 = 52 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2951;
                        char makeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b11 = (byte) (bArr[i12] - 1);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr15 = new Object[1];
                        charlie(b11, (byte) (b12 - 1), b12, objArr15);
                        D88718 = uH18377.setPivotYN16904(i94, keyRepeatDelay, makeMeasureSpec, -1438133721, false, (String) objArr15[0], new Class[]{String.class});
                    }
                    long longValue3 = ((Long) ((Method) D88718).invoke(null, objArr14)).longValue();
                    long j27 = -838007844;
                    long j28 = ((-463) * longValue3) + (465 * j27);
                    long j29 = 464;
                    long j30 = -1;
                    long j31 = longValue3 ^ j30;
                    long romeo = ao.ad.romeo();
                    long j32 = romeo ^ j30;
                    long j33 = (j31 | j27) ^ j30;
                    long j34 = (j29 * (j33 | (j30 ^ (j27 | romeo)))) + ((-464) * (romeo | (j27 ^ j30) | j31)) + ((((j31 | j32) ^ j30) | j33 | ((j32 | j27) ^ j30)) * j29) + j28 + 1612829150;
                    int romeo2 = ao.ad.romeo();
                    if (((((int) (j34 >> c3)) & (((romeo2 | (-1342308353)) * 465) + ((57159414 | (~((-1380066997) | romeo2))) * 930) + ((((~(57159414 | romeo2)) | (-1380066997)) * (-465)) - 1962447094))) | (((int) j34) & A0.z.foxtrot((~(405856859 | i4)) | (~((-1843083270) | i4)), -1324, (((~i4) | 270582362) * 1324) + 818885255, 270093910))) != 0) {
                        int i932 = delta;
                        charlie = ((i932 & 83) + (i932 | 83)) % 128;
                        i16 = (((i77 | 270) << 1) - (i77 ^ 270)) ^ i4;
                        break;
                    }
                    i77++;
                    i13 = i15;
                    strArr12 = strArr10;
                }
            }
            i15 = i13;
            i16 = i4;
            int i95 = i4 ^ i15;
            int i96 = (i95 | (-i95)) >> 31;
            int i97 = (i16 & (~i96)) | (i96 & i15);
            char mode = (char) View.MeasureSpec.getMode(0);
            int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
            Object[] objArr16 = new Object[1];
            bravo(mode, ((pressedStateDuration | ModuleDescriptor.MODULE_VERSION) << 1) - (pressedStateDuration ^ ModuleDescriptor.MODULE_VERSION), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            Object D88719 = uH18377.D8871(-2104138125);
            if (D88719 == null) {
                int keyCodeFromString = 52 - KeyEvent.keyCodeFromString(str16);
                int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 2951;
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b13 = (byte) 1;
                byte b14 = b13;
                Object[] objArr18 = new Object[1];
                charlie(b13, (byte) (b14 - 1), b14, objArr18);
                D88719 = uH18377.setPivotYN16904(keyCodeFromString, combineMeasuredStates, windowTouchSlop, 1563346086, false, (String) objArr18[0], new Class[]{String.class});
            }
            long longValue4 = ((Long) ((Method) D88719).invoke(null, objArr17)).longValue();
            long j35 = 570257693;
            long j36 = ((-396) * longValue4) + (398 * j35);
            long j37 = -397;
            long j38 = -1;
            long j39 = j35 ^ j38;
            long maxMemory2 = (int) Runtime.getRuntime().maxMemory();
            long j40 = maxMemory2 ^ j38;
            long j41 = (j39 | j40) ^ j38;
            long j42 = (j39 | longValue4) ^ j38;
            long j43 = ((397 * ((maxMemory2 | j42) | (((longValue4 ^ j38) | j35) ^ j38))) + ((j37 * j42) + ((((j41 | j42) | ((j40 | longValue4) ^ j38)) * j37) + j36))) - 1799878223;
            int i98 = (((~(1263789026 | i4)) | 335545360 | (~((-1593951859) | i4))) * (-754)) + 1271898570;
            int i99 = ~((-335545361) | i4);
            int i100 = ~i4;
            int i101 = ((int) (j43 >> c3)) & (((1263789026 | i100) * 754) + ((i99 | (~((-1258406499) | i100))) * (-754)) + i98);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i102 = ((int) j43) & ((((~((-1368881006) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 1488859880))) * 333) + ((((~(1488859880 | elapsedCpuTime)) | (~((-1368881006) | r8))) * 333) - 138966367));
            if (((i102 & i101) | (i101 ^ i102)) != 0) {
                i17 = i4 ^ 266;
            } else {
                char c13 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int threadPriority2 = 155 - ((Process.getThreadPriority(0) + 20) >> 6);
                int i103 = -TextUtils.indexOf((CharSequence) str16, '0', 0, 0);
                int i104 = ((i103 | 23) << 1) - (i103 ^ 23);
                Object[] objArr19 = new Object[1];
                bravo(c13, threadPriority2, i104, objArr19);
                Object[] objArr20 = {(String) objArr19[0]};
                Object D887110 = uH18377.D8871(-957097391);
                if (D887110 == null) {
                    int lastIndexOf = 51 - TextUtils.lastIndexOf(str16, '0', 0, 0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3158;
                    char lastIndexOf2 = (char) (58073 - TextUtils.lastIndexOf(str16, '0', 0));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr21 = new Object[1];
                    charlie(b15, (byte) (b16 - 1), b16, objArr21);
                    D887110 = uH18377.setPivotYN16904(lastIndexOf, scrollBarFadeDuration, lastIndexOf2, 424179844, false, (String) objArr21[0], new Class[]{String.class});
                }
                String str19 = (String) ((Method) D887110).invoke(null, objArr20);
                if (str19 == null || str19.isEmpty()) {
                    char c14 = (char) (27514 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    int i105 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 179;
                    int i106 = -KeyEvent.keyCodeFromString(str16);
                    int i107 = (i106 ^ 24) + ((i106 & 24) << 1);
                    Object[] objArr22 = new Object[1];
                    bravo(c14, i105, i107, objArr22);
                    Object[] objArr23 = {(String) objArr22[0]};
                    Object D887111 = uH18377.D8871(-957097391);
                    if (D887111 == null) {
                        int i108 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                        int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 3158;
                        char threadPriority4 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 58074);
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 + 1);
                        Object[] objArr24 = new Object[1];
                        charlie(b17, (byte) (b18 - 1), b18, objArr24);
                        D887111 = uH18377.setPivotYN16904(i108, threadPriority3, threadPriority4, 424179844, false, (String) objArr24[0], new Class[]{String.class});
                    }
                    String str20 = (String) ((Method) D887111).invoke(null, objArr23);
                    if (str20 == null || str20.isEmpty()) {
                        i17 = i4;
                    }
                }
                i17 = (i4 & (-268)) | (i100 & 267);
            }
            int i109 = (~(i4 & i97)) & (i4 | i97);
            int i110 = (i109 | (-i109)) >> 31;
            int i111 = i17 & (~i110);
            int i112 = i110 & i97;
            int i113 = (i111 & i112) | (i111 ^ i112);
            Object D887112 = uH18377.D8871(1074526551);
            if (D887112 == null) {
                int lastIndexOf3 = TextUtils.lastIndexOf(str16, '0', 0) + 52;
                int i114 = 1055 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                byte b19 = (byte) 0;
                byte b20 = b19;
                Object[] objArr25 = new Object[1];
                charlie(b19, b20, b20, objArr25);
                D887112 = uH18377.setPivotYN16904(lastIndexOf3, i114, bitsPerPixel, -1615832190, false, (String) objArr25[0], new Class[0]);
            }
            long longValue5 = ((Long) ((Method) D887112).invoke(null, null)).longValue();
            long j44 = -1331610809;
            long j45 = -751;
            long j46 = (j45 * longValue5) + (j45 * j44);
            long j47 = j44 ^ j38;
            long j48 = longValue5 ^ j38;
            long j49 = (j47 | j48) ^ j38;
            long romeo3 = ao.ad.romeo();
            long j50 = j47 | longValue5;
            long j51 = (752 * ((j50 ^ j38) | ((j48 | j44) ^ j38))) + ((-1504) * ((j50 | romeo3) ^ j38)) + ((j49 | ((j47 | romeo3) ^ j38)) * 1504) + j46 + 1511176526;
            int i115 = (((int) (j51 >> c3)) & ((((~((-1198844734) | i100)) | 1094746384 | (~((-134283329) | i4))) * 497) + (((~((-104098350) | i4)) | (~((-134283329) | i100))) * 497) + 297543677)) | (((int) j51) & (((~(1229543786 | i4)) * 113) + (((~(207682623 | i4)) | 1091109184 | (~((-69248022) | i100))) * (-113)) + (((~(1229543786 | i100)) | (-207682624)) * 226) + 2055568080));
            int i116 = i115 + 199;
            int i117 = (i116 & i100) | ((~i116) & i4);
            int i118 = (i115 | (-i115)) >> 31;
            int i119 = (~i118) & i4;
            int i120 = i118 & i117;
            int i121 = (i120 & i119) | (i119 ^ i120);
            int i122 = ((~i113) & i4) | (i113 & i100);
            int i123 = -i122;
            int i124 = ((i122 & i123) | (i122 ^ i123)) >> 31;
            int i125 = i121 & (~i124);
            int i126 = i113 & i124;
            int i127 = (i126 & i125) | (i125 ^ i126);
            int i128 = -TextUtils.lastIndexOf(str16, '0', 0, 0);
            int i129 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr26 = new Object[1];
            bravo((char) (((i128 | 40555) << 1) - (i128 ^ 40555)), ((i129 | 202) << 1) - (i129 ^ 202), (Process.myTid() >> 22) + 20, objArr26);
            String str21 = (String) objArr26[0];
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int i130 = -(-TextUtils.getTrimmedLength(str16));
            Object[] objArr27 = new Object[1];
            bravo(packedPositionChild, (i130 ^ 223) + ((i130 & 223) << 1), 5 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr27);
            Object[] objArr28 = {str21, (String) objArr27[0]};
            Object D887113 = uH18377.D8871(1214576837);
            if (D887113 == null) {
                int i131 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52;
                int makeMeasureSpec2 = 3314 - View.MeasureSpec.makeMeasureSpec(0, 0);
                char indexOf2 = (char) (TextUtils.indexOf((CharSequence) str16, '0', 0, 0) + 1);
                byte b21 = (byte) 0;
                byte b22 = b21;
                Object[] objArr29 = new Object[1];
                charlie(b21, b22, b22, objArr29);
                D887113 = uH18377.setPivotYN16904(i131, makeMeasureSpec2, indexOf2, -1746970096, false, (String) objArr29[0], new Class[]{String.class, String.class});
            }
            long longValue6 = ((Long) ((Method) D887113).invoke(null, objArr28)).longValue();
            long j52 = -1212160858;
            long j53 = (246 * longValue6) + ((-244) * j52);
            long j54 = -245;
            long j55 = longValue6 ^ j38;
            long freeMemory = (int) Runtime.getRuntime().freeMemory();
            long j56 = ((((j55 | (freeMemory ^ j38)) ^ j38) | ((j55 | j52) ^ j38)) * j54) + j53;
            long j57 = (j55 | freeMemory) ^ j38;
            long j58 = ((245 * (j52 | j57)) + ((j54 * j57) + j56)) - 335477480;
            int i132 = ((int) (j58 >> c3)) & ((((~((-413417576) | i4)) | (~(1023808835 | i100))) * 333) + ((((~((-413417576) | i100)) | (~(1023808835 | i4))) * 333) - 1460913885));
            int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i133 = ~freeMemory2;
            int i134 = ((int) j58) & ((((~(freeMemory2 | (-1206337))) | (~(85420352 | i133)) | (-1436020074)) * 676) + (((~((-1351806058) | i133)) | 1350599721) * 676) + (((-1350599722) | freeMemory2) * (-676)) + 1479496209);
            int i135 = (i132 & i134) | (i132 ^ i134);
            int i136 = -i135;
            int i137 = ((i135 & i136) | (i135 ^ i136)) >> 31;
            int i138 = (i137 & (i4 ^ 262)) | ((~i137) & i4);
            int i139 = ((~i127) & i4) | (i127 & i100);
            int i140 = (i139 | (-i139)) >> 31;
            int i141 = i138 & (~i140);
            int i142 = i127 & i140;
            int i143 = (i142 & i141) | (i141 ^ i142);
            char c15 = (char) (25216 - (~(-TextUtils.getTrimmedLength(str16))));
            int red = 229 - Color.red(0);
            int i144 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i145 = (i144 & 31) + (i144 | 31);
            Object[] objArr30 = new Object[1];
            bravo(c15, red, i145, objArr30);
            String str22 = (String) objArr30[0];
            char alpha2 = (char) (33322 - Color.alpha(0));
            int i146 = -(-Color.green(0));
            int i147 = ((i146 | 260) << 1) - (i146 ^ 260);
            int alpha3 = Color.alpha(0);
            int i148 = (alpha3 ^ 23) + ((alpha3 & 23) << 1);
            Object[] objArr31 = new Object[1];
            bravo(alpha2, i147, i148, objArr31);
            String str23 = (String) objArr31[0];
            int i149 = -TextUtils.getCapsMode(str16, 0, 0);
            int i150 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr32 = new Object[1];
            bravo((char) ((i149 & 58086) + (i149 | 58086)), ((i150 | 283) << 1) - (i150 ^ 283), 28 - TextUtils.getOffsetAfter(str16, 0), objArr32);
            String str24 = (String) objArr32[0];
            char resolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int i151 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i152 = 1;
            int i153 = ((i151 | 312) << 1) - (i151 ^ 312);
            int i154 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
            int i155 = ((i154 | 14) << 1) - (i154 ^ 14);
            Object[] objArr33 = new Object[1];
            bravo(resolveSizeAndState, i153, i155, objArr33);
            String[] strArr13 = {str22, str23, str24, (String) objArr33[0]};
            int i156 = 0;
            while (i156 < 4) {
                int i157 = delta;
                int i158 = ((i157 | 111) << i152) - (i157 ^ 111);
                charlie = i158 % 128;
                if (i158 % 2 != 0) {
                    Object[] objArr34 = new Object[i152];
                    objArr34[0] = strArr13[i156];
                    Object D887114 = uH18377.D8871(1979478258);
                    if (D887114 == null) {
                        int lastIndexOf4 = 51 - TextUtils.lastIndexOf(str16, '0', 0, 0);
                        int fadingEdgeLength = 2951 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        byte b23 = (byte) (bArr[i12] - 1);
                        byte b24 = (byte) (b23 - 1);
                        i18 = i143;
                        Object[] objArr35 = new Object[1];
                        charlie(b23, (byte) (b24 - 1), b24, objArr35);
                        D887114 = uH18377.setPivotYN16904(lastIndexOf4, fadingEdgeLength, mirror, -1438133721, false, (String) objArr35[0], new Class[]{String.class});
                    } else {
                        i18 = i143;
                    }
                    long longValue7 = ((Long) ((Method) D887114).invoke(null, objArr34)).longValue();
                    long j59 = -388723955;
                    long j60 = -112;
                    strArr9 = strArr13;
                    long j61 = longValue7 ^ j38;
                    long j62 = i4;
                    long j63 = j61 | (j62 ^ j38);
                    long j64 = j59 ^ j38;
                    long j65 = (113 * ((j61 | j62) ^ j38)) + ((-113) * (((j64 | longValue7) ^ j38) | ((j64 | j62) ^ j38) | ((j63 | j59) ^ j38))) + (226 * (j59 | (j63 ^ j38))) + (j60 * longValue7) + (j60 * j59) + 1163545261;
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i159 = ((((~((-825181457) | elapsedRealtime)) | 285492480) | (~(612044954 | elapsedRealtime))) * (-754)) - 1066608330;
                    int i160 = ~((-285492481) | elapsedRealtime);
                    int i161 = ~elapsedRealtime;
                    int i162 = ((int) (j65 >>> 74)) & (((i161 | (-825181457)) * 754) + ((i160 | (~(897537434 | i161))) * (-754)) + i159);
                    int i163 = (int) j65;
                    int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                    int i164 = ~maxMemory3;
                    int i165 = i163 & ((((~(maxMemory3 | (-2039612231))) | 4301833 | (~(2039612230 | i164))) * 988) + (((~(818128655 | i164)) | 1225785408) * (-1976)) + ((maxMemory3 | 4301833) * 988) + 1940443317);
                    if (((i162 & i165) | (i162 ^ i165)) != 0) {
                        delta = (charlie + 121) % 128;
                        int i166 = -(-(i156 * (-317)));
                        int i167 = (80388 ^ i166) + ((i166 & 80388) << 1);
                        int i168 = ~i156;
                        int i169 = ~((-253) | i4);
                        int i170 = -(-(((i169 & i168) | (i168 ^ i169)) * (-318)));
                        int i171 = ((i167 | i170) << 1) - (i170 ^ i167);
                        int i172 = ~((i168 & i4) | (i168 ^ i4));
                        int i173 = (i100 ^ 252) | (i100 & 252);
                        int i174 = ~((i173 & i156) | (i173 ^ i156));
                        int i175 = ((i172 & i174) | (i172 ^ i174)) * 318;
                        int i176 = (i171 ^ i175) + ((i175 & i171) << 1);
                        int i177 = ~i156;
                        int i178 = ~((i177 & i100) | (i177 ^ i100) | 252);
                        int i179 = (i156 & 252) | (i156 ^ 252);
                        int i180 = ~((i179 & i4) | (i179 ^ i4));
                        int i181 = ((i178 & i180) | (i178 ^ i180)) * 318;
                        i19 = i4 ^ ((i176 ^ i181) + ((i181 & i176) << 1));
                        break;
                    }
                    i156++;
                    strArr13 = strArr9;
                    i143 = i18;
                    i152 = 1;
                } else {
                    i18 = i143;
                    strArr9 = strArr13;
                    Object[] objArr36 = {strArr9[i156]};
                    Object D887115 = uH18377.D8871(1979478258);
                    if (D887115 == null) {
                        int i182 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53;
                        int keyRepeatTimeout = 2951 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b25 = (byte) (bArr[i12] - 1);
                        byte b26 = (byte) (b25 - 1);
                        Object[] objArr37 = new Object[1];
                        charlie(b25, (byte) (b26 - 1), b26, objArr37);
                        D887115 = uH18377.setPivotYN16904(i182, keyRepeatTimeout, scrollBarSize, -1438133721, false, (String) objArr37[0], new Class[]{String.class});
                    }
                    long longValue8 = ((Long) ((Method) D887115).invoke(null, objArr36)).longValue();
                    long j66 = -1212411162;
                    long j67 = ((-864) * longValue8) + (866 * j66);
                    long j68 = longValue8 ^ j38;
                    long maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                    long j69 = maxMemory4 ^ j38;
                    long j70 = ((-865) * (j68 | (((j66 ^ j38) | j69) ^ j38))) + j67;
                    long j71 = 865;
                    long j72 = (j71 * (((j69 | j66) ^ j38) | ((j68 | j69) ^ j38))) + (((j66 | maxMemory4) ^ j38) * j71) + j70 + 1987232468;
                    int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                    int i183 = ((int) (j72 >> c3)) & ((((~((~elapsedRealtime2) | 2080058886)) | 1436635720) * 262) + (((~(2080058886 | elapsedRealtime2)) | 1436635720) * 262) + 182005540);
                    int romeo4 = ao.ad.romeo();
                    int i184 = ((int) j72) & ((((~(romeo4 | 2046787535)) | (~((~romeo4) | (-830434951))) | 810953350) * 757) + ((~((-19481601) | romeo4)) * 1514) + (((2027305935 | r7) * (-757)) - 1643990222));
                    if (((i184 & i183) | (i183 ^ i184)) != 0) {
                        delta = (charlie + 121) % 128;
                        int i1662 = -(-(i156 * (-317)));
                        int i1672 = (80388 ^ i1662) + ((i1662 & 80388) << 1);
                        int i1682 = ~i156;
                        int i1692 = ~((-253) | i4);
                        int i1702 = -(-(((i1692 & i1682) | (i1682 ^ i1692)) * (-318)));
                        int i1712 = ((i1672 | i1702) << 1) - (i1702 ^ i1672);
                        int i1722 = ~((i1682 & i4) | (i1682 ^ i4));
                        int i1732 = (i100 ^ 252) | (i100 & 252);
                        int i1742 = ~((i1732 & i156) | (i1732 ^ i156));
                        int i1752 = ((i1722 & i1742) | (i1722 ^ i1742)) * 318;
                        int i1762 = (i1712 ^ i1752) + ((i1752 & i1712) << 1);
                        int i1772 = ~i156;
                        int i1782 = ~((i1772 & i100) | (i1772 ^ i100) | 252);
                        int i1792 = (i156 & 252) | (i156 ^ 252);
                        int i1802 = ~((i1792 & i4) | (i1792 ^ i4));
                        int i1812 = ((i1782 & i1802) | (i1782 ^ i1802)) * 318;
                        i19 = i4 ^ ((i1762 ^ i1812) + ((i1812 & i1762) << 1));
                        break;
                    }
                    i156++;
                    strArr13 = strArr9;
                    i143 = i18;
                    i152 = 1;
                }
            }
            i18 = i143;
            charlie = (delta + 99) % 128;
            i19 = i4;
            int i185 = (~(i4 & i18)) & (i4 | i18);
            int i186 = (i185 | (-i185)) >> 31;
            int i187 = i19 & (~i186);
            int i188 = i18 & i186;
            int i189 = (i187 & i188) | (i187 ^ i188);
            int i190 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int myTid = 325 - (Process.myTid() >> 22);
            int i191 = -(-ExpandableListView.getPackedPositionType(0L));
            int i192 = ((i191 | 13) << 1) - (i191 ^ 13);
            Object[] objArr38 = new Object[1];
            bravo((char) ((i190 ^ 10917) + ((i190 & 10917) << 1)), myTid, i192, objArr38);
            Object[] objArr39 = {(String) objArr38[0]};
            Object D887116 = uH18377.D8871(-957097391);
            if (D887116 == null) {
                int combineMeasuredStates2 = 52 - View.combineMeasuredStates(0, 0);
                int offsetBefore = TextUtils.getOffsetBefore(str16, 0) + 3158;
                char scrollBarSize2 = (char) (58074 - (ViewConfiguration.getScrollBarSize() >> 8));
                byte b27 = (byte) 0;
                byte b28 = (byte) (b27 + 1);
                Object[] objArr40 = new Object[1];
                charlie(b27, (byte) (b28 - 1), b28, objArr40);
                D887116 = uH18377.setPivotYN16904(combineMeasuredStates2, offsetBefore, scrollBarSize2, 424179844, false, (String) objArr40[0], new Class[]{String.class});
            }
            String str25 = (String) ((Method) D887116).invoke(null, objArr39);
            if (str25 != null) {
                char alpha4 = (char) Color.alpha(0);
                int i193 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr41 = new Object[1];
                bravo(alpha4, ((i193 | 338) << 1) - (i193 ^ 338), 9 - (KeyEvent.getMaxKeyCode() >> 16), objArr41);
                if (str25.contains((String) objArr41[0])) {
                    i20 = (~(i4 & 250)) & (i4 | 250);
                    int i194 = i4 ^ i189;
                    int i195 = (i194 | (-i194)) >> 31;
                    int i196 = i20 & (~i195);
                    int i197 = i189 & i195;
                    int i198 = (i197 & i196) | (i196 ^ i197);
                    char lastIndexOf5 = (char) (TextUtils.lastIndexOf(str16, '0', 0) + 1);
                    int i199 = -(-(Process.myTid() >> 22));
                    int i200 = (i199 & 347) + (i199 | 347);
                    int i201 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i202 = (i201 ^ 16) + ((i201 & 16) << 1);
                    Object[] objArr42 = new Object[1];
                    bravo(lastIndexOf5, i200, i202, objArr42);
                    String str26 = (String) objArr42[0];
                    int i203 = -(-TextUtils.getOffsetAfter(str16, 0));
                    int i204 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int i205 = ((i204 | 363) << 1) - (i204 ^ 363);
                    int i206 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i207 = ((i206 | 6) << 1) - (i206 ^ 6);
                    Object[] objArr43 = new Object[1];
                    bravo((char) ((i203 ^ 30960) + ((i203 & 30960) << 1)), i205, i207, objArr43);
                    str2 = (String) objArr43[0];
                    file = new File(str26);
                    if (file.exists() && file.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file));
                            Object[] objArr44 = new Object[1];
                            bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), 370 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr44);
                            useDelimiter = scanner.useDelimiter((String) objArr44[0]);
                            if (useDelimiter.hasNext()) {
                                next2 = str16;
                            } else {
                                int i208 = charlie + 117;
                                delta = i208 % 128;
                                if (i208 % 2 == 0) {
                                    useDelimiter.next();
                                    throw null;
                                }
                                next2 = useDelimiter.next();
                            }
                            useDelimiter.close();
                        } catch (IOException unused) {
                        }
                        if (next2.contains(str2)) {
                            int i209 = charlie;
                            delta = (((i209 | 27) << 1) - (i209 ^ 27)) % 128;
                            i21 = (~(i4 & 251)) & (i4 | 251);
                            int i210 = (~(i4 & i198)) & (i4 | i198);
                            int i211 = (i210 | (-i210)) >> 31;
                            int i212 = (i198 & i211) | (i21 & (~i211));
                            char jumpTapTimeout = (char) (3471 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                            int i213 = -TextUtils.indexOf(str16, str16, 0);
                            int i214 = (i213 & 372) + (i213 | 372);
                            int i215 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i216 = ((i215 | 23) << 1) - (i215 ^ 23);
                            Object[] objArr45 = new Object[1];
                            bravo(jumpTapTimeout, i214, i216, objArr45);
                            Object[] objArr46 = {(String) objArr45[0]};
                            D8871 = uH18377.D8871(-957097391);
                            if (D8871 == null) {
                                int rgb = Color.rgb(0, 0, 0) + 16777268;
                                int capsMode2 = TextUtils.getCapsMode(str16, 0, 0) + 3158;
                                char c16 = (char) (58074 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b29 = (byte) 0;
                                byte b30 = (byte) (b29 + 1);
                                Object[] objArr47 = new Object[1];
                                charlie(b29, (byte) (b30 - 1), b30, objArr47);
                                D8871 = uH18377.setPivotYN16904(rgb, capsMode2, c16, 424179844, false, (String) objArr47[0], new Class[]{String.class});
                            }
                            String lowerCase = ((String) ((Method) D8871).invoke(null, objArr46)).toLowerCase();
                            int i217 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i218 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr48 = new Object[1];
                            bravo((char) (((i217 | 29234) << 1) - (i217 ^ 29234)), (i218 & 396) + (i218 | 396), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr48);
                            int i219 = lowerCase.contains((String) objArr48[0]) ? i4 ^ 264 : i4;
                            int i220 = ((~i212) & i4) | (i212 & i100);
                            int i221 = -i220;
                            int i222 = ((i220 & i221) | (i220 ^ i221)) >> 31;
                            int i223 = (i212 & i222) | (i219 & (~i222));
                            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i224 = -TextUtils.getCapsMode(str16, 0, 0);
                            Object[] objArr49 = new Object[1];
                            bravo(scrollBarFadeDuration2, (i224 ^ 399) + ((i224 & 399) << 1), 41 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), objArr49);
                            String str27 = (String) objArr49[0];
                            Object[] objArr50 = new Object[1];
                            bravo((char) (31500 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 441, 39 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr50);
                            String str28 = (String) objArr50[0];
                            Object[] objArr51 = new Object[1];
                            bravo((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 480 - (~(Process.myTid() >> 22)), 27 - (~TextUtils.indexOf((CharSequence) str16, '0', 0)), objArr51);
                            String str29 = (String) objArr51[0];
                            char c17 = (char) (60934 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))));
                            int resolveOpacity = Drawable.resolveOpacity(0, 0);
                            int i225 = ((resolveOpacity | 508) << 1) - (resolveOpacity ^ 508);
                            int i226 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i227 = (i226 & 26) + (i226 | 26);
                            Object[] objArr52 = new Object[1];
                            bravo(c17, i225, i227, objArr52);
                            String str30 = (String) objArr52[0];
                            char green = (char) Color.green(0);
                            int i228 = -(ViewConfiguration.getTouchSlop() >> 8);
                            int i229 = (i228 ^ 535) + ((i228 & 535) << 1);
                            int i230 = -(-TextUtils.indexOf(str16, str16, 0));
                            Object[] objArr53 = new Object[1];
                            bravo(green, i229, (i230 ^ 27) + ((i230 & 27) << 1), objArr53);
                            String str31 = (String) objArr53[0];
                            char c18 = (char) (19776 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int i231 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i232 = (i231 & 563) + (i231 | 563);
                            int i233 = -MotionEvent.axisFromString(str16);
                            int i234 = (i233 & 26) + (i233 | 26);
                            i22 = 1;
                            Object[] objArr54 = new Object[1];
                            bravo(c18, i232, i234, objArr54);
                            c4 = 0;
                            String[] strArr14 = {str27, str28, str29, str30, str31, (String) objArr54[0]};
                            i23 = i12;
                            i24 = 0;
                            while (true) {
                                if (i24 >= i23) {
                                    i25 = i4;
                                    break;
                                }
                                Object[] objArr55 = new Object[i22];
                                objArr55[c4] = strArr14[i24];
                                Object D887117 = uH18377.D8871(-957097391);
                                if (D887117 == null) {
                                    int i235 = 53 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int minimumFlingVelocity2 = 3158 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 58075);
                                    byte b31 = (byte) 0;
                                    byte b32 = (byte) (b31 + 1);
                                    Object[] objArr56 = new Object[1];
                                    charlie(b31, (byte) (b32 - 1), b32, objArr56);
                                    D887117 = uH18377.setPivotYN16904(i235, minimumFlingVelocity2, packedPositionChild2, 424179844, false, (String) objArr56[0], new Class[]{String.class});
                                }
                                String str32 = (String) ((Method) D887117).invoke(null, objArr55);
                                if (str32 == null || str32.isEmpty()) {
                                    i24++;
                                    i22 = 1;
                                    i23 = 6;
                                    c4 = 0;
                                } else {
                                    int i236 = delta + 7;
                                    charlie = i236 % 128;
                                    i25 = i236 % 2 != 0 ? (~(i4 & 20721)) & (i4 | 20721) : (i4 & (-266)) | (i100 & 265);
                                }
                            }
                            int i237 = (~(i4 & i223)) & (i4 | i223);
                            int i238 = -i237;
                            int i239 = ((i237 & i238) | (i237 ^ i238)) >> 31;
                            int i240 = i25 & (~i239);
                            int i241 = i223 & i239;
                            int i242 = (i240 & i241) | (i240 ^ i241);
                            char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i243 = 346 - (~(-View.MeasureSpec.getMode(0)));
                            int i244 = -(-Color.blue(0));
                            int i245 = ((i244 | 17) << 1) - (i244 ^ 17);
                            Object[] objArr57 = new Object[1];
                            bravo(scrollBarFadeDuration3, i243, i245, objArr57);
                            String str33 = (String) objArr57[0];
                            int indexOf3 = TextUtils.indexOf((CharSequence) str16, '0', 0);
                            int defaultSize = 589 - View.getDefaultSize(0, 0);
                            int i246 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i247 = (i246 & 6) + (i246 | 6);
                            Object[] objArr58 = new Object[1];
                            bravo((char) ((indexOf3 & 53358) + (indexOf3 | 53358)), defaultSize, i247, objArr58);
                            Object[] objArr59 = {str33, (String) objArr58[0]};
                            D88712 = uH18377.D8871(1214576837);
                            if (D88712 == null) {
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 52;
                                int i248 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3313;
                                char myPid2 = (char) (Process.myPid() >> 22);
                                byte b33 = (byte) 0;
                                byte b34 = b33;
                                Object[] objArr60 = new Object[1];
                                charlie(b33, b34, b34, objArr60);
                                D88712 = uH18377.setPivotYN16904(touchSlop, i248, myPid2, -1746970096, false, (String) objArr60[0], new Class[]{String.class, String.class});
                            }
                            long longValue9 = ((Long) ((Method) D88712).invoke(null, objArr59)).longValue();
                            long j73 = -130861913;
                            long j74 = -159;
                            long j75 = (j74 * longValue9) + (j74 * j73);
                            long j76 = 160;
                            long maxMemory5 = ((int) Runtime.getRuntime().maxMemory()) ^ j38;
                            long j77 = ((j76 * ((((longValue9 ^ j38) | maxMemory5) ^ j38) | j73)) + (((-160) * (((maxMemory5 | j73) ^ j38) | ((j73 | longValue9) ^ j38))) + (((longValue9 | (j73 ^ j38)) * j76) + j75))) - 1416776425;
                            i26 = ((int) (j77 >> c3)) & ((((~((-1010194192) | i100)) | (-1378419787)) * 184) + (((-270533643) | i100) * 184) + 1663396938);
                            i27 = ((int) j77) & ((((~((-1313263472) | i100)) | (-1332203392)) * 420) + (((~((-1313263472) | i4)) * 420) - 2072394183));
                            if (((i26 & i27) | (i26 ^ i27)) != 0) {
                                int i249 = delta + 7;
                                charlie = i249 % 128;
                                i28 = i249 % 2 != 0 ? (~(i4 & 13673)) & (i4 | 13673) : i4 ^ 260;
                            } else {
                                int i250 = -(-ImageFormat.getBitsPerPixel(0));
                                int fadingEdgeLength2 = 595 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i251 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                int i252 = (i251 & 13) + (i251 | 13);
                                Object[] objArr61 = new Object[1];
                                bravo((char) (((i250 | 51878) << 1) - (i250 ^ 51878)), fadingEdgeLength2, i252, objArr61);
                                String str34 = (String) objArr61[0];
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                int indexOf4 = 607 - TextUtils.indexOf((CharSequence) str16, '0', 0, 0);
                                int i253 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i254 = ((i253 | 9) << 1) - (i253 ^ 9);
                                Object[] objArr62 = new Object[1];
                                bravo(modifierMetaStateMask, indexOf4, i254, objArr62);
                                String str35 = (String) objArr62[0];
                                File file3 = new File(str34);
                                if (file3.exists() && file3.isFile()) {
                                    try {
                                        Scanner scanner2 = new Scanner(new FileInputStream(file3));
                                        char c19 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int i255 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        Object[] objArr63 = new Object[1];
                                        bravo(c19, (i255 ^ 370) + ((i255 & 370) << 1), 1 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr63);
                                        Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr63[0]);
                                        if (useDelimiter2.hasNext()) {
                                            int i256 = delta;
                                            charlie = ((i256 ^ 23) + ((i256 & 23) << 1)) % 128;
                                            str3 = useDelimiter2.next();
                                        } else {
                                            str3 = str16;
                                        }
                                        useDelimiter2.close();
                                    } catch (IOException unused2) {
                                    }
                                    if (str3.contains(str35)) {
                                        z2 = true;
                                        i28 = !z2 ? (i4 & (-262)) | (i100 & 261) : i4;
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                }
                            }
                            int i257 = (~(i4 & i242)) & (i4 | i242);
                            int i258 = -i257;
                            int i259 = ((i257 & i258) | (i257 ^ i258)) >> 31;
                            int i260 = i28 & (~i259);
                            int i261 = i259 & i242;
                            int i262 = (i260 & i261) | (i260 ^ i261);
                            if ((i5 & 8) == 0) {
                                int i263 = delta;
                                charlie = ((i263 & 125) + (i263 | 125)) % 128;
                                char lastIndexOf6 = (char) (38143 - TextUtils.lastIndexOf(str16, '0'));
                                int i264 = 616 - (~(-Color.red(0)));
                                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i265 = (jumpTapTimeout2 & 43) + (jumpTapTimeout2 | 43);
                                Object[] objArr64 = new Object[1];
                                bravo(lastIndexOf6, i264, i265, objArr64);
                                String str36 = (String) objArr64[0];
                                int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                int i266 = -TextUtils.getCapsMode(str16, 0, 0);
                                int i267 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                Object[] objArr65 = new Object[1];
                                bravo((char) (((resolveOpacity2 | 19275) << 1) - (resolveOpacity2 ^ 19275)), (i266 & 660) + (i266 | 660), (i267 & 41) + (i267 | 41), objArr65);
                                String str37 = (String) objArr65[0];
                                int i268 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i269 = 0;
                                int i270 = 1;
                                Object[] objArr66 = new Object[1];
                                bravo((char) (((i268 | 12121) << 1) - (i268 ^ 12121)), TextUtils.lastIndexOf(str16, '0') + 702, 36 - (~(-TextUtils.indexOf((CharSequence) str16, '0', 0, 0))), objArr66);
                                String[] strArr15 = {str36, str37, (String) objArr66[0]};
                                int i271 = 0;
                                while (true) {
                                    if (i271 >= 3) {
                                        i50 = i262;
                                        i51 = i4;
                                        break;
                                    }
                                    Object[] objArr67 = new Object[i270];
                                    objArr67[i269] = strArr15[i271];
                                    Object D887118 = uH18377.D8871(1979478258);
                                    if (D887118 == null) {
                                        int i272 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51;
                                        int indexOf5 = TextUtils.indexOf((CharSequence) str16, '0', i269) + 2952;
                                        char myTid2 = (char) (Process.myTid() >> 22);
                                        byte b35 = (byte) (bArr[6] - 1);
                                        byte b36 = (byte) (b35 - 1);
                                        i50 = i262;
                                        Object[] objArr68 = new Object[1];
                                        charlie(b35, (byte) (b36 - 1), b36, objArr68);
                                        D887118 = uH18377.setPivotYN16904(i272, indexOf5, myTid2, -1438133721, false, (String) objArr68[0], new Class[]{String.class});
                                    } else {
                                        i50 = i262;
                                    }
                                    long longValue10 = ((Long) ((Method) D887118).invoke(null, objArr67)).longValue();
                                    long j78 = -1271924414;
                                    long j79 = longValue10 ^ j38;
                                    String[] strArr16 = strArr15;
                                    long tango = ao.ad.tango(1242219008);
                                    long j80 = (j78 | tango) ^ j38;
                                    long j81 = ((-814) * (((j79 | j78) ^ j38) | j80)) + (HttpConstants.HTTP_CLIENT_TIMEOUT * longValue10) + ((-813) * j78);
                                    long j82 = HttpConstants.HTTP_PROXY_AUTH;
                                    long j83 = j78 ^ j38;
                                    long j84 = (j83 | longValue10) ^ j38;
                                    long j85 = (j82 * (((longValue10 | tango) ^ j38) | j84 | ((j83 | tango) ^ j38))) + ((((j79 | (tango ^ j38)) ^ j38) | j84 | j80) * j82) + j81 + 2046745720;
                                    int i273 = ((int) (j85 >> c3)) & ((((~(282153344 | i4)) | (-1155073067)) * 529) + (((~(i100 | 282153344)) | (-1423529387)) * 529) + 1520786966);
                                    int i274 = (int) j85;
                                    int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                    int i275 = ~uptimeMillis2;
                                    int i276 = i274 & ((((~(uptimeMillis2 | (-536871169))) | (~((-468054682) | i275)) | 35754121) * 140) + (((~((-969171729) | i275)) | 536871168) * (-280)) + ((((-969171729) | uptimeMillis2) * 140) - 1755227979));
                                    if (((i273 & i276) | (i273 ^ i276)) != 0) {
                                        delta = (charlie + 61) % 128;
                                        int i277 = (i271 ^ 280) + ((i271 & 280) << 1);
                                        i51 = (i277 | i4) & (~(i4 & i277));
                                        break;
                                    }
                                    i271 = (i271 & (-49)) + (i271 | (-49)) + 50;
                                    strArr15 = strArr16;
                                    i262 = i50;
                                    i269 = 0;
                                    i270 = 1;
                                }
                                int i278 = (~(i4 & i50)) & (i4 | i50);
                                int i279 = -i278;
                                int i280 = ((i278 & i279) | (i278 ^ i279)) >> 31;
                                int i281 = i51 & (~i280);
                                int i282 = i50 & i280;
                                i262 = (i281 & i282) | (i281 ^ i282);
                            }
                            char c20 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i283 = 738 - (~(-View.resolveSize(0, 0)));
                            int i284 = -TextUtils.lastIndexOf(str16, '0', 0, 0);
                            int i285 = (i284 & 40) + (i284 | 40);
                            Object[] objArr69 = new Object[1];
                            bravo(c20, i283, i285, objArr69);
                            String str38 = (String) objArr69[0];
                            char c21 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i286 = -(-(Process.myPid() >> 22));
                            int lastIndexOf7 = TextUtils.lastIndexOf(str16, '0', 0);
                            int i287 = ((lastIndexOf7 | 31) << 1) - (lastIndexOf7 ^ 31);
                            Object[] objArr70 = new Object[1];
                            bravo(c21, ((i286 | 780) << 1) - (i286 ^ 780), i287, objArr70);
                            String[] strArr17 = {str38, (String) objArr70[0]};
                            i29 = 0;
                            while (i29 < 2) {
                                int i288 = charlie;
                                int i289 = (i288 ^ 113) + ((i288 & 113) << 1);
                                delta = i289 % 128;
                                if (i289 % 2 == 0) {
                                    Object[] objArr71 = {strArr17[i29]};
                                    Object D887119 = uH18377.D8871(1565484532);
                                    if (D887119 == null) {
                                        int i290 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                                        int i291 = 2950 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        byte b37 = (byte) 0;
                                        byte b38 = b37;
                                        strArr8 = strArr17;
                                        Object[] objArr72 = new Object[1];
                                        charlie(b37, b38, b38, objArr72);
                                        D887119 = uH18377.setPivotYN16904(i290, i291, keyRepeatDelay2, -2097887455, false, (String) objArr72[0], new Class[]{String.class});
                                    } else {
                                        strArr8 = strArr17;
                                    }
                                    long longValue11 = ((Long) ((Method) D887119).invoke(null, objArr71)).longValue();
                                    long j86 = -399364896;
                                    long j87 = (603 * longValue11) + (HttpConstants.HTTP_MOVED_TEMP * j86);
                                    long j88 = j86 ^ j38;
                                    long j89 = i4;
                                    long j90 = j89 ^ j38;
                                    long j91 = (301 * ((j90 | longValue11) ^ j38)) + ((-301) * (((j88 | (longValue11 ^ j38)) ^ j38) | ((j88 | j89) ^ j38) | (((j90 | j86) | longValue11) ^ j38))) + ((-602) * (longValue11 | ((j88 | j90) ^ j38))) + j87 + 1354518798;
                                    int i292 = ((int) (j91 << 9)) & ((((~((-575346156) | i4)) | (~((-286534165) | i100))) * 765) + (((~((-575346156) | i100)) | 575346091) * 1530) + (((((~((-575346092) | i100)) | (~((-65) | i4))) | (~((-286534165) | i4))) * 765) - 582493847));
                                    int i293 = (int) j91;
                                    int i294 = (((~((-67595995) | i4)) | 67512922 | (~(1504822404 | i4))) * (-880)) + 818884229;
                                    int i295 = (~((-67595995) | i100)) | (-1504822405);
                                    int i296 = ~(67595994 | i4);
                                    int i297 = i293 & ((i296 * 880) + ((i295 | i296) * (-880)) + i294);
                                    if (((i292 & i297) | (i292 ^ i297)) != 0) {
                                        int i298 = charlie;
                                        delta = ((i298 ^ 77) + ((i298 & 77) << 1)) % 128;
                                        int i299 = (i29 ^ 288) + ((i29 & 288) << 1);
                                        i30 = (i299 | i4) & (~(i4 & i299));
                                        break;
                                    }
                                    int i300 = i29 + 79;
                                    i29 = ((i300 | (-78)) << 1) - (i300 ^ (-78));
                                    strArr17 = strArr8;
                                } else {
                                    strArr8 = strArr17;
                                    Object[] objArr73 = {strArr8[i29]};
                                    Object D887120 = uH18377.D8871(1565484532);
                                    if (D887120 == null) {
                                        int trimmedLength = TextUtils.getTrimmedLength(str16) + 52;
                                        int maximumDrawingCacheSize = 2951 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        char c22 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                        byte b39 = (byte) 0;
                                        byte b40 = b39;
                                        Object[] objArr74 = new Object[1];
                                        charlie(b39, b40, b40, objArr74);
                                        D887120 = uH18377.setPivotYN16904(trimmedLength, maximumDrawingCacheSize, c22, -2097887455, false, (String) objArr74[0], new Class[]{String.class});
                                    }
                                    long longValue12 = ((Long) ((Method) D887120).invoke(null, objArr73)).longValue();
                                    long j92 = -234117808;
                                    long j93 = ((-69) * longValue12) + (71 * j92);
                                    long j94 = ((j92 ^ j38) | longValue12) ^ j38;
                                    long j95 = (int) Runtime.getRuntime().totalMemory();
                                    long j96 = ((-140) * (j94 | ((longValue12 | j95) ^ j38))) + j93;
                                    long j97 = 70;
                                    long j98 = (j97 * (((j92 | j95) ^ j38) | j94 | (((longValue12 ^ j38) | j92) ^ j38))) + ((((j92 | longValue12) | j95) ^ j38) * j97) + j96 + 1189271710;
                                    int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                    int i301 = ~elapsedRealtime3;
                                    int i302 = ((int) (j98 >> c3)) & ((((~(i301 | 904029020)) | 878854744) * 564) + ((~(elapsedRealtime3 | (-1074857121))) * 1128) + (((~(1953711864 | i301)) | 904029020 | (~((-1953711865) | elapsedRealtime3))) * (-564)) + 2121589242);
                                    int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                    if ((i302 | (((int) j98) & ((((~(elapsedRealtime4 | (-461865668))) | 564482085) * 70) + ((~((-436372163) | elapsedRealtime4)) * 70) + (((~((-975360743) | elapsedRealtime4)) | 538988580) * (-140)) + 147690471))) != 0) {
                                        int i2982 = charlie;
                                        delta = ((i2982 ^ 77) + ((i2982 & 77) << 1)) % 128;
                                        int i2992 = (i29 ^ 288) + ((i29 & 288) << 1);
                                        i30 = (i2992 | i4) & (~(i4 & i2992));
                                        break;
                                    }
                                    int i3002 = i29 + 79;
                                    i29 = ((i3002 | (-78)) << 1) - (i3002 ^ (-78));
                                    strArr17 = strArr8;
                                }
                            }
                            i30 = i4;
                            int i303 = ((~i262) & i4) | (i262 & i100);
                            int i304 = -i303;
                            int i305 = ((i303 & i304) | (i303 ^ i304)) >> 31;
                            int i306 = (i262 & i305) | (i30 & (~i305));
                            D88713 = uH18377.D8871(-344556366);
                            if (D88713 == null) {
                                int lastIndexOf8 = TextUtils.lastIndexOf(str16, '0') + 53;
                                int deadChar2 = 3106 - KeyEvent.getDeadChar(0, 0);
                                char c23 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15990);
                                byte b41 = (byte) 0;
                                byte b42 = b41;
                                Object[] objArr75 = new Object[1];
                                charlie(b41, b42, b42, objArr75);
                                D88713 = uH18377.setPivotYN16904(lastIndexOf8, deadChar2, c23, 885907047, false, (String) objArr75[0], new Class[0]);
                            }
                            long longValue13 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                            long j99 = 807654152;
                            long j100 = 69;
                            long j101 = j99 ^ j38;
                            long j102 = longValue13 ^ j38;
                            long j103 = i4;
                            long j104 = ((j100 * ((j102 | j99) ^ j38)) + (((-69) * ((((j101 | longValue13) ^ j38) | ((j101 | j103) ^ j38)) | ((longValue13 | j103) ^ j38))) + ((((((j101 | j102) | j103) ^ j38) | (((j99 | longValue13) | j103) ^ j38)) * j100) + (((-68) * longValue13) + (70 * j99))))) - 959907250;
                            int i307 = ~Process.myPid();
                            foxtrot2 = ((int) (j104 >> c3)) & A0.z.foxtrot((~(1756836279 | i307)) | (-1774156224) | (~(1100904605 | i307)), 184, (((~(i307 | (-673251619))) | (~((-17319945) | i307))) * (-184)) - 1019427974, -1811082192);
                            int i308 = ~ao.ad.tango(869906954);
                            i31 = ((int) j104) & ((((~(i308 | (-157006579))) | (-1159012422)) * 184) + (((-17899585) | i308) * 184) + 1367661917);
                            if (((foxtrot2 & i31) | (foxtrot2 ^ i31)) != 1) {
                                Object[] objArr76 = {1};
                                Object D887121 = uH18377.D8871(-38624464);
                                if (D887121 == null) {
                                    int indexOf6 = 51 - TextUtils.indexOf((CharSequence) str16, '0', 0);
                                    int i309 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2846;
                                    char windowTouchSlop2 = (char) (62567 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                    byte b43 = (byte) 0;
                                    byte b44 = b43;
                                    Object[] objArr77 = new Object[1];
                                    charlie(b43, b44, b44, objArr77);
                                    D887121 = uH18377.setPivotYN16904(indexOf6, i309, windowTouchSlop2, 571015653, false, (String) objArr77[0], new Class[]{Integer.TYPE});
                                }
                                long longValue14 = ((Long) ((Method) D887121).invoke(null, objArr76)).longValue();
                                long j105 = 1647888575;
                                long j106 = j105 ^ j38;
                                long j107 = ((-368) * (longValue14 | j106)) + (185 * longValue14) + ((-183) * j105);
                                long j108 = 184;
                                long j109 = longValue14 ^ j38;
                                long tango2 = ao.ad.tango(1553748505) ^ j38;
                                long j110 = ((((tango2 | j105) ^ j38) | ((j106 | j109) ^ j38) | ((j105 | longValue14) ^ j38)) * j108) + ((j105 | j109 | tango2) * j108) + j107 + 344238191;
                                int i310 = (~((-1883406435) | i4)) | (~((-446180024) | i100));
                                int i311 = ~(1883406434 | i100);
                                int i312 = ((int) (j110 >> c3)) & ((((-2061150968) | i311) * 516) + (((~((-1614970945) | i4)) | (~(2061150967 | i100))) * 516) + ((i310 | i311) * (-516)) + 912995858);
                                int i313 = (int) Runtime.getRuntime().totalMemory();
                                int i314 = ~i313;
                                int i315 = ((int) j110) & ((((~(i313 | (-2785293))) | (~(1416331532 | i314)) | (-1434441118)) * 676) + (((~((-20894878) | i314)) | 18109585) * 676) + (((-18109586) | i313) * (-676)) + 1280114545);
                                if (((i315 & i312) | (i312 ^ i315)) != 0) {
                                    int i316 = charlie + 37;
                                    delta = i316 % 128;
                                    i33 = i316 % 2 == 0 ? (~(i4 & 17313)) & (i4 | 17313) : (i4 & (-221)) | (i100 & 220);
                                } else {
                                    i33 = i4;
                                }
                                int i317 = (~(i4 & i306)) & (i4 | i306);
                                int i318 = -i317;
                                int i319 = ((i317 & i318) | (i317 ^ i318)) >> 31;
                                int i320 = (i33 & (~i319)) | (i306 & i319);
                                int rgb2 = Color.rgb(0, 0, 0);
                                int i321 = rgb2 * HttpConstants.HTTP_BLOCKED;
                                int i322 = (i321 & 1072186816) + (i321 | 1072186816);
                                int i323 = ~rgb2;
                                int i324 = ~(i323 | 16780687);
                                int i325 = ((-16780688) ^ rgb2) | ((-16780688) & rgb2);
                                int i326 = ~((i325 & i4) | (i325 ^ i4));
                                int i327 = ((i324 & i326) | (i324 ^ i326)) * 449;
                                int i328 = ((i322 | i327) << 1) - (i322 ^ i327);
                                int i329 = ~((i323 & 16780687) | (i323 ^ 16780687));
                                int i330 = ((-16780688) ^ i100) | ((-16780688) & i100);
                                int i331 = ~((rgb2 & i330) | (i330 ^ rgb2));
                                Object[] objArr78 = new Object[1];
                                bravo((char) ((((i329 & i331) | (i329 ^ i331)) * 449) + (i329 * (-1347)) + i328), 371 - (~(-(-View.getDefaultSize(0, 0)))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, objArr78);
                                Object[] objArr79 = {(String) objArr78[0]};
                                Object D887122 = uH18377.D8871(-957097391);
                                if (D887122 == null) {
                                    int bitsPerPixel2 = 51 - ImageFormat.getBitsPerPixel(0);
                                    int scrollBarFadeDuration4 = 3158 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength(str16) + 58074);
                                    byte b45 = (byte) 0;
                                    byte b46 = (byte) (b45 + 1);
                                    Object[] objArr80 = new Object[1];
                                    charlie(b45, (byte) (b46 - 1), b46, objArr80);
                                    D887122 = uH18377.setPivotYN16904(bitsPerPixel2, scrollBarFadeDuration4, trimmedLength2, 424179844, false, (String) objArr80[0], new Class[]{String.class});
                                }
                                Object invoke2 = ((Method) D887122).invoke(null, objArr79);
                                if (invoke2 != null) {
                                    Object[] objArr81 = {invoke2, 42};
                                    Object D887123 = uH18377.D8871(2072770498);
                                    if (D887123 == null) {
                                        int resolveSize = 51 - View.resolveSize(0, 0);
                                        int keyCodeFromString2 = KeyEvent.keyCodeFromString(str16) + 1209;
                                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 44356);
                                        byte b47 = (byte) 0;
                                        byte b48 = b47;
                                        Object[] objArr82 = new Object[1];
                                        charlie(b47, b48, b48, objArr82);
                                        D887123 = uH18377.setPivotYN16904(resolveSize, keyCodeFromString2, packedPositionGroup, -1540336361, false, (String) objArr82[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long longValue15 = ((Long) ((Method) D887123).invoke(null, objArr81)).longValue();
                                    long j111 = 646145071;
                                    i34 = i320;
                                    long j112 = 672;
                                    long j113 = j103 ^ j38;
                                    long j114 = longValue15 ^ j38;
                                    long j115 = ((j112 * (((j114 | j113) ^ j38) | ((j114 | j111) ^ j38))) + (((-672) * ((((j111 ^ j38) | j113) ^ j38) | ((longValue15 | j103) ^ j38))) + (((longValue15 | ((j111 | j103) ^ j38)) * j112) + (((-1343) * longValue15) + (673 * j111))))) - 653590101;
                                    int i332 = ((int) (j115 >> c3)) & (((~(i100 | 1736311698)) * 886) + ((1736311698 | (~((-299085288) | i100))) * (-1772)) + (((~(299085287 | i4)) | 1714160144 | (~((-276933734) | i100))) * 886) + 1686564146);
                                    int i333 = ((int) j115) & ((((~((-34080810) | i100)) | (~((-634463809) | i4))) * 318) + (((~(768681792 | i4)) | (~((-634463809) | i100))) * 318) + (((~(668544617 | i4)) | 768681792) * (-318)) + 341624167);
                                    if (((i332 & i333) | (i332 ^ i333)) == 1986687685) {
                                        i35 = i34;
                                        strArr2 = null;
                                        i36 = 0;
                                        char red2 = (char) (16871 - Color.red(i36));
                                        int i334 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                        Object[] objArr83 = new Object[1];
                                        bravo(red2, (i334 ^ 891) + ((i334 & 891) << 1), 16 - Drawable.resolveOpacity(0, 0), objArr83);
                                        Object[] objArr84 = {(String) objArr83[0]};
                                        D88714 = uH18377.D8871(-957097391);
                                        if (D88714 == null) {
                                            int i335 = 53 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int keyCodeFromString3 = 3158 - KeyEvent.keyCodeFromString(str16);
                                            char c24 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58074);
                                            byte b49 = (byte) 0;
                                            byte b50 = (byte) (b49 + 1);
                                            Object[] objArr85 = new Object[1];
                                            charlie(b49, (byte) (b50 - 1), b50, objArr85);
                                            D88714 = uH18377.setPivotYN16904(i335, keyCodeFromString3, c24, 424179844, false, (String) objArr85[0], new Class[]{String.class});
                                        }
                                        invoke = ((Method) D88714).invoke(null, objArr84);
                                        if (invoke != null) {
                                            int i336 = charlie;
                                            delta = ((i336 ^ 33) + ((i336 & 33) << 1)) % 128;
                                            i39 = 0;
                                        } else {
                                            Object[] objArr86 = {invoke, 42};
                                            Object D887124 = uH18377.D8871(2072770498);
                                            if (D887124 == null) {
                                                int indexOf7 = 51 - TextUtils.indexOf(str16, str16);
                                                int makeMeasureSpec3 = 1209 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                char offsetBefore2 = (char) (44356 - TextUtils.getOffsetBefore(str16, 0));
                                                byte b51 = (byte) 0;
                                                byte b52 = b51;
                                                Object[] objArr87 = new Object[1];
                                                charlie(b51, b52, b52, objArr87);
                                                D887124 = uH18377.setPivotYN16904(indexOf7, makeMeasureSpec3, offsetBefore2, -1540336361, false, (String) objArr87[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long longValue16 = ((Long) ((Method) D887124).invoke(null, objArr86)).longValue();
                                            long j116 = 1810751044;
                                            long j117 = longValue16 ^ j38;
                                            long j118 = (j117 | j116) ^ j38;
                                            long j119 = (int) Runtime.getRuntime().totalMemory();
                                            long j120 = (j116 | j119) ^ j38;
                                            long j121 = ((j118 | j120) * (-814)) + (HttpConstants.HTTP_CLIENT_TIMEOUT * longValue16) + ((-813) * j116);
                                            long j122 = HttpConstants.HTTP_PROXY_AUTH;
                                            long j123 = j116 ^ j38;
                                            long j124 = (j123 | longValue16) ^ j38;
                                            long j125 = ((j122 * (((longValue16 | j119) ^ j38) | (j124 | ((j123 | j119) ^ j38)))) + ((((((j117 | (j119 ^ j38)) ^ j38) | j124) | j120) * j122) + j121)) - 1818196074;
                                            int i337 = ~((-451964428) | i4);
                                            int i338 = ((int) (j125 >> c3)) & (((i337 | 277889538) * 658) + (((-1785376190) | i337) * (-658)) + 1018042922);
                                            int myUid = Process.myUid();
                                            int i339 = ((int) j125) & (((myUid | (-125145729)) * 104) + ((~((~myUid) | (-104104449))) * (-104)) + (((~(1312080681 | myUid)) | (-1333121962)) * 104) + 2005432269);
                                            i39 = (i338 & i339) | (i338 ^ i339);
                                        }
                                        if (i39 != 1986687685 && i39 != -1514516938) {
                                            char offsetBefore3 = (char) (46343 - TextUtils.getOffsetBefore(str16, 0));
                                            int i340 = 1609 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                                            int i341 = -ExpandableListView.getPackedPositionGroup(0L);
                                            int i342 = i341 * (-51);
                                            int i343 = (i342 & 742) + (i342 | 742);
                                            int i344 = (i100 ^ i341) | (i100 & i341);
                                            int i345 = -(-((~((i344 & 14) | (i344 ^ 14))) * 52));
                                            int i346 = ((i343 | i345) << 1) - (i345 ^ i343);
                                            int i347 = ~(((-15) & i100) | ((-15) ^ i100));
                                            int i348 = ~(((-15) & i341) | ((-15) ^ i341));
                                            int i349 = (i347 & i348) | (i347 ^ i348);
                                            int i350 = ~i4;
                                            int i351 = (i349 | (~((i350 ^ i341) | (i350 & i341)))) * (-52);
                                            int i352 = (i346 ^ i351) + ((i351 & i346) << 1);
                                            int i353 = ~i341;
                                            int i354 = ~(i353 | i350);
                                            int i355 = ~(i353 | 14);
                                            int i356 = (((i355 & i354) | (i354 ^ i355)) * 52) + i352;
                                            Object[] objArr88 = new Object[1];
                                            bravo(offsetBefore3, i340, i356, objArr88);
                                            String str39 = (String) objArr88[0];
                                            int i357 = -MotionEvent.axisFromString(str16);
                                            int i358 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            Object[] objArr89 = new Object[1];
                                            bravo((char) ((i357 & 54009) + (i357 | 54009)), ((i358 | 1624) << 1) - (i358 ^ 1624), 25 - (~(-(-Drawable.resolveOpacity(0, 0)))), objArr89);
                                            String str40 = (String) objArr89[0];
                                            int i359 = -(-TextUtils.indexOf(str16, str16, 0));
                                            Object[] objArr90 = new Object[1];
                                            bravo((char) (((i359 | 64454) << 1) - (i359 ^ 64454)), 1649 - (~Color.argb(0, 0, 0, 0)), TextUtils.indexOf((CharSequence) str16, '0', 0, 0) + 18, objArr90);
                                            String str41 = (String) objArr90[0];
                                            char c25 = (char) (60881 - (~(-(-Color.green(0)))));
                                            int i360 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                            Object[] objArr91 = new Object[1];
                                            bravo(c25, ((i360 | 1667) << 1) - (i360 ^ 1667), 16 - TextUtils.lastIndexOf(str16, '0', 0, 0), objArr91);
                                            String str42 = (String) objArr91[0];
                                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i361 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            Object[] objArr92 = new Object[1];
                                            bravo(fadingEdgeLength3, (i361 & 1683) + (i361 | 1683), 14 - (~Gravity.getAbsoluteGravity(0, 0)), objArr92);
                                            String str43 = (String) objArr92[0];
                                            Object[] objArr93 = new Object[1];
                                            bravo((char) View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1698, 36 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr93);
                                            String str44 = (String) objArr93[0];
                                            Object[] objArr94 = new Object[1];
                                            bravo((char) TextUtils.getOffsetBefore(str16, 0), TextUtils.lastIndexOf(str16, '0') + 1737, 11 - (~(-ExpandableListView.getPackedPositionGroup(0L))), objArr94);
                                            String str45 = (String) objArr94[0];
                                            char c26 = (char) (27691 - (~(-MotionEvent.axisFromString(str16))));
                                            int i362 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            Object[] objArr95 = new Object[1];
                                            bravo(c26, (i362 ^ 1748) + ((i362 & 1748) << 1), 12 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr95);
                                            String str46 = (String) objArr95[0];
                                            char c27 = (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str16, '0', 0))));
                                            int i363 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i364 = ((i363 | 1760) << 1) - (i363 ^ 1760);
                                            int i365 = -View.resolveSize(0, 0);
                                            int i366 = ((i365 | 22) << 1) - (i365 ^ 22);
                                            Object[] objArr96 = new Object[1];
                                            bravo(c27, i364, i366, objArr96);
                                            String str47 = (String) objArr96[0];
                                            int i367 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            int lastIndexOf9 = TextUtils.lastIndexOf(str16, '0', 0, 0);
                                            Object[] objArr97 = new Object[1];
                                            bravo((char) (((i367 | 59734) << 1) - (i367 ^ 59734)), ((lastIndexOf9 | 1784) << 1) - (lastIndexOf9 ^ 1784), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, objArr97);
                                            String str48 = (String) objArr97[0];
                                            int i368 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int indexOf8 = 1813 - TextUtils.indexOf((CharSequence) str16, '0', 0);
                                            int i369 = -TextUtils.getCapsMode(str16, 0, 0);
                                            int i370 = ((i369 | 12) << 1) - (i369 ^ 12);
                                            Object[] objArr98 = new Object[1];
                                            bravo((char) ((i368 & 64270) + (i368 | 64270)), indexOf8, i370, objArr98);
                                            String str49 = (String) objArr98[0];
                                            Object[] objArr99 = new Object[1];
                                            bravo((char) (58430 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), 1824 - (~(-ImageFormat.getBitsPerPixel(0))), 11 - (~(-(-TextUtils.indexOf(str16, str16, 0)))), objArr99);
                                            String str50 = (String) objArr99[0];
                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                            int i371 = (defaultSize2 * ModuleDescriptor.MODULE_VERSION) - 7655842;
                                            int i372 = ~defaultSize2;
                                            int i373 = ~((i372 ^ 55078) | (i372 & 55078));
                                            int i374 = ~defaultSize2;
                                            int i375 = (i374 & i4) | (i374 ^ i4);
                                            int i376 = ~i375;
                                            int i377 = -(-(((i373 & i376) | (i373 ^ i376)) * (-280)));
                                            int i378 = ((i371 | i377) << 1) - (i371 ^ i377);
                                            int i379 = ~i375;
                                            int i380 = ~(((-55079) ^ i4) | ((-55079) & i4));
                                            int i381 = (((i379 & i380) | (i379 ^ i380)) * 140) + i378;
                                            int i382 = ~(((-55079) & i372) | (i372 ^ (-55079)) | i4);
                                            int i383 = (i372 & i350) | (i372 ^ i350);
                                            int i384 = (~((i383 & 55078) | (i383 ^ 55078))) | i382;
                                            int i385 = ~(defaultSize2 | ((-55079) ^ i100) | ((-55079) & i100));
                                            int i386 = ((i385 & i384) | (i384 ^ i385)) * 140;
                                            char c28 = (char) (((i381 | i386) << 1) - (i381 ^ i386));
                                            int i387 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1837;
                                            int threadPriority5 = Process.getThreadPriority(0);
                                            int i388 = -(((threadPriority5 & 20) + (threadPriority5 | 20)) >> 6);
                                            int i389 = (i388 ^ 12) + ((i388 & 12) << 1);
                                            Object[] objArr100 = new Object[1];
                                            bravo(c28, i387, i389, objArr100);
                                            String str51 = (String) objArr100[0];
                                            char c29 = (char) (6569 - (~(ViewConfiguration.getEdgeSlop() >> 16)));
                                            int makeMeasureSpec4 = 1850 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i390 = -Gravity.getAbsoluteGravity(0, 0);
                                            int i391 = (i390 ^ 12) + ((i390 & 12) << 1);
                                            Object[] objArr101 = new Object[1];
                                            bravo(c29, makeMeasureSpec4, i391, objArr101);
                                            String str52 = (String) objArr101[0];
                                            char c30 = (char) (32203 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))));
                                            int i392 = 1861 - (~(-View.getDefaultSize(0, 0)));
                                            int keyCodeFromString4 = KeyEvent.keyCodeFromString(str16);
                                            int i393 = ((keyCodeFromString4 | 12) << 1) - (keyCodeFromString4 ^ 12);
                                            Object[] objArr102 = new Object[1];
                                            bravo(c30, i392, i393, objArr102);
                                            String str53 = (String) objArr102[0];
                                            int indexOf9 = TextUtils.indexOf(str16, str16, 0);
                                            int i394 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            Object[] objArr103 = new Object[1];
                                            bravo((char) (((indexOf9 | 34686) << 1) - (indexOf9 ^ 34686)), ((i394 | 1874) << 1) - (i394 ^ 1874), 13 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr103);
                                            String str54 = (String) objArr103[0];
                                            char trimmedLength3 = (char) TextUtils.getTrimmedLength(str16);
                                            int fadingEdgeLength4 = 1888 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i395 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int vD14832N67153 = F2.vD14832N6715();
                                            int i396 = (i395 * HttpConstants.HTTP_SEE_OTHER) - 3311;
                                            int i397 = ~i395;
                                            int i398 = ~vD14832N67153;
                                            int i399 = (i398 & i397) | (i397 ^ i398);
                                            int i400 = ~((i399 & 11) | (i399 ^ 11));
                                            int i401 = i395 | 11;
                                            int i402 = ~((i401 & vD14832N67153) | (i401 ^ vD14832N67153));
                                            int i403 = ((i400 & i402) | (i400 ^ i402)) * (-302);
                                            int i404 = (i396 & i403) + (i396 | i403);
                                            int i405 = (i397 ^ 11) | (i397 & 11);
                                            int i406 = ((~((i405 & vD14832N67153) | (i405 ^ vD14832N67153))) * (-604)) + i404;
                                            int i407 = ~(i395 | (-12));
                                            int i408 = ~((vD14832N67153 & 11) | (vD14832N67153 ^ 11));
                                            int i409 = (((i407 & i408) | (i407 ^ i408)) * HttpConstants.HTTP_MOVED_TEMP) + i406;
                                            Object[] objArr104 = new Object[1];
                                            bravo(trimmedLength3, fadingEdgeLength4, i409, objArr104);
                                            String str55 = (String) objArr104[0];
                                            char c31 = (char) (63000 - (~(-(-TextUtils.indexOf((CharSequence) str16, '0', 0)))));
                                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                            int vD14832N67154 = F2.vD14832N6715();
                                            int i410 = (packedPositionGroup2 * (-501)) + 955700;
                                            int i411 = ~(((-1901) ^ vD14832N67154) | ((-1901) & vD14832N67154));
                                            int i412 = ~((packedPositionGroup2 ^ 1900) | (packedPositionGroup2 & 1900));
                                            int i413 = ((i411 & i412) | (i411 ^ i412)) * (-502);
                                            int i414 = ((i410 | i413) << 1) - (i410 ^ i413);
                                            int i415 = (~vD14832N67154) | (-1901);
                                            int i416 = (~((i415 & packedPositionGroup2) | (i415 ^ packedPositionGroup2))) * (-502);
                                            int i417 = ((i414 | i416) << 1) - (i416 ^ i414);
                                            int i418 = ~((~packedPositionGroup2) | vD14832N67154);
                                            int i419 = ((i418 & (-1901)) | ((-1901) ^ i418)) * HttpConstants.HTTP_BAD_GATEWAY;
                                            int i420 = (i417 ^ i419) + ((i419 & i417) << 1);
                                            int i421 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i422 = ((i421 | 23) << 1) - (i421 ^ 23);
                                            Object[] objArr105 = new Object[1];
                                            bravo(c31, i420, i422, objArr105);
                                            String str56 = (String) objArr105[0];
                                            int i423 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                            int i424 = -Color.rgb(0, 0, 0);
                                            int i425 = (i424 & (-16775292)) + (i424 | (-16775292));
                                            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
                                            int i426 = (normalizeMetaState ^ 28) + ((normalizeMetaState & 28) << 1);
                                            Object[] objArr106 = new Object[1];
                                            bravo((char) ((i423 & 43913) + (i423 | 43913)), i425, i426, objArr106);
                                            String[] strArr18 = {str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, (String) objArr106[0]};
                                            i47 = 0;
                                            while (i47 < 19) {
                                                int i427 = charlie + 15;
                                                delta = i427 % 128;
                                                if (i427 % 2 == 0) {
                                                    String str57 = strArr18[i47];
                                                    Object[] objArr107 = {str57};
                                                    Object D887125 = uH18377.D8871(1979478258);
                                                    if (D887125 == null) {
                                                        int scrollBarFadeDuration5 = 52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                        int i428 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2950;
                                                        char threadPriority6 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                        byte b53 = (byte) (bArr[6] - 1);
                                                        byte b54 = (byte) (b53 - 1);
                                                        strArr7 = strArr18;
                                                        i49 = i47;
                                                        Object[] objArr108 = new Object[1];
                                                        charlie(b53, (byte) (b54 - 1), b54, objArr108);
                                                        D887125 = uH18377.setPivotYN16904(scrollBarFadeDuration5, i428, threadPriority6, -1438133721, false, (String) objArr108[0], new Class[]{String.class});
                                                    } else {
                                                        strArr7 = strArr18;
                                                        i49 = i47;
                                                    }
                                                    long longValue17 = ((Long) ((Method) D887125).invoke(null, objArr107)).longValue();
                                                    long j126 = -426533296;
                                                    str8 = str57;
                                                    long j127 = 433;
                                                    long j128 = j126 ^ j38;
                                                    long j129 = (j127 * (((j128 | j103) ^ j38) | ((j126 | longValue17) ^ j38))) + ((-433) * (j128 | (((longValue17 ^ j38) | j103) ^ j38))) + ((((j128 | (j103 ^ j38)) | longValue17) ^ j38) * j127) + (434 * longValue17) + ((-432) * j126) + 1201354602;
                                                    int myUid2 = Process.myUid();
                                                    int i429 = (~(1565223665 | myUid2)) | (-1565229044);
                                                    int i430 = ~myUid2;
                                                    int i431 = ((int) (j129 >>> 21)) & (((~(i430 | (-1292517220))) * 886) + (((~(i430 | (-1565223666))) | (-1292517220)) * (-1772)) + (((i429 | (~((-1292511842) | i430))) * 886) - 171987194));
                                                    int i432 = (int) j129;
                                                    int elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                    int i433 = (((~(1506880081 | elapsedRealtime5)) | 1350860804) * 672) - 1211848203;
                                                    int i434 = ~elapsedRealtime5;
                                                    if ((i431 | (i432 & ((((~((-1350860805) | i434)) | 294916) * 672) + (((~(elapsedRealtime5 | 1350860804)) | (~((-1506880082) | i434))) * (-672)) + i433))) != 0) {
                                                        i48 = i49;
                                                        break;
                                                    }
                                                    str9 = str8;
                                                    char deadChar3 = (char) (KeyEvent.getDeadChar(0, 0) + 34686);
                                                    int i435 = 1873 - (~(-(ViewConfiguration.getTapTimeout() >> 16)));
                                                    int i436 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int vD14832N67155 = F2.vD14832N6715();
                                                    int i437 = i436 * (-665);
                                                    int i438 = (i437 ^ 4342) + ((i437 & 4342) << 1);
                                                    int i439 = ~i436;
                                                    int i440 = -(-(i439 * (-333)));
                                                    int i441 = (i438 ^ i440) + ((i440 & i438) << 1);
                                                    int i442 = ~vD14832N67155;
                                                    int i443 = -(-(((~((i439 ^ i442) | (i439 & i442))) | (~(vD14832N67155 | 13))) * 333));
                                                    int i444 = ((((i441 | i443) << 1) - (i443 ^ i441)) - (~(((~((i439 & vD14832N67155) | (i439 ^ vD14832N67155))) | (~((i442 ^ 13) | (i442 & 13)))) * 333))) - 1;
                                                    objArr = new Object[1];
                                                    bravo(deadChar3, i435, i444, objArr);
                                                    if (!str9.equals((String) objArr[0])) {
                                                        Object[] objArr109 = {str9};
                                                        Object D887126 = uH18377.D8871(1979478258);
                                                        if (D887126 == null) {
                                                            int lastIndexOf10 = 51 - TextUtils.lastIndexOf(str16, '0', 0);
                                                            int argb = Color.argb(0, 0, 0, 0) + 2951;
                                                            char makeMeasureSpec5 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            byte b55 = (byte) (bArr[6] - 1);
                                                            byte b56 = (byte) (b55 - 1);
                                                            Object[] objArr110 = new Object[1];
                                                            charlie(b55, (byte) (b56 - 1), b56, objArr110);
                                                            D887126 = uH18377.setPivotYN16904(lastIndexOf10, argb, makeMeasureSpec5, -1438133721, false, (String) objArr110[0], new Class[]{String.class});
                                                        }
                                                        long longValue18 = ((Long) ((Method) D887126).invoke(null, objArr109)).longValue();
                                                        long j130 = -311534434;
                                                        long j131 = longValue18 ^ j38;
                                                        long j132 = j103 ^ j38;
                                                        long j133 = (j132 | longValue18) ^ j38;
                                                        long j134 = ((-516) * (((j131 | j103) ^ j38) | ((j132 | j130) ^ j38) | j133)) + (517 * longValue18) + ((-515) * j130);
                                                        long j135 = 516;
                                                        long j136 = j130 ^ j38;
                                                        long j137 = (j135 * (((j136 | longValue18) ^ j38) | j133)) + (((((j136 | j131) | j103) ^ j38) | (((j136 | j132) | longValue18) ^ j38)) * j135) + j134 + 1086355740;
                                                        int myTid3 = Process.myTid();
                                                        int i445 = ~myTid3;
                                                        int i446 = ((int) (j137 >> c3)) & (((~(i445 | (-1060552068))) * 184) + ((myTid3 | 4259876) * (-184)) + (((~(376674343 | i445)) | 688137600) * 184) + 157776778);
                                                        int i447 = ((int) j137) & ((((~((-1379942466) | i4)) | 329728) * 366) + ((((~((-2118676812) | i4)) | 739064074) * (-366)) - 1643395423));
                                                        if (((i446 & i447) | (i446 ^ i447)) != 0) {
                                                            i48 = i49;
                                                            break;
                                                        }
                                                    }
                                                    int i448 = ((i49 | (-124)) << 1) - (i49 ^ (-124));
                                                    i47 = (i448 & 125) + (i448 | 125);
                                                    strArr18 = strArr7;
                                                } else {
                                                    strArr7 = strArr18;
                                                    i49 = i47;
                                                    String str58 = strArr7[i49];
                                                    Object[] objArr111 = {str58};
                                                    Object D887127 = uH18377.D8871(1979478258);
                                                    if (D887127 == null) {
                                                        int lastIndexOf11 = 51 - TextUtils.lastIndexOf(str16, '0', 0, 0);
                                                        int maximumDrawingCacheSize2 = 2951 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        byte b57 = (byte) (bArr[6] - 1);
                                                        byte b58 = (byte) (b57 - 1);
                                                        Object[] objArr112 = new Object[1];
                                                        charlie(b57, (byte) (b58 - 1), b58, objArr112);
                                                        D887127 = uH18377.setPivotYN16904(lastIndexOf11, maximumDrawingCacheSize2, doubleTapTimeout, -1438133721, false, (String) objArr112[0], new Class[]{String.class});
                                                    }
                                                    long longValue19 = ((Long) ((Method) D887127).invoke(null, objArr111)).longValue();
                                                    long j138 = 537467497;
                                                    long j139 = 471;
                                                    str8 = str58;
                                                    long j140 = -470;
                                                    long j141 = ((j138 | longValue19) * j140) + (j139 * longValue19) + (j139 * j138);
                                                    long j142 = longValue19 ^ j38;
                                                    long j143 = ((j138 ^ j38) | j142) ^ j38;
                                                    long tango3 = ao.ad.tango(1630306918);
                                                    long j144 = (((tango3 ^ j38) | j138) | longValue19) ^ j38;
                                                    long j145 = (470 * ((((j142 | j138) | tango3) ^ j38) | j144)) + ((j143 | ((j142 | tango3) ^ j38) | j144) * j140) + j141 + 237353809;
                                                    int romeo5 = ao.ad.romeo();
                                                    int i449 = ((int) (j145 >> c3)) & ((((~(romeo5 | 1044176590)) | 739822214) * 433) + (((~(1813564294 | romeo5)) | 1044176590) * (-433)) + (((~((~romeo5) | (-1073742081))) * 433) - 995167630));
                                                    int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                    int i450 = ((int) j145) & ((((~(uptimeMillis3 | (-1921467078))) | (-2010081238)) * 49) + (((~((~uptimeMillis3) | (-936273809))) | (-1921467078) | (~(936273808 | uptimeMillis3))) * (-49)) + ((((~((-1921467078) | r7)) | 1073807429) * 98) - 2129662597));
                                                    if (((i449 & i450) | (i449 ^ i450)) != 0) {
                                                        i48 = i49;
                                                        break;
                                                    }
                                                    str9 = str8;
                                                    char deadChar32 = (char) (KeyEvent.getDeadChar(0, 0) + 34686);
                                                    int i4352 = 1873 - (~(-(ViewConfiguration.getTapTimeout() >> 16)));
                                                    int i4362 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int vD14832N671552 = F2.vD14832N6715();
                                                    int i4372 = i4362 * (-665);
                                                    int i4382 = (i4372 ^ 4342) + ((i4372 & 4342) << 1);
                                                    int i4392 = ~i4362;
                                                    int i4402 = -(-(i4392 * (-333)));
                                                    int i4412 = (i4382 ^ i4402) + ((i4402 & i4382) << 1);
                                                    int i4422 = ~vD14832N671552;
                                                    int i4432 = -(-(((~((i4392 ^ i4422) | (i4392 & i4422))) | (~(vD14832N671552 | 13))) * 333));
                                                    int i4442 = ((((i4412 | i4432) << 1) - (i4432 ^ i4412)) - (~(((~((i4392 & vD14832N671552) | (i4392 ^ vD14832N671552))) | (~((i4422 ^ 13) | (i4422 & 13)))) * 333))) - 1;
                                                    objArr = new Object[1];
                                                    bravo(deadChar32, i4352, i4442, objArr);
                                                    if (!str9.equals((String) objArr[0])) {
                                                    }
                                                    int i4482 = ((i49 | (-124)) << 1) - (i49 ^ (-124));
                                                    i47 = (i4482 & 125) + (i4482 | 125);
                                                    strArr18 = strArr7;
                                                }
                                            }
                                            i48 = -1;
                                            int i451 = (i48 + 130) ^ i4;
                                            int i452 = ~i48;
                                            int i453 = -i452;
                                            int i454 = ((i452 & i453) | (i452 ^ i453)) >> 31;
                                            int i455 = (~i454) & i4;
                                            int i456 = i451 & i454;
                                            int i457 = (i456 & i455) | (i455 ^ i456);
                                            int i458 = ((~i35) & i4) | (i35 & i100);
                                            int i459 = -i458;
                                            int i460 = ((i458 & i459) | (i458 ^ i459)) >> 31;
                                            i35 = (i35 & i460) | (i457 & (~i460));
                                        }
                                        char indexOf10 = (char) TextUtils.indexOf(str16, str16);
                                        int capsMode3 = 1952 - TextUtils.getCapsMode(str16, 0, 0);
                                        int i461 = -AndroidCharacter.getMirror('0');
                                        int i462 = (i461 ^ 61) + ((i461 & 61) << 1);
                                        Object[] objArr113 = new Object[1];
                                        bravo(indexOf10, capsMode3, i462, objArr113);
                                        String str59 = (String) objArr113[0];
                                        char gidForName = (char) (Process.getGidForName(str16) + 1);
                                        int i463 = 1964 - (~(ViewConfiguration.getTouchSlop() >> 8));
                                        int i464 = -ExpandableListView.getPackedPositionGroup(0L);
                                        int i465 = ((i464 | 5) << 1) - (i464 ^ 5);
                                        Object[] objArr114 = new Object[1];
                                        bravo(gidForName, i463, i465, objArr114);
                                        String[] strArr19 = {str59, (String) objArr114[0]};
                                        char c32 = (char) (3080 - (~(-(-ExpandableListView.getPackedPositionType(0L)))));
                                        int i466 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i467 = (i466 & 1970) + (i466 | 1970);
                                        int i468 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        int i469 = (i468 ^ 15) + ((i468 & 15) << 1);
                                        Object[] objArr115 = new Object[1];
                                        bravo(c32, i467, i469, objArr115);
                                        String str60 = (String) objArr115[0];
                                        int indexOf11 = TextUtils.indexOf((CharSequence) str16, '0', 0);
                                        Object[] objArr116 = new Object[1];
                                        bravo((char) ((indexOf11 & 1) + (indexOf11 | 1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1986, 18 - (~(-(-View.resolveSize(0, 0)))), objArr116);
                                        String str61 = (String) objArr116[0];
                                        char scrollBarFadeDuration6 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int i470 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        int i471 = ~i470;
                                        int i472 = ~((i471 & 2004) | (i471 ^ 2004));
                                        int i473 = ((-2005) ^ i470) | ((-2005) & i470);
                                        int i474 = (i473 ^ i4) | (i473 & i4);
                                        int i475 = ~i474;
                                        int i476 = (((i470 * 477) - 951900) - (~(((i472 ^ i475) | (i472 & i475)) * (-476)))) - 1;
                                        int i477 = -(-((~i474) * 952));
                                        Object[] objArr117 = new Object[1];
                                        bravo(scrollBarFadeDuration6, ((~(i470 | (-2005) | (~i4))) * 476) + (i476 ^ i477) + ((i476 & i477) << 1), 12 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr117);
                                        String[] strArr20 = {str60, str61, (String) objArr117[0]};
                                        int i478 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int i479 = -TextUtils.indexOf((CharSequence) str16, '0', 0);
                                        int i480 = (i479 & 20) + (i479 | 20);
                                        Object[] objArr118 = new Object[1];
                                        bravo((char) ((-TextUtils.indexOf((CharSequence) str16, '0')) - 1), ((i478 | 2019) << 1) - (i478 ^ 2019), i480, objArr118);
                                        String str62 = (String) objArr118[0];
                                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int i481 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i482 = -(-Color.argb(0, 0, 0, 0));
                                        int i483 = ((i482 | 10) << 1) - (i482 ^ 10);
                                        Object[] objArr119 = new Object[1];
                                        bravo(maximumFlingVelocity, (i481 & 2039) + (i481 | 2039), i483, objArr119);
                                        String[] strArr21 = {str62, (String) objArr119[0]};
                                        char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 11297);
                                        int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 2049;
                                        int i484 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                        int i485 = ((i484 | 11) << 1) - (i484 ^ 11);
                                        Object[] objArr120 = new Object[1];
                                        bravo(bitsPerPixel3, scrollBarSize3, i485, objArr120);
                                        String str63 = (String) objArr120[0];
                                        int i486 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                        Object[] objArr121 = new Object[1];
                                        bravo((char) (((i486 | 53356) << 1) - (i486 ^ 53356)), 589 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6 - (~MotionEvent.axisFromString(str16)), objArr121);
                                        String[] strArr22 = {str63, (String) objArr121[0]};
                                        int i487 = -ExpandableListView.getPackedPositionType(0L);
                                        int vD14832N67156 = F2.vD14832N6715();
                                        int i488 = i487 * (-300);
                                        int i489 = (i488 & 3619470) + (i488 | 3619470);
                                        int i490 = -(-((~((i487 ^ 11985) | (i487 & 11985) | vD14832N67156)) * (-301)));
                                        int i491 = (i489 & i490) + (i490 | i489);
                                        int i492 = ~(((-11986) ^ vD14832N67156) | ((-11986) & vD14832N67156));
                                        int i493 = ~vD14832N67156;
                                        int i494 = (((~((i493 ^ i487) | (i493 & i487))) | i492) * (-301)) + i491;
                                        int i495 = ~((~i487) | vD14832N67156);
                                        char c33 = (char) (((((-11986) & i495) | ((-11986) ^ i495)) * 301) + i494);
                                        int i496 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        int i497 = (i496 & 2060) + (i496 | 2060);
                                        int i498 = -(-(Process.myTid() >> 22));
                                        int i499 = ((i498 | 28) << 1) - (i498 ^ 28);
                                        Object[] objArr122 = new Object[1];
                                        bravo(c33, i497, i499, objArr122);
                                        String str64 = (String) objArr122[0];
                                        int i500 = i35;
                                        c10 = 0;
                                        i40 = 1;
                                        Object[] objArr123 = new Object[1];
                                        bravo((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode(str16, 0, 0) + 2039, 9 - (~TextUtils.getTrimmedLength(str16)), objArr123);
                                        String[] strArr23 = {str64, (String) objArr123[0]};
                                        i41 = 5;
                                        String[][] strArr24 = {strArr19, strArr20, strArr21, strArr22, strArr23};
                                        i42 = 0;
                                        int i501 = -1;
                                        loop7: while (true) {
                                            if (i42 < i41) {
                                                i43 = i4;
                                                break;
                                            }
                                            String[] strArr25 = strArr24[i42];
                                            String str65 = strArr25[c10];
                                            String[] strArr26 = (String[]) Arrays.copyOfRange(strArr25, i40, strArr25.length);
                                            int i502 = 0;
                                            for (int length = strArr26.length; i502 < length; length = i46) {
                                                String str66 = strArr26[i502];
                                                i501 = (i501 & (-20)) + (i501 | (-20)) + 21;
                                                File file4 = new File(str65);
                                                if (file4.exists()) {
                                                    int i503 = delta;
                                                    int i504 = ((i503 | 53) << 1) - (i503 ^ 53);
                                                    i45 = i42;
                                                    charlie = i504 % 128;
                                                    if (i504 % 2 != 0) {
                                                        file4.isFile();
                                                        throw null;
                                                    }
                                                    if (file4.isFile()) {
                                                        try {
                                                            Scanner scanner3 = new Scanner(new FileInputStream(file4));
                                                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            strArr6 = strArr26;
                                                            try {
                                                                int i505 = -TextUtils.indexOf((CharSequence) str16, '0');
                                                                str6 = str65;
                                                                i46 = length;
                                                                try {
                                                                    Object[] objArr124 = new Object[1];
                                                                    bravo(longPressTimeout, (i505 ^ 369) + ((i505 & 369) << 1), 2 - View.resolveSizeAndState(0, 0, 0), objArr124);
                                                                    Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr124[0]);
                                                                    if (useDelimiter3.hasNext()) {
                                                                        int i506 = delta;
                                                                        charlie = ((i506 ^ 9) + ((i506 & 9) << 1)) % 128;
                                                                        str7 = useDelimiter3.next();
                                                                    } else {
                                                                        str7 = str16;
                                                                    }
                                                                    useDelimiter3.close();
                                                                    if (str7.contains(str66)) {
                                                                        int i507 = (i501 ^ 170) + ((i501 & 170) << 1);
                                                                        i43 = (i507 & i100) | ((~i507) & i4);
                                                                        break loop7;
                                                                    }
                                                                } catch (IOException unused3) {
                                                                }
                                                            } catch (IOException unused4) {
                                                            }
                                                        } catch (IOException unused5) {
                                                            strArr6 = strArr26;
                                                        }
                                                        i502++;
                                                        i42 = i45;
                                                        strArr26 = strArr6;
                                                        str65 = str6;
                                                    }
                                                } else {
                                                    i45 = i42;
                                                }
                                                strArr6 = strArr26;
                                                str6 = str65;
                                                i46 = length;
                                                i502++;
                                                i42 = i45;
                                                strArr26 = strArr6;
                                                str65 = str6;
                                            }
                                            int i508 = i42;
                                            int i509 = (i508 ^ (-44)) + ((i508 & (-44)) << 1);
                                            i42 = ((i509 & 45) << 1) + (i509 ^ 45);
                                            i40 = 1;
                                            i41 = 5;
                                            c10 = 0;
                                        }
                                        int i510 = (~(i4 & i500)) & (i4 | i500);
                                        int i511 = (i510 | (-i510)) >> 31;
                                        int i512 = (i43 & (~i511)) | (i500 & i511);
                                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int i513 = 2086 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        int i514 = -(-Color.rgb(0, 0, 0));
                                        int i515 = (i514 ^ 16777229) + ((i514 & 16777229) << 1);
                                        Object[] objArr125 = new Object[1];
                                        bravo(scrollDefaultDelay, i513, i515, objArr125);
                                        String str67 = (String) objArr125[0];
                                        char c34 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i516 = -TextUtils.indexOf((CharSequence) str16, '0');
                                        int i517 = (i516 ^ 2100) + ((i516 & 2100) << 1);
                                        int i518 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        int i519 = (i518 ^ 8) + ((i518 & 8) << 1);
                                        Object[] objArr126 = new Object[1];
                                        bravo(c34, i517, i519, objArr126);
                                        str5 = (String) objArr126[0];
                                        file2 = new File(str67);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                Scanner scanner4 = new Scanner(new FileInputStream(file2));
                                                char alpha5 = (char) Color.alpha(0);
                                                int i520 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                Object[] objArr127 = new Object[1];
                                                bravo(alpha5, ((i520 | 369) << 1) - (i520 ^ 369), 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr127);
                                                Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr127[0]);
                                                next = useDelimiter4.hasNext() ? str16 : useDelimiter4.next();
                                                useDelimiter4.close();
                                            } catch (IOException unused6) {
                                            }
                                            if (next.contains(str5)) {
                                                delta = (charlie + 41) % 128;
                                                i44 = (i4 & (-151)) | (i100 & 150);
                                                int i521 = ((~i512) & i4) | (i512 & i100);
                                                int i522 = -i521;
                                                int i523 = ((i521 & i522) | (i521 ^ i522)) >> 31;
                                                int i524 = i44 & (~i523);
                                                int i525 = i512 & i523;
                                                int i526 = (i525 & i524) | (i524 ^ i525);
                                                int i527 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int i528 = -Gravity.getAbsoluteGravity(0, 0);
                                                int i529 = ((i528 | 2109) << 1) - (i528 ^ 2109);
                                                int blue = Color.blue(0);
                                                int i530 = (blue & 47) + (blue | 47);
                                                Object[] objArr128 = new Object[1];
                                                bravo((char) (((i527 | 50476) << 1) - (i527 ^ 50476)), i529, i530, objArr128);
                                                Object[] objArr129 = {(String) objArr128[0]};
                                                D88715 = uH18377.D8871(1979478258);
                                                if (D88715 == null) {
                                                    int i531 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51;
                                                    int capsMode4 = TextUtils.getCapsMode(str16, 0, 0) + 2951;
                                                    char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    byte b59 = (byte) (bArr[6] - 1);
                                                    byte b60 = (byte) (b59 - 1);
                                                    Object[] objArr130 = new Object[1];
                                                    charlie(b59, (byte) (b60 - 1), b60, objArr130);
                                                    D88715 = uH18377.setPivotYN16904(i531, capsMode4, minimumFlingVelocity3, -1438133721, false, (String) objArr130[0], new Class[]{String.class});
                                                }
                                                long longValue20 = ((Long) ((Method) D88715).invoke(null, objArr129)).longValue();
                                                long j146 = 50746670;
                                                long j147 = ((-657) * longValue20) + (659 * j146);
                                                long j148 = ((j146 ^ j38) | longValue20) ^ j38;
                                                long j149 = ((longValue20 ^ j38) | j146) ^ j38;
                                                long j150 = (j146 | j103) ^ j38;
                                                long j151 = ((-658) * (j148 | j149 | j150)) + j147;
                                                long j152 = 658;
                                                long j153 = (j152 * (j149 | j150)) + (j152 * j149) + j151 + 724074636;
                                                int i532 = ((int) (j153 >> c3)) & ((((-315500733) | (~((-1121725679) | i4)) | (~(i100 | 1121725678))) * 45) + (((~((-315500733) | i4)) | (-1390292223)) * (-45)) + (((~((-315500733) | i100)) | 1121725678) * (-90)) + 1687905420);
                                                int uptimeMillis4 = (int) SystemClock.uptimeMillis();
                                                int i533 = ~uptimeMillis4;
                                                int i534 = ~((-1500951405) | i533);
                                                int i535 = ((int) j153) & ((((-63724995) | i534) * 712) + (((~(uptimeMillis4 | (-1479713325))) | (~(i533 | (-21238081)))) * (-712)) + ((21238080 | i534) * (-712)) + 215840013);
                                                int i536 = ((i532 & i535) | (i532 ^ i535)) * 263;
                                                int i537 = (i536 | i4) & (~(i4 & i536));
                                                int i538 = (~(i4 & i526)) & (i4 | i526);
                                                int i539 = -i538;
                                                int i540 = ((i538 & i539) | (i538 ^ i539)) >> 31;
                                                int i541 = i537 & (~i540);
                                                int i542 = i526 & i540;
                                                i32 = (i542 & i541) | (i541 ^ i542);
                                                strArr = strArr2;
                                            }
                                        }
                                        i44 = i4;
                                        int i5212 = ((~i512) & i4) | (i512 & i100);
                                        int i5222 = -i5212;
                                        int i5232 = ((i5212 & i5222) | (i5212 ^ i5222)) >> 31;
                                        int i5242 = i44 & (~i5232);
                                        int i5252 = i512 & i5232;
                                        int i5262 = (i5252 & i5242) | (i5242 ^ i5252);
                                        int i5272 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int i5282 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i5292 = ((i5282 | 2109) << 1) - (i5282 ^ 2109);
                                        int blue2 = Color.blue(0);
                                        int i5302 = (blue2 & 47) + (blue2 | 47);
                                        Object[] objArr1282 = new Object[1];
                                        bravo((char) (((i5272 | 50476) << 1) - (i5272 ^ 50476)), i5292, i5302, objArr1282);
                                        Object[] objArr1292 = {(String) objArr1282[0]};
                                        D88715 = uH18377.D8871(1979478258);
                                        if (D88715 == null) {
                                        }
                                        long longValue202 = ((Long) ((Method) D88715).invoke(null, objArr1292)).longValue();
                                        long j1462 = 50746670;
                                        long j1472 = ((-657) * longValue202) + (659 * j1462);
                                        long j1482 = ((j1462 ^ j38) | longValue202) ^ j38;
                                        long j1492 = ((longValue202 ^ j38) | j1462) ^ j38;
                                        long j1502 = (j1462 | j103) ^ j38;
                                        long j1512 = ((-658) * (j1482 | j1492 | j1502)) + j1472;
                                        long j1522 = 658;
                                        long j1532 = (j1522 * (j1492 | j1502)) + (j1522 * j1492) + j1512 + 724074636;
                                        int i5322 = ((int) (j1532 >> c3)) & ((((-315500733) | (~((-1121725679) | i4)) | (~(i100 | 1121725678))) * 45) + (((~((-315500733) | i4)) | (-1390292223)) * (-45)) + (((~((-315500733) | i100)) | 1121725678) * (-90)) + 1687905420);
                                        int uptimeMillis42 = (int) SystemClock.uptimeMillis();
                                        int i5332 = ~uptimeMillis42;
                                        int i5342 = ~((-1500951405) | i5332);
                                        int i5352 = ((int) j1532) & ((((-63724995) | i5342) * 712) + (((~(uptimeMillis42 | (-1479713325))) | (~(i5332 | (-21238081)))) * (-712)) + ((21238080 | i5342) * (-712)) + 215840013);
                                        int i5362 = ((i5322 & i5352) | (i5322 ^ i5352)) * 263;
                                        int i5372 = (i5362 | i4) & (~(i4 & i5362));
                                        int i5382 = (~(i4 & i5262)) & (i4 | i5262);
                                        int i5392 = -i5382;
                                        int i5402 = ((i5382 & i5392) | (i5382 ^ i5392)) >> 31;
                                        int i5412 = i5372 & (~i5402);
                                        int i5422 = i5262 & i5402;
                                        i32 = (i5422 & i5412) | (i5412 ^ i5422);
                                        strArr = strArr2;
                                    }
                                } else {
                                    i34 = i320;
                                }
                                int combineMeasuredStates3 = View.combineMeasuredStates(0, 0);
                                int i543 = -(Process.myTid() >> 22);
                                Object[] objArr131 = new Object[1];
                                bravo((char) ((combineMeasuredStates3 ^ 3471) + ((combineMeasuredStates3 & 3471) << 1)), (i543 ^ 372) + ((i543 & 372) << 1), 22 - (~(-(-KeyEvent.normalizeMetaState(0)))), objArr131);
                                String str68 = (String) objArr131[0];
                                int i544 = -(-View.getDefaultSize(0, 0));
                                int i545 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int vD14832N67157 = F2.vD14832N6715();
                                int i546 = i545 * (-495);
                                int i547 = ((-401445) & i546) + (i546 | (-401445));
                                int i548 = ~i545;
                                int i549 = (i547 - (~(((~((i548 ^ (-812)) | (i548 & (-812)))) | (~((i548 ^ vD14832N67157) | (i548 & vD14832N67157)))) * 992))) - 1;
                                int i550 = ~((i548 & (-812)) | (i548 ^ (-812)));
                                int i551 = ~((~i545) | vD14832N67157);
                                int i552 = (i550 & i551) | (i550 ^ i551);
                                int i553 = ~vD14832N67157;
                                int i554 = (i545 & i553) | (i553 ^ i545);
                                int i555 = ~((i554 & 811) | (i554 ^ 811));
                                Object[] objArr132 = new Object[1];
                                bravo((char) ((35321 ^ i544) + ((i544 & 35321) << 1)), (((((i555 & i552) | (i552 ^ i555)) * (-496)) + i549) - (~(((vD14832N67157 & 811) | (vD14832N67157 ^ 811)) * 496))) - 1, 9 - (~(-Gravity.getAbsoluteGravity(0, 0))), objArr132);
                                String str69 = (String) objArr132[0];
                                Object[] objArr133 = new Object[1];
                                bravo((char) Color.alpha(0), 820 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), Color.green(0) + 7, objArr133);
                                String str70 = (String) objArr133[0];
                                char c35 = (char) (22005 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))));
                                int resolveSize2 = 827 - View.resolveSize(0, 0);
                                int i556 = -(-ExpandableListView.getPackedPositionType(0L));
                                int i557 = (i556 ^ 8) + ((i556 & 8) << 1);
                                Object[] objArr134 = new Object[1];
                                bravo(c35, resolveSize2, i557, objArr134);
                                String[] strArr27 = {str68, str69, str70, (String) objArr134[0]};
                                char c36 = (char) (16638 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                                int fadingEdgeLength5 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                int i558 = (fadingEdgeLength5 & 835) + (fadingEdgeLength5 | 835);
                                int i559 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i560 = (i559 & 18) + (i559 | 18);
                                Object[] objArr135 = new Object[1];
                                bravo(c36, i558, i560, objArr135);
                                String str71 = (String) objArr135[0];
                                char resolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                                int i561 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i562 = (i561 & 853) + (i561 | 853);
                                int i563 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i564 = (i563 ^ 6) + ((i563 & 6) << 1);
                                Object[] objArr136 = new Object[1];
                                bravo(resolveOpacity3, i562, i564, objArr136);
                                String str72 = (String) objArr136[0];
                                Object[] objArr137 = new Object[1];
                                bravo((char) (ViewConfiguration.getTouchSlop() >> 8), 859 - TextUtils.indexOf(str16, str16, 0), (Process.myPid() >> 22) + 7, objArr137);
                                String str73 = (String) objArr137[0];
                                int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int i565 = (pressedStateDuration2 * 881) - (-39208905);
                                int i566 = ~pressedStateDuration2;
                                int i567 = ~(((-44506) ^ i566) | ((-44506) & i566));
                                int i568 = ~pressedStateDuration2;
                                int i569 = ~((i568 ^ i4) | (i568 & i4));
                                int i570 = (i567 ^ i569) | (i567 & i569);
                                int i571 = ~(((-44506) ^ i4) | ((-44506) & i4));
                                int i572 = -(-(((i570 ^ i571) | (i570 & i571)) * (-880)));
                                int i573 = (pressedStateDuration2 & i4) | (pressedStateDuration2 ^ i4);
                                char c37 = (char) (((~i573) * 880) + (((~(i566 | i100)) | 44505 | (~i573)) * (-880)) + (i565 ^ i572) + ((i565 & i572) << 1));
                                int keyCodeFromString5 = 866 - KeyEvent.keyCodeFromString(str16);
                                int i574 = -(-View.resolveSizeAndState(0, 0, 0));
                                Object[] objArr138 = new Object[1];
                                bravo(c37, keyCodeFromString5, (i574 & 11) + (i574 | 11), objArr138);
                                String str74 = (String) objArr138[0];
                                char c38 = (char) (0 - (~TextUtils.indexOf((CharSequence) str16, '0')));
                                int i575 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                int i576 = ((i575 | 877) << 1) - (i575 ^ 877);
                                int i577 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                Object[] objArr139 = new Object[1];
                                bravo(c38, i576, (i577 ^ 14) + ((i577 & 14) << 1), objArr139);
                                String[] strArr28 = {str71, str72, str73, str74, (String) objArr139[0]};
                                char c39 = (char) (16870 - (~(-(-TextUtils.indexOf(str16, str16, 0, 0)))));
                                int i578 = 891 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i579 = -KeyEvent.getDeadChar(0, 0);
                                int i580 = ((i579 | 16) << 1) - (i579 ^ 16);
                                Object[] objArr140 = new Object[1];
                                bravo(c39, i578, i580, objArr140);
                                String str75 = (String) objArr140[0];
                                int i581 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i582 = -MotionEvent.axisFromString(str16);
                                Object[] objArr141 = new Object[1];
                                bravo((char) ((51435 ^ i581) + ((i581 & 51435) << 1)), (i582 & 906) + (i582 | 906), 16777218 - (~Color.rgb(0, 0, 0)), objArr141);
                                String str76 = (String) objArr141[0];
                                int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                Object[] objArr142 = new Object[1];
                                bravo((char) ((longPressTimeout2 ^ 8711) + ((longPressTimeout2 & 8711) << 1)), 916 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), 21 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), objArr142);
                                String str77 = (String) objArr142[0];
                                char c40 = (char) (59111 - (~View.combineMeasuredStates(0, 0)));
                                int i583 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int i584 = -(-TextUtils.getOffsetAfter(str16, 0));
                                int i585 = ((i584 | 25) << 1) - (i584 ^ 25);
                                Object[] objArr143 = new Object[1];
                                bravo(c40, ((i583 | 939) << 1) - (i583 ^ 939), i585, objArr143);
                                String str78 = (String) objArr143[0];
                                int i586 = -View.MeasureSpec.getSize(0);
                                int i587 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int vD14832N67158 = F2.vD14832N6715();
                                int i588 = i587 * (-919);
                                int i589 = ((-886835) & i588) + (i588 | (-886835));
                                int i590 = ~i587;
                                int i591 = i590 | (-966);
                                int i592 = ~((i591 ^ vD14832N67158) | (i591 & vD14832N67158));
                                int i593 = ~vD14832N67158;
                                int i594 = ((~(((-966) ^ i593) | ((-966) & i593) | i587)) | i592) * 920;
                                int i595 = ((i589 | i594) << 1) - (i589 ^ i594);
                                int i596 = ~i587;
                                int i597 = ~((i596 ^ (-966)) | (i596 & (-966)));
                                int i598 = ~vD14832N67158;
                                int i599 = (i597 | (~(i590 | i598))) * 920;
                                int i600 = ((i595 | i599) << 1) - (i599 ^ i595);
                                int i601 = (i590 ^ (-966)) | (i590 & (-966));
                                int i602 = ~((i601 & i598) | (i601 ^ i598));
                                int i603 = ~(i596 | 965 | vD14832N67158);
                                int i604 = (i602 & i603) | (i602 ^ i603);
                                int i605 = ((-966) & i587) | ((-966) ^ i587);
                                int i606 = ~((i605 & vD14832N67158) | (i605 ^ vD14832N67158));
                                int i607 = ((i604 & i606) | (i604 ^ i606)) * 920;
                                int i608 = (i600 ^ i607) + ((i600 & i607) << 1);
                                int i609 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int i610 = (i609 ^ 27) + ((i609 & 27) << 1);
                                Object[] objArr144 = new Object[1];
                                bravo((char) ((59838 ^ i586) + ((i586 & 59838) << 1)), i608, i610, objArr144);
                                String[] strArr29 = {str75, str76, str11, str77, str78, (String) objArr144[0]};
                                char resolveSize3 = (char) View.resolveSize(0, 0);
                                int axisFromString2 = MotionEvent.axisFromString(str16);
                                int i611 = (axisFromString2 & 994) + (axisFromString2 | 994);
                                int i612 = -(-TextUtils.getCapsMode(str16, 0, 0));
                                int i613 = (i612 ^ 11) + ((i612 & 11) << 1);
                                Object[] objArr145 = new Object[1];
                                bravo(resolveSize3, i611, i613, objArr145);
                                String str79 = (String) objArr145[0];
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int i614 = 1003 - (~(Process.myTid() >> 22));
                                int i615 = -(-Drawable.resolveOpacity(0, 0));
                                int i616 = ((i615 | 8) << 1) - (i615 ^ 8);
                                Object[] objArr146 = new Object[1];
                                bravo(tapTimeout, i614, i616, objArr146);
                                String str80 = (String) objArr146[0];
                                int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int i617 = -TextUtils.lastIndexOf(str16, '0', 0, 0);
                                Object[] objArr147 = new Object[1];
                                bravo((char) ((46755 ^ scrollDefaultDelay2) + ((scrollDefaultDelay2 & 46755) << 1)), (i617 & 1011) + (i617 | 1011), 5 - TextUtils.indexOf((CharSequence) str16, '0', 0, 0), objArr147);
                                String str81 = (String) objArr147[0];
                                char c41 = (char) (7678 - (~Process.getGidForName(str16)));
                                int i618 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int i619 = ((i618 | 1017) << 1) - (i618 ^ 1017);
                                int i620 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int i621 = (i620 & 7) + (i620 | 7);
                                Object[] objArr148 = new Object[1];
                                bravo(c41, i619, i621, objArr148);
                                String[] strArr30 = {str79, str80, str81, (String) objArr148[0]};
                                int i622 = -ExpandableListView.getPackedPositionGroup(0L);
                                Object[] objArr149 = new Object[1];
                                bravo((char) ((42850 ^ i622) + ((i622 & 42850) << 1)), TextUtils.indexOf((CharSequence) str16, '0', 0) + 1025, 15 - (~(-(-ExpandableListView.getPackedPositionType(0L)))), objArr149);
                                String str82 = (String) objArr149[0];
                                char myTid4 = (char) (Process.myTid() >> 22);
                                int i623 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int i624 = i623 * 673;
                                int i625 = ((-1153637) ^ i624) + ((i624 & (-1153637)) << 1);
                                int i626 = ~((i623 ^ i4) | (i623 & i4));
                                int i627 = -(-(((i626 & 859) | (i626 ^ 859)) * 672));
                                int i628 = ((i625 | i627) << 1) - (i627 ^ i625);
                                int i629 = ~i623;
                                int i630 = ~((i629 & i100) | (i629 ^ i100));
                                int i631 = ~(i4 | 859);
                                int i632 = (((i630 & i631) | (i630 ^ i631)) * (-672)) + i628;
                                int i633 = ((~((i623 & (-860)) | ((-860) ^ i623))) | (~(((-860) ^ i100) | ((-860) & i100)))) * 672;
                                int i634 = (i632 & i633) + (i633 | i632);
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                int i635 = (packedPositionType ^ 7) + ((packedPositionType & 7) << 1);
                                Object[] objArr150 = new Object[1];
                                bravo(myTid4, i634, i635, objArr150);
                                String str83 = (String) objArr150[0];
                                int i636 = -ImageFormat.getBitsPerPixel(0);
                                Object[] objArr151 = new Object[1];
                                bravo((char) ((i636 & 22004) + (i636 | 22004)), 826 - (~(-KeyEvent.normalizeMetaState(0))), 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr151);
                                String[] strArr31 = {str82, str83, (String) objArr151[0]};
                                Object[] objArr152 = new Object[1];
                                bravo((char) Color.alpha(0), TextUtils.indexOf(str16, str16, 0, 0) + 1040, 12 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr152);
                                String str84 = (String) objArr152[0];
                                Object[] objArr153 = new Object[1];
                                bravo((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 1053 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), 0 - (~(-(-(ViewConfiguration.getWindowTouchSlop() >> 8)))), objArr153);
                                String[] strArr32 = {str84, (String) objArr153[0]};
                                char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int rgb3 = (-16776161) - Color.rgb(0, 0, 0);
                                int lastIndexOf12 = TextUtils.lastIndexOf(str16, '0', 0);
                                int i637 = ((lastIndexOf12 | 10) << 1) - (lastIndexOf12 ^ 10);
                                Object[] objArr154 = new Object[1];
                                bravo(keyRepeatDelay3, rgb3, i637, objArr154);
                                String str85 = (String) objArr154[0];
                                Object[] objArr155 = new Object[1];
                                bravo((char) (38501 - Process.getGidForName(str16)), 1064 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), Color.red(0) + 1, objArr155);
                                String[] strArr33 = {str85, (String) objArr155[0]};
                                int i638 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i639 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i640 = -(-Color.rgb(0, 0, 0));
                                Object[] objArr156 = new Object[1];
                                bravo((char) (((i638 | 25467) << 1) - (i638 ^ 25467)), ((i639 | 1065) << 1) - (i639 ^ 1065), ((i640 | 16777232) << 1) - (i640 ^ 16777232), objArr156);
                                String str86 = (String) objArr156[0];
                                int i641 = -(-Process.getGidForName(str16));
                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 907;
                                int i642 = -(-Color.alpha(0));
                                Object[] objArr157 = new Object[1];
                                bravo((char) ((51436 ^ i641) + ((i641 & 51436) << 1)), doubleTapTimeout2, ((i642 | 3) << 1) - (i642 ^ 3), objArr157);
                                String str87 = (String) objArr157[0];
                                char scrollBarFadeDuration7 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int lastIndexOf13 = 851 - TextUtils.lastIndexOf(str16, '0', 0);
                                int i643 = -(-TextUtils.getOffsetAfter(str16, 0));
                                int i644 = (i643 ^ 7) + ((i643 & 7) << 1);
                                Object[] objArr158 = new Object[1];
                                bravo(scrollBarFadeDuration7, lastIndexOf13, i644, objArr158);
                                String str88 = (String) objArr158[0];
                                int i645 = -Drawable.resolveOpacity(0, 0);
                                int i646 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1080;
                                int i647 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                Object[] objArr159 = new Object[1];
                                bravo((char) ((i645 & 14769) + (i645 | 14769)), i646, (i647 & 8) + (i647 | 8), objArr159);
                                String str89 = (String) objArr159[0];
                                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                int i648 = keyRepeatTimeout2 * (-813);
                                int i649 = (18158040 ^ i648) + ((i648 & 18158040) << 1);
                                int i650 = ~(((-44506) ^ keyRepeatTimeout2) | ((-44506) & keyRepeatTimeout2));
                                int i651 = (keyRepeatTimeout2 ^ i4) | (keyRepeatTimeout2 & i4);
                                int i652 = ~i651;
                                int i653 = (((i650 ^ i652) | (i650 & i652)) * (-814)) + i649;
                                int i654 = ~(((-44506) ^ i100) | ((-44506) & i100));
                                int i655 = ~keyRepeatTimeout2;
                                int i656 = (44505 ^ i655) | (i655 & 44505);
                                int i657 = ~i656;
                                int i658 = (i654 ^ i657) | (i657 & i654);
                                int i659 = ~i651;
                                int i660 = ((i658 & i659) | (i658 ^ i659)) * HttpConstants.HTTP_PROXY_AUTH;
                                int i661 = (i653 ^ i660) + ((i660 & i653) << 1);
                                int i662 = (~i656) | (~((i655 & i4) | (i655 ^ i4)));
                                int i663 = ~((44505 ^ i4) | (44505 & i4));
                                int i664 = ((i662 & i663) | (i662 ^ i663)) * HttpConstants.HTTP_PROXY_AUTH;
                                int i665 = -KeyEvent.getDeadChar(0, 0);
                                Object[] objArr160 = new Object[1];
                                bravo((char) ((i661 & i664) + (i664 | i661)), (i665 ^ 866) + ((i665 & 866) << 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr160);
                                String str90 = (String) objArr160[0];
                                char keyCodeFromString6 = (char) KeyEvent.keyCodeFromString(str16);
                                int resolveOpacity4 = Drawable.resolveOpacity(0, 0);
                                int i666 = (resolveOpacity4 & 877) + (resolveOpacity4 | 877);
                                int gidForName2 = Process.getGidForName(str16);
                                int i667 = (gidForName2 ^ 15) + ((gidForName2 & 15) << 1);
                                Object[] objArr161 = new Object[1];
                                bravo(keyCodeFromString6, i666, i667, objArr161);
                                String[] strArr34 = {str86, str87, str88, str89, str90, (String) objArr161[0]};
                                char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int i668 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                Object[] objArr162 = new Object[1];
                                bravo(touchSlop2, (i668 & 1089) + (i668 | 1089), 20 - Color.argb(0, 0, 0, 0), objArr162);
                                String str91 = (String) objArr162[0];
                                char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i669 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i670 = ((i669 | 1109) << 1) - (i669 ^ 1109);
                                int i671 = -Process.getGidForName(str16);
                                int i672 = (i671 ^ 18) + ((i671 & 18) << 1);
                                Object[] objArr163 = new Object[1];
                                bravo(pressedStateDuration3, i670, i672, objArr163);
                                String str92 = (String) objArr163[0];
                                char alpha6 = (char) Color.alpha(0);
                                int i673 = 1126 - (~(-TextUtils.indexOf((CharSequence) str16, '0', 0)));
                                int i674 = -Process.getGidForName(str16);
                                int i675 = (i674 ^ 30) + ((i674 & 30) << 1);
                                Object[] objArr164 = new Object[1];
                                bravo(alpha6, i673, i675, objArr164);
                                String str93 = (String) objArr164[0];
                                Object[] objArr165 = new Object[1];
                                bravo((char) (18732 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Process.myPid() >> 22) + 1159, 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr165);
                                String str94 = (String) objArr165[0];
                                char indexOf12 = (char) TextUtils.indexOf(str16, str16, 0);
                                int i676 = -((byte) KeyEvent.getModifierMetaStateMask());
                                Object[] objArr166 = new Object[1];
                                bravo(indexOf12, (i676 ^ 1184) + ((i676 & 1184) << 1), 22 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr166);
                                String str95 = (String) objArr166[0];
                                char size = (char) View.MeasureSpec.getSize(0);
                                int i677 = 1207 - (~View.combineMeasuredStates(0, 0));
                                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int vD14832N67159 = F2.vD14832N6715();
                                int i678 = (maximumFlingVelocity2 * 399) + 13167;
                                int i679 = ~maximumFlingVelocity2;
                                int i680 = ~((i679 ^ 33) | (i679 & 33));
                                int i681 = ~((-34) | maximumFlingVelocity2);
                                int i682 = (i680 ^ i681) | (i680 & i681);
                                int i683 = ~((-34) | vD14832N67159);
                                int i684 = -(-(((i682 ^ i683) | (i682 & i683)) * 398));
                                int i685 = (i678 ^ i684) + ((i684 & i678) << 1);
                                int i686 = ((maximumFlingVelocity2 ^ 33) | (maximumFlingVelocity2 & 33)) * (-1194);
                                int i687 = (i685 ^ i686) + ((i685 & i686) << 1);
                                int i688 = ~vD14832N67159;
                                int i689 = ~(((-34) & i688) | ((-34) ^ i688));
                                int i690 = ~maximumFlingVelocity2;
                                int i691 = ~((i690 ^ 33) | (i690 & 33));
                                int i692 = (i689 ^ i691) | (i689 & i691);
                                int i693 = ~(maximumFlingVelocity2 | (-34));
                                Object[] objArr167 = new Object[1];
                                bravo(size, i677, (((i692 & i693) | (i692 ^ i693)) * 398) + i687, objArr167);
                                String[] strArr35 = {str91, str92, str93, str94, str95, (String) objArr167[0], str11};
                                int i694 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i695 = i694 * (-515);
                                int i696 = (21189762 & i695) + (i695 | 21189762);
                                int i697 = ~(((-40987) ^ i4) | ((-40987) & i4));
                                int i698 = ~((i100 ^ i694) | (i100 & i694));
                                int i699 = (i697 ^ i698) | (i697 & i698);
                                int i700 = ~i4;
                                int i701 = (((~((i700 ^ 40986) | (i700 & 40986))) | i699) * (-516)) + i696;
                                int i702 = ~i694;
                                int i703 = (-40987) | i702;
                                int i704 = ~((i703 ^ i4) | (i703 & i4));
                                int i705 = ~((i702 ^ i100) | (i702 & i100) | 40986);
                                int i706 = -(-(((i704 ^ i705) | (i705 & i704)) * 516));
                                Object[] objArr168 = new Object[1];
                                bravo((char) ((((i701 ^ i706) + ((i701 & i706) << 1)) - (~(-(-(((~((~i694) | 40986)) | (~((40986 ^ i100) | (40986 & i100)))) * 516))))) - 1), 1242 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getTouchSlop() >> 8), objArr168);
                                String str96 = (String) objArr168[0];
                                int i707 = i34;
                                Object[] objArr169 = new Object[1];
                                bravo((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(str16) + 820, 6 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), objArr169);
                                String[] strArr36 = {str96, (String) objArr169[0]};
                                char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i708 = -TextUtils.getOffsetAfter(str16, 0);
                                Object[] objArr170 = new Object[1];
                                bravo(jumpTapTimeout3, ((i708 | 1254) << 1) - (i708 ^ 1254), Drawable.resolveOpacity(0, 0) + 30, objArr170);
                                String str97 = (String) objArr170[0];
                                Object[] objArr171 = new Object[1];
                                bravo((char) (25744 - (~(ViewConfiguration.getEdgeSlop() >> 16))), 1283 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) str16, '0', 0, 0) + 12, objArr171);
                                String[] strArr37 = {str97, (String) objArr171[0]};
                                char threadPriority7 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int i709 = 1294 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                int i710 = -(-Process.getGidForName(str16));
                                int i711 = ((i710 | 20) << 1) - (i710 ^ 20);
                                Object[] objArr172 = new Object[1];
                                bravo(threadPriority7, i709, i711, objArr172);
                                String str98 = (String) objArr172[0];
                                int i712 = 1312 - (~(-TextUtils.lastIndexOf(str16, '0', 0)));
                                int i713 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i714 = (i713 ^ 5) + ((i713 & 5) << 1);
                                Object[] objArr173 = new Object[1];
                                bravo((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), i712, i714, objArr173);
                                String[] strArr38 = {str98, (String) objArr173[0]};
                                int i715 = -(-TextUtils.indexOf(str16, str16));
                                int i716 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i717 = (i716 ^ 1318) + ((i716 & 1318) << 1);
                                int keyCodeFromString7 = KeyEvent.keyCodeFromString(str16);
                                int i718 = (keyCodeFromString7 & 19) + (keyCodeFromString7 | 19);
                                Object[] objArr174 = new Object[1];
                                bravo((char) ((i715 ^ 15799) + ((i715 & 15799) << 1)), i717, i718, objArr174);
                                String[] strArr39 = {(String) objArr174[0]};
                                char c42 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i719 = -View.getDefaultSize(0, 0);
                                Object[] objArr175 = new Object[1];
                                bravo(c42, (i719 & 1338) + (i719 | 1338), 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr175);
                                String[] strArr40 = {(String) objArr175[0]};
                                Object[] objArr176 = new Object[1];
                                bravo((char) Color.red(0), 1353 - TextUtils.indexOf((CharSequence) str16, '0', 0, 0), 18 - (~(-KeyEvent.keyCodeFromString(str16))), objArr176);
                                String[] strArr41 = {(String) objArr176[0]};
                                char indexOf13 = (char) (TextUtils.indexOf(str16, str16, 0, 0) + 51237);
                                int i720 = 1372 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                int i721 = -(Process.myPid() >> 22);
                                int i722 = ((i721 | 19) << 1) - (i721 ^ 19);
                                Object[] objArr177 = new Object[1];
                                bravo(indexOf13, i720, i722, objArr177);
                                String[] strArr42 = {(String) objArr177[0]};
                                int mode2 = View.MeasureSpec.getMode(0);
                                int i723 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                Object[] objArr178 = new Object[1];
                                bravo((char) ((44849 ^ mode2) + ((mode2 & 44849) << 1)), (i723 ^ 1391) + ((i723 & 1391) << 1), 22 - TextUtils.lastIndexOf(str16, '0', 0, 0), objArr178);
                                String[] strArr43 = {(String) objArr178[0]};
                                char indexOf14 = (char) TextUtils.indexOf(str16, str16, 0, 0);
                                int i724 = -(-AndroidCharacter.getMirror('0'));
                                int i725 = (i724 ^ 1367) + ((i724 & 1367) << 1);
                                int i726 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                Object[] objArr179 = new Object[1];
                                bravo(indexOf14, i725, (i726 ^ 22) + ((i726 & 22) << 1), objArr179);
                                String[] strArr44 = {(String) objArr179[0]};
                                char trimmedLength4 = (char) TextUtils.getTrimmedLength(str16);
                                int tapTimeout2 = 1436 - (ViewConfiguration.getTapTimeout() >> 16);
                                int i727 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i728 = ((i727 | 25) << 1) - (i727 ^ 25);
                                Object[] objArr180 = new Object[1];
                                bravo(trimmedLength4, tapTimeout2, i728, objArr180);
                                String[] strArr45 = {(String) objArr180[0], str11};
                                char threadPriority8 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int i729 = 1459 - (~View.resolveSize(0, 0));
                                int offsetAfter = TextUtils.getOffsetAfter(str16, 0);
                                int i730 = offsetAfter * (-515);
                                int i731 = (i730 & 14476) + (i730 | 14476);
                                int i732 = ~(((-29) ^ i4) | ((-29) & i4));
                                int i733 = ~(i100 | offsetAfter);
                                int i734 = (i732 ^ i733) | (i733 & i732);
                                int i735 = ~((i100 ^ 28) | (i100 & 28));
                                int i736 = ((i734 ^ i735) | (i734 & i735)) * (-516);
                                int i737 = (i731 ^ i736) + ((i731 & i736) << 1);
                                int i738 = ~offsetAfter;
                                int i739 = i738 | (-29);
                                int i740 = ~((i739 ^ i4) | (i739 & i4));
                                int i741 = (i738 ^ i100) | (i738 & i100);
                                int i742 = ~((i741 ^ 28) | (i741 & 28));
                                int i743 = (i737 - (~(-(-(((i740 ^ i742) | (i742 & i740)) * 516))))) - 1;
                                int i744 = ~((i738 ^ 28) | (i738 & 28));
                                int i745 = ~((i700 ^ 28) | (i700 & 28));
                                int i746 = (((i744 & i745) | (i744 ^ i745)) * 516) + i743;
                                Object[] objArr181 = new Object[1];
                                bravo(threadPriority8, i729, i746, objArr181);
                                String[] strArr46 = {(String) objArr181[0], str11};
                                char normalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                int i747 = -(-Process.getGidForName(str16));
                                Object[] objArr182 = new Object[1];
                                bravo(normalizeMetaState2, (i747 & 1489) + (i747 | 1489), 25 - (~(-TextUtils.indexOf((CharSequence) str16, '0', 0, 0))), objArr182);
                                String[] strArr47 = {(String) objArr182[0], str11};
                                char resolveSize4 = (char) View.resolveSize(0, 0);
                                int i748 = -(-TextUtils.getTrimmedLength(str16));
                                int i749 = (i748 & 1515) + (i748 | 1515);
                                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                                int i750 = ((packedPositionChild3 | 32) << 1) - (packedPositionChild3 ^ 32);
                                Object[] objArr183 = new Object[1];
                                bravo(resolveSize4, i749, i750, objArr183);
                                String[] strArr48 = {(String) objArr183[0], str11};
                                int i751 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int combineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 1546;
                                int i752 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                Object[] objArr184 = new Object[1];
                                bravo((char) ((34763 & i751) + (i751 | 34763)), combineMeasuredStates4, (i752 & 27) + (i752 | 27), objArr184);
                                String[] strArr49 = {(String) objArr184[0], str11};
                                Object[] objArr185 = new Object[1];
                                bravo((char) (38374 - Gravity.getAbsoluteGravity(0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1573, 31 - (~(-(-View.getDefaultSize(0, 0)))), objArr185);
                                String[][] strArr50 = {strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, strArr46, strArr47, strArr48, strArr49, new String[]{(String) objArr185[0], str11}};
                                char c43 = (char) ((-2) - ((-TextUtils.indexOf((CharSequence) str16, '0')) ^ (-1)));
                                int absoluteGravity = 1605 - Gravity.getAbsoluteGravity(0, 0);
                                int i753 = -ExpandableListView.getPackedPositionType(0L);
                                int i754 = (i753 & 1) + (i753 | 1);
                                Object[] objArr186 = new Object[1];
                                bravo(c43, absoluteGravity, i754, objArr186);
                                StringBuilder sb2 = new StringBuilder((String) objArr186[0]);
                                int i755 = i4;
                                int i756 = 0;
                                int i757 = 0;
                                while (i756 < 24) {
                                    int i758 = charlie + 57;
                                    delta = i758 % 128;
                                    if (i758 % 2 == 0) {
                                        strArr4 = strArr50[i756];
                                        Object[] objArr187 = {strArr4[0]};
                                        Object D887128 = uH18377.D8871(-957097391);
                                        if (D887128 == null) {
                                            int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                                            int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3158;
                                            char c44 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 58074);
                                            i37 = i756;
                                            byte b61 = (byte) 0;
                                            byte b62 = (byte) (b61 + 1);
                                            i38 = i755;
                                            strArr3 = strArr50;
                                            Object[] objArr188 = new Object[1];
                                            charlie(b61, (byte) (b62 - 1), b62, objArr188);
                                            D887128 = uH18377.setPivotYN16904(keyRepeatDelay4, scrollDefaultDelay3, c44, 424179844, false, (String) objArr188[0], new Class[]{String.class});
                                        } else {
                                            i37 = i756;
                                            i38 = i755;
                                            strArr3 = strArr50;
                                        }
                                        str4 = (String) ((Method) D887128).invoke(null, objArr187);
                                        strArr5 = (String[]) Arrays.copyOfRange(strArr4, 0, strArr4.length);
                                    } else {
                                        i37 = i756;
                                        i38 = i755;
                                        strArr3 = strArr50;
                                        strArr4 = strArr3[i37];
                                        Object[] objArr189 = {strArr4[0]};
                                        Object D887129 = uH18377.D8871(-957097391);
                                        if (D887129 == null) {
                                            int defaultSize3 = View.getDefaultSize(0, 0) + 52;
                                            int i759 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3157;
                                            char minimumFlingVelocity4 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58074);
                                            byte b63 = (byte) 0;
                                            byte b64 = (byte) (b63 + 1);
                                            Object[] objArr190 = new Object[1];
                                            charlie(b63, (byte) (b64 - 1), b64, objArr190);
                                            D887129 = uH18377.setPivotYN16904(defaultSize3, i759, minimumFlingVelocity4, 424179844, false, (String) objArr190[0], new Class[]{String.class});
                                        }
                                        str4 = (String) ((Method) D887129).invoke(null, objArr189);
                                        strArr5 = (String[]) Arrays.copyOfRange(strArr4, 1, strArr4.length);
                                    }
                                }
                                int i760 = i755;
                                Object[] objArr191 = new Object[1];
                                bravo((char) KeyEvent.normalizeMetaState(0), 1608 - TextUtils.indexOf((CharSequence) str16, '0', 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr191);
                                sb2.append((String) objArr191[0]);
                                Object[] objArr192 = new Object[2];
                                if (i757 > 2) {
                                    objArr192[1] = new int[1];
                                    String[] strArr51 = {sb2.toString()};
                                    ((int[]) objArr192[1])[0] = i760;
                                    objArr192[0] = strArr51;
                                } else {
                                    int[] iArr = new int[1];
                                    objArr192[1] = iArr;
                                    iArr[0] = i4;
                                    objArr192[0] = new String[0];
                                }
                                int i761 = ((int[]) objArr192[1])[0];
                                int i762 = (~(i4 & i707)) & (i4 | i707);
                                int i763 = (i762 | (-i762)) >> 31;
                                int i764 = i761 & (~i763);
                                int i765 = i707 & i763;
                                i35 = (i764 & i765) | (i764 ^ i765);
                                i36 = 0;
                                strArr2 = (String[]) objArr192[0];
                                char red22 = (char) (16871 - Color.red(i36));
                                int i3342 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                Object[] objArr832 = new Object[1];
                                bravo(red22, (i3342 ^ 891) + ((i3342 & 891) << 1), 16 - Drawable.resolveOpacity(0, 0), objArr832);
                                Object[] objArr842 = {(String) objArr832[0]};
                                D88714 = uH18377.D8871(-957097391);
                                if (D88714 == null) {
                                }
                                invoke = ((Method) D88714).invoke(null, objArr842);
                                if (invoke != null) {
                                }
                                if (i39 != 1986687685) {
                                    char offsetBefore32 = (char) (46343 - TextUtils.getOffsetBefore(str16, 0));
                                    int i3402 = 1609 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                                    int i3412 = -ExpandableListView.getPackedPositionGroup(0L);
                                    int i3422 = i3412 * (-51);
                                    int i3432 = (i3422 & 742) + (i3422 | 742);
                                    int i3442 = (i100 ^ i3412) | (i100 & i3412);
                                    int i3452 = -(-((~((i3442 & 14) | (i3442 ^ 14))) * 52));
                                    int i3462 = ((i3432 | i3452) << 1) - (i3452 ^ i3432);
                                    int i3472 = ~(((-15) & i100) | ((-15) ^ i100));
                                    int i3482 = ~(((-15) & i3412) | ((-15) ^ i3412));
                                    int i3492 = (i3472 & i3482) | (i3472 ^ i3482);
                                    int i3502 = ~i4;
                                    int i3512 = (i3492 | (~((i3502 ^ i3412) | (i3502 & i3412)))) * (-52);
                                    int i3522 = (i3462 ^ i3512) + ((i3512 & i3462) << 1);
                                    int i3532 = ~i3412;
                                    int i3542 = ~(i3532 | i3502);
                                    int i3552 = ~(i3532 | 14);
                                    int i3562 = (((i3552 & i3542) | (i3542 ^ i3552)) * 52) + i3522;
                                    Object[] objArr882 = new Object[1];
                                    bravo(offsetBefore32, i3402, i3562, objArr882);
                                    String str392 = (String) objArr882[0];
                                    int i3572 = -MotionEvent.axisFromString(str16);
                                    int i3582 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    Object[] objArr892 = new Object[1];
                                    bravo((char) ((i3572 & 54009) + (i3572 | 54009)), ((i3582 | 1624) << 1) - (i3582 ^ 1624), 25 - (~(-(-Drawable.resolveOpacity(0, 0)))), objArr892);
                                    String str402 = (String) objArr892[0];
                                    int i3592 = -(-TextUtils.indexOf(str16, str16, 0));
                                    Object[] objArr902 = new Object[1];
                                    bravo((char) (((i3592 | 64454) << 1) - (i3592 ^ 64454)), 1649 - (~Color.argb(0, 0, 0, 0)), TextUtils.indexOf((CharSequence) str16, '0', 0, 0) + 18, objArr902);
                                    String str412 = (String) objArr902[0];
                                    char c252 = (char) (60881 - (~(-(-Color.green(0)))));
                                    int i3602 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                    Object[] objArr912 = new Object[1];
                                    bravo(c252, ((i3602 | 1667) << 1) - (i3602 ^ 1667), 16 - TextUtils.lastIndexOf(str16, '0', 0, 0), objArr912);
                                    String str422 = (String) objArr912[0];
                                    char fadingEdgeLength32 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int i3612 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    Object[] objArr922 = new Object[1];
                                    bravo(fadingEdgeLength32, (i3612 & 1683) + (i3612 | 1683), 14 - (~Gravity.getAbsoluteGravity(0, 0)), objArr922);
                                    String str432 = (String) objArr922[0];
                                    Object[] objArr932 = new Object[1];
                                    bravo((char) View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1698, 36 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr932);
                                    String str442 = (String) objArr932[0];
                                    Object[] objArr942 = new Object[1];
                                    bravo((char) TextUtils.getOffsetBefore(str16, 0), TextUtils.lastIndexOf(str16, '0') + 1737, 11 - (~(-ExpandableListView.getPackedPositionGroup(0L))), objArr942);
                                    String str452 = (String) objArr942[0];
                                    char c262 = (char) (27691 - (~(-MotionEvent.axisFromString(str16))));
                                    int i3622 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    Object[] objArr952 = new Object[1];
                                    bravo(c262, (i3622 ^ 1748) + ((i3622 & 1748) << 1), 12 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr952);
                                    String str462 = (String) objArr952[0];
                                    char c272 = (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str16, '0', 0))));
                                    int i3632 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i3642 = ((i3632 | 1760) << 1) - (i3632 ^ 1760);
                                    int i3652 = -View.resolveSize(0, 0);
                                    int i3662 = ((i3652 | 22) << 1) - (i3652 ^ 22);
                                    Object[] objArr962 = new Object[1];
                                    bravo(c272, i3642, i3662, objArr962);
                                    String str472 = (String) objArr962[0];
                                    int i3672 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int lastIndexOf92 = TextUtils.lastIndexOf(str16, '0', 0, 0);
                                    Object[] objArr972 = new Object[1];
                                    bravo((char) (((i3672 | 59734) << 1) - (i3672 ^ 59734)), ((lastIndexOf92 | 1784) << 1) - (lastIndexOf92 ^ 1784), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, objArr972);
                                    String str482 = (String) objArr972[0];
                                    int i3682 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int indexOf82 = 1813 - TextUtils.indexOf((CharSequence) str16, '0', 0);
                                    int i3692 = -TextUtils.getCapsMode(str16, 0, 0);
                                    int i3702 = ((i3692 | 12) << 1) - (i3692 ^ 12);
                                    Object[] objArr982 = new Object[1];
                                    bravo((char) ((i3682 & 64270) + (i3682 | 64270)), indexOf82, i3702, objArr982);
                                    String str492 = (String) objArr982[0];
                                    Object[] objArr992 = new Object[1];
                                    bravo((char) (58430 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), 1824 - (~(-ImageFormat.getBitsPerPixel(0))), 11 - (~(-(-TextUtils.indexOf(str16, str16, 0)))), objArr992);
                                    String str502 = (String) objArr992[0];
                                    int defaultSize22 = View.getDefaultSize(0, 0);
                                    int i3712 = (defaultSize22 * ModuleDescriptor.MODULE_VERSION) - 7655842;
                                    int i3722 = ~defaultSize22;
                                    int i3732 = ~((i3722 ^ 55078) | (i3722 & 55078));
                                    int i3742 = ~defaultSize22;
                                    int i3752 = (i3742 & i4) | (i3742 ^ i4);
                                    int i3762 = ~i3752;
                                    int i3772 = -(-(((i3732 & i3762) | (i3732 ^ i3762)) * (-280)));
                                    int i3782 = ((i3712 | i3772) << 1) - (i3712 ^ i3772);
                                    int i3792 = ~i3752;
                                    int i3802 = ~(((-55079) ^ i4) | ((-55079) & i4));
                                    int i3812 = (((i3792 & i3802) | (i3792 ^ i3802)) * 140) + i3782;
                                    int i3822 = ~(((-55079) & i3722) | (i3722 ^ (-55079)) | i4);
                                    int i3832 = (i3722 & i3502) | (i3722 ^ i3502);
                                    int i3842 = (~((i3832 & 55078) | (i3832 ^ 55078))) | i3822;
                                    int i3852 = ~(defaultSize22 | ((-55079) ^ i100) | ((-55079) & i100));
                                    int i3862 = ((i3852 & i3842) | (i3842 ^ i3852)) * 140;
                                    char c282 = (char) (((i3812 | i3862) << 1) - (i3812 ^ i3862));
                                    int i3872 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1837;
                                    int threadPriority52 = Process.getThreadPriority(0);
                                    int i3882 = -(((threadPriority52 & 20) + (threadPriority52 | 20)) >> 6);
                                    int i3892 = (i3882 ^ 12) + ((i3882 & 12) << 1);
                                    Object[] objArr1002 = new Object[1];
                                    bravo(c282, i3872, i3892, objArr1002);
                                    String str512 = (String) objArr1002[0];
                                    char c292 = (char) (6569 - (~(ViewConfiguration.getEdgeSlop() >> 16)));
                                    int makeMeasureSpec42 = 1850 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i3902 = -Gravity.getAbsoluteGravity(0, 0);
                                    int i3912 = (i3902 ^ 12) + ((i3902 & 12) << 1);
                                    Object[] objArr1012 = new Object[1];
                                    bravo(c292, makeMeasureSpec42, i3912, objArr1012);
                                    String str522 = (String) objArr1012[0];
                                    char c302 = (char) (32203 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))));
                                    int i3922 = 1861 - (~(-View.getDefaultSize(0, 0)));
                                    int keyCodeFromString42 = KeyEvent.keyCodeFromString(str16);
                                    int i3932 = ((keyCodeFromString42 | 12) << 1) - (keyCodeFromString42 ^ 12);
                                    Object[] objArr1022 = new Object[1];
                                    bravo(c302, i3922, i3932, objArr1022);
                                    String str532 = (String) objArr1022[0];
                                    int indexOf92 = TextUtils.indexOf(str16, str16, 0);
                                    int i3942 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    Object[] objArr1032 = new Object[1];
                                    bravo((char) (((indexOf92 | 34686) << 1) - (indexOf92 ^ 34686)), ((i3942 | 1874) << 1) - (i3942 ^ 1874), 13 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr1032);
                                    String str542 = (String) objArr1032[0];
                                    char trimmedLength32 = (char) TextUtils.getTrimmedLength(str16);
                                    int fadingEdgeLength42 = 1888 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int i3952 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int vD14832N671532 = F2.vD14832N6715();
                                    int i3962 = (i3952 * HttpConstants.HTTP_SEE_OTHER) - 3311;
                                    int i3972 = ~i3952;
                                    int i3982 = ~vD14832N671532;
                                    int i3992 = (i3982 & i3972) | (i3972 ^ i3982);
                                    int i4002 = ~((i3992 & 11) | (i3992 ^ 11));
                                    int i4012 = i3952 | 11;
                                    int i4022 = ~((i4012 & vD14832N671532) | (i4012 ^ vD14832N671532));
                                    int i4032 = ((i4002 & i4022) | (i4002 ^ i4022)) * (-302);
                                    int i4042 = (i3962 & i4032) + (i3962 | i4032);
                                    int i4052 = (i3972 ^ 11) | (i3972 & 11);
                                    int i4062 = ((~((i4052 & vD14832N671532) | (i4052 ^ vD14832N671532))) * (-604)) + i4042;
                                    int i4072 = ~(i3952 | (-12));
                                    int i4082 = ~((vD14832N671532 & 11) | (vD14832N671532 ^ 11));
                                    int i4092 = (((i4072 & i4082) | (i4072 ^ i4082)) * HttpConstants.HTTP_MOVED_TEMP) + i4062;
                                    Object[] objArr1042 = new Object[1];
                                    bravo(trimmedLength32, fadingEdgeLength42, i4092, objArr1042);
                                    String str552 = (String) objArr1042[0];
                                    char c312 = (char) (63000 - (~(-(-TextUtils.indexOf((CharSequence) str16, '0', 0)))));
                                    int packedPositionGroup22 = ExpandableListView.getPackedPositionGroup(0L);
                                    int vD14832N671542 = F2.vD14832N6715();
                                    int i4102 = (packedPositionGroup22 * (-501)) + 955700;
                                    int i4112 = ~(((-1901) ^ vD14832N671542) | ((-1901) & vD14832N671542));
                                    int i4122 = ~((packedPositionGroup22 ^ 1900) | (packedPositionGroup22 & 1900));
                                    int i4132 = ((i4112 & i4122) | (i4112 ^ i4122)) * (-502);
                                    int i4142 = ((i4102 | i4132) << 1) - (i4102 ^ i4132);
                                    int i4152 = (~vD14832N671542) | (-1901);
                                    int i4162 = (~((i4152 & packedPositionGroup22) | (i4152 ^ packedPositionGroup22))) * (-502);
                                    int i4172 = ((i4142 | i4162) << 1) - (i4162 ^ i4142);
                                    int i4182 = ~((~packedPositionGroup22) | vD14832N671542);
                                    int i4192 = ((i4182 & (-1901)) | ((-1901) ^ i4182)) * HttpConstants.HTTP_BAD_GATEWAY;
                                    int i4202 = (i4172 ^ i4192) + ((i4192 & i4172) << 1);
                                    int i4212 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int i4222 = ((i4212 | 23) << 1) - (i4212 ^ 23);
                                    Object[] objArr1052 = new Object[1];
                                    bravo(c312, i4202, i4222, objArr1052);
                                    String str562 = (String) objArr1052[0];
                                    int i4232 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    int i4242 = -Color.rgb(0, 0, 0);
                                    int i4252 = (i4242 & (-16775292)) + (i4242 | (-16775292));
                                    int normalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                                    int i4262 = (normalizeMetaState3 ^ 28) + ((normalizeMetaState3 & 28) << 1);
                                    Object[] objArr1062 = new Object[1];
                                    bravo((char) ((i4232 & 43913) + (i4232 | 43913)), i4252, i4262, objArr1062);
                                    String[] strArr182 = {str392, str402, str412, str422, str432, str442, str452, str462, str472, str482, str492, str502, str512, str522, str532, str542, str552, str562, (String) objArr1062[0]};
                                    i47 = 0;
                                    while (i47 < 19) {
                                    }
                                    i48 = -1;
                                    int i4512 = (i48 + 130) ^ i4;
                                    int i4522 = ~i48;
                                    int i4532 = -i4522;
                                    int i4542 = ((i4522 & i4532) | (i4522 ^ i4532)) >> 31;
                                    int i4552 = (~i4542) & i4;
                                    int i4562 = i4512 & i4542;
                                    int i4572 = (i4562 & i4552) | (i4552 ^ i4562);
                                    int i4582 = ((~i35) & i4) | (i35 & i100);
                                    int i4592 = -i4582;
                                    int i4602 = ((i4582 & i4592) | (i4582 ^ i4592)) >> 31;
                                    i35 = (i35 & i4602) | (i4572 & (~i4602));
                                }
                                char indexOf102 = (char) TextUtils.indexOf(str16, str16);
                                int capsMode32 = 1952 - TextUtils.getCapsMode(str16, 0, 0);
                                int i4612 = -AndroidCharacter.getMirror('0');
                                int i4622 = (i4612 ^ 61) + ((i4612 & 61) << 1);
                                Object[] objArr1132 = new Object[1];
                                bravo(indexOf102, capsMode32, i4622, objArr1132);
                                String str592 = (String) objArr1132[0];
                                char gidForName3 = (char) (Process.getGidForName(str16) + 1);
                                int i4632 = 1964 - (~(ViewConfiguration.getTouchSlop() >> 8));
                                int i4642 = -ExpandableListView.getPackedPositionGroup(0L);
                                int i4652 = ((i4642 | 5) << 1) - (i4642 ^ 5);
                                Object[] objArr1142 = new Object[1];
                                bravo(gidForName3, i4632, i4652, objArr1142);
                                String[] strArr192 = {str592, (String) objArr1142[0]};
                                char c322 = (char) (3080 - (~(-(-ExpandableListView.getPackedPositionType(0L)))));
                                int i4662 = -Gravity.getAbsoluteGravity(0, 0);
                                int i4672 = (i4662 & 1970) + (i4662 | 1970);
                                int i4682 = -(ViewConfiguration.getTouchSlop() >> 8);
                                int i4692 = (i4682 ^ 15) + ((i4682 & 15) << 1);
                                Object[] objArr1152 = new Object[1];
                                bravo(c322, i4672, i4692, objArr1152);
                                String str602 = (String) objArr1152[0];
                                int indexOf112 = TextUtils.indexOf((CharSequence) str16, '0', 0);
                                Object[] objArr1162 = new Object[1];
                                bravo((char) ((indexOf112 & 1) + (indexOf112 | 1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1986, 18 - (~(-(-View.resolveSize(0, 0)))), objArr1162);
                                String str612 = (String) objArr1162[0];
                                char scrollBarFadeDuration62 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int i4702 = -(ViewConfiguration.getTapTimeout() >> 16);
                                int i4712 = ~i4702;
                                int i4722 = ~((i4712 & 2004) | (i4712 ^ 2004));
                                int i4732 = ((-2005) ^ i4702) | ((-2005) & i4702);
                                int i4742 = (i4732 ^ i4) | (i4732 & i4);
                                int i4752 = ~i4742;
                                int i4762 = (((i4702 * 477) - 951900) - (~(((i4722 ^ i4752) | (i4722 & i4752)) * (-476)))) - 1;
                                int i4772 = -(-((~i4742) * 952));
                                Object[] objArr1172 = new Object[1];
                                bravo(scrollBarFadeDuration62, ((~(i4702 | (-2005) | (~i4))) * 476) + (i4762 ^ i4772) + ((i4762 & i4772) << 1), 12 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr1172);
                                String[] strArr202 = {str602, str612, (String) objArr1172[0]};
                                int i4782 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i4792 = -TextUtils.indexOf((CharSequence) str16, '0', 0);
                                int i4802 = (i4792 & 20) + (i4792 | 20);
                                Object[] objArr1182 = new Object[1];
                                bravo((char) ((-TextUtils.indexOf((CharSequence) str16, '0')) - 1), ((i4782 | 2019) << 1) - (i4782 ^ 2019), i4802, objArr1182);
                                String str622 = (String) objArr1182[0];
                                char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i4812 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i4822 = -(-Color.argb(0, 0, 0, 0));
                                int i4832 = ((i4822 | 10) << 1) - (i4822 ^ 10);
                                Object[] objArr1192 = new Object[1];
                                bravo(maximumFlingVelocity3, (i4812 & 2039) + (i4812 | 2039), i4832, objArr1192);
                                String[] strArr212 = {str622, (String) objArr1192[0]};
                                char bitsPerPixel32 = (char) (ImageFormat.getBitsPerPixel(0) + 11297);
                                int scrollBarSize32 = (ViewConfiguration.getScrollBarSize() >> 8) + 2049;
                                int i4842 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int i4852 = ((i4842 | 11) << 1) - (i4842 ^ 11);
                                Object[] objArr1202 = new Object[1];
                                bravo(bitsPerPixel32, scrollBarSize32, i4852, objArr1202);
                                String str632 = (String) objArr1202[0];
                                int i4862 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                Object[] objArr1212 = new Object[1];
                                bravo((char) (((i4862 | 53356) << 1) - (i4862 ^ 53356)), 589 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6 - (~MotionEvent.axisFromString(str16)), objArr1212);
                                String[] strArr222 = {str632, (String) objArr1212[0]};
                                int i4872 = -ExpandableListView.getPackedPositionType(0L);
                                int vD14832N671562 = F2.vD14832N6715();
                                int i4882 = i4872 * (-300);
                                int i4892 = (i4882 & 3619470) + (i4882 | 3619470);
                                int i4902 = -(-((~((i4872 ^ 11985) | (i4872 & 11985) | vD14832N671562)) * (-301)));
                                int i4912 = (i4892 & i4902) + (i4902 | i4892);
                                int i4922 = ~(((-11986) ^ vD14832N671562) | ((-11986) & vD14832N671562));
                                int i4932 = ~vD14832N671562;
                                int i4942 = (((~((i4932 ^ i4872) | (i4932 & i4872))) | i4922) * (-301)) + i4912;
                                int i4952 = ~((~i4872) | vD14832N671562);
                                char c332 = (char) (((((-11986) & i4952) | ((-11986) ^ i4952)) * 301) + i4942);
                                int i4962 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i4972 = (i4962 & 2060) + (i4962 | 2060);
                                int i4982 = -(-(Process.myTid() >> 22));
                                int i4992 = ((i4982 | 28) << 1) - (i4982 ^ 28);
                                Object[] objArr1222 = new Object[1];
                                bravo(c332, i4972, i4992, objArr1222);
                                String str642 = (String) objArr1222[0];
                                int i5002 = i35;
                                c10 = 0;
                                i40 = 1;
                                Object[] objArr1232 = new Object[1];
                                bravo((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode(str16, 0, 0) + 2039, 9 - (~TextUtils.getTrimmedLength(str16)), objArr1232);
                                String[] strArr232 = {str642, (String) objArr1232[0]};
                                i41 = 5;
                                String[][] strArr242 = {strArr192, strArr202, strArr212, strArr222, strArr232};
                                i42 = 0;
                                int i5012 = -1;
                                loop7: while (true) {
                                    if (i42 < i41) {
                                    }
                                    int i5082 = i42;
                                    int i5092 = (i5082 ^ (-44)) + ((i5082 & (-44)) << 1);
                                    i42 = ((i5092 & 45) << 1) + (i5092 ^ 45);
                                    i40 = 1;
                                    i41 = 5;
                                    c10 = 0;
                                }
                                int i5102 = (~(i4 & i5002)) & (i4 | i5002);
                                int i5112 = (i5102 | (-i5102)) >> 31;
                                int i5122 = (i43 & (~i5112)) | (i5002 & i5112);
                                char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int i5132 = 2086 - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int i5142 = -(-Color.rgb(0, 0, 0));
                                int i5152 = (i5142 ^ 16777229) + ((i5142 & 16777229) << 1);
                                Object[] objArr1252 = new Object[1];
                                bravo(scrollDefaultDelay4, i5132, i5152, objArr1252);
                                String str672 = (String) objArr1252[0];
                                char c342 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i5162 = -TextUtils.indexOf((CharSequence) str16, '0');
                                int i5172 = (i5162 ^ 2100) + ((i5162 & 2100) << 1);
                                int i5182 = -(ViewConfiguration.getTapTimeout() >> 16);
                                int i5192 = (i5182 ^ 8) + ((i5182 & 8) << 1);
                                Object[] objArr1262 = new Object[1];
                                bravo(c342, i5172, i5192, objArr1262);
                                str5 = (String) objArr1262[0];
                                file2 = new File(str672);
                                if (file2.exists()) {
                                    Scanner scanner42 = new Scanner(new FileInputStream(file2));
                                    char alpha52 = (char) Color.alpha(0);
                                    int i5202 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    Object[] objArr1272 = new Object[1];
                                    bravo(alpha52, ((i5202 | 369) << 1) - (i5202 ^ 369), 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr1272);
                                    Scanner useDelimiter42 = scanner42.useDelimiter((String) objArr1272[0]);
                                    if (useDelimiter42.hasNext()) {
                                    }
                                    useDelimiter42.close();
                                    if (next.contains(str5)) {
                                    }
                                }
                                i44 = i4;
                                int i52122 = ((~i5122) & i4) | (i5122 & i100);
                                int i52222 = -i52122;
                                int i52322 = ((i52122 & i52222) | (i52122 ^ i52222)) >> 31;
                                int i52422 = i44 & (~i52322);
                                int i52522 = i5122 & i52322;
                                int i52622 = (i52522 & i52422) | (i52422 ^ i52522);
                                int i52722 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i52822 = -Gravity.getAbsoluteGravity(0, 0);
                                int i52922 = ((i52822 | 2109) << 1) - (i52822 ^ 2109);
                                int blue22 = Color.blue(0);
                                int i53022 = (blue22 & 47) + (blue22 | 47);
                                Object[] objArr12822 = new Object[1];
                                bravo((char) (((i52722 | 50476) << 1) - (i52722 ^ 50476)), i52922, i53022, objArr12822);
                                Object[] objArr12922 = {(String) objArr12822[0]};
                                D88715 = uH18377.D8871(1979478258);
                                if (D88715 == null) {
                                }
                                long longValue2022 = ((Long) ((Method) D88715).invoke(null, objArr12922)).longValue();
                                long j14622 = 50746670;
                                long j14722 = ((-657) * longValue2022) + (659 * j14622);
                                long j14822 = ((j14622 ^ j38) | longValue2022) ^ j38;
                                long j14922 = ((longValue2022 ^ j38) | j14622) ^ j38;
                                long j15022 = (j14622 | j103) ^ j38;
                                long j15122 = ((-658) * (j14822 | j14922 | j15022)) + j14722;
                                long j15222 = 658;
                                long j15322 = (j15222 * (j14922 | j15022)) + (j15222 * j14922) + j15122 + 724074636;
                                int i53222 = ((int) (j15322 >> c3)) & ((((-315500733) | (~((-1121725679) | i4)) | (~(i100 | 1121725678))) * 45) + (((~((-315500733) | i4)) | (-1390292223)) * (-45)) + (((~((-315500733) | i100)) | 1121725678) * (-90)) + 1687905420);
                                int uptimeMillis422 = (int) SystemClock.uptimeMillis();
                                int i53322 = ~uptimeMillis422;
                                int i53422 = ~((-1500951405) | i53322);
                                int i53522 = ((int) j15322) & ((((-63724995) | i53422) * 712) + (((~(uptimeMillis422 | (-1479713325))) | (~(i53322 | (-21238081)))) * (-712)) + ((21238080 | i53422) * (-712)) + 215840013);
                                int i53622 = ((i53222 & i53522) | (i53222 ^ i53522)) * 263;
                                int i53722 = (i53622 | i4) & (~(i4 & i53622));
                                int i53822 = (~(i4 & i52622)) & (i4 | i52622);
                                int i53922 = -i53822;
                                int i54022 = ((i53822 & i53922) | (i53822 ^ i53922)) >> 31;
                                int i54122 = i53722 & (~i54022);
                                int i54222 = i52622 & i54022;
                                i32 = (i54222 & i54122) | (i54122 ^ i54222);
                                strArr = strArr2;
                            } else {
                                strArr = null;
                                i32 = i306;
                            }
                            int i766 = (~(i4 & i32)) & (i4 | i32);
                            int i767 = -i766;
                            Object[] objArr193 = {new int[]{i32}, new int[]{i4}, new int[1], strArr};
                            int foxtrot3 = A0.z.foxtrot((~(114810041 | i100)) | (-165508066), 381, ((i4 | (-151528257)) * (-381)) - 499182226, 1897690688);
                            int i768 = -(-((((i766 & i767) | (i766 ^ i767)) >> 31) & 16));
                            int i769 = (foxtrot3 & i768) + (foxtrot3 | i768);
                            int vD14832N671510 = F2.vD14832N6715();
                            int i770 = i769 * 905;
                            int i771 = i10 * (-903);
                            int i772 = (i770 & i771) + (i770 | i771);
                            int i773 = ~i769;
                            int i774 = ~(i773 | vD14832N671510);
                            int i775 = ~vD14832N671510;
                            int i776 = ~((i775 ^ i10) | (i775 & i10));
                            int i777 = (i772 - (~(-(-(((i774 & i776) | (i774 ^ i776)) * (-1808)))))) - 1;
                            int i778 = ~i10;
                            int i779 = (i778 & i773) | (i773 ^ i778);
                            int i780 = (i775 ^ i769) | (i775 & i769);
                            int i781 = -(-(((~((i779 & vD14832N671510) | (i779 ^ vD14832N671510))) | (~((i780 & i10) | (i780 ^ i10)))) * 904));
                            int i782 = (i777 & i781) + (i781 | i777);
                            int i783 = ~((i773 & i10) | (i773 ^ i10));
                            int i784 = ~i10;
                            int i785 = ~((vD14832N671510 & i784) | (i784 ^ vD14832N671510));
                            int i786 = (i785 & i783) | (i783 ^ i785);
                            int i787 = ~(i775 | i769);
                            int i788 = -(-(((i786 & i787) | (i786 ^ i787)) * 904));
                            int i789 = (i782 ^ i788) + ((i788 & i782) << 1);
                            int i790 = (i789 << 13) ^ i789;
                            int i791 = i790 >>> 17;
                            int i792 = (i790 | i791) & (~(i790 & i791));
                            ((int[]) objArr193[2])[0] = i792 ^ (i792 << 5);
                            return objArr193;
                        }
                    }
                    i21 = i4;
                    int i2102 = (~(i4 & i198)) & (i4 | i198);
                    int i2112 = (i2102 | (-i2102)) >> 31;
                    int i2122 = (i198 & i2112) | (i21 & (~i2112));
                    char jumpTapTimeout4 = (char) (3471 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i2132 = -TextUtils.indexOf(str16, str16, 0);
                    int i2142 = (i2132 & 372) + (i2132 | 372);
                    int i2152 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i2162 = ((i2152 | 23) << 1) - (i2152 ^ 23);
                    Object[] objArr452 = new Object[1];
                    bravo(jumpTapTimeout4, i2142, i2162, objArr452);
                    Object[] objArr462 = {(String) objArr452[0]};
                    D8871 = uH18377.D8871(-957097391);
                    if (D8871 == null) {
                    }
                    String lowerCase2 = ((String) ((Method) D8871).invoke(null, objArr462)).toLowerCase();
                    int i2172 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i2182 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr482 = new Object[1];
                    bravo((char) (((i2172 | 29234) << 1) - (i2172 ^ 29234)), (i2182 & 396) + (i2182 | 396), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr482);
                    if (lowerCase2.contains((String) objArr482[0])) {
                    }
                    int i2202 = ((~i2122) & i4) | (i2122 & i100);
                    int i2212 = -i2202;
                    int i2222 = ((i2202 & i2212) | (i2202 ^ i2212)) >> 31;
                    int i2232 = (i2122 & i2222) | (i219 & (~i2222));
                    char scrollBarFadeDuration22 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i2242 = -TextUtils.getCapsMode(str16, 0, 0);
                    Object[] objArr492 = new Object[1];
                    bravo(scrollBarFadeDuration22, (i2242 ^ 399) + ((i2242 & 399) << 1), 41 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), objArr492);
                    String str272 = (String) objArr492[0];
                    Object[] objArr502 = new Object[1];
                    bravo((char) (31500 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 441, 39 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr502);
                    String str282 = (String) objArr502[0];
                    Object[] objArr512 = new Object[1];
                    bravo((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 480 - (~(Process.myTid() >> 22)), 27 - (~TextUtils.indexOf((CharSequence) str16, '0', 0)), objArr512);
                    String str292 = (String) objArr512[0];
                    char c172 = (char) (60934 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))));
                    int resolveOpacity5 = Drawable.resolveOpacity(0, 0);
                    int i2252 = ((resolveOpacity5 | 508) << 1) - (resolveOpacity5 ^ 508);
                    int i2262 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i2272 = (i2262 & 26) + (i2262 | 26);
                    Object[] objArr522 = new Object[1];
                    bravo(c172, i2252, i2272, objArr522);
                    String str302 = (String) objArr522[0];
                    char green2 = (char) Color.green(0);
                    int i2282 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int i2292 = (i2282 ^ 535) + ((i2282 & 535) << 1);
                    int i2302 = -(-TextUtils.indexOf(str16, str16, 0));
                    Object[] objArr532 = new Object[1];
                    bravo(green2, i2292, (i2302 ^ 27) + ((i2302 & 27) << 1), objArr532);
                    String str312 = (String) objArr532[0];
                    char c182 = (char) (19776 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int i2312 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i2322 = (i2312 & 563) + (i2312 | 563);
                    int i2332 = -MotionEvent.axisFromString(str16);
                    int i2342 = (i2332 & 26) + (i2332 | 26);
                    i22 = 1;
                    Object[] objArr542 = new Object[1];
                    bravo(c182, i2322, i2342, objArr542);
                    c4 = 0;
                    String[] strArr142 = {str272, str282, str292, str302, str312, (String) objArr542[0]};
                    i23 = i12;
                    i24 = 0;
                    while (true) {
                        if (i24 >= i23) {
                        }
                        i24++;
                        i22 = 1;
                        i23 = 6;
                        c4 = 0;
                    }
                    int i2372 = (~(i4 & i2232)) & (i4 | i2232);
                    int i2382 = -i2372;
                    int i2392 = ((i2372 & i2382) | (i2372 ^ i2382)) >> 31;
                    int i2402 = i25 & (~i2392);
                    int i2412 = i2232 & i2392;
                    int i2422 = (i2402 & i2412) | (i2402 ^ i2412);
                    char scrollBarFadeDuration32 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i2432 = 346 - (~(-View.MeasureSpec.getMode(0)));
                    int i2442 = -(-Color.blue(0));
                    int i2452 = ((i2442 | 17) << 1) - (i2442 ^ 17);
                    Object[] objArr572 = new Object[1];
                    bravo(scrollBarFadeDuration32, i2432, i2452, objArr572);
                    String str332 = (String) objArr572[0];
                    int indexOf32 = TextUtils.indexOf((CharSequence) str16, '0', 0);
                    int defaultSize4 = 589 - View.getDefaultSize(0, 0);
                    int i2462 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i2472 = (i2462 & 6) + (i2462 | 6);
                    Object[] objArr582 = new Object[1];
                    bravo((char) ((indexOf32 & 53358) + (indexOf32 | 53358)), defaultSize4, i2472, objArr582);
                    Object[] objArr592 = {str332, (String) objArr582[0]};
                    D88712 = uH18377.D8871(1214576837);
                    if (D88712 == null) {
                    }
                    long longValue92 = ((Long) ((Method) D88712).invoke(null, objArr592)).longValue();
                    long j732 = -130861913;
                    long j742 = -159;
                    long j752 = (j742 * longValue92) + (j742 * j732);
                    long j762 = 160;
                    long maxMemory52 = ((int) Runtime.getRuntime().maxMemory()) ^ j38;
                    long j772 = ((j762 * ((((longValue92 ^ j38) | maxMemory52) ^ j38) | j732)) + (((-160) * (((maxMemory52 | j732) ^ j38) | ((j732 | longValue92) ^ j38))) + (((longValue92 | (j732 ^ j38)) * j762) + j752))) - 1416776425;
                    i26 = ((int) (j772 >> c3)) & ((((~((-1010194192) | i100)) | (-1378419787)) * 184) + (((-270533643) | i100) * 184) + 1663396938);
                    i27 = ((int) j772) & ((((~((-1313263472) | i100)) | (-1332203392)) * 420) + (((~((-1313263472) | i4)) * 420) - 2072394183));
                    if (((i26 & i27) | (i26 ^ i27)) != 0) {
                    }
                    int i2572 = (~(i4 & i2422)) & (i4 | i2422);
                    int i2582 = -i2572;
                    int i2592 = ((i2572 & i2582) | (i2572 ^ i2582)) >> 31;
                    int i2602 = i28 & (~i2592);
                    int i2612 = i2592 & i2422;
                    int i2622 = (i2602 & i2612) | (i2602 ^ i2612);
                    if ((i5 & 8) == 0) {
                    }
                    char c202 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i2832 = 738 - (~(-View.resolveSize(0, 0)));
                    int i2842 = -TextUtils.lastIndexOf(str16, '0', 0, 0);
                    int i2852 = (i2842 & 40) + (i2842 | 40);
                    Object[] objArr692 = new Object[1];
                    bravo(c202, i2832, i2852, objArr692);
                    String str382 = (String) objArr692[0];
                    char c212 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i2862 = -(-(Process.myPid() >> 22));
                    int lastIndexOf72 = TextUtils.lastIndexOf(str16, '0', 0);
                    int i2872 = ((lastIndexOf72 | 31) << 1) - (lastIndexOf72 ^ 31);
                    Object[] objArr702 = new Object[1];
                    bravo(c212, ((i2862 | 780) << 1) - (i2862 ^ 780), i2872, objArr702);
                    String[] strArr172 = {str382, (String) objArr702[0]};
                    i29 = 0;
                    while (i29 < 2) {
                    }
                    i30 = i4;
                    int i3032 = ((~i2622) & i4) | (i2622 & i100);
                    int i3042 = -i3032;
                    int i3052 = ((i3032 & i3042) | (i3032 ^ i3042)) >> 31;
                    int i3062 = (i2622 & i3052) | (i30 & (~i3052));
                    D88713 = uH18377.D8871(-344556366);
                    if (D88713 == null) {
                    }
                    long longValue132 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
                    long j992 = 807654152;
                    long j1002 = 69;
                    long j1012 = j992 ^ j38;
                    long j1022 = longValue132 ^ j38;
                    long j1032 = i4;
                    long j1042 = ((j1002 * ((j1022 | j992) ^ j38)) + (((-69) * ((((j1012 | longValue132) ^ j38) | ((j1012 | j1032) ^ j38)) | ((longValue132 | j1032) ^ j38))) + ((((((j1012 | j1022) | j1032) ^ j38) | (((j992 | longValue132) | j1032) ^ j38)) * j1002) + (((-68) * longValue132) + (70 * j992))))) - 959907250;
                    int i3072 = ~Process.myPid();
                    foxtrot2 = ((int) (j1042 >> c3)) & A0.z.foxtrot((~(1756836279 | i3072)) | (-1774156224) | (~(1100904605 | i3072)), 184, (((~(i3072 | (-673251619))) | (~((-17319945) | i3072))) * (-184)) - 1019427974, -1811082192);
                    int i3082 = ~ao.ad.tango(869906954);
                    i31 = ((int) j1042) & ((((~(i3082 | (-157006579))) | (-1159012422)) * 184) + (((-17899585) | i3082) * 184) + 1367661917);
                    if (((foxtrot2 & i31) | (foxtrot2 ^ i31)) != 1) {
                    }
                    int i7662 = (~(i4 & i32)) & (i4 | i32);
                    int i7672 = -i7662;
                    Object[] objArr1932 = {new int[]{i32}, new int[]{i4}, new int[1], strArr};
                    int foxtrot32 = A0.z.foxtrot((~(114810041 | i100)) | (-165508066), 381, ((i4 | (-151528257)) * (-381)) - 499182226, 1897690688);
                    int i7682 = -(-((((i7662 & i7672) | (i7662 ^ i7672)) >> 31) & 16));
                    int i7692 = (foxtrot32 & i7682) + (foxtrot32 | i7682);
                    int vD14832N6715102 = F2.vD14832N6715();
                    int i7702 = i7692 * 905;
                    int i7712 = i10 * (-903);
                    int i7722 = (i7702 & i7712) + (i7702 | i7712);
                    int i7732 = ~i7692;
                    int i7742 = ~(i7732 | vD14832N6715102);
                    int i7752 = ~vD14832N6715102;
                    int i7762 = ~((i7752 ^ i10) | (i7752 & i10));
                    int i7772 = (i7722 - (~(-(-(((i7742 & i7762) | (i7742 ^ i7762)) * (-1808)))))) - 1;
                    int i7782 = ~i10;
                    int i7792 = (i7782 & i7732) | (i7732 ^ i7782);
                    int i7802 = (i7752 ^ i7692) | (i7752 & i7692);
                    int i7812 = -(-(((~((i7792 & vD14832N6715102) | (i7792 ^ vD14832N6715102))) | (~((i7802 & i10) | (i7802 ^ i10)))) * 904));
                    int i7822 = (i7772 & i7812) + (i7812 | i7772);
                    int i7832 = ~((i7732 & i10) | (i7732 ^ i10));
                    int i7842 = ~i10;
                    int i7852 = ~((vD14832N6715102 & i7842) | (i7842 ^ vD14832N6715102));
                    int i7862 = (i7852 & i7832) | (i7832 ^ i7852);
                    int i7872 = ~(i7752 | i7692);
                    int i7882 = -(-(((i7862 & i7872) | (i7862 ^ i7872)) * 904));
                    int i7892 = (i7822 ^ i7882) + ((i7882 & i7822) << 1);
                    int i7902 = (i7892 << 13) ^ i7892;
                    int i7912 = i7902 >>> 17;
                    int i7922 = (i7902 | i7912) & (~(i7902 & i7912));
                    ((int[]) objArr1932[2])[0] = i7922 ^ (i7922 << 5);
                    return objArr1932;
                }
            }
            i20 = i4;
            int i1942 = i4 ^ i189;
            int i1952 = (i1942 | (-i1942)) >> 31;
            int i1962 = i20 & (~i1952);
            int i1972 = i189 & i1952;
            int i1982 = (i1972 & i1962) | (i1962 ^ i1972);
            char lastIndexOf52 = (char) (TextUtils.lastIndexOf(str16, '0', 0) + 1);
            int i1992 = -(-(Process.myTid() >> 22));
            int i2002 = (i1992 & 347) + (i1992 | 347);
            int i2012 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i2022 = (i2012 ^ 16) + ((i2012 & 16) << 1);
            Object[] objArr422 = new Object[1];
            bravo(lastIndexOf52, i2002, i2022, objArr422);
            String str262 = (String) objArr422[0];
            int i2032 = -(-TextUtils.getOffsetAfter(str16, 0));
            int i2042 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int i2052 = ((i2042 | 363) << 1) - (i2042 ^ 363);
            int i2062 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i2072 = ((i2062 | 6) << 1) - (i2062 ^ 6);
            Object[] objArr432 = new Object[1];
            bravo((char) ((i2032 ^ 30960) + ((i2032 & 30960) << 1)), i2052, i2072, objArr432);
            str2 = (String) objArr432[0];
            file = new File(str262);
            if (file.exists()) {
                Scanner scanner5 = new Scanner(new FileInputStream(file));
                Object[] objArr442 = new Object[1];
                bravo((char) View.MeasureSpec.makeMeasureSpec(0, 0), 370 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr442);
                useDelimiter = scanner5.useDelimiter((String) objArr442[0]);
                if (useDelimiter.hasNext()) {
                }
                useDelimiter.close();
                if (next2.contains(str2)) {
                }
            }
            i21 = i4;
            int i21022 = (~(i4 & i1982)) & (i4 | i1982);
            int i21122 = (i21022 | (-i21022)) >> 31;
            int i21222 = (i1982 & i21122) | (i21 & (~i21122));
            char jumpTapTimeout42 = (char) (3471 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int i21322 = -TextUtils.indexOf(str16, str16, 0);
            int i21422 = (i21322 & 372) + (i21322 | 372);
            int i21522 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i21622 = ((i21522 | 23) << 1) - (i21522 ^ 23);
            Object[] objArr4522 = new Object[1];
            bravo(jumpTapTimeout42, i21422, i21622, objArr4522);
            Object[] objArr4622 = {(String) objArr4522[0]};
            D8871 = uH18377.D8871(-957097391);
            if (D8871 == null) {
            }
            String lowerCase22 = ((String) ((Method) D8871).invoke(null, objArr4622)).toLowerCase();
            int i21722 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i21822 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr4822 = new Object[1];
            bravo((char) (((i21722 | 29234) << 1) - (i21722 ^ 29234)), (i21822 & 396) + (i21822 | 396), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr4822);
            if (lowerCase22.contains((String) objArr4822[0])) {
            }
            int i22022 = ((~i21222) & i4) | (i21222 & i100);
            int i22122 = -i22022;
            int i22222 = ((i22022 & i22122) | (i22022 ^ i22122)) >> 31;
            int i22322 = (i21222 & i22222) | (i219 & (~i22222));
            char scrollBarFadeDuration222 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i22422 = -TextUtils.getCapsMode(str16, 0, 0);
            Object[] objArr4922 = new Object[1];
            bravo(scrollBarFadeDuration222, (i22422 ^ 399) + ((i22422 & 399) << 1), 41 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), objArr4922);
            String str2722 = (String) objArr4922[0];
            Object[] objArr5022 = new Object[1];
            bravo((char) (31500 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 441, 39 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), objArr5022);
            String str2822 = (String) objArr5022[0];
            Object[] objArr5122 = new Object[1];
            bravo((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 480 - (~(Process.myTid() >> 22)), 27 - (~TextUtils.indexOf((CharSequence) str16, '0', 0)), objArr5122);
            String str2922 = (String) objArr5122[0];
            char c1722 = (char) (60934 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16)))));
            int resolveOpacity52 = Drawable.resolveOpacity(0, 0);
            int i22522 = ((resolveOpacity52 | 508) << 1) - (resolveOpacity52 ^ 508);
            int i22622 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i22722 = (i22622 & 26) + (i22622 | 26);
            Object[] objArr5222 = new Object[1];
            bravo(c1722, i22522, i22722, objArr5222);
            String str3022 = (String) objArr5222[0];
            char green22 = (char) Color.green(0);
            int i22822 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i22922 = (i22822 ^ 535) + ((i22822 & 535) << 1);
            int i23022 = -(-TextUtils.indexOf(str16, str16, 0));
            Object[] objArr5322 = new Object[1];
            bravo(green22, i22922, (i23022 ^ 27) + ((i23022 & 27) << 1), objArr5322);
            String str3122 = (String) objArr5322[0];
            char c1822 = (char) (19776 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i23122 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i23222 = (i23122 & 563) + (i23122 | 563);
            int i23322 = -MotionEvent.axisFromString(str16);
            int i23422 = (i23322 & 26) + (i23322 | 26);
            i22 = 1;
            Object[] objArr5422 = new Object[1];
            bravo(c1822, i23222, i23422, objArr5422);
            c4 = 0;
            String[] strArr1422 = {str2722, str2822, str2922, str3022, str3122, (String) objArr5422[0]};
            i23 = i12;
            i24 = 0;
            while (true) {
                if (i24 >= i23) {
                }
                i24++;
                i22 = 1;
                i23 = 6;
                c4 = 0;
            }
            int i23722 = (~(i4 & i22322)) & (i4 | i22322);
            int i23822 = -i23722;
            int i23922 = ((i23722 & i23822) | (i23722 ^ i23822)) >> 31;
            int i24022 = i25 & (~i23922);
            int i24122 = i22322 & i23922;
            int i24222 = (i24022 & i24122) | (i24022 ^ i24122);
            char scrollBarFadeDuration322 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i24322 = 346 - (~(-View.MeasureSpec.getMode(0)));
            int i24422 = -(-Color.blue(0));
            int i24522 = ((i24422 | 17) << 1) - (i24422 ^ 17);
            Object[] objArr5722 = new Object[1];
            bravo(scrollBarFadeDuration322, i24322, i24522, objArr5722);
            String str3322 = (String) objArr5722[0];
            int indexOf322 = TextUtils.indexOf((CharSequence) str16, '0', 0);
            int defaultSize42 = 589 - View.getDefaultSize(0, 0);
            int i24622 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i24722 = (i24622 & 6) + (i24622 | 6);
            Object[] objArr5822 = new Object[1];
            bravo((char) ((indexOf322 & 53358) + (indexOf322 | 53358)), defaultSize42, i24722, objArr5822);
            Object[] objArr5922 = {str3322, (String) objArr5822[0]};
            D88712 = uH18377.D8871(1214576837);
            if (D88712 == null) {
            }
            long longValue922 = ((Long) ((Method) D88712).invoke(null, objArr5922)).longValue();
            long j7322 = -130861913;
            long j7422 = -159;
            long j7522 = (j7422 * longValue922) + (j7422 * j7322);
            long j7622 = 160;
            long maxMemory522 = ((int) Runtime.getRuntime().maxMemory()) ^ j38;
            long j7722 = ((j7622 * ((((longValue922 ^ j38) | maxMemory522) ^ j38) | j7322)) + (((-160) * (((maxMemory522 | j7322) ^ j38) | ((j7322 | longValue922) ^ j38))) + (((longValue922 | (j7322 ^ j38)) * j7622) + j7522))) - 1416776425;
            i26 = ((int) (j7722 >> c3)) & ((((~((-1010194192) | i100)) | (-1378419787)) * 184) + (((-270533643) | i100) * 184) + 1663396938);
            i27 = ((int) j7722) & ((((~((-1313263472) | i100)) | (-1332203392)) * 420) + (((~((-1313263472) | i4)) * 420) - 2072394183));
            if (((i26 & i27) | (i26 ^ i27)) != 0) {
            }
            int i25722 = (~(i4 & i24222)) & (i4 | i24222);
            int i25822 = -i25722;
            int i25922 = ((i25722 & i25822) | (i25722 ^ i25822)) >> 31;
            int i26022 = i28 & (~i25922);
            int i26122 = i25922 & i24222;
            int i26222 = (i26022 & i26122) | (i26022 ^ i26122);
            if ((i5 & 8) == 0) {
            }
            char c2022 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i28322 = 738 - (~(-View.resolveSize(0, 0)));
            int i28422 = -TextUtils.lastIndexOf(str16, '0', 0, 0);
            int i28522 = (i28422 & 40) + (i28422 | 40);
            Object[] objArr6922 = new Object[1];
            bravo(c2022, i28322, i28522, objArr6922);
            String str3822 = (String) objArr6922[0];
            char c2122 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i28622 = -(-(Process.myPid() >> 22));
            int lastIndexOf722 = TextUtils.lastIndexOf(str16, '0', 0);
            int i28722 = ((lastIndexOf722 | 31) << 1) - (lastIndexOf722 ^ 31);
            Object[] objArr7022 = new Object[1];
            bravo(c2122, ((i28622 | 780) << 1) - (i28622 ^ 780), i28722, objArr7022);
            String[] strArr1722 = {str3822, (String) objArr7022[0]};
            i29 = 0;
            while (i29 < 2) {
            }
            i30 = i4;
            int i30322 = ((~i26222) & i4) | (i26222 & i100);
            int i30422 = -i30322;
            int i30522 = ((i30322 & i30422) | (i30322 ^ i30422)) >> 31;
            int i30622 = (i26222 & i30522) | (i30 & (~i30522));
            D88713 = uH18377.D8871(-344556366);
            if (D88713 == null) {
            }
            long longValue1322 = ((Long) ((Method) D88713).invoke(null, null)).longValue();
            long j9922 = 807654152;
            long j10022 = 69;
            long j10122 = j9922 ^ j38;
            long j10222 = longValue1322 ^ j38;
            long j10322 = i4;
            long j10422 = ((j10022 * ((j10222 | j9922) ^ j38)) + (((-69) * ((((j10122 | longValue1322) ^ j38) | ((j10122 | j10322) ^ j38)) | ((longValue1322 | j10322) ^ j38))) + ((((((j10122 | j10222) | j10322) ^ j38) | (((j9922 | longValue1322) | j10322) ^ j38)) * j10022) + (((-68) * longValue1322) + (70 * j9922))))) - 959907250;
            int i30722 = ~Process.myPid();
            foxtrot2 = ((int) (j10422 >> c3)) & A0.z.foxtrot((~(1756836279 | i30722)) | (-1774156224) | (~(1100904605 | i30722)), 184, (((~(i30722 | (-673251619))) | (~((-17319945) | i30722))) * (-184)) - 1019427974, -1811082192);
            int i30822 = ~ao.ad.tango(869906954);
            i31 = ((int) j10422) & ((((~(i30822 | (-157006579))) | (-1159012422)) * 184) + (((-17899585) | i30822) * 184) + 1367661917);
            if (((foxtrot2 & i31) | (foxtrot2 ^ i31)) != 1) {
            }
            int i76622 = (~(i4 & i32)) & (i4 | i32);
            int i76722 = -i76622;
            Object[] objArr19322 = {new int[]{i32}, new int[]{i4}, new int[1], strArr};
            int foxtrot322 = A0.z.foxtrot((~(114810041 | i100)) | (-165508066), 381, ((i4 | (-151528257)) * (-381)) - 499182226, 1897690688);
            int i76822 = -(-((((i76622 & i76722) | (i76622 ^ i76722)) >> 31) & 16));
            int i76922 = (foxtrot322 & i76822) + (foxtrot322 | i76822);
            int vD14832N67151022 = F2.vD14832N6715();
            int i77022 = i76922 * 905;
            int i77122 = i10 * (-903);
            int i77222 = (i77022 & i77122) + (i77022 | i77122);
            int i77322 = ~i76922;
            int i77422 = ~(i77322 | vD14832N67151022);
            int i77522 = ~vD14832N67151022;
            int i77622 = ~((i77522 ^ i10) | (i77522 & i10));
            int i77722 = (i77222 - (~(-(-(((i77422 & i77622) | (i77422 ^ i77622)) * (-1808)))))) - 1;
            int i77822 = ~i10;
            int i77922 = (i77822 & i77322) | (i77322 ^ i77822);
            int i78022 = (i77522 ^ i76922) | (i77522 & i76922);
            int i78122 = -(-(((~((i77922 & vD14832N67151022) | (i77922 ^ vD14832N67151022))) | (~((i78022 & i10) | (i78022 ^ i10)))) * 904));
            int i78222 = (i77722 & i78122) + (i78122 | i77722);
            int i78322 = ~((i77322 & i10) | (i77322 ^ i10));
            int i78422 = ~i10;
            int i78522 = ~((vD14832N67151022 & i78422) | (i78422 ^ vD14832N67151022));
            int i78622 = (i78522 & i78322) | (i78322 ^ i78522);
            int i78722 = ~(i77522 | i76922);
            int i78822 = -(-(((i78622 & i78722) | (i78622 ^ i78722)) * 904));
            int i78922 = (i78222 ^ i78822) + ((i78822 & i78222) << 1);
            int i79022 = (i78922 << 13) ^ i78922;
            int i79122 = i79022 >>> 17;
            int i79222 = (i79022 | i79122) & (~(i79022 & i79122));
            ((int[]) objArr19322[2])[0] = i79222 ^ (i79222 << 5);
            return objArr19322;
        }
    }

    public getAutofillType(Context context, LocationManager locationManager, Geocoder geocoder) {
        this.alpha = context;
        this.bravo = locationManager;
        this.charlie = geocoder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f7, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0112, code lost:
    
        r9 = com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.foxtrot;
        com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.golf = ((r9 ^ 115) + ((r9 & 115) << 1)) % 128;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
    
        r10 = com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.foxtrot;
        com.fingerprintjs.android.fpjs_pro_internal.getAutofillType.golf = ((r10 & 119) + (r10 | 119)) % 128;
        r9 = r9.getCountryCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0100, code lost:
    
        if (r9 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Address address;
        String countryCode;
        int i14 = ~i5;
        int i15 = (~i12) | i14;
        int i16 = ~i15;
        int i17 = (~(i14 | i11)) | i16;
        int i18 = (~(i14 | (~i11) | i12)) | (~(i15 | i11)) | (~(i5 | i11 | i12));
        int i19 = (~(i12 | i5)) | i11 | i16;
        int i20 = ((-1222115328) * i13) + (1616379904 * i4) + (1256718336 * i10) + (168349733 * i19) + ((-168349733) * i18) + (i17 * (-168349733)) + (1088368604 * i11) + ((1425068070 * i5) - 1475346432);
        int papa = AbstractC2327c.papa(i13, -1076018391, (5090439 * i4) + i5 + i11 + i10);
        int i21 = i19 * HttpStatusCodesKt.HTTP_TEMP_REDIRECT;
        int quebec = AbstractC2327c.quebec(papa, -1125187584, (741505039 * i13) + (1582232257 * i4) + ((-1092730761) * i10) + i21 + (i18 * (-307)) + (i17 * (-307)) + (i11 * (-1092731068)) + (i5 * (-1092730454)) + 799718796, -410583040, (1028194304 * papa) + i20);
        if (quebec != 1) {
            if (quebec != 2) {
                if (quebec != 3) {
                    if (quebec != 4) {
                        if (quebec != 5) {
                            getAutofillType getautofilltype = (getAutofillType) objArr[0];
                            double doubleValue = ((Number) objArr[1]).doubleValue();
                            double doubleValue2 = ((Number) objArr[2]).doubleValue();
                            int intValue = ((Number) objArr[3]).intValue();
                            Geocoder geocoder = getautofilltype.charlie;
                            Intrinsics.checkNotNull(geocoder);
                            List<Address> fromLocation = geocoder.getFromLocation(doubleValue, doubleValue2, intValue);
                            Intrinsics.checkNotNull(fromLocation);
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = fromLocation.iterator();
                            while (it.hasNext()) {
                                int i22 = foxtrot;
                                int i23 = (i22 & 101) + (i22 | 101);
                                golf = i23 % 128;
                                if (i23 % 2 == 0) {
                                    address = (Address) it.next();
                                    int i24 = 88 / 0;
                                } else {
                                    address = (Address) it.next();
                                }
                                if (countryCode != null) {
                                    int i25 = -(-(((~((1893009263 & intValue) | (1893009263 ^ intValue))) | (-2044698624)) * 104));
                                    int i26 = ((-1479082390) ^ i25) + ((i25 & (-1479082390)) << 1);
                                    int i27 = ~intValue;
                                    int i28 = (i27 & (-969841814)) | (i27 ^ (-969841814));
                                    int i29 = -(-((~((i28 & (-1893009264)) | (i28 ^ (-1893009264)))) * (-104)));
                                    int i30 = (i26 & i29) + (i29 | i26);
                                    int i31 = (((-969841814) ^ intValue) | ((-969841814) & intValue)) * 104;
                                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                                    int identityHashCode = System.identityHashCode(getautofilltype);
                                    int i33 = -(-((((-875860530) ^ identityHashCode) | ((-875860530) & identityHashCode)) * (-50)));
                                    int i34 = (301748747 ^ i33) + ((i33 & 301748747) << 1);
                                    int i35 = ~(((-1086981391) & identityHashCode) | ((-1086981391) ^ identityHashCode));
                                    int i36 = ~identityHashCode;
                                    int i37 = ((-1624151344) ^ i36) | ((-1624151344) & i36);
                                    int i38 = ~((i37 ^ (-875860530)) | (i37 & (-875860530)));
                                    int i39 = (i34 - (~(((i35 ^ i38) | (i38 & i35)) * 50))) - 1;
                                    int i40 = ~i37;
                                    int i41 = (i40 & 537169953) | (i40 ^ 537169953);
                                    int i42 = ~((i36 & (-875860530)) | (i36 ^ (-875860530)));
                                    int i43 = -(-(((i41 & i42) | (i41 ^ i42)) * 50));
                                    if (i32 <= (i39 & i43) + (i43 | i39)) {
                                        arrayList.add(countryCode);
                                        int i44 = 1 / 0;
                                    } else {
                                        arrayList.add(countryCode);
                                    }
                                    golf = (foxtrot + 9) % 128;
                                }
                            }
                            return arrayList;
                        }
                        getAutofillType getautofilltype2 = (getAutofillType) objArr[0];
                        int i45 = foxtrot;
                        int i46 = ((i45 | 7) << 1) - (i45 ^ 7);
                        golf = i46 % 128;
                        if (i46 % 2 != 0) {
                            if (!((Boolean) delta(new Object[]{getautofilltype2}, ak.alpha(), -420980544, ak.alpha(), 420980545, ak.alpha(), ak.alpha())).booleanValue()) {
                                int i47 = golf + 39;
                                foxtrot = i47 % 128;
                                if (i47 % 2 != 0) {
                                    int i48 = 2 / 0;
                                }
                                return null;
                            }
                            D1 d12 = new D1(getautofilltype2);
                            G0 g02 = new G0();
                            d12.invoke(g02);
                            Location location = (Location) g02.bravo();
                            int i49 = foxtrot + 119;
                            golf = i49 % 128;
                            if (i49 % 2 != 0) {
                                return location;
                            }
                            throw null;
                        }
                        ((Boolean) delta(new Object[]{getautofilltype2}, ak.alpha(), -420980544, ak.alpha(), 420980545, ak.alpha(), ak.alpha())).getClass();
                        throw null;
                    }
                    int i50 = foxtrot;
                    int i51 = (i50 & 83) + (i50 | 83);
                    golf = i51 % 128;
                    int i52 = i51 % 2;
                    boolean isPresent = Geocoder.isPresent();
                    if (i52 == 0) {
                        int i53 = 50 / 0;
                    }
                    return Boolean.valueOf(isPresent);
                }
                getAutofillType getautofilltype3 = (getAutofillType) objArr[0];
                int i54 = foxtrot;
                int i55 = (i54 ^ 45) + ((i54 & 45) << 1);
                golf = i55 % 128;
                int i56 = i55 % 2;
                LocationManager locationManager = getautofilltype3.bravo;
                if (i56 == 0) {
                    int i57 = 68 / 0;
                }
                return locationManager;
            }
            getAutofillType getautofilltype4 = (getAutofillType) objArr[0];
            String str = (String) objArr[1];
            golf = (foxtrot + 93) % 128;
            LocationManager locationManager2 = getautofilltype4.bravo;
            Intrinsics.checkNotNull(locationManager2);
            Location lastKnownLocation = locationManager2.getLastKnownLocation(str);
            int i58 = golf;
            int i59 = ((i58 | 7) << 1) - (i58 ^ 7);
            foxtrot = i59 % 128;
            if (i59 % 2 == 0) {
                return lastKnownLocation;
            }
            throw null;
        }
        getAutofillType getautofilltype5 = (getAutofillType) objArr[0];
        int i60 = golf + 5;
        foxtrot = i60 % 128;
        if (i60 % 2 == 0) {
            LocationManager locationManager3 = getautofilltype5.bravo;
            Intrinsics.checkNotNull(locationManager3);
            if (!locationManager3.isProviderEnabled("gps")) {
                int i61 = foxtrot + 73;
                golf = i61 % 128;
                int i62 = i61 % 2;
                LocationManager locationManager4 = getautofilltype5.bravo;
                if (i62 != 0) {
                    Intrinsics.checkNotNull(locationManager4);
                    if (!locationManager4.isProviderEnabled("network")) {
                        int i63 = golf;
                        foxtrot = ((i63 ^ 105) + ((i63 & 105) << 1)) % 128;
                        return Boolean.FALSE;
                    }
                } else {
                    Intrinsics.checkNotNull(locationManager4);
                    locationManager4.isProviderEnabled("network");
                    throw null;
                }
            }
            return Boolean.TRUE;
        }
        LocationManager locationManager5 = getautofilltype5.bravo;
        Intrinsics.checkNotNull(locationManager5);
        locationManager5.isProviderEnabled("gps");
        throw null;
    }

    public final Location alpha(long j5) {
        boolean z2;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.alpha);
        Intrinsics.checkNotNull(fusedLocationProviderClient);
        com.google.android.gms.location.n.alpha(100);
        if (j5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.alpha("durationMillis must be greater than 0", z2);
        F1 f12 = new F1(fusedLocationProviderClient, new CurrentLocationRequest(10000L, 0, 100, j5, false, 0, new WorkSource(null), null));
        G0 g02 = new G0();
        f12.invoke(g02);
        Location location = (Location) g02.bravo();
        int i4 = golf;
        foxtrot = ((i4 & 53) + (i4 | 53)) % 128;
        return location;
    }

    public final Location bravo(String str) {
        boolean isLocationEnabled;
        int i4 = foxtrot;
        golf = ((i4 ^ 101) + ((i4 & 101) << 1)) % 128;
        LocationManager locationManager = this.bravo;
        Intrinsics.checkNotNull(locationManager);
        isLocationEnabled = locationManager.isLocationEnabled();
        if (!isLocationEnabled) {
            int i5 = golf;
            int i10 = (i5 & 63) + (i5 | 63);
            foxtrot = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        H1 h1 = new H1(this, str);
        G0 g02 = new G0();
        h1.invoke(g02);
        Location location = (Location) g02.bravo();
        golf = (foxtrot + 45) % 128;
        return location;
    }

    public final ArrayList charlie() {
        golf = (foxtrot + 47) % 128;
        LocationManager locationManager = this.bravo;
        Intrinsics.checkNotNull(locationManager);
        List<String> allProviders = locationManager.getAllProviders();
        Intrinsics.checkNotNull(allProviders);
        ArrayList emerald = CollectionsKt.emerald(allProviders);
        int i4 = golf + 37;
        foxtrot = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return emerald;
    }
}
