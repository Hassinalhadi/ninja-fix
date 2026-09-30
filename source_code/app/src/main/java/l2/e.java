package l2;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2593a;

/* loaded from: classes3.dex */
public final class e {
    public final Context alpha;
    public final String bravo;
    public final InterfaceC2593a charlie;
    public final A2.h delta;
    public final ArrayList echo;
    public final boolean foxtrot;
    public final int golf;
    public final Executor hotel;
    public final Executor india;
    public final boolean juliet;
    public final boolean kilo;
    public final LinkedHashSet lima;
    public final ArrayList mike;
    public final ArrayList november;

    public e(Context context, String str, InterfaceC2593a interfaceC2593a, A2.h migrationContainer, ArrayList arrayList, boolean z2, int i4, Executor queryExecutor, Executor transactionExecutor, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.echo(migrationContainer, "migrationContainer");
        com.google.android.material.datepicker.j.papa(i4, "journalMode");
        Intrinsics.echo(queryExecutor, "queryExecutor");
        Intrinsics.echo(transactionExecutor, "transactionExecutor");
        Intrinsics.echo(typeConverters, "typeConverters");
        Intrinsics.echo(autoMigrationSpecs, "autoMigrationSpecs");
        this.alpha = context;
        this.bravo = str;
        this.charlie = interfaceC2593a;
        this.delta = migrationContainer;
        this.echo = arrayList;
        this.foxtrot = z2;
        this.golf = i4;
        this.hotel = queryExecutor;
        this.india = transactionExecutor;
        this.juliet = z10;
        this.kilo = z11;
        this.lima = linkedHashSet;
        this.mike = typeConverters;
        this.november = autoMigrationSpecs;
    }
}
