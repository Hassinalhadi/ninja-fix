package D8;

import Aa.j;
import Aa.p;
import C1.B;
import C1.C;
import C1.C0080b;
import C1.aq;
import C1.at;
import G6.h;
import J3.ab;
import J3.ae;
import J3.af;
import J3.r;
import J3.s;
import J3.x;
import K1.k;
import L0.l;
import O7.aa;
import T5.m;
import V5.ai;
import Y2.i;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Region;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.PlatformListResponse;
import com.bumptech.glide.load.data.e;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.ui.envelopV2.EnvelopDetailActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n2.C2153a;
import n2.C2154b;
import n2.C2156d;
import n2.C2157e;
import s6.AbstractC2833z7;
import t1.n;
import w6.AbstractC3237a;
import w6.d;
import w6.f;
import w6.g;
import x9.InterfaceC3312f;
import ya.C3407c;
import yf.AbstractC3428A;
import yf.N;

/* loaded from: classes2.dex */
public final class c implements InterfaceC3312f, m, n, s, J3.a, E3.c, ae, M7.a, i {
    public static volatile c red;
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static void bravo(androidx.sqlite.db.framework.b bVar) {
        bVar.juliet("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.juliet("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.juliet("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.juliet("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.juliet("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static ai mike(androidx.sqlite.db.framework.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C2153a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new C2153a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.KEY_ID)));
        hashSet.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(Constants.KEY_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C2156d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C2156d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C2157e c2157e = new C2157e("Dependency", hashMap, hashSet, hashSet2);
        C2157e alpha = C2157e.alpha(bVar, "Dependency");
        if (!c2157e.equals(alpha)) {
            return new ai(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c2157e + "\n Found:\n" + alpha);
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put(Constants.KEY_ID, new C2153a(Constants.KEY_ID, "TEXT", true, 1, null, 1));
        hashMap2.put("state", new C2153a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new C2153a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new C2153a("input_merger_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input", new C2153a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new C2153a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new C2153a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new C2153a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new C2153a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new C2153a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new C2153a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new C2153a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new C2153a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new C2153a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new C2153a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new C2153a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new C2153a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new C2153a("period_count", "INTEGER", true, 0, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO, 1));
        hashMap2.put("generation", new C2153a("generation", "INTEGER", true, 0, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO, 1));
        hashMap2.put("next_schedule_time_override", new C2153a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new C2153a("next_schedule_time_override_generation", "INTEGER", true, 0, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO, 1));
        hashMap2.put("stop_reason", new C2153a("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("trace_tag", new C2153a("trace_tag", "TEXT", false, 0, null, 1));
        hashMap2.put("required_network_type", new C2153a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_request", new C2153a("required_network_request", "BLOB", true, 0, "x''", 1));
        hashMap2.put("requires_charging", new C2153a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new C2153a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new C2153a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new C2153a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new C2153a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new C2153a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new C2153a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C2156d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C2156d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C2157e c2157e2 = new C2157e("WorkSpec", hashMap2, hashSet3, hashSet4);
        C2157e alpha2 = C2157e.alpha(bVar, "WorkSpec");
        if (!c2157e2.equals(alpha2)) {
            return new ai(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c2157e2 + "\n Found:\n" + alpha2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C2153a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new C2153a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.KEY_ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C2156d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2157e c2157e3 = new C2157e("WorkTag", hashMap3, hashSet5, hashSet6);
        C2157e alpha3 = C2157e.alpha(bVar, "WorkTag");
        if (!c2157e3.equals(alpha3)) {
            return new ai(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c2157e3 + "\n Found:\n" + alpha3);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C2153a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new C2153a("generation", "INTEGER", true, 2, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO, 1));
        hashMap4.put("system_id", new C2153a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.KEY_ID)));
        C2157e c2157e4 = new C2157e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C2157e alpha4 = C2157e.alpha(bVar, "SystemIdInfo");
        if (!c2157e4.equals(alpha4)) {
            return new ai(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c2157e4 + "\n Found:\n" + alpha4);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C2153a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new C2153a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.KEY_ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C2156d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C2157e c2157e5 = new C2157e("WorkName", hashMap5, hashSet8, hashSet9);
        C2157e alpha5 = C2157e.alpha(bVar, "WorkName");
        if (!c2157e5.equals(alpha5)) {
            return new ai(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c2157e5 + "\n Found:\n" + alpha5);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C2153a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new C2153a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C2154b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Constants.KEY_ID)));
        C2157e c2157e6 = new C2157e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C2157e alpha6 = C2157e.alpha(bVar, "WorkProgress");
        if (!c2157e6.equals(alpha6)) {
            return new ai(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c2157e6 + "\n Found:\n" + alpha6);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put(Constants.KEY_KEY, new C2153a(Constants.KEY_KEY, "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new C2153a("long_value", "INTEGER", false, 0, null, 1));
        C2157e c2157e7 = new C2157e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C2157e alpha7 = C2157e.alpha(bVar, "Preference");
        if (!c2157e7.equals(alpha7)) {
            return new ai(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c2157e7 + "\n Found:\n" + alpha7);
        }
        return new ai(true, (String) null);
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        g gVar = (g) obj;
        IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) this.purple;
        gVar.getClass();
        f fVar = new f(0, (h) obj2);
        try {
            d dVar = (d) gVar.tango();
            Bundle beige = gVar.beige();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar.india);
            AbstractC3237a.charlie(obtain, isReadyToPayRequest);
            AbstractC3237a.charlie(obtain, beige);
            obtain.writeStrongBinder(fVar);
            try {
                dVar.hotel.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Status status = Status.white;
            Bundle bundle = Bundle.EMPTY;
            AbstractC2833z7.charlie(status, Boolean.FALSE, fVar.hotel);
        }
    }

    @Override // J3.ae
    public e alpha(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.purple, uri, 1);
    }

    @Override // E3.c
    public boolean azure(Object obj, File file, E3.i iVar) {
        InputStream inputStream = (InputStream) obj;
        G3.g gVar = (G3.g) this.purple;
        byte[] bArr = (byte[]) gVar.echo(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        gVar.juliet(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        gVar.juliet(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                gVar.juliet(bArr);
                return true;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        boolean z2;
        AtomicInteger atomicInteger;
        int i5;
        switch (this.alpha) {
            case 2:
                City item = (City) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                j jVar = (j) this.purple;
                C3407c c3407c = jVar.f40v;
                if (c3407c != null) {
                    c3407c.invoke(item);
                }
                jVar.juliet();
                return;
            case 3:
                PlatformListResponse item2 = (PlatformListResponse) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                p pVar = (p) this.purple;
                C3407c c3407c2 = pVar.f52v;
                if (c3407c2 != null) {
                    c3407c2.invoke(item2);
                }
                pVar.juliet();
                return;
            case 10:
                Bank item3 = (Bank) obj;
                Intrinsics.echo(item3, "item");
                Intrinsics.echo(view, "view");
                Ea.g gVar = (Ea.g) this.purple;
                Ea.b bVar = gVar.f979u;
                if (bVar != null) {
                    bVar.invoke(item3);
                }
                gVar.juliet();
                return;
            default:
                EnvelopNotification item4 = (EnvelopNotification) obj;
                Intrinsics.echo(item4, "item");
                Intrinsics.echo(view, "view");
                boolean areEqual = Intrinsics.areEqual(item4.getUnread(), Boolean.TRUE);
                EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) this.purple;
                if (areEqual) {
                    item4.setUnread(Boolean.FALSE);
                    envelopsListingActivityV2.f12268P.notifyItemChanged(i4);
                    ArrayList arrayList = envelopsListingActivityV2.f12261I;
                    boolean z10 = false;
                    if (arrayList != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual(((EnvelopNotification) it.next()).getUnread(), Boolean.TRUE)) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                    ((t0) envelopsListingActivityV2.f12262J).setValue(Boolean.valueOf(z10));
                    AtomicInteger atomicInteger2 = d3.s.alpha;
                    do {
                        atomicInteger = d3.s.alpha;
                        i5 = atomicInteger.get();
                        if (i5 <= 0) {
                        }
                        W1.b.alpha(envelopsListingActivityV2).charlie(new Intent("delivery.samurai.envelope_read"));
                    } while (!atomicInteger.compareAndSet(i5, i5 - 1));
                    W1.b.alpha(envelopsListingActivityV2).charlie(new Intent("delivery.samurai.envelope_read"));
                }
                int i10 = EnvelopDetailActivityV2.f12255N;
                String valueOf = String.valueOf(item4.getId());
                Intent intent = new Intent(envelopsListingActivityV2, (Class<?>) EnvelopDetailActivityV2.class);
                intent.putExtra("ENVELOP_NOTIFICATION_ID", valueOf);
                intent.putExtra("ENVELOP_NOTIFICATION", item4);
                envelopsListingActivityV2.startActivity(intent);
                return;
        }
    }

    @Override // t1.n
    public boolean charlie(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.purple;
        if (DrawerLayout.kilo(view) && drawerLayout.golf(view) != 2) {
            drawerLayout.bravo(view, true);
            return true;
        }
        return false;
    }

    @Override // Y2.i
    public Object delta(M2.h hVar) {
        return AbstractC3428A.november(new N2.m(((N2.n) this.purple).red, 0), hVar);
    }

    public B echo() {
        return (B) ((N) this.purple).getValue();
    }

    public D0 foxtrot() {
        k alpha = k.alpha();
        if (alpha.charlie() == 1) {
            return new l(true);
        }
        ax zulu = C0564b.zulu(Boolean.FALSE);
        alpha.hotel(new L0.h(zulu, this));
        return zulu;
    }

    public Set golf() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.purple)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) this.purple);
        }
        return unmodifiableSet;
    }

    @Override // J3.a
    public e hotel(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 0);
    }

    public H3.b india() {
        H3.b bVar;
        synchronized (((ArrayDeque) this.purple)) {
            bVar = (H3.b) ((ArrayDeque) this.purple).poll();
        }
        if (bVar == null) {
            return new H3.b();
        }
        return bVar;
    }

    @Override // M7.a
    public void juliet(Bundle bundle) {
        ((F7.c) ((F7.b) this.purple)).alpha("clx", "_ae", bundle);
    }

    public void kilo(H3.b bVar) {
        synchronized (((ArrayDeque) this.purple)) {
            if (((ArrayDeque) this.purple).size() < 10) {
                ((ArrayDeque) this.purple).offer(bVar);
            }
        }
    }

    public void lima(D5.s sVar, Thread thread, Throwable th) {
        O7.n nVar = (O7.n) this.purple;
        synchronized (nVar) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    try {
                        aa.alpha(nVar.echo.alpha.bravo(new O7.k(nVar, System.currentTimeMillis(), th, thread, sVar)));
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.alpha > r2.alpha) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void november(B newState) {
        N n5;
        Object value;
        B b2;
        boolean areEqual;
        Intrinsics.echo(newState, "newState");
        do {
            n5 = (N) this.purple;
            value = n5.getValue();
            b2 = (B) value;
            if (b2 instanceof at) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(b2, C.bravo);
            }
            if (!areEqual) {
                if (b2 instanceof C0080b) {
                } else if (!(b2 instanceof aq)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            b2 = newState;
        } while (!n5.hotel(value, b2));
    }

    @Override // J3.s
    public r sierra(x xVar) {
        switch (this.alpha) {
            case 18:
                return new J3.b(0, (AssetManager) this.purple, this);
            case 19:
                return new J3.c(1, (ab) this.purple);
            default:
                return new af(this);
        }
    }

    public c(Context context) {
        this.alpha = 14;
        this.purple = new E5.j(context, 1);
    }

    public c(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.purple = new Region();
                return;
            case 8:
                this.purple = AbstractC3428A.charlie(C.bravo);
                return;
            case 13:
                this.purple = new ArrayDeque();
                return;
            case 19:
                this.purple = new ab(7);
                return;
            case 20:
                this.purple = new HashMap();
                return;
            default:
                this.purple = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 produceNewData) {
        this.alpha = 9;
        Intrinsics.echo(produceNewData, "produceNewData");
        this.purple = (Lambda) produceNewData;
    }

    public c(ConstraintLayout constraintLayout, MaterialButton materialButton) {
        this.alpha = 6;
        this.purple = materialButton;
    }

    public c(TextView textView) {
        this.alpha = 26;
        this.purple = new L1.g(textView);
    }
}
