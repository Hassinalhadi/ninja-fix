package na;

import android.app.Application;
import android.graphics.BitmapFactory;
import android.location.Location;
import androidx.lifecycle.az;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import gc.C1766d;
import io.reactivex.Single;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import r3.C2492a;
import s6.W4;
import t3.InterfaceC2958c;
import vf.ab;

/* loaded from: classes2.dex */
public final class t extends Pd.i implements Xd.l {
    public final /* synthetic */ OrdersViewModel alpha;
    public final /* synthetic */ File purple;
    public final /* synthetic */ File red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13113s;
    public final /* synthetic */ az silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f13114t;
    public final /* synthetic */ int teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f13115u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f13116v;
    public final /* synthetic */ TaskStatus white;
    public final /* synthetic */ Location yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(OrdersViewModel ordersViewModel, File file, File file2, az azVar, int i4, TaskStatus taskStatus, Location location, String str, String str2, String str3, String str4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ordersViewModel;
        this.purple = file;
        this.red = file2;
        this.silver = azVar;
        this.teal = i4;
        this.white = taskStatus;
        this.yellow = location;
        this.f13113s = str;
        this.f13114t = str2;
        this.f13115u = str3;
        this.f13116v = str4;
    }

    public static final void foxtrot(File file) {
        if (file != null && file.exists()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            } catch (Exception unused) {
            }
        }
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new t(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f13113s, this.f13114t, this.f13115u, this.f13116v, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if ((r8 instanceof H9.k) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if ((r8 instanceof H9.k) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b8 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e5 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0372 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038b A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf A[Catch: all -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da A[Catch: all -> 0x01aa, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:52:0x0192, B:54:0x01a0, B:56:0x01a6, B:57:0x01ad, B:59:0x01b3, B:61:0x01b8, B:63:0x01be, B:64:0x01c2, B:66:0x01c8, B:69:0x01cf, B:72:0x01da, B:75:0x01e5, B:77:0x01f3, B:79:0x0208, B:81:0x0216, B:82:0x022a, B:84:0x023c, B:86:0x0241, B:87:0x0244, B:89:0x024b, B:91:0x0251, B:93:0x025f, B:95:0x0265, B:96:0x0271, B:99:0x027b, B:101:0x028a, B:103:0x029a, B:105:0x02a9, B:107:0x02b8, B:111:0x02c3, B:113:0x02d2, B:115:0x02e5, B:119:0x02fa, B:121:0x02fe, B:123:0x031d, B:130:0x033d, B:132:0x0355, B:134:0x0363, B:135:0x03a1, B:141:0x0368, B:143:0x0372, B:144:0x037d, B:146:0x038b, B:148:0x039d), top: B:51:0x0192 }] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        long j6;
        long j7;
        long j10;
        long j11;
        H9.m lVar;
        boolean z2;
        Long l10;
        Long l11;
        int i4;
        MultipartBody.Part part;
        MultipartBody.Part part2;
        ArrayList arrayList;
        Location location;
        RequestBody requestBody;
        RequestBody requestBody2;
        long j12;
        RequestBody requestBody3;
        RequestBody requestBody4;
        String str;
        String str2;
        String str3;
        RequestBody requestBody5;
        RequestBody requestBody6;
        RequestBody requestBody7;
        Single<OrderTask> delta;
        RequestBody requestBody8;
        String str4;
        RequestBody requestBody9;
        Location location2;
        String f5;
        String d4;
        String d9;
        Long bravo;
        Long bravo2;
        RequestBody create;
        RequestBody create2;
        File file;
        File file2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        OrdersViewModel ordersViewModel = this.alpha;
        I9.b.foxtrot(ordersViewModel.getApplication(), "delivery_proof", "validation");
        I9.b.alpha(ordersViewModel.getApplication(), "delivery_proof", "validation");
        File file3 = this.purple;
        if (file3 != null) {
            j5 = file3.length();
        } else {
            j5 = 0;
        }
        File file4 = this.red;
        if (file4 != null) {
            j6 = file4.length();
        } else {
            j6 = 0;
        }
        long j13 = j5 + j6;
        F9.j jVar = (F9.j) ordersViewModel.echo.alpha;
        if (file3 != null) {
            if (file3.exists()) {
                file2 = file3;
            } else {
                file2 = null;
            }
            if (file2 != null) {
                j7 = file2.length();
                if (file4 != null) {
                    if (file4.exists()) {
                        file = file4;
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        j10 = file.length();
                        long j14 = j5;
                        j11 = j7 + j10;
                        if (j11 >= 10485760) {
                            lVar = new H9.k(new H9.i(j11));
                        } else {
                            lVar = new H9.l(Unit.INSTANCE);
                        }
                        if (!(lVar instanceof H9.k)) {
                            if (file3 != null) {
                                lVar = jVar.bravo(file3);
                            }
                            if (file4 != null) {
                                lVar = jVar.bravo(file4);
                            }
                            lVar = new H9.l(Unit.INSTANCE);
                        }
                        z2 = lVar instanceof H9.k;
                        az azVar = this.silver;
                        if (z2) {
                            new Long(j13);
                            new Long(10485760L);
                            H9.j jVar2 = ((H9.k) lVar).alpha;
                            jVar2.toString();
                            azVar.postValue(new C2492a(0, W4.alpha(ordersViewModel.getApplication(), jVar2)));
                            return Unit.INSTANCE;
                        }
                        new Long(j13);
                        new Long(10485760L);
                        I9.c.foxtrot.set(Boolean.TRUE);
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.delta(uuid, "toString(...)");
                        foxtrot(file3);
                        foxtrot(file4);
                        TaskStatus taskStatus = this.white;
                        String status = taskStatus.name();
                        Intrinsics.echo(status, "status");
                        I9.c.alpha.set(uuid);
                        I9.b.foxtrot(ordersViewModel.getApplication(), "delivery_proof", "upload");
                        I9.b.alpha(ordersViewModel.getApplication(), "delivery_proof", "upload");
                        if (file3 != null) {
                            Application context = ordersViewModel.getApplication();
                            Intrinsics.echo(context, "context");
                        }
                        I9.c.delta(System.currentTimeMillis());
                        ThreadLocal threadLocal = I9.c.echo;
                        Map map = (Map) threadLocal.get();
                        if (map != null) {
                            l10 = (Long) map.get("request_creation");
                        } else {
                            l10 = null;
                        }
                        Map map2 = (Map) threadLocal.get();
                        if (map2 != null) {
                            l11 = (Long) map2.get("network_send");
                        } else {
                            l11 = null;
                        }
                        try {
                            if (l10 != null) {
                                long longValue = l10.longValue();
                                if (l11 != null) {
                                    long longValue2 = l11.longValue() - longValue;
                                    O7.r rVar = K7.b.alpha().alpha;
                                    i4 = 1;
                                    rVar.oscar.alpha.alpha(new A2.s(rVar, "timing_request_to_network_ms", Long.toString(longValue2), 11));
                                    rVar.oscar.alpha.alpha(new A2.s(rVar, "timing_request_to_network_seconds", Long.toString(longValue2 / 1000), 11));
                                    new Long(j14);
                                    new Long(j6);
                                    if (file3 != null) {
                                        if (!file3.exists()) {
                                            file3.getAbsolutePath();
                                        } else if (!file3.canRead()) {
                                            file3.getAbsolutePath();
                                        }
                                    }
                                    if (file4 != null) {
                                        if (!file4.exists()) {
                                            file4.getAbsolutePath();
                                        } else if (!file4.canRead()) {
                                            file4.getAbsolutePath();
                                        }
                                    }
                                    if (file3 != null) {
                                        I9.c.charlie(file3.length(), "invoice");
                                    }
                                    if (file4 != null) {
                                        I9.c.charlie(file4.length(), "confirmation");
                                    }
                                    if (file3 == null && (create2 = RequestBody.INSTANCE.create(file3, MediaType.INSTANCE.parse("image/*"))) != null) {
                                        create2.contentLength();
                                        file3.getName();
                                        part = MultipartBody.Part.INSTANCE.createFormData("invoice", file3.getName(), create2);
                                    } else {
                                        part = null;
                                    }
                                    if (file4 == null && (create = RequestBody.INSTANCE.create(file4, MediaType.INSTANCE.parse("image/*"))) != null) {
                                        create.contentLength();
                                        file4.getName();
                                        part2 = MultipartBody.Part.INSTANCE.createFormData("taskConfirmationImage", file4.getName(), create);
                                    } else {
                                        part2 = null;
                                    }
                                    MultipartBody.Part[] partArr = new MultipartBody.Part[2];
                                    partArr[0] = part;
                                    partArr[i4] = part2;
                                    CollectionsKt.peach(partArr).size();
                                    if (file3 != null) {
                                        file3.length();
                                    }
                                    if (file4 != null) {
                                        file4.length();
                                    }
                                    arrayList = new ArrayList();
                                    if (file3 != null && (bravo2 = I9.c.bravo("invoice")) != null) {
                                        arrayList.add(new Long(bravo2.longValue()));
                                    }
                                    if (file4 != null && (bravo = I9.c.bravo("confirmation")) != null) {
                                        arrayList.add(new Long(bravo.longValue()));
                                    }
                                    location = this.yellow;
                                    if (location == null && (d9 = new Double(location.getLatitude()).toString()) != null) {
                                        requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, d9, (MediaType) null, i4, (Object) null);
                                    } else {
                                        requestBody = null;
                                    }
                                    if (location == null && (d4 = new Double(location.getLongitude()).toString()) != null) {
                                        requestBody2 = RequestBody.Companion.create$default(RequestBody.INSTANCE, d4, (MediaType) null, 1, (Object) null);
                                    } else {
                                        requestBody2 = null;
                                    }
                                    if (location != null) {
                                        if (location.hasAccuracy()) {
                                            location2 = location;
                                        } else {
                                            location2 = null;
                                        }
                                        if (location2 != null && (f5 = new Float(location2.getAccuracy()).toString()) != null) {
                                            j12 = 0;
                                            requestBody3 = RequestBody.Companion.create$default(RequestBody.INSTANCE, f5, (MediaType) null, 1, (Object) null);
                                            if (location != null) {
                                                Long l12 = new Long(location.getTime());
                                                if (l12.longValue() <= j12) {
                                                    l12 = null;
                                                }
                                                if (l12 != null) {
                                                    long longValue3 = l12.longValue();
                                                    try {
                                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                                                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                                                        str4 = simpleDateFormat.format(new Date(longValue3));
                                                    } catch (Exception unused) {
                                                        str4 = null;
                                                    }
                                                    if (str4 != null) {
                                                        requestBody9 = RequestBody.Companion.create$default(RequestBody.INSTANCE, str4, (MediaType) null, 1, (Object) null);
                                                    } else {
                                                        requestBody9 = null;
                                                    }
                                                    requestBody4 = requestBody9;
                                                    str = this.f13115u;
                                                    str2 = this.f13114t;
                                                    str3 = this.f13113s;
                                                    if (part == null || part2 != null || str3 != null || str2 != null) {
                                                        RequestBody requestBody10 = requestBody2;
                                                        InterfaceC2958c interfaceC2958c = ordersViewModel.bravo;
                                                        int i5 = this.teal;
                                                        String name = taskStatus.name();
                                                        if (str3 == null) {
                                                            requestBody5 = RequestBody.Companion.create$default(RequestBody.INSTANCE, str3, (MediaType) null, 1, (Object) null);
                                                        } else {
                                                            requestBody5 = null;
                                                        }
                                                        RequestBody.Companion companion = RequestBody.INSTANCE;
                                                        RequestBody create$default = RequestBody.Companion.create$default(companion, String.valueOf(str), (MediaType) null, 1, (Object) null);
                                                        if (str2 == null) {
                                                            requestBody6 = requestBody3;
                                                            requestBody7 = RequestBody.Companion.create$default(companion, str2, (MediaType) null, 1, (Object) null);
                                                        } else {
                                                            requestBody6 = requestBody3;
                                                            requestBody7 = null;
                                                        }
                                                        delta = interfaceC2958c.delta(i5, name, requestBody5, create$default, part, part2, requestBody7, requestBody, requestBody10, requestBody6, requestBody4);
                                                    } else {
                                                        InterfaceC2958c interfaceC2958c2 = ordersViewModel.bravo;
                                                        int i10 = this.teal;
                                                        String name2 = taskStatus.name();
                                                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                                                        RequestBody create$default2 = RequestBody.Companion.create$default(companion2, String.valueOf(str), (MediaType) null, 1, (Object) null);
                                                        String str5 = this.f13116v;
                                                        if (str5 != null) {
                                                            requestBody8 = RequestBody.Companion.create$default(companion2, str5, (MediaType) null, 1, (Object) null);
                                                        } else {
                                                            requestBody8 = null;
                                                        }
                                                        delta = interfaceC2958c2.charlie(i10, name2, create$default2, requestBody8, requestBody, requestBody2, requestBody3, requestBody4);
                                                    }
                                                    delta.subscribe(new C1766d(21, new g(ordersViewModel, azVar, 6)), new C1766d(22, new g(ordersViewModel, azVar, 7)));
                                                    I9.c.alpha();
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                            requestBody4 = null;
                                            str = this.f13115u;
                                            str2 = this.f13114t;
                                            str3 = this.f13113s;
                                            if (part == null) {
                                            }
                                            RequestBody requestBody102 = requestBody2;
                                            InterfaceC2958c interfaceC2958c3 = ordersViewModel.bravo;
                                            int i52 = this.teal;
                                            String name3 = taskStatus.name();
                                            if (str3 == null) {
                                            }
                                            RequestBody.Companion companion3 = RequestBody.INSTANCE;
                                            RequestBody create$default3 = RequestBody.Companion.create$default(companion3, String.valueOf(str), (MediaType) null, 1, (Object) null);
                                            if (str2 == null) {
                                            }
                                            delta = interfaceC2958c3.delta(i52, name3, requestBody5, create$default3, part, part2, requestBody7, requestBody, requestBody102, requestBody6, requestBody4);
                                            delta.subscribe(new C1766d(21, new g(ordersViewModel, azVar, 6)), new C1766d(22, new g(ordersViewModel, azVar, 7)));
                                            I9.c.alpha();
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    j12 = 0;
                                    requestBody3 = null;
                                    if (location != null) {
                                    }
                                    requestBody4 = null;
                                    str = this.f13115u;
                                    str2 = this.f13114t;
                                    str3 = this.f13113s;
                                    if (part == null) {
                                    }
                                    RequestBody requestBody1022 = requestBody2;
                                    InterfaceC2958c interfaceC2958c32 = ordersViewModel.bravo;
                                    int i522 = this.teal;
                                    String name32 = taskStatus.name();
                                    if (str3 == null) {
                                    }
                                    RequestBody.Companion companion32 = RequestBody.INSTANCE;
                                    RequestBody create$default32 = RequestBody.Companion.create$default(companion32, String.valueOf(str), (MediaType) null, 1, (Object) null);
                                    if (str2 == null) {
                                    }
                                    delta = interfaceC2958c32.delta(i522, name32, requestBody5, create$default32, part, part2, requestBody7, requestBody, requestBody1022, requestBody6, requestBody4);
                                    delta.subscribe(new C1766d(21, new g(ordersViewModel, azVar, 6)), new C1766d(22, new g(ordersViewModel, azVar, 7)));
                                    I9.c.alpha();
                                    return Unit.INSTANCE;
                                }
                            }
                            new Long(j14);
                            new Long(j6);
                            if (file3 != null) {
                            }
                            if (file4 != null) {
                            }
                            if (file3 != null) {
                            }
                            if (file4 != null) {
                            }
                            if (file3 == null) {
                            }
                            part = null;
                            if (file4 == null) {
                            }
                            part2 = null;
                            MultipartBody.Part[] partArr2 = new MultipartBody.Part[2];
                            partArr2[0] = part;
                            partArr2[i4] = part2;
                            CollectionsKt.peach(partArr2).size();
                            if (file3 != null) {
                            }
                            if (file4 != null) {
                            }
                            arrayList = new ArrayList();
                            if (file3 != null) {
                                arrayList.add(new Long(bravo2.longValue()));
                            }
                            if (file4 != null) {
                                arrayList.add(new Long(bravo.longValue()));
                            }
                            location = this.yellow;
                            if (location == null) {
                            }
                            requestBody = null;
                            if (location == null) {
                            }
                            requestBody2 = null;
                            if (location != null) {
                            }
                            j12 = 0;
                            requestBody3 = null;
                            if (location != null) {
                            }
                            requestBody4 = null;
                            str = this.f13115u;
                            str2 = this.f13114t;
                            str3 = this.f13113s;
                            if (part == null) {
                            }
                            RequestBody requestBody10222 = requestBody2;
                            InterfaceC2958c interfaceC2958c322 = ordersViewModel.bravo;
                            int i5222 = this.teal;
                            String name322 = taskStatus.name();
                            if (str3 == null) {
                            }
                            RequestBody.Companion companion322 = RequestBody.INSTANCE;
                            RequestBody create$default322 = RequestBody.Companion.create$default(companion322, String.valueOf(str), (MediaType) null, 1, (Object) null);
                            if (str2 == null) {
                            }
                            delta = interfaceC2958c322.delta(i5222, name322, requestBody5, create$default322, part, part2, requestBody7, requestBody, requestBody10222, requestBody6, requestBody4);
                            delta.subscribe(new C1766d(21, new g(ordersViewModel, azVar, 6)), new C1766d(22, new g(ordersViewModel, azVar, 7)));
                            I9.c.alpha();
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            I9.c.alpha();
                            throw th;
                        }
                        i4 = 1;
                    }
                }
                j10 = 0;
                long j142 = j5;
                j11 = j7 + j10;
                if (j11 >= 10485760) {
                }
                if (!(lVar instanceof H9.k)) {
                }
                z2 = lVar instanceof H9.k;
                az azVar2 = this.silver;
                if (z2) {
                }
            }
        }
        j7 = 0;
        if (file4 != null) {
        }
        j10 = 0;
        long j1422 = j5;
        j11 = j7 + j10;
        if (j11 >= 10485760) {
        }
        if (!(lVar instanceof H9.k)) {
        }
        z2 = lVar instanceof H9.k;
        az azVar22 = this.silver;
        if (z2) {
        }
    }
}
