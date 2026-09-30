package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro_internal.ax;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1277x0 {
    public static int charlie = 0;
    public static int delta = 1;
    public final Context alpha;
    public final ConnectivityManager bravo;

    public C1277x0(Context context, ConnectivityManager connectivityManager) {
        this.alpha = context;
        this.bravo = connectivityManager;
    }

    public static final /* synthetic */ ConnectivityManager alpha(C1277x0 c1277x0) {
        int i4 = charlie;
        delta = (i4 + 27) % 128;
        ConnectivityManager connectivityManager = c1277x0.bravo;
        int i5 = i4 + 73;
        delta = i5 % 128;
        if (i5 % 2 != 0) {
            return connectivityManager;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object charlie(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i4;
        int i15 = ~i12;
        int i16 = (~((~i5) | i15)) | i14;
        int i17 = i4 | i15;
        int i18 = (~(i5 | i14 | i15)) | (~(i12 | i4));
        int i19 = ((-895483904) * i11) + ((-243269632) * i10) + ((-1205862400) * i13) + (1605645861 * i18) + (1083675574 * i17) + (i16 * 1605645861) + (2005429323 * i4) + ((1483459036 * i12) - 1284505600);
        int papa = AbstractC2327c.papa(i11, -609071723, (2049387148 * i10) + i12 + i4 + i13);
        if (AbstractC2327c.quebec(papa, 2020605952, (i11 * 126640917) + (i10 * (-616405876)) + (i13 * 335896449) + (i18 * 933) + (i17 * (-1866)) + (i16 * 933) + (i4 * 335898315) + ((i12 * 335895516) - 1139737737), -544210944, ((-1334837248) * papa) + i19) != 1) {
            C1277x0 c1277x0 = (C1277x0) objArr[0];
            int i20 = charlie;
            delta = (i20 + 29) % 128;
            Context context = c1277x0.alpha;
            int i21 = i20 + 123;
            delta = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 77 / 0;
            }
            return context;
        }
        final C1277x0 c1277x02 = (C1277x0) objArr[0];
        try {
            Object[] objArr2 = {0L, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: FILLED_NEW_ARRAY (r9v4 'objArr2' java.lang.Object[]) = 
                  (0 long)
                  (wrap:kotlin.jvm.functions.Function0<com.fingerprintjs.android.fpjs_pro_internal.N14263A23323<? extends java.lang.Boolean, ? extends com.fingerprintjs.android.fpjs_pro_internal.w0$a>>:0x009c: CONSTRUCTOR (r9v2 'c1277x02' com.fingerprintjs.android.fpjs_pro_internal.x0 A[DONT_INLINE]) A[MD:(com.fingerprintjs.android.fpjs_pro_internal.x0):void (m), WRAPPED] (LINE:157) call: com.fingerprintjs.android.fpjs_pro_internal.ax.5.<init>(com.fingerprintjs.android.fpjs_pro_internal.x0):void type: CONSTRUCTOR)
                  (1 int)
                  (null java.lang.Object)
                 A[Catch: all -> 0x012e, DECLARE_VAR, TRY_ENTER] (LINE:160) elemType: java.lang.Object in method: com.fingerprintjs.android.fpjs_pro_internal.x0.charlie(java.lang.Object[], int, int, int, int, int, int):java.lang.Object, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.fingerprintjs.android.fpjs_pro_internal.ax, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.filledNewArray(InsnGen.java:714)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:449)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 25 more
                */
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fingerprintjs.android.fpjs_pro_internal.C1277x0.charlie(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final N14263A23323 bravo() {
            try {
                Object[] objArr = {0L, new C1269v0(this), 1, null};
                Object echo = am.echo(853678683);
                if (echo == null) {
                    echo = am.charlie((char) (40620 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 51 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 221, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
                N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
                if (!(!(n14263a23323 instanceof component8))) {
                    int i4 = delta + 121;
                    charlie = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                } else if (n14263a23323 instanceof setTopP6481) {
                    n14263a23323 = new setTopP6481(ax.component9.a.charlie);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                N14263A23323 D8871 = bk.D8871(n14263a23323);
                int i5 = charlie;
                delta = ((i5 ^ 113) + ((i5 & 113) << 1)) % 128;
                return D8871;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }
