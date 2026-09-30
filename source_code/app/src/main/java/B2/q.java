package B2;

import Jb.e0;
import Nf.az;
import Tf.at;
import Yb.S;
import android.app.Dialog;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.lifecycle.au;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.base.BaseViewModel;
import com.app.network.network.models.WithdrawTransaction;
import com.checkout.components.core.featuregate.guard.JaywanSchemeEnabledGuard;
import com.checkout.components.core.featuregate.policy.CardSchemePolicy;
import com.checkout.components.core.ui.FlowComponent;
import com.checkout.components.redirecthandler.RedirectWebViewExecutor;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import delivery.samurai.android.ui.auth.signup.step4earnmoney.EarnYourMoneyFragment;
import delivery.samurai.android.ui.captainsuniforms.CaptainsUniformsFragment;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.compose.showcase.ComponentShowcaseFragment;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import ge.InterfaceC1772d;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import r3.C2492a;
import s0.AbstractC2557q;
import s6.AbstractC2689j6;
import s6.AbstractC2707l6;
import s6.AbstractC2716m6;
import s6.F6;
import s6.S6;
import t6.Z2;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ q(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:449:0x04d9, code lost:
    
        if (O2.m.alpha.contains(r6) != false) goto L240;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x075a  */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        O2.i iVar;
        Exception exc;
        boolean z2;
        int i4;
        int i5;
        int delta;
        int delta2;
        int min;
        double max;
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        ColorSpace colorSpace;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        bv.am amVar;
        int i11;
        int indigo;
        Iterator it;
        long quebec;
        long j5;
        Throwable th;
        Tf.u uVar;
        Throwable th2;
        Throwable th3;
        int echo;
        Pair pair;
        Integer num;
        char c3 = 7;
        int i12 = -1;
        int i13 = 12;
        int i14 = 4;
        int i15 = 2;
        Pair pair2 = null;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.alpha) {
            case 0:
                r rVar = (r) this.purple;
                rVar.getClass();
                K2.b.alpha(rVar);
                return Unit.INSTANCE;
            case 1:
                w wVar = (w) this.purple;
                wVar.getClass();
                int i16 = Build.VERSION.SDK_INT;
                String str = E2.c.white;
                Context context = wVar.bravo;
                if (i16 >= 34) {
                    E2.a.bravo(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList foxtrot = E2.c.foxtrot(context, jobScheduler);
                if (foxtrot != null && !foxtrot.isEmpty()) {
                    Iterator it2 = foxtrot.iterator();
                    while (it2.hasNext()) {
                        E2.c.charlie(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                WorkDatabase workDatabase = wVar.delta;
                J2.r uniform = workDatabase.uniform();
                WorkDatabase_Impl workDatabase_Impl = uniform.alpha;
                workDatabase_Impl.bravo();
                J2.h hVar = uniform.november;
                androidx.sqlite.db.framework.i alpha = hVar.alpha();
                try {
                    workDatabase_Impl.charlie();
                    try {
                        alpha.charlie();
                        workDatabase_Impl.papa();
                        hVar.lima(alpha);
                        k.bravo(wVar.charlie, workDatabase, wVar.foxtrot);
                        return Unit.INSTANCE;
                    } finally {
                        workDatabase_Impl.kilo();
                    }
                } catch (Throwable th4) {
                    hVar.lima(alpha);
                    throw th4;
                }
            case 2:
                ((AboutYouFragment) this.purple).f12220i = null;
                return Unit.INSTANCE;
            case 3:
                ((ComponentShowcaseFragment) this.purple).requireActivity().getOnBackPressedDispatcher().delta();
                return Unit.INSTANCE;
            case 4:
                ((t0) ((E.a) this.purple).f966c).setValue(Boolean.valueOf(!((Boolean) ((t0) r0.f966c).getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                AbstractC2557q.india((E.b) this.purple);
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(CardSchemePolicy.alpha((JaywanSchemeEnabledGuard) this.purple));
            case 7:
                ((EarnYourMoneyFragment) this.purple).f12229g = null;
                return Unit.INSTANCE;
            case 8:
                return FlowComponent.charlie((FlowComponent) this.purple);
            case 9:
                ((CaptainsUniformsFragment) this.purple).requireActivity().getOnBackPressedDispatcher().delta();
                return Unit.INSTANCE;
            case 10:
                ((Dialog) this.purple).dismiss();
                return Unit.INSTANCE;
            case 11:
                ((e0) this.purple).kilo();
                return Unit.INSTANCE;
            case 12:
                Jf.b bVar = (Jf.b) this.purple;
                Lf.g charlie = AbstractC2707l6.charlie("kotlinx.serialization.Polymorphic", Lf.c.bravo, new SerialDescriptor[0], new Aa.l(i13, bVar));
                InterfaceC1772d context2 = bVar.alpha;
                Intrinsics.echo(context2, "context");
                return new Lf.b(charlie, context2);
            case 13:
                Lf.g gVar = (Lf.g) this.purple;
                return Integer.valueOf(az.echo(gVar, gVar.kilo));
            case 14:
                N0.b bVar2 = (N0.b) this.purple;
                if (((Z.e) ((t0) bVar2.red).getValue()).alpha != 9205357640488583168L) {
                    ax axVar = bVar2.red;
                    if (!Z.e.echo(((Z.e) ((t0) axVar).getValue()).alpha)) {
                        return bVar2.alpha.bravo(((Z.e) ((t0) axVar).getValue()).alpha);
                    }
                }
                return null;
            case 15:
                return (X2.h) ((t0) ((N2.n) this.purple).f1865h).getValue();
            case 16:
                return (O0.o) this.purple;
            case 17:
                BitmapFactory.Options options = new BitmapFactory.Options();
                O2.e eVar = (O2.e) this.purple;
                O2.o oVar = eVar.alpha;
                O2.b bVar3 = new O2.b(oVar.echo());
                Tf.ak charlie2 = Tf.b.charlie(bVar3);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new Hd.b(2, charlie2.peek()), null, options);
                Exception exc2 = (Exception) bVar3.purple;
                if (exc2 == null) {
                    options.inJustDecodeBounds = false;
                    Paint paint = O2.l.alpha;
                    String str2 = options.outMimeType;
                    Set set = O2.m.alpha;
                    int ordinal = eVar.delta.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (str2 != null) {
                            break;
                        }
                        M1.g gVar2 = new M1.g(new O2.j(new Hd.b(2, charlie2.peek())));
                        int charlie3 = gVar2.charlie(1, "Orientation");
                        if (charlie3 != 2 && charlie3 != 7 && charlie3 != 4 && charlie3 != 5) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        switch (gVar2.charlie(1, "Orientation")) {
                            case 3:
                            case 4:
                                i10 = 180;
                                break;
                            case 5:
                            case 8:
                                i10 = 270;
                                break;
                            case 6:
                            case 7:
                                i10 = 90;
                                break;
                            default:
                                i10 = 0;
                                break;
                        }
                        iVar = new O2.i(i10, z12);
                        exc = (Exception) bVar3.purple;
                        if (exc != null) {
                            options.inMutable = false;
                            int i17 = Build.VERSION.SDK_INT;
                            X2.k kVar = eVar.bravo;
                            if (i17 >= 26 && (colorSpace = kVar.charlie) != null) {
                                options.inPreferredColorSpace = colorSpace;
                            }
                            options.inPremultiplied = kVar.hotel;
                            int i18 = iVar.bravo;
                            Bitmap.Config config4 = kVar.bravo;
                            boolean z17 = iVar.alpha;
                            if ((z17 || i18 > 0) && (config4 == null || Z2.charlie(config4))) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            if (kVar.golf && config4 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
                                config4 = Bitmap.Config.RGB_565;
                            }
                            if (i17 >= 26) {
                                config = options.outConfig;
                                config2 = Bitmap.Config.RGBA_F16;
                                if (config == config2) {
                                    config3 = Bitmap.Config.HARDWARE;
                                    if (config4 != config3) {
                                        config4 = Bitmap.Config.RGBA_F16;
                                    }
                                }
                            }
                            options.inPreferredConfig = config4;
                            F6 charlie4 = oVar.charlie();
                            boolean z18 = charlie4 instanceof O2.p;
                            Context context3 = kVar.alpha;
                            Y2.h hVar2 = kVar.delta;
                            if (z18 && Intrinsics.areEqual(hVar2, Y2.h.charlie)) {
                                options.inSampleSize = 1;
                                options.inScaled = true;
                                options.inDensity = ((O2.p) charlie4).alpha;
                                options.inTargetDensity = context3.getResources().getDisplayMetrics().densityDpi;
                                z2 = z17;
                            } else {
                                int i19 = options.outWidth;
                                if (i19 <= 0 || (i4 = options.outHeight) <= 0) {
                                    z2 = z17;
                                    options.inSampleSize = 1;
                                    options.inScaled = false;
                                } else {
                                    if (i18 != 90 && i18 != 270) {
                                        i5 = i19;
                                    } else {
                                        i5 = i4;
                                    }
                                    if (i18 != 90 && i18 != 270) {
                                        i19 = i4;
                                    }
                                    Y2.h hVar3 = Y2.h.charlie;
                                    boolean areEqual = Intrinsics.areEqual(hVar2, hVar3);
                                    Y2.g gVar3 = kVar.echo;
                                    if (areEqual) {
                                        delta = i5;
                                    } else {
                                        delta = a3.h.delta(hVar2.alpha, gVar3);
                                    }
                                    if (Intrinsics.areEqual(hVar2, hVar3)) {
                                        delta2 = i19;
                                    } else {
                                        delta2 = a3.h.delta(hVar2.bravo, gVar3);
                                    }
                                    int highestOneBit = Integer.highestOneBit(i5 / delta);
                                    int highestOneBit2 = Integer.highestOneBit(i19 / delta2);
                                    int[] iArr = O2.h.$EnumSwitchMapping$0;
                                    int i20 = iArr[gVar3.ordinal()];
                                    z2 = z17;
                                    if (i20 != 1) {
                                        if (i20 == 2) {
                                            min = Math.max(highestOneBit, highestOneBit2);
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        min = Math.min(highestOneBit, highestOneBit2);
                                    }
                                    if (min < 1) {
                                        min = 1;
                                    }
                                    options.inSampleSize = min;
                                    double d4 = min;
                                    double d9 = i19 / d4;
                                    double d10 = delta / (i5 / d4);
                                    double d11 = delta2 / d9;
                                    int i21 = iArr[gVar3.ordinal()];
                                    if (i21 != 1) {
                                        if (i21 == 2) {
                                            max = Math.min(d10, d11);
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        max = Math.max(d10, d11);
                                    }
                                    if (kVar.foxtrot && max > 1.0d) {
                                        max = 1.0d;
                                    }
                                    if (max == 1.0d) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    options.inScaled = !z10;
                                    if (!z10) {
                                        if (max > 1.0d) {
                                            options.inDensity = Zd.a.charlie(LottieConstants.IterateForever / max);
                                            options.inTargetDensity = LottieConstants.IterateForever;
                                        } else {
                                            options.inDensity = LottieConstants.IterateForever;
                                            options.inTargetDensity = Zd.a.charlie(LottieConstants.IterateForever * max);
                                        }
                                    }
                                }
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(new Hd.b(2, charlie2), null, options);
                                charlie2.close();
                                Exception exc3 = (Exception) bVar3.purple;
                                if (exc3 == null) {
                                    if (decodeStream != null) {
                                        decodeStream.setDensity(context3.getResources().getDisplayMetrics().densityDpi);
                                        if (z2 || i18 > 0) {
                                            Matrix matrix = new Matrix();
                                            float width = decodeStream.getWidth() / 2.0f;
                                            float height = decodeStream.getHeight() / 2.0f;
                                            if (z2) {
                                                matrix.postScale(-1.0f, 1.0f, width, height);
                                            }
                                            if (i18 > 0) {
                                                matrix.postRotate(i18, width, height);
                                            }
                                            RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                                            matrix.mapRect(rectF);
                                            float f5 = rectF.left;
                                            if (f5 != 0.0f || rectF.top != 0.0f) {
                                                matrix.postTranslate(-f5, -rectF.top);
                                            }
                                            if (i18 != 90 && i18 != 270) {
                                                int width2 = decodeStream.getWidth();
                                                int height2 = decodeStream.getHeight();
                                                Bitmap.Config config5 = decodeStream.getConfig();
                                                if (config5 == null) {
                                                    config5 = Bitmap.Config.ARGB_8888;
                                                }
                                                createBitmap = Bitmap.createBitmap(width2, height2, config5);
                                            } else {
                                                int height3 = decodeStream.getHeight();
                                                int width3 = decodeStream.getWidth();
                                                Bitmap.Config config6 = decodeStream.getConfig();
                                                if (config6 == null) {
                                                    config6 = Bitmap.Config.ARGB_8888;
                                                }
                                                createBitmap = Bitmap.createBitmap(height3, width3, config6);
                                            }
                                            new Canvas(createBitmap).drawBitmap(decodeStream, matrix, O2.l.alpha);
                                            decodeStream.recycle();
                                            decodeStream = createBitmap;
                                        }
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context3.getResources(), decodeStream);
                                        if (options.inSampleSize <= 1 && !options.inScaled) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        return new O2.g(bitmapDrawable, z11);
                                    }
                                    throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                }
                                throw exc3;
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    AbstractC2716m6.alpha(charlie2, th5);
                                    throw th6;
                                }
                            }
                        }
                        throw exc;
                    }
                    iVar = O2.i.charlie;
                    exc = (Exception) bVar3.purple;
                    if (exc != null) {
                    }
                } else {
                    throw exc2;
                }
                break;
            case 18:
                R.b bVar4 = (R.b) this.purple;
                R.k kVar2 = bVar4.alpha;
                Object obj = bVar4.silver;
                if (obj != null) {
                    return kVar2.alpha(bVar4, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 19:
                Bundle charlie5 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                ((R.j) this.purple).purple.charlie(charlie5);
                if (charlie5.isEmpty()) {
                    return null;
                }
                return charlie5;
            case 20:
                S.x xVar = (S.x) this.purple;
                while (true) {
                    synchronized (xVar.golf) {
                        try {
                            if (!xVar.charlie) {
                                xVar.charlie = z16;
                                try {
                                    J.e eVar2 = xVar.foxtrot;
                                    Object[] objArr = eVar2.alpha;
                                    int i22 = eVar2.red;
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        S.w wVar2 = (S.w) objArr[i23];
                                        bv.am amVar2 = wVar2.golf;
                                        Object[] objArr2 = amVar2.bravo;
                                        long[] jArr = amVar2.alpha;
                                        int length = jArr.length - i15;
                                        Object[] objArr3 = objArr;
                                        if (length >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                long j6 = jArr[i24];
                                                z14 = z16;
                                                amVar = amVar2;
                                                if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i25 = 8;
                                                    int i26 = 8 - ((~(i24 - length)) >>> 31);
                                                    int i27 = 0;
                                                    while (i27 < i26) {
                                                        if ((j6 & 255) < 128) {
                                                            i11 = i25;
                                                            wVar2.alpha.invoke(objArr2[(i24 << 3) + i27]);
                                                        } else {
                                                            i11 = i25;
                                                        }
                                                        j6 >>= i11;
                                                        i27++;
                                                        i25 = i11;
                                                    }
                                                    if (i26 != i25) {
                                                    }
                                                }
                                                if (i24 != length) {
                                                    i24++;
                                                    z16 = z14;
                                                    amVar2 = amVar;
                                                    c3 = 7;
                                                }
                                            }
                                        } else {
                                            z14 = z16;
                                            amVar = amVar2;
                                        }
                                        amVar.bravo();
                                        i23++;
                                        objArr = objArr3;
                                        z16 = z14;
                                        c3 = 7;
                                        i15 = 2;
                                    }
                                    z13 = z16;
                                    xVar.charlie = false;
                                } catch (Throwable th7) {
                                    xVar.charlie = false;
                                    throw th7;
                                }
                            } else {
                                z13 = z16;
                            }
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                    if (!xVar.charlie()) {
                        return Unit.INSTANCE;
                    }
                    z16 = z13;
                    c3 = 7;
                    i15 = 2;
                }
            case 21:
                int i28 = LocationInfoActivity.Q;
                return Boolean.valueOf(((LocationInfoActivity) this.purple).getIntent().getBooleanExtra("isFromLogin", true));
            case 22:
                Uf.h hVar4 = (Uf.h) this.purple;
                ClassLoader classLoader = hVar4.alpha;
                Enumeration<URL> resources = classLoader.getResources("");
                Intrinsics.delta(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                Intrinsics.delta(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    Tf.u uVar2 = hVar4.purple;
                    if (hasNext) {
                        URL url = (URL) it3.next();
                        Intrinsics.checkNotNull(url);
                        if (!Intrinsics.areEqual(url.getProtocol(), CTVariableUtils.FILE)) {
                            pair = null;
                        } else {
                            String str3 = Tf.ah.purple;
                            pair = new Pair(uVar2, r6.u.charlie(new File(url.toURI())));
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    } else {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        Intrinsics.delta(resources2, "getResources(...)");
                        ArrayList list2 = Collections.list(resources2);
                        Intrinsics.delta(list2, "list(...)");
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            URL url2 = (URL) it4.next();
                            Intrinsics.checkNotNull(url2);
                            String url3 = url2.toString();
                            Intrinsics.delta(url3, "toString(...)");
                            if (!kotlin.text.r.quebec(url3, "jar:file:", z15) || (indigo = StringsKt.indigo(6, url3, "!")) == i12) {
                                it = it4;
                                uVar = uVar2;
                            } else {
                                String str4 = Tf.ah.purple;
                                String substring = url3.substring(i14, indigo);
                                Intrinsics.delta(substring, "substring(...)");
                                Tf.ah charlie6 = r6.u.charlie(new File(URI.create(substring)));
                                Tf.r openReadOnly = uVar2.openReadOnly(charlie6);
                                try {
                                    it = it4;
                                    quebec = openReadOnly.quebec() - 22;
                                    j5 = 0;
                                } catch (Throwable th9) {
                                    if (openReadOnly == null) {
                                    }
                                }
                                if (quebec >= 0) {
                                    long max2 = Math.max(quebec - 65536, 0L);
                                    while (true) {
                                        Tf.ak charlie7 = Tf.b.charlie(openReadOnly.uniform(quebec));
                                        try {
                                            long j7 = j5;
                                            if (charlie7.echo() == 101010256) {
                                                int golf = charlie7.golf() & 65535;
                                                int golf2 = charlie7.golf() & 65535;
                                                long golf3 = charlie7.golf() & 65535;
                                                Tf.u uVar3 = uVar2;
                                                if (golf3 == (charlie7.golf() & 65535) && golf == 0 && golf2 == 0) {
                                                    charlie7.india(4L);
                                                    int golf4 = charlie7.golf() & 65535;
                                                    E8.d dVar = new E8.d(golf4, golf3, charlie7.echo() & 4294967295L);
                                                    charlie7.juliet(golf4);
                                                    charlie7.close();
                                                    long j10 = quebec - 20;
                                                    if (j10 > j7) {
                                                        charlie7 = Tf.b.charlie(openReadOnly.uniform(j10));
                                                        try {
                                                            if (charlie7.echo() == 117853008) {
                                                                int echo2 = charlie7.echo();
                                                                long foxtrot2 = charlie7.foxtrot();
                                                                if (charlie7.echo() == 1 && echo2 == 0) {
                                                                    charlie7 = Tf.b.charlie(openReadOnly.uniform(foxtrot2));
                                                                    try {
                                                                        echo = charlie7.echo();
                                                                    } catch (Throwable th10) {
                                                                        try {
                                                                        } catch (Throwable th11) {
                                                                            AbstractC2689j6.charlie(th10, th11);
                                                                        }
                                                                        th3 = th10;
                                                                    }
                                                                    if (echo == 101075792) {
                                                                        charlie7.india(12L);
                                                                        int echo3 = charlie7.echo();
                                                                        int echo4 = charlie7.echo();
                                                                        long foxtrot3 = charlie7.foxtrot();
                                                                        if (foxtrot3 == charlie7.foxtrot() && echo3 == 0 && echo4 == 0) {
                                                                            charlie7.india(8L);
                                                                            try {
                                                                                th3 = null;
                                                                            } catch (Throwable th12) {
                                                                                th3 = th12;
                                                                            }
                                                                            dVar = new E8.d(golf4, foxtrot3, charlie7.foxtrot());
                                                                            if (th3 != null) {
                                                                                throw th3;
                                                                            }
                                                                        } else {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                    } else {
                                                                        throw new IOException("bad zip: expected " + Uf.m.bravo(101075792) + " but was " + Uf.m.bravo(echo));
                                                                    }
                                                                } else {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                            }
                                                            try {
                                                                th2 = null;
                                                            } catch (Throwable th13) {
                                                                th2 = th13;
                                                            }
                                                        } catch (Throwable th14) {
                                                            try {
                                                            } catch (Throwable th15) {
                                                                AbstractC2689j6.charlie(th14, th15);
                                                            }
                                                            th2 = th14;
                                                        }
                                                        if (th2 != null) {
                                                            throw th2;
                                                        }
                                                    }
                                                    E8.d dVar2 = dVar;
                                                    ArrayList arrayList3 = new ArrayList();
                                                    charlie7 = Tf.b.charlie(openReadOnly.uniform(dVar2.bravo));
                                                    try {
                                                        long j11 = dVar2.alpha;
                                                        while (j7 < j11) {
                                                            Uf.j charlie8 = Uf.m.charlie(charlie7);
                                                            if (charlie8.hotel < dVar2.bravo) {
                                                                Tf.ah ahVar = Uf.h.silver;
                                                                if (W8.a.echo(charlie8.alpha)) {
                                                                    arrayList3.add(charlie8);
                                                                }
                                                                j7++;
                                                            } else {
                                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                break;
                                                            }
                                                        }
                                                        try {
                                                            th = null;
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        try {
                                                        } catch (Throwable th18) {
                                                            AbstractC2689j6.charlie(th17, th18);
                                                        }
                                                        th = th17;
                                                    }
                                                    if (th == null) {
                                                        uVar = uVar3;
                                                        at atVar = new at(charlie6, uVar, Uf.m.alpha(arrayList3));
                                                        try {
                                                            openReadOnly.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                        pair2 = new Pair(atVar, Uf.h.silver);
                                                    } else {
                                                        throw th;
                                                    }
                                                } else {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                if (openReadOnly == null) {
                                                    try {
                                                        openReadOnly.close();
                                                        throw th9;
                                                    } catch (Throwable th19) {
                                                        AbstractC2689j6.charlie(th9, th19);
                                                        throw th9;
                                                    }
                                                }
                                                throw th9;
                                            }
                                            Tf.u uVar4 = uVar2;
                                            charlie7.close();
                                            quebec--;
                                            if (quebec >= max2) {
                                                uVar2 = uVar4;
                                                j5 = j7;
                                            } else {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                        } finally {
                                            charlie7.close();
                                        }
                                    }
                                } else {
                                    throw new IOException("not a zip: size=" + openReadOnly.quebec());
                                }
                            }
                            if (pair2 != null) {
                                arrayList2.add(pair2);
                            }
                            uVar2 = uVar;
                            it4 = it;
                            i12 = -1;
                            i14 = 4;
                            pair2 = null;
                            z15 = false;
                        }
                        return CollectionsKt.a(arrayList, arrayList2);
                    }
                }
                break;
            case 23:
                int i29 = AddressNoteActivity.f12347W;
                Intent intent = new Intent();
                AddressNoteActivity addressNoteActivity = (AddressNoteActivity) this.purple;
                if (addressNoteActivity.f12355O) {
                    intent.putExtra("SKIPPED_ORDER_ID", addressNoteActivity.f12354N);
                }
                intent.putExtra("UPDATED_TASK_ID", addressNoteActivity.f12353M);
                addressNoteActivity.setResult(-1, intent);
                addressNoteActivity.finish();
                return Unit.INSTANCE;
            case 24:
                String string = ((Wb.s) this.purple).requireArguments().getString("arg_phone");
                if (string == null) {
                    return "";
                }
                return string;
            case 25:
                WithdrawDetailActivity withdrawDetailActivity = (WithdrawDetailActivity) this.purple;
                WithdrawTransaction withdrawTransaction = withdrawDetailActivity.f12550K;
                if (withdrawTransaction == null || (num = withdrawTransaction.getId()) == null) {
                    num = withdrawDetailActivity.f12551L;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    WithDrawHistoryViewModel withDrawHistoryViewModel = (WithDrawHistoryViewModel) withdrawDetailActivity.f12548I.getValue();
                    ?? auVar = new au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(withDrawHistoryViewModel, null, new Wc.t(withDrawHistoryViewModel, intValue, auVar, null), 1, null);
                    auVar.observe(withdrawDetailActivity, new Dc.t(12, new Aa.d(withdrawDetailActivity, intValue, i14)));
                }
                return Unit.INSTANCE;
            case 26:
                return ((Y1.l) this.purple).f2268a.bravo();
            case 27:
                return RedirectWebViewExecutor.delta((RedirectWebViewExecutor) this.purple);
            case 28:
                Yb.ag agVar = (Yb.ag) this.purple;
                agVar.echo = false;
                agVar.alpha();
                return Unit.INSTANCE;
            default:
                S s3 = (S) this.purple;
                s3.delta = false;
                s3.alpha();
                return Unit.INSTANCE;
        }
    }
}
