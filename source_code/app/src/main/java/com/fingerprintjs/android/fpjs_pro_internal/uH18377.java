package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class uH18377 {
    public static final Object alpha;
    public static final Object bravo;
    public static final HashMap charlie;
    public static final int delta;
    public static final boolean echo;
    public static final long foxtrot;
    public static final int golf;
    public static final byte[] hotel = null;
    public static final int india = 0;
    public static int juliet = 0;
    public static int kilo = 1;
    public static final int lima;
    public static final int mike;
    public static int november = 0;
    public static int oscar = 1;

    /* JADX WARN: Can't wrap try/catch for region: R(36:(4:92|(3:94|95|96)(0)|127|128)(1:961)|289|290|291|292|293|294|296|297|298|299|300|301|(1:303)(1:772)|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|(12:323|324|325|326|(2:328|329)|330|331|332|333|334|335|(11:337|338|339|340|341|342|343|344|345|346|(45:348|(1:350)(1:614)|(1:352)(1:613)|353|354|355|356|357|358|359|360|361|362|363|364|365|366|(2:556|557)|368|369|(3:371|372|(3:374|(2:376|377)(2:379|380)|378)(1:381))|555|382|(2:384|385)|386|387|388|389|390|391|392|393|394|395|396|397|398|399|(3:519|520|521)|401|402|403|404|(7:406|407|408|409|410|(1:412)|413)(3:507|508|509)|(19:415|416|417|418|419|420|421|422|(5:424|425|426|427|428)(1:469)|429|430|431|432|433|434|435|436|437|438)(1:474))(31:615|616|617|618|619|620|621|(2:622|(2:624|(3:626|627|628)(1:629))(1:684))|630|631|632|633|634|635|636|637|638|639|640|641|(1:643)|644|645|646|(2:648|(1:650)(3:651|652|653))|654|402|403|404|(0)(0)|(0)(0)))(7:711|712|713|714|715|346|(0)(0)))|127|128) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:87|88|89|90|(4:92|(3:94|95|96)(0)|127|128)(1:961)|(13:151|152|153|154|155|156|157|158|159|160|(9:(1:163)(2:273|(1:275)(1:(1:277)(1:278)))|164|(3:(3:167|(1:169)(1:173)|170)(1:174)|171|172)|175|176|(5:178|179|180|181|182)(16:192|(4:194|195|196|197)(1:(6:205|206|207|208|209|185)(15:216|217|218|219|220|221|223|224|225|226|227|228|229|230|182))|928|929|114|115|116|117|118|(2:120|(2:123|124)(1:122))|129|130|131|132|133|134)|183|184|185)|279|280)(1:940)|281|282|283|284|285|(2:788|789)(1:287)|288|289|290|291|292|293|294|296|297|298|299|300|301|(1:303)(1:772)|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|(12:323|324|325|326|(2:328|329)|330|331|332|333|334|335|(11:337|338|339|340|341|342|343|344|345|346|(45:348|(1:350)(1:614)|(1:352)(1:613)|353|354|355|356|357|358|359|360|361|362|363|364|365|366|(2:556|557)|368|369|(3:371|372|(3:374|(2:376|377)(2:379|380)|378)(1:381))|555|382|(2:384|385)|386|387|388|389|390|391|392|393|394|395|396|397|398|399|(3:519|520|521)|401|402|403|404|(7:406|407|408|409|410|(1:412)|413)(3:507|508|509)|(19:415|416|417|418|419|420|421|422|(5:424|425|426|427|428)(1:469)|429|430|431|432|433|434|435|436|437|438)(1:474))(31:615|616|617|618|619|620|621|(2:622|(2:624|(3:626|627|628)(1:629))(1:684))|630|631|632|633|634|635|636|637|638|639|640|641|(1:643)|644|645|646|(2:648|(1:650)(3:651|652|653))|654|402|403|404|(0)(0)|(0)(0)))(7:711|712|713|714|715|346|(0)(0)))|127|128) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:6|7|8|(1:10)(1:1054)|11|12|(3:13|14|15)|(5:16|17|18|19|20)|(44:22|23|(44:1033|1034|1035|1036|1037|(41:1024|1025|1026|1027|1028|(36:1020|1021|32|(1:(1:1009)(35:1010|1011|1012|1013|35|(1:37)(5:991|992|993|994|995)|(4:40|41|42|43)|51|52|53|54|55|56|57|58|(1:60)(1:985)|61|(2:63|(16:65|66|67|68|(1:70)(1:980)|71|(1:73)(1:979)|74|75|(1:77)(1:978)|78|79|80|(2:82|(1:(6:85|(48:87|88|89|90|(4:92|(3:94|95|96)(0)|127|128)(1:961)|(13:151|152|153|154|155|156|157|158|159|160|(9:(1:163)(2:273|(1:275)(1:(1:277)(1:278)))|164|(3:(3:167|(1:169)(1:173)|170)(1:174)|171|172)|175|176|(5:178|179|180|181|182)(16:192|(4:194|195|196|197)(1:(6:205|206|207|208|209|185)(15:216|217|218|219|220|221|223|224|225|226|227|228|229|230|182))|928|929|114|115|116|117|118|(2:120|(2:123|124)(1:122))|129|130|131|132|133|134)|183|184|185)|279|280)(1:940)|281|282|283|284|285|(2:788|789)(1:287)|288|289|290|291|292|293|294|296|297|298|299|300|301|(1:303)(1:772)|304|305|306|307|308|309|310|311|312|313|314|315|316|317|318|319|320|321|322|(12:323|324|325|326|(2:328|329)|330|331|332|333|334|335|(11:337|338|339|340|341|342|343|344|345|346|(45:348|(1:350)(1:614)|(1:352)(1:613)|353|354|355|356|357|358|359|360|361|362|363|364|365|366|(2:556|557)|368|369|(3:371|372|(3:374|(2:376|377)(2:379|380)|378)(1:381))|555|382|(2:384|385)|386|387|388|389|390|391|392|393|394|395|396|397|398|399|(3:519|520|521)|401|402|403|404|(7:406|407|408|409|410|(1:412)|413)(3:507|508|509)|(19:415|416|417|418|419|420|421|422|(5:424|425|426|427|428)(1:469)|429|430|431|432|433|434|435|436|437|438)(1:474))(31:615|616|617|618|619|620|621|(2:622|(2:624|(3:626|627|628)(1:629))(1:684))|630|631|632|633|634|635|636|637|638|639|640|641|(1:643)|644|645|646|(2:648|(1:650)(3:651|652|653))|654|402|403|404|(0)(0)|(0)(0)))(7:711|712|713|714|715|346|(0)(0)))|127|128)(1:965)|125|126|127|128)(2:966|967))(4:968|969|970|971))|975|976))|982|(15:984|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976))|34|35|(0)(0)|(4:40|41|42|43)|51|52|53|54|55|56|57|58|(0)(0)|61|(0)|982|(0)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976)|31|32|(0)|34|35|(0)(0)|(0)|51|52|53|54|55|56|57|58|(0)(0)|61|(0)|982|(0)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976)|28|29|(0)|31|32|(0)|34|35|(0)(0)|(0)|51|52|53|54|55|56|57|58|(0)(0)|61|(0)|982|(0)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976)|25|26|(0)|28|29|(0)|31|32|(0)|34|35|(0)(0)|(0)|51|52|53|54|55|56|57|58|(0)(0)|61|(0)|982|(0)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976)|1042|1043|23|(0)|25|26|(0)|28|29|(0)|31|32|(0)|34|35|(0)(0)|(0)|51|52|53|54|55|56|57|58|(0)(0)|61|(0)|982|(0)|66|67|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|78|79|80|(0)|975|976) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0496, code lost:
    
        r2 = new java.lang.StringBuilder();
        r4 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.hotel;
        r2.append(alpha(r4[187(0xbb, float:2.62E-43)], (short) 943, r4[23]));
        r2.append(r0);
        r6 = (short) 939;
        r2.append(alpha((byte) (r4[963(0x3c3, float:1.35E-42)] + 1), r6, (byte) ((-2) - (r4[968(0x3c8, float:1.356E-42)] ^ (-1)))));
        r0 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04cc, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.uH18377.mike = (r54 + 45) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04d4, code lost:
    
        r4 = new java.lang.Object[r46];
        r4[r27] = r0;
        r0 = java.lang.Class.forName(alpha((byte) ((-2) - (r4[147(0x93, float:2.06E-43)] ^ (-1))), r6, r4[r27]));
        r6 = new java.lang.Class[1];
        r6[r27] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04f9, code lost:
    
        throw ((java.lang.Throwable) r0.getDeclaredConstructor(r6).newInstance(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04fb, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04ff, code lost:
    
        if (r2 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0501, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0519, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0502, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0503, code lost:
    
        r55 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0445, code lost:
    
        r4 = (byte) (com.fingerprintjs.android.fpjs_pro_internal.uH18377.india & 368);
        r54 = r2;
        r2 = (short) (r4 | 1296);
        r55 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.hotel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0451, code lost:
    
        r56 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0462, code lost:
    
        r57 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x047e, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName(alpha(r4, r2, r55[r27])).getMethod(alpha(r55[433(0x1b1, float:6.07E-43)], (short) 950, r55[85]), null).invoke(r0, null)).booleanValue() == false) goto L1033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x196b, code lost:
    
        r4 = r74;
        r0 = r81.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.fingerprintjs.android.fpjs_pro_internal.uH18377.alpha = r0.newInstance(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x1997, code lost:
    
        if (r4 == null) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x19a2, code lost:
    
        if (r75 == 0) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x19a4, code lost:
    
        r1 = r75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x19a8, code lost:
    
        if (r1 < 26) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x19b1, code lost:
    
        r0 = new java.lang.Object[]{1635367911, 1264452162};
        r4 = D8871(311191587);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x19d0, code lost:
    
        if (r4 != null) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x19d2, code lost:
    
        r4 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.mike;
        com.fingerprintjs.android.fpjs_pro_internal.uH18377.lima = (((r4 | 47) << 1) - (r4 ^ 47)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x19e1, code lost:
    
        r4 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
        r7 = (r4 ^ 60) + ((r4 & 60) << 1);
        r4 = -(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        r8 = ((r4 | 527) << 1) - (r4 ^ 527);
        r9 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
        r6 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.hotel[963(0x3c3, float:1.35E-42)];
        r4 = setPivotYN16904(r7, r8, r9, -851981578, false, alpha((byte) ((r6 ^ 1) + ((r6 & 1) << 1)), r4[133(0x85, float:1.86E-43)], r4[277(0x115, float:3.88E-43)]), new java.lang.Class[]{r47, r47});
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x1a3d, code lost:
    
        ((java.lang.reflect.Method) r4).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x1a3b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x1a4e, code lost:
    
        r4 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x1a52, code lost:
    
        if (r4 != null) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x1a54, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x1a58, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x1a43, code lost:
    
        r11 = 1;
        r26 = -1;
        r27 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x19ac, code lost:
    
        r1 = r75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x1999, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x199d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x199e, code lost:
    
        r1 = r75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0c28, code lost:
    
        r4 = r27;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0c17, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0c18, code lost:
    
        r66 = r11;
        r67 = r12;
        r68 = r13;
        r69 = r14;
        r72 = r15;
        r35 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1b92, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1b93, code lost:
    
        r35 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x08cc, code lost:
    
        if (r0 != null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x1a55, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0482, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x048c, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x0490, code lost:
    
        if (r2 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x0492, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x0495, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x0493, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x0484, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:953:0x0485, code lost:
    
        r57 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:955:0x0488, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:956:0x0489, code lost:
    
        r56 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:960:0x0443, code lost:
    
        if (r0 != null) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x041f, code lost:
    
        if (r0 != null) goto L935;
     */
    /* JADX WARN: Code restructure failed: missing block: B:988:0x03d3, code lost:
    
        r0 = 0;
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0422, code lost:
    
        r54 = r2;
        r56 = r6;
        r57 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:990:0x03d7, code lost:
    
        r45 = 6;
        r44 = 19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1bd0 A[Catch: Exception -> 0x1c9f, TRY_ENTER, TryCatch #37 {Exception -> 0x1c9f, blocks: (B:8:0x00d6, B:10:0x00ee, B:11:0x00fd, B:40:0x02a4, B:46:0x02ef, B:48:0x02f5, B:50:0x02f6, B:51:0x02f7, B:54:0x0349, B:57:0x0353, B:68:0x039a, B:71:0x03ae, B:74:0x03b8, B:78:0x03ce, B:85:0x03f5, B:120:0x1bd0, B:124:0x1bd4, B:122:0x1be1, B:130:0x1bf2, B:137:0x1c3b, B:139:0x1c41, B:140:0x1c42, B:971:0x1c80, B:991:0x023d, B:998:0x1c85, B:1000:0x1c8b, B:1001:0x1c8c, B:1004:0x1c8e, B:1006:0x1c94, B:1007:0x1c95, B:1010:0x01ef, B:1016:0x1c97, B:1018:0x1c9d, B:1019:0x1c9e, B:133:0x1c04, B:134:0x1c39, B:995:0x027d, B:993:0x024c, B:1013:0x0210, B:43:0x02b7), top: B:7:0x00d6, inners: #6, #49, #55, #64, #103 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0c31 A[Catch: all -> 0x0c40, TryCatch #13 {all -> 0x0c40, blocks: (B:301:0x0c2d, B:303:0x0c31, B:772:0x0c52), top: B:300:0x0c2d }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x171f A[Catch: all -> 0x16e6, TRY_LEAVE, TryCatch #101 {all -> 0x16e6, blocks: (B:404:0x171b, B:406:0x171f, B:410:0x1778, B:412:0x1788, B:415:0x17e9, B:419:0x180b, B:422:0x181f, B:425:0x1836, B:503:0x179d, B:505:0x17a3, B:506:0x17a4, B:507:0x17a5, B:509:0x17d2, B:513:0x17df, B:514:0x17e5, B:641:0x16cf, B:643:0x16da, B:645:0x16f8, B:646:0x16fe, B:650:0x1710, B:652:0x1713, B:653:0x1717, B:408:0x1761), top: B:403:0x171b, inners: #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x17e9 A[Catch: all -> 0x16e6, TRY_ENTER, TRY_LEAVE, TryCatch #101 {all -> 0x16e6, blocks: (B:404:0x171b, B:406:0x171f, B:410:0x1778, B:412:0x1788, B:415:0x17e9, B:419:0x180b, B:422:0x181f, B:425:0x1836, B:503:0x179d, B:505:0x17a3, B:506:0x17a4, B:507:0x17a5, B:509:0x17d2, B:513:0x17df, B:514:0x17e5, B:641:0x16cf, B:643:0x16da, B:645:0x16f8, B:646:0x16fe, B:650:0x1710, B:652:0x1713, B:653:0x1717, B:408:0x1761), top: B:403:0x171b, inners: #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1b8e A[Catch: all -> 0x1a55, TRY_ENTER, TryCatch #22 {all -> 0x1a55, blocks: (B:467:0x1b8e, B:468:0x1b91, B:490:0x1a4e, B:492:0x1a54, B:493:0x1a58, B:784:0x1b98, B:786:0x1baa, B:787:0x1bab, B:922:0x1bad, B:924:0x1bbf, B:925:0x1bc0, B:482:0x19b1, B:485:0x19e1, B:486:0x1a3d, B:290:0x0bb6, B:285:0x0885), top: B:481:0x19b1, inners: #7, #66, #83 }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x196b A[EDGE_INSN: B:474:0x196b->B:475:0x196b BREAK  A[LOOP:4: B:323:0x0d30->B:438:0x1926], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x17a5 A[Catch: all -> 0x16e6, TRY_LEAVE, TryCatch #101 {all -> 0x16e6, blocks: (B:404:0x171b, B:406:0x171f, B:410:0x1778, B:412:0x1788, B:415:0x17e9, B:419:0x180b, B:422:0x181f, B:425:0x1836, B:503:0x179d, B:505:0x17a3, B:506:0x17a4, B:507:0x17a5, B:509:0x17d2, B:513:0x17df, B:514:0x17e5, B:641:0x16cf, B:643:0x16da, B:645:0x16f8, B:646:0x16fe, B:650:0x1710, B:652:0x1713, B:653:0x1717, B:408:0x1761), top: B:403:0x171b, inners: #69 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x13b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0ed0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x1b56 A[Catch: all -> 0x1a67, TryCatch #33 {all -> 0x1a67, blocks: (B:658:0x1a76, B:665:0x1ae3, B:667:0x1ae9, B:668:0x1aea, B:673:0x1a60, B:675:0x1a66, B:676:0x1a6c, B:687:0x1aec, B:689:0x1afa, B:690:0x1afb, B:693:0x1afd, B:695:0x1b0b, B:696:0x1b0c, B:718:0x1b0e, B:720:0x1b19, B:721:0x1b1a, B:724:0x1b1c, B:726:0x1b29, B:727:0x1b2a, B:734:0x1b2c, B:736:0x1b39, B:737:0x1b3a, B:742:0x1b50, B:744:0x1b56, B:745:0x1b57, B:757:0x1b6c, B:759:0x1b72, B:760:0x1b73, B:766:0x1b75, B:768:0x1b8a, B:769:0x1b8b, B:321:0x0d04, B:306:0x0c57, B:661:0x1ab4, B:662:0x1ae1, B:620:0x1482, B:618:0x1450, B:715:0x0efc, B:334:0x0d80), top: B:320:0x0d04, inners: #2, #38, #100, #102, #108, #113, #116 }] */
    /* JADX WARN: Removed duplicated region for block: B:745:0x1b57 A[Catch: all -> 0x1a67, TryCatch #33 {all -> 0x1a67, blocks: (B:658:0x1a76, B:665:0x1ae3, B:667:0x1ae9, B:668:0x1aea, B:673:0x1a60, B:675:0x1a66, B:676:0x1a6c, B:687:0x1aec, B:689:0x1afa, B:690:0x1afb, B:693:0x1afd, B:695:0x1b0b, B:696:0x1b0c, B:718:0x1b0e, B:720:0x1b19, B:721:0x1b1a, B:724:0x1b1c, B:726:0x1b29, B:727:0x1b2a, B:734:0x1b2c, B:736:0x1b39, B:737:0x1b3a, B:742:0x1b50, B:744:0x1b56, B:745:0x1b57, B:757:0x1b6c, B:759:0x1b72, B:760:0x1b73, B:766:0x1b75, B:768:0x1b8a, B:769:0x1b8b, B:321:0x0d04, B:306:0x0c57, B:661:0x1ab4, B:662:0x1ae1, B:620:0x1482, B:618:0x1450, B:715:0x0efc, B:334:0x0d80), top: B:320:0x0d04, inners: #2, #38, #100, #102, #108, #113, #116 }] */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0c52 A[Catch: all -> 0x0c40, TRY_LEAVE, TryCatch #13 {all -> 0x0c40, blocks: (B:301:0x0c2d, B:303:0x0c31, B:772:0x0c52), top: B:300:0x0c2d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x08ff A[Catch: all -> 0x07b9, TRY_ENTER, TRY_LEAVE, TryCatch #87 {all -> 0x07b9, blocks: (B:233:0x07b2, B:235:0x07b8, B:236:0x07be, B:256:0x07cc, B:264:0x0831, B:266:0x0837, B:267:0x0838, B:240:0x07c4, B:242:0x07ca, B:243:0x07cb, B:249:0x0841, B:251:0x0847, B:252:0x0848, B:282:0x0873, B:789:0x08a5, B:793:0x08ff, B:795:0x091b, B:798:0x093b, B:801:0x0957, B:805:0x09a9, B:809:0x09bb, B:811:0x09c1, B:812:0x09c2, B:813:0x09c3, B:815:0x09e9, B:817:0x0a11, B:821:0x0a3f, B:824:0x0a4a, B:826:0x0a50, B:827:0x0a51, B:829:0x0a52, B:830:0x0a56, B:832:0x0a5c, B:843:0x0ad3, B:848:0x0aea, B:851:0x0b23, B:855:0x0b5d, B:863:0x0b6d, B:291:0x0be3, B:860:0x0b71, B:873:0x0b7f, B:872:0x0b7c, B:876:0x0b81, B:878:0x0b87, B:879:0x0b88, B:882:0x0b8a, B:884:0x0b90, B:885:0x0b91, B:889:0x0b93, B:891:0x0b99, B:892:0x0b9a, B:897:0x0ba4, B:899:0x0baa, B:900:0x0bab, B:910:0x08d2, B:913:0x08dc, B:933:0x0860, B:935:0x0866, B:936:0x0867, B:259:0x0806, B:260:0x082f, B:229:0x0781), top: B:255:0x07cc, inners: #3, #63, #86 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:946:0x0492 A[Catch: all -> 0x0493, TryCatch #62 {all -> 0x0493, blocks: (B:944:0x048c, B:946:0x0492, B:947:0x0495), top: B:943:0x048c }] */
    /* JADX WARN: Removed duplicated region for block: B:947:0x0495 A[Catch: all -> 0x0493, TRY_LEAVE, TryCatch #62 {all -> 0x0493, blocks: (B:944:0x048c, B:946:0x0492, B:947:0x0495), top: B:943:0x048c }] */
    /* JADX WARN: Removed duplicated region for block: B:978:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:980:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:984:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:985:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:991:0x023d A[Catch: Exception -> 0x1c9f, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x1c9f, blocks: (B:8:0x00d6, B:10:0x00ee, B:11:0x00fd, B:40:0x02a4, B:46:0x02ef, B:48:0x02f5, B:50:0x02f6, B:51:0x02f7, B:54:0x0349, B:57:0x0353, B:68:0x039a, B:71:0x03ae, B:74:0x03b8, B:78:0x03ce, B:85:0x03f5, B:120:0x1bd0, B:124:0x1bd4, B:122:0x1be1, B:130:0x1bf2, B:137:0x1c3b, B:139:0x1c41, B:140:0x1c42, B:971:0x1c80, B:991:0x023d, B:998:0x1c85, B:1000:0x1c8b, B:1001:0x1c8c, B:1004:0x1c8e, B:1006:0x1c94, B:1007:0x1c95, B:1010:0x01ef, B:1016:0x1c97, B:1018:0x1c9d, B:1019:0x1c9e, B:133:0x1c04, B:134:0x1c39, B:995:0x027d, B:993:0x024c, B:1013:0x0210, B:43:0x02b7), top: B:7:0x00d6, inners: #6, #49, #55, #64, #103 }] */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v93, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v110, types: [int] */
    /* JADX WARN: Type inference failed for: r4v117, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v118, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v129, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v146 */
    /* JADX WARN: Type inference failed for: r4v147 */
    /* JADX WARN: Type inference failed for: r4v156 */
    /* JADX WARN: Type inference failed for: r4v157 */
    /* JADX WARN: Type inference failed for: r4v279 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v86, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v99, types: [int] */
    /* JADX WARN: Type inference failed for: r6v213, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v272, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r74v0, types: [long] */
    /* JADX WARN: Type inference failed for: r74v10 */
    /* JADX WARN: Type inference failed for: r74v11 */
    /* JADX WARN: Type inference failed for: r74v13 */
    /* JADX WARN: Type inference failed for: r74v17 */
    /* JADX WARN: Type inference failed for: r74v18 */
    /* JADX WARN: Type inference failed for: r74v2 */
    /* JADX WARN: Type inference failed for: r74v3 */
    /* JADX WARN: Type inference failed for: r74v6 */
    /* JADX WARN: Type inference failed for: r74v7 */
    /* JADX WARN: Type inference failed for: r74v8 */
    /* JADX WARN: Type inference failed for: r74v9 */
    /* JADX WARN: Type inference failed for: r7v224, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v65, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v171, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v95, types: [java.lang.Class[]] */
    static {
        String alpha2;
        int i4;
        char c3;
        char c4;
        int i5;
        Object obj;
        char c10;
        Object invoke;
        char c11;
        Object invoke2;
        Object invoke3;
        Class<String> cls;
        char c12;
        char c13;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i10;
        char c14;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        Class<?> cls2;
        int i15;
        Class<Throwable> cls3;
        String str;
        boolean z10;
        boolean[] zArr4;
        Object[] objArr2;
        byte[] bArr2;
        Class<String> cls4;
        int i16;
        boolean[] zArr5;
        boolean[] zArr6;
        int i17;
        int i18;
        boolean z11;
        Object obj2;
        boolean z12;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        byte[] bArr3;
        String alpha3;
        Object invoke4;
        Object obj7;
        char c15;
        char c16;
        ?? r4;
        ZipFile zipFile;
        ZipFile zipFile2;
        ZipFile zipFile3;
        ZipFile zipFile4;
        byte[] bArr4;
        InputStream resourceAsStream;
        short s3;
        short s9;
        boolean z13;
        short s10;
        Throwable cause;
        int i19;
        short s11;
        int i20;
        long j5;
        int length;
        int i21;
        Object obj8;
        Class cls5;
        short s12;
        int i22;
        Object obj9;
        char c17;
        short s13;
        Object obj10;
        ZipFile zipFile5;
        ZipFile zipFile6;
        boolean z14;
        Class cls6;
        byte[] bArr5;
        ZipFile zipFile7;
        InputStream resourceAsStream2;
        short s14;
        short s15;
        short s16;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        int i23;
        Random random;
        Object obj17;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z15;
        boolean z16;
        boolean z17;
        Class<?> cls7 = Integer.TYPE;
        Class<Throwable> cls8 = Throwable.class;
        bravo();
        try {
            Object[] objArr3 = {Float.valueOf(0.10529095f), Float.valueOf(0.30647862f)};
            byte[] bArr6 = hotel;
            int i28 = -1;
            Class<?> cls9 = Class.forName(alpha(bArr6[161], (short) 1288, bArr6[22]));
            int i29 = 0;
            String alpha4 = alpha((byte) (india & 382), (short) 1266, bArr6[195]);
            Class<?> cls10 = Float.TYPE;
            int i30 = (((Float) cls9.getMethod(alpha4, cls10, cls10).invoke(null, objArr3)).floatValue() > 0.9901926f ? 1 : (((Float) cls9.getMethod(alpha4, cls10, cls10).invoke(null, objArr3)).floatValue() == 0.9901926f ? 0 : -1));
            int i31 = ~((-1851643107) | i30);
            int i32 = (-1668597859) - (~(-(-(((i31 & 1843780095) | (1843780095 ^ i31)) * (-318)))));
            int i33 = ~(1843780095 | i30);
            int i34 = ~i30;
            int i35 = (i34 ^ 1851643106) | (i34 & 1851643106);
            int i36 = 3;
            int i37 = 1843780095 | i34;
            if ((((~((i37 & 1851643106) | (i37 ^ 1851643106))) | (~((i30 & (-27265310)) | ((-27265310) ^ i30)))) * 318) + ((i33 | (~((i35 ^ (-1843780096)) | (i35 & (-1843780096))))) * 318) + i32 == 0) {
                return;
            }
            foxtrot = -5804498540878836974L;
            golf = -6;
            new HashMap();
            charlie = new HashMap();
            try {
                byte b2 = bArr6[7];
                alpha2 = alpha(b2, (short) ((b2 ^ 1261) | (b2 & 1261)), bArr6[85]);
                String alpha5 = alpha == null ? alpha(bArr6[114], (short) 1186, bArr6[85]) : null;
                i4 = ((Field) vD14832N6715.D8871[0]).getInt(null);
                delta = -541351211;
                try {
                    c3 = 'r';
                    c4 = 538;
                } catch (Exception unused) {
                    c3 = 'r';
                    c4 = 538;
                }
                try {
                    i5 = 5;
                    try {
                        obj = Class.forName(alpha(bArr6[23], (short) 1153, bArr6[22])).getMethod(alpha(bArr6[147], (short) 1128, bArr6[85]), null).invoke(null, null);
                    } catch (Exception unused2) {
                        obj = null;
                        byte[] bArr7 = hotel;
                        obj = Class.forName(alpha(bArr7[81], (short) 1111, bArr7[22])).getMethod(alpha(bArr7[c4], (short) 1090, bArr7[4]), null).invoke(null, null);
                        if (obj != null) {
                        }
                        c10 = 396;
                        invoke = null;
                        if (obj != null) {
                        }
                        c11 = 441;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        cls = String.class;
                        if (invoke == null) {
                        }
                        c12 = 822;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte b4 = (byte) (india & 368);
                        byte[] bArr8 = hotel;
                        objArr = (Object[]) Array.newInstance(Class.forName(alpha(b4, (short) ((b4 ^ 1296) | (b4 & 1296)), bArr8[0])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        objArr[4] = invoke2;
                        objArr[i5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[3] = true;
                        zArr3[4] = false;
                        zArr3[i5] = true;
                        zArr3[6] = true;
                        c14 = 19;
                        i10 = 6;
                        Class<?> cls11 = Class.forName(alpha(bArr8[719], (short) 979, bArr8[22]));
                        i11 = cls11.getDeclaredField(alpha(bArr8[19], (short) 956, bArr8[95])).getInt(cls11);
                        if (i11 < 34) {
                        }
                        if (i11 == 29) {
                        }
                        i27 = 26;
                        if (i11 >= 26) {
                        }
                        z15 = false;
                        zArr3[0] = z15;
                        if (i11 >= i27) {
                        }
                        echo = z16;
                        zArr3[1] = i11 < 21;
                        if (i11 < 21) {
                        }
                        zArr3[4] = z17;
                        z2 = r1;
                        i12 = i11;
                        i13 = 1;
                        i14 = 0;
                        bArr = null;
                        loop0: while (bArr == null) {
                        }
                        return;
                    }
                } catch (Exception unused3) {
                    i5 = 5;
                    obj = null;
                    byte[] bArr72 = hotel;
                    obj = Class.forName(alpha(bArr72[81], (short) 1111, bArr72[22])).getMethod(alpha(bArr72[c4], (short) 1090, bArr72[4]), null).invoke(null, null);
                    if (obj != null) {
                    }
                    c10 = 396;
                    invoke = null;
                    if (obj != null) {
                    }
                    c11 = 441;
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    cls = String.class;
                    if (invoke == null) {
                    }
                    c12 = 822;
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte b42 = (byte) (india & 368);
                    byte[] bArr82 = hotel;
                    objArr = (Object[]) Array.newInstance(Class.forName(alpha(b42, (short) ((b42 ^ 1296) | (b42 & 1296)), bArr82[0])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    objArr[4] = invoke2;
                    objArr[i5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[3] = true;
                    zArr3[4] = false;
                    zArr3[i5] = true;
                    zArr3[6] = true;
                    c14 = 19;
                    i10 = 6;
                    Class<?> cls112 = Class.forName(alpha(bArr82[719], (short) 979, bArr82[22]));
                    i11 = cls112.getDeclaredField(alpha(bArr82[19], (short) 956, bArr82[95])).getInt(cls112);
                    if (i11 < 34) {
                    }
                    if (i11 == 29) {
                    }
                    i27 = 26;
                    if (i11 >= 26) {
                    }
                    z15 = false;
                    zArr3[0] = z15;
                    if (i11 >= i27) {
                    }
                    echo = z16;
                    zArr3[1] = i11 < 21;
                    if (i11 < 21) {
                    }
                    zArr3[4] = z17;
                    z2 = r1;
                    i12 = i11;
                    i13 = 1;
                    i14 = 0;
                    bArr = null;
                    loop0: while (bArr == null) {
                    }
                    return;
                }
                if (obj != null) {
                    mike = 33;
                    if (obj != null) {
                        try {
                            Class<?> cls12 = obj.getClass();
                            byte[] bArr9 = hotel;
                            c10 = 396;
                            try {
                                invoke = cls12.getMethod(alpha(bArr9[396], (short) 1070, bArr9[4]), null).invoke(obj, null);
                            } catch (Exception unused4) {
                            }
                        } catch (Exception unused5) {
                        }
                        if (obj != null) {
                            try {
                                c11 = 441;
                                try {
                                    invoke2 = obj.getClass().getMethod(alpha((byte) (-hotel[441]), (short) 1060, r15[4]), null).invoke(obj, null);
                                } catch (Exception unused6) {
                                }
                            } catch (Exception unused7) {
                            }
                            if (obj != null) {
                                try {
                                    Class<?> cls13 = obj.getClass();
                                    byte[] bArr10 = hotel;
                                    invoke3 = cls13.getMethod(alpha(bArr10[c10], (short) 1046, bArr10[4]), null).invoke(obj, null);
                                } catch (Exception unused8) {
                                }
                                cls = String.class;
                                if (invoke == null) {
                                    if (alpha5 != null) {
                                        byte[] bArr11 = hotel;
                                        c12 = 822;
                                        String concat = alpha(bArr11[c10], (short) 1036, bArr11[822]).concat(alpha5);
                                        int i38 = lima;
                                        mike = (((i38 | 113) << 1) - (i38 ^ 113)) % 128;
                                        try {
                                            Object[] objArr4 = {concat};
                                            byte b6 = (byte) (india & 368);
                                            invoke = Class.forName(alpha(b6, (short) ((b6 ^ 1296) | (b6 & 1296)), bArr11[0])).getDeclaredConstructor(cls).newInstance(objArr4);
                                            if (invoke3 == null) {
                                                c13 = '1';
                                            } else {
                                                byte[] bArr12 = hotel;
                                                try {
                                                    c13 = '1';
                                                    try {
                                                        Object[] objArr5 = {Class.forName(alpha(bArr12[124], (short) 1013, bArr12[0])).getMethod(alpha(bArr12[c10], (short) 998, bArr12[4]), cls).invoke(null, alpha(bArr12[49], (short) 1026, bArr12[0]))};
                                                        byte b10 = (byte) (india & 368);
                                                        invoke3 = Class.forName(alpha(b10, (short) (b10 | 1296), bArr12[0])).getDeclaredConstructor(cls).newInstance(objArr5);
                                                    } catch (Throwable th) {
                                                        Throwable cause2 = th.getCause();
                                                        if (cause2 == null) {
                                                            throw th;
                                                        }
                                                        throw cause2;
                                                    }
                                                } catch (Throwable th2) {
                                                    Throwable cause3 = th2.getCause();
                                                    if (cause3 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause3;
                                                }
                                            }
                                            if (invoke2 == null && invoke != null) {
                                                try {
                                                    Object[] objArr6 = {invoke, alpha((byte) (-hotel[132]), (short) 988, r0[85])};
                                                    byte b11 = (byte) (india & 368);
                                                    short s17 = (short) ((b11 ^ 1296) | (b11 & 1296));
                                                    invoke2 = Class.forName(alpha(b11, s17, r0[0])).getDeclaredConstructor(Class.forName(alpha(b11, s17, r0[0])), cls).newInstance(objArr6);
                                                } catch (Throwable th3) {
                                                    Throwable cause4 = th3.getCause();
                                                    if (cause4 == null) {
                                                        throw th3;
                                                    }
                                                    throw cause4;
                                                }
                                            }
                                            byte b422 = (byte) (india & 368);
                                            byte[] bArr822 = hotel;
                                            objArr = (Object[]) Array.newInstance(Class.forName(alpha(b422, (short) ((b422 ^ 1296) | (b422 & 1296)), bArr822[0])), 7);
                                            objArr[0] = null;
                                            objArr[1] = invoke2;
                                            objArr[2] = invoke;
                                            objArr[3] = invoke3;
                                            objArr[4] = invoke2;
                                            objArr[i5] = invoke;
                                            objArr[6] = invoke3;
                                            zArr = new boolean[]{false, true, true, true, true, true, true};
                                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                            zArr3 = new boolean[7];
                                            zArr3[0] = false;
                                            zArr3[1] = false;
                                            zArr3[2] = true;
                                            zArr3[3] = true;
                                            zArr3[4] = false;
                                            zArr3[i5] = true;
                                            zArr3[6] = true;
                                            c14 = 19;
                                            i10 = 6;
                                            Class<?> cls1122 = Class.forName(alpha(bArr822[719], (short) 979, bArr822[22]));
                                            i11 = cls1122.getDeclaredField(alpha(bArr822[19], (short) 956, bArr822[95])).getInt(cls1122);
                                            boolean z18 = i11 < 34;
                                            if (i11 == 29) {
                                                int i39 = lima + 87;
                                                mike = i39 % 128;
                                                if (i39 % 2 == 0) {
                                                    i27 = 26;
                                                    z15 = false;
                                                    zArr3[0] = z15;
                                                    if (i11 >= i27) {
                                                        z16 = true;
                                                    } else {
                                                        int i40 = lima;
                                                        mike = (((i40 | 31) << 1) - (i40 ^ 31)) % 128;
                                                        z16 = false;
                                                    }
                                                    echo = z16;
                                                    zArr3[1] = i11 < 21;
                                                    if (i11 < 21) {
                                                        int i41 = mike;
                                                        lima = (((i41 | 47) << 1) - (i41 ^ 47)) % 128;
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    zArr3[4] = z17;
                                                    z2 = z18;
                                                    i12 = i11;
                                                    i13 = 1;
                                                    i14 = 0;
                                                    bArr = null;
                                                    loop0: while (bArr == null) {
                                                        int i42 = lima + 77;
                                                        cls2 = cls7;
                                                        int i43 = i42 % 128;
                                                        mike = i43;
                                                        if (i42 % 2 == 0) {
                                                            throw null;
                                                        }
                                                        if (i14 >= i4) {
                                                            return;
                                                        }
                                                        if (zArr3[i14]) {
                                                            i15 = i14;
                                                            try {
                                                                z11 = zArr[i15];
                                                                obj2 = objArr[i15];
                                                                z12 = zArr2[i15];
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cls3 = cls8;
                                                                str = alpha2;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (z11) {
                                                                                                            int i44 = (i43 ^ 7) + ((i43 & 7) << 1);
                                                                                                            int i45 = i44 % 128;
                                                                                                            lima = i45;
                                                                                                            if (i44 % 2 != 0) {
                                                                                                                try {
                                                                                                                    int i46 = 59 / 0;
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    cls3 = cls8;
                                                                                                                    str = alpha2;
                                                                                                                    z10 = z2;
                                                                                                                    zArr4 = zArr;
                                                                                                                    objArr2 = objArr;
                                                                                                                    bArr2 = bArr;
                                                                                                                    cls4 = cls;
                                                                                                                    i16 = i4;
                                                                                                                    zArr5 = zArr2;
                                                                                                                    zArr6 = zArr3;
                                                                                                                    i18 = (i15 & 1) + (i15 | 1);
                                                                                                                    while (i18 < 7) {
                                                                                                                    }
                                                                                                                    byte[] bArr13 = hotel;
                                                                                                                    try {
                                                                                                                        Object[] objArr7 = {alpha(bArr13[161], bArr13[133], bArr13[23]), th};
                                                                                                                        byte b12 = bArr13[147];
                                                                                                                        throw ((Throwable) Class.forName(alpha((byte) ((b12 ^ (-1)) + (b12 << 1)), (short) 939, bArr13[0])).getDeclaredConstructor(cls4, cls3).newInstance(objArr7));
                                                                                                                    } catch (Throwable th6) {
                                                                                                                        Throwable cause5 = th6.getCause();
                                                                                                                        if (cause5 == null) {
                                                                                                                            throw th6;
                                                                                                                        }
                                                                                                                        throw cause5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            i13 = 1;
                                                                                                            i14 = i15 + 1;
                                                                                                            cls7 = cls2;
                                                                                                            z2 = z10;
                                                                                                            cls8 = cls3;
                                                                                                            alpha2 = str;
                                                                                                            objArr = objArr2;
                                                                                                            zArr = zArr4;
                                                                                                            cls = cls4;
                                                                                                            i4 = i16;
                                                                                                            zArr2 = zArr5;
                                                                                                            zArr3 = zArr6;
                                                                                                            i36 = 3;
                                                                                                            i10 = 6;
                                                                                                            bArr = r11;
                                                                                                        } else {
                                                                                                            cls3 = cls8;
                                                                                                            str = alpha2;
                                                                                                        }
                                                                                                        short s18 = (short) 882;
                                                                                                        Class.forName(alpha(r2[161], s10, r2[i29])).getMethod(alpha(r2[187], s18, r2[85]), null).invoke(r4, null);
                                                                                                        i19 = 14014;
                                                                                                        s11 = r12;
                                                                                                        i20 = 22;
                                                                                                        String str2 = str;
                                                                                                        Class cls14 = null;
                                                                                                        while (true) {
                                                                                                            j5 = 1;
                                                                                                            try {
                                                                                                                length = bArr4.length;
                                                                                                                int i47 = i19;
                                                                                                                i21 = i29;
                                                                                                                while (i21 < length) {
                                                                                                                    int i48 = i21;
                                                                                                                    lima = (mike + 95) % 128;
                                                                                                                    long j6 = j5;
                                                                                                                    j5 = ((bArr4[i48] + (j6 << i10)) + (j6 << 16)) - j6;
                                                                                                                    i21 = (i48 ^ 1) + ((i48 & 1) << 1);
                                                                                                                }
                                                                                                                ?? r74 = j5;
                                                                                                                byte b13 = bArr4[(i20 & 14039) + (i20 | 14039)];
                                                                                                                bArr4[i20 + 275] = (byte) ((b13 & 79) + (b13 | 79));
                                                                                                                r4 = (bArr4.length - (~(-i20))) - 1;
                                                                                                                try {
                                                                                                                    Object[] objArr8 = new Object[i36];
                                                                                                                    objArr8[2] = Integer.valueOf((int) r4);
                                                                                                                    objArr8[1] = Integer.valueOf(i20);
                                                                                                                    objArr8[i29] = bArr4;
                                                                                                                    byte[] bArr14 = hotel;
                                                                                                                    byte b14 = bArr14[587];
                                                                                                                    Class<?> cls15 = Class.forName(alpha(b14, (short) ((b14 ^ 650) | (b14 & 650)), bArr14[i29]));
                                                                                                                    Class<?>[] clsArr = new Class[3];
                                                                                                                    clsArr[i29] = byte[].class;
                                                                                                                    clsArr[1] = cls2;
                                                                                                                    clsArr[2] = cls2;
                                                                                                                    r4 = cls15.getDeclaredConstructor(clsArr).newInstance(objArr8);
                                                                                                                    obj8 = alpha;
                                                                                                                    if (obj8 != null) {
                                                                                                                        int i49 = i29;
                                                                                                                        try {
                                                                                                                            int deadChar = (-1175208473) - KeyEvent.getDeadChar(i49, i49);
                                                                                                                            zArr6 = zArr3;
                                                                                                                            int elapsedRealtime = (int) (r74 ^ (5802930897921166363L - (SystemClock.elapsedRealtime() >> 48)));
                                                                                                                            try {
                                                                                                                                i22 = i20;
                                                                                                                                int[] iArr = new int[TextUtils.indexOf("", "", 0, 0) + 2];
                                                                                                                                int i50 = (-2) - ((-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))) ^ (-1));
                                                                                                                                long j7 = foxtrot;
                                                                                                                                cls5 = cls14;
                                                                                                                                s12 = s10;
                                                                                                                                int elapsedRealtimeNanos = (int) (j7 >>> ((byte) (r74 ^ ((SystemClock.elapsedRealtimeNanos() >> 60) + 5802930897921166394L))));
                                                                                                                                iArr[i50] = ((~elapsedRealtimeNanos) & deadChar) | ((~deadChar) & elapsedRealtimeNanos);
                                                                                                                                iArr[(int) (r74 ^ (5802930897921166363L - (SystemClock.currentThreadTimeMillis() >> 48)))] = ((int) j7) ^ deadChar;
                                                                                                                                int i51 = golf;
                                                                                                                                ?? myTid = Process.myTid() >> 22;
                                                                                                                                try {
                                                                                                                                    ?? r13 = new Object[i10];
                                                                                                                                    r13[5] = Integer.valueOf(elapsedRealtime);
                                                                                                                                    r13[4] = Boolean.valueOf((boolean) myTid);
                                                                                                                                    r13[3] = Integer.valueOf(i51);
                                                                                                                                    r13[2] = 0;
                                                                                                                                    r13[1] = iArr;
                                                                                                                                    r13[0] = r4;
                                                                                                                                    byte b15 = bArr14[458];
                                                                                                                                    obj9 = Class.forName(alpha(b15, (short) ((b15 ^ 641) | (b15 & 641)), bArr14[85])).getDeclaredConstructor(Class.forName(alpha((byte) ((-2) - (bArr14[147] ^ (-1))), s9, bArr14[0])), int[].class, byte[].class, cls2, Boolean.TYPE, cls2).newInstance(r13);
                                                                                                                                    Class.forName(alpha((byte) (bArr14[147] - 1), s9, bArr14[0])).getMethod(alpha(bArr14[c12], (short) 542, bArr14[c16]), Long.TYPE).invoke(obj9, 22);
                                                                                                                                    if (!z11) {
                                                                                                                                        int i52 = mike;
                                                                                                                                        lima = ((i52 ^ 101) + ((i52 & 101) << 1)) % 128;
                                                                                                                                        Object obj18 = obj8 == null ? obj4 : obj5;
                                                                                                                                        Object obj19 = obj8 == null ? obj6 : obj3;
                                                                                                                                        try {
                                                                                                                                            c17 = 131;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            zipFile3 = zipFile;
                                                                                                                                            zipFile4 = zipFile3;
                                                                                                                                            if (zipFile4 != null) {
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            Method method = Class.forName(alpha((byte) (bArr14[147] - 1), s9, bArr14[0])).getMethod(alpha(bArr14[c12], (short) 539, bArr14[41]), byte[].class, cls2, cls2);
                                                                                                                                            Class<?> cls16 = Class.forName(alpha(bArr14[719], (short) 905, bArr14[0]));
                                                                                                                                            try {
                                                                                                                                                byte b16 = (byte) (india & 368);
                                                                                                                                                short s19 = (short) ((b16 & 1296) | (b16 ^ 1296));
                                                                                                                                                i17 = i12;
                                                                                                                                                try {
                                                                                                                                                    r74 = zipFile;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            Object newInstance = cls16.getConstructor(Class.forName(alpha(b16, s19, bArr14[0]))).newInstance(obj18);
                                                                                                                                                            if (z10) {
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName(alpha(b16, s19, bArr14[0])).getMethod(alpha(bArr14[c10], (short) 536, bArr14[c16]), null).invoke(obj18, null)).getClass();
                                                                                                                                                                } catch (Throwable th8) {
                                                                                                                                                                    Throwable cause6 = th8.getCause();
                                                                                                                                                                    if (cause6 == null) {
                                                                                                                                                                        throw th8;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause6;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            int i53 = Barcode.FORMAT_UPC_E;
                                                                                                                                                            byte[] bArr15 = new byte[Barcode.FORMAT_UPC_E];
                                                                                                                                                            int i54 = 0;
                                                                                                                                                            Method method2 = cls16.getMethod(alpha(bArr14[187], (short) 522, bArr14[7]), byte[].class, cls2, cls2);
                                                                                                                                                            int i55 = i47;
                                                                                                                                                            Object obj20 = obj9;
                                                                                                                                                            while (i55 > 0) {
                                                                                                                                                                Integer valueOf = Integer.valueOf(i54);
                                                                                                                                                                Integer valueOf2 = Integer.valueOf(Math.min(i53, i55));
                                                                                                                                                                byte[] bArr16 = bArr15;
                                                                                                                                                                Object[] objArr9 = new Object[3];
                                                                                                                                                                objArr9[i54] = bArr16;
                                                                                                                                                                objArr9[1] = valueOf;
                                                                                                                                                                objArr9[2] = valueOf2;
                                                                                                                                                                Integer num = (Integer) method.invoke(obj20, objArr9);
                                                                                                                                                                int intValue = num.intValue();
                                                                                                                                                                if (intValue == i28) {
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                int i56 = mike;
                                                                                                                                                                int i57 = (i56 & 45) + (i56 | 45);
                                                                                                                                                                Object obj21 = obj20;
                                                                                                                                                                lima = i57 % 128;
                                                                                                                                                                if (i57 % 2 != 0) {
                                                                                                                                                                    Object[] objArr10 = new Object[2];
                                                                                                                                                                    objArr10[1] = bArr16;
                                                                                                                                                                    objArr10[0] = 1;
                                                                                                                                                                    objArr10[5] = num;
                                                                                                                                                                    method2.invoke(newInstance, objArr10);
                                                                                                                                                                    i55 %= intValue;
                                                                                                                                                                } else {
                                                                                                                                                                    method2.invoke(newInstance, bArr16, 0, num);
                                                                                                                                                                    i55 = (i55 - (~(-intValue))) - 1;
                                                                                                                                                                }
                                                                                                                                                                obj20 = obj21;
                                                                                                                                                                bArr15 = bArr16;
                                                                                                                                                                i53 = Barcode.FORMAT_UPC_E;
                                                                                                                                                                i28 = -1;
                                                                                                                                                                i54 = 0;
                                                                                                                                                            }
                                                                                                                                                            if (echo) {
                                                                                                                                                                int i58 = lima;
                                                                                                                                                                mike = ((i58 ^ 83) + ((i58 & 83) << 1)) % 128;
                                                                                                                                                                byte[] bArr17 = hotel;
                                                                                                                                                                Object invoke5 = cls16.getMethod(alpha(bArr17[187], (short) 518, bArr17[4]), null).invoke(newInstance, null);
                                                                                                                                                                Class<?> cls17 = Class.forName(alpha(bArr17[81], (short) 514, bArr17[0]));
                                                                                                                                                                byte b17 = bArr17[c12];
                                                                                                                                                                cls17.getMethod(alpha(b17, (short) ((b17 ^ 421) | (b17 & 421)), bArr17[c16]), null).invoke(invoke5, null);
                                                                                                                                                            }
                                                                                                                                                            byte[] bArr18 = hotel;
                                                                                                                                                            cls16.getMethod(alpha(bArr18[187], s18, bArr18[85]), null).invoke(newInstance, null);
                                                                                                                                                            Method declaredMethod = Class.forName(alpha(bArr18[c4], (short) 490, bArr18[131])).getDeclaredMethod(alpha(bArr18[c14], (short) 470, bArr18[195]), cls4, cls4, cls2);
                                                                                                                                                            try {
                                                                                                                                                                int i59 = india;
                                                                                                                                                                byte b18 = (byte) (i59 & 368);
                                                                                                                                                                short s20 = (short) ((b18 ^ 1296) | (b18 & 1296));
                                                                                                                                                                short s21 = (short) 1313;
                                                                                                                                                                try {
                                                                                                                                                                    obj10 = declaredMethod.invoke(null, Class.forName(alpha(b18, s20, bArr18[0])).getMethod(alpha((byte) (-bArr18[c11]), s21, bArr18[4]), null).invoke(obj18, null), Class.forName(alpha(b18, s20, bArr18[0])).getMethod(alpha((byte) (-bArr18[c11]), s21, bArr18[4]), null).invoke(obj19, null), 0);
                                                                                                                                                                    try {
                                                                                                                                                                        byte b19 = (byte) (i59 & 382);
                                                                                                                                                                        short s22 = (short) 464;
                                                                                                                                                                        ((Boolean) Class.forName(alpha(b18, s20, bArr18[0])).getMethod(alpha(b19, s22, bArr18[131]), null).invoke(obj18, null)).getClass();
                                                                                                                                                                        try {
                                                                                                                                                                            ((Boolean) Class.forName(alpha(b18, s20, bArr18[0])).getMethod(alpha(b19, s22, bArr18[131]), null).invoke(obj19, null)).getClass();
                                                                                                                                                                            if (bravo == null) {
                                                                                                                                                                                try {
                                                                                                                                                                                    bravo = Class.class.getMethod(alpha(bArr18[c13], (short) 459, bArr18[4]), null).invoke(uH18377.class, null);
                                                                                                                                                                                } catch (Throwable th9) {
                                                                                                                                                                                    Throwable cause7 = th9.getCause();
                                                                                                                                                                                    if (cause7 == null) {
                                                                                                                                                                                        throw th9;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw cause7;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            s13 = s9;
                                                                                                                                                                            i5 = 5;
                                                                                                                                                                            zipFile5 = r74;
                                                                                                                                                                            try {
                                                                                                                                                                                z14 = !z11;
                                                                                                                                                                                if (z14) {
                                                                                                                                                                                    byte[] bArr19 = hotel;
                                                                                                                                                                                    Class<?> cls18 = Class.forName(alpha(bArr19[c4], (short) 490, bArr19[c17]));
                                                                                                                                                                                    Method declaredMethod2 = cls18.getDeclaredMethod(alpha(bArr19[c15], (short) 166, bArr19[195]), cls4, Class.forName(alpha(bArr19[c4], (short) 297, bArr19[0])));
                                                                                                                                                                                    declaredMethod2.setAccessible(true);
                                                                                                                                                                                    try {
                                                                                                                                                                                        ?? invoke6 = declaredMethod2.invoke(obj10, str2, Class.class.getMethod(alpha(bArr19[c13], (short) 459, bArr19[4]), null).invoke(uH18377.class, null));
                                                                                                                                                                                        if (invoke6 != null) {
                                                                                                                                                                                            cls18.getDeclaredMethod(alpha(bArr19[187], s18, bArr19[85]), null).invoke(obj10, null);
                                                                                                                                                                                        }
                                                                                                                                                                                        cls6 = invoke6;
                                                                                                                                                                                    } catch (Throwable th10) {
                                                                                                                                                                                        Throwable cause8 = th10.getCause();
                                                                                                                                                                                        if (cause8 == null) {
                                                                                                                                                                                            throw th10;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause8;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    byte[] bArr20 = hotel;
                                                                                                                                                                                    Method declaredMethod3 = Class.forName(alpha(bArr20[c4], (short) 297, bArr20[0])).getDeclaredMethod(alpha(bArr20[c15], (short) 166, bArr20[195]), cls4);
                                                                                                                                                                                    try {
                                                                                                                                                                                        declaredMethod3.setAccessible(true);
                                                                                                                                                                                        cls6 = declaredMethod3.invoke(obj10, str2);
                                                                                                                                                                                    } catch (InvocationTargetException e) {
                                                                                                                                                                                        try {
                                                                                                                                                                                            throw ((Exception) e.getCause());
                                                                                                                                                                                            break loop0;
                                                                                                                                                                                        } catch (ClassNotFoundException unused9) {
                                                                                                                                                                                            cls6 = null;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (cls6 != null) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                cls14 = cls6;
                                                                                                                                                                                byte[] bArr21 = hotel;
                                                                                                                                                                                str2 = alpha(bArr21[272], (short) 158, bArr21[85]);
                                                                                                                                                                                try {
                                                                                                                                                                                    Constructor declaredConstructor = cls14.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                                                                    declaredConstructor.setAccessible(true);
                                                                                                                                                                                    alpha = declaredConstructor.newInstance(obj10, Boolean.valueOf(z14));
                                                                                                                                                                                    bArr5 = new byte[165918];
                                                                                                                                                                                    if (z13) {
                                                                                                                                                                                        mike = (lima + 123) % 128;
                                                                                                                                                                                        zipFile7 = zipFile5;
                                                                                                                                                                                        try {
                                                                                                                                                                                            resourceAsStream2 = zipFile7.getInputStream(zipFile7.getEntry(alpha(bArr21[54], (short) 106, bArr21[c12]).substring(1)));
                                                                                                                                                                                            zipFile7 = zipFile7;
                                                                                                                                                                                        } catch (Throwable th11) {
                                                                                                                                                                                            th = th11;
                                                                                                                                                                                            zipFile6 = zipFile7;
                                                                                                                                                                                            zipFile4 = zipFile6;
                                                                                                                                                                                            if (zipFile4 != null) {
                                                                                                                                                                                                zipFile4.close();
                                                                                                                                                                                            }
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        zipFile7 = zipFile5;
                                                                                                                                                                                        resourceAsStream2 = uH18377.class.getResourceAsStream(alpha(bArr21[54], (short) 106, bArr21[c12]));
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        s14 = s13;
                                                                                                                                                                                        try {
                                                                                                                                                                                            s15 = s12;
                                                                                                                                                                                            Object newInstance2 = Class.forName(alpha(bArr21[161], s15, bArr21[0])).getDeclaredConstructor(Class.forName(alpha((byte) (bArr21[147] - 1), s14, bArr21[0]))).newInstance(Class.forName(alpha(bArr21[598], s3, bArr21[0])).getDeclaredConstructor(Class.forName(alpha((byte) (bArr21[147] - 1), s14, bArr21[0]))).newInstance(resourceAsStream2));
                                                                                                                                                                                            try {
                                                                                                                                                                                                s16 = s11;
                                                                                                                                                                                                Class.forName(alpha(bArr21[161], s15, bArr21[0])).getMethod(alpha(bArr21[c15], s16, bArr21[41]), byte[].class).invoke(newInstance2, bArr5);
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Class.forName(alpha(bArr21[161], s15, bArr21[0])).getMethod(alpha(bArr21[187], s18, bArr21[85]), null).invoke(newInstance2, null);
                                                                                                                                                                                                    zipFile = zipFile7;
                                                                                                                                                                                                    s10 = s15;
                                                                                                                                                                                                    s9 = s14;
                                                                                                                                                                                                    s11 = s16;
                                                                                                                                                                                                    zArr3 = zArr6;
                                                                                                                                                                                                    i28 = -1;
                                                                                                                                                                                                    i29 = 0;
                                                                                                                                                                                                    i36 = 3;
                                                                                                                                                                                                    i20 = Math.abs(i22);
                                                                                                                                                                                                    i19 = 165871;
                                                                                                                                                                                                    bArr4 = bArr5;
                                                                                                                                                                                                    i12 = i17;
                                                                                                                                                                                                    i10 = 6;
                                                                                                                                                                                                } catch (Throwable th12) {
                                                                                                                                                                                                    Throwable cause9 = th12.getCause();
                                                                                                                                                                                                    if (cause9 == null) {
                                                                                                                                                                                                        throw th12;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw cause9;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th13) {
                                                                                                                                                                                                Throwable cause10 = th13.getCause();
                                                                                                                                                                                                if (cause10 == null) {
                                                                                                                                                                                                    throw th13;
                                                                                                                                                                                                }
                                                                                                                                                                                                throw cause10;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th14) {
                                                                                                                                                                                            Throwable cause11 = th14.getCause();
                                                                                                                                                                                            if (cause11 == null) {
                                                                                                                                                                                                throw th14;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw cause11;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th15) {
                                                                                                                                                                                        Throwable cause12 = th15.getCause();
                                                                                                                                                                                        if (cause12 == null) {
                                                                                                                                                                                            throw th15;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause12;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th16) {
                                                                                                                                                                                    th = th16;
                                                                                                                                                                                    zipFile6 = zipFile5;
                                                                                                                                                                                    zipFile4 = zipFile6;
                                                                                                                                                                                    if (zipFile4 != null) {
                                                                                                                                                                                    }
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th17) {
                                                                                                                                                                                th = th17;
                                                                                                                                                                                zipFile6 = zipFile5;
                                                                                                                                                                                zipFile4 = zipFile6;
                                                                                                                                                                                if (zipFile4 != null) {
                                                                                                                                                                                }
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th18) {
                                                                                                                                                                            Throwable cause13 = th18.getCause();
                                                                                                                                                                            if (cause13 == null) {
                                                                                                                                                                                throw th18;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause13;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th19) {
                                                                                                                                                                        Throwable cause14 = th19.getCause();
                                                                                                                                                                        if (cause14 == null) {
                                                                                                                                                                            throw th19;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause14;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th20) {
                                                                                                                                                                    Throwable cause15 = th20.getCause();
                                                                                                                                                                    if (cause15 == null) {
                                                                                                                                                                        throw th20;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause15;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th21) {
                                                                                                                                                                Throwable cause16 = th21.getCause();
                                                                                                                                                                if (cause16 == null) {
                                                                                                                                                                    throw th21;
                                                                                                                                                                }
                                                                                                                                                                throw cause16;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th22) {
                                                                                                                                                            th = th22;
                                                                                                                                                            r74 = r74;
                                                                                                                                                            try {
                                                                                                                                                                int i60 = india;
                                                                                                                                                                byte b20 = (byte) (i60 & 368);
                                                                                                                                                                short s23 = (short) ((b20 ^ 1296) | (b20 & 1296));
                                                                                                                                                                byte[] bArr22 = hotel;
                                                                                                                                                                byte b21 = (byte) (i60 & 382);
                                                                                                                                                                short s24 = (short) 464;
                                                                                                                                                                ((Boolean) Class.forName(alpha(b20, s23, bArr22[0])).getMethod(alpha(b21, s24, bArr22[131]), null).invoke(obj18, null)).getClass();
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName(alpha(b20, s23, bArr22[0])).getMethod(alpha(b21, s24, bArr22[131]), null).invoke(obj19, null)).getClass();
                                                                                                                                                                    throw th;
                                                                                                                                                                } catch (Throwable th23) {
                                                                                                                                                                    Throwable cause17 = th23.getCause();
                                                                                                                                                                    if (cause17 == null) {
                                                                                                                                                                        throw th23;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause17;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th24) {
                                                                                                                                                                Throwable cause18 = th24.getCause();
                                                                                                                                                                if (cause18 == null) {
                                                                                                                                                                    throw th24;
                                                                                                                                                                }
                                                                                                                                                                throw cause18;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Exception e4) {
                                                                                                                                                        e = e4;
                                                                                                                                                        r74 = r74;
                                                                                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                                                                                        byte[] bArr23 = hotel;
                                                                                                                                                        sb2.append(alpha(bArr23[187], (short) 526, bArr23[23]));
                                                                                                                                                        sb2.append(obj18);
                                                                                                                                                        byte b22 = bArr23[963];
                                                                                                                                                        short s25 = (short) 939;
                                                                                                                                                        sb2.append(alpha((byte) ((b22 & 1) + (b22 | 1)), s25, (byte) (bArr23[968] - 1)));
                                                                                                                                                        try {
                                                                                                                                                            throw ((Throwable) Class.forName(alpha((byte) (bArr23[147] - 1), s25, bArr23[0])).getDeclaredConstructor(cls4, cls3).newInstance(sb2.toString(), e));
                                                                                                                                                        } catch (Throwable th25) {
                                                                                                                                                            Throwable cause19 = th25.getCause();
                                                                                                                                                            if (cause19 == null) {
                                                                                                                                                                throw th25;
                                                                                                                                                            }
                                                                                                                                                            throw cause19;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } catch (Exception e5) {
                                                                                                                                                    e = e5;
                                                                                                                                                    r74 = zipFile;
                                                                                                                                                    StringBuilder sb22 = new StringBuilder();
                                                                                                                                                    byte[] bArr232 = hotel;
                                                                                                                                                    sb22.append(alpha(bArr232[187], (short) 526, bArr232[23]));
                                                                                                                                                    sb22.append(obj18);
                                                                                                                                                    byte b222 = bArr232[963];
                                                                                                                                                    short s252 = (short) 939;
                                                                                                                                                    sb22.append(alpha((byte) ((b222 & 1) + (b222 | 1)), s252, (byte) (bArr232[968] - 1)));
                                                                                                                                                    throw ((Throwable) Class.forName(alpha((byte) (bArr232[147] - 1), s252, bArr232[0])).getDeclaredConstructor(cls4, cls3).newInstance(sb22.toString(), e));
                                                                                                                                                } catch (Throwable th26) {
                                                                                                                                                    th = th26;
                                                                                                                                                    r74 = zipFile;
                                                                                                                                                    int i602 = india;
                                                                                                                                                    byte b202 = (byte) (i602 & 368);
                                                                                                                                                    short s232 = (short) ((b202 ^ 1296) | (b202 & 1296));
                                                                                                                                                    byte[] bArr222 = hotel;
                                                                                                                                                    byte b212 = (byte) (i602 & 382);
                                                                                                                                                    short s242 = (short) 464;
                                                                                                                                                    ((Boolean) Class.forName(alpha(b202, s232, bArr222[0])).getMethod(alpha(b212, s242, bArr222[131]), null).invoke(obj18, null)).getClass();
                                                                                                                                                    ((Boolean) Class.forName(alpha(b202, s232, bArr222[0])).getMethod(alpha(b212, s242, bArr222[131]), null).invoke(obj19, null)).getClass();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Exception e10) {
                                                                                                                                                e = e10;
                                                                                                                                                i17 = i12;
                                                                                                                                            } catch (Throwable th27) {
                                                                                                                                                th = th27;
                                                                                                                                                i17 = i12;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th28) {
                                                                                                                                            th = th28;
                                                                                                                                            i17 = i12;
                                                                                                                                            r74 = zipFile;
                                                                                                                                            zipFile3 = r74;
                                                                                                                                            zipFile4 = zipFile3;
                                                                                                                                            if (zipFile4 != null) {
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        try {
                                                                                                                                            i17 = i12;
                                                                                                                                            Object obj22 = obj9;
                                                                                                                                            ZipFile zipFile8 = zipFile;
                                                                                                                                            c17 = 131;
                                                                                                                                            byte b23 = bArr14[587];
                                                                                                                                            Class<?> cls19 = Class.forName(alpha(b23, (short) ((b23 ^ 398) | (b23 & 398)), bArr14[0]));
                                                                                                                                            byte b24 = bArr14[147];
                                                                                                                                            Class<?> cls20 = Class.forName(alpha((byte) ((b24 ^ (-1)) + (b24 << 1)), s9, bArr14[0]));
                                                                                                                                            Object newInstance3 = cls19.getConstructor(cls20).newInstance(obj22);
                                                                                                                                            Object invoke7 = cls19.getMethod(alpha((byte) (india & 368), (short) 419, bArr14[4]), null).invoke(newInstance3, null);
                                                                                                                                            Method method3 = Class.forName(alpha(bArr14[81], (short) HttpConstants.HTTP_CLIENT_TIMEOUT, bArr14[0])).getMethod(alpha(bArr14[c14], (short) 387, bArr14[4]), null);
                                                                                                                                            r4 = cls20.getMethod(alpha(bArr14[c12], (short) 539, bArr14[41]), byte[].class);
                                                                                                                                            try {
                                                                                                                                                Object newInstance4 = Class.forName(alpha(bArr14[598], s3, bArr14[0])).getDeclaredConstructor(Class.forName(alpha((byte) (bArr14[147] - 1), s9, bArr14[0]))).newInstance(newInstance3);
                                                                                                                                                try {
                                                                                                                                                    Object invoke8 = Class.class.getMethod(alpha(bArr14[c13], (short) 459, bArr14[4]), null).invoke(uH18377.class, null);
                                                                                                                                                    int longValue = (int) ((Long) method3.invoke(invoke7, null)).longValue();
                                                                                                                                                    byte b25 = (byte) ((-2) - (bArr14[147] ^ (-1)));
                                                                                                                                                    Class<?> cls21 = Class.forName(alpha(b25, (short) (b25 | 324), bArr14[0]));
                                                                                                                                                    Object invoke9 = cls21.getMethod(alpha(bArr14[c13], (short) 363, bArr14[22]), cls2).invoke(null, Integer.valueOf(longValue));
                                                                                                                                                    Method method4 = cls21.getMethod(alpha(bArr14[386], (short) 350, bArr14[421]), byte[].class, cls2, cls2);
                                                                                                                                                    Method method5 = Class.forName(alpha(bArr14[222], (short) 348, bArr14[0])).getMethod(alpha(bArr14[187], s18, bArr14[85]), null);
                                                                                                                                                    byte[] bArr24 = new byte[Barcode.FORMAT_UPC_E];
                                                                                                                                                    s13 = s9;
                                                                                                                                                    int i61 = 0;
                                                                                                                                                    Method method6 = r4;
                                                                                                                                                    while (true) {
                                                                                                                                                        Integer num2 = (Integer) method6.invoke(newInstance4, bArr24);
                                                                                                                                                        int intValue2 = num2.intValue();
                                                                                                                                                        if (intValue2 <= 0) {
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        int i62 = lima;
                                                                                                                                                        mike = ((i62 ^ 69) + ((i62 & 69) << 1)) % 128;
                                                                                                                                                        if (i61 >= longValue) {
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        Method method7 = method6;
                                                                                                                                                        method4.invoke(invoke9, bArr24, 0, num2);
                                                                                                                                                        i61 += intValue2;
                                                                                                                                                        method6 = method7;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        method5.invoke(newInstance4, null);
                                                                                                                                                    } catch (Exception unused10) {
                                                                                                                                                    }
                                                                                                                                                    byte[] bArr25 = hotel;
                                                                                                                                                    Class<?> cls22 = Class.forName(alpha(bArr25[34], (short) 332, bArr25[131]));
                                                                                                                                                    byte b26 = bArr25[147];
                                                                                                                                                    byte b27 = (byte) ((b26 ^ (-1)) + (b26 << 1));
                                                                                                                                                    Constructor<?> declaredConstructor2 = cls22.getDeclaredConstructor(Class.forName(alpha(b27, (short) ((b27 ^ 324) | (b27 & 324)), bArr25[0])), Class.forName(alpha(bArr25[c4], (short) 297, bArr25[0])));
                                                                                                                                                    Method method8 = cls21.getMethod(alpha(bArr25[433], (short) 277, bArr25[421]), cls2);
                                                                                                                                                    method8.invoke(invoke9, 0);
                                                                                                                                                    Object newInstance5 = declaredConstructor2.newInstance(invoke9, invoke8);
                                                                                                                                                    method8.invoke(invoke9, 0);
                                                                                                                                                    Arrays.fill(bArr24, (byte) 0);
                                                                                                                                                    method4.invoke(invoke9, bArr24, 0, Integer.valueOf(Math.min(Barcode.FORMAT_QR_CODE, longValue)));
                                                                                                                                                    try {
                                                                                                                                                        Class<?> cls23 = Class.forName(alpha(bArr25[949], (short) 270, bArr25[131]));
                                                                                                                                                        byte b28 = bArr25[433];
                                                                                                                                                        Field declaredField = cls23.getDeclaredField(alpha(b28, (short) ((b28 ^ 171) | (b28 & 171)), bArr25[421]));
                                                                                                                                                        declaredField.setAccessible(true);
                                                                                                                                                        Object obj23 = declaredField.get(invoke8);
                                                                                                                                                        Class<?> cls24 = obj23.getClass();
                                                                                                                                                        Field declaredField2 = cls24.getDeclaredField(alpha(bArr25[719], (short) 232, bArr25[14]));
                                                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                                                        Field declaredField3 = cls24.getDeclaredField(alpha(bArr25[593], (short) 209, bArr25[14]));
                                                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                                                        Object obj24 = declaredField2.get(obj23);
                                                                                                                                                        Object obj25 = declaredField3.get(obj23);
                                                                                                                                                        Object obj26 = declaredField.get(newInstance5);
                                                                                                                                                        ArrayList arrayList = new ArrayList((List) obj24);
                                                                                                                                                        Class<?> cls25 = obj25.getClass();
                                                                                                                                                        int i63 = mike;
                                                                                                                                                        i5 = 5;
                                                                                                                                                        lima = (((i63 | 5) << 1) - (i63 ^ 5)) % 128;
                                                                                                                                                        try {
                                                                                                                                                            Class cls26 = (Class) Class.class.getMethod(alpha(bArr25[124], (short) 185, bArr25[4]), null).invoke(cls25, null);
                                                                                                                                                            try {
                                                                                                                                                                int length2 = Array.getLength(obj25);
                                                                                                                                                                Object newInstance6 = Array.newInstance((Class<?>) cls26, length2);
                                                                                                                                                                for (int i64 = 0; i64 < length2; i64++) {
                                                                                                                                                                    Array.set(newInstance6, i64, Array.get(obj25, i64));
                                                                                                                                                                }
                                                                                                                                                                declaredField2.set(obj26, arrayList);
                                                                                                                                                                declaredField3.set(obj26, newInstance6);
                                                                                                                                                                if (bravo == null) {
                                                                                                                                                                    int i65 = mike + 7;
                                                                                                                                                                    lima = i65 % 128;
                                                                                                                                                                    if (i65 % 2 == 0) {
                                                                                                                                                                        bravo = newInstance5;
                                                                                                                                                                    } else {
                                                                                                                                                                        bravo = newInstance5;
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                obj10 = newInstance5;
                                                                                                                                                                zipFile5 = zipFile8;
                                                                                                                                                                z14 = !z11;
                                                                                                                                                                if (z14) {
                                                                                                                                                                }
                                                                                                                                                                if (cls6 != null) {
                                                                                                                                                                }
                                                                                                                                                            } catch (Exception e11) {
                                                                                                                                                                e = e11;
                                                                                                                                                                r4 = zipFile8;
                                                                                                                                                                StringBuilder sb3 = new StringBuilder();
                                                                                                                                                                byte[] bArr26 = hotel;
                                                                                                                                                                sb3.append(alpha(bArr26[187], (short) 170, bArr26[23]));
                                                                                                                                                                sb3.append(invoke8);
                                                                                                                                                                byte b29 = bArr26[963];
                                                                                                                                                                short s26 = (short) 939;
                                                                                                                                                                sb3.append(alpha((byte) ((b29 ^ 1) + ((b29 & 1) << 1)), s26, (byte) ((-2) - (bArr26[968] ^ (-1)))));
                                                                                                                                                                try {
                                                                                                                                                                    throw ((Throwable) Class.forName(alpha((byte) (bArr26[147] - 1), s26, bArr26[0])).getDeclaredConstructor(cls4, cls3).newInstance(sb3.toString(), e));
                                                                                                                                                                } catch (Throwable th29) {
                                                                                                                                                                    Throwable cause20 = th29.getCause();
                                                                                                                                                                    if (cause20 == null) {
                                                                                                                                                                        throw th29;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause20;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th30) {
                                                                                                                                                            r4 = zipFile8;
                                                                                                                                                            try {
                                                                                                                                                                Throwable cause21 = th30.getCause();
                                                                                                                                                                if (cause21 == null) {
                                                                                                                                                                    throw th30;
                                                                                                                                                                }
                                                                                                                                                                throw cause21;
                                                                                                                                                            } catch (Exception e12) {
                                                                                                                                                                e = e12;
                                                                                                                                                                StringBuilder sb32 = new StringBuilder();
                                                                                                                                                                byte[] bArr262 = hotel;
                                                                                                                                                                sb32.append(alpha(bArr262[187], (short) 170, bArr262[23]));
                                                                                                                                                                sb32.append(invoke8);
                                                                                                                                                                byte b292 = bArr262[963];
                                                                                                                                                                short s262 = (short) 939;
                                                                                                                                                                sb32.append(alpha((byte) ((b292 ^ 1) + ((b292 & 1) << 1)), s262, (byte) ((-2) - (bArr262[968] ^ (-1)))));
                                                                                                                                                                throw ((Throwable) Class.forName(alpha((byte) (bArr262[147] - 1), s262, bArr262[0])).getDeclaredConstructor(cls4, cls3).newInstance(sb32.toString(), e));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Exception e13) {
                                                                                                                                                        e = e13;
                                                                                                                                                        r4 = zipFile8;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th31) {
                                                                                                                                                    Throwable cause22 = th31.getCause();
                                                                                                                                                    if (cause22 == null) {
                                                                                                                                                        throw th31;
                                                                                                                                                    }
                                                                                                                                                    throw cause22;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th32) {
                                                                                                                                                Throwable cause23 = th32.getCause();
                                                                                                                                                if (cause23 == null) {
                                                                                                                                                    throw th32;
                                                                                                                                                }
                                                                                                                                                throw cause23;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th33) {
                                                                                                                                            th = th33;
                                                                                                                                            zipFile3 = r74;
                                                                                                                                            zipFile4 = zipFile3;
                                                                                                                                            if (zipFile4 != null) {
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Throwable th34) {
                                                                                                                                    Throwable cause24 = th34.getCause();
                                                                                                                                    if (cause24 == null) {
                                                                                                                                        throw th34;
                                                                                                                                    }
                                                                                                                                    throw cause24;
                                                                                                                                }
                                                                                                                            } catch (Throwable th35) {
                                                                                                                                th = th35;
                                                                                                                                zipFile3 = zipFile;
                                                                                                                                zipFile4 = zipFile3;
                                                                                                                                if (zipFile4 != null) {
                                                                                                                                }
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th36) {
                                                                                                                            th = th36;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        try {
                                                                                                                            cls5 = cls14;
                                                                                                                            s12 = s10;
                                                                                                                            i22 = i20;
                                                                                                                            zArr6 = zArr3;
                                                                                                                            r4 = (int) (r74 ^ (8799910474257615002L - (SystemClock.uptimeMillis() >> 48)));
                                                                                                                            try {
                                                                                                                                ?? r132 = {r4, Integer.valueOf((int) r4), Short.valueOf((byte) (r74 ^ (8799910473203712314L - (SystemClock.elapsedRealtime() >> 48))))};
                                                                                                                                byte b30 = bArr14[7];
                                                                                                                                r4 = Class.forName(alpha(b30, (short) ((b30 ^ 626) | (b30 & 626)), bArr14[85]), true, (ClassLoader) bravo).getMethod(alpha((byte) (-bArr14[132]), (short) 551, bArr14[85]), Class.forName(alpha((byte) (bArr14[147] - 1), s9, bArr14[0])), cls2, Short.TYPE).invoke(obj8, r132);
                                                                                                                                obj9 = r4;
                                                                                                                                Class.forName(alpha((byte) (bArr14[147] - 1), s9, bArr14[0])).getMethod(alpha(bArr14[c12], (short) 542, bArr14[c16]), Long.TYPE).invoke(obj9, 22);
                                                                                                                                if (!z11) {
                                                                                                                                }
                                                                                                                            } catch (Throwable th37) {
                                                                                                                                Throwable cause25 = th37.getCause();
                                                                                                                                if (cause25 == null) {
                                                                                                                                    throw th37;
                                                                                                                                }
                                                                                                                                throw cause25;
                                                                                                                            }
                                                                                                                        } catch (Throwable th38) {
                                                                                                                            th = th38;
                                                                                                                            zipFile3 = zipFile;
                                                                                                                            zipFile4 = zipFile3;
                                                                                                                            if (zipFile4 != null) {
                                                                                                                            }
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Throwable th39) {
                                                                                                                    Throwable cause26 = th39.getCause();
                                                                                                                    if (cause26 == null) {
                                                                                                                        throw th39;
                                                                                                                    }
                                                                                                                    throw cause26;
                                                                                                                }
                                                                                                            } catch (Throwable th40) {
                                                                                                                th = th40;
                                                                                                                zipFile2 = zipFile;
                                                                                                                zipFile3 = zipFile2;
                                                                                                                zipFile4 = zipFile3;
                                                                                                                if (zipFile4 != null) {
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                        i13 = 1;
                                                                                                        i14 = i15 + 1;
                                                                                                        cls7 = cls2;
                                                                                                        z2 = z10;
                                                                                                        cls8 = cls3;
                                                                                                        alpha2 = str;
                                                                                                        objArr = objArr2;
                                                                                                        zArr = zArr4;
                                                                                                        cls = cls4;
                                                                                                        i4 = i16;
                                                                                                        zArr2 = zArr5;
                                                                                                        zArr3 = zArr6;
                                                                                                        i36 = 3;
                                                                                                        i10 = 6;
                                                                                                        bArr = r11;
                                                                                                    } catch (Throwable th41) {
                                                                                                        Throwable cause27 = th41.getCause();
                                                                                                        if (cause27 == null) {
                                                                                                            throw th41;
                                                                                                        }
                                                                                                        throw cause27;
                                                                                                    }
                                                                                                } catch (Throwable th42) {
                                                                                                    th = th42;
                                                                                                    zipFile4 = r4;
                                                                                                }
                                                                                                Class<?>[] clsArr2 = new Class[1];
                                                                                                clsArr2[i29] = byte[].class;
                                                                                                r10.getMethod(r11, clsArr2).invoke(r4, r7);
                                                                                            } catch (Throwable th43) {
                                                                                                th = th43;
                                                                                                cause = th.getCause();
                                                                                                if (cause != null) {
                                                                                                    throw th;
                                                                                                }
                                                                                                throw cause;
                                                                                            }
                                                                                            String alpha6 = alpha(r2[c15], r12, r2[41]);
                                                                                            zArr5 = zArr2;
                                                                                        } catch (Throwable th44) {
                                                                                            th = th44;
                                                                                            cause = th.getCause();
                                                                                            if (cause != null) {
                                                                                            }
                                                                                        }
                                                                                        Object[] objArr11 = new Object[1];
                                                                                        objArr11[i29] = bArr4;
                                                                                        Class<?> cls27 = Class.forName(alpha(r2[161], s10, r2[i29]));
                                                                                        cls4 = cls;
                                                                                        short s27 = (short) 706;
                                                                                        i16 = i4;
                                                                                    } catch (Throwable th45) {
                                                                                        th = th45;
                                                                                    }
                                                                                    Class<?>[] clsArr3 = new Class[1];
                                                                                    clsArr3[i29] = Class.forName(alpha((byte) (r2[147] - 1), s9, r2[i29]));
                                                                                    r4 = r4.getDeclaredConstructor(clsArr3).newInstance(r7);
                                                                                } catch (Throwable th46) {
                                                                                    th = th46;
                                                                                    Throwable cause28 = th.getCause();
                                                                                    if (cause28 == null) {
                                                                                        throw th;
                                                                                    }
                                                                                    throw cause28;
                                                                                }
                                                                                ?? r72 = new Object[1];
                                                                                r72[i29] = r4;
                                                                                s10 = (short) 728;
                                                                                Class<?> cls28 = Class.forName(alpha(r2[161], s10, r2[i29]));
                                                                                bArr2 = bArr;
                                                                            } catch (Throwable th47) {
                                                                                th = th47;
                                                                            }
                                                                            Object[] objArr12 = new Object[1];
                                                                            objArr12[i29] = resourceAsStream;
                                                                            byte[] bArr27 = hotel;
                                                                            s3 = (short) 772;
                                                                            Class<?> cls29 = Class.forName(alpha(bArr27[598], s3, bArr27[i29]));
                                                                            byte b31 = (byte) (bArr27[147] - 1);
                                                                            s9 = (short) 746;
                                                                            z13 = r4;
                                                                            Class<?>[] clsArr4 = new Class[1];
                                                                            clsArr4[i29] = Class.forName(alpha(b31, s9, bArr27[i29]));
                                                                            r4 = cls29.getDeclaredConstructor(clsArr4).newInstance(objArr12);
                                                                        } catch (Throwable th48) {
                                                                            Throwable cause29 = th48.getCause();
                                                                            if (cause29 == null) {
                                                                                throw th48;
                                                                            }
                                                                            throw cause29;
                                                                        }
                                                                        bArr4 = new byte[14062];
                                                                        if (r4 == 0) {
                                                                            resourceAsStream = zipFile.getInputStream(zipFile.getEntry(alpha3.substring(1)));
                                                                        } else {
                                                                            resourceAsStream = uH18377.class.getResourceAsStream(alpha3);
                                                                        }
                                                                    } catch (Throwable th49) {
                                                                        th = th49;
                                                                        zipFile2 = zipFile;
                                                                    }
                                                                    byte b32 = (byte) (india & 368);
                                                                    short s28 = (short) 1299;
                                                                    byte[] bArr28 = hotel;
                                                                    String str3 = (String) Class.forName(alpha(b32, s28, bArr28[i29])).getMethod(alpha(bArr28[c14], (short) 778, bArr28[4]), null).invoke(invoke4, null);
                                                                    StringBuilder sb4 = new StringBuilder();
                                                                    byte b33 = bArr28[963];
                                                                    sb4.append(alpha((byte) ((b33 ^ 1) + ((b33 & 1) << 1)), s28, (byte) 86));
                                                                    sb4.append(alpha3);
                                                                    int i66 = i5;
                                                                    zipFile = new ZipFile(str3.substring(i66, str3.lastIndexOf(sb4.toString())));
                                                                    r4 = 1;
                                                                } catch (Throwable th50) {
                                                                    Throwable cause30 = th50.getCause();
                                                                    if (cause30 == null) {
                                                                        throw th50;
                                                                    }
                                                                    throw cause30;
                                                                }
                                                                Object[] objArr13 = new Object[1];
                                                                objArr13[i29] = alpha3;
                                                                String alpha7 = alpha(bArr3[c10], (short) 805, bArr3[4]);
                                                                Class[] clsArr5 = new Class[1];
                                                                clsArr5[i29] = cls;
                                                                invoke4 = Class.class.getMethod(alpha7, clsArr5).invoke(uH18377.class, objArr13);
                                                                if (invoke4 == null) {
                                                                    try {
                                                                        obj7 = Class.forName(alpha(bArr3[23], (short) 1153, bArr3[22])).getMethod(alpha(bArr3[147], (short) 1128, bArr3[85]), null).invoke(null, null);
                                                                    } catch (Exception unused11) {
                                                                        obj7 = null;
                                                                    }
                                                                } else {
                                                                    c15 = 'n';
                                                                }
                                                                c16 = 'E';
                                                            } catch (Throwable th51) {
                                                                Throwable cause31 = th51.getCause();
                                                                if (cause31 == null) {
                                                                    throw th51;
                                                                }
                                                                throw cause31;
                                                            }
                                                            if (z11) {
                                                                Random random2 = new Random();
                                                                mike = (lima + 15) % 128;
                                                                try {
                                                                    byte[] bArr29 = hotel;
                                                                    z10 = z2;
                                                                    try {
                                                                        try {
                                                                            random2.setSeed(((Long) Class.forName(alpha(bArr29[124], (short) 1013, bArr29[i29])).getMethod(alpha(bArr29[222], (short) 921, bArr29[85]), null).invoke(null, null)).longValue() ^ (-1732060459));
                                                                            obj11 = null;
                                                                            obj12 = null;
                                                                            obj13 = null;
                                                                            obj14 = null;
                                                                        } catch (Throwable th52) {
                                                                            th = th52;
                                                                        }
                                                                        while (obj11 == null) {
                                                                            if (obj12 == null) {
                                                                                obj15 = obj11;
                                                                                obj16 = obj12;
                                                                                i23 = i10;
                                                                            } else {
                                                                                obj15 = obj11;
                                                                                obj16 = obj12;
                                                                                i23 = obj13 == null ? i5 : obj14 == null ? 4 : i36;
                                                                            }
                                                                            Object obj27 = obj13;
                                                                            StringBuilder sb5 = new StringBuilder(i23 + 1);
                                                                            sb5.append('.');
                                                                            int i67 = i29;
                                                                            while (i67 < i23) {
                                                                                if (z12) {
                                                                                    i24 = i23;
                                                                                    i25 = i67;
                                                                                    int nextInt = random2.nextInt(26);
                                                                                    if (random2.nextBoolean()) {
                                                                                        i26 = nextInt + 65;
                                                                                    } else {
                                                                                        int i68 = -(-nextInt);
                                                                                        i26 = (i68 ^ 96) + ((i68 & 96) << 1);
                                                                                    }
                                                                                    sb5.append((char) i26);
                                                                                } else {
                                                                                    i24 = i23;
                                                                                    i25 = i67;
                                                                                    sb5.append((char) (random2.nextInt(12) + 8192));
                                                                                }
                                                                                i67 = (i25 | 1) + (i25 & 1);
                                                                                i23 = i24;
                                                                            }
                                                                            String sb6 = sb5.toString();
                                                                            if (obj16 == null) {
                                                                                int i69 = lima;
                                                                                mike = ((i69 & 23) + (i69 | 23)) % 128;
                                                                                try {
                                                                                    Object[] objArr14 = new Object[2];
                                                                                    objArr14[1] = sb6;
                                                                                    objArr14[i29] = obj2;
                                                                                    byte b34 = (byte) (india & 368);
                                                                                    random = random2;
                                                                                    short s29 = (short) ((b34 & 1296) | (b34 ^ 1296));
                                                                                    byte[] bArr30 = hotel;
                                                                                    Class<?> cls30 = Class.forName(alpha(b34, s29, bArr30[i29]));
                                                                                    obj17 = obj14;
                                                                                    Class<?>[] clsArr6 = new Class[2];
                                                                                    clsArr6[i29] = Class.forName(alpha(b34, s29, bArr30[i29]));
                                                                                    clsArr6[1] = cls;
                                                                                    obj12 = cls30.getDeclaredConstructor(clsArr6).newInstance(objArr14);
                                                                                    zArr4 = zArr;
                                                                                    objArr2 = objArr;
                                                                                    obj11 = obj15;
                                                                                    obj13 = obj27;
                                                                                } catch (Throwable th53) {
                                                                                    Throwable cause32 = th53.getCause();
                                                                                    if (cause32 == null) {
                                                                                        throw th53;
                                                                                    }
                                                                                    throw cause32;
                                                                                }
                                                                            } else {
                                                                                random = random2;
                                                                                obj17 = obj14;
                                                                                if (obj27 == null) {
                                                                                    mike = (lima + 125) % 128;
                                                                                    try {
                                                                                        Object[] objArr15 = new Object[2];
                                                                                        objArr15[1] = sb6;
                                                                                        objArr15[i29] = obj2;
                                                                                        byte b35 = (byte) (india & 368);
                                                                                        byte[] bArr31 = hotel;
                                                                                        Class<?> cls31 = Class.forName(alpha(b35, (short) (b35 | 1296), bArr31[i29]));
                                                                                        Class<?>[] clsArr7 = new Class[2];
                                                                                        clsArr7[i29] = Class.forName(alpha(b35, (short) ((b35 & 1296) | (b35 ^ 1296)), bArr31[i29]));
                                                                                        clsArr7[1] = cls;
                                                                                        obj13 = cls31.getDeclaredConstructor(clsArr7).newInstance(objArr15);
                                                                                        zArr4 = zArr;
                                                                                        objArr2 = objArr;
                                                                                        obj11 = obj15;
                                                                                        obj12 = obj16;
                                                                                    } catch (Throwable th54) {
                                                                                        Throwable cause33 = th54.getCause();
                                                                                        if (cause33 == null) {
                                                                                            throw th54;
                                                                                        }
                                                                                        throw cause33;
                                                                                    }
                                                                                } else if (obj17 == null) {
                                                                                    int i70 = mike;
                                                                                    lima = ((i70 ^ 1) + ((i70 & 1) << 1)) % 128;
                                                                                    try {
                                                                                        Object[] objArr16 = new Object[2];
                                                                                        objArr16[1] = sb6;
                                                                                        objArr16[i29] = obj2;
                                                                                        byte b36 = (byte) (india & 368);
                                                                                        short s30 = (short) ((b36 ^ 1296) | (b36 & 1296));
                                                                                        byte[] bArr32 = hotel;
                                                                                        Class<?> cls32 = Class.forName(alpha(b36, s30, bArr32[i29]));
                                                                                        Class<?> cls33 = Class.forName(alpha(b36, s30, bArr32[i29]));
                                                                                        Class<?>[] clsArr8 = new Class[2];
                                                                                        clsArr8[i29] = cls33;
                                                                                        clsArr8[1] = cls;
                                                                                        obj14 = cls32.getDeclaredConstructor(clsArr8).newInstance(objArr16);
                                                                                        zArr4 = zArr;
                                                                                        objArr2 = objArr;
                                                                                        obj11 = obj15;
                                                                                        obj12 = obj16;
                                                                                        obj13 = obj27;
                                                                                        random2 = random;
                                                                                        objArr = objArr2;
                                                                                        zArr = zArr4;
                                                                                    } catch (Throwable th55) {
                                                                                        Throwable cause34 = th55.getCause();
                                                                                        if (cause34 == null) {
                                                                                            throw th55;
                                                                                        }
                                                                                        throw cause34;
                                                                                    }
                                                                                } else {
                                                                                    try {
                                                                                        Object[] objArr17 = new Object[2];
                                                                                        objArr17[1] = sb6;
                                                                                        objArr17[i29] = obj2;
                                                                                        byte b37 = (byte) (india & 368);
                                                                                        byte[] bArr33 = hotel;
                                                                                        ?? cls34 = Class.forName(alpha(b37, (short) ((b37 ^ 1296) | (b37 & 1296)), bArr33[i29]));
                                                                                        short s31 = (short) (b37 | 1296);
                                                                                        objArr2 = Class.forName(alpha(b37, s31, bArr33[i29]));
                                                                                        zArr4 = zArr;
                                                                                        try {
                                                                                            try {
                                                                                                ?? r92 = new Class[2];
                                                                                                r92[i29] = objArr2;
                                                                                                r92[1] = cls;
                                                                                                Object newInstance7 = cls34.getDeclaredConstructor(r92).newInstance(objArr17);
                                                                                                try {
                                                                                                    Object[] objArr18 = new Object[1];
                                                                                                    objArr18[i29] = newInstance7;
                                                                                                    short s32 = (short) 905;
                                                                                                    objArr2 = objArr;
                                                                                                    try {
                                                                                                        Class<?> cls35 = Class.forName(alpha(bArr33[719], s32, bArr33[i29]));
                                                                                                        Class<?>[] clsArr9 = new Class[1];
                                                                                                        clsArr9[i29] = Class.forName(alpha(b37, s31, bArr33[i29]));
                                                                                                        try {
                                                                                                            Class.forName(alpha(bArr33[719], s32, bArr33[i29])).getMethod(alpha(bArr33[187], (short) 882, bArr33[85]), null).invoke(cls35.getDeclaredConstructor(clsArr9).newInstance(objArr18), null);
                                                                                                            obj11 = newInstance7;
                                                                                                            obj12 = obj16;
                                                                                                            obj13 = obj27;
                                                                                                        } catch (Throwable th56) {
                                                                                                            Throwable cause35 = th56.getCause();
                                                                                                            if (cause35 == null) {
                                                                                                                throw th56;
                                                                                                            }
                                                                                                            throw cause35;
                                                                                                        }
                                                                                                    } catch (Throwable th57) {
                                                                                                        th = th57;
                                                                                                        Throwable cause36 = th.getCause();
                                                                                                        if (cause36 == null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause36;
                                                                                                    }
                                                                                                } catch (Throwable th58) {
                                                                                                    th = th58;
                                                                                                }
                                                                                            } catch (Throwable th59) {
                                                                                                th = th59;
                                                                                                Throwable cause37 = th.getCause();
                                                                                                if (cause37 == null) {
                                                                                                    throw th;
                                                                                                }
                                                                                                throw cause37;
                                                                                            }
                                                                                        } catch (Exception e14) {
                                                                                            try {
                                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                                byte[] bArr34 = hotel;
                                                                                                sb7.append(alpha(bArr34[187], (short) 878, bArr34[23]));
                                                                                                sb7.append(objArr17);
                                                                                                byte b38 = bArr34[963];
                                                                                                short s33 = (short) 939;
                                                                                                sb7.append(alpha((byte) ((b38 ^ 1) + ((b38 & 1) << 1)), s33, (byte) (bArr34[968] - 1)));
                                                                                                String sb8 = sb7.toString();
                                                                                                try {
                                                                                                    Object[] objArr19 = new Object[2];
                                                                                                    objArr19[1] = e14;
                                                                                                    objArr19[i29] = sb8;
                                                                                                    Class<?> cls36 = Class.forName(alpha((byte) (bArr34[147] - 1), s33, bArr34[i29]));
                                                                                                    Class<?>[] clsArr10 = new Class[2];
                                                                                                    clsArr10[i29] = cls;
                                                                                                    clsArr10[1] = cls3;
                                                                                                    throw ((Throwable) cls36.getDeclaredConstructor(clsArr10).newInstance(objArr19));
                                                                                                    break;
                                                                                                } catch (Throwable th60) {
                                                                                                    Throwable cause38 = th60.getCause();
                                                                                                    if (cause38 == null) {
                                                                                                        throw th60;
                                                                                                    }
                                                                                                    throw cause38;
                                                                                                }
                                                                                            } catch (Throwable th61) {
                                                                                                th = th61;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th62) {
                                                                                        th = th62;
                                                                                    }
                                                                                }
                                                                                th = th52;
                                                                                zArr4 = zArr;
                                                                                objArr2 = objArr;
                                                                                bArr2 = bArr;
                                                                                cls4 = cls;
                                                                                i16 = i4;
                                                                                zArr5 = zArr2;
                                                                                zArr6 = zArr3;
                                                                                i18 = (i15 & 1) + (i15 | 1);
                                                                                while (i18 < 7) {
                                                                                    if (zArr6[i18]) {
                                                                                        alpha = null;
                                                                                        bravo = null;
                                                                                        i28 = -1;
                                                                                        i29 = 0;
                                                                                    } else {
                                                                                        int i71 = ((i18 | (-110)) << 1) - (i18 ^ (-110));
                                                                                        i18 = ((i71 | 111) << 1) - (i71 ^ 111);
                                                                                    }
                                                                                }
                                                                                byte[] bArr132 = hotel;
                                                                                Object[] objArr72 = {alpha(bArr132[161], bArr132[133], bArr132[23]), th};
                                                                                byte b122 = bArr132[147];
                                                                                throw ((Throwable) Class.forName(alpha((byte) ((b122 ^ (-1)) + (b122 << 1)), (short) 939, bArr132[0])).getDeclaredConstructor(cls4, cls3).newInstance(objArr72));
                                                                            }
                                                                            obj14 = obj17;
                                                                            random2 = random;
                                                                            objArr = objArr2;
                                                                            zArr = zArr4;
                                                                        }
                                                                        obj3 = obj11;
                                                                        obj4 = obj12;
                                                                        obj5 = obj13;
                                                                        obj6 = obj14;
                                                                    } catch (Throwable th63) {
                                                                        th = th63;
                                                                        Throwable cause39 = th.getCause();
                                                                        if (cause39 == null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause39;
                                                                    }
                                                                } catch (Throwable th64) {
                                                                    th = th64;
                                                                }
                                                            } else {
                                                                z10 = z2;
                                                                obj3 = null;
                                                                obj4 = null;
                                                                obj5 = null;
                                                                obj6 = null;
                                                            }
                                                            zArr4 = zArr;
                                                            objArr2 = objArr;
                                                            bArr3 = hotel;
                                                            alpha3 = alpha(bArr3[54], (short) 874, bArr3[c12]);
                                                        } else {
                                                            i15 = i14;
                                                            cls3 = cls8;
                                                            str = alpha2;
                                                            z10 = z2;
                                                            zArr4 = zArr;
                                                            objArr2 = objArr;
                                                            bArr2 = bArr;
                                                            cls4 = cls;
                                                            i16 = i4;
                                                            zArr5 = zArr2;
                                                            zArr6 = zArr3;
                                                        }
                                                        ?? r11 = bArr2;
                                                        i13 = 1;
                                                        i14 = i15 + 1;
                                                        cls7 = cls2;
                                                        z2 = z10;
                                                        cls8 = cls3;
                                                        alpha2 = str;
                                                        objArr = objArr2;
                                                        zArr = zArr4;
                                                        cls = cls4;
                                                        i4 = i16;
                                                        zArr2 = zArr5;
                                                        zArr3 = zArr6;
                                                        i36 = 3;
                                                        i10 = 6;
                                                        bArr = r11;
                                                    }
                                                    return;
                                                }
                                            }
                                            i27 = 26;
                                            if (i11 >= 26) {
                                                z15 = true;
                                                zArr3[0] = z15;
                                                if (i11 >= i27) {
                                                }
                                                echo = z16;
                                                zArr3[1] = i11 < 21;
                                                if (i11 < 21) {
                                                }
                                                zArr3[4] = z17;
                                                z2 = z18;
                                                i12 = i11;
                                                i13 = 1;
                                                i14 = 0;
                                                bArr = null;
                                                loop0: while (bArr == null) {
                                                }
                                                return;
                                            }
                                            z15 = false;
                                            zArr3[0] = z15;
                                            if (i11 >= i27) {
                                            }
                                            echo = z16;
                                            zArr3[1] = i11 < 21;
                                            if (i11 < 21) {
                                            }
                                            zArr3[4] = z17;
                                            z2 = z18;
                                            i12 = i11;
                                            i13 = 1;
                                            i14 = 0;
                                            bArr = null;
                                            loop0: while (bArr == null) {
                                            }
                                            return;
                                        } catch (Throwable th65) {
                                            Throwable cause40 = th65.getCause();
                                            if (cause40 == null) {
                                                throw th65;
                                            }
                                            throw cause40;
                                        }
                                    }
                                    invoke = null;
                                }
                                c12 = 822;
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                    Object[] objArr62 = {invoke, alpha((byte) (-hotel[132]), (short) 988, r0[85])};
                                    byte b112 = (byte) (india & 368);
                                    short s172 = (short) ((b112 ^ 1296) | (b112 & 1296));
                                    invoke2 = Class.forName(alpha(b112, s172, r0[0])).getDeclaredConstructor(Class.forName(alpha(b112, s172, r0[0])), cls).newInstance(objArr62);
                                }
                                byte b4222 = (byte) (india & 368);
                                byte[] bArr8222 = hotel;
                                objArr = (Object[]) Array.newInstance(Class.forName(alpha(b4222, (short) ((b4222 ^ 1296) | (b4222 & 1296)), bArr8222[0])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                objArr[4] = invoke2;
                                objArr[i5] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[3] = true;
                                zArr3[4] = false;
                                zArr3[i5] = true;
                                zArr3[6] = true;
                                c14 = 19;
                                i10 = 6;
                                Class<?> cls11222 = Class.forName(alpha(bArr8222[719], (short) 979, bArr8222[22]));
                                i11 = cls11222.getDeclaredField(alpha(bArr8222[19], (short) 956, bArr8222[95])).getInt(cls11222);
                                if (i11 < 34) {
                                }
                                if (i11 == 29) {
                                }
                                i27 = 26;
                                if (i11 >= 26) {
                                }
                                z15 = false;
                                zArr3[0] = z15;
                                if (i11 >= i27) {
                                }
                                echo = z16;
                                zArr3[1] = i11 < 21;
                                if (i11 < 21) {
                                }
                                zArr3[4] = z17;
                                z2 = z18;
                                i12 = i11;
                                i13 = 1;
                                i14 = 0;
                                bArr = null;
                                loop0: while (bArr == null) {
                                }
                                return;
                            }
                            invoke3 = null;
                            cls = String.class;
                            if (invoke == null) {
                            }
                            c12 = 822;
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte b42222 = (byte) (india & 368);
                            byte[] bArr82222 = hotel;
                            objArr = (Object[]) Array.newInstance(Class.forName(alpha(b42222, (short) ((b42222 ^ 1296) | (b42222 & 1296)), bArr82222[0])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[i5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[i5] = true;
                            zArr3[6] = true;
                            c14 = 19;
                            i10 = 6;
                            Class<?> cls112222 = Class.forName(alpha(bArr82222[719], (short) 979, bArr82222[22]));
                            i11 = cls112222.getDeclaredField(alpha(bArr82222[19], (short) 956, bArr82222[95])).getInt(cls112222);
                            if (i11 < 34) {
                            }
                            if (i11 == 29) {
                            }
                            i27 = 26;
                            if (i11 >= 26) {
                            }
                            z15 = false;
                            zArr3[0] = z15;
                            if (i11 >= i27) {
                            }
                            echo = z16;
                            zArr3[1] = i11 < 21;
                            if (i11 < 21) {
                            }
                            zArr3[4] = z17;
                            z2 = z18;
                            i12 = i11;
                            i13 = 1;
                            i14 = 0;
                            bArr = null;
                            loop0: while (bArr == null) {
                            }
                            return;
                        }
                        c11 = 441;
                        invoke2 = null;
                        if (obj != null) {
                        }
                        invoke3 = null;
                        cls = String.class;
                        if (invoke == null) {
                        }
                        c12 = 822;
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte b422222 = (byte) (india & 368);
                        byte[] bArr822222 = hotel;
                        objArr = (Object[]) Array.newInstance(Class.forName(alpha(b422222, (short) ((b422222 ^ 1296) | (b422222 & 1296)), bArr822222[0])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        objArr[4] = invoke2;
                        objArr[i5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[3] = true;
                        zArr3[4] = false;
                        zArr3[i5] = true;
                        zArr3[6] = true;
                        c14 = 19;
                        i10 = 6;
                        Class<?> cls1122222 = Class.forName(alpha(bArr822222[719], (short) 979, bArr822222[22]));
                        i11 = cls1122222.getDeclaredField(alpha(bArr822222[19], (short) 956, bArr822222[95])).getInt(cls1122222);
                        if (i11 < 34) {
                        }
                        if (i11 == 29) {
                        }
                        i27 = 26;
                        if (i11 >= 26) {
                        }
                        z15 = false;
                        zArr3[0] = z15;
                        if (i11 >= i27) {
                        }
                        echo = z16;
                        zArr3[1] = i11 < 21;
                        if (i11 < 21) {
                        }
                        zArr3[4] = z17;
                        z2 = z18;
                        i12 = i11;
                        i13 = 1;
                        i14 = 0;
                        bArr = null;
                        loop0: while (bArr == null) {
                        }
                        return;
                    }
                    c10 = 396;
                    invoke = null;
                    if (obj != null) {
                    }
                    c11 = 441;
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    cls = String.class;
                    if (invoke == null) {
                    }
                    c12 = 822;
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte b4222222 = (byte) (india & 368);
                    byte[] bArr8222222 = hotel;
                    objArr = (Object[]) Array.newInstance(Class.forName(alpha(b4222222, (short) ((b4222222 ^ 1296) | (b4222222 & 1296)), bArr8222222[0])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    objArr[4] = invoke2;
                    objArr[i5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[3] = true;
                    zArr3[4] = false;
                    zArr3[i5] = true;
                    zArr3[6] = true;
                    c14 = 19;
                    i10 = 6;
                    Class<?> cls11222222 = Class.forName(alpha(bArr8222222[719], (short) 979, bArr8222222[22]));
                    i11 = cls11222222.getDeclaredField(alpha(bArr8222222[19], (short) 956, bArr8222222[95])).getInt(cls11222222);
                    if (i11 < 34) {
                    }
                    if (i11 == 29) {
                    }
                    i27 = 26;
                    if (i11 >= 26) {
                    }
                    z15 = false;
                    zArr3[0] = z15;
                    if (i11 >= i27) {
                    }
                    echo = z16;
                    zArr3[1] = i11 < 21;
                    if (i11 < 21) {
                    }
                    zArr3[4] = z17;
                    z2 = z18;
                    i12 = i11;
                    i13 = 1;
                    i14 = 0;
                    bArr = null;
                    loop0: while (bArr == null) {
                    }
                    return;
                }
                byte[] bArr722 = hotel;
                obj = Class.forName(alpha(bArr722[81], (short) 1111, bArr722[22])).getMethod(alpha(bArr722[c4], (short) 1090, bArr722[4]), null).invoke(null, null);
                if (obj != null) {
                }
                c10 = 396;
                invoke = null;
                if (obj != null) {
                }
                c11 = 441;
                invoke2 = null;
                if (obj != null) {
                }
                invoke3 = null;
                cls = String.class;
                if (invoke == null) {
                }
                c12 = 822;
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                byte b42222222 = (byte) (india & 368);
                byte[] bArr82222222 = hotel;
                objArr = (Object[]) Array.newInstance(Class.forName(alpha(b42222222, (short) ((b42222222 ^ 1296) | (b42222222 & 1296)), bArr82222222[0])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = invoke3;
                objArr[4] = invoke2;
                objArr[i5] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[1] = false;
                zArr3[2] = true;
                zArr3[3] = true;
                zArr3[4] = false;
                zArr3[i5] = true;
                zArr3[6] = true;
                c14 = 19;
                i10 = 6;
                Class<?> cls112222222 = Class.forName(alpha(bArr82222222[719], (short) 979, bArr82222222[22]));
                i11 = cls112222222.getDeclaredField(alpha(bArr82222222[19], (short) 956, bArr82222222[95])).getInt(cls112222222);
                if (i11 < 34) {
                }
                if (i11 == 29) {
                }
                i27 = 26;
                if (i11 >= 26) {
                }
                z15 = false;
                zArr3[0] = z15;
                if (i11 >= i27) {
                }
                echo = z16;
                zArr3[1] = i11 < 21;
                if (i11 < 21) {
                }
                zArr3[4] = z17;
                z2 = z18;
                i12 = i11;
                i13 = 1;
                i14 = 0;
                bArr = null;
                loop0: while (bArr == null) {
                }
                return;
            } catch (Exception e15) {
                throw new RuntimeException(e15);
            }
            try {
                byte[] bArr35 = hotel;
                c15 = 'n';
                try {
                    obj7 = Class.forName(alpha(bArr35[81], (short) 1111, bArr35[22])).getMethod(alpha(bArr35[c4], (short) 1090, bArr35[4]), null).invoke(null, null);
                } catch (Exception unused12) {
                }
            } catch (Exception unused13) {
                c15 = 'n';
                if (obj7 != null) {
                    Class<?> cls37 = obj7.getClass();
                    byte[] bArr36 = hotel;
                    Object invoke10 = cls37.getMethod(alpha(bArr36[147], (short) 795, bArr36[4]), null).invoke(obj7, null);
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        short s34 = (short) 1401;
                        c16 = 'E';
                        short s35 = (short) 1368;
                        try {
                            if (Class.forName(alpha(bArr36[c3], s34, bArr36[22])).getField(alpha(bArr36[c15], s35, bArr36[69])).get(invoke10) != null) {
                                int i72 = lima;
                                mike = ((i72 & 107) + (i72 | 107)) % 128;
                                Object obj28 = Class.forName(alpha(bArr36[c3], s34, bArr36[22])).getField(alpha(bArr36[c15], s35, bArr36[69])).get(invoke10);
                                int i73 = (i72 + 11) % 128;
                                mike = i73;
                                try {
                                    Object[] objArr20 = new Object[1];
                                    objArr20[i29] = obj28;
                                    byte b39 = (byte) (india & 368);
                                    Class<?> cls38 = Class.forName(alpha(b39, (short) ((b39 & 1296) | (b39 ^ 1296)), bArr36[i29]));
                                    Class<?>[] clsArr11 = new Class[1];
                                    clsArr11[i29] = cls;
                                    arrayList2.add(cls38.getDeclaredConstructor(clsArr11).newInstance(objArr20));
                                    lima = (((i73 | 35) << 1) - (i73 ^ 35)) % 128;
                                } catch (Throwable th66) {
                                    Throwable cause41 = th66.getCause();
                                    if (cause41 == null) {
                                        throw th66;
                                    }
                                    throw cause41;
                                }
                            }
                            short s36 = (short) 1349;
                            if (Class.forName(alpha(bArr36[c3], s34, bArr36[22])).getField(alpha((byte) (-bArr36[c11]), s36, bArr36[69])).get(invoke10) != null) {
                                Object[] objArr21 = (Object[]) Class.forName(alpha(bArr36[c3], s34, bArr36[22])).getField(alpha((byte) (-bArr36[c11]), s36, bArr36[69])).get(invoke10);
                                int length3 = objArr21.length;
                                int i74 = i29;
                                while (i74 < length3) {
                                    try {
                                        Object[] objArr22 = new Object[1];
                                        objArr22[i29] = objArr21[i74];
                                        byte b40 = (byte) (india & 368);
                                        int i75 = length3;
                                        Class<?> cls39 = Class.forName(alpha(b40, (short) ((b40 & 1296) | (b40 ^ 1296)), hotel[i29]));
                                        Class<?>[] clsArr12 = new Class[1];
                                        clsArr12[i29] = cls;
                                        arrayList2.add(cls39.getDeclaredConstructor(clsArr12).newInstance(objArr22));
                                        i74 = (i74 | 1) + (i74 & 1);
                                        length3 = i75;
                                    } catch (Throwable th67) {
                                        Throwable cause42 = th67.getCause();
                                        if (cause42 == null) {
                                            throw th67;
                                        }
                                        throw cause42;
                                    }
                                }
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                File file = (File) it.next();
                                try {
                                    int i76 = india;
                                    byte b41 = (byte) (i76 & 368);
                                    short s37 = (short) (b41 | 1296);
                                    Iterator it2 = it;
                                    bArr2 = hotel;
                                    try {
                                        if (((Boolean) Class.forName(alpha(b41, s37, r9[i29])).getMethod(alpha((byte) (i76 & 382), (short) 1335, bArr2[76]), null).invoke(file, null)).booleanValue()) {
                                            int i77 = lima;
                                            mike = ((i77 ^ 117) + ((i77 & 117) << 1)) % 128;
                                            try {
                                                try {
                                                    if (((String) Class.forName(alpha(b41, (short) ((b41 ^ 1296) | (b41 & 1296)), bArr2[i29])).getMethod(alpha(bArr2[c14], (short) 1330, bArr2[4]), null).invoke(file, null)).endsWith(alpha(bArr2[c12], (short) 1324, bArr2[386]))) {
                                                        StringBuilder sb9 = new StringBuilder();
                                                        sb9.append(alpha(bArr2[c15], (short) 1321, bArr2[i29]));
                                                        try {
                                                            sb9.append((String) Class.forName(alpha(b41, s37, bArr2[i29])).getMethod(alpha((byte) (-bArr2[c11]), (short) 1313, bArr2[4]), null).invoke(file, null));
                                                            short s38 = (short) 1299;
                                                            sb9.append(alpha((byte) (bArr2[963] + 1), s38, (byte) 86));
                                                            sb9.append(alpha3);
                                                            try {
                                                                Object[] objArr23 = new Object[1];
                                                                objArr23[i29] = sb9.toString();
                                                                Class<?> cls40 = Class.forName(alpha(b41, s38, bArr2[i29]));
                                                                Class<?>[] clsArr13 = new Class[1];
                                                                clsArr13[i29] = cls;
                                                                invoke4 = cls40.getDeclaredConstructor(clsArr13).newInstance(objArr23);
                                                                ZipFile zipFile9 = new ZipFile(file);
                                                                try {
                                                                    if (zipFile9.getEntry(alpha3.substring(1)) != null) {
                                                                        zipFile9.close();
                                                                        break;
                                                                    }
                                                                    zipFile9.close();
                                                                } finally {
                                                                }
                                                            } catch (Throwable th68) {
                                                                Throwable cause43 = th68.getCause();
                                                                if (cause43 == null) {
                                                                    throw th68;
                                                                }
                                                                throw cause43;
                                                            }
                                                        } catch (Throwable th69) {
                                                            Throwable cause44 = th69.getCause();
                                                            if (cause44 == null) {
                                                                throw th69;
                                                            }
                                                            throw cause44;
                                                        }
                                                    }
                                                } catch (Exception unused14) {
                                                    continue;
                                                }
                                            } catch (Throwable th70) {
                                                Throwable cause45 = th70.getCause();
                                                if (cause45 == null) {
                                                    throw th70;
                                                }
                                                throw cause45;
                                            }
                                        }
                                        it = it2;
                                    } catch (Throwable th71) {
                                        th = th71;
                                        Throwable cause46 = th.getCause();
                                        if (cause46 == null) {
                                            throw th;
                                        }
                                        throw cause46;
                                    }
                                } catch (Throwable th72) {
                                    th = th72;
                                }
                            }
                        } catch (Exception unused15) {
                        }
                    } catch (Exception unused16) {
                        c16 = 'E';
                    }
                    invoke4 = null;
                    byte b322 = (byte) (india & 368);
                    short s282 = (short) 1299;
                    byte[] bArr282 = hotel;
                    String str32 = (String) Class.forName(alpha(b322, s282, bArr282[i29])).getMethod(alpha(bArr282[c14], (short) 778, bArr282[4]), null).invoke(invoke4, null);
                    StringBuilder sb42 = new StringBuilder();
                    byte b332 = bArr282[963];
                    sb42.append(alpha((byte) ((b332 ^ 1) + ((b332 & 1) << 1)), s282, (byte) 86));
                    sb42.append(alpha3);
                    int i662 = i5;
                    zipFile = new ZipFile(str32.substring(i662, str32.lastIndexOf(sb42.toString())));
                    r4 = 1;
                    bArr4 = new byte[14062];
                    if (r4 == 0) {
                    }
                    Object[] objArr122 = new Object[1];
                    objArr122[i29] = resourceAsStream;
                    byte[] bArr272 = hotel;
                    s3 = (short) 772;
                    Class<?> cls292 = Class.forName(alpha(bArr272[598], s3, bArr272[i29]));
                    byte b312 = (byte) (bArr272[147] - 1);
                    s9 = (short) 746;
                    z13 = r4;
                    Class<?>[] clsArr42 = new Class[1];
                    clsArr42[i29] = Class.forName(alpha(b312, s9, bArr272[i29]));
                    r4 = cls292.getDeclaredConstructor(clsArr42).newInstance(objArr122);
                    ?? r722 = new Object[1];
                    r722[i29] = r4;
                    s10 = (short) 728;
                    Class<?> cls282 = Class.forName(alpha(bArr272[161], s10, bArr272[i29]));
                    bArr2 = bArr;
                    Class<?>[] clsArr32 = new Class[1];
                    clsArr32[i29] = Class.forName(alpha((byte) (bArr272[147] - 1), s9, bArr272[i29]));
                    r4 = cls282.getDeclaredConstructor(clsArr32).newInstance(r722);
                    Object[] objArr112 = new Object[1];
                    objArr112[i29] = bArr4;
                    Class<?> cls272 = Class.forName(alpha(bArr272[161], s10, bArr272[i29]));
                    cls4 = cls;
                    short s272 = (short) 706;
                    i16 = i4;
                    String alpha62 = alpha(bArr272[c15], s272, bArr272[41]);
                    zArr5 = zArr2;
                    Class<?>[] clsArr22 = new Class[1];
                    clsArr22[i29] = byte[].class;
                    cls272.getMethod(alpha62, clsArr22).invoke(r4, objArr112);
                    short s182 = (short) 882;
                    Class.forName(alpha(bArr272[161], s10, bArr272[i29])).getMethod(alpha(bArr272[187], s182, bArr272[85]), null).invoke(r4, null);
                    i19 = 14014;
                    s11 = s272;
                    i20 = 22;
                    String str22 = str;
                    Class cls142 = null;
                    while (true) {
                        j5 = 1;
                        length = bArr4.length;
                        int i472 = i19;
                        i21 = i29;
                        while (i21 < length) {
                        }
                        ?? r742 = j5;
                        byte b132 = bArr4[(i20 & 14039) + (i20 | 14039)];
                        bArr4[i20 + 275] = (byte) ((b132 & 79) + (b132 | 79));
                        r4 = (bArr4.length - (~(-i20))) - 1;
                        Object[] objArr82 = new Object[i36];
                        objArr82[2] = Integer.valueOf((int) r4);
                        objArr82[1] = Integer.valueOf(i20);
                        objArr82[i29] = bArr4;
                        byte[] bArr142 = hotel;
                        byte b142 = bArr142[587];
                        Class<?> cls152 = Class.forName(alpha(b142, (short) ((b142 ^ 650) | (b142 & 650)), bArr142[i29]));
                        Class<?>[] clsArr14 = new Class[3];
                        clsArr14[i29] = byte[].class;
                        clsArr14[1] = cls2;
                        clsArr14[2] = cls2;
                        r4 = cls152.getDeclaredConstructor(clsArr14).newInstance(objArr82);
                        obj8 = alpha;
                        if (obj8 != null) {
                        }
                        zipFile = zipFile7;
                        s10 = s15;
                        s9 = s14;
                        s11 = s16;
                        zArr3 = zArr6;
                        i28 = -1;
                        i29 = 0;
                        i36 = 3;
                        i20 = Math.abs(i22);
                        i19 = 165871;
                        bArr4 = bArr5;
                        i12 = i17;
                        i10 = 6;
                    }
                    i13 = 1;
                    i14 = i15 + 1;
                    cls7 = cls2;
                    z2 = z10;
                    cls8 = cls3;
                    alpha2 = str;
                    objArr = objArr2;
                    zArr = zArr4;
                    cls = cls4;
                    i4 = i16;
                    zArr2 = zArr5;
                    zArr3 = zArr6;
                    i36 = 3;
                    i10 = 6;
                    bArr = r11;
                }
                c16 = 'E';
                byte b3222 = (byte) (india & 368);
                short s2822 = (short) 1299;
                byte[] bArr2822 = hotel;
                String str322 = (String) Class.forName(alpha(b3222, s2822, bArr2822[i29])).getMethod(alpha(bArr2822[c14], (short) 778, bArr2822[4]), null).invoke(invoke4, null);
                StringBuilder sb422 = new StringBuilder();
                byte b3322 = bArr2822[963];
                sb422.append(alpha((byte) ((b3322 ^ 1) + ((b3322 & 1) << 1)), s2822, (byte) 86));
                sb422.append(alpha3);
                int i6622 = i5;
                zipFile = new ZipFile(str322.substring(i6622, str322.lastIndexOf(sb422.toString())));
                r4 = 1;
                bArr4 = new byte[14062];
                if (r4 == 0) {
                }
                Object[] objArr1222 = new Object[1];
                objArr1222[i29] = resourceAsStream;
                byte[] bArr2722 = hotel;
                s3 = (short) 772;
                Class<?> cls2922 = Class.forName(alpha(bArr2722[598], s3, bArr2722[i29]));
                byte b3122 = (byte) (bArr2722[147] - 1);
                s9 = (short) 746;
                z13 = r4;
                Class<?>[] clsArr422 = new Class[1];
                clsArr422[i29] = Class.forName(alpha(b3122, s9, bArr2722[i29]));
                r4 = cls2922.getDeclaredConstructor(clsArr422).newInstance(objArr1222);
                ?? r7222 = new Object[1];
                r7222[i29] = r4;
                s10 = (short) 728;
                Class<?> cls2822 = Class.forName(alpha(bArr2722[161], s10, bArr2722[i29]));
                bArr2 = bArr;
                Class<?>[] clsArr322 = new Class[1];
                clsArr322[i29] = Class.forName(alpha((byte) (bArr2722[147] - 1), s9, bArr2722[i29]));
                r4 = cls2822.getDeclaredConstructor(clsArr322).newInstance(r7222);
                Object[] objArr1122 = new Object[1];
                objArr1122[i29] = bArr4;
                Class<?> cls2722 = Class.forName(alpha(bArr2722[161], s10, bArr2722[i29]));
                cls4 = cls;
                short s2722 = (short) 706;
                i16 = i4;
                String alpha622 = alpha(bArr2722[c15], s2722, bArr2722[41]);
                zArr5 = zArr2;
                Class<?>[] clsArr222 = new Class[1];
                clsArr222[i29] = byte[].class;
                cls2722.getMethod(alpha622, clsArr222).invoke(r4, objArr1122);
                short s1822 = (short) 882;
                Class.forName(alpha(bArr2722[161], s10, bArr2722[i29])).getMethod(alpha(bArr2722[187], s1822, bArr2722[85]), null).invoke(r4, null);
                i19 = 14014;
                s11 = s2722;
                i20 = 22;
                String str222 = str;
                Class cls1422 = null;
                while (true) {
                    j5 = 1;
                    length = bArr4.length;
                    int i4722 = i19;
                    i21 = i29;
                    while (i21 < length) {
                    }
                    ?? r7422 = j5;
                    byte b1322 = bArr4[(i20 & 14039) + (i20 | 14039)];
                    bArr4[i20 + 275] = (byte) ((b1322 & 79) + (b1322 | 79));
                    r4 = (bArr4.length - (~(-i20))) - 1;
                    Object[] objArr822 = new Object[i36];
                    objArr822[2] = Integer.valueOf((int) r4);
                    objArr822[1] = Integer.valueOf(i20);
                    objArr822[i29] = bArr4;
                    byte[] bArr1422 = hotel;
                    byte b1422 = bArr1422[587];
                    Class<?> cls1522 = Class.forName(alpha(b1422, (short) ((b1422 ^ 650) | (b1422 & 650)), bArr1422[i29]));
                    Class<?>[] clsArr142 = new Class[3];
                    clsArr142[i29] = byte[].class;
                    clsArr142[1] = cls2;
                    clsArr142[2] = cls2;
                    r4 = cls1522.getDeclaredConstructor(clsArr142).newInstance(objArr822);
                    obj8 = alpha;
                    if (obj8 != null) {
                    }
                    zipFile = zipFile7;
                    s10 = s15;
                    s9 = s14;
                    s11 = s16;
                    zArr3 = zArr6;
                    i28 = -1;
                    i29 = 0;
                    i36 = 3;
                    i20 = Math.abs(i22);
                    i19 = 165871;
                    bArr4 = bArr5;
                    i12 = i17;
                    i10 = 6;
                }
                i13 = 1;
                i14 = i15 + 1;
                cls7 = cls2;
                z2 = z10;
                cls8 = cls3;
                alpha2 = str;
                objArr = objArr2;
                zArr = zArr4;
                cls = cls4;
                i4 = i16;
                zArr2 = zArr5;
                zArr3 = zArr6;
                i36 = 3;
                i10 = 6;
                bArr = r11;
            }
            if (obj7 != null) {
            }
            c16 = 'E';
            byte b32222 = (byte) (india & 368);
            short s28222 = (short) 1299;
            byte[] bArr28222 = hotel;
            String str3222 = (String) Class.forName(alpha(b32222, s28222, bArr28222[i29])).getMethod(alpha(bArr28222[c14], (short) 778, bArr28222[4]), null).invoke(invoke4, null);
            StringBuilder sb4222 = new StringBuilder();
            byte b33222 = bArr28222[963];
            sb4222.append(alpha((byte) ((b33222 ^ 1) + ((b33222 & 1) << 1)), s28222, (byte) 86));
            sb4222.append(alpha3);
            int i66222 = i5;
            zipFile = new ZipFile(str3222.substring(i66222, str3222.lastIndexOf(sb4222.toString())));
            r4 = 1;
            bArr4 = new byte[14062];
            if (r4 == 0) {
            }
            Object[] objArr12222 = new Object[1];
            objArr12222[i29] = resourceAsStream;
            byte[] bArr27222 = hotel;
            s3 = (short) 772;
            Class<?> cls29222 = Class.forName(alpha(bArr27222[598], s3, bArr27222[i29]));
            byte b31222 = (byte) (bArr27222[147] - 1);
            s9 = (short) 746;
            z13 = r4;
            Class<?>[] clsArr4222 = new Class[1];
            clsArr4222[i29] = Class.forName(alpha(b31222, s9, bArr27222[i29]));
            r4 = cls29222.getDeclaredConstructor(clsArr4222).newInstance(objArr12222);
            ?? r72222 = new Object[1];
            r72222[i29] = r4;
            s10 = (short) 728;
            Class<?> cls28222 = Class.forName(alpha(bArr27222[161], s10, bArr27222[i29]));
            bArr2 = bArr;
            Class<?>[] clsArr3222 = new Class[1];
            clsArr3222[i29] = Class.forName(alpha((byte) (bArr27222[147] - 1), s9, bArr27222[i29]));
            r4 = cls28222.getDeclaredConstructor(clsArr3222).newInstance(r72222);
            Object[] objArr11222 = new Object[1];
            objArr11222[i29] = bArr4;
            Class<?> cls27222 = Class.forName(alpha(bArr27222[161], s10, bArr27222[i29]));
            cls4 = cls;
            short s27222 = (short) 706;
            i16 = i4;
            String alpha6222 = alpha(bArr27222[c15], s27222, bArr27222[41]);
            zArr5 = zArr2;
            Class<?>[] clsArr2222 = new Class[1];
            clsArr2222[i29] = byte[].class;
            cls27222.getMethod(alpha6222, clsArr2222).invoke(r4, objArr11222);
            short s18222 = (short) 882;
            Class.forName(alpha(bArr27222[161], s10, bArr27222[i29])).getMethod(alpha(bArr27222[187], s18222, bArr27222[85]), null).invoke(r4, null);
            i19 = 14014;
            s11 = s27222;
            i20 = 22;
            String str2222 = str;
            Class cls14222 = null;
            while (true) {
                j5 = 1;
                length = bArr4.length;
                int i47222 = i19;
                i21 = i29;
                while (i21 < length) {
                }
                ?? r74222 = j5;
                byte b13222 = bArr4[(i20 & 14039) + (i20 | 14039)];
                bArr4[i20 + 275] = (byte) ((b13222 & 79) + (b13222 | 79));
                r4 = (bArr4.length - (~(-i20))) - 1;
                Object[] objArr8222 = new Object[i36];
                objArr8222[2] = Integer.valueOf((int) r4);
                objArr8222[1] = Integer.valueOf(i20);
                objArr8222[i29] = bArr4;
                byte[] bArr14222 = hotel;
                byte b14222 = bArr14222[587];
                Class<?> cls15222 = Class.forName(alpha(b14222, (short) ((b14222 ^ 650) | (b14222 & 650)), bArr14222[i29]));
                Class<?>[] clsArr1422 = new Class[3];
                clsArr1422[i29] = byte[].class;
                clsArr1422[1] = cls2;
                clsArr1422[2] = cls2;
                r4 = cls15222.getDeclaredConstructor(clsArr1422).newInstance(objArr8222);
                obj8 = alpha;
                if (obj8 != null) {
                }
                zipFile = zipFile7;
                s10 = s15;
                s9 = s14;
                s11 = s16;
                zArr3 = zArr6;
                i28 = -1;
                i29 = 0;
                i36 = 3;
                i20 = Math.abs(i22);
                i19 = 165871;
                bArr4 = bArr5;
                i12 = i17;
                i10 = 6;
            }
            i13 = 1;
            i14 = i15 + 1;
            cls7 = cls2;
            z2 = z10;
            cls8 = cls3;
            alpha2 = str;
            objArr = objArr2;
            zArr = zArr4;
            cls = cls4;
            i4 = i16;
            zArr2 = zArr5;
            zArr3 = zArr6;
            i36 = 3;
            i10 = 6;
            bArr = r11;
        } catch (Throwable th73) {
            Throwable cause47 = th73.getCause();
            if (cause47 == null) {
                throw th73;
            }
            throw cause47;
        }
    }

    public static Object D8871(int i4) {
        int i5 = juliet + 31;
        kilo = i5 % 128;
        int i10 = i5 % 2;
        int i11 = delta;
        HashMap hashMap = charlie;
        if (i10 != 0) {
            Object obj = hashMap.get(Integer.valueOf(((~i4) & i11) | ((~i11) & i4)));
            int i12 = kilo;
            int i13 = (i12 & 103) + (i12 | 103);
            juliet = i13 % 128;
            if (i13 % 2 == 0) {
                return obj;
            }
            throw null;
        }
        hashMap.get(Integer.valueOf((i4 | i11) & (~(i4 & i11))));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:4:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(short s3, short s9, int i4) {
        int i5;
        int i10 = 1405 - s9;
        int i11 = 119 - i4;
        byte[] bArr = new byte[76 - s3];
        int i12 = 75 - s3;
        byte[] bArr2 = hotel;
        if (bArr2 == null) {
            int i13 = i11;
            i5 = 0;
            i11 = i12;
            i10++;
            i11 = (i11 + i13) - 3;
            oscar = (november + 95) % 128;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
                String str = new String(bArr, 0);
                int i14 = november + 39;
                oscar = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 14 / 0;
                }
                return str;
            }
            i5++;
            i13 = bArr2[i10];
            november = (oscar + 79) % 128;
            i10++;
            i11 = (i11 + i13) - 3;
            oscar = (november + 95) % 128;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
            }
        } else {
            i5 = 0;
            bArr[i5] = (byte) i11;
            if (i5 == i12) {
            }
        }
    }

    public static void bravo() {
        int i4 = kilo;
        juliet = ((i4 ^ 115) + ((i4 & 115) << 1)) % 128;
        byte[] bArr = new byte[1414];
        System.arraycopy("\röe÷\u0010ù\u0011\u0000ýþÍ8\u000f\u0002\tô\f\t½E\u0000Ä\u00162\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002Þ(û\fÿ\t\u0000ô\u0005â(\fú\u0018îÐ>\tÂ\u001b&\u0006ü\u0000ÿ\u0000\u000eâ\u001f\t\u0000ô\u0005â(\f\u0004\u0016ô\r\u0004\u0002\u0001\u0012Ý\u0016\u000fû6\u0012þú\u0014Ë/\u0006\u0006üØ\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷ú\u0018îÐCú\u0012½*\u0000ý\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾%\"ý\b\tÕü\fü\u0010÷\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆGõ\u0012â)ý\u0004ô\u000bÝ!\u0011\u0004\u0004\u0000öã6î\f\f\u0001ù\t\u0002ç\u0016\u0001\u0014\u0002ã\u0003\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u0006\tû\t\u00020\u0003\u0006Ôÿ\u00043Ø.Ò\u00041Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005\u0001\u0012Ð2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002Þ(û\f\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅ8\u000e\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅHõ\u0012â)ý\u0004ô\u000bÝ!\u0011\u0004\u0004\u0000öã6î\f\f\u0001ù\t\u0002ç\u0016\u0001\u0014\u0002ã\u0003\u000f\u0001\u0006\u0002\u0002ú\f\tÄû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000e\u0003\u0006÷\u0001\u0016ôâ(\fö\u0001\u0014\b\u0002ú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0002\u0007ù\u000eø\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆIÖì\nþ\u0007\u0003ðM5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u00067Ð\u0005\u0000\u0007/Ù\u0002þ\u00060Ó\u0004\u00070\u0001Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸÷\u0003\u0002ýÑð\u0006\u0007þ\u0002\u001fë\u0004ý\u0007\u000f\u0001\u0006\u0002\u0002ú\f\tÈ".getBytes("ISO-8859-1"), 0, bArr, 0, 1414);
        hotel = bArr;
        india = 199;
        int i5 = juliet + 119;
        kilo = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static Object charlie(char c3, int i4, int i5) {
        int i10 = (kilo + 67) % 128;
        juliet = i10;
        Object obj = alpha;
        kilo = (((i10 | 23) << 1) - (i10 ^ 23)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i5), Character.valueOf(c3)};
            byte b2 = hotel[7];
            Class<?> cls = Class.forName(alpha(b2, (short) (b2 | 626), r8[85]), true, (ClassLoader) bravo);
            String alpha2 = alpha(r8[187], r8[12], r8[593]);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod(alpha2, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i11 = juliet;
            kilo = (((i11 | 49) << 1) - (i11 ^ 49)) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object setPivotYN16904(int i4, int i5, char c3, int i10, boolean z2, String str, Class[] clsArr) {
        Object method;
        int i11;
        int i12 = kilo + 41;
        juliet = i12 % 128;
        int i13 = i12 % 2;
        HashMap hashMap = charlie;
        if (i13 != 0) {
            hashMap.get(Integer.valueOf(i10));
            throw null;
        }
        Object obj = hashMap.get(Integer.valueOf(i10));
        if (obj != null) {
            return obj;
        }
        Integer valueOf = Integer.valueOf(i10);
        Object obj2 = alpha;
        juliet = (kilo + 109) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i4), Integer.valueOf(i5), Character.valueOf(c3)};
            byte b2 = hotel[7];
            Class<?> cls = Class.forName(alpha(b2, (short) ((b2 ^ 626) | (b2 & 626)), r11[85]), true, (ClassLoader) bravo);
            String alpha2 = alpha(r11[187], r11[12], r11[593]);
            Class<?> cls2 = Integer.TYPE;
            Class cls3 = (Class) cls.getMethod(alpha2, cls2, cls2, Character.TYPE).invoke(obj2, objArr);
            if (str == null) {
                int i14 = juliet;
                kilo = (i14 + 71) % 128;
                if (z2) {
                    kilo = (((i14 | 39) << 1) - (i14 ^ 39)) % 128;
                    method = cls3.getDeclaredConstructor(clsArr);
                } else {
                    method = cls3.getConstructor(clsArr);
                }
            } else if (clsArr == null) {
                int i15 = juliet + 109;
                int i16 = i15 % 128;
                kilo = i16;
                if (i15 % 2 == 0) {
                    throw null;
                }
                if (z2) {
                    int i17 = i16 + 57;
                    juliet = i17 % 128;
                    if (i17 % 2 != 0) {
                        method = cls3.getDeclaredField(str);
                        int i18 = 54 / 0;
                    } else {
                        method = cls3.getDeclaredField(str);
                    }
                } else {
                    method = cls3.getField(str);
                }
            } else {
                if (z2) {
                    method = cls3.getDeclaredMethod(str, clsArr);
                    i11 = juliet + 43;
                } else {
                    method = cls3.getMethod(str, clsArr);
                    i11 = juliet + 119;
                }
                kilo = i11 % 128;
            }
            hashMap.put(valueOf, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int setPivotYN16904(int i4) {
        Object obj = alpha;
        int i5 = juliet + 75;
        int i10 = i5 % 128;
        kilo = i10;
        if (i5 % 2 == 0) {
            int i11 = 74 / 0;
        }
        juliet = ((i10 ^ 85) + ((i10 & 85) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i4)};
            byte[] bArr = hotel;
            byte b2 = bArr[7];
            int intValue = ((Integer) Class.forName(alpha(b2, (short) ((b2 ^ 626) | (b2 & 626)), bArr[85]), true, (ClassLoader) bravo).getMethod(alpha((byte) (-bArr[132]), bArr[7], bArr[85]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i12 = kilo;
            int i13 = (i12 & 35) + (i12 | 35);
            juliet = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 93 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int setPivotYN16904(Object obj) {
        int i4 = juliet;
        int i5 = (i4 ^ 107) + ((i4 & 107) << 1);
        int i10 = i5 % 128;
        kilo = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj2 = alpha;
        juliet = (((i10 | 111) << 1) - (i10 ^ 111)) % 128;
        try {
            Object[] objArr = {obj};
            byte b2 = hotel[7];
            int intValue = ((Integer) Class.forName(alpha(b2, (short) ((b2 ^ 626) | (b2 & 626)), r8[85]), true, (ClassLoader) bravo).getMethod(alpha((byte) (india & 368), r8[195], r8[28]), Object.class).invoke(obj2, objArr)).intValue();
            int i11 = juliet;
            kilo = ((i11 & 117) + (i11 | 117)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
