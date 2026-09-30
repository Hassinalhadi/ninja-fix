package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC1392x1 {
    private static final D0 zzb;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private D1 zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private E0 zzR;
    private B1 zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private C1399z0 zzab;
    private String zzac;
    private D1 zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private C1360p0 zzam;
    private int zzan;
    private C1348m0 zzao;
    private String zzap;
    private K0 zzaq;
    private long zzar;
    private String zzas;
    private int zzd;
    private int zze;
    private int zzf;
    private D1 zzg;
    private D1 zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        D0 d02 = new D0();
        zzb = d02;
        AbstractC1392x1.juliet(D0.class, d02);
    }

    public D0() {
        V1 v1 = V1.teal;
        this.zzg = v1;
        this.zzh = v1;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = v1;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = C1396y1.teal;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = v1;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
    }

    public static /* synthetic */ void A(D0 d02, int i4) {
        d02.zze |= 1048576;
        d02.zzak = i4;
    }

    public static /* synthetic */ void B(D0 d02, String str) {
        str.getClass();
        d02.zze |= 4;
        d02.zzQ = str;
    }

    public static /* synthetic */ void C(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 4096;
        d02.zzt = str;
    }

    public static /* synthetic */ void D(D0 d02, String str) {
        d02.zzd |= 262144;
        d02.zzz = str;
    }

    public static /* synthetic */ void a(D0 d02, String str) {
        d02.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        d02.zzG = str;
    }

    public static /* synthetic */ void b(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 4194304;
        d02.zzD = str;
    }

    public static /* synthetic */ void c(D0 d02, long j5) {
        d02.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        d02.zzv = j5;
    }

    public static C0 c1() {
        return (C0) zzb.echo();
    }

    public static /* synthetic */ void d(D0 d02, String str) {
        d02.zzd |= 2097152;
        d02.zzC = str;
    }

    public static /* synthetic */ void e(D0 d02, boolean z2) {
        d02.zze |= 262144;
        d02.zzai = z2;
    }

    public static /* synthetic */ void f(D0 d02, ArrayList arrayList) {
        d02.F0();
        AbstractC1340k1.bravo(arrayList, d02.zzg);
    }

    public static /* synthetic */ void f0(D0 d02, boolean z2) {
        d02.zzd |= 131072;
        d02.zzy = z2;
    }

    public static void g(D0 d02, ArrayList arrayList) {
        RandomAccess randomAccess = d02.zzS;
        if (!((AbstractC1345l1) randomAccess).alpha) {
            C1396y1 c1396y1 = (C1396y1) randomAccess;
            int i4 = c1396y1.red;
            d02.zzS = c1396y1.foxtrot(i4 + i4);
        }
        AbstractC1340k1.bravo(arrayList, d02.zzS);
    }

    public static /* synthetic */ void g0(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 128;
        d02.zzo = str;
    }

    public static void gold(D0 d02, ArrayList arrayList) {
        D1 d12 = d02.zzF;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            d02.zzF = d12.foxtrot(size + size);
        }
        AbstractC1340k1.bravo(arrayList, d02.zzF);
    }

    public static /* synthetic */ void green(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 2048;
        d02.zzs = str;
    }

    public static void h(D0 d02, Set set) {
        D1 d12 = d02.zzad;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            d02.zzad = d12.foxtrot(size + size);
        }
        AbstractC1340k1.bravo(set, d02.zzad);
    }

    public static /* synthetic */ void h0(D0 d02) {
        d02.zzd |= 64;
        d02.zzn = "android";
    }

    public static /* synthetic */ void i(D0 d02, C1383v0 c1383v0) {
        d02.F0();
        d02.zzg.add(c1383v0);
    }

    public static /* synthetic */ void i0(D0 d02, long j5) {
        d02.zzd |= 32;
        d02.zzm = j5;
    }

    public static /* synthetic */ void indigo(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 8192;
        d02.zzu = str;
    }

    public static /* synthetic */ void ivory(D0 d02, int i4) {
        d02.zzd |= 33554432;
        d02.zzH = i4;
    }

    public static /* synthetic */ void j(D0 d02, M0 m02) {
        d02.G0();
        d02.zzh.add(m02);
    }

    public static /* synthetic */ void j0(D0 d02, long j5) {
        d02.zzd |= 16;
        d02.zzl = j5;
    }

    public static /* synthetic */ void jade(D0 d02, C1360p0 c1360p0) {
        d02.zzam = c1360p0;
        d02.zze |= 4194304;
    }

    public static /* synthetic */ void k(D0 d02) {
        d02.zzd &= -262145;
        d02.zzz = zzb.zzz;
    }

    public static /* synthetic */ void k0(D0 d02) {
        d02.zzd |= 1;
        d02.zzf = 1;
    }

    public static void l(D0 d02) {
        d02.zzF = V1.teal;
    }

    public static /* synthetic */ void l0(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 65536;
        d02.zzx = str;
    }

    public static /* synthetic */ void lavender(D0 d02, long j5) {
        d02.zze |= 134217728;
        d02.zzar = j5;
    }

    public static /* synthetic */ void lime(D0 d02, int i4) {
        d02.zzd |= 1048576;
        d02.zzB = i4;
    }

    public static /* synthetic */ void m(D0 d02) {
        d02.zzd &= -257;
        d02.zzp = zzb.zzp;
    }

    public static /* synthetic */ void m0(D0 d02, int i4) {
        d02.zze |= 2;
        d02.zzP = i4;
    }

    public static /* synthetic */ void magenta(D0 d02, long j5) {
        d02.zze |= 32;
        d02.zzU = j5;
    }

    public static /* synthetic */ void maroon(D0 d02, long j5) {
        d02.zzd |= 536870912;
        d02.zzL = j5;
    }

    public static /* synthetic */ void n(D0 d02) {
        d02.zzd &= LottieConstants.IterateForever;
        d02.zzN = zzb.zzN;
    }

    public static /* synthetic */ void n0(D0 d02) {
        d02.zzd |= 8388608;
        d02.zzE = false;
    }

    public static /* synthetic */ void navy(D0 d02, String str) {
        d02.zze |= 131072;
        d02.zzah = str;
    }

    public static C0 november(D0 d02) {
        AbstractC1388w1 echo = zzb.echo();
        echo.charlie(d02);
        return (C0) echo;
    }

    public static void o(D0 d02) {
        d02.zzg = V1.teal;
    }

    public static /* synthetic */ void o0(D0 d02, String str) {
        str.getClass();
        d02.zze |= 8192;
        d02.zzac = str;
    }

    public static /* synthetic */ void ochre(D0 d02, String str) {
        d02.zze |= 128;
        d02.zzW = str;
    }

    public static /* synthetic */ void olive(D0 d02, String str) {
        str.getClass();
        d02.zze |= 524288;
        d02.zzaj = str;
    }

    public static /* synthetic */ void orange(D0 d02, int i4) {
        d02.zze |= 8388608;
        d02.zzan = i4;
    }

    public static /* synthetic */ void p(D0 d02) {
        d02.zzd &= -2097153;
        d02.zzC = zzb.zzC;
    }

    public static /* synthetic */ void p0(D0 d02, K0 k02) {
        d02.zzaq = k02;
        d02.zze |= 67108864;
    }

    public static /* synthetic */ void peach(D0 d02, long j5) {
        d02.zzd |= 524288;
        d02.zzA = j5;
    }

    public static /* synthetic */ void pink(D0 d02) {
        String str = Build.MODEL;
        str.getClass();
        d02.zzd |= Barcode.FORMAT_QR_CODE;
        d02.zzp = str;
    }

    public static /* synthetic */ void plum(D0 d02, String str) {
        str.getClass();
        d02.zzd |= RecyclerView.UNDEFINED_DURATION;
        d02.zzN = str;
    }

    public static /* synthetic */ void purple(D0 d02, long j5) {
        d02.zze |= 16;
        d02.zzT = j5;
    }

    public static /* synthetic */ void q(D0 d02) {
        d02.zzd &= -131073;
        d02.zzy = false;
    }

    public static /* synthetic */ void q0(D0 d02, long j5) {
        d02.zzd |= 4;
        d02.zzj = j5;
    }

    public static /* synthetic */ void r(D0 d02) {
        d02.zzd &= -33;
        d02.zzm = 0L;
    }

    public static /* synthetic */ void r0(D0 d02, long j5) {
        d02.zze |= 32768;
        d02.zzaf = j5;
    }

    public static /* synthetic */ void red(D0 d02, boolean z2) {
        d02.zze |= 65536;
        d02.zzag = z2;
    }

    public static /* synthetic */ void s(D0 d02) {
        d02.zzd &= -17;
        d02.zzl = 0L;
    }

    public static /* synthetic */ void s0(D0 d02, int i4) {
        d02.zzd |= Barcode.FORMAT_UPC_E;
        d02.zzr = i4;
    }

    public static /* synthetic */ void silver(D0 d02, long j5) {
        d02.zzd |= 8;
        d02.zzk = j5;
    }

    public static /* synthetic */ void t(D0 d02) {
        d02.zzd &= -65537;
        d02.zzx = zzb.zzx;
    }

    public static /* synthetic */ void t0(D0 d02, long j5) {
        d02.zzd |= 2;
        d02.zzi = j5;
    }

    public static /* synthetic */ void teal(D0 d02, String str) {
        str.getClass();
        d02.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        d02.zzae = str;
    }

    public static /* synthetic */ void u(D0 d02) {
        d02.zze &= -8193;
        d02.zzac = zzb.zzac;
    }

    public static /* synthetic */ void u0(D0 d02) {
        d02.zzd |= 32768;
        d02.zzw = 119002L;
    }

    public static /* synthetic */ void v(D0 d02) {
        d02.zzd &= -268435457;
        d02.zzK = zzb.zzK;
    }

    public static /* synthetic */ void v0(D0 d02, int i4, M0 m02) {
        d02.G0();
        d02.zzh.set(i4, m02);
    }

    public static /* synthetic */ void w(D0 d02) {
        d02.zzd &= -3;
        d02.zzi = 0L;
    }

    public static /* synthetic */ void w0(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 512;
        d02.zzq = str;
    }

    public static /* synthetic */ void white(D0 d02, int i4, C1383v0 c1383v0) {
        d02.F0();
        d02.zzg.set(i4, c1383v0);
    }

    public static /* synthetic */ void x(D0 d02, int i4) {
        d02.F0();
        d02.zzg.remove(i4);
    }

    public static /* synthetic */ void y(D0 d02, int i4) {
        d02.G0();
        d02.zzh.remove(i4);
    }

    public static /* synthetic */ void yellow(D0 d02) {
        d02.zze |= 268435456;
        d02.zzas = "";
    }

    public static /* synthetic */ void z(D0 d02, C1348m0 c1348m0) {
        d02.zzao = c1348m0;
        d02.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    public final boolean A0() {
        return this.zzE;
    }

    public final boolean B0() {
        return (this.zze & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
    }

    public final boolean C0() {
        return (this.zzd & 33554432) != 0;
    }

    public final boolean D0() {
        return (this.zze & 4194304) != 0;
    }

    public final int E() {
        return this.zzH;
    }

    public final int E0() {
        return this.zzB;
    }

    public final boolean F() {
        return (this.zze & 134217728) != 0;
    }

    public final void F0() {
        D1 d12 = this.zzg;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            this.zzg = d12.foxtrot(size + size);
        }
    }

    public final boolean G() {
        return (this.zzd & 1048576) != 0;
    }

    public final void G0() {
        D1 d12 = this.zzh;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            this.zzh = d12.foxtrot(size + size);
        }
    }

    public final boolean H() {
        return (this.zzd & 536870912) != 0;
    }

    public final int H0() {
        return this.zzan;
    }

    public final boolean I() {
        return (this.zze & 131072) != 0;
    }

    public final int I0() {
        return this.zzg.size();
    }

    public final boolean J() {
        return (this.zze & 128) != 0;
    }

    public final int J0() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zze & 524288) != 0;
    }

    public final int K0() {
        return this.zzP;
    }

    public final boolean L() {
        return (this.zze & 8388608) != 0;
    }

    public final int L0() {
        return this.zzr;
    }

    public final boolean M() {
        return (this.zzd & 524288) != 0;
    }

    public final int M0() {
        return this.zzh.size();
    }

    public final boolean N() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final long N0() {
        return this.zzar;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final long O0() {
        return this.zzL;
    }

    public final boolean P() {
        return (this.zzd & 8) != 0;
    }

    public final long P0() {
        return this.zzA;
    }

    public final boolean Q() {
        return (this.zzd & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    public final long Q0() {
        return this.zzT;
    }

    public final boolean R() {
        return (this.zze & 262144) != 0;
    }

    public final long R0() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zzd & 131072) != 0;
    }

    public final long S0() {
        return this.zzv;
    }

    public final boolean T() {
        return (this.zzd & 32) != 0;
    }

    public final long T0() {
        return this.zzm;
    }

    public final boolean U() {
        return (this.zzd & 16) != 0;
    }

    public final long U0() {
        return this.zzl;
    }

    public final boolean V() {
        return (this.zzd & 1) != 0;
    }

    public final long V0() {
        return this.zzj;
    }

    public final boolean W() {
        return (this.zze & 2) != 0;
    }

    public final long W0() {
        return this.zzaf;
    }

    public final boolean X() {
        return (this.zzd & 8388608) != 0;
    }

    public final long X0() {
        return this.zzi;
    }

    public final boolean Y() {
        return (this.zze & 8192) != 0;
    }

    public final long Y0() {
        return this.zzw;
    }

    public final boolean Z() {
        return (this.zze & 67108864) != 0;
    }

    public final C1348m0 Z0() {
        C1348m0 c1348m0 = this.zzao;
        if (c1348m0 == null) {
            return C1348m0.yankee();
        }
        return c1348m0;
    }

    public final boolean a0() {
        return (this.zzd & 4) != 0;
    }

    public final C1360p0 a1() {
        C1360p0 c1360p0 = this.zzam;
        if (c1360p0 == null) {
            return C1360p0.oscar();
        }
        return c1360p0;
    }

    public final String amber() {
        return this.zzG;
    }

    public final String azure() {
        return this.zzD;
    }

    public final boolean b0() {
        return (this.zze & 32768) != 0;
    }

    public final C1383v0 b1(int i4) {
        return (C1383v0) this.zzg.get(i4);
    }

    public final String beige() {
        return this.zzC;
    }

    public final String black() {
        return this.zzo;
    }

    public final String blue() {
        return this.zzn;
    }

    public final String bronze() {
        return this.zzx;
    }

    public final boolean c0() {
        return (this.zzd & Barcode.FORMAT_UPC_E) != 0;
    }

    public final String coral() {
        return this.zzac;
    }

    public final String crimson() {
        return this.zzq;
    }

    public final D1 cyan() {
        return this.zzF;
    }

    public final boolean d0() {
        return (this.zzd & 2) != 0;
    }

    public final boolean e0() {
        return (this.zzd & 32768) != 0;
    }

    public final D1 emerald() {
        return this.zzg;
    }

    public final D1 fuchsia() {
        return this.zzh;
    }

    public final int gray() {
        return this.zzak;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1392x1
    public final Object mike(int i4) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new AbstractC1388w1(zzb);
                }
                return new D0();
            }
            return new W1(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", C1383v0.class, "zzh", M0.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", C1367r0.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", S.foxtrot, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        return (byte) 1;
    }

    public final K0 oscar() {
        K0 k02 = this.zzaq;
        if (k02 == null) {
            return K0.papa();
        }
        return k02;
    }

    public final M0 papa(int i4) {
        return (M0) this.zzh.get(i4);
    }

    public final String quebec() {
        return this.zzQ;
    }

    public final String romeo() {
        return this.zzt;
    }

    public final String sierra() {
        return this.zzz;
    }

    public final String tango() {
        return this.zzs;
    }

    public final String uniform() {
        return this.zzu;
    }

    public final String victor() {
        return this.zzah;
    }

    public final String whiskey() {
        return this.zzW;
    }

    public final boolean x0() {
        return this.zzag;
    }

    public final String xray() {
        return this.zzaj;
    }

    public final boolean y0() {
        return this.zzai;
    }

    public final String yankee() {
        return this.zzp;
    }

    public final boolean z0() {
        return this.zzy;
    }

    public final String zulu() {
        return this.zzN;
    }
}
