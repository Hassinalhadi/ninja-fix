package bj;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.P0;
import androidx.camera.core.t;
import av.ah;
import bv.aa;
import bv.z;
import bz.C0794t;
import bz.InterfaceC0799y;
import bz.j0;
import bz.k0;
import bz.n0;
import bz.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import r1.C2483b;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public class e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f3385a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public Object f3386b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3387c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3388d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3389f;
    public int[] purple;
    public final Object red;
    public final Object silver;
    public Object teal;
    public Object white;
    public Object yellow;

    public e() {
        this.red = new AtomicBoolean(false);
        this.silver = new HashMap();
        this.white = EGL14.EGL_NO_DISPLAY;
        this.yellow = EGL14.EGL_NO_CONTEXT;
        this.purple = bl.i.alpha;
        this.f3386b = EGL14.EGL_NO_SURFACE;
        this.f3388d = Collections.EMPTY_MAP;
        this.e = null;
        this.f3389f = bl.f.alpha;
        this.alpha = -1;
    }

    @Override // bz.i0
    public /* synthetic */ boolean alpha() {
        return false;
    }

    @Override // bz.i0
    public long amber(r rVar, r rVar2, r rVar3) {
        return lavender() * 1000000;
    }

    public void bravo(t tVar, J2.i iVar) {
        int i4;
        int i5;
        int i10;
        int i11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.white = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i12 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.white, iArr, 0, iArr, 1)) {
                if (iVar != null) {
                    String str = iArr[0] + "." + iArr[1];
                    if (str != null) {
                        iVar.purple = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                if (tVar.alpha()) {
                    i4 = 10;
                } else {
                    i4 = 8;
                }
                if (tVar.alpha()) {
                    i5 = 2;
                } else {
                    i5 = 8;
                }
                if (tVar.alpha()) {
                    i10 = 64;
                } else {
                    i10 = 4;
                }
                int i13 = i10;
                if (tVar.alpha()) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.white, new int[]{12324, i4, 12323, i4, 12322, i4, 12321, i5, 12325, 0, 12326, 0, 12352, i13, 12610, i11, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (tVar.alpha()) {
                        i12 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.white, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i12, 12344}, 0);
                    bl.i.alpha("eglCreateContext");
                    this.f3385a = eGLConfig;
                    this.yellow = eglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext((EGLDisplay) this.white, eglCreateContext, 12440, iArr2, 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.white = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public bl.c charlie(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.white;
            EGLConfig eGLConfig = (EGLConfig) this.f3385a;
            Objects.requireNonNull(eGLConfig);
            EGLSurface india = bl.i.india(eGLDisplay, eGLConfig, surface, this.purple);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.white;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, india, 12375, iArr, 0);
            int i4 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, india, 12374, iArr2, 0);
            Size size = new Size(i4, iArr2[0]);
            return new bl.c(india, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            AbstractC3066u3.juliet("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    @Override // bz.i0
    public r delta(r rVar, r rVar2, r rVar3) {
        return gray(amber(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    public void echo() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.white;
        EGLConfig eGLConfig = (EGLConfig) this.f3385a;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = bl.i.alpha;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        bl.i.alpha("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.f3386b = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    @Override // bz.i0
    public r foxtrot(long j5, r rVar, r rVar2, r rVar3) {
        r rVar4;
        r rVar5;
        float f5;
        int i4;
        boolean z2;
        r rVar6 = rVar;
        r rVar7 = rVar2;
        boolean z10 = true;
        int[] iArr = j0.alpha;
        int i5 = 0;
        long j6 = (j5 / 1000000) - 0;
        int i10 = this.alpha;
        long j7 = i10;
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 <= j7) {
            j7 = j6;
        }
        int i11 = (int) j7;
        aa aaVar = (aa) this.silver;
        n0 n0Var = (n0) aaVar.bravo(i11);
        if (n0Var != null) {
            return n0Var.alpha;
        }
        if (i11 >= i10) {
            return rVar7;
        }
        if (i11 <= 0) {
            return rVar6;
        }
        kilo(rVar6, rVar7, rVar3);
        r rVar8 = (r) this.yellow;
        Intrinsics.checkNotNull(rVar8);
        if (((ah) this.f3389f) != j0.charlie) {
            float hotel = hotel(golf(i11), i11, false);
            float[] fArr = (float[]) this.f3388d;
            C0794t[][] c0794tArr = (C0794t[][]) ((ah) this.f3389f).purple;
            int length = c0794tArr.length - 1;
            float f10 = c0794tArr[0][0].alpha;
            float f11 = c0794tArr[length][0].bravo;
            int length2 = fArr.length;
            if (hotel >= f10 && hotel <= f11) {
                int length3 = c0794tArr.length;
                int i12 = 0;
                boolean z11 = false;
                while (i12 < length3) {
                    int i13 = i5;
                    int i14 = i13;
                    while (i13 < length2 - 1) {
                        C0794t c0794t = c0794tArr[i12][i14];
                        if (hotel <= c0794t.bravo) {
                            if (c0794t.papa) {
                                float f12 = c0794t.alpha;
                                float f13 = c0794t.kilo;
                                float f14 = c0794t.echo;
                                z2 = z10;
                                float f15 = c0794t.charlie;
                                fArr[i13] = Q0.c.lima(f14, f15, (hotel - f12) * f13, f15);
                                float f16 = (hotel - f12) * f13;
                                float f17 = c0794t.foxtrot;
                                float f18 = c0794t.delta;
                                fArr[i13 + 1] = Q0.c.lima(f17, f18, f16, f18);
                            } else {
                                z2 = z10;
                                c0794t.charlie(hotel);
                                fArr[i13] = (c0794t.november * c0794t.hotel) + c0794t.quebec;
                                fArr[i13 + 1] = (c0794t.oscar * c0794t.india) + c0794t.romeo;
                            }
                            z11 = z2;
                        } else {
                            z2 = z10;
                        }
                        i13 += 2;
                        i14++;
                        z10 = z2;
                    }
                    boolean z12 = z10;
                    if (z11) {
                        break;
                    }
                    i12++;
                    z10 = z12;
                    i5 = 0;
                }
            } else {
                if (hotel > f11) {
                    f10 = f11;
                } else {
                    length = 0;
                }
                float f19 = hotel - f10;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length2 - 1) {
                    C0794t c0794t2 = c0794tArr[length][i16];
                    boolean z13 = c0794t2.papa;
                    float f20 = c0794t2.romeo;
                    float f21 = c0794t2.quebec;
                    if (z13) {
                        float f22 = c0794t2.alpha;
                        float f23 = c0794t2.kilo;
                        f5 = f19;
                        float f24 = c0794t2.echo;
                        i4 = i15;
                        float f25 = c0794t2.charlie;
                        fArr[i4] = (f5 * f21) + Q0.c.lima(f24, f25, (f10 - f22) * f23, f25);
                        float f26 = (f10 - f22) * f23;
                        float f27 = c0794t2.foxtrot;
                        float f28 = c0794t2.delta;
                        fArr[i4 + 1] = (f5 * f20) + Q0.c.lima(f27, f28, f26, f28);
                    } else {
                        f5 = f19;
                        i4 = i15;
                        c0794t2.charlie(f10);
                        fArr[i4] = (c0794t2.alpha() * f5) + (c0794t2.november * c0794t2.hotel) + f21;
                        fArr[i4 + 1] = (c0794t2.bravo() * f5) + (c0794t2.oscar * c0794t2.india) + f20;
                    }
                    i15 = i4 + 2;
                    i16++;
                    f19 = f5;
                }
            }
            int length4 = fArr.length;
            for (int i17 = 0; i17 < length4; i17++) {
                rVar8.echo(fArr[i17], i17);
            }
            return rVar8;
        }
        int golf = golf(i11);
        float hotel2 = hotel(golf, i11, true);
        z zVar = (z) this.red;
        n0 n0Var2 = (n0) aaVar.bravo(zVar.alpha(golf));
        if (n0Var2 != null && (rVar5 = n0Var2.alpha) != null) {
            rVar6 = rVar5;
        }
        n0 n0Var3 = (n0) aaVar.bravo(zVar.alpha(golf + 1));
        if (n0Var3 != null && (rVar4 = n0Var3.alpha) != null) {
            rVar7 = rVar4;
        }
        int bravo = rVar8.bravo();
        for (int i18 = 0; i18 < bravo; i18++) {
            rVar8.echo((rVar7.alpha(i18) * hotel2) + ((1 - hotel2) * rVar6.alpha(i18)), i18);
        }
        return rVar8;
    }

    public int golf(int i4) {
        int i5;
        z zVar = (z) this.red;
        int i10 = zVar.bravo;
        if (i10 > 0) {
            int i11 = i10 - 1;
            int i12 = 0;
            while (true) {
                if (i12 <= i11) {
                    i5 = (i12 + i11) >>> 1;
                    int i13 = zVar.alpha[i5];
                    if (i13 < i4) {
                        i12 = i5 + 1;
                    } else {
                        if (i13 <= i4) {
                            break;
                        }
                        i11 = i5 - 1;
                    }
                } else {
                    i5 = -(i12 + 1);
                    break;
                }
            }
            if (i5 < -1) {
                return -(i5 + 2);
            }
            return i5;
        }
        bw.a.delta("");
        throw null;
    }

    @Override // bz.i0
    public r gray(long j5, r rVar, r rVar2, r rVar3) {
        long j6;
        int[] iArr = j0.alpha;
        int i4 = 0;
        long j7 = (j5 / 1000000) - 0;
        long j10 = this.alpha;
        if (j7 < 0) {
            j7 = 0;
        }
        if (j7 > j10) {
            j6 = j10;
        } else {
            j6 = j7;
        }
        if (j6 < 0) {
            return rVar3;
        }
        kilo(rVar, rVar2, rVar3);
        r rVar4 = (r) this.f3385a;
        Intrinsics.checkNotNull(rVar4);
        if (((ah) this.f3389f) != j0.charlie) {
            int i5 = (int) j6;
            float hotel = hotel(golf(i5), i5, false);
            float[] fArr = (float[]) this.e;
            C0794t[][] c0794tArr = (C0794t[][]) ((ah) this.f3389f).purple;
            float f5 = c0794tArr[0][0].alpha;
            float f10 = c0794tArr[c0794tArr.length - 1][0].bravo;
            if (hotel < f5) {
                hotel = f5;
            }
            if (hotel <= f10) {
                f10 = hotel;
            }
            int length = fArr.length;
            boolean z2 = false;
            for (C0794t[] c0794tArr2 : c0794tArr) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < length - 1) {
                    C0794t c0794t = c0794tArr2[i11];
                    if (f10 <= c0794t.bravo) {
                        if (c0794t.papa) {
                            fArr[i10] = c0794t.quebec;
                            fArr[i10 + 1] = c0794t.romeo;
                        } else {
                            c0794t.charlie(f10);
                            fArr[i10] = c0794t.alpha();
                            fArr[i10 + 1] = c0794t.bravo();
                        }
                        z2 = true;
                    }
                    i10 += 2;
                    i11++;
                }
                if (z2) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i4 < length2) {
                rVar4.echo(fArr[i4], i4);
                i4++;
            }
        } else {
            r foxtrot = foxtrot((j6 - 1) * 1000000, rVar, rVar2, rVar3);
            r foxtrot2 = foxtrot(j6 * 1000000, rVar, rVar2, rVar3);
            int bravo = foxtrot.bravo();
            while (i4 < bravo) {
                rVar4.echo((foxtrot.alpha(i4) - foxtrot2.alpha(i4)) * 1000.0f, i4);
                i4++;
            }
        }
        return rVar4;
    }

    public float hotel(int i4, int i5, boolean z2) {
        InterfaceC0799y interfaceC0799y;
        float f5;
        z zVar = (z) this.red;
        if (i4 >= zVar.bravo - 1) {
            f5 = i5;
        } else {
            int alpha = zVar.alpha(i4);
            int alpha2 = zVar.alpha(i4 + 1);
            if (i5 == alpha) {
                f5 = alpha;
            } else {
                int i10 = alpha2 - alpha;
                n0 n0Var = (n0) ((aa) this.silver).bravo(alpha);
                if (n0Var == null || (interfaceC0799y = n0Var.bravo) == null) {
                    interfaceC0799y = (S7.a) this.teal;
                }
                float f10 = i10;
                float bravo = interfaceC0799y.bravo((i5 - alpha) / f10);
                if (z2) {
                    return bravo;
                }
                f5 = (f10 * bravo) + alpha;
            }
        }
        return f5 / ((float) 1000);
    }

    public C2483b india(t tVar) {
        bl.i.delta((AtomicBoolean) this.red, false);
        try {
            bravo(tVar, null);
            echo();
            lima((EGLSurface) this.f3386b);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.white, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new C2483b(glGetString, eglQueryString);
        } catch (IllegalStateException e) {
            AbstractC3066u3.juliet("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new C2483b("", "");
        } finally {
            november();
        }
    }

    @Override // bz.k0
    public int jade() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [J2.i, java.lang.Object] */
    public bl.a juliet(t tVar) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.red;
        bl.i.delta(atomicBoolean, false);
        ?? obj = new Object();
        obj.alpha = "0.0";
        obj.purple = "0.0";
        String str = "";
        obj.red = "";
        obj.silver = "";
        try {
            if (tVar.alpha()) {
                C2483b india = india(tVar);
                String str2 = (String) india.alpha;
                str2.getClass();
                String str3 = (String) india.bravo;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    AbstractC3066u3.india("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    tVar = t.delta;
                }
                this.purple = bl.i.foxtrot(str3, tVar);
                obj.red = str2;
                obj.silver = str3;
            }
            bravo(tVar, obj);
            echo();
            lima((EGLSurface) this.f3386b);
            String juliet = bl.i.juliet();
            if (juliet != null) {
                obj.alpha = juliet;
                this.f3388d = bl.i.golf(tVar);
                int hotel = bl.i.hotel();
                this.alpha = hotel;
                quebec(hotel);
                this.teal = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) obj.alpha) == null) {
                    str = " glVersion";
                }
                if (((String) obj.purple) == null) {
                    str = str.concat(" eglVersion");
                }
                if (((String) obj.red) == null) {
                    str = P0.crimson(str, " glExtensions");
                }
                if (((String) obj.silver) == null) {
                    str = P0.crimson(str, " eglExtensions");
                }
                if (str.isEmpty()) {
                    return new bl.a((String) obj.alpha, (String) obj.purple, (String) obj.red, (String) obj.silver);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalArgumentException e) {
            e = e;
            november();
            throw e;
        } catch (IllegalStateException e4) {
            e = e4;
            november();
            throw e;
        }
    }

    public void kilo(r rVar, r rVar2, r rVar3) {
        boolean z2;
        float[] fArr;
        if (((ah) this.f3389f) != j0.charlie) {
            z2 = true;
        } else {
            z2 = false;
        }
        r rVar4 = (r) this.yellow;
        aa aaVar = (aa) this.silver;
        z zVar = (z) this.red;
        if (rVar4 == null) {
            this.yellow = rVar.charlie();
            this.f3385a = rVar3.charlie();
            int i4 = zVar.bravo;
            float[] fArr2 = new float[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                fArr2[i5] = zVar.alpha(i5) / ((float) 1000);
            }
            this.white = fArr2;
            int i10 = zVar.bravo;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = 0;
            }
            this.purple = iArr;
        }
        if (z2) {
            if (((ah) this.f3389f) != j0.charlie && Intrinsics.areEqual((r) this.f3386b, rVar) && Intrinsics.areEqual((r) this.f3387c, rVar2)) {
                return;
            }
            this.f3386b = rVar;
            this.f3387c = rVar2;
            int bravo = rVar.bravo() + (rVar.bravo() % 2);
            this.f3388d = new float[bravo];
            this.e = new float[bravo];
            int i12 = zVar.bravo;
            float[][] fArr3 = new float[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int alpha = zVar.alpha(i13);
                n0 n0Var = (n0) aaVar.bravo(alpha);
                if (alpha == 0 && n0Var == null) {
                    fArr = new float[bravo];
                    for (int i14 = 0; i14 < bravo; i14++) {
                        fArr[i14] = rVar.alpha(i14);
                    }
                } else if (alpha == this.alpha && n0Var == null) {
                    fArr = new float[bravo];
                    for (int i15 = 0; i15 < bravo; i15++) {
                        fArr[i15] = rVar2.alpha(i15);
                    }
                } else {
                    Intrinsics.checkNotNull(n0Var);
                    r rVar5 = n0Var.alpha;
                    float[] fArr4 = new float[bravo];
                    for (int i16 = 0; i16 < bravo; i16++) {
                        fArr4[i16] = rVar5.alpha(i16);
                    }
                    fArr = fArr4;
                }
                fArr3[i13] = fArr;
            }
            this.f3389f = new ah(this.purple, (float[]) this.white, fArr3);
        }
    }

    @Override // bz.k0
    public int lavender() {
        return this.alpha;
    }

    public void lima(EGLSurface eGLSurface) {
        ((EGLDisplay) this.white).getClass();
        ((EGLContext) this.yellow).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.white, eGLSurface, eGLSurface, (EGLContext) this.yellow)) {
        } else {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void mike(Surface surface) {
        bl.i.delta((AtomicBoolean) this.red, true);
        bl.i.charlie((Thread) this.teal);
        HashMap hashMap = (HashMap) this.silver;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, bl.i.juliet);
        }
    }

    public void november() {
        Iterator it = ((Map) this.f3388d).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((bl.g) it.next()).alpha);
        }
        this.f3388d = Collections.EMPTY_MAP;
        this.e = null;
        if (!Objects.equals((EGLDisplay) this.white, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.white;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = (HashMap) this.silver;
            for (bl.c cVar : hashMap.values()) {
                if (!Objects.equals(cVar.alpha, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.white, cVar.alpha)) {
                    try {
                        bl.i.alpha("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        AbstractC3066u3.delta("GLUtils", e.toString(), e);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.f3386b, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.white, (EGLSurface) this.f3386b);
                this.f3386b = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.yellow, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.white, (EGLContext) this.yellow);
                this.yellow = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.white);
            this.white = EGL14.EGL_NO_DISPLAY;
        }
        this.f3385a = null;
        this.alpha = -1;
        this.f3389f = bl.f.alpha;
        this.f3387c = null;
        this.teal = null;
    }

    public void oscar(Surface surface, boolean z2) {
        bl.c cVar;
        if (((Surface) this.f3387c) == surface) {
            this.f3387c = null;
            lima((EGLSurface) this.f3386b);
        }
        HashMap hashMap = (HashMap) this.silver;
        if (z2) {
            cVar = (bl.c) hashMap.remove(surface);
        } else {
            cVar = (bl.c) hashMap.put(surface, bl.i.juliet);
        }
        if (cVar != null && cVar != bl.i.juliet) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.white, cVar.alpha);
            } catch (RuntimeException e) {
                AbstractC3066u3.juliet("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    public void papa(long j5, float[] fArr, Surface surface) {
        bl.i.delta((AtomicBoolean) this.red, true);
        bl.i.charlie((Thread) this.teal);
        HashMap hashMap = (HashMap) this.silver;
        T7.golf("The surface is not registered.", hashMap.containsKey(surface));
        bl.c cVar = (bl.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == bl.i.juliet) {
            cVar = charlie(surface);
            if (cVar != null) {
                hashMap.put(surface, cVar);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.f3387c;
        EGLSurface eGLSurface = cVar.alpha;
        if (surface != surface2) {
            lima(eGLSurface);
            this.f3387c = surface;
            int i4 = cVar.bravo;
            int i5 = cVar.charlie;
            GLES20.glViewport(0, 0, i4, i5);
            GLES20.glScissor(0, 0, i4, i5);
        }
        bl.g gVar = (bl.g) this.e;
        gVar.getClass();
        if (gVar instanceof bl.h) {
            GLES20.glUniformMatrix4fv(((bl.h) gVar).foxtrot, 1, false, fArr, 0);
            bl.i.bravo("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        bl.i.bravo("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.white, eGLSurface, j5);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.white, eGLSurface)) {
            AbstractC3066u3.india("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            oscar(surface, false);
        }
    }

    public void quebec(int i4) {
        bl.g gVar = (bl.g) ((Map) this.f3388d).get((bl.f) this.f3389f);
        if (gVar != null) {
            if (((bl.g) this.e) != gVar) {
                this.e = gVar;
                gVar.bravo();
                Log.d("OpenGlRenderer", "Using program for input format " + ((bl.f) this.f3389f) + ": " + ((bl.g) this.e));
            }
            GLES20.glActiveTexture(33984);
            bl.i.bravo("glActiveTexture");
            GLES20.glBindTexture(36197, i4);
            bl.i.bravo("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + ((bl.f) this.f3389f));
    }

    public e(z zVar, aa aaVar, int i4, S7.a aVar) {
        this.red = zVar;
        this.silver = aaVar;
        this.alpha = i4;
        this.teal = aVar;
        this.purple = j0.alpha;
        float[] fArr = j0.bravo;
        this.white = fArr;
        this.f3388d = fArr;
        this.e = fArr;
        this.f3389f = j0.charlie;
    }
}
